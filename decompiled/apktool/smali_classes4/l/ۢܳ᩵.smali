.class public final Ll/ۢܳ᩵;
.super Ll/ۛ᩺ᩴ;
.source "N673"


# virtual methods
.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    if-nez v0, :cond_0

    .line 593
    invoke-virtual {p0}, Ll/۫᩺ᩴ;->s0()Ll/ܶ۫ᩴ;

    move-result-object v0

    .line 0
    invoke-static {v0}, Ll/ۛ᩺ᩴ;->u0(Ll/ܶ۫ᩴ;)Ll/ᩴ۫ᩴ;

    move-result-object v0

    .line 593
    invoke-interface {v0, p1}, Ll/ᩴ۫ᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void

    .line 596
    :cond_0
    invoke-super {p0, p1}, Ll/ۛ᩺ᩴ;->forEach(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final forEachOrdered(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    if-nez v0, :cond_0

    .line 603
    invoke-virtual {p0}, Ll/۫᩺ᩴ;->s0()Ll/ܶ۫ᩴ;

    move-result-object v0

    .line 0
    invoke-static {v0}, Ll/ۛ᩺ᩴ;->u0(Ll/ܶ۫ᩴ;)Ll/ᩴ۫ᩴ;

    move-result-object v0

    .line 603
    invoke-interface {v0, p1}, Ll/ᩴ۫ᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void

    .line 606
    :cond_0
    invoke-super {p0, p1}, Ll/ۛ᩺ᩴ;->forEachOrdered(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final p0()Z
    .locals 1

    .line 580
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final parallel()Ll/ۧ᩺ᩴ;
    .locals 2

    .line 311
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/۫᩺ᩴ;->r:Z

    return-object p0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 0

    .line 585
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final sequential()Ll/ۧ᩺ᩴ;
    .locals 2

    .line 304
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/۫᩺ᩴ;->r:Z

    return-object p0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 550
    invoke-virtual {p0}, Ll/ۛ᩺ᩴ;->spliterator()Ll/ᩴ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final unordered()Ll/۫ۨᩴ;
    .locals 3

    .line 513
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    iget v1, p0, Ll/۫᩺ᩴ;->m:I

    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 345
    :cond_0
    new-instance v0, Ll/ܰᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->r:I

    const/4 v2, 0x1

    .line 91
    invoke-direct {v0, p0, v1, v2}, Ll/ܰᩳ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method
