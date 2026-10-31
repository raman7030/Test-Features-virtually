.class public abstract Ll/ۚ᩺ᩴ;
.super Ll/۫᩺ᩴ;
.source "N673"

# interfaces
.implements Ll/֡ܰᩴ;


# direct methods
.method public static u0(Ll/ܶ۫ᩴ;)Ll/۠ۨᩴ;
    .locals 1

    .line 116
    instance-of v0, p0, Ll/۠ۨᩴ;

    if-eqz v0, :cond_0

    .line 117
    check-cast p0, Ll/۠ۨᩴ;

    return-object p0

    .line 119
    :cond_0
    sget-boolean p0, Ll/ۨᩳ᩵;->a:Z

    if-eqz p0, :cond_1

    .line 120
    const-class p0, Ll/۫᩺ᩴ;

    const-string v0, "using DoubleStream.adapt(Spliterator<Double> s)"

    invoke-static {p0, v0}, Ll/ۨᩳ᩵;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 122
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "DoubleStream.adapt(Spliterator<Double> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Ll/ܿ֨ᩴ;)Ll/֡ܰᩴ;
    .locals 3

    .line 261
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    new-instance v0, Ll/᩸ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final allMatch(Ljava/util/function/DoublePredicate;)Z
    .locals 1

    .line 524
    sget-object v0, Ll/᩶ᩳ᩵;->ALL:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->Z(Ll/᩶ᩳ᩵;Ljava/util/function/DoublePredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava/util/function/DoublePredicate;)Z
    .locals 1

    .line 519
    sget-object v0, Ll/᩶ᩳ᩵;->ANY:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->Z(Ll/᩶ᩳ᩵;Ljava/util/function/DoublePredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final average()Ll/ۙ۫ᩴ;
    .locals 7

    .line 467
    new-instance v0, Ll/ۘ֫᩵;

    const/16 v1, 0x8

    .line 0
    invoke-direct {v0, v1}, Ll/ۘ֫᩵;-><init>(I)V

    .line 467
    new-instance v1, Ll/ۧۧ᩵;

    const/4 v2, 0x6

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 467
    new-instance v2, Ll/ۧۧ᩵;

    const/4 v3, 0x7

    .line 0
    invoke-direct {v2, v3}, Ll/ۧۧ᩵;-><init>(I)V

    .line 467
    invoke-virtual {p0, v0, v1, v2}, Ll/ۚ᩺ᩴ;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjDoubleConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    const/4 v1, 0x2

    .line 479
    aget-wide v2, v0, v1

    const-wide/16 v4, 0x0

    cmpl-double v6, v2, v4

    if-lez v6, :cond_1

    .line 480
    sget-object v2, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    const/4 v2, 0x0

    .line 761
    aget-wide v2, v0, v2

    const/4 v4, 0x1

    aget-wide v5, v0, v4

    add-double/2addr v2, v5

    .line 762
    array-length v5, v0

    sub-int/2addr v5, v4

    aget-wide v4, v0, v5

    .line 763
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v6

    if-eqz v6, :cond_0

    move-wide v2, v4

    .line 480
    :cond_0
    aget-wide v4, v0, v1

    div-double/2addr v2, v4

    .line 113
    new-instance v0, Ll/ۙ۫ᩴ;

    invoke-direct {v0, v2, v3}, Ll/ۙ۫ᩴ;-><init>(D)V

    return-object v0

    .line 481
    :cond_1
    sget-object v0, Ll/ۙ۫ᩴ;->c:Ll/ۙ۫ᩴ;

    return-object v0
.end method

.method public final boxed()Ll/ܿ᩺ᩴ;
    .locals 4

    .line 199
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0xa

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 170
    new-instance v1, Ll/ۡᩳ᩵;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v0, v2}, Ll/ۡᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v1
.end method

