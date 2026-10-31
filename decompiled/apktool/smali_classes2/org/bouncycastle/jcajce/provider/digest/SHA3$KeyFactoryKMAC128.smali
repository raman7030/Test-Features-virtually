.class public Lorg/bouncycastle/jcajce/provider/digest/SHA3$KeyFactoryKMAC128;
.super Lorg/bouncycastle/jcajce/provider/digest/SHA3$KeyFactoryKMAC;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x80

    .line 0
    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->id_KmacWithSHAKE128:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jcajce/provider/digest/SHA3$KeyFactoryKMAC;-><init>(ILorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
