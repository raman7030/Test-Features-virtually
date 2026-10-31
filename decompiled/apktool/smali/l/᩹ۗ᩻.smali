.class public final Ll/᩹ۗ᩻;
.super Ljava/lang/Object;
.source "B784"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ll/᩸ۗ᩻;
    .locals 2

    .line 67
    new-instance v0, Ll/۠ۗ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۠ۗ᩻;-><init>(I)V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 68
    new-instance v0, Ll/ܶۗ᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 69
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x41505844

    .line 70
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x1

    .line 71
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x2

    .line 72
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 73
    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 76
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖۜۜ;

    .line 77
    iget-object v1, p2, Ll/ۖۜۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 78
    iget-object p2, p2, Ll/ۖۜۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 81
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 82
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_1

    .line 84
    :cond_1
    new-instance p1, Ll/᩸ۗ᩻;

    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->֫(Ljava/security/MessageDigest;)[B

    move-result-object p2

    invoke-direct {p1, p0, p2}, Ll/᩸ۗ᩻;-><init>(Ljava/lang/String;[B)V

    return-object p1
.end method

.method public static ֫(Ljava/io/OutputStream;Ll/᩸ۗ᩻;[B)V
    .locals 2

    .line 172
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x60

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x41505844

    .line 173
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x1

    .line 174
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 175
    iget-object v1, p1, Ll/᩸ۗ᩻;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 176
    iget-object p1, p1, Ll/᩸ۗ᩻;->ۧ:[B

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->write([B)V

    .line 177
    array-length p1, p2

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 178
    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V

    .line 179
    invoke-virtual {p0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 181
    invoke-virtual {v0}, Ll/ۤۜܽ;->ᩳ()V

    .line 187
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 188
    invoke-virtual {p1, p2}, Ljava/util/zip/CRC32;->update([B)V

    .line 189
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p1

    long-to-int p2, p1

    .line 182
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 183
    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/᩸ۗ᩻;[B)V
    .locals 3

    .line 131
    iget-object v0, p1, Ll/᩸ۗ᩻;->֫:Ljava/lang/String;

    .line 46
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    .line 47
    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".bin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۨ()V

    const-string v0, ".dex_build"

    .line 133
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 136
    :try_start_1
    invoke-static {v2, p1, p2}, Ll/᩹ۗ᩻;->֫(Ljava/io/OutputStream;Ll/᩸ۗ᩻;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 138
    invoke-virtual {v0, p0, v1, p1, p2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 193
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 194
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    if-eqz v2, :cond_1

    .line 135
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    .line 193
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 194
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 141
    :cond_2
    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/᩸ۗ᩻;)[B
    .locals 9

    .line 91
    iget-object v0, p1, Ll/᩸ۗ᩻;->֫:Ljava/lang/String;

    .line 46
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    .line 47
    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    const-string v3, ".bin"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 96
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, 0x2d

    .line 98
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    :try_start_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    .line 100
    new-array v5, v1, [B

    .line 101
    invoke-virtual {v2, v5}, Ljava/io/DataInputStream;->readFully([B)V

    .line 102
    new-instance v6, Ll/۬ۜܽ;

    invoke-direct {v6, v5}, Ll/۬ۜܽ;-><init>([B)V

    .line 103
    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    const v7, 0x41505844

    if-ne v5, v7, :cond_1

    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_1

    .line 104
    invoke-virtual {v6}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x20

    new-array v8, v7, [B

    .line 61
    invoke-virtual {v6, v7, v8}, Ll/۬ۜܽ;->֫(I[B)V

    .line 107
    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    .line 108
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Ll/᩸ۗ᩻;->ۧ:[B

    invoke-static {p1, v8}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    if-ltz v6, :cond_1

    int-to-long v7, v6

    int-to-long v0, v1

    sub-long/2addr v3, v0

    const-wide/16 v0, 0x4

    sub-long/2addr v3, v0

    cmp-long p1, v7, v3

    if-nez p1, :cond_1

    .line 110
    new-array p1, v6, [B

    .line 111
    invoke-virtual {v2, p1}, Ljava/io/DataInputStream;->readFully([B)V

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 113
    invoke-virtual {v2, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 114
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 115
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    .line 187
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 188
    invoke-virtual {v1, p1}, Ljava/util/zip/CRC32;->update([B)V

    .line 189
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    long-to-int v1, v3

    if-ne v1, v0, :cond_1

    .line 120
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return-object p1

    :cond_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 98
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    nop

    .line 193
    :goto_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 194
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_2
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method
