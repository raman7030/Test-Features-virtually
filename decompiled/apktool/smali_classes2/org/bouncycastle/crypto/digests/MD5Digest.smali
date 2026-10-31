.class public Lorg/bouncycastle/crypto/digests/MD5Digest;
.super Lorg/bouncycastle/crypto/digests/GeneralDigest;

# interfaces
.implements Lorg/bouncycastle/crypto/digests/EncodableDigest;


# static fields
.field public static final DIGEST_LENGTH:I = 0x10

.field public static final S11:I = 0x7

.field public static final S12:I = 0xc

.field public static final S13:I = 0x11

.field public static final S14:I = 0x16

.field public static final S21:I = 0x5

.field public static final S22:I = 0x9

.field public static final S23:I = 0xe

.field public static final S24:I = 0x14

.field public static final S31:I = 0x4

.field public static final S32:I = 0xb

.field public static final S33:I = 0x10

.field public static final S34:I = 0x17

.field public static final S41:I = 0x6

.field public static final S42:I = 0xa

.field public static final S43:I = 0xf

.field public static final S44:I = 0x15


# instance fields
.field public H1:I

.field public H2:I

.field public H3:I

.field public H4:I

.field public X:[I

.field public xOff:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/CryptoServicePurpose;->ANY:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/MD5Digest;-><init>(Lorg/bouncycastle/crypto/CryptoServicePurpose;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/CryptoServicePurpose;)V
    .locals 1

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/GeneralDigest;-><init>(Lorg/bouncycastle/crypto/CryptoServicePurpose;)V

    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v0, 0x40

    invoke-static {p0, v0, p1}, Lorg/bouncycastle/crypto/digests/Utils;->getDefaultProperties(Lorg/bouncycastle/crypto/Digest;ILorg/bouncycastle/crypto/CryptoServicePurpose;)Lorg/bouncycastle/crypto/CryptoServiceProperties;

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/MD5Digest;->reset()V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/digests/MD5Digest;)V
    .locals 1

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/GeneralDigest;-><init>(Lorg/bouncycastle/crypto/digests/GeneralDigest;)V

    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->copyIn(Lorg/bouncycastle/crypto/digests/MD5Digest;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 3

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/GeneralDigest;-><init>([B)V

    const/16 v0, 0x10

    new-array v1, v0, [I

    iput-object v1, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    const/16 v0, 0x14

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    const/16 v0, 0x18

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    const/16 v0, 0x1c

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    const/16 v0, 0x20

    invoke-static {p1, v0}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    mul-int/lit8 v2, v0, 0x4

    add-int/lit8 v2, v2, 0x24

    invoke-static {p1, v2}, Lorg/bouncycastle/util/Pack;->bigEndianToInt([BI)I

    move-result v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private F(III)I
    .locals 0

    and-int/2addr p2, p1

    not-int p1, p1

    and-int/2addr p1, p3

    or-int/2addr p1, p2

    return p1
.end method

.method private G(III)I
    .locals 0

    and-int/2addr p1, p3

    not-int p3, p3

    and-int/2addr p2, p3

    or-int/2addr p1, p2

    return p1
.end method

.method private H(III)I
    .locals 0

    xor-int/2addr p1, p2

    xor-int/2addr p1, p3

    return p1
.end method

.method private K(III)I
    .locals 0

    not-int p3, p3

    or-int/2addr p1, p3

    xor-int/2addr p1, p2

    return p1
.end method

.method private copyIn(Lorg/bouncycastle/crypto/digests/MD5Digest;)V
    .locals 4

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->copyIn(Lorg/bouncycastle/crypto/digests/GeneralDigest;)V

    iget v0, p1, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    iget-object v0, p1, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p1, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    iput p1, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    return-void
.end method

.method private rotateLeft(II)I
    .locals 1

    shl-int v0, p1, p2

    rsub-int/lit8 p2, p2, 0x20

    ushr-int/2addr p1, p2

    or-int/2addr p1, v0

    return p1
.end method


# virtual methods
.method public copy()Lorg/bouncycastle/util/Memoable;
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-direct {v0, p0}, Lorg/bouncycastle/crypto/digests/MD5Digest;-><init>(Lorg/bouncycastle/crypto/digests/MD5Digest;)V

    return-object v0
.end method

.method public cryptoServiceProperties()Lorg/bouncycastle/crypto/CryptoServiceProperties;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-static {p0, v0}, Lorg/bouncycastle/crypto/digests/Utils;->getDefaultProperties(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/CryptoServicePurpose;)Lorg/bouncycastle/crypto/CryptoServiceProperties;

    move-result-object v0

    return-object v0
.end method

.method public doFinal([BI)I
    .locals 2

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->finish()V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    invoke-static {v0, p1, p2}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    add-int/lit8 v1, p2, 0x4

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    add-int/lit8 p2, p2, 0xc

    invoke-static {v0, p1, p2}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/MD5Digest;->reset()V

    const/16 p1, 0x10

    return p1
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "MD5"

    return-object v0
.end method

.method public getDigestSize()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public getEncodedState()[B
    .locals 5

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v1, v0, 0x25

    new-array v1, v1, [B

    invoke-super {p0, v1}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->populateState([B)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    const/16 v3, 0x10

    invoke-static {v2, v1, v3}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    const/16 v3, 0x14

    invoke-static {v2, v1, v3}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    const/16 v3, 0x18

    invoke-static {v2, v1, v3}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    const/16 v3, 0x1c

    invoke-static {v2, v1, v3}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    const/16 v3, 0x20

    invoke-static {v2, v1, v3}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    if-eq v2, v3, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v3, v3, v2

    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x24

    invoke-static {v3, v1, v4}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I[BI)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x24

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->purpose:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    return-object v1
.end method

.method public processBlock()V
    .locals 23

    move-object/from16 v0, p0

    .line 0
    iget v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    iget v2, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    iget v3, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    iget v4, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v5

    add-int/2addr v1, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    add-int/2addr v1, v5

    const v5, -0x28955b88

    add-int/2addr v1, v5

    const/4 v5, 0x7

    invoke-direct {v0, v1, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v6

    add-int/2addr v4, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v7, 0x1

    aget v6, v6, v7

    add-int/2addr v4, v6

    const v6, -0x173848aa

    add-int/2addr v4, v6

    const/16 v6, 0xc

    invoke-direct {v0, v4, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v7

    add-int/2addr v3, v7

    iget-object v7, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v8, 0x2

    aget v7, v7, v8

    add-int/2addr v3, v7

    const v7, 0x242070db

    add-int/2addr v3, v7

    const/16 v7, 0x11

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v8

    add-int/2addr v2, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v9, 0x3

    aget v8, v8, v9

    add-int/2addr v2, v8

    const v8, -0x3e423112

    add-int/2addr v2, v8

    const/16 v8, 0x16

    invoke-direct {v0, v2, v8}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v1, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v10, 0x4

    aget v9, v9, v10

    add-int/2addr v1, v9

    const v9, -0xa83f051

    add-int/2addr v1, v9

    invoke-direct {v0, v1, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v4, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v11, 0x5

    aget v9, v9, v11

    add-int/2addr v4, v9

    const v9, 0x4787c62a

    add-int/2addr v4, v9

    invoke-direct {v0, v4, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v3, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v12, 0x1

    const/4 v13, 0x6

    aget v9, v9, v13

    add-int/2addr v3, v9

    const v9, -0x57cfb9ed

    add-int/2addr v3, v9

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v2, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v9, v9, v5

    add-int/2addr v2, v9

    const v9, -0x2b96aff

    add-int/2addr v2, v9

    invoke-direct {v0, v2, v8}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v1, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v14, 0x8

    aget v9, v9, v14

    add-int/2addr v1, v9

    const v9, 0x698098d8

    add-int/2addr v1, v9

    invoke-direct {v0, v1, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v4, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v15, 0x9

    aget v9, v9, v15

    add-int/2addr v4, v9

    const v9, -0x74bb0851

    add-int/2addr v4, v9

    invoke-direct {v0, v4, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v3, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v17, 0x3

    const/16 v14, 0xa

    aget v9, v9, v14

    add-int/2addr v3, v9

    const v9, -0xa44f

    add-int/2addr v3, v9

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v2, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v19, 0x0

    const/16 v10, 0xb

    aget v9, v9, v10

    add-int/2addr v2, v9

    const v9, -0x76a32842

    add-int/2addr v2, v9

    invoke-direct {v0, v2, v8}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v9

    add-int/2addr v1, v9

    iget-object v9, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v9, v9, v6

    add-int/2addr v1, v9

    const v9, 0x6b901122

    add-int/2addr v1, v9

    invoke-direct {v0, v1, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v5

    add-int/2addr v4, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v9, 0xd

    aget v5, v5, v9

    add-int/2addr v4, v5

    const v5, -0x2678e6d

    add-int/2addr v4, v5

    invoke-direct {v0, v4, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v5

    add-int/2addr v3, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v21, 0x7

    const/16 v6, 0xe

    aget v5, v5, v6

    add-int/2addr v3, v5

    const v5, -0x5986bc72

    add-int/2addr v3, v5

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->F(III)I

    move-result v5

    add-int/2addr v2, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v7, 0xf

    aget v5, v5, v7

    add-int/2addr v2, v5

    const v5, 0x49b40821

    add-int/2addr v2, v5

    invoke-direct {v0, v2, v8}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v5

    add-int/2addr v1, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v12

    add-int/2addr v1, v5

    const v5, -0x9e1da9e

    add-int/2addr v1, v5

    invoke-direct {v0, v1, v11}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v5

    add-int/2addr v4, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v13

    add-int/2addr v4, v5

    const v5, -0x3fbf4cc0

    add-int/2addr v4, v5

    invoke-direct {v0, v4, v15}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v5

    add-int/2addr v3, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v10

    add-int/2addr v3, v5

    const v5, 0x265e5a51

    add-int/2addr v3, v5

    invoke-direct {v0, v3, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v5

    add-int/2addr v2, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v19

    add-int/2addr v2, v5

    const v5, -0x16493856

    add-int/2addr v2, v5

    const/16 v5, 0x14

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v11

    add-int/2addr v1, v8

    const v8, -0x29d0efa3

    add-int/2addr v1, v8

    invoke-direct {v0, v1, v11}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v4, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v14

    add-int/2addr v4, v8

    const v8, 0x2441453

    add-int/2addr v4, v8

    invoke-direct {v0, v4, v15}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v3, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v7

    add-int/2addr v3, v8

    const v8, -0x275e197f

    add-int/2addr v3, v8

    invoke-direct {v0, v3, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v2, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v20, 0x4

    aget v8, v8, v20

    add-int/2addr v2, v8

    const v8, -0x182c0438

    add-int/2addr v2, v8

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v15

    add-int/2addr v1, v8

    const v8, 0x21e1cde6

    add-int/2addr v1, v8

    invoke-direct {v0, v1, v11}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v4, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v6

    add-int/2addr v4, v8

    const v8, -0x3cc8f82a

    add-int/2addr v4, v8

    invoke-direct {v0, v4, v15}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v3, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v17

    add-int/2addr v3, v8

    const v8, -0xb2af279

    add-int/2addr v3, v8

    invoke-direct {v0, v3, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v2, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v18, 0x8

    aget v8, v8, v18

    add-int/2addr v2, v8

    const v8, 0x455a14ed

    add-int/2addr v2, v8

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v9

    add-int/2addr v1, v8

    const v8, -0x561c16fb

    add-int/2addr v1, v8

    invoke-direct {v0, v1, v11}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v4, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v16, 0x2

    aget v8, v8, v16

    add-int/2addr v4, v8

    const v8, -0x3105c08

    add-int/2addr v4, v8

    invoke-direct {v0, v4, v15}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v3, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v8, v8, v21

    add-int/2addr v3, v8

    const v8, 0x676f02d9

    add-int/2addr v3, v8

    invoke-direct {v0, v3, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->G(III)I

    move-result v8

    add-int/2addr v2, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v22, 0xc

    aget v8, v8, v22

    add-int/2addr v2, v8

    const v8, -0x72d5b376

    add-int/2addr v2, v8

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v5

    add-int/2addr v1, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v11

    add-int/2addr v1, v5

    const v5, -0x5c6be

    add-int/2addr v1, v5

    const/4 v5, 0x4

    invoke-direct {v0, v1, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v5

    add-int/2addr v4, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v8, 0x8

    aget v5, v5, v8

    add-int/2addr v4, v5

    const v5, -0x788e097f

    add-int/2addr v4, v5

    invoke-direct {v0, v4, v10}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v5

    add-int/2addr v3, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v10

    add-int/2addr v3, v5

    const v5, 0x6d9d6122

    add-int/2addr v3, v5

    const/16 v5, 0x10

    invoke-direct {v0, v3, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v8

    add-int/2addr v2, v8

    iget-object v8, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v8, v6

    add-int/2addr v2, v6

    const v6, -0x21ac7f4

    add-int/2addr v2, v6

    const/16 v6, 0x17

    invoke-direct {v0, v2, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v8

    add-int/2addr v1, v8

    const/16 v8, 0xe

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v12

    add-int/2addr v1, v11

    const v11, -0x5b4115bc

    add-int/2addr v1, v11

    const/4 v11, 0x4

    invoke-direct {v0, v1, v11}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v20

    add-int v4, v4, v20

    iget-object v12, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v12, v12, v11

    add-int/2addr v4, v12

    const v11, 0x4bdecfa9    # 2.9204306E7f

    add-int/2addr v4, v11

    invoke-direct {v0, v4, v10}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v3, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v21

    add-int/2addr v3, v11

    const v11, -0x944b4a0

    add-int/2addr v3, v11

    invoke-direct {v0, v3, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v2, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v14

    add-int/2addr v2, v11

    const v11, -0x41404390

    add-int/2addr v2, v11

    invoke-direct {v0, v2, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v1, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v9

    add-int/2addr v1, v11

    const v11, 0x289b7ec6

    add-int/2addr v1, v11

    const/4 v11, 0x4

    invoke-direct {v0, v1, v11}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v4, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v19

    add-int/2addr v4, v11

    const v11, -0x155ed806

    add-int/2addr v4, v11

    invoke-direct {v0, v4, v10}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v3, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v17

    add-int/2addr v3, v11

    const v11, -0x2b10cf7b

    add-int/2addr v3, v11

    invoke-direct {v0, v3, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v2, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v13

    add-int/2addr v2, v11

    const v11, 0x4881d05    # 3.2000097E-36f

    add-int/2addr v2, v11

    invoke-direct {v0, v2, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v1, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v15

    add-int/2addr v1, v11

    const v11, -0x262b2fc7

    add-int/2addr v1, v11

    const/4 v11, 0x4

    invoke-direct {v0, v1, v11}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v4, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v12, 0xc

    aget v11, v11, v12

    add-int/2addr v4, v11

    const v11, -0x1924661b

    add-int/2addr v4, v11

    invoke-direct {v0, v4, v10}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v11

    add-int/2addr v3, v11

    iget-object v11, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v11, v11, v7

    add-int/2addr v3, v11

    const v11, 0x1fa27cf8

    add-int/2addr v3, v11

    invoke-direct {v0, v3, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->H(III)I

    move-result v5

    add-int/2addr v2, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v11, 0x2

    aget v5, v5, v11

    add-int/2addr v2, v5

    const v5, -0x3b53a99b

    add-int/2addr v2, v5

    invoke-direct {v0, v2, v6}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v5

    add-int/2addr v1, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v19

    add-int/2addr v1, v5

    const v5, -0xbd6ddbc

    add-int/2addr v1, v5

    invoke-direct {v0, v1, v13}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v5

    add-int/2addr v4, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v21

    add-int/2addr v4, v5

    const v5, 0x432aff97

    add-int/2addr v4, v5

    invoke-direct {v0, v4, v14}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v5

    add-int/2addr v3, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v5, v5, v8

    add-int/2addr v3, v5

    const v5, -0x546bdc59

    add-int/2addr v3, v5

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v5

    add-int/2addr v2, v5

    iget-object v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v6, 0x5

    aget v5, v5, v6

    add-int/2addr v2, v5

    const v5, -0x36c5fc7

    add-int/2addr v2, v5

    const/16 v5, 0x15

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v1, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v8, 0xc

    aget v6, v6, v8

    add-int/2addr v1, v6

    const v6, 0x655b59c3

    add-int/2addr v1, v6

    invoke-direct {v0, v1, v13}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v4, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v6, v17

    add-int/2addr v4, v6

    const v6, -0x70f3336e

    add-int/2addr v4, v6

    invoke-direct {v0, v4, v14}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v3, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v6, v14

    add-int/2addr v3, v6

    const v6, -0x100b83

    add-int/2addr v3, v6

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v2, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v8, 0x1

    aget v6, v6, v8

    add-int/2addr v2, v6

    const v6, -0x7a7ba22f

    add-int/2addr v2, v6

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v1, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/16 v8, 0x8

    aget v6, v6, v8

    add-int/2addr v1, v6

    const v6, 0x6fa87e4f

    add-int/2addr v1, v6

    invoke-direct {v0, v1, v13}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v4, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v6, v7

    add-int/2addr v4, v6

    const v6, -0x1d31920

    add-int/2addr v4, v6

    invoke-direct {v0, v4, v14}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v3, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v6, v13

    add-int/2addr v3, v6

    const v6, -0x5cfebcec

    add-int/2addr v3, v6

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v2, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v6, v9

    add-int/2addr v2, v6

    const v6, 0x4e0811a1    # 5.7071418E8f

    add-int/2addr v2, v6

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v1, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v8, 0x4

    aget v6, v6, v8

    add-int/2addr v1, v6

    const v6, -0x8ac817e

    add-int/2addr v1, v6

    invoke-direct {v0, v1, v13}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v4, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v6, v10

    add-int/2addr v4, v6

    const v6, -0x42c50dcb

    add-int/2addr v4, v6

    invoke-direct {v0, v4, v14}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v3, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    const/4 v8, 0x2

    aget v6, v6, v8

    add-int/2addr v3, v6

    const v6, 0x2ad7d2bb

    add-int/2addr v3, v6

    invoke-direct {v0, v3, v7}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {v0, v3, v4, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->K(III)I

    move-result v6

    add-int/2addr v2, v6

    iget-object v6, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    aget v6, v6, v15

    add-int/2addr v2, v6

    const v6, -0x14792c6f

    add-int/2addr v2, v6

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/crypto/digests/MD5Digest;->rotateLeft(II)I

    move-result v2

    add-int/2addr v2, v3

    iget v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    add-int/2addr v5, v1

    iput v5, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    iget v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    add-int/2addr v1, v2

    iput v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    iget v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    add-int/2addr v1, v3

    iput v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    iget v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    add-int/2addr v1, v4

    iput v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    const/4 v1, 0x0

    iput v1, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    array-length v4, v3

    if-eq v2, v4, :cond_0

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public processLength(J)V
    .locals 3

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    const/16 v1, 0xe

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/MD5Digest;->processBlock()V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    long-to-int v2, p1

    aput v2, v0, v1

    const/16 v1, 0x20

    ushr-long/2addr p1, v1

    long-to-int p2, p1

    const/16 p1, 0xf

    aput p2, v0, p1

    return-void
.end method

.method public processWord([BI)V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    iget v1, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->littleEndianToInt([BI)I

    move-result p1

    aput p1, v0, v1

    iget p1, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    const/16 p2, 0x10

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/MD5Digest;->processBlock()V

    :cond_0
    return-void
.end method

.method public reset()V
    .locals 4

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->reset()V

    const v0, 0x67452301

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H1:I

    const v0, -0x10325477

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H2:I

    const v0, -0x67452302

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H3:I

    const v0, 0x10325476

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->H4:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->xOff:I

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/MD5Digest;->X:[I

    array-length v3, v2

    if-eq v1, v3, :cond_0

    aput v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public reset(Lorg/bouncycastle/util/Memoable;)V
    .locals 0

    .line 0
    check-cast p1, Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->copyIn(Lorg/bouncycastle/crypto/digests/MD5Digest;)V

    return-void
.end method
