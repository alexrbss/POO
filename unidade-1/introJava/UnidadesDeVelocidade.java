import java.util.Locale;
import java.text.DecimalFormat;

public class UnidadesDeVelocidade {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);

        double kph = 0.0, mps, mph, pps;

        System.out.print("k/h \tm/s\t m/h\t p/s\n");
        while (kph <= 50.0) {
            mps = kph * 0.2778;
            mph = kph * 0.6214;
            pps = kph * 0.44704;
            
            // if (kph < 10) System.out.print("0");
            // System.out.printf("%.2f\t", kph);
            
            // if (mps < 10) System.out.print("0");
            // System.out.printf("%.2f\n", mps);
            
            System.out.print(new DecimalFormat("00.00").format(kph) + "\t");
            System.out.print(new DecimalFormat("00.00").format(mps) + "\t");
            System.out.print(new DecimalFormat("00.00").format(mph) + "\t");
            System.out.println(new DecimalFormat("00.00").format(pps));

            kph+=0.5;
        }
        
    }
}
