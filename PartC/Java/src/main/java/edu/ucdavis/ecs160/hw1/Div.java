package edu.ucdavis.ecs160.hw1;

public class Div extends BinaryExpr {
    public Div(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public <R> R use(ExprVisitor<R> visitor) {
        return visitor.visitDiv(this);
    }
}
