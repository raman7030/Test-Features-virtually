.class public abstract Ll/᩵֫᩵;
.super Ll/۫᩺ᩴ;
.source "N673"

# interfaces
.implements Ll/ᩴۧ᩵;


# direct methods
.method public static u0(Ll/ܶ۫ᩴ;)Ll/֡۫ᩴ;
    .locals 1

    .line 117
    instance-of v0, p0, Ll/֡۫ᩴ;

    if-eqz v0, :cond_0

    .line 118
    check-cast p0, Ll/֡۫ᩴ;

    return-object p0

    .line 120
    :cond_0
    sget-boolean p0, Ll/ۨᩳ᩵;->a:Z

    if-eqz p0, :cond_1

    .line 121
    const-class p0, Ll/۫᩺ᩴ;

    const-string v0, "using LongStream.adapt(Spliterator<Long> s)"

    invoke-static {p0, v0}, Ll/ۨᩳ᩵;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 123
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "LongStream.adapt(Spliterator<Long> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Ll/ܿ֨ᩴ;)Ll/ᩴۧ᩵;
    .locals 3

    .line 277
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    new-instance v0, Ll/᩸ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ܿ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final allMatch(Ljava/util/function/LongPredicate;)Z
    .locals 1

    .line 501
    sget-object v0, Ll/᩶ᩳ᩵;->ALL:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->b0(Ll/᩶ᩳ᩵;Ljava/util/function/LongPredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava/util/function/LongPredicate;)Z
    .locals 1

    .line 496
    sget-object v0, Ll/᩶ᩳ᩵;->ANY:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->b0(Ll/᩶ᩳ᩵;Ljava/util/function/LongPredicate;)Ll/ۤܶᩴ;

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

    .line 200
    new-instance v0, Ll/᩺ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->n:I

    const/4 v2, 0x2

    .line 90
    invoke-direct {v0, p0, v1, v2}, Ll/᩺ܿ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method

.method public final average()Ll/ۙ۫ᩴ;
    .locals 6

    .line 447
    new-instance v0, Ll/ۘ֫᩵;

    const/16 v1, 0xf

    .line 0
    invoke-direct {v0, v1}, Ll/ۘ֫᩵;-><init>(I)V

    .line 447
    new-instance v1, Ll/᩻ܰᩴ;

    const/4 v2, 0x6

    .line 0
    invoke-direct {v1, v2}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 447
    new-instance v2, Ll/᩻ܰᩴ;

    const/4 v3, 0x7

    .line 0
    invoke-direct {v2, v3}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 447
    invoke-virtual {p0, v0, v1, v2}, Ll/᩵֫᩵;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjLongConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    const/4 v1, 0x0

    .line 456
    aget-wide v1, v0, v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    const/4 v3, 0x1

    .line 457
    aget-wide v3, v0, v3

    long-to-double v3, v3

    long-to-double v0, v1

    div-double/2addr v3, v0

    .line 113
    new-instance v0, Ll/ۙ۫ᩴ;

    invoke-direct {v0, v3, v4}, Ll/ۙ۫ᩴ;-><init>(D)V

    return-object v0

    .line 458
    :cond_0
    sget-object v0, Ll/ۙ۫ᩴ;->c:Ll/ۙ۫ᩴ;

    return-object v0
.end method

.method public final boxed()Ll/ܿ᩺ᩴ;
    .locals 4

    .line 215
    new-instance v0, Ll/᩻ܰᩴ;

    const/4 v1, 0x5

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 171
    new-instance v1, Ll/ۡᩳ᩵;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v0, v2}, Ll/ۡᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v1
.end method

.method public final c()Ll/֡ܰᩴ;
    .locals 3

    const/4 v0, 0x0

    .line 260
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    new-instance v0, Ll/᩺ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x3

    .line 90
    invoke-direct {v0, p0, v1, v2}, Ll/᩺ܿ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method

