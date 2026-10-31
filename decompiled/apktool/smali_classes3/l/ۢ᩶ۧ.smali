.class public final Ll/ۢ᩶ۧ;
.super Ljava/lang/Object;
.source "W9NV"


# static fields
.field public static final ֫:[B

.field public static final ۧ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 66
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۢ᩶ۧ;->֫:[B

    new-array v0, v0, [B

    .line 67
    fill-array-data v0, :array_1

    sput-object v0, Ll/ۢ᩶ۧ;->ۧ:[B

    return-void

    :array_0
    .array-data 1
        0x70t
        0x72t
        0x6ft
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x70t
        0x72t
        0x6dt
        0x0t
    .end array-data
.end method

.method public static ֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 40
    sget-object v0, Ll/ᩴ᩶ۧ;->ܽ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    sget-object v2, Ll/ᩴ᩶ۧ;->ᩳ:[B

    const-string v3, "!"

    const-string v4, ":"

    if-eqz v1, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    move-object v1, v4

    goto :goto_1

    :cond_1
    move-object v1, v3

    .line 1037
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-gtz v5, :cond_3

    .line 1050
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 1051
    invoke-virtual {p2, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1052
    :cond_2
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    .line 1053
    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v5, "classes.dex"

    .line 1038
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    return-object p0

    .line 1039
    :cond_4
    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v1, ".apk"

    .line 1042
    invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    .line 0
    :cond_6
    invoke-static {p0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 40
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    .line 42
    :cond_7
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_8

    :goto_2
    move-object v3, v4

    .line 0
    :cond_8
    invoke-static {p0, v3, p2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1050
    :cond_9
    :goto_3
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    .line 1051
    invoke-virtual {p2, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1052
    :cond_a
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    .line 1053
    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    :goto_4
    return-object p2
.end method

.method public static ֫(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V
    .locals 8

    .line 733
    iget v0, p1, Ll/ۤ᩹ۧ;->᩷:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x7

    and-int/lit8 v0, v0, -0x8

    .line 613
    div-int/lit8 v0, v0, 0x8

    .line 733
    new-array v0, v0, [B

    .line 734
    iget-object v1, p1, Ll/ۤ᩹ۧ;->ۜ:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 735
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 736
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x2

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    .line 635
    div-int/lit8 v4, v3, 0x8

    .line 636
    aget-byte v6, v0, v4

    rem-int/lit8 v7, v3, 0x8

    shl-int v7, v5, v7

    or-int/2addr v6, v7

    int-to-byte v6, v6

    .line 637
    aput-byte v6, v0, v4

    :cond_1
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_0

    .line 634
    iget v2, p1, Ll/ۤ᩹ۧ;->᩷:I

    add-int/2addr v3, v2

    .line 635
    div-int/lit8 v2, v3, 0x8

    .line 636
    aget-byte v4, v0, v2

    rem-int/lit8 v3, v3, 0x8

    shl-int v3, v5, v3

    or-int/2addr v3, v4

    int-to-byte v3, v3

    .line 637
    aput-byte v3, v0, v2

    goto :goto_0

    .line 746
    :cond_2
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ֫(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;Ljava/lang/String;)V
    .locals 4

    .line 46
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    array-length v1, v1

    .line 651
    invoke-static {p0, v1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 652
    iget v1, p1, Ll/ۤ᩹ۧ;->ۧ:I

    invoke-static {p0, v1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 653
    iget v1, p1, Ll/ۤ᩹ۧ;->ܳ:I

    int-to-long v1, v1

    const/4 v3, 0x4

    .line 67
    invoke-static {p0, v1, v2, v3}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 654
    iget-wide v1, p1, Ll/ۤ᩹ۧ;->ᩳ:J

    .line 67
    invoke-static {p0, v1, v2, v3}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 655
    iget p1, p1, Ll/ۤ᩹ۧ;->᩷:I

    int-to-long v1, p1

    .line 67
    invoke-static {p0, v1, v2, v3}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 71
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ֫(Ljava/io/ByteArrayOutputStream;[B[Ll/ۤ᩹ۧ;)Z
    .locals 13

    .line 98
    sget-object v0, Ll/ᩴ᩶ۧ;->᩻:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_a

    .line 237
    new-instance p1, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 285
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 288
    :try_start_0
    array-length v6, p2

    invoke-static {v1, v6}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    const/4 v6, 0x0

    const/4 v7, 0x2

    .line 289
    :goto_0
    array-length v8, p2

    if-ge v6, v8, :cond_0

    .line 290
    aget-object v8, p2, v6

    .line 293
    iget-wide v9, v8, Ll/ۤ᩹ۧ;->ᩳ:J

    .line 67
    invoke-static {v1, v9, v10, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 299
    iget-wide v9, v8, Ll/ۤ᩹ۧ;->᩻:J

    .line 67
    invoke-static {v1, v9, v10, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 302
    iget v9, v8, Ll/ۤ᩹ۧ;->᩷:I

    int-to-long v9, v9

    .line 67
    invoke-static {v1, v9, v10, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 304
    iget-object v9, v8, Ll/ۤ᩹ۧ;->֫:Ljava/lang/String;

    iget-object v8, v8, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    invoke-static {v9, v0, v8}, Ll/ۢ᩶ۧ;->֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v7, v7, 0xe

    .line 46
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    array-length v10, v10

    .line 311
    invoke-static {v1, v10}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    add-int/2addr v7, v10

    .line 71
    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/io/OutputStream;->write([B)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 315
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 316
    array-length v6, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    const-string v8, ", does not match actual size "

    const-string v9, "Expected size "

    if-ne v7, v6, :cond_9

    .line 322
    :try_start_1
    new-instance v6, Ll/᩵᩶ۧ;

    sget-object v7, Ll/ۨ᩹ۧ;->ۗ:Ll/ۨ᩹ۧ;

    invoke-direct {v6, v7, v0, v3}, Ll/᩵᩶ۧ;-><init>(Ll/ۨ᩹ۧ;[BZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    .line 328
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 239
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 336
    :goto_1
    :try_start_2
    array-length v6, p2

    if-ge v1, v6, :cond_2

    .line 337
    aget-object v6, p2, v1

    .line 340
    invoke-static {v0, v1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v3, v3, 0x4

    .line 343
    iget v7, v6, Ll/ۤ᩹ۧ;->ۧ:I

    invoke-static {v0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 345
    iget v7, v6, Ll/ۤ᩹ۧ;->ۧ:I

    mul-int/lit8 v7, v7, 0x2

    add-int/2addr v3, v7

    .line 717
    iget-object v6, v6, Ll/ۤ᩹ۧ;->ܽ:[I

    array-length v7, v6

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_2
    if-ge v10, v7, :cond_1

    aget v12, v6, v10

    sub-int v11, v12, v11

    .line 719
    invoke-static {v0, v11}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v10, v10, 0x1

    move v11, v12

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 348
    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 349
    array-length v6, v1

    if-ne v3, v6, :cond_8

    .line 355
    new-instance v3, Ll/᩵᩶ۧ;

    sget-object v6, Ll/ۨ᩹ۧ;->ۙ:Ll/ۨ᩹ۧ;

    invoke-direct {v3, v6, v1, v4}, Ll/᩵᩶ۧ;-><init>(Ll/ۨ᩹ۧ;[BZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 361
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 240
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 369
    :goto_3
    :try_start_3
    array-length v4, p2

    if-ge v1, v4, :cond_4

    .line 370
    aget-object v4, p2, v1

    .line 427
    iget-object v6, v4, Ll/ۤ᩹ۧ;->ۜ:Ljava/util/TreeMap;

    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 428
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    or-int/2addr v7, v10

    goto :goto_4

    .line 410
    :cond_3
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 411
    :try_start_4
    invoke-static {v6, v4}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V

    .line 412
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 413
    :try_start_5
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 419
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 420
    :try_start_6
    invoke-static {v6, v4}, Ll/ۢ᩶ۧ;->ۧ(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V

    .line 421
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 422
    :try_start_7
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 379
    invoke-static {v0, v1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 381
    array-length v6, v10

    add-int/lit8 v6, v6, 0x2

    array-length v11, v4

    add-int/2addr v6, v11

    add-int/lit8 v3, v3, 0x6

    int-to-long v11, v6

    .line 67
    invoke-static {v0, v11, v12, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 386
    invoke-static {v0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 387
    invoke-virtual {v0, v10}, Ljava/io/OutputStream;->write([B)V

    .line 388
    invoke-virtual {v0, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    add-int/2addr v3, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :catchall_0
    move-exception p0

    .line 419
    :try_start_8
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception p1

    :try_start_9
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_2
    move-exception p0

    .line 410
    :try_start_a
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception p1

    :try_start_b
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    .line 391
    :cond_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    .line 392
    array-length v1, p2

    if-ne v3, v1, :cond_7

    .line 398
    new-instance v1, Ll/᩵᩶ۧ;

    sget-object v3, Ll/ۨ᩹ۧ;->۫:Ll/ۨ᩹ۧ;

    const/4 v4, 0x1

    invoke-direct {v1, v3, p2, v4}, Ll/᩵᩶ۧ;-><init>(Ll/ۨ᩹ۧ;[BZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 404
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 241
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    int-to-long v0, v2

    add-long/2addr v0, v0

    const-wide/16 v3, 0x4

    add-long/2addr v0, v3

    .line 248
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    mul-int/lit8 p2, p2, 0x10

    int-to-long v3, p2

    add-long/2addr v0, v3

    .line 249
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    int-to-long v3, p2

    .line 67
    invoke-static {p0, v3, v4, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    const/4 p2, 0x0

    .line 250
    :goto_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge p2, v3, :cond_6

    .line 251
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵᩶ۧ;

    .line 253
    iget-object v4, v3, Ll/᩵᩶ۧ;->ܽ:Ll/ۨ᩹ۧ;

    iget-object v6, v3, Ll/᩵᩶ۧ;->֫:[B

    invoke-virtual {v4}, Ll/ۨ᩹ۧ;->getValue()J

    move-result-wide v7

    .line 67
    invoke-static {p0, v7, v8, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {p0, v0, v1, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 257
    iget-boolean v3, v3, Ll/᩵᩶ۧ;->ۧ:Z

    if-eqz v3, :cond_5

    .line 258
    array-length v3, v6

    int-to-long v3, v3

    .line 259
    invoke-static {v6}, Ll/ۛ᩹ۧ;->֫([B)[B

    move-result-object v6

    .line 260
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    array-length v7, v6

    int-to-long v7, v7

    .line 67
    invoke-static {p0, v7, v8, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {p0, v3, v4, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 265
    array-length v3, v6

    goto :goto_8

    .line 267
    :cond_5
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    array-length v3, v6

    int-to-long v3, v3

    .line 67
    invoke-static {p0, v3, v4, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    const-wide/16 v3, 0x0

    invoke-static {p0, v3, v4, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 272
    array-length v3, v6

    :goto_8
    int-to-long v3, v3

    add-long/2addr v0, v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_7

    :cond_6
    const/4 p1, 0x0

    .line 276
    :goto_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_12

    .line 277
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    invoke-virtual {p0, p2}, Ljava/io/OutputStream;->write([B)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_9

    .line 393
    :cond_7
    :try_start_c
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 196
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 393
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception p0

    .line 368
    :try_start_d
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_a

    :catchall_5
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw p0

    .line 350
    :cond_8
    :try_start_e
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, v1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 196
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 350
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :catchall_6
    move-exception p0

    .line 335
    :try_start_f
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_b

    :catchall_7
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw p0

    .line 317
    :cond_9
    :try_start_10
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 196
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 317
    throw p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :catchall_8
    move-exception p0

    .line 285
    :try_start_11
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    goto :goto_c

    :catchall_9
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw p0

    .line 103
    :cond_a
    sget-object v0, Ll/ᩴ᩶ۧ;->ܳ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 473
    invoke-static {p2, v0}, Ll/ۢ᩶ۧ;->֫([Ll/ۤ᩹ۧ;[B)[B

    move-result-object p1

    .line 474
    array-length p2, p2

    int-to-long v0, p2

    const/4 p2, 0x1

    .line 59
    invoke-static {p0, v0, v1, p2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 170
    array-length v0, p1

    int-to-long v0, v0

    .line 67
    invoke-static {p0, v0, v1, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 171
    invoke-static {p1}, Ll/ۛ᩹ۧ;->֫([B)[B

    move-result-object p1

    .line 172
    array-length v0, p1

    int-to-long v0, v0

    .line 67
    invoke-static {p0, v0, v1, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 173
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return p2

    :cond_b
    const/4 v0, 0x1

    .line 108
    sget-object v1, Ll/ᩴ᩶ۧ;->ᩳ:[B

    invoke-static {p1, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 521
    array-length p1, p2

    int-to-long v3, p1

    .line 59
    invoke-static {p0, v3, v4, v0}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 522
    array-length p1, p2

    const/4 v0, 0x0

    :goto_d
    if-ge v0, p1, :cond_12

    aget-object v3, p2, v0

    .line 523
    iget-object v4, v3, Ll/ۤ᩹ۧ;->ۜ:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    move-result v4

    mul-int/lit8 v4, v4, 0x4

    .line 526
    iget-object v5, v3, Ll/ۤ᩹ۧ;->֫:Ljava/lang/String;

    iget-object v6, v3, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    invoke-static {v5, v1, v6}, Ll/ۢ᩶ۧ;->֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 46
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    array-length v7, v7

    .line 527
    invoke-static {p0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 528
    iget-object v7, v3, Ll/ۤ᩹ۧ;->ܽ:[I

    array-length v7, v7

    invoke-static {p0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    int-to-long v7, v4

    .line 67
    invoke-static {p0, v7, v8, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 530
    iget-wide v7, v3, Ll/ۤ᩹ۧ;->ᩳ:J

    .line 67
    invoke-static {p0, v7, v8, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write([B)V

    .line 533
    iget-object v4, v3, Ll/ۤ᩹ۧ;->ۜ:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 534
    invoke-static {p0, v5}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    const/4 v5, 0x0

    .line 536
    invoke-static {p0, v5}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    goto :goto_e

    .line 539
    :cond_c
    iget-object v3, v3, Ll/ۤ᩹ۧ;->ܽ:[I

    array-length v4, v3

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v4, :cond_d

    aget v6, v3, v5

    .line 540
    invoke-static {p0, v6}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    .line 113
    :cond_e
    sget-object v0, Ll/ᩴ᩶ۧ;->ܿ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 482
    invoke-static {p2, v0}, Ll/ۢ᩶ۧ;->֫([Ll/ۤ᩹ۧ;[B)[B

    move-result-object p1

    .line 483
    array-length p2, p2

    int-to-long v0, p2

    const/4 p2, 0x1

    .line 59
    invoke-static {p0, v0, v1, p2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 170
    array-length v0, p1

    int-to-long v0, v0

    .line 67
    invoke-static {p0, v0, v1, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 171
    invoke-static {p1}, Ll/ۛ᩹ۧ;->֫([B)[B

    move-result-object p1

    .line 172
    array-length v0, p1

    int-to-long v0, v0

    .line 67
    invoke-static {p0, v0, v1, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 173
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return p2

    .line 118
    :cond_f
    sget-object v0, Ll/ᩴ᩶ۧ;->ܽ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 145
    array-length p1, p2

    invoke-static {p0, p1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 146
    array-length p1, p2

    const/4 v1, 0x0

    :goto_10
    if-ge v1, p1, :cond_12

    aget-object v3, p2, v1

    .line 147
    iget-object v4, v3, Ll/ۤ᩹ۧ;->֫:Ljava/lang/String;

    iget-object v5, v3, Ll/ۤ᩹ۧ;->ۜ:Ljava/util/TreeMap;

    iget-object v6, v3, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    invoke-static {v4, v0, v6}, Ll/ۢ᩶ۧ;->֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 46
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    array-length v7, v7

    .line 148
    invoke-static {p0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 149
    invoke-virtual {v5}, Ljava/util/TreeMap;->size()I

    move-result v7

    invoke-static {p0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 150
    iget-object v7, v3, Ll/ۤ᩹ۧ;->ܽ:[I

    array-length v7, v7

    invoke-static {p0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 151
    iget-wide v7, v3, Ll/ۤ᩹ۧ;->ᩳ:J

    .line 67
    invoke-static {p0, v7, v8, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;JI)V

    .line 71
    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write([B)V

    .line 154
    invoke-virtual {v5}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 155
    invoke-static {p0, v5}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    goto :goto_11

    .line 158
    :cond_10
    iget-object v3, v3, Ll/ۤ᩹ۧ;->ܽ:[I

    array-length v4, v3

    const/4 v5, 0x0

    :goto_12
    if-ge v5, v4, :cond_11

    aget v6, v3, v5

    .line 159
    invoke-static {p0, v6}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    :cond_11
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_12
    const/4 p0, 0x1

    return p0

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫([Ll/ۤ᩹ۧ;[B)[B
    .locals 10

    .line 562
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v3, p0, v1

    .line 569
    iget-object v4, v3, Ll/ۤ᩹ۧ;->֫:Ljava/lang/String;

    iget-object v5, v3, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    invoke-static {v4, p1, v5}, Ll/ۢ᩶ۧ;->֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 46
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    array-length v4, v4

    add-int/lit8 v4, v4, 0x10

    .line 571
    iget v5, v3, Ll/ۤ᩹ۧ;->ۧ:I

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v4

    iget v4, v3, Ll/ۤ᩹ۧ;->ܳ:I

    add-int/2addr v5, v4

    iget v3, v3, Ll/ۤ᩹ۧ;->᩷:I

    mul-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x7

    and-int/lit8 v3, v3, -0x8

    .line 613
    div-int/lit8 v3, v3, 0x8

    add-int/2addr v3, v5

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 577
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 583
    sget-object v1, Ll/ᩴ᩶ۧ;->ܿ:[B

    invoke-static {p1, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 585
    array-length v1, p0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_5

    aget-object v4, p0, v3

    .line 586
    iget-object v5, v4, Ll/ۤ᩹ۧ;->֫:Ljava/lang/String;

    iget-object v6, v4, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    invoke-static {v5, p1, v6}, Ll/ۢ᩶ۧ;->֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 587
    invoke-static {v0, v4, v5}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;Ljava/lang/String;)V

    .line 671
    invoke-static {v0, v4}, Ll/ۢ᩶ۧ;->ۧ(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V

    .line 717
    iget-object v5, v4, Ll/ۤ᩹ۧ;->ܽ:[I

    array-length v6, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2
    if-ge v7, v6, :cond_1

    aget v9, v5, v7

    sub-int v8, v9, v8

    .line 719
    invoke-static {v0, v8}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v7, v7, 0x1

    move v8, v9

    goto :goto_2

    .line 673
    :cond_1
    invoke-static {v0, v4}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 593
    :cond_2
    array-length v1, p0

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v1, :cond_3

    aget-object v4, p0, v3

    .line 594
    iget-object v5, v4, Ll/ۤ᩹ۧ;->֫:Ljava/lang/String;

    iget-object v6, v4, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    invoke-static {v5, p1, v6}, Ll/ۢ᩶ۧ;->֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 595
    invoke-static {v0, v4, v5}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 599
    :cond_3
    array-length p1, p0

    const/4 v1, 0x0

    :goto_4
    if-ge v1, p1, :cond_5

    aget-object v3, p0, v1

    .line 671
    invoke-static {v0, v3}, Ll/ۢ᩶ۧ;->ۧ(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V

    .line 717
    iget-object v4, v3, Ll/ۤ᩹ۧ;->ܽ:[I

    array-length v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_5
    if-ge v6, v5, :cond_4

    aget v8, v4, v6

    sub-int v7, v8, v7

    .line 719
    invoke-static {v0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v6, v6, 0x1

    move v7, v8

    goto :goto_5

    .line 673
    :cond_4
    invoke-static {v0, v3}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 604
    :cond_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p0

    if-ne p0, v2, :cond_6

    .line 608
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    .line 605
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "The bytes saved do not match expectation. actual="

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 606
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " expected="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 196
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 605
    throw p1
.end method

.method public static ֫(Ljava/io/ByteArrayInputStream;I)[I
    .locals 5

    .line 1193
    new-array v0, p1, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    const/4 v3, 0x2

    .line 106
    invoke-static {p0, v3}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v4, v3

    add-int/2addr v2, v4

    .line 1198
    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ljava/io/ByteArrayInputStream;I[Ll/ۤ᩹ۧ;)[Ll/ۤ᩹ۧ;
    .locals 7

    .line 986
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array p0, v1, [Ll/ۤ᩹ۧ;

    return-object p0

    .line 989
    :cond_0
    array-length v0, p2

    if-ne p1, v0, :cond_4

    .line 993
    new-array v0, p1, [Ljava/lang/String;

    .line 994
    new-array v2, p1, [I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    const/4 v4, 0x2

    .line 106
    invoke-static {p0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v5

    long-to-int v6, v5

    invoke-static {p0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v5, v4

    .line 997
    aput v5, v2, v3

    .line 114
    new-instance v4, Ljava/lang/String;

    invoke-static {p0, v6}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v5

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 998
    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v1, p1, :cond_3

    .line 1003
    aget-object v3, p2, v1

    .line 1004
    iget-object v4, v3, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1007
    aget v4, v2, v1

    iput v4, v3, Ll/ۤ᩹ۧ;->ۧ:I

    .line 1009
    invoke-static {p0, v4}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v4

    iput-object v4, v3, Ll/ۤ᩹ۧ;->ܽ:[I

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 196
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Order of dexfiles in metadata did not match baseline"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1005
    throw p0

    :cond_3
    return-object p2

    .line 196
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Mismatched number of dex files found in metadata"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 990
    throw p0
.end method

.method public static ֫(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Ll/ۤ᩹ۧ;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 1085
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-array v0, v3, [Ll/ۤ᩹ۧ;

    return-object v0

    .line 1089
    :cond_0
    new-array v2, v1, [Ll/ۤ᩹ۧ;

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    if-ge v3, v1, :cond_1

    .line 106
    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v5

    long-to-int v6, v5

    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v12, v4

    const/4 v4, 0x4

    .line 110
    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v7

    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v10

    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v4

    .line 1097
    new-instance v17, Ll/ۤ᩹ۧ;

    .line 114
    new-instance v9, Ljava/lang/String;

    invoke-static {v0, v6}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v6

    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v9, v6, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    long-to-int v13, v7

    long-to-int v14, v4

    .line 1099
    new-array v15, v12, [I

    new-instance v16, Ljava/util/TreeMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/TreeMap;-><init>()V

    move-object/from16 v7, v17

    move-object/from16 v8, p1

    invoke-direct/range {v7 .. v16}, Ll/ۤ᩹ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;JIII[ILjava/util/TreeMap;)V

    aput-object v17, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_e

    .line 1113
    aget-object v5, v2, v3

    .line 1133
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v6

    iget v7, v5, Ll/ۤ᩹ۧ;->ܳ:I

    iget v8, v5, Ll/ۤ᩹ۧ;->᩷:I

    iget-object v9, v5, Ll/ۤ᩹ۧ;->ۜ:Ljava/util/TreeMap;

    sub-int/2addr v6, v7

    const/4 v7, 0x0

    .line 1137
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v10

    const/4 v11, 0x7

    if-le v10, v6, :cond_7

    .line 106
    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v12

    long-to-int v10, v12

    add-int/2addr v7, v10

    .line 1143
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v12, 0x1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v9, v10, v13}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v13

    long-to-int v10, v13

    :goto_2
    if-lez v10, :cond_2

    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    .line 102
    invoke-static {v0, v12}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v13

    long-to-int v14, v13

    const/4 v13, 0x6

    if-ne v14, v13, :cond_4

    :cond_3
    :goto_3
    move-object/from16 p1, v5

    goto :goto_6

    :cond_4
    if-ne v14, v11, :cond_5

    goto :goto_3

    :cond_5
    :goto_4
    if-lez v14, :cond_3

    invoke-static {v0, v12}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-object/from16 p1, v5

    invoke-static {v0, v12}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v5, v4

    :goto_5
    if-lez v5, :cond_6

    const/4 v4, 0x2

    .line 106
    invoke-static {v0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    add-int/lit8 v5, v5, -0x1

    goto :goto_5

    :cond_6
    const/4 v4, 0x2

    add-int/lit8 v14, v14, -0x1

    move-object/from16 v5, p1

    goto :goto_4

    :goto_6
    add-int/lit8 v10, v10, -0x1

    move-object/from16 v5, p1

    goto :goto_2

    :cond_7
    move-object/from16 p1, v5

    const/4 v5, 0x0

    .line 1156
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v7

    if-ne v7, v6, :cond_d

    move-object/from16 v6, p1

    .line 1118
    iget v7, v6, Ll/ۤ᩹ۧ;->ۧ:I

    invoke-static {v0, v7}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v7

    iput-object v7, v6, Ll/ۤ᩹ۧ;->ܽ:[I

    mul-int/lit8 v6, v8, 0x2

    add-int/2addr v6, v11

    and-int/lit8 v6, v6, -0x8

    .line 75
    div-int/lit8 v6, v6, 0x8

    .line 1209
    invoke-static {v0, v6}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v6

    .line 1210
    invoke-static {v6}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    move-result-object v6

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v8, :cond_c

    .line 1223
    invoke-virtual {v6, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v10

    if-eqz v10, :cond_8

    const/4 v10, 0x2

    goto :goto_8

    :cond_8
    const/4 v10, 0x0

    :goto_8
    add-int v11, v7, v8

    .line 1226
    invoke-virtual {v6, v11}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    if-eqz v11, :cond_9

    or-int/lit8 v10, v10, 0x4

    :cond_9
    if-eqz v10, :cond_b

    .line 1214
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-nez v11, :cond_a

    .line 1215
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 1216
    :cond_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    or-int/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v12, v10}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    .line 196
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Read too much data during profile line parse"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1157
    throw v0

    :cond_e
    return-object v2
.end method

.method public static ֫(Ljava/io/ByteArrayInputStream;[BI[Ll/ۤ᩹ۧ;)[Ll/ۤ᩹ۧ;
    .locals 9

    .line 918
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array p0, v1, [Ll/ۤ᩹ۧ;

    return-object p0

    .line 921
    :cond_0
    array-length v0, p3

    if-ne p2, v0, :cond_9

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_8

    const/4 v1, 0x2

    .line 106
    invoke-static {p0, v1}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    invoke-static {p0, v1}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v2

    long-to-int v3, v2

    .line 114
    new-instance v2, Ljava/lang/String;

    invoke-static {p0, v3}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v3

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const/4 v3, 0x4

    .line 110
    invoke-static {p0, v3}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v3

    .line 106
    invoke-static {p0, v1}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v5

    long-to-int v1, v5

    .line 959
    array-length v5, p3

    const/4 v6, 0x0

    if-gtz v5, :cond_1

    goto :goto_3

    :cond_1
    const-string v5, "!"

    .line 1061
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-gez v5, :cond_2

    const-string v5, ":"

    .line 1063
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    :cond_2
    if-lez v5, :cond_3

    add-int/lit8 v5, v5, 0x1

    .line 1067
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    move-object v5, v2

    :goto_1
    const/4 v7, 0x0

    .line 965
    :goto_2
    array-length v8, p3

    if-ge v7, v8, :cond_5

    .line 966
    aget-object v8, p3, v7

    iget-object v8, v8, Ll/ۤ᩹ۧ;->ܿ:Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 967
    aget-object v6, p3, v7

    goto :goto_3

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    if-eqz v6, :cond_7

    .line 939
    iput-wide v3, v6, Ll/ۤ᩹ۧ;->᩻:J

    .line 943
    invoke-static {p0, v1}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v2

    .line 946
    sget-object v3, Ll/ᩴ᩶ۧ;->ܽ:[B

    invoke-static {p1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 947
    iput v1, v6, Ll/ۤ᩹ۧ;->ۧ:I

    .line 948
    iput-object v2, v6, Ll/ۤ᩹ۧ;->ܽ:[I

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    const-string p0, "Missing profile key: "

    .line 936
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 196
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 936
    throw p1

    :cond_8
    return-object p3

    .line 196
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Mismatched number of dex files found in metadata"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 922
    throw p0
.end method

.method public static ֫(Ljava/io/FileInputStream;[BLjava/lang/String;)[Ll/ۤ᩹ۧ;
    .locals 5

    .line 791
    sget-object v0, Ll/ᩴ᩶ۧ;->ܳ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 102
    invoke-static {p0, p1}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v0

    long-to-int p1, v0

    const/4 v0, 0x4

    .line 110
    invoke-static {p0, v0}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v1

    invoke-static {p0, v0}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v0, v3

    long-to-int v2, v1

    .line 800
    invoke-static {p0, v0, v2}, Ll/ۛ᩹ۧ;->֫(Ljava/io/FileInputStream;II)[B

    move-result-object v0

    .line 805
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    .line 807
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 808
    :try_start_0
    invoke-static {p0, p2, p1}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Ll/ۤ᩹ۧ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 809
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 807
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 196
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Content found after the end of file"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 805
    throw p0

    .line 196
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unsupported version"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 792
    throw p0
.end method

.method public static ֫(Ljava/io/FileInputStream;[B[B[Ll/ۤ᩹ۧ;)[Ll/ۤ᩹ۧ;
    .locals 6

    .line 819
    sget-object v0, Ll/ᩴ᩶ۧ;->֫:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    const-string v2, "Unsupported meta version"

    const-string v3, "Content found after the end of file"

    const/4 v4, 0x4

    if-eqz v1, :cond_3

    .line 820
    sget-object v1, Ll/ᩴ᩶ۧ;->᩻:[B

    invoke-static {v1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-nez p2, :cond_2

    .line 850
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 102
    invoke-static {p0, p1}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide p1

    long-to-int p2, p1

    .line 110
    invoke-static {p0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v0

    invoke-static {p0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int p1, v4

    long-to-int v1, v0

    .line 859
    invoke-static {p0, p1, v1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/FileInputStream;II)[B

    move-result-object p1

    .line 864
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    .line 866
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 867
    :try_start_0
    invoke-static {p0, p2, p3}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayInputStream;I[Ll/ۤ᩹ۧ;)[Ll/ۤ᩹ۧ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 868
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 866
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 196
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 864
    throw p0

    .line 196
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 851
    throw p0

    .line 196
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 824
    throw p0

    .line 829
    :cond_3
    sget-object v0, Ll/ᩴ᩶ۧ;->ۧ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x2

    .line 106
    invoke-static {p0, p1}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v0

    long-to-int p1, v0

    .line 110
    invoke-static {p0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v0

    invoke-static {p0, v4}, Ll/ۛ᩹ۧ;->ۧ(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v2, v4

    long-to-int v1, v0

    .line 894
    invoke-static {p0, v2, v1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/FileInputStream;II)[B

    move-result-object v0

    .line 899
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_4

    .line 900
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 901
    :try_start_2
    invoke-static {p0, p2, p1, p3}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayInputStream;[BI[Ll/ۤ᩹ۧ;)[Ll/ۤ᩹ۧ;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 907
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_2
    move-exception p1

    .line 900
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    .line 196
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 899
    throw p0

    .line 196
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 832
    throw p0
.end method

.method public static ۧ(Ljava/io/ByteArrayOutputStream;Ll/ۤ᩹ۧ;)V
    .locals 4

    .line 689
    iget-object p1, p1, Ll/ۤ᩹ۧ;->ۜ:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 690
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 691
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sub-int v1, v3, v1

    .line 696
    invoke-static {p0, v1}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    .line 697
    invoke-static {p0, v0}, Ll/ۛ᩹ۧ;->֫(Ljava/io/ByteArrayOutputStream;I)V

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method
