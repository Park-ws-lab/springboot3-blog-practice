package me.parkwoosik.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.parkwoosik.springbootdeveloper.domain.User;
import me.parkwoosik.springbootdeveloper.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email){
        return userRepository.findByEmail(email)
                .orElseThrow(()-> new IllegalArgumentException((email)));
    }
}
