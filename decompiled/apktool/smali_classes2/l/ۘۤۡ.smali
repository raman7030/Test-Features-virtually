.class public final Ll/ۘۤۡ;
.super Ljava/lang/Object;
.source "T2R9"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/֡ۛۡ;

.field public static final ܽ:Ll/֡ۛۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 26
    new-instance v0, Ll/֡ۛۡ;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/ۘۤۡ;->ۧ:Ll/֡ۛۡ;

    .line 27
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/ۘۤۡ;->ܽ:Ll/֡ۛۡ;

    return-void
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 6

    .line 179
    array-length v0, p0

    .line 183
    invoke-static {}, Ll/ۘۤۡ;->֫()Ll/֡ܺᩴ;

    move-result-object v1

    .line 184
    :try_start_0
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {v2, v3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 185
    :try_start_1
    invoke-static {v2, v1}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 186
    new-instance p0, Ljava/lang/String;

    iget-object v0, v1, Ll/֡ܺᩴ;->᩸:[B

    iget v3, v1, Ll/֡ܺᩴ;->᩹:I

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, v4, v3, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    :try_start_2
    invoke-virtual {v2}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 190
    invoke-static {v1}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 184
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 188
    :try_start_5
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 190
    :goto_1
    invoke-static {v1}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    .line 191
    throw p0
.end method

.method public static ֫()Ll/֡ܺᩴ;
    .locals 1

    .line 223
    sget-object v0, Ll/ۘۤۡ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܺᩴ;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Ll/֡ܺᩴ;

    invoke-direct {v0}, Ll/֡ܺᩴ;-><init>()V

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/֡ܺᩴ;)V
    .locals 2

    .line 231
    iget-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    array-length v0, v0

    const/high16 v1, 0x200000

    if-ge v0, v1, :cond_0

    .line 232
    invoke-virtual {p0}, Ll/֡ܺᩴ;->֫()V

    .line 233
    sget-object v0, Ll/ۘۤۡ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v0, p0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static ֫(II[B)[B
    .locals 2

    .line 154
    invoke-static {}, Ll/ۘۤۡ;->֫()Ll/֡ܺᩴ;

    move-result-object v0

    .line 155
    :try_start_0
    new-instance v1, Ll/ۤۖܽ;

    invoke-direct {v1, v0}, Ll/ۤۖܽ;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :try_start_1
    invoke-virtual {v1, p2, p0, p1}, Ll/ۤۖܽ;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    :try_start_2
    invoke-virtual {v1}, Ll/۫ۖܽ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 161
    iget-object p0, v0, Ll/֡ܺᩴ;->᩸:[B

    iget p1, v0, Ll/֡ܺᩴ;->᩹:I

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    .line 162
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 155
    :try_start_3
    invoke-virtual {v1}, Ll/۫ۖܽ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 158
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    .line 159
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(I[B)[B
    .locals 7

    const/4 v0, 0x0

    const/high16 v1, 0x20000

    if-gt p0, v1, :cond_0

    .line 34
    invoke-static {v0, p0, p1}, Ll/ۘۤۡ;->֫(II[B)[B

    move-result-object p0

    return-object p0

    .line 36
    :cond_0
    new-instance v2, Ll/ۤۜܽ;

    invoke-direct {v2}, Ll/ۤۜܽ;-><init>()V

    const/16 v3, 0x2a5f

    .line 37
    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->ۡ(I)V

    .line 38
    invoke-virtual {v2, p0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 39
    new-instance v3, Ljava/util/ArrayList;

    div-int/lit16 v4, p0, 0x2a5f

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-lez p0, :cond_1

    .line 42
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 43
    new-instance v6, Ll/ۖۤۡ;

    invoke-direct {v6, p1, v4, v5}, Ll/ۖۤۡ;-><init>([BII)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v5

    sub-int/2addr p0, v5

    goto :goto_0

    .line 48
    :cond_1
    :try_start_0
    sget-object p0, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p0, v3}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    .line 49
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v2, p1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 50
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Future;

    .line 51
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    .line 52
    array-length v1, p1

    invoke-virtual {v2, v1}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 44
    array-length v1, p1

    invoke-virtual {v2, p1, v0, v1}, Ll/ۤۜܽ;->write([BII)V

    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {v2}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 57
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 5

    .line 89
    invoke-static {}, Ll/ۘۤۡ;->֫()Ll/֡ܺᩴ;

    move-result-object v0

    .line 211
    sget-object v1, Ll/ۘۤۡ;->ܽ:Ll/֡ۛۡ;

    invoke-virtual {v1}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-nez v2, :cond_0

    const/16 v2, 0x2000

    new-array v2, v2, [B

    .line 91
    :cond_0
    :try_start_0
    new-instance v3, Ll/ۗۖܽ;

    new-instance v4, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v4, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v3, v2, v4}, Ll/ۗۖܽ;-><init>([BLjava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :try_start_1
    invoke-static {v3, p0}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    :try_start_2
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 98
    iget-object p0, v0, Ll/֡ܺᩴ;->᩸:[B

    iget v3, v0, Ll/֡ܺᩴ;->᩹:I

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    .line 99
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    .line 219
    invoke-virtual {v1, v2}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-object p0

    :catchall_0
    move-exception p0

    .line 91
    :try_start_3
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {p0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 94
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    .line 219
    invoke-virtual {v1, v2}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 96
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫([BI)[B
    .locals 3

    .line 109
    invoke-static {}, Ll/ۘۤۡ;->֫()Ll/֡ܺᩴ;

    move-result-object v0

    .line 110
    :try_start_0
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    .line 111
    :try_start_1
    invoke-virtual {v1, p0, v2, p1}, Ljava/util/zip/GZIPOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    iget-object p0, v0, Ll/֡ܺᩴ;->᩸:[B

    iget p1, v0, Ll/֡ܺᩴ;->᩹:I

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    .line 117
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 110
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 113
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    .line 114
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ۧ([BI)[B
    .locals 4

    .line 199
    invoke-static {}, Ll/ۘۤۡ;->֫()Ll/֡ܺᩴ;

    move-result-object v0

    .line 200
    :try_start_0
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, p1}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {v1, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 201
    :try_start_1
    invoke-static {v1, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 202
    iget-object p0, v0, Ll/֡ܺᩴ;->᩸:[B

    iget p1, v0, Ll/֡ܺᩴ;->᩹:I

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    :try_start_2
    invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 206
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 200
    :try_start_3
    invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 204
    :try_start_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 206
    :goto_1
    invoke-static {v0}, Ll/ۘۤۡ;->֫(Ll/֡ܺᩴ;)V

    .line 207
    throw p0
.end method