.method public final c0(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;
    .locals 0

    .line 166
    invoke-static {p1, p2}, Ll/ۡ᩺ᩴ;->O(J)Ll/ܺܿ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final collect(Ljava/util/function/Supplier;Ljava/util/function/ObjDoubleConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 6

    .line 509
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    new-instance v2, Ll/᩹ܽ᩵;

    const/4 v0, 0x0

    invoke-direct {v2, p3, v0}, Ll/᩹ܽ᩵;-><init>(Ljava/util/function/BiConsumer;I)V

    .line 731
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 751
    new-instance p3, Ll/᩺ܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->DOUBLE_VALUE:Ll/ۡ֫᩵;

    const/4 v5, 0x1

    move-object v0, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺ܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 514
    invoke-virtual {p0, p3}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 2

    .line 770
    new-instance v0, Ll/۠۟ᩴ;

    const/4 v1, 0x1

    .line 899
    invoke-direct {v0, v1}, Ll/۠۟ᩴ;-><init>(I)V

    .line 486
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ll/֡ܰᩴ;
    .locals 3

    .line 400
    invoke-virtual {p0}, Ll/ۚ᩺ᩴ;->boxed()Ll/ܿ᩺ᩴ;

    move-result-object v0

    check-cast v0, Ll/ۨ֫᩵;

    invoke-virtual {v0}, Ll/ۨ֫᩵;->distinct()Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۧۧ᩵;

    const/16 v2, 0xb

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 400
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToDouble(Ljava/util/function/ToDoubleFunction;)Ll/֡ܰᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final dropWhile(Ljava/util/function/DoublePredicate;)Ll/֡ܰᩴ;
    .locals 3

    .line 388
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 558
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 622
    new-instance v0, Ll/ۘ۟ᩴ;

    sget v1, Ll/ۜܳ᩵;->b:I

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Ll/ۘ۟ᩴ;-><init>(Ll/ۚ᩺ᩴ;ILjava/util/function/DoublePredicate;I)V

    return-object v0
.end method

.method public final filter(Ljava/util/function/DoublePredicate;)Ll/֡ܰᩴ;
    .locals 3

    .line 321
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    new-instance v0, Ll/᩸ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->t:I

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final findAny()Ll/ۙ۫ᩴ;
    .locals 1

    .line 93
    sget-object v0, Ll/ܿ۟ᩴ;->d:Ll/۫ܰᩴ;

    .line 539
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ۫ᩴ;

    return-object v0
.end method

.method public final findFirst()Ll/ۙ۫ᩴ;
    .locals 1

    .line 93
    sget-object v0, Ll/ܿ۟ᩴ;->c:Ll/۫ܰᩴ;

    .line 534
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ۫ᩴ;

    return-object v0
.end method

.method public forEach(Ljava/util/function/DoubleConsumer;)V
    .locals 2

    .line 116
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    new-instance v0, Ll/ۘۧ᩵;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۘۧ᩵;-><init>(Ljava/util/function/DoubleConsumer;Z)V

    .line 407
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public forEachOrdered(Ljava/util/function/DoubleConsumer;)V
    .locals 2

    .line 116
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    new-instance v0, Ll/ۘۧ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll/ۘۧ᩵;-><init>(Ljava/util/function/DoubleConsumer;Z)V

    .line 412
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public final h()Ll/ᩴۧ᩵;
    .locals 3

    const/4 v0, 0x0

    .line 244
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    new-instance v0, Ll/ۢܿ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x0

    .line 91
    invoke-direct {v0, p0, v1, v2}, Ll/ۢܿ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method

.method public final i()Ll/ۧ᩺ᩴ;
    .locals 3

    const/4 v0, 0x0

    .line 227
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    new-instance v0, Ll/ܰᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x0

    .line 91
    invoke-direct {v0, p0, v1, v2}, Ll/ܰᩳ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 555
    invoke-virtual {p0}, Ll/ۚ᩺ᩴ;->iterator()Ll/֫ۛᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/֫ۛᩴ;
    .locals 2

    .line 187
    invoke-virtual {p0}, Ll/ۚ᩺ᩴ;->spliterator()Ll/۠ۨᩴ;

    move-result-object v0

    .line 802
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 831
    new-instance v1, Ll/ۗ۫ᩴ;

    invoke-direct {v1, v0}, Ll/ۗ۫ᩴ;-><init>(Ll/۠ۨᩴ;)V

    return-object v1
.end method

.method public final k0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 0

    .line 139
    invoke-static {p1, p2, p3}, Ll/ۡ᩺ᩴ;->I(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Z)Ll/۠᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final l0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z
    .locals 3

    .line 157
    invoke-static {p1}, Ll/ۚ᩺ᩴ;->u0(Ll/ܶ۫ᩴ;)Ll/۠ۨᩴ;

    move-result-object p1

    .line 98
    instance-of v0, p2, Ljava/util/function/DoubleConsumer;

    if-eqz v0, :cond_0

    .line 99
    move-object v0, p2

    check-cast v0, Ljava/util/function/DoubleConsumer;

    goto :goto_0

    .line 101
    :cond_0
    sget-boolean v0, Ll/ۨᩳ᩵;->a:Z

    if-nez v0, :cond_3

    .line 104
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۨ۫ᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Ll/ۨ۫ᩴ;-><init>(Ljava/util/function/Consumer;I)V

    .line 160
    :cond_1
    :goto_0
    invoke-interface {p2}, Ll/֡ᩳ᩵;->f()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1, v0}, Ll/۠ۨᩴ;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_2
    return v1

    .line 102
    :cond_3
    const-class p1, Ll/۫᩺ᩴ;

    const-string p2, "using DoubleStream.adapt(Sink<Double> s)"

    invoke-static {p1, p2}, Ll/ۨᩳ᩵;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final limit(J)Ll/֡ܰᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 366
    invoke-static {p0, v0, v1, p1, p2}, Ll/᩹ܰᩴ;->e(Ll/ۚ᩺ᩴ;JJ)Ll/᩶᩺ᩴ;

    move-result-object p1

    return-object p1

    .line 365
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m0()Ll/ۡ֫᩵;
    .locals 1

    .line 131
    sget-object v0, Ll/ۡ֫᩵;->DOUBLE_VALUE:Ll/ۡ֫᩵;

    return-object v0
.end method

.method public final map(Ljava/util/function/DoubleUnaryOperator;)Ll/֡ܰᩴ;
    .locals 3

    .line 204
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    new-instance v0, Ll/᩸ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final mapToObj(Ljava/util/function/DoubleFunction;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 221
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    sget v0, Ll/۟۟ᩴ;->p:I

    sget v1, Ll/۟۟ᩴ;->n:I

    or-int/2addr v0, v1

    .line 170
    new-instance v1, Ll/ۡᩳ᩵;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, p1, v2}, Ll/ۡᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v1
.end method

.method public final max()Ll/ۙ۫ᩴ;
    .locals 2

    .line 446
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0xd

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 446
    invoke-virtual {p0, v0}, Ll/ۚ᩺ᩴ;->reduce(Ljava/util/function/DoubleBinaryOperator;)Ll/ۙ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final min()Ll/ۙ۫ᩴ;
    .locals 2

    .line 441
    new-instance v0, Ll/ۧۧ᩵;

    const/4 v1, 0x5

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 441
    invoke-virtual {p0, v0}, Ll/ۚ᩺ᩴ;->reduce(Ljava/util/function/DoubleBinaryOperator;)Ll/ۙ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final noneMatch(Ljava/util/function/DoublePredicate;)Z
    .locals 1

    .line 529
    sget-object v0, Ll/᩶ᩳ᩵;->NONE:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->Z(Ll/᩶ᩳ᩵;Ljava/util/function/DoublePredicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final peek(Ljava/util/function/DoubleConsumer;)Ll/֡ܰᩴ;
    .locals 1

    .line 344
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    new-instance v0, Ll/᩸ᩳ᩵;

    invoke-direct {v0, p0, p1}, Ll/᩸ᩳ᩵;-><init>(Ll/ۚ᩺ᩴ;Ljava/util/function/DoubleConsumer;)V

    return-object v0
.end method

.method public final reduce(DLjava/util/function/DoubleBinaryOperator;)D
    .locals 2

    .line 633
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    new-instance v0, Ll/ۜ֫᩵;

    sget-object v1, Ll/ۡ֫᩵;->DOUBLE_VALUE:Ll/ۡ֫᩵;

    invoke-direct {v0, v1, p3, p1, p2}, Ll/ۜ֫᩵;-><init>(Ll/ۡ֫᩵;Ljava/util/function/DoubleBinaryOperator;D)V

    .line 497
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    return-wide p1
.end method

.method public final reduce(Ljava/util/function/DoubleBinaryOperator;)Ll/ۙ۫ᩴ;
    .locals 3

    .line 675
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    new-instance v0, Ll/ۢܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->DOUBLE_VALUE:Ll/ۡ֫᩵;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Ll/ۢܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;I)V

    .line 502
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ۫ᩴ;

    return-object p1
.end method

.method public final skip(J)Ll/֡ܰᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    .line 377
    invoke-static {p0, p1, p2, v0, v1}, Ll/᩹ܰᩴ;->e(Ll/ۚ᩺ᩴ;JJ)Ll/᩶᩺ᩴ;

    move-result-object p1

    return-object p1

    .line 372
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Ll/֡ܰᩴ;
    .locals 3

    .line 93
    new-instance v0, Ll/᩷ۧ᩵;

    .line 253
    sget v1, Ll/۟۟ᩴ;->q:I

    sget v2, Ll/۟۟ᩴ;->o:I

    or-int/2addr v1, v2

    .line 90
    invoke-direct {v0, p0, v1}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-object v0
.end method

.method public final spliterator()Ll/۠ۨᩴ;
    .locals 1

    .line 192
    invoke-super {p0}, Ll/۫᩺ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ᩺ᩴ;->u0(Ll/ܶ۫ᩴ;)Ll/۠ۨᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final sum()D
    .locals 6

    .line 425
    new-instance v0, Ll/ۘ֫᩵;

    const/16 v1, 0x9

    .line 0
    invoke-direct {v0, v1}, Ll/ۘ֫᩵;-><init>(I)V

    .line 425
    new-instance v1, Ll/ۧۧ᩵;

    const/16 v2, 0xe

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 425
    new-instance v2, Ll/ۧۧ᩵;

    const/4 v3, 0x4

    .line 0
    invoke-direct {v2, v3}, Ll/ۧۧ᩵;-><init>(I)V

    .line 425
    invoke-virtual {p0, v0, v1, v2}, Ll/ۚ᩺ᩴ;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjDoubleConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    .line 436
    sget-object v1, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    const/4 v1, 0x0

    .line 761
    aget-wide v1, v0, v1

    const/4 v3, 0x1

    aget-wide v4, v0, v3

    add-double/2addr v1, v4

    .line 762
    array-length v4, v0

    sub-int/2addr v4, v3

    aget-wide v3, v0, v4

    .line 763
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3, v4}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide v3

    :cond_0
    return-wide v1
