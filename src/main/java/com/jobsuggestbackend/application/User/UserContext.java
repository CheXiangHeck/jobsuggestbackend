package com.jobsuggestbackend.application.User;

import java.util.UUID;

public class UserContext {
    private static final ThreadLocal<UUID> userId = new ThreadLocal<>();

    public static void setUserId(UUID id) {
        userId.set(id);
    }

    public static UUID getUserId() {
        return userId.get();
    }

    public static void clear() {
        userId.remove();
    }
}
