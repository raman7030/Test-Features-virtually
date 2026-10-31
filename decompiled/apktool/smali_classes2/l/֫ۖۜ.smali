.class public final Ll/֫ۖۜ;
.super Ljava/lang/Object;
.source "Y6XM"


# direct methods
.method public static ֫(Ljava/io/InputStream;[B)I
    .locals 3

    const/4 v0, 0x0

    .line 182
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_3

    .line 183
    array-length v1, p1

    sub-int/2addr v1, v0

    invoke-virtual {p0, p1, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-gez v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_2

    .line 188
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-gez v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v0, 0x1

    int-to-byte v1, v1

    .line 192
    aput-byte v1, p1, v0

    move v0, v2

    goto :goto_0

    :cond_2
    add-int/2addr v0, v1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/lang/String;JJIILjava/security/MessageDigest;)Ll/۟ܺۜ;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p8

    const v2, 0x8000

    new-array v3, v2, [B

    .line 85
    invoke-static {v0, v3}, Ll/֫ۖۜ;->֫(Ljava/io/InputStream;[B)I

    move-result v4

    const/4 v5, 0x0

    .line 86
    invoke-virtual {v1, v3, v5, v4}, Ljava/security/MessageDigest;->update([BII)V

    if-ne v4, v2, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    :goto_0
    move-object/from16 v2, p1

    .line 90
    invoke-static {v2, v3}, Ll/ܳۘۜ;->֫(Ljava/lang/String;[B)Ll/ܿۘۜ;

    move-result-object v2

    .line 92
    new-instance v6, Ljava/io/ByteArrayInputStream;

    iget v7, v2, Ll/ܿۘۜ;->ۧ:I

    sub-int v8, v4, v7

    invoke-direct {v6, v3, v7, v8}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 94
    new-instance v3, Ll/ۤܺۜ;

    invoke-direct {v3, v0}, Ll/ۤܺۜ;-><init>(Ljava/io/InputStream;)V

    .line 95
    new-instance v0, Ljava/security/DigestInputStream;

    invoke-direct {v0, v3, v1}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V

    .line 97
    new-instance v7, Ljava/io/InputStreamReader;

    new-instance v8, Ljava/io/SequenceInputStream;

    invoke-direct {v8, v6, v0}, Ljava/io/SequenceInputStream;-><init>(Ljava/io/InputStream;Ljava/io/InputStream;)V

    iget-object v0, v2, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    .line 98
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    sget-object v6, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 99
    invoke-virtual {v0, v6}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    .line 100
    invoke-virtual {v0, v6}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    invoke-direct {v7, v8, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/CharsetDecoder;)V

    .line 101
    :try_start_0
    new-instance v0, Ll/ܰܺۜ;

    move-object v9, v0

    move/from16 v10, p6

    move/from16 v11, p7

    move-wide/from16 v12, p2

    move-wide/from16 v14, p4

    invoke-direct/range {v9 .. v15}, Ll/ܰܺۜ;-><init>(IIJJ)V

    .line 102
    new-instance v6, Ll/۫ܺۜ;

    invoke-direct {v6, v7}, Ll/۫ܺۜ;-><init>(Ljava/io/InputStreamReader;)V

    const/4 v8, 0x1

    .line 103
    invoke-static {v6, v0, v8}, Ll/֫ۖۜ;->֫(Ll/۫ܺۜ;Ll/ܰܺۜ;Z)V

    .line 104
    invoke-static {v0}, Ll/ܰܺۜ;->֫(Ll/ܰܺۜ;)Ll/ۨܺۜ;

    move-result-object v0

    .line 105
    new-instance v6, Ll/۟ܺۜ;

    iget-object v9, v0, Ll/ۨܺۜ;->᩷:Ljava/lang/String;

    iget-object v10, v2, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    iget-wide v13, v0, Ll/ۨܺۜ;->ܿ:J

    iget-wide v11, v0, Ll/ۨܺۜ;->ᩳ:J

    iget v2, v0, Ll/ۨܺۜ;->ۜ:I

    iget v15, v0, Ll/ۨܺۜ;->᩻:I

    iget-boolean v8, v0, Ll/ۨܺۜ;->ܽ:Z

    .line 108
    invoke-virtual/range {p8 .. p8}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    move/from16 v16, v8

    const/16 v8, 0x10

    invoke-virtual {v1, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    int-to-long v4, v4

    move-wide/from16 v17, v11

    iget-wide v11, v3, Ll/ۤܺۜ;->᩸:J

    add-long v23, v4, v11

    iget-boolean v1, v0, Ll/ۨܺۜ;->ܳ:Z

    iget-wide v3, v0, Ll/ۨܺۜ;->ۧ:J

    iget-wide v11, v0, Ll/ۨܺۜ;->֫:J

    move/from16 v0, v16

    move-object v8, v6

    move-wide/from16 v28, v11

    move-wide/from16 v11, p2

    move-wide/from16 v19, v13

    move-wide/from16 v13, p4

    move v5, v15

    move-wide/from16 v15, v19

    move/from16 v19, v2

    move/from16 v20, v5

    move/from16 v21, v0

    move/from16 v25, v1

    move-wide/from16 v26, v3

    invoke-direct/range {v8 .. v29}, Ll/۟ܺۜ;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJIIZLjava/lang/String;JZJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    invoke-virtual {v7}, Ljava/io/Reader;->close()V

    return-object v6

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 97
    :try_start_1
    invoke-virtual {v7}, Ljava/io/Reader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;JJII)Ll/۟ܺۜ;
    .locals 11

    .line 36
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v10

    .line 38
    :try_start_0
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v9

    move-object v1, v10

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    .line 37
    invoke-static/range {v1 .. v9}, Ll/֫ۖۜ;->֫(Ljava/io/InputStream;Ljava/lang/String;JJIILjava/security/MessageDigest;)Ll/۟ܺۜ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v10, :cond_0

    .line 39
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    :cond_0
    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v10, :cond_1

    .line 36
    :try_start_1
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/lang/String;JJII)Ll/᩺ܺۜ;
    .locals 12

    move-object v1, p0

    const v0, 0x8000

    :try_start_0
    new-array v2, v0, [B

    .line 51
    invoke-static {p0, v2}, Ll/֫ۖۜ;->֫(Ljava/io/InputStream;[B)I

    move-result v3

    if-ne v3, v0, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    :goto_0
    move-object v0, p1

    .line 55
    invoke-static {p1, v2}, Ll/ܳۘۜ;->֫(Ljava/lang/String;[B)Ll/ܿۘۜ;

    move-result-object v0

    .line 56
    new-instance v4, Ljava/io/ByteArrayInputStream;

    iget v5, v0, Ll/ܿۘۜ;->ۧ:I

    sub-int/2addr v3, v5

    invoke-direct {v4, v2, v5, v3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 58
    new-instance v2, Ljava/io/InputStreamReader;

    new-instance v3, Ljava/io/SequenceInputStream;

    invoke-direct {v3, v4, p0}, Ljava/io/SequenceInputStream;-><init>(Ljava/io/InputStream;Ljava/io/InputStream;)V

    iget-object v4, v0, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    .line 59
    invoke-virtual {v4}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    sget-object v5, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 60
    invoke-virtual {v4, v5}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    .line 61
    invoke-virtual {v4, v5}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/CharsetDecoder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 62
    :try_start_1
    new-instance v3, Ll/ܰܺۜ;

    move-object v5, v3

    move/from16 v6, p6

    move/from16 v7, p7

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Ll/ܰܺۜ;-><init>(IIJJ)V

    .line 63
    new-instance v4, Ll/۫ܺۜ;

    invoke-direct {v4, v2}, Ll/۫ܺۜ;-><init>(Ljava/io/InputStreamReader;)V

    const/4 v5, 0x0

    invoke-static {v4, v3, v5}, Ll/֫ۖۜ;->֫(Ll/۫ܺۜ;Ll/ܰܺۜ;Z)V

    .line 64
    new-instance v4, Ll/᩺ܺۜ;

    invoke-static {v3}, Ll/ܰܺۜ;->֫(Ll/ܰܺۜ;)Ll/ۨܺۜ;

    move-result-object v3

    iget-object v0, v0, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    invoke-direct {v4, v3, v0}, Ll/᩺ܺۜ;-><init>(Ll/ۨܺۜ;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :try_start_2
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v4

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 58
    :try_start_3
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 49
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
.end method

.method public static ֫(Ll/۫ܺۜ;Ll/ܰܺۜ;Z)V
    .locals 3

    const/4 v0, -0x1

    :cond_0
    if-ltz v0, :cond_1

    goto :goto_0

    .line 119
    :cond_1
    invoke-static {p0}, Ll/۫ܺۜ;->ۧ(Ll/۫ܺۜ;)I

    move-result v0

    :goto_0
    if-gez v0, :cond_2

    goto :goto_3

    :cond_2
    const/16 v1, 0xd

    const/16 v2, 0xa

    if-ne v0, v1, :cond_4

    .line 123
    invoke-static {p0}, Ll/۫ܺۜ;->ۧ(Ll/۫ܺۜ;)I

    move-result v0

    if-ne v0, v2, :cond_3

    const-string v0, "\r\n"

    .line 126
    invoke-static {p1, v0}, Ll/ܰܺۜ;->֫(Ll/ܰܺۜ;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v1, "\r"

    .line 129
    invoke-static {p1, v1}, Ll/ܰܺۜ;->֫(Ll/ܰܺۜ;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    if-ne v0, v2, :cond_5

    const-string v0, "\n"

    .line 134
    invoke-static {p1, v0}, Ll/ܰܺۜ;->֫(Ll/ܰܺۜ;Ljava/lang/String;)V

    goto :goto_1

    .line 137
    :cond_5
    invoke-static {p1, v0}, Ll/ܰܺۜ;->֫(Ll/ܰܺۜ;I)V

    :goto_1
    const/4 v0, -0x1

    .line 139
    :goto_2
    invoke-static {p1}, Ll/ܰܺۜ;->ۧ(Ll/ܰܺۜ;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p2, :cond_6

    .line 141
    invoke-static {p0}, Ll/۫ܺۜ;->֫(Ll/۫ܺۜ;)V

    :cond_6
    :goto_3
    return-void
.end method
