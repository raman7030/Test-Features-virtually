.class public final Ll/᩵᩺֡;
.super Ll/ۢܰ֡;
.source "K4WX"

# interfaces
.implements Ll/֡ۧۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public ۗ:I

.field public ۙ:Ll/᩵۬֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ll/᩵᩺֡;->ۙ:Ll/᩵۬֡;

    const/4 p1, -0x1

    .line 47
    iput p1, p0, Ll/᩵᩺֡;->ۗ:I

    return-void
.end method


# virtual methods
.method public final getReference()Ll/۠ܽۚ;
    .locals 3

    .line 63
    iget-object v0, p0, Ll/᩵᩺֡;->ۙ:Ll/᩵۬֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 65
    :cond_0
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    .line 67
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩺֡;->֡()I

    move-result v2

    .line 68
    invoke-static {v0, v2, v1}, Ll/֫᩺᩵;->֫(Ll/۬ۛ֡;II)Ll/᩵۬֡;

    move-result-object v0
    :try_end_0
    .catch Ll/ܶۗ֡; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 70
    new-instance v2, Ll/ᩴ᩺֡;

    invoke-direct {v2, v0, v1}, Ll/ᩴ᩺֡;-><init>(Ll/ܶۗ֡;I)V

    return-object v2
.end method

.method public final ֡()I
    .locals 2

    .line 82
    iget v0, p0, Ll/᩵᩺֡;->ۗ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 85
    :cond_0
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->᩷(I)I

    move-result v0

    ushr-int/lit8 v0, v0, 0x6

    add-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_1

    const/4 v1, 0x4

    if-gt v0, v1, :cond_1

    .line 87
    iput v0, p0, Ll/᩵᩺֡;->ۗ:I

    return v0

    .line 84
    :cond_1
    new-instance v1, Ll/ܶۗ֡;

    invoke-direct {v1, v0}, Ll/ܶۗ֡;-><init>(I)V

    throw v1
.end method

.method public final ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 92
    invoke-virtual {p0}, Ll/᩵᩺֡;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object p1

    check-cast p1, Ll/᩵۬֡;

    iput-object p1, p0, Ll/᩵᩺֡;->ۙ:Ll/᩵۬֡;

    return-void
.end method

.method public final ᩵()I
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->᩷(I)I

    move-result v0

    and-int/lit8 v0, v0, 0x3f

    return v0
.end method
