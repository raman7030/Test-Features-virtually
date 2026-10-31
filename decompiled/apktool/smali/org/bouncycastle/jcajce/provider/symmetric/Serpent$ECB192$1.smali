.class public Lorg/bouncycastle/jcajce/provider/symmetric/Serpent$ECB192$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/engines/SerpentEngine;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/SerpentEngine;-><init>()V

    return-object v0
.end method
