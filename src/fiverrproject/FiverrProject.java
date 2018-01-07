/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiverrproject;

import java.io.File;
import java.io.FileFilter;
import javax.activation.MimeType;
import javax.activation.MimetypesFileTypeMap;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author wajid
 */
public class FiverrProject 
{

    void listFolder(File dir)
    {
        File[] subDirs = dir.listFiles(new FileFilter() 
        {
            @Override
            public boolean accept(File pathname) 
            {
               return pathname.isDirectory();
            }
        });
        System.out.println("\nDirectory of :" + dir.getAbsolutePath());
        for(File folder: subDirs)
        {
            listFolder(folder);
        }
    }
    private void listFile(File dir)
    {
        File[] files = dir.listFiles();
        
        for(File file:files)
        {
            System.out.print("Files Name Are :");
            System.out.println(file.getName());
            
            double bytes = file.length();
            System.out.print("File Size is: ");
            System.out.println(bytes);
            
           MimetypesFileTypeMap fileTypeMap = new MimetypesFileTypeMap();
           System.out.print("File MIME type is: ");
           System.out.println(fileTypeMap.getContentType(file));
           
            //System.out.println(file.);
           String fileExt = FilenameUtils.getExtension(file.toString());
           System.out.print("File Extention is: ");
           System.out.println(fileExt);
            
            
        }
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        new FiverrProject().listFile(new File("C:\\Users\\wajid\\Desktop\\fiverr"));
    }
    
}
