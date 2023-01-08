package Homework09;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {

    Map<String, List<FileData>> files = new HashMap<>();

    public FileNavigator() {
        this.files = new HashMap<>();
    }

    public void add(FileData file, String path) throws Exception {
        if (!path.equals(file.getPath())) {
            throw new Exception("Wrong path was entered.");
        }
        if (files.containsKey(file.getPath())) {
            List<FileData> filesOnPath = files.get(file.getPath());
            filesOnPath.add(file);
        } else {
            List<FileData> filesOnPath = new ArrayList<>();
            filesOnPath.add(file);
            files.put(file.getPath(), filesOnPath);
        }
    }

    public List<FileData> find(String path) throws NullPointerException {
        List<FileData> filesOnPath = files.get(path);
        if (!filesOnPath.isEmpty()) {
            return filesOnPath;
        } else {
            throw new NullPointerException("This path hasn't any files.");
        }
    }

    public List<FileData> filterBySize(int size) {
        List<FileData> returnedFiles = new ArrayList<>();
        for (List<FileData> pathFiles : files.values()) {
            returnedFiles.addAll(pathFiles.stream()
                    .filter(el -> el.getFileSize() >= size)
                    .toList());
        }
        return returnedFiles;
    }

    public void remove(String path) throws NullPointerException {
        if (files.containsKey(path)) {
            files.remove(path);
        } else {
            throw new NullPointerException("This path doesn't exist.");
        }
    }

    public List<FileData> sortBySize() {
        List<FileData> returnedFiles = new ArrayList<>();
        for (List<FileData> filesOnPath : files.values()) returnedFiles.addAll(filesOnPath);
        returnedFiles = returnedFiles.stream()
                .sorted(Comparator.comparing(FileData::getFileSize))
                .collect(Collectors.toList());
        return returnedFiles;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }
}
