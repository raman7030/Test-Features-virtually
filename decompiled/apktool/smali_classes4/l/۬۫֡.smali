.class public final Ll/۬۫֡;
.super Ll/ۛ۬֡;
.source "35M1"

# interfaces
.implements Ll/ۗ֫ۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public ۗ:Ll/᩸ܽۚ;

.field public ۙ:Ll/ܶܽۚ;

.field public final ᩶:I

.field public ᩹:Ll/ܶܽۚ;


# direct methods
.method public constructor <init>(ILl/ܶܽۚ;Ll/᩸ܽۚ;Ll/ܶܽۚ;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ll/ۛ۬֡;-><init>()V

    .line 57
    iput p1, p0, Ll/۬۫֡;->᩶:I

    .line 58
    iput-object p2, p0, Ll/۬۫֡;->᩹:Ll/ܶܽۚ;

    .line 59
    iput-object p3, p0, Ll/۬۫֡;->ۗ:Ll/᩸ܽۚ;

    .line 60
    iput-object p4, p0, Ll/۬۫֡;->ۙ:Ll/ܶܽۚ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/۬۫֡;->᩹:Ll/ܶܽۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/۬۫֡;->ۙ:Ll/ܶܽۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۬۫֡;->ۗ:Ll/᩸ܽۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 65
    iget v0, p0, Ll/۬۫֡;->᩶:I

    return v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 2

    .line 111
    iget-object v0, p0, Ll/۬۫֡;->᩹:Ll/ܶܽۚ;

    if-eqz v0, :cond_0

    .line 112
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->ۧ(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v0

    iput-object v0, p0, Ll/۬۫֡;->᩹:Ll/ܶܽۚ;

    .line 113
    :cond_0
    iget-object v0, p0, Ll/۬۫֡;->ۗ:Ll/᩸ܽۚ;

    if-eqz v0, :cond_1

    .line 114
    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    .line 280
    iget-object v1, p1, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v1, v0}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v0

    .line 114
    iput-object v0, p0, Ll/۬۫֡;->ۗ:Ll/᩸ܽۚ;

    .line 115
    :cond_1
    iget-object v0, p0, Ll/۬۫֡;->ۙ:Ll/ܶܽۚ;

    if-eqz v0, :cond_2

    .line 116
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->ۧ(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    iput-object p1, p0, Ll/۬۫֡;->ۙ:Ll/ܶܽۚ;

    :cond_2
    return-void
.end method

.method public final ۡ()Ll/᩸ܽۚ;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۬۫֡;->ۗ:Ll/᩸ܽۚ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final ᩴ()Ll/ܶܽۚ;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/۬۫֡;->ۙ:Ll/ܶܽۚ;

    return-object v0
.end method

.method public final ᩻()Ll/ܶܽۚ;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/۬۫֡;->᩹:Ll/ܶܽۚ;

    return-object v0
.end method
