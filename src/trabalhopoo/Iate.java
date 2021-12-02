package trabalhopoo;

import java.util.Scanner;

public class Iate extends VeiculosMaritimos{
    //Atibutos
    int numeroTripulantes, numeroCabines;
    boolean piscina;

    //Métodos Especiais
    
    //CONSTRUCT
    public Iate(int numeroTripulantes, int numeroCabines, boolean piscina, String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco, float alturaCalado) {
        super(marca, modelo, cor, identificacao, numeroPassageiros, velocidadeMaxima, preco, alturaCalado);
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;
        this.piscina = piscina;
    }
    
    
    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public int getNumeroCabines() {
        return numeroCabines;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setNumeroTripulantes(int tr) {
        this.numeroTripulantes = tr;
    }

    public void setNumeroCabines(int nc) {
        this.numeroCabines = nc;
    }

    public void setPiscina(boolean pis) {
        this.piscina = pis;
    }
    
    //Métodos públicos
    public void entradaDados(){
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("********* Digite as características do Iate *********");
        super.entradaDados();
        System.out.print("Número de tripulantes.............: ");
        setNumeroTripulantes(Integer.parseInt(cadastro.nextLine()));
        System.out.print("Número de cabines.................: ");
        setNumeroCabines(Integer.parseInt(cadastro.nextLine()));
        System.out.print("Piscina...........................: ");
        setPiscina(Boolean.parseBoolean(cadastro.nextLine()));
    }
    
    public void imprimir(){
        System.out.println("\n*********** Características do Iate ***********");
        super.imprimir();
        System.out.println("Número de tripulantes -----> " + getNumeroTripulantes());
        System.out.println("Número de cabines ---------> " + getNumeroCabines());
        System.out.println("Piscina -------------------> " + getPiscina());
    }
    
}
