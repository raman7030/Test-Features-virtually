.class public final Ll/ۘᩳۘ;
.super Ljava/lang/Object;
.source "W9J6"

# interfaces
.implements Ll/ᩴᩳۘ;


# virtual methods
.method public final ֫(J)Z
    .locals 3

    .line 24
    sget-object v0, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    invoke-virtual {v0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
