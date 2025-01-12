import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10807_solved {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] nums = new int[N];
        for(int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for(int num : nums){
            if(num == v) count++;
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
