package oopsj.OOPS;

import oopsj.CSE.ThirdSem;
import oopsj.RVCE.CseDept;

public class InhertAcrossPack {

    public static void main(String[] args){
        System.out.println("PROGRAM TO DEMONSTRATE INHERITANCE AND POLYMORPHISM BASED ON TWO CYLINDER SPECIFICATIONS");
        ThirdSem parent = new ThirdSem();
        CseDept child = new CseDept();

        ThirdSem ref = parent;
        ref.Welcomemsg();

        //ref.auxFunc();
        //ref.auxFuncPri();
        //ref.auxFuncProt();

        ref = child;
        ((CseDept)ref).Welcomemsg();
    }
}
