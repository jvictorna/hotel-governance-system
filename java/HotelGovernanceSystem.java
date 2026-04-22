package hotelgovernancesystem;

import java.util.Scanner;

/**
 * Sistema de Governança Hoteleira
 * Controle de status e limpeza de quartos
 * Desenvolvido como projeto prático do curso de ADS
 * 
 * @author João Adorno
 * @version 2.0
 */
public class HotelGovernanceSystem {

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
       int[] statusQuartos = new int[38];
       int[] statusAnterior = new int[38];
       int[] numerosQuartos = new int [38];
       
       int i, opcao, numQuarto, opcaoManut, posicao;
       
       char frigobar, arCondicionado, televisao, cama, enxoval, toalha, banheiro, lixo, cortina;
       char resposta, pausa;
       
        System.out.println("=====================================");
        System.out.println("         SISTEMA DE GOVERNANÇA       ");
        System.out.println("=====================================");
        System.out.println("");
        
        System.out.println("1. Check-out (ACIONAR CAMAREIRA - II) ");
        System.out.println("2. Arrumação solicitada (ACIONAR CAMAREIRA - I) ");
        System.out.println("3. Iniciar limpeza (CAMAREIRA NO QUARTO) ");
        System.out.println("4. Finalizar limpeza (INICIAR CHECK-LIST) ");
        System.out.println("5. Check-in (HÓSPEDE NOVO - NÃO INCOMODAR) ");
        System.out.println("6. Revisão geral (ACIONAR CAMAREIRA - III) ");
        System.out.println("7. Bloquear para manutenção (ACIONAR TÉCNICO) ");
        System.out.println("8. Liberar quarto pós-manutenção ");
        System.out.println("0. Sair ");
        System.out.println("");
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Selecione a opção: ");
        opcao = teclado.nextInt();
        
        switch (opcao) { 
            case 1:
                System.out.println("CHECK-OUT REALIZADO - Aguardando limpeza (II) ");
                break;
            case 2:
                System.out.println("ARRUMAÇÃO PENDENTE - Hóspede solicitou arrumação (I) ");
                break;
            case 3:
                System.out.println("LIMPEZA INICIADA - Aguardando conclusão ");
                break;
            case 4: 
                System.out.println("LIMPEZA FINALIZADA - Iniciar check-list ");
                break;
            case 5:
                System.out.println("CHECK-IN REALIZADO - Quarto ocupado ");
                break; 
            case 6: 
                System.out.println("REVISÃO GERAL NECESSÁRIA - Aguardando limpeza (III) ");
                break;
            case 7: 
                System.out.println("BLOQUEADO PARA MANUTENÇÃO - Aguardando conclusão do técnico ");
                break; 
            case 8: 
                System.out.println("MANUTENÇÃO CONCLUÍDA - Liberar quarto ");
                break;
            case 0: 
                System.out.println("SESSÃO ENCERRADA ");
                break;
            default: 
                System.out.println("OPÇÃO INVÁLIDA - Verifique a opção desejada e tente  novamente ");
        }
       
    }
}