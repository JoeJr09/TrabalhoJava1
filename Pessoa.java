public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public double IMC(){
        double IMC = peso/(altura*altura);
        return IMC;
    }

    void mostrasrDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + IMC());
        System.out.println("----");
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
