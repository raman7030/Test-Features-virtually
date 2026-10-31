.class public final Ll/۫ᩴۘ;
.super Ll/ܳ᩵ۘ;
.source "K8D0"


# instance fields
.field public ֡:D

.field public ֨:Ll/۠ᩴۘ;

.field public ۖ:Ll/۠ᩴۘ;

.field public ۘ:D

.field public ۚ:Ll/۬ᩴۘ;

.field public ۜ:Ll/۠ᩴۘ;

.field public ۡ:Ll/۠ᩴۘ;

.field public ۢ:D

.field public ܺ:Ll/۠ᩴۘ;

.field public ᩴ:D

.field public ᩵:Ll/۠ᩴۘ;

.field public ᩷:Ll/۠ᩴۘ;


# direct methods
.method public constructor <init>()V
    .locals 27

    move-object/from16 v0, p0

    .line 35
    invoke-direct/range {p0 .. p0}, Ll/᩻᩵ۘ;-><init>()V

    .line 36
    new-instance v1, Ll/֡ᩴۘ;

    invoke-direct {v1}, Ll/֡ᩴۘ;-><init>()V

    iput-object v1, v0, Ll/ܳ᩵ۘ;->ܳ:Ll/֡ᩴۘ;

    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 37
    new-instance v1, Ll/ܶᩴۘ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܶᩴۘ;-><init>(I)V

    iput-object v1, v0, Ll/ܳ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 75
    sget-object v1, Ll/۬ᩴۘ;->۬:Ll/۬ᩴۘ;

    iput-object v1, v0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 77
    iput-wide v1, v0, Ll/۫ᩴۘ;->֡:D

    .line 83
    new-instance v3, Ll/۠ᩴۘ;

    const/4 v10, 0x1

    const-string v4, "Delay"

    const-wide/16 v11, 0x0

    .line 51
    invoke-direct {v3, v10, v4, v11, v12}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 83
    iput-object v3, v0, Ll/۫ᩴۘ;->ܺ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v3}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide/16 v16, 0x0

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    const-wide/16 v4, 0x0

    move-wide/from16 v6, v16

    move-wide/from16 v8, v18

    .line 84
    invoke-virtual/range {v3 .. v9}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 85
    new-instance v3, Ll/۠ᩴۘ;

    const-string v4, "Attack"

    const-wide v5, 0x3fb999999999999aL    # 0.1

    .line 51
    invoke-direct {v3, v10, v4, v5, v6}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 85
    iput-object v3, v0, Ll/۫ᩴۘ;->᩷:Ll/۠ᩴۘ;

    invoke-virtual {v0, v3}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide v23, 0x3fb999999999999aL    # 0.1

    const-wide/high16 v25, 0x4020000000000000L    # 8.0

    const-wide v21, 0x3f847ae147ae147bL    # 0.01

    move-object/from16 v20, v3

    .line 86
    invoke-virtual/range {v20 .. v26}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 87
    new-instance v13, Ll/۠ᩴۘ;

    const-string v3, "Hold"

    .line 51
    invoke-direct {v13, v10, v3, v11, v12}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 87
    iput-object v13, v0, Ll/۫ᩴۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v13}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide/16 v14, 0x0

    .line 88
    invoke-virtual/range {v13 .. v19}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 89
    new-instance v3, Ll/۠ᩴۘ;

    const-string v4, "Decay"

    const-wide v5, 0x3fc999999999999aL    # 0.2

    .line 51
    invoke-direct {v3, v10, v4, v5, v6}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 89
    iput-object v3, v0, Ll/۫ᩴۘ;->ۡ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v3}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide v6, 0x3fc999999999999aL    # 0.2

    const-wide/high16 v16, 0x4020000000000000L    # 8.0

    const-wide v12, 0x3f847ae147ae147bL    # 0.01

    move-wide v4, v12

    move-wide/from16 v8, v16

    .line 90
    invoke-virtual/range {v3 .. v9}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 91
    new-instance v3, Ll/۠ᩴۘ;

    const-string v4, "Sustain"

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 51
    invoke-direct {v3, v10, v4, v5, v6}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 91
    iput-object v3, v0, Ll/۫ᩴۘ;->֨:Ll/۠ᩴۘ;

    invoke-virtual {v0, v3}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide/high16 v21, 0x3fe0000000000000L    # 0.5

    const-wide/high16 v23, 0x3ff0000000000000L    # 1.0

    const-wide/16 v19, 0x0

    move-object/from16 v18, v3

    .line 92
    invoke-virtual/range {v18 .. v24}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 93
    new-instance v11, Ll/۠ᩴۘ;

    const-string v3, "Release"

    const-wide v4, 0x3fd3333333333333L    # 0.3

    .line 51
    invoke-direct {v11, v10, v3, v4, v5}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 93
    iput-object v11, v0, Ll/۫ᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {v0, v11}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide v14, 0x3fd3333333333333L    # 0.3

    .line 94
    invoke-virtual/range {v11 .. v17}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 95
    new-instance v3, Ll/۠ᩴۘ;

    const-string v4, "Amplitude"

    .line 51
    invoke-direct {v3, v10, v4, v1, v2}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 95
    iput-object v3, v0, Ll/۫ᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v3}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    return-void
