package clientebanco;

import java.util.List;

//los nombres de las clases siempre con mayuscula
public class CuentaCorriente {

    Cliente titular;
    private int numCuenta;
    private double saldo = 0;

    public CuentaCorriente(Cliente titular, int numCuenta, double saldo) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular, int numCuenta) {
        this.titular = titular;
        this.numCuenta = numCuenta;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setnumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getnumCuenta() {
        return this.numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

//metodos para depositar y extraer monto de tipo double
    public double depositar(double monto) {
        saldo += monto;
        return saldo;
    }

    public double extraer(double monto) {
        saldo -= monto;
        return saldo;
    }

//this.titular.toString() para imprimir lo de la clase cliente (lo llamo con titular)
    public String toString() {
        return this.titular.toString() + "numero de cuenta: " + this.numCuenta + "saldo: " + this.saldo;
    }

//o es un nombre y siempre tiene qe ser object
    public boolean equals(Object o) {
        if (o == null || !(o instanceof CuentaCorriente)) {
            return false;
        CuentaCorriente cc = (CuentaCorriente)o;//cc es CuentaCorriente
        if (cc.getnumCuenta()==this.numCuenta)
            return true;
        }else {
            return false;
        }
    }
}
