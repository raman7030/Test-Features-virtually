.class public Lorg/bouncycastle/pqc/jcajce/provider/kyber/KyberKeyFactorySpi$Kyber1024_AES;
.super Lorg/bouncycastle/pqc/jcajce/provider/kyber/KyberKeyFactorySpi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->kyber1024_aes:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/pqc/jcajce/provider/kyber/KyberKeyFactorySpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
