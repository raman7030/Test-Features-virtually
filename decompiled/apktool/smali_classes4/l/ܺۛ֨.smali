.class public final synthetic Ll/ܺۛ֨;
.super Ljava/lang/Object;
.source "M43N"

# interfaces
.implements Ljava/util/function/BiPredicate;


# virtual methods
.method public synthetic and(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$and(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/BiPredicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ܳۛᩴ;->$default$negate(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$or(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Ll/֡ۨ֨;

    .line 4
    check-cast p2, Ll/ۙ֨֨;

    .line 165
    iget-object p1, p1, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result p1

    return p1
.end method
