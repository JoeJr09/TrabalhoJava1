public class Main {
    public static void main(String[] args) {

        //Criando objetos
        Pessoa pe = new Pessoa();
        Atleta at = new Atleta();

        //Setando valores
        pe.setNome("Maranhão");
        pe.setAltura(1.85);
        pe.setPeso(80);
        at.setEsporte("Futebol");

        at.setNome("Pedro");
        at.setAltura(1.73);
        at.setPeso(72);

        //Calculando IMC
        at.IMC();
        pe.IMC();

        //mostrando os dados
        pe.mostrasrDados();
        at.mostrasrDados();

    }
}