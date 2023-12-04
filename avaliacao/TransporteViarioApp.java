package avaliacao;

public class TransporteViarioApp {
    public static void main(String[] args) {
        // Exemplo de utilização das classes
        Veiculo veiculo = new Veiculo();
        veiculo.placa = "ABC123";
        veiculo.modelo = "Ônibus";
        veiculo.capacidade = 50;

        Motorista motorista = new Motorista();
        motorista.nome = "João";
        motorista.carteiraMotorista = "123456";

        Cobrador cobrador = new Cobrador();
        cobrador.nome = "Maria";

        Passageiro passageiro = new Passageiro();
        passageiro.nome = "Carlos";
        passageiro.tipoCartao = "Estudantil";

        PontoParada pontoParada = new PontoParada();
        pontoParada.nome = "Parada 1";
        pontoParada.localizacao = "Latitude: xxx, Longitude: xxx";

        Jornada jornada = new Jornada();
        jornada.veiculo = veiculo;
        jornada.motorista = motorista;
        jornada.cobrador = cobrador;
        jornada.dataInicio = "2023-01-01 08:00:00";

        EmbarqueDesembarque embarqueDesembarque = new EmbarqueDesembarque();
        embarqueDesembarque.passageiro = passageiro;
        embarqueDesembarque.cartao = "123456789";
        embarqueDesembarque.ponto = pontoParada;
        embarqueDesembarque.dataHora = "2023-01-01 09:00:00";

        Trecho trecho = new Trecho();
        trecho.origem = pontoParada;
        trecho.destino = pontoParada;
        trecho.intervaloEstimado = 60;

        Trajeto trajeto = new Trajeto();
        trajeto.trechos.add(trecho);
    }   
}
