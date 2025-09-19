// src/Atleta.java
public class Atleta extends Pessoa {
    private String esporte;

    @Override
    public double IMC(){
        double IMC = getPeso() / ( getAltura() * getAltura() );
        IMC = IMC * 0.95;
        return IMC;
    }

    @Override
    void mostrasrDados(){
        System.out.println("Nome do atleta: " + getNome());
        System.out.println("Peso do atleta: " + getPeso());
        System.out.println("Altura do atleta: " + getAltura());
        System.out.println("IMC doatleta (ajustado -5%): " + IMC());
        System.out.println("Esporte Praticado: " + esporte);
        System.out.println("Obs: O IMC do atleta é ajustado por conta do alto rendimento físico, sendo 5% menor que o cálculo padrão.");
        System.out.println("----");
    }

    public String getEsporte() {
        return esporte;
    }
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
}
