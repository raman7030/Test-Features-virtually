.class public Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi$HashShake_128s;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_hash_slh_dsa_shake_128s_with_shake128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/slhdsa/SLHDSAKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
