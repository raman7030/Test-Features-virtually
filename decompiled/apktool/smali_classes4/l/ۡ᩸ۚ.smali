.class public final Ll/ۡ᩸ۚ;
.super Ll/ᩳ᩸ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, "^="

    const-string v1, "]"

    const-string v2, "["

    .line 0
    iget-object v3, p0, Ll/ᩳ᩸ۚ;->֫:Ljava/lang/String;

    iget-object v4, p0, Ll/ᩳ᩸ۚ;->ۧ:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    .line 227
    iget-object p1, p0, Ll/ᩳ᩸ۚ;->֫:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ll/ۨ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/ᩳ᩸ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
