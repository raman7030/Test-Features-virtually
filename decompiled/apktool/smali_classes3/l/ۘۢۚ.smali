.class public final Ll/ۘۢۚ;
.super Ll/ܽ᩷ۚ;
.source "963I"

# interfaces
.implements Ll/᩶ۜۚ;


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
    iput-object p1, p0, Ll/ۘۢۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۘۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 112
    new-instance v0, Ll/ۖۢۚ;

    iget-object v1, p0, Ll/ۘۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ll/ᩴܽۚ;)Ll/᩻ۡۚ;
    .locals 0

    .line 46
    check-cast p1, Ll/ᩴۢۚ;

    .line 84
    iget-object p1, p1, Ll/ᩴۢۚ;->᩸:Ll/᩻ۡۚ;

    return-object p1
.end method

.method public final ۧ(Ll/ᩴܽۚ;)Ll/᩻ۡۚ;
    .locals 0

    .line 46
    check-cast p1, Ll/ᩴۢۚ;

    .line 90
    iget-object p1, p1, Ll/ᩴۢۚ;->᩹:Ll/᩻ۡۚ;

    return-object p1
.end method

.method public final ܳ(Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ll/ᩴۢۚ;

    .line 106
    iget p1, p1, Ll/ᩴۢۚ;->᩶:I

    return p1
.end method

.method public final ܽ(Ll/ᩴܽۚ;)Ll/۟ۢۚ;
    .locals 0

    .line 46
    check-cast p1, Ll/ᩴۢۚ;

    .line 96
    iget-object p1, p1, Ll/ᩴۢۚ;->ۙ:Ll/۟ۢۚ;

    return-object p1
.end method

.method public final ᩳ(Ll/ᩴܽۚ;)Ll/ᩴۢۚ;
    .locals 6

    .line 64
    iget-object v0, p0, Ll/ۘۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴۢۚ;

    if-eqz v1, :cond_0

    return-object v1

    .line 69
    :cond_0
    new-instance v1, Ll/ᩴۢۚ;

    iget-object v2, p0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    iget-object v3, v2, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    .line 70
    invoke-interface {p1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v3

    iget-object v4, v2, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v4, Ll/ܰۢۚ;

    .line 71
    invoke-interface {p1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v4

    iget-object v2, v2, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    .line 72
    invoke-interface {p1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object p1

    invoke-direct {v1, v3, v4, p1}, Ll/ᩴۢۚ;-><init>(Ll/᩻ۡۚ;Ll/۟ۢۚ;Ll/᩻ۡۚ;)V

    .line 73
    invoke-virtual {v0, v1, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴۢۚ;

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    return-object p1
.end method

.method public final ᩻(Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ll/ܺۢۚ;

    .line 101
    iget-object p1, p1, Ll/ܺۢۚ;->᩶:Ll/ᩴۢۚ;

    .line 76
    iget p1, p1, Ll/ᩴۢۚ;->᩶:I

    return p1
.end method
