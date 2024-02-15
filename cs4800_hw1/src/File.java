public class File {
    private int level;
    private String fileName;
    private String fileType;

    public File() {
        this.fileName = "";
        this.fileType = "";
        this.level = 0;
    }
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

    public void increaseLevel(int parentLevel) {
        level = parentLevel + 1;
    }

    public String getFileName() {
        return fileName;
    }
    public String getFileType() {
        return fileType;
    }

    public void printer() {
        for(int i = 0; i < level; i++)
        {
            System.out.printf("\t");
        }
        System.out.println(getFileName() + getFileType());
    }
}