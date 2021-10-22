public class Week10 {
    public static void main(String[] args) {

    }

    public static double pow(double x, int p) {
        double y = x;
        for (int i = 0; i < p; i++) {
            y *= x;
        }
        return y;
    }

    public static double volumeDiffSqCirc(double x, double y, double z, double r) {
        double volCuboid = x*y*z;
        double volSphere = 4 * Math.PI * pow(r, 3) / 3;
        if (volCuboid <= volSphere) {
            return volSphere - volCuboid;
        } else {
            return volCuboid - volSphere;
        }
    }

    public static double distance(double x, double y, double a, double b) {
        double dist = Math.sqrt(pow(a - x, 2) + (pow(b-y, 2)));
        return dist;
    }

    
}
