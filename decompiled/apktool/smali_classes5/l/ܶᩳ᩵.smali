.class public final Ll/ܶᩳ᩵;
.super Ll/᩷ܿ᩵;
.source "N673"


# virtual methods
.method public final b(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 1

    .line 990
    check-cast p1, Ll/֡۫ᩴ;

    .line 1028
    new-instance v0, Ll/ܶᩳ᩵;

    .line 996
    invoke-direct {v0, p1, p0}, Ll/᩷ܿ᩵;-><init>(Ll/֡۫ᩴ;Ll/᩷ܿ᩵;)V

    return-object v0
.end method

.method public final tryAdvance(Ljava/util/function/LongConsumer;)Z
    .locals 7

    .line 1001
    iget-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    iget-object v1, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 1002
    iput-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    .line 1005
    :goto_0
    move-object v2, v1

    check-cast v2, Ll/֡۫ᩴ;

    invoke-interface {v2, p0}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 1006
    invoke-virtual {p0}, Ll/ۨܿ᩵;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll/᩷ܿ᩵;->e:Ljava/util/function/LongPredicate;

    iget-wide v5, p0, Ll/᩷ܿ᩵;->f:J

    .line 1007
    invoke-interface {v4, v5, v6}, Ljava/util/function/LongPredicate;->test(J)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    .line 1016
    iget-object v0, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1017
    :cond_1
    iget-wide v0, p0, Ll/᩷ܿ᩵;->f:J

    invoke-interface {p1, v0, v1}, Ljava/util/function/LongConsumer;->accept(J)V

    :cond_2
    return v2

    .line 1022
    :cond_3
    check-cast v1, Ll/֡۫ᩴ;

    invoke-interface {v1, p1}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result p1

    return p1
.end method
