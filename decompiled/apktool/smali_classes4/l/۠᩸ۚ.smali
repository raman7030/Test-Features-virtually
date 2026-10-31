.class public final Ll/۠᩸ۚ;
.super Ll/ܶ᩸ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 398
    iget v0, p0, Ll/ܶ᩸ۚ;->֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, ":eq(%d)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 0

    .line 393
    invoke-virtual {p2}, Ll/᩶֡ۚ;->ۛ()I

    move-result p1

    iget p2, p0, Ll/ܶ᩸ۚ;->֫:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
