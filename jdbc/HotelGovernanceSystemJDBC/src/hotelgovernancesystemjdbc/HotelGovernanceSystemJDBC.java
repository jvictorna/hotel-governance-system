package hotelgovernancesystemjdbc;

import java.util.Scanner;
import dao.DAO;
import java.util.ArrayList;
import model.QuartoBean;
import service.CheckList;
import controller.HGSController;

/**
 * HotelGovernanceSystemJDBC — Classe principal do Hotel Governance System
 * Responsável pela interface com o usuário — exibição, menus e captura de input.
 * Delega todas as regras de negócio ao HGSController.
 *
 * ═══════════════════════════════════════════════════════
 *  SUMÁRIO
 * ═══════════════════════════════════════════════════════
 *  1. ATRIBUTOS E INSTÂNCIAS
 *
 *  2. INTERFACE — CABEÇALHO E EXIBIÇÃO
 *     2.1 cabecalhoInicio()
 *     2.2 verificarAlerta()
 *     2.3 exibirQuartos()
 *     2.4 exibirMenu()
 *
 *  3. CAPTURA DE DADOS
 *     3.1 solicitarDados()
 *
 *  4. EXECUÇÃO PRINCIPAL
 *     4.1 main()
 * ═══════════════════════════════════════════════════════
 *
 * @author João Adorno
 * @version 5.2
 */

public class HotelGovernanceSystemJDBC {

    // ═══════════════════════════════════════════════════════
    // ATRIBUTOS E INSTÂNCIAS 
    // ═══════════════════════════════════════════════════════
    
    static int opcao, numQuarto, opcaoManut, posicao;

    static String resposta;

    static Scanner teclado = new Scanner(System.in);

    static DAO dao = new DAO();

    static ArrayList<QuartoBean> quartos = dao.listarQuartos();

    static HGSController controller = new HGSController(dao, teclado);
    
    // ═══════════════════════════════════════════════════════
    // INTERFACE — CABEÇALHO E EXIBIÇÃO
    // cabecalhoInicio()
    // verificarAlerta()
    // exibirQuartos()
    // exibirMenu()
    // ═══════════════════════════════════════════════════════
    // cabecalhoInicio()
    // ═══════════════════════════════════════════════════════

    static void cabecalhoInicio() {
        System.out.println("=========================================");
        System.out.println("          SISTEMA DE GOVERNANÇA          ");
        System.out.println("=========================================");

    } // Fechamento cabecalhoInicio();
    
    // ═══════════════════════════════════════════════════════
    // verificarAlerta()
    // ═══════════════════════════════════════════════════════

    static String verificarAlerta(QuartoBean quarto) {
        if (quarto.getIdStatus() == 1 && quarto.getDataUltimaSaida() != null) {
            try {
                java.time.LocalDateTime ultimaSaida = java.time.LocalDateTime
                        .parse(quarto.getDataUltimaSaida(),
                                java.time.format.DateTimeFormatter
                                        .ofPattern("yyyy-MM-dd HH:mm:ss"));

                long dias = java.time.temporal.ChronoUnit.DAYS
                        .between(ultimaSaida, java.time.LocalDateTime.now());

                if (dias >= 5) {
                    return " ⚠ REVISÃO NECESSÁRIA (" + dias + " dias)";
                }
            } catch (Exception e) {
            }
        }
        return "";
    } // Fechamento verificarAlerta();
    
    // ═══════════════════════════════════════════════════════
    // exibirQuartos()
    // ═══════════════════════════════════════════════════════

    static void exibirQuartos() {

        String[] nomeAndares = {"T E R R E O", "1º A N D A R", "2º A N D A R", "3º A N D A R"};

        for (int andar = 0; andar <= 3; andar++) {
            System.out.println("=========================================");
            System.out.println("          " + nomeAndares[andar] + "          ");
            System.out.println("=========================================");

            for (QuartoBean quarto : quartos) {
                if (quarto.getAndar() == andar) {
                    System.out.println(
                            "Quarto "
                            + quarto.getNumero()
                            + ": "
                            + quarto.getStatusDescricao()
                            + verificarAlerta(quarto));
                }
            }
        }
    } // Fechamento exibirQuartos();
    
