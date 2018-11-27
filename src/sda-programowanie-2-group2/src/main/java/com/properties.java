package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {
    public static void main(String[] args) throws IOException {
        File file = new File ("C:\\Users\\komputer\\IdeaProjects\\sda-programowanie-2-group2\\src\\main\\resources\\app properites");
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("name"));
    }
}
