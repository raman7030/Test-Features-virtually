.class public Lorg/bouncycastle/jcajce/provider/symmetric/AES$GCM;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/engines/AESEngine;->newInstance()Lorg/bouncycastle/crypto/MultiBlockCipher;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/GCMModeCipher;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V

    return-void
.end method
