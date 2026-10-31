.class public final Ll/᩵ۡᩳ;
.super Ll/ᩳۡᩳ;
.source "E1Y3"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "ParameterString"

    return-object v0
.end method

.method public final ֫(Ll/֡᩷ۚ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/֨ۢۚ;)Z
    .locals 1

    .line 104
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {p1}, Ll/֨ۢۚ;->ܽ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z
    .locals 3

    .line 38
    invoke-virtual {p1}, Ll/֨ۢۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringFog"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ll/֨ۢۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Lnp/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ᩳۡᩳ;->֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    .line 44
    :cond_1
    invoke-virtual {p1}, Ll/֨ۢۚ;->getParameters()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p0}, Ll/ᩳۡᩳ;->ۧ()Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v1
.end method
