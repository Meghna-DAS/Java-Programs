class PrefixSearch
{
public static void main(String[] args)
{
String[] arr ={"Meghna","Das","this","side"};
String str="MeghnaDas";

boolean result=false;

for (int i=0;i<3;i++)
{
	if(str.startsWith(arr[i]))
	{
		result=true;
		break;
	}
}
if (result)
	System.out.println("Given String"+"starts with one of the prefixes.");
else
	System.out.println("Given String do not"+"starts with one of the prefixes.");
}
}

