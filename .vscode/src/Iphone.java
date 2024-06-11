import InterfacesIphone.Internet;
import InterfacesIphone.Musica;
import InterfacesIphone.Telefone;
import java.util.Scanner;

public class Iphone implements Telefone, Internet, Musica {
	 // Telefone
    @Override
    public void ligar() {
        System.out.println("Fazendo chamada.");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }
    @Override
    public void correioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Música
    @Override
    public void tocar() {
        System.out.println("Reproduzindo Música");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando Música.");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }

    // Internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina.");
    }
    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }
    
    
    public static void main(String[] args) throws Exception {
        
    	   Scanner scanner = new Scanner(System.in);
           Iphone iphone = new Iphone();
           int opcao;       
           System.out.println("BEM VINDO!");
           
           do {
               System.out.println("MENU:");
               System.out.println( "1. Telefone "
                       + "2. Música "
                       + "3. Internet "
                       + "0. Encerrar ");
               System.out.print("Selecione uma das opções. ");
               opcao = scanner.nextInt();
               
               switch (opcao) {
               case 1:
                   System.out.print("1. Ligar. " +
                           "2. Atender. "
                           + "3. Correio de Voz. "
                           + "Selecione uma das opções: ");
                   opcao = scanner.nextInt();
                   
                   if (opcao == 1) {
                       iphone.ligar();
                       System.out.println(" ");
                       System.out.println("Ligação efetuada com sucesso.");
                      

                   } else if (opcao == 2) {
                       iphone.atender();                       
                       System.out.println(" ");
                       System.out.println("Chamda atendida.");
                       

                   } else if (opcao == 3) {
                       iphone.correioVoz();                       
                       System.out.println(" ");
                       System.out.println("Correio de voz encerrado.");
                       
                   } else {
                       System.out.print("ERRO! "
                               + "Selecione um numero entre 1 e 3");
                       
                   }
                   break;

               case 2:
                   System.out.print("1. Tocar Música. " +
                           "2. Pausar Música. "
                           + "3. Selecionar Música. "
                           + "Selecione uma das opções: ");
                   opcao = scanner.nextInt();
                   
                   if (opcao == 1) {
                       iphone.tocar();                       
                       System.out.println("Tocando");

                   } else if (opcao == 2) {
                       iphone.pausar();                       
                       System.out.println(" ");
                       System.out.println("Música Pausada.");
                       
                   } else if (opcao == 3) {
                       iphone.selecionarMusica();                       
                       System.out.println(" ");
                       System.out.println("Música escolhida com sucesso.");
                       
                   } else {
                       System.out.print("ERRO! "
                               + "Selecione um numero entre 1 e 3");
                    }
                   break;

               case 3:
                   System.out.print("1. Página inicial. " +
                           "2. Nova aba. "
                           + "3. Atualizar pagina. "
                           + "Selecione uma das opções: ");
                   opcao = scanner.nextInt();
                   
                   if (opcao == 1) {
                       iphone.exibirPagina();                       
                       System.out.println(" ");
                       System.out.println("Exibindo página.");
                     
                   } else if (opcao == 2) {
                       iphone.pausar();                       
                       System.out.println(" ");
                       System.out.println("Abrindo nova aba.");
                    
                   } else if (opcao == 3) {
                       iphone.selecionarMusica();                       
                       System.out.println(" ");
                       System.out.println("Página atualizada.");
                       
                   } else {
                       System.out.print("ERRO!"
                               + "Selecione um numero entre 1 e 3");
                   }
                   break;

               case 0:
                   System.out.println("DESLIGANDO IPHONE...");
                   
                   System.out.println(" ");
                   System.out.println("!! IPHONE ENCERRADO !!");
                   System.out.println("---------------");
                   break;

               default:
                   System.out.print("ERRO!"
                           + "Selecione um numero entre 1 e 3");
           }
       } while (opcao != 0);
       scanner.close();
   }
}
