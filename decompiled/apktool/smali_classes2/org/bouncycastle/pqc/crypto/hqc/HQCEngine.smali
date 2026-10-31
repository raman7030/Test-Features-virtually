.class public Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;
.super Ljava/lang/Object;


# static fields
.field public static final SALT_SIZE_BYTES:I = 0x10

.field public static final SEED_BYTES:I = 0x20


# instance fields
.field public final K_BYTE:I

.field public final N1N2_BYTE:I

.field public final N1N2_BYTE_64:I

.field public final N_BYTE:I

.field public final N_BYTE_64:I

.field public final N_MU:I

.field public final delta:I

.field public final fft:I

.field public final g:I

.field public final generatorPoly:[I

.field public final gf:Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;

.field public final k:I

.field public final mulParam:I

.field public final n:I

.field public final n1:I

.field public final pkSize:I

.field public final rejectionThreshold:J

.field public final w:I

.field public final wr:I


# direct methods
.method public constructor <init>(IIIIIIIIIII[I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n:I

    iput p4, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->k:I

    iput p6, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->delta:I

    iput p7, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->w:I

    iput p8, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->wr:I

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n1:I

    iput-object p12, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->generatorPoly:[I

    iput p5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->g:I

    iput p9, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->fft:I

    iput p10, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_MU:I

    iput p11, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    shr-int/lit8 p5, p3, 0x7

    iput p5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->mulParam:I

    invoke-static {p1}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->getByteSizeFromBitSize(I)I

    move-result p5

    iput p5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE:I

    iput p4, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->K_BYTE:I

    invoke-static {p1}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->getByte64SizeFromBitSize(I)I

    move-result p4

    iput p4, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    mul-int p2, p2, p3

    invoke-static {p2}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->getByte64SizeFromBitSize(I)I

    move-result p3

    iput p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N1N2_BYTE_64:I

    invoke-static {p2}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->getByteSizeFromBitSize(I)I

    move-result p2

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N1N2_BYTE:I

    and-int/lit8 p2, p1, 0x3f

    const-wide/16 p5, 0x1

    shl-long p2, p5, p2

    sub-long/2addr p2, p5

    new-instance p5, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;

    invoke-direct {p5, p4, p1, p2, p3}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;-><init>(IIJ)V

    iput-object p5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->gf:Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;

    int-to-long p1, p1

    const-wide/32 p3, 0x1000000

    div-long/2addr p3, p1

    mul-long p3, p3, p1

    iput-wide p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->rejectionThreshold:J

    return-void
.end method

.method private barrettReduce(I)I
    .locals 5

    int-to-long v0, p1

    .line 0
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_MU:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    const/16 v2, 0x20

    ushr-long/2addr v0, v2

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n:I

    int-to-long v3, v2

    mul-long v0, v0, v3

    long-to-int v1, v0

    sub-int/2addr p1, v1

    sub-int v0, p1, v2

    ushr-int/lit8 v0, v0, 0x1f

    xor-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    and-int/2addr v0, v2

    sub-int/2addr p1, v0

    return p1
.end method

.method public static compareU32(II)I
    .locals 1

    sub-int v0, p0, p1

    sub-int/2addr p1, p0

    or-int p0, v0, p1

    ushr-int/lit8 p0, p0, 0x1f

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private generateRandomSupport([IILorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;)V
    .locals 10

    mul-int/lit8 v0, p2, 0x3

    .line 0
    new-array v1, v0, [B

    const/4 v2, 0x0

    move v3, v0

    :goto_0
    if-ge v2, p2, :cond_4

    if-ne v3, v0, :cond_0

    invoke-virtual {p3, v1, v0}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->xofGetBytes([BI)V

    const/4 v3, 0x0

    :cond_0
    add-int/lit8 v4, v3, 0x1

    aget-byte v5, v1, v3

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    add-int/lit8 v6, v3, 0x2

    aget-byte v4, v1, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x3

    aget-byte v5, v1, v6

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v4, v5

    int-to-long v5, v4

    iget-wide v7, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->rejectionThreshold:J

    cmp-long v9, v5, v7

    if-ltz v9, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v4}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->barrettReduce(I)I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_3

    aget v6, p1, v5

    if-ne v6, v4, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v2, 0x1

    aput v4, p1, v2

    move v2, v5

    goto :goto_0

    :cond_4
    return-void
.end method

.method private hashGJ([BI[B[BII[BIIB)V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/SHA3Digest;

    invoke-direct {v0, p2}, Lorg/bouncycastle/crypto/digests/SHA3Digest;-><init>(I)V

    array-length p2, p3

    const/4 v1, 0x0

    invoke-virtual {v0, p3, v1, p2}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v0, p4, p5, p6}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v0, p7, p8, p9}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v0, p10}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update(B)V

    invoke-virtual {v0, p1, v1}, Lorg/bouncycastle/crypto/digests/SHA3Digest;->doFinal([BI)I

    return-void
.end method

.method public static hashHI([BI[BIB)V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/SHA3Digest;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/digests/SHA3Digest;-><init>(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p2, p1, p3}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v0, p4}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update(B)V

    invoke-virtual {v0, p0, p1}, Lorg/bouncycastle/crypto/digests/SHA3Digest;->doFinal([BI)I

    return-void
.end method

.method private pkeEncrypt([J[J[B[B[BI)V
    .locals 9

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    new-array v1, v0, [J

    new-array v0, v0, [J

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n1:I

    new-array v8, v4, [B

    iget v5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->k:I

    iget v6, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->g:I

    iget-object v7, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->generatorPoly:[I

    move-object v2, v8

    move-object v3, p4

    invoke-static/range {v2 .. v7}, Lorg/bouncycastle/pqc/crypto/hqc/ReedSolomon;->encode([B[BIII[I)V

    iget p4, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n1:I

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->mulParam:I

    invoke-static {p2, v8, p4, v2}, Lorg/bouncycastle/pqc/crypto/hqc/ReedMuller;->encode([J[BII)V

    new-instance p4, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;

    const/4 v2, 0x0

    const/16 v3, 0x20

    const/4 v4, 0x1

    invoke-direct {p4, p3, v2, v3, v4}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;-><init>([BIIB)V

    invoke-direct {p0, p4, v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSetRandom(Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;[J)V

    invoke-virtual {p4, p5, p6, v3, v4}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->init([BIIB)V

    iget p5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->wr:I

    invoke-direct {p0, p4, v1, p5}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSampleFixedWeights2(Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;[JI)V

    iget-object p5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->gf:Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;

    invoke-virtual {p5, p1, v1, v0}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->vectMul([J[J[J)V

    iget p5, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    sub-int/2addr p5, v3

    invoke-static {v0, p3, v3, p5}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->fromByteArrayToLongArray([J[BII)V

    iget-object p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->gf:Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;

    invoke-virtual {p3, v0, v1, v0}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->vectMul([J[J[J)V

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->wr:I

    invoke-direct {p0, p4, v1, p3}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSampleFixedWeights2(Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;[JI)V

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    invoke-static {p3, v1, v2, v0, v2}, Lorg/bouncycastle/util/Longs;->xorTo(I[JI[JI)V

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectTruncate([J)V

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N1N2_BYTE_64:I

    invoke-static {p3, v0, v2, p2, v2}, Lorg/bouncycastle/util/Longs;->xorTo(I[JI[JI)V

    iget p2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->wr:I

    invoke-direct {p0, p4, v0, p2}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSampleFixedWeights2(Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;[JI)V

    iget p2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    invoke-static {p2, v0, v2, p1, v2}, Lorg/bouncycastle/util/Longs;->xorTo(I[JI[JI)V

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v8}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    return-void
.end method

.method private vectSampleFixedWeights2(Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;[JI)V
    .locals 6

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->wr:I

    new-array v1, v0, [I

    shl-int/lit8 v0, v0, 0x2

    new-array v2, v0, [B

    invoke-virtual {p1, v2, v0}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->xofGetBytes([BI)V

    const/4 p1, 0x0

    invoke-static {v2, p1, v1}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI[I)V

    :goto_0
    if-ge p1, p3, :cond_0

    aget v0, v1, p1

    int-to-long v2, v0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n:I

    sub-int/2addr v0, p1

    int-to-long v4, v0

    mul-long v2, v2, v4

    const/16 v0, 0x20

    shr-long/2addr v2, v0

    long-to-int v0, v2

    add-int/2addr v0, p1

    aput v0, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p3, -0x1

    :goto_1
    add-int/lit8 v0, p1, -0x1

    if-lez p1, :cond_2

    const/4 v2, 0x0

    :goto_2
    if-ge p1, p3, :cond_1

    aget v3, v1, p1

    aget v4, v1, v0

    invoke-static {v3, v4}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->compareU32(II)I

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_1
    neg-int p1, v2

    and-int v2, p1, v0

    not-int p1, p1

    aget v3, v1, v0

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    aput p1, v1, v0

    move p1, v0

    goto :goto_1

    :cond_2
    invoke-direct {p0, p2, v1, p3}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->writeSupportToVector([J[II)V

    return-void
.end method

.method private vectSetRandom(Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;[J)V
    .locals 6

    .line 0
    array-length v0, p2

    shl-int/lit8 v0, v0, 0x3

    new-array v0, v0, [B

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE:I

    invoke-virtual {p1, v0, v1}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->xofGetBytes([BI)V

    const/4 p1, 0x0

    invoke-static {v0, p1, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI[J)V

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    add-int/lit8 p1, p1, -0x1

    aget-wide v0, p2, p1

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n:I

    int-to-long v2, v2

    const-wide/16 v4, 0x40

    invoke-static {v2, v3, v4, v5}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->bitMask(JJ)J

    move-result-wide v2

    and-long/2addr v0, v2

    aput-wide v0, p2, p1

    return-void
.end method

.method private vectTruncate([J)V
    .locals 4

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N1N2_BYTE_64:I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n:I

    add-int/lit8 v1, v1, 0x3f

    shr-int/lit8 v1, v1, 0x6

    const-wide/16 v2, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lorg/bouncycastle/util/Arrays;->fill([JIIJ)V

    return-void
.end method

.method private writeSupportToVector([J[II)V
    .locals 10

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->wr:I

    new-array v1, v0, [I

    new-array v0, v0, [J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p3, :cond_0

    aget v3, p2, v2

    ushr-int/lit8 v3, v3, 0x6

    aput v3, v1, v2

    aget v3, p2, v2

    and-int/lit8 v3, v3, 0x3f

    const-wide/16 v4, 0x1

    shl-long v3, v4, v3

    aput-wide v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_1
    array-length v2, p1

    if-ge p2, v2, :cond_2

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, p3, :cond_1

    aget v5, v1, v4

    sub-int v5, p2, v5

    aget-wide v6, v0, v4

    neg-int v8, v5

    or-int/2addr v5, v8

    ushr-int/lit8 v5, v5, 0x1f

    xor-int/lit8 v5, v5, 0x1

    neg-int v5, v5

    int-to-long v8, v5

    and-long v5, v6, v8

    or-long/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    aput-wide v2, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public decaps([B[B[B)I
    .locals 28

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    .line 0
    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    new-array v15, v0, [J

    new-array v10, v0, [J

    new-array v9, v0, [J

    new-array v8, v0, [J

    const/16 v0, 0x20

    new-array v7, v0, [B

    const/16 v1, 0x40

    new-array v6, v1, [B

    iget v5, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->k:I

    new-array v4, v5, [B

    new-array v3, v0, [B

    iget v1, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n1:I

    new-array v2, v1, [B

    new-instance v1, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;

    move-object/from16 v23, v3

    iget v3, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    move/from16 v24, v5

    const/4 v5, 0x1

    invoke-direct {v1, v14, v3, v0, v5}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;-><init>([BIIB)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->w:I

    invoke-virtual {v11, v8, v1, v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSampleFixedWeight1([JLorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;I)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE:I

    const/4 v1, 0x0

    invoke-static {v15, v13, v1, v0}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->fromByteArrayToLongArray([J[BII)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE:I

    iget v3, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N1N2_BYTE:I

    invoke-static {v10, v13, v0, v3}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->fromByteArrayToLongArray([J[BII)V

    iget-object v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->gf:Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;

    invoke-virtual {v0, v9, v8, v15}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->vectMul([J[J[J)V

    invoke-direct {v11, v9}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectTruncate([J)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    invoke-static {v0, v10, v1, v9, v1}, Lorg/bouncycastle/util/Longs;->xorTo(I[JI[JI)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n1:I

    iget v1, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->mulParam:I

    invoke-static {v2, v9, v0, v1}, Lorg/bouncycastle/pqc/crypto/hqc/ReedMuller;->decode([B[JII)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->n1:I

    iget v1, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->fft:I

    iget v3, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->delta:I

    iget v5, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->k:I

    move-object/from16 v25, v8

    iget v8, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->g:I

    move-object/from16 v16, v4

    move-object/from16 v17, v2

    move/from16 v18, v0

    move/from16 v19, v1

    move/from16 v20, v3

    move/from16 v21, v5

    move/from16 v22, v8

    invoke-static/range {v16 .. v22}, Lorg/bouncycastle/pqc/crypto/hqc/ReedSolomon;->decode([B[BIIIII)V

    const/16 v0, 0x100

    iget v1, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    const/4 v3, 0x1

    invoke-static {v7, v0, v14, v1, v3}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->hashHI([BI[BIB)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE:I

    iget v1, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N1N2_BYTE:I

    add-int v8, v0, v1

    const/16 v16, 0x10

    const/16 v17, 0x0

    const/16 v3, 0x200

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/16 v0, 0x20

    move-object/from16 v0, p0

    move-object v1, v6

    move-object/from16 v18, v2

    move v2, v3

    move-object/from16 v19, v23

    move-object v3, v7

    move-object/from16 v20, v4

    move/from16 v21, v24

    move-object/from16 v26, v6

    move/from16 v6, v21

    move-object/from16 v21, v7

    move-object/from16 v7, p2

    move-object/from16 v27, v25

    move-object/from16 v22, v9

    move/from16 v9, v16

    move-object v14, v10

    move/from16 v10, v17

    invoke-direct/range {v0 .. v10}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->hashGJ([BI[B[BII[BIIB)V

    move-object/from16 v10, v26

    const/16 v0, 0x20

    const/4 v9, 0x0

    invoke-static {v10, v9, v12, v9, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const-wide/16 v0, 0x0

    move-object/from16 v8, v27

    invoke-static {v8, v0, v1}, Lorg/bouncycastle/util/Arrays;->fill([JJ)V

    const/16 v6, 0x20

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    move-object v2, v8

    move-object/from16 v3, p3

    move-object v5, v10

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkeEncrypt([J[J[B[B[BI)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    add-int/lit8 v5, v0, 0x20

    iget v6, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->K_BYTE:I

    array-length v7, v13

    const/16 v16, 0x3

    const/16 v2, 0x100

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v3, v21

    move-object/from16 v4, p3

    move/from16 v23, v7

    move-object/from16 v7, p2

    move-object v13, v8

    move/from16 v8, v17

    move/from16 v9, v23

    move-object/from16 v17, v10

    move/from16 v10, v16

    invoke-direct/range {v0 .. v10}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->hashGJ([BI[B[BII[BIIB)V

    iget v0, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    move-object/from16 v1, v22

    const/4 v2, 0x0

    invoke-static {v0, v15, v2, v1, v2}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual(I[JI[JI)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget v3, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    invoke-static {v3, v14, v2, v13, v2}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual(I[JI[JI)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x0

    :goto_0
    iget v3, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->K_BYTE:I

    if-ge v2, v3, :cond_1

    aget-byte v3, v12, v2

    and-int/2addr v3, v0

    aget-byte v4, v19, v2

    not-int v5, v0

    and-int/2addr v4, v5

    xor-int/2addr v3, v4

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v12, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v15}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v14}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v13}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static/range {v21 .. v21}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-static/range {v17 .. v17}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-static/range {v20 .. v20}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-static/range {v19 .. v19}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-static/range {v18 .. v18}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    neg-int v0, v0

    return v0
.end method

.method public encaps([B[B[B[B[BLjava/security/SecureRandom;)V
    .locals 17

    move-object/from16 v11, p0

    move-object/from16 v12, p4

    move-object/from16 v0, p6

    .line 0
    iget v6, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->K_BYTE:I

    new-array v13, v6, [B

    const/16 v1, 0x20

    new-array v14, v1, [B

    iget v1, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    new-array v15, v1, [J

    iget v1, v11, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N1N2_BYTE_64:I

    new-array v10, v1, [J

    invoke-virtual {v0, v13}, Ljava/security/SecureRandom;->nextBytes([B)V

    move-object/from16 v7, p5

    invoke-virtual {v0, v7}, Ljava/security/SecureRandom;->nextBytes([B)V

    array-length v0, v12

    const/4 v1, 0x1

    const/16 v2, 0x100

    invoke-static {v14, v2, v12, v0, v1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->hashHI([BI[BIB)V

    const/16 v9, 0x10

    const/16 v16, 0x0

    const/16 v2, 0x200

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object v3, v14

    move-object v4, v13

    move-object/from16 p5, v10

    move/from16 v10, v16

    invoke-direct/range {v0 .. v10}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->hashGJ([BI[B[BII[BIIB)V

    const/16 v6, 0x20

    move-object v1, v15

    move-object/from16 v2, p5

    move-object/from16 v3, p4

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkeEncrypt([J[J[B[B[BI)V

    move-object/from16 v0, p1

    invoke-static {v0, v15}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->fromLongArrayToByteArray([B[J)V

    move-object/from16 v0, p2

    move-object/from16 v1, p5

    invoke-static {v0, v1}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->fromLongArrayToByteArray([B[J)V

    invoke-static {v15}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v13}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-static {v14}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    return-void
.end method

.method public genKeyPair([B[BLjava/security/SecureRandom;)V
    .locals 10

    const/16 v0, 0x20

    new-array v1, v0, [B

    const/16 v2, 0x40

    new-array v2, v2, [B

    .line 0
    iget v3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    new-array v4, v3, [J

    new-array v5, v3, [J

    new-array v3, v3, [J

    invoke-virtual {p3, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance p3, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;

    const/4 v6, 0x1

    invoke-direct {p3, v1, v6}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;-><init>([BB)V

    iget v7, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    add-int/2addr v7, v0

    iget v8, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->K_BYTE:I

    add-int/2addr v7, v8

    const/4 v8, 0x0

    invoke-static {v1, v8, p2, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p3, v1}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->nextBytes([B)V

    iget v7, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    add-int/2addr v7, v0

    iget v9, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->K_BYTE:I

    invoke-virtual {p3, p2, v7, v9}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->nextBytes([BII)V

    const/16 v7, 0x200

    const/4 v9, 0x2

    invoke-static {v2, v7, v1, v0, v9}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->hashHI([BI[BIB)V

    invoke-virtual {p3, v2, v8, v0, v6}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->init([BIIB)V

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->w:I

    invoke-virtual {p0, v5, p3, v1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSampleFixedWeight1([JLorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;I)V

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->w:I

    invoke-virtual {p0, v4, p3, v1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSampleFixedWeight1([JLorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;I)V

    invoke-static {v2, v0, p1, v8, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p3, v2, v0, v0, v6}, Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;->init([BIIB)V

    invoke-direct {p0, p3, v3}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->vectSetRandom(Lorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;[J)V

    iget-object p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->gf:Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;

    invoke-virtual {p3, v3, v5, v3}, Lorg/bouncycastle/pqc/crypto/hqc/GF2PolynomialCalculator;->vectMul([J[J[J)V

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->N_BYTE_64:I

    invoke-static {p3, v4, v8, v3, v8}, Lorg/bouncycastle/util/Longs;->xorTo(I[JI[JI)V

    array-length p3, p1

    sub-int/2addr p3, v0

    invoke-static {p1, v0, p3, v3}, Lorg/bouncycastle/pqc/crypto/hqc/Utils;->fromLongArrayToByteArray([BII[J)V

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    invoke-static {v2, v8, p2, p3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->pkSize:I

    invoke-static {p1, v8, p2, v8, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-static {v4}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v5}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    invoke-static {v3}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    return-void
.end method

.method public vectSampleFixedWeight1([JLorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;I)V
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->wr:I

    new-array v0, v0, [I

    invoke-direct {p0, v0, p3, p2}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->generateRandomSupport([IILorg/bouncycastle/pqc/crypto/hqc/Shake256RandomGenerator;)V

    invoke-direct {p0, p1, v0, p3}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->writeSupportToVector([J[II)V

    return-void
.end method
