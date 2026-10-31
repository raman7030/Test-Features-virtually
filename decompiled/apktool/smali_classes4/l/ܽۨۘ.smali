.class public final Ll/ܽۨۘ;
.super Ll/۟۬ۘ;
.source "S91K"


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    const-string v0, "u"

    const-string v1, "ins"

    .line 42
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V
    .locals 1

    .line 27
    invoke-interface {p3}, Ll/ܶ۬ۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-interface {p3}, Ll/ܶ۬ۘ;->֫()Ll/֨۬ۘ;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/֨۬ۘ;)V

    .line 32
    :cond_0
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object p1

    new-instance p2, Landroid/text/style/UnderlineSpan;

    invoke-direct {p2}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 34
    invoke-interface {p3}, Ll/ܶ۬ۘ;->start()I

    move-result v0

    .line 35
    invoke-interface {p3}, Ll/ܶ۬ۘ;->end()I

    move-result p3

    .line 31
    invoke-static {p1, p2, v0, p3}, Ll/ᩳۙۘ;->֫(Ll/ᩳۙۘ;Ljava/lang/Object;II)V

    return-void
.end method
