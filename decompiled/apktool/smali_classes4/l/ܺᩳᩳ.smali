.class public final Ll/ܺᩳᩳ;
.super Ljava/lang/Object;
.source "PB28"


# direct methods
.method public static ֫(Ll/ᩴᩳᩳ;J[B)Ll/ۤۤ;
    .locals 21

    move-object/from16 v0, p0

    .line 91
    invoke-static/range {p0 .. p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v1

    .line 92
    invoke-static {v0, v1, v2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v1

    .line 93
    invoke-static {v0, v1, v2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v3

    .line 96
    invoke-static {v0, v3, v4}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 97
    invoke-static {v0, v3, v4}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v5

    move-object/from16 v7, p3

    .line 98
    invoke-static {v0, v5, v6, v7}, Ll/᩷ᩳᩳ;->ۧ(Ll/ᩴᩳᩳ;J[B)[B

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    return-object v6

    .line 104
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v6

    sub-long v6, v3, v6

    const-wide/16 v8, 0xc

    cmp-long v10, v6, v8

    if-ltz v10, :cond_b

    .line 107
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v6

    .line 108
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v7

    .line 109
    invoke-static {v0, v3, v4}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v8

    .line 134
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    .line 171
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v14

    move-object/from16 p1, v5

    const-string v5, "V3 signing attribute is missing its ID"

    move/from16 p2, v7

    const v7, 0x3ba06f8c

    const-wide/16 v16, 0x4

    cmp-long v18, v14, v8

    if-gez v18, :cond_4

    .line 172
    invoke-static {v0, v8, v9}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v14

    .line 174
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v18

    sub-long v18, v14, v18

    cmp-long v20, v18, v16

    if-ltz v20, :cond_3

    .line 177
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v5

    if-ne v5, v7, :cond_2

    .line 179
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v16

    sub-long v16, v14, v16

    add-long v16, v16, v12

    const-wide/32 v12, 0x400000

    cmp-long v5, v16, v12

    if-gtz v5, :cond_1

    move-wide/from16 v12, v16

    goto :goto_1

    .line 181
    :cond_1
    new-instance v0, Ll/᩷ܳᩳ;

    const-string v1, "V3 proof-of-rotation data exceeds safety limit"

    .line 23
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 181
    throw v0

    .line 185
    :cond_2
    :goto_1
    invoke-virtual {v0, v14, v15}, Ll/ᩴᩳᩳ;->֫(J)V

    move-object/from16 v5, p1

    move/from16 v7, p2

    goto :goto_0

    .line 175
    :cond_3
    new-instance v0, Ll/᩷ܳᩳ;

    .line 23
    invoke-direct {v0, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 175
    throw v0

    .line 136
    :cond_4
    invoke-virtual {v0, v10, v11}, Ll/ᩴᩳᩳ;->֫(J)V

    const/4 v10, 0x0

    .line 139
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v11

    cmp-long v13, v11, v8

    if-gez v13, :cond_8

    .line 140
    invoke-static {v0, v8, v9}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v11

    .line 142
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v13

    sub-long v13, v11, v13

    cmp-long v15, v13, v16

    if-ltz v15, :cond_7

    .line 145
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v13

    if-eq v13, v7, :cond_5

    .line 147
    invoke-virtual {v0, v11, v12}, Ll/ᩴᩳᩳ;->֫(J)V

    goto :goto_2

    .line 151
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v13

    sub-long/2addr v11, v13

    long-to-int v12, v11

    .line 152
    invoke-virtual {v0, v12}, Ll/ᩴᩳᩳ;->֫(I)[B

    move-result-object v11

    .line 154
    :try_start_0
    invoke-static {v11}, Ll/᩸ܽᩳ;->֫([B)Ll/᩸ܽᩳ;

    move-result-object v11

    if-nez v10, :cond_6

    move-object v10, v11

    goto :goto_2

    :cond_6
    const/4 v12, 0x2

    new-array v12, v12, [Ll/᩸ܽᩳ;

    const/4 v13, 0x0

    aput-object v10, v12, v13

    const/4 v10, 0x1

    aput-object v11, v12, v10

    .line 157
    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Ll/᩸ܽᩳ;->֫(Ljava/util/List;)Ll/᩸ܽᩳ;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 159
    new-instance v1, Ll/᩷ܳᩳ;

    const-string v2, "Failed to parse V3 signing certificate lineage"

    .line 27
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    throw v1

    .line 143
    :cond_7
    new-instance v0, Ll/᩷ܳᩳ;

    .line 23
    invoke-direct {v0, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 143
    throw v0

    .line 114
    :cond_8
    invoke-virtual {v0, v3, v4}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 116
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v3

    sub-long v3, v1, v3

    const-wide/16 v7, 0x10

    cmp-long v5, v3, v7

    if-ltz v5, :cond_a

    .line 119
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v3

    .line 120
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v4

    if-ne v6, v3, :cond_9

    move/from16 v3, p2

    if-ne v3, v4, :cond_9

    .line 124
    invoke-static {v0, v1, v2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 125
    invoke-static {v0, v1, v2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 84
    new-instance v0, Ll/ۤۤ;

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v10}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 122
    :cond_9
    new-instance v0, Ll/᩷ܳᩳ;

    const-string v1, "V3 signer SDK range does not match signed data"

    .line 23
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 122
    throw v0

    .line 117
    :cond_a
    new-instance v0, Ll/᩷ܳᩳ;

    const-string v1, "V3 signer is missing SDK range, signatures, or public key"

    .line 23
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 117
    throw v0

    .line 105
    :cond_b
    new-instance v0, Ll/᩷ܳᩳ;

    const-string v1, "V3 signed data is missing SDK range or attributes"

    .line 23
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 105
    throw v0
.end method

.method public static ֫(Ll/ᩴᩳᩳ;Z[B)Ll/ۤۤ;
    .locals 9

    .line 56
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 59
    :cond_0
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 60
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v0

    const-wide/16 v2, 0x18

    sub-long/2addr v0, v2

    if-eqz p1, :cond_1

    const p1, 0x1b93ad61

    goto :goto_0

    :cond_1
    const p1, -0xfac9740

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_5

    const-wide/16 v2, 0xc

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    goto :goto_1

    .line 66
    :cond_2
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_5

    const-wide/16 v4, 0x8

    sub-long v6, v0, v4

    cmp-long v8, v2, v6

    if-lez v8, :cond_3

    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v6

    add-long/2addr v6, v2

    .line 71
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v8

    if-ne v8, p1, :cond_4

    .line 74
    :try_start_0
    invoke-static {p0, v6, v7, p2}, Ll/ܺᩳᩳ;->֫(Ll/ᩴᩳᩳ;J[B)Ll/ۤۤ;

    move-result-object p0
    :try_end_0
    .catch Ll/᩷ܳᩳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_4
    add-long/2addr v2, v4

    sub-long/2addr v0, v2

    .line 80
    invoke-virtual {p0, v6, v7}, Ll/ᩴᩳᩳ;->֫(J)V

    goto :goto_0

    :catch_0
    :cond_5
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ᩴᩳᩳ;ZLl/ܿۖ᩷;)Z
    .locals 9

    .line 190
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 193
    :cond_0
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 194
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v0

    const-wide/16 v2, 0x18

    sub-long/2addr v0, v2

    if-eqz p1, :cond_1

    const p1, 0x1b93ad61

    goto :goto_0

    :cond_1
    const p1, -0xfac9740

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_6

    const-wide/16 v2, 0xc

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    goto :goto_1

    .line 200
    :cond_2
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_6

    const-wide/16 v4, 0x8

    sub-long v6, v0, v4

    cmp-long v8, v2, v6

    if-lez v8, :cond_3

    goto :goto_1

    .line 204
    :cond_3
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v6

    add-long/2addr v6, v2

    .line 205
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v8

    if-ne v8, p1, :cond_5

    :try_start_0
    invoke-static {p0, v6, v7}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v0

    .line 206
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int p1, v0

    const/high16 v0, 0x1000000

    if-gt p1, v0, :cond_4

    .line 210
    invoke-virtual {p0, p1}, Ll/ᩴᩳᩳ;->֫(I)[B

    move-result-object p1

    .line 208
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܿ()Ll/۠ۖܽ;

    move-result-object v0

    .line 207
    invoke-static {p1, v0, p0, p2}, Ll/ܺᩳᩳ;->֫([BLl/۠ۖܽ;Ll/ᩴᩳᩳ;Ll/ܿۖ᩷;)Z

    move-result p0

    return p0

    .line 208
    :cond_4
    new-instance p0, Ll/᩷ܳᩳ;

    const-string p1, "Signer sequence exceeds safety limit"

    .line 23
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 208
    throw p0
    :try_end_0
    .catch Ll/᩷ܳᩳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    add-long/2addr v2, v4

    sub-long/2addr v0, v2

    .line 217
    invoke-virtual {p0, v6, v7}, Ll/ᩴᩳᩳ;->֫(J)V

    goto :goto_0

    :catch_0
    :cond_6
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫([BLl/۠ۖܽ;Ll/ᩴᩳᩳ;Ll/ܿۖ᩷;)Z
    .locals 16

    move-object/from16 v0, p1

    .line 225
    invoke-static/range {p0 .. p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 226
    :goto_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    const/4 v4, 0x1

    if-ge v2, v3, :cond_f

    .line 227
    invoke-static {v1}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 228
    invoke-static {v2}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v3

    .line 229
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    .line 230
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6

    .line 231
    invoke-static {v2}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 232
    invoke-static {v2}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v2

    .line 334
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 335
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 237
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v10

    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 238
    invoke-static {v10}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v11

    .line 239
    :cond_0
    invoke-virtual {v11}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_1

    .line 240
    invoke-static {v11}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v12

    .line 241
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v14

    .line 242
    invoke-static {v12}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v12

    .line 243
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v8, v14, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_0

    goto/16 :goto_6

    .line 247
    :cond_1
    invoke-static {v10}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v11

    const-string v12, "X.509"

    .line 248
    invoke-static {v12}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v12

    .line 249
    :goto_1
    invoke-virtual {v11}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v14

    if-eqz v14, :cond_2

    .line 250
    invoke-static {v11}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v14

    .line 251
    new-instance v15, Ljava/io/ByteArrayInputStream;

    invoke-direct {v15, v14}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v12, v15}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v14

    check-cast v14, Ljava/security/cert/X509Certificate;

    .line 252
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 254
    :cond_2
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    .line 255
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v12

    .line 256
    invoke-static {v10}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    if-ne v11, v5, :cond_e

    if-eq v12, v6, :cond_3

    goto/16 :goto_6

    .line 263
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 264
    :cond_4
    :goto_2
    invoke-virtual {v7}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 265
    invoke-static {v7}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 266
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    .line 267
    invoke-static {v6}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v6

    .line 48
    sget-object v11, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 269
    new-instance v11, Ll/ۡᩳᩳ;

    invoke-direct {v11, v10, v6}, Ll/ۡᩳᩳ;-><init>(I[B)V

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 272
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    goto/16 :goto_6

    .line 278
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_7
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۡᩳᩳ;

    .line 279
    invoke-static {v7}, Ll/ۡᩳᩳ;->֫(Ll/ۡᩳᩳ;)I

    move-result v10

    invoke-static {v10}, Ll/ܶܽᩳ;->ۧ(I)Ll/ܶܽᩳ;

    move-result-object v10

    .line 281
    :try_start_0
    invoke-virtual {v10}, Ll/ܶܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v11

    new-instance v12, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v12, v2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v11, v12}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v11

    .line 282
    invoke-static {v7}, Ll/ۡᩳᩳ;->ۧ(Ll/ۡᩳᩳ;)[B

    move-result-object v7

    invoke-virtual {v10, v11, v3, v7}, Ll/ܶܽᩳ;->֫(Ljava/security/PublicKey;[B[B)Z

    move-result v7

    if-nez v7, :cond_8

    goto/16 :goto_6

    .line 285
    :cond_8
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/security/cert/X509Certificate;

    .line 286
    invoke-virtual {v7}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v7

    invoke-interface {v7}, Ljava/security/Key;->getEncoded()[B

    move-result-object v7

    invoke-static {v2, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v7, :cond_7

    goto/16 :goto_6

    :catch_0
    nop

    goto :goto_3

    :cond_9
    const-wide/16 v2, 0x0

    .line 296
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v6

    invoke-static {v0, v2, v3, v6, v7}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v2

    .line 297
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->֫()J

    move-result-wide v6

    .line 298
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ۧ()J

    move-result-wide v9

    .line 299
    invoke-static {v0, v6, v7, v9, v10}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v3

    .line 300
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ᩳ()J

    move-result-wide v6

    .line 301
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ۜ()J

    move-result-wide v9

    sub-long/2addr v9, v6

    .line 302
    invoke-static {v0, v6, v7, v9, v10}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v6

    invoke-static {v6}, Ll/ۘܿᩳ;->֫(Ll/֨ܿᩳ;)Ll/ۡܿᩳ;

    move-result-object v6

    .line 305
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->֫()J

    move-result-wide v9

    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v11

    sub-long/2addr v9, v11

    long-to-int v7, v9

    .line 306
    invoke-virtual {v6}, Ll/ۡܿᩳ;->ᩳ()[B

    move-result-object v9

    .line 307
    invoke-virtual {v6}, Ll/ۡܿᩳ;->ܿ()I

    move-result v10

    add-int/lit8 v10, v10, 0x10

    .line 308
    invoke-static {v10, v9}, Ll/᩺ۧᩳ;->֫(I[B)J

    move-result-wide v11

    int-to-long v14, v7

    sub-long/2addr v11, v14

    .line 310
    invoke-static {v11, v12, v10, v9}, Ll/᩺ۧᩳ;->ۧ(JI[B)V

    .line 315
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۡᩳᩳ;

    .line 316
    invoke-static {v9}, Ll/ۡᩳᩳ;->֫(Ll/ۡᩳᩳ;)I

    move-result v10

    invoke-static {v10}, Ll/ܶܽᩳ;->ۧ(I)Ll/ܶܽᩳ;

    move-result-object v10

    if-eqz v7, :cond_a

    const/4 v7, 0x3

    new-array v11, v7, [Ll/֡ܿᩳ;

    aput-object v2, v11, v13

    aput-object v3, v11, v4

    const/4 v12, 0x2

    aput-object v6, v11, v12

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v7, :cond_a

    .line 35
    aget-object v14, v11, v12

    .line 36
    invoke-interface {v14}, Ll/֡ܿᩳ;->reset()V

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_a
    move-object/from16 v7, p3

    .line 319
    invoke-virtual {v10, v2, v3, v6, v7}, Ll/ܶܽᩳ;->֫(Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/ܿۖ᩷;)V

    .line 320
    invoke-interface/range {p3 .. p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v11

    if-eqz v11, :cond_b

    goto :goto_6

    .line 212
    :cond_b
    iget-object v10, v10, Ll/ܶܽᩳ;->֫:[B

    .line 323
    invoke-static {v9}, Ll/ۡᩳᩳ;->֫(Ll/ۡᩳᩳ;)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    .line 324
    invoke-static {v10, v9}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_6

    :cond_c
    const/4 v9, 0x1

    const/4 v7, 0x1

    goto :goto_4

    :cond_d
    move-object/from16 v7, p3

    goto/16 :goto_0

    :cond_e
    :goto_6
    return v13

    :cond_f
    return v4
.end method
