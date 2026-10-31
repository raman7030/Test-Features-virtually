.class public final Ll/ܰۜۧ;
.super Ljava/lang/Object;
.source "48PJ"


# static fields
.field public static final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    .line 145
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܰۜۧ;->֫:[I

    return-void

    :array_0
    .array-data 4
        0x7d2
        0x7d0
        0x780
        0x641
        0x640
        0x3e9
        0x3e8
        0x3c0
        0x320
        0x320
        0x1e0
        0x190
        0x190
        0x800
    .end array-data
.end method

.method public static ֫(Ll/ᩳ֨֫;Ljava/lang/String;Ljava/lang/String;Ll/᩵ᩴ֫;)Ll/۠ᩴ֫;
    .locals 17

    .line 182
    new-instance v0, Ll/ܽ֨֫;

    invoke-direct {v0}, Ll/ܽ֨֫;-><init>()V

    move-object/from16 v1, p0

    .line 183
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->֫(Ll/ᩳ֨֫;)V

    .line 185
    invoke-virtual {v0}, Ll/ܽ֨֫;->֫()I

    move-result v1

    const/4 v2, 0x3

    .line 186
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    const/4 v4, 0x1

    if-gt v3, v4, :cond_37

    const/4 v5, 0x7

    .line 192
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 193
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_0

    const v6, 0xbb80

    goto :goto_0

    :cond_0
    const v6, 0xac44

    :goto_0
    const/4 v7, 0x4

    .line 194
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v7, 0x9

    .line 195
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v7

    const/16 v8, 0x10

    if-le v5, v4, :cond_2

    if-eqz v3, :cond_1

    .line 202
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 203
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 204
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x80

    .line 205
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_1

    .line 199
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_2
    :goto_1
    const/16 v9, 0x42

    if-ne v3, v4, :cond_4

    .line 608
    invoke-virtual {v0}, Ll/ܽ֨֫;->֫()I

    move-result v10

    if-lt v10, v9, :cond_3

    .line 611
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ܿ(I)V

    .line 214
    invoke-virtual {v0}, Ll/ܽ֨֫;->ۧ()V

    goto :goto_2

    :cond_3
    const-string v0, "Invalid AC-4 DSI bitrate."

    .line 212
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 217
    :cond_4
    :goto_2
    new-instance v9, Ll/ۨۜۧ;

    .line 829
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 830
    iput-boolean v4, v9, Ll/ۨۜۧ;->ܽ:Z

    const/4 v10, -0x1

    .line 831
    iput v10, v9, Ll/ۨۜۧ;->֫:I

    .line 832
    iput v10, v9, Ll/ۨۜۧ;->ܿ:I

    .line 833
    iput-boolean v4, v9, Ll/ۨۜۧ;->ۧ:Z

    const/4 v10, 0x2

    .line 834
    iput v10, v9, Ll/ۨۜۧ;->ܳ:I

    .line 835
    iput v4, v9, Ll/ۨۜۧ;->᩻:I

    const/4 v4, 0x0

    .line 836
    iput v4, v9, Ll/ۨۜۧ;->ᩳ:I

    :goto_3
    const/4 v12, 0x6

    const/4 v13, 0x5

    const/16 v14, 0x8

    if-ge v4, v7, :cond_28

    if-nez v3, :cond_5

    .line 227
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v7

    .line 228
    invoke-virtual {v0, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    .line 229
    invoke-virtual {v0, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto :goto_5

    .line 231
    :cond_5
    invoke-virtual {v0, v14}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v15

    .line 232
    invoke-virtual {v0, v14}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v14

    const/16 v11, 0xff

    if-ne v14, v11, :cond_6

    .line 234
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    add-int/2addr v14, v11

    :cond_6
    if-le v15, v10, :cond_7

    mul-int/lit8 v14, v14, 0x8

    .line 237
    invoke-virtual {v0, v14}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 241
    :cond_7
    invoke-virtual {v0}, Ll/ܽ֨֫;->֫()I

    move-result v7

    sub-int v7, v1, v7

    div-int/lit8 v7, v7, 0x8

    .line 244
    invoke-virtual {v0, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    const/16 v10, 0x1f

    if-ne v8, v10, :cond_8

    const/4 v10, 0x1

    goto :goto_4

    :cond_8
    const/4 v10, 0x0

    :goto_4
    const/4 v11, 0x0

    move v13, v14

    move v14, v7

    const/4 v7, 0x0

    move/from16 v16, v15

    move v15, v10

    move/from16 v10, v16

    .line 247
    :goto_5
    iput v10, v9, Ll/ۨۜۧ;->᩻:I

    const/16 v11, 0xf

    if-nez v7, :cond_9

    if-nez v15, :cond_9

    if-ne v8, v12, :cond_9

    const/4 v2, 0x1

    goto/16 :goto_11

    .line 253
    :cond_9
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    iput v2, v9, Ll/ۨۜۧ;->ᩳ:I

    .line 255
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x5

    .line 256
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_a
    const/4 v2, 0x2

    .line 259
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v12, 0x1

    if-ne v3, v12, :cond_c

    if-eq v10, v12, :cond_b

    if-ne v10, v2, :cond_c

    .line 261
    :cond_b
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_c
    const/4 v2, 0x5

    .line 263
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v2, 0xa

    .line 264
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    if-ne v3, v12, :cond_15

    if-lez v10, :cond_d

    .line 268
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    iput-boolean v2, v9, Ll/ۨۜۧ;->ܽ:Z

    .line 271
    :cond_d
    iget-boolean v2, v9, Ll/ۨۜۧ;->ܽ:Z

    if-eqz v2, :cond_12

    if-eq v10, v12, :cond_e

    const/4 v2, 0x2

    if-ne v10, v2, :cond_11

    :cond_e
    const/4 v2, 0x5

    .line 273
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-ltz v2, :cond_f

    if-gt v2, v11, :cond_f

    .line 275
    iput v2, v9, Ll/ۨۜۧ;->֫:I

    :cond_f
    const/16 v11, 0xb

    if-lt v2, v11, :cond_10

    const/16 v11, 0xe

    if-gt v2, v11, :cond_10

    .line 280
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    iput-boolean v2, v9, Ll/ۨۜۧ;->ۧ:Z

    const/4 v2, 0x2

    .line 282
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    iput v11, v9, Ll/ۨۜۧ;->ܳ:I

    goto :goto_6

    :cond_10
    const/4 v2, 0x2

    :cond_11
    :goto_6
    const/16 v11, 0x18

    .line 286
    invoke-virtual {v0, v11}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_7

    :cond_12
    const/4 v2, 0x2

    :goto_7
    const/4 v11, 0x1

    if-eq v10, v11, :cond_13

    if-ne v10, v2, :cond_15

    .line 290
    :cond_13
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v11

    if-eqz v11, :cond_14

    .line 291
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v11

    if-eqz v11, :cond_14

    .line 292
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 295
    :cond_14
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 298
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܳ()V

    const/16 v2, 0x8

    .line 299
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    const/4 v12, 0x0

    :goto_8
    if-ge v12, v11, :cond_15

    .line 301
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v12, v12, 0x1

    const/16 v2, 0x8

    goto :goto_8

    :cond_15
    if-nez v7, :cond_1d

    if-eqz v15, :cond_16

    goto/16 :goto_f

    .line 315
    :cond_16
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܳ()V

    if-eqz v8, :cond_1b

    const/4 v2, 0x1

    if-eq v8, v2, :cond_1b

    const/4 v2, 0x2

    if-eq v8, v2, :cond_1b

    const/4 v2, 0x3

    if-eq v8, v2, :cond_19

    const/4 v2, 0x4

    if-eq v8, v2, :cond_19

    const/4 v2, 0x5

    if-eq v8, v2, :cond_17

    const/4 v2, 0x7

    .line 355
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v7, 0x0

    :goto_9
    if-ge v7, v2, :cond_1f

    const/16 v8, 0x8

    .line 357
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_17
    if-nez v10, :cond_18

    .line 344
    invoke-static {v0, v9}, Ll/ܰۜۧ;->֫(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    goto :goto_10

    :cond_18
    const/4 v2, 0x3

    .line 346
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v7, 0x0

    :goto_a
    add-int/lit8 v8, v2, 0x2

    if-ge v7, v8, :cond_1f

    .line 350
    invoke-static {v0, v9}, Ll/ܰۜۧ;->ۧ(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_19
    if-nez v10, :cond_1a

    const/4 v2, 0x0

    const/4 v7, 0x3

    :goto_b
    if-ge v2, v7, :cond_1f

    .line 334
    invoke-static {v0, v9}, Ll/ܰۜۧ;->֫(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_1a
    const/4 v2, 0x0

    :goto_c
    const/4 v7, 0x3

    if-ge v2, v7, :cond_1f

    .line 338
    invoke-static {v0, v9}, Ll/ܰۜۧ;->ۧ(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_1b
    if-nez v10, :cond_1c

    const/4 v2, 0x0

    const/4 v7, 0x2

    :goto_d
    if-ge v2, v7, :cond_1f

    .line 322
    invoke-static {v0, v9}, Ll/ܰۜۧ;->֫(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_1c
    const/4 v2, 0x0

    :goto_e
    const/4 v7, 0x2

    if-ge v2, v7, :cond_1f

    .line 326
    invoke-static {v0, v9}, Ll/ܰۜۧ;->ۧ(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_1d
    :goto_f
    if-nez v10, :cond_1e

    .line 309
    invoke-static {v0, v9}, Ll/ܰۜۧ;->֫(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    goto :goto_10

    .line 311
    :cond_1e
    invoke-static {v0, v9}, Ll/ܰۜۧ;->ۧ(Ll/ܽ֨֫;Ll/ۨۜۧ;)V

    .line 362
    :cond_1f
    :goto_10
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܳ()V

    .line 363
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    :goto_11
    if-eqz v2, :cond_20

    const/4 v2, 0x7

    .line 366
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v7, 0x0

    :goto_12
    if-ge v7, v2, :cond_20

    const/16 v8, 0xf

    .line 368
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_20
    if-lez v10, :cond_24

    .line 373
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_23

    .line 608
    invoke-virtual {v0}, Ll/ܽ֨֫;->֫()I

    move-result v2

    const/16 v7, 0x42

    if-ge v2, v7, :cond_21

    const/4 v2, 0x0

    goto :goto_13

    .line 611
    :cond_21
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v2, 0x1

    :goto_13
    if-eqz v2, :cond_22

    goto :goto_14

    :cond_22
    const-string v0, "Can\'t parse bitrate DSI."

    .line 375
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 379
    :cond_23
    :goto_14
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_24

    .line 380
    invoke-virtual {v0}, Ll/ܽ֨֫;->ۧ()V

    const/16 v2, 0x10

    .line 381
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 382
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܳ(I)V

    const/4 v2, 0x5

    .line 384
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v7, 0x0

    :goto_15
    if-ge v7, v2, :cond_24

    const/4 v8, 0x3

    .line 386
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v8, 0x8

    .line 387
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_15

    :cond_24
    const/16 v2, 0x8

    .line 392
    invoke-virtual {v0}, Ll/ܽ֨֫;->ۧ()V

    const/4 v7, 0x1

    if-ne v3, v7, :cond_26

    .line 395
    invoke-virtual {v0}, Ll/ܽ֨֫;->֫()I

    move-result v3

    sub-int/2addr v1, v3

    div-int/2addr v1, v2

    sub-int/2addr v1, v14

    if-lt v13, v1, :cond_25

    sub-int/2addr v13, v1

    .line 402
    invoke-virtual {v0, v13}, Ll/ܽ֨֫;->ܳ(I)V

    goto :goto_16

    :cond_25
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    .line 398
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 406
    :cond_26
    :goto_16
    iget-boolean v0, v9, Ll/ۨۜۧ;->ܽ:Z

    if-eqz v0, :cond_28

    iget v0, v9, Ll/ۨۜۧ;->֫:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_27

    goto :goto_17

    .line 407
    :cond_27
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t determine channel mode of presentation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 414
    :cond_28
    :goto_17
    iget-boolean v0, v9, Ll/ۨۜۧ;->ܽ:Z

    const/16 v1, 0xc

    if-eqz v0, :cond_2d

    .line 415
    iget v0, v9, Ll/ۨۜۧ;->֫:I

    iget-boolean v2, v9, Ll/ۨۜۧ;->ۧ:Z

    iget v3, v9, Ll/ۨۜۧ;->ܳ:I

    const/16 v4, 0xd

    const/16 v7, 0xb

    packed-switch v0, :pswitch_data_0

    const/4 v8, -0x1

    goto :goto_18

    :pswitch_0
    const/16 v8, 0x18

    goto :goto_18

    :pswitch_1
    const/16 v8, 0xe

    goto :goto_18

    :pswitch_2
    const/16 v8, 0xd

    goto :goto_18

    :pswitch_3
    const/16 v8, 0xc

    goto :goto_18

    :pswitch_4
    const/16 v8, 0xb

    goto :goto_18

    :pswitch_5
    const/16 v8, 0x8

    goto :goto_18

    :pswitch_6
    const/4 v8, 0x7

    goto :goto_18

    :pswitch_7
    const/4 v8, 0x6

    goto :goto_18

    :pswitch_8
    const/4 v8, 0x5

    goto :goto_18

    :pswitch_9
    const/4 v8, 0x3

    goto :goto_18

    :pswitch_a
    const/4 v8, 0x2

    goto :goto_18

    :pswitch_b
    const/4 v8, 0x1

    :goto_18
    if-eq v0, v7, :cond_29

    if-eq v0, v1, :cond_29

    if-eq v0, v4, :cond_29

    const/16 v1, 0xe

    if-ne v0, v1, :cond_35

    :cond_29
    if-nez v2, :cond_2a

    add-int/lit8 v8, v8, -0x2

    :cond_2a
    if-eqz v3, :cond_2c

    const/4 v0, 0x1

    if-eq v3, v0, :cond_2b

    goto :goto_1a

    :cond_2b
    add-int/lit8 v8, v8, -0x2

    goto :goto_1a

    :cond_2c
    add-int/lit8 v8, v8, -0x4

    goto :goto_1a

    .line 421
    :cond_2d
    iget v0, v9, Ll/ۨۜۧ;->ܿ:I

    if-lez v0, :cond_2f

    add-int/lit8 v0, v0, 0x1

    .line 437
    iget v1, v9, Ll/ۨۜۧ;->ᩳ:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2e

    const/16 v1, 0x11

    if-ne v0, v1, :cond_2e

    const/16 v0, 0x15

    const/16 v8, 0x15

    goto :goto_1a

    :cond_2e
    move v8, v0

    goto :goto_1a

    .line 446
    :cond_2f
    iget v0, v9, Ll/ۨۜۧ;->ᩳ:I

    if-eqz v0, :cond_34

    const/4 v1, 0x1

    if-eq v0, v1, :cond_33

    const/4 v1, 0x2

    if-eq v0, v1, :cond_32

    const/4 v1, 0x3

    if-eq v0, v1, :cond_31

    const/4 v1, 0x4

    if-eq v0, v1, :cond_30

    .line 466
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AC-4 level "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v9, Ll/ۨۜۧ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " has not been defined."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_19

    :cond_30
    const/16 v8, 0xc

    goto :goto_1a

    :cond_31
    const/16 v8, 0xa

    goto :goto_1a

    :cond_32
    const/16 v8, 0x8

    goto :goto_1a

    :cond_33
    const/4 v8, 0x6

    goto :goto_1a

    :cond_34
    :goto_19
    const/4 v8, 0x2

    :cond_35
    :goto_1a
    if-lez v8, :cond_36

    .line 478
    iget v0, v9, Ll/ۨۜۧ;->᩻:I

    iget v1, v9, Ll/ۨۜۧ;->ᩳ:I

    .line 687
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    .line 686
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "ac-4.%02d.%02d.%02d"

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 481
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    move-object/from16 v2, p1

    .line 482
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v2, "audio/ac4"

    .line 483
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 484
    invoke-virtual {v1, v8}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 485
    invoke-virtual {v1, v6}, Ll/֨ᩴ֫;->۠(I)V

    move-object/from16 v2, p3

    .line 486
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    move-object/from16 v2, p2

    .line 487
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 488
    invoke-virtual {v1, v0}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 489
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    return-object v0

    :cond_36
    const-string v0, "Cannot determine channel count of presentation."

    .line 474
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 188
    :cond_37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ܽ֨֫;)Ll/᩺ۜۧ;
    .locals 9

    const/16 v0, 0x10

    .line 699
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 701
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    const v2, 0xffff

    const/4 v3, 0x4

    if-ne v0, v2, :cond_0

    const/16 v0, 0x18

    .line 704
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    const/4 v2, 0x7

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    :goto_0
    add-int/2addr v0, v2

    const v2, 0xac41

    if-ne v1, v2, :cond_1

    add-int/lit8 v0, v0, 0x2

    :cond_1
    const/4 v1, 0x2

    .line 711
    invoke-virtual {p0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v4, 0x3

    if-ne v2, v4, :cond_3

    .line 809
    :cond_2
    invoke-virtual {p0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    .line 810
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_3
    const/16 v2, 0xa

    .line 715
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 716
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 717
    invoke-virtual {p0, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    if-lez v5, :cond_4

    .line 718
    invoke-virtual {p0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 721
    :cond_4
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    const v6, 0xac44

    const v7, 0xbb80

    if-eqz v5, :cond_5

    const v5, 0xbb80

    goto :goto_1

    :cond_5
    const v5, 0xac44

    .line 722
    :goto_1
    invoke-virtual {p0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p0

    .line 724
    sget-object v8, Ll/ܰۜۧ;->֫:[I

    if-ne v5, v6, :cond_6

    const/16 v6, 0xd

    if-ne p0, v6, :cond_6

    .line 725
    aget p0, v8, p0

    goto :goto_4

    :cond_6
    if-ne v5, v7, :cond_c

    const/16 v6, 0xe

    if-ge p0, v6, :cond_c

    .line 727
    aget v6, v8, p0

    .line 728
    rem-int/lit8 v2, v2, 0x5

    const/16 v7, 0x8

    const/4 v8, 0x1

    if-eq v2, v8, :cond_9

    const/16 v8, 0xb

    if-eq v2, v1, :cond_8

    if-eq v2, v4, :cond_9

    if-eq v2, v3, :cond_7

    goto :goto_2

    :cond_7
    if-eq p0, v4, :cond_b

    if-eq p0, v7, :cond_b

    if-ne p0, v8, :cond_a

    goto :goto_3

    :cond_8
    if-eq p0, v7, :cond_b

    if-ne p0, v8, :cond_a

    goto :goto_3

    :cond_9
    if-eq p0, v4, :cond_b

    if-ne p0, v7, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    move p0, v6

    goto :goto_4

    :cond_b
    :goto_3
    add-int/lit8 p0, v6, 0x1

    goto :goto_4

    :cond_c
    const/4 p0, 0x0

    .line 749
    :goto_4
    new-instance v1, Ll/᩺ۜۧ;

    invoke-direct {v1, v5, v0, p0}, Ll/᩺ۜۧ;-><init>(III)V

    return-object v1
.end method

.method public static ֫(ILl/ᩳ֨֫;)V
    .locals 2

    const/4 v0, 0x7

    .line 795
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 796
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    const/4 v0, 0x0

    const/16 v1, -0x54

    .line 797
    aput-byte v1, p1, v0

    const/4 v0, 0x1

    const/16 v1, 0x40

    .line 798
    aput-byte v1, p1, v0

    const/4 v0, 0x2

    const/4 v1, -0x1

    .line 799
    aput-byte v1, p1, v0

    const/4 v0, 0x3

    .line 800
    aput-byte v1, p1, v0

    shr-int/lit8 v0, p0, 0x10

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x4

    .line 801
    aput-byte v0, p1, v1

    shr-int/lit8 v0, p0, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x5

    .line 802
    aput-byte v0, p1, v1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    const/4 v0, 0x6

    .line 803
    aput-byte p0, p1, v0

    return-void
.end method

.method public static ֫(Ll/ܽ֨֫;Ll/ۨۜۧ;)V
    .locals 4

    const/4 v0, 0x5

    .line 505
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    const/4 v2, 0x2

    .line 506
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 508
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 509
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_0
    const/4 v0, 0x7

    if-lt v1, v0, :cond_1

    const/16 v0, 0xa

    if-gt v1, v0, :cond_1

    .line 512
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܳ()V

    .line 515
    :cond_1
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    .line 516
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    .line 520
    iget v2, p1, Ll/ۨۜۧ;->֫:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_3

    if-ltz v1, :cond_3

    const/16 v2, 0xf

    if-gt v1, v2, :cond_3

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    .line 523
    :cond_2
    iput v1, p1, Ll/ۨۜۧ;->֫:I

    .line 526
    :cond_3
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 527
    invoke-static {p0}, Ll/ܰۜۧ;->ۧ(Ll/ܽ֨֫;)V

    :cond_4
    return-void
.end method

.method public static ۧ(Ll/ܽ֨֫;)V
    .locals 2

    const/4 v0, 0x6

    .line 586
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/16 v1, 0x2a

    if-gt v0, v1, :cond_0

    mul-int/lit8 v0, v0, 0x8

    .line 594
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    return-void

    .line 591
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "Invalid language tag bytes number: %d. Must be between 2 and 42."

    .line 589
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 588
    invoke-static {p0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ll/ܽ֨֫;Ll/ۨۜۧ;)V
    .locals 6

    const/4 v0, 0x2

    .line 545
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    .line 546
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    const/16 v2, 0x8

    .line 547
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    .line 550
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    .line 551
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x5

    .line 552
    invoke-virtual {p0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_0
    if-eqz v1, :cond_1

    const/16 v4, 0x18

    .line 555
    invoke-virtual {p0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_1

    .line 557
    :cond_1
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_3

    .line 558
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v4

    if-nez v4, :cond_2

    .line 559
    invoke-virtual {p0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_2
    const/4 v4, 0x6

    .line 561
    invoke-virtual {p0, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    iput v4, p1, Ll/ۨۜۧ;->ܿ:I

    .line 563
    :cond_3
    invoke-virtual {p0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 567
    :cond_4
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x3

    .line 568
    invoke-virtual {p0, p1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 570
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 571
    invoke-static {p0}, Ll/ܰۜۧ;->ۧ(Ll/ܽ֨֫;)V

    :cond_5
    return-void
.end method
