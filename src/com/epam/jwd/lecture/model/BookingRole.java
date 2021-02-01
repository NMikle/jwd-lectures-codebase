package com.epam.jwd.lecture.model;

public enum BookingRole {
    ADMIN,
    CLIENT;

    public static BookingRole of(String name) {
        for (BookingRole role : values()) {
            if (role.name().equalsIgnoreCase(name)) {
                return role;
            }
        }
        return CLIENT;
    }
}
