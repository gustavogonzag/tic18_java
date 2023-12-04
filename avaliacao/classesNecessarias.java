package avaliacao;

import java.util.ArrayList;
import java.util.List;

// Classes
class Veiculo {
    String placa;
    String modelo;
    int capacidade;
}

class Motorista {
    String nome;
    String carteiraMotorista;
}

class Cobrador {
    String nome;
}

class Passageiro {
    String nome;
    String tipoCartao;
}

class PontoParada {
    String nome;
    String localizacao;
}

class Jornada {
    Veiculo veiculo;
    Motorista motorista;
    Cobrador cobrador; // Pode ser nulo
    String dataInicio;
    String dataFim; // Pode ser nulo
}

class Trajeto {
    List<Trecho> trechos = new ArrayList<>();
}

class Trecho {
    PontoParada origem;
    PontoParada destino;
    int intervaloEstimado;
}

class Checkpoint {
    String dataHora;
}

class EmbarqueDesembarque {
    Passageiro passageiro;
    String cartao;
    PontoParada ponto;
    String dataHora;
}
