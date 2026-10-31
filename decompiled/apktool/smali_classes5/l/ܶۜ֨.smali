.class public final Ll/ܶۜ֨;
.super Ll/֨ۧܺ;
.source "01TM"


# direct methods
.method public static ֫(Ljava/io/InputStream;)J
    .locals 8

    .line 93
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    and-int/lit8 v2, v0, 0x7f

    int-to-long v2, v2

    const/4 v4, 0x0

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    add-int/lit8 v4, v4, 0x1

    const/16 v0, 0x9

    if-ge v4, v0, :cond_2

    .line 104
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    and-int/lit8 v5, v0, 0x7f

    int-to-long v5, v5

    mul-int/lit8 v7, v4, 0x7

    shl-long/2addr v5, v7

    or-long/2addr v2, v5

    goto :goto_0

    .line 109
    :cond_0
    new-instance p0, Ll/᩹᩻֨;

    invoke-direct {p0}, Ll/᩹᩻֨;-><init>()V

    throw p0

    .line 106
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    .line 102
    :cond_2
    new-instance p0, Ll/᩹᩻֨;

    invoke-direct {p0}, Ll/᩹᩻֨;-><init>()V

    throw p0

    :cond_3
    return-wide v2

    .line 95
    :cond_4
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public static ֫(I[B)Ll/᩹ۜ֨;
    .locals 1

    .line 78
    aget-byte v0, p1, p0

    if-nez v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p1, p0, 0xff

    const/16 v0, 0x10

    if-ge p1, v0, :cond_0

    .line 81
    new-instance p1, Ll/᩹ۜ֨;

    invoke-direct {p1}, Ll/᩹ۜ֨;-><init>()V

    .line 82
    iput p0, p1, Ll/᩹ۜ֨;->ۧ:I

    return-object p1

    .line 79
    :cond_0
    new-instance p0, Ll/ۢۜ֨;

    .line 16
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 79
    throw p0
.end method

.method public static ֫([B)Ll/᩹ۜ֨;
    .locals 7

    const/16 v0, 0xa

    .line 50
    aget-byte v0, p0, v0

    sget-object v1, Ll/ۡۜ֨;->֫:[B

    const/4 v2, 0x0

    aget-byte v3, v1, v2

    const-string v4, "XZ Stream Footer is corrupt"

    if-ne v0, v3, :cond_2

    const/16 v0, 0xb

    aget-byte v0, p0, v0

    const/4 v3, 0x1

    aget-byte v1, v1, v3

    if-ne v0, v1, :cond_2

    const/4 v0, 0x6

    const/4 v1, 0x4

    .line 56
    invoke-static {v1, p0, v0, v2}, Ll/ܶۜ֨;->֫(I[BII)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    .line 61
    :try_start_0
    invoke-static {v0, p0}, Ll/ܶۜ֨;->֫(I[B)Ll/᩹ۜ֨;

    move-result-object v0
    :try_end_0
    .catch Ll/ۢۜ֨; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v3, 0x0

    .line 67
    iput-wide v3, v0, Ll/᩹ۜ֨;->֫:J

    :goto_0
    if-ge v2, v1, :cond_0

    .line 69
    iget-wide v3, v0, Ll/᩹ۜ֨;->֫:J

    add-int/lit8 v5, v2, 0x4

    aget-byte v5, p0, v5

    and-int/lit16 v5, v5, 0xff

    mul-int/lit8 v6, v2, 0x8

    shl-int/2addr v5, v6

    int-to-long v5, v5

    or-long/2addr v3, v5

    iput-wide v3, v0, Ll/᩹ۜ֨;->֫:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 71
    :cond_0
    iget-wide v1, v0, Ll/᩹ۜ֨;->֫:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    const-wide/16 v3, 0x4

    mul-long v1, v1, v3

    iput-wide v1, v0, Ll/᩹ۜ֨;->֫:J

    return-object v0

    .line 63
    :catch_0
    new-instance p0, Ll/ۢۜ֨;

    const-string v0, "Unsupported options in XZ Stream Footer"

    .line 20
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 63
    throw p0

    .line 57
    :cond_1
    new-instance p0, Ll/᩹᩻֨;

    .line 20
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p0

    .line 53
    :cond_2
    new-instance p0, Ll/᩹᩻֨;

    .line 20
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p0
.end method

.method public static ֫(I[BII)Z
    .locals 4

    .line 19
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 20
    invoke-virtual {v0, p1, p0, p2}, Ljava/util/zip/CRC32;->update([BII)V

    .line 21
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    const/4 p0, 0x0

    const/4 p2, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge p2, v2, :cond_1

    mul-int/lit8 v2, p2, 0x8

    ushr-long v2, v0, v2

    long-to-int v3, v2

    int-to-byte v2, v3

    add-int v3, p3, p2

    .line 24
    aget-byte v3, p1, v3

    if-eq v2, v3, :cond_0

    return p0

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ([B)Ll/᩹ۜ֨;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x6

    if-ge v0, v1, :cond_1

    .line 33
    aget-byte v1, p0, v0

    sget-object v2, Ll/ۡۜ֨;->ۧ:[B

    aget-byte v2, v2, v0

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, Ll/ܺۜ֨;

    const-string v0, "Input is not in the XZ format"

    .line 20
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 34
    throw p0

    :cond_1
    const/4 v0, 0x2

    const/16 v2, 0x8

    .line 36
    invoke-static {v1, p0, v0, v2}, Ll/ܶۜ֨;->֫(I[BII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    :try_start_0
    invoke-static {v1, p0}, Ll/ܶۜ֨;->֫(I[B)Ll/᩹ۜ֨;

    move-result-object p0
    :try_end_0
    .catch Ll/ۢۜ֨; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 43
    :catch_0
    new-instance p0, Ll/ۢۜ֨;

    const-string v0, "Unsupported options in XZ Stream Header"

    .line 20
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p0

    .line 38
    :cond_2
    new-instance p0, Ll/᩹᩻֨;

    const-string v0, "XZ Stream Header is corrupt"

    .line 20
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p0
.end method
