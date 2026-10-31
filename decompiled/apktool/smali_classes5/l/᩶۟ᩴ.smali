.class public abstract Ll/᩶۟ᩴ;
.super Ll/᩹֫᩵;
.source "N673"

# interfaces
.implements Ll/֨۫ᩴ;


# virtual methods
.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 10

    .line 1105
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 1109
    :goto_0
    invoke-virtual {p0}, Ll/᩹֫᩵;->e()Ll/ܺ֫᩵;

    move-result-object v1

    sget-object v2, Ll/ܺ֫᩵;->NO_MORE:Ll/ܺ֫᩵;

    if-eq v1, v2, :cond_5

    .line 1110
    sget-object v2, Ll/ܺ֫᩵;->MAYBE_MORE:Ll/ܺ֫᩵;

    iget-object v3, p0, Ll/᩹֫᩵;->a:Ll/ܶ۫ᩴ;

    if-ne v1, v2, :cond_4

    .line 1112
    iget v1, p0, Ll/᩹֫᩵;->c:I

    if-nez v0, :cond_0

    .line 1113
    invoke-virtual {p0, v1}, Ll/᩶۟ᩴ;->j(I)Ll/᩺ۧ᩵;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    .line 1484
    iput v2, v0, Ll/᩺ۧ᩵;->b:I

    :goto_1
    const-wide/16 v4, 0x0

    move-wide v6, v4

    .line 1119
    :cond_1
    move-object v2, v3

    check-cast v2, Ll/֨۫ᩴ;

    invoke-interface {v2, v0}, Ll/֨۫ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    int-to-long v8, v1

    cmp-long v2, v6, v8

    if-ltz v2, :cond_1

    :cond_2
    cmp-long v1, v6, v4

    if-nez v1, :cond_3

    goto :goto_2

    .line 1122
    :cond_3
    invoke-virtual {p0, v6, v7}, Ll/᩹֫᩵;->a(J)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Ll/᩺ۧ᩵;->a(Ljava/lang/Object;J)V

    goto :goto_0

    .line 1126
    :cond_4
    check-cast v3, Ll/֨۫ᩴ;

    invoke-interface {v3, p1}, Ll/֨۫ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/DoubleConsumer;)V
    .locals 0

    .line 1205
    invoke-virtual {p0, p1}, Ll/᩶۟ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 1135
    invoke-virtual {p0, p1}, Ll/᩶۟ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 0

    .line 1170
    invoke-virtual {p0, p1}, Ll/᩶۟ᩴ;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract g(Ljava/lang/Object;)V
.end method

.method public final synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public abstract j(I)Ll/᩺ۧ᩵;
.end method

.method public final tryAdvance(Ljava/lang/Object;)Z
    .locals 5

    .line 1086
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1090
    :cond_0
    invoke-virtual {p0}, Ll/᩹֫᩵;->e()Ll/ܺ֫᩵;

    move-result-object v0

    sget-object v1, Ll/ܺ֫᩵;->NO_MORE:Ll/ܺ֫᩵;

    if-eq v0, v1, :cond_2

    .line 1091
    iget-object v0, p0, Ll/᩹֫᩵;->a:Ll/ܶ۫ᩴ;

    check-cast v0, Ll/֨۫ᩴ;

    invoke-interface {v0, p0}, Ll/֨۫ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x1

    .line 1093
    invoke-virtual {p0, v0, v1}, Ll/᩹֫᩵;->a(J)J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    .line 1094
    invoke-virtual {p0, p1}, Ll/᩶۟ᩴ;->g(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic tryAdvance(Ljava/util/function/DoubleConsumer;)Z
    .locals 0

    .line 1205
    invoke-virtual {p0, p1}, Ll/᩶۟ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic tryAdvance(Ljava/util/function/IntConsumer;)Z
    .locals 0

    .line 1135
    invoke-virtual {p0, p1}, Ll/᩶۟ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic tryAdvance(Ljava/util/function/LongConsumer;)Z
    .locals 0

    .line 1170
    invoke-virtual {p0, p1}, Ll/᩶۟ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
