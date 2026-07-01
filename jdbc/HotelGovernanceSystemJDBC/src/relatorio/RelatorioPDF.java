package relatorio;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import model.QuartoBean;

/**
 * RelatorioPDF — Gerador de relatórios em PDF do Hotel Governance System
 * Utiliza a biblioteca iTextPDF para gerar documentos PDF gerenciais.
 * O arquivo é salvo na pasta raiz do projeto como RelatorioHGS.pdf.
 *
 * ═══════════════════════════════════════════════════════
 *  SUMÁRIO
 * ═══════════════════════════════════════════════════════
 *  1. RELATÓRIOS
 *     1.1 gerarRelatorioGerencial()
 *         — Gera relatório completo de todos os quartos
 *         — Exibe número, andar, status, tipo e modelo
 *         — Saída: RelatorioHGS.pdf na raiz do projeto
 * ═══════════════════════════════════════════════════════
 *
 * @author João Adorno
 * @version 5.2
 */

public class RelatorioPDF {
    
    // ═══════════════════════════════════════════════════════
    // RELATORIOS
    // ═══════════════════════════════════════════════════════
    // gerarRelatorioGerencial()
    // ═══════════════════════════════════════════════════════
    
    public void gerarRelatorioGerencial(ArrayList<QuartoBean> quartos) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento,
                    new FileOutputStream("RelatorioHGS.pdf"));
            documento.open();

            documento.add(new Paragraph("HOTEL GOVERNANCE SYSTEM"));
            documento.add(new Paragraph("RELATÓRIO GERENCIAL DE QUARTOS"));
            documento.add(new Paragraph(" "));

            for (QuartoBean quarto : quartos) {
                documento.add(new Paragraph(
                        "Quarto " + quarto.getNumero()
                        + " | Andar: " + quarto.getAndar()
                        + " | Status: " + quarto.getStatusDescricao()
                        + " | Tipo: " + quarto.getTipoDescricao()
                        + " | Modelo: " + quarto.getModeloDescricao()
                ));
            }

            documento.close();
            System.out.println("Relatório PDF gerado com sucesso!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
