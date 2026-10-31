.class public Lorg/bouncycastle/asn1/ASN1Set$1;
.super Lorg/bouncycastle/asn1/ASN1UniversalType;


# direct methods
.method public constructor <init>(Ljava/lang/Class;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/asn1/ASN1UniversalType;-><init>(Ljava/lang/Class;I)V

    return-void
.end method


# virtual methods
.method public fromImplicitConstructed(Lorg/bouncycastle/asn1/ASN1Sequence;)Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 0

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->toASN1Set()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object p1

    return-object p1
.end method
