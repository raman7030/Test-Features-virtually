.class public final Ll/֡ۡᩳ;
.super Ll/ᩳۡᩳ;
.source "717L"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "ParameterStringString"

    return-object v0
.end method

.method public final ֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z
    .locals 2

    .line 27
    invoke-virtual {p1}, Ll/֨ۢۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringFog"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ll/֨ۢۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Lnp/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ᩳۡᩳ;->֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    .line 33
    :cond_1
    invoke-virtual {p1}, Ll/֨ۢۚ;->getParameters()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {p0}, Ll/ᩳۡᩳ;->ۧ()Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
