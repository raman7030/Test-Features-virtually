.class public final Ll/ۙ֡᩵;
.super Ljava/lang/Object;
.source "39TA"


# static fields
.field public static ֫:[C


# direct methods
.method public static ֫(C)I
    .locals 3

    const/16 v0, 0x10

    .line 364
    invoke-static {p0, v0}, Ljava/lang/Character;->digit(CI)I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v1, 0xf

    if-gt v0, v1, :cond_0

    return v0

    .line 366
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "illegal not hex character: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(II[B)Ljava/lang/String;
    .locals 11

    .line 84
    sget-object v0, Ll/ۙ֡᩵;->֫:[C

    if-eqz v0, :cond_0

    array-length v0, v0

    if-ge v0, p1, :cond_1

    .line 85
    :cond_0
    new-array v0, p1, [C

    sput-object v0, Ll/ۙ֡᩵;->֫:[C

    .line 87
    :cond_1
    sget-object v0, Ll/ۙ֡᩵;->֫:[C

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-lez p1, :cond_b

    .line 91
    aget-byte v3, p2, p0

    and-int/lit16 v4, v3, 0xff

    shr-int/lit8 v5, v4, 0x4

    const/4 v6, 0x0

    const/16 v7, 0x80

    packed-switch v5, :pswitch_data_0

    .line 164
    :pswitch_0
    invoke-static {v4, p0}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    :pswitch_1
    add-int/lit8 p1, p1, -0x3

    if-ltz p1, :cond_5

    add-int/lit8 v4, p0, 0x1

    .line 141
    aget-byte v5, p2, v4

    and-int/lit16 v8, v5, 0xff

    and-int/lit16 v9, v5, 0xc0

    if-ne v9, v7, :cond_4

    add-int/lit8 v4, p0, 0x2

    .line 145
    aget-byte v8, p2, v4

    and-int/lit16 v10, v8, 0xff

    if-ne v9, v7, :cond_3

    and-int/lit8 v3, v3, 0xf

    shl-int/lit8 v3, v3, 0xc

    and-int/lit8 v5, v5, 0x3f

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v3, v5

    and-int/lit8 v5, v8, 0x3f

    or-int/2addr v3, v5

    const/16 v5, 0x800

    if-lt v3, v5, :cond_2

    int-to-char v3, v3

    add-int/lit8 p0, p0, 0x3

    goto :goto_2

    .line 156
    :cond_2
    invoke-static {v10, v4}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    .line 147
    :cond_3
    invoke-static {v10, v4}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    .line 143
    :cond_4
    invoke-static {v8, v4}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    .line 139
    :cond_5
    invoke-static {v4, p0}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    :pswitch_2
    add-int/lit8 p1, p1, -0x2

    if-ltz p1, :cond_9

    add-int/lit8 v4, p0, 0x1

    .line 119
    aget-byte v5, p2, v4

    and-int/lit16 v8, v5, 0xff

    and-int/lit16 v9, v5, 0xc0

    if-ne v9, v7, :cond_8

    and-int/lit8 v3, v3, 0x1f

    shl-int/lit8 v3, v3, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v3, v5

    if-eqz v3, :cond_7

    if-lt v3, v7, :cond_6

    goto :goto_1

    .line 129
    :cond_6
    invoke-static {v8, v4}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    :cond_7
    :goto_1
    int-to-char v3, v3

    add-int/lit8 p0, p0, 0x2

    goto :goto_2

    .line 121
    :cond_8
    invoke-static {v8, v4}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    .line 117
    :cond_9
    invoke-static {v4, p0}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    :pswitch_3
    add-int/lit8 p1, p1, -0x1

    if-eqz v4, :cond_a

    int-to-char v3, v4

    add-int/lit8 p0, p0, 0x1

    .line 167
    :goto_2
    aput-char v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 106
    :cond_a
    invoke-static {v4, p0}, Ll/ۙ֡᩵;->֫(II)V

    throw v6

    .line 171
    :cond_b
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static declared-synchronized ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 2
    const-class v0, Ll/ۙ֡᩵;

    .line 3
    monitor-enter v0

    .line 9
    :try_start_0
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 10
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/zip/CRC32;->update([B)V

    .line 11
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(II)V
    .locals 7

    .line 184
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bad utf-8 byte "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/۟᩸᩵;->֫(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " at offset "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x8

    new-array v2, p0, [C

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p0, :cond_0

    rsub-int/lit8 v4, v3, 0x7

    and-int/lit8 v5, p1, 0xf

    const/16 v6, 0x10

    .line 67
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    aput-char v5, v2, v4

    shr-int/lit8 p1, p1, 0x4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 71
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 185
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/util/List;Ll/᩶֡᩵;)V
    .locals 3

    .line 134
    invoke-virtual {p1}, Ll/᩶֡᩵;->ۧ()I

    move-result v0

    .line 117
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 118
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡᩵;

    .line 120
    invoke-virtual {v2}, Ll/᩶֡᩵;->ۧ()I

    move-result v2

    if-ne v2, v0, :cond_0

    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 135
    :cond_1
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 311
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 312
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_b

    .line 314
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5c

    if-ne v3, v4, :cond_a

    add-int/lit8 v5, v0, -0x1

    const-string v6, "escape Sequence error: "

    if-ge v2, v5, :cond_9

    add-int/lit8 v3, v2, 0x1

    .line 318
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x22

    if-eq v5, v7, :cond_8

    const/16 v7, 0x27

    if-eq v5, v7, :cond_7

    if-eq v5, v4, :cond_6

    const/16 v4, 0x62

    const/16 v7, 0x8

    if-eq v5, v4, :cond_5

    const/16 v4, 0x6e

    if-eq v5, v4, :cond_4

    const/16 v4, 0x72

    if-eq v5, v4, :cond_3

    const/16 v4, 0x74

    if-eq v5, v4, :cond_2

    const/16 v3, 0x75

    if-ne v5, v3, :cond_1

    add-int/lit8 v3, v2, 0x2

    add-int/lit8 v4, v0, -0x4

    if-gt v3, v4, :cond_0

    add-int/lit8 v4, v2, 0x3

    .line 346
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ll/ۙ֡᩵;->֫(C)I

    move-result v3

    shl-int/lit8 v3, v3, 0xc

    add-int/lit8 v5, v2, 0x4

    .line 347
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ۙ֡᩵;->֫(C)I

    move-result v4

    shl-int/2addr v4, v7

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x5

    .line 348
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ۙ֡᩵;->֫(C)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    or-int/2addr v3, v4

    .line 349
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ۙ֡᩵;->֫(C)I

    move-result v4

    or-int/2addr v3, v4

    int-to-char v3, v3

    .line 350
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 344
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "unicode error: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v2, p0, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 344
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 353
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v2, p0, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 353
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v2, 0x9

    .line 324
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const/16 v2, 0xd

    .line 330
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const/16 v2, 0xa

    .line 327
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 321
    :cond_5
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 339
    :cond_6
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 333
    :cond_7
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 336
    :cond_8
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    move v2, v3

    goto :goto_2

    .line 317
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 356
    :cond_a
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 360
    :cond_b
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 262
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 263
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x3

    div-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_7

    .line 266
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    const/16 v5, 0x7f

    if-lt v3, v4, :cond_2

    if-ge v3, v5, :cond_2

    const/16 v4, 0x27

    const/16 v5, 0x5c

    if-eq v3, v4, :cond_0

    const/16 v4, 0x22

    if-eq v3, v4, :cond_0

    if-ne v3, v5, :cond_1

    .line 270
    :cond_0
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 272
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    if-gt v3, v5, :cond_6

    const/16 v4, 0x9

    if-eq v3, v4, :cond_5

    const/16 v4, 0xa

    if-eq v3, v4, :cond_4

    const/16 v4, 0xd

    if-eq v3, v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\\r"

    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    const-string v3, "\\n"

    .line 277
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    const-string v3, "\\t"

    .line 283
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 304
    :cond_6
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 307
    :cond_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)[B
    .locals 9

    .line 45
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v1, v0, 0x3

    .line 46
    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 50
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x80

    if-eqz v5, :cond_0

    if-ge v5, v6, :cond_0

    int-to-byte v5, v5

    .line 52
    aput-byte v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    const/16 v7, 0x800

    if-ge v5, v7, :cond_1

    shr-int/lit8 v7, v5, 0x6

    and-int/lit8 v7, v7, 0x1f

    or-int/lit16 v7, v7, 0xc0

    int-to-byte v7, v7

    .line 55
    aput-byte v7, v1, v4

    add-int/lit8 v7, v4, 0x1

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v6

    int-to-byte v5, v5

    .line 56
    aput-byte v5, v1, v7

    add-int/lit8 v4, v4, 0x2

    goto :goto_1

    :cond_1
    shr-int/lit8 v7, v5, 0xc

    and-int/lit8 v7, v7, 0xf

    or-int/lit16 v7, v7, 0xe0

    int-to-byte v7, v7

    .line 59
    aput-byte v7, v1, v4

    add-int/lit8 v7, v4, 0x1

    shr-int/lit8 v8, v5, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v6

    int-to-byte v8, v8

    .line 60
    aput-byte v8, v1, v7

    add-int/lit8 v7, v4, 0x2

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v6

    int-to-byte v5, v5

    .line 61
    aput-byte v5, v1, v7

    add-int/lit8 v4, v4, 0x3

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 66
    :cond_2
    new-array p0, v4, [B

    .line 67
    invoke-static {v1, v2, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method
