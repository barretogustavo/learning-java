package trabalhopoo;

import java.util.Scanner;

public class Lancha extends VeiculosMaritimos {
    
    //ATRIBUTOS
    String tipoCasco;
    boolean banheiro;
    
    //MÉTODOS DE ACESSO

    //CONSTRUCT
    public Lancha(String tipoCasco, boolean banheiro, String marca, String modelo, String cor,String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco, float alturaCalado) {
        super(marca, modelo, cor, identificacao, numeroPassageiros, velocidadeMaxima, preco, alturaCalado);
        this.tipoCasco = tipoCasco;
        this.banheiro = banheiro;
    }    
    
        //TIPO DO CASCO
    public String getTipoCasco(){
        return this.tipoCasco;
    }
    public void setTipoCasco(String t){
        this.tipoCasco = t;
    }

        //BANHEIRO
    public boolean getBanheiro(){
        return this.banheiro;
    }
    public void setBanheiro(boolean b){
        this.banheiro = b;
    }
    
    
    
    //Métodos públicos
    public void entradaDados(){
    Scanner cadastro = new Scanner(System.in);
    System.out.println("********* Digite as características da Lancha *********");
        super.entradaDados();
        System.out.print("Tipo do Casco.............: ");
        setTipoCasco(cadastro.nextLine());
        System.out.print("Banheiro................: ");
        setBanheiro(Boolean.parseBoolean(cadastro.nextLine()));
    }
    
    public void imprimir(){
        System.out.println("\n*********** Características da Lancha ***********");
        super.imprimir();
        System.out.println("Tipo de Casco -------------> " + getTipoCasco());
        System.out.println("Banheiro ------------------> " + getBanheiro());
    }
    
}
