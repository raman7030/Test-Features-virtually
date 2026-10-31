.class public Lorg/bouncycastle/jcajce/provider/symmetric/GOST28147$KeyGen;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x100

    .line 0
    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/GOST28147$KeyGen;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/CipherKeyGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/CipherKeyGenerator;-><init>()V

    const-string v1, "GOST28147"

    invoke-direct {p0, v1, p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;-><init>(Ljava/lang/String;ILorg/bouncycastle/crypto/CipherKeyGenerator;)V

    return-void
.end method
