.class public Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi$Mayo1;
.super Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->mayo1:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/mayo/MayoKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
