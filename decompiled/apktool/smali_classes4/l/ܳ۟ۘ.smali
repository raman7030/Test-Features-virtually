.class public final Ll/ܳ۟ۘ;
.super Ll/۟ܰۘ;
.source "PC84"

# interfaces
.implements Ll/ܿ۟ۘ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 163
    sget-object v0, Ll/᩻۟ۘ;->֫:Ll/ܳ۟ۘ;

    return-object v0
.end method

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
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    .line 203
    :cond_0
    check-cast p1, Ljava/lang/Character;

    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 150
    invoke-virtual {p0}, Ll/ܳ۟ۘ;->ۨ֫()Ll/ᩴۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 178
    instance-of v0, p1, Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 179
    :cond_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

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
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 104
    check-cast p2, Ljava/lang/Character;

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

    .line 97
    sget-object v0, Ll/۟ۧᩴ;->֫:Ll/᩺ۧᩴ;

    return-object v0
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
    .locals 0

    .line 143
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
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
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    .line 176
    :cond_0
    check-cast p1, Ljava/lang/Character;

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
    .locals 1

    const-string v0, "{}"

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 97
    sget-object v0, Ll/۟ۧᩴ;->֫:Ll/᩺ۧᩴ;

    return-object v0
.end method

.method public final ۨ֫()Ll/ᩴۚᩴ;
    .locals 1

    .line 87
    sget-object v0, Ll/ۚۚᩴ;->֫:Ll/᩵ۚᩴ;

    return-object v0
.end method
