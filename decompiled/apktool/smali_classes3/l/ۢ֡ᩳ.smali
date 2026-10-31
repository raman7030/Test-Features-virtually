.class public final Ll/ۢ֡ᩳ;
.super Ljava/lang/Object;
.source "O6RT"


# direct methods
.method public static ֫(Ll/᩷۠ᩴ;)Landroid/os/Bundle;
    .locals 8

    const-string v0, "app-index"

    .line 47
    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    .line 48
    sget-object v0, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v1, 0x1

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {p0, v2}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 49
    invoke-static {p0}, Ll/ܿ۠ᩴ;->size(Ll/᩷۠ᩴ;)J

    move-result-wide v4

    const-wide/16 v6, 0x10

    cmp-long v2, v4, v6

    if-ltz v2, :cond_6

    const-wide/32 v6, 0x10000

    cmp-long v2, v4, v6

    if-gtz v2, :cond_6

    long-to-int v2, v4

    .line 51
    new-array v4, v2, [B

    new-array v5, v1, [Ll/᩻۠ᩴ;

    aput-object v0, v5, v3

    .line 52
    invoke-static {p0, v5}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    sub-int v5, v2, v0

    .line 55
    :try_start_0
    invoke-virtual {p0, v4, v0, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-lez v5, :cond_0

    add-int/2addr v0, v5

    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated session startup index"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, -0x1

    if-ne v0, v5, :cond_4

    .line 60
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 61
    new-instance p0, Ll/۬ۜܽ;

    invoke-direct {p0, v4}, Ll/۬ۜܽ;-><init>([B)V

    .line 62
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    add-int/lit8 v5, v2, -0x4

    invoke-virtual {v0, v4, v3, v5}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long v5, v5

    .line 63
    invoke-virtual {p0, v5, v6}, Ll/۬ۜܽ;->seek(J)V

    .line 64
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v5

    long-to-int v0, v5

    if-ne v3, v0, :cond_3

    const-wide/16 v5, 0x0

    .line 65
    invoke-virtual {p0, v5, v6}, Ll/۬ۜܽ;->seek(J)V

    .line 66
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v3, 0x32495345

    if-ne v0, v3, :cond_2

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    add-int/lit8 v2, v2, -0x10

    if-ne p0, v2, :cond_2

    .line 69
    new-instance p0, Ljava/io/ByteArrayInputStream;

    const/16 v0, 0xc

    invoke-direct {p0, v4, v0, v2}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    int-to-long v0, v2

    const/high16 v2, 0x10000

    invoke-static {v2, v0, v1, p0}, Ll/᩵ۘᩳ;->֫(IJLjava/io/InputStream;)Ll/᩵ۘᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object p0

    return-object p0

    .line 67
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unsupported session startup index"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 64
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid session startup index checksum"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_4
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing session startup index bytes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_5

    .line 52
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_1
    throw v0

    .line 50
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid session startup index length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 48
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Session startup index is missing"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Landroid/os/Bundle;)V
    .locals 6

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "filePath"

    .line 24
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "changed"

    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "temp"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "sideIconType"

    .line 26
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "remark"

    .line 27
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x200

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-lez v3, :cond_0

    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_0

    add-int/lit8 v4, v3, -0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    .line 31
    :cond_0
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const p1, 0xfff0

    .line 33
    invoke-static {p1, v0}, Ll/᩵ۘᩳ;->֫(ILandroid/os/Bundle;)Ll/᩵ۘᩳ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩵ۘᩳ;->֫(I)[B

    move-result-object p1

    .line 34
    new-instance v0, Ll/ۤۜܽ;

    array-length v1, p1

    add-int/lit8 v1, v1, 0x10

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x32495345

    .line 35
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->ۧ([B)V

    .line 36
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v3

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v4

    invoke-virtual {p1, v3, v2, v4}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {p1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    long-to-int p1, v3

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    const-string p1, "app-index.tmp"

    .line 38
    invoke-interface {p0, p1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    const-string v3, "app-index"

    invoke-interface {p0, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v4, v1, [Ll/ܳ۠ᩴ;

    .line 215
    sget-object v5, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v5, v4, v2

    invoke-static {p1, v4}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    invoke-static {p1}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V

    .line 40
    :cond_2
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗۘᩳ;->֫(Ll/᩷۠ᩴ;[B)V

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩺֨ᩴ;

    .line 207
    sget-object v4, Ll/ۖ۠ᩴ;->ATOMIC_MOVE:Ll/ۖ۠ᩴ;

    aput-object v4, v0, v2

    sget-object v2, Ll/ۖ۠ᩴ;->REPLACE_EXISTING:Ll/ۖ۠ᩴ;

    aput-object v2, v0, v1

    invoke-static {p1, v3, v0}, Ll/ܿ۠ᩴ;->move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)Ll/᩷۠ᩴ;

    .line 212
    sget-object p1, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {p1, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    return-void
.end method
