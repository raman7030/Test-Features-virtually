.class public final Ll/᩶᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":empty"

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    .line 638
    invoke-virtual {p2}, Ll/ۨ֡ۚ;->ܿ()Ljava/util/List;

    move-result-object p1

    .line 639
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۨ֡ۚ;

    .line 640
    instance-of v0, p2, Ll/ۘ֡ۚ;

    if-nez v0, :cond_0

    instance-of v0, p2, Ll/ܽۚۚ;

    if-nez v0, :cond_0

    instance-of p2, p2, Ll/۠֡ۚ;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
