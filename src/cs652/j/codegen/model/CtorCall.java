package cs652.j.codegen.model;

/**
 * Created by ashi on 4/1/17.
 */
public class CtorCall extends Expr {
    public String ctor;
    public CtorCall(String ctor){
        this.ctor = ctor;
    }
}
