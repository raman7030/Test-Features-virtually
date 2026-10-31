.class public final Ll/᩵ܽ۠;
.super Ljava/lang/Object;
.source "A451"


# instance fields
.field public ֫:Ll/ᩴܽ۠;

.field public ۧ:Ll/ۛ֡֨;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ll/۫ۧ۠;)V
    .locals 2

    .line 3227
    sget-object v0, Ll/ܺ֫۠;->֫:[I

    iget-object v1, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 3236
    sget-object p2, Ll/ᩴܽ۠;->ۗ:Ll/ᩴܽ۠;

    goto :goto_0

    .line 3230
    :cond_0
    invoke-static {p2}, Ll/۫ۧ۠;->֫(Ll/۫ۧ۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܺܽ۠;

    invoke-direct {v1, p2}, Ll/ܺܽ۠;-><init>(Ll/۫ۧ۠;)V

    .line 3231
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/ۖܽ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3232
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/ۘܽ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3233
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->reduce(Ljava/util/function/BinaryOperator;)Ll/ܽ۫ᩴ;

    move-result-object p2

    sget-object v0, Ll/ᩴܽ۠;->ۗ:Ll/ᩴܽ۠;

    .line 3234
    invoke-virtual {p2, v0}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴܽ۠;

    .line 3218
    :goto_0
    invoke-direct {p0, p1, p2}, Ll/᩵ܽ۠;-><init>(Ll/ۛ֡֨;Ll/ᩴܽ۠;)V

    return-void
.end method

.method public constructor <init>(Ll/ۛ֡֨;Ll/ᩴܽ۠;)V
    .locals 0

    .line 3221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3222
    iput-object p2, p0, Ll/᩵ܽ۠;->֫:Ll/ᩴܽ۠;

    .line 3223
    iput-object p1, p0, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    return-void
.end method

.method public static ֫(Ll/ۛ֡֨;)Ll/᩵ܽ۠;
    .locals 2

    .line 3277
    new-instance v0, Ll/᩵ܽ۠;

    sget-object v1, Ll/ᩴܽ۠;->ۗ:Ll/ᩴܽ۠;

    invoke-direct {v0, p0, v1}, Ll/᩵ܽ۠;-><init>(Ll/ۛ֡֨;Ll/ᩴܽ۠;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 7

    .line 3259
    sget-object v0, Ll/ܺ֫۠;->֫:[I

    iget-object v1, p0, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    iget-object v2, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-eq v0, v3, :cond_1

    const/4 v2, 0x6

    if-eq v0, v2, :cond_0

    goto :goto_1

    .line 3269
    :cond_0
    invoke-virtual {v1}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object v0

    check-cast v0, Ll/ۡۧ۠;

    .line 3270
    invoke-static {v0}, Ll/ۡۧ۠;->֫(Ll/ۡۧ۠;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ll/ۡۧ۠;->֫(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0

    .line 3264
    :cond_1
    invoke-virtual {v1}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object v0

    check-cast v0, Ll/ۜۧ۠;

    .line 3265
    sget-object v1, Ll/᩸ۧ۠;->ۗ:Ll/᩸ۧ۠;

    invoke-virtual {v1}, Ll/᩸ۧ۠;->֫()Ljava/lang/String;

    move-result-object v1

    new-array v3, v4, [Ll/۟ۧ۠;

    .line 3266
    invoke-virtual {v0}, Ll/ۜۧ۠;->᩹֫()Ll/᩺ܶ۠;

    move-result-object v0

    iget-object v0, v0, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    .line 4760
    check-cast v0, Ll/ܽܶ۠;

    .line 4761
    invoke-virtual {v0}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v5

    .line 4762
    invoke-virtual {v0}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 4763
    invoke-virtual {v0}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 4766
    :goto_0
    array-length v1, v5

    if-ge v0, v1, :cond_5

    .line 4767
    aget-object v1, v3, v0

    aget-object v6, v5, v0

    invoke-virtual {v1, v6}, Ll/۟ۧ۠;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v4

    :cond_5
    return v2
.end method

.method public final ֫(Ll/ᩴܽ۠;)Z
    .locals 1

    .line 3251
    iget-object v0, p0, Ll/᩵ܽ۠;->֫:Ll/ᩴܽ۠;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 2

    .line 3244
    iget-object v0, p0, Ll/᩵ܽ۠;->֫:Ll/ᩴܽ۠;

    sget-object v1, Ll/ᩴܽ۠;->ۗ:Ll/ᩴܽ۠;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
