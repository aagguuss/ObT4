public class Main {
    public static void main(String[] args) {
        var estacion="Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("es verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default: System.out.println("La variable ingresada no es una estacion");
            break;
        }
    }
}