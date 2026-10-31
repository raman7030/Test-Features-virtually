.class public final synthetic Ll/ܰۖᩴ;
.super Ljava/lang/Object;
.source "2BVX"

# interfaces
.implements Ll/֫ۘᩴ;
.implements Ljava/io/Serializable;
.implements Ll/᩸۬ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/֫ۘᩴ;

.field public final synthetic ᩹:Ll/֫ۘᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/֫ۘᩴ;Ll/֫ۘᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۖᩴ;->᩸:Ll/֫ۘᩴ;

    iput-object p2, p0, Ll/ܰۖᩴ;->᩹:Ll/֫ۘᩴ;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 32
    check-cast p1, Ljava/lang/Long;

    check-cast p2, Ljava/lang/Long;

    .line 58
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, Ll/ܰۖᩴ;->֫(JJ)I

    move-result p1

    return p1
.end method

.method public final reversed()Ljava/util/Comparator;
    .locals 1

    .line 96
    new-instance v0, Ll/ܽۘᩴ;

    invoke-direct {v0, p0}, Ll/ܽۘᩴ;-><init>(Ll/֫ۘᩴ;)V

    return-object v0
.end method

.method public final synthetic thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۟ۖᩴ;->֫(Ll/֫ۘᩴ;Ljava/util/Comparator;)Ljava/util/Comparator;

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

.method public final ֫(JJ)I
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܰۖᩴ;->᩸:Ll/֫ۘᩴ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/֫ۘᩴ;->֫(JJ)I

    move-result v0

    if-nez v0, :cond_0

    .line 70
    iget-object v0, p0, Ll/ܰۖᩴ;->᩹:Ll/֫ۘᩴ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/֫ۘᩴ;->֫(JJ)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public final ܽ(Ll/֫ۘᩴ;)Ll/ܰۖᩴ;
    .locals 1

    .line 68
    new-instance v0, Ll/ܰۖᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܰۖᩴ;-><init>(Ll/֫ۘᩴ;Ll/֫ۘᩴ;)V

    return-object v0
.end method
