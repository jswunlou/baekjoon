import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2738_solved {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] A = new int[N][M];
        for(int i = 0; i < N; i++){
            input = br.readLine().split(" ");
            for(int j = 0; j < M; j++) A[i][j] = Integer.parseInt(input[j]);
        }

        int[][] B = new int[N][M];
        for(int i = 0; i < N; i++){
            input = br.readLine().split(" ");
            for(int j = 0; j < M; j++) B[i][j] = Integer.parseInt(input[j]);
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) bw.write(String.valueOf(A[i][j]+B[i][j])+" ");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
