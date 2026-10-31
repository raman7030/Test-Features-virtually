.class public final synthetic Ll/ۧ۟ۘ;
.super Ljava/lang/Object;
.source "AC0M"


# direct methods
.method public static ֫(Ll/ܿ۟ۘ;Ljava/lang/Character;Ljava/lang/Character;)Ljava/lang/Character;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 133
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    .line 134
    invoke-interface {p0, p1}, Ll/ܰܰۘ;->֫(C)Z

    move-result v0

    .line 135
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p2

    invoke-interface {p0, p1, p2}, Ll/ܰܰۘ;->֫(CC)C

    move-result p0

    if-eqz v0, :cond_0

    .line 136
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
