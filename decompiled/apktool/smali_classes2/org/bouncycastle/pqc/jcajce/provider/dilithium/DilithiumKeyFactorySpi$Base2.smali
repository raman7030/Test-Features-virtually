.class public Lorg/bouncycastle/pqc/jcajce/provider/dilithium/DilithiumKeyFactorySpi$Base2;
.super Lorg/bouncycastle/pqc/jcajce/provider/dilithium/DilithiumKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->dilithium2:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/dilithium/DilithiumKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
