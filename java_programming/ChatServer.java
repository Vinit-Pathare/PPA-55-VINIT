 import  java.io.*;
 import  java.net.*;
 class ChatServer
 
 { 
 public static void main(String A[] ) throws Exception
     {
        ServerSocket ssobj = new  ServerSocket(5100);
        System.out.println("server is running at the port 5100");
        Socket sobj = ssobj.accept();
        System.out.println("client request gets accepted succesfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("marvellous server is running");
        String str1 = null, str2 = null;

        while ((str1 = bobj1.readLine()) != null) 
        {
            System.out.println("client says : "+str1);
            System.out.println("enter message for client");
            str2 = bobj2.readLine();
            pobj.println(str2);
        }
    }
} 

