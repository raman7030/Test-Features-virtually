.class public final synthetic Ll/۫֫ۖ;
.super Ljava/lang/Object;
.source "17QI"

# interfaces
.implements Ll/ᩴܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    check-cast p1, Ll/᩶ۡ֨;

    .line 1551
    instance-of v0, p1, Ll/ۧۡ֨;

    if-nez v0, :cond_0

    goto :goto_0

    .line 1554
    :cond_0
    check-cast p1, Ll/ۧۡ֨;

    invoke-interface {p1}, Ll/ۧۡ֨;->getExpression()Ll/۫᩵۠;

    move-result-object p1

    .line 1555
    instance-of v0, p1, Ll/ۢܺ֨;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۢܺ֨;

    invoke-interface {p1}, Ll/ۢܺ֨;->getType()Ll/۬ܺ֨;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
