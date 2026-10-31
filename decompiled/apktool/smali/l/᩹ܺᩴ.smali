.class public abstract Ll/᩹ܺᩴ;
.super Ljava/util/AbstractCollection;
.source "EC53"

# interfaces
.implements Ll/ۨۖᩴ;
.implements Ll/֨۬ᩴ;


# virtual methods
.method public add(J)Z
    .locals 0

    .line 48
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 34
    check-cast p1, Ljava/lang/Long;

    .line 154
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Ll/ۨۖᩴ;->add(J)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 181
    instance-of v0, p1, Ll/ۨۖᩴ;

    if-eqz v0, :cond_0

    .line 182
    check-cast p1, Ll/ۨۖᩴ;

    invoke-virtual {p0, p1}, Ll/᩹ܺᩴ;->֫(Ll/ۨۖᩴ;)Z

    move-result p1

    return p1

    .line 184
    :cond_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 166
    :cond_0
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Ll/ۨۖᩴ;->ۢ(J)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 201
    instance-of v0, p1, Ll/ۨۖᩴ;

    if-eqz v0, :cond_0

    .line 202
    check-cast p1, Ll/ۨۖᩴ;

    invoke-virtual {p0, p1}, Ll/᩹ܺᩴ;->ۧ(Ll/ۨۖᩴ;)Z

    move-result p1

    return p1

    .line 204
    :cond_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public forEach(Ljava/util/function/Consumer;)V
    .locals 1

    .line 157
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    instance-of v0, p1, Ljava/util/function/LongConsumer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/function/LongConsumer;

    goto :goto_0

    :cond_0
    new-instance v0, Ll/ᩳۘᩴ;

    invoke-direct {v0, p1}, Ll/ᩳۘᩴ;-><init>(Ljava/util/function/Consumer;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/ܿۘᩴ;->forEach(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public forEach(Ljava/util/function/LongConsumer;)V
    .locals 1

    .line 118
    invoke-interface {p0}, Ll/ܿۘᩴ;->iterator()Ll/᩻ۘᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۜ۫ᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩹ܺᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

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

.method public final remove(Ljava/lang/Object;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 178
    :cond_0
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Ll/ۨۖᩴ;->᩷(J)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 222
    instance-of v0, p1, Ll/ۨۖᩴ;

    if-eqz v0, :cond_0

    .line 223
    check-cast p1, Ll/ۨۖᩴ;

    invoke-virtual {p0, p1}, Ll/᩹ܺᩴ;->ܽ(Ll/ۨۖᩴ;)Z

    move-result p1

    return p1

    .line 225
    :cond_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public removeIf(Ljava/util/function/Predicate;)Z
    .locals 1

    .line 256
    instance-of v0, p1, Ljava/util/function/LongPredicate;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/function/LongPredicate;

    goto :goto_0

    :cond_0
    new-instance v0, Ll/ۛۖᩴ;

    invoke-direct {v0, p1}, Ll/ۛۖᩴ;-><init>(Ljava/util/function/Predicate;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/ۨۖᩴ;->֫(Ljava/util/function/LongPredicate;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 246
    instance-of v0, p1, Ll/ۨۖᩴ;

    if-eqz v0, :cond_0

    .line 247
    check-cast p1, Ll/ۨۖᩴ;

    invoke-virtual {p0, p1}, Ll/᩹ܺᩴ;->ᩳ(Ll/ۨۖᩴ;)Z

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
    invoke-virtual {p0}, Ll/᩹ܺᩴ;->spliterator()Ll/ܶ۫ᩴ;

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
    invoke-virtual {p0}, Ll/᩹ܺᩴ;->stream()Ll/ܿ᩺ᩴ;

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
    .locals 7

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    invoke-interface {p0}, Ll/ۨۖᩴ;->iterator()Ll/᩻ۘᩴ;

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
    invoke-interface {v1}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v5

    .line 264
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

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

.method public ֫(Ljava/util/function/LongPredicate;)Z
    .locals 4

    .line 270
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    invoke-interface {p0}, Ll/ۨۖᩴ;->iterator()Ll/᩻ۘᩴ;

    move-result-object v0

    const/4 v1, 0x0

    .line 273
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 274
    invoke-interface {v0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v2

    invoke-interface {p1, v2, v3}, Ljava/util/function/LongPredicate;->test(J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 275
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ֫(Ll/ۨۖᩴ;)Z
    .locals 3

    .line 169
    invoke-interface {p1}, Ll/ۨۖᩴ;->iterator()Ll/᩻ۘᩴ;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Ll/᩹ܺᩴ;->add(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public ۧ(Ll/ۨۖᩴ;)Z
    .locals 2

    .line 189
    invoke-interface {p1}, Ll/ۨۖᩴ;->iterator()Ll/᩻ۘᩴ;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Ll/ۨۖᩴ;->ۢ(J)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public ܽ(Ll/ۨۖᩴ;)Z
    .locals 3

    .line 210
    invoke-interface {p1}, Ll/ۨۖᩴ;->iterator()Ll/᩻ۘᩴ;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v1

    invoke-interface {p0, v1, v2}, Ll/ۨۖᩴ;->᩷(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public ᩳ(Ll/ۨۖᩴ;)Z
    .locals 4

    .line 231
    invoke-interface {p0}, Ll/ۨۖᩴ;->iterator()Ll/᩻ۘᩴ;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v2

    invoke-interface {p1, v2, v3}, Ll/ۨۖᩴ;->ۢ(J)Z

    move-result v2

    if-nez v2, :cond_0

    .line 232
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
