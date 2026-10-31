.class public final Ll/ۗ֨᩵;
.super Ljava/lang/Object;
.source "G9VY"


# direct methods
.method public static ֫(I[B)S
    .locals 1

    .line 95
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    int-to-short p0, p0

    return p0
.end method

.method public static ֫(II[B)V
    .locals 3

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p0, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 66
    aput-byte v1, p2, p1

    add-int/lit8 v1, p1, 0x2

    shr-int/lit8 v2, p0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    .line 67
    aput-byte v2, p2, v0

    add-int/lit8 p1, p1, 0x3

    shr-int/lit8 v0, p0, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 68
    aput-byte v0, p2, v1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    .line 69
    aput-byte p0, p2, p1

    return-void
.end method

.method public static ۧ(I[B)S
    .locals 1

    .line 105
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    or-int/2addr p0, v0

    int-to-short p0, p0

    return p0
.end method

.method public static ۧ(II[B)V
    .locals 3

    add-int/lit8 v0, p1, 0x1

    and-int/lit16 v1, p0, 0xff

    int-to-byte v1, v1

    .line 82
    aput-byte v1, p2, p1

    add-int/lit8 v1, p1, 0x2

    shr-int/lit8 v2, p0, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    .line 83
    aput-byte v2, p2, v0

    add-int/lit8 p1, p1, 0x3

    shr-int/lit8 v0, p0, 0x10

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 84
    aput-byte v0, p2, v1

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    .line 85
    aput-byte p0, p2, p1

    return-void
.end method

.method public static ܽ(I[B)I
    .locals 2

    .line 100
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static ܿ(I[B)Ljava/lang/String;
    .locals 11

    .line 295
    new-array v0, p0, [C

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p0, :cond_8

    add-int/lit8 v4, v2, 0x1

    .line 298
    aget-byte v5, p1, v2

    and-int/lit16 v6, v5, 0xff

    if-eqz v6, :cond_8

    const/16 v7, 0x80

    if-ge v6, v7, :cond_0

    int-to-char v2, v6

    .line 300
    aput-char v2, v0, v3

    move v2, v4

    goto :goto_1

    :cond_0
    and-int/lit16 v6, v5, 0xe0

    const-string v8, "Invalid UTF-8 sequence"

    const/16 v9, 0xc0

    if-ne v6, v9, :cond_3

    sub-int v6, p0, v4

    const/4 v10, 0x2

    if-ge v6, v10, :cond_1

    goto :goto_2

    :cond_1
    and-int/lit8 v5, v5, 0x1f

    shl-int/lit8 v5, v5, 0x6

    int-to-char v5, v5

    .line 305
    aput-char v5, v0, v3

    add-int/lit8 v2, v2, 0x2

    .line 306
    aget-byte v4, p1, v4

    and-int/lit8 v6, v4, 0x3f

    or-int/2addr v5, v6

    int-to-char v5, v5

    .line 307
    aput-char v5, v0, v3

    and-int/2addr v4, v9

    if-ne v4, v7, :cond_2

    if-lt v5, v7, :cond_2

    goto :goto_1

    .line 309
    :cond_2
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    and-int/lit16 v6, v5, 0xf0

    const/16 v10, 0xe0

    if-ne v6, v10, :cond_7

    sub-int v6, p0, v4

    const/4 v10, 0x3

    if-ge v6, v10, :cond_4

    goto :goto_2

    :cond_4
    and-int/lit8 v5, v5, 0xf

    shl-int/lit8 v5, v5, 0xc

    int-to-char v5, v5

    .line 315
    aput-char v5, v0, v3

    add-int/lit8 v6, v2, 0x2

    .line 316
    aget-byte v4, p1, v4

    and-int/lit16 v10, v4, 0xc0

    if-ne v10, v7, :cond_6

    and-int/lit8 v4, v4, 0x3f

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v4, v5

    int-to-char v4, v4

    .line 320
    aput-char v4, v0, v3

    add-int/lit8 v2, v2, 0x3

    .line 321
    aget-byte v5, p1, v6

    and-int/lit8 v6, v5, 0x3f

    or-int/2addr v4, v6

    int-to-char v4, v4

    .line 322
    aput-char v4, v0, v3

    and-int/2addr v5, v9

    if-ne v5, v7, :cond_5

    const/16 v5, 0x800

    if-lt v4, v5, :cond_5

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 324
    :cond_5
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 318
    :cond_6
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 327
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported UTF-8 sequence"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 331
    :cond_8
    :goto_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    return-object p0
.end method

.method public static ᩳ(I[B)I
    .locals 2

    .line 110
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method
