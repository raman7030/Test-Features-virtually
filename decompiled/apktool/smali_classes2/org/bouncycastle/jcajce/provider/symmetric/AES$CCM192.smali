.class public Lorg/bouncycastle/jcajce/provider/symmetric/AES$CCM192;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/engines/AESEngine;->newInstance()Lorg/bouncycastle/crypto/MultiBlockCipher;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/modes/CCMBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CCMModeCipher;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    const/16 v3, 0xc0

    invoke-direct {p0, v3, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;-><init>(ILorg/bouncycastle/crypto/modes/AEADBlockCipher;ZI)V

    return-void
.end method
