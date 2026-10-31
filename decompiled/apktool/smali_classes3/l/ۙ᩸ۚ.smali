.class public final Ll/ۙ᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":first-child"

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 0

    .line 577
    invoke-virtual {p2}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 578
    instance-of p1, p1, Ll/֨֡ۚ;

    if-nez p1, :cond_0

    invoke-virtual {p2}, Ll/᩶֡ۚ;->ۛ()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
