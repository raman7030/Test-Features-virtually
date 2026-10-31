.class public Lorg/bouncycastle/jcajce/provider/drbg/DRBG$2;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/prng/EntropySourceProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)Lorg/bouncycastle/crypto/prng/EntropySource;
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;-><init>(I)V

    return-object v0
.end method
