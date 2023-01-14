package module8.documentApp;

public abstract class ReportForFOPDeclarationService implements DocumentService {

    @Override
    public void sign(Document document, String signature) {
        System.out.println("ReportForFOPDeclarationService signing");

        document.setSignature(signature);
        System.out.println("ReportForFOPDeclarationService document: " + document);
    }

    @Override
    public void send(Document document, String addressToSend) {
        System.out.println("ReportForFOPDeclarationService: document has been sent to " + addressToSend);
    }
}
