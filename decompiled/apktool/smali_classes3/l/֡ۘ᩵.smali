.class public final Ll/֡ۘ᩵;
.super Ll/ۤۖ᩵;
.source "F9Z8"


# instance fields
.field public ۙ֫:I

.field public ܶ֫:[B

.field public ᩶֫:I

.field public ᩸֫:I

.field public ᩹֫:I


# direct methods
.method public constructor <init>(ILl/֨ۡ᩵;[B)V
    .locals 0

    .line 50
    invoke-direct {p0, p2}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 51
    iput-object p3, p0, Ll/֡ۘ᩵;->ܶ֫:[B

    .line 52
    iput p1, p0, Ll/֡ۘ᩵;->ۙ֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 139
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComReadAndXResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",dataCompactionMode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֡ۘ᩵;->᩸֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataLength="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֡ۘ᩵;->᩹֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֡ۘ᩵;->᩶֫:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 140
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۖ֫()I
    .locals 1

    .line 90
    iget v0, p0, Ll/֡ۘ᩵;->᩹֫:I

    return v0
.end method

.method public final ۘ֫()I
    .locals 1

    .line 98
    iget v0, p0, Ll/֡ۘ᩵;->᩶֫:I

    return v0
.end method

.method public final ۢ(I)V
    .locals 1

    .line 82
    iget v0, p0, Ll/֡ۘ᩵;->ۙ֫:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/֡ۘ᩵;->ۙ֫:I

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܺ֫()[B
    .locals 1

    .line 66
    iget-object v0, p0, Ll/֡ۘ᩵;->ܶ֫:[B

    return-object v0
.end method

.method public final ܽ(I[B)I
    .locals 1

    add-int/lit8 v0, p1, 0x2

    .line 119
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/֡ۘ᩵;->᩸֫:I

    add-int/lit8 v0, p1, 0x6

    .line 121
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/֡ۘ᩵;->᩹֫:I

    add-int/lit8 v0, p1, 0x8

    .line 123
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    iput p2, p0, Ll/֡ۘ᩵;->᩶֫:I

    add-int/lit8 p2, p1, 0x14

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ܿ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ֫()I
    .locals 1

    .line 74
    iget v0, p0, Ll/֡ۘ᩵;->ۙ֫:I

    return v0
.end method

.method public final ᩻(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
