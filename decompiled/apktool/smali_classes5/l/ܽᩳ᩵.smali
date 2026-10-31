.class public final Ll/ܽᩳ᩵;
.super Ll/ܳ֫᩵;
.source "N673"


# virtual methods
.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 1

    .line 820
    iget-object v0, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    invoke-interface {v0, p1}, Ll/ۚ۟ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 821
    iget-object v0, p0, Ll/ܳ֫᩵;->b:Ll/ۚ۟ᩴ;

    invoke-interface {v0, p1}, Ll/ۚ۟ᩴ;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final j(JJLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 782
    iget-wide v0, p0, Ll/ܳ֫᩵;->c:J

    cmp-long v2, p3, v0

    if-nez v2, :cond_0

    return-object p0

    .line 828
    :cond_0
    iget-object v0, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    invoke-interface {v0}, Ll/ۚ۟ᩴ;->count()J

    move-result-wide v7

    cmp-long v0, p1, v7

    if-ltz v0, :cond_1

    sub-long v2, p1, v7

    sub-long v4, p3, v7

    .line 830
    iget-object v1, p0, Ll/ܳ֫᩵;->b:Ll/ۚ۟ᩴ;

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Ll/ۚ۟ᩴ;->j(JJLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    :cond_1
    cmp-long v0, p3, v7

    if-gtz v0, :cond_2

    .line 832
    iget-object v1, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Ll/ۚ۟ᩴ;->j(JJLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    .line 178
    :cond_2
    sget-object v0, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    .line 834
    iget-object v1, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    move-wide v2, p1

    move-wide v4, v7

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Ll/ۚ۟ᩴ;->j(JJLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    const-wide/16 v2, 0x0

    sub-long v4, p3, v7

    .line 835
    iget-object v1, p0, Ll/ܳ֫᩵;->b:Ll/ۚ۟ᩴ;

    invoke-interface/range {v1 .. v6}, Ll/ۚ۟ᩴ;->j(JJLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p2

    .line 834
    invoke-static {v0, p1, p2}, Ll/ۡ᩺ᩴ;->L(Ll/ۡ֫᩵;Ll/ۚ۟ᩴ;Ll/ۚ۟ᩴ;)Ll/ܳ֫᩵;

    move-result-object p1

    return-object p1
.end method

.method public final k([Ljava/lang/Object;I)V
    .locals 2

    .line 801
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    iget-object v0, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    invoke-interface {v0, p1, p2}, Ll/ۚ۟ᩴ;->k([Ljava/lang/Object;I)V

    .line 805
    invoke-interface {v0}, Ll/ۚ۟ᩴ;->count()J

    move-result-wide v0

    long-to-int v1, v0

    add-int/2addr p2, v1

    iget-object v0, p0, Ll/ܳ֫᩵;->b:Ll/ۚ۟ᩴ;

    invoke-interface {v0, p1, p2}, Ll/ۚ۟ᩴ;->k([Ljava/lang/Object;I)V

    return-void
.end method

.method public final m(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 5

    const-wide/32 v0, 0x7ffffff7

    .line 811
    iget-wide v2, p0, Ll/ܳ֫᩵;->c:J

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    long-to-int v0, v2

    .line 813
    invoke-interface {p1, v0}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 814
    invoke-virtual {p0, p1, v0}, Ll/ܽᩳ᩵;->k([Ljava/lang/Object;I)V

    return-object p1

    .line 812
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 796
    new-instance v0, Ll/᩻֫᩵;

    .line 1070
    invoke-direct {v0, p0}, Ll/ۚ֫᩵;-><init>(Ll/ۚ۟ᩴ;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    const-wide/16 v0, 0x20

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 841
    iget-wide v4, p0, Ll/ܳ֫᩵;->c:J

    cmp-long v6, v4, v0

    if-gez v6, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 842
    iget-object v1, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    aput-object v1, v0, v3

    iget-object v1, p0, Ll/ܳ֫᩵;->b:Ll/ۚ۟ᩴ;

    aput-object v1, v0, v2

    const-string v1, "ConcNode[%s.%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 844
    :cond_0
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    aput-object v0, v1, v3

    const-string v0, "ConcNode[size=%d]"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
