import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String descricaoa;
        Double tipoa;
        float porcentagemdc;

        System.out.println("Como você descreva o artefato: ");
             descricaoa = teclado.nextLine();
          System.out.println("O tipo do artefato do tipo ?\n (1)Arma ou tecnologia similar de meta? \n (2)Ferramentas ou utensílios domésticos. \n (3)Artefato Desconhecido ");
             tipoa = teclado.nextDouble();
             System.out.println("Qual é a porcentagem de carbono-14");
                porcentagemdc = teclado.nextFloat();

                System.out.println("O artefato é : " + descricaoa);

                if( tipoa == 1){
                    System.out.println("E uma Arma ou tecnologia similar de metal");
                } 
                if ( tipoa == 2 ){
                    System.out.println("É Ferramentas ou utensílios domésticos");   
                }
                if (tipoa == 3){
                    System.out.println("É um artefato desconhecido");
                }

                if (porcentagemdc <= 9 && tipoa == 3){
                System.out.println("Pré-Historia \n Doutora Braddock");
                } if ( porcentagemdc <= 10 && tipoa == 2){
                    System.out.println("Pré-Historia \n Doutora Elise");
                } if (porcentagemdc <=10 && tipoa == 1){
                    System.out.println("Pré-Historia \n Doutor Arno");
                } if (porcentagemdc ==10 && tipoa == 3){
                    System.out.println("Idade Ferro \n Doutor Berg");
                }if (porcentagemdc == 10  && tipoa == 2){
                    System.out.println("Idade Ferro \n Doutor Eivor");
                } if (porcentagemdc == 10 && tipoa ==1){
                    System.out.println("Idade Ferro \n Doutor Alexios");
                }if (porcentagemdc == 25 && tipoa == 3){
                    System.out.println("Idade Bronze \n Doutor Cormac");
                }if (porcentagemdc ==25 && tipoa == 2){
                    System.out.println("Idade Bronze \n Doutor Altlair");
                } if(porcentagemdc == 25 && tipoa == 1){
                    System.out.println("Idade Bronze \n DoutorAlexios");
                }if(porcentagemdc ==50 && tipoa == 3){
                    System.out.println("Idade Media \n doutor rodrigo");
                }if (porcentagemdc == 50 && tipoa == 2){
                    System.out.println("Idade Metedia \n doutor Ezio");
                } if (porcentagemdc == 50 && tipoa == 1){
                    System.out.println("Idade Media \n Doutor Kenway");
                }if(porcentagemdc ==100 && tipoa ==3){
                    System.out.println("Idade Moderna \n Doutor Cesare Borgia");
                }if (porcentagemdc ==100 && tipoa == 2){
                    System.out.println("Idade Moderna \n Doutor Edward");
                } if(porcentagemdc ==100 && tipoa == 1){
                    System.out.println("Idade Moderna \n Doutora Kassandra");
                } 
                




        
    }
}
