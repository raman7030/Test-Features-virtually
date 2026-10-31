.class public Lorg/bouncycastle/pqc/jcajce/provider/lms/LMSSignatureSpi$generic;
.super Lorg/bouncycastle/pqc/jcajce/provider/lms/LMSSignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/NullDigest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/NullDigest;-><init>()V

    const-string v1, "LMS"

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/pqc/jcajce/provider/lms/LMSSignatureSpi;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/Digest;)V

    return-void
.end method
