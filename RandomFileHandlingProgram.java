// Writing into file using FileWriter
/*
import java.io.*;
public class fjest{
    public static void main(String args[])throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text2.txt");
        fw.write("hello");
        fw.close();
    }
}
*/

// Reading file using FileReader and also reading previous data in file
/*
import java.io.*;
public class fjest{
    public static void main(String args[])throws IOException{
        FileReader fr = new FileReader("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text2.txt");
        int j;
        while ((j = fr.read())!=-1){
            System.out.print((char)j);
        }
        fr.close();
        FileWriter fw = new FileWriter("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text2.txt");
        fw.write("hello");
        fw.close();
    }
}
*/

// Reading file using buffered reader and file reader
/*
import java.io.*;
public class fjest{
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text1.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.print(br.readLine());
        br.close();
    }
}
*/

/*
import java.io.*;
public class fjest{
    public static void main(String args[]) throws IOException{
        FileReader fr1 = new FileReader("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text1.txt");
        FileReader fr2 = new FileReader("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text2.txt");
        FileWriter fw = new FileWriter("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text3.txt");
        int j;
        while((j=fr1.read())!=-1){
            fw.write((char)j);
            System.out.print((char)j);
        }
        while((j=fr2.read())!=-1){
            fw.write((char)j);
            System.out.print((char)j);
        }
        fr1.close();
        fr2.close();
        fw.close();
    }
}
*/

/*
import java.io.*;
public class fjest{
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text1.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text3.txt");
        int i;
        while((i=fis.read())!=-1){
            fos.write(i);
            System.out.print((char)i);
        }
    }
}
*/

/*
import java.io.*;
public class fjest{
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text1.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text3.txt");
        int i;
        while((i=fis.read())!=-1){
            fos.write(i);
            System.out.print((char)i);
        }
        String st = "Sidharth";
        byte b[] = st.getBytes();
        System.out.println(b);
        fos.write(st.getBytes());
        fis.close();
        fos.close();
    }
}
*/


//2.Write a java program that read from a file and write to file by handling all file related exceptions.
/*
import java.io.*;
public class fjest{
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text1.txt");
        FileWriter fw = new FileWriter("C:\\Users\\SIDDU\\OneDrive\\Desktop\\work\\javafiles\\FileHandling\\text2.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fw.write(line+"\n");
        }
        fw.close();
        fr.close();
    }
}
*/
