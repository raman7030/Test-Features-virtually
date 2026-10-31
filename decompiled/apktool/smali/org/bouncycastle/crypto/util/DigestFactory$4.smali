.class public Lorg/bouncycastle/crypto/util/DigestFactory$4;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/util/DigestFactory$Cloner;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createClone(Lorg/bouncycastle/crypto/Digest;)Lorg/bouncycastle/crypto/Digest;
    .locals 0

    .line 0
    invoke-static {p1}, Lorg/bouncycastle/crypto/digests/SHA256Digest;->newInstance(Lorg/bouncycastle/crypto/Digest;)Lorg/bouncycastle/crypto/SavableDigest;

    move-result-object p1

    return-object p1
.end method
