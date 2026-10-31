.class public final Ll/ܿۚۢ;
.super Ljava/lang/Object;
.source "S7BH"


# direct methods
.method public static ֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 58
    check-cast p0, Ll/ܺܳܳ;

    invoke-virtual {p0}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 59
    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    .line 66
    :cond_1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ܺܳܳ;J)Ll/ᩳۚۢ;
    .locals 16

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_b

    .line 209
    invoke-virtual/range {p0 .. p0}, Ll/ܺܳܳ;->ܿ()Ljava/io/InputStream;

    move-result-object v3

    if-nez v3, :cond_1

    if-gtz v2, :cond_0

    goto :goto_0

    .line 211
    :cond_0
    new-instance v0, Ll/ܽۚۢ;

    .line 339
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 211
    throw v0

    :cond_1
    :goto_0
    :try_start_0
    const-string v2, "SHA-256"

    .line 294
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    .line 214
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    sget-object v5, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 215
    invoke-virtual {v4, v5}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    .line 216
    invoke-virtual {v4, v5}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    .line 217
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x2000

    new-array v7, v6, [B

    const/16 v8, 0x2004

    .line 219
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 220
    invoke-static {v6}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v9

    move-wide/from16 v10, p1

    :goto_1
    cmp-long v12, v10, v0

    if-lez v12, :cond_6

    int-to-long v12, v6

    .line 224
    :try_start_1
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v13, v12

    const/4 v12, 0x0

    .line 225
    invoke-virtual {v3, v7, v12, v13}, Ljava/io/InputStream;->read([BII)I

    move-result v13

    if-ltz v13, :cond_5

    if-eqz v13, :cond_4

    .line 232
    invoke-virtual {v2, v7, v12, v13}, Ljava/security/MessageDigest;->update([BII)V

    .line 233
    invoke-virtual {v8, v7, v12, v13}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 234
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 256
    :goto_2
    invoke-virtual {v4, v8, v9, v12}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v14

    .line 287
    invoke-virtual {v9}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    .line 288
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 289
    invoke-virtual {v9}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    .line 258
    invoke-virtual {v14}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result v15

    if-eqz v15, :cond_2

    goto :goto_2

    .line 261
    :cond_2
    invoke-virtual {v14}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v12

    if-eqz v12, :cond_3

    .line 262
    invoke-virtual {v14}, Ljava/nio/charset/CoderResult;->throwException()V

    .line 236
    :cond_3
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    int-to-long v12, v13

    sub-long/2addr v10, v12

    goto :goto_1

    .line 230
    :cond_4
    new-instance v0, Ll/ܽۚۢ;

    .line 339
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 230
    throw v0

    .line 227
    :cond_5
    new-instance v0, Ll/ܽۚۢ;

    .line 339
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 227
    throw v0

    .line 239
    :cond_6
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :goto_3
    const/4 v0, 0x1

    .line 256
    invoke-virtual {v4, v8, v9, v0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v0

    .line 287
    invoke-virtual {v9}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    .line 288
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 289
    invoke-virtual {v9}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    .line 258
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_3

    .line 261
    :cond_7
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 262
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->throwException()V

    .line 274
    :cond_8
    :goto_4
    invoke-virtual {v4, v9}, Ljava/nio/charset/CharsetDecoder;->flush(Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;

    move-result-object v0

    .line 287
    invoke-virtual {v9}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    .line 288
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 289
    invoke-virtual {v9}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    .line 276
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_4

    .line 279
    :cond_9
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 280
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->throwException()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 245
    :cond_a
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    .line 246
    invoke-virtual {v1, v0}, Ll/ܺܳܳ;->֫(Ljava/lang/String;)V

    .line 247
    new-instance v1, Ll/ᩳۚۢ;

    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ll/ᩳۚۢ;-><init>(Ljava/lang/String;[B)V

    return-object v1

    :catch_0
    move-exception v0

    .line 243
    new-instance v1, Ll/ܽۚۢ;

    .line 346
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 243
    throw v1

    :catch_1
    move-exception v0

    .line 296
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 207
    :cond_b
    new-instance v0, Ll/ܽۚۢ;

    .line 339
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 207
    throw v0
.end method

.method public static ֫(Ll/ܺܳܳ;)Z
    .locals 6

    .line 84
    invoke-static {p0}, Ll/ܿۚۢ;->ۧ(Ll/ܺܳܳ;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "content-length"

    .line 87
    invoke-static {p0, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 89
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 90
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 93
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 94
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_4

    const/16 v4, 0x39

    if-le v3, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 100
    :cond_3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-lez p0, :cond_5

    :catch_0
    :cond_4
    :goto_1
    return v1

    :cond_5
    return v0
.end method

.method public static ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 47
    check-cast p0, Ll/ܺܳܳ;

    invoke-virtual {p0}, Ll/ܺܳܳ;->᩻()Ljava/util/Map;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_1

    .line 48
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 51
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ܺܳܳ;)Z
    .locals 1

    const-string v0, "transfer-encoding"

    .line 112
    invoke-static {p0, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 113
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ll/ܺܳܳ;)J
    .locals 5

    const-string v0, "content-length"

    .line 120
    invoke-static {p0, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 121
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 124
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 125
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v2, 0x7f120863

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 128
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 129
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_0

    const/16 v4, 0x39

    if-gt v3, v4, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 131
    :cond_0
    new-instance p0, Ll/ۧۚۢ;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-direct {p0, v2, v0}, Ll/ۧۚۢ;-><init>(I[Ljava/lang/Object;)V

    throw p0

    .line 135
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    .line 137
    :catch_0
    new-instance p0, Ll/ۧۚۢ;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-direct {p0, v2, v0}, Ll/ۧۚۢ;-><init>(I[Ljava/lang/Object;)V

    throw p0

    .line 126
    :cond_2
    new-instance p0, Ll/ۧۚۢ;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-direct {p0, v2, v0}, Ll/ۧۚۢ;-><init>(I[Ljava/lang/Object;)V

    throw p0

    .line 122
    :cond_3
    new-instance p0, Ll/ۧۚۢ;

    const v0, 0x7f120865

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Ll/ۧۚۢ;-><init>(I[Ljava/lang/Object;)V

    throw p0
.end method

.method public static ܽ(Ll/ܺܳܳ;)Z
    .locals 2

    .line 73
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v0

    .line 74
    sget-object v1, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ll/ۘܳܳ;->ۧ֫:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {p0}, Ll/ܿۚۢ;->֫(Ll/ܺܳܳ;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ܿ(Ll/ܺܳܳ;)Ljava/lang/String;
    .locals 7

    const-string v0, "content-length"

    .line 145
    invoke-static {p0, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 147
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, -0x1

    if-nez v1, :cond_0

    .line 149
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 151
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const/4 v0, -0x1

    .line 154
    :goto_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/16 v4, 0x400

    new-array v5, v4, [B

    .line 156
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܿ()Ljava/io/InputStream;

    move-result-object p0

    if-nez p0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    :goto_1
    if-eqz v0, :cond_4

    if-lez v0, :cond_2

    .line 161
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    goto :goto_2

    :cond_2
    const/16 v6, 0x400

    :goto_2
    invoke-virtual {p0, v5, v3, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-ne v6, v2, :cond_3

    goto :goto_3

    .line 165
    :cond_3
    invoke-virtual {v1, v5, v3, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    if-lez v0, :cond_1

    sub-int/2addr v0, v6

    goto :goto_1

    .line 170
    :cond_4
    :goto_3
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ll/ܺܳܳ;)Ljava/lang/String;
    .locals 2

    .line 177
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܽ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 182
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/ܿۚۢ;->ܿ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "content-length"

    invoke-static {p0, v1}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 184
    :cond_1
    invoke-virtual {p0, v0}, Ll/ܺܳܳ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    nop

    .line 190
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 191
    invoke-virtual {p0, v0}, Ll/ܺܳܳ;->֫(Ljava/util/HashMap;)V

    const-string v1, "postData"

    .line 192
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, "content"

    .line 194
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :cond_3
    if-nez v1, :cond_4

    const-string v1, ""

    .line 197
    :cond_4
    invoke-virtual {p0, v1}, Ll/ܺܳܳ;->֫(Ljava/lang/String;)V

    return-object v1
.end method
