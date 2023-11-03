class vow
{
  public static void main(String args[])
  {
    String s= new String("hello all");
    String[] s1=s.split(" ");
    int count=0,sum=0;
    for(int x=0;x<s1.length();x++)
    {
     if(s1(x).charAt(x)=='a'||s1(x).charAt(x)=='e'||s1(X).charAt(x)=='i'||s1(X).charAt(x)=='o'||s1(X).charAt(x)=='u')
      count++;
      else
      sum++;
    }
   System.out.println("vowels"+count+ "consonants"+ sum);
}
}