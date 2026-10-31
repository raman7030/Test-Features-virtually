.class public Lorg/bouncycastle/jcajce/provider/digest/SHA512$KeyFactory;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "HmacSHA512"

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
