package com.laowei.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by wj on 2017/11/22.
 */
public class StringWriteToFile {

    public void writeToFile(String string, String fileUrl){
        string = string==null ? "kkabckanlcnalcjkabcjka" : string;

        System.out.println(string);

        File Dirfile = new File(fileUrl);
        judeDirExists(Dirfile);

        File file = new File(fileUrl+"/laowei.txt");
        if (!file.exists()){
            // 文件不存在
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            byte bytes[] = new byte[512];
            bytes = string.getBytes();
            int b = bytes.length;   //是字节的长度，不是字符串的长度
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(bytes,0,b);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 判断文件夹是否存在
    public void judeDirExists(File file) {

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
        }
    }




}
