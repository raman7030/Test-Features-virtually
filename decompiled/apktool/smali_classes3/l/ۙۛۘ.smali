.class public final Ll/ۙۛۘ;
.super Ll/᩺ۛۘ;
.source "Q8ZT"


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ܶ۬ۘ;)Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object p3

    const-class v0, Ll/ܿۚ֡;

    invoke-interface {p3, v0}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 27
    :cond_0
    invoke-interface {p3, p1, p2}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 4

    const-string v0, "cite"

    const-string v1, "dfn"

    const-string v2, "i"

    const-string v3, "em"

    .line 33
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
