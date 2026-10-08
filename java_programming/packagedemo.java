 import marvellous.ppa;
 import Universe.lb;
 import Universe.infosystem.python;
 
 
 
 class packagedemo 
 {

    public static void main(String A[]) 
    {
        ppa pobj = new ppa();
        lb lobj = new lb();
        python pyobj = new python();

        pobj.ppa_fun();
        lobj.lb_fun();
        pyobj.python_fun();
    }
    
}
