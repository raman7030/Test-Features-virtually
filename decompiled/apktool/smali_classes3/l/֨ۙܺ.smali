.class public final synthetic Ll/֨ۙܺ;
.super Ljava/lang/Object;
.source "X7LT"

# interfaces
.implements Ljava/util/function/BinaryOperator;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ll/֫۬ܺ;

    .line 4
    check-cast p2, Ll/֫۬ܺ;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    iget-object v0, p2, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    iget p2, p2, Ll/ۛۗܺ;->ܽ:I

    invoke-virtual {p1, p2, v0}, Ll/ۛۗܺ;->֫(I[Ljava/lang/Object;)V

    return-object p1
.end method
