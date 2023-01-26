package ejercito;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejercito {
    /*
    * Aplica lo estudiado para realizar una nueva clase llamada Ejercito, que contenga un número de soldados N. El constructor debe inicializar la estructura SET (no hay soldados duplicados y el orden no importa). Debe haber métodos para:
1. Saber el número de soldados que hay.
2. Alistar a un solado.
3. Saber si el ejército no tiene soldados.
4. Saber si un soldado está en el ejército.
4. Sacar todos los soldados, en forma de ArrayList.
5. Desmatricular a un soldado del ejército.
     */

    private Set<Soldado> soldados;

    public Ejercito(int numeroSoldados) {
        this.soldados = new HashSet<Soldado>(numeroSoldados);
    }

    public int getNumeroSoldados() {
        return soldados.size();
    }

    public void enlistarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public boolean noHaySoldados() {
        return soldados.isEmpty();
    }

    public boolean soldadoEstaEnEjercito(Soldado soldado) {
        return soldados.contains(soldado);
    }

    public ArrayList<Soldado> sacarSoldados() {
        return new ArrayList<Soldado>(soldados);
    }

    public void desmatricularSoldado(Soldado soldado) {
        soldados.remove(soldado);
    }

    public Set<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(Set<Soldado> soldados) {
        this.soldados = soldados;
    }


}