.end method

.method public final summaryStatistics()Ll/۬ܳ᩵;
    .locals 4

    .line 491
    new-instance v0, Ll/ۘ֫᩵;

    const/4 v1, 0x0

    .line 0
    invoke-direct {v0, v1}, Ll/ۘ֫᩵;-><init>(I)V

    .line 491
    new-instance v1, Ll/ۧۧ᩵;

    const/16 v2, 0x8

    .line 0
    invoke-direct {v1, v2}, Ll/ۧۧ᩵;-><init>(I)V

    .line 491
    new-instance v2, Ll/ۧۧ᩵;

    const/16 v3, 0x9

    .line 0
    invoke-direct {v2, v3}, Ll/ۧۧ᩵;-><init>(I)V

    .line 491
    invoke-virtual {p0, v0, v1, v2}, Ll/ۚ᩺ᩴ;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjDoubleConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ܳ᩵;

    return-object v0
.end method

.method public final t0(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)Ll/ܶ۫ᩴ;
    .locals 1

    .line 146
    new-instance v0, Ll/֨ᩳ᩵;

    .line 444
    invoke-direct {v0, p1, p2, p3}, Ll/᩸֫᩵;-><init>(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)V

    return-object v0
.end method

.method public final takeWhile(Ljava/util/function/DoublePredicate;)Ll/֡ܰᩴ;
    .locals 3

    .line 383
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 234
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    new-instance v0, Ll/ۘ۟ᩴ;

    sget v1, Ll/ۜܳ᩵;->a:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, p1, v2}, Ll/ۘ۟ᩴ;-><init>(Ll/ۚ᩺ᩴ;ILjava/util/function/DoublePredicate;I)V

    return-object v0
.end method

.method public final toArray()[D
    .locals 2

    .line 544
    new-instance v0, Ll/ۧۧ᩵;

    const/16 v1, 0xc

    .line 0
    invoke-direct {v0, v1}, Ll/ۧۧ᩵;-><init>(I)V

    .line 544
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->j0(Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object v0

    check-cast v0, Ll/۠᩺ᩴ;

    invoke-static {v0}, Ll/ۡ᩺ᩴ;->T(Ll/۠᩺ᩴ;)Ll/۠᩺ᩴ;

    move-result-object v0

    .line 545
    invoke-interface {v0}, Ll/᩻۟ᩴ;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method
