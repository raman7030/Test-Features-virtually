.class public final Ll/ܰۛۘ;
.super Ll/۟۬ۘ;
.source "P904"


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    const-string v0, "s"

    const-string v1, "del"

    .line 59
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V
    .locals 3

    .line 44
    invoke-interface {p3}, Ll/ܶ۬ۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    invoke-interface {p3}, Ll/ܶ۬ۘ;->֫()Ll/֨۬ۘ;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/֨۬ۘ;)V

    .line 49
    :cond_0
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object p2

    .line 64
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object v1

    const-class v2, Ll/ۘᩴ֡;

    .line 66
    invoke-interface {v1, v2}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 70
    :cond_1
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    .line 51
    :goto_0
    invoke-interface {p3}, Ll/ܶ۬ۘ;->start()I

    move-result v0

    .line 52
    invoke-interface {p3}, Ll/ܶ۬ۘ;->end()I

    move-result p3

    .line 48
    invoke-static {p2, p1, v0, p3}, Ll/ᩳۙۘ;->֫(Ll/ᩳۙۘ;Ljava/lang/Object;II)V

    return-void
.end method
