.class public Lorg/bouncycastle/jcajce/provider/digest/SHA3$DigestSHAKE;
.super Lorg/bouncycastle/jcajce/provider/digest/BCMessageDigest;

# interfaces
.implements Ljava/lang/Cloneable;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 0
    new-instance p2, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-direct {p2, p1}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    invoke-direct {p0, p2}, Lorg/bouncycastle/jcajce/provider/digest/BCMessageDigest;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    .line 0
    invoke-super {p0}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jcajce/provider/digest/BCMessageDigest;

    new-instance v1, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/digest/BCMessageDigest;->digest:Lorg/bouncycastle/crypto/Digest;

    check-cast v2, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(Lorg/bouncycastle/crypto/digests/SHAKEDigest;)V

    iput-object v1, v0, Lorg/bouncycastle/jcajce/provider/digest/BCMessageDigest;->digest:Lorg/bouncycastle/crypto/Digest;

    return-object v0
.end method
