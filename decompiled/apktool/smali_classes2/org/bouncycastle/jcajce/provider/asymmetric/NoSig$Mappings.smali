.class public Lorg/bouncycastle/jcajce/provider/asymmetric/NoSig$Mappings;
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

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Signature."

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    sget-object v2, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->id_alg_noSignature:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v3, "org.bouncycastle.jcajce.provider.asymmetric.NoSig$SigSpi"

    .line 0
    invoke-static {v3, v1, v0, v2, p1}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->id_alg_unsigned:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1, p1, v3}, Ll/᩵۫ۡ;->֫(Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    return-void
.end method
