package com.irenealess.app.before;

import java.io.IOException;

public class Document {
    String data;
    String filename;

    public Document(String myDoc) {
        filename = myDoc;
    }

    void open() {
        System.out.println("Opening file");
    }

    void save() {
        System.out.println("Saving file");
    }

}
