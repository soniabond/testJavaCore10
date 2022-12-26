package module8.documentApp;

public class ApplicationForFOPChangesService implements DocumentService {
    @Override
    public void fill(Document document, DocumentFillingData fillingData) {
        String filledDocumentData = document.getDocumentData() + fillingData.getDataToFill();

        document.setDocumentData(filledDocumentData);
    }

    @Override
    public void sign(Document document, String signature) {
        document.setSignature(signature);
    }

    @Override
    public void send(Document document, String addressToSend) {
        System.out.println("document has been sent to " + addressToSend);
    }

    @Override
    public Document generate() {
        return new Document("I want to add following kveds:");
    }
}
