.class public Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;
.super Ljava/lang/Object;


# static fields
.field public static final CrhBytes:I = 0x40

.field public static final DilithiumD:I = 0xd

.field public static final DilithiumN:I = 0x100

.field public static final DilithiumPolyT0PackedBytes:I = 0x1a0

.field public static final DilithiumPolyT1PackedBytes:I = 0x140

.field public static final DilithiumQ:I = 0x7fe001

.field public static final DilithiumQinv:I = 0x3802001

.field public static final RndBytes:I = 0x20

.field public static final SeedBytes:I = 0x20

.field public static final TrBytes:I = 0x40


# instance fields
.field public final CryptoBytes:I

.field public final CryptoPublicKeyBytes:I

.field public final DilithiumBeta:I

.field public final DilithiumCTilde:I

.field public final DilithiumEta:I

.field public final DilithiumGamma1:I

.field public final DilithiumGamma2:I

.field public final DilithiumK:I

.field public final DilithiumL:I

.field public final DilithiumOmega:I

.field public final DilithiumPolyEtaPackedBytes:I

.field public final DilithiumPolyVecHPackedBytes:I

.field public final DilithiumPolyW1PackedBytes:I

.field public final DilithiumPolyZPackedBytes:I

.field public final DilithiumTau:I

.field public final PolyUniformGamma1NBlocks:I

.field public final random:Ljava/security/SecureRandom;

.field public final shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

.field public final symmetric:Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric;


