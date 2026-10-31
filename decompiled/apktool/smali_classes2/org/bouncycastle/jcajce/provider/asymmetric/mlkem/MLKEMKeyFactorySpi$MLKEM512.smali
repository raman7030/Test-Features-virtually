.class public Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi$MLKEM512;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_alg_ml_kem_512:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/mlkem/MLKEMKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
