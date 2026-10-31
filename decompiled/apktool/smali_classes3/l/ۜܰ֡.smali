.class public final Ll/ۜܰ֡;
.super Ll/ۢܰ֡;
.source "D4MB"

# interfaces
.implements Ll/᩷ܽۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public ۗ:Ll/᩵۬֡;

.field public ۙ:Ll/᩵۬֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    const/4 p1, 0x0

    .line 45
    iput-object p1, p0, Ll/ۜܰ֡;->ۙ:Ll/᩵۬֡;

    .line 46
    iput-object p1, p0, Ll/ۜܰ֡;->ۗ:Ll/᩵۬֡;

    return-void
.end method


# virtual methods
.method public final getReference()Ll/۠ܽۚ;
    .locals 4

    .line 67
    iget-object v0, p0, Ll/ۜܰ֡;->ۙ:Ll/᩵۬֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 69
    :cond_0
    iget-object v0, p0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    iget v0, v0, Ll/֨ۗ֡;->۬:I

    .line 70
    iget-object v1, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    iget v3, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v2

    .line 69
    invoke-static {v1, v0, v2}, Ll/֫᩺᩵;->֫(Ll/۬ۛ֡;II)Ll/᩵۬֡;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    iget v0, v0, Ll/֨ۗ֡;->۬:I

    return v0
.end method

.method public final synthetic ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 94
    invoke-virtual {p0}, Ll/ۜܰ֡;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object v0

    check-cast v0, Ll/᩵۬֡;

    iput-object v0, p0, Ll/ۜܰ֡;->ۙ:Ll/᩵۬֡;

    .line 95
    invoke-virtual {p0}, Ll/ۜܰ֡;->ۜ()Ll/۠ܽۚ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object p1

    check-cast p1, Ll/᩵۬֡;

    iput-object p1, p0, Ll/ۜܰ֡;->ۗ:Ll/᩵۬֡;

    return-void
.end method

.method public final ۜ()Ll/۠ܽۚ;
    .locals 4

    .line 81
    iget-object v0, p0, Ll/ۜܰ֡;->ۗ:Ll/᩵۬֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 83
    :cond_0
    iget-object v0, p0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    iget v0, v0, Ll/֨ۗ֡;->۫:I

    .line 84
    iget-object v1, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    iget v3, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v3, v3, 0x6

    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v2

    .line 83
    invoke-static {v1, v0, v2}, Ll/֫᩺᩵;->֫(Ll/۬ۛ֡;II)Ll/᩵۬֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()I
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    iget v0, v0, Ll/֨ۗ֡;->۫:I

    return v0
.end method

.method public final ᩴ()I
    .locals 2

    .line 61
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0
.end method

.method public final ᩻()I
    .locals 2

    .line 56
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->᩷(I)I

    move-result v0

    return v0
.end method
