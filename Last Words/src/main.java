import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
/**
 * 
 */
import java.util.TimerTask;

/**
 * @author robxu
 *
 */
public class main {
	static int interval;
	static Timer timer;
	public static void main(String[] args) throws IOException {
		//System.out.println((int)(Math.random()*3+2));
		BufferedReader in = new BufferedReader(new FileReader("dict.txt"));
		Scanner keyboard=new Scanner(System.in);
		String line;
		boolean lose=false;
		boolean valid=true;
		String temp;
		int points=0;
		List<String> statdict = new ArrayList<String>();
		while((line = in.readLine()) != null)
		{
			statdict.add(line);
		}
		List<String> avawords=new ArrayList<String>();
		List<String> dict3=new ArrayList<String>();
		List<String> dict4=new ArrayList<String>();
		List<String> dict5=new ArrayList<String>();
		List<String> dict6=new ArrayList<String>();
		List<String> dict7=new ArrayList<String>();
		List<String> dict8=new ArrayList<String>();
		List<String> dict9=new ArrayList<String>();
		List<String> dict10=new ArrayList<String>();
		List<String> dict11=new ArrayList<String>();
		List<String> dict12=new ArrayList<String>();
		List<String> dict13=new ArrayList<String>();
		List<String> dict14=new ArrayList<String>();
		List<String> dict15=new ArrayList<String>();
		List<String> used=new ArrayList<String>();
		List<Integer> unclearable=new ArrayList<Integer>();
		List<String> inputWord=new ArrayList<String>();
		String exampleWord;
		for(String s:statdict){
			if(s.length()==3){
				dict3.add(s);
			}
			else if(s.length()==4){
				dict4.add(s);
			}
			else if(s.length()==5){
				dict5.add(s);
			}
			else if(s.length()==6){
				dict6.add(s);
			}
			else if(s.length()==7){
				dict7.add(s);
			}
			else if(s.length()==8){
				dict8.add(s);
			}
			else if(s.length()==9){
				dict9.add(s);
			}
			else if(s.length()==10){
				dict10.add(s);
			}
			else if(s.length()==11){
				dict11.add(s);
			}
			else if(s.length()==12){
				dict12.add(s);
			}
			else if(s.length()==13){
				dict13.add(s);
			}
			else if(s.length()==14){
				dict14.add(s);
			}
			else if(s.length()==15){
				dict15.add(s);
			}
		}
		int x=0;
		do{
			lose=false;
			System.out.println("1)Play");
			System.out.println("2)Help");
			System.out.println("3)Quit");
			x=Integer.parseInt(keyboard.nextLine());
			switch(x){
			case 1:
				while(lose!=true){
					inputWord.clear();
					avawords.clear();
					unclearable.clear();
					int RNG=(int)(Math.random()*2+3)+(int)(Math.sqrt(points/10));
					//int RNG=(int)(Math.random()*13-(points/10)+(points/10));
					//int RNG=(int)(Math.sqrt(Math.random()*169));
					//int RNG=(int)(Math.random()*13+3);
					switch(RNG){
					case 3:
						for(String s:dict3){
							avawords.add(s);
						}
					break;
					case 4:
						for(String s:dict4){
							avawords.add(s);
						}
					break;
					case 5:
						for(String s:dict5){
							avawords.add(s);
						}
					break;
					case 6:
						for(String s:dict6){
							avawords.add(s);
						}
					break;
					case 7:
						for(String s:dict7){
							avawords.add(s);
						}
					break;
					case 8:
						for(String s:dict8){
							avawords.add(s);
						}
					break;
					case 9:
						for(String s:dict9){
							avawords.add(s);
						}
					break;
					case 10:
						for(String s:dict10){
							avawords.add(s);
						}
					break;
					case 11:
						for(String s:dict11){
							avawords.add(s);
						}
					break;
					case 12:
						for(String s:dict12){
							avawords.add(s);
						}
					break;
					case 13:
						for(String s:dict13){
							avawords.add(s);
						}
					break;
					case 14:
						for(String s:dict14){
							avawords.add(s);
						}
					break;
					case 15:
						for(String s:dict15){
							avawords.add(s);
						}
					break;
					}
					RNG=(int)(Math.random()*avawords.size());
					exampleWord = avawords.get(RNG);
					System.out.println("Think of a "+exampleWord.length()+" Letter Word!");
					for(int i=0;i<exampleWord.length();i++){
						inputWord.add("*");
						
					}
					
					for(int i=0;i<(int)(Math.random()*(exampleWord.length()-1))+1;i++){
						int place=(int)(Math.random()*exampleWord.length());
						if(inputWord.get(place).equalsIgnoreCase("*")){
							inputWord.set(place, exampleWord.substring(place,place+1).toLowerCase());
							unclearable.add(place);
						}
						else{
							i--;
						}
					}
				
					boolean done=false;
					while(!done){
						System.out.println("1)Clear");
						System.out.println("2)Replace");
						System.out.println("3)Done");
						System.out.println("4)Skip");
						System.out.println("Or just type (One Letter at a time)");
						for(int i=0;i<exampleWord.length();i++){
							System.out.print(inputWord.get(i));
						}
						System.out.println("");
						temp=keyboard.nextLine();
						switch(temp.toUpperCase()){
						case "1":
							for(int i=0;i<inputWord.size();i++){
								valid=true;
								for(int j=0;j<unclearable.size();j++){
									if(i==unclearable.get(j)){
										valid=false;
										
									}
								}
								if(valid){
									inputWord.set(i, "*");
								}
							}
						break;
						case "2":
							valid=true;
							System.out.println("Index:");
							int replace=Integer.parseInt(keyboard.nextLine());
							for(int i=0;i<unclearable.size();i++){
								if(replace==unclearable.get(i)){
									valid=false;
								}
							}
							if(!valid){
								System.out.println("Cannot Replace Static Letter!");
							}
							else{
								inputWord.set(replace,"*");
							}
							
						break;
						case "3":
							if(findass(inputWord)){
								System.out.println("You Need To Fill Out The Entire Word!");
							}
							else{
								String compare="";
								for(int i=0;i<inputWord.size();i++){
									compare+=inputWord.get(i);
								}
								if(!find(compare,avawords)||findused(compare,used)){
									System.out.println("Invalid");
									for(int i=0;i<inputWord.size();i++){
										valid=true;
										for(int j=0;j<unclearable.size();j++){
											if(i==unclearable.get(j)){
												valid=false;
												
											}
										}
										if(valid){
											inputWord.set(i, "*");
										}
									}
								}
								else{
									System.out.println("Correct!");
									done=true;
									//points++;
									points+=exampleWord.length();
									if(points>=1210){
										RNG=(int)(Math.random()*13+3);
									}
									used.add(compare);
								}
							}
						break;
						case "4":
							System.out.println(exampleWord);
							points-=exampleWord.length();
							if(points<=0){
								points=0; 
							}
							done=true;
						break;
						default:
							if(!findass(inputWord)){
								break;
							}
							if(temp.length()>1){
								break;
							}
							for(int i=0;i<inputWord.size();i++){
								if(inputWord.get(i).equals("*")){
									inputWord.set(i,temp);
									break;
								}
							}
						break;
						}
					}
				}
			break;
			case 2:
				System.out.println("Fill in the word!");
				System.out.println("Make sure it is the same amount of letters as displayed");
				System.out.println("The more you play, the longer the words will get!");
				System.out.println("There will also be letter spaces that are filled in, so your word has to match those letters!");
			break;
			case 3:
				System.out.println("kek");
				System.exit(0);
			break;
		
			}
		
		}while(x<3);
		
	}
	public static boolean findass(List<String>s){
		for(String t:s){
			if(t.equals("*")){
				return true;
			}
		}
		return false;
	}
	public static boolean find(String c,List<String> t){
		for(int i=0;i<t.size();i++){
			if(t.get(i).equalsIgnoreCase(c)){
				return true;
			}
		}
		return false;
	}
	public static boolean findused(String c,List<String> u){
		for(int i=0;i<u.size();i++){
			if(c.equalsIgnoreCase(u.get(i))){
				return true;
			}
		}
		return false;
	}
	private static final int setInterval() {
	    if (interval == 1)
	        timer.cancel();
	    return --interval;
	}
}
