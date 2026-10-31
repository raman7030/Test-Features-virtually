.class public final Ll/֫᩵ۘ;
.super Ll/᩻᩵ۘ;
.source "O8C4"

# interfaces
.implements Ll/᩷᩵ۘ;


# instance fields
.field public ۜ:Ll/ܶᩴۘ;

.field public ܳ:Ll/۠ᩴۘ;

.field public ᩷:Ll/᩹ᩴۘ;

.field public ᩻:Ll/۠ᩴۘ;


# virtual methods
.method public final ֫(DDLl/᩸֨ۘ;)V
    .locals 1

    .line 86
    iget-object v0, p0, Ll/֫᩵ۘ;->᩻:Ll/۠ᩴۘ;

    invoke-virtual {v0, p1, p2, p5}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    .line 87
    iget-object p1, p0, Ll/֫᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {p1, p3, p4, p5}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/᩸֨ۘ;)V
    .locals 3

    .line 81
    iget-object v0, p0, Ll/֫᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2, p1}, Ll/۠ᩴۘ;->֫(DLl/᩸֨ۘ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 18

    move-object/from16 v0, p0

    .line 40
    iget-object v1, v0, Ll/֫᩵ۘ;->᩻:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    .line 41
    iget-object v2, v0, Ll/֫᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v2}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v2

    .line 42
    iget-object v3, v0, Ll/֫᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    invoke-virtual {v3}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v3

    .line 43
    iget-object v4, v0, Ll/֫᩵ۘ;->᩷:Ll/᩹ᩴۘ;

    invoke-virtual {v4}, Ll/᩹ᩴۘ;->ᩳ()D

    move-result-wide v5

    const/4 v7, 0x0

    :goto_0
    const/16 v8, 0x8

    if-ge v7, v8, :cond_6

    .line 47
    aget-wide v8, v1, v7

    .line 54
    :try_start_0
    iget-object v10, v0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v10}, Ll/۟ۘۘ;->ܿ()D

    move-result-wide v10
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    mul-double v8, v8, v10

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    cmpl-double v14, v8, v10

    if-lez v14, :cond_0

    move-wide v8, v10

    goto :goto_1

    :cond_0
    cmpg-double v14, v8, v12

    if-gez v14, :cond_1

    move-wide v8, v12

    :cond_1
    :goto_1
    add-double/2addr v5, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    cmpl-double v14, v5, v10

    if-ltz v14, :cond_2

    sub-double/2addr v5, v8

    goto :goto_2

    :cond_2
    cmpg-double v14, v5, v12

    if-gez v14, :cond_3

    add-double/2addr v5, v8

    :cond_3
    :goto_2
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    cmpl-double v14, v5, v8

    if-lez v14, :cond_4

    sub-double v8, v10, v5

    goto :goto_3

    :cond_4
    const-wide/high16 v8, -0x4020000000000000L    # -0.5

    cmpg-double v14, v5, v8

    if-gez v14, :cond_5

    sub-double v8, v12, v5

    goto :goto_3

    :cond_5
    move-wide v8, v5

    :goto_3
    const-wide v12, 0x400921fb54442d18L    # Math.PI

    mul-double v8, v8, v12

    mul-double v12, v8, v8

    const-wide v14, -0x41a519ba980abb1cL    # -2.505210838544172E-8

    mul-double v14, v14, v12

    const-wide v16, 0x3ec71de3a556c734L    # 2.7557319223985893E-6

    add-double v14, v14, v16

    mul-double v14, v14, v12

    const-wide v16, 0x3f2a01a01a01a01aL    # 1.984126984126984E-4

    sub-double v14, v14, v16

    mul-double v14, v14, v12

    const-wide v16, 0x3f81111111111111L    # 0.008333333333333333

    add-double v14, v14, v16

    mul-double v14, v14, v12

    const-wide v16, 0x3fc5555555555555L    # 0.16666666666666666

    sub-double v14, v14, v16

    mul-double v14, v14, v12

    add-double/2addr v14, v10

    mul-double v14, v14, v8

    .line 51
    aget-wide v8, v2, v7

    mul-double v14, v14, v8

    aput-wide v14, v3, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 56
    :catch_0
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Null Synth! You probably forgot to add this unit to the Synthesizer!"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 58
    :cond_6
    invoke-virtual {v4, v5, v6}, Ll/᩹ᩴۘ;->֫(D)V

    return-void
.end method

.method public final ᩳ()Ll/ܶᩴۘ;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֫᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    return-object v0
.end method
