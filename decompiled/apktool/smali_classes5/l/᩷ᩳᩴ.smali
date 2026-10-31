.class public final Ll/᩷ᩳᩴ;
.super Ljava/lang/Object;
.source "2E9"

# interfaces
.implements Ll/ۜᩳᩴ;
.implements Ll/᩸۬ᩴ;


# instance fields
.field public final synthetic ᩸:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ᩳᩴ;->᩸:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 107
    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/Float;

    .line 116
    iget-object v0, p0, Ll/᩷ᩳᩴ;->᩸:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final reversed()Ljava/util/Comparator;
    .locals 1

    .line 96
    new-instance v0, Ll/ۢᩳᩴ;

    invoke-direct {v0, p0}, Ll/ۢᩳᩴ;-><init>(Ll/ۜᩳᩴ;)V

    return-object v0
.end method

.method public final synthetic thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ᩳᩴ;->֫(Ll/ۜᩳᩴ;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic thenComparing(Ljava/util/function/Function;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic thenComparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic thenComparingDouble(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparingDouble(Ljava/util/Comparator;Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic thenComparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparingInt(Ljava/util/Comparator;Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public synthetic thenComparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparingLong(Ljava/util/Comparator;Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(FF)I
    .locals 1

    .line 110
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget-object v0, p0, Ll/᩷ᩳᩴ;->᩸:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۜᩳᩴ;)Ll/ܳᩳᩴ;
    .locals 1

    .line 68
    new-instance v0, Ll/ܳᩳᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܳᩳᩴ;-><init>(Ll/ۜᩳᩴ;Ll/ۜᩳᩴ;)V

    return-object v0
.end method
