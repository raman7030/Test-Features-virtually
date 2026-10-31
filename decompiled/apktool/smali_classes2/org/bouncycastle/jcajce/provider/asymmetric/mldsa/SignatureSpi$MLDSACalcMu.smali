.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSACalcMu;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;)V

    return-void
.end method


# virtual methods
.method public engineSign()[B
    .locals 2

    .line 0
    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;->generateMu()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public engineVerify([B)Z
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;->verifyMu([B)Z

    move-result p1

    return p1
.end method
