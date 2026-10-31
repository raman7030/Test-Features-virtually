.class public Lorg/bouncycastle/pqc/jcajce/provider/CMCE$Mappings;
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
    .locals 6

    const-string v0, "KeyFactory.CMCE"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi"

    .line 7
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyPairGenerator.CMCE"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyPairGeneratorSpi"

    .line 14
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "KeyGenerator.CMCE"

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyGeneratorSpi"

    .line 21
    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCEKeyFactorySpi;

    .line 26
    invoke-direct {v0}, Lorg/bouncycastle/pqc/jcajce/provider/cmce/CMCEKeyFactorySpi;-><init>()V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$Base"

    const-string v2, "Alg.Alias.Cipher."

    const-string v3, "Cipher.CMCE"

    .line 0
    invoke-static {p1, v3, v1, v2}, Ll/ᩴۘܿ;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->pqc_kem_mceliece:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v3, "CMCE"

    invoke-static {v1, v2, p1, v3}, Ll/᩵۫ۡ;->֫(Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE348864"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece348864_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "mceliece348864"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE460896"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece460896_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "mceliece460896"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE6688128"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece6688128_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "mceliece6688128"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE6960119"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece6960119_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "mceliece6960119"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    const-string v1, "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE8192128"

    sget-object v4, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mceliece8192128_r3:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v5, "mceliece8192128"

    invoke-virtual {p0, p1, v5, v1, v4}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->addCipherAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-virtual {p0, p1, v2, v3, v0}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->registerOid(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    invoke-virtual {p0, p1, v2, v3}, Lorg/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;->registerOidAlgorithmParameters(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    return-void
.end method
