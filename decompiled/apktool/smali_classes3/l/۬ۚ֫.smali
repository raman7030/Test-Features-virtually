.class public final Ll/۬ۚ֫;
.super Ljava/lang/Object;
.source "C8IJ"


# direct methods
.method public static ֫(Landroid/media/MediaFormat;)Ll/۠ᩴ֫;
    .locals 13

    .line 74
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "mime"

    .line 76
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    const-string v2, "language"

    .line 77
    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    const-string v2, "max-bitrate"

    .line 328
    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    .line 78
    :goto_0
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->֡(I)V

    const-string v2, "bitrate"

    .line 328
    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    .line 80
    :goto_1
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ܽ(I)V

    .line 352
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "video/3gpp"

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v10, "level"

    const-string v11, "profile"

    if-eqz v2, :cond_2

    .line 353
    invoke-virtual {p0, v11}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 354
    invoke-virtual {p0, v10}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 356
    invoke-virtual {p0, v11}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    .line 357
    invoke-virtual {p0, v10}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    .line 355
    sget v10, Ll/ᩳۚ֫;->֫:I

    .line 345
    sget-object v10, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "s263."

    const-string v11, "."

    .line 0
    invoke-static {v10, v1, v2, v11}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_4

    .line 359
    :cond_2
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "video/dolby-vision"

    .line 358
    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 360
    invoke-virtual {p0, v11}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 361
    invoke-virtual {p0, v10}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 365
    invoke-virtual {p0, v11}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    .line 364
    sget v2, Ll/ᩳۚ֫;->֫:I

    const/4 v2, 0x4

    const/16 v11, 0x9

    const/16 v12, 0x8

    if-eq v1, v9, :cond_d

    if-eq v1, v3, :cond_c

    if-eq v1, v2, :cond_b

    if-eq v1, v12, :cond_a

    const/16 v2, 0x10

    if-eq v1, v2, :cond_9

    const/16 v2, 0x20

    if-eq v1, v2, :cond_8

    const/16 v2, 0x40

    if-eq v1, v2, :cond_7

    const/16 v2, 0x80

    if-eq v1, v2, :cond_6

    const/16 v2, 0x100

    if-eq v1, v2, :cond_5

    const/16 v2, 0x200

    if-eq v1, v2, :cond_4

    const/16 v2, 0x400

    if-ne v1, v2, :cond_3

    const/16 v1, 0xa

    goto :goto_2

    .line 583
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown Dolby Vision profile: "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 583
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    const/16 v1, 0x9

    goto :goto_2

    :cond_5
    const/16 v1, 0x8

    goto :goto_2

    :cond_6
    const/4 v1, 0x7

    goto :goto_2

    :cond_7
    const/4 v1, 0x6

    goto :goto_2

    :cond_8
    const/4 v1, 0x5

    goto :goto_2

    :cond_9
    const/4 v1, 0x4

    goto :goto_2

    :cond_a
    const/4 v1, 0x3

    goto :goto_2

    :cond_b
    const/4 v1, 0x2

    goto :goto_2

    :cond_c
    const/4 v1, 0x1

    goto :goto_2

    :cond_d
    const/4 v1, 0x0

    .line 367
    :goto_2
    invoke-virtual {p0, v10}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v9, :cond_f

    if-eq v2, v3, :cond_e

    sparse-switch v2, :sswitch_data_0

    .line 547
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown Dolby Vision level: "

    .line 0
    invoke-static {v2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 547
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_0
    const/16 v2, 0xd

    goto :goto_3

    :sswitch_1
    const/16 v2, 0xc

    goto :goto_3

    :sswitch_2
    const/16 v2, 0xb

    goto :goto_3

    :sswitch_3
    const/16 v2, 0xa

    goto :goto_3

    :sswitch_4
    const/16 v2, 0x9

    goto :goto_3

    :sswitch_5
    const/16 v2, 0x8

    goto :goto_3

    :sswitch_6
    const/4 v2, 0x7

    goto :goto_3

    :sswitch_7
    const/4 v2, 0x6

    goto :goto_3

    :sswitch_8
    const/4 v2, 0x5

    goto :goto_3

    :sswitch_9
    const/4 v2, 0x4

    goto :goto_3

    :sswitch_a
    const/4 v2, 0x3

    goto :goto_3

    :cond_e
    const/4 v2, 0x2

    goto :goto_3

    :cond_f
    const/4 v2, 0x1

    :goto_3
    if-le v1, v11, :cond_10

    .line 357
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v10, v3, [Ljava/lang/Object;

    aput-object v1, v10, v8

    aput-object v2, v10, v9

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "dvh1.%02d.%02d"

    invoke-static {v1, v2, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_10
    if-le v1, v12, :cond_11

    .line 359
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v10, v3, [Ljava/lang/Object;

    aput-object v1, v10, v8

    aput-object v2, v10, v9

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "dvav.%02d.%02d"

    invoke-static {v1, v2, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 361
    :cond_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v10, v3, [Ljava/lang/Object;

    aput-object v1, v10, v8

    aput-object v2, v10, v9

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "dvhe.%02d.%02d"

    invoke-static {v1, v2, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_12
    const-string v1, "codecs-string"

    .line 340
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_13
    const/4 v1, 0x0

    .line 83
    :goto_4
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    const-string v1, "frame-rate"

    .line 381
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 383
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    move-result v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 385
    :catch_0
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    goto :goto_5

    :cond_14
    const/high16 v1, -0x40800000    # -1.0f

    .line 84
    :goto_5
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֫(F)V

    const-string v1, "width"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_6

    :cond_15
    const/4 v1, -0x1

    .line 85
    :goto_6
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۙ(I)V

    const-string v1, "height"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_7

    :cond_16
    const/4 v1, -0x1

    .line 87
    :goto_7
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۡ(I)V

    const-string v1, "sar-width"

    .line 395
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    const-string v2, "sar-height"

    .line 396
    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_17

    .line 397
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    .line 398
    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    goto :goto_8

    :cond_17
    const/high16 v1, 0x3f800000    # 1.0f

    .line 90
    :goto_8
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۧ(F)V

    const-string v1, "max-input-size"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_9

    :cond_18
    const/4 v1, -0x1

    .line 92
    :goto_9
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۖ(I)V

    const-string v1, "rotation-degrees"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_a

    :cond_19
    const/4 v1, 0x0

    .line 97
    :goto_a
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֨(I)V

    .line 284
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-ge v1, v2, :cond_1a

    goto/16 :goto_12

    :cond_1a
    const-string v1, "color-standard"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_b

    :cond_1b
    const/4 v1, -0x1

    :goto_b
    const-string v2, "color-range"

    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    goto :goto_c

    :cond_1c
    const/4 v2, -0x1

    :goto_c
    const-string v10, "color-transfer"

    invoke-virtual {p0, v10}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1d

    invoke-virtual {p0, v10}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v10

    goto :goto_d

    :cond_1d
    const/4 v10, -0x1

    :goto_d
    const-string v11, "hdr-static-info"

    .line 297
    invoke-virtual {p0, v11}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object v11

    if-eqz v11, :cond_1e

    .line 405
    invoke-virtual {v11}, Ljava/nio/Buffer;->remaining()I

    move-result v12

    new-array v12, v12, [B

    .line 406
    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    goto :goto_e

    :cond_1e
    const/4 v12, 0x0

    :goto_e
    if-eq v1, v3, :cond_20

    if-eq v1, v9, :cond_20

    if-eq v1, v6, :cond_20

    if-ne v1, v4, :cond_1f

    goto :goto_f

    :cond_1f
    const/4 v1, -0x1

    :cond_20
    :goto_f
    if-eq v2, v3, :cond_22

    if-eq v2, v9, :cond_22

    if-ne v2, v4, :cond_21

    goto :goto_10

    :cond_21
    const/4 v2, -0x1

    :cond_22
    :goto_10
    if-eq v10, v9, :cond_24

    if-eq v10, v7, :cond_24

    if-eq v10, v6, :cond_24

    if-eq v10, v5, :cond_24

    if-ne v10, v4, :cond_23

    goto :goto_11

    :cond_23
    const/4 v10, -0x1

    :cond_24
    :goto_11
    if-ne v1, v4, :cond_26

    if-ne v2, v4, :cond_26

    if-ne v10, v4, :cond_26

    if-eqz v12, :cond_25

    goto :goto_13

    :cond_25
    :goto_12
    const/4 v1, 0x0

    goto :goto_14

    .line 316
    :cond_26
    :goto_13
    new-instance v3, Ll/ۜᩴ֫;

    invoke-direct {v3}, Ll/ۜᩴ֫;-><init>()V

    .line 317
    invoke-virtual {v3, v1}, Ll/ۜᩴ֫;->ܽ(I)V

    .line 318
    invoke-virtual {v3, v2}, Ll/ۜᩴ֫;->ۧ(I)V

    .line 319
    invoke-virtual {v3, v10}, Ll/ۜᩴ֫;->ᩳ(I)V

    .line 320
    invoke-virtual {v3, v12}, Ll/ۜᩴ֫;->֫([B)V

    .line 321
    invoke-virtual {v3}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v1

    .line 99
    :goto_14
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֫(Ll/᩷ᩴ֫;)V

    const-string v1, "sample-rate"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_15

    :cond_27
    const/4 v1, -0x1

    .line 100
    :goto_15
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->۠(I)V

    const-string v1, "channel-count"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_16

    :cond_28
    const/4 v1, -0x1

    .line 103
    :goto_16
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ᩳ(I)V

    const-string v1, "pcm-encoding"

    .line 328
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v4

    .line 108
    :cond_29
    invoke-virtual {v0, v4}, Ll/֨ᩴ֫;->᩵(I)V

    .line 114
    new-instance v1, Ll/֫۬ܺ;

    invoke-direct {v1}, Ll/֫۬ܺ;-><init>()V

    .line 117
    :goto_17
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "csd-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object v2

    if-nez v2, :cond_2b

    .line 129
    invoke-virtual {v1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    const-string v1, "track-id"

    .line 131
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    .line 132
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Ll/֨ᩴ֫;->ܺ(I)V

    .line 135
    :cond_2a
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p0

    return-object p0

    .line 121
    :cond_2b
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    new-array v3, v3, [B

    .line 122
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 123
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 125
    invoke-virtual {v1, v3}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_17

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_a
        0x8 -> :sswitch_9
        0x10 -> :sswitch_8
        0x20 -> :sswitch_7
        0x40 -> :sswitch_6
        0x80 -> :sswitch_5
        0x100 -> :sswitch_4
        0x200 -> :sswitch_3
        0x400 -> :sswitch_2
        0x800 -> :sswitch_1
        0x1000 -> :sswitch_0
    .end sparse-switch
.end method

.method public static ֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 228
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/media/MediaFormat;Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    .line 213
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const-string v1, "csd-"

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 214
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/media/MediaFormat;Ll/᩷ᩴ֫;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "color-transfer"

    .line 268
    iget v1, p1, Ll/᩷ᩴ֫;->ᩳ:I

    invoke-static {p0, v0, v1}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "color-standard"

    .line 269
    iget v1, p1, Ll/᩷ᩴ֫;->ܽ:I

    invoke-static {p0, v0, v1}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "color-range"

    .line 270
    iget v1, p1, Ll/᩷ᩴ֫;->ۧ:I

    invoke-static {p0, v0, v1}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 271
    iget-object p1, p1, Ll/᩷ᩴ֫;->ܳ:[B

    if-eqz p1, :cond_0

    .line 255
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "hdr-static-info"

    invoke-virtual {p0, v0, p1}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_0
    return-void
.end method
