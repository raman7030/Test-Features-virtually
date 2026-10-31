.class public Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;
.super Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;


# instance fields
.field public final maskDigest:Lorg/bouncycastle/crypto/Xof;

.field public final treeDigest:Lorg/bouncycastle/crypto/Xof;


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p6}, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;-><init>(IIIIII)V

    new-instance p1, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 p2, 0x100

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    new-instance p1, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->maskDigest:Lorg/bouncycastle/crypto/Xof;

    return-void
.end method


# virtual methods
.method public F([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B)[B
    .locals 5

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->N:I

    new-array v1, v0, [B

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v3, p1

    const/4 v4, 0x0

    invoke-interface {v2, p1, v4, v3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    iget-object p2, p2, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->value:[B

    array-length v2, p2

    invoke-interface {p1, p2, v4, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p3

    invoke-interface {p1, p3, v4, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p1, v1, v4, v0}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    return-object v1
.end method

.method public H([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B[B)[B
    .locals 5

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->N:I

    new-array v1, v0, [B

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v3, p1

    const/4 v4, 0x0

    invoke-interface {v2, p1, v4, v3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    iget-object p2, p2, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->value:[B

    array-length v2, p2

    invoke-interface {p1, p2, v4, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p3

    invoke-interface {p1, p3, v4, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p4

    invoke-interface {p1, p4, v4, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p1, v1, v4, v0}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    return-object v1
.end method

.method public H_msg([B[B[B[B[B)Lorg/bouncycastle/pqc/crypto/slhdsa/IndexedDigest;
    .locals 10

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->A:I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->K:I

    mul-int v0, v0, v1

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H:I

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->D:I

    div-int v2, v1, v2

    sub-int/2addr v1, v2

    add-int/lit8 v3, v2, 0x7

    div-int/lit8 v3, v3, 0x8

    add-int/lit8 v4, v1, 0x7

    div-int/lit8 v4, v4, 0x8

    add-int v5, v0, v3

    add-int/2addr v5, v4

    new-array v6, v5, [B

    iget-object v7, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v8, p1

    const/4 v9, 0x0

    invoke-interface {v7, p1, v9, v8}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v7, p2

    invoke-interface {p1, p2, v9, v7}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p3

    invoke-interface {p1, p3, v9, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    if-eqz p4, :cond_0

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p4

    invoke-interface {p1, p4, v9, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p5

    invoke-interface {p1, p5, v9, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p1, v6, v9, v5}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    const/16 p1, 0x8

    new-array p1, p1, [B

    rsub-int/lit8 p2, v4, 0x8

    invoke-static {v6, v0, p1, p2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1, v9}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide p1

    rsub-int/lit8 p3, v1, 0x40

    const-wide/16 p4, -0x1

    ushr-long p3, p4, p3

    and-long/2addr p1, p3

    const/4 p3, 0x4

    new-array p3, p3, [B

    add-int/2addr v4, v0

    rsub-int/lit8 p4, v3, 0x4

    invoke-static {v6, v4, p3, p4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p3, v9}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result p3

    rsub-int/lit8 p4, v2, 0x20

    const/4 p5, -0x1

    ushr-int p4, p5, p4

    and-int/2addr p3, p4

    new-instance p4, Lorg/bouncycastle/pqc/crypto/slhdsa/IndexedDigest;

    invoke-static {v6, v9, v0}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object p5

    invoke-direct {p4, p1, p2, p3, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/IndexedDigest;-><init>(JI[B)V

    return-object p4
.end method

.method public PRF([B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-interface {v0, p1, v2, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    iget-object p3, p3, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->value:[B

    array-length v0, p3

    invoke-interface {p1, p3, v2, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p3, p2

    invoke-interface {p1, p2, v2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->N:I

    new-array p2, p1, [B

    iget-object p3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p3, p2, v2, p1}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    return-object p2
.end method

.method public PRF_msg([B[B[B[B)[B
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-interface {v0, p1, v2, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v0, p2

    invoke-interface {p1, p2, v2, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    if-eqz p3, :cond_0

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p3

    invoke-interface {p1, p3, v2, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p4

    invoke-interface {p1, p4, v2, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->N:I

    new-array p2, p1, [B

    iget-object p3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p3, p2, v2, p1}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    return-object p2
.end method

.method public T_l([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B)[B
    .locals 5

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->N:I

    new-array v1, v0, [B

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v3, p1

    const/4 v4, 0x0

    invoke-interface {v2, p1, v4, v3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    iget-object p2, p2, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->value:[B

    array-length v2, p2

    invoke-interface {p1, p2, v4, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    array-length p2, p3

    invoke-interface {p1, p3, v4, p2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->treeDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p1, v1, v4, v0}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    return-object v1
.end method

.method public bitmask([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B)[B
    .locals 5

    .line 0
    array-length v0, p3

    new-array v1, v0, [B

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->maskDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v3, p1

    const/4 v4, 0x0

    invoke-interface {v2, p1, v4, v3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->maskDigest:Lorg/bouncycastle/crypto/Xof;

    iget-object p2, p2, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->value:[B

    array-length v2, p2

    invoke-interface {p1, p2, v4, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->maskDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p1, v1, v4, v0}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    array-length p1, p3

    invoke-static {p1, p3, v1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    return-object v1
.end method

.method public bitmask([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B[B)[B
    .locals 5

    .line 0
    array-length v0, p3

    array-length v1, p4

    add-int/2addr v0, v1

    new-array v1, v0, [B

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->maskDigest:Lorg/bouncycastle/crypto/Xof;

    array-length v3, p1

    const/4 v4, 0x0

    invoke-interface {v2, p1, v4, v3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->maskDigest:Lorg/bouncycastle/crypto/Xof;

    iget-object p2, p2, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->value:[B

    array-length v2, p2

    invoke-interface {p1, p2, v4, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;->maskDigest:Lorg/bouncycastle/crypto/Xof;

    invoke-interface {p1, v1, v4, v0}, Lorg/bouncycastle/crypto/Xof;->doFinal([BII)I

    array-length p1, p3

    invoke-static {p1, p3, v1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    array-length p1, p4

    array-length p2, p3

    invoke-static {p1, p4, v4, v1, p2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[BI[BI)V

    return-object v1
.end method

.method public init([B)V
    .locals 0

    return-void
.end method
