public class File {
    private String fileName;
    private String fileType;

    public File(String fileName, String fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public void setFileName(String fName) {
        this.fileName = fName;
    }
    public void setFileType(String fType) {
        this.fileType = fType;
    }

    public String getFileName() {
        return fileName;
    }
    public String getFileType() {
        return fileType;
    }

    public void printer() {
        System.out.println(getFileName() + getFileType());
    }
}
