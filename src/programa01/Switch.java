package programa01;

public class Switch {
    public static void main(String[] args) {
        //instrução switch
        int x=9;
        switch (x){
            case 5:
                System.out.println("o valor é 5");
                break;
            case 9:
                System.out.println("o valor é 9");
                break;

            default:
                System.out.println("[Default] o valor é "+x+"");
                break;
        }
    }
}
