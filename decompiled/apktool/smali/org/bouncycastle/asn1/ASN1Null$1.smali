.class public Lorg/bouncycastle/asn1/ASN1Null$1;
.super Lorg/bouncycastle/asn1/ASN1UniversalType;


# direct methods
.method public constructor <init>(Ljava/lang/Class;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/asn1/ASN1UniversalType;-><init>(Ljava/lang/Class;I)V

    return-void
.end method


# virtual methods
.method public fromImplicitPrimitive(Lorg/bouncycastle/asn1/DEROctetString;)Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 0

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctetsLength()I

    move-result p1

    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1Null;->checkContentsLength(I)V

    invoke-static {}, Lorg/bouncycastle/asn1/ASN1Null;->createPrimitive()Lorg/bouncycastle/asn1/ASN1Null;

    move-result-object p1

    return-object p1
.end method
