package trabalhopoo;

import java.util.Scanner;

public class VeiculosMaritimos {
    //ATRIBUTOS
    String marca, modelo, cor, identificacao;
    int numeroPassageiros, velocidadeMaxima; 
    float preco, alturaCalado;
    
    //Métodos de Acesso
    
    //CONSTRUCT
    public VeiculosMaritimos(String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco, float alturaCalado) {        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.alturaCalado = alturaCalado;
    }
    
    /*public VeiculosMaritimos(String marca, String modelo, String identificacao){
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
    }
    public VeiculosMaritimos(String identificacao, int numeroPassageiros){
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
    }
    public VeiculosMaritimos(String modelo){
        this.modelo = modelo;
    }
    public VeiculosMaritimos(String identificacao, float preco){
        this.identificacao = identificacao;
        this.preco = preco;
    }
    public VeiculosMaritimos(String cor, String modelo, float preco){
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
    }
    public VeiculosMaritimos(int numeroPassageiros, String identificacao,int velocidadeMaxima){
        this.numeroPassageiros = numeroPassageiros;
        this.identificacao = identificacao;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public VeiculosMaritimos(int numeroPassageiros, int velocidadeMaxima){
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public VeiculosMaritimos(float alturaCalado){
        this.alturaCalado = alturaCalado;
    }
    public VeiculosMaritimos(String marca, float preco, String identificacao){
        this.marca = marca;
        this.preco = preco;
        this.identificacao = identificacao;
    }*/
    
    
        //MARCA
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    
        //MODELO
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String mo){
        this.modelo = mo;
    }
        
        //COR
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
        //NUMERO DE PASSAGEIROS
    public int getNumeroPassageiros(){
        return this.numeroPassageiros;
    }
    public void setNumeroPassageiros(int np){
        this.numeroPassageiros = np;
    }
    
        //PREÇO
    public float getPreco(){
        return this.preco;                
    }
    public void setPreco(float p){
        this.preco = p;
    }
    
        //VELOCIDADE MÁXIMA
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int v){
        this.velocidadeMaxima = v;
    }
     
        //ALTURA DO CALADO
    public float getAlturaCalado(){
        return this.alturaCalado;
    }
    public void setAlturaCalado(float a){
        this.alturaCalado = a;
    }
    
        //IDENTIFICAÇÃO
    public String getIdentificacao(){
        return this.identificacao;
    }
    public void setIdentificacao(String i){
        this.identificacao = i;
    }
    
    //MÉTODOS PUBLICOS
    public void entradaDados(){
        Scanner cadastro = new Scanner(System.in);
        
        System.out.print("Marca.....................: ");
        setMarca(cadastro.nextLine());
        System.out.print("Modelo....................: ");
        setModelo(cadastro.nextLine());
        System.out.print("Cor.......................: ");
        setCor(cadastro.nextLine());
        System.out.print("Número de Passageiros.....: ");
        setNumeroPassageiros(Integer.parseInt(cadastro.nextLine()));
        System.out.print("Preço.....................: ");
        setPreco(Float.parseFloat(cadastro.nextLine()));
        System.out.print("Velocidade Máxima.........: ");
        setVelocidadeMaxima(Integer.parseInt(cadastro.nextLine()));
        System.out.print("Altura do Calado..........: ");
        setAlturaCalado(Float.parseFloat(cadastro.nextLine()));
        System.out.print("Identificação.............: ");
        setIdentificacao(cadastro.nextLine());
    }
    
    public void imprimir(){
        System.out.println("Marca ---------------------> " + getMarca());
        System.out.println("Modelo --------------------> " + getModelo());
        System.out.println("Cor -----------------------> " + getCor());
        System.out.println("Número de Passageiros -----> " + getNumeroPassageiros());
        System.out.println("Preço ---------------------> " + getPreco());
        System.out.println("Velocidade Máxima ---------> " + getVelocidadeMaxima());
        System.out.println("Altura do Calado ----------> " + getAlturaCalado());
        System.out.println("Identificação -------------> " + getIdentificacao());
    }
}
