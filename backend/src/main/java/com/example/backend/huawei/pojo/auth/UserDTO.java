package com.example.backend.huawei.pojo.auth;

public class UserDTO {

    private String name;

    private String password;

    private DomainDTO domain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DomainDTO getDomain() {
        return domain;
    }

    public void setDomain(DomainDTO domain) {
        this.domain = domain;
    }
}
