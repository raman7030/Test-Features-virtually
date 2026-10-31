.class public final Ll/᩶᩹֨;
.super Ll/֨۬֨;
.source "440F"


# virtual methods
.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z
    .locals 1

    .line 697
    sget-object v0, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 545
    iget-object v0, p0, Ll/֨۬֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v0, p1, p2, p3}, Ll/ۘ۬֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
