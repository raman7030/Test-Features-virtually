.class public Lorg/bouncycastle/crypto/digests/XofUtils;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encode(B)[B
    .locals 3

    const-wide/16 v0, 0x8

    .line 0
    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/digests/XofUtils;->leftEncode(J)[B

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte p0, v1, v2

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static encode([BII)[B
    .locals 2

    .line 0
    array-length v0, p0

    if-ne v0, p2, :cond_0

    mul-int/lit8 p2, p2, 0x8

    int-to-long p1, p2

    invoke-static {p1, p2}, Lorg/bouncycastle/crypto/digests/XofUtils;->leftEncode(J)[B

    move-result-object p1

    invoke-static {p1, p0}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object p0

    return-object p0

    :cond_0
    mul-int/lit8 v0, p2, 0x8

    int-to-long v0, v0

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/digests/XofUtils;->leftEncode(J)[B

    move-result-object v0

    add-int/2addr p2, p1

    invoke-static {p0, p1, p2}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    invoke-static {v0, p0}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static leftEncode(J)[B
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x1

    move-wide v2, p0

    :goto_0
    const/16 v4, 0x8

    shr-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    add-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    goto :goto_0

    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 0
    new-array v2, v2, [B

    const/4 v3, 0x0

    aput-byte v1, v2, v3

    :goto_1
    if-gt v0, v1, :cond_1

    sub-int v3, v1, v0

    mul-int/lit8 v3, v3, 0x8

    shr-long v3, p0, v3

    long-to-int v4, v3

    int-to-byte v3, v4

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method public static rightEncode(J)[B
    .locals 6

    const/4 v0, 0x1

    move-wide v1, p0

    :goto_0
    const/16 v3, 0x8

    shr-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 0
    new-array v1, v1, [B

    aput-byte v0, v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    sub-int v3, v0, v2

    add-int/lit8 v3, v3, -0x1

    mul-int/lit8 v3, v3, 0x8

    shr-long v3, p0, v3

    long-to-int v4, v3

    int-to-byte v3, v4

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v1
.end method
