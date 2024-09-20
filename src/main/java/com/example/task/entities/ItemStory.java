package com.example.task.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Table(name = "item_story")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemStory {

    @Id
    @GeneratedValue()
    private int id;

    private int itemId;

    private int indexFrom;

    private int indexTo ;

    private Timestamp created_At ;
}
