package com.epam.zhmyd.view;

import java.io.File;

/**
 * Created by Aliaksandr_Zhmaidzia on 12/21/2015.
 */
public class Widget {
    public void draw(String string, View view) {
        File parent = new File(string);
        StringBuilder builder = new StringBuilder();
        builder.append("<html lang=\"en\">\n<head>\n</head>\n<body>");
        if (parent.exists() && parent.isDirectory()) {
            for (File file : parent.listFiles()) {
                builder.append("<p>").append(view.getLine(file)).append("</p>\n");
            }
        }
        builder.append("</body>\n</html>");
        System.out.println(builder.toString());
    }
}
