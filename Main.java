public class Main
{
public static boolean isPal(String s,int start,int end)
{
while(start<end)
{
if(s.charAt(start)!=s.charAt(end))
{
return false;
}
start++;
end--;
}
return true;
}
{
public static String longPal(String s)
int n=s.length();
String l="";
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
if(isPal(s,i,j))
{
String curr=s.substring(i,j+1);
if(curr.length()>l.length())
l=curr;
}
}
}
}
return l;
public static void main(String[] args)
{
String[] inputs={"babad","cbbd","level"};
for(String str:inputs)
{
String res=longPal(str);
System.out.println(res);
}
}
}
