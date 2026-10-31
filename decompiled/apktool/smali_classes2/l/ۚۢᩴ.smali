.class public final synthetic Ll/ۚۢᩴ;
.super Ljava/lang/Object;
.source "51QH"


# direct methods
.method public static ֫(Ll/֨ۢᩴ;Ljava/util/function/Predicate;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 256
    instance-of v0, p1, Ljava/util/function/IntPredicate;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/function/IntPredicate;

    goto :goto_0

    :cond_0
    new-instance v0, Ll/֡ۢᩴ;

    invoke-direct {v0, p1}, Ll/֡ۢᩴ;-><init>(Ljava/util/function/Predicate;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/֨ۢᩴ;->֫(Ljava/util/function/IntPredicate;)Z

    move-result p0

    return p0
.end method
