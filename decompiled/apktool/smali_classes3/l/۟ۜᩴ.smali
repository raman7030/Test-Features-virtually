.class public final Ll/۟ۜᩴ;
.super Ll/۫ۜᩴ;
.source "W1Z"

# interfaces
.implements Ll/ܰۜᩴ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 154
    sget-object v0, Ll/ۧ᩷ᩴ;->֫:Ll/۟ۜᩴ;

    return-object v0
.end method

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

    .line 243
    invoke-static {p0, p1}, Ll/ۗۜᩴ;->֫(Ll/۬ۜᩴ;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .line 42
    invoke-virtual {p0}, Ll/۟ۜᩴ;->entrySet()Ll/ᩴۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final entrySet()Ll/ᩴۚᩴ;
    .locals 1

    .line 157
    invoke-virtual {p0}, Ll/۟ۜᩴ;->ۜ()Ll/ᩴۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 169
    instance-of v0, p1, Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 170
    :cond_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

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
    invoke-static {p0, p1}, Ll/ۗۜᩴ;->ۧ(Ll/۬ۜᩴ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-object p2
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 93
    sget-object v0, Ll/۟ۡᩴ;->֫:Ll/᩺ۡᩴ;

    return-object v0
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
    check-cast p1, Ljava/lang/Integer;

    .line 171
    invoke-static {p0, p1, p2}, Ll/ۗۜᩴ;->֫(Ll/۬ۜᩴ;Ljava/lang/Integer;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0

    .line 134
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
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
    invoke-static {p0, p1}, Ll/ۗۜᩴ;->ܽ(Ll/۬ۜᩴ;Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 1

    const-string v0, "{}"

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 87
    sget-object v0, Ll/ۚۚᩴ;->֫:Ll/᩵ۚᩴ;

    return-object v0
.end method

.method public final ۜ()Ll/ᩴۚᩴ;
    .locals 1

    .line 87
    sget-object v0, Ll/ۚۚᩴ;->֫:Ll/᩵ۚᩴ;

    return-object v0
.end method
