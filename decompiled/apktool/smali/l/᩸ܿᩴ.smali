.class public abstract Ll/᩸ܿᩴ;
.super Ljava/util/AbstractCollection;
.source "H1Q1"

# interfaces
.implements Ll/֨ۢᩴ;
.implements Ll/֨۬ᩴ;


# virtual methods
.method public add(I)Z
    .locals 0

    .line 48
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 34
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Ll/᩸ܿᩴ;->֫(Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 181
    instance-of v0, p1, Ll/֨ۢᩴ;

    if-eqz v0, :cond_0

    .line 182
    check-cast p1, Ll/֨ۢᩴ;

    invoke-virtual {p0, p1}, Ll/᩸ܿᩴ;->֫(Ll/֨ۢᩴ;)Z

    move-result p1

    return p1

    .line 184
    :cond_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 166
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/֨ۢᩴ;->contains(I)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 201
    instance-of v0, p1, Ll/֨ۢᩴ;

    if-eqz v0, :cond_0

    .line 202
    check-cast p1, Ll/֨ۢᩴ;

    invoke-virtual {p0, p1}, Ll/᩸ܿᩴ;->ۧ(Ll/֨ۢᩴ;)Z

    move-result p1

    return p1

    .line 204
    :cond_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۡᩴ;->֫(Ll/֨ۢᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public forEach(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 118
    invoke-interface {p0}, Ll/ܳۡᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܳ۫ᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1200
    invoke-interface {p0}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩸ܿᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 348
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 178
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/֨ۢᩴ;->ۖ(I)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 222
    instance-of v0, p1, Ll/֨ۢᩴ;

    if-eqz v0, :cond_0

    .line 223
    check-cast p1, Ll/֨ۢᩴ;

    invoke-virtual {p0, p1}, Ll/᩸ܿᩴ;->ܽ(Ll/֨ۢᩴ;)Z

    move-result p1

    return p1

    .line 225
    :cond_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public synthetic removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚۢᩴ;->֫(Ll/֨ۢᩴ;Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 246
    instance-of v0, p1, Ll/֨ۢᩴ;

    if-eqz v0, :cond_0

    .line 247
    check-cast p1, Ll/֨ۢᩴ;

    invoke-virtual {p0, p1}, Ll/᩸ܿᩴ;->ᩳ(Ll/֨ۢᩴ;)Z

    move-result p1

    return p1

    .line 249
    :cond_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩸ܿᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$spliterator(Ljava/util/Collection;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩸ܿᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final stream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 326
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    invoke-interface {p0}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v1

    .line 256
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v2, -0x1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    const-string v2, ", "

    .line 262
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    :goto_1
    invoke-interface {v1}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v2

    .line 264
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_0

    :cond_1
    const-string v1, "}"

    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/lang/Integer;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 154
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/֨ۢᩴ;->add(I)Z

    move-result p1

    return p1
.end method

.method public ֫(Ljava/util/function/IntPredicate;)Z
    .locals 3

    .line 270
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    invoke-interface {p0}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v0

    const/4 v1, 0x0

    .line 273
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 274
    invoke-interface {v0}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v2

    invoke-interface {p1, v2}, Ljava/util/function/IntPredicate;->test(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 275
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ֫(Ll/֨ۢᩴ;)Z
    .locals 2

    .line 169
    invoke-interface {p1}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩸ܿᩴ;->add(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public ۖ(I)Z
    .locals 2

    .line 72
    invoke-interface {p0}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v0

    .line 73
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v1

    if-ne p1, v1, :cond_0

    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۧ(Ll/֨ۢᩴ;)Z
    .locals 1

    .line 189
    invoke-interface {p1}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v0

    invoke-interface {p0, v0}, Ll/֨ۢᩴ;->contains(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public ܶ()[I
    .locals 6

    .line 127
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 128
    sget-object v0, Ll/᩵ۢᩴ;->ۧ:[I

    return-object v0

    .line 129
    :cond_0
    new-array v1, v0, [I

    .line 130
    invoke-interface {p0}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v2

    if-ltz v0, :cond_2

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v0, -0x1

    if-eqz v0, :cond_1

    .line 328
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v0, v3, 0x1

    invoke-interface {v2}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v5

    aput v5, v1, v3

    move v3, v0

    move v0, v4

    goto :goto_0

    :cond_1
    return-object v1

    .line 325
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The maximum number of elements ("

    const-string v3, ") is negative"

    .line 0
    invoke-static {v0, v2, v3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 325
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ܽ(Ll/֨ۢᩴ;)Z
    .locals 2

    .line 210
    invoke-interface {p1}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩸ܿᩴ;->ۖ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public ᩳ(Ll/֨ۢᩴ;)Z
    .locals 3

    .line 231
    invoke-interface {p0}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v2

    invoke-interface {p1, v2}, Ll/֨ۢᩴ;->contains(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 232
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
