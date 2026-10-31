.class public final synthetic Ll/ܳۛᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static $default$and(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 2

    .line 72
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    new-instance v0, Ll/ۚۛᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Ll/ۚۛᩴ;-><init>(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;I)V

    return-object v0
.end method

.method public static $default$negate(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 2

    .line 84
    new-instance v0, Ll/ܿ֨ᩴ;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static $default$or(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 2

    .line 104
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    new-instance v0, Ll/ۚۛᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/ۚۛᩴ;-><init>(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;I)V

    return-object v0
.end method
