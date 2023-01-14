package module8.documentApp;

public class ApplicationForFOPChangesService implements DocumentService {
    @Override
    public void fill(Document document, DocumentFillingData fillingData) {
        System.out.println("ApplicationForFOPChangesService fill data");
        String filledDocumentData = document.getDocumentData() + fillingData.getDataToFill();

        document.setDocumentData(filledDocumentData);
        System.out.println("ApplicationForFOPChangesService document:" + document);
    }

    @Override
    public void sign(Document document, String signature) {
        System.out.println("ApplicationForFOPChangesService signing");

        document.setSignature(signature);
        System.out.println("ApplicationForFOPChangesService document: " + document);
    }

    @Override
    public void send(Document document, String addressToSend) {
        System.out.println("document has been sent to " + addressToSend);
    }

    @Override
    public Document generate() {
        System.out.println("Generating document.......");
        return new Document("I want to add following kveds:");
    }
}
