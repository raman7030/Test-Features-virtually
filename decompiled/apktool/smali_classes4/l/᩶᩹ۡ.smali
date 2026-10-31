.class public final Ll/᩶᩹ۡ;
.super Ljava/lang/Object;
.source "A7JN"


# static fields
.field public static ֫:Ljava/lang/ref/SoftReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Ljava/lang/ref/SoftReference;

    new-instance v1, Ll/᩹᩹ۡ;

    invoke-direct {v1}, Ll/᩹᩹ۡ;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/᩶᩹ۡ;->֫:Ljava/lang/ref/SoftReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/ܶ᩹ۡ;
    .locals 3

    .line 82
    invoke-static {}, Ll/᩶᩹ۡ;->֫()Ll/᩹᩹ۡ;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ll/᩹᩹ۡ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 86
    :cond_0
    new-instance p1, Ll/ᩴ᩹ۡ;

    invoke-direct {p1}, Ll/ᩴ᩹ۡ;-><init>()V

    .line 87
    invoke-static {p0}, Ll/ܳ۬;->֫(Ljava/lang/String;)[Ll/ܿ۬;

    move-result-object p0

    iput-object p0, p1, Ll/ۚ᩹ۡ;->ۧ:[Ll/ܿ۬;

    const/high16 p0, -0x1000000

    .line 88
    invoke-static {p0}, Ll/ᩴۗ;->֫(I)Ll/᩻ۗ;

    move-result-object p0

    iput-object p0, p1, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    const/4 p0, 0x0

    .line 89
    invoke-static {p0}, Ll/ᩴۗ;->֫(I)Ll/᩻ۗ;

    move-result-object p0

    iput-object p0, p1, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

    .line 91
    new-instance p0, Ll/ܶ᩹ۡ;

    invoke-direct {p0}, Ll/ܶ᩹ۡ;-><init>()V

    .line 92
    iget-object v0, p0, Ll/ܶ᩹ۡ;->۫:Ll/۠᩹ۡ;

    iget-object v0, v0, Ll/۠᩹ۡ;->ܺ:Ll/֨᩹ۡ;

    const/high16 v1, 0x41c00000    # 24.0f

    .line 93
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v2

    int-to-float v2, v2

    iput v2, v0, Ll/֨᩹ۡ;->֫:F

    iput v2, v0, Ll/֨᩹ۡ;->ۧ:F

    .line 94
    iput v1, v0, Ll/֨᩹ۡ;->ۘ:F

    iput v1, v0, Ll/֨᩹ۡ;->ᩴ:F

    .line 95
    iget-object v0, v0, Ll/֨᩹ۡ;->ۢ:Ll/᩵᩹ۡ;

    iget-object v0, v0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public static ֫()Ll/᩹᩹ۡ;
    .locals 2

    .line 72
    sget-object v0, Ll/᩶᩹ۡ;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩹ۡ;

    if-nez v0, :cond_0

    .line 74
    new-instance v0, Ll/᩹᩹ۡ;

    invoke-direct {v0}, Ll/᩹᩹ۡ;-><init>()V

    .line 75
    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Ll/᩶᩹ۡ;->֫:Ljava/lang/ref/SoftReference;

    :cond_0
    return-object v0
.end method

.method public static ۧ()Ljava/util/List;
    .locals 3

    .line 100
    invoke-static {}, Ll/᩶᩹ۡ;->֫()Ll/᩹᩹ۡ;

    move-result-object v0

    invoke-static {v0}, Ll/᩹᩹ۡ;->֫(Ll/᩹᩹ۡ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۖ۫᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/ۖ۫᩷;-><init>(I)V

    .line 101
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܳ֫֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ܳ֫֨;-><init>(I)V

    .line 102
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 103
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->sorted()Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 104
    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static ܽ()Ljava/util/List;
    .locals 3

    .line 108
    invoke-static {}, Ll/᩶᩹ۡ;->֫()Ll/᩹᩹ۡ;

    move-result-object v0

    invoke-static {v0}, Ll/᩹᩹ۡ;->֫(Ll/᩹᩹ۡ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩸᩹ۡ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩸᩹ۡ;-><init>(I)V

    .line 109
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܳ֫֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ܳ֫֨;-><init>(I)V

    .line 110
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 111
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->sorted()Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 112
    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
