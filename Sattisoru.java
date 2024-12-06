import java.util.Scanner;
class Sattisoru{
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception
		{
		System.out.println("\t\t\tWelcome to Sattisoru ");
		Thread.sleep(100);System.out.print("\t\t\t   P");
		Thread.sleep(100);System.out.print("a");
		Thread.sleep(100);System.out.print("s");
		Thread.sleep(100);System.out.print("i");
		Thread.sleep(100);System.out.print("k");
		Thread.sleep(100);System.out.print("k");
		Thread.sleep(100);System.out.print("i");
		Thread.sleep(100);System.out.print("d");
		Thread.sleep(100);System.out.print("h");
		Thread.sleep(100);System.out.print("a");
		Thread.sleep(100);System.out.print("a");
		Thread.sleep(100);System.out.print("?");
		Thread.sleep(100);System.out.println("?");
		Thread.sleep(1000);System.out.println("Select your order!!! ");
		System.out.println("1.Buhari\n2.Bilal\n3.Amma canteen\n4.A2B");
        int n= sc.nextInt();
                 switch(n) {
        case 1:{//BUHARI
				 System.out.println("\t\t\tGreetings from BUHARI!");
                 System.out.println("\t\t\tSelect your favourite food: ");
			     System.out.println("1.Chicken 65\n2.Mutton biriyani\n3.Chicken biriyani\n4.Prawn biriyani");
				  int food = sc.nextInt();
				  switch(food) {
					   case 1:{//c65
						   double price= 180;
						   System.out.print("Enter Quantity:");
							   double qty=sc.nextDouble();
							   double bill=qty*price;
						   System.out.println("TOTAL BILL:"+bill);
						   System.out.println("Confirm your order");
						   System.out.println("1.Confirm\n2.Cancel");
						   int c=sc.nextInt();
						   switch(c){
						   case 1:{//confirm
							System.out.println("Select payment method");
							System.out.println("1.GPAY\n2.PhonePE");
								int d=sc.nextInt();
							
							  switch (d){
									case 1:{//GPAY
										System.out.println("Redirecting to GPAY");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
							break;	}
								case 2:{
									    System.out.println("Redirecting to PhonePE");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
								break;}           default :
	                                        System.out.println("Invalid input");
                                            break;
							}
					              //confirm
						}
						break;
						   case 2:{//cancel
							
						          
						System.out.print("\t\t\tCancelling");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.println(".");
						System.out.println("\t\t    **ORDER CANCELLED**");
						break;
				                   }//cancel 
				        default :
		 	           System.out.println("Invalid input");
                       break;
			                 }
					   }
		               case 2:{//mb
						   double price= 340;
						   System.out.print("Enter Quantity:");
							   double qty=sc.nextDouble();
							   double bill=qty*price;
						   System.out.println("TOTAL BILL:"+bill);
						   System.out.println("Confirm your order");
						   System.out.println("1.Confirm\n2.Cancel");
						   int c=sc.nextInt();
						   switch(c){
						   case 1:{//confirm
							System.out.println("Select payment method");
							System.out.println("1.GPAY\n2.PhonePE");
								int d=sc.nextInt();
							
							  switch (d){
									case 1:{//GPAY
										System.out.println("Redirecting to GPAY");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
							break;	}
								case 2:{
									    System.out.println("Redirecting to PhonePE");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
								break;}           default :
	                                        System.out.println("Invalid input");
                                            break;
							}
					              //confirm
						}
						break;
						   case 2:{//cancel
							
						          
						System.out.print("\t\t\tCancelling");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.println(".");
						System.out.println("\t\t    **ORDER CANCELLED**");
						break;
				                   }//cancel 
				        default :
		 	           System.out.println("Invalid input");
                       break;
			                 }
						   break;
		                       //mb
							   }
	                   case 3:{//cb
						   double price= 295;
						   System.out.print("Enter Quantity:");
							   double qty=sc.nextDouble();
							   double bill=qty*price;
						   System.out.println("TOTAL BILL:"+bill);
						   System.out.println("Confirm your order");
						   System.out.println("1.Confirm\n2.Cancel");
						   int c=sc.nextInt();
						   switch(c){
						   case 1:{//confirm
							System.out.println("Select payment method");
							System.out.println("1.GPAY\n2.PhonePE");
								int d=sc.nextInt();
							
							  switch (d){
									case 1:{//GPAY
										System.out.println("Redirecting to GPAY");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
							break;	}
								case 2:{
									    System.out.println("Redirecting to PhonePE");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
								break;}           default :
	                                        System.out.println("Invalid input");
                                            break;
							}
					              //confirm
						}
						break;
						   case 2:{//cancel
							
						          
						System.out.print("\t\t\tCancelling");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.println(".");
						System.out.println("\t\t    **ORDER CANCELLED**");
						break;
				                   }//cancel 
				        default :
		 	           System.out.println("Invalid input");
                       break;
			                 }
			               break;
						   //cb
						   }
		               case 4:{//pb
						   double price= 300;
						   System.out.print("Enter Quantity:");
							   double qty=sc.nextDouble();
							   double bill=qty*price;
						   System.out.println("TOTAL BILL:"+bill);
						   System.out.println("Confirm your order");
						   System.out.println("1.Confirm\n2.Cancel");
						   int c=sc.nextInt();
						   switch(c){
						   case 1:{//confirm
							System.out.println("Select payment method");
							System.out.println("1.GPAY\n2.PhonePE");
								int d=sc.nextInt();
							
							  switch (d){
									case 1:{//GPAY
										System.out.println("Redirecting to GPAY");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
							break;	}
								case 2:{
									    System.out.println("Redirecting to PhonePE");
										System.out.println("YOUR BILL IS:"+bill);
										System.out.print("ENTER AMOUNT:");
										double ubill=sc.nextDouble();
										if (ubill==bill)
									{
										System.out.print("ENTER MPIN:");
										int mpin=4123;
										int pin=sc.nextInt();
										if (mpin==pin)
										{
											System.out.print("\t\t\tGenerating OTP");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											int otp=(int)(Math.random()*999+999);
											System.out.println("OTP:"+otp);
											System.out.println("Redirecting to Sattisoru");
											System.out.print("ENTER OTP:");
											int uotp=sc.nextInt();
											System.out.print("\t\t\tVerifying");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											if (otp==uotp)
											{
											System.out.println("\t\t\t  Verified!");
											System.out.print("\t\t    Placing your order");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.print(".");
											Thread.sleep(500);System.out.println(".");
											System.out.println("\t\t\tOrder placed!");
											System.out.println("\t   Soon our captain will deliver your order!");
											
											}
										}
									}
								break;}           default :
	                                        System.out.println("Invalid input");
                                            break;
							}
					              //confirm
						}
						break;
						   case 2:{//cancel
							
						          
						System.out.print("\t\t\tCancelling");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.print(".");
						Thread.sleep(500);System.out.println(".");
						System.out.println("\t\t    **ORDER CANCELLED**");
						break;
				                   }//cancel 
				        default :
		 	           System.out.println("Invalid input");
                       break;
			                 }
			               break;//pb
		                   }
		               default :
		 	           System.out.println("Invalid input");
                       break;
				  }
				           }			   
				
					   break;
		 case 2:{//bilal
						   break;
					   }
		case 3:{//ac
						   break;
						   }
		case 4:{//A2b
						   break;
					   }
					   default :
	     System.out.println("Invalid input");
            break;
				  
				  }
       System.out.println("*****************************************************************************************************************");    
       Thread.sleep(1000);System.out.println("\t\t\tTHANK YOU!");     
        }
    }





	



