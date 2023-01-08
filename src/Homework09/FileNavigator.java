package Homework09;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {

    Map<String, List<FileData>> files;

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

    public List<FileData> find(String path) {
        return files.getOrDefault(path, Collections.emptyList());
    }

    public List<FileData> filterBySize(int size) {
        return files.values().stream()
                .flatMap(List::stream)
                .filter(el -> el.getFileSize() >= size)
                .collect(Collectors.toList());
    }

    public boolean remove(String path) {
        return files.remove(path) != null;
    }

    public List<FileData> sortBySize() {
        return files.values().stream()
                .flatMap(List::stream)
                .sorted(Comparator.comparing(FileData::getFileSize))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }
}