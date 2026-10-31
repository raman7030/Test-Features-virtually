.class public Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyGenerationParameters;
.super Lorg/bouncycastle/crypto/KeyGenerationParameters;


# instance fields
.field public final params:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;


# direct methods
.method public constructor <init>(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;)V
    .locals 1

    const/16 v0, 0x100

    .line 0
    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    iput-object p2, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyGenerationParameters;->params:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    return-void
.end method


# virtual methods
.method public getParameters()Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMKeyGenerationParameters;->params:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    return-object v0
.end method
