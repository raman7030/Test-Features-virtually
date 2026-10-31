.class public final Ll/۬᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":last-child"

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    .line 409
    invoke-virtual {p2}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 410
    instance-of v0, p1, Ll/֨֡ۚ;

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ll/᩶֡ۚ;->ۛ()I

    move-result p2

    invoke-virtual {p1}, Ll/᩶֡ۚ;->۫()Ll/֫᩸ۚ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    if-ne p2, p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
