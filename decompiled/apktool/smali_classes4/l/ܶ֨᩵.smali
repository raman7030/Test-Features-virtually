.class public final Ll/ܶ֨᩵;
.super Ll/᩹֨᩵;
.source "FA1E"


# instance fields
.field public ܽ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public ᩳ:I


# direct methods
.method public constructor <init>([B)V
    .locals 5

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 52
    iput v0, p0, Ll/ܶ֨᩵;->ᩳ:I

    .line 124
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 125
    :try_start_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->readObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    const/4 v1, 0x1

    .line 126
    invoke-static {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjects()Ljava/util/Enumeration;

    move-result-object p1

    .line 128
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 129
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    .line 130
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getTagNo()I

    move-result v3

    if-eqz v3, :cond_3

    if-eq v3, v1, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    .line 143
    invoke-static {v2, v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v2

    .line 144
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/᩹֨᩵;->֫([B)V

    goto :goto_0

    .line 147
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Malformed token field."

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 139
    :cond_1
    invoke-static {v2, v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v2

    .line 140
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/᩹֨᩵;->ۧ([B)V

    goto :goto_0

    .line 136
    :cond_2
    invoke-static {v2, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    .line 88
    iput-object v2, p0, Ll/ܶ֨᩵;->ܽ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    goto :goto_0

    .line 132
    :cond_3
    invoke-static {v2, v1}, Lorg/bouncycastle/asn1/ASN1Enumerated;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Enumerated;

    move-result-object v2

    .line 133
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Enumerated;->getValue()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    .line 78
    iput v2, p0, Ll/ܶ֨᩵;->ᩳ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 150
    :cond_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 124
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public constructor <init>([B[B)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 78
    iput v0, p0, Ll/ܶ֨᩵;->ᩳ:I

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Ll/ܶ֨᩵;->ܽ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 62
    invoke-virtual {p0, p1}, Ll/᩹֨᩵;->ۧ([B)V

    .line 63
    invoke-virtual {p0, p2}, Ll/᩹֨᩵;->֫([B)V

    return-void
.end method


# virtual methods
.method public final ܽ()[B
    .locals 7

    .line 95
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const-string v1, "DER"

    .line 96
    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/ASN1OutputStream;->create(Ljava/io/OutputStream;Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1OutputStream;

    move-result-object v1

    .line 97
    new-instance v2, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 73
    iget v3, p0, Ll/ܶ֨᩵;->ᩳ:I

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    .line 100
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v6, Lorg/bouncycastle/asn1/ASN1Enumerated;

    invoke-direct {v6, v3}, Lorg/bouncycastle/asn1/ASN1Enumerated;-><init>(I)V

    const/4 v3, 0x0

    invoke-direct {v4, v5, v3, v6}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 83
    :cond_0
    iget-object v3, p0, Ll/ܶ֨᩵;->ܽ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v3, :cond_1

    .line 104
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    invoke-direct {v4, v5, v5, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 106
    :cond_1
    invoke-virtual {p0}, Ll/᩹֨᩵;->ۧ()[B

    move-result-object v3

    if-eqz v3, :cond_2

    .line 108
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v6, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v6, v3}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    const/4 v3, 0x2

    invoke-direct {v4, v5, v3, v6}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 110
    :cond_2
    invoke-virtual {p0}, Ll/᩹֨᩵;->֫()[B

    move-result-object v3

    if-eqz v3, :cond_3

    .line 112
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v6, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v6, v3}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    const/4 v3, 0x3

    invoke-direct {v4, v5, v3, v6}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 114
    :cond_3
    new-instance v3, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v4, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v4, v2}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v3, v5, v5, v4}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1OutputStream;->writeObject(Lorg/bouncycastle/asn1/ASN1Primitive;)V

    .line 115
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 117
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ܿ()I
    .locals 1

    .line 73
    iget v0, p0, Ll/ܶ֨᩵;->ᩳ:I

    return v0
.end method

.method public final ᩳ()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܶ֨᩵;->ܽ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method
