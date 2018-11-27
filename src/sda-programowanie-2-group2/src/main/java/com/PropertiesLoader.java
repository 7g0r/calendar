package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    private String eventPatch;
    private String todoPath;
    private String imputDataFormat;
    private String outputDataFormat;

    public String getEventPatch() {
        return eventPatch;
    }

    public void setEventPatch(String eventPatch) {
        this.eventPatch = eventPatch;
    }

    public String getTodoPath() {
        return todoPath;
    }

    public void setTodoPath(String todoPath) {
        this.todoPath = todoPath;
    }

    public String getImputDataFormat() {
        return imputDataFormat;
    }

    public void setImputDataFormat(String imputDataFormat) {
        this.imputDataFormat = imputDataFormat;
    }

    public String getOutputDataFormat() {
        return outputDataFormat;
    }

    public void setOutputDataFormat(String outputDataFormat) {
        this.outputDataFormat = outputDataFormat;
    }

    public PropertiesLoader() {
        try {

            File file = new File("C:\\Users\\komputer\\IdeaProjects\\sda-programowanie-2-group2\\src\\main\\resources\\app properites");
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);

            eventPatch = properties.getProperty("path.event");
            todoPath = properties.getProperty("path.property");
            imputDataFormat = properties.getProperty("dataInput");
            outputDataFormat = properties.getProperty("dataOutput");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
