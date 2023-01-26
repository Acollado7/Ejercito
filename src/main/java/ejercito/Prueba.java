package ejercito;

public class Prueba {
    public static void main(String[] args) {
        //Probamos los metodos creados en la clase ejercito

        //Creamos un ejercito
        Ejercito ejercito = new Ejercito(10);

        //Creamos un soldado
        Soldado soldado = new Soldado("Pepe", "Perez", "Garcia", 20);
        Soldado soldado2 = new Soldado("Juan", "Perez", "Garcia", 20);
        Soldado soldado3 = new Soldado("Jose", "Perez", "Garcia", 20);
        Soldado soldado4 = new Soldado("Diego", "Perez", "Garcia", 20);
        Soldado soldado5 = new Soldado("Paco", "Perez", "Garcia", 20);
        Soldado soldado6 = new Soldado("Manuel", "Perez", "Garcia", 20);
        Soldado soldado7 = new Soldado("Ramon", "Perez", "Garcia", 20);
        Soldado soldado8 = new Soldado("Luis", "Perez", "Garcia", 20);
        Soldado soldado9 = new Soldado("Antonio", "Perez", "Garcia", 20);
        Soldado soldado10 = new Soldado("Pedro", "Perez", "Garcia", 20);

        //Añadimos el soldado al ejercito
        ejercito.enlistarSoldado(soldado);
        ejercito.enlistarSoldado(soldado2);
        ejercito.enlistarSoldado(soldado3);
        ejercito.enlistarSoldado(soldado4);
        ejercito.enlistarSoldado(soldado5);
        ejercito.enlistarSoldado(soldado6);
        ejercito.enlistarSoldado(soldado7);
        ejercito.enlistarSoldado(soldado8);
        ejercito.enlistarSoldado(soldado9);
        ejercito.enlistarSoldado(soldado10);

        //Sacamos el numero de soldados
        System.out.println("------------------------------------------------------------");
        System.out.println("Miembros del ejercito");
        System.out.println("------------------------------------------------------------");
        System.out.println("Numero de soldados: " + ejercito.getNumeroSoldados());

        //Sacamos los soldados

        System.out.println("Soldados: " + ejercito.getSoldados());

        //Sacamos los soldados en forma de ArrayList
        System.out.println("Soldados en forma de ArrayList: " + ejercito.sacarSoldados());

        //Comprobamos si el ejercito no tiene soldados
        System.out.println("El ejercito no tiene soldados: " + ejercito.noHaySoldados());

        //Comprobamos si un soldado esta en el ejercito
        System.out.println("El soldado esta en el ejercito: " + ejercito.soldadoEstaEnEjercito(soldado));

        //Desmatriculamos a un soldado
        ejercito.desmatricularSoldado(soldado);

        //Comprobamos si un soldado esta en el ejercito
        System.out.println("El soldado esta en el ejercito: " + ejercito.soldadoEstaEnEjercito(soldado));



    }
}
