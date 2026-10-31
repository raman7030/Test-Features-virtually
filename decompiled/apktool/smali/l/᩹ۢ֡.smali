.class public final Ll/᩹ۢ֡;
.super Ljava/lang/Object;
.source "M4LF"


# static fields
.field public static final ֫:[B

.field public static final ۧ:Ll/ܶۢ֡;

.field public static final ܽ:[B

.field public static final ᩳ:Ll/᩸ۢ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 150
    sget-char v0, Ljava/io/File;->separatorChar:C

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 167
    sput-object v0, Ll/᩹ۢ֡;->֫:[B

    .line 188
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 195
    sget-object v0, Ll/᩶ۢ֡;->ۗ:Ll/᩶ۢ֡;

    invoke-virtual {v0}, Ll/᩶ۢ֡;->getString()Ljava/lang/String;

    .line 202
    sget-object v0, Ll/᩶ۢ֡;->ۙ:Ll/᩶ۢ֡;

    invoke-virtual {v0}, Ll/᩶ۢ֡;->getString()Ljava/lang/String;

    .line 207
    new-instance v0, Ll/֡ۢ֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/ܶۢ֡;

    invoke-direct {v1, v0}, Ll/ܶۢ֡;-><init>(Ll/֡ۢ֡;)V

    sput-object v1, Ll/᩹ۢ֡;->ۧ:Ll/ܶۢ֡;

    const/16 v0, 0x2000

    new-array v0, v0, [B

    .line 212
    sput-object v0, Ll/᩹ۢ֡;->ܽ:[B

    .line 217
    new-instance v0, Ll/ۚۢ֡;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۚۢ֡;-><init>(I)V

    new-instance v1, Ll/᩸ۢ֡;

    invoke-direct {v1, v0}, Ll/᩸ۢ֡;-><init>(Ll/ۚۢ֡;)V

    sput-object v1, Ll/᩹ۢ֡;->ᩳ:Ll/᩸ۢ֡;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;[BI)I
    .locals 3

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return p0

    .line 1899
    :cond_0
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-ltz p2, :cond_3

    move v0, p2

    :goto_0
    if-lez v0, :cond_2

    sub-int v1, p2, v0

    .line 1923
    invoke-virtual {p0, p1, v1, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-ne v2, v1, :cond_1

    goto :goto_1

    :cond_1
    sub-int/2addr v0, v1

    goto :goto_0

    :cond_2
    :goto_1
    sub-int/2addr p2, v0

    return p2

    .line 1918
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Length must not be negative: "

    .line 0
    invoke-static {p2, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1918
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(JLjava/io/InputStream;)J
    .locals 1

    .line 2355
    new-instance v0, Ll/֨ۢ֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, p0, p1, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;JLjava/util/function/Supplier;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ֫(Ljava/io/InputStream;JLjava/util/function/Supplier;)J
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_2

    move-wide v2, p1

    :goto_0
    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    .line 2395
    invoke-interface {p3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    .line 2397
    array-length v5, v4

    int-to-long v5, v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    int-to-long v4, v4

    cmp-long v6, v4, v0

    if-gez v6, :cond_0

    goto :goto_1

    :cond_0
    sub-long/2addr v2, v4

    goto :goto_0

    :cond_1
    :goto_1
    sub-long/2addr p1, v2

    return-wide p1

    .line 2386
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p3, "Skip count must be non-negative, actual: "

    .line 0
    invoke-static {p1, p2, p3}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2386
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    .locals 4

    .line 373
    new-array p2, p2, [B

    const-string v0, "inputStream"

    .line 1452
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "outputStream"

    .line 1453
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 1456
    :goto_0
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v3, v2, :cond_0

    const/4 v3, 0x0

    .line 1457
    invoke-virtual {p1, p2, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 3133
    new-instance v0, Ll/ܽܺ֡;

    invoke-direct {v0}, Ll/ܽܺ֡;-><init>()V

    .line 3134
    invoke-static {p0, v0, p1}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 3135
    invoke-virtual {v0}, Ll/ܽܺ֡;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;)Ljava/util/List;
    .locals 3

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2181
    new-instance v1, Ljava/io/InputStreamReader;

    sget v2, Ll/ۡۢ֡;->֫:I

    if-nez v0, :cond_0

    .line 217
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    .line 2181
    :cond_0
    invoke-direct {v1, p0, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 2649
    new-instance p0, Ljava/io/BufferedReader;

    invoke-direct {p0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 2224
    invoke-static {p0}, Ll/ᩴ֨ᩴ;->lines(Ljava/io/BufferedReader;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static ֫(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 589
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;J)V
    .locals 10

    .line 1685
    sget-object v0, Ll/᩹ۢ֡;->ۧ:Ll/ܶۢ֡;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    const/4 v1, 0x0

    .line 1664
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-nez v4, :cond_0

    goto :goto_1

    .line 1522
    :cond_0
    array-length v5, v0

    if-lez v4, :cond_1

    int-to-long v6, v5

    cmp-long v8, p2, v6

    if-gez v8, :cond_1

    long-to-int v6, p2

    goto :goto_0

    :cond_1
    move v6, v5

    :cond_2
    :goto_0
    if-lez v6, :cond_3

    .line 1529
    invoke-virtual {p0, v0, v1, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    const/4 v8, -0x1

    if-eq v8, v7, :cond_3

    .line 1530
    invoke-virtual {p1, v0, v1, v7}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v7, v7

    add-long/2addr v2, v7

    if-lez v4, :cond_2

    sub-long v6, p2, v2

    int-to-long v8, v5

    .line 1534
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v6, v6

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1

    const/16 v0, 0x2000

    .line 1429
    invoke-static {p0, p1, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V
    .locals 3

    .line 1128
    new-instance v0, Ljava/io/InputStreamReader;

    sget v1, Ll/ۡۢ֡;->֫:I

    if-nez p2, :cond_0

    .line 217
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p2

    .line 1128
    :cond_0
    invoke-direct {v0, p0, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 1703
    sget-object p0, Ll/᩹ۢ֡;->ᩳ:Ll/᩸ۢ֡;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    const/4 p2, 0x0

    .line 1675
    invoke-static {p0, p2}, Ljava/util/Arrays;->fill([CC)V

    .line 1579
    :goto_0
    invoke-virtual {v0, p0}, Ljava/io/Reader;->read([C)I

    move-result v1

    const/4 v2, -0x1

    if-eq v2, v1, :cond_1

    .line 1580
    invoke-virtual {p1, p0, p2, v1}, Ljava/io/Writer;->write([CII)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/InputStream;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    .line 917
    :cond_0
    invoke-static {p0}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    move-result-object p0

    invoke-static {p1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    move-result-object p1

    invoke-static {p0, p1}, Ll/۫ۢ֡;->֫(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/channels/ReadableByteChannel;)Z

    move-result p0

    return p0
.end method

.method public static ֫()[B
    .locals 2

    const/4 v0, 0x0

    .line 1664
    sget-object v1, Ll/᩹ۢ֡;->ܽ:[B

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([BB)V

    return-object v1
.end method

.method public static ۧ(JLjava/io/InputStream;)V
    .locals 4

    .line 2495
    new-instance v0, Ll/֨ۢ֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, p0, p1, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;JLjava/util/function/Supplier;)J

    move-result-wide v0

    cmp-long p2, v0, p0

    if-nez p2, :cond_0

    return-void

    .line 2497
    :cond_0
    new-instance p2, Ljava/io/EOFException;

    const-string v2, "Bytes to skip: "

    const-string v3, " actual: "

    .line 0
    invoke-static {v2, v3, p0, p1}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 2497
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ۧ(Ljava/io/InputStream;[BI)V
    .locals 2

    .line 2041
    invoke-static {p0, p1, p2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;[BI)I

    move-result p0

    if-ne p0, p2, :cond_0

    return-void

    .line 2043
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "Length to read: "

    const-string v1, " actual: "

    .line 0
    invoke-static {v0, p2, p0, v1}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2043
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ(Ljava/io/InputStream;)[B
    .locals 5

    .line 2681
    sget v0, Ll/ܳܺ֡;->۬:I

    .line 101
    new-instance v0, Ll/ܿܺ֡;

    .line 70
    invoke-direct {v0}, Ll/۬ۢ֡;-><init>()V

    .line 2681
    invoke-static {}, Ll/ܿܺ֡;->֫()Ll/ܳܺ֡;

    move-result-object v0

    .line 2682
    new-instance v1, Ll/ᩳܺ֡;

    new-instance v2, Ll/᩵ۢ֡;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/᩵ۢ֡;-><init>(I)V

    new-instance v3, Ll/۟ۢۡ;

    const/4 v4, 0x7

    invoke-direct {v3, v4, v0}, Ll/۟ۢۡ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v2, v3}, Ll/ᩳܺ֡;-><init>(Ll/᩵ۢ֡;Ll/۟ۢۡ;)V

    .line 2685
    :try_start_0
    invoke-static {p0, v1}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 2686
    invoke-virtual {v0}, Ll/ܳܺ֡;->֫()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2687
    invoke-virtual {v1}, Ll/ᩳܺ֡;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 2681
    :try_start_1
    invoke-virtual {v1}, Ll/ᩳܺ֡;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method
