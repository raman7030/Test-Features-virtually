.class public final Ll/ܰۡۘ;
.super Ljava/lang/Object;
.source "37X7"

# interfaces
.implements Ll/ۧۢۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKEMExtractor;

.field public ۧ:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimePublicKeyParameters;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getPublicKey()[B
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ܰۡۘ;->ۧ:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimePublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimePublicKeyParameters;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public final init()V
    .locals 23

    move-object/from16 v0, p0

    .line 47
    new-instance v1, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKeyPairGenerator;

    invoke-direct {v1}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKeyPairGenerator;-><init>()V

    .line 48
    new-instance v2, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKeyGenerationParameters;

    new-instance v3, Ljava/security/SecureRandom;

    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    const/16 v4, 0x486

    .line 76
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 69
    sget-object v5, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->sntrup761:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;->getSessionKeySize()I

    move-result v6

    const/16 v7, 0x100

    if-ne v6, v7, :cond_0

    goto :goto_0

    :cond_0
    const/16 v5, 0x9

    new-array v6, v5, [Ljava/lang/Class;

    .line 72
    const-class v7, Ljava/lang/String;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    const/4 v7, 0x1

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v6, v7

    const/4 v10, 0x2

    aput-object v9, v6, v10

    const/4 v11, 0x3

    aput-object v9, v6, v11

    const/4 v12, 0x4

    aput-object v9, v6, v12

    const/4 v13, 0x5

    aput-object v9, v6, v13

    const/4 v14, 0x6

    aput-object v9, v6, v14

    const/4 v15, 0x7

    aput-object v9, v6, v15

    const/16 v16, 0x8

    aput-object v9, v6, v16

    .line 73
    const-class v9, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    invoke-virtual {v9, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v9, 0x2f9

    .line 76
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v17, 0x11ef

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0x11e

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v19, 0x3ef

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const/16 v20, 0x6e3

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v21, 0x20

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    new-array v5, v5, [Ljava/lang/Object;

    const-string v22, "sntrup761"

    aput-object v22, v5, v8

    aput-object v9, v5, v7

    aput-object v17, v5, v10

    aput-object v18, v5, v11

    aput-object v4, v5, v12

    aput-object v19, v5, v13

    aput-object v4, v5, v14

    aput-object v20, v5, v15

    aput-object v21, v5, v16

    invoke-virtual {v6, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;

    .line 48
    :goto_0
    invoke-direct {v2, v3, v5}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeParameters;)V

    invoke-virtual {v1, v2}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    .line 49
    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    .line 50
    new-instance v2, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKEMExtractor;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimePrivateKeyParameters;

    invoke-direct {v2, v3}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKEMExtractor;-><init>(Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimePrivateKeyParameters;)V

    iput-object v2, v0, Ll/ܰۡۘ;->֫:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKEMExtractor;

    .line 51
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimePublicKeyParameters;

    iput-object v1, v0, Ll/ܰۡۘ;->ۧ:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimePublicKeyParameters;

    return-void
.end method

.method public final ֫([B)[B
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ܰۡۘ;->֫:Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKEMExtractor;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/ntruprime/SNTRUPrimeKEMExtractor;->extractSecret([B)[B

    move-result-object p1

    return-object p1
.end method
