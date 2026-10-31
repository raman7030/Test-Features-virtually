.class public final Ll/֫֫ۘ;
.super Ljava/lang/Object;
.source "U9KI"

# interfaces
.implements Ll/᩶ܰۖ;


# virtual methods
.method public final create()Ljava/lang/Object;
    .locals 4

    .line 38
    new-instance v0, Ll/۟۟ۖ;

    new-instance v1, Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;

    new-instance v2, Lorg/bouncycastle/crypto/macs/HMac;

    new-instance v3, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    invoke-direct {v3}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;-><init>(Lorg/bouncycastle/crypto/Mac;)V

    invoke-direct {v0, v1}, Ll/ۧ֫ۘ;-><init>(Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;)V

    return-object v0
.end method
