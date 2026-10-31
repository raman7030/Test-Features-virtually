.class public abstract Ll/ۨ֫᩵;
.super Ll/۫᩺ᩴ;
.source "N673"

# interfaces
.implements Ll/ܿ᩺ᩴ;


# virtual methods
.method public final allMatch(Ljava/util/function/Predicate;)Z
    .locals 1

    .line 533
    sget-object v0, Ll/᩶ᩳ᩵;->ALL:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->d0(Ll/᩶ᩳ᩵;Ljava/util/function/Predicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava/util/function/Predicate;)Z
    .locals 1

    .line 528
    sget-object v0, Ll/᩶ᩳ᩵;->ANY:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->d0(Ll/᩶ᩳ᩵;Ljava/util/function/Predicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final c0(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;
    .locals 0

    .line 133
    invoke-static {p1, p2, p3}, Ll/ۡ᩺ᩴ;->G(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final collect(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 7

    .line 208
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    new-instance v6, Ll/᩺ܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    const/4 v5, 0x3

    move-object v0, v6

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺ܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 589
    invoke-virtual {p0, v6}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final collect(Ll/ۨۨᩴ;)Ljava/lang/Object;
    .locals 7

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    if-eqz v0, :cond_1

    .line 571
    invoke-interface {p1}, Ll/ۨۨᩴ;->characteristics()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Ll/ۛۨᩴ;->CONCURRENT:Ll/ۛۨᩴ;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 513
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    iget v1, p0, Ll/۫᩺ᩴ;->m:I

    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    invoke-interface {p1}, Ll/ۨۨᩴ;->characteristics()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Ll/ۛۨᩴ;->UNORDERED:Ll/ۛۨᩴ;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 573
    :cond_0
    invoke-interface {p1}, Ll/ۨۨᩴ;->supplier()Ljava/util/function/Supplier;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    .line 574
    invoke-interface {p1}, Ll/ۨۨᩴ;->accumulator()Ljava/util/function/BiConsumer;

    move-result-object v1

    .line 575
    new-instance v2, Ll/ۤܶᩴ;

    const/4 v3, 0x7

    invoke-direct {v2, v3, v1, v0}, Ll/ۤܶᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Ll/ۨ֫᩵;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_0

    .line 157
    :cond_1
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۨᩴ;

    invoke-interface {v0}, Ll/ۨۨᩴ;->supplier()Ljava/util/function/Supplier;

    move-result-object v5

    .line 158
    invoke-interface {p1}, Ll/ۨۨᩴ;->accumulator()Ljava/util/function/BiConsumer;

    move-result-object v4

    .line 159
    invoke-interface {p1}, Ll/ۨۨᩴ;->combiner()Ljava/util/function/BinaryOperator;

    move-result-object v3

    .line 177
    new-instance v0, Ll/᩻ۧ᩵;

    sget-object v2, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    move-object v1, v0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Ll/᩻ۧ᩵;-><init>(Ll/ۡ֫᩵;Ljava/util/function/BinaryOperator;Ljava/util/function/BiConsumer;Ljava/util/function/Supplier;Ll/ۨۨᩴ;)V

    .line 578
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    .line 580
    :goto_0
    invoke-interface {p1}, Ll/ۨۨᩴ;->characteristics()Ljava/util/Set;

    move-result-object v1

    sget-object v2, Ll/ۛۨᩴ;->IDENTITY_FINISH:Ll/ۛۨᩴ;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 582
    :cond_2
    invoke-interface {p1}, Ll/ۨۨᩴ;->finisher()Ljava/util/function/Function;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 2

    .line 248
    new-instance v0, Ll/۠۟ᩴ;

    const/4 v1, 0x2

    .line 899
    invoke-direct {v0, v1}, Ll/۠۟ᩴ;-><init>(I)V

    .line 605
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ll/ܿ᩺ᩴ;
    .locals 3

    .line 56
    new-instance v0, Ll/ܺܽ᩵;

    sget v1, Ll/۟۟ᩴ;->m:I

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    .line 94
    invoke-direct {v0, p0, v1}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-object v0
.end method

.method public final dropWhile(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 490
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 332
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    new-instance v0, Ll/ۜܿ᩵;

    sget v1, Ll/ۜܳ᩵;->b:I

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Ll/ۜܿ᩵;-><init>(Ll/ۨ֫᩵;ILjava/util/function/Predicate;I)V

    return-object v0
.end method

.method public final f(Ll/ܿ֨ᩴ;)Ll/֡ܰᩴ;
    .locals 3

    .line 344
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    new-instance v0, Ll/᩸ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x6

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 163
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    new-instance v0, Ll/ۡᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->t:I

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, p1, v2}, Ll/ۡᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final findAny()Ll/ܽ۫ᩴ;
    .locals 1

    .line 60
    sget-object v0, Ll/ᩳ֫᩵;->d:Ll/۫ܰᩴ;

    .line 548
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۫ᩴ;

    return-object v0
.end method

.method public final findFirst()Ll/ܽ۫ᩴ;
    .locals 1

    .line 60
    sget-object v0, Ll/ᩳ֫᩵;->c:Ll/۫ܰᩴ;

    .line 543
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۫ᩴ;

    return-object v0
.end method

.method public final flatMap(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 255
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    new-instance v0, Ll/ܰܰᩴ;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Ll/ܰܰᩴ;-><init>(Ll/ۨ֫᩵;ILjava/util/function/Function;I)V

    return-object v0
.end method

.method public final flatMapToInt(Ljava/util/function/Function;)Ll/ۧ᩺ᩴ;
    .locals 3

    .line 300
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    new-instance v0, Ll/۟ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x5

    invoke-direct {v0, p0, v1, p1, v2}, Ll/۟ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public forEach(Ljava/util/function/Consumer;)V
    .locals 2

    .line 71
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    new-instance v0, Ll/ۖܽ᩵;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۖܽ᩵;-><init>(Ljava/util/function/Consumer;Z)V

    .line 497
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public forEachOrdered(Ljava/util/function/Consumer;)V
    .locals 2

    .line 71
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    new-instance v0, Ll/ۖܽ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll/ۖܽ᩵;-><init>(Ljava/util/function/Consumer;Z)V

    .line 502
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 141
    invoke-virtual {p0}, Ll/۫᩺ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩹۫ᩴ;->iterator(Ll/ܶ۫ᩴ;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final k0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 0

    .line 109
    invoke-static {p1, p2, p3, p4}, Ll/ۡ᩺ᩴ;->H(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ll/ܿ֨ᩴ;)Ll/ᩴۧ᩵;
    .locals 3

    .line 388
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    new-instance v0, Ll/᩸ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    sget v2, Ll/۟۟ᩴ;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x5

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ܿ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final l0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z
    .locals 2

    .line 127
    :cond_0
    invoke-interface {p2}, Ll/֡ᩳ᩵;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    return v0
.end method

.method public final limit(J)Ll/ܿ᩺ᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 470
    invoke-static {p0, v0, v1, p1, p2}, Ll/᩹ܰᩴ;->h(Ll/ۨ֫᩵;JJ)Ll/ܿܿ᩵;

    move-result-object p1

    return-object p1

    .line 469
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m0()Ll/ۡ֫᩵;
    .locals 1

    .line 101
    sget-object v0, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    return-object v0
.end method

.method public final map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 187
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    new-instance v0, Ll/ܰܰᩴ;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, p1, v2}, Ll/ܰܰᩴ;-><init>(Ll/ۨ֫᩵;ILjava/util/function/Function;I)V

    return-object v0
.end method

.method public final mapToDouble(Ljava/util/function/ToDoubleFunction;)Ll/֡ܰᩴ;
    .locals 3

    .line 238
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    new-instance v0, Ll/᩸ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x5

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;
    .locals 3

    .line 204
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    new-instance v0, Ll/۟ᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, p1, v2}, Ll/۟ᩳ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final mapToLong(Ljava/util/function/ToLongFunction;)Ll/ᩴۧ᩵;
    .locals 3

    .line 221
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    new-instance v0, Ll/᩸ܿ᩵;

    sget v1, Ll/۟۟ᩴ;->p:I

    sget v2, Ll/۟۟ᩴ;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x6

    invoke-direct {v0, p0, v1, p1, v2}, Ll/᩸ܿ᩵;-><init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final max(Ljava/util/Comparator;)Ll/ܽ۫ᩴ;
    .locals 2

    .line 73
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    new-instance v0, Ll/֨ۛᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/֨ۛᩴ;-><init>(Ljava/util/Comparator;I)V

    .line 594
    invoke-virtual {p0, v0}, Ll/ۨ֫᩵;->reduce(Ljava/util/function/BinaryOperator;)Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final min(Ljava/util/Comparator;)Ll/ܽ۫ᩴ;
    .locals 2

    .line 58
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    new-instance v0, Ll/֨ۛᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll/֨ۛᩴ;-><init>(Ljava/util/Comparator;I)V

    .line 599
    invoke-virtual {p0, v0}, Ll/ۨ֫᩵;->reduce(Ljava/util/function/BinaryOperator;)Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final noneMatch(Ljava/util/function/Predicate;)Z
    .locals 1

    .line 538
    sget-object v0, Ll/᩶ᩳ᩵;->NONE:Ll/᩶ᩳ᩵;

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->d0(Ll/᩶ᩳ᩵;Ljava/util/function/Predicate;)Ll/ۤܶᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final peek(Ljava/util/function/Consumer;)Ll/ܿ᩺ᩴ;
    .locals 1

    .line 433
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    new-instance v0, Ll/ۡᩳ᩵;

    invoke-direct {v0, p0, p1}, Ll/ۡᩳ᩵;-><init>(Ll/ۨ֫᩵;Ljava/util/function/Consumer;)V

    return-object v0
.end method

.method public final reduce(Ljava/lang/Object;Ljava/util/function/BiFunction;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;
    .locals 7

    .line 70
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    new-instance v6, Ll/᩺ܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    const/4 v5, 0x2

    move-object v0, v6

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺ܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 563
    invoke-virtual {p0, v6}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final reduce(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;
    .locals 7

    .line 70
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    new-instance v6, Ll/᩺ܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    const/4 v5, 0x2

    move-object v0, v6

    move-object v2, p2

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺ܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 553
    invoke-virtual {p0, v6}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final reduce(Ljava/util/function/BinaryOperator;)Ll/ܽ۫ᩴ;
    .locals 3

    .line 106
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    new-instance v0, Ll/ۢܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p1, v2}, Ll/ۢܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;I)V

    .line 558
    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ۫ᩴ;

    return-object p1
.end method

.method public final skip(J)Ll/ܿ᩺ᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    .line 480
    invoke-static {p0, p1, p2, v0, v1}, Ll/᩹ܰᩴ;->h(Ll/ۨ֫᩵;JJ)Ll/ܿܿ᩵;

    move-result-object p1

    return-object p1

    .line 476
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 51
    new-instance v0, Ll/ۜܽ᩵;

    invoke-direct {v0, p0}, Ll/ۜܽ᩵;-><init>(Ll/ۨ֫᩵;)V

    return-object v0
.end method

.method public final sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;
    .locals 1

    .line 63
    new-instance v0, Ll/ۜܽ᩵;

    invoke-direct {v0, p0, p1}, Ll/ۜܽ᩵;-><init>(Ll/ۨ֫᩵;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final t0(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)Ll/ܶ۫ᩴ;
    .locals 1

    .line 116
    new-instance v0, Ll/ۡۧ᩵;

    .line 275
    invoke-direct {v0, p1, p2, p3}, Ll/᩸֫᩵;-><init>(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)V

    return-object v0
.end method

.method public final takeWhile(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;
    .locals 3

    .line 485
    sget v0, Ll/ۜܳ᩵;->a:I

    .line 63
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    new-instance v0, Ll/ۜܿ᩵;

    sget v1, Ll/ۜܳ᩵;->a:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, p1, v2}, Ll/ۜܿ᩵;-><init>(Ll/ۨ֫᩵;ILjava/util/function/Predicate;I)V

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .line 523
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0x13

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 523
    invoke-virtual {p0, v0}, Ll/ۨ֫᩵;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 1

    .line 517
    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->j0(Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۡ᩺ᩴ;->S(Ll/ۚ۟ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object v0

    .line 518
    invoke-interface {v0, p1}, Ll/ۚ۟ᩴ;->m(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toList()Ljava/util/List;
    .locals 2

    .line 994
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/ۨ֫᩵;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
