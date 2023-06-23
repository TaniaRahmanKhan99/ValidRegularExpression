import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

public class ValidRegularExpression{
  public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
   System.out.println (" PLEASE TYPE ANY INTEGER VALUE");
   String [] s1= new String[sc.nextInt()];
   sc.nextLine();
//   String [] s2= new String[sc.nextInt()];
//   sc.nextLine();
  
   for(int i=0; i< s1.length; i++){
   System.out.println (" PLEASE TYPE A REGULAR EXPRESSIOIN");
    s1[i]= sc.nextLine();  
    //System.out.println(s1[i]);
//    Pattern p= Pattern.compile(s1[i]);
//     List<Pattern> patterns = new ArrayList<Pattern>();
//     patterns.add(p);
   }
    System.out.println (" PLEASE TYPE ANY INTEGER VALUE");
   String [] s2= new String[sc.nextInt()];
   sc.nextLine();
    for(int j=0; j<s2.length; j++){
   System.out.println (" PLEASE ENTER TEXT");
   s2[j]= sc.nextLine();
    //System.out.println(s2[i]);
    }  
    for(int s=0; s<s2.length; s++ ){      
      for(int t=0; t<s1.length;t++ ){ 
      Pattern p= Pattern.compile(s1[t]);
       Matcher m= p.matcher(s2[s]);   
    if (m.find()){
    int n=t+1;
    System.out.println("Yes, "+ n);     
    break;
    }
                
    else { 
      for(int x=0; x<s1.length;){ 
     p= Pattern.compile(s1[x]);
        m= p.matcher(s2[s]);
//       if(m1.find()){
//       int y1= x+1;
//        System.out.println("Yes, "+ y1);
//        x++;
//       }
      if(!m.find()){
        x++;       
      }
      }      
    System.out.println("No, "+ 0);
      }   
          
    }
    }
  }
}
