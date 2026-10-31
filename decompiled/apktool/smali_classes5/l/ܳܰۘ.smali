.class public abstract Ll/ܳܰۘ;
.super Ll/ᩳܰۘ;
.source "J1DS"

# interfaces
.implements Ll/ܰ۟ۘ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x44907a65b4c385f2L


# virtual methods
.method public synthetic compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$compute(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$computeIfPresent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 203
    :cond_0
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-interface {p0, p1}, Ll/۬۟ۘ;->֫(C)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .line 42
    invoke-interface {p0}, Ll/ܰ۟ۘ;->entrySet()Ll/ᩴۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public entrySet()Ll/ᩴۚᩴ;
    .locals 1

    .line 157
    invoke-interface {p0}, Ll/ܰ۟ۘ;->ܳ()Ll/ᩴۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 381
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    if-nez v0, :cond_1

    goto :goto_0

    .line 382
    :cond_1
    check-cast p1, Ljava/util/Map;

    .line 383
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p0}, Ll/ᩳܰۘ;->size()I

    move-result v1

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 384
    :cond_2
    invoke-interface {p0}, Ll/ܰ۟ۘ;->ܳ()Ll/ᩴۚᩴ;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 277
    invoke-static {p0, p1}, Ll/᩺۬ᩴ;->$default$forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 185
    invoke-static {p0, p1}, Ll/ۗ۟ۘ;->֫(Ll/ᩳܰۘ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 309
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 4

    .line 372
    invoke-virtual {p0}, Ll/ᩳܰۘ;->size()I

    move-result v0

    .line 373
    invoke-static {p0}, Ll/ۧ֫ᩴ;->֫(Ll/ܰ۟ۘ;)Ll/۫֡ᩴ;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_0

    .line 374
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۟ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    move v0, v3

    goto :goto_0

    :cond_0
    return v2
.end method

.method public synthetic merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/᩺۬ᩴ;->$default$merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 42
    check-cast p1, Ljava/lang/Character;

    .line 171
    invoke-static {p0, p1, p2}, Ll/ۗ۟ۘ;->֫(Ll/ᩳܰۘ;Ljava/lang/Character;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 3

    .line 346
    instance-of v0, p1, Ll/ܰ۟ۘ;

    if-eqz v0, :cond_0

    .line 347
    check-cast p1, Ll/ܰ۟ۘ;

    invoke-static {p1}, Ll/ۧ֫ᩴ;->֫(Ll/ܰ۟ۘ;)Ll/۫֡ᩴ;

    move-result-object p1

    .line 348
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 349
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۟ۘ;

    .line 350
    invoke-interface {v0}, Ll/ۨ۟ۘ;->ܿ()C

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ll/ᩳܰۘ;->֫(CLjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 353
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    .line 354
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    add-int/lit8 v1, v0, -0x1

    if-eqz v0, :cond_1

    .line 357
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 358
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 171
    invoke-static {p0, v2, v0}, Ll/ۗ۟ۘ;->֫(Ll/ᩳܰۘ;Ljava/lang/Character;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public synthetic putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 199
    invoke-static {p0, p1}, Ll/ۗ۟ۘ;->ۧ(Ll/ᩳܰۘ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public synthetic replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 0
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

    .line 389
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    invoke-static {p0}, Ll/ۧ֫ᩴ;->֫(Ll/ܰ۟ۘ;)Ll/۫֡ᩴ;

    move-result-object v1

    .line 391
    invoke-virtual {p0}, Ll/ᩳܰۘ;->size()I

    move-result v2

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v2, -0x1

    if-eqz v2, :cond_2

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    const-string v2, ", "

    .line 397
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ۟ۘ;

    .line 399
    invoke-interface {v2}, Ll/ۨ۟ۘ;->ܿ()C

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "=>"

    .line 400
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-ne p0, v5, :cond_1

    const-string v2, "(this map)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 402
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    move v2, v4

    goto :goto_0

    :cond_2
    const-string v1, "}"

    .line 404
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(C)Z
.end method
