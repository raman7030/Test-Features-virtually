.class public final Ll/᩻᩷ۚ;
.super Ll/ܽ᩷ۚ;
.source "O4TJ"

# interfaces
.implements Ll/᩻ۜۚ;


# instance fields
.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩻᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 108
    new-instance v0, Ll/ܳ᩷ۚ;

    iget-object v1, p0, Ll/᩻᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ll/ۢ֫ۚ;)Ll/ܰ᩷ۚ;
    .locals 0

    .line 46
    check-cast p1, Ll/ܿ᩷ۚ;

    .line 97
    iget-object p1, p1, Ll/ܿ᩷ۚ;->᩶:Ll/ܰ᩷ۚ;

    return-object p1
.end method

.method public final ֫(Ll/᩷֫ۚ;)Ll/᩻ۡۚ;
    .locals 0

    .line 46
    check-cast p1, Ll/ᩳ᩷ۚ;

    .line 79
    iget-object p1, p1, Ll/ᩳ᩷ۚ;->ۙ:Ll/᩻ۡۚ;

    return-object p1
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ll/ᩳ᩷ۚ;

    .line 102
    iget p1, p1, Ll/ᩳ᩷ۚ;->᩶:I

    return p1
.end method

.method public final ۧ(Ll/᩷֫ۚ;)I
    .locals 0

    .line 46
    check-cast p1, Ll/ᩳ᩷ۚ;

    .line 73
    iget p1, p1, Ll/ᩳ᩷ۚ;->ۗ:I

    return p1
.end method

.method public final ۧ(Ll/ۢ֫ۚ;)Ll/۟ۢۚ;
    .locals 0

    .line 46
    check-cast p1, Ll/ܿ᩷ۚ;

    .line 91
    iget-object p1, p1, Ll/ܿ᩷ۚ;->᩹:Ll/۟ۢۚ;

    return-object p1
.end method

.method public final ܽ(Ll/᩷֫ۚ;)Ljava/util/Set;
    .locals 0

    .line 46
    check-cast p1, Ll/ᩳ᩷ۚ;

    .line 85
    iget-object p1, p1, Ll/ᩳ᩷ۚ;->᩹:Ljava/util/Set;

    return-object p1
.end method

.method public final ᩳ(Ll/᩷֫ۚ;)Ll/ᩳ᩷ۚ;
    .locals 6

    .line 58
    iget-object v0, p0, Ll/᩻᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩷ۚ;

    if-eqz v1, :cond_0

    return-object v1

    .line 63
    :cond_0
    new-instance v1, Ll/ᩳ᩷ۚ;

    .line 64
    invoke-interface {p1}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v2

    iget-object v3, p0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    iget-object v4, v3, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    .line 65
    invoke-interface {p1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v4

    .line 66
    invoke-interface {p1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    .line 701
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    new-instance v5, Ll/ܺۡۚ;

    invoke-direct {v5, v3}, Ll/ܺۡۚ;-><init>(Ll/᩵ۡۚ;)V

    invoke-static {p1, v5}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ll/ܽܶܺ;)Ljava/util/Iterator;

    move-result-object p1

    .line 700
    invoke-static {p1}, Ll/ۛ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ۛ۬ܺ;

    move-result-object p1

    .line 66
    invoke-direct {v1, v2, v4, p1}, Ll/ᩳ᩷ۚ;-><init>(ILl/᩻ۡۚ;Ll/ۛ۬ܺ;)V

    .line 67
    invoke-virtual {v0, v1, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩷ۚ;

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    return-object p1
.end method
