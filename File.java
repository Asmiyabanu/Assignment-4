import java.util.ArrayList;
import java.util.List;

public class File
{
    private String fileNameToSearch;
    private List<String> result = new ArrayList<String>();
    private String fileNumber;
    private String nameOfTheFile;
    private String createdDate;
    private String content;

    public void setFileNameToSearch(String folderNameToSearch) {
        this.fileNameToSearch = folderNameToSearch;
    }

    public String getFileNameToSearch() {
        return fileNameToSearch;
    }

    public List<String> getResult(){
        return result;
    }
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getNameOfTheFile() {
        return nameOfTheFile;
    }

    public void setNameOfTheFile(String nameOfTheFile) {
        this.nameOfTheFile = nameOfTheFile;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }

}

    
