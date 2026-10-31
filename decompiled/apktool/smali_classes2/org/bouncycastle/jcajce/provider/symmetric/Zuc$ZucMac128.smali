.class public Lorg/bouncycastle/jcajce/provider/symmetric/Zuc$ZucMac128;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/macs/Zuc128Mac;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/macs/Zuc128Mac;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;-><init>(Lorg/bouncycastle/crypto/Mac;)V

    return-void
.end method
