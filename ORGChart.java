import java.util.*;

class Chart
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String arr1[] = {"Mark Davis","Accounts","Treasury"};
        String arr2[] = {"Roy Mccartney","Operations And recruitment","Staff Development"};
        String arr3[] = {"Rebecca","Customer Service","Domestic Sales","Department"};
        String arr4[] = {"Neil Young","Purchase","Receiving and Inspection"};
        String arr5[] = {"Scotte Malkinson","Fabrication","Assembly","Testing","Production Engineering"};
        String arr6[] = {"Arnold Howell","System Engineering","Electronic Engineering","Software Engineering","Mechanical Engineering","Technical Engineering"};
        
        
        String [][] arr = {arr1,arr2,arr3,arr4,arr5,arr6};
        
        System.out.println("Enter the name of the person");
        String n = sc.next();
        switch(n)
        {
            case "PaulRoss":
                for(int i = 0;i<arr.length;i++)
                {
                    for(int j = 0;j<arr[i].length;j++)
                    {
                        if(j==0)
                        {
                            System.out.println("Reports to: "+arr[i][j]);
                            continue;
                        }
                        System.out.println(arr[i][j]);
                    }
                    System.out.println();
                    System.out.println();
                }
                break;
                
            case "MarkDavis":
                for(int i = 0;i<arr1.length;i++)
                {
                    if(i==0)
                    {
                        System.out.println(arr1[i]+":- ");
                        continue;
                    }
                    System.out.print(arr1[i]);
                }
                break;
                
                
            case "RoyMccartney":
                for(int i = 0;i<arr2.length;i++)
                {
                    if(i==0)
                    {
                        System.out.println(arr2[i]+":- ");
                        continue;
                    }
                    System.out.println(arr2[i]);
                }
                break;
                
                
            case "Rebecca":
                for(int i = 0;i<arr3.length;i++)
                {
                    if(i==0)
                    {
                        System.out.println(arr3[i]+":- ");
                        continue;
                    }
                    System.out.println(arr3[i]);
                }
                break;
                
                
            case "NeilYoung":
                for(int i = 0;i<arr4.length;i++)
                {
                    if(i==0)
                    {
                        System.out.println(arr4[i]+":- ");
                        continue;
                    }
                    System.out.println(arr4[i]);
                }
                break;
                
            
            case "ScotteMalkinson":
                for(int i = 0;i<arr5.length;i++)
                {
                    if(i==0)
                    {
                        System.out.println(arr5[i]+":- ");
                        continue;
                    }
                    System.out.println(arr5[i]);
                }
                break;
                
                
            case "ArnoldHowell":
                for(int i = 0;i<arr6.length;i++)
                {
                    if(i==0)
                    {
                        System.out.println(arr6[i]+":- ");
                        continue;
                    }
                    System.out.println(arr6[i]);
                }
                break;
                
            default:
                System.out.println("Enter a valid name");
        }
        
        
    }
}
