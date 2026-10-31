.class public final Ll/ۤۡۘ;
.super Ll/ۛۡۘ;
.source "77V5"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    sget-object v0, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;->ml_kem_768:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    iput-object v0, p0, Ll/ۛۡۘ;->ۧ:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMParameters;

    return-void
.end method


# virtual methods
.method public final getPublicKey()[B
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۛۡۘ;->ܽ:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMPublicKeyParameters;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public final ֫([B)[B
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۛۡۘ;->֫:Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMExtractor;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/mlkem/MLKEMExtractor;->extractSecret([B)[B

    move-result-object p1

    return-object p1
.end method
