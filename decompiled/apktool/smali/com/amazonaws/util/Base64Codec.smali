.class public Lcom/amazonaws/util/Base64Codec;
.super Ljava/lang/Object;
.source "Base64Codec.java"


# instance fields
.field public final ֫:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 76
    invoke-static {v0}, Lcom/amazonaws/util/CodecUtils;->֫(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/util/Base64Codec;->֫:[B

    return-void
.end method

.method public static ֫(B)I
    .locals 3

    .line 250
    invoke-static {}, Lcom/amazonaws/util/Base64Codec$LazyHolder;->֫()[B

    move-result-object v0

    aget-byte v0, v0, p0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    return v0

    .line 254
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid base 64 character: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char p0, p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(I[B)[B
    .locals 14

    .line 206
    rem-int/lit8 v0, p0, 0x4

    if-nez v0, :cond_9

    add-int/lit8 v0, p0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x2

    if-ge v2, v3, :cond_1

    const/4 v4, -0x1

    if-le v0, v4, :cond_1

    .line 215
    aget-byte v4, p1, v0

    const/16 v5, 0x3d

    if-eq v4, v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v0, 0x1

    const/4 v4, 0x3

    if-eqz v2, :cond_4

    if-eq v2, v0, :cond_3

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    .line 233
    :cond_2
    new-instance p0, Ljava/lang/Error;

    const-string p1, "Impossible"

    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/4 v2, 0x2

    goto :goto_2

    :cond_4
    const/4 v2, 0x3

    .line 235
    :goto_2
    div-int/lit8 p0, p0, 0x4

    mul-int/lit8 p0, p0, 0x3

    rsub-int/lit8 v5, v2, 0x3

    sub-int/2addr p0, v5

    new-array v5, p0, [B

    const/4 v6, 0x0

    .line 239
    :goto_3
    rem-int/lit8 v7, v2, 0x3

    sub-int v7, p0, v7

    const/16 v8, 0xf

    if-ge v1, v7, :cond_5

    add-int/lit8 v7, v1, 0x1

    add-int/lit8 v9, v6, 0x1

    .line 151
    aget-byte v10, p1, v6

    .line 153
    invoke-static {v10}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result v10

    shl-int/2addr v10, v3

    add-int/lit8 v11, v6, 0x2

    aget-byte v9, p1, v9

    .line 154
    invoke-static {v9}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result v9

    ushr-int/lit8 v12, v9, 0x4

    and-int/2addr v12, v4

    or-int/2addr v10, v12

    int-to-byte v10, v10

    aput-byte v10, v5, v1

    add-int/lit8 v10, v1, 0x2

    and-int/2addr v9, v8

    shl-int/lit8 v9, v9, 0x4

    add-int/lit8 v12, v6, 0x3

    .line 156
    aget-byte v11, p1, v11

    .line 159
    invoke-static {v11}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result v11

    ushr-int/lit8 v13, v11, 0x2

    and-int/2addr v8, v13

    or-int/2addr v8, v9

    int-to-byte v8, v8

    aput-byte v8, v5, v7

    and-int/lit8 v7, v11, 0x3

    shl-int/lit8 v7, v7, 0x6

    .line 161
    aget-byte v8, p1, v12

    .line 164
    invoke-static {v8}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result v8

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v5, v10

    add-int/lit8 v6, v6, 0x4

    add-int/lit8 v1, v1, 0x3

    goto :goto_3

    :cond_5
    if-ge v2, v4, :cond_8

    add-int/lit8 p0, v1, 0x1

    add-int/lit8 v7, v6, 0x1

    .line 176
    aget-byte v9, p1, v6

    .line 178
    invoke-static {v9}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result v9

    shl-int/2addr v9, v3

    add-int/lit8 v10, v6, 0x2

    aget-byte v7, p1, v7

    .line 179
    invoke-static {v7}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result v7

    ushr-int/lit8 v11, v7, 0x4

    and-int/2addr v11, v4

    or-int/2addr v9, v11

    int-to-byte v9, v9

    aput-byte v9, v5, v1

    if-ne v2, v0, :cond_6

    .line 182
    invoke-static {v7, v8}, Lcom/amazonaws/util/CodecUtils;->ۧ(II)V

    return-object v5

    :cond_6
    add-int/2addr v1, v3

    and-int/lit8 v0, v7, 0xf

    shl-int/lit8 v0, v0, 0x4

    add-int/2addr v6, v4

    .line 186
    aget-byte v7, p1, v10

    .line 189
    invoke-static {v7}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result v7

    ushr-int/lit8 v9, v7, 0x2

    and-int/2addr v8, v9

    or-int/2addr v0, v8

    int-to-byte v0, v0

    aput-byte v0, v5, p0

    if-ne v2, v3, :cond_7

    .line 192
    invoke-static {v7, v4}, Lcom/amazonaws/util/CodecUtils;->ۧ(II)V

    return-object v5

    :cond_7
    and-int/lit8 p0, v7, 0x3

    shl-int/lit8 p0, p0, 0x6

    .line 196
    aget-byte p1, p1, v6

    .line 199
    invoke-static {p1}, Lcom/amazonaws/util/Base64Codec;->֫(B)I

    move-result p1

    or-int/2addr p0, p1

    int-to-byte p0, p0

    aput-byte p0, v5, v1

    :cond_8
    return-object v5

    .line 207
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Input is expected to be encoded in multiple of 4 bytes but found: "

    .line 0
    invoke-static {p0, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 207
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(II[B[B)V
    .locals 6

    add-int/lit8 v0, p2, 0x1

    add-int/lit8 v1, p1, 0x1

    .line 118
    aget-byte v2, p3, p1

    ushr-int/lit8 v3, v2, 0x2

    and-int/lit8 v3, v3, 0x3f

    iget-object v4, p0, Lcom/amazonaws/util/Base64Codec;->֫:[B

    aget-byte v3, v4, v3

    aput-byte v3, p4, p2

    add-int/lit8 v3, p2, 0x2

    and-int/lit8 v2, v2, 0x3

    shl-int/lit8 v2, v2, 0x4

    add-int/lit8 p1, p1, 0x2

    .line 119
    aget-byte v1, p3, v1

    ushr-int/lit8 v5, v1, 0x4

    and-int/lit8 v5, v5, 0xf

    or-int/2addr v2, v5

    aget-byte v2, v4, v2

    aput-byte v2, p4, v0

    add-int/lit8 p2, p2, 0x3

    and-int/lit8 v0, v1, 0xf

    shl-int/lit8 v0, v0, 0x2

    .line 121
    aget-byte p1, p3, p1

    ushr-int/lit8 p3, p1, 0x6

    and-int/lit8 p3, p3, 0x3

    or-int/2addr p3, v0

    aget-byte p3, v4, p3

    aput-byte p3, p4, v3

    and-int/lit8 p1, p1, 0x3f

    .line 123
    aget-byte p1, v4, p1

    aput-byte p1, p4, p2

    return-void
.end method

.method public final ֫([B)[B
    .locals 9

    .line 85
    array-length v0, p1

    div-int/lit8 v0, v0, 0x3

    .line 86
    array-length v1, p1

    rem-int/lit8 v1, v1, 0x3

    const/4 v2, 0x0

    if-nez v1, :cond_1

    mul-int/lit8 v0, v0, 0x4

    .line 89
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 91
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    .line 92
    invoke-virtual {p0, v2, v1, p1, v0}, Lcom/amazonaws/util/Base64Codec;->֫(II[B[B)V

    add-int/lit8 v2, v2, 0x3

    add-int/lit8 v1, v1, 0x4

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 v3, 0x1

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x4

    .line 96
    new-array v0, v0, [B

    const/4 v4, 0x0

    .line 99
    :goto_1
    array-length v5, p1

    sub-int/2addr v5, v1

    if-ge v2, v5, :cond_2

    .line 100
    invoke-virtual {p0, v2, v4, p1, v0}, Lcom/amazonaws/util/Base64Codec;->֫(II[B[B)V

    add-int/lit8 v2, v2, 0x3

    add-int/lit8 v4, v4, 0x4

    goto :goto_1

    :cond_2
    const/16 v5, 0x3d

    .line 102
    iget-object v6, p0, Lcom/amazonaws/util/Base64Codec;->֫:[B

    if-eq v1, v3, :cond_4

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    return-object v0

    :cond_3
    add-int/lit8 v1, v4, 0x1

    add-int/lit8 v7, v2, 0x1

    .line 130
    aget-byte v2, p1, v2

    ushr-int/lit8 v8, v2, 0x2

    and-int/lit8 v8, v8, 0x3f

    aget-byte v8, v6, v8

    aput-byte v8, v0, v4

    add-int/lit8 v8, v4, 0x2

    and-int/lit8 v2, v2, 0x3

    shl-int/lit8 v2, v2, 0x4

    .line 131
    aget-byte p1, p1, v7

    ushr-int/lit8 v7, p1, 0x4

    and-int/lit8 v7, v7, 0xf

    or-int/2addr v2, v7

    aget-byte v2, v6, v2

    aput-byte v2, v0, v1

    add-int/lit8 v4, v4, 0x3

    and-int/lit8 p1, p1, 0xf

    shl-int/2addr p1, v3

    .line 133
    aget-byte p1, v6, p1

    aput-byte p1, v0, v8

    .line 134
    aput-byte v5, v0, v4

    return-object v0

    :cond_4
    add-int/lit8 v1, v4, 0x1

    .line 141
    aget-byte p1, p1, v2

    ushr-int/lit8 v2, p1, 0x2

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v6, v2

    aput-byte v2, v0, v4

    add-int/lit8 v2, v4, 0x2

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x4

    .line 142
    aget-byte p1, v6, p1

    aput-byte p1, v0, v1

    add-int/lit8 v4, v4, 0x3

    .line 143
    aput-byte v5, v0, v2

    .line 144
    aput-byte v5, v0, v4

    return-object v0
.end method
