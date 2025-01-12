import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p27866_solved {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] Str = br.readLine().split("");
        int i = Integer.parseInt(br.readLine());

        bw.write(Str[i-1]);
        bw.flush();
        bw.close();
    }
}
