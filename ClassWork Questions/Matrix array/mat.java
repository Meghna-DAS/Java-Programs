class mat
{
public static void main(String args[])
{
//declare the 2-D array and initialised ---a
int a[][]={{1,2,3},{4,5,6},{7,8,9}};

//declare anther 2-D array and initialised ----b
int b[][]={{8,9,1},{13,14,56},{8,99,9}};

//declare another 3-D which is stored 
int c[][]=new int[3][3];

//a==a+b

for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
c[i][j]=a[i][j]+b[i][j];

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	System.out.print(c[i][j]+"\t");};
	System.out.println();
}
}
}

