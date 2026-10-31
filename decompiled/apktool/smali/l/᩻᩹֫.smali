.class public final Ll/᩻᩹֫;
.super Ll/ۙᩴۘ;
.source "D8DA"

# interfaces
.implements Ll/᩷᩵ۘ;


# instance fields
.field public ֡:Ll/ۡ᩹֫;

.field public ֨:I

.field public final ۖ:Ll/۫ᩴۘ;

.field public final ۘ:Ll/۠ᩴۘ;

.field public final ۚ:Ll/ۗۘۘ;

.field public final ۜ:Ll/۫ᩴۘ;

.field public final ۠:Ll/ۢ᩵ۘ;

.field public final ۡ:Ll/۠ᩴۘ;

.field public final ۢ:Ll/᩺ᩴۘ;

.field public ܶ:I

.field public final ܺ:Ll/ۛᩴۘ;

.field public final ᩴ:Ll/۠ᩴۘ;

.field public ᩵:I

.field public final ᩷:Ll/۠ᩴۘ;

.field public final ᩸:Ll/ۡ᩵ۘ;


# direct methods
.method public constructor <init>([S)V
    .locals 21

    move-object/from16 v0, p0

    .line 71
    invoke-direct/range {p0 .. p0}, Ll/ۙᩴۘ;-><init>()V

    .line 72
    new-instance v1, Ll/ۗۘۘ;

    move-object/from16 v2, p1

    invoke-direct {v1, v2}, Ll/ۗۘۘ;-><init>([S)V

    iput-object v1, v0, Ll/᩻᩹֫;->ۚ:Ll/ۗۘۘ;

    .line 73
    new-instance v1, Ll/᩺ᩴۘ;

    .line 39
    invoke-direct {v1}, Ll/ᩳ᩵ۘ;-><init>()V

    .line 73
    iput-object v1, v0, Ll/᩻᩹֫;->ۢ:Ll/᩺ᩴۘ;

    .line 74
    new-instance v2, Ll/ۢ᩵ۘ;

    invoke-direct {v2}, Ll/ۢ᩵ۘ;-><init>()V

    iput-object v2, v0, Ll/᩻᩹֫;->۠:Ll/ۢ᩵ۘ;

    .line 75
    new-instance v3, Ll/ۡ᩵ۘ;

    invoke-direct {v3}, Ll/ۡ᩵ۘ;-><init>()V

    iput-object v3, v0, Ll/᩻᩹֫;->᩸:Ll/ۡ᩵ۘ;

    .line 76
    new-instance v4, Ll/۫ᩴۘ;

    invoke-direct {v4}, Ll/۫ᩴۘ;-><init>()V

    iput-object v4, v0, Ll/᩻᩹֫;->ۜ:Ll/۫ᩴۘ;

    .line 77
    new-instance v5, Ll/۫ᩴۘ;

    invoke-direct {v5}, Ll/۫ᩴۘ;-><init>()V

    iput-object v5, v0, Ll/᩻᩹֫;->ۖ:Ll/۫ᩴۘ;

    .line 78
    iget-object v6, v5, Ll/۫ᩴۘ;->ۜ:Ll/۠ᩴۘ;

    iput-object v6, v0, Ll/᩻᩹֫;->ۘ:Ll/۠ᩴۘ;

    .line 79
    new-instance v7, Ll/ۛᩴۘ;

    .line 36
    invoke-direct {v7}, Ll/ܿ᩵ۘ;-><init>()V

    .line 37
    new-instance v8, Ll/۠ᩴۘ;

    const-string v9, "Frequency"

    invoke-direct {v8, v9}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v8, v7, Ll/ۛᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {v7, v8}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide/high16 v11, 0x4079000000000000L    # 400.0

    const-wide v13, 0x40b7700000000000L    # 6000.0

    const-wide/high16 v9, 0x4044000000000000L    # 40.0

    .line 38
    invoke-virtual/range {v8 .. v14}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 52
    new-instance v8, Ll/۠ᩴۘ;

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    const/4 v11, 0x1

    const-string v12, "Amplitude"

    .line 51
    invoke-direct {v8, v11, v12, v9, v10}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 52
    iput-object v8, v7, Ll/ۛᩴۘ;->ܺ:Ll/۠ᩴۘ;

    invoke-virtual {v7, v8}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 38
    new-instance v13, Ll/۠ᩴۘ;

    const-string v8, "Q"

    invoke-direct {v13, v8}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v13, v7, Ll/ۛᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v7, v13}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v18, 0x4024000000000000L    # 10.0

    const-wide v14, 0x3fb999999999999aL    # 0.1

    move-wide/from16 v16, v8

    .line 39
    invoke-virtual/range {v13 .. v19}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 79
    iput-object v7, v0, Ll/᩻᩹֫;->ܺ:Ll/ۛᩴۘ;

    .line 80
    iget-object v10, v1, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    iput-object v10, v0, Ll/᩻᩹֫;->᩷:Ll/۠ᩴۘ;

    .line 81
    new-instance v11, Ll/᩺ᩴۘ;

    .line 39
    invoke-direct {v11}, Ll/ᩳ᩵ۘ;-><init>()V

    .line 82
    iget-object v12, v11, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    iput-object v12, v0, Ll/᩻᩹֫;->ᩴ:Ll/۠ᩴۘ;

    .line 83
    new-instance v13, Ll/᩶ᩴۘ;

    .line 35
    invoke-direct {v13}, Ll/ᩳ᩵ۘ;-><init>()V

    .line 84
    iget-object v15, v13, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    iput-object v15, v0, Ll/᩻᩹֫;->ۡ:Ll/۠ᩴۘ;

    .line 88
    iget-object v14, v11, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    .line 89
    new-instance v8, Ll/᩺ᩴۘ;

    .line 39
    invoke-direct {v8}, Ll/ᩳ᩵ۘ;-><init>()V

    .line 90
    invoke-virtual {v0, v11}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 91
    invoke-virtual {v0, v1}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 92
    invoke-virtual {v0, v8}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 93
    invoke-virtual {v0, v2}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 94
    invoke-virtual {v0, v3}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 96
    invoke-virtual {v0, v4}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 98
    invoke-virtual {v0, v5}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 99
    invoke-virtual {v0, v7}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 100
    invoke-virtual {v0, v13}, Ll/ۙᩴۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 102
    iget-object v3, v5, Ll/ܳ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    iget-object v9, v13, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    move-object/from16 p1, v5

    const/4 v5, 0x0

    .line 65
    invoke-virtual {v3, v5, v9, v5}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 103
    iget-object v3, v13, Ll/ᩳ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    iget-object v9, v7, Ll/ۛᩴۘ;->᩵:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v3, v5, v9, v5}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 104
    iget-object v3, v11, Ll/ᩳ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    iget-object v9, v2, Ll/ۢ᩵ۘ;->ۖ:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v3, v5, v9, v5}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 109
    iget-object v1, v1, Ll/ᩳ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    iget-object v3, v8, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v1, v5, v3, v5}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 111
    iget-object v1, v8, Ll/ᩳ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    iget-object v3, v4, Ll/۫ᩴۘ;->ۜ:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v1, v5, v3, v5}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    const-string v1, "Amplitude"

    .line 113
    invoke-virtual {v0, v10, v1}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    const-string v1, "Frequency"

    .line 114
    invoke-virtual {v0, v12, v1}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    const-string v1, "Cutoff"

    .line 115
    invoke-virtual {v0, v15, v1}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    const-string v1, "Timbre"

    .line 116
    invoke-virtual {v0, v15, v1}, Ll/ۙᩴۘ;->ۧ(Ll/۠ᩴۘ;Ljava/lang/String;)V

    const-string v1, "FreqScaler"

    .line 117
    invoke-virtual {v0, v14, v1}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    const-string v1, "FilterEnvDepth"

    .line 118
    invoke-virtual {v0, v6, v1}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    const-string v1, "Filter"

    move-object/from16 v3, p1

    .line 120
    invoke-virtual {v3, v0, v1}, Ll/۫ᩴۘ;->֫(Ll/ۙᩴۘ;Ljava/lang/String;)V

    const-string v1, "Amp"

    .line 121
    invoke-virtual {v4, v0, v1}, Ll/۫ᩴۘ;->֫(Ll/ۙᩴۘ;Ljava/lang/String;)V

    .line 122
    iget-object v1, v2, Ll/ۢ᩵ۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {v12, v1}, Ll/۠ᩴۘ;->֫(Ll/۠ᩴۘ;)V

    const-wide/high16 v19, 0x4010000000000000L    # 4.0

    const-wide v9, 0x3fc999999999999aL    # 0.2

    move-object v1, v15

    move-wide v15, v9

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    move-wide/from16 v17, v9

    .line 123
    invoke-virtual/range {v14 .. v20}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 124
    iget-object v3, v7, Ll/ۛᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {v1, v3}, Ll/۠ᩴۘ;->֫(Ll/۠ᩴۘ;)V

    const-wide v9, 0x409f400000000000L    # 2000.0

    const-wide v11, 0x40af400000000000L    # 4000.0

    const-wide v13, -0x3f50c00000000000L    # -4000.0

    move-object v1, v8

    move-wide v7, v13

    .line 126
    invoke-virtual/range {v6 .. v12}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 127
    iget-object v2, v2, Ll/ۢ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    invoke-virtual {v2, v6, v7}, Ll/۠ᩴۘ;->֫(D)V

    .line 51
    iget-object v2, v4, Ll/ܳ᩵ۘ;->ܳ:Ll/֡ᩴۘ;

    invoke-virtual {v2, v0}, Ll/֡ᩴۘ;->ۧ(Ll/᩻᩵ۘ;)V

    .line 131
    iget-object v6, v1, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v11, 0x4010000000000000L    # 4.0

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    invoke-virtual/range {v6 .. v12}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 132
    iget-object v1, v1, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    const-string v2, "Pressure"

    invoke-virtual {v0, v1, v2}, Ll/ۙᩴۘ;->ۧ(Ll/۠ᩴۘ;Ljava/lang/String;)V

    .line 134
    invoke-virtual {v0, v5}, Ll/᩻᩹֫;->֫(I)V

    return-void
