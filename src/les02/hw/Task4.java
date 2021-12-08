package les02.hw;

public class Task4 {
    public static byte binNumber1 = 0b1011;
    public static byte binNumber2 = 0b0011;
    public static int binSumm;
    public static int binSubtrac;
    public static int binMultip ;
    public static int binDivis;


    public static void main(String[] args) {

        binSumm = binNumber1 + binNumber2;
        System.out.println("Dec: " + binNumber1 + " + " + binNumber2 + " = " + binSumm );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " + " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binSumm)).replace(' ', '0')
        );

        binSubtrac = binNumber1 - binNumber2;
        System.out.println("Dec: " + binNumber1 + " - " + binNumber2 + " = " + binSubtrac );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " - " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binSubtrac)).replace(' ', '0')
        );

        binMultip = binNumber1 * binNumber2;
        System.out.println("Dec: " + binNumber1 + " * " + binNumber2 + " = " + binMultip );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " * " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binMultip)).replace(' ', '0')
        );

        binDivis = binNumber1 / binNumber2;
        System.out.println("Dec: " + binNumber1 + " / " + binNumber2 + " = " + binDivis );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " / " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binDivis)).replace(' ', '0')
        );

        System.out.println();
        System.out.println( "Логические операции");
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " & " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binNumber1 & binNumber2)).replace(' ', '0')
        );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " | " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binNumber1 | binNumber2)).replace(' ', '0')
        );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " ^ " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binNumber1 ^ binNumber2)).replace(' ', '0')
        );
        System.out.println("Bin: "+ " ~ " +
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(~binNumber1)).replace(' ', '0')
        );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " << " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binNumber1 << binNumber2)).replace(' ', '0')
        );System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " << " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binNumber1 << binNumber2)).replace(' ', '0')
        );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " << " +
                2 +
                " = " +
                String.format("%8s", Integer.toBinaryString(binNumber1 << binNumber2)).replace(' ', '0')
        );
        System.out.println("Bin: "+
                String.format("%8s", Integer.toBinaryString(binNumber1)).replace(' ', '0') +
                " >> " +
                String.format("%8s", Integer.toBinaryString(binNumber2)).replace(' ', '0') +
                " = " +
                String.format("%8s", Integer.toBinaryString(binNumber1 >> binNumber2)).replace(' ', '0')
        );




    }
}