.method public final c0(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;
    .locals 0

    .line 167
    invoke-static {p1, p2}, Ll/ۡ᩺ᩴ;->Y(J)Ll/۟ܿ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final collect(Ljava/util/function/Supplier;Ljava/util/function/ObjLongConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 6

    .line 486
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    new-instance v2, Ll/᩹ܽ᩵;

    const/4 v0, 0x2

    invoke-direct {v2, p3, v0}, Ll/᩹ܽ᩵;-><init>(Ljava/util/function/BiConsumer;I)V

    .line 557
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    new-instance p3, Ll/᩺ܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->LONG_VALUE:Ll/ۡ֫᩵;

    const/4 v5, 0x0

    move-object v0, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺ܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 491
    invoke-virtual {p0, p3}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 2

    .line 596
    new-instance v0, Ll/۠۟ᩴ;

    const/4 v1, 0x0

    .line 899
    invoke-direct {v0, v1}, Ll/۠۟ᩴ;-><init>(I)V

    .line 463
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ll/ᩴۧ᩵;
    .locals 3

    .line 414
    invoke-virtual {p0}, Ll/᩵֫᩵;->boxed()Ll/ܿ᩺ᩴ;

    move-result-object v0

    check-cast v0, Ll/ۨ֫᩵;

    invoke-virtual {v0}, Ll/ۨ֫᩵;->distinct()Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩻ܰᩴ;

    const/4 v2, 0x2

    .line 0
    invoke-direct {v1, v2}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 414
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToLong(Ljava/util/function/ToLongFunction;)Ll/ᩴۧ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final dropWhile(Ljava/util/function/LongPredicate;)Ll/ᩴۧ᩵;
    .locals 2

    .line 402
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 483
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    new-instance v0, Ll/ۗܰᩴ;

    sget v1, Ll/ۜܳ᩵;->b:I

    invoke-direct {v0, p0, v1, p1}, Ll/ۗܰᩴ;-><init>(Ll/᩵֫᩵;ILjava/util/function/LongPredicate;)V

    return-object v0
.end method

.method public final filter(Ljava/util/function/LongPredicate;)Ll/ᩴۧ᩵;
    .locals 3

    .line 337
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    new-instance v0, Ll/᩸ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->t:I

    const/4 v2, 0x3

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ܿ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final findAny()Ll/۫۫ᩴ;
    .locals 1

    .line 82
    sget-object v0, Ll/۬۟ᩴ;->d:Ll/۫ܰᩴ;

    .line 516
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫۫ᩴ;

    return-object v0
.end method

.method public final findFirst()Ll/۫۫ᩴ;
    .locals 1

    .line 82
    sget-object v0, Ll/۬۟ᩴ;->c:Ll/۫ܰᩴ;

    .line 511
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫۫ᩴ;

    return-object v0
.end method

.method public forEach(Ljava/util/function/LongConsumer;)V
    .locals 2

    .line 101
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    new-instance v0, Ll/ۧܽ᩵;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۧܽ᩵;-><init>(Ljava/util/function/LongConsumer;Z)V

    .line 421
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public forEachOrdered(Ljava/util/function/LongConsumer;)V
    .locals 2

    .line 101
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    new-instance v0, Ll/ۧܽ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll/ۧܽ᩵;-><init>(Ljava/util/function/LongConsumer;Z)V

    .line 426
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 534
    invoke-virtual {p0}, Ll/᩵֫᩵;->iterator()Ll/ۜ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/ۜ۫ᩴ;
    .locals 2

    .line 188
    invoke-virtual {p0}, Ll/᩵֫᩵;->spliterator()Ll/֡۫ᩴ;

    move-result-object v0

    .line 757
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    new-instance v1, Ll/᩺ܳ᩵;

    invoke-direct {v1, v0}, Ll/᩺ܳ᩵;-><init>(Ll/֡۫ᩴ;)V

    return-object v1
.end method

.method public final k()Ll/ۧ᩺ᩴ;
    .locals 3

    const/4 v0, 0x0

    .line 243
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    new-instance v0, Ll/ܰᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x2

    .line 91
    invoke-direct {v0, p0, v1, v2}, Ll/ܰᩳ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method

.method public final k0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 0

    .line 140
    invoke-static {p1, p2, p3}, Ll/ۡ᩺ᩴ;->K(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Z)Ll/ۛܰᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final l0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z
    .locals 3

    .line 158
    invoke-static {p1}, Ll/᩵֫᩵;->u0(Ll/ܶ۫ᩴ;)Ll/֡۫ᩴ;

    move-result-object p1

    .line 99
    instance-of v0, p2, Ljava/util/function/LongConsumer;

    if-eqz v0, :cond_0

    .line 100
    move-object v0, p2

    check-cast v0, Ljava/util/function/LongConsumer;

    goto :goto_0

    .line 102
    :cond_0
    sget-boolean v0, Ll/ۨᩳ᩵;->a:Z

    if-nez v0, :cond_3

    .line 105
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܿۨᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Ll/ܿۨᩴ;-><init>(Ljava/util/function/Consumer;I)V

    .line 161
    :cond_1
    :goto_0
    invoke-interface {p2}, Ll/֡ᩳ᩵;->f()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1, v0}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_2
    return v1

    .line 103
    :cond_3
    const-class p1, Ll/۫᩺ᩴ;

    const-string p2, "using LongStream.adapt(Sink<Long> s)"

    invoke-static {p1, p2}, Ll/ۨᩳ᩵;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final limit(J)Ll/ᩴۧ᩵;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 382
    invoke-static {p0, v0, v1, p1, p2}, Ll/᩹ܰᩴ;->g(Ll/᩵֫᩵;JJ)Ll/ᩴܳ᩵;

    move-result-object p1

    return-object p1

    .line 381
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m0()Ll/ۡ֫᩵;
    .locals 1

    .line 132
    sget-object v0, Ll/ۡ֫᩵;->LONG_VALUE:Ll/ۡ֫᩵;

    return-object v0
.end method

.method public final map(Ljava/util/function/LongUnaryOperator;)Ll/ᩴۧ᩵;
    .locals 3

    .line 220
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    new-instance v0, Ll/᩸ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ܿ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final mapToObj(Ljava/util/function/LongFunction;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 237
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    sget v0, Ll/۟۟ᩴ;->p:I

    sget v1, Ll/۟۟ᩴ;->n:I

    or-int/2addr v0, v1

    .line 171
    new-instance v1, Ll/ۡᩳ᩵;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v0, p1, v2}, Ll/ۡᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v1
.end method

.method public final max()Ll/۫۫ᩴ;
    .locals 2

    .line 442
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0x8

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 442
    invoke-virtual {p0, v0}, Ll/᩵֫᩵;->reduce(Ljava/util/function/LongBinaryOperator;)Ll/۫۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final min()Ll/۫۫ᩴ;
    .locals 2

    .line 437
    new-instance v0, Ll/᩻ܰᩴ;

    const/4 v1, 0x1

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 437
    invoke-virtual {p0, v0}, Ll/᩵֫᩵;->reduce(Ljava/util/function/LongBinaryOperator;)Ll/۫۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final noneMatch(Ljava/util/function/LongPredicate;)Z
    .locals 1

    .line 506
    sget-object v0, Ll/᩶ᩳ᩵;->NONE:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->b0(Ll/᩶ᩳ᩵;Ljava/util/function/LongPredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final peek(Ljava/util/function/LongConsumer;)Ll/ᩴۧ᩵;
    .locals 1

    .line 360
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    new-instance v0, Ll/᩸ܿ᩵;

    invoke-direct {v0, p0, p1}, Ll/᩸ܿ᩵;-><init>(Ll/᩵֫᩵;Ljava/util/function/LongConsumer;)V

    return-object v0
.end method

.method public final reduce(JLjava/util/function/LongBinaryOperator;)J
    .locals 2

    .line 459
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    new-instance v0, Ll/᩸᩺ᩴ;

    sget-object v1, Ll/ۡ֫᩵;->LONG_VALUE:Ll/ۡ֫᩵;

    invoke-direct {v0, v1, p3, p1, p2}, Ll/᩸᩺ᩴ;-><init>(Ll/ۡ֫᩵;Ljava/util/function/LongBinaryOperator;J)V

    .line 474
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public final reduce(Ljava/util/function/LongBinaryOperator;)Ll/۫۫ᩴ;
    .locals 3

    .line 501
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    new-instance v0, Ll/ۢܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->LONG_VALUE:Ll/ۡ֫᩵;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Ll/ۢܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;I)V

    .line 479
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫۫ᩴ;

    return-object p1
.end method

.method public final skip(J)Ll/ᩴۧ᩵;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    .line 392
    invoke-static {p0, p1, p2, v0, v1}, Ll/᩹ܰᩴ;->g(Ll/᩵֫᩵;JJ)Ll/ᩴܳ᩵;

    move-result-object p1

    return-object p1

    .line 388
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Ll/ᩴۧ᩵;
    .locals 3

    .line 83
    new-instance v0, Ll/ۨۧ᩵;

    .line 212
    sget v1, Ll/۟۟ᩴ;->q:I

    sget v2, Ll/۟۟ᩴ;->o:I

    or-int/2addr v1, v2

    .line 91
    invoke-direct {v0, p0, v1}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-object v0
.end method

.method public final spliterator()Ll/֡۫ᩴ;
    .locals 1

    .line 193
    invoke-super {p0}, Ll/۫᩺ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩵֫᩵;->u0(Ll/ܶ۫ᩴ;)Ll/֡۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final sum()J
    .locals 3

    .line 432
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0x9

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    const-wide/16 v1, 0x0

    .line 432
    invoke-virtual {p0, v1, v2, v0}, Ll/᩵֫᩵;->reduce(JLjava/util/function/LongBinaryOperator;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final summaryStatistics()Ll/ۨܳ᩵;
    .locals 4

    .line 468
    new-instance v0, Ll/ۘ֫᩵;

    const/4 v1, 0x4

    .line 0
    invoke-direct {v0, v1}, Ll/ۘ֫᩵;-><init>(I)V

    .line 468
    new-instance v1, Ll/᩻ܰᩴ;

    const/4 v2, 0x0

    .line 0
    invoke-direct {v1, v2}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 468
    new-instance v2, Ll/᩻ܰᩴ;

    const/4 v3, 0x3

    .line 0
    invoke-direct {v2, v3}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 468
    invoke-virtual {p0, v0, v1, v2}, Ll/᩵֫᩵;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjLongConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨܳ᩵;

    return-object v0
.end method

.method public final t0(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)Ll/ܶ۫ᩴ;
    .locals 1

    .line 147
    new-instance v0, Ll/ۤܿ᩵;

    .line 386
    invoke-direct {v0, p1, p2, p3}, Ll/᩸֫᩵;-><init>(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)V

    return-object v0
.end method

.method public final takeWhile(Ljava/util/function/LongPredicate;)Ll/ᩴۧ᩵;
    .locals 2

    .line 397
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 177
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    new-instance v0, Ll/ᩳܰᩴ;

    sget v1, Ll/ۜܳ᩵;->a:I

    invoke-direct {v0, p0, v1, p1}, Ll/ᩳܰᩴ;-><init>(Ll/᩵֫᩵;ILjava/util/function/LongPredicate;)V

    return-object v0
.end method

.method public final toArray()[J
    .locals 2

    .line 521
    new-instance v0, Ll/᩻ܰᩴ;

    const/4 v1, 0x4

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 521
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->j0(Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object v0

    check-cast v0, Ll/ۛܰᩴ;

    invoke-static {v0}, Ll/ۡ᩺ᩴ;->V(Ll/ۛܰᩴ;)Ll/ۛܰᩴ;

    move-result-object v0

    .line 522
    invoke-interface {v0}, Ll/᩻۟ᩴ;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method
