package edu.ucdavis.ecs160.hw1;

public class Evaluator implements ExprVisitor<Integer> {
    @Override
    public Integer visitNum(Num num) {
        return num.getValue();
    }

    @Override
    public Integer visitAdd(Add add) {
        return add.getLeft().use(this) + add.getRight().use(this);
    }

    @Override
    public Integer visitSub(Sub sub) {
        return sub.getLeft().use(this) - sub.getRight().use(this);
    }

    @Override
    public Integer visitMult(Mult mult) {
        return mult.getLeft().use(this) * mult.getRight().use(this);
    }

    @Override
    public Integer visitDiv(Div div) {
        return div.getLeft().use(this) / div.getRight().use(this);
    }
}
