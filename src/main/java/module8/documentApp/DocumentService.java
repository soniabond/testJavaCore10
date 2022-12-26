package module8.documentApp;

public interface DocumentService extends ReadOnlyDocumentService {
    void fill(Document document, DocumentFillingData fillingData);
    void sign(Document document, String signature);
    void send(Document document, String addressToSend);
}
