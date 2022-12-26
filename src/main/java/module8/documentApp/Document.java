package module8.documentApp;

public class Document {
    private String documentData;
    private String signature;

    public Document() {
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Document(String documentData) {
        this.documentData = documentData;
    }

    public String getDocumentData() {
        return documentData;
    }

    public void setDocumentData(String documentData) {
        this.documentData = documentData;
    }
}
