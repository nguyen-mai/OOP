package Week4;

public class Week4 {
    /**
     * 
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public int max2Int(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    /**
     * 
     * @param arr
     * @return min of array $arr
     */
    public int minArray(int[] arr) {
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public String calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) return "Không hợp lệ";
        else {
            double result = weight/(Math.pow(height, 2));
            double BMI = (double) Math.round(result * 100) / 100;
            System.out.println("BMI của bạn là: " + BMI);
            if (BMI < 18.5) return "Thiếu cân";
            else if (18.5 <= BMI && BMI <= 22.9) return "Bình thường";
            else if (23 <= BMI && BMI <= 24.9) return "Thừa cân";
            else return "Béo phì";
        }
    }
}