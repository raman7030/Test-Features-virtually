.class public Lorg/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB$1;
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
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/engines/DSTU7624Engine;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/engines/DSTU7624Engine;-><init>(I)V

    return-object v0
.end method
