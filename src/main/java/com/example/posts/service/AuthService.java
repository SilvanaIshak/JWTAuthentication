package com.example.posts.service;

import com.example.posts.domain.dto.request.LoginRequest;
import com.example.posts.domain.dto.request.RefreshTokenRequest;
import com.example.posts.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
