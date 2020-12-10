import java.util.Scanner;

public class G5banco {

	public static void main(String[] args) 
	{
	    Scanner leia = new Scanner(System.in);
	    
	    int tipo;
	    int cpfUser;
	    int cpfPadrao = 111;
	    
	    linha();
	    System.out.println("\n                                      G5 BANK");
	    linha();
	    menuEntrada();
	    cpfUser = leia.nextInt();
	    
	    while(cpfUser != cpfPadrao)
	    {
	        menuEntrada();
	        cpfUser = leia.nextInt();
	        
	    }
	    
	    if(cpfUser == cpfPadrao)
	    {
	        menuPrincipal();
	        tipo = leia.nextInt();
	        switch(tipo)
	        {
	        case 1:System.out.println("oi");
	        break;
	        case 2:System.out.println("oi");
	        break;
	        case 3:System.out.println("oi");
	        break;
	        case 4:System.out.println("oi");
	        break;
	        case 5:System.out.println("oi");
	        break;
	        case 6: System.out.println("OBRIGADO POR USAR O BANCO");
	        menuEntrada();
	        break;
	            
	        }
	        
	        
	    }
	    else
	    {
	        menuEntrada();
	    }
	    
	    
	    
	}
	public static void linha()
	{ 
	    for(int x = 0;x<81;x++)
	    {
	    System.out.print("▓");
	    }
	}
	public static void menuEntrada()
	{
	    
	    System.out.println("\n"+"                             DIGITE O NUMERO DA CONTA : ");
	    linha();
	}
	public static void menuPrincipal()
	{
	    linha();
	    System.out.println("\n                                      G5 BANK");
	    linha();
	    System.out.println("\n"+"[1] - CONTA POUPANÇA");
	    System.out.println("\n"+"[2] - CONTA CORRENTE");
	    System.out.println("\n"+"[3] - CONTA ESPECIAL");
	    System.out.println("\n"+"[4] - CONTA EMPRESA");
	    System.out.println("\n"+"[5] - CONTA UNIVERSITARIA");
	    System.out.println("\n"+"[6] - SAIR");
	}
	public static void sair()
	{
	    menuEntrada();
	}
	
	
}
