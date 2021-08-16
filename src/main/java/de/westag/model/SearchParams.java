package de.westag.model;

import lombok.Data;

@Data
public class SearchParams {
    private String path;
    private String filePattern;
}
