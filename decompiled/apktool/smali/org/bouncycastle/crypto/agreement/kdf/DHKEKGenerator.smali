.class public Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/DerivationFunction;


# instance fields
.field public algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public final digest:Lorg/bouncycastle/crypto/Digest;

.field public keySize:I

.field public partyAInfo:[B

.field public z:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method


# virtual methods
.method public generateBytes([BII)I
    .locals 12

    .line 7
    array-length v0, p1

    sub-int/2addr v0, p3

    if-lt v0, p2, :cond_4

    int-to-long v0, p3

    .line 15
    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    .line 18
    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    const-wide v3, 0x1ffffffffL

    cmp-long v5, v0, v3

    if-gtz v5, :cond_3

    int-to-long v3, v2

    add-long v5, v0, v3

    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    .line 35
    div-long/2addr v5, v3

    long-to-int v3, v5

    .line 38
    iget-object v4, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    .line 41
    invoke-interface {v4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v4

    .line 44
    new-array v4, v4, [B

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    :goto_0
    if-ge v6, v3, :cond_2

    .line 51
    iget-object v8, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    .line 53
    iget-object v9, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->z:[B

    .line 54
    array-length v10, v9

    .line 57
    invoke-interface {v8, v9, v5, v10}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    .line 59
    new-instance v8, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 62
    invoke-direct {v8}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 64
    new-instance v9, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    .line 67
    invoke-direct {v9}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 69
    iget-object v10, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 72
    invoke-virtual {v9, v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 74
    new-instance v10, Lorg/bouncycastle/asn1/DEROctetString;

    .line 77
    invoke-static {v7}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I)[B

    move-result-object v11

    .line 81
    invoke-direct {v10, v11}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    .line 84
    invoke-virtual {v9, v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 86
    new-instance v10, Lorg/bouncycastle/asn1/DERSequence;

    .line 89
    invoke-direct {v10, v9}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    .line 92
    invoke-virtual {v8, v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 94
    iget-object v9, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->partyAInfo:[B

    if-eqz v9, :cond_0

    .line 98
    new-instance v9, Lorg/bouncycastle/asn1/DERTaggedObject;

    .line 100
    new-instance v10, Lorg/bouncycastle/asn1/DEROctetString;

    .line 102
    iget-object v11, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->partyAInfo:[B

    .line 105
    invoke-direct {v10, v11}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    const/4 v11, 0x1

    .line 109
    invoke-direct {v9, v11, v5, v10}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 112
    invoke-virtual {v8, v9}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_1

    :cond_0
    const/4 v11, 0x1

    .line 116
    :goto_1
    new-instance v5, Lorg/bouncycastle/asn1/DERTaggedObject;

    .line 118
    new-instance v9, Lorg/bouncycastle/asn1/DEROctetString;

    .line 120
    iget v10, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->keySize:I

    .line 123
    invoke-static {v10}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I)[B

    move-result-object v10

    .line 127
    invoke-direct {v9, v10}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    const/4 v10, 0x2

    .line 131
    invoke-direct {v5, v11, v10, v9}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 134
    invoke-virtual {v8, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 136
    :try_start_0
    new-instance v5, Lorg/bouncycastle/asn1/DERSequence;

    .line 139
    invoke-direct {v5, v8}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    const-string v8, "DER"

    .line 144
    invoke-virtual {v5, v8}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded(Ljava/lang/String;)[B

    move-result-object v5

    .line 147
    iget-object v8, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    .line 148
    array-length v9, v5

    const/4 v10, 0x0

    .line 152
    invoke-interface {v8, v5, v10, v9}, Lorg/bouncycastle/crypto/Digest;->update([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    iget-object v5, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    .line 157
    invoke-interface {v5, v4, v10}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    if-le p3, v2, :cond_1

    .line 162
    invoke-static {v4, v10, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    goto :goto_2

    .line 168
    :cond_1
    invoke-static {v4, v10, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v6, v6, 0x1

    const/4 v5, 0x0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 177
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 179
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "unable to encode parameter info: "

    .line 184
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    long-to-int p1, v0

    return p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Output length too large"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lorg/bouncycastle/crypto/OutputLengthException;

    const-string p2, "output buffer too small"

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/OutputLengthException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDigest()Lorg/bouncycastle/crypto/Digest;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->digest:Lorg/bouncycastle/crypto/Digest;

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/DerivationParameters;)V
    .locals 1

    .line 0
    check-cast p1, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->algorithm:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getKeySize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->keySize:I

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getZ()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->z:[B

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getExtraInfo()[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->partyAInfo:[B

    return-void
.end method
