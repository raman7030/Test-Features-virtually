.class public final Ll/ۘۡۘ;
.super Ll/ۢۡۘ;
.source "77U5"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ll/ۢۡۘ;-><init>()V

    return-void
.end method

.method private ֫(Ll/۟ۢۘ;Ljava/util/Vector;Ljava/util/List;Ljava/util/List;)Z
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 125
    iget v2, v1, Ll/۟ۢۘ;->ܺ:I

    iget-object v3, v1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    iget v4, v1, Ll/۟ۢۘ;->ۡ֫:I

    if-lt v2, v4, :cond_0

    goto/16 :goto_15

    :cond_0
    const-string v2, "enable_pubkey_auth_query"

    .line 129
    invoke-virtual {v1, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "yes"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "try_additional_pubkey_algorithms"

    .line 131
    invoke-virtual {v1, v5}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 133
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 134
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 135
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "ssh-rsa"

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 136
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "rsa-sha2-256"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "rsa-sha2-512"

    .line 137
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "ssh-rsa-sha224@ssh.com"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "ssh-rsa-sha256@ssh.com"

    .line 138
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "ssh-rsa-sha384@ssh.com"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "ssh-rsa-sha512@ssh.com"

    .line 139
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    .line 142
    :cond_1
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 140
    :cond_2
    :goto_1
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 146
    :cond_3
    iget-object v7, v0, Ll/ۢۡۘ;->ᩳ:Ljava/lang/String;

    .line 397
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v7, v8}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v7

    .line 150
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object/from16 v10, p4

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_28

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֡᩷ۘ;

    .line 152
    iget v12, v1, Ll/۟ۢۘ;->ܺ:I

    iget v13, v1, Ll/۟ۢۘ;->ۡ֫:I

    if-lt v12, v13, :cond_4

    goto/16 :goto_15

    :cond_4
    const/4 v12, 0x5

    .line 386
    :goto_3
    invoke-interface {v11}, Ll/֡᩷ۘ;->ᩴ()Z

    move-result v13

    const-string v15, "publickey"

    const/16 v16, 0x0

    if-eqz v13, :cond_8

    .line 387
    iget-object v13, v0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    if-eqz v13, :cond_7

    .line 389
    invoke-interface {v11}, Ll/֡᩷ۘ;->ᩴ()Z

    move-result v13

    if-eqz v13, :cond_6

    iget-object v13, v0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    .line 390
    invoke-interface {v13}, Ll/ᩴۡۘ;->ܽ()Z

    move-result v13

    if-eqz v13, :cond_5

    goto :goto_4

    .line 391
    :cond_5
    new-instance v1, Ll/ۗ᩷ۘ;

    .line 39
    invoke-direct {v1, v15}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 391
    throw v1

    .line 395
    :cond_6
    :goto_4
    iget-object v13, v0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    invoke-interface {v13}, Ll/ᩴۡۘ;->֫()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_8

    .line 397
    sget-object v17, Ll/᩵ۡۘ;->ܽ:[B

    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v13

    goto :goto_5

    .line 388
    :cond_7
    new-instance v1, Ll/۫᩷ۘ;

    const-string v2, "USERAUTH fail"

    .line 39
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 388
    throw v1

    :cond_8
    move-object/from16 v13, v16

    .line 401
    :goto_5
    invoke-interface {v11}, Ll/֡᩷ۘ;->ᩴ()Z

    move-result v14

    if-eqz v14, :cond_9

    if-eqz v13, :cond_a

    .line 402
    :cond_9
    invoke-interface {v11, v13}, Ll/֡᩷ۘ;->֫([B)Z

    move-result v14

    if-eqz v14, :cond_a

    if-eqz v13, :cond_b

    .line 3333
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ۧ()Ll/֨᩷ۘ;

    move-result-object v12

    .line 404
    instance-of v12, v12, Ll/۠᩷ۘ;

    if-eqz v12, :cond_b

    .line 3333
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ۧ()Ll/֨᩷ۘ;

    move-result-object v12

    .line 405
    check-cast v12, Ll/۠᩷ۘ;

    invoke-virtual {v12}, Ll/۠᩷ۘ;->ܽ()V

    goto :goto_6

    .line 410
    :cond_a
    invoke-static {v13}, Ll/᩵ۡۘ;->ۧ([B)V

    add-int/lit8 v12, v12, -0x1

    if-nez v12, :cond_27

    move-object/from16 v13, v16

    .line 417
    :cond_b
    :goto_6
    invoke-static {v13}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 160
    invoke-interface {v11}, Ll/֡᩷ۘ;->֫()Ljava/lang/String;

    move-result-object v12

    .line 162
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const/4 v14, 0x1

    if-eqz v13, :cond_c

    .line 163
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_7

    .line 164
    :cond_c
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    .line 165
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 166
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v12, v13

    goto :goto_7

    :cond_d
    move-object/from16 v12, v16

    :goto_7
    if-eqz v12, :cond_25

    .line 168
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_e

    goto/16 :goto_12

    :cond_e
    const/4 v14, 0x5

    .line 176
    :goto_8
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_24

    iget v13, v1, Ll/۟ۢۘ;->ܺ:I

    move-object/from16 v17, v5

    iget v5, v1, Ll/۟ۢۘ;->ۡ֫:I

    if-ge v13, v5, :cond_23

    .line 178
    invoke-interface {v11}, Ll/֡᩷ۘ;->ۧ()[B

    move-result-object v5

    const-string v13, "ssh-connection"

    if-eqz v5, :cond_14

    if-eqz v2, :cond_14

    .line 183
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    const/16 v19, 0x33

    .line 184
    :goto_9
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_13

    .line 185
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move/from16 v21, v2

    move-object/from16 v2, v20

    check-cast v2, Ljava/lang/String;

    .line 186
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->remove()V

    .line 187
    invoke-interface {v10, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_f

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v2, v21

    goto :goto_9

    :cond_f
    move-object/from16 v20, v6

    .line 203
    iget-object v6, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v6}, Ll/۠ۢۘ;->֫()V

    .line 204
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    move-object/from16 p2, v8

    const/16 v8, 0x32

    invoke-virtual {v6, v8}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 205
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 206
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 397
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 p3, v9

    .line 393
    invoke-virtual {v13, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v9

    .line 206
    invoke-virtual {v6, v9}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 207
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 393
    invoke-virtual {v15, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v9

    .line 207
    invoke-virtual {v6, v9}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 208
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/4 v9, 0x0

    invoke-virtual {v6, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 209
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 397
    invoke-static {v2, v8}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v8

    .line 209
    invoke-virtual {v6, v8}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 210
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v8, v5

    invoke-virtual {v6, v9, v8, v5}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 211
    iget-object v6, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v1, v6}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 214
    :goto_a
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v1, v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v8, v6, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v8, v8, v14

    and-int/lit16 v8, v8, 0xff

    const/16 v9, 0x3c

    if-ne v8, v9, :cond_10

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v6

    .line 218
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    new-instance v6, Ljava/util/ArrayList;

    const/4 v9, 0x1

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 222
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v23, v10

    goto :goto_c

    :cond_10
    const/16 v9, 0x33

    if-ne v8, v9, :cond_11

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 225
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v10

    goto :goto_b

    :cond_11
    const/16 v9, 0x35

    if-ne v8, v9, :cond_12

    .line 230
    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 231
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->֫()I

    .line 232
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->֫()I

    .line 233
    iget-object v6, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    .line 234
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v8}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 409
    array-length v8, v6

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 v22, v2

    .line 405
    new-instance v2, Ljava/lang/String;

    move-object/from16 v23, v10

    const/4 v10, 0x0

    invoke-direct {v2, v6, v10, v8, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    move-object/from16 v2, v22

    move-object/from16 v10, v23

    goto :goto_a

    :cond_12
    move-object/from16 v23, v10

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_b
    move-object/from16 v9, p3

    move/from16 v19, v8

    move-object/from16 v6, v20

    move/from16 v2, v21

    move-object/from16 v10, v23

    move-object/from16 v8, p2

    goto/16 :goto_9

    :cond_13
    move/from16 v21, v2

    move-object/from16 v20, v6

    move-object/from16 p2, v8

    move-object/from16 p3, v9

    move-object/from16 v23, v10

    move-object/from16 v6, v16

    move/from16 v8, v19

    :goto_c
    const/16 v2, 0x3c

    if-eq v8, v2, :cond_15

    goto :goto_d

    :cond_14
    move/from16 v21, v2

    move-object/from16 v20, v6

    move-object/from16 p2, v8

    move-object/from16 p3, v9

    move-object/from16 v23, v10

    move-object/from16 v6, v16

    .line 257
    :cond_15
    invoke-interface {v11}, Ll/֡᩷ۘ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_d

    :cond_16
    if-nez v5, :cond_17

    .line 260
    invoke-interface {v11}, Ll/֡᩷ۘ;->ۧ()[B

    move-result-object v5

    :cond_17
    if-nez v5, :cond_18

    goto :goto_d

    :cond_18
    if-nez v6, :cond_19

    move-object v6, v12

    .line 268
    :cond_19
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1a

    :goto_d
    move-object/from16 v10, v23

    goto/16 :goto_14

    .line 271
    :cond_1a
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object/from16 v10, v23

    .line 272
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_22

    iget v6, v1, Ll/۟ۢۘ;->ܺ:I

    iget v8, v1, Ll/۟ۢۘ;->ۡ֫:I

    if-ge v6, v8, :cond_22

    .line 273
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 274
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 275
    invoke-interface {v10, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v6

    .line 276
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_e

    .line 292
    :cond_1b
    iget-object v8, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v8}, Ll/۠ۢۘ;->֫()V

    .line 293
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/16 v9, 0x32

    invoke-virtual {v8, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 294
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v8, v7}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 295
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 397
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v13, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    .line 295
    invoke-virtual {v8, v10}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 296
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 393
    invoke-virtual {v15, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    .line 296
    invoke-virtual {v8, v10}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 297
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/4 v10, 0x1

    invoke-virtual {v8, v10}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 298
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 397
    invoke-static {v6, v9}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v9

    .line 298
    invoke-virtual {v8, v9}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 299
    iget-object v8, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v9, v5

    const/4 v10, 0x0

    invoke-virtual {v8, v10, v9, v5}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 305
    invoke-virtual/range {p1 .. p1}, Ll/۟ۢۘ;->ܳ()[B

    move-result-object v8

    .line 306
    array-length v9, v8

    add-int/lit8 v10, v9, 0x4

    .line 307
    iget-object v14, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    iget v14, v14, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v14, v10

    add-int/lit8 v14, v14, -0x5

    new-array v14, v14, [B

    move-object/from16 v18, v2

    ushr-int/lit8 v2, v9, 0x18

    int-to-byte v2, v2

    const/16 v19, 0x0

    .line 308
    aput-byte v2, v14, v19

    ushr-int/lit8 v2, v9, 0x10

    int-to-byte v2, v2

    const/16 v19, 0x1

    .line 309
    aput-byte v2, v14, v19

    ushr-int/lit8 v2, v9, 0x8

    int-to-byte v2, v2

    const/16 v19, 0x2

    .line 310
    aput-byte v2, v14, v19

    const/4 v2, 0x3

    move-object/from16 v19, v5

    int-to-byte v5, v9

    .line 311
    aput-byte v5, v14, v2

    const/4 v2, 0x4

    const/4 v5, 0x0

    .line 312
    invoke-static {v8, v5, v14, v2, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 313
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    iget-object v5, v2, Ll/ܺ᩻ۘ;->֫:[B

    iget v2, v2, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/lit8 v2, v2, -0x5

    const/4 v8, 0x5

    invoke-static {v5, v8, v14, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 314
    invoke-interface {v11, v6, v14}, Ll/֡᩷ۘ;->֫(Ljava/lang/String;[B)[B

    move-result-object v2

    if-nez v2, :cond_1c

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 316
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_10

    .line 321
    :cond_1c
    iget-object v5, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v6, v2

    const/4 v8, 0x0

    invoke-virtual {v5, v8, v6, v2}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 322
    iget-object v2, v0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v1, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 325
    :goto_f
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v1, v2}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v5, v2, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v6, 0x5

    aget-byte v5, v5, v6

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x34

    if-ne v5, v6, :cond_1d

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    return v1

    :cond_1d
    const/16 v6, 0x35

    if-ne v5, v6, :cond_1e

    .line 334
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 335
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->֫()I

    .line 336
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->֫()I

    .line 337
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v2

    .line 338
    iget-object v5, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 409
    array-length v5, v2

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v8, Ljava/lang/String;

    const/4 v9, 0x0

    invoke-direct {v8, v2, v9, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_f

    :cond_1e
    const/16 v6, 0x33

    if-ne v5, v6, :cond_21

    .line 345
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 346
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->֫()I

    .line 347
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->֫()I

    .line 348
    iget-object v2, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v2

    .line 349
    iget-object v5, v0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->֫()I

    move-result v5

    if-nez v5, :cond_20

    .line 355
    iget v2, v1, Ll/۟ۢۘ;->ܺ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Ll/۟ۢۘ;->ܺ:I

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 356
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    iget v2, v1, Ll/۟ۢۘ;->ܺ:I

    iget v5, v1, Ll/۟ۢۘ;->ۡ֫:I

    if-lt v2, v5, :cond_1f

    goto/16 :goto_15

    :cond_1f
    if-eqz v4, :cond_26

    goto :goto_10

    .line 353
    :cond_20
    new-instance v1, Ll/ۛ᩷ۘ;

    .line 409
    array-length v3, v2

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v2, v6, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 353
    invoke-direct {v1, v5}, Ll/ۛ᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v1

    .line 3560
    :cond_21
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 370
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_10
    move-object/from16 v10, p4

    move-object/from16 v2, v18

    move-object/from16 v5, v19

    goto/16 :goto_e

    :cond_22
    const/4 v14, 0x5

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v5, v17

    move-object/from16 v6, v20

    move/from16 v2, v21

    goto/16 :goto_8

    :cond_23
    move/from16 v21, v2

    goto :goto_11

    :cond_24
    move/from16 v21, v2

    move-object/from16 v17, v5

    :goto_11
    move-object/from16 v20, v6

    move-object/from16 p2, v8

    move-object/from16 p3, v9

    goto :goto_13

    :cond_25
    :goto_12
    move/from16 v21, v2

    move-object/from16 v17, v5

    move-object/from16 v20, v6

    move-object/from16 p2, v8

    move-object/from16 p3, v9

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_26
    :goto_13
    move-object/from16 v10, p4

    :goto_14
    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v5, v17

    move-object/from16 v6, v20

    move/from16 v2, v21

    goto/16 :goto_2

    :cond_27
    move-object/from16 v10, p4

    goto/16 :goto_3

    :cond_28
    :goto_15
    const/4 v1, 0x0

    return v1
.end method


# virtual methods
.method public final ֫(Ll/۟ۢۘ;)Z
    .locals 12

    .line 40
    invoke-super {p0, p1}, Ll/ۢۡۘ;->֫(Ll/۟ۢۘ;)Z

    .line 3333
    iget-object v0, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ۧ()Ll/֨᩷ۘ;

    move-result-object v0

    .line 42
    invoke-interface {v0}, Ll/֨᩷ۘ;->֫()Ljava/util/Vector;

    move-result-object v1

    move-object v0, v1

    .line 44
    monitor-enter v0

    .line 45
    :try_start_0
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v2

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    .line 46
    monitor-exit v0

    return v3

    :cond_0
    const-string v2, "PubkeyAcceptedAlgorithms"

    .line 49
    invoke-virtual {p1, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3560
    iget-object v4, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v4}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-virtual {p1}, Ll/۟ۢۘ;->ۜ()[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 55
    array-length v5, v4

    if-lez v5, :cond_1

    .line 56
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 57
    :cond_1
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 58
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    .line 3560
    iget-object v5, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v5}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    :cond_2
    invoke-static {v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 66
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 67
    monitor-exit v0

    return v3

    .line 70
    :cond_3
    invoke-virtual {p1}, Ll/۟ۢۘ;->ܿ()[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 71
    array-length v5, v3

    if-lez v5, :cond_a

    .line 72
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 73
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 74
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 76
    array-length v9, v3

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_5

    aget-object v11, v3, v10

    .line 77
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 84
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 86
    :cond_5
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 90
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    .line 3560
    iget-object v3, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    :cond_7
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_8

    .line 3560
    iget-object v3, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_b

    .line 105
    invoke-direct {p0, p1, v1, v5, v4}, Ll/ۘۡۘ;->֫(Ll/۟ۢۘ;Ljava/util/Vector;Ljava/util/List;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 p1, 0x1

    .line 107
    monitor-exit v0

    return p1

    .line 110
    :cond_9
    invoke-direct {p0, p1, v1, v6, v4}, Ll/ۘۡۘ;->֫(Ll/۟ۢۘ;Ljava/util/Vector;Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    monitor-exit v0

    return p1

    .line 3560
    :cond_a
    iget-object v3, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    :cond_b
    invoke-direct {p0, p1, v1, v2, v4}, Ll/ۘۡۘ;->֫(Ll/۟ۢۘ;Ljava/util/Vector;Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 120
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
