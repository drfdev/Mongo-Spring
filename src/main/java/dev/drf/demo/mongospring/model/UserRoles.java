package dev.drf.demo.mongospring.model;

public enum UserRoles {
    READ("read"),
    WRITE("write"),
    ADMIN("admin");

    private final String roleName;

    UserRoles(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