    // ═══════════════════════════════════════════════════════
    // exibirMenu()
    // ═══════════════════════════════════════════════════════

    static void exibirMenu() {
        System.out.println("=========================================");
        System.out.println("           SELECIONE UMA OPÇÃO           ");
        System.out.println("=========================================");
        System.out.println("1. Checkout - ACIONAR CAMAREIRA II ");
        System.out.println("2. Arrumação pendente - ACIONAR CAMAREIRA I ");
        System.out.println("3. Limpeza iniciada - AGUARDANDO CONCLUSÃO ");
        System.out.println("4. Limpeza finalizada - INICIAR CHECK-LIST ");
        System.out.println("5. Check-in realizado - QUARTO OCUPADO ");
        System.out.println("6. Revisão geral - ACIONAR CAMAREIRA III ");
        System.out.println("7. Manutenção - BLOQUEAR QUARTO ");
        System.out.println("8. Manutenção concluída - LIBERAR QUARTO ");
        System.out.println("9. Relatórios ");
        System.out.println("0. Encerrar sessão ");
        System.out.println("");

    } // Fechamento exibirMenu();
    
    // ═══════════════════════════════════════════════════════
    // CAPTURA DE DADOS
    // ═══════════════════════════════════════════════════════
    // solicitarDados()
    // ═══════════════════════════════════════════════════════

    static void solicitarDados() {
        
    if (opcao >= 1 && opcao <= 8) {
        
        System.out.print("Digite o número do quarto (ou 0 para cancelar): ");
        
        try {
            numQuarto = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("ERRO: Digite apenas números!");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.next();
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
            return;
        }

        if (numQuarto == 0) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("OPERAÇÃO CANCELADA — retornando ao menu principal");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
            return;
        }

        posicao = controller.getPosicao(numQuarto); 
        if (posicao == -1) {
            System.out.println("=========== A T E N Ç Ã O ================");
            System.out.println("QUARTO INVÁLIDO — verifique o número e tente novamente");
            System.out.println("==========================================");
            System.out.println(" --- Pressione ENTER para continuar --- ");
            teclado.nextLine();
            teclado.nextLine();
            opcao = -1;
        }
    }
} // Fechamento solicitar dados
    
    // ═══════════════════════════════════════════════════════
    // EXECUÇÃO PRINCIPAL 
    // ═══════════════════════════════════════════════════════

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        do {
            controller.atualizarLista();
            quartos = controller.getQuartos();
            cabecalhoInicio();
            exibirQuartos();
            exibirMenu();

            System.out.print("Selecione a opção: ");
            try {
                opcao = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("=========== A T E N Ç Ã O ================");
                System.out.println("ERRO: Digite apenas números! ");
                System.out.println("==========================================");
                System.out.println(" --- Pressione ENTER para continuar --- ");
                teclado.next();
                teclado.nextLine();
                teclado.nextLine();
                opcao = -1;
            }

            solicitarDados();
            
            opcao = controller.validarTrava(opcao, posicao);

            switch (opcao) {
                case 1:
                    controller.realizarCheckout(posicao, numQuarto);
                    break;
                case 2:
                    controller.arrumacaoQuarto(posicao, numQuarto);
                    break;
                case 3:
                    controller.iniciarLimpeza(posicao, numQuarto);
                    break;
                case 4:
                    controller.realizarInspecao(posicao, numQuarto);
                    break;
                case 5:
                    controller.realizarCheckin(posicao, numQuarto);
                    break;
                case 6:
                    controller.iniciarRevisao(posicao, numQuarto);
                    break;
                case 7:
                    controller.manutencaoTec(posicao, numQuarto);
                    break;
                case 8:
                    controller.manutencaoGer(posicao, numQuarto);
                    break;
                case 9:
                    controller.abrirMenuRelatorios();
                    break;
                case 0:
                    System.out.println("SISTEMA ENCERRADO");
                    break;
            }
        } while (opcao != 0);

    }

}
