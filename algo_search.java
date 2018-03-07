package json;

public class algo_search {
	//import java.util.ArrayList;
	import java.lang.String;
	//import java.util.Scanner;
	public class boyce_moore 
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    // String pat;
	    // pat="PATTERN";
	     //txt="OUR TASK IS TO IDENTIFY THE PATTERN IN ANY TEXT";
	     bad_match_table_construction();
		}
		public static void bad_match_table_construction()
		{   
			String str,t="";
		     str="PATTERN";
		     String txt="OUR JOB IS TO CHECK THE EXISTING PATTERN, IN THE PATTERN OF ANY PATTERN.";
		     //bad_match_table_construction(pat);
		     int l,i,j;
				char chr,chr2;
				l= str.length();
				//jump=l;
				//char a[] = new char[l]; 
				int  b[] = new int[l];
				for(i=0;i<l;i++)
				{
				 chr=str.charAt(i);
				 for(j=0;j<=t.length();j++)
				 {
				  if(j==t.length())
				  {
					t=t+chr;
					if(i==l-1)
					  b[j]=l;
					else
					  b[j]=l-i-1;
					  break;
					//pat++;
				  }
				   chr2=t.charAt(j);
				  if(chr==chr2)
				  {
					if(i==l-1)
					 b[j]=l;
					else
				     b[j]=l-i-1;
					  break;  
					//System.out.println("*");
				  }	  
				 }
				}
			System.out.println("BAD MATCH TABLE FOR THE GIVEN PATTERN: "+str+"\n");
			 for(i=0;i<t.length();i++)
			  System.out.print(t.charAt(i)+"  ");
			 System.out.print(" *\n");
			 System.out.println();
			  for(i=0;i<t.length();i++)
			   System.out.print(b[i]+"  ");
			 System.out.println(" "+l);
		     System.out.println();
		 //CALLING THE MATCHING FUNCTION
		    //string_comparision(txt,str,l,t,b);
		}
	public static void string_comparision(String txt, String patt,int jmp,String t,int[] b)
	{
	 int l = txt.length(); 
	 //System.out.println(l);
	 int l2=patt.length();
	 //System.out.println(l2);
	 /*
	  int j=0;
	 for(j=0;j<t.length();j++)
	 System.out.print(b[j]+" ");*/
	 //System.out.print(t);
	 int idx=l2-1,i=idx,buf,buf2,fr=0,k,c;
	// System.out.println("****");
	 while(i<l)
	 {
	  //System.out.println(i);
	  if(patt.charAt(idx)== txt.charAt(i))
	  {
	   buf = i-1;
	   buf2 = idx-1;
	   while(buf2>=0)
	   {
		if(buf2==0&&(txt.charAt(buf)== patt.charAt(buf2)))
		{
	     fr++;i=i+jmp;break;
		}
		if(txt.charAt(buf)== patt.charAt(buf2))
		{
		buf--;
		buf2--;
		continue;
		}
		else
		{
		 k=0;
		 c = t.length();
		 while(k<c)
		 {
		  if(txt.charAt(i)==t.charAt(k))
			  {i=i+b[k];break;}
		  k++;
		 }	
		 break;
		}
	   }
	  }
	  else
	  {
		  k=0;
			 c = t.length();
			 while(k<c)
			 {
			  if(txt.charAt(i)==t.charAt(k))
				  {i=i+b[k];break;}
			  k++;		  
			 }
	 if(k==c)
	  i=i+jmp;
	  } 
	 }
	 System.out.println("The number of times pattern has occured in \""+txt+"\" :\n"+fr);
	}
	}

