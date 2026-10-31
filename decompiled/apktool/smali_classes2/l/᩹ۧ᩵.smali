.class public final Ll/᩹ۧ᩵;
.super Ll/ۡܽ᩵;
.source "N673"


# virtual methods
.method public final b(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 1

    .line 1095
    check-cast p1, Ll/۠ۨᩴ;

    .line 1133
    new-instance v0, Ll/᩹ۧ᩵;

    .line 1101
    invoke-direct {v0, p1, p0}, Ll/ۡܽ᩵;-><init>(Ll/۠ۨᩴ;Ll/ۡܽ᩵;)V

    return-object v0
.end method

.method public final tryAdvance(Ljava/util/function/DoubleConsumer;)Z
    .locals 7

    .line 1106
    iget-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    iget-object v1, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 1107
    iput-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    .line 1110
    :goto_0
    move-object v2, v1

    check-cast v2, Ll/۠ۨᩴ;

    invoke-interface {v2, p0}, Ll/۠ۨᩴ;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 1111
    invoke-virtual {p0}, Ll/ۨܿ᩵;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll/ۡܽ᩵;->e:Ljava/util/function/DoublePredicate;

    iget-wide v5, p0, Ll/ۡܽ᩵;->f:D

    .line 1112
    invoke-interface {v4, v5, v6}, Ljava/util/function/DoublePredicate;->test(D)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    .line 1121
    iget-object v0, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1122
    :cond_1
    iget-wide v0, p0, Ll/ۡܽ᩵;->f:D

    invoke-interface {p1, v0, v1}, Ljava/util/function/DoubleConsumer;->accept(D)V

    :cond_2
    return v2

    .line 1127
    :cond_3
    check-cast v1, Ll/۠ۨᩴ;

    invoke-interface {v1, p1}, Ll/۠ۨᩴ;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result p1

    return p1
.end method
