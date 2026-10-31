.class public abstract Ll/᩶ۗܺ;
.super Ll/ۙۗܺ;
.source "C5PA"

# interfaces
.implements Ljava/util/Map;


# virtual methods
.method public final clear()V
    .locals 1

    .line 85
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 90
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 95
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1

    .line 126
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    .line 131
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 100
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 136
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 74
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    .line 116
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 106
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1

    .line 111
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 80
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 69
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    .line 121
    invoke-virtual {p0}, Ll/᩶ۗܺ;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 2

    .line 3661
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 132
    new-instance v1, Ll/ۧۤܺ;

    invoke-direct {v1, v0}, Ll/ۢۨܺ;-><init>(Ljava/util/Iterator;)V

    if-nez p1, :cond_1

    .line 182
    :cond_0
    invoke-virtual {v1}, Ll/ۢۨܺ;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 183
    invoke-virtual {v1}, Ll/ۢۨܺ;->next()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 188
    :cond_1
    invoke-virtual {v1}, Ll/ۢۨܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    invoke-virtual {v1}, Ll/ۢۨܺ;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Z
    .locals 0

    .line 276
    invoke-static {p0, p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract ܿ()Ljava/util/Map;
.end method

.method public final ᩻()I
    .locals 1

    .line 287
    invoke-virtual {p0}, Ll/᩶ۗܺ;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ܶۛܺ;->֫(Ljava/util/Set;)I

    move-result v0

    return v0
.end method
