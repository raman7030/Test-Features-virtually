.class public final Ll/ܿᩳ۠;
.super Ll/ܳ֨۠;
.source "I7KX"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 1

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    .line 46
    iput v0, p0, Ll/ܿᩳ۠;->֫:I

    .line 49
    iput-object p1, p0, Ll/ܿᩳ۠;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ll/ۚۚ۠;Ll/ۖܶ۠;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 56
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 57
    new-instance v1, Ll/ᩳᩳ۠;

    invoke-direct {v1, v0}, Ll/ᩳᩳ۠;-><init>(Ljava/util/HashMap;)V

    invoke-static {p1, v1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 58
    new-instance p1, Ll/ܿᩳ۠;

    invoke-direct {p1, v0}, Ll/ܿᩳ۠;-><init>(Ljava/util/HashMap;)V

    .line 59
    invoke-virtual {p0, p1}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    .line 60
    iget p0, p1, Ll/ܿᩳ۠;->֫:I

    return p0
.end method

.method public static synthetic ֫(Ll/ܿᩳ۠;)Ljava/lang/Integer;
    .locals 0

    .line 111
    iget-object p0, p0, Ll/ܿᩳ۠;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/lang/Object;)V
    .locals 1

    .line 64
    iget v0, p0, Ll/ܿᩳ۠;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    invoke-static {p1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ܿᩳ۠;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ᩵۠;)V
    .locals 1

    .line 105
    iget-object v0, p1, Ll/ۛ᩵۠;->۫:Ll/ۛ֡֨;

    invoke-direct {p0, v0}, Ll/ܿᩳ۠;->֫(Ljava/lang/Object;)V

    .line 331
    iget-object p1, p1, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ܿᩳ۠;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/۟᩵۠;)V
    .locals 1

    .line 92
    iget-object p1, p1, Ll/۟᩵۠;->۬:Ll/ۛ֡֨;

    if-eqz p1, :cond_0

    .line 94
    iget-object v0, p0, Ll/ܿᩳ۠;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 96
    invoke-direct {p0, v0}, Ll/ܿᩳ۠;->֫(Ljava/lang/Object;)V

    return-void

    .line 100
    :cond_0
    invoke-direct {p0, p1}, Ll/ܿᩳ۠;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۢۚ۠;)V
    .locals 3

    .line 111
    iget-object v0, p1, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    new-instance v1, Ll/ᩴᩳ֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ᩴᩳ֨;-><init>(ILjava/lang/Object;)V

    iget-object v2, p0, Ll/ܿᩳ۠;->ۧ:Ljava/util/HashMap;

    invoke-static {v2, v0, v1}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 112
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۢۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/᩻֡۠;)V
    .locals 0

    .line 86
    iget-object p1, p1, Ll/᩻֡۠;->۬:Ljava/lang/Object;

    invoke-direct {p0, p1}, Ll/ܿᩳ۠;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/ۚۚ۠;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 72
    :cond_0
    invoke-static {p1}, Ll/۟ۚ۠;->᩸(Ll/ۚۚ۠;)Ll/ۚۚ۠;

    move-result-object p1

    .line 73
    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    if-eqz v0, :cond_1

    .line 74
    invoke-virtual {v0}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 76
    invoke-direct {p0, v0}, Ll/ܿᩳ۠;->֫(Ljava/lang/Object;)V

    return-void

    .line 80
    :cond_1
    invoke-virtual {p1}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܿᩳ۠;->֫(Ljava/lang/Object;)V

    .line 81
    invoke-virtual {p1, p0}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    return-void
.end method
