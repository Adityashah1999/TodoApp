package com.aditya.todoapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String description;
    private int priority;

    //Constructor to later create note objects
    //Room also needs constructor to later recreate them from database
    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }


    //setter for id only
    //room will later used this method to set id for objects
    public void setId(int id) {
        this.id = id;
    }


    //Inorder for room to persist these values inside the database we need getter methods.
    //getter method for all three fields
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
