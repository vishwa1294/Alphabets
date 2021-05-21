class X{
public static void main(String[]args){
int row = 5;
for(int i=1;i<=row;i++){
for(int j=1;j<=row;j++){
if (i == j)
System.out.println(i+ " " + j +" ");
else
System.out.println("   ");
}
System.out.println();
}
}
}