HAT Interview - First Round Program

HATFD1005
Longest Palindromic Substring
Write a program to find the longest palindromic substring in a given string without using any
built-in
substring or reverse functions. For example, for input "babad", the output should be "bab"
or "aba".
Instructions: Avoid using any string handling libraries. Implement a solution that checks all
substrings
manually.
JAVA Program:
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
Input -1:
babad
output -1:
bab
Input -2:
cbbd
Output -2:
bb
Input -3:
level
Output -3:
level
