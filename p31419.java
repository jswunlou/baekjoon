    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;
    import java.util.ArrayList;
    import java.util.List;

    public class p31419 {
        //print arrays
        private static void printArrays(List<List<Integer>> arrays){
            for(List<Integer> array : arrays){
                System.out.println("array = " + array);
            }
        }

        //make arrays
        // in: N, a1 ,a2 ...
        // out: [arrays]
        private static List<List<Integer>> makeArrays(int N, List<Integer> list) {
            List<List<Integer>> arrays = new ArrayList<>();
            generateAllCombinations(N, list, 0, arrays);
            return arrays;
        }

        private static void generateAllCombinations(int N, List<Integer> list, int index, List<List<Integer>> arrays) {
            if (index == list.size()) {
                // 값의 개수를 추적할 리스트 초기화
                List<Integer> numCountList = new ArrayList<>();
                for (int i = 0; i <= N; i++) {
                    numCountList.add(0);
                }

                // 값 개수 계산
                for (Integer value : list) {
                    if (value > N) {
                        // 값이 N보다 큰 경우, 잘못된 상태로 처리 (예외 방지)
                        return;
                    }
                    numCountList.set(value, numCountList.get(value) + 1);
                }

                // 조건 검사
                boolean isOkay = true;
                for (int i = 0; i <= N; i++) {
                    if (numCountList.get(i) > i) {
                        isOkay = false;
                        break;
                    }
                }

                if (isOkay) {
                    arrays.add(new ArrayList<>(list)); // 현재 조합을 결과 리스트에 추가
                }
                return;
            }

            if (list.get(index) == 0) {
                for (int i = 1; i <= N; i++) {
                    list.set(index, i); // 현재 위치에 값을 설정
                    generateAllCombinations(N, list, index + 1, arrays); // 다음 위치 처리
                    list.set(index, 0); // 상태 복원 (백트래킹)
                }
            } else {
                generateAllCombinations(N, list, index + 1, arrays); // 0이 아닌 경우 그대로 진행
            }
        }



        //check arrays
        // in: [arrays]
        // out: [arrays]
    //    public static List<List<Integer>> checkArray(int N, List<List<Integer>> arrays){
    //        List<List<Integer>> checkedArrays = new ArrayList<>();
    //        for(List<Integer> array : arrays){
    //            List<Integer> numCountList = new ArrayList<>();
    //            for(int i = 0; i <= N; i++){
    //                numCountList.add(0);
    //            }
    //
    //            for(Integer value : array) {
    //                numCountList.set(value, numCountList.get(value) + 1);
    //            }
    //
    //            boolean isOkay = true;
    //            for(int i = 0; i <= N; i++){
    //                if(numCountList.get(i) > i){
    //                    isOkay = false;
    //                    break;
    //                }
    //            }
    //
    //            if(isOkay){
    //                checkedArrays.add(array);
    //            }
    //        }
    //
    //        return checkedArrays;
    //    }

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());

            List<Integer> list = new ArrayList<>();
            String[] strArr = br.readLine().split(" ");

            for(int i = 0; i < N; i++){
                list.add(Integer.parseInt(strArr[i]));
            }

            //printArrays(makeArrays(N, list));
            int num = makeArrays(N, list).size();
            bw.write(String.valueOf(num % 998_244_353L));
            bw.flush();
            bw.close();


        //out: num of [arrays] % 998 244 353
        }
    }
