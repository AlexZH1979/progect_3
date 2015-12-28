package com.epam.zhmyd;

import com.epam.zhmyd.view.View;
import com.epam.zhmyd.view.Widget;
import com.epam.zhmyd.view.impl.DefaultView;
import com.epam.zhmyd.view.impl.ListView;
import com.epam.zhmyd.view.impl.TableView;
/*
* launch with 2 arguments example "c://" "TABLE"
 */
public class Application {
    public static void main(String[] args) {
        if (args.length > 1) {
            String path = args[0];
            Modes mode = Modes.valueOf(args[1]);
            View view = getView(mode);

            Widget widget = new Widget(view);
            widget.draw(path);
        }
    }

    private static View getView(Modes modes) {
        View view;
        switch (modes) {
            case LIST:
                view = new ListView();
                break;
            case TABLE:
                view = new TableView();
                break;
            default:
                view = new DefaultView();
        }
        return view;
    }

}
