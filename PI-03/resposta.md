1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

Em Java, uma exceção é um evento que ocorre durante a execução de um programa e que interrompe o fluxo normal de instruções. As exceções são usadas para lidar com situações imprevistas, como erros de execução, falhas na alocação de recursos, entre outros. O propósito das exceções é fornecer um mecanismo para tratar esses eventos de forma apropriada, melhorando a robustez e a capacidade de recuperação do software.

2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.

Em Java, as exceções são divididas em duas categorias: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).

Exceções verificadas (Checked Exceptions): São exceções que o compilador exige que sejam tratadas explicitamente no código, seja através de um bloco try-catch ou através da declaração de throws no método. Exemplos incluem IOException e SQLException.
java
Copy code
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploCheckedException {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            // Operações de leitura aqui
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
Exceções não verificadas (Unchecked Exceptions): São exceções que o compilador não exige tratamento explícito. Incluem RuntimeException e suas subclasses. Exemplos incluem NullPointerException e ArrayIndexOutOfBoundsException.
java
Copy code
public class ExemploUncheckedException {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(array[10]); // Isso lançará ArrayIndexOutOfBoundsException
    }
}
3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?

Para lidar com exceções em Java, você pode usar as palavras-chave try, catch, finally, e throw. Algumas práticas comuns incluem:

try-catch: Usado para envolver o código que pode gerar exceções, e capturar e tratar essas exceções.
java
Copy code
try {
    // Código que pode gerar uma exceção
} catch (TipoDeExcecao e) {
    // Tratamento da exceção
} finally {
    // Bloco opcional que sempre é executado, independentemente de ocorrer ou não uma exceção
}
throws: Utilizado na declaração de métodos para indicar que o método pode lançar determinadas exceções, mas o tratamento é feito em algum lugar chamando o método.
java
Copy code
public void meuMetodo() throws MinhaExcecao {
    // Código que pode lançar MinhaExcecao
}
throw: Usado para explicitamente lançar uma exceção em um ponto específico do código.
java
Copy code
if (condicao) {
    throw new MinhaExcecao("Mensagem de erro");
}
4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

O bloco try-catch é utilizado para envolver um bloco de código onde exceções podem ocorrer. O bloco try contém o código que pode gerar exceções, e o bloco catch contém o código que será executado se uma exceção específica ocorrer.

É importante usar o try-catch ao lidar com exceções porque permite que o programa continue executando mesmo após a ocorrência de um erro. Isso melhora a robustez do software, evitando interrupções inesperadas...

java
Copy code
try {
    // Código que pode gerar uma exceção
} catch (TipoDeExcecao e) {
    // Tratamento da exceção
}
5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.

É apropriado criar exceções personalizadas quando você precisa representar situações específicas no seu domínio de aplicação que não são bem representadas por exceções padrão do Java. Para criar uma exceção personalizada, você deve criar uma classe que estende a classe Exception (ou suas subclasses).

Exemplo:

java
Copy code
public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String mensagem) {
        super(mensagem);
    }
}

public class Calculadora {
    public int dividirInteiros(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }

    public float dividirFloats(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0.0f) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }
}