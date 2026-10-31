.class public Ll/ۜ۫ۚ;
.super Ljava/lang/Object;
.source "O7F3"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public final ᩸:Ll/ۙ۬ۚ;

.field public final ᩹:Ll/ܺۤۚ;


# direct methods
.method public constructor <init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p2, p0, Ll/ۜ۫ۚ;->᩸:Ll/ۙ۬ۚ;

    .line 45
    invoke-virtual {p2}, Ll/ۙ۬ۚ;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۗۛۚ;->֫(Ljava/lang/String;)Ll/ܺۤۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ۫ۚ;->᩹:Ll/ܺۤۚ;

    return-void
.end method


# virtual methods
.method public getLength()I
    .locals 1

    .line 97
    invoke-virtual {p0}, Ll/ۜ۫ۚ;->ܽ()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    return v0
.end method

.method public ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 4

    .line 50
    instance-of v0, p0, Ll/᩵۫ۚ;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ll/᩵۫ۚ;

    .line 51
    iget-object v1, v0, Ll/᩵۫ۚ;->᩶:Ll/ܺۤۚ;

    .line 52
    invoke-virtual {v1}, Ll/ܺۤۚ;->֫()Z

    move-result v2

    if-nez v2, :cond_1

    .line 53
    invoke-virtual {v1}, Ll/ܺۤۚ;->ᩳ()Ll/ۧۤۚ;

    move-result-object v2

    sget-object v3, Ll/ۧۤۚ;->۬֫:Ll/ۧۤۚ;

    if-ne v2, v3, :cond_1

    .line 54
    iget-object v2, p0, Ll/ۜ۫ۚ;->᩸:Ll/ۙ۬ۚ;

    invoke-virtual {v2}, Ll/ۙ۬ۚ;->֫()Ll/ۧۤۚ;

    move-result-object v2

    sget-object v3, Ll/ۧۤۚ;->ۤ֫:Ll/ۧۤۚ;

    if-ne v2, v3, :cond_1

    .line 55
    iget-object v2, p1, Ll/ۗۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/ܳ۫ۚ;

    invoke-direct {v3, v1}, Ll/ܳ۫ۚ;-><init>(Ll/ܺۤۚ;)V

    .line 56
    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    .line 57
    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 59
    invoke-virtual {v2}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    goto :goto_0

    .line 60
    :cond_0
    new-instance v2, Ll/᩸ۛۚ;

    iget-object v1, v1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iget-object v1, v1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    invoke-direct {v2, v1}, Ll/᩸ۛۚ;-><init>(Ll/ܺۤۚ;)V

    invoke-virtual {p1, v2}, Ll/ۗۛۚ;->֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    :goto_0
    iput-object p1, v0, Ll/᩵۫ۚ;->᩶:Ll/ܺۤۚ;

    :cond_1
    return-object p0
.end method

.method public ֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)Ll/ܺۤۚ;
    .locals 2

    .line 69
    sget-object v0, Ll/᩻۫ۚ;->֫:[I

    invoke-virtual {p1}, Ll/ܺۤۚ;->ᩳ()Ll/ۧۤۚ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, Ll/ۜ۫ۚ;->᩸:Ll/ۙ۬ۚ;

    invoke-virtual {v0}, Ll/ۙ۬ۚ;->֫()Ll/ۧۤۚ;

    move-result-object v0

    sget-object v1, Ll/ۧۤۚ;->᩺:Ll/ۧۤۚ;

    if-ne v0, v1, :cond_2

    .line 75
    iget-object v0, p2, Ll/ۗۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܿ۫ۚ;

    invoke-direct {v1, p1}, Ll/ܿ۫ۚ;-><init>(Ll/ܺۤۚ;)V

    .line 76
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 77
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->findAny()Ll/ܽ۫ᩴ;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 79
    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    return-object p1

    .line 82
    :cond_1
    new-instance v0, Ll/ܳۛۚ;

    invoke-direct {v0, p1}, Ll/ܳۛۚ;-><init>(Ll/ܺۤۚ;)V

    invoke-virtual {p2, v0}, Ll/ۗۛۚ;->֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۜ۫ۚ;->᩹:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 108
    invoke-virtual {p0}, Ll/ۜ۫ۚ;->ܽ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ۧ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ܽ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ll/ۙ۬ۚ;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۜ۫ۚ;->᩸:Ll/ۙ۬ۚ;

    return-object v0
.end method
