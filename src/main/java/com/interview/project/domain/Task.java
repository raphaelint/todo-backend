package com.interview.project.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

    @Column(name="description")
    @JsonProperty("description")
    private String description;

    @Column(name="state")
    @JsonProperty("state")
    private String state;

    @Column(name="userId")
    @JsonProperty("userId")
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
