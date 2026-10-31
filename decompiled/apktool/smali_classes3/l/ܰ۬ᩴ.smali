.class public final synthetic Ll/ܰ۬ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static synthetic compute(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2}, Ll/֫۫ᩴ;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p0, p1, p2}, Ll/ܽۤᩴ;->$default$compute(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$compute(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2}, Ll/֫۫ᩴ;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p0, p1, p2}, Ll/ܽۤᩴ;->$default$computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic computeIfPresent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2}, Ll/֫۫ᩴ;->computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p0, p1, p2}, Ll/ܽۤᩴ;->$default$computeIfPresent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$computeIfPresent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1}, Ll/֫۫ᩴ;->forEach(Ljava/util/function/BiConsumer;)V

    return-void

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p0, p1}, Ll/ܽۤᩴ;->$default$forEach(Ljava/util/concurrent/ConcurrentMap;Ljava/util/function/BiConsumer;)V

    return-void

    :cond_1
    invoke-static {p0, p1}, Ll/᩺۬ᩴ;->$default$forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public static getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2}, Ll/֫۫ᩴ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    .line 88
    invoke-interface {p0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    return-object p2

    .line 0
    :cond_2
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2, p3}, Ll/֫۫ᩴ;->merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p0, p1, p2, p3}, Ll/ܽۤᩴ;->$default$merge(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Ll/᩺۬ᩴ;->$default$merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2}, Ll/֫۫ᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2}, Ll/֫۫ᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2}, Ll/֫۫ᩴ;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Ll/᩺۬ᩴ;->$default$replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1, p2, p3}, Ll/֫۫ᩴ;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Ll/᩺۬ᩴ;->$default$replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic replaceAll(Ljava/util/Map;Ljava/util/function/BiFunction;)V
    .locals 1

    instance-of v0, p0, Ll/֫۫ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/֫۫ᩴ;

    invoke-interface {p0, p1}, Ll/֫۫ᩴ;->replaceAll(Ljava/util/function/BiFunction;)V

    return-void

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p0, p1}, Ll/ܽۤᩴ;->$default$replaceAll(Ljava/util/concurrent/ConcurrentMap;Ljava/util/function/BiFunction;)V

    return-void

    :cond_1
    invoke-static {p0, p1}, Ll/᩺۬ᩴ;->$default$replaceAll(Ljava/util/Map;Ljava/util/function/BiFunction;)V

    return-void
.end method
