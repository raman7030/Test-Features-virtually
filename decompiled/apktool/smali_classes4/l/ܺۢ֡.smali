.class public final Ll/ܺۢ֡;
.super Ljava/lang/Object;
.source "G5CT"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-wide/16 v0, 0x400

    .line 132
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    .line 144
    invoke-virtual {v2, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 156
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 168
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 180
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 192
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 197
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    const-wide/high16 v3, 0x1000000000000000L

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 202
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    return-void
.end method

.method public static ֫(Ljava/io/File;)V
    .locals 6

    const-string v0, "Cannot delete file: "

    const-string v1, "file"

    .line 296
    invoke-static {p0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1406
    :try_start_0
    invoke-static {p0}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object v1

    sget-object v2, Ll/ܳۡ֡;->ۧ:[Ll/ܳ۠ᩴ;

    const/4 v3, 0x1

    new-array v3, v3, [Ll/ᩳۡ֡;

    sget-object v4, Ll/ۢۡ֡;->᩹:Ll/ۢۡ֡;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ll/ܳۡ֡;->֫(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;[Ll/ᩳۡ֡;)Ll/ܰۢ֡;

    move-result-object v0
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1415
    invoke-interface {v0}, Ll/ܰۢ֡;->ۧ()Ll/ۛۢ֡;

    move-result-object v1

    invoke-interface {v1}, Ll/ۛۢ֡;->get()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long v5, v1, v3

    if-gez v5, :cond_1

    invoke-interface {v0}, Ll/ܰۢ֡;->֫()Ll/ۛۢ֡;

    move-result-object v0

    invoke-interface {v0}, Ll/ۛۢ֡;->get()J

    move-result-wide v0

    cmp-long v2, v0, v3

    if-ltz v2, :cond_0

    goto :goto_0

    .line 1417
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File does not exist: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v1

    .line 1413
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    .line 1409
    new-instance v2, Ljava/io/FileNotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 1410
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1411
    throw v2
.end method

.method public static ֫(Ljava/io/File;[B)V
    .locals 2

    .line 3318
    array-length v0, p1

    .line 2634
    invoke-static {p0}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۡ֡;->֫(Ll/᩷۠ᩴ;)Ljava/io/OutputStream;

    move-result-object p0

    const/4 v1, 0x0

    .line 3353
    :try_start_0
    invoke-virtual {p0, p1, v1, v0}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3354
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_0

    .line 3352
    :try_start_1
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw p1
.end method

.method public static ۧ(Ljava/io/File;)V
    .locals 3

    .line 381
    new-instance v0, Ll/ܶ᩷ۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "directory"

    .line 2868
    invoke-static {p0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2869
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_1

    .line 2870
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2871
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Parameter \'directory\' is not a directory: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2873
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Directory \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' does not exist."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v1, 0x0

    .line 2312
    invoke-virtual {p0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 381
    invoke-static {v0, v1}, Ll/᩵ۡ֡;->֫(Ll/֡ۡ֡;[Ljava/lang/Object;)V

    return-void

    .line 2315
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown I/O error listing contents of directory: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܳ(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2768
    sget v1, Ll/ۡۢ֡;->֫:I

    if-nez v0, :cond_0

    .line 217
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    .line 2768
    :cond_0
    sget-object v1, Ll/᩹ۢ֡;->֫:[B

    const-string v1, "input"

    invoke-static {p0}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object p0

    const/4 v2, 0x0

    new-array v2, v2, [Ll/᩻۠ᩴ;

    invoke-static {p0, v2}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 3205
    :try_start_0
    invoke-static {p0, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3206
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 3180
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_2

    .line 3204
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw v0
.end method

.method public static ܽ(Ljava/io/File;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1284
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1285
    invoke-static {p0}, Ll/ܺۢ֡;->ۧ(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1291
    :catch_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return p0

    :catch_1
    return v0
.end method

.method public static ܿ(Ljava/io/File;)Ljava/io/OutputStream;
    .locals 0

    .line 2634
    invoke-static {p0}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۡ֡;->֫(Ll/᩷۠ᩴ;)Ljava/io/OutputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/io/File;)V
    .locals 3

    .line 2442
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2443
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot create directory \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\'."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static ᩻(Ljava/io/File;)Ljava/util/List;
    .locals 2

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2817
    invoke-static {p0}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object p0

    sget v1, Ll/ۡۢ֡;->֫:I

    if-nez v0, :cond_0

    .line 217
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    .line 2817
    :cond_0
    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->readAllLines(Ll/᩷۠ᩴ;Ljava/nio/charset/Charset;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
