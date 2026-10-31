.class public final Ll/ۨܰۖ;
.super Ll/᩺ܰۖ;
.source "V9HU"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "little endian"

    return-object v0
.end method

.method public final ֫(Ll/ۤܰۖ;)J
    .locals 6

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 293
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    const-wide/16 v2, 0x0

    const/4 p1, 0x7

    :goto_0
    if-ltz p1, :cond_0

    shl-long/2addr v2, v0

    .line 269
    aget-byte v4, v1, p1

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public final ֫(Ll/ۤܰۖ;J)V
    .locals 9

    long-to-int v0, p2

    int-to-byte v0, v0

    const/16 v1, 0x8

    shr-long v2, p2, v1

    long-to-int v3, v2

    int-to-byte v2, v3

    const/16 v3, 0x10

    shr-long v3, p2, v3

    long-to-int v4, v3

    int-to-byte v3, v4

    const/16 v4, 0x18

    shr-long v4, p2, v4

    long-to-int v5, v4

    int-to-byte v4, v5

    const/16 v5, 0x20

    shr-long v5, p2, v5

    long-to-int v6, v5

    int-to-byte v5, v6

    const/16 v6, 0x28

    shr-long v6, p2, v6

    long-to-int v7, v6

    int-to-byte v6, v7

    const/16 v7, 0x30

    shr-long v7, p2, v7

    long-to-int v8, v7

    int-to-byte v7, v8

    const/16 v8, 0x38

    shr-long/2addr p2, v8

    long-to-int p3, p2

    int-to-byte p2, p3

    new-array p3, v1, [B

    const/4 v8, 0x0

    aput-byte v0, p3, v8

    const/4 v0, 0x1

    aput-byte v2, p3, v0

    const/4 v0, 0x2

    aput-byte v3, p3, v0

    const/4 v0, 0x3

    aput-byte v4, p3, v0

    const/4 v0, 0x4

    aput-byte v5, p3, v0

    const/4 v0, 0x5

    aput-byte v6, p3, v0

    const/4 v0, 0x6

    aput-byte v7, p3, v0

    const/4 v0, 0x7

    aput-byte p2, p3, v0

    .line 318
    invoke-virtual {p1, v1, p3}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method

.method public final ֫(Ll/ۤܰۖ;Ljava/lang/String;)V
    .locals 1

    .line 287
    sget-object v0, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 288
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    array-length v0, p2

    invoke-virtual {p1, v0, p2}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method

.method public final ۧ(Ll/ۤܰۖ;)J
    .locals 8

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 293
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    const/4 p1, 0x0

    .line 227
    aget-byte p1, v1, p1

    int-to-long v2, p1

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/4 p1, 0x1

    aget-byte p1, v1, p1

    shl-int/lit8 p1, p1, 0x8

    int-to-long v4, p1

    const-wide/32 v6, 0xff00

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    const/4 p1, 0x2

    aget-byte p1, v1, p1

    shl-int/lit8 p1, p1, 0x10

    int-to-long v4, p1

    const-wide/32 v6, 0xff0000

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    const/4 p1, 0x3

    aget-byte p1, v1, p1

    shl-int/lit8 p1, p1, 0x18

    int-to-long v0, p1

    const-wide v4, 0xff000000L

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method
