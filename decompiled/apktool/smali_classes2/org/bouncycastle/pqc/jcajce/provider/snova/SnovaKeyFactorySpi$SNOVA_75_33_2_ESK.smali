.class public Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi$SNOVA_75_33_2_ESK;
.super Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->snova_75_33_2_esk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
