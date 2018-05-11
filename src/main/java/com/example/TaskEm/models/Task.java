package com.example.TaskEm.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {

    @Id
    private String id;
    private String title;
    private String description;
}
