.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi$HashMLDSA65;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_ml_dsa_65_with_sha512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mldsa/MLDSAKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
