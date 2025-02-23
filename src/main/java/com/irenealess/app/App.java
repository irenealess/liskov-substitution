package com.irenealess.app;

import com.irenealess.app.before.Document;
import com.irenealess.app.before.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        Document myDoc = new Document("myDoc");
        Project myProject = new Project();

        List<Document> myDocs = new ArrayList<Document>();
        myDocs.add(myDoc);
        myProject.setDocuments(myDocs);
        myProject.openAll();
        myProject.saveAll();

        Document myReadOnlyDoc = new Document("myReadOnlyDoc");
        myProject.getDocuments().add(myReadOnlyDoc);
        myProject.openAll();
        myProject.saveAll(); //Bad behavior
    }
}