.end method

.method public static ֫(Ll/ۢ᩹֫;Ll/۫ᩴۘ;Ll/᩸֨ۘ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 282
    iget-object v3, v1, Ll/۫ᩴۘ;->᩷:Ll/۠ᩴۘ;

    .line 310
    iget-short v4, v0, Ll/ۢ᩹֫;->֫:S

    mul-int/lit16 v4, v4, 0x5622

    int-to-double v4, v4

    const-wide/high16 v6, 0x4150000000000000L    # 4194304.0

    div-double/2addr v6, v4

    const-wide v4, 0x3f747ae147ae147bL    # 0.005

    .line 313
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    .line 282
    invoke-virtual {v3, v4, v5, v2}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    .line 283
    iget-object v3, v1, Ll/۫ᩴۘ;->ۡ:Ll/۠ᩴۘ;

    .line 317
    iget-short v4, v0, Ll/ۢ᩹֫;->ۧ:S

    const-wide/high16 v5, 0x3f00000000000000L    # 3.0517578125E-5

    .line 335
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v7

    const-wide/high16 v9, 0x4060000000000000L    # 128.0

    mul-double v7, v7, v9

    int-to-double v11, v4

    const-wide/high16 v13, 0x40e0000000000000L    # 32768.0

    div-double/2addr v11, v13

    .line 336
    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    const-wide v15, 0x40d5888000000000L    # 22050.0

    mul-double v11, v11, v15

    div-double/2addr v7, v11

    .line 283
    invoke-virtual {v3, v7, v8, v2}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    .line 284
    iget-object v3, v1, Ll/۫ᩴۘ;->֨:Ll/۠ᩴۘ;

    .line 325
    iget-short v4, v0, Ll/ۢ᩹֫;->ᩳ:S

    int-to-double v7, v4

    mul-double v7, v7, v5

    .line 284
    invoke-virtual {v3, v7, v8, v2}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    .line 285
    iget-object v1, v1, Ll/۫ᩴۘ;->᩵:Ll/۠ᩴۘ;

    .line 321
    iget-short v0, v0, Ll/ۢ᩹֫;->ܽ:S

    .line 335
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v3

    mul-double v3, v3, v9

    int-to-double v5, v0

    div-double/2addr v5, v13

    .line 336
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v5

    mul-double v5, v5, v15

    div-double/2addr v3, v5

    const-wide v5, 0x3f947ae147ae147bL    # 0.02

    .line 321
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    .line 285
    invoke-virtual {v1, v3, v4, v2}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    return-void
.end method


# virtual methods
.method public final ֫(DDLl/᩸֨ۘ;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    .line 160
    invoke-static/range {p1 .. p2}, Ll/֨֨ۘ;->֫(D)D

    move-result-wide v6

    .line 161
    iget-object v2, v0, Ll/᩻᩹֫;->֡:Ll/ۡ᩹֫;

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v3, v6

    double-to-int v3, v3

    if-eqz v2, :cond_0

    .line 82
    iget-byte v4, v2, Ll/ۡ᩹֫;->᩻:B

    if-gt v4, v3, :cond_0

    iget-byte v4, v2, Ll/ۡ᩹֫;->ܳ:B

    if-lt v4, v3, :cond_0

    goto :goto_1

    .line 203
    :cond_0
    iget v2, v0, Ll/᩻᩹֫;->᩵:I

    invoke-static {v2}, Ll/ܺ᩹֫;->ܽ(I)I

    move-result v2

    .line 204
    invoke-static {v2}, Ll/ܺ᩹֫;->ۧ(I)Ll/ۡ᩹֫;

    move-result-object v4

    move-object/from16 v17, v4

    move v4, v2

    move-object/from16 v2, v17

    .line 82
    :goto_0
    iget-byte v5, v2, Ll/ۡ᩹֫;->᩻:B

    if-gt v5, v3, :cond_1

    iget-byte v5, v2, Ll/ۡ᩹֫;->ܳ:B

    if-lt v5, v3, :cond_1

    goto :goto_1

    .line 78
    :cond_1
    iget v5, v2, Ll/ۡ᩹֫;->ܽ:I

    const v8, 0x8000

    and-int/2addr v5, v8

    if-eqz v5, :cond_9

    .line 211
    :goto_1
    iget v3, v2, Ll/ۡ᩹֫;->᩷:I

    .line 70
    iget v4, v2, Ll/ۡ᩹֫;->ܽ:I

    and-int/lit8 v4, v4, 0x2

    const-wide v8, 0x3f847ae147ae147bL    # 0.01

    iget-object v10, v0, Ll/᩻᩹֫;->ۖ:Ll/۫ᩴۘ;

    iget-object v11, v0, Ll/᩻᩹֫;->ۜ:Ll/۫ᩴۘ;

    const/4 v12, 0x0

    if-eqz v4, :cond_2

    const/4 v3, -0x1

    .line 213
    iput v3, v0, Ll/᩻᩹֫;->֨:I

    .line 214
    iput v12, v0, Ll/᩻᩹֫;->ܶ:I

    goto :goto_3

    :cond_2
    const/16 v4, 0x96

    if-lt v3, v4, :cond_3

    const/4 v2, 0x0

    :goto_2
    move-object v13, v2

    goto :goto_4

    .line 219
    :cond_3
    invoke-static {v3}, Ll/ܺ᩹֫;->ᩳ(I)I

    move-result v4

    iput v4, v0, Ll/᩻᩹֫;->֨:I

    .line 220
    invoke-static {v3}, Ll/ܺ᩹֫;->ܿ(I)I

    move-result v3

    iput v3, v0, Ll/᩻᩹֫;->ܶ:I

    .line 222
    :goto_3
    iget v3, v2, Ll/ۡ᩹֫;->֫:I

    .line 223
    invoke-static {v3}, Ll/ܺ᩹֫;->֫(I)Ll/᩷᩹֫;

    move-result-object v3

    .line 224
    iget-object v4, v3, Ll/᩷᩹֫;->֫:Ll/ۢ᩹֫;

    invoke-static {v4, v11, v1}, Ll/᩻᩹֫;->֫(Ll/ۢ᩹֫;Ll/۫ᩴۘ;Ll/᩸֨ۘ;)V

    .line 225
    iget-object v4, v3, Ll/᩷᩹֫;->ۧ:Ll/ۢ᩹֫;

    invoke-static {v4, v10, v1}, Ll/᩻᩹֫;->֫(Ll/ۢ᩹֫;Ll/۫ᩴۘ;Ll/᩸֨ۘ;)V

    .line 227
    iget-short v3, v3, Ll/᩷᩹֫;->ܽ:S

    .line 228
    iget-object v4, v0, Ll/᩻᩹֫;->ۡ:Ll/۠ᩴۘ;

    if-lez v3, :cond_4

    int-to-double v13, v3

    mul-double v13, v13, v8

    .line 229
    invoke-static {v13, v14}, Ll/֨֨ۘ;->ۧ(D)D

    move-result-wide v13

    .line 230
    invoke-virtual {v4, v13, v14}, Ll/۠ᩴۘ;->֫(D)V

    goto :goto_2

    :cond_4
    const-wide v13, 0x40af400000000000L    # 4000.0

    .line 232
    invoke-virtual {v4, v13, v14}, Ll/۠ᩴۘ;->֫(D)V

    goto :goto_2

    .line 161
    :goto_4
    iput-object v13, v0, Ll/᩻᩹֫;->֡:Ll/ۡ᩹֫;

    if-nez v13, :cond_5

    return-void

    .line 162
    :cond_5
    iget v14, v13, Ll/ۡ᩹֫;->ܽ:I

    .line 277
    iget-short v2, v13, Ll/ۡ᩹֫;->ۜ:S

    int-to-double v2, v2

    const-wide/high16 v15, 0x4028000000000000L    # 12.0

    move-wide v4, v8

    move-wide v8, v15

    .line 278
    invoke-static/range {v2 .. v9}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    const-wide v4, 0x40d5888000000000L    # 22050.0

    mul-double v2, v2, v4

    mul-double v4, p3, p3

    .line 169
    iget-short v6, v13, Ll/ۡ᩹֫;->ۧ:S

    int-to-double v6, v6

    const-wide/high16 v8, 0x3f00000000000000L    # 3.0517578125E-5

    mul-double v6, v6, v8

    mul-double v6, v6, v4

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    mul-double v6, v6, v4

    .line 171
    iget-object v4, v0, Ll/᩻᩹֫;->ᩴ:Ll/۠ᩴۘ;

    invoke-virtual {v4, v2, v3, v1}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    .line 172
    iget-object v2, v0, Ll/᩻᩹֫;->᩷:Ll/۠ᩴۘ;

    invoke-virtual {v2, v6, v7, v1}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    .line 173
    iget-object v2, v11, Ll/ܳ᩵ۘ;->ܳ:Ll/֡ᩴۘ;

    invoke-virtual {v2, v1}, Ll/֡ᩴۘ;->ۧ(Ll/᩸֨ۘ;)V

    .line 174
    iget-object v2, v10, Ll/ܳ᩵ۘ;->ܳ:Ll/֡ᩴۘ;

    invoke-virtual {v2, v1}, Ll/֡ᩴۘ;->ۧ(Ll/᩸֨ۘ;)V

    .line 175
    iget-object v2, v0, Ll/᩻᩹֫;->۠:Ll/ۢ᩵ۘ;

    iget-object v3, v2, Ll/ۢ᩵ۘ;->ۢ:Ll/ܶᩴۘ;

    iget-object v4, v2, Ll/ۢ᩵ۘ;->᩷:Ll/ᩴᩴۘ;

    invoke-virtual {v3}, Ll/ܺᩴۘ;->ᩳ()V

    .line 176
    iget-object v3, v0, Ll/᩻᩹֫;->᩸:Ll/ۡ᩵ۘ;

    iget-object v5, v3, Ll/ۡ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v5}, Ll/ܺᩴۘ;->ᩳ()V

    and-int/lit8 v5, v14, 0x2

    .line 70
    iget-object v6, v0, Ll/᩻᩹֫;->ۢ:Ll/᩺ᩴۘ;

    if-eqz v5, :cond_6

    .line 180
    iget-object v1, v3, Ll/ۡ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    iget-object v2, v6, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v1, v12, v2, v12}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    return-void

    .line 182
    :cond_6
    iget-object v2, v2, Ll/ۢ᩵ۘ;->ۢ:Ll/ܶᩴۘ;

    iget-object v3, v6, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v2, v12, v3, v12}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 183
    invoke-virtual {v4, v1}, Ll/ᩴᩴۘ;->֫(Ll/᩸֨ۘ;)V

    and-int/lit8 v2, v14, 0x1

    .line 74
    iget-object v3, v0, Ll/᩻᩹֫;->ۚ:Ll/ۗۘۘ;

    if-eqz v2, :cond_8

    .line 185
    iget v2, v0, Ll/᩻᩹֫;->֨:I

    iget v5, v13, Ll/ۡ᩹֫;->ܿ:I

    add-int/2addr v5, v2

    .line 186
    iget v6, v13, Ll/ۡ᩹֫;->ᩳ:I

    add-int/2addr v6, v2

    sub-int/2addr v6, v5

    if-le v5, v2, :cond_7

    sub-int v7, v5, v2

    .line 265
    invoke-virtual {v4, v3, v2, v7}, Ll/ᩴᩴۘ;->֫(Ll/ۖ᩹ۢ;II)Ll/᩷ᩴۘ;

    move-result-object v2

    .line 266
    invoke-virtual {v4, v1, v2}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    .line 192
    :cond_7
    invoke-virtual {v4, v3, v5, v6, v1}, Ll/ᩴᩴۘ;->֫(Ll/ۖ᩹ۢ;IILl/᩸֨ۘ;)V

    return-void

    .line 194
    :cond_8
    iget v2, v0, Ll/᩻᩹֫;->֨:I

    iget v5, v0, Ll/᩻᩹֫;->ܶ:I

    .line 265
    invoke-virtual {v4, v3, v2, v5}, Ll/ᩴᩴۘ;->֫(Ll/ۖ᩹ۢ;II)Ll/᩷ᩴۘ;

    move-result-object v2

    .line 266
    invoke-virtual {v4, v1, v2}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void

    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 207
    invoke-static {v4}, Ll/ܺ᩹֫;->ۧ(I)Ll/ۡ᩹֫;

    move-result-object v2

    goto/16 :goto_0
