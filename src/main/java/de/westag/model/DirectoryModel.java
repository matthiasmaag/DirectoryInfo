package de.westag.model;

import lombok.Data;

@Data
public class DirectoryModel {
    private String path;
    private int fileCounter;
    private String filePattern;
}
