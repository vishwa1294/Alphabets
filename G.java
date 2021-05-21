class G{
public static void main(String[]args){
int n=8;
for(int i=0; i<=n; i++){
for(int j=0; j<=n/2; j++){
if (j == 0 || (j == 4 && (i != 1 &&  i != 2 &&  i!= 3))|| 
((i == 0 || i == n) && (j > 0 && j < 4))|| (i == 4 && (j == 3 || j == 5)))
System.out.print(" * ");
else
System.out.print("   ");
}
System.out.println();
}
}
}


