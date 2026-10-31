.class public final Ll/ۢ֨ᩴ;
.super Ll/۬᩸ᩴ;
.source "N673"


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public volatile g:Ll/ܳ֨ᩴ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ll/۬᩸ᩴ;-><init>()V

    .line 75
    iput-object p1, p0, Ll/ۢ֨ᩴ;->e:Ljava/lang/String;

    const-string p1, "/"

    .line 76
    iput-object p1, p0, Ll/ۢ֨ᩴ;->f:Ljava/lang/String;

    return-void
.end method

.method public static i(Ljava/net/URI;)V
    .locals 2

    .line 386
    invoke-virtual {p0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 389
    invoke-virtual {p0}, Ljava/net/URI;->getRawAuthority()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    .line 392
    invoke-virtual {p0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "/"

    .line 396
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 399
    invoke-virtual {p0}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 402
    invoke-virtual {p0}, Ljava/net/URI;->getRawFragment()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 403
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Fragment component present"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 400
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Query component present"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 397
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Path component should be \'/\'"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 394
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Path component is undefined"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 390
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Authority component present"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 387
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI does not match this provider"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static j([Ll/᩺֨ᩴ;Ll/ۖ۠ᩴ;)Z
    .locals 4

    .line 229
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    if-ne v3, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method


# virtual methods
.method public final a(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 183
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final varargs b(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V
    .locals 0

    .line 189
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final c(Ll/᩷۠ᩴ;)Z
    .locals 0

    .line 151
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    return p1
.end method

.method public final varargs checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V
    .locals 8

    .line 279
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object v0

    .line 280
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 284
    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    :goto_0
    if-ge v4, v1, :cond_3

    aget-object v6, p2, v4

    .line 285
    sget-object v7, Ll/᩻֨ᩴ;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    if-eq v6, v3, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    const/4 v7, 0x3

    if-eq v6, v7, :cond_0

    goto :goto_2

    .line 293
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->canExecute()Z

    move-result v6

    goto :goto_1

    .line 290
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v6

    goto :goto_1

    .line 287
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v6

    :goto_1
    and-int/2addr v5, v6

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-eqz v5, :cond_4

    return-void

    .line 298
    :cond_4
    new-instance p2, Ljava/io/IOException;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "Unable to access file %s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 281
    :cond_5
    new-instance p2, Ljava/nio/file/NoSuchFileException;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/nio/file/NoSuchFileException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final varargs copy(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
    .locals 3

    .line 199
    sget-object v0, Ll/ۖ۠ᩴ;->REPLACE_EXISTING:Ll/ۖ۠ᩴ;

    invoke-static {p3, v0}, Ll/ۢ֨ᩴ;->j([Ll/᩺֨ᩴ;Ll/ۖ۠ᩴ;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-array v0, v1, [Ll/ܳ۠ᩴ;

    invoke-static {p2, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 200
    :cond_0
    new-instance p1, Ljava/nio/file/FileAlreadyExistsException;

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/nio/file/FileAlreadyExistsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 202
    :cond_1
    :goto_0
    sget-object v0, Ll/ۖ۠ᩴ;->ATOMIC_MOVE:Ll/ۖ۠ᩴ;

    invoke-static {p3, v0}, Ll/ۢ֨ᩴ;->j([Ll/᩺֨ᩴ;Ll/ۖ۠ᩴ;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 205
    new-instance p3, Ljava/io/FileInputStream;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 206
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 p2, 0x2000

    :try_start_1
    new-array v0, p2, [B

    .line 209
    :goto_1
    invoke-virtual {p3, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-ltz v2, :cond_2

    .line 210
    invoke-virtual {p1, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 212
    :cond_2
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p3}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p2

    .line 205
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_5
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    .line 203
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unsupported copy option"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs createDirectory(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V
    .locals 1

    .line 121
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    invoke-static {p2, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    new-instance p2, Ljava/nio/file/NoSuchFileException;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/nio/file/NoSuchFileException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 124
    :cond_1
    :goto_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p2

    .line 125
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    .line 127
    :cond_2
    new-instance p2, Ljava/nio/file/FileAlreadyExistsException;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/nio/file/FileAlreadyExistsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final delete(Ll/᩷۠ᩴ;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ll/ۨ֨ᩴ;

    .line 133
    invoke-virtual {p0, p1, v0}, Ll/ۢ֨ᩴ;->checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    invoke-virtual {p0, p1}, Ll/ۢ֨ᩴ;->c(Ll/᩷۠ᩴ;)Z

    return-void

    .line 146
    :catch_0
    new-instance v0, Ljava/nio/file/NoSuchFileException;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/nio/file/NoSuchFileException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final varargs e(Ll/᩷۠ᩴ;Ljava/util/Set;Ljava/util/concurrent/ExecutorService;[Ll/᩹۠ᩴ;)Ll/ۤ֨ᩴ;
    .locals 0

    .line 178
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final varargs f(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/FileChannel;
    .locals 1

    .line 164
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p3

    invoke-virtual {p3}, Ljava/io/File;->isDirectory()Z

    move-result p3

    if-nez p3, :cond_0

    .line 168
    invoke-static {p1, p2}, Ll/᩺ۚᩴ;->T(Ll/᩷۠ᩴ;Ljava/util/Set;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    return-object p1

    .line 165
    :cond_0
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "The desugar library does not support creating a file channel on a directory: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final varargs getFileAttributeView(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/᩶۠ᩴ;
    .locals 0

    .line 269
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    const-class p3, Ll/ܽܶᩴ;

    if-ne p2, p3, :cond_0

    .line 272
    new-instance p3, Ll/۟ۚᩴ;

    invoke-direct {p3, p1}, Ll/۟ۚᩴ;-><init>(Ll/᩷۠ᩴ;)V

    invoke-virtual {p2, p3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶۠ᩴ;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getFileStore(Ll/᩷۠ᩴ;)Ll/ܰ֨ᩴ;
    .locals 1

    .line 262
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "getFileStore"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;
    .locals 3

    .line 92
    invoke-static {p1}, Ll/ۢ֨ᩴ;->i(Ljava/net/URI;)V

    .line 93
    iget-object p1, p0, Ll/ۢ֨ᩴ;->g:Ll/ܳ֨ᩴ;

    if-nez p1, :cond_1

    move-object v0, p0

    .line 95
    monitor-enter v0

    .line 96
    :try_start_0
    iget-object p1, p0, Ll/ۢ֨ᩴ;->g:Ll/ܳ֨ᩴ;

    if-nez p1, :cond_0

    .line 98
    new-instance p1, Ll/ܳ֨ᩴ;

    iget-object v1, p0, Ll/ۢ֨ᩴ;->e:Ljava/lang/String;

    iget-object v2, p0, Ll/ۢ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {p1, p0, v1, v2}, Ll/ܳ֨ᩴ;-><init>(Ll/ۢ֨ᩴ;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۢ֨ᩴ;->g:Ll/ܳ֨ᩴ;

    .line 100
    :cond_0
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1
.end method

.method public final getPath(Ljava/net/URI;)Ll/᩷۠ᩴ;
    .locals 11

    .line 107
    iget-object v0, p0, Ll/ۢ֨ᩴ;->g:Ll/ܳ֨ᩴ;

    iget-object v1, p0, Ll/ۢ֨ᩴ;->e:Ljava/lang/String;

    iget-object v2, p0, Ll/ۢ֨ᩴ;->f:Ljava/lang/String;

    sget-object v3, Ll/ۖ֨ᩴ;->c:[C

    .line 40
    invoke-virtual {p1}, Ljava/net/URI;->isAbsolute()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 42
    invoke-virtual {p1}, Ljava/net/URI;->isOpaque()Z

    move-result v3

    if-nez v3, :cond_b

    .line 44
    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    const-string v4, "file"

    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 47
    invoke-virtual {p1}, Ljava/net/URI;->getRawAuthority()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_9

    .line 49
    invoke-virtual {p1}, Ljava/net/URI;->getRawFragment()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    .line 51
    invoke-virtual {p1}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_7

    .line 61
    invoke-virtual {p1}, Ljava/net/URI;->getRawPath()Ljava/lang/String;

    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_6

    const-string v4, "/"

    .line 67
    invoke-virtual {p1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    if-le v3, v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    .line 69
    :cond_0
    new-array v4, v3, [B

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v3, :cond_4

    add-int/lit8 v7, v5, 0x1

    .line 73
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x25

    if-ne v8, v9, :cond_2

    add-int/lit8 v8, v5, 0x2

    .line 77
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    add-int/lit8 v5, v5, 0x3

    .line 78
    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 79
    invoke-static {v7}, Ll/ۖ֨ᩴ;->a(C)I

    move-result v7

    shl-int/lit8 v7, v7, 0x4

    invoke-static {v8}, Ll/ۖ֨ᩴ;->a(C)I

    move-result v8

    or-int/2addr v7, v8

    int-to-byte v7, v7

    if-eqz v7, :cond_1

    goto :goto_1

    .line 81
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Nul character not allowed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-eqz v8, :cond_3

    const/16 v5, 0x80

    if-ge v8, v5, :cond_3

    int-to-byte v5, v8

    move v10, v7

    move v7, v5

    move v5, v10

    :goto_1
    add-int/lit8 v8, v6, 0x1

    .line 87
    aput-byte v7, v4, v6

    move v6, v8

    goto :goto_0

    .line 84
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bad escape"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    if-eq v6, v3, :cond_5

    .line 90
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v4

    .line 92
    :cond_5
    new-instance p1, Ll/ܺ֨ᩴ;

    new-instance v3, Ljava/lang/String;

    .line 51
    sget-object v5, Ll/ۘ֨ᩴ;->a:Ljava/nio/charset/Charset;

    .line 94
    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, v0, v3, v1, v2}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 64
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI path component is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI has a query component"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 50
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI has a fragment component"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI has an authority component"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI scheme is not \"file\""

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI is not hierarchical"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI is not absolute"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getScheme()Ljava/lang/String;
    .locals 1

    const-string v0, "file"

    return-object v0
.end method

.method public final h(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 4

    .line 194
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ۢ֨ᩴ;->g:Ll/ܳ֨ᩴ;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Ll/ۢ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ۢ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final isHidden(Ll/᩷۠ᩴ;)Z
    .locals 0

    .line 252
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->isHidden()Z

    move-result p1

    return p1
.end method

.method public final isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z
    .locals 2

    .line 240
    invoke-interface {p1, p2}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    new-array v1, v0, [Ll/ۨ֨ᩴ;

    .line 245
    invoke-virtual {p0, p1, v1}, Ll/ۢ֨ᩴ;->checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V

    new-array v0, v0, [Ll/ۨ֨ᩴ;

    .line 246
    invoke-virtual {p0, p2, v0}, Ll/ۢ֨ᩴ;->checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V

    .line 247
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final varargs move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
    .locals 1

    .line 217
    sget-object v0, Ll/ۖ۠ᩴ;->REPLACE_EXISTING:Ll/ۖ۠ᩴ;

    invoke-static {p3, v0}, Ll/ۢ֨ᩴ;->j([Ll/᩺֨ᩴ;Ll/ۖ۠ᩴ;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    invoke-static {p2, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 218
    :cond_0
    new-instance p1, Ljava/nio/file/FileAlreadyExistsException;

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/nio/file/FileAlreadyExistsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 220
    :cond_1
    :goto_0
    sget-object v0, Ll/ۖ۠ᩴ;->COPY_ATTRIBUTES:Ll/ۖ۠ᩴ;

    invoke-static {p3, v0}, Ll/ۢ֨ᩴ;->j([Ll/᩺֨ᩴ;Ll/ۖ۠ᩴ;)Z

    move-result p3

    if-nez p3, :cond_2

    .line 223
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p1

    .line 224
    invoke-interface {p2}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p2

    .line 225
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    return-void

    .line 221
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unsupported copy option"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs newByteChannel(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/SeekableByteChannel;
    .locals 0

    .line 158
    invoke-virtual {p0, p1, p2, p3}, Ll/ۢ֨ᩴ;->f(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    return-object p1
.end method

.method public final newDirectoryStream(Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
    .locals 2

    .line 114
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    new-instance v0, Ll/ۜ֨ᩴ;

    .line 456
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 457
    new-instance v1, Ll/᩷֨ᩴ;

    invoke-direct {v1, p0, p1, p2}, Ll/᩷֨ᩴ;-><init>(Ll/ۢ֨ᩴ;Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)V

    iput-object v1, v0, Ll/ۜ֨ᩴ;->a:Ll/᩷֨ᩴ;

    return-object v0
.end method

.method public final newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;
    .locals 0

    .line 86
    invoke-static {p1}, Ll/ۢ֨ᩴ;->i(Ljava/net/URI;)V

    .line 87
    new-instance p1, Ljava/nio/file/FileSystemAlreadyExistsException;

    invoke-direct {p1}, Ljava/nio/file/FileSystemAlreadyExistsException;-><init>()V

    throw p1
.end method

.method public final varargs readAttributes(Ll/᩷۠ᩴ;Ljava/lang/String;[Ll/ܳ۠ᩴ;)Ljava/util/Map;
    .locals 6

    const-string p3, ":"

    .line 317
    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p3

    const/4 v0, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, ","

    if-ne p3, v0, :cond_0

    .line 322
    invoke-virtual {p2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 324
    :cond_0
    invoke-virtual {p2, v2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v4, "basic"

    .line 325
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    add-int/2addr p3, v1

    .line 331
    invoke-virtual {p2, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 334
    :goto_0
    new-instance p3, Ll/۟ۚᩴ;

    invoke-direct {p3, p1}, Ll/۟ۚᩴ;-><init>(Ll/᩷۠ᩴ;)V

    .line 172
    sget-object p1, Ll/۟ۚᩴ;->b:Ljava/util/Set;

    .line 118
    new-instance v0, Ll/ܰۚᩴ;

    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, v0, Ll/ܰۚᩴ;->a:Ljava/util/Set;

    .line 99
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, v0, Ll/ܰۚᩴ;->b:Ljava/util/Map;

    .line 103
    array-length v3, p2

    :goto_1
    if-ge v2, v3, :cond_3

    aget-object v4, p2, v2

    const-string v5, "*"

    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 105
    iput-boolean v1, v0, Ll/ܰۚᩴ;->c:Z

    goto :goto_2

    .line 107
    :cond_1
    move-object v5, p1

    check-cast v5, Ljava/util/HashSet;

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 109
    iget-object v5, v0, Ll/ܰۚᩴ;->a:Ljava/util/Set;

    check-cast v5, Ljava/util/HashSet;

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 108
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "\'"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\' not recognized"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 174
    :cond_3
    invoke-virtual {p3}, Ll/۟ۚᩴ;->readAttributes()Ll/ܶ۠ᩴ;

    move-result-object p1

    const-string p2, "size"

    .line 148
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 149
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->size()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    const-string p2, "creationTime"

    .line 150
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 151
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->creationTime()Ll/ۙ۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    const-string p2, "lastAccessTime"

    .line 152
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 153
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->lastAccessTime()Ll/ۙ۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    const-string p2, "lastModifiedTime"

    .line 154
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 155
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->lastModifiedTime()Ll/ۙ۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    const-string p2, "fileKey"

    .line 156
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 157
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->fileKey()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_8
    const-string p2, "isDirectory"

    .line 158
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 159
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->isDirectory()Z

    move-result p3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    const-string p2, "isRegularFile"

    .line 160
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 161
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->isRegularFile()Z

    move-result p3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    const-string p2, "isSymbolicLink"

    .line 162
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_b

    .line 163
    move-object p3, p1

    check-cast p3, Ll/֫֨ᩴ;

    invoke-virtual {p3}, Ll/֫֨ᩴ;->isSymbolicLink()Z

    move-result p3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    const-string p2, "isOther"

    .line 164
    invoke-virtual {v0, p2}, Ll/ܰۚᩴ;->b(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_c

    .line 165
    check-cast p1, Ll/֫֨ᩴ;

    invoke-virtual {p1}, Ll/֫֨ᩴ;->isOther()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ll/ܰۚᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    :cond_c
    iget-object p1, v0, Ll/ܰۚᩴ;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 328
    :cond_d
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 329
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Requested attribute type for: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " is not available."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;
    .locals 1

    .line 306
    const-class v0, Ll/ܶ۠ᩴ;

    if-ne p2, v0, :cond_0

    .line 307
    const-class v0, Ll/ܽܶᩴ;

    .line 311
    invoke-virtual {p0, p1, v0, p3}, Ll/ۢ֨ᩴ;->getFileAttributeView(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/᩶۠ᩴ;

    move-result-object p1

    check-cast p1, Ll/ܽܶᩴ;

    invoke-interface {p1}, Ll/ܽܶᩴ;->readAttributes()Ll/ܶ۠ᩴ;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ۠ᩴ;

    return-object p1

    .line 309
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final varargs setAttribute(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/Object;[Ll/ܳ۠ᩴ;)V
    .locals 2

    const-string p4, ":"

    .line 343
    invoke-virtual {p2, p4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p4

    const/4 v0, -0x1

    if-ne p4, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 350
    invoke-virtual {p2, v0, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "basic"

    .line 351
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    add-int/lit8 p4, p4, 0x1

    .line 357
    invoke-virtual {p2, p4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 360
    :goto_0
    new-instance p4, Ll/۟ۚᩴ;

    invoke-direct {p4, p1}, Ll/۟ۚᩴ;-><init>(Ll/᩷۠ᩴ;)V

    const-string p1, "lastModifiedTime"

    .line 78
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 79
    check-cast p3, Ll/ۙ۠ᩴ;

    invoke-virtual {p4, p3, v0, v0}, Ll/۟ۚᩴ;->a(Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;)V

    return-void

    :cond_1
    const-string p1, "lastAccessTime"

    .line 82
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 83
    check-cast p3, Ll/ۙ۠ᩴ;

    invoke-virtual {p4, v0, p3, v0}, Ll/۟ۚᩴ;->a(Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;)V

    return-void

    :cond_2
    const-string p1, "creationTime"

    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 87
    check-cast p3, Ll/ۙ۠ᩴ;

    return-void

    .line 90
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "\'basic:"

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' not recognized"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 354
    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 355
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Requested attribute type for: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " is not available."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
