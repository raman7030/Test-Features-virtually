.class public final Ll/᩸᩶ᩳ;
.super Ljava/lang/Object;
.source "R6SP"


# direct methods
.method public static ֫(Ljava/io/InputStream;)I
    .locals 1

    .line 67
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-ltz p0, :cond_0

    return p0

    .line 68
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    const-string v0, "Truncated legacy compression container"

    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ljava/io/PushbackInputStream;)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/OutputStream;[BJ)J
    .locals 8

    .line 51
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    new-instance v1, Ll/۠᩶ᩳ;

    invoke-direct {v1, p0}, Ll/۠᩶ᩳ;-><init>(Ljava/io/InputStream;)V

    const/16 p0, 0x400

    invoke-direct {v0, v1, p0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;I)V

    const-wide/16 v1, 0x0

    .line 56
    :goto_0
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/io/InputStream;->read([B)I

    move-result p0

    const/4 v3, -0x1

    if-eq p0, v3, :cond_2

    if-lez p0, :cond_1

    int-to-long v3, p0

    sub-long v5, p3, v1

    cmp-long v7, v3, v5

    if-gtz v7, :cond_0

    const/4 v5, 0x0

    .line 59
    invoke-virtual {p1, p2, v5, p0}, Ljava/io/OutputStream;->write([BII)V

    add-long/2addr v1, v3

    goto :goto_0

    .line 58
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy state exceeds decompression limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 57
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy decompression made no progress"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_2
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    return-wide v1

    :catchall_0
    move-exception p0

    .line 51
    :try_start_1
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
.end method

.method public static ֫(Ljava/io/InputStream;JLjava/io/OutputStream;)V
    .locals 17

    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    .line 21
    new-instance v3, Ljava/io/PushbackInputStream;

    const/4 v4, 0x2

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v4}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 22
    invoke-static {v3}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;)I

    move-result v5

    invoke-static {v3}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;)I

    move-result v6

    shl-int/lit8 v7, v6, 0x8

    or-int/2addr v7, v5

    const/16 v8, 0x2000

    new-array v8, v8, [B

    const/4 v9, 0x0

    const/16 v10, 0x2a4f

    if-eq v7, v10, :cond_0

    const/16 v11, 0x2a5f

    if-eq v7, v11, :cond_0

    int-to-byte v5, v5

    int-to-byte v6, v6

    new-array v4, v4, [B

    aput-byte v5, v4, v9

    const/4 v5, 0x1

    aput-byte v6, v4, v5

    .line 25
    invoke-virtual {v3, v4}, Ljava/io/PushbackInputStream;->unread([B)V

    .line 26
    invoke-static {v3, v2, v8, v0, v1}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;[BJ)J

    return-void

    :cond_0
    const/4 v4, 0x6

    new-array v5, v4, [B

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    .line 30
    invoke-static {v3}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;)I

    move-result v9

    int-to-byte v9, v9

    aput-byte v9, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 31
    :cond_1
    new-instance v4, Ll/۬ۜܽ;

    invoke-direct {v4, v5}, Ll/۬ۜܽ;-><init>([B)V

    .line 32
    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-virtual {v4}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v4

    if-lez v5, :cond_b

    int-to-long v5, v5

    cmp-long v9, v5, v0

    if-gtz v9, :cond_b

    int-to-long v0, v4

    const-wide/32 v11, 0x1ffff

    add-long/2addr v11, v5

    const-wide/32 v13, 0x20000

    .line 33
    div-long/2addr v11, v13

    cmp-long v9, v0, v11

    if-nez v9, :cond_b

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v4, :cond_9

    const-string v1, "Invalid legacy compression block length"

    if-ne v7, v10, :cond_2

    .line 38
    invoke-static {v3}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;)I

    move-result v9

    invoke-static {v3}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;)I

    move-result v11

    shl-int/lit8 v11, v11, 0x8

    or-int/2addr v9, v11

    goto :goto_4

    :cond_2
    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_2
    const/16 v12, 0x1c

    if-gt v9, v12, :cond_8

    .line 75
    invoke-static {v3}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;)I

    move-result v15

    if-ne v9, v12, :cond_4

    and-int/lit16 v12, v15, 0xf8

    if-nez v12, :cond_3

    goto :goto_3

    .line 76
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy compression block length overflows"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    and-int/lit8 v12, v15, 0x7f

    shl-int/2addr v12, v9

    or-int/2addr v11, v12

    and-int/lit16 v12, v15, 0x80

    if-nez v12, :cond_7

    move v9, v11

    :goto_4
    if-lez v9, :cond_6

    .line 40
    new-instance v1, Ll/ܶ᩶ᩳ;

    invoke-direct {v1, v3, v9}, Ll/ܶ᩶ᩳ;-><init>(Ljava/io/PushbackInputStream;I)V

    .line 41
    invoke-static {v13, v14, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    .line 42
    invoke-static {v1, v2, v8, v11, v12}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;[BJ)J

    move-result-wide v15

    cmp-long v9, v15, v11

    if-nez v9, :cond_5

    iget v1, v1, Ll/ܶ᩶ᩳ;->᩸:I

    if-nez v1, :cond_5

    sub-long/2addr v5, v11

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 43
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy compression block does not match declared length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_6
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    add-int/lit8 v9, v9, 0x7

    goto :goto_2

    .line 80
    :cond_8
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_9
    invoke-virtual {v3}, Ljava/io/PushbackInputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_a

    return-void

    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing bytes in legacy compression container"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid legacy compression block count or total length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
