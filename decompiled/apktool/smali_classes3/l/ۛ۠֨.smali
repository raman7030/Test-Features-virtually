.class public final Ll/ۛ۠֨;
.super Ll/֫᩸֨;
.source "X43L"


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 2

    .line 3507
    check-cast p1, Ll/ۖܶ۠;

    .line 3509
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
    .locals 2

    .line 3507
    check-cast p2, Ll/ۖܶ۠;

    .line 3515
    new-instance v0, Ll/ۤۚ֨;

    iget-object v1, p1, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ֨֨;

    invoke-direct {v0, p1, v1}, Ll/ۤۚ֨;-><init>(Ll/ۙ֨֨;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public final ֫(Ll/ۧ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 3507
    check-cast p2, Ll/ۖܶ۠;

    .line 3512
    new-instance v0, Ll/ۧ֨֨;

    iget-object v1, p1, Ll/ۧ֨֨;->ۨ:Ll/ۙ֨֨;

    iget-object v2, p1, Ll/ۧ֨֨;->᩺:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-direct {v0, p2, v1, v2, p1}, Ll/ۧ֨֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 2

    .line 3507
    check-cast p1, Ll/ۖܶ۠;

    .line 3509
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
