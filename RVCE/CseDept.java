package oopsj.RVCE;
import com.company.CSE.ThirdSem;

public class CseDept extends ThirdSem{

    public static void Welcomemsg() {
        System.out.println("Override: Welcome to CSE dept- 4th sem young budding Engineers");
    }

    public static void main(String[] args){
        ThirdSem.Welcomemsg();
        ThirdSem.auxFuncProt();
        //ThirdSem.auxFunc();
        //ThirdSem.auxFuncPri();
    }
}
