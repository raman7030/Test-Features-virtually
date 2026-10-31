.class public final synthetic Ll/ۘۛᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static $default$and(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;
    .locals 2

    .line 69
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance v0, Ll/۬ۛᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Ll/۬ۛᩴ;-><init>(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;I)V

    return-object v0
.end method

.method public static $default$negate(Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;
    .locals 2

    .line 81
    new-instance v0, Ll/ܿ֨ᩴ;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p0}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static $default$or(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;
    .locals 2

    .line 101
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    new-instance v0, Ll/۬ۛᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/۬ۛᩴ;-><init>(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;I)V

    return-object v0
.end method
