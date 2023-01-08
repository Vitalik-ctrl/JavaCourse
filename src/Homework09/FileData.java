package Homework09;

public class FileData {

    String fileName;
    int fileSize;
    String path;

    public FileData(String fileName, int fileSize, String path) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
