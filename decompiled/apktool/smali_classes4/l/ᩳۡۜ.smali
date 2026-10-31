.class public final Ll/ᩳۡۜ;
.super Ljava/lang/Object;
.source "R6YN"


# direct methods
.method public static ֫(Ljava/io/InputStream;JILjava/security/MessageDigest;)Ll/ܽۡۜ;
    .locals 19

    move-wide/from16 v1, p1

    move/from16 v0, p3

    int-to-long v3, v0

    const-string v5, "byteOffset"

    .line 36
    invoke-static {v5, v1, v2, v3, v4}, Ll/᩸ۡۜ;->֫(Ljava/lang/String;JJ)J

    move-result-wide v3

    const/high16 v5, 0x10000

    new-array v5, v5, [B

    .line 38
    new-array v0, v0, [B

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p0

    .line 42
    :goto_0
    invoke-virtual {v10, v5}, Ljava/io/InputStream;->read([B)I

    move-result v11

    if-nez v11, :cond_1

    .line 45
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->read()I

    move-result v11

    if-gez v11, :cond_0

    goto :goto_1

    :cond_0
    int-to-byte v11, v11

    .line 49
    aput-byte v11, v5, v6

    const/4 v11, 0x1

    goto :goto_2

    :cond_1
    if-gez v11, :cond_2

    .line 66
    :goto_1
    new-array v10, v9, [B

    .line 67
    invoke-static {v0, v6, v10, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    invoke-virtual/range {p4 .. p4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x10

    invoke-virtual {v0, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 69
    new-instance v9, Ll/ܽۡۜ;

    move-object v0, v9

    move-wide/from16 v1, p1

    move-wide v3, v7

    move-object v6, v10

    invoke-direct/range {v0 .. v6}, Ll/ܽۡۜ;-><init>(JJLjava/lang/String;[B)V

    return-object v9

    :cond_2
    :goto_2
    int-to-long v12, v11

    const-string v14, "totalBytes"

    .line 54
    invoke-static {v14, v7, v8, v12, v13}, Ll/᩸ۡۜ;->֫(Ljava/lang/String;JJ)J

    move-result-wide v12

    move-object/from16 v14, p4

    .line 55
    invoke-virtual {v14, v5, v6, v11}, Ljava/security/MessageDigest;->update([BII)V

    .line 56
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v15

    .line 57
    invoke-static {v12, v13, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v17

    cmp-long v6, v15, v17

    if-gez v6, :cond_3

    sub-long v6, v15, v7

    long-to-int v7, v6

    sub-long v1, v17, v15

    long-to-int v2, v1

    .line 61
    invoke-static {v5, v7, v0, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v9, v2

    :cond_3
    const/4 v6, 0x0

    move-wide/from16 v1, p1

    move-wide v7, v12

    goto :goto_0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;JI)Ll/ܽۡۜ;
    .locals 1

    .line 26
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    .line 27
    :try_start_0
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-static {p0, p1, p2, p3, v0}, Ll/ᩳۡۜ;->֫(Ljava/io/InputStream;JILjava/security/MessageDigest;)Ll/ܽۡۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_0

    .line 26
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
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
