import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Terminal {
    Parser parser; //"Parser" class object

    //This method will choose the suitable command method to be called
    public void chooseCommandAction(){

        Terminal tm = new Terminal();
        if (parser.getCommandName() == "date"){tm.date();}
        if (parser.getCommandName() == "cd"){tm.cd(parser.getArgs());}
        // and so on
    }
    public void clear(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void cd(String[] args){}
    public void ls(){}
    public void pwd(){}
    public void date() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        dateFormat.setTimeZone(TimeZone.getTimeZone("EET"));
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);

    }
    public void mv(String[] args) {}
    public void rm(String [] args){}
    public void mkdir (String[] args) {}
    public void rmdir (String[] args){}
    public void cp (String[] args){} //cp file1.txt file2.txt
    public void more (String[] args){}
    public void cat (String[] args){}
    public void exit (){
        System.exit(0);
    }
    public void help (){
        System.out.println(
                "clear - Clear the console\n" +
                "cd <directory> - Change current directory\n" +
                "ls - List files and directories in the current directory\n" +
                "cp <source> <destination> - Copy file or directory\n" +
                "mv <source> <destination> - Move file or directory\n" +
                "rm <file/directory> - Remove file or directory\n" +
                "mkdir <directory> - Create a new directory\n" +
                "rmdir <directory> - Remove a directory\n" +
                "cat <file> - Display the contents of a file\n" +
                "more <file> - View the contents of a file one screen at a time\n" +
                "pwd - Show current working directory\n" +
                "date - Show the current date and time\n" +
                "exit : Stop all\n");
    }
}
