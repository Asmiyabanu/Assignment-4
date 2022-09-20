import java.io.IOException;


public class Folder 
{
  private String nameOfTheFolder;
  private static String FileName;
  private String createdDate;
  private String ownerOfTheFolder;
  private String typeOfTheFiles;
  public Folder(Object object, String createdDate, String ownerOfTheFolder, String typeOfTheFiles) throws IOException {
    this.setNameOfTheFolder(object);
        this.setCreatedDate(createdDate);
        this.setOwnerOfTheFolder(ownerOfTheFolder);
        this.setTypeOfTheFiles(typeOfTheFiles);
    }
  

  private void setNameOfTheFolder(Object object) {
  }


  public String getNameOfTheFolder() {
      return nameOfTheFolder;
  }

  public void setNameOfTheFolder(String nameOfTheFolder) throws IOException {
     this.nameOfTheFolder = nameOfTheFolder;
  }

  public String getCreatedDate() {
      return createdDate;
  }

  public void setCreatedDate(String createdDate) {
      this.createdDate = createdDate;
  }

  public String getOwnerOfTheFolder() {
      return ownerOfTheFolder;
  }

  public void setOwnerOfTheFolder(String ownerOfTheFolder) {
      this.ownerOfTheFolder = ownerOfTheFolder;
  }

  public String getTypeOfTheFiles() {
      return typeOfTheFiles;
  }

  public void setTypeOfTheFiles(String typeOfTheFiles) {
      this.typeOfTheFiles = typeOfTheFiles;
  }
  public static void main(String args[]) {
  
  
    int position = nameOfTheFolder.searchByFileNam("enter the file name"+ FileName);
  
    // Display Index 
    System.out.println("Folder names:" + nameOfTheFolder );
    
    System.out.println("serching the file name according index:" + position);
   }


  public static Object getName() {
    return null;
  }
  }


