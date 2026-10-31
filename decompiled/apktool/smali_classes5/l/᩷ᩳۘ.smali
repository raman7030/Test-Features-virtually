.class public final Ll/᩷ᩳۘ;
.super Ljava/lang/Object;
.source "623X"

# interfaces
.implements Ll/ᩴᩳۘ;


# virtual methods
.method public final ֫(J)Z
    .locals 3

    .line 82
    sget-object v0, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    invoke-virtual {v0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_1

    sget-object v0, Ll/۟۫ۖ;->᩸ۧ:Ll/۟۫ۖ;

    .line 83
    invoke-virtual {v0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
