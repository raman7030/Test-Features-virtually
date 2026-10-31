.class public final Ll/ܿ۟֫;
.super Ljava/lang/Object;
.source "38M9"


# instance fields
.field public final ֫:Z

.field public final ۖ:Z

.field public ۜ:I

.field public final ۡ:Ljava/lang/String;

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

.field public final ܳ:Z

.field public final ܺ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Z

.field public ᩷:I

.field public ᩻:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZZ)V
    .locals 0

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    iput-object p1, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    .line 219
    iput-object p2, p0, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    .line 220
    iput-object p3, p0, Ll/ܿ۟֫;->ܽ:Ljava/lang/String;

    .line 221
    iput-object p4, p0, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 222
    iput-boolean p5, p0, Ll/ܿ۟֫;->ܿ:Z

    .line 223
    iput-boolean p6, p0, Ll/ܿ۟֫;->ۖ:Z

    .line 225
    iput-boolean p8, p0, Ll/ܿ۟֫;->֫:Z

    .line 227
    iput-boolean p9, p0, Ll/ܿ۟֫;->ܺ:Z

    .line 228
    iput-boolean p10, p0, Ll/ܿ۟֫;->ᩳ:Z

    .line 229
    invoke-static {p2}, Ll/ۢ᩵֫;->ۢ(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܿ۟֫;->ܳ:Z

    const p1, -0x800001

    .line 230
    iput p1, p0, Ll/ܿ۟֫;->᩻:F

    const/4 p1, -0x1

    .line 231
    iput p1, p0, Ll/ܿ۟֫;->᩷:I

    .line 232
    iput p1, p0, Ll/ܿ۟֫;->ۜ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Ll/ܿ۟֫;
    .locals 12

    move-object v1, p0

    move-object v4, p3

    .line 188
    new-instance v11, Ll/ܿ۟֫;

    if-eqz v4, :cond_2

    const-string v0, "adaptive-playback"

    .line 760
    invoke-virtual {p3, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 880
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x16

    if-gt v0, v2, :cond_1

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "ODROID-XU3"

    .line 881
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "Nexus 10"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "OMX.Exynos.AVC.Decoder"

    .line 882
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Exynos.AVC.Decoder.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    const/4 v8, 0x0

    :goto_1
    if-eqz v4, :cond_3

    const-string v0, "tunneled-playback"

    .line 764
    invoke-virtual {p3, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    :cond_3
    if-nez p7, :cond_5

    if-eqz v4, :cond_4

    const-string v0, "secure-playback"

    .line 768
    invoke-virtual {p3, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    const/4 v9, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v0, 0x1

    const/4 v9, 0x1

    .line 772
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x23

    if-lt v0, v2, :cond_7

    if-eqz v4, :cond_7

    const-string v0, "detached-surface"

    .line 774
    invoke-virtual {p3, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 942
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "Xiaomi"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "OPPO"

    .line 943
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "realme"

    .line 944
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "motorola"

    .line 945
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "LENOVO"

    .line 946
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    const/4 v0, 0x1

    const/4 v10, 0x1

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_5
    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    .line 202
    invoke-direct/range {v0 .. v10}, Ll/ܿ۟֫;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZZ)V

    return-object v11
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 2

    const-string v0, "NoSupport ["

    const-string v1, "] ["

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 691
    iget-object v0, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z
    .locals 3

    .line 810
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    move-result v0

    .line 811
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    move-result v1

    .line 812
    new-instance v2, Landroid/graphics/Point;

    .line 813
    invoke-static {p1, v0}, Ll/ۘ֨֫;->֫(II)I

    move-result p1

    mul-int p1, p1, v0

    .line 814
    invoke-static {p2, v1}, Ll/ۘ֨֫;->֫(II)I

    move-result p2

    mul-int p2, p2, v1

    invoke-direct {v2, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 782
    iget p1, v2, Landroid/graphics/Point;->x:I

    .line 783
    iget p2, v2, Landroid/graphics/Point;->y:I

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpl-double v2, p3, v0

    if-eqz v2, :cond_5

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, p3, v0

    if-gez v2, :cond_0

    goto :goto_2

    .line 793
    :cond_0
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    move-result-wide p3

    .line 794
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/media/MediaCodecInfo$VideoCapabilities;->areSizeAndRateSupported(IID)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 797
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_2

    goto :goto_0

    .line 801
    :cond_2
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getAchievableFrameRatesFor(II)Landroid/util/Range;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_0

    .line 805
    :cond_3
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    cmpg-double p2, p3, p0

    if-gtz p2, :cond_4

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0

    .line 788
    :cond_5
    :goto_2
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->isSizeSupported(II)Z

    move-result p0

    return p0
.end method

.method private ֫(Ll/۠ᩴ֫;Z)Z
    .locals 13

    .line 318
    sget v0, Ll/᩹۟֫;->֫:I

    .line 347
    invoke-static {p1}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object v0

    .line 319
    iget-object v1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const/4 v2, -0x1

    const-string v3, "video/hevc"

    iget-object v4, p0, Ll/ܿ۟֫;->ܽ:Ljava/lang/String;

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    const-string v6, "video/mv-hevc"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 320
    invoke-static {v4}, Ll/ۢ᩵֫;->ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 321
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_6

    .line 326
    :cond_0
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 360
    iget-object v0, p1, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    invoke-static {v0}, Ll/ܽ۠֫;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 364
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v7, "\\."

    .line 1090
    invoke-virtual {v6, v7, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    .line 365
    iget-object v7, p1, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    invoke-static {v0, v6, v7}, Ll/ᩳۚ֫;->֫(Ljava/lang/String;[Ljava/lang/String;Ll/᩷ᩴ֫;)Landroid/util/Pair;

    move-result-object v0

    :cond_2
    :goto_0
    if-nez v0, :cond_3

    goto/16 :goto_6

    .line 336
    :cond_3
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 337
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v7, "video/dolby-vision"

    .line 338
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v7, 0x8

    iget-object v8, p0, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    const/4 v9, 0x2

    const/4 v10, 0x0

    if-eqz v1, :cond_7

    .line 342
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v1, "video/avc"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_1
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x1

    goto :goto_1

    :sswitch_2
    const-string v1, "video/av01"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v2, 0x0

    :goto_1
    packed-switch v2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const/4 v0, 0x0

    const/16 v6, 0x8

    goto :goto_2

    :pswitch_1
    const/4 v0, 0x0

    const/4 v6, 0x2

    .line 360
    :cond_7
    :goto_2
    iget-boolean v1, p0, Ll/ܿ۟֫;->ܳ:Z

    if-nez v1, :cond_8

    const/16 v1, 0x2a

    if-eq v6, v1, :cond_8

    goto/16 :goto_6

    .line 246
    :cond_8
    iget-object v1, p0, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-eqz v1, :cond_9

    iget-object v2, v1, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    if-nez v2, :cond_a

    :cond_9
    new-array v2, v10, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 367
    :cond_a
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x17

    if-gt v11, v12, :cond_16

    const-string v11, "video/x-vnd.on2.vp9"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_16

    array-length v11, v2

    if-nez v11, :cond_16

    if-eqz v1, :cond_b

    .line 836
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 838
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_3

    :cond_b
    const/4 v1, 0x0

    :goto_3
    const v2, 0xaba9500

    if-lt v1, v2, :cond_c

    const/16 v7, 0x400

    goto :goto_4

    :cond_c
    const v2, 0x7270e00

    if-lt v1, v2, :cond_d

    const/16 v7, 0x200

    goto :goto_4

    :cond_d
    const v2, 0x3938700

    if-lt v1, v2, :cond_e

    const/16 v7, 0x100

    goto :goto_4

    :cond_e
    const v2, 0x1c9c380

    if-lt v1, v2, :cond_f

    const/16 v7, 0x80

    goto :goto_4

    :cond_f
    const v2, 0x112a880

    if-lt v1, v2, :cond_10

    const/16 v7, 0x40

    goto :goto_4

    :cond_10
    const v2, 0xb71b00

    if-lt v1, v2, :cond_11

    const/16 v7, 0x20

    goto :goto_4

    :cond_11
    const v2, 0x6ddd00

    if-lt v1, v2, :cond_12

    const/16 v7, 0x10

    goto :goto_4

    :cond_12
    const v2, 0x36ee80

    if-lt v1, v2, :cond_13

    goto :goto_4

    :cond_13
    const v2, 0x1b7740

    if-lt v1, v2, :cond_14

    const/4 v7, 0x4

    goto :goto_4

    :cond_14
    const v2, 0xc3500

    if-lt v1, v2, :cond_15

    const/4 v7, 0x2

    goto :goto_4

    :cond_15
    const/4 v7, 0x1

    .line 332
    :goto_4
    new-instance v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    invoke-direct {v1}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 333
    iput v5, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 334
    iput v7, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    new-array v2, v5, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    aput-object v1, v2, v10

    .line 373
    :cond_16
    array-length v1, v2

    const/4 v7, 0x0

    :goto_5
    if-ge v7, v1, :cond_1a

    aget-object v11, v2, v7

    .line 374
    iget v12, v11, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    if-ne v12, v6, :cond_19

    iget v11, v11, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    if-ge v11, v0, :cond_17

    if-nez p2, :cond_19

    .line 935
    :cond_17
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    if-ne v9, v6, :cond_18

    sget-object v11, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v12, "sailfish"

    .line 937
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_19

    const-string v12, "marlin"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    goto :goto_7

    :cond_18
    :goto_6
    return v5

    :cond_19
    :goto_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 380
    :cond_1a
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "codec.profileLevel, "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    const-string v0, ", "

    .line 0
    invoke-static {p2, p1, v0, v4}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 380
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v10

    :sswitch_data_0
    .sparse-switch
        -0x631b55f6 -> :sswitch_2
        -0x63185e82 -> :sswitch_1
        0x4f62373a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ᩳ(Ll/۠ᩴ֫;)Z
    .locals 2

    .line 389
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "audio/flac"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Ll/۠ᩴ֫;->ۛ:I

    const/16 v0, 0x16

    if-ne p1, v0, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    if-ge p1, v0, :cond_1

    iget-object p1, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    const-string v0, "c2.android.flac.decoder"

    .line 392
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(II)F
    .locals 5

    .line 587
    iget-boolean v0, p0, Ll/ܿ۟֫;->ܳ:Z

    const v1, -0x800001

    if-nez v0, :cond_0

    return v1

    .line 590
    :cond_0
    iget v0, p0, Ll/ܿ۟֫;->᩻:F

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_1

    iget v1, p0, Ll/ܿ۟֫;->᩷:I

    if-ne v1, p1, :cond_1

    iget v1, p0, Ll/ܿ۟֫;->ۜ:I

    if-ne v1, p2, :cond_1

    return v0

    :cond_1
    const/high16 v0, 0x44800000    # 1024.0f

    float-to-double v1, v0

    .line 606
    invoke-virtual {p0, p1, p2, v1, v2}, Ll/ܿ۟֫;->֫(IID)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_0
    sub-float v2, v0, v1

    .line 609
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v4, 0x40a00000    # 5.0f

    cmpl-float v3, v3, v4

    if-lez v3, :cond_4

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v2, v1

    float-to-double v3, v2

    .line 611
    invoke-virtual {p0, p1, p2, v3, v4}, Ll/ܿ۟֫;->֫(IID)Z

    move-result v3

    if-eqz v3, :cond_3

    move v1, v2

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    move v0, v1

    .line 595
    :goto_1
    iput v0, p0, Ll/ܿ۟֫;->᩻:F

    .line 596
    iput p1, p0, Ll/ܿ۟֫;->᩷:I

    .line 597
    iput p2, p0, Ll/ܿ۟֫;->ۜ:I

    return v0
.end method

.method public final ֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;
    .locals 13

    .line 439
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v1, p1, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    iget-object v2, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v3, p2, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 443
    :goto_0
    iget-boolean v4, p0, Ll/ܿ۟֫;->ܳ:Z

    if-eqz v4, :cond_a

    .line 444
    iget v4, p1, Ll/۠ᩴ֫;->֫֫:I

    iget v5, p2, Ll/۠ᩴ֫;->֫֫:I

    if-eq v4, v5, :cond_1

    or-int/lit16 v0, v0, 0x400

    .line 447
    :cond_1
    iget v4, p1, Ll/۠ᩴ֫;->᩷֫:I

    iget v5, p2, Ll/۠ᩴ֫;->᩷֫:I

    if-ne v4, v5, :cond_2

    iget v4, p1, Ll/۠ᩴ֫;->۠:I

    iget v5, p2, Ll/۠ᩴ֫;->۠:I

    if-eq v4, v5, :cond_3

    :cond_2
    const/4 v2, 0x1

    .line 449
    :cond_3
    iget-boolean v4, p0, Ll/ܿ۟֫;->֫:Z

    if-nez v4, :cond_4

    if-eqz v2, :cond_4

    or-int/lit16 v0, v0, 0x200

    .line 452
    :cond_4
    invoke-static {v1}, Ll/᩷ᩴ֫;->֫(Ll/᩷ᩴ֫;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 453
    invoke-static {v3}, Ll/᩷ᩴ֫;->֫(Ll/᩷ᩴ֫;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 454
    :cond_5
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    or-int/lit16 v0, v0, 0x800

    .line 894
    :cond_6
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v3, "SM-T230"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"

    iget-object v3, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 459
    invoke-virtual {p1, p2}, Ll/۠ᩴ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v1

    if-nez v1, :cond_7

    or-int/lit8 v0, v0, 0x2

    .line 463
    :cond_7
    iget v1, p1, Ll/۠ᩴ֫;->ۖ:I

    const/4 v3, -0x1

    if-eq v1, v3, :cond_8

    iget v4, p1, Ll/۠ᩴ֫;->ܺ:I

    if-eq v4, v3, :cond_8

    iget v3, p2, Ll/۠ᩴ֫;->ۖ:I

    if-ne v1, v3, :cond_8

    iget v1, p2, Ll/۠ᩴ֫;->ܺ:I

    if-ne v4, v1, :cond_8

    if-eqz v2, :cond_8

    or-int/lit8 v0, v0, 0x2

    :cond_8
    if-nez v0, :cond_11

    .line 475
    new-instance v0, Ll/۬᩹֫;

    .line 479
    invoke-virtual {p1, p2}, Ll/۠ᩴ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, 0x3

    const/4 v5, 0x3

    goto :goto_1

    :cond_9
    const/4 v1, 0x2

    const/4 v5, 0x2

    :goto_1
    const/4 v6, 0x0

    .line 481
    iget-object v2, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    move-object v1, v0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v0

    .line 485
    :cond_a
    iget v1, p1, Ll/۠ᩴ֫;->ܿ:I

    iget v2, p2, Ll/۠ᩴ֫;->ܿ:I

    if-eq v1, v2, :cond_b

    or-int/lit16 v0, v0, 0x1000

    .line 488
    :cond_b
    iget v1, p1, Ll/۠ᩴ֫;->ܽ֫:I

    iget v2, p2, Ll/۠ᩴ֫;->ܽ֫:I

    if-eq v1, v2, :cond_c

    or-int/lit16 v0, v0, 0x2000

    .line 491
    :cond_c
    iget v1, p1, Ll/۠ᩴ֫;->ۛ:I

    iget v2, p2, Ll/۠ᩴ֫;->ۛ:I

    if-eq v1, v2, :cond_d

    or-int/lit16 v0, v0, 0x4000

    .line 497
    :cond_d
    iget-object v1, p0, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    if-nez v0, :cond_e

    const-string v2, "audio/mp4a-latm"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 500
    sget v2, Ll/᩹۟֫;->֫:I

    .line 347
    invoke-static {p1}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object v2

    invoke-static {p2}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object v3

    if-eqz v2, :cond_e

    if-eqz v3, :cond_e

    .line 505
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 506
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x2a

    if-ne v2, v4, :cond_e

    if-ne v3, v4, :cond_e

    .line 509
    new-instance v0, Ll/۬᩹֫;

    const/4 v9, 0x3

    const/4 v10, 0x0

    iget-object v6, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    move-object v5, v0

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v5 .. v10}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v0

    .line 519
    :cond_e
    invoke-virtual {p1, p2}, Ll/۠ᩴ֫;->֫(Ll/۠ᩴ֫;)Z

    move-result v2

    if-nez v2, :cond_f

    or-int/lit8 v0, v0, 0x20

    :cond_f
    const-string v2, "audio/opus"

    .line 909
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    or-int/lit8 v0, v0, 0x2

    :cond_10
    if-nez v0, :cond_11

    .line 527
    new-instance v0, Ll/۬᩹֫;

    const/4 v5, 0x1

    const/4 v6, 0x0

    iget-object v2, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    move-object v1, v0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v0

    :cond_11
    move v12, v0

    .line 532
    new-instance v0, Ll/۬᩹֫;

    iget-object v8, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    const/4 v11, 0x0

    move-object v7, v0

    move-object v9, p1

    move-object v10, p2

    invoke-direct/range {v7 .. v12}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v0
.end method

.method public final ֫(IID)Z
    .locals 8

    const/4 v0, 0x0

    .line 545
    iget-object v1, p0, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-nez v1, :cond_0

    const-string p1, "sizeAndRate.caps"

    .line 546
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v0

    .line 549
    :cond_0
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v1

    if-nez v1, :cond_1

    const-string p1, "sizeAndRate.vCaps"

    .line 551
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v0

    .line 555
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    const-string v4, "@"

    const-string v5, "x"

    const/4 v6, 0x1

    if-lt v2, v3, :cond_3

    .line 558
    invoke-static {v1, p1, p2, p3, p4}, Ll/᩻۟֫;->֫(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    goto/16 :goto_1

    :cond_2
    if-ne v2, v6, :cond_3

    const-string v1, "sizeAndRate.cover, "

    .line 0
    invoke-static {v1, p1, v5, v4, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 563
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v0

    .line 570
    :cond_3
    invoke-static {v1, p1, p2, p3, p4}, Ll/ܿ۟֫;->֫(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    move-result v2

    if-nez v2, :cond_7

    if-ge p1, p2, :cond_6

    const-string v2, "OMX.MTK.VIDEO.DECODER.HEVC"

    .line 922
    iget-object v3, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "mcv5a"

    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    .line 573
    :cond_4
    invoke-static {v1, p2, p1, p3, p4}, Ll/ܿ۟֫;->֫(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const-string v0, "sizeAndRate.rotated, "

    .line 0
    invoke-static {v0, p1, v5, v4, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 577
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, ", "

    const-string p3, "AssumedSupport ["

    const-string p4, "] ["

    .line 0
    invoke-static {p3, p1, p4, v3, p2}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 705
    iget-object p2, p0, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;)V

    return v6

    :cond_6
    :goto_0
    const-string v1, "sizeAndRate.support, "

    .line 0
    invoke-static {v1, p1, v5, v4, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 574
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v0

    :cond_7
    :goto_1
    return v6
.end method

.method public final ֫(Ll/۠ᩴ֫;)Z
    .locals 3

    .line 312
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 313
    invoke-static {p1}, Ll/᩹۟֫;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    .line 307
    :cond_1
    :goto_0
    invoke-direct {p0, p1, v2}, Ll/ܿ۟֫;->֫(Ll/۠ᩴ֫;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 308
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->ᩳ(Ll/۠ᩴ֫;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method public final ۧ(Ll/۠ᩴ֫;)Z
    .locals 7

    .line 312
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 313
    invoke-static {p1}, Ll/᩹۟֫;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 278
    invoke-direct {p0, p1, v0}, Ll/ܿ۟֫;->֫(Ll/۠ᩴ֫;Z)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    .line 282
    :cond_2
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->ᩳ(Ll/۠ᩴ֫;)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_1
    return v2

    .line 286
    :cond_3
    iget-boolean v3, p0, Ll/ܿ۟֫;->ܳ:Z

    if-eqz v3, :cond_5

    .line 287
    iget v1, p1, Ll/۠ᩴ֫;->᩷֫:I

    if-lez v1, :cond_10

    iget v2, p1, Ll/۠ᩴ֫;->۠:I

    if-gtz v2, :cond_4

    goto/16 :goto_4

    .line 290
    :cond_4
    iget p1, p1, Ll/۠ᩴ֫;->֡:F

    float-to-double v3, p1

    invoke-virtual {p0, v1, v2, v3, v4}, Ll/ܿ۟֫;->֫(IID)Z

    move-result p1

    return p1

    .line 292
    :cond_5
    iget v3, p1, Ll/۠ᩴ֫;->ܽ֫:I

    iget-object v4, p0, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    const/4 v5, -0x1

    if-eq v3, v5, :cond_8

    if-nez v4, :cond_6

    const-string p1, "sampleRate.caps"

    .line 650
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v2

    .line 653
    :cond_6
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    move-result-object v6

    if-nez v6, :cond_7

    const-string p1, "sampleRate.aCaps"

    .line 655
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v2

    .line 658
    :cond_7
    invoke-virtual {v6, v3}, Landroid/media/MediaCodecInfo$AudioCapabilities;->isSampleRateSupported(I)Z

    move-result v6

    if-nez v6, :cond_8

    const-string p1, "sampleRate.support, "

    .line 0
    invoke-static {v3, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 659
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v2

    .line 293
    :cond_8
    iget p1, p1, Ll/۠ᩴ֫;->ܿ:I

    if-eq p1, v5, :cond_10

    if-nez v4, :cond_9

    const-string p1, "channelCount.caps"

    .line 673
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v2

    .line 676
    :cond_9
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    move-result-object v3

    if-nez v3, :cond_a

    const-string p1, "channelCount.aCaps"

    .line 678
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v2

    .line 682
    :cond_a
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    move-result v3

    if-gt v3, v0, :cond_f

    .line 719
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1a

    if-lt v4, v5, :cond_b

    if-lez v3, :cond_b

    goto/16 :goto_3

    :cond_b
    const-string v4, "audio/mpeg"

    .line 723
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/3gpp"

    .line 724
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/amr-wb"

    .line 725
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/mp4a-latm"

    .line 726
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/vorbis"

    .line 727
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/opus"

    .line 728
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/raw"

    .line 729
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/flac"

    .line 730
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/g711-alaw"

    .line 731
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/g711-mlaw"

    .line 732
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "audio/gsm"

    .line 733
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    goto :goto_3

    :cond_c
    const-string v4, "audio/ac3"

    .line 739
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v1, 0x6

    goto :goto_2

    :cond_d
    const-string v4, "audio/eac3"

    .line 741
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/16 v1, 0x10

    goto :goto_2

    :cond_e
    const/16 v1, 0x1e

    .line 747
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AssumedMaxChannelAdjustment: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    move v3, v1

    :cond_f
    :goto_3
    if-ge v3, p1, :cond_10

    const-string v0, "channelCount.support, "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 684
    invoke-direct {p0, p1}, Ll/ܿ۟֫;->֫(Ljava/lang/String;)V

    return v2

    :cond_10
    :goto_4
    return v0
.end method

.method public final ܽ(Ll/۠ᩴ֫;)Z
    .locals 1

    .line 418
    iget-boolean v0, p0, Ll/ܿ۟֫;->ܳ:Z

    if-eqz v0, :cond_0

    .line 419
    iget-boolean p1, p0, Ll/ܿ۟֫;->֫:Z

    return p1

    .line 421
    :cond_0
    sget v0, Ll/᩹۟֫;->֫:I

    .line 347
    invoke-static {p1}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 422
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x2a

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
