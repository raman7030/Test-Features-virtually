.class public final Ll/۟۠֨;
.super Ll/֫᩸֨;
.source "X43L"


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 2

    .line 3539
    check-cast p1, Ll/ۙ֨֨;

    .line 3541
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a method type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۤۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 3539
    check-cast p2, Ll/ۙ֨֨;

    .line 3552
    new-instance v0, Ll/ܰ۠֨;

    iget-object v1, p1, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object v2, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۙ֨֨;

    invoke-direct {v0, v1, p2, p1}, Ll/ܰ۠֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۤۚ֨;)V

    return-object v0
.end method

.method public final ֫(Ll/ۧ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 3539
    move-object v2, p2

    check-cast v2, Ll/ۙ֨֨;

    .line 3544
    new-instance p2, Ll/᩺۠֨;

    iget-object v1, p1, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    iget-object v3, p1, Ll/ۧ֨֨;->᩺:Ll/ۖܶ۠;

    iget-object v4, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    move-object v0, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺۠֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;Ll/ۧ֨֨;)V

    return-object p2
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 2

    .line 3539
    check-cast p1, Ll/ۙ֨֨;

    .line 3541
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a method type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