.end method

.method private ۧ(I)V
    .locals 5

    .line 236
    iget-object v0, p0, Ll/۫ᩴۘ;->᩷:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 237
    aget-wide v1, v0, p1

    const-wide v3, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v0, v1, v3

    if-gez v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 239
    iput-wide v0, p0, Ll/۫ᩴۘ;->ᩴ:D

    .line 240
    invoke-direct {p0, p1}, Ll/۫ᩴۘ;->ܿ(I)V

    return-void

    .line 74
    :cond_0
    iget-object p1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {p1}, Ll/۟ۘۘ;->ܽ()D

    move-result-wide v3

    div-double/2addr v3, v1

    .line 242
    iput-wide v3, p0, Ll/۫ᩴۘ;->ۘ:D

    .line 243
    sget-object p1, Ll/۬ᩴۘ;->᩹:Ll/۬ᩴۘ;

    iput-object p1, p0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    return-void
.end method

.method private ܳ(I)V
    .locals 5

    .line 273
    iget-object v0, p0, Ll/۫ᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 274
    aget-wide v1, v0, p1

    const-wide v3, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double p1, v1, v3

    if-gez p1, :cond_0

    move-wide v1, v3

    .line 120
    :cond_0
    iget-object p1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    .line 278
    invoke-virtual {p1, v1, v2}, Ll/۟ۘۘ;->֫(D)D

    move-result-wide v0

    iput-wide v0, p0, Ll/۫ᩴۘ;->֡:D

    .line 279
    sget-object p1, Ll/۬ᩴۘ;->۫:Ll/۬ᩴۘ;

    iput-object p1, p0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    return-void
.end method

.method private ܽ(I)V
    .locals 5

    .line 258
    iget-object v0, p0, Ll/۫ᩴۘ;->ۡ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 259
    aget-wide v1, v0, p1

    const-wide v3, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double p1, v1, v3

    if-gez p1, :cond_0

    .line 269
    sget-object p1, Ll/۬ᩴۘ;->ۤ:Ll/۬ᩴۘ;

    iput-object p1, p0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    return-void

    .line 120
    :cond_0
    iget-object p1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    .line 263
    invoke-virtual {p1, v1, v2}, Ll/۟ۘۘ;->֫(D)D

    move-result-wide v0

    iput-wide v0, p0, Ll/۫ᩴۘ;->֡:D

    .line 264
    sget-object p1, Ll/۬ᩴۘ;->᩶:Ll/۬ᩴۘ;

    iput-object p1, p0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    return-void
.end method

.method private ܿ(I)V
    .locals 5

    .line 248
    iget-object v0, p0, Ll/۫ᩴۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 249
    aget-wide v1, v0, p1

    const-wide/16 v3, 0x0

    cmpg-double v0, v1, v3

    if-gtz v0, :cond_0

    .line 250
    invoke-direct {p0, p1}, Ll/۫ᩴۘ;->ܽ(I)V

    return-void

    .line 69
    :cond_0
    iget-object p1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {p1}, Ll/۟ۘۘ;->ᩳ()I

    move-result p1

    int-to-double v3, p1

    mul-double v1, v1, v3

    double-to-int p1, v1

    int-to-double v0, p1

    .line 252
    iput-wide v0, p0, Ll/۫ᩴۘ;->ۢ:D

    .line 253
    sget-object p1, Ll/۬ᩴۘ;->ۗ:Ll/۬ᩴۘ;

    iput-object p1, p0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    return-void
.end method

