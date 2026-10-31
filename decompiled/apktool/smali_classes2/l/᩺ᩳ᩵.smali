.class public final Ll/᩺ᩳ᩵;
.super Ll/᩷ܿ᩵;
.source "N673"


# virtual methods
.method public final b(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 1

    .line 948
    check-cast p1, Ll/֡۫ᩴ;

    .line 986
    new-instance v0, Ll/᩺ᩳ᩵;

    .line 954
    invoke-direct {v0, p1, p0}, Ll/᩷ܿ᩵;-><init>(Ll/֡۫ᩴ;Ll/᩷ܿ᩵;)V

    return-object v0
.end method

.method public final tryAdvance(Ljava/util/function/LongConsumer;)Z
    .locals 4

    .line 960
    iget-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 961
    invoke-virtual {p0}, Ll/ۨܿ᩵;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    check-cast v0, Ll/֡۫ᩴ;

    .line 962
    invoke-interface {v0, p0}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷ܿ᩵;->e:Ljava/util/function/LongPredicate;

    iget-wide v2, p0, Ll/᩷ܿ᩵;->f:J

    .line 963
    invoke-interface {v0, v2, v3}, Ljava/util/function/LongPredicate;->test(J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 964
    iget-wide v2, p0, Ll/᩷ܿ᩵;->f:J

    invoke-interface {p1, v2, v3}, Ljava/util/function/LongConsumer;->accept(J)V

    return v1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    const/4 p1, 0x0

    .line 969
    iput-boolean p1, p0, Ll/ۨܿ᩵;->c:Z

    if-nez v0, :cond_2

    .line 973
    iget-object v0, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_2
    return p1
.end method

.method public final trySplit()Ll/֡۫ᩴ;
    .locals 1

    .line 981
    iget-object v0, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-super {p0}, Ll/ۨܿ᩵;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/֡۫ᩴ;

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 948
    invoke-virtual {p0}, Ll/᩺ᩳ᩵;->trySplit()Ll/֡۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 948
    invoke-virtual {p0}, Ll/᩺ᩳ᩵;->trySplit()Ll/֡۫ᩴ;

    move-result-object v0

    return-object v0
.end method
