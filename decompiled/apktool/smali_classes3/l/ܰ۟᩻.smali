.class public final Ll/ܰ۟᩻;
.super Ljava/lang/Object;
.source "I75V"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 31
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܰ۟᩻;->֫:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x7ft
        0x45t
        0x4ct
        0x46t
    .end array-data
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;
    .locals 11

    .line 40
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, "NATIVE_ENTRY_NOT_ELF"

    if-nez v0, :cond_5

    .line 41
    invoke-virtual {p1, p0, p2, p3}, Ll/ܺ۟᩻;->ᩳ(Ll/ܳ᩻ۜ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗܰ᩻;

    move-result-object v0

    const-string v2, "ZIP entry is not an ELF file."

    if-eqz v0, :cond_1

    .line 44
    iget-object v4, v0, Ll/ۗܰ᩻;->֫:Ll/ܶ᩵ܿ;

    .line 105
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v4}, Ll/ܰ۟᩻;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 108
    new-instance p1, Ll/۟۟᩻;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Ll/۟۟᩻;-><init>(Ll/ܶ᩵ܿ;JJZZ)V

    goto :goto_1

    .line 334
    :cond_0
    invoke-static {v1, v2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 106
    throw p0

    .line 46
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Ll/ܺ۟᩻;->ܽ(Ll/ܳ᩻ۜ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙܰ᩻;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 49
    iget-object p1, p1, Ll/ۙܰ᩻;->֫:[B

    const-string p2, "apk-native-"

    .line 86
    invoke-static {p1}, Ll/ܰ۟᩻;->֫([B)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    sget-object v0, Ll/ܽ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    const-string v2, "apk_mcp_native"

    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 91
    :try_start_0
    invoke-static {v0}, Ll/ܰ۟᩻;->֫(Ll/ܶ᩵ܿ;)V

    .line 92
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ".bin"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 94
    invoke-virtual {v3, p1}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 95
    new-instance p2, Ll/۟۟᩻;

    array-length p1, p1

    int-to-long v4, p1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    move-object v2, p2

    invoke-direct/range {v2 .. v9}, Ll/۟۟᩻;-><init>(Ll/ܶ᩵ܿ;JJZZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, p2

    goto :goto_1

    :catch_0
    const-string p0, "NATIVE_CACHE_UNAVAILABLE"

    const-string p1, "Failed to prepare native entry cache."

    .line 338
    invoke-static {p0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 97
    throw p0

    .line 334
    :cond_2
    invoke-static {v1, v2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 87
    throw p0

    :cond_3
    const-string p1, "resources.arsc"

    .line 51
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    .line 334
    :cond_4
    invoke-static {v1, v2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 53
    throw p0

    :cond_5
    :goto_0
    const/4 p1, 0x0

    .line 116
    invoke-static {p0, p3, p1}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;Z)Ll/۟۟᩻;

    move-result-object p1

    .line 70
    :goto_1
    :try_start_1
    invoke-interface {p4, p1}, Ll/᩺۟᩻;->֫(Ll/۟۟᩻;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    invoke-virtual {p1}, Ll/۟۟᩻;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_3

    :catch_1
    move-exception p2

    .line 223
    :try_start_2
    iget-boolean v0, p1, Ll/۟۟᩻;->۬:Z

    if-nez v0, :cond_7

    iget-boolean v0, p1, Ll/۟۟᩻;->ۗ:Z

    if-eqz v0, :cond_7

    const-string v0, "NATIVE_ANALYZER_FAILED"

    .line 226
    iget-object v2, p2, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 227
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "ENTRY_READ_FAILED"

    .line 228
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "PATCH_EXPECTED_MISMATCH"

    .line 229
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_7

    .line 76
    :cond_6
    invoke-virtual {p1}, Ll/۟۟᩻;->close()V

    const/4 p1, 0x1

    .line 124
    invoke-static {p0, p3, p1}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;Z)Ll/۟۟᩻;

    move-result-object p0

    .line 78
    :try_start_3
    invoke-interface {p4, p0}, Ll/᩺۟᩻;->֫(Ll/۟۟᩻;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 79
    invoke-virtual {p0}, Ll/۟۟᩻;->close()V

    return-object p1

    :catchall_1
    move-exception p1

    .line 77
    :try_start_4
    invoke-virtual {p0}, Ll/۟۟᩻;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 73
    :cond_7
    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 67
    :goto_3
    :try_start_6
    invoke-virtual {p1}, Ll/۟۟᩻;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ljava/lang/String;)Ll/ۗ᩺ۡ;
    .locals 4

    .line 253
    invoke-virtual {p0, p1}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 257
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_1

    .line 260
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    return-object p0

    :cond_0
    const-string p0, "ENTRY_READ_FAILED"

    const-string p1, "ZIP entry size is unavailable."

    .line 261
    invoke-static {p0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    const-string p0, "ENTRY_IS_DIRECTORY"

    const-string p1, "ZIP entry is a directory"

    .line 258
    invoke-static {p0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_2
    const-string p0, "ENTRY_NOT_FOUND"

    const-string p1, "ZIP entry not found"

    .line 255
    invoke-static {p0, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ljava/lang/String;Z)Ll/۟۟᩻;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, ".json"

    const-string v2, ".bin"

    .line 133
    :try_start_0
    new-instance v10, Ll/ᩳܰۡ;

    invoke-virtual/range {p0 .. p0}, Ll/ܳ᩻ۜ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-direct {v10, v3}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :try_start_1
    invoke-static {v10, v7}, Ll/ܰ۟᩻;->֫(Ll/ᩳܰۡ;Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v8

    .line 135
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v13

    .line 136
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->۫()J

    move-result-wide v15

    .line 249
    iget-object v3, v0, Ll/ܳ᩻ۜ;->ۗ:Ll/۠᩷ۜ;

    iget-object v0, v0, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "cache"

    .line 405
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v3, "native"

    .line 249
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 236
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 237
    invoke-virtual {v7, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    .line 236
    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v12

    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/4 v5, 0x2

    if-nez p2, :cond_1

    move-object v0, v11

    move-object v1, v12

    move-object/from16 v2, p1

    move-wide v3, v13

    const/4 v7, 0x2

    move-wide v5, v15

    .line 141
    invoke-static/range {v0 .. v6}, Ll/ܰ۟᩻;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 142
    invoke-static {v12}, Ll/ܰ۟᩻;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    new-instance v0, Ll/۟۟᩻;

    const/16 v17, 0x0

    const/16 v18, 0x1

    move-object v11, v0

    invoke-direct/range {v11 .. v18}, Ll/۟۟᩻;-><init>(Ll/ܶ᩵ܿ;JJZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    :try_start_2
    invoke-virtual {v10}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :cond_0
    :try_start_3
    new-array v0, v7, [Ll/ܶ᩵ܿ;

    aput-object v11, v0, v18

    aput-object v12, v0, v17

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v7, :cond_2

    .line 328
    aget-object v2, v0, v1

    .line 329
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :cond_2
    new-array v0, v7, [Ll/ܶ᩵ܿ;

    aput-object v11, v0, v18

    aput-object v12, v0, v17

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v7, :cond_3

    .line 328
    aget-object v2, v0, v1

    .line 329
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v10

    move-object v1, v8

    move-object/from16 v2, p1

    move-wide v3, v13

    move-wide v5, v15

    move-object v7, v9

    move-object v8, v12

    move-object v9, v11

    .line 149
    invoke-static/range {v0 .. v9}, Ll/ܰ۟᩻;->֫(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ljava/lang/String;JJLl/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ll/۟۟᩻;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 150
    :try_start_4
    invoke-virtual {v10}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 133
    :try_start_5
    invoke-virtual {v10}, Ll/ᩳܰۡ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    const-string v0, "ENTRY_READ_FAILED"

    const-string v1, "Failed to read ZIP entry."

    .line 153
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 151
    throw v0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ljava/lang/String;JJLl/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ll/۟۟᩻;
    .locals 14

    move-wide/from16 v3, p3

    move-object/from16 v0, p7

    .line 281
    invoke-virtual {p0, p1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v1

    const/4 v2, 0x4

    :try_start_0
    new-array v5, v2, [B

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v2, :cond_1

    rsub-int/lit8 v8, v7, 0x4

    .line 285
    invoke-virtual {v1, v5, v7, v8}, Ljava/io/InputStream;->read([BII)I

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-gez v8, :cond_0

    .line 292
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    add-int/2addr v7, v8

    goto :goto_0

    .line 291
    :cond_1
    :try_start_1
    invoke-static {v5}, Ll/ܰ۟᩻;->֫([B)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 292
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    move v1, v2

    :goto_1
    if-eqz v1, :cond_6

    .line 167
    invoke-virtual/range {p7 .. p7}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p8 .. p8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".tmp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 169
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p9 .. p9}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v10

    .line 170
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۬()Z

    .line 171
    invoke-virtual {v10}, Ll/ܶ᩵ܿ;->۬()Z

    .line 174
    :try_start_2
    invoke-virtual {p0, p1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    const/4 v0, 0x0

    .line 175
    :try_start_3
    invoke-virtual {v9, v1, v3, v4, v0}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 176
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 177
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    cmp-long v2, v0, v3

    if-nez v2, :cond_4

    .line 241
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "version"

    const/4 v2, 0x1

    .line 242
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "entryName"

    move-object/from16 v2, p2

    .line 243
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "size"

    .line 244
    invoke-virtual {v0, v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "unsignedCrc"

    move-wide/from16 v7, p5

    .line 245
    invoke-virtual {v0, v1, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 180
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 181
    invoke-virtual/range {p8 .. p8}, Ll/ܶ᩵ܿ;->۬()Z

    move-object/from16 v0, p8

    .line 182
    invoke-virtual {v9, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 185
    invoke-virtual/range {p9 .. p9}, Ll/ܶ᩵ܿ;->۬()Z

    move-object/from16 v1, p9

    .line 186
    invoke-virtual {v10, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v1, :cond_2

    .line 191
    :try_start_5
    new-instance v11, Ll/۟۟᩻;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v1, v11

    move-object/from16 v2, p8

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move v7, v12

    move v8, v13

    invoke-direct/range {v1 .. v8}, Ll/۟۟᩻;-><init>(Ll/ܶ᩵ܿ;JJZZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    return-object v11

    :catchall_0
    move-exception v0

    const/4 v6, 0x1

    goto :goto_3

    .line 187
    :cond_2
    :try_start_6
    invoke-virtual/range {p8 .. p8}, Ll/ܶ᩵ܿ;->۬()Z

    .line 188
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to publish native cache metadata"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to publish native cache data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 178
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected native entry size"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 174
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    :try_start_8
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v0

    :goto_3
    if-nez v6, :cond_5

    .line 194
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۬()Z

    .line 195
    invoke-virtual {v10}, Ll/ܶ᩵ܿ;->۬()Z

    .line 197
    :cond_5
    throw v0

    :cond_6
    const-string v0, "NATIVE_ENTRY_NOT_ELF"

    const-string v1, "ZIP entry is not an ELF file."

    .line 334
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 165
    throw v0

    :catchall_4
    move-exception v0

    move-object v2, v0

    .line 281
    :try_start_9
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)V
    .locals 6

    .line 316
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 319
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    sub-long/2addr v0, v2

    const/4 v2, 0x1

    .line 413
    invoke-virtual {p0, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p0

    .line 320
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 321
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "apk-native-"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    cmp-long v5, v3, v0

    if-gez v5, :cond_1

    .line 322
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)Z
    .locals 5

    .line 204
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    cmp-long p1, v0, p3

    if-eqz p1, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    :try_start_0
    new-instance p1, Lbin/mt/json/JSONObject;

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, v0}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "version"

    const/4 v0, -0x1

    .line 210
    invoke-virtual {p1, p0, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    const-string p0, "entryName"

    const/4 v1, 0x0

    .line 211
    invoke-virtual {p1, p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "size"

    const-wide/16 v1, -0x1

    .line 212
    invoke-virtual {p1, p0, v1, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long p0, v3, p3

    if-nez p0, :cond_1

    const-string p0, "unsignedCrc"

    .line 213
    invoke-virtual {p1, p0, v1, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p2, p0, p5

    if-nez p2, :cond_1

    return v0

    :catch_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫([B)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 270
    array-length v1, p0

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    aget-byte v1, p0, v0

    sget-object v2, Ll/ܰ۟᩻;->֫:[B

    aget-byte v3, v2, v0

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    aget-byte v3, p0, v1

    aget-byte v4, v2, v1

    if-ne v3, v4, :cond_0

    const/4 v3, 0x2

    aget-byte v4, p0, v3

    aget-byte v3, v2, v3

    if-ne v4, v3, :cond_0

    const/4 v3, 0x3

    aget-byte p0, p0, v3

    aget-byte v2, v2, v3

    if-ne p0, v2, :cond_0

    return v1

    :cond_0
    return v0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 5

    const/4 v0, 0x0

    .line 299
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    :try_start_1
    sget-object v1, Ll/ܰ۟᩻;->֫:[B

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_1

    aget-byte v3, v1, v2

    .line 301
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    and-int/lit16 v3, v3, 0xff

    if-eq v4, v3, :cond_0

    .line 307
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    return v1

    :catchall_0
    move-exception v1

    if-eqz p0, :cond_3

    .line 299
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return v0
.end method
