import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Total no of subjects");
    int noofsubjects=sc.nextInt();
    int arr[] =new int[noofsubjects];
    int sum=0;
    System.out.println("Enter your each subject marks out of 100");
    for(int i=0;i<noofsubjects;i++)
    {
      arr[i]=sc.nextInt();
      sum+=arr[i];
    }
    System.out.println("Total marks in all subjects "+sum);
    int percentage=(sum/noofsubjects);
    if(percentage>90)
    {
      System.out.println("Average Percentage : "+percentage+"\nGrade A");
    }
    else if(percentage>75 && percentage<=90)
    {
      System.out.println("Average Percentage : "+percentage+"\nGrade B");
    }
    else if(percentage>65 && percentage<=75 )
    {
      System.out.println("Average Percentage : "+percentage+"\nGrade C");
    }
    else if(percentage>50 && percentage<=65)
    {
      System.out.println("Average Percentage : "+percentage+"\nGrade D");
    }
    else
    {
      System.out.println("Averavge Percentage : "+percentage+"\nFail");
    }
  }
}