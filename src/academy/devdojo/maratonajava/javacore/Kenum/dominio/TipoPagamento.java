package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // abstract serve para falar que esse metodo nao tem um corpo,
    // quem implementa é dentro das enums debito e credito.
    // basicamente é um metodo que foi criado apenas para ser sobrescrito
    public abstract double calcularDesconto(double valor);
}