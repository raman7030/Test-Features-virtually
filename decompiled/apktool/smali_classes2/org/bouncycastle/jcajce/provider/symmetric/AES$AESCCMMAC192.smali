.class public Lorg/bouncycastle/jcajce/provider/symmetric/AES$AESCCMMAC192;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/AES$CCMMac;

    invoke-direct {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/AES$CCMMac;-><init>()V

    const/16 v1, 0xc0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseMac;-><init>(ILorg/bouncycastle/crypto/Mac;)V

    return-void
.end method
