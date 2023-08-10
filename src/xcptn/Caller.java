package xcptn;

public class Caller {

    public void numberNotEqual(int i) {
        if (i == 18) {
            System.out.println("you can go and drink");
        } else {
            throw new RTEx("age must be 18+");
        }
    }

    public void priyankaBday(String name) throws CTEx {
        if (name.equals("Priyanka")){
            System.out.println("give her gift");
        }else {
            throw new CTEx("you are at wring place");
        }
    }

    public static void main(String[] args)  {
        Caller caller = new Caller();
      //  caller.numberNotEqual(15);
        try {
            caller.priyankaBday("Ravi");
        }catch (CTEx e){
            e.printStackTrace();
        }
    }
}
