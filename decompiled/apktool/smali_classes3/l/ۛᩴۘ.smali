.class public final Ll/ۛᩴۘ;
.super Ll/ܿ᩵ۘ;
.source "B8CV"


# instance fields
.field public ֡:D

.field public ֨:D

.field public ۖ:D

.field public ۘ:D

.field public ۚ:D

.field public ۜ:Ll/۠ᩴۘ;

.field public ۠:D

.field public ۡ:D

.field public ۢ:D

.field public ܶ:D

.field public ܺ:Ll/۠ᩴۘ;

.field public ᩴ:D

.field public ᩵:Ll/۠ᩴۘ;

.field public ᩷:D

.field public ᩸:D

.field public ᩹:D


# virtual methods
.method public final ۧ()V
    .locals 32

    move-object/from16 v0, p0

    .line 68
    iget-object v1, v0, Ll/ۛᩴۘ;->᩵:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    const/4 v2, 0x0

    aget-wide v3, v1, v2

    .line 72
    iget-object v1, v0, Ll/ۛᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    aget-wide v5, v1, v2

    const-wide v1, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v7, v3, v1

    if-gez v7, :cond_0

    move-wide v3, v1

    :cond_0
    cmpg-double v7, v5, v1

    if-gez v7, :cond_1

    move-wide v5, v1

    .line 96
    :cond_1
    iget-wide v1, v0, Ll/ۛᩴۘ;->ۚ:D

    cmpl-double v7, v3, v1

    if-nez v7, :cond_2

    iget-wide v1, v0, Ll/ۛᩴۘ;->֨:D

    cmpl-double v7, v5, v1

    if-eqz v7, :cond_4

    .line 86
    :cond_2
    iput-wide v3, v0, Ll/ۛᩴۘ;->ۚ:D

    .line 87
    iput-wide v5, v0, Ll/ۛᩴۘ;->֨:D

    .line 74
    iget-object v1, v0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v1}, Ll/۟ۘۘ;->ܽ()D

    move-result-wide v1

    mul-double v1, v1, v3

    const-wide v3, 0x3fdfef9db22d0e56L    # 0.499

    cmpl-double v7, v1, v3

    if-ltz v7, :cond_3

    move-wide v1, v3

    :cond_3
    const-wide v3, 0x401921fb54442d18L    # 6.283185307179586

    mul-double v1, v1, v3

    .line 54
    iput-wide v1, v0, Ll/ۛᩴۘ;->֡:D

    .line 55
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    iput-wide v1, v0, Ll/ۛᩴۘ;->ᩴ:D

    .line 56
    iget-wide v1, v0, Ll/ۛᩴۘ;->֡:D

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    mul-double v5, v5, v3

    div-double/2addr v1, v5

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double v5, v1, v3

    div-double v5, v3, v5

    iget-wide v7, v0, Ll/ۛᩴۘ;->ᩴ:D

    sub-double v9, v3, v7

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    mul-double v11, v11, v9

    mul-double v11, v11, v5

    .line 59
    iput-wide v11, v0, Ll/ۛᩴۘ;->᩷:D

    mul-double v9, v9, v5

    .line 60
    iput-wide v9, v0, Ll/ۛᩴۘ;->ۢ:D

    .line 61
    iput-wide v11, v0, Ll/ۛᩴۘ;->ۡ:D

    const-wide/high16 v9, -0x4000000000000000L    # -2.0

    mul-double v7, v7, v9

    mul-double v7, v7, v5

    .line 62
    iput-wide v7, v0, Ll/ۛᩴۘ;->ۖ:D

    sub-double/2addr v3, v1

    mul-double v3, v3, v5

    .line 63
    iput-wide v3, v0, Ll/ۛᩴۘ;->ۘ:D

    .line 97
    :cond_4
    iget-object v1, v0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    .line 98
    iget-object v2, v0, Ll/ۛᩴۘ;->ܺ:Ll/۠ᩴۘ;

    invoke-virtual {v2}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v2

    .line 99
    iget-object v3, v0, Ll/ܿ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v3}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v3

    .line 103
    iget-wide v4, v0, Ll/ۛᩴۘ;->۠:D

    .line 104
    iget-wide v6, v0, Ll/ۛᩴۘ;->ܶ:D

    .line 106
    iget-wide v8, v0, Ll/ۛᩴۘ;->᩸:D

    .line 107
    iget-wide v10, v0, Ll/ۛᩴۘ;->᩹:D

    .line 109
    iget-wide v12, v0, Ll/ۛᩴۘ;->᩷:D

    .line 110
    iget-wide v14, v0, Ll/ۛᩴۘ;->ۢ:D

    move-wide/from16 v16, v4

    .line 111
    iget-wide v4, v0, Ll/ۛᩴۘ;->ۡ:D

    move-wide/from16 v18, v6

    .line 113
    iget-wide v6, v0, Ll/ۛᩴۘ;->ۖ:D

    move-wide/from16 v20, v8

    .line 114
    iget-wide v8, v0, Ll/ۛᩴۘ;->ۘ:D

    const/16 v22, 0x0

    move-wide/from16 v22, v8

    const/4 v0, 0x0

    move-wide/from16 v30, v16

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-wide/from16 v2, v18

    move-wide/from16 v18, v10

    move-wide/from16 v10, v30

    :goto_0
    const/16 v8, 0x8

    if-ge v0, v8, :cond_5

    .line 120
    aget-wide v8, v1, v0

    mul-double v24, v12, v8

    mul-double v26, v14, v10

    add-double v26, v26, v24

    mul-double v2, v2, v4

    add-double v2, v2, v26

    mul-double v24, v6, v20

    sub-double v2, v2, v24

    mul-double v18, v18, v22

    sub-double v18, v2, v18

    .line 124
    aget-wide v2, v16, v0

    mul-double v2, v2, v18

    aput-wide v2, v17, v0

    add-int/lit8 v2, v0, 0x1

    .line 126
    aget-wide v24, v1, v2

    mul-double v26, v12, v24

    mul-double v28, v14, v8

    add-double v28, v28, v26

    mul-double v10, v10, v4

    add-double v10, v10, v28

    mul-double v26, v6, v18

    sub-double v10, v10, v26

    mul-double v20, v20, v22

    sub-double v20, v10, v20

    .line 130
    aget-wide v10, v16, v2

    mul-double v10, v10, v20

    aput-wide v10, v17, v2

    add-int/lit8 v0, v0, 0x2

    move-wide v2, v8

    move-wide/from16 v10, v24

    goto :goto_0

    :cond_5
    move-object/from16 v0, p0

    .line 136
    iput-wide v10, v0, Ll/ۛᩴۘ;->۠:D

    .line 137
    iput-wide v2, v0, Ll/ۛᩴۘ;->ܶ:D

    const-wide v1, 0x3a88c240c4aecb14L    # 1.0E-26

    add-double v3, v20, v1

    .line 140
    iput-wide v3, v0, Ll/ۛᩴۘ;->᩸:D

    sub-double v1, v18, v1

    .line 141
    iput-wide v1, v0, Ll/ۛᩴۘ;->᩹:D

    return-void
.end method
