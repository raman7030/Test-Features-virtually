.class public final Ll/ᩳ֡ۖ;
.super Ljava/lang/Object;
.source "B9QZ"

# interfaces
.implements Ll/ۧ֡ۖ;


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 54
    check-cast p1, Ll/۟᩵ۖ;

    .line 55
    check-cast p2, Ll/۟᩵ۖ;

    .line 56
    invoke-virtual {p2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 57
    invoke-virtual {p1}, Ll/۟᩵ۖ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    invoke-virtual {p1}, Ll/۟᩵ۖ;->ܿ()Ll/۟᩵ۖ;

    move-result-object p1

    .line 60
    :cond_0
    invoke-virtual {p1, p2}, Ll/۟᩵ۖ;->֫(Ll/۟᩵ۖ;)V

    :cond_1
    return-object p1
.end method

.method public final ֫(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 73
    check-cast p2, Ll/۟᩵ۖ;

    .line 74
    check-cast p3, Ll/ۙ᩵ۖ;

    .line 76
    invoke-virtual {p2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p2}, Ll/۟᩵ۖ;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 81
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    invoke-static {p1}, Ll/ܳ᩷ۖ;->ܳ(I)I

    const/4 p1, 0x0

    .line 91
    throw p1
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 23
    check-cast p1, Ll/ۙ᩵ۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 18
    check-cast p1, Ll/۟᩵ۖ;

    return-object p1
.end method

.method public final ܳ(Ljava/lang/Object;)Z
    .locals 0

    .line 33
    check-cast p1, Ll/۟᩵ۖ;

    invoke-virtual {p1}, Ll/۟᩵ۖ;->֫()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ܽ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-static {}, Ll/۟᩵ۖ;->᩷()Ll/۟᩵ۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟᩵ۖ;->ܿ()Ll/۟᩵ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 38
    move-object v0, p1

    check-cast v0, Ll/۟᩵ۖ;

    invoke-virtual {v0}, Ll/۟᩵ۖ;->ܽ()V

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 28
    check-cast p1, Ll/۟᩵ۖ;

    return-object p1
.end method
