public class example003 {
    
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AZUL = "\u001B[34m";
    public static final String AMARILLO = "\u001B[33m";
    
    // Código para restablecer el color por defecto
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {
        System.out.println("Mi nombre es...");
        System.out.println(ROJO + "RICARDO DE GRACIA" + RESET);
        System.out.println(VERDE + "RICARDO DE GRACIA" + RESET);
        System.out.println(AZUL + "RICARDO DE GRACIA" + RESET);
        System.out.println(AMARILLO + "RICARDO DE GRACIA" + RESET);
    }
}