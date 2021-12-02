package trabalhopoo;

import java.util.Scanner;

public class JetSki extends VeiculosMaritimos{
    //Atributos
    boolean reboque;
    String tipoCasco;
    
    //Métodos de Acesso

    //CONSTRUCT
    public JetSki(boolean reboque, String tipoCasco, String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco, float alturaCalado) {
        super(marca, modelo, cor, identificacao, numeroPassageiros, velocidadeMaxima, preco, alturaCalado);
        this.reboque = reboque;
        this.tipoCasco = tipoCasco;
    }    
       
    
    public boolean getReboque() {
        return reboque;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setReboque(boolean re) {
        this.reboque = re;
    }

    public void setTipoCasco(String tc) {
        this.tipoCasco = tc;
    }
    
    
    //Métodos públicos
    @Override
    public void entradaDados(){
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("********* Digite as características do JetSki *********");
        super.entradaDados();
        System.out.print("Tipo do Casco.............: ");
        setTipoCasco(cadastro.nextLine());
        System.out.print("Reboque ..................: ");
        setReboque(Boolean.parseBoolean(cadastro.nextLine()));
    }
    
    public void imprimir(){
        System.out.println("\n*********** Características do JetSki ***********");
        super.imprimir();
        System.out.println("Tipo do casco -------------> " + getTipoCasco());
        System.out.println("Reboque -------------------> " + getReboque());
    }
}