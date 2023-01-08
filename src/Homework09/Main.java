package Homework09;

public class Main {
    public static void main(String[] args) throws Exception {
        String [] paths = new String[4];
        paths[0] = "Documents/Java/WorkProject";
        paths[1] = "Documents/Java/StudyProject";
        paths[2] = "Documents/Python/DataScience";
        paths[3] = "Documents/Python/DataScience/Bayes";

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(new FileData("File1", 34, "Documents/Java/WorkProject"), paths[0]);
  //      fileNavigator.add(new FileData("File2", 34, "Documents/Java/Work1Project"), paths[0]);
        fileNavigator.add(new FileData("File3", 12, "Documents/Java/StudyProject"), paths[1]);
        fileNavigator.add(new FileData("File4", 10, "Documents/Java/StudyProject"), paths[1]);
        fileNavigator.add(new FileData("File5", 18, "Documents/Java/StudyProject"), paths[1]);
        fileNavigator.add(new FileData("File6", 112, "Documents/Python/DataScience/Bayes"), paths[3]);
        fileNavigator.add(new FileData("File7", 184, "Documents/Python/DataScience/Bayes"), paths[3]);

        System.out.println("Find files: ");
        System.out.println(fileNavigator.find(paths[3]));
        System.out.println("--------------------------------------------");
        System.out.println("Filter files: ");
        System.out.println(fileNavigator.filterBySize(30));
        System.out.println("--------------------------------------------");
        System.out.println("Sort files by size: ");
        System.out.println(fileNavigator.sortBySize());
        System.out.println("---------------------------------------------");
        System.out.println("Remove files by path: ");
        System.out.println(fileNavigator.remove(paths[1]));
        System.out.println(fileNavigator);




    }
}
