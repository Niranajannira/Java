class Main{
    public static void main(String arg[]){
        int num1=36;
        int num = num1;
        int rem = 0;
        int rev = 0;
        int count = 0;
        int digit = 0;
        int sum = 0;
        while (num>0) {
            // digit = num%10;//get last digit 
            // sum+=digit;
            // num/=10;//remove last digit 
            // num/=10;
            // count++;
            // rem = num%10;
            // rev = rev*10+rem;
            // num/=10;
            digit = num%10;
            sum+=digit;
            num/=10;
        }
        if(num1%sum==0){
            System.out.print("Harshad number");
            
        }
        else
        System.out.print("not harshad number");
        
        //System.out.print(rev);
    }
}