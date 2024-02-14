public class Folder {
    private String folderName;
    private final File file;
    public Folder(String folderName, String fileName, String fileType) {
        this.folderName = folderName;
        this.file = new File(fileName, fileType);
    }
    public void setFolderName(String nameOfFolder) {
        this.folderName = nameOfFolder;
    }
    public String getFolderName() {
        return folderName;
    }

    public void printer() {
        System.out.println(getFolderName());
        file.printer();
    }
}
