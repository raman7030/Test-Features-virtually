.class public Lorg/bouncycastle/jcajce/provider/asymmetric/NoSig$SigSpi;
.super Ljava/security/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    return-void
.end method


# virtual methods
.method public engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public engineInitSign(Ljava/security/PrivateKey;)V
    .locals 1

    .line 0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "attempt to pass private key to NoSig"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInitVerify(Ljava/security/PublicKey;)V
    .locals 1

    .line 0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "attempt to pass public key to NoSig"

    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public engineSign()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public engineUpdate(B)V
    .locals 0

    return-void
.end method

.method public engineUpdate([BII)V
    .locals 0

    return-void
.end method

.method public engineVerify([B)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
