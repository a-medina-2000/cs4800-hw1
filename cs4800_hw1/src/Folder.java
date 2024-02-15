import java.util.ArrayList;

public class Folder {
    private int level;
    private String folderName;
    private ArrayList<Folder> folderGroup;
    private ArrayList<File> fileGroup;
    public Folder(String folderName) {
        this.folderName = folderName;
        this.folderGroup = new ArrayList<Folder>();
        this.fileGroup = new ArrayList<File>();
        this.level = 0;
    }
    public Folder() {
        this.folderName = "";
    }
    public void setFolderName(String nameOfFolder) {
        this.folderName = nameOfFolder;
    }
    public String getFolderName() {
        return folderName;
    }

    public void increaseLevel(int parentLevel) {
        level = parentLevel + 1;
    }

    public void addFile(File newFile) {
        newFile.increaseLevel(this.level);
        fileGroup.add(newFile);
    }

    public int getFolderGroupSize() {
        return folderGroup.size();
    }
    public int getFileGroupSize() {
        return fileGroup.size();
    }

    public void addSubFolder(Folder subFolderGroup) {
        subFolderGroup.increaseLevel(this.level);
        folderGroup.add(subFolderGroup);
    }

    public void printer() {
        for(int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        System.out.println(getFolderName());

        for (Folder folder : folderGroup) {
            // Displays folder name from ArrayList

            if(folder.getFileGroupSize() > 0 || folder.getFolderGroupSize() > 0) {
                folder.printer();
            }
            else {
                for(int i = 0; i < folder.level; i++) {
                    System.out.print("\t");
                }
                System.out.println(folder.getFolderName());
            }

        }
        for (File file : fileGroup) {
            file.printer();
        }
    }
}