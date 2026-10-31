.class public final Ll/ۚ۫ۢ;
.super Ljava/lang/Object;
.source "Z6RB"

# interfaces
.implements Ll/֡ܳ֡;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:Ll/֨۫ۢ;


# direct methods
.method public constructor <init>(Ll/֨۫ۢ;IIII)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Ll/ۚ۫ۢ;->᩹:Ll/֨۫ۢ;

    .line 76
    iput p2, p0, Ll/ۚ۫ۢ;->᩶:I

    .line 77
    iput p3, p0, Ll/ۚ۫ۢ;->ۙ:I

    .line 78
    iput p4, p0, Ll/ۚ۫ۢ;->᩸:I

    .line 79
    iput p5, p0, Ll/ۚ۫ۢ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final getInputStream()Ll/᩺ܿ֡;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۚ۫ۢ;->᩹:Ll/֨۫ۢ;

    invoke-static {v0}, Ll/֨۫ۢ;->֫(Ll/֨۫ۢ;)Ll/ᩴ۫ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final getLine()I
    .locals 2

    .line 86
    iget-object v0, p0, Ll/ۚ۫ۢ;->᩹:Ll/֨۫ۢ;

    iget v1, p0, Ll/ۚ۫ۢ;->᩶:I

    invoke-static {v0, v1}, Ll/֨۫ۢ;->֫(Ll/֨۫ۢ;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 3

    .line 83
    iget-object v0, p0, Ll/ۚ۫ۢ;->᩹:Ll/֨۫ۢ;

    invoke-static {v0}, Ll/֨۫ۢ;->֫(Ll/֨۫ۢ;)Ll/ᩴ۫ۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴ۫ۢ;->size()I

    move-result v1

    iget v2, p0, Ll/ۚ۫ۢ;->᩶:I

    if-lt v2, v1, :cond_0

    const-string v0, "<EOF>"

    return-object v0

    :cond_0
    invoke-static {v0}, Ll/֨۫ۢ;->֫(Ll/֨۫ۢ;)Ll/ᩴ۫ۢ;

    move-result-object v0

    iget v1, p0, Ll/ۚ۫ۢ;->ۙ:I

    invoke-static {v2, v1}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩴ۫ۢ;->֫(Ll/ܳ᩷֡;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 85
    iget v0, p0, Ll/ۚ۫ۢ;->ۗ:I

    shr-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ֫()I
    .locals 3

    .line 88
    iget-object v0, p0, Ll/ۚ۫ۢ;->᩹:Ll/֨۫ۢ;

    iget v1, p0, Ll/ۚ۫ۢ;->᩶:I

    invoke-static {v0, v1}, Ll/֨۫ۢ;->֫(Ll/֨۫ۢ;I)I

    move-result v2

    .line 89
    invoke-static {v0}, Ll/֨۫ۢ;->ܽ(Ll/֨۫ۢ;)[I

    move-result-object v0

    aget v0, v0, v2

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ۧ()I
    .locals 1

    .line 91
    iget v0, p0, Ll/ۚ۫ۢ;->ۗ:I

    and-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܳ()Ll/֨ܳ֡;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ۚ۫ۢ;->᩹:Ll/֨۫ۢ;

    invoke-static {v0}, Ll/֨۫ۢ;->ۧ(Ll/֨۫ۢ;)Ll/֨ܳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 92
    iget v0, p0, Ll/ۚ۫ۢ;->᩸:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 94
    iget v0, p0, Ll/ۚ۫ۢ;->ۙ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 93
    iget v0, p0, Ll/ۚ۫ۢ;->᩶:I

    return v0
.end method
