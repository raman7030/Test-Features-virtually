.class public final Ll/᩶ܺܽ;
.super Ljava/lang/Object;
.source "C5GS"


# direct methods
.method public static ֫(Ljava/lang/String;)J
    .locals 10

    .line 168
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-wide v4, v1

    :goto_0
    if-ge v3, v0, :cond_1

    aget-char v6, p0, v3

    const/4 v7, 0x4

    shl-long/2addr v4, v7

    int-to-long v6, v6

    add-long/2addr v4, v6

    const-wide v6, 0xf0000000L

    and-long/2addr v6, v4

    cmp-long v8, v6, v1

    if-eqz v8, :cond_0

    const/16 v8, 0x18

    shr-long v8, v6, v8

    xor-long/2addr v4, v8

    not-long v6, v6

    and-long/2addr v4, v6

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0x7fffffff

    and-long/2addr v0, v4

    return-wide v0
.end method

.method public static ֫(Ljava/lang/String;[BLjava/lang/String;)[B
    .locals 16

    .line 15
    :try_start_0
    new-instance v0, Ll/ۙܺܽ;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ll/ۙܺܽ;-><init>([B)V

    iget-object v1, v0, Ll/ۙܺܽ;->ܽ:[Ll/ۤܺܽ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    if-eqz v4, :cond_1

    .line 64
    iget-object v5, v4, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    iget-object v5, v5, Ll/ۙܺܽ;->ᩳ:Ll/ۛܺܽ;

    if-nez v5, :cond_0

    const/4 v5, 0x0

    goto :goto_1

    :cond_0
    iget v6, v4, Ll/ۤܺܽ;->᩶:I

    invoke-virtual {v5, v6}, Ll/ۛܺܽ;->֫(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    const-string v6, ".hash"

    .line 24
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 33
    :goto_2
    iget-object v0, v0, Ll/ۙܺܽ;->֫:Ljava/nio/ByteBuffer;

    if-nez v4, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    goto :goto_5

    .line 39
    :cond_3
    iget-wide v2, v4, Ll/ۤܺܽ;->ۙ:J

    long-to-int v3, v2

    .line 40
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/lit8 v5, v3, 0x4

    .line 42
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/lit8 v3, v3, 0x8

    .line 45
    new-array v6, v2, [I

    .line 46
    new-array v7, v5, [I

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v2, :cond_4

    .line 48
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v9

    aput v9, v6, v8

    add-int/lit8 v3, v3, 0x4

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_4
    if-ge v8, v5, :cond_5

    .line 52
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v9

    aput v9, v7, v8

    add-int/lit8 v3, v3, 0x4

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    move-object v3, v6

    move-object v5, v7

    .line 164
    :goto_5
    array-length v6, v1

    const/4 v7, 0x0

    :goto_6
    if-ge v7, v6, :cond_8

    aget-object v8, v1, v7

    if-eqz v8, :cond_7

    .line 64
    iget-object v9, v8, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    iget-object v9, v9, Ll/ۙܺܽ;->ᩳ:Ll/ۛܺܽ;

    if-nez v9, :cond_6

    const/4 v9, 0x0

    goto :goto_7

    :cond_6
    iget v10, v8, Ll/ۤܺܽ;->᩶:I

    invoke-virtual {v9, v10}, Ll/ۛܺܽ;->֫(I)Ljava/lang/String;

    move-result-object v9

    :goto_7
    const-string v10, ".dynsym"

    .line 165
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    .line 58
    :goto_8
    check-cast v8, Ll/ܰܺܽ;

    if-nez v8, :cond_9

    goto/16 :goto_17

    .line 88
    :cond_9
    iget-object v1, v8, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    iget-object v1, v1, Ll/ۙܺܽ;->ܽ:[Ll/ۤܺܽ;

    iget v6, v8, Ll/ۤܺܽ;->᩹:I

    aget-object v1, v1, v6

    .line 104
    iget-wide v6, v8, Ll/ۤܺܽ;->᩸:J

    const-wide/16 v9, 0x0

    cmp-long v1, v6, v9

    if-nez v1, :cond_a

    const/4 v1, 0x0

    goto :goto_9

    :cond_a
    iget-wide v9, v8, Ll/ۤܺܽ;->۬:J

    div-long/2addr v9, v6

    long-to-int v1, v9

    .line 25
    :goto_9
    new-array v6, v1, [Ll/ۨܺܽ;

    const/4 v7, 0x0

    :goto_a
    if-ge v7, v1, :cond_b

    .line 27
    invoke-virtual {v8, v7}, Ll/ܰܺܽ;->֫(I)Ll/ۨܺܽ;

    move-result-object v9

    aput-object v9, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    .line 63
    :cond_b
    new-array v7, v1, [Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_b
    if-ge v8, v1, :cond_e

    .line 65
    aget-object v10, v6, v8

    add-int/lit8 v11, v9, 0x1

    if-eqz v10, :cond_d

    .line 52
    iget-object v12, v10, Ll/ۨܺܽ;->ۧ:Ll/ۛܺܽ;

    if-nez v12, :cond_c

    goto :goto_c

    :cond_c
    iget v10, v10, Ll/ۨܺܽ;->֫:I

    invoke-virtual {v12, v10}, Ll/ۛܺܽ;->֫(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_d

    :cond_d
    :goto_c
    const/4 v10, 0x0

    .line 66
    :goto_d
    aput-object v10, v7, v9

    add-int/lit8 v8, v8, 0x1

    move v9, v11

    goto :goto_b

    :cond_e
    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_e
    if-ge v8, v1, :cond_1b

    .line 70
    aget-object v10, v7, v8

    move-object/from16 v11, p0

    if-eqz v10, :cond_1a

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1a

    .line 71
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v10

    if-ne v9, v10, :cond_19

    .line 0
    invoke-static/range {p2 .. p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 75
    aget-object v10, v7, v8

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v10, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 78
    aget-object v10, v6, v8

    iget-object v12, v10, Ll/ۨܺܽ;->ۧ:Ll/ۛܺܽ;

    .line 80
    iget-wide v12, v12, Ll/ۤܺܽ;->ۙ:J

    .line 78
    iget v10, v10, Ll/ۨܺܽ;->֫:I

    int-to-long v14, v10

    add-long/2addr v12, v14

    long-to-int v10, v12

    .line 80
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 81
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    if-nez v4, :cond_f

    goto :goto_13

    .line 88
    :cond_f
    aget-object v10, v7, v8

    invoke-static {v10}, Ll/᩶ܺܽ;->֫(Ljava/lang/String;)J

    move-result-wide v12

    int-to-long v14, v2

    rem-long/2addr v12, v14

    long-to-int v10, v12

    .line 89
    invoke-static {v9}, Ll/᩶ܺܽ;->֫(Ljava/lang/String;)J

    move-result-wide v12

    rem-long/2addr v12, v14

    long-to-int v9, v12

    if-eq v9, v10, :cond_18

    .line 90
    aget v12, v3, v9

    if-ne v12, v8, :cond_10

    goto :goto_13

    .line 96
    :cond_10
    aget v12, v3, v10

    if-ne v12, v8, :cond_11

    const/4 v13, 0x0

    .line 98
    aput v13, v3, v10

    goto :goto_10

    :cond_11
    const/4 v13, 0x0

    const/4 v10, 0x0

    .line 101
    :goto_f
    aget v14, v5, v12

    if-eqz v14, :cond_13

    add-int/lit8 v15, v10, 0x1

    array-length v13, v5

    if-ge v10, v13, :cond_13

    if-ne v14, v8, :cond_12

    const/4 v10, 0x0

    .line 103
    aput v10, v5, v12

    goto :goto_10

    :cond_12
    move v10, v15

    const/4 v13, 0x0

    goto :goto_f

    .line 110
    :cond_13
    :goto_10
    aget v10, v3, v9

    if-nez v10, :cond_14

    .line 111
    aput v8, v3, v9

    goto :goto_13

    :cond_14
    const/4 v9, 0x0

    .line 117
    :goto_11
    aget v12, v5, v10

    if-eqz v12, :cond_17

    add-int/lit8 v13, v9, 0x1

    .line 118
    array-length v14, v5

    if-eq v9, v14, :cond_16

    if-ne v12, v8, :cond_15

    goto :goto_12

    :cond_15
    move v10, v12

    move v9, v13

    goto :goto_11

    .line 119
    :cond_16
    new-instance v0, Ll/᩹ܺܽ;

    const-string v1, "Fix hash table failed"

    .line 11
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    throw v0

    :cond_17
    :goto_12
    if-nez v12, :cond_18

    .line 127
    aput v8, v5, v10

    :cond_18
    :goto_13
    const/4 v9, 0x1

    goto :goto_14

    .line 72
    :cond_19
    new-instance v0, Ll/۟ܺܽ;

    .line 5
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 72
    throw v0

    :cond_1a
    :goto_14
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_e

    :cond_1b
    const/4 v1, 0x0

    if-nez v9, :cond_1c

    goto :goto_18

    .line 140
    :cond_1c
    iget-wide v1, v4, Ll/ۤܺܽ;->ۙ:J

    long-to-int v2, v1

    add-int/lit8 v2, v2, 0x8

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 141
    array-length v1, v3

    const/4 v2, 0x0

    :goto_15
    if-ge v2, v1, :cond_1d

    aget v4, v3, v2

    .line 142
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    .line 143
    :cond_1d
    array-length v1, v5

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v1, :cond_1e

    aget v3, v5, v2

    .line 144
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    .line 146
    :cond_1e
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 147
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0

    :catch_0
    :goto_17
    const/4 v1, 0x0

    :goto_18
    return-object v1
.end method
