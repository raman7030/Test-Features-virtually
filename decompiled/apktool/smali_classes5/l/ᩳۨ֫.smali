.class public final Ll/ᩳۨ֫;
.super Ljava/lang/Object;
.source "J8KC"

# interfaces
.implements Ll/۟ۛ֫;


# static fields
.field public static final ᩳ:Ll/᩵ۢ֡;


# instance fields
.field public final ֫:Landroid/media/MediaDrm;

.field public ۧ:I

.field public final ܽ:Ljava/util/UUID;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 67
    new-instance v0, Ll/᩵ۢ֡;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ll/᩵ۢ֡;-><init>(I)V

    sput-object v0, Ll/ᩳۨ֫;->ᩳ:Ll/᩵ۢ֡;

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;)V
    .locals 5

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    sget-object v0, Ll/᩻ᩴ֫;->ۧ:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const-string v3, "Use C.CLEARKEY_UUID instead"

    invoke-static {v3, v1}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 117
    iput-object p1, p0, Ll/ᩳۨ֫;->ܽ:Ljava/util/UUID;

    .line 118
    new-instance v1, Landroid/media/MediaDrm;

    .line 545
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1b

    if-ge v3, v4, :cond_0

    sget-object v3, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 118
    :goto_0
    invoke-direct {v1, v0}, Landroid/media/MediaDrm;-><init>(Ljava/util/UUID;)V

    iput-object v1, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    .line 120
    iput v2, p0, Ll/ᩳۨ֫;->ۧ:I

    .line 121
    sget-object v0, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "ASUS_Z00AD"

    .line 558
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "securityLevel"

    const-string v0, "L3"

    .line 549
    invoke-virtual {v1, p1, v0}, Landroid/media/MediaDrm;->setPropertyString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static ֫(Ljava/util/UUID;)Ll/۟ۛ֫;
    .locals 2

    .line 106
    :try_start_0
    new-instance v0, Ll/ᩳۨ֫;

    invoke-direct {v0, p0}, Ll/ᩳۨ֫;-><init>(Ljava/util/UUID;)V
    :try_end_0
    .catch Landroid/media/UnsupportedSchemeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 110
    :try_start_1
    new-instance v1, Ll/᩷ۨ֫;

    .line 71
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 110
    throw v1

    :catch_1
    move-exception v0

    .line 108
    new-instance v1, Ll/᩷ۨ֫;

    .line 71
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 108
    throw v1
    :try_end_1
    .catch Ll/᩷ۨ֫; {:try_start_1 .. :try_end_1} :catch_2

    .line 72
    :catch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to instantiate a FrameworkMediaDrm for uuid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    .line 73
    new-instance p0, Ll/۫ۛ֫;

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final ֫([B)Ljava/util/Map;
    .locals 1

    .line 288
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v0, p1}, Landroid/media/MediaDrm;->queryKeyStatus([B)Ljava/util/HashMap;

    move-result-object p1

    return-object p1
.end method

.method public final ֫([BLjava/util/List;ILjava/util/HashMap;)Ll/ۛۛ֫;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "<LA_URL>https://x</LA_URL>"

    const/16 v3, 0x17

    .line 224
    iget-object v4, v0, Ll/ᩳۨ֫;->ܽ:Ljava/util/UUID;

    const/4 v5, 0x0

    if-eqz v1, :cond_14

    .line 426
    sget-object v6, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    invoke-virtual {v6, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v6, :cond_0

    .line 428
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴᩴ֫;

    goto/16 :goto_5

    .line 431
    :cond_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1c

    if-lt v6, v10, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    if-le v6, v9, :cond_3

    .line 433
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴᩴ֫;

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 436
    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v12

    if-ge v10, v12, :cond_1

    .line 437
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩴᩴ֫;

    .line 438
    iget-object v13, v12, Ll/ᩴᩴ֫;->᩸:[B

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    iget-object v14, v12, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    iget-object v15, v6, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    invoke-static {v14, v15}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    iget-object v12, v12, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    iget-object v14, v6, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    .line 440
    invoke-static {v12, v14}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 89
    invoke-static {v13}, Ll/ۧۘۧ;->֫([B)Ll/֫ۘۧ;

    move-result-object v12

    if-eqz v12, :cond_3

    .line 442
    array-length v12, v13

    add-int/2addr v11, v12

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 449
    :cond_1
    new-array v10, v11, [B

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 451
    :goto_1
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v13

    if-ge v11, v13, :cond_2

    .line 452
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ᩴᩴ֫;

    .line 453
    iget-object v13, v13, Ll/ᩴᩴ֫;->᩸:[B

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    array-length v14, v13

    .line 455
    invoke-static {v13, v8, v10, v12, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v12, v14

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 344
    :cond_2
    new-instance v1, Ll/ᩴᩴ֫;

    iget-object v11, v6, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    iget-object v12, v6, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    iget-object v6, v6, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    invoke-direct {v1, v11, v12, v6, v10}, Ll/ᩴᩴ֫;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    goto :goto_5

    :cond_3
    const/4 v6, 0x0

    .line 465
    :goto_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    if-ge v6, v10, :cond_7

    .line 466
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩴᩴ֫;

    .line 467
    iget-object v11, v10, Ll/ᩴᩴ֫;->᩸:[B

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    invoke-static {v11}, Ll/ۧۘۧ;->֫([B)Ll/֫ۘۧ;

    move-result-object v11

    if-nez v11, :cond_4

    const/4 v11, -0x1

    goto :goto_3

    .line 124
    :cond_4
    iget v11, v11, Ll/֫ۘۧ;->ᩳ:I

    .line 468
    :goto_3
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v12, v3, :cond_5

    if-nez v11, :cond_5

    goto :goto_4

    :cond_5
    if-lt v12, v3, :cond_6

    if-ne v11, v9, :cond_6

    :goto_4
    move-object v1, v10

    goto :goto_5

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 476
    :cond_7
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴᩴ֫;

    .line 226
    :goto_5
    iget-object v6, v1, Ll/ᩴᩴ֫;->᩸:[B

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    sget-object v10, Ll/᩻ᩴ֫;->ܽ:Ljava/util/UUID;

    invoke-virtual {v10, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    .line 486
    invoke-static {v4, v6}, Ll/ۧۘۧ;->֫(Ljava/util/UUID;[B)[B

    move-result-object v11

    if-nez v11, :cond_8

    goto :goto_6

    :cond_8
    move-object v6, v11

    .line 568
    :goto_6
    new-instance v11, Ll/ᩳ֨֫;

    invoke-direct {v11, v6}, Ll/ᩳ֨֫;-><init>([B)V

    .line 571
    invoke-virtual {v11}, Ll/ᩳ֨֫;->᩷()I

    move-result v12

    .line 572
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ۡ()S

    move-result v13

    .line 573
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ۡ()S

    move-result v14

    if-ne v13, v9, :cond_c

    if-eq v14, v9, :cond_9

    goto :goto_7

    .line 578
    :cond_9
    invoke-virtual {v11}, Ll/ᩳ֨֫;->ۡ()S

    move-result v9

    .line 579
    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {v11, v9, v15}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "<LA_URL>"

    .line 580
    invoke-virtual {v9, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_8

    :cond_a
    const-string v6, "</DATA>"

    .line 585
    invoke-virtual {v9, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-ne v6, v7, :cond_b

    const-string v7, "Could not find the </DATA> tag. Skipping LA_URL workaround."

    .line 587
    invoke-static {v7}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 589
    :cond_b
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    invoke-virtual {v9, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v6, v9, v7}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v12, v12, 0x34

    .line 594
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 595
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 596
    invoke-virtual {v7, v12}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    int-to-short v8, v13

    .line 597
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    int-to-short v8, v14

    .line 598
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 599
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    mul-int/lit8 v8, v8, 0x2

    int-to-short v8, v8

    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 600
    invoke-virtual {v6, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 601
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v6

    goto :goto_8

    :cond_c
    :goto_7
    const-string v7, "Unexpected record count or type. Skipping LA_URL workaround."

    .line 575
    invoke-static {v7}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 42
    :goto_8
    invoke-static {v10, v5, v6}, Ll/ۧۘۧ;->֫(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    move-result-object v6

    .line 545
    :cond_d
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1b

    if-ge v5, v7, :cond_e

    sget-object v7, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-static {v4, v7}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 496
    invoke-static {v6}, Ll/ۧۘۧ;->֫([B)Ll/֫ۘۧ;

    move-result-object v7

    if-eqz v7, :cond_e

    .line 498
    sget-object v6, Ll/᩻ᩴ֫;->ۧ:Ljava/util/UUID;

    iget-object v8, v7, Ll/֫ۘۧ;->֫:[Ljava/util/UUID;

    iget-object v7, v7, Ll/֫ۘۧ;->ۧ:[B

    .line 499
    invoke-static {v6, v8, v7}, Ll/ۧۘۧ;->֫(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    move-result-object v6

    :cond_e
    if-ge v5, v3, :cond_f

    .line 510
    sget-object v7, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    invoke-virtual {v7, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    .line 511
    :cond_f
    invoke-virtual {v10, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    const-string v7, "Amazon"

    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 512
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v8, "AFTB"

    .line 513
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    const-string v8, "AFTS"

    .line 514
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    const-string v8, "AFTM"

    .line 515
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    const-string v8, "AFTT"

    .line 516
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    .line 517
    :cond_10
    invoke-static {v4, v6}, Ll/ۧۘۧ;->֫(Ljava/util/UUID;[B)[B

    move-result-object v7

    if-eqz v7, :cond_11

    move-object v6, v7

    .line 227
    :cond_11
    iget-object v7, v1, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    const/16 v8, 0x1a

    if-ge v5, v8, :cond_13

    .line 528
    sget-object v5, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    .line 529
    invoke-virtual {v5, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    const-string v5, "video/mp4"

    .line 530
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    const-string v5, "audio/mp4"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    :cond_12
    const-string v5, "cenc"

    goto :goto_9

    :cond_13
    move-object v5, v7

    :goto_9
    move-object v10, v5

    move-object v9, v6

    move-object v5, v1

    goto :goto_a

    :cond_14
    move-object v9, v5

    move-object v10, v9

    .line 229
    :goto_a
    iget-object v7, v0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    move-object/from16 v8, p1

    move/from16 v11, p3

    move-object/from16 v12, p4

    .line 230
    invoke-virtual/range {v7 .. v12}, Landroid/media/MediaDrm;->getKeyRequest([B[BLjava/lang/String;ILjava/util/HashMap;)Landroid/media/MediaDrm$KeyRequest;

    move-result-object v1

    .line 232
    invoke-virtual {v1}, Landroid/media/MediaDrm$KeyRequest;->getData()[B

    move-result-object v6

    .line 537
    sget-object v7, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-virtual {v7, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    .line 40
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1b

    if-lt v4, v7, :cond_15

    goto :goto_b

    .line 47
    :cond_15
    invoke-static {v6}, Ll/ۘ֨֫;->֫([B)Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x2b

    const/16 v7, 0x2d

    .line 90
    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x2f

    const/16 v7, 0x5f

    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    .line 1076
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    .line 233
    :cond_16
    :goto_b
    invoke-virtual {v1}, Landroid/media/MediaDrm$KeyRequest;->getDefaultUrl()Ljava/lang/String;

    move-result-object v4

    .line 247
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v7, ""

    if-eqz v2, :cond_17

    goto :goto_c

    .line 250
    :cond_17
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x21

    if-lt v2, v8, :cond_19

    const-string v2, "https://default.url"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    const-string v2, "version"

    .line 372
    iget-object v8, v0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v8, v2}, Landroid/media/MediaDrm;->getPropertyString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v8, "1.2"

    .line 253
    invoke-static {v2, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_18

    const-string v8, "aidl-1"

    invoke-static {v2, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    :cond_18
    :goto_c
    move-object v4, v7

    .line 234
    :cond_19
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1a

    if-eqz v5, :cond_1a

    iget-object v2, v5, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    .line 236
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1a

    move-object v4, v2

    .line 241
    :cond_1a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v3, :cond_1b

    invoke-virtual {v1}, Landroid/media/MediaDrm$KeyRequest;->getRequestType()I

    .line 243
    :cond_1b
    new-instance v1, Ll/ۛۛ֫;

    invoke-direct {v1, v6, v4}, Ll/ۛۛ֫;-><init>([BLjava/lang/String;)V

    return-object v1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 328
    :try_start_0
    iget v1, p0, Ll/ᩳۨ֫;->ۧ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ᩳۨ֫;->ۧ:I

    if-nez v1, :cond_0

    .line 329
    iget-object v1, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v1}, Landroid/media/MediaDrm;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 331
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ۨۛ֫;)V
    .locals 1

    .line 132
    new-instance v0, Ll/ۧۨ֫;

    invoke-direct {v0, p0, p1}, Ll/ۧۨ֫;-><init>(Ll/ᩳۨ֫;Ll/ۨۛ֫;)V

    .line 129
    iget-object p1, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {p1, v0}, Landroid/media/MediaDrm;->setOnEventListener(Landroid/media/MediaDrm$OnEventListener;)V

    return-void
.end method

.method public final ֫([BLl/ܰ۬֫;)V
    .locals 2

    .line 202
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 204
    :try_start_0
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-static {v0, p1, p2}, Ll/ܽۨ֫;->֫(Landroid/media/MediaDrm;[BLl/ܰ۬֫;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "setLogSessionId failed."

    .line 206
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ֫([B[B)V
    .locals 1

    .line 336
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaDrm;->restoreKeys([B[B)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[B)Z
    .locals 5

    .line 295
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    iget-object v2, p0, Ll/ᩳۨ֫;->ܽ:Ljava/util/UUID;

    if-lt v0, v1, :cond_2

    .line 412
    sget-object v1, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    invoke-virtual {v2, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    if-eqz v1, :cond_1

    const-string v1, "version"

    .line 372
    invoke-virtual {v3, v1}, Landroid/media/MediaDrm;->getPropertyString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "v5."

    .line 414
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "14."

    .line 415
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "15."

    .line 416
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "16.0"

    .line 417
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 421
    :cond_1
    sget-object v1, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-virtual {v2, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    .line 297
    invoke-virtual {v3, p2}, Landroid/media/MediaDrm;->getSecurityLevel([B)I

    move-result p2

    invoke-static {v3, p1, p2}, Ll/ܽۨ֫;->֫(Landroid/media/MediaDrm;Ljava/lang/String;I)Z

    move-result p1

    return p1

    :cond_2
    const/4 v1, 0x0

    .line 301
    :try_start_0
    new-instance v3, Landroid/media/MediaCrypto;

    const/16 v4, 0x1b

    if-ge v0, v4, :cond_3

    .line 545
    sget-object v0, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-static {v2, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 480
    sget-object v0, Ll/᩻ᩴ֫;->ۧ:Ljava/util/UUID;

    goto :goto_1

    :cond_3
    move-object v0, v2

    .line 301
    :goto_1
    invoke-direct {v3, v0, p2}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 302
    :try_start_1
    invoke-virtual {v3, p1}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    move-result p1
    :try_end_1
    .catch Landroid/media/MediaCryptoException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 311
    invoke-virtual {v3}, Landroid/media/MediaCrypto;->release()V

    return p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-object v1, v3

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 308
    :catch_1
    :goto_2
    :try_start_2
    sget-object p1, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-virtual {v2, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    xor-int/lit8 p1, p1, 0x1

    if-eqz v1, :cond_4

    .line 311
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V

    :cond_4
    return p1

    :goto_3
    move-object v3, v1

    :goto_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Landroid/media/MediaCrypto;->release()V

    .line 313
    :cond_5
    throw p1
.end method

.method public final ۧ()Ll/ܰۛ֫;
    .locals 3

    .line 275
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v0}, Landroid/media/MediaDrm;->getProvisionRequest()Landroid/media/MediaDrm$ProvisionRequest;

    move-result-object v0

    .line 276
    new-instance v1, Ll/ܰۛ֫;

    invoke-virtual {v0}, Landroid/media/MediaDrm$ProvisionRequest;->getData()[B

    move-result-object v2

    invoke-virtual {v0}, Landroid/media/MediaDrm$ProvisionRequest;->getDefaultUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll/ܰۛ֫;-><init>([BLjava/lang/String;)V

    return-object v1
.end method

.method public final ۧ([B)V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v0, p1}, Landroid/media/MediaDrm;->provideProvisionResponse([B)V

    return-void
.end method

.method public final ۧ([B[B)[B
    .locals 9

    .line 265
    sget-object v0, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    iget-object v1, p0, Ll/ᩳۨ֫;->ܽ:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    goto/16 :goto_1

    .line 65
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-static {p2}, Ll/ۘ֨֫;->֫([B)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"keys\":["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "keys"

    .line 67
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v2, 0x0

    .line 68
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    if-eqz v2, :cond_1

    const-string v3, ","

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    :cond_1
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "{\"k\":\""

    .line 73
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "k"

    .line 74
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x2b

    const/16 v6, 0x2d

    .line 94
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x2f

    const/16 v8, 0x5f

    invoke-virtual {v4, v8, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    .line 74
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\",\"kid\":\""

    .line 75
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "kid"

    .line 76
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 94
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v8, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    .line 76
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\",\"kty\":\""

    .line 77
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "kty"

    .line 78
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\"}"

    .line 79
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const-string v0, "]}"

    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1076
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 84
    invoke-static {p2}, Ll/ۘ֨֫;->֫([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to adjust response data: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaDrm;->provideKeyResponse([B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final ܽ([B)Ll/ᩴ᩸֫;
    .locals 4

    .line 396
    new-instance v0, Ll/֫ۨ֫;

    .line 545
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1b

    iget-object v3, p0, Ll/ᩳۨ֫;->ܽ:Ljava/util/UUID;

    if-ge v1, v2, :cond_0

    sget-object v1, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-static {v3, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 480
    sget-object v3, Ll/᩻ᩴ֫;->ۧ:Ljava/util/UUID;

    .line 396
    :cond_0
    invoke-direct {v0, v3, p1}, Ll/֫ۨ֫;-><init>(Ljava/util/UUID;[B)V

    return-object v0
.end method

.method public final ܽ()[B
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v0}, Landroid/media/MediaDrm;->openSession()[B

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ᩳ([B)V
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ᩳۨ֫;->֫:Landroid/media/MediaDrm;

    invoke-virtual {v0, p1}, Landroid/media/MediaDrm;->closeSession([B)V

    return-void
.end method
