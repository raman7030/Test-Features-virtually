.class public final Ll/ۡۡۘ;
.super Ll/ۢۡۘ;
.source "R7ZR"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ll/ۢۡۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟ۢۘ;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 34
    invoke-super/range {p0 .. p1}, Ll/ۢۡۘ;->֫(Ll/۟ۢۘ;)Z

    .line 36
    iget-object v2, v0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    instance-of v2, v2, Ll/᩷ۡۘ;

    if-nez v2, :cond_0

    goto/16 :goto_a

    .line 40
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Ll/ۢۡۘ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "@"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    iget-object v2, v1, Ll/۟ۢۘ;->ۘ֫:[B

    .line 49
    iget-object v4, v0, Ll/ۢۡۘ;->ᩳ:Ljava/lang/String;

    .line 397
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v4, v5}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const/4 v5, 0x0

    .line 53
    :goto_0
    iget v6, v1, Ll/۟ۢۘ;->ܺ:I

    iget v7, v1, Ll/۟ۢۘ;->ۡ֫:I

    if-lt v6, v7, :cond_1

    goto/16 :goto_a

    .line 64
    :cond_1
    iget-object v6, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v6}, Ll/۠ۢۘ;->֫()V

    .line 65
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/16 v7, 0x32

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 66
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v4}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 67
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 397
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v8, "ssh-connection"

    .line 393
    invoke-virtual {v8, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    .line 67
    invoke-virtual {v6, v8}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 69
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const-string v8, "keyboard-interactive"

    .line 393
    invoke-virtual {v8, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    .line 69
    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 70
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    sget-object v7, Ll/᩵ۡۘ;->ܽ:[B

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 71
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v9, v7

    invoke-virtual {v6, v3, v9, v7}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 72
    iget-object v6, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v1, v6}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    const/4 v6, 0x1

    const/4 v7, 0x1

    .line 76
    :goto_1
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v1, v9}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v10, v9, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v11, 0x5

    aget-byte v10, v10, v11

    and-int/lit16 v10, v10, 0xff

    const/16 v11, 0x34

    if-ne v10, v11, :cond_2

    return v6

    :cond_2
    const/16 v11, 0x35

    if-ne v10, v11, :cond_3

    .line 83
    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 84
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->֫()I

    .line 85
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->֫()I

    .line 86
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v9

    .line 87
    iget-object v10, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v10}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 409
    array-length v10, v9

    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, v9, v3, v10, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_1

    :cond_3
    const/16 v11, 0x33

    if-ne v10, v11, :cond_7

    .line 95
    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 96
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->֫()I

    .line 97
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->֫()I

    .line 98
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v9

    .line 99
    iget-object v10, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v10}, Ll/ܺ᩻ۘ;->֫()I

    move-result v10

    if-nez v10, :cond_6

    if-eqz v7, :cond_4

    goto/16 :goto_a

    .line 112
    :cond_4
    iget v7, v1, Ll/۟ۢۘ;->ܺ:I

    add-int/2addr v7, v6

    iput v7, v1, Ll/۟ۢۘ;->ܺ:I

    if-nez v5, :cond_5

    goto/16 :goto_0

    .line 190
    :cond_5
    new-instance v1, Ll/ۗ᩷ۘ;

    .line 39
    invoke-direct {v1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 190
    throw v1

    .line 104
    :cond_6
    new-instance v1, Ll/ۛ᩷ۘ;

    .line 409
    array-length v2, v9

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v9, v3, v2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 104
    invoke-direct {v1, v5}, Ll/ۛ᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    const/16 v6, 0x3c

    if-ne v10, v6, :cond_13

    .line 117
    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 118
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->֫()I

    .line 119
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->֫()I

    .line 120
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    .line 409
    array-length v7, v6

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v6, v3, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 121
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    .line 409
    array-length v7, v6

    .line 405
    new-instance v11, Ljava/lang/String;

    invoke-direct {v11, v6, v3, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 122
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    invoke-static {v6}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    .line 123
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v6

    .line 124
    new-array v7, v6, [Ljava/lang/String;

    .line 125
    new-array v9, v6, [Z

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v6, :cond_9

    .line 127
    iget-object v13, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v13}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v13

    .line 409
    array-length v14, v13

    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 v16, v4

    .line 405
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v13, v3, v14, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 127
    aput-object v4, v7, v12

    .line 128
    iget-object v4, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->֫()I

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x1

    goto :goto_3

    :cond_8
    const/4 v4, 0x0

    :goto_3
    aput-boolean v4, v9, v12

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v4, v16

    goto :goto_2

    :cond_9
    move-object/from16 v16, v4

    const/4 v4, 0x0

    const/4 v12, 0x1

    if-eqz v2, :cond_a

    if-ne v6, v12, :cond_a

    .line 133
    aget-boolean v9, v9, v3

    if-nez v9, :cond_a

    aget-object v9, v7, v3

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 134
    invoke-virtual {v9, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v13, "password:"

    invoke-virtual {v9, v13}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    if-ltz v9, :cond_a

    new-array v7, v12, [[B

    aput-object v2, v7, v3

    move-object v2, v4

    move-object v4, v7

    goto :goto_6

    :cond_a
    if-gtz v6, :cond_b

    .line 138
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v9

    if-gtz v9, :cond_b

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_d

    .line 139
    :cond_b
    iget-object v9, v0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    if-eqz v9, :cond_d

    .line 140
    check-cast v9, Ll/᩷ۡۘ;

    .line 142
    invoke-interface {v9, v7}, Ll/᩷ۡۘ;->֫([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_d

    .line 144
    array-length v4, v7

    new-array v4, v4, [[B

    const/4 v9, 0x0

    .line 145
    :goto_4
    array-length v10, v7

    if-ge v9, v10, :cond_d

    .line 146
    aget-object v10, v7, v9

    if-eqz v10, :cond_c

    .line 397
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v10, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    goto :goto_5

    .line 146
    :cond_c
    sget-object v10, Ll/᩵ۡۘ;->ܽ:[B

    :goto_5
    aput-object v10, v4, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 157
    :cond_d
    :goto_6
    iget-object v7, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v7}, Ll/۠ۢۘ;->֫()V

    .line 158
    iget-object v7, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/16 v9, 0x3d

    invoke-virtual {v7, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    if-lez v6, :cond_11

    if-eqz v4, :cond_e

    .line 159
    array-length v7, v4

    if-eq v6, v7, :cond_11

    :cond_e
    if-nez v4, :cond_f

    .line 164
    iget-object v7, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v7, v6}, Ll/ܺ᩻ۘ;->ۧ(I)V

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v6, :cond_10

    .line 166
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    sget-object v10, Ll/᩵ۡۘ;->ܽ:[B

    invoke-virtual {v9, v10}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    .line 169
    :cond_f
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    :cond_10
    if-nez v4, :cond_12

    const/4 v5, 0x1

    goto :goto_9

    .line 175
    :cond_11
    iget-object v7, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v7, v6}, Ll/ܺ᩻ۘ;->ۧ(I)V

    const/4 v7, 0x0

    :goto_8
    if-ge v7, v6, :cond_12

    .line 177
    iget-object v9, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    aget-object v10, v4, v7

    invoke-virtual {v9, v10}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    .line 180
    :cond_12
    :goto_9
    iget-object v4, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v1, v4}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    const/4 v7, 0x0

    move-object/from16 v4, v16

    const/4 v6, 0x1

    goto/16 :goto_1

    :cond_13
    :goto_a
    return v3
.end method
