.class public Lorg/bouncycastle/jcajce/provider/digest/SHA3$KeyFactorySHA3;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;


# direct methods
.method public constructor <init>(ILorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 1

    const-string v0, "HmacSHA3-"

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
