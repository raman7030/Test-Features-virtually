.class public final Ll/ۤۘ᩵;
.super Ll/ۤۖ᩵;
.source "39YC"


# instance fields
.field public ۗ֫:J

.field public ۙ֫:I

.field public ۤ֫:I

.field public ۫֫:I

.field public ۬֫:I

.field public ܶ֫:[B

.field public ᩶֫:I

.field public ᩸֫:I

.field public ᩹֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 2

    const/16 v0, 0x2f

    const/4 v1, 0x0

    .line 44
    invoke-direct {p0, p1, v0, v1}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;BLl/ۨۖ᩵;)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;IJI[BII)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x2f

    .line 59
    invoke-direct {p0, p1, v1, v0}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;BLl/ۨۖ᩵;)V

    .line 60
    iput p2, p0, Ll/ۤۘ᩵;->᩶֫:I

    .line 61
    iput-wide p3, p0, Ll/ۤۘ᩵;->ۗ֫:J

    .line 62
    iput p5, p0, Ll/ۤۘ᩵;->۫֫:I

    .line 63
    iput-object p6, p0, Ll/ۤۘ᩵;->ܶ֫:[B

    .line 64
    iput p7, p0, Ll/ۤۘ᩵;->ۙ֫:I

    .line 65
    iput p8, p0, Ll/ۤۘ᩵;->᩸֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 174
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComWriteAndX["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۤۘ᩵;->᩶֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",offset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۤۘ᩵;->ۗ֫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",writeMode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۤۘ᩵;->ۤ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",remaining="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۤۘ᩵;->۫֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataLength="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۤۘ᩵;->᩸֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۤۘ᩵;->᩹֫:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 175
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(IJI[BII)V
    .locals 0

    .line 78
    iput p1, p0, Ll/ۤۘ᩵;->᩶֫:I

    .line 79
    iput-wide p2, p0, Ll/ۤۘ᩵;->ۗ֫:J

    .line 80
    iput p4, p0, Ll/ۤۘ᩵;->۫֫:I

    .line 81
    iput-object p5, p0, Ll/ۤۘ᩵;->ܶ֫:[B

    .line 82
    iput p6, p0, Ll/ۤۘ᩵;->ۙ֫:I

    .line 83
    iput p7, p0, Ll/ۤۘ᩵;->᩸֫:I

    const/4 p1, 0x0

    .line 84
    iput-object p1, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    return-void
.end method

.method public final ۢ(I)V
    .locals 0

    .line 96
    iput p1, p0, Ll/ۤۘ᩵;->ۤ֫:I

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

    move v0, p1

    .line 150
    :goto_0
    iget v1, p0, Ll/ۤۘ᩵;->۬֫:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Ll/ۤۘ᩵;->۬֫:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    const/16 v2, -0x12

    .line 151
    aput-byte v2, p2, v0

    move v0, v1

    goto :goto_0

    .line 153
    :cond_0
    iget-object v1, p0, Ll/ۤۘ᩵;->ܶ֫:[B

    iget v2, p0, Ll/ۤۘ᩵;->ۙ֫:I

    iget v3, p0, Ll/ۤۘ᩵;->᩸֫:I

    invoke-static {v1, v2, p2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 154
    iget p2, p0, Ll/ۤۘ᩵;->᩸֫:I

    add-int/2addr v0, p2

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ᩻(I[B)I
    .locals 6

    .line 116
    iget v0, p0, Ll/ۨۖ᩵;->۟:I

    sub-int v1, p1, v0

    add-int/lit8 v1, v1, 0x1a

    iput v1, p0, Ll/ۤۘ᩵;->᩹֫:I

    sub-int v0, v1, v0

    const/4 v2, 0x4

    .line 118
    rem-int/2addr v0, v2

    iput v0, p0, Ll/ۤۘ᩵;->۬֫:I

    const/4 v3, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    rsub-int/lit8 v0, v0, 0x4

    .line 119
    :goto_0
    iput v0, p0, Ll/ۤۘ᩵;->۬֫:I

    add-int/2addr v1, v0

    .line 120
    iput v1, p0, Ll/ۤۘ᩵;->᩹֫:I

    .line 122
    iget v0, p0, Ll/ۤۘ᩵;->᩶֫:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 124
    iget-wide v4, p0, Ll/ۤۘ᩵;->ۗ֫:J

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x6

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_1

    add-int/lit8 v4, v0, 0x1

    const/4 v5, -0x1

    .line 127
    aput-byte v5, p2, v0

    add-int/lit8 v1, v1, 0x1

    move v0, v4

    goto :goto_1

    .line 129
    :cond_1
    iget v1, p0, Ll/ۤۘ᩵;->ۤ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0x2

    .line 131
    iget v2, p0, Ll/ۤۘ᩵;->۫֫:I

    int-to-long v4, v2

    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0x4

    add-int/lit8 v2, v0, 0x5

    .line 133
    aput-byte v3, p2, v1

    add-int/lit8 v1, v0, 0x6

    .line 134
    aput-byte v3, p2, v2

    .line 135
    iget v2, p0, Ll/ۤۘ᩵;->᩸֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0x8

    .line 137
    iget v2, p0, Ll/ۤۘ᩵;->᩹֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0xa

    .line 139
    iget-wide v2, p0, Ll/ۤۘ᩵;->ۗ֫:J

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, v0, 0xe

    sub-int/2addr v0, p1

    return v0
.end method
