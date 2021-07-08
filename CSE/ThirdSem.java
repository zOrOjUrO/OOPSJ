package oopsj.CSE;

public class ThirdSem {
    public static void Welcomemsg() {
        System.out.println("Welcome to CSE dept- 3rd sem young budding Engineers");
    }

    static void auxFunc(){
        System.out.println("This Is A Default Aux Function from CSE Package's ThirdSem Class");
    }

    private static void auxFuncPri(){
        System.out.println("This Is A Private Aux Function from CSE Package's ThirdSem Class");
    }

    protected static void auxFuncProt(){
        System.out.println("This Is A Protected Aux Function from CSE Package's ThirdSem Class");
    }

    public static void main(String[] args){
        Welcomemsg();
        auxFunc();
        auxFuncPri();
        auxFuncProt();
    }

}
