package module8.documentApp;

public class ApplicationTest {
    public static void main(String[] args) {
        DocumentService documentService = new FopThirdGroupGenerallTaxReportService();
        Document document = documentService.generate();
        System.out.println("Just generated document: " + document);
        DocumentFillingData documentFillingData = new DocumentFillingData();
        documentFillingData.setDataToFill("Data to fill");
        documentService.fill(document, documentFillingData);
        documentService.sign(document, "my signature");
        documentService.send(document, "ukr_dps@gmail.com");
    }
}
