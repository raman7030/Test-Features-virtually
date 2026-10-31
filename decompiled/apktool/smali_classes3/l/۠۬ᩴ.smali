.class public final synthetic Ll/۠۬ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static $default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 2

    .line 214
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    new-instance v0, Ll/ۨۤᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/ۨۤᩴ;-><init>(Ljava/util/Comparator;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static $default$thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;
    .locals 0

    .line 265
    invoke-static {p1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static $default$thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 0

    .line 242
    invoke-static {p1, p2}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static $default$thenComparingDouble(Ljava/util/Comparator;Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
    .locals 2

    .line 530
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    new-instance v0, Ll/ܰ۫ᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/ܰ۫ᩴ;-><init>(ILjava/lang/Object;)V

    .line 322
    invoke-static {p0, v0}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static $default$thenComparingInt(Ljava/util/Comparator;Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    .locals 0

    .line 284
    invoke-static {p1}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static $default$thenComparingLong(Ljava/util/Comparator;Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
    .locals 0

    .line 303
    invoke-static {p1}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static comparing(Ljava/util/function/Function;)Ljava/util/Comparator;
    .locals 2

    .line 467
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    new-instance v0, Ll/ܰ۫ᩴ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/ܰ۫ᩴ;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 2

    .line 433
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    new-instance v0, Ll/ۨۤᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p0, v1}, Ll/ۨۤᩴ;-><init>(Ljava/util/Comparator;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    .locals 2

    .line 488
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    new-instance v0, Ll/ܰ۫ᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ܰ۫ᩴ;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
    .locals 2

    .line 509
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    new-instance v0, Ll/ܰ۫ᩴ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ܰ۫ᩴ;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static reverseOrder()Ljava/util/Comparator;
    .locals 1

    .line 339
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method
