.class public abstract Ll/ۛۘᩴ;
.super Ll/ۤۘᩴ;
.source "YC5H"

# interfaces
.implements Ll/۫᩵ᩴ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x44907a65b4c385f2L


# virtual methods
.method public synthetic compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۙ᩵ᩴ;->֫(Ll/۫᩵ᩴ;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

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
    invoke-static {p0, p1, p2}, Ll/ۙ᩵ᩴ;->ۧ(Ll/۫᩵ᩴ;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 152
    invoke-interface {p0}, Ll/۫᩵ᩴ;->ۢۧ()Ll/ᩴۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 365
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    if-nez v0, :cond_1

    goto :goto_0

    .line 366
    :cond_1
    check-cast p1, Ljava/util/Map;

    .line 367
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p0}, Ll/ۤۘᩴ;->size()I

    move-result v1

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 368
    :cond_2
    invoke-interface {p0}, Ll/۫᩵ᩴ;->ۢۧ()Ll/ᩴۚᩴ;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public synthetic forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺۬ᩴ;->$default$forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 223
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p2

    :cond_1
    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 356
    invoke-virtual {p0}, Ll/ۤۘᩴ;->size()I

    move-result v0

    .line 357
    invoke-static {p0}, Ll/ۛ᩵ᩴ;->֫(Ll/۫᩵ᩴ;)Ll/۫֡ᩴ;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_0

    .line 358
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩵ᩴ;

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
    invoke-static {p0, p1, p2, p3}, Ll/ۙ᩵ᩴ;->֫(Ll/۫᩵ᩴ;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 3

    .line 330
    instance-of v0, p1, Ll/۫᩵ᩴ;

    if-eqz v0, :cond_0

    .line 331
    check-cast p1, Ll/۫᩵ᩴ;

    invoke-static {p1}, Ll/ۛ᩵ᩴ;->֫(Ll/۫᩵ᩴ;)Ll/۫֡ᩴ;

    move-result-object p1

    .line 332
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 333
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩵ᩴ;

    .line 334
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v1, v0}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 337
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    .line 338
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    add-int/lit8 v1, v0, -0x1

    if-eqz v0, :cond_1

    .line 341
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 342
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v2, v0}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 242
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 243
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 244
    :cond_0
    invoke-interface {p0, p1, p2}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 260
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 261
    invoke-static {v0, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 262
    :cond_0
    invoke-interface {p0, p1}, Ll/۫᩵ᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 299
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1, p2}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 279
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 280
    invoke-static {v0, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 281
    :cond_0
    invoke-interface {p0, p1, p3}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public synthetic replaceAll(Ljava/util/function/BiFunction;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺۬ᩴ;->$default$replaceAll(Ljava/util/Map;Ljava/util/function/BiFunction;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 373
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    invoke-static {p0}, Ll/ۛ᩵ᩴ;->֫(Ll/۫᩵ᩴ;)Ll/۫֡ᩴ;

    move-result-object v1

    .line 375
    invoke-virtual {p0}, Ll/ۤۘᩴ;->size()I

    move-result v2

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v2, -0x1

    if-eqz v2, :cond_3

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    const-string v2, ", "

    .line 381
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩵ᩴ;

    .line 383
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "(this map)"

    if-ne p0, v5, :cond_1

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 384
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    const-string v5, "=>"

    .line 385
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-ne p0, v5, :cond_2

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 387
    :cond_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    move v2, v4

    goto :goto_0

    :cond_3
    const-string v1, "}"

    .line 389
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
