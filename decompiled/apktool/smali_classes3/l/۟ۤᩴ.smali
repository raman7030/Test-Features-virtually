.class public final enum Ll/۟ۤᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ljava/util/Comparator;
.implements Ll/᩸۬ᩴ;


# static fields
.field public static final enum INSTANCE:Ll/۟ۤᩴ;

.field public static final synthetic a:[Ll/۟ۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 48
    new-instance v0, Ll/۟ۤᩴ;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    .line 47
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    sput-object v0, Ll/۟ۤᩴ;->INSTANCE:Ll/۟ۤᩴ;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/۟ۤᩴ;

    aput-object v0, v1, v2

    .line 47
    sput-object v1, Ll/۟ۤᩴ;->a:[Ll/۟ۤᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۟ۤᩴ;
    .locals 1

    .line 47
    const-class v0, Ll/۟ۤᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۟ۤᩴ;

    return-object p0
.end method

.method public static values()[Ll/۟ۤᩴ;
    .locals 1

    .line 47
    sget-object v0, Ll/۟ۤᩴ;->a:[Ll/۟ۤᩴ;

    invoke-virtual {v0}, [Ll/۟ۤᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۟ۤᩴ;

    return-object v0
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 47
    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    .line 52
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final reversed()Ljava/util/Comparator;
    .locals 1

    .line 57
    invoke-static {}, Ll/۠۬ᩴ;->reverseOrder()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 0

    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic thenComparing(Ljava/util/function/Function;)Ljava/util/Comparator;
    .locals 0

    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic thenComparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 0

    invoke-static {p0, p1, p2}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic thenComparingDouble(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
    .locals 0

    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparingDouble(Ljava/util/Comparator;Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic thenComparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    .locals 0

    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparingInt(Ljava/util/Comparator;Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic thenComparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
    .locals 0

    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparingLong(Ljava/util/Comparator;Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object p1

    return-object p1
.end method
