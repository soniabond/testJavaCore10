package module8.documentApp;

public class FopThirdGroupGenerallTaxReportService extends ReportForFOPDeclarationService {

    @Override
    public void fill(Document document, DocumentFillingData fillingData) {
        System.out.println("FopThirdGroupGenerallTaxReportService fill data");
        String filledDocumentData = document.getDocumentData() + fillingData.getDataToFill();

        document.setDocumentData(filledDocumentData);
        System.out.println("FopThirdGroupGenerallTaxReportService document:" + document);
    }

    @Override
    public Document generate() {
        System.out.println("FopThirdGroupGenerallTaxReportService Generating document.......");
        return new Document("Here is my general declaration:");

    }
}
