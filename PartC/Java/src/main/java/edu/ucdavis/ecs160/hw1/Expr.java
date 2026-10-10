package edu.ucdavis.ecs160.hw1;

public interface Expr {
    <R> R use(ExprVisitor<R> visitor);
}
