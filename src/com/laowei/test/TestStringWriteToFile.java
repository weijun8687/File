package com.laowei.test;

import com.laowei.file.StringWriteToFile;
import org.junit.Test;

/**
 * Created by wj on 2017/11/22.
 */
public class TestStringWriteToFile {

    @Test
    public void testWriteToFile(){
        StringWriteToFile stringWriteToFile = new StringWriteToFile();
        stringWriteToFile.writeToFile("ab", "/Users/wj/Desktop/hte");

        // 获取项目地址
        System.out.println(System.getProperty("user.dir"));

//        System.out.println(System.setProperty("hh","yi"));
    }

}
