.class public abstract Ll/ܽܰۘ;
.super Ll/ۧܰۘ;
.source "WCM1"

# interfaces
.implements Ll/ܿ۟ۘ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x44907a65b4c385f2L


# virtual methods
.method public final compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    .line 747
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$compute(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    return-object p1
.end method

.method public final computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    .line 721
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    return-object p1
.end method

.method public final computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    .line 734
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$computeIfPresent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    return-object p1
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 203
    :cond_0
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    move-object v0, p0

    check-cast v0, Ll/ۨܰۘ;

    invoke-virtual {v0, p1}, Ll/ۨܰۘ;->֫(C)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 254
    :cond_0
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    move-object v1, p0

    check-cast v1, Ll/ۨܰۘ;

    .line 463
    iget-object v2, v1, Ll/ۨܰۘ;->ۗ:[C

    .line 464
    iget v1, v1, Ll/ۨܰۘ;->ۙ:I

    :goto_0
    add-int/lit8 v3, v1, -0x1

    if-eqz v1, :cond_2

    aget-char v1, v2, v3

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 150
    move-object v0, p0

    check-cast v0, Ll/ۨܰۘ;

    invoke-virtual {v0}, Ll/ۨܰۘ;->ۨ֫()Ll/ᩴۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 379
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 380
    :cond_1
    check-cast p1, Ljava/util/Map;

    .line 381
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    move-object v2, p0

    check-cast v2, Ll/ۨܰۘ;

    .line 448
    iget v3, v2, Ll/ۨܰۘ;->ۙ:I

    if-eq v0, v3, :cond_2

    return v1

    .line 382
    :cond_2
    invoke-virtual {v2}, Ll/ۨܰۘ;->ۨ֫()Ll/ᩴۚᩴ;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast v0, Ljava/util/AbstractCollection;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 288
    invoke-static {p0, p1}, Ll/᩺۬ᩴ;->$default$forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Character;
    .locals 0

    .line 178
    invoke-static {p0, p1}, Ll/᩺ܰۘ;->֫(Ll/ۧܰۘ;Ljava/lang/Object;)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 178
    invoke-static {p0, p1}, Ll/᩺ܰۘ;->֫(Ll/ۧܰۘ;Ljava/lang/Object;)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p2, Ljava/lang/Character;

    .line 320
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    return-object p1
.end method

.method public final hashCode()I
    .locals 4

    .line 370
    move-object v0, p0

    check-cast v0, Ll/ۨܰۘ;

    .line 448
    iget v0, v0, Ll/ۨܰۘ;->ۙ:I

    .line 371
    invoke-static {p0}, Ll/᩻۟ۘ;->֫(Ll/ܿ۟ۘ;)Ll/۫֡ᩴ;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_0

    .line 372
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۟ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    move v0, v3

    goto :goto_0

    :cond_0
    return v2
.end method

.method public final merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    check-cast p2, Ljava/lang/Character;

    .line 760
    invoke-static {p0, p1, p2, p3}, Ll/᩺۬ᩴ;->$default$merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    return-object p1
.end method

.method public final synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    check-cast p2, Ljava/lang/Character;

    invoke-static {p0, p1, p2}, Ll/ۧ۟ۘ;->֫(Ll/ܿ۟ۘ;Ljava/lang/Character;Ljava/lang/Character;)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 3

    .line 344
    instance-of v0, p1, Ll/ܿ۟ۘ;

    if-eqz v0, :cond_0

    .line 345
    check-cast p1, Ll/ܿ۟ۘ;

    invoke-static {p1}, Ll/᩻۟ۘ;->֫(Ll/ܿ۟ۘ;)Ll/۫֡ᩴ;

    move-result-object p1

    .line 346
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 347
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۟ۘ;

    .line 348
    invoke-interface {v0}, Ll/ܽ۟ۘ;->ܿ()C

    move-result v1

    invoke-interface {v0}, Ll/ܽ۟ۘ;->ۡ()C

    move-result v0

    invoke-virtual {p0, v1, v0}, Ll/ۧܰۘ;->֫(CC)C

    goto :goto_0

    .line 351
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    .line 352
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    add-int/lit8 v1, v0, -0x1

    if-eqz v0, :cond_1

    .line 355
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 356
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-static {p0, v2, v0}, Ll/ۧ۟ۘ;->֫(Ll/ܿ۟ۘ;Ljava/lang/Character;Ljava/lang/Character;)Ljava/lang/Character;

    move v0, v1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    check-cast p2, Ljava/lang/Character;

    .line 669
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 176
    :cond_0
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    .line 177
    move-object v0, p0

    check-cast v0, Ll/ۨܰۘ;

    invoke-virtual {v0, p1}, Ll/ۨܰۘ;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Ll/ۨܰۘ;->ܿ(C)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 682
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    check-cast p2, Ljava/lang/Character;

    .line 708
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    return-object p1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 41
    check-cast p1, Ljava/lang/Character;

    check-cast p2, Ljava/lang/Character;

    check-cast p3, Ljava/lang/Character;

    .line 695
    invoke-static {p0, p1, p2, p3}, Ll/᩺۬ᩴ;->$default$replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public synthetic replaceAll(Ljava/util/function/BiFunction;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺۬ᩴ;->$default$replaceAll(Ljava/util/Map;Ljava/util/function/BiFunction;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 387
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    invoke-static {p0}, Ll/᩻۟ۘ;->֫(Ll/ܿ۟ۘ;)Ll/۫֡ᩴ;

    move-result-object v1

    .line 389
    move-object v2, p0

    check-cast v2, Ll/ۨܰۘ;

    .line 448
    iget v2, v2, Ll/ۨܰۘ;->ۙ:I

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

    .line 395
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ۟ۘ;

    .line 397
    invoke-interface {v2}, Ll/ܽ۟ۘ;->ܿ()C

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "=>"

    .line 398
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    invoke-interface {v2}, Ll/ܽ۟ۘ;->ۡ()C

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_0

    :cond_1
    const-string v1, "}"

    .line 401
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
