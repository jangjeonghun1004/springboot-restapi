//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.dto;

import lombok.Generated;

public class MemberDto {
    private String name;
    private String email;
    private String organization;

    public MemberDto() {
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public String getOrganization() {
        return this.organization;
    }

    @Generated
    public void setName(final String name) {
        this.name = name;
    }

    @Generated
    public void setEmail(final String email) {
        this.email = email;
    }

    @Generated
    public void setOrganization(final String organization) {
        this.organization = organization;
    }

    @Generated
    public String toString() {
        String var10000 = this.getName();
        return "MemberDto(name=" + var10000 + ", email=" + this.getEmail() + ", organization=" + this.getOrganization() + ")";
    }
}
