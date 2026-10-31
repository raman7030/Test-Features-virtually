.class public final synthetic Ll/ܶᩴᩴ;
.super Ljava/lang/Object;
.source "T1LK"


# direct methods
.method public static ֫(Ll/᩸ᩴᩴ;Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 138
    invoke-interface {p0, p1}, Ll/᩸ᩴᩴ;->ۧ(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
