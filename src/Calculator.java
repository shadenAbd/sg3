public class Calculator {
    public int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public boolean evenOdd(int num) {
        countDigits(num);

        int r=0,odd=0,even=0;
        while(num!=0){
           r=num%10;
           if(r%2==0){
              even+=r;
           }else{odd+=r;}
           num=num/10;
        }
        return even > odd;
    }

    public int getLastDigit(int num) {
        int lastDigit = 0;
        while (num!=0) {
            lastDigit = num%10;

            num = num/10;
        }
        return lastDigit;
    }

    public int gitDigit(int num,int k) {
        int c=countDigits(num),current=0;
        for(int i=0;i<c;i++){
            current=num%10;
            num = num/10;
            if(k==i){
                return current;
            }
        }return 0;
    }

    public int gitDigit2(int num){
    int c=countDigits(num)-1;
    return gitDigit(num,c);
    }

    public int setDigit(int num,int k,int d) {
        int result = 0, multiply = 1,i=0;
        int c=countDigits(num);
        while (i<c)  {
            int remainder = num % 10;

            if (k == i)
                result = result + d * multiply;
            else
                result = result + remainder * multiply;

            multiply *= 10;
            num = num / 10;
            i++;
        }
        return result;
    }

    public int countMinDigit(int num){
        int c=countDigits(num),i=0,min=num%10,r;
        int number=num,coun=0;
        while(i<c){
            r=num%10;
            if(min>r)
                min=r;

            num=num/10;
            i++;
        }
        for(int j=0;j<c;j++){
           int reminder=number%10;
           if(min==reminder){
               coun++;
           }
           number=number/10;
        }
        return coun;
    }

    public boolean isSymmetric (int num){
        int number=num,reversed=0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return (reversed==number);
    }

    public int search(int num,int d){
        int c=countDigits(num),coun=0,i=0;
        while(i<c){
            int r=num%10;
            if(r==d){
                coun++;

            }
            num=num/10;
            i++;
        }
        return coun;
    }

}
