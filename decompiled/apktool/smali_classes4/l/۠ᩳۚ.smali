.class public final Ll/۠ᩳۚ;
.super Ll/ۢᩳۚ;
.source "R4RJ"

# interfaces
.implements Ll/ۗ֫ۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:I

.field public ۤ:Ll/᩻ۡۚ;

.field public final ۫:Ljava/lang/String;

.field public ۬:Ll/۟ۢۚ;

.field public ᩶:Ll/۟ۢۚ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p2}, Ll/ۢᩳۚ;-><init>(I)V

    .line 36
    iput p5, p0, Ll/۠ᩳۚ;->ۙ:I

    .line 37
    iput-object p1, p0, Ll/۠ᩳۚ;->᩹:Ljava/lang/String;

    .line 38
    iput-object p3, p0, Ll/۠ᩳۚ;->۫:Ljava/lang/String;

    .line 39
    iput-object p4, p0, Ll/۠ᩳۚ;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/۠ᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/۠ᩳۚ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/۠ᩳۚ;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 57
    iget v0, p0, Ll/۠ᩳۚ;->ۙ:I

    return v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 127
    iget-object v0, p0, Ll/۠ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v0

    iput-object v0, p0, Ll/۠ᩳۚ;->᩶:Ll/۟ۢۚ;

    .line 128
    iget-object v0, p0, Ll/۠ᩳۚ;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v0

    iput-object v0, p0, Ll/۠ᩳۚ;->۬:Ll/۟ۢۚ;

    .line 285
    iget-object v0, p0, Ll/۠ᩳۚ;->۫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 280
    iget-object p1, p1, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {p1, v0}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 129
    :goto_0
    iput-object p1, p0, Ll/۠ᩳۚ;->ۤ:Ll/᩻ۡۚ;

    return-void
.end method

.method public final ۡ()Ll/᩸ܽۚ;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۠ᩳۚ;->ۤ:Ll/᩻ۡۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 79
    :cond_0
    iget-object v0, p0, Ll/۠ᩳۚ;->۫:Ljava/lang/String;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v0, Ll/ۚᩳۚ;

    invoke-direct {v0, p0}, Ll/ۚᩳۚ;-><init>(Ll/۠ᩳۚ;)V

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final ᩴ()Ll/ܶܽۚ;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/۠ᩳۚ;->۬:Ll/۟ۢۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 93
    :cond_0
    iget-object v0, p0, Ll/۠ᩳۚ;->ۗ:Ljava/lang/String;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v0, Ll/֨ᩳۚ;

    invoke-direct {v0, p0}, Ll/֨ᩳۚ;-><init>(Ll/۠ᩳۚ;)V

    return-object v0
.end method

.method public final ᩻()Ll/ܶܽۚ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/۠ᩳۚ;->᩶:Ll/۟ۢۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 65
    :cond_0
    iget-object v0, p0, Ll/۠ᩳۚ;->᩹:Ljava/lang/String;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v0, Ll/֡ᩳۚ;

    invoke-direct {v0, p0}, Ll/֡ᩳۚ;-><init>(Ll/۠ᩳۚ;)V

    return-object v0
.end method
