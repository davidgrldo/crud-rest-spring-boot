package com.domain.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {
    @NotEmpty(message = "Name is required")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
