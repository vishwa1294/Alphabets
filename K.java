class K{
public static void main(String[]args){
int i,j,n=8;
int p = 0;
int q = 5;
for(i=0; i<=n; i++){
for(j=0; j<=5; j++){
if(j==0 || (i==j+3 && j>1))
	System.out.print("*");
else if (i==p && j==q){
	System.out.print("*");
	p=p+1;
	q=q-1;
}
else
System.out.print("  ");
}
System.out.println();
}
}
}

