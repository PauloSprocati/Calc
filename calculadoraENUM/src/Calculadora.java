public enum Calculadora {

    SOMAR {
        @Override
        public double calcular(double primeiroValor, double segundoValor) {
            return primeiroValor + segundoValor;
        }
    },
    SUBTRAIR {
        @Override
        public double calcular(double primeiroValor, double segundoValor) {
            return primeiroValor - segundoValor;
        }
    },
    MULTIPLICAR {
        @Override
        public double calcular(double primeiroValor, double segundoValor) {
            return primeiroValor * segundoValor;
        }
    },
    DIVIDIR {
        @Override
        public double calcular(double primeiroValor, double segundoValor) {
            return primeiroValor / segundoValor;
        }
    };

    public abstract double calcular(double primeiroValor, double segundoValor);

    public static Calculadora from(String operacao) {
        switch (operacao) {
            case "+":
                return SOMAR;
            case "-":
                return SUBTRAIR;
            case "*":
                return MULTIPLICAR;
            case "/":
                return DIVIDIR;
            default:
                return SOMAR;
        }
    }
}
