.class public Lorg/bouncycastle/pqc/crypto/hqc/HQCKEMGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/EncapsulatedSecretGenerator;


# instance fields
.field public final sr:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>(Ljava/security/SecureRandom;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCKEMGenerator;->sr:Ljava/security/SecureRandom;

    return-void
.end method


# virtual methods
.method public generateEncapsulated(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Lorg/bouncycastle/crypto/SecretWithEncapsulation;
    .locals 11

    .line 0
    check-cast p1, Lorg/bouncycastle/pqc/crypto/hqc/HQCPublicKeyParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyParameters;->getParameters()Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->getEngine()Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyParameters;->getParameters()Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->getSHA512_BYTES()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyParameters;->getParameters()Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->getN_BYTES()I

    move-result v2

    new-array v8, v2, [B

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyParameters;->getParameters()Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->getN1N2_BYTES()I

    move-result v2

    new-array v9, v2, [B

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCKeyParameters;->getParameters()Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/hqc/HQCParameters;->getSALT_SIZE_BYTES()I

    move-result v2

    new-array v10, v2, [B

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/hqc/HQCPublicKeyParameters;->getPublicKey()[B

    move-result-object v5

    iget-object v7, p0, Lorg/bouncycastle/pqc/crypto/hqc/HQCKEMGenerator;->sr:Ljava/security/SecureRandom;

    move-object v2, v8

    move-object v3, v9

    move-object v4, v0

    move-object v6, v10

    invoke-virtual/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/hqc/HQCEngine;->encaps([B[B[B[B[BLjava/security/SecureRandom;)V

    invoke-static {v8, v9, v10}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B[B)[B

    move-result-object p1

    new-instance v1, Lorg/bouncycastle/pqc/crypto/util/SecretWithEncapsulationImpl;

    const/4 v2, 0x0

    const/16 v3, 0x20

    invoke-static {v0, v2, v3}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lorg/bouncycastle/pqc/crypto/util/SecretWithEncapsulationImpl;-><init>([B[B)V

    return-object v1
.end method
