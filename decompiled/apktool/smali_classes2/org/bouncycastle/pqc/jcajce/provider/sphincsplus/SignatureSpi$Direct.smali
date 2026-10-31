.class public Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SignatureSpi$Direct;
.super Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/NullDigest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/NullDigest;-><init>()V

    new-instance v1, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusSigner;

    invoke-direct {v1}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusSigner;-><init>()V

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SignatureSpi;-><init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusSigner;)V

    return-void
.end method
