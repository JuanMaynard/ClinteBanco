package clientebanco;

public class CuentaAhorro extends CuentaCorriente {

    private double interes = 2.5;

    public CuentaAhorro(Cliente titular, int numCuenta, double saldo) {
        super(titular, numCuenta, saldo);
    }

    

}
