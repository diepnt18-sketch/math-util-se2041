package com.thang.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        //code mới khi dua vao phai check mau xanh
        // neu project co san tdd, junit test thì sẽ diễn ra râất nhanh

        //chỉnh sửa code đệ quy - recursion



        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid parameter. n must be between 0 and 20");
        }
        if(n == 0 || n == 1){
            return 1;
        }
            return n *getFactorial(n-1);
        
//        long result = 1;
//        for(int i = 1; i <= n; i++) {
//            result*=i;
//        }
//        return result;

    }
}
