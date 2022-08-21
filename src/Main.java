package MyProject.src;

public class Main {
    public static void main(String[] args) {

    Transport bmw = new Transport();

    bmw.setValues(250.5f, 2000, "black", new byte[] {0, 0, 0});
    String res1 = bmw.getValues();
    System.out.println(res1);
    //bmw.speed = 250.5f;
    //bmw.weight = 2000;
   //bmw.colour = "black";
    //bmw.coordinate = new byte[] {0, 0, 0};

    Transport mers = new Transport();
    mers.speed = 300.4f;
    mers.weight = 1800;
    mers.colour = "red";
    mers.coordinate = new byte[] {100, 0, 100};

        String res2 = mers.getValues();
        System.out.println(res2);
    }
}