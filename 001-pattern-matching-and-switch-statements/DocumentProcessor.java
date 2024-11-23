
/**
 * Document Processing System Exercise
 *
 * Refactor this document processing system to use modern pattern matching.
 * Tasks:
 * 1. Convert the traditional instanceof checks to pattern matching
 * 2. Implement the processDocument method using pattern matching switch
 * 3. Ensure all document types are handled correctly
 */
public class DocumentProcessor {
    /**
     * Sealed interface establishing the document type hierarchy.
     * This interface is necessary for three key reasons:
     * 1. Enables polymorphic handling of different document types
     * 2. Provides compile-time type safety by restricting implementations
     * 3. Allows exhaustive pattern matching in switch expressions, with
     * compiler verification that all possible cases are handled
     * 
     * Without this sealed interface, we would lose the ability to:
     * - Treat different document types uniformly
     * - Guarantee exhaustive pattern matching
     * - Maintain a closed hierarchy of document types
     */
    sealed interface Document permits PDFDocument, TextDocument, SpreadsheetDocument {}

    record PDFDocument(String title, int pages) implements Document {}

    record TextDocument(String title, long wordCount) implements Document {}

    record SpreadsheetDocument(String title, int sheets) implements Document {}

    // TODO: Convert this method to use pattern matching instanceof
    public static String extractMetadata(Document doc) {
        if (doc instanceof PDFDocument) {
            PDFDocument pdf = (PDFDocument) doc;
            return "PDF: " + pdf.title() + " (" + pdf.pages() + " pages)";
        } else if (doc instanceof TextDocument) {
            TextDocument text = (TextDocument) doc;
            return "Text: " + text.title() + " (" + text.wordCount() + " words)";
        } else if (doc instanceof SpreadsheetDocument) {
            SpreadsheetDocument sheet = (SpreadsheetDocument) doc;
            return "Spreadsheet: " + sheet.title() + " (" + sheet.sheets() + " sheets)";
        }
        return "Unknown document type";
    }

    // TODO: Implement this method using pattern matching switch
    public static int getDocumentComplexity(Document doc) {
        // Return:
        // - For PDF: pages * 10
        // - For Text: wordCount / 100
        // - For Spreadsheet: sheets * 20
        throw new UnsupportedOperationException("Implement this method");
    }

    public static void main(String[] args) {
        Document[] documents = {
                                new PDFDocument("Annual Report", 30),
                                new TextDocument("README", 150),
                                new SpreadsheetDocument("Budget", 3)
        };

        for (Document doc : documents) {
            System.out.println(extractMetadata(doc));
            System.out.println("Complexity: " + getDocumentComplexity(doc));
        }
    }
}
