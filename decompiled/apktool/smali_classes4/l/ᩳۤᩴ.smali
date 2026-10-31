.class public final synthetic Ll/ᩳۤᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static synthetic compute(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/ܿۤᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ܿۤᩴ;

    invoke-interface {p0, p1, p2}, Ll/ܿۤᩴ;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Ll/ܽۤᩴ;->$default$compute(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Ll/ܿۤᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ܿۤᩴ;

    invoke-interface {p0, p1, p2}, Ll/ܿۤᩴ;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Ll/ܽۤᩴ;->$default$computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic forEach(Ljava/util/concurrent/ConcurrentMap;Ljava/util/function/BiConsumer;)V
    .locals 1

    instance-of v0, p0, Ll/ܿۤᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ܿۤᩴ;

    invoke-interface {p0, p1}, Ll/ܿۤᩴ;->forEach(Ljava/util/function/BiConsumer;)V

    return-void

    :cond_0
    invoke-static {p0, p1}, Ll/ܽۤᩴ;->$default$forEach(Ljava/util/concurrent/ConcurrentMap;Ljava/util/function/BiConsumer;)V

    return-void
.end method
