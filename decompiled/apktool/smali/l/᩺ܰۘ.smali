.class public final synthetic Ll/᩺ܰۘ;
.super Ljava/lang/Object;
.source "WBNS"


# direct methods
.method public static ֫(Ll/ۧܰۘ;Ljava/lang/Object;)Ljava/lang/Character;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    .line 150
    invoke-interface {p0, p1}, Ll/ܰܰۘ;->ۧ(C)C

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p0, p1}, Ll/ܰܰۘ;->֫(C)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0
.end method
