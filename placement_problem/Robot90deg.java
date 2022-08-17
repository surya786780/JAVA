//import java.util.*;
public class Robot90deg {

	public static void main(String[] args) {
		
		int input1=3;
		int input2=4;
		String input3 = "2-2-E";
		String input4="R M L M L M R M";
		String[] s1 = input3.split("-");
		int x = Integer.parseInt(s1[0]); 
		int y = Integer.parseInt(s1[1]);
		String c1=s1[2];
		String s2[] = input4.split(" ");
		int num=0;
		if(input1>0 && input2>0){
		for(int i=0;i<s2.length;i++){
			if(s2[i].equals("M")){
				if(c1.equals("E")){
					x+=1;
					if(x>input1 || y>input2){
					x-=1;
					num+=1;
					break;
				}}
				else if(c1.equals("S")){
					y-=1;
					if(y==0){
					num+=1;
					break;
				}}
				else if(c1.equals("N")){
					y+=1;
					if(x>input1 || y>input2){
					y-=1;
					num+=1;
					break;
			}
				}
				else{
					x-=1;
					if(x==0){
					num+=1;
					break;
				}
			}}
			else{
			if(c1.equals("E")){
			if(s2[i].equals("R")){
				c1="S";
			}
			else if(s2[i].equals("L")){
				c1="N";
				}
		}
		else if(c1.equals("S")){
			if(s2[i].equals("R")){
				c1="W";
			}
			else if(s2[i].equals("L")){
				c1="E";
			}
		}
		else if(c1.equals("N")){
			if(s2[i].equals("R")){
				c1="E";
			}
			else if(s2[i].equals("L")){
				c1="W";
				}	
		}
		else{
			if(s2[i].equals("R")){
				c1="N";
				
			}
			else if(s2[i].equals("L")){
				c1="S";
				
				}
			}
		}
	}
		}	
		String op="";
		if(num==1){
			op+=x+"-"+y+"-"+c1+"-ER";
		}else{
			op+=x+"-"+y+"-"+c1;
		}
	System.out.println(op);
	}

}
