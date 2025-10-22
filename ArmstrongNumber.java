class ArmstrongNumber{
public static void main(String [] args){
int reminder,sum=0,originalNumber;
int number=153;
originalNumber=number;


while(number>0){

reminder=number%10;

sum=sum+reminder*reminder*reminder;

number=number/10;


}
if(originalNumber==sum){
System.out.println("Number is ArmStrong");

}
else{
System.out.println("Number is Not ArmStrong");
}
}
}