public class Main {
    public static void main(String[] args) {

        //Criando objetos
        Pessoa pe = new Pessoa();
        Atleta at = new Atleta();

        //Setando valores
        at.setNome("Maranhão");
        at.setAltura(1.85);
        at.setPeso(80);
        at.setEsporte("Futebol");

        pe.setNome("Pedro");
        pe.setAltura(1.73);
        pe.setPeso(72);

        pe.setNome("Renan");
        pe.setAltura(1.70);
        pe.setPeso(65);

        //Calculando IMC
        at.IMC();
        pe.IMC();

        //mostrando os dados
        pe.mostrasrDados();
        at.mostrasrDados();

    }
}