import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static final String FileSearch = null;
    public static void main(String[] arg) throws Exception {
        final File folderPath = new File("./newfolder/");
        Stack<Folder> stack = new Stack<>();
        lifoFolder(folderPath, stack);
        System.out.println("Your folder Add to LastInFirstOut");
        userInputAndSearch(folderPath);
    }
    private static void userInputAndSearch(File folderPath) {
        try (Scanner newUserInputObject = new Scanner(System.in)) {
            System.out.println("Type 'File' or 'Folder' for Search what we need: ");
            String userInputFileOrFolder = newUserInputObject.nextLine().toLowerCase();
            if (userInputFileOrFolder.equals("File")) {
                System.out.println("Type 'Number' for search by file number or 'Name' for search by file name: ");
                String userInputFileNumberOrFileName = newUserInputObject.nextLine().toLowerCase();
                if (userInputFileNumberOrFileName.equals("number")) {
                    System.out.println("Sorry, Search by file number is under constructor");
                    //String fileNumber;
                    //System.out.println("Enter File Number: ");
                    //fileNumber = newUserInputObject.nextLine();
                    //searchByFileNumber();
                    System.out.println("Search By File Number");
                } else if (userInputFileNumberOrFileName.equals("Name")) {
                    String fileName;
                    System.out.println("Enter Folder name: ");
                    fileName = newUserInputObject.nextLine();
                    searchByFileName(folderPath, fileName);
                    System.out.println("Search By File Name");
                } else {
                    System.out.println("You type wrong content, Please try again!");
                }
            } else if (userInputFileOrFolder.equals("folder")) {
                String folderName;
                System.out.println("Enter Folder name: ");
                folderName = newUserInputObject.nextLine();
                searchByFolderName(folderPath, folderName);
                System.out.println("Search By Folder Name");
            } else {
                System.out.println("You type wrong content, Please try again!");
            }
        }
    }
    private static void lifoFolder(File folderPath, Stack<Folder> stack) throws IOException {
        File[]folderList = folderPath.listFiles();
        assert folderList != null;
        for (File folder : folderList) {
            BasicFileAttributes createdDate = Files.readAttributes(folder.toPath(), BasicFileAttributes.class);
            FileOwnerAttributeView ownerOfTheFolder = Files.getFileAttributeView(folder.toPath(), FileOwnerAttributeView.class);
            String typeOfTheFiles = Files.probeContentType(folder.toPath());

            Folder newFolderObject1 = new Folder(Folder.getName(),
                    createdDate.creationTime().toString(),
                    ownerOfTheFolder.getOwner().toString(),
                    typeOfTheFiles);

            stack.push(newFolderObject1);
        }
    }
    private static void searchByFolderName(File folderPath, String folderName){

        String[] folderList = folderPath.list();  // store all names with same name // with/without extension
        int folderCount = 0;
        if (folderList == null) {
            System.out.println("Empty directory.");
        }
        else {
            // Linear search in the array
            for (String foldname : folderList) {
                if (foldname.equalsIgnoreCase(folderName)) {
                    System.out.println(foldname + " found");
                    folderCount = 1;
                }
            }
        }
        if (folderCount == 0) {
            System.out.println("File Not Found");
        }
    }
    private static void searchByFileName(File folderPath, String FileName){
        File fileSearch = new File(FileName);
        FileSearch.FileSearchMethod(  FileName );
        int count = FileSearch.getResult().size();
        if(count == 0){
            System.out.println("\nNo Result found!");
        }else {
            System.out.println("\nFound " + count + " result\n");
            for (String printResults : FileSearch.getResult()) {
                System.out.println("Found: " + printResults);
            }
        }
    }
}
