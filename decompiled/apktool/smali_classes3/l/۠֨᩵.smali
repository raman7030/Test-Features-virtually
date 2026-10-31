.class public final Ll/۠֨᩵;
.super Ll/᩹֨᩵;
.source "Q9XD"


# static fields
.field public static final ܿ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;


# instance fields
.field public ܽ:I

.field public ᩳ:[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 61
    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.2"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠֨᩵;->ܿ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 7

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Malformed SPNEGO token "

    const-string v1, "Malformed SPNEGO token: tag "

    const-string v2, "Malformed SPNEGO token, OID "

    .line 172
    new-instance v3, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v3, p1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 173
    :try_start_0
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1InputStream;->readObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz p1, :cond_a

    .line 174
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getTagClass()I

    move-result v4

    const/16 v5, 0x40

    if-ne v4, v5, :cond_a

    .line 175
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getBaseObject()Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v4

    instance-of v4, v4, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v4, :cond_a

    .line 178
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getBaseObject()Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v0, 0x0

    .line 181
    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 182
    sget-object v5, Ll/۠֨᩵;->ܿ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v5, v4}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v2, 0x1

    .line 185
    invoke-virtual {p1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    .line 186
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getTagNo()I

    move-result v4

    if-nez v4, :cond_8

    .line 189
    invoke-static {p1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p1

    .line 190
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjects()Ljava/util/Enumeration;

    move-result-object p1

    .line 191
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 192
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    .line 193
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getTagNo()I

    move-result v4

    if-eqz v4, :cond_5

    if-eq v4, v2, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    const/4 v5, 0x4

    if-ne v4, v5, :cond_0

    goto :goto_1

    .line 220
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Malformed token field."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 212
    :cond_1
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getBaseObject()Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v4

    instance-of v4, v4, Lorg/bouncycastle/asn1/DEROctetString;

    if-nez v4, :cond_2

    goto :goto_0

    .line 216
    :cond_2
    :goto_1
    invoke-static {v1, v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v1

    .line 217
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩹֨᩵;->֫([B)V

    goto :goto_0

    .line 207
    :cond_3
    invoke-static {v1, v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v1

    .line 208
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩹֨᩵;->ۧ([B)V

    goto :goto_0

    .line 203
    :cond_4
    invoke-static {v1, v2}, Lorg/bouncycastle/asn1/ASN1BitString;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1BitString;

    move-result-object v1

    .line 204
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1BitString;->getBytes()[B

    move-result-object v1

    aget-byte v1, v1, v0

    and-int/lit16 v1, v1, 0xff

    .line 91
    iput v1, p0, Ll/۠֨᩵;->ܽ:I

    goto :goto_0

    .line 195
    :cond_5
    invoke-static {v1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    .line 196
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v4

    new-array v5, v4, [Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    :goto_2
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_6

    .line 198
    invoke-virtual {v1, v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v6

    check-cast v6, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    aput-object v6, v5, v4

    goto :goto_2

    .line 111
    :cond_6
    iput-object v5, p0, Ll/۠֨᩵;->ᩳ:[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 223
    :cond_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    return-void

    .line 187
    :cond_8
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getTagNo()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_9
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 176
    :cond_a
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 172
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public constructor <init>([Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;I[B)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Ll/۠֨᩵;->ᩳ:[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 91
    iput p2, p0, Ll/۠֨᩵;->ܽ:I

    .line 75
    invoke-virtual {p0, p3}, Ll/᩹֨᩵;->ۧ([B)V

    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, p1}, Ll/᩹֨᩵;->֫([B)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 123
    invoke-virtual {p0}, Ll/᩹֨᩵;->֫()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 124
    invoke-virtual {p0}, Ll/᩹֨᩵;->֫()[B

    move-result-object v0

    invoke-virtual {p0}, Ll/᩹֨᩵;->֫()[B

    move-result-object v2

    array-length v2, v2

    invoke-static {v0, v1, v2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 86
    :goto_0
    iget v2, p0, Ll/۠֨᩵;->ܽ:I

    .line 126
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 106
    iget-object v3, p0, Ll/۠֨᩵;->ᩳ:[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 126
    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    aput-object v3, v4, v1

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "NegTokenInit[flags=%d,mechs=%s,mic=%s]"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()[B
    .locals 7

    .line 133
    :try_start_0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 106
    iget-object v1, p0, Ll/۠֨᩵;->ᩳ:[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 136
    new-instance v4, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    const/4 v5, 0x0

    .line 137
    :goto_0
    array-length v6, v1

    if-ge v5, v6, :cond_0

    .line 138
    aget-object v6, v1, v5

    invoke-virtual {v4, v6}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 140
    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v5, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v5, v4}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v3, v2, v5}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 86
    :cond_1
    iget v1, p0, Ll/۠֨᩵;->ܽ:I

    if-eqz v1, :cond_2

    .line 144
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v5, Lorg/bouncycastle/asn1/DERBitString;

    invoke-direct {v5, v1}, Lorg/bouncycastle/asn1/DERBitString;-><init>(I)V

    invoke-direct {v4, v3, v3, v5}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 146
    :cond_2
    invoke-virtual {p0}, Ll/᩹֨᩵;->ۧ()[B

    move-result-object v1

    if-eqz v1, :cond_3

    .line 148
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v5, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    const/4 v1, 0x2

    invoke-direct {v4, v3, v1, v5}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 150
    :cond_3
    invoke-virtual {p0}, Ll/᩹֨᩵;->֫()[B

    move-result-object v1

    if-eqz v1, :cond_4

    .line 152
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v5, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    const/4 v1, 0x3

    invoke-direct {v4, v3, v1, v5}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 155
    :cond_4
    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 156
    sget-object v4, Ll/۠֨᩵;->ܿ:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 157
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v5, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v5, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v4, v3, v2, v5}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 158
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const-string v3, "DER"

    .line 159
    invoke-static {v0, v3}, Lorg/bouncycastle/asn1/ASN1OutputStream;->create(Ljava/io/OutputStream;Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1OutputStream;

    move-result-object v3

    .line 160
    new-instance v4, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v5, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v5, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    const/16 v1, 0x40

    invoke-direct {v4, v2, v1, v2, v5}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZIILorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 161
    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1OutputStream;->writeObject(Lorg/bouncycastle/asn1/ASN1Primitive;)V

    .line 162
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 164
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ᩳ()[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/۠֨᩵;->ᩳ:[Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method
