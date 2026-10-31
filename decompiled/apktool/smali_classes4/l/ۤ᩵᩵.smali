.class public final Ll/ۤ᩵᩵;
.super Ll/۬ᩴ᩵;
.source "8A3D"


# instance fields
.field public ۖ֫:[B

.field public ۡ֫:J

.field public ۢ֫:I

.field public ܺ֫:I


# direct methods
.method public constructor <init>(Ll/ᩴۡ᩵;IIJ[B)V
    .locals 1

    .line 48
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 49
    iput p2, p0, Ll/ۤ᩵᩵;->ܺ֫:I

    .line 50
    iput p3, p0, Ll/ۤ᩵᩵;->ۢ֫:I

    .line 51
    iput-wide p4, p0, Ll/ۤ᩵᩵;->ۡ֫:J

    .line 52
    iput-object p6, p0, Ll/ۤ᩵᩵;->ۖ֫:[B

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۤ᩵᩵;->ۖ֫:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x58

    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۗᩴ᩵;)Z
    .locals 2

    const-wide/16 v0, -0x1

    .line 77
    invoke-virtual {p1, v0, v1}, Ll/ۗᩴ᩵;->ۧ(J)V

    .line 78
    invoke-super {p0, p1}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 1

    .line 58
    new-instance v0, Ll/ۛ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    .line 57
    invoke-direct {v0, p1}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 6

    const-wide/16 v0, 0x19

    .line 102
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    int-to-byte v2, v1

    .line 104
    aput-byte v2, p2, v0

    add-int/lit8 v0, p1, 0x3

    .line 105
    iget v2, p0, Ll/ۤ᩵᩵;->ܺ֫:I

    int-to-byte v2, v2

    aput-byte v2, p2, v0

    add-int/lit8 v0, p1, 0x4

    .line 108
    iget v2, p0, Ll/ۤ᩵᩵;->ۢ֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    const-wide/16 v2, 0x0

    .line 110
    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0xc

    add-int/lit8 v4, p1, 0xe

    .line 115
    iget-object v5, p0, Ll/ۤ᩵᩵;->ۖ֫:[B

    if-eqz v5, :cond_0

    array-length v2, v5

    int-to-long v2, v2

    :cond_0
    invoke-static {v2, v3, v4, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v2, p1, 0x10

    .line 117
    iget-wide v3, p0, Ll/ۤ᩵᩵;->ۡ֫:J

    invoke-static {v3, v4, v2, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    add-int/lit8 v2, p1, 0x18

    .line 119
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v3

    sub-int v3, v2, v3

    int-to-long v3, v3

    invoke-static {v3, v4, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 121
    invoke-virtual {p0, v2}, Ll/ۗᩴ᩵;->᩻(I)I

    move-result v0

    add-int/2addr v2, v0

    if-eqz v5, :cond_1

    .line 124
    array-length v0, v5

    invoke-static {v5, v1, p2, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 125
    array-length p2, v5

    add-int/2addr v2, p2

    :cond_1
    sub-int/2addr v2, p1

    return v2
.end method
