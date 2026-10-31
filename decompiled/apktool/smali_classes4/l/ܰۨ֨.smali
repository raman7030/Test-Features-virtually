.class public final synthetic Ll/ܰۨ֨;
.super Ljava/lang/Object;
.source "Y7SB"

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
    .locals 4

    .line 2
    check-cast p1, Ll/ۛ֡֨;

    .line 4
    check-cast p2, Ll/ۛ֡֨;

    .line 2145
    move-object v0, p2

    check-cast v0, Ll/ܳ֡֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v1, p1

    .line 562
    :goto_0
    iget-object v2, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq v2, v3, :cond_1

    if-ne v1, v0, :cond_0

    return-object p1

    :cond_0
    iget-object v1, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_0

    :cond_1
    return-object p2
.end method
