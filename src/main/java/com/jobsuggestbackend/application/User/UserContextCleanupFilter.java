package com.jobsuggestbackend.application.User;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;

public class UserContextCleanupFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
                                    throws ServletException, IOException {
        try {
            // Example: you might get userId from JWT or header
            String userIdHeader = request.getHeader("X-User-Id");

            if (userIdHeader != null) {
                UserContext.setUserId(UUID.fromString(userIdHeader));
            }

            filterChain.doFilter(request, response);
        } finally {
            // Very important: clear the ThreadLocal after request finishes
            UserContext.clear();
        }
    }
}

