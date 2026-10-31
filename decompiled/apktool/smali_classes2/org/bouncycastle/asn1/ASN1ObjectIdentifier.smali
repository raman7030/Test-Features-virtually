.class public Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
.super Lorg/bouncycastle/asn1/ASN1Primitive;


# static fields
.field public static final LONG_LIMIT:J = 0xffffffffffff80L

.field public static final MAX_CONTENTS_LENGTH:I = 0x1000

.field public static final MAX_IDENTIFIER_LENGTH:I = 0x4001

.field public static final TYPE:Lorg/bouncycastle/asn1/ASN1UniversalType;

.field public static final pool:Ljava/util/concurrent/ConcurrentMap;


# instance fields
.field public final contents:[B

.field public identifier:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier$1;

    const-class v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier$1;-><init>(Ljava/lang/Class;I)V

    sput-object v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->TYPE:Lorg/bouncycastle/asn1/ASN1UniversalType;

    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->pool:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Primitive;-><init>()V

    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->checkIdentifier(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->parseIdentifier(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->checkContentsLength(I)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    iput-object p1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->identifier:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Primitive;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    iput-object p2, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->identifier:Ljava/lang/String;

    return-void
.end method

.method public static checkContentsLength(I)V
    .locals 1

    const/16 v0, 0x1000

    if-gt p0, v0, :cond_0

    return-void

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "exceeded OID contents length limit"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static checkIdentifier(Ljava/lang/String;)V
    .locals 3

    if-eqz p0, :cond_2

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x4001

    if-gt v0, v1, :cond_1

    .line 13
    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->isValidIdentifier(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "string "

    const-string v2, " not a valid OID"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "exceeded OID contents length limit"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "\'identifier\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static createPrimitive([BZ)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 2

    .line 0
    array-length v0, p0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->checkContentsLength(I)V

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier$OidHandle;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier$OidHandle;-><init>([B)V

    sget-object v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->pool:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1RelativeOID;->isValidContents([B)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz p1, :cond_1

    invoke-static {p0}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object p0

    :cond_1
    const/4 p1, 0x0

    invoke-direct {v0, p0, p1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>([BLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid OID contents"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static fromContents([B)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {p0, v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->createPrimitive([BZ)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "\'contents\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 3

    if-eqz p0, :cond_3

    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1Encodable;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0

    instance-of v1, v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_2

    check-cast v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object v0

    :cond_1
    instance-of v0, p0, [B

    if-eqz v0, :cond_2

    :try_start_0
    sget-object v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->TYPE:Lorg/bouncycastle/asn1/ASN1UniversalType;

    check-cast p0, [B

    invoke-virtual {v0, p0}, Lorg/bouncycastle/asn1/ASN1UniversalType;->fromByteArray([B)Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "failed to construct object identifier from byte[]: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "illegal object in getInstance: "

    invoke-static {p0, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static getInstance(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 2

    if-nez p1, :cond_0

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->isParsed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->hasContextTag()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->getBaseObject()Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Object;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0

    instance-of v1, v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-nez v1, :cond_0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object p0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->fromContents([B)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->TYPE:Lorg/bouncycastle/asn1/ASN1UniversalType;

    invoke-virtual {v0, p0, p1}, Lorg/bouncycastle/asn1/ASN1UniversalType;->getContextTagged(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static getTagged(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->TYPE:Lorg/bouncycastle/asn1/ASN1UniversalType;

    invoke-virtual {v0, p0, p1}, Lorg/bouncycastle/asn1/ASN1UniversalType;->getTagged(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    return-object p0
.end method

.method public static isValidIdentifier(Ljava/lang/String;)Z
    .locals 8

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-lt v0, v2, :cond_9

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x30

    if-lt v3, v5, :cond_9

    const/16 v5, 0x32

    if-le v3, v5, :cond_1

    goto :goto_2

    :cond_1
    const/4 v6, 0x2

    invoke-static {p0, v6}, Lorg/bouncycastle/asn1/ASN1RelativeOID;->isValidIdentifier(Ljava/lang/String;I)Z

    move-result v7

    if-nez v7, :cond_2

    return v1

    :cond_2
    if-ne v3, v5, :cond_3

    return v0

    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v3, v2, :cond_8

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_6

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_5

    goto :goto_0

    :cond_5
    return v1

    :cond_6
    :goto_0
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v2, 0x34

    if-ge p0, v2, :cond_7

    return v0

    :cond_7
    return v1

    :cond_8
    :goto_1
    return v0

    :cond_9
    :goto_2
    return v1
.end method

.method public static parseContents([B)Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    .line 0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v7, v2

    :goto_0
    array-length v8, v0

    if-eq v4, v8, :cond_8

    aget-byte v8, v0, v4

    const-wide v9, 0xffffffffffff80L

    const/4 v11, 0x7

    const/16 v12, 0x2e

    const/16 v13, 0x32

    const-wide/16 v14, 0x50

    cmp-long v16, v5, v9

    if-gtz v16, :cond_4

    and-int/lit8 v9, v8, 0x7f

    int-to-long v9, v9

    add-long/2addr v5, v9

    and-int/lit16 v8, v8, 0x80

    if-nez v8, :cond_3

    if-eqz v3, :cond_2

    const-wide/16 v8, 0x28

    cmp-long v3, v5, v8

    if-gez v3, :cond_0

    const/16 v3, 0x30

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    cmp-long v3, v5, v14

    if-gez v3, :cond_1

    const/16 v3, 0x31

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sub-long/2addr v5, v8

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sub-long/2addr v5, v14

    :goto_1
    const/4 v3, 0x0

    :cond_2
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    shl-long/2addr v5, v11

    goto :goto_3

    :cond_4
    if-nez v7, :cond_5

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    :cond_5
    and-int/lit8 v9, v8, 0x7f

    int-to-long v9, v9

    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    and-int/lit16 v8, v8, 0x80

    if-nez v8, :cond_7

    if-eqz v3, :cond_6

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    const/4 v3, 0x0

    :cond_6
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object v7, v2

    :goto_2
    const-wide/16 v5, 0x0

    goto :goto_3

    :cond_7
    invoke-virtual {v7, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v7

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static parseIdentifier(Ljava/lang/String;)[B
    .locals 7

    .line 0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/OIDTokenizer;

    invoke-direct {v1, p0}, Lorg/bouncycastle/asn1/OIDTokenizer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/OIDTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    mul-int/lit8 p0, p0, 0x28

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/OIDTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x12

    if-gt v3, v4, :cond_0

    int-to-long v5, p0

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    add-long/2addr v2, v5

    goto :goto_1

    :cond_0
    new-instance v3, Ljava/math/BigInteger;

    invoke-direct {v3, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    int-to-long v5, p0

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {v0, p0}, Lorg/bouncycastle/asn1/ASN1RelativeOID;->writeField(Ljava/io/ByteArrayOutputStream;Ljava/math/BigInteger;)V

    :goto_0
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/OIDTokenizer;->hasMoreTokens()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/OIDTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gt v2, v4, :cond_1

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    :goto_1
    invoke-static {v0, v2, v3}, Lorg/bouncycastle/asn1/ASN1RelativeOID;->writeField(Ljava/io/ByteArrayOutputStream;J)V

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/math/BigInteger;

    invoke-direct {v2, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lorg/bouncycastle/asn1/ASN1RelativeOID;->writeField(Ljava/io/ByteArrayOutputStream;Ljava/math/BigInteger;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static tryFromID(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 3

    if-eqz p0, :cond_1

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x4001

    if-gt v0, v1, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->isValidIdentifier(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->parseIdentifier(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0x1000

    if-gt v1, v2, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, v0, p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>([BLjava/lang/String;)V

    return-object v1

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "\'identifier\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public asn1Equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 0
    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    iget-object p1, p1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    invoke-static {v0, p1}, Lorg/bouncycastle/util/Arrays;->areEqual([B[B)Z

    move-result p1

    return p1
.end method

.method public branch(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 4

    .line 3
    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1RelativeOID;->checkIdentifier(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 12
    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    .line 13
    array-length v0, v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    .line 18
    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->checkContentsLength(I)V

    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    add-int/lit8 v0, v0, -0x30

    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v1, :cond_0

    mul-int/lit8 v0, v0, 0xa

    .line 36
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    add-int/lit8 v1, v1, -0x30

    add-int/2addr v0, v1

    .line 42
    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    int-to-byte v0, v0

    .line 46
    invoke-static {v1, v0}, Lorg/bouncycastle/util/Arrays;->append([BB)[B

    move-result-object v0

    goto :goto_0

    .line 51
    :cond_1
    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1RelativeOID;->parseIdentifier(Ljava/lang/String;)[B

    move-result-object v0

    .line 54
    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    .line 55
    array-length v1, v1

    .line 56
    array-length v2, v0

    add-int/2addr v1, v2

    .line 60
    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->checkContentsLength(I)V

    .line 62
    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    .line 65
    invoke-static {v1, v0}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object v0

    .line 69
    :goto_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    .line 0
    invoke-static {v1, v2, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, v0, p1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>([BLjava/lang/String;)V

    return-object v1
.end method

.method public encode(Lorg/bouncycastle/asn1/ASN1OutputStream;Z)V
    .locals 2

    const/4 v0, 0x6

    .line 0
    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    invoke-virtual {p1, p2, v0, v1}, Lorg/bouncycastle/asn1/ASN1OutputStream;->writeEncodingDL(ZI[B)V

    return-void
.end method

.method public encodeConstructed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public encodedLength(Z)I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    array-length v0, v0

    invoke-static {p1, v0}, Lorg/bouncycastle/asn1/ASN1OutputStream;->getLengthOfEncodingDL(ZI)I

    move-result p1

    return p1
.end method

.method public declared-synchronized getId()Ljava/lang/String;
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->identifier:Ljava/lang/String;

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->parseContents([B)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->identifier:Ljava/lang/String;

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->identifier:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public hashCode()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public intern()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 4

    .line 0
    new-instance v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier$OidHandle;

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier$OidHandle;-><init>([B)V

    sget-object v2, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->pool:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-nez v3, :cond_1

    move-object v0, v2

    monitor-enter v0

    :try_start_0
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object p0

    :cond_0
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-object v3
.end method

.method public on(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z
    .locals 6

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    iget-object v3, p1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->contents:[B

    array-length v5, v3

    array-length p1, v0

    if-le p1, v5, :cond_0

    const/4 v1, 0x0

    const/4 v4, 0x0

    move v2, v5

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/util/Arrays;->areEqual([BII[BII)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
