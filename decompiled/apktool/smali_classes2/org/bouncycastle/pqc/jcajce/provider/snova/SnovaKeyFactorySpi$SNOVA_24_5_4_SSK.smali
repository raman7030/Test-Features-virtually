.class public Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_24_5_4_SSK;
.super Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_24_5_4_ssk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
