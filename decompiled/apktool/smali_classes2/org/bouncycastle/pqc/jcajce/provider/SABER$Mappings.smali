.class public Lorg/bouncycastle/pqc/jcajce/provider/SABER$Mappings;
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
    .locals 4

    const-string v0, "KeyFactory.SABER"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyFactorySpi"

    .line 7
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyPairGenerator.SABER"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyPairGeneratorSpi"

    .line 14
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyGenerator.SABER"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyGeneratorSpi"

    .line 21
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lorg/bouncycastle/pqc/jcajce/provider/saber/SABERKeyFactorySpi;

    .line 26
    invoke-direct {v0}, Lorg/bouncycastle/pqc/jcajce/provider/saber/SABERKeyFactorySpi;-><init>()V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.saber.SABERCipherSpi$Base"

    const-string v2, "Alg.Alias.Cipher."

    const-string v3, "Cipher.SABER"

    .line 0
    invoke-static {p1, v3, v1, v2}, Ll/ᩴۘܿ;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->pqc_kem_saber:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v3, "SABER"

    invoke-static {v1, v2, p1, v3}, Ll/᩵۫ۡ;->֫(Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v2, v3, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->registerOid(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-virtual {p0, p1, v2, v3}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->registerOidAlgorithmParameters(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    return-void
.end method
