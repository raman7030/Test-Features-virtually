.class public final Ll/᩶ۤᩴ;
.super Ll/۟۫ᩴ;
.source "N673"

# interfaces
.implements Ll/֨۬ᩴ;


# static fields
.field public static final serialVersionUID:J = 0x1f364c905893293dL


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 4739
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 4742
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 4716
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 5

    .line 4770
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4772
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    iget-object v0, v0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    .line 4773
    new-instance v1, Ll/ܶۤᩴ;

    array-length v2, v0

    const/4 v3, 0x0

    array-length v4, v0

    invoke-direct {v1, v0, v2, v3, v4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 4774
    :goto_0
    invoke-virtual {v1}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4775
    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 4732
    iget-object v4, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    .line 4734
    iget-object v1, v4, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    array-length v0, v1

    move v3, v0

    .line 4735
    :goto_0
    new-instance v6, Ll/ۘۤᩴ;

    const/4 v5, 0x1

    move-object v0, v6

    move v2, v3

    .line 3470
    invoke-direct/range {v0 .. v5}, Ll/ۘۤᩴ;-><init>([Ll/֡ۤᩴ;IILl/ۧۤᩴ;I)V

    return-object v6
.end method

.method public final synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1

    invoke-static {p0}, Ll/֡۬ᩴ;->$default$parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 3

    if-eqz p1, :cond_1

    .line 4721
    invoke-virtual {p0}, Ll/᩶ۤᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    move-object v1, v0

    check-cast v1, Ll/᩻ۤᩴ;

    invoke-virtual {v1}, Ll/᩻ۤᩴ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4722
    move-object v2, v0

    check-cast v2, Ll/ۘۤᩴ;

    invoke-virtual {v2}, Ll/ۘۤᩴ;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4723
    invoke-virtual {v1}, Ll/᩻ۤᩴ;->remove()V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 4

    .line 4746
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4748
    invoke-virtual {p0}, Ll/᩶ۤᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    move-object v2, v0

    check-cast v2, Ll/᩻ۤᩴ;

    invoke-virtual {v2}, Ll/᩻ۤᩴ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4749
    move-object v3, v0

    check-cast v3, Ll/ۘۤᩴ;

    invoke-virtual {v3}, Ll/ۘۤᩴ;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4750
    invoke-virtual {v2}, Ll/᩻ۤᩴ;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
    .locals 6

    .line 4758
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    .line 1653
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1656
    iget-object v1, v0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1657
    new-instance v3, Ll/ܶۤᩴ;

    array-length v4, v1

    array-length v5, v1

    invoke-direct {v3, v1, v4, v2, v5}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 1658
    :cond_0
    :goto_0
    invoke-virtual {v3}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1659
    iget-object v4, v1, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 1660
    iget-object v1, v1, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    .line 1661
    invoke-interface {p1, v1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5, v1}, Ll/ۧۤᩴ;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Ll/᩶ۤᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 11

    .line 4763
    iget-object v0, p0, Ll/۟۫ᩴ;->a:Ll/ۧۤᩴ;

    .line 4764
    invoke-virtual {v0}, Ll/ۧۤᩴ;->j()J

    move-result-wide v1

    .line 4765
    iget-object v4, v0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-nez v4, :cond_0

    const/4 v0, 0x0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    array-length v0, v4

    move v7, v0

    .line 4766
    :goto_0
    new-instance v0, Ll/ᩴۤᩴ;

    const-wide/16 v5, 0x0

    cmp-long v3, v1, v5

    if-gez v3, :cond_1

    move-wide v8, v5

    goto :goto_1

    :cond_1
    move-wide v8, v1

    :goto_1
    const/4 v10, 0x1

    const/4 v6, 0x0

    move-object v3, v0

    move v5, v7

    invoke-direct/range {v3 .. v10}, Ll/ᩴۤᩴ;-><init>([Ll/֡ۤᩴ;IIIJI)V

    return-object v0
.end method

.method public final synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic stream()Ll/ܿ᩺ᩴ;
    .locals 1

    invoke-static {p0}, Ll/֡۬ᩴ;->$default$stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
