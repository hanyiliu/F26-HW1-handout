package edu.ucdavis.ecs160.hw1;

public interface ExprVisitor<R> {
    R visitNum(Num num);

    R visitAdd(Add add);

    R visitSub(Sub sub);

    R visitMult(Mult mult);

    R visitDiv(Div div);
}
