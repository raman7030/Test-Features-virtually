.class public Lorg/bouncycastle/asn1/x509/DistributionPointName;
.super Lorg/bouncycastle/asn1/ASN1Object;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# static fields
.field public static final FULL_NAME:I = 0x0

.field public static final NAME_RELATIVE_TO_CRL_ISSUER:I = 0x1


# instance fields
.field public final name:Lorg/bouncycastle/asn1/ASN1Encodable;

.field public final type:I


# direct methods
.method public constructor <init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->type:I

    iput-object p2, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->name:Lorg/bouncycastle/asn1/ASN1Encodable;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1TaggedObject;)V
    .locals 3

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getTagNo()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->type:I

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->hasContextTag(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, Lorg/bouncycastle/asn1/x509/GeneralNames;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->hasContextTag(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, v0}, Lorg/bouncycastle/asn1/ASN1Set;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->name:Lorg/bouncycastle/asn1/ASN1Encodable;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown tag: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1Util;->getTagText(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/x509/GeneralNames;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0, p1}, Lorg/bouncycastle/asn1/x509/DistributionPointName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    return-void
.end method

.method private appendObject(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, ":"

    const-string v1, "    "

    .line 0
    invoke-static {p1, v1, p3, v0, p2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v1, v1, p4, p2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DistributionPointName;
    .locals 2

    if-eqz p0, :cond_2

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x509/DistributionPointName;

    check-cast p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/x509/DistributionPointName;-><init>(Lorg/bouncycastle/asn1/ASN1TaggedObject;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown object in factory: "

    .line 0
    invoke-static {p0, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    check-cast p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;

    return-object p0
.end method

.method public static getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/x509/DistributionPointName;
    .locals 1

    const-string v0, "DistributionPointName"

    .line 0
    invoke-static {p0, p1, v0}, Lorg/bouncycastle/asn1/ASN1Util;->getInstanceChoiceBaseObject(Lorg/bouncycastle/asn1/ASN1TaggedObject;ZLjava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object p0

    return-object p0
.end method

.method public static getTagged(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/x509/DistributionPointName;
    .locals 1

    const-string v0, "DistributionPointName"

    .line 0
    invoke-static {p0, p1, v0}, Lorg/bouncycastle/asn1/ASN1Util;->getTaggedChoiceBaseObject(Lorg/bouncycastle/asn1/ASN1TaggedObject;ZLjava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getName()Lorg/bouncycastle/asn1/ASN1Encodable;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->name:Lorg/bouncycastle/asn1/ASN1Encodable;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->type:I

    return v0
.end method

.method public toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 4

    .line 0
    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget v1, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->type:I

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->name:Lorg/bouncycastle/asn1/ASN1Encodable;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 3
    invoke-static {}, Lorg/bouncycastle/util/Strings;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DistributionPointName: ["

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->type:I

    if-nez v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->name:Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "fullName"

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->name:Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "nameRelativeToCRLIssuer"

    :goto_0
    invoke-direct {p0, v1, v0, v3, v2}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->appendObject(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "]"

    invoke-static {v1, v2, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
