.class public final Ll/ۡ᩵᩵;
.super Ll/۬ᩴ᩵;
.source "O9XY"

# interfaces
.implements Ll/ۙᩴ᩵;


# instance fields
.field public ۖ֫:[B

.field public ۘ֫:J

.field public ۡ֫:I

.field public ۢ֫:[B

.field public ܺ֫:I

.field public ᩴ֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;[B)V
    .locals 1

    const/16 v0, 0x9

    .line 55
    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 56
    iput-object p2, p0, Ll/ۡ᩵᩵;->ۖ֫:[B

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 120
    iget v0, p0, Ll/ۡ᩵᩵;->ۡ֫:I

    add-int/lit8 v0, v0, 0x70

    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫([B)V
    .locals 0

    .line 67
    iput-object p1, p0, Ll/ۡ᩵᩵;->ۖ֫:[B

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(II[B)V
    .locals 0

    .line 83
    iput-object p3, p0, Ll/ۡ᩵᩵;->ۢ֫:[B

    .line 84
    iput p1, p0, Ll/ۡ᩵᩵;->ܺ֫:I

    .line 85
    iput p2, p0, Ll/ۡ᩵᩵;->ۡ֫:I

    return-void
.end method

.method public final ܺ(I)V
    .locals 0

    .line 93
    iput p1, p0, Ll/ۡ᩵᩵;->ᩴ֫:I

    return-void
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 1

    .line 73
    new-instance v0, Ll/ܺ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 8

    const-wide/16 v0, 0x31

    .line 132
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    add-int/lit8 v1, p1, 0x4

    .line 135
    iget v2, p0, Ll/ۡ᩵᩵;->ۡ֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v1, p1, 0x8

    .line 137
    iget-wide v2, p0, Ll/ۡ᩵᩵;->ۘ֫:J

    invoke-static {v2, v3, v1, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    add-int/lit8 v1, p1, 0x10

    .line 139
    iget-object v2, p0, Ll/ۡ᩵᩵;->ۖ֫:[B

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-static {v2, v3, p2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v1, p1, 0x20

    int-to-long v4, v3

    .line 141
    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v1, p1, 0x24

    .line 143
    iget v2, p0, Ll/ۡ᩵᩵;->ᩴ֫:I

    int-to-long v6, v2

    invoke-static {v6, v7, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v1, p1, 0x28

    const-wide/16 v6, 0x0

    .line 146
    invoke-static {v6, v7, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, p1, 0x2a

    .line 147
    invoke-static {v6, v7, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, p1, 0x2c

    .line 150
    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v1, p1, 0x30

    .line 153
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v2

    sub-int v2, v1, v2

    int-to-long v4, v2

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 155
    iget v0, p0, Ll/ۡ᩵᩵;->ۡ֫:I

    add-int v2, v1, v0

    array-length v4, p2

    if-gt v2, v4, :cond_0

    .line 160
    iget-object v2, p0, Ll/ۡ᩵᩵;->ۢ֫:[B

    iget v3, p0, Ll/ۡ᩵᩵;->ܺ֫:I

    invoke-static {v2, v3, p2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 161
    iget p2, p0, Ll/ۡ᩵᩵;->ۡ֫:I

    add-int/2addr v1, p2

    sub-int/2addr v1, p1

    return v1

    .line 156
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    array-length p2, p2

    sub-int/2addr p2, v1

    .line 157
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget v0, p0, Ll/ۡ᩵᩵;->ۡ֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v3

    const/4 p2, 0x1

    aput-object v0, v1, p2

    const-string p2, "Data exceeds buffer size ( remain buffer: %d data length: %d)"

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 109
    iput-wide p1, p0, Ll/ۡ᩵᩵;->ۘ֫:J

    return-void
.end method
