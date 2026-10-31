.class public final Ll/ۛۙۖ;
.super Ll/ۤ᩵ۚ;
.source "95X4"


# virtual methods
.method public final ֫(Ll/ۚ᩹ۖ;)Z
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Z

    const/4 v1, 0x0

    aput-boolean v1, v0, v1

    .line 24
    new-instance v2, Ll/ۤۙۖ;

    invoke-direct {v2, v0}, Ll/ۤۙۖ;-><init>([Z)V

    .line 11
    iget-object p1, p1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    .line 14
    invoke-virtual {p1}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۙۖ;

    .line 16
    invoke-virtual {v2, v3}, Ll/᩶᩹ۖ;->֫(Ll/֫ۙۖ;)Ll/֫ۙۖ;

    goto :goto_0

    .line 128
    :cond_0
    aget-boolean p1, v0, v1

    return p1
.end method
