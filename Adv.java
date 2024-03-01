public class Adv extends Calc{  //performing inheritance by taking features of super class add & sub


    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}



//calc  <--Advcal extending calc <--VeryAdvCalc extending Advcalc  this is known as Multi-Level Inheritance

//multiple inheritance using , not achieved due to Ambiguity 