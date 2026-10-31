.class public final Ll/᩷ۨܳ;
.super Ljava/lang/Object;
.source "F8CE"

# interfaces
.implements Ll/ۢۨܳ;


# virtual methods
.method public final ֫(Ll/۠ۖܽ;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 3

    .line 210
    new-instance v0, Ljava/util/zip/InflaterInputStream;

    new-instance v1, Ljava/util/zip/Inflater;

    invoke-direct {v1}, Ljava/util/zip/Inflater;-><init>()V

    const/high16 v2, 0x10000

    invoke-direct {v0, p1, v1, v2}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;I)V

    return-object v0
.end method

.method public final ֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;
    .locals 0

    .line 215
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫([BI)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ge p2, v0, :cond_0

    return v1

    .line 183
    :cond_0
    aget-byte p2, p1, v1

    and-int/lit16 v0, p2, 0xff

    const/4 v2, 0x1

    .line 184
    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    and-int/lit8 p2, p2, 0xf

    const/16 v3, 0x8

    if-eq p2, v3, :cond_1

    return v1

    :cond_1
    shr-int/lit8 p2, v0, 0x4

    and-int/lit8 p2, p2, 0xf

    const/4 v3, 0x7

    if-le p2, v3, :cond_2

    return v1

    :cond_2
    shl-int/lit8 p2, v0, 0x8

    add-int/2addr p2, p1

    .line 199
    rem-int/lit8 p2, p2, 0x1f

    if-nez p2, :cond_3

    return v2

    :cond_3
    return v1
.end method
