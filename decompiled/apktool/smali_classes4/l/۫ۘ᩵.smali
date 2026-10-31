.class public final Ll/۫ۘ᩵;
.super Ll/ۨۖ᩵;
.source "DA0R"


# instance fields
.field public ֡֫:[B

.field public ֨֫:I

.field public ۚ֫:I

.field public ۠֫:I

.field public ܶ֫:I

.field public ᩸֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 1

    const/16 v0, 0xb

    .line 40
    invoke-direct {p0, p1, v0}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;B)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 132
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComWrite["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    invoke-super {p0}, Ll/ۨۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/۫ۘ᩵;->֨֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",count="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/۫ۘ᩵;->ۚ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",offset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/۫ۘ᩵;->ܶ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",remaining="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/۫ۘ᩵;->᩸֫:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 133
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(IJI[BII)V
    .locals 2

    .line 73
    iput p1, p0, Ll/۫ۘ᩵;->֨֫:I

    const-wide v0, 0xffffffffL

    and-long p1, p2, v0

    long-to-int p2, p1

    .line 74
    iput p2, p0, Ll/۫ۘ᩵;->ܶ֫:I

    .line 75
    iput p4, p0, Ll/۫ۘ᩵;->᩸֫:I

    .line 76
    iput-object p5, p0, Ll/۫ۘ᩵;->֡֫:[B

    .line 77
    iput p6, p0, Ll/۫ۘ᩵;->۠֫:I

    .line 78
    iput p7, p0, Ll/۫ۘ᩵;->ۚ֫:I

    const/4 p1, 0x0

    .line 79
    iput-object p1, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 4

    add-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    .line 108
    aput-byte v1, p2, p1

    .line 109
    iget v1, p0, Ll/۫ۘ᩵;->ۚ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x3

    .line 111
    iget-object v1, p0, Ll/۫ۘ᩵;->֡֫:[B

    iget v2, p0, Ll/۫ۘ᩵;->۠֫:I

    iget v3, p0, Ll/۫ۘ᩵;->ۚ֫:I

    invoke-static {v1, v2, p2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 112
    iget p2, p0, Ll/۫ۘ᩵;->ۚ֫:I

    add-int/2addr v0, p2

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ᩻(I[B)I
    .locals 3

    .line 91
    iget v0, p0, Ll/۫ۘ᩵;->֨֫:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 93
    iget v1, p0, Ll/۫ۘ᩵;->ۚ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x4

    .line 95
    iget v1, p0, Ll/۫ۘ᩵;->ܶ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    .line 97
    iget v1, p0, Ll/۫ۘ᩵;->᩸֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 p2, p1, 0xa

    sub-int/2addr p2, p1

    return p2
.end method
