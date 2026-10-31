.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;


# instance fields
.field public bOut:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;-><init>(Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;->bOut:Ljava/io/ByteArrayOutputStream;

    return-void
.end method


# virtual methods
.method public engineSign()[B
    .locals 2

    .line 0
    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;->generateMuSignature([B)[B

    move-result-object v0
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public engineVerify([B)Z
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi;->signer:Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;

    invoke-virtual {v1, v0, p1}, Lorg/bouncycastle/pqc/crypto/mldsa/MLDSASigner;->verifyMuSignature([B[B)Z

    move-result p1
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/SignatureException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public updateEngine(B)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void
.end method

.method public updateEngine([BII)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/SignatureSpi$MLDSAExtMu;->bOut:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    return-void
.end method
