public class UnidadesDeVelocidade {
    public static void main(String[] arg) {
        double kph = 0.0, mps;

        System.out.print("K/H \tM/S");
        while (kph <= 50.0) {
            mps = kph * 0.2778;
            System.out.println(kph + "\t" + mps);
            kph+=0.5;
        }
        
    }
}
