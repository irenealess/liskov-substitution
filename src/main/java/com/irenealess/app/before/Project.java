package com.irenealess.app.before;

import java.util.List;
/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
 */

public class Project {
    List<Document> documents;

    public void openAll() {
        documents.forEach(Document::open);
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public void saveAll() throws Exception {

        documents.forEach(Document::save);

    }

}

