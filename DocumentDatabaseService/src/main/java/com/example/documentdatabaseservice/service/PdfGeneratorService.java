package com.example.documentdatabaseservice.service;

import com.example.documentdatabaseservice.model.ReservationPaymentDocument;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class PdfGeneratorService {

    public byte[] generatePdf(ReservationPaymentDocument document) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Document pdfDocument = new Document();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        try {
            PdfWriter.getInstance(pdfDocument, baos);
            pdfDocument.open();
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            PdfPCell titleCell = new PdfPCell(new Phrase("Booking confirmation", titleFont));
            titleCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            titleCell.setBorder(Rectangle.NO_BORDER);
            table.addCell(titleCell);
            Image logo = Image.getInstance("C:/Users/pmili/OneDrive/Desktop/hotel.jpg");
            logo.scaleToFit(100, 50);
            PdfPCell logoCell = new PdfPCell(logo);
            logoCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            logoCell.setBorder(Rectangle.NO_BORDER);
            table.addCell(logoCell);

            pdfDocument.add(table);

            pdfDocument.add(Chunk.NEWLINE);
            Font boldFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
            pdfDocument.add(new Paragraph("Dear " + document.getUserName() + ",", boldFont));
            pdfDocument.add(new Paragraph("Thank you for your reservation. Here are the details:"));
            pdfDocument.add(Chunk.NEWLINE);
            LocalDate today = LocalDate.now();

            pdfDocument.add(new Paragraph("Reservation details", boldFont));
            pdfDocument.add(new Paragraph("Start date: " + document.getReservationStartDate().format(dateFormatter)));
            pdfDocument.add(new Paragraph("End date: " + document.getReservationEndDate().format(dateFormatter)));
            pdfDocument.add(new Paragraph("Reservation date: " + document.getReservationDate().format(dateFormatter)));
            pdfDocument.add(new Paragraph("Guest count: " + document.getGuestCount()));
            pdfDocument.add(new Paragraph("Reservation status: " + document.getReservationStatus()));
            pdfDocument.add(Chunk.NEWLINE);

            pdfDocument.add(new Paragraph("Payment details", boldFont));
            pdfDocument.add(new Paragraph("Payment amount: " + document.getPaymentAmount() + "$"));
            pdfDocument.add(new Paragraph("Payment status: " + document.getPaymentStatus()));
            pdfDocument.add(new Paragraph("Payment method: " + document.getPaymentMethod()));
            pdfDocument.add(new Paragraph("Currency: " + document.getCurrency()));
            pdfDocument.add(new Paragraph("Confirmation number: " + document.getConfirmationNumber()));
            pdfDocument.add(new Paragraph("Your card last four digits: " + document.getCardLastFourDigits()));
            pdfDocument.add(Chunk.NEWLINE);

            LineSeparator separator = new LineSeparator();
            pdfDocument.add(new Chunk(separator));
            pdfDocument.add(Chunk.NEWLINE);

            Paragraph signature = new Paragraph("Official seal", boldFont);
            signature.setAlignment(Element.ALIGN_RIGHT);
            pdfDocument.add(signature);

            pdfDocument.add(new Paragraph("This document serves as an official receipt and reservation confirmation.         " + today.format(dateFormatter)));
            pdfDocument.add(new Paragraph("Please keep this for your records."));

        } catch (DocumentException e) {
            throw new IOException("Error creating PDF document", e);
        } finally {
            pdfDocument.close();
        }

        return baos.toByteArray();
    }
}
