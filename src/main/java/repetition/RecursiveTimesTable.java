package repetition;

public class RecursiveTimesTable {
    public static void main(String[] args) {
        System.out.println(count(2,1));
    }

    public static String count(int tab, int count){
        String result = ""+tab+" x "+count+" = "+(tab*count);

        if(count==10){
            return result;
        }else{
            System.out.println(tab+" x "+count+" = "+(tab*count));
            return count(tab,count+1);
        }
    }
}
