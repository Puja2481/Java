public class CommandLineArguments {
    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println("Arguments are");
            for(String x:args)
                System.out.print(x + " ");
        }
        else{
            System.out.println("No Arguments");
        }
    }
}

// to test this it needs to be opened in terminal.
/*
➜  ~ cd desktop
➜  desktop cd JAVA
➜  JAVA cd UnitOne/Inputs
➜  Inputs javac CommandLineArguments.java
➜  Inputs java CommandLineArguments hello Test 123 34.5 //it is basically when user wants to enter arguments at run time
Arguments are
hello Test 123 34.5

➜  Inputs java CommandLineArguments                      
No Arguments

 */