.class public abstract Ll/ۛ᩺ᩴ;
.super Ll/۫᩺ᩴ;
.source "N673"

# interfaces
.implements Ll/ۧ᩺ᩴ;


# direct methods
.method public static u0(Ll/ܶ۫ᩴ;)Ll/ᩴ۫ᩴ;
    .locals 1

    .line 118
    instance-of v0, p0, Ll/ᩴ۫ᩴ;

    if-eqz v0, :cond_0

    .line 119
    check-cast p0, Ll/ᩴ۫ᩴ;

    return-object p0

    .line 122
    :cond_0
    sget-boolean p0, Ll/ۨᩳ᩵;->a:Z

    if-eqz p0, :cond_1

    .line 123
    const-class p0, Ll/۫᩺ᩴ;

    const-string v0, "using IntStream.adapt(Spliterator<Integer> s)"

    invoke-static {p0, v0}, Ll/ۨᩳ᩵;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 125
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "IntStream.adapt(Spliterator<Integer> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final allMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    .line 518
    sget-object v0, Ll/᩶ᩳ᩵;->ALL:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->a0(Ll/᩶ᩳ᩵;Ljava/util/function/IntPredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    .line 513
    sget-object v0, Ll/᩶ᩳ᩵;->ANY:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->a0(Ll/᩶ᩳ᩵;Ljava/util/function/IntPredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final asDoubleStream()Ll/֡ܰᩴ;
    .locals 3

    .line 218
    new-instance v0, Ll/᩺ܿ᩵;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 90
    invoke-direct {v0, p0, v1, v2}, Ll/᩺ܿ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method

.method public final asLongStream()Ll/ᩴۧ᩵;
    .locals 3

    .line 203
    new-instance v0, Ll/ۢܿ᩵;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 91
    invoke-direct {v0, p0, v1, v2}, Ll/ۢܿ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method

.method public final average()Ll/ۙ۫ᩴ;
    .locals 6

    .line 469
    new-instance v0, Ll/ۘ֫᩵;

    const/16 v1, 0xe

    .line 0
    invoke-direct {v0, v1}, Ll/ۘ֫᩵;-><init>(I)V

    .line 469
    new-instance v1, Ll/ۧۧ᩵;

    const/16 v2, 0x1c

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 469
    new-instance v2, Ll/ۧۧ᩵;

    const/16 v3, 0x1d

    .line 0
    invoke-direct {v2, v3}, Ll/ۧۧ᩵;-><init>(I)V

    .line 469
    invoke-virtual {p0, v0, v1, v2}, Ll/ۛ᩺ᩴ;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjIntConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    const/4 v1, 0x0

    .line 478
    aget-wide v1, v0, v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    const/4 v3, 0x1

    .line 479
    aget-wide v3, v0, v3

    long-to-double v3, v3

    long-to-double v0, v1

    div-double/2addr v3, v0

    .line 113
    new-instance v0, Ll/ۙ۫ᩴ;

    invoke-direct {v0, v3, v4}, Ll/ۙ۫ᩴ;-><init>(D)V

    return-object v0

    .line 480
    :cond_0
    sget-object v0, Ll/ۙ۫ᩴ;->c:Ll/ۙ۫ᩴ;

    return-object v0
.end method

.method public final boxed()Ll/ܿ᩺ᩴ;
    .locals 4

    .line 233
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0x16

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 174
    new-instance v1, Ll/ۡᩳ᩵;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v0, v2}, Ll/ۡᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v1
.end method

.method public final c0(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;
    .locals 0

    .line 170
    invoke-static {p1, p2}, Ll/ۡ᩺ᩴ;->X(J)Ll/᩹ܿ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final collect(Ljava/util/function/Supplier;Ljava/util/function/ObjIntConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 6

    .line 503
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    new-instance v2, Ll/᩹ܽ᩵;

    const/4 v0, 0x1

    invoke-direct {v2, p3, v0}, Ll/᩹ܽ᩵;-><init>(Ljava/util/function/BiConsumer;I)V

    .line 383
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    new-instance p3, Ll/᩺ܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->INT_VALUE:Ll/ۡ֫᩵;

    const/4 v5, 0x4

    move-object v0, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺ܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 508
    invoke-virtual {p0, p3}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 2

    .line 422
    new-instance v0, Ll/۠۟ᩴ;

    const/4 v1, 0x3

    .line 899
    invoke-direct {v0, v1}, Ll/۠۟ᩴ;-><init>(I)V

    .line 464
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ll/ۧ᩺ᩴ;
    .locals 3

    .line 432
    invoke-virtual {p0}, Ll/ۛ᩺ᩴ;->boxed()Ll/ܿ᩺ᩴ;

    move-result-object v0

    check-cast v0, Ll/ۨ֫᩵;

    invoke-virtual {v0}, Ll/ۨ֫᩵;->distinct()Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۧۧ᩵;

    const/16 v2, 0x15

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 432
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final dropWhile(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;
    .locals 2

    .line 420
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 408
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    new-instance v0, Ll/᩵᩺ᩴ;

    sget v1, Ll/ۜܳ᩵;->b:I

    invoke-direct {v0, p0, v1, p1}, Ll/᩵᩺ᩴ;-><init>(Ll/ۛ᩺ᩴ;ILjava/util/function/IntPredicate;)V

    return-object v0
.end method

.method public final filter(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;
    .locals 3

    .line 355
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    new-instance v0, Ll/۟ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->t:I

    const/4 v2, 0x3

    invoke-direct {v0, p0, v1, p1, v2}, Ll/۟ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final findAny()Ll/ᩳ۫ᩴ;
    .locals 1

    .line 71
    sget-object v0, Ll/᩵۟ᩴ;->d:Ll/۫ܰᩴ;

    .line 533
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ۫ᩴ;

    return-object v0
.end method

.method public final findFirst()Ll/ᩳ۫ᩴ;
    .locals 1

    .line 71
    sget-object v0, Ll/᩵۟ᩴ;->c:Ll/۫ܰᩴ;

    .line 528
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ۫ᩴ;

    return-object v0
.end method

.method public forEach(Ljava/util/function/IntConsumer;)V
    .locals 2

    .line 86
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v0, Ll/ۙۧ᩵;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۙۧ᩵;-><init>(Ljava/util/function/IntConsumer;Z)V

    .line 439
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public forEachOrdered(Ljava/util/function/IntConsumer;)V
    .locals 2

    .line 86
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v0, Ll/ۙۧ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll/ۙۧ᩵;-><init>(Ljava/util/function/IntConsumer;Z)V

    .line 444
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public final g(Ll/ܽۧ᩵;)Ll/ۧ᩺ᩴ;
    .locals 3

    .line 295
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    new-instance v0, Ll/۟ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, p1, v2}, Ll/۟ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 550
    invoke-virtual {p0}, Ll/ۛ᩺ᩴ;->iterator()Ll/ܳ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/ܳ۫ᩴ;
    .locals 2

    .line 191
    invoke-virtual {p0}, Ll/ۛ᩺ᩴ;->spliterator()Ll/ᩴ۫ᩴ;

    move-result-object v0

    .line 712
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    new-instance v1, Ll/ۛܳ᩵;

    invoke-direct {v1, v0}, Ll/ۛܳ᩵;-><init>(Ll/ᩴ۫ᩴ;)V

    return-object v1
.end method

.method public final k0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 0

    .line 142
    invoke-static {p1, p2, p3}, Ll/ۡ᩺ᩴ;->J(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Z)Ll/ۜܰᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final l0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z
    .locals 3

    .line 160
    invoke-static {p1}, Ll/ۛ᩺ᩴ;->u0(Ll/ܶ۫ᩴ;)Ll/ᩴ۫ᩴ;

    move-result-object p1

    .line 99
    instance-of v0, p2, Ljava/util/function/IntConsumer;

    if-eqz v0, :cond_0

    .line 100
    move-object v0, p2

    check-cast v0, Ljava/util/function/IntConsumer;

    goto :goto_0

    .line 103
    :cond_0
    sget-boolean v0, Ll/ۨᩳ᩵;->a:Z

    if-nez v0, :cond_3

    .line 106
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۛۛᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Ll/ۛۛᩴ;-><init>(Ljava/util/function/Consumer;I)V

    .line 163
    :cond_1
    :goto_0
    invoke-interface {p2}, Ll/֡ᩳ᩵;->f()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1, v0}, Ll/ᩴ۫ᩴ;->tryAdvance(Ljava/util/function/IntConsumer;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_2
    return v1

    .line 104
    :cond_3
    const-class p1, Ll/۫᩺ᩴ;

    const-string p2, "using IntStream.adapt(Sink<Integer> s)"

    invoke-static {p1, p2}, Ll/ۨᩳ᩵;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final limit(J)Ll/ۧ᩺ᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 400
    invoke-static {p0, v0, v1, p1, p2}, Ll/᩹ܰᩴ;->f(Ll/ۛ᩺ᩴ;JJ)Ll/۬ܿ᩵;

    move-result-object p1

    return-object p1

    .line 399
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m0()Ll/ۡ֫᩵;
    .locals 1

    .line 134
    sget-object v0, Ll/ۡ֫᩵;->INT_VALUE:Ll/ۡ֫᩵;

    return-object v0
.end method

.method public final map(Ljava/util/function/IntUnaryOperator;)Ll/ۧ᩺ᩴ;
    .locals 3

    .line 238
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    new-instance v0, Ll/۟ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Ll/۟ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final mapToDouble(Ljava/util/function/IntToDoubleFunction;)Ll/֡ܰᩴ;
    .locals 3

    .line 278
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    new-instance v0, Ll/᩸ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final mapToLong(Ljava/util/function/IntToLongFunction;)Ll/ᩴۧ᩵;
    .locals 3

    .line 261
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    new-instance v0, Ll/᩸ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ܿ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final mapToObj(Ljava/util/function/IntFunction;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 255
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    sget v0, Ll/۟۟ᩴ;->p:I

    sget v1, Ll/۟۟ᩴ;->n:I

    or-int/2addr v0, v1

    .line 174
    new-instance v1, Ll/ۡᩳ᩵;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v0, p1, v2}, Ll/ۡᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v1
.end method

.method public final max()Ll/ᩳ۫ᩴ;
    .locals 2

    .line 459
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0x1b

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 459
    invoke-virtual {p0, v0}, Ll/ۛ᩺ᩴ;->reduce(Ljava/util/function/IntBinaryOperator;)Ll/ᩳ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final min()Ll/ᩳ۫ᩴ;
    .locals 2

    .line 454
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0x17

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 454
    invoke-virtual {p0, v0}, Ll/ۛ᩺ᩴ;->reduce(Ljava/util/function/IntBinaryOperator;)Ll/ᩳ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final noneMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    .line 523
    sget-object v0, Ll/᩶ᩳ᩵;->NONE:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->a0(Ll/᩶ᩳ᩵;Ljava/util/function/IntPredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final peek(Ljava/util/function/IntConsumer;)Ll/ۧ᩺ᩴ;
    .locals 1

    .line 378
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    new-instance v0, Ll/۟ᩳ᩵;

    invoke-direct {v0, p0, p1}, Ll/۟ᩳ᩵;-><init>(Ll/ۛ᩺ᩴ;Ljava/util/function/IntConsumer;)V

    return-object v0
.end method

.method public final reduce(ILjava/util/function/IntBinaryOperator;)I
    .locals 2

    .line 285
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    new-instance v0, Ll/֡ܽ᩵;

    sget-object v1, Ll/ۡ֫᩵;->INT_VALUE:Ll/ۡ֫᩵;

    invoke-direct {v0, v1, p2, p1}, Ll/֡ܽ᩵;-><init>(Ll/ۡ֫᩵;Ljava/util/function/IntBinaryOperator;I)V

    .line 491
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final reduce(Ljava/util/function/IntBinaryOperator;)Ll/ᩳ۫ᩴ;
    .locals 3

    .line 327
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    new-instance v0, Ll/ۢܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->INT_VALUE:Ll/ۡ֫᩵;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p1, v2}, Ll/ۢܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;I)V

    .line 496
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ۫ᩴ;

    return-object p1
.end method

.method public final skip(J)Ll/ۧ᩺ᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    .line 410
    invoke-static {p0, p1, p2, v0, v1}, Ll/᩹ܰᩴ;->f(Ll/ۛ᩺ᩴ;JJ)Ll/۬ܿ᩵;

    move-result-object p1

    return-object p1

    .line 406
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Ll/ۧ᩺ᩴ;
    .locals 3

    .line 73
    new-instance v0, Ll/۠ۧ᩵;

    .line 171
    sget v1, Ll/۟۟ᩴ;->q:I

    sget v2, Ll/۟۟ᩴ;->o:I

    or-int/2addr v1, v2

    .line 91
    invoke-direct {v0, p0, v1}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-object v0
.end method

.method public final spliterator()Ll/ᩴ۫ᩴ;
    .locals 1

    .line 196
    invoke-super {p0}, Ll/۫᩺ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ۛ᩺ᩴ;->u0(Ll/ܶ۫ᩴ;)Ll/ᩴ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final sum()I
    .locals 2

    .line 449
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0x1a

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    const/4 v1, 0x0

    .line 449
    invoke-virtual {p0, v1, v0}, Ll/ۛ᩺ᩴ;->reduce(ILjava/util/function/IntBinaryOperator;)I

    move-result v0

    return v0
.end method

.method public final summaryStatistics()Ll/ۤܳ᩵;
    .locals 4

    .line 485
    new-instance v0, Ll/ۘ֫᩵;

    const/4 v1, 0x2

    .line 0
    invoke-direct {v0, v1}, Ll/ۘ֫᩵;-><init>(I)V

    .line 485
    new-instance v1, Ll/ۧۧ᩵;

    const/16 v2, 0x18

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 485
    new-instance v2, Ll/ۧۧ᩵;

    const/16 v3, 0x19

    .line 0
    invoke-direct {v2, v3}, Ll/ۧۧ᩵;-><init>(I)V

    .line 485
    invoke-virtual {p0, v0, v1, v2}, Ll/ۛ᩺ᩴ;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjIntConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤܳ᩵;

    return-object v0
.end method

.method public final t0(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)Ll/ܶ۫ᩴ;
    .locals 1

    .line 149
    new-instance v0, Ll/᩻ܿ᩵;

    .line 328
    invoke-direct {v0, p1, p2, p3}, Ll/᩸֫᩵;-><init>(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)V

    return-object v0
.end method

.method public final takeWhile(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;
    .locals 2

    .line 415
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 120
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    new-instance v0, Ll/᩻ܳ᩵;

    sget v1, Ll/ۜܳ᩵;->a:I

    invoke-direct {v0, p0, v1, p1}, Ll/᩻ܳ᩵;-><init>(Ll/ۛ᩺ᩴ;ILjava/util/function/IntPredicate;)V

    return-object v0
.end method

.method public final toArray()[I
    .locals 2

    .line 538
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0x14

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 538
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->j0(Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object v0

    check-cast v0, Ll/ۜܰᩴ;

    invoke-static {v0}, Ll/ۡ᩺ᩴ;->U(Ll/ۜܰᩴ;)Ll/ۜܰᩴ;

    move-result-object v0

    .line 539
    invoke-interface {v0}, Ll/᩻۟ᩴ;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
