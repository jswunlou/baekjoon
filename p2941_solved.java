import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class p2941_solved {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> words = new HashMap<>();
        words.put("c=", "c");
        words.put("c-", "c");
        words.put("dz=", "d");
        words.put("d-", "d");
        words.put("lj", "l");
        words.put("nj", "n");
        words.put("s=", "s");
        words.put("z=", "z");

        String[] str = br.readLine().split("");
        int cnt = 0;
        for(int ind = 0; ind < str.length; ind++){
            cnt++;
            if(ind >= str.length-1) continue;
            if(words.containsKey(str[ind]+str[ind+1])) {
                ind++;
                continue;
            }
            if(ind >= str.length-2) continue;
            if(words.containsKey(str[ind]+str[ind+1]+str[ind+2])) {
                ind += 2;
            }
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}
