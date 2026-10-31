.class public final synthetic Ll/ۙᩴᩴ;
.super Ljava/lang/Object;
.source "91N0"


# direct methods
.method public static ֫(Ll/۫ᩴᩴ;Ljava/lang/Object;Ll/ܳۢ᩷;)I
    .locals 2

    .line 451
    invoke-interface {p0, p1}, Ll/᩸ᩴᩴ;->ۧ(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_1

    .line 452
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 454
    :cond_0
    invoke-virtual {p2, p1}, Ll/ܳۢ᩷;->ۧ(Ljava/lang/Object;)I

    move-result p2

    .line 455
    invoke-interface {p0, p2, p1}, Ll/᩸ᩴᩴ;->֫(ILjava/lang/Object;)I

    return p2

    :cond_1
    :goto_0
    return v0
.end method

.method public static ֫(Ll/۫ᩴᩴ;Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 123
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    .line 124
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/᩸ᩴᩴ;->֫(ILjava/lang/Object;)I

    move-result p0

    if-eqz v0, :cond_0

    .line 125
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
