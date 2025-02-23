package com.irenealess.app.before;

public class ReadOnlyDocument extends Document {

    public ReadOnlyDocument(String myDoc) {
        super(myDoc);
    }

/*    public void save() throws Exception {
        throw new Exception("Unable to save read-only file.");
    }
*/
}