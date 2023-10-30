import java.util.Scanner;


public class Modul3Practice {
    private double value;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Modul3Practice obj = new Modul3Practice();

        System.out.println("Yard converter to m, cm, feet, & miles");
        System.out.println("1. Yard to M");
        System.out.println("2. Yard to CM");
        System.out.println("3. Yard to Feet");
        System.out.println("4. Yard to Miles");

        System.out.print("pilih menu : ");
        String menu = input.nextLine();

        System.out.println("Masukkan Yard : ");
        double yard = input.nextDouble();

        obj.setValue(yard,menu);

        System.out.println("Hasil Konversi : "+obj.getValue());

    }

    public double setValue(double value, String params){
        Converter obj = new Converter();

        if (params.equals("1")){
            this.value = obj.setValueToM(value);
        } else if(params.equals("2")){
            this.value = obj.setValueToCM(value);
        } else if (params.equals("3")) {
            this.value = obj.setValueToFeet(value);
        } else if(params.equals("4")){
            this.value = obj.setvalueToMiles(value);
        }
        return this.value;
    }

    public double getValue(){
        return value;
    }
}
