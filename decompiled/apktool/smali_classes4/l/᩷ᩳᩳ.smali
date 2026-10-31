.class public final Ll/᩷ᩳᩳ;
.super Ljava/lang/Object;
.source "31A6"


# direct methods
.method public static ֫(Ll/ᩴᩳᩳ;J)J
    .locals 5

    .line 116
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v0

    sub-long v0, p1, v0

    const-wide/16 v2, 0x4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 120
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v0

    .line 121
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v1

    sub-long/2addr p1, v1

    if-ltz v0, :cond_0

    int-to-long v0, v0

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    .line 125
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide p0

    add-long/2addr p0, v0

    return-wide p0

    .line 123
    :cond_0
    new-instance p0, Ll/᩷ܳᩳ;

    const-string p1, "Length-prefixed field exceeds its container"

    .line 23
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 123
    throw p0

    .line 118
    :cond_1
    new-instance p0, Ll/᩷ܳᩳ;

    const-string p1, "Length-prefixed field is missing its length"

    .line 23
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 118
    throw p0
.end method

.method public static ֫(Ll/ᩴᩳᩳ;Ll/ܿۖ᩷;)Z
    .locals 10

    .line 170
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 173
    :cond_0
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 174
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v0

    const-wide/16 v2, 0x18

    sub-long/2addr v0, v2

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_5

    const-wide/16 v2, 0xc

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    goto :goto_1

    .line 179
    :cond_1
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_5

    const-wide/16 v4, 0x8

    sub-long v6, v0, v4

    cmp-long v8, v2, v6

    if-lez v8, :cond_2

    goto :goto_1

    .line 183
    :cond_2
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v6

    add-long/2addr v6, v2

    .line 184
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v8

    const v9, 0x7109871a

    if-ne v8, v9, :cond_4

    .line 205
    :try_start_0
    invoke-static {p0, v6, v7}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v0

    .line 206
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    const/high16 v0, 0x1000000

    if-gt v1, v0, :cond_3

    .line 210
    invoke-virtual {p0, v1}, Ll/ᩴᩳᩳ;->֫(I)[B

    move-result-object v0

    .line 187
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܿ()Ll/۠ۖܽ;

    move-result-object v1

    .line 186
    invoke-static {v0, v1, p0, p1}, Ll/᩷ᩳᩳ;->֫([BLl/۠ۖܽ;Ll/ᩴᩳᩳ;Ll/ܿۖ᩷;)Z

    move-result p0

    return p0

    .line 208
    :cond_3
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

    :cond_4
    add-long/2addr v2, v4

    sub-long/2addr v0, v2

    .line 196
    invoke-virtual {p0, v6, v7}, Ll/ᩴᩳᩳ;->֫(J)V

    goto :goto_0

    :catch_0
    :cond_5
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫([BLl/۠ۖܽ;Ll/ᩴᩳᩳ;Ll/ܿۖ᩷;)Z
    .locals 16

    move-object/from16 v0, p1

    .line 215
    invoke-static/range {p0 .. p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 216
    :goto_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    const/4 v4, 0x1

    if-ge v2, v3, :cond_d

    .line 217
    invoke-static {v1}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 218
    invoke-static {v2}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v3

    .line 219
    invoke-static {v2}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 220
    invoke-static {v2}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v2

    .line 317
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 318
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 225
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 226
    invoke-static {v8}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v9

    .line 227
    :cond_0
    invoke-virtual {v9}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_1

    .line 228
    invoke-static {v9}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 229
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v12

    .line 230
    invoke-static {v10}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v10

    .line 231
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v6, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_0

    goto/16 :goto_6

    .line 235
    :cond_1
    invoke-static {v8}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v9

    const-string v10, "X.509"

    .line 236
    invoke-static {v10}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v10

    .line 237
    :goto_1
    invoke-virtual {v9}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 238
    invoke-static {v9}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v12

    .line 239
    new-instance v13, Ljava/io/ByteArrayInputStream;

    invoke-direct {v13, v12}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v10, v13}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v12

    check-cast v12, Ljava/security/cert/X509Certificate;

    .line 240
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 242
    :cond_2
    invoke-static {v8}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 246
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 247
    :cond_3
    :goto_2
    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 248
    invoke-static {v5}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v9

    .line 249
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    .line 250
    invoke-static {v9}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v9

    .line 48
    sget-object v12, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 252
    new-instance v12, Ll/ۜᩳᩳ;

    invoke-direct {v12, v10, v9}, Ll/ۜᩳᩳ;-><init>(I[B)V

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 255
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_6

    .line 261
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۜᩳᩳ;

    .line 262
    iget v10, v9, Ll/ۜᩳᩳ;->֫:I

    invoke-static {v10}, Ll/ܶܽᩳ;->ۧ(I)Ll/ܶܽᩳ;

    move-result-object v10

    .line 264
    :try_start_0
    invoke-virtual {v10}, Ll/ܶܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v12

    new-instance v13, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v13, v2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v12, v13}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v12

    .line 265
    iget-object v9, v9, Ll/ۜᩳᩳ;->ۧ:[B

    invoke-virtual {v10, v12, v3, v9}, Ll/ܶܽᩳ;->֫(Ljava/security/PublicKey;[B[B)Z

    move-result v9

    if-nez v9, :cond_7

    goto/16 :goto_6

    .line 268
    :cond_7
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/security/cert/X509Certificate;

    .line 269
    invoke-virtual {v9}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v9

    invoke-interface {v9}, Ljava/security/Key;->getEncoded()[B

    move-result-object v9

    invoke-static {v2, v9}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v9
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v9, :cond_6

    goto/16 :goto_6

    :catch_0
    nop

    goto :goto_3

    :cond_8
    const-wide/16 v2, 0x0

    .line 279
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v9

    invoke-static {v0, v2, v3, v9, v10}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v2

    .line 280
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->֫()J

    move-result-wide v9

    .line 281
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ۧ()J

    move-result-wide v12

    .line 282
    invoke-static {v0, v9, v10, v12, v13}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v3

    .line 283
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ᩳ()J

    move-result-wide v9

    .line 284
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ۜ()J

    move-result-wide v12

    sub-long/2addr v12, v9

    .line 285
    invoke-static {v0, v9, v10, v12, v13}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v5

    invoke-static {v5}, Ll/ۘܿᩳ;->֫(Ll/֨ܿᩳ;)Ll/ۡܿᩳ;

    move-result-object v5

    .line 288
    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->֫()J

    move-result-wide v9

    invoke-virtual/range {p2 .. p2}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v12

    sub-long/2addr v9, v12

    long-to-int v7, v9

    .line 289
    invoke-virtual {v5}, Ll/ۡܿᩳ;->ᩳ()[B

    move-result-object v9

    .line 290
    invoke-virtual {v5}, Ll/ۡܿᩳ;->ܿ()I

    move-result v10

    add-int/lit8 v10, v10, 0x10

    .line 291
    invoke-static {v10, v9}, Ll/᩺ۧᩳ;->֫(I[B)J

    move-result-wide v12

    int-to-long v14, v7

    sub-long/2addr v12, v14

    .line 293
    invoke-static {v12, v13, v10, v9}, Ll/᩺ۧᩳ;->ۧ(JI[B)V

    .line 298
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۜᩳᩳ;

    .line 299
    iget v10, v9, Ll/ۜᩳᩳ;->֫:I

    invoke-static {v10}, Ll/ܶܽᩳ;->ۧ(I)Ll/ܶܽᩳ;

    move-result-object v10

    if-eqz v8, :cond_9

    const/4 v8, 0x3

    new-array v12, v8, [Ll/֡ܿᩳ;

    aput-object v2, v12, v11

    aput-object v3, v12, v4

    const/4 v13, 0x2

    aput-object v5, v12, v13

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v8, :cond_9

    .line 35
    aget-object v14, v12, v13

    .line 36
    invoke-interface {v14}, Ll/֡ܿᩳ;->reset()V

    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_9
    move-object/from16 v8, p3

    .line 302
    invoke-virtual {v10, v2, v3, v5, v8}, Ll/ܶܽᩳ;->֫(Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/ܿۖ᩷;)V

    .line 303
    invoke-interface/range {p3 .. p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_6

    .line 212
    :cond_a
    iget-object v10, v10, Ll/ܶܽᩳ;->֫:[B

    .line 306
    iget v9, v9, Ll/ۜᩳᩳ;->֫:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    .line 307
    invoke-static {v10, v9}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v9

    if-nez v9, :cond_b

    :goto_6
    return v11

    :cond_b
    const/4 v9, 0x1

    const/4 v8, 0x1

    goto :goto_4

    :cond_c
    move-object/from16 v8, p3

    goto/16 :goto_0

    :cond_d
    return v4
.end method

.method public static ֫(Ll/ᩴᩳᩳ;J[B)[B
    .locals 5

    .line 90
    invoke-static {p0, p1, p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide p1

    .line 91
    invoke-static {p0, p1, p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide p1

    .line 92
    invoke-static {p0, p1, p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v0

    .line 95
    invoke-static {p0, v0, v1}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 96
    invoke-static {p0, v0, v1}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v2

    .line 97
    invoke-static {p0, v2, v3, p3}, Ll/᩷ᩳᩳ;->ۧ(Ll/ᩴᩳᩳ;J[B)[B

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 101
    :cond_0
    invoke-static {p0, v0, v1}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    .line 103
    invoke-virtual {p0, v0, v1}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 105
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v0

    sub-long v0, p1, v0

    const-wide/16 v2, 0x8

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 108
    invoke-static {p0, p1, p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 109
    invoke-static {p0, p1, p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/ᩴᩳᩳ;->֫(J)V

    return-object p3

    .line 106
    :cond_1
    new-instance p0, Ll/᩷ܳᩳ;

    const-string p1, "V2 signer is missing signatures or public key"

    .line 23
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 106
    throw p0
.end method

.method public static ֫(Ll/ᩴᩳᩳ;[B)[B
    .locals 10

    .line 57
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 61
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v0

    const-wide/16 v2, 0x18

    sub-long/2addr v0, v2

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_4

    const-wide/16 v2, 0xc

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_4

    const-wide/16 v4, 0x8

    sub-long v6, v0, v4

    cmp-long v8, v2, v6

    if-lez v8, :cond_2

    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v6

    add-long/2addr v6, v2

    .line 71
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v8

    const v9, 0x7109871a

    if-ne v8, v9, :cond_3

    .line 73
    :try_start_0
    invoke-static {p0, v6, v7, p1}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J[B)[B

    move-result-object p0
    :try_end_0
    .catch Ll/᩷ܳᩳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_3
    add-long/2addr v2, v4

    sub-long/2addr v0, v2

    .line 79
    invoke-virtual {p0, v6, v7}, Ll/ᩴᩳᩳ;->֫(J)V

    goto :goto_0

    :catch_0
    :cond_4
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ᩴᩳᩳ;J[B)[B
    .locals 6

    .line 134
    :try_start_0
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v0

    sub-long v0, p1, v0

    const-wide/32 v2, 0x400000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_8

    const/4 v0, 0x0

    move-object v1, v0

    .line 140
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-gez v4, :cond_6

    .line 141
    invoke-static {p0, p1, p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;J)J

    move-result-wide v2

    .line 142
    invoke-virtual {p0}, Ll/ᩴᩳᩳ;->᩷()J

    move-result-wide v4

    sub-long v4, v2, v4

    long-to-int v5, v4

    if-eqz v5, :cond_5

    const/high16 v4, 0x100000

    if-gt v5, v4, :cond_4

    if-eqz v1, :cond_2

    if-eqz p3, :cond_1

    .line 149
    array-length v4, p3

    if-ne v4, v5, :cond_1

    goto :goto_1

    .line 160
    :cond_1
    invoke-virtual {p0, v2, v3}, Ll/ᩴᩳᩳ;->֫(J)V

    goto :goto_0

    .line 152
    :cond_2
    :goto_1
    invoke-virtual {p0, v5}, Ll/ᩴᩳᩳ;->֫(I)[B

    move-result-object v2

    if-nez v1, :cond_3

    move-object v1, v2

    :cond_3
    if-eqz p3, :cond_0

    .line 156
    invoke-static {p3, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, v2

    goto :goto_0

    .line 147
    :cond_4
    new-instance p3, Ll/᩷ܳᩳ;

    const-string v0, "Signing certificate exceeds safety limit"

    .line 23
    invoke-direct {p3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 147
    throw p3

    .line 144
    :cond_5
    new-instance p3, Ll/᩷ܳᩳ;

    const-string v0, "Signing certificate is empty"

    .line 23
    invoke-direct {p3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 144
    throw p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    move-object v0, v1

    .line 165
    :goto_2
    invoke-virtual {p0, p1, p2}, Ll/ᩴᩳᩳ;->֫(J)V

    return-object v0

    .line 136
    :cond_8
    :try_start_1
    new-instance p3, Ll/᩷ܳᩳ;

    const-string v0, "Signing certificate sequence exceeds safety limit"

    .line 23
    invoke-direct {p3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 136
    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p3

    .line 165
    invoke-virtual {p0, p1, p2}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 166
    throw p3
.end method
