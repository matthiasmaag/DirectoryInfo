package de.westag.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectoryService {

    private String directoryPath;
    private List<File> directoryList;
    private Map<String, Integer> resultMap;

    public DirectoryService(String directoryPath) {
        this.directoryPath = directoryPath;
        directoryList = new ArrayList<>();
        resultMap = new HashMap<>();
    }

    public void StartAnalysis() {

    }
}
