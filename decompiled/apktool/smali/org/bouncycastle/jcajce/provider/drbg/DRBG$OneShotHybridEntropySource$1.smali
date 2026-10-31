.class public Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/prng/EntropySourceProvider;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource$1;->this$0:Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)Lorg/bouncycastle/crypto/prng/EntropySource;
    .locals 0

    .line 0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource$1;->this$0:Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;

    invoke-static {p1}, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;->access$900(Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource;)Lorg/bouncycastle/jcajce/provider/drbg/DRBG$OneShotHybridEntropySource$OneShotSignallingEntropySource;

    move-result-object p1

    return-object p1
.end method
