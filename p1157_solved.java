import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1157_solved {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String Str = br.readLine();
        Str = Str.toUpperCase();
        int[] countList = new int['Z' - 'A'+1];

        for(int i = 0; i < Str.length(); i++){
            countList[Str.charAt(i) - 'A']++;
        }

        int max = 0, maxind = 0;
        boolean isDup = false;
        for(int i = 0; i < 'Z'-'A'+1; i++){
            if(countList[i] > max){
                max = countList[i];
                maxind = i;
                isDup = false;
            } else if (countList[i] == max) {
                isDup = true;
            }
        }

        if(isDup) bw.write("?");
        else bw.write(maxind+'A');

        bw.flush();
        bw.close();
    }
}