.end method

.method public final ֫(I)V
    .locals 11

    .line 245
    iget v0, p0, Ll/᩻᩹֫;->᩵:I

    if-ne v0, p1, :cond_0

    goto/16 :goto_0

    .line 262
    :cond_0
    iget-object v0, p0, Ll/᩻᩹֫;->ۜ:Ll/۫ᩴۘ;

    iget-object v1, v0, Ll/۫ᩴۘ;->᩷:Ll/۠ᩴۘ;

    const-wide v2, 0x3fb999999999999aL    # 0.1

    invoke-virtual {v1, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    .line 263
    iget-object v1, v0, Ll/۫ᩴۘ;->ۡ:Ll/۠ᩴۘ;

    const-wide v4, 0x3feccccccccccccdL    # 0.9

    invoke-virtual {v1, v4, v5}, Ll/۠ᩴۘ;->֫(D)V

    .line 264
    iget-object v1, v0, Ll/۫ᩴۘ;->֨:Ll/۠ᩴۘ;

    invoke-virtual {v1, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    .line 265
    iget-object v1, v0, Ll/۫ᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {v1, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    .line 266
    iget-object v1, p0, Ll/᩻᩹֫;->ۖ:Ll/۫ᩴۘ;

    iget-object v6, v1, Ll/۫ᩴۘ;->᩷:Ll/۠ᩴۘ;

    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    invoke-virtual {v6, v7, v8}, Ll/۠ᩴۘ;->֫(D)V

    .line 267
    iget-object v6, v1, Ll/۫ᩴۘ;->ۡ:Ll/۠ᩴۘ;

    const-wide v7, 0x3fe3333333333333L    # 0.6

    invoke-virtual {v6, v7, v8}, Ll/۠ᩴۘ;->֫(D)V

    .line 268
    iget-object v6, v1, Ll/۫ᩴۘ;->֨:Ll/۠ᩴۘ;

    const-wide v7, 0x3fd999999999999aL    # 0.4

    invoke-virtual {v6, v7, v8}, Ll/۠ᩴۘ;->֫(D)V

    .line 269
    iget-object v1, v1, Ll/۫ᩴۘ;->᩵:Ll/۠ᩴۘ;

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v1, v6, v7}, Ll/۠ᩴۘ;->֫(D)V

    .line 270
    iget-object v1, p0, Ll/᩻᩹֫;->ܺ:Ll/ۛᩴۘ;

    iget-object v8, v1, Ll/ۛᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v8, v6, v7}, Ll/۠ᩴۘ;->֫(D)V

    const-wide v6, 0x40b3880000000000L    # 5000.0

    .line 271
    iget-object v8, p0, Ll/᩻᩹֫;->ۡ:Ll/۠ᩴۘ;

    invoke-virtual {v8, v6, v7}, Ll/۠ᩴۘ;->֫(D)V

    .line 272
    iget-object v6, p0, Ll/᩻᩹֫;->ۘ:Ll/۠ᩴۘ;

    const-wide v9, 0x407f400000000000L    # 500.0

    invoke-virtual {v6, v9, v10}, Ll/۠ᩴۘ;->֫(D)V

    const/4 v7, 0x0

    .line 273
    iput-object v7, p0, Ll/᩻᩹֫;->֡:Ll/ۡ᩹֫;

    .line 249
    iput p1, p0, Ll/᩻᩹֫;->᩵:I

    if-nez p1, :cond_1

    .line 251
    iget-object p1, v0, Ll/۫ᩴۘ;->᩷:Ll/۠ᩴۘ;

    invoke-virtual {p1, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    .line 252
    iget-object p1, v0, Ll/۫ᩴۘ;->ۡ:Ll/۠ᩴۘ;

    invoke-virtual {p1, v4, v5}, Ll/۠ᩴۘ;->֫(D)V

    .line 253
    iget-object p1, v0, Ll/۫ᩴۘ;->֨:Ll/۠ᩴۘ;

    invoke-virtual {p1, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    .line 254
    iget-object p1, v0, Ll/۫ᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {p1, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    const-wide v2, 0x4072c00000000000L    # 300.0

    .line 255
    invoke-virtual {v8, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    .line 256
    invoke-virtual {v6, v9, v10}, Ll/۠ᩴۘ;->֫(D)V

    .line 257
    iget-object p1, v1, Ll/ۛᩴۘ;->ۜ:Ll/۠ᩴۘ;

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    invoke-virtual {p1, v0, v1}, Ll/۠ᩴۘ;->֫(D)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/᩸֨ۘ;)V
    .locals 4

    .line 139
    iget-object v0, p0, Ll/᩻᩹֫;->֡:Ll/ۡ᩹֫;

    if-nez v0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    iget-object v0, p0, Ll/᩻᩹֫;->ۜ:Ll/۫ᩴۘ;

    iget-object v0, v0, Ll/ܳ᩵ۘ;->ܳ:Ll/֡ᩴۘ;

    invoke-virtual {v0, p1}, Ll/֡ᩴۘ;->֫(Ll/᩸֨ۘ;)V

    .line 143
    iget-object v0, p0, Ll/᩻᩹֫;->ۖ:Ll/۫ᩴۘ;

    iget-object v0, v0, Ll/ܳ᩵ۘ;->ܳ:Ll/֡ᩴۘ;

    invoke-virtual {v0, p1}, Ll/֡ᩴۘ;->֫(Ll/᩸֨ۘ;)V

    .line 144
    iget-object v0, p0, Ll/᩻᩹֫;->֡:Ll/ۡ᩹֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    iget v1, v0, Ll/ۡ᩹֫;->ܽ:I

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    .line 147
    iget v0, v0, Ll/ۡ᩹֫;->ᩳ:I

    add-int/lit8 v1, v0, 0x1

    iget v2, p0, Ll/᩻᩹֫;->ܶ:I

    if-ge v1, v2, :cond_1

    .line 148
    iget v1, p0, Ll/᩻᩹֫;->֨:I

    add-int/2addr v1, v0

    sub-int/2addr v2, v1

    .line 151
    iget-object v0, p0, Ll/᩻᩹֫;->۠:Ll/ۢ᩵ۘ;

    iget-object v0, v0, Ll/ۢ᩵ۘ;->᩷:Ll/ᩴᩴۘ;

    iget-object v3, p0, Ll/᩻᩹֫;->ۚ:Ll/ۗۘۘ;

    .line 265
    invoke-virtual {v0, v3, v1, v2}, Ll/ᩴᩴۘ;->֫(Ll/ۖ᩹ۢ;II)Ll/᩷ᩴۘ;

    move-result-object v1

    .line 266
    invoke-virtual {v0, p1, v1}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩳ()Ll/ܶᩴۘ;
    .locals 1

    .line 240
    iget-object v0, p0, Ll/᩻᩹֫;->ۜ:Ll/۫ᩴۘ;

    iget-object v0, v0, Ll/ܳ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    return-object v0
.end method
