import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int test = Integer.parseInt(line);
        if((test % 2 == 0) && (test!= 0)){
             System.out.println("偶数です。");
        }else{
              System.out.println("奇数です。");
        }
       
    }
}
