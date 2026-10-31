.class public final Ll/᩺۟ᩴ;
.super Ll/ۨ֫᩵;
.source "N673"


# virtual methods
.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 1

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    if-nez v0, :cond_0

    .line 658
    invoke-virtual {p0}, Ll/۫᩺ᩴ;->s0()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void

    .line 661
    :cond_0
    invoke-super {p0, p1}, Ll/ۨ֫᩵;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachOrdered(Ljava/util/function/Consumer;)V
    .locals 1

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    if-nez v0, :cond_0

    .line 668
    invoke-virtual {p0}, Ll/۫᩺ᩴ;->s0()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void

    .line 671
    :cond_0
    invoke-super {p0, p1}, Ll/ۨ֫᩵;->forEachOrdered(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final p0()Z
    .locals 1

    .line 645
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 0

    .line 650
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final unordered()Ll/۫ۨᩴ;
    .locals 2

    .line 513
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    iget v1, p0, Ll/۫᩺ᩴ;->m:I

    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 153
    :cond_0
    new-instance v0, Ll/᩸ܰᩴ;

    sget v1, Ll/۟۟ᩴ;->r:I

    .line 94
    invoke-direct {v0, p0, v1}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-object v0
.end method
