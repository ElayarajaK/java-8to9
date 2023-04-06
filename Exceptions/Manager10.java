import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
public class Manager10 {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        Statement stmt=null;
        File f2 =null;
        String s1=null;
        FileWriter f1=null;

        try{
            f2=new File("A.txt");
            s1 = f2.getName();

        }
        catch(Exception e){

        }
System.out.println(s1);
        try(FileWriter f4 = new FileWriter("A.txt"))
        {
           
            f1.write("Hello i am from java java can manage the files also");
            f1.flush();

        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            try {
                f1.close();
                con.close();
                stmt.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           
        }

    }
    
}
