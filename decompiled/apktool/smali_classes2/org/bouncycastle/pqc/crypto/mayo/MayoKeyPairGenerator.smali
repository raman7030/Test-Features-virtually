.class public Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricCipherKeyPairGenerator;


# instance fields
.field public p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

.field public random:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;
    .locals 21

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getMVecLimbs()I

    move-result v1

    iget-object v2, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getM()I

    move-result v9

    iget-object v2, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getV()I

    move-result v10

    iget-object v2, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getO()I

    move-result v11

    iget-object v2, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getOBytes()I

    move-result v2

    iget-object v3, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getP1Limbs()I

    move-result v12

    iget-object v3, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getP3Limbs()I

    move-result v13

    iget-object v3, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getPkSeedBytes()I

    move-result v14

    iget-object v3, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getSkSeedBytes()I

    move-result v3

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getCpkBytes()I

    move-result v4

    new-array v15, v4, [B

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getCskBytes()I

    move-result v4

    new-array v8, v4, [B

    add-int/2addr v2, v14

    new-array v7, v2, [B

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;->getP2Limbs()I

    move-result v4

    add-int/2addr v4, v12

    new-array v6, v4, [J

    mul-int v4, v11, v11

    mul-int v4, v4, v1

    new-array v5, v4, [J

    mul-int v4, v10, v11

    move/from16 v16, v9

    new-array v9, v4, [B

    move-object/from16 v17, v5

    iget-object v5, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->random:Ljava/security/SecureRandom;

    invoke-virtual {v5, v8}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v5, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    move/from16 v18, v13

    const/16 v13, 0x100

    invoke-direct {v5, v13}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    const/4 v13, 0x0

    invoke-virtual {v5, v8, v13, v3}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v5, v7, v13, v2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    invoke-static {v7, v14, v9, v13, v4}, Lorg/bouncycastle/util/GF16;->decode([BI[BII)V

    iget-object v2, v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-static {v2, v6, v7}, Lorg/bouncycastle/pqc/crypto/mayo/Utils;->expandP1P2(Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;[J[B)V

    move v2, v1

    move-object v3, v6

    move-object v4, v9

    move-object/from16 v19, v17

    move-object v5, v6

    move-object/from16 v17, v6

    move v6, v12

    move-object v13, v7

    move v7, v10

    move-object/from16 v20, v8

    move v8, v11

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;->mulAddMUpperTriangularMatXMat(I[J[B[JIII)V

    move-object v3, v9

    move-object/from16 v4, v17

    move v5, v12

    move-object/from16 v6, v19

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/pqc/crypto/mayo/GF16Utils;->mulAddMatTransXMMat(I[B[JI[JII)V

    const/4 v2, 0x0

    invoke-static {v13, v2, v15, v2, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v3, v18

    new-array v4, v3, [J

    mul-int v5, v11, v1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v6, v11, :cond_2

    move v2, v6

    move v12, v7

    move v10, v13

    :goto_1
    move/from16 v17, v11

    if-ge v2, v11, :cond_1

    add-int v11, v7, v10

    move-object/from16 v0, v19

    invoke-static {v0, v11, v4, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eq v6, v2, :cond_0

    add-int v11, v12, v13

    invoke-static {v1, v0, v11, v4, v8}, Lorg/bouncycastle/util/Longs;->xorTo(I[JI[JI)V

    :cond_0
    add-int/2addr v8, v1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v10, v1

    add-int/2addr v12, v5

    move-object/from16 v19, v0

    move/from16 v11, v17

    move-object/from16 v0, p0

    goto :goto_1

    :cond_1
    move-object/from16 v0, v19

    add-int/lit8 v6, v6, 0x1

    add-int/2addr v7, v5

    add-int/2addr v13, v1

    move-object/from16 v0, p0

    goto :goto_0

    :cond_2
    move-object/from16 v0, v19

    div-int v13, v3, v1

    move/from16 v1, v16

    invoke-static {v4, v15, v14, v13, v1}, Lorg/bouncycastle/pqc/crypto/mayo/Utils;->packMVecs([J[BIII)V

    invoke-static {v9}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clear([J)V

    new-instance v0, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    new-instance v1, Lorg/bouncycastle/pqc/crypto/mayo/MayoPublicKeyParameters;

    move-object/from16 v2, p0

    iget-object v3, v2, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-direct {v1, v3, v15}, Lorg/bouncycastle/pqc/crypto/mayo/MayoPublicKeyParameters;-><init>(Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;[B)V

    new-instance v3, Lorg/bouncycastle/pqc/crypto/mayo/MayoPrivateKeyParameters;

    iget-object v4, v2, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    move-object/from16 v5, v20

    invoke-direct {v3, v4, v5}, Lorg/bouncycastle/pqc/crypto/mayo/MayoPrivateKeyParameters;-><init>(Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;[B)V

    invoke-direct {v0, v1, v3}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;-><init>(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)V

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V
    .locals 1

    .line 0
    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyGenerationParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyGenerationParameters;->getParameters()Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->p:Lorg/bouncycastle/pqc/crypto/mayo/MayoParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/mayo/MayoKeyPairGenerator;->random:Ljava/security/SecureRandom;

    return-void
.end method
