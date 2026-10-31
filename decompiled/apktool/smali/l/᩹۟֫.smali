.class public final Ll/᩹۟֫;
.super Ljava/lang/Object;
.source "M8RW"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/᩹۟֫;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 527
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object p0

    .line 528
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    .line 529
    invoke-virtual {v2, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string p0, "video/dolby-vision"

    .line 534
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "OMX.MS.HEVCDV.Decoder"

    .line 537
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "video/hevcdv"

    return-object p0

    :cond_2
    const-string p0, "OMX.RTK.video.decoder"

    .line 539
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    const-string p0, "OMX.realtek.video.decoder.tunneled"

    .line 540
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    :cond_3
    const-string p0, "video/dv_hevc"

    return-object p0

    :cond_4
    const-string p0, "video/mv-hevc"

    .line 543
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "c2.qti.mvhevc.decoder"

    .line 545
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    const-string p0, "c2.qti.mvhevc.decoder.secure"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    :cond_5
    const-string p0, "video/x-mvhevc"

    return-object p0

    :cond_6
    const-string p0, "audio/alac"

    .line 548
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string p0, "OMX.lge.alac.decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string p0, "audio/x-lg-alac"

    return-object p0

    :cond_7
    const-string p0, "audio/flac"

    .line 550
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    const-string p0, "OMX.lge.flac.decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    const-string p0, "audio/x-lg-flac"

    return-object p0

    :cond_8
    const-string p0, "audio/ac3"

    .line 552
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    const-string p0, "OMX.lge.ac3.decoder"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    const-string p0, "audio/lg-ac3"

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/۠ᩴ֫;)Ljava/lang/String;
    .locals 3

    .line 379
    iget-object v0, p0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v1, p0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v2, "audio/eac3-joc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "audio/eac3"

    return-object p0

    :cond_0
    const-string v0, "video/dolby-vision"

    .line 383
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "video/hevc"

    if-eqz v0, :cond_4

    .line 347
    invoke-static {p0}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 390
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0x10

    if-eq p0, v0, :cond_3

    const/16 v0, 0x100

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x200

    if-ne p0, v0, :cond_2

    const-string p0, "video/avc"

    return-object p0

    :cond_2
    const/16 v0, 0x400

    if-ne p0, v0, :cond_4

    const-string p0, "video/av01"

    return-object p0

    :cond_3
    :goto_0
    return-object v2

    :cond_4
    const-string p0, "video/mv-hevc"

    .line 401
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    return-object v2

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/util/List;Ll/۠ᩴ֫;)Ljava/util/ArrayList;
    .locals 1

    .line 260
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 261
    new-instance p0, Ll/ۘ۟֫;

    invoke-direct {p0, p1}, Ll/ۘ۟֫;-><init>(Ll/۠ᩴ֫;)V

    .line 781
    new-instance p1, Ll/ᩴ۟֫;

    invoke-direct {p1, p0}, Ll/ᩴ۟֫;-><init>(Ll/᩸۟֫;)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ֫(Ll/֡۟֫;Ll/֨۟֫;)Ljava/util/ArrayList;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 422
    iget-boolean v3, v1, Ll/֡۟֫;->ۧ:Z

    const-string v4, "secure-playback"

    const-string v5, "tunneled-playback"

    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 423
    iget-object v15, v1, Ll/֡۟֫;->֫:Ljava/lang/String;

    .line 424
    invoke-interface/range {p1 .. p1}, Ll/֨۟֫;->֫()I

    move-result v14

    .line 425
    invoke-interface/range {p1 .. p1}, Ll/֨۟֫;->ۧ()Z

    move-result v13

    const/4 v0, 0x0

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v14, :cond_10

    .line 428
    invoke-interface {v2, v12}, Ll/֨۟֫;->֫(I)Landroid/media/MediaCodecInfo;

    move-result-object v0

    .line 658
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1d

    if-lt v7, v8, :cond_0

    .line 663
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->isAlias()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    .line 434
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v11

    .line 435
    invoke-static {v0, v11, v13, v15}, Ll/᩹۟֫;->֫(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    :goto_1
    move-object/from16 v17, v5

    :cond_1
    :goto_2
    move/from16 v22, v12

    move/from16 v23, v13

    move/from16 v24, v14

    goto/16 :goto_9

    .line 438
    :cond_2
    invoke-static {v0, v11, v15}, Ll/᩹۟֫;->֫(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    if-nez v10, :cond_3

    move-object/from16 v17, v5

    goto :goto_3

    .line 443
    :cond_3
    :try_start_1
    invoke-virtual {v0, v10}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v9

    .line 445
    invoke-interface {v2, v5, v10, v9}, Ll/֨۟֫;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    move-result v8

    .line 448
    invoke-interface {v2, v5, v9}, Ll/֨۟֫;->֫(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    move-result v16
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-object/from16 v17, v5

    .line 450
    :try_start_2
    iget-boolean v5, v1, Ll/֡۟֫;->ܽ:Z

    if-nez v5, :cond_4

    if-nez v16, :cond_1

    :cond_4
    if-eqz v5, :cond_5

    if-nez v8, :cond_5

    goto :goto_3

    .line 454
    :cond_5
    invoke-interface {v2, v4, v10, v9}, Ll/֨۟֫;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    move-result v5

    .line 457
    invoke-interface {v2, v4, v9}, Ll/֨۟֫;->֫(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    move-result v8

    if-nez v3, :cond_6

    if-nez v8, :cond_1

    :cond_6
    if-eqz v3, :cond_7

    if-nez v5, :cond_7

    :goto_3
    goto :goto_2

    :cond_7
    const/16 v8, 0x1d

    if-lt v7, v8, :cond_8

    .line 682
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->isHardwareAccelerated()Z

    move-result v8

    :goto_4
    move/from16 v18, v8

    goto :goto_5

    .line 677
    :cond_8
    invoke-static {v0, v15}, Ll/᩹۟֫;->֫(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    move-result v8

    xor-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 463
    :goto_5
    invoke-static {v0, v15}, Ll/᩹۟֫;->֫(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    move-result v19

    const/16 v8, 0x1d

    if-lt v7, v8, :cond_9

    .line 732
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->isVendor()Z

    move-result v0

    goto :goto_6

    .line 724
    :cond_9
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v7, "omx.google."

    .line 725
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_a

    const-string v7, "c2.android."

    .line 726
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_a

    const-string v7, "c2.google."

    .line 727
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-nez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    :goto_6
    if-eqz v13, :cond_b

    if-eq v3, v5, :cond_c

    :cond_b
    if-nez v13, :cond_d

    if-nez v3, :cond_d

    :cond_c
    const/4 v5, 0x0

    move-object v7, v11

    move-object v8, v15

    move-object/from16 v16, v9

    move-object v9, v10

    move-object/from16 v20, v10

    move-object/from16 v10, v16

    move-object/from16 v21, v11

    move/from16 v11, v18

    move/from16 v22, v12

    move/from16 v12, v19

    move/from16 v23, v13

    move v13, v0

    move/from16 v24, v14

    move v14, v5

    .line 468
    :try_start_3
    invoke-static/range {v7 .. v14}, Ll/ܿ۟֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Ll/ܿ۟֫;

    move-result-object v0

    .line 467
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_d
    move-object/from16 v16, v9

    move-object/from16 v20, v10

    move-object/from16 v21, v11

    move/from16 v22, v12

    move/from16 v23, v13

    move/from16 v24, v14

    if-nez v23, :cond_e

    if-eqz v5, :cond_e

    .line 479
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-object/from16 v14, v21

    :try_start_4
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".secure"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const/4 v5, 0x1

    move-object v8, v15

    move-object/from16 v9, v20

    move-object/from16 v10, v16

    move/from16 v11, v18

    move/from16 v12, v19

    move v13, v0

    move-object v1, v14

    move v14, v5

    .line 480
    :try_start_5
    invoke-static/range {v7 .. v14}, Ll/ܿ۟֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Ll/ܿ۟֫;

    move-result-object v0

    .line 479
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v1, v14

    goto :goto_8

    :catch_2
    move-exception v0

    move-object/from16 v1, v21

    goto :goto_8

    :catch_3
    move-exception v0

    :goto_7
    move-object/from16 v20, v10

    move-object v1, v11

    move/from16 v22, v12

    move/from16 v23, v13

    move/from16 v24, v14

    goto :goto_8

    :catch_4
    move-exception v0

    move-object/from16 v17, v5

    goto :goto_7

    .line 494
    :goto_8
    :try_start_6
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x17

    if-gt v5, v7, :cond_f

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_f

    .line 496
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Skipping codec "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (failed to query capabilities)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    :cond_e
    :goto_9
    add-int/lit8 v12, v22, 0x1

    move-object/from16 v1, p0

    move-object/from16 v5, v17

    move/from16 v13, v23

    move/from16 v14, v24

    goto/16 :goto_0

    .line 500
    :cond_f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to query codec "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    .line 501
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    :cond_10
    :goto_a
    return-object v6

    :catch_5
    move-exception v0

    .line 509
    new-instance v1, Ll/ۚ۟֫;

    const-string v2, "Failed to query underlying media codecs"

    .line 65
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 509
    throw v1
.end method

.method public static declared-synchronized ֫(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 6

    const-string v1, "MediaCodecList API didn\'t list secure decoder for: "

    .line 4
    const-class v0, Ll/᩹۟֫;

    .line 5
    monitor-enter v0

    .line 150
    :try_start_0
    new-instance v2, Ll/֡۟֫;

    invoke-direct {v2, p0, p1, p2}, Ll/֡۟֫;-><init>(Ljava/lang/String;ZZ)V

    .line 151
    sget-object v3, Ll/᩹۟֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    .line 153
    monitor-exit v0

    return-object v4

    :cond_0
    :try_start_1
    const-string v4, "video/mv-hevc"

    .line 158
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 159
    new-instance v5, Ll/ܶ۟֫;

    invoke-direct {v5, p1, p2, v4}, Ll/ܶ۟֫;-><init>(ZZZ)V

    .line 161
    invoke-static {v2, v5}, Ll/᩹۟֫;->֫(Ll/֡۟֫;Ll/֨۟֫;)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p1, :cond_1

    .line 162
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-gt p1, v4, :cond_1

    .line 165
    new-instance p1, Ll/۠۟֫;

    .line 863
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 166
    invoke-static {v2, p1}, Ll/᩹۟֫;->֫(Ll/֡۟֫;Ll/֨۟֫;)Ljava/util/ArrayList;

    move-result-object p2

    .line 167
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 168
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Assuming: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 173
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ۟֫;

    iget-object v1, v1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 168
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 176
    :cond_1
    invoke-static {p0, p2}, Ll/᩹۟֫;->֫(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 177
    invoke-static {p2}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p0

    .line 178
    invoke-virtual {v3, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#2.sampleMimeType"
        }
    .end annotation

    .line 209
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 210
    invoke-interface {p0, v0, p2, p3}, Ll/ۖ۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    .line 245
    invoke-static {p1}, Ll/᩹۟֫;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 247
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p0

    goto :goto_0

    .line 249
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Ll/ۖ۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    .line 726
    :goto_0
    new-instance p1, Ll/֫۬ܺ;

    invoke-direct {p1}, Ll/֫۬ܺ;-><init>()V

    .line 216
    invoke-virtual {p1, v0}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    .line 217
    invoke-virtual {p1, p0}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    .line 218
    invoke-virtual {p1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 10

    const-string v0, "audio/raw"

    .line 610
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 611
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge p0, v2, :cond_0

    sget-object p0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "R9"

    .line 612
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 613
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    if-ne p0, v0, :cond_0

    .line 614
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܿ۟֫;

    iget-object p0, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    const-string v2, "OMX.MTK.AUDIO.DECODER.RAW"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v2, "OMX.google.raw.decoder"

    const-string v3, "audio/raw"

    const-string v4, "audio/raw"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 618
    invoke-static/range {v2 .. v9}, Ll/ܿ۟֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Ll/ܿ۟֫;

    move-result-object p0

    .line 617
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 630
    :cond_0
    new-instance p0, Ll/᩵۟֫;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    new-instance v2, Ll/ᩴ۟֫;

    invoke-direct {v2, p0}, Ll/ᩴ۟֫;-><init>(Ll/᩸۟֫;)V

    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 647
    :cond_1
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x20

    if-ge p0, v2, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    if-le p0, v0, :cond_2

    .line 648
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܿ۟֫;

    iget-object p0, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    const-string v0, "OMX.qti.audio.decoder.flac"

    .line 651
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 652
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܿ۟֫;

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public static ֫(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 690
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 713
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isSoftwareOnly()Z

    move-result p0

    return p0

    .line 693
    :cond_0
    invoke-static {p1}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 697
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "arc."

    .line 698
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "omx.google."

    .line 702
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "omx.ffmpeg."

    .line 703
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "omx.sec."

    .line 704
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, ".sw."

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 705
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "c2.android."

    .line 706
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "c2.google."

    .line 707
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "omx."

    .line 708
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "c2."

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 1

    .line 573
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result p0

    if-nez p0, :cond_4

    if-nez p2, :cond_0

    const-string p0, ".secure"

    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_0

    .line 578
    :cond_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-ge p0, p2, :cond_2

    const-string p2, "OMX.SEC.aac.dec"

    .line 579
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "OMX.Exynos.AAC.Decoder"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    const-string p2, "samsung"

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 580
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v0, "zeroflte"

    .line 581
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "zerolte"

    .line 582
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "zenlte"

    .line 583
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "SC-05G"

    .line 584
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "marinelteatt"

    .line 585
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "404SC"

    .line 586
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "SC-04G"

    .line 587
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "SCV31"

    .line 588
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    const/16 p2, 0x17

    if-gt p0, p2, :cond_3

    const-string p0, "audio/eac3-joc"

    .line 594
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "OMX.MTK.AUDIO.DECODER.DSPAC3"

    .line 595
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
