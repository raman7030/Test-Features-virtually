.class public Lorg/bouncycastle/jcajce/provider/keystore/BCFKS$Mappings;
.super Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V
    .locals 2

    const-string v0, "KeyStore.BCFKS"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$Std"

    .line 0
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyStore.BCFKS-DEF"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$Def"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyStore.FIPS"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$StdCompat"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyStore.FIPS-DEF"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$DefCompat"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyStore.IBCFKS"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$StdShared"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyStore.IBCFKS-DEF"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$DefShared"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyStore.IFIPS"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$StdSharedCompat"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyStore.IFIPS-DEF"

    const-string v1, "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$DefSharedCompat"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
