public class Personaje {
 private String nom;
 private int dinero;
 public Personaje(String nom, int dinero) {
 this.nom = nom;
 this.dinero = 900;
 }
 public void mostrarInfo() {
 System.out.println(nom + " tiene " + dinero + "$.");
 }

 public void gastarDinero(){
    int gasto = 800;
   System.out.println(nom + " se gasta " + gasto + "$.");
 
 }

 public static void main(String[] args) {
 Personaje jugador = new Personaje("Andrea", 500);
 jugador.mostrarInfo();
 jugador.gastarDinero();

 }

