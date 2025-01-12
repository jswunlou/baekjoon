import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1316_solved {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < N; i++){
            String Str = br.readLine();
            int[] alphaCheck = new int['z' - 'a'+1];
            for(int j = 0; j < 'z' - 'a'; j++) alphaCheck[j] = 0;
            char buffer = 'a';
            boolean isWord = true;

            for(int j = 0; j < Str.length(); j++){
                if(alphaCheck[Str.charAt(j)-'a'] != 0 && buffer != Str.charAt(j)){
                    isWord = false;
                    break;
                }
                alphaCheck[Str.charAt(j)-'a']++;
                buffer = Str.charAt(j);
            }
            if(isWord) result++;
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}
