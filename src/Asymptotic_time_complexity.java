public class Asymptotic_time_complexity {
    public static int cal(int n){
        int sum = 0;
        int i = 1;
        for(; i<=n; ++i){
            sum = sum + i;
        }
        return sum;
    }



//这段代码三四行的执行次数为1，五六行的执行次数为n，所以总的时间复杂度为O(n)

    public static int cal1(int n){
        int sum = 0;
        int i = 1;
        int j = 1;
        for(; i<=n; ++i){
            j=1;
            for(; j<=n; ++j){
                sum = sum + i*j;
            }
        }
        return sum;
    }
//    这段代码的16,17,18行执行1次，20到22行执行n*n次，所以总的时间复杂度为O(n*n)
    int cal3(int n){
        int sum_1 = 0;
        int p = 1;
        for(; p<=100; ++p){
            sum_1 = sum_1 + p;
        }

        int sum_2 = 0;
        int q = 1;
        for(; q <= n; ++q){
            sum_2 = sum_2 + q;
        }

        int sum_3 = 0;
        int i = 1;
        int j = 1;
        for(; i <= n; ++i){
            j = 1;
            for(; j <= n; ++j){
                sum_3 = sum_3 + i*j;
            }
        }
        return sum_1 + sum_2 + sum_3;
    }

//    这个函数包含三段代码，第一段代码因为执行次数是固定的100次，所以时间复杂度为O(1),第二段代码为O(n),第三段代码为O(n*n),所以总的时间复杂度为第三段代码时间复杂度


    int cal4(int n){
        int sum = 0;
        int i = 1;
        for(; i <= n; ++i){
            sum = sum + fn(i);
        }
        return sum;
    }
    int fn(int n){
        int sum = 0;
        int j =1;
        for(; j <= n; ++j){
            sum = sum + j;
        }
        return sum;
    }

//    因为cal4循环中调用了fn，并且二者的时间复杂度都是O(n)，所以cal4的最终时间复杂度为O(n*n)

//    i = 1;
//    while(i <= n){
//        i = i * 2;
//    }

    public static void main(String[] args) {
//        cal(10);
//        System.out.print(cal(10));
        cal1(10);
        System.out.print(cal1(10));
    }

}