.method private ᩳ(I)V
    .locals 5

    .line 226
    iget-object v0, p0, Ll/۫ᩴۘ;->ܺ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 227
    aget-wide v1, v0, p1

    const-wide/16 v3, 0x0

    cmpg-double v0, v1, v3

    if-gtz v0, :cond_0

    .line 228
    invoke-direct {p0, p1}, Ll/۫ᩴۘ;->ۧ(I)V

    return-void

    .line 69
    :cond_0
    iget-object p1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {p1}, Ll/۟ۘۘ;->ᩳ()I

    move-result p1

    int-to-double v3, p1

    mul-double v1, v1, v3

    double-to-int p1, v1

    int-to-double v0, p1

    .line 230
    iput-wide v0, p0, Ll/۫ᩴۘ;->ۢ:D

    .line 231
    sget-object p1, Ll/۬ᩴۘ;->ۙ:Ll/۬ᩴۘ;

    iput-object p1, p0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۙᩴۘ;Ljava/lang/String;)V
    .locals 3

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 283
    iget-object v1, p0, Ll/۫ᩴۘ;->᩷:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/᩸ᩴۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 284
    iget-object v1, p0, Ll/۫ᩴۘ;->ۡ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/᩸ᩴۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 285
    iget-object v1, p0, Ll/۫ᩴۘ;->֨:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/᩸ᩴۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 286
    iget-object v0, p0, Ll/۫ᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/᩸ᩴۘ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ll/᩻᩵ۘ;->֫(Ll/۠ᩴۘ;Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()V
    .locals 15

    move-object v0, p0

    .line 100
    iget-object v1, v0, Ll/۫ᩴۘ;->֨:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    .line 101
    iget-object v2, v0, Ll/۫ᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v2}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v2

    .line 102
    iget-object v3, v0, Ll/ܳ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v3}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v3

    const/4 v4, 0x0

    :cond_0
    :goto_0
    const/16 v5, 0x8

    if-ge v4, v5, :cond_10

    .line 105
    iget-object v6, v0, Ll/ܳ᩵ۘ;->ܳ:Ll/֡ᩴۘ;

    invoke-virtual {v6, v4}, Ll/֡ᩴۘ;->ۧ(I)Z

    move-result v7

    .line 106
    sget-object v8, Ll/ۗᩴۘ;->֫:[I

    iget-object v9, v0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    packed-switch v8, :pswitch_data_0

    goto :goto_0

    :goto_1
    :pswitch_0
    if-ge v4, v5, :cond_0

    .line 204
    iget-wide v11, v0, Ll/۫ᩴۘ;->ᩴ:D

    aget-wide v13, v2, v4

    mul-double v13, v13, v11

    aput-wide v13, v3, v4

    const-wide v13, 0x3ef09e6a4f05e621L    # 1.5848931924611107E-5

    .line 205
    iget-wide v9, v0, Ll/۫ᩴۘ;->֡:D

    mul-double v11, v11, v9

    iput-wide v11, v0, Ll/۫ᩴۘ;->ᩴ:D

    if-eqz v7, :cond_1

    .line 207
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ᩳ(I)V

    goto :goto_0

    :cond_1
    cmpg-double v8, v11, v13

    if-gez v8, :cond_2

    .line 210
    invoke-virtual {v6}, Ll/֡ᩴۘ;->ۢ()V

    .line 221
    :goto_2
    sget-object v5, Ll/۬ᩴۘ;->۬:Ll/۬ᩴۘ;

    iput-object v5, v0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    const-wide/16 v5, 0x0

    .line 222
    iput-wide v5, v0, Ll/۫ᩴۘ;->ᩴ:D

    goto :goto_0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :goto_3
    :pswitch_1
    if-ge v4, v5, :cond_0

    .line 190
    aget-wide v8, v1, v4

    iput-wide v8, v0, Ll/۫ᩴۘ;->ᩴ:D

    .line 191
    aget-wide v10, v2, v4

    mul-double v8, v8, v10

    aput-wide v8, v3, v4

    if-eqz v7, :cond_3

    .line 193
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ᩳ(I)V

    goto :goto_0

    .line 195
    :cond_3
    invoke-virtual {v6}, Ll/֡ᩴۘ;->ۡ()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 196
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ܳ(I)V

    goto :goto_0

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :pswitch_2
    const-wide v8, 0x3ef09e6a4f05e621L    # 1.5848931924611107E-5

    :goto_4
    if-ge v4, v5, :cond_0

    .line 168
    iget-wide v10, v0, Ll/۫ᩴۘ;->ᩴ:D

    aget-wide v12, v2, v4

    mul-double v12, v12, v10

    aput-wide v12, v3, v4

    .line 169
    iget-wide v12, v0, Ll/۫ᩴۘ;->֡:D

    mul-double v10, v10, v12

    iput-wide v10, v0, Ll/۫ᩴۘ;->ᩴ:D

    if-eqz v7, :cond_5

    .line 171
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ᩳ(I)V

    goto/16 :goto_0

    .line 173
    :cond_5
    aget-wide v12, v1, v4

    cmpg-double v14, v10, v12

    if-gez v14, :cond_6

    .line 174
    iput-wide v12, v0, Ll/۫ᩴۘ;->ᩴ:D

    .line 269
    sget-object v5, Ll/۬ᩴۘ;->ۤ:Ll/۬ᩴۘ;

    iput-object v5, v0, Ll/۫ᩴۘ;->ۚ:Ll/۬ᩴۘ;

    goto/16 :goto_0

    :cond_6
    cmpg-double v12, v10, v8

    if-gez v12, :cond_7

    .line 178
    invoke-virtual {v6}, Ll/֡ᩴۘ;->ۢ()V

    goto :goto_2

    .line 181
    :cond_7
    invoke-virtual {v6}, Ll/֡ᩴۘ;->ۡ()Z

    move-result v10

    if-eqz v10, :cond_8

    .line 182
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ܳ(I)V

    goto/16 :goto_0

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :goto_5
    :pswitch_3
    if-ge v4, v5, :cond_0

    .line 154
    aget-wide v7, v2, v4

    aput-wide v7, v3, v4

    .line 155
    iget-wide v7, v0, Ll/۫ᩴۘ;->ۢ:D

    sub-double/2addr v7, v11

    iput-wide v7, v0, Ll/۫ᩴۘ;->ۢ:D

    const-wide/16 v9, 0x0

    cmpg-double v13, v7, v9

    if-gtz v13, :cond_9

    .line 157
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ܽ(I)V

    goto/16 :goto_0

    .line 159
    :cond_9
    invoke-virtual {v6}, Ll/֡ᩴۘ;->ۡ()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 160
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ܳ(I)V

    goto/16 :goto_0

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :goto_6
    :pswitch_4
    if-ge v4, v5, :cond_0

    .line 136
    iget-wide v7, v0, Ll/۫ᩴۘ;->ᩴ:D

    iget-wide v9, v0, Ll/۫ᩴۘ;->ۘ:D

    add-double/2addr v7, v9

    iput-wide v7, v0, Ll/۫ᩴۘ;->ᩴ:D

    cmpl-double v9, v7, v11

    if-ltz v9, :cond_b

    .line 138
    iput-wide v11, v0, Ll/۫ᩴۘ;->ᩴ:D

    .line 139
    aget-wide v5, v2, v4

    mul-double v11, v11, v5

    aput-wide v11, v3, v4

    .line 140
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ܿ(I)V

    goto/16 :goto_0

    .line 143
    :cond_b
    aget-wide v9, v2, v4

    mul-double v7, v7, v9

    aput-wide v7, v3, v4

    .line 144
    invoke-virtual {v6}, Ll/֡ᩴۘ;->ۡ()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 145
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ܳ(I)V

    goto/16 :goto_0

    :cond_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :goto_7
    :pswitch_5
    if-ge v4, v5, :cond_0

    .line 119
    iget-wide v7, v0, Ll/۫ᩴۘ;->ᩴ:D

    aget-wide v9, v2, v4

    mul-double v7, v7, v9

    aput-wide v7, v3, v4

    .line 120
    invoke-virtual {v6}, Ll/֡ᩴۘ;->ۡ()Z

    move-result v7

    if-eqz v7, :cond_d

    .line 121
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ܳ(I)V

    goto/16 :goto_0

    .line 124
    :cond_d
    iget-wide v7, v0, Ll/۫ᩴۘ;->ۢ:D

    sub-double/2addr v7, v11

    iput-wide v7, v0, Ll/۫ᩴۘ;->ۢ:D

    const-wide/16 v9, 0x0

    cmpg-double v13, v7, v9

    if-gtz v13, :cond_e

    .line 126
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ۧ(I)V

    goto/16 :goto_0

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :goto_8
    :pswitch_6
    if-ge v4, v5, :cond_0

    .line 109
    iget-wide v8, v0, Ll/۫ᩴۘ;->ᩴ:D

    aget-wide v10, v2, v4

    mul-double v8, v8, v10

    aput-wide v8, v3, v4

    if-eqz v7, :cond_f

    .line 111
    invoke-direct {p0, v4}, Ll/۫ᩴۘ;->ᩳ(I)V

    goto/16 :goto_0

    :cond_f
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_10
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
