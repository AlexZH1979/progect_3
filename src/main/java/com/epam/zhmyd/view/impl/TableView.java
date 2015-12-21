package com.epam.zhmyd.view.impl;

import com.epam.zhmyd.view.View;

import java.io.File;

/**
 * Created by Aliaksandr_Zhmaidzia on 12/21/2015.
 */
public class TableView implements View {
    public String getLine(File file) {
        String type = file.isDirectory()?"FILE: ":"DIR:  ";
        StringBuilder builder =new StringBuilder();
        String line= builder.append(type).append(file.getName()).append(" SIZE: ").append(file.getTotalSpace()).toString();
        return line;
    }
}
