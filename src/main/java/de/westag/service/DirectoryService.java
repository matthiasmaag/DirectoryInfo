package de.westag.service;

import de.westag.model.SearchParams;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectoryService {

    private String directoryPath;
    private List<File> directoryList;
    private List<String> fileList;
    private Map<String, Integer> resultMap;

    public DirectoryService(SearchParams searchParams) {

        directoryList = new ArrayList<>();
        fileList = new ArrayList<>();
        resultMap = new HashMap<>();
        directoryPath = searchParams.getPath();
    }

    public Map<String, Integer> getResultMap() {
        return resultMap;
    }

    public void StartAnalysis() {
        try {
            DirectoryStream<Path> dirs = Files.newDirectoryStream(Paths.get(directoryPath));
            for (Path path : dirs) {
                if (Files.isDirectory(path)) {
                    directoryList.add(path.toFile());
                } else {
                    fileList.add(path.toString());
                }
            }

        } catch (Exception ex) {
            // todo show error message
        }

    }
}