# direct methods
.method public constructor <init>(ILjava/security/SecureRandom;)V
    .locals 11

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v1, 0x100

    .line 10
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    .line 12
    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v0, 0x20

    const/high16 v1, 0x20000

    const/16 v2, 0x60

    const/4 v3, 0x4

    const/high16 v4, 0x80000

    const/4 v5, 0x2

    if-eq p1, v5, :cond_2

    const/4 v6, 0x3

    const/16 v7, 0x280

    const v8, 0x3ff00

    const/4 v9, 0x5

    const/16 v10, 0x80

    if-eq p1, v6, :cond_1

    if-ne p1, v9, :cond_0

    const/16 p1, 0x8

    .line 41
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    const/4 p1, 0x7

    .line 44
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumL:I

    .line 46
    iput v5, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumEta:I

    const/16 p1, 0x3c

    .line 50
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumTau:I

    const/16 p1, 0x78

    .line 54
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumBeta:I

    .line 56
    iput v4, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma1:I

    .line 58
    iput v8, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma2:I

    const/16 p1, 0x4b

    .line 62
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumOmega:I

    .line 64
    iput v7, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyZPackedBytes:I

    .line 66
    iput v10, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    .line 68
    iput v2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyEtaPackedBytes:I

    const/16 p1, 0x40

    .line 72
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    goto :goto_0

    .line 75
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "The mode "

    const-string v1, "is not supported by Crystals Dilithium!"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const/4 p1, 0x6

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    iput v9, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumL:I

    iput v3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumEta:I

    const/16 p1, 0x31

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumTau:I

    const/16 p1, 0xc4

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumBeta:I

    iput v4, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma1:I

    iput v8, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma2:I

    const/16 p1, 0x37

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumOmega:I

    iput v7, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyZPackedBytes:I

    iput v10, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    iput v10, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyEtaPackedBytes:I

    const/16 p1, 0x30

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    goto :goto_0

    :cond_2
    iput v3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    iput v3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumL:I

    iput v5, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumEta:I

    const/16 p1, 0x27

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumTau:I

    const/16 p1, 0x4e

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumBeta:I

    iput v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma1:I

    const p1, 0x17400

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma2:I

    const/16 p1, 0x50

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumOmega:I

    const/16 p1, 0x240

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyZPackedBytes:I

    const/16 p1, 0xc0

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyEtaPackedBytes:I

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    :goto_0
    new-instance p1, Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric$ShakeSymmetric;

    invoke-direct {p1}, Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric$ShakeSymmetric;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric;

    iput-object p2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->random:Ljava/security/SecureRandom;

    iget p2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumOmega:I

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    add-int/2addr p2, v2

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyVecHPackedBytes:I

    mul-int/lit16 v2, v2, 0x140

    add-int/2addr v2, v0

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->CryptoPublicKeyBytes:I

    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumL:I

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyZPackedBytes:I

    invoke-static {v2, v3, v0, p2}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result p2

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->CryptoBytes:I

    iget p2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma1:I

    if-ne p2, v1, :cond_3

    iget p1, p1, Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric;->stream256BlockBytes:I

    add-int/lit16 p2, p1, 0x23f

    goto :goto_1

    :cond_3
    if-ne p2, v4, :cond_4

    iget p1, p1, Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric;->stream256BlockBytes:I

    add-int/lit16 p2, p1, 0x27f

    :goto_1
    div-int/2addr p2, p1

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->PolyUniformGamma1NBlocks:I

    return-void

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Wrong Dilithium Gamma1!"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private doVerifyInternal([B[BILorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B)Z
    .locals 6

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->CryptoBytes:I

    const/4 v1, 0x0

    if-eq p3, v0, :cond_0

    return v1

    :cond_0
    new-instance p3, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {p3, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v0, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    invoke-static {v0, p3, p2, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->unpackSignature(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;[BLorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->getDilithiumGamma1()I

    move-result v2

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->getDilithiumBeta()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v2}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->checkNorm(I)Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_2
    new-instance v2, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;

    invoke-direct {v2, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v3, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;

    invoke-direct {v3, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v4, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v4, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v5, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v5, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    invoke-static {v4, p6, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->unpackPublicKey(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;[BLorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    move-result-object p6

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    invoke-virtual {v2, p2, v1, v4}, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;->challenge([BII)V

    invoke-virtual {v3, p5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->expandMatrix([B)V

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->polyVecNtt()V

    invoke-virtual {v3, v5, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->pointwiseMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;->polyNtt()V

    invoke-virtual {p6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->shiftLeft()V

    invoke-virtual {p6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->polyVecNtt()V

    invoke-virtual {p6, v2, p6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->pointwisePolyMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/Poly;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v5, p6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->subtract(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->reduce()V

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->invNttToMont()V

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->conditionalAddQ()V

    invoke-virtual {v5, v5, p3}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->useHint(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    const/16 p3, 0x40

    invoke-virtual {v5, p0, p1, p3}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->packW1(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;[BI)V

    iget p5, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    iget p6, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    mul-int p5, p5, p6

    add-int/2addr p5, p3

    invoke-virtual {p4, p1, v1, p5}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    invoke-virtual {p4, p1, v1, p3}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    iget p3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    invoke-static {p3, p2, v1, p1, v1}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual(I[BI[BI)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public GetSymmetric()Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->symmetric:Lorg/bouncycastle/pqc/crypto/mldsa/Symmetric;

    return-object v0
.end method

.method public absorbCtx(Z[B)V
    .locals 2

    if-eqz p2, :cond_0

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update(B)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    array-length v0, p2

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update(B)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/4 v0, 0x0

    array-length v1, p2

    invoke-virtual {p1, p2, v0, v1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    :cond_0
    return-void
.end method

.method public deriveT1([B[B[B[B[B[B)[B
    .locals 13

    move-object v7, p0

    .line 0
    new-instance v8, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;

    invoke-direct {v8, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v9, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v9, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v10, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v10, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v11, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v11, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v12, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v12, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    move-object v0, v12

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v3, p6

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->unpackSecretKey(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;[B[B[BLorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    move-object v0, p1

    invoke-virtual {v8, p1}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->expandMatrix([B)V

    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v0, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    invoke-virtual {v9, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->copyTo(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->polyVecNtt()V

    invoke-virtual {v8, v11, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->pointwiseMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v11}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->reduce()V

    invoke-virtual {v11}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->invNttToMont()V

    invoke-virtual {v11, v10}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->addPolyVecK(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v11}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->conditionalAddQ()V

    invoke-virtual {v11, v12}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->power2Round(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-static {v11, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->packPublicKey(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)[B

    move-result-object v0

    return-object v0
.end method

.method public generateKeyPair()[[B
    .locals 2

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 0
    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->random:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-virtual {p0, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->generateKeyPairInternal([B)[[B

    move-result-object v0

    return-object v0
.end method

.method public generateKeyPairInternal([B)[[B
    .locals 14

    const/16 v0, 0x80

    new-array v1, v0, [B

    const/16 v2, 0x40

    new-array v4, v2, [B

    const/16 v3, 0x20

    new-array v5, v3, [B

    new-array v2, v2, [B

    new-array v6, v3, [B

    .line 0
    new-instance v7, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;

    invoke-direct {v7, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v8, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v8, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v9, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v9, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v10, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v10, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v11, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v11, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    iget-object v12, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/4 v13, 0x0

    invoke-virtual {v12, p1, v13, v3}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget-object v3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    iget v12, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    int-to-byte v12, v12

    invoke-virtual {v3, v12}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update(B)V

    iget-object v3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    iget v12, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumL:I

    int-to-byte v12, v12

    invoke-virtual {v3, v12}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update(B)V

    iget-object v3, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-virtual {v3, v1, v13, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    const/16 v0, 0x20

    invoke-static {v1, v13, v5, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v3, 0x40

    invoke-static {v1, v0, v2, v13, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v3, 0x60

    invoke-static {v1, v3, v6, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v7, v5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->expandMatrix([B)V

    invoke-virtual {v8, v2, v13}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->uniformEta([BS)V

    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumL:I

    int-to-short v0, v0

    invoke-virtual {v9, v2, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->uniformEta([BS)V

    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v0, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    invoke-virtual {v8, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->copyTo(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->polyVecNtt()V

    invoke-virtual {v7, v10, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->pointwiseMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v10}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->reduce()V

    invoke-virtual {v10}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->invNttToMont()V

    invoke-virtual {v10, v9}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->addPolyVecK(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v10}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->conditionalAddQ()V

    invoke-virtual {v10, v11}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->power2Round(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-static {v10, p0}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->packPublicKey(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v2, 0x20

    invoke-virtual {v1, v5, v13, v2}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    array-length v2, v0

    invoke-virtual {v1, v0, v13, v2}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v2, 0x40

    invoke-virtual {v1, v4, v13, v2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    const/4 v1, 0x0

    move-object v3, v5

    move-object v5, v6

    move-object v6, v11

    move-object v7, v8

    move-object v8, v9

    move-object v9, p0

    invoke-static/range {v3 .. v9}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->packSecretKey([B[B[BLorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)[[B

    move-result-object v2

    aget-object v3, v2, v1

    const/4 v4, 0x1

    aget-object v5, v2, v4

    const/4 v6, 0x2

    aget-object v7, v2, v6

    const/4 v8, 0x3

    aget-object v9, v2, v8

    const/4 v10, 0x4

    aget-object v11, v2, v10

    const/4 v12, 0x5

    aget-object v2, v2, v12

    const/16 v13, 0x8

    new-array v13, v13, [[B

    aput-object v3, v13, v1

    aput-object v5, v13, v4

    aput-object v7, v13, v6

    aput-object v9, v13, v8

    aput-object v11, v13, v10

    aput-object v2, v13, v12

    const/4 v1, 0x6

    aput-object v0, v13, v1

    const/4 v0, 0x7

    aput-object p1, v13, v0

    return-object v13
.end method

.method public generateMu(Lorg/bouncycastle/crypto/digests/SHAKEDigest;)[B
    .locals 3

    const/16 v0, 0x40

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 0
    invoke-virtual {p1, v1, v2, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    return-object v1
.end method

.method public generateSignature([BLorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B[B[B[B[B)[B
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    .line 0
    iget v0, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->CryptoBytes:I

    new-array v10, v0, [B

    const/16 v11, 0x40

    new-array v12, v11, [B

    new-instance v13, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v13, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v14, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v14, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v15, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;

    invoke-direct {v15, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v6, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v6, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v5, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v5, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v4, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v4, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v3, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v3, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v2, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;

    invoke-direct {v2, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v1, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;

    invoke-direct {v1, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;

    invoke-direct {v0, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    move-object/from16 v16, v0

    move-object v0, v6

    move-object/from16 v17, v1

    move-object v1, v13

    move-object/from16 v18, v2

    move-object v2, v5

    move-object/from16 v19, v3

    move-object/from16 v3, p5

    move-object/from16 v20, v4

    move-object/from16 v4, p6

    move-object/from16 p5, v5

    move-object/from16 v5, p7

    move-object/from16 p6, v6

    move-object/from16 v6, p0

    invoke-static/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->unpackSecretKey(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;[B[B[BLorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    const/16 v0, 0x80

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lorg/bouncycastle/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const/16 v1, 0x20

    const/4 v2, 0x0

    move-object/from16 v3, p8

    invoke-static {v3, v2, v0, v1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v8, v2, v0, v11, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v1, 0x80

    invoke-virtual {v9, v0, v2, v1}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v9, v12, v2, v11}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    move-object/from16 v0, p3

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->expandMatrix([B)V

    invoke-virtual {v13}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->polyVecNtt()V

    invoke-virtual/range {p5 .. p5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->polyVecNtt()V

    invoke-virtual/range {p6 .. p6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->polyVecNtt()V

    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x3e8

    if-ge v0, v4, :cond_4

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v4, v3, 0x1

    int-to-short v4, v4

    invoke-virtual {v14, v12, v3}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->uniformGamma1([BS)V

    invoke-virtual {v14, v15}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->copyTo(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v15}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->polyVecNtt()V

    move-object/from16 v3, v20

    invoke-virtual {v1, v3, v15}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecMatrix;->pointwiseMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->reduce()V

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->invNttToMont()V

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->conditionalAddQ()V

    move-object/from16 v5, v19

    invoke-virtual {v3, v5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->decompose(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v3, v7, v10, v2}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->packW1(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;[BI)V

    const/16 v6, 0x40

    invoke-virtual {v9, v8, v2, v6}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget v6, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    iget v11, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    mul-int v6, v6, v11

    invoke-virtual {v9, v10, v2, v6}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget v6, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    invoke-virtual {v9, v10, v2, v6}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    iget v6, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    move-object/from16 v11, v17

    invoke-virtual {v11, v10, v2, v6}, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;->challenge([BII)V

    invoke-virtual {v11}, Lorg/bouncycastle/pqc/crypto/mldsa/Poly;->polyNtt()V

    invoke-virtual {v15, v11, v13}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->pointwisePolyMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/Poly;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v15}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->invNttToMont()V

    invoke-virtual {v15, v14}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->addPolyVecL(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;)V

    invoke-virtual {v15}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->reduce()V

    iget v2, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma1:I

    iget v6, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumBeta:I

    sub-int/2addr v2, v6

    invoke-virtual {v15, v2}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;->checkNorm(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object/from16 v2, p5

    move/from16 p3, v0

    move-object/from16 v16, v1

    move-object/from16 v6, v18

    goto :goto_1

    :cond_0
    move-object/from16 v2, p5

    move-object/from16 v6, v18

    invoke-virtual {v6, v11, v2}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->pointwisePolyMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/Poly;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->invNttToMont()V

    invoke-virtual {v5, v6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->subtract(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->reduce()V

    move/from16 p3, v0

    iget v0, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma2:I

    move-object/from16 v16, v1

    iget v1, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumBeta:I

    sub-int/2addr v0, v1

    invoke-virtual {v5, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->checkNorm(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v0, p6

    invoke-virtual {v6, v11, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->pointwisePolyMontgomery(Lorg/bouncycastle/pqc/crypto/mldsa/Poly;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->invNttToMont()V

    invoke-virtual {v6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->reduce()V

    iget v1, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma2:I

    invoke-virtual {v6, v1}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->checkNorm(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object/from16 p6, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v5, v6}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->addPolyVecK(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)V

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->conditionalAddQ()V

    invoke-virtual {v6, v5, v3}, Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;->makeHint(Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;)I

    move-result v1

    move-object/from16 p6, v0

    iget v0, v7, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumOmega:I

    if-le v1, v0, :cond_3

    :goto_1
    const/4 v0, 0x0

    move/from16 v0, p3

    move-object/from16 p5, v2

    move-object/from16 v20, v3

    move v3, v4

    move-object/from16 v19, v5

    move-object/from16 v18, v6

    move-object/from16 v17, v11

    move-object/from16 v1, v16

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_3
    invoke-static {v10, v15, v6, v7}, Lorg/bouncycastle/pqc/crypto/mldsa/Packing;->packSignature([BLorg/bouncycastle/pqc/crypto/mldsa/PolyVecL;Lorg/bouncycastle/pqc/crypto/mldsa/PolyVecK;Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;)V

    return-object v10

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCryptoPublicKeyBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->CryptoPublicKeyBytes:I

    return v0
.end method

.method public getDilithiumBeta()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumBeta:I

    return v0
.end method

.method public getDilithiumCTilde()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    return v0
.end method

.method public getDilithiumEta()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumEta:I

    return v0
.end method

.method public getDilithiumGamma1()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma1:I

    return v0
.end method

.method public getDilithiumGamma2()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumGamma2:I

    return v0
.end method

.method public getDilithiumK()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    return v0
.end method

.method public getDilithiumL()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumL:I

    return v0
.end method

.method public getDilithiumOmega()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumOmega:I

    return v0
.end method

.method public getDilithiumPolyEtaPackedBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyEtaPackedBytes:I

    return v0
.end method

.method public getDilithiumPolyW1PackedBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    return v0
.end method

.method public getDilithiumPolyZPackedBytes()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyZPackedBytes:I

    return v0
.end method

.method public getDilithiumTau()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumTau:I

    return v0
.end method

.method public getPolyUniformGamma1NBlocks()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->PolyUniformGamma1NBlocks:I

    return v0
.end method

.method public getShake256Digest()Lorg/bouncycastle/crypto/digests/SHAKEDigest;
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(Lorg/bouncycastle/crypto/digests/SHAKEDigest;)V

    return-object v0
.end method

.method public initSign([BZ[B)V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/4 v1, 0x0

    const/16 v2, 0x40

    invoke-virtual {v0, p1, v1, v2}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {p0, p2, p3}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->absorbCtx(Z[B)V

    return-void
.end method

.method public initVerify([B[BZ[B)V
    .locals 5

    const/16 v0, 0x40

    new-array v1, v0, [B

    .line 0
    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    array-length v3, p1

    const/4 v4, 0x0

    invoke-virtual {v2, p1, v4, v3}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    array-length v2, p2

    invoke-virtual {p1, p2, v4, v2}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-virtual {p1, v1, v4, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    iget-object p1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-virtual {p1, v1, v4, v0}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {p0, p3, p4}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->absorbCtx(Z[B)V

    return-void
.end method

.method public signInternal([BI[B[B[B[B[B[B)[B
    .locals 10

    move-object v9, p0

    .line 0
    new-instance v2, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    iget-object v0, v9, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-direct {v2, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(Lorg/bouncycastle/crypto/digests/SHAKEDigest;)V

    const/4 v0, 0x0

    move-object v1, p1

    move v3, p2

    invoke-virtual {v2, p1, v0, p2}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {p0, v2}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->generateMu(Lorg/bouncycastle/crypto/digests/SHAKEDigest;)[B

    move-result-object v1

    move-object v0, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->generateSignature([BLorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B[B[B[B[B)[B

    move-result-object v0

    return-object v0
.end method

.method public verifyInternal([BILorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B)Z
    .locals 8

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    mul-int v0, v0, v1

    add-int/lit8 v0, v0, 0x40

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v2, v0, [B

    const/4 v0, 0x0

    invoke-virtual {p3, v2, v0}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BI)I

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->doVerifyInternal([B[BILorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B)Z

    move-result p1

    return p1
.end method

.method public verifyInternalMu([B)Z
    .locals 3

    const/16 v0, 0x40

    new-array v0, v0, [B

    .line 0
    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->shake256Digest:Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BI)I

    invoke-static {v0, p1}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual([B[B)Z

    move-result p1

    return p1
.end method

.method public verifyInternalMuSignature([B[BILorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B)Z
    .locals 8

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumK:I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumPolyW1PackedBytes:I

    mul-int v0, v0, v1

    add-int/lit8 v0, v0, 0x40

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->DilithiumCTilde:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v2, v0, [B

    const/4 v0, 0x0

    array-length v1, p1

    invoke-static {p1, v0, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSAEngine;->doVerifyInternal([B[BILorg/bouncycastle/crypto/digests/SHAKEDigest;[B[B)Z

    move-result p1

    return p1
.end method
