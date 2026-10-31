.class public final Ll/ᩳ֨֨;
.super Ll/ۙ֨֨;
.source "34PY"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1563
    iget-object v0, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->۟()Ll/ۤܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1558
    invoke-interface {p1, p0, p2}, Ll/᩸֨֨;->֫(Ll/ᩳ֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/֡᩹۠;
    .locals 1

    .line 1568
    sget-object v0, Ll/֡᩹۠;->ܿ֫:Ll/֡᩹۠;

    return-object v0
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 1

    .line 1548
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot add metadata to a package type"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫֫()Ll/ۢ۠֨;
    .locals 1

    .line 1553
    sget-object v0, Ll/ۢ۠֨;->ۜ֫:Ll/ۢ۠֨;

    return-object v0
.end method
