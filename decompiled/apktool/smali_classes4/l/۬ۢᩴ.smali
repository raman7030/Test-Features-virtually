.class public final Ll/۬ۢᩴ;
.super Ljava/lang/Object;
.source "4CFT"

# interfaces
.implements Ll/ۙۢᩴ;
.implements Ljava/io/Serializable;
.implements Ll/᩸۬ᩴ;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public final ᩸:Ll/ۙۢᩴ;


# direct methods
.method public constructor <init>(Ll/ۙۢᩴ;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Ll/۬ۢᩴ;->᩸:Ll/ۙۢᩴ;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 32
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    .line 58
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/۬ۢᩴ;->ۧ(II)I

    move-result p1

    return p1
.end method

.method public final reversed()Ljava/util/Comparator;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/۬ۢᩴ;->᩸:Ll/ۙۢᩴ;

    return-object v0
.end method

.method public final synthetic thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩶ۢᩴ;->֫(Ll/ۙۢᩴ;Ljava/util/Comparator;)Ljava/util/Comparator;

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

.method public final ֫(Ll/ۙۢᩴ;)Ll/᩹ۢᩴ;
    .locals 1

    .line 68
    new-instance v0, Ll/᩹ۢᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩹ۢᩴ;-><init>(Ll/ۙۢᩴ;Ll/ۙۢᩴ;)V

    return-object v0
.end method

.method public final ۧ(II)I
    .locals 1

    .line 79
    iget-object v0, p0, Ll/۬ۢᩴ;->᩸:Ll/ۙۢᩴ;

    invoke-interface {v0, p2, p1}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result p1

    return p1
.end method
