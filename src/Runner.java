public class Runner {

    public static void main(String[] args){
        System.out.println(parrotTrouble(true, 20));
        int[] x = {1, 2, 4, 4, 6};
        System.out.println(noTriples(x));
        System.out.println(firstHalf("helloooo"));
        int[] y = {2, 3, 6};
        System.out.println(sum3(y));
        System.out.println(greenTicket(4,7, 9));
        System.out.println(catDog("catdogcatdogsakhfdjdsfkajsbiksdfiuweh"));
        int[] z = {1, 5, 6, 4, 7};
        System.out.println(pre4(z));
        System.out.println(luckySum(8,13,6));
        System.out.println(equalIsNot("This is not"));
        System.out.println(seriesUp(10));
    }

    //warmup1
    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking == true && hour < 7 || talking == true && hour > 20){
            return true;
        } else {
            return false;
        }
    }

    //warmup2
    public static boolean noTriples(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
                count++;
            }
        }
        if(count == 0){
            return true;
        } else{
            return false;
        }
    }

    //string1
    public static String firstHalf(String str) {
        String newString = "";
        for(int i = 0; i < str.length() / 2; i++){
            newString += str.substring(i, i + 1);
        }
        return newString;
    }

    //array1
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    //logic1
    public static int greenTicket(int a, int b, int c) {
        int result = 0;
        if(a == b && b == c){
            result = 20;
        }
        if(a == b && b != c || b == c && a != c || a == c && a != b){
            result = 10;
        }
        return result;
    }

    //string2
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+       1).equals("t") && str.substring(i-1, i).equals("a") &&str.substring(i-2, i-1).equals("c")){
                catCount++;
            }
        }
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+1).equals("g") && str.substring(i-1, i).equals("o") &&str.substring(i-2, i-1).equals("d")){
                dogCount++;
            }
        }
        if(catCount == dogCount){
            return true;
        } else {
            return false;
        }
    }

    //array2
    public static int[] pre4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && i > 0) {
                int[] foo;
                foo = new int[i];
                for (int j = 0; j < foo.length; j++) {
                    foo[j] = nums[j];
                }
                if (nums[0] != 4)
                    return foo;
            }
        }
        int[] bar;
        bar = new int[0];
        return bar;
    }

    //logic2
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            sum = 0;
            b = 0;
            c = 0;
        }
        if(b == 13){
            sum = a;
            c = 0;
        }
        if(c == 13){
            sum = a + b;
        }
        if(a != 13 && b != 13 && c != 13){
            sum = a + b + c;
        }
        return sum;
    }

    //string3
    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+1).equals("s") && str.substring(i-1, i).equals("i")){
                isCount++;
            }
        }
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+1).equals("t") && str.substring(i-1, i).equals("o") &&str.substring(i-2, i-1).equals("n")){
                notCount++;
            }
        }
        if(isCount == notCount){
            return true;
        } else {
            return false;
        }
    }

    //array
    public static int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int filler = 0;
        for(int j = 1; j <= n; j++){
            for(int i = 1; i <= j; i++){
                result[filler++] = i;
            }
        }
        return result;
    }
}
