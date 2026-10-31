.class public final Ll/֫᩹ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":root"

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    .line 595
    instance-of v0, p1, Ll/֨֡ۚ;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩶()Ll/᩶֡ۚ;

    move-result-object p1

    :cond_0
    if-ne p2, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
