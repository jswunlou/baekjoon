import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Objects;

public class p25206_solved {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Double> gradeTable = new HashMap<>();
        gradeTable.put("A+", 4.5);
        gradeTable.put("A0", 4.0);
        gradeTable.put("B+", 3.5);
        gradeTable.put("B0", 3.0);
        gradeTable.put("C+", 2.5);
        gradeTable.put("C0", 2.0);
        gradeTable.put("D+", 1.5);
        gradeTable.put("D0", 1.0);
        gradeTable.put("F", 0.0);

        double hakjumSum = 0.0;
        double MajorSum = 0.0;
        for(int i = 0; i < 20; i++){
            String[] input = br.readLine().split(" ");
            double hakjum = Double.parseDouble(input[1]);
            String grade = input[2];

            if(Objects.equals(grade, "P")) continue;
            hakjumSum += hakjum;
            MajorSum += hakjum*gradeTable.get(grade);
        }
        MajorSum /= hakjumSum;
        bw.write(String.valueOf(MajorSum));
        bw.flush();
        bw.close();
    }
}
