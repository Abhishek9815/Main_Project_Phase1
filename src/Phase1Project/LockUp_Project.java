package Phase1Project;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Code By Abhishek Mukherjee 

		public class LockUp_Project {
				//create File ...
				public static void genaretFile(String fileName) throws IOException 
				{
					String filePath="C:\\Users\\hp\\eclipse-workspace\\jfsd_java\\src\\Phase1Project\\";
					ArrayList<String> aList=new ArrayList<String>();
					
					System.out.println("Enter the file name you want to create");
					String finalname=filePath+fileName;
					
					File f=new File(finalname);
					boolean b=f.createNewFile();
					if(b!=true) 
					{
						System.out.println("The file is not created");
					}
					else 
					{
						aList.add(fileName);
						System.out.println("File created");
					}
					
					System.out.println("Your list has :- "+aList);
				}
				
				//Delete Function ...
				
				public static void deleteFile(String fileName) {
					String path="C:\\Users\\hp\\eclipse-workspace\\jfsd_java\\src\\Phase1Project\\";

					String finalfile=path+fileName;
					File file=new File(finalfile);
					file.delete();
					System.out.println("File deleted");
					
				}
				//Searching Function ...
				
				public static void serchFile(String serchingFileName) {
					String path="C:\\Users\\hp\\eclipse-workspace\\jfsd_java\\src\\Phase1Project\\";
					File f=new File(path);
					File filename[]=f.listFiles();
					int count=0;
					for(File ff:filename) {
						
						if(ff.getName().equals(serchingFileName))
						{
							count++;
							break;
						}else {
							count=0;
						}
					}
					if (count!=0) {
						System.out.println("You have "+serchingFileName+" File");
						
					}else {
						System.out.println("File is not found");
					}
				}
				
				//Display File List ...
				
				public  static void displayFile() {
					String path="C:\\Users\\hp\\eclipse-workspace\\jfsd_java\\src\\Phase1Project\\";
					File f=new File(path);
					File filename[]=f.listFiles();
					System.out.println("Your File List has :-");
					for(File ff:filename) {
						System.out.println(ff.getName());
					}
				}
				
				
				
				//Main Method Start ...
				
				public static void main(String[] args) throws IOException {
					
					try (Scanner sc = new Scanner(System.in)) {
						boolean c=true;
						
						//for stop Main menu;
						
						
						while(c) {
							System.out.println(">>>>>>>>>>  Locked_Me.com  <<<<<<<<<<");
							System.out.println(" ");
							System.out.println("By");
							System.out.println(" ");
							System.out.println("Abhishek Mukherjee");
							System.out.println(" ");
							System.out.println("If you want Retrive File - : Hit 1");
							System.out.println("If you want Enter in the Business-level operations: - : Hit 2");
							System.out.println("If you want to close the System - : Hit 3");
							System.out.println();
							int x=sc.nextInt();
							switch (x) {
							case 1:{
								displayFile();
								System.out.println();
								break;
							}
							case 2: 
							{	while(true) {
								System.out.println("Choose any of the following option");
								System.out.println();
								System.out.println("If you want to Create a File : Hit 1");
								System.out.println("If you want to Delete a File : Hit 2");
								System.out.println("If you want to Search for a File : Hit 3");
								System.out.println("If you want to go to Main Menu : Hit 4");
								System.out.println();
								int i=sc.nextInt();
								
								if(i<=0 || i>=6) {									
									
									System.out.println("You do not enter valid number....  ");
									System.out.println();
							
								}else{
									
											
											
										
												if(i==1){
													System.out.println("Enter the File Name to Create");
													
													String  FileForCreate=sc.next();
													genaretFile(FileForCreate);
													System.out.println();
													
												}
												else if(i==2) {
													System.out.println("Enter the File Name to Delete");
													String FileForDelete=sc.next();
													deleteFile(FileForDelete);
													System.out.println();
												}
												else if(i== 3) {
													System.out.println("Enter the File Name for Serching");
													
												
												String FileForSerching=sc.next();
												serchFile(FileForSerching);
												System.out.println();
												}
												else if(i==4) {
													System.out.println("Welcome to Main menu,..........");
													System.out.println();
													break;
												}
									
										}
										
										
							}
							break;
								}
							
							case 3:{
								System.out.println("System closed.");
								c=false;
								break;
								
							}
							}
							
							
							
							
						}
					}
					
				}

			}








