package com.epam.jwd.lecture.model;

public class BookingUser {

    private final Integer id;
    private final String login;
    private final String password;
    private final String name;
    private final BookingRole role;

    public BookingUser(Integer id, String login, String password, String name, BookingRole role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public BookingRole getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookingUser)) return false;

        BookingUser that = (BookingUser) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return role == that.role;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookingUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", roleId=" + role +
                '}';
    }
}
