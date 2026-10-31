.class public abstract Ll/᩺ۛۘ;
.super Ll/۟۬ۘ;
.source "S912"


# virtual methods
.method public abstract ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ܶ۬ۘ;)Ljava/lang/Object;
.end method

.method public final ֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V
    .locals 1

    .line 32
    invoke-interface {p3}, Ll/ܶ۬ۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-interface {p3}, Ll/ܶ۬ۘ;->֫()Ll/֨۬ۘ;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/֨۬ۘ;)V

    .line 36
    :cond_0
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object p2

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v0

    invoke-virtual {p0, p2, v0, p3}, Ll/᩺ۛۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ܶ۬ۘ;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 38
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object p1

    invoke-interface {p3}, Ll/ܶ۬ۘ;->start()I

    move-result v0

    invoke-interface {p3}, Ll/ܶ۬ۘ;->end()I

    move-result p3

    invoke-static {p1, p2, v0, p3}, Ll/ᩳۙۘ;->֫(Ll/ᩳۙۘ;Ljava/lang/Object;II)V

    :cond_1
    return-void
.end method
