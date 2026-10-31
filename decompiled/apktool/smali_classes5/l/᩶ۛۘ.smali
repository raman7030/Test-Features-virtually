.class public final Ll/᩶ۛۘ;
.super Ll/۟۬ۘ;
.source "W8YJ"


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 1

    const-string v0, "blockquote"

    .line 45
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V
    .locals 2

    .line 26
    invoke-interface {p3}, Ll/ܶ۬ۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    invoke-interface {p3}, Ll/ܶ۬ۘ;->֫()Ll/֨۬ۘ;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/֨۬ۘ;)V

    .line 30
    :cond_0
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object v0

    const-class v1, Ll/᩺֡֡;

    invoke-interface {v0, v1}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 34
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v1

    .line 35
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    .line 36
    invoke-interface {p3}, Ll/ܶ۬ۘ;->start()I

    move-result p2

    .line 37
    invoke-interface {p3}, Ll/ܶ۬ۘ;->end()I

    move-result p3

    .line 33
    invoke-static {v1, p1, p2, p3}, Ll/ᩳۙۘ;->֫(Ll/ᩳۙۘ;Ljava/lang/Object;II)V

    :cond_1
    return-void
.end method
