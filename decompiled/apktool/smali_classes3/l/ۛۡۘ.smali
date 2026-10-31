.class public abstract Ll/ۛۡۘ;
.super Ljava/lang/Object;
.source "G7YC"

# interfaces
.implements Ll/ۧۢۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMExtractor;

.field public ۧ:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

.field public ܽ:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPublicKeyParameters;


# virtual methods
.method public init()V
    .locals 4

    .line 46
    new-instance v0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyPairGenerator;-><init>()V

    .line 47
    new-instance v1, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyGenerationParameters;

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    iget-object v3, p0, Ll/ۛۡۘ;->ۧ:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    .line 48
    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v0

    .line 49
    new-instance v1, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMExtractor;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPrivateKeyParameters;

    invoke-direct {v1, v2}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMExtractor;-><init>(Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPrivateKeyParameters;)V

    iput-object v1, p0, Ll/ۛۡۘ;->֫:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMExtractor;

    .line 50
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPublicKeyParameters;

    iput-object v0, p0, Ll/ۛۡۘ;->ܽ:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPublicKeyParameters;

    return-void
.end method
