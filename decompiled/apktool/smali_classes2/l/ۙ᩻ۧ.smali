.class public final Ll/ۙ᩻ۧ;
.super Ljava/lang/Object;
.source "D8ML"


# instance fields
.field public final ֫:J

.field public ۖ:F

.field public ۘ:Z

.field public ۜ:J

.field public ۡ:J

.field public ۢ:Z

.field public ۧ:Ll/ܽۚ֫;

.field public final ܳ:Ll/ܿ᩻ۧ;

.field public ܺ:J

.field public ܽ:I

.field public final ܿ:Ll/ۛ᩻ۧ;

.field public ᩳ:Z

.field public ᩷:J

.field public ᩻:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ܿ᩻ۧ;J)V
    .locals 0

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object p2, p0, Ll/ۙ᩻ۧ;->ܳ:Ll/ܿ᩻ۧ;

    .line 204
    iput-wide p3, p0, Ll/ۙ᩻ۧ;->֫:J

    .line 205
    new-instance p2, Ll/ۛ᩻ۧ;

    invoke-direct {p2, p1}, Ll/ۛ᩻ۧ;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    const/4 p1, 0x0

    .line 206
    iput p1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 207
    iput-wide p1, p0, Ll/ۙ᩻ۧ;->ۜ:J

    .line 208
    iput-wide p1, p0, Ll/ۙ᩻ۧ;->ۡ:J

    .line 209
    iput-wide p1, p0, Ll/ۙ᩻ۧ;->᩷:J

    const/high16 p1, 0x3f800000    # 1.0f

    .line 210
    iput p1, p0, Ll/ۙ᩻ۧ;->ۖ:F

    .line 211
    sget-object p1, Ll/ܽۚ֫;->֫:Ll/ܳ֨֫;

    iput-object p1, p0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    return-void
.end method


# virtual methods
.method public final ֫(JJJJZZLl/᩶᩻ۧ;)I
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v4, p3

    move-object/from16 v8, p11

    .line 358
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->ܽ(Ll/᩶᩻ۧ;)V

    .line 360
    iget-boolean v3, v0, Ll/ۙ᩻ۧ;->ۘ:Z

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v3, :cond_0

    iget-wide v9, v0, Ll/ۙ᩻ۧ;->ۜ:J

    cmp-long v3, v9, v6

    if-nez v3, :cond_0

    .line 361
    iput-wide v4, v0, Ll/ۙ᩻ۧ;->ۜ:J

    .line 363
    :cond_0
    iget-wide v9, v0, Ll/ۙ᩻ۧ;->ۡ:J

    iget-object v3, v0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    cmp-long v11, v9, v1

    if-eqz v11, :cond_1

    .line 364
    invoke-virtual {v3, v1, v2}, Ll/ۛ᩻ۧ;->ۧ(J)V

    .line 365
    iput-wide v1, v0, Ll/ۙ᩻ۧ;->ۡ:J

    :cond_1
    sub-long/2addr v1, v4

    long-to-double v1, v1

    .line 476
    iget v9, v0, Ll/ۙ᩻ۧ;->ۖ:F

    float-to-double v9, v9

    div-double/2addr v1, v9

    double-to-long v1, v1

    .line 477
    iget-boolean v9, v0, Ll/ۙ᩻ۧ;->ۘ:Z

    if-eqz v9, :cond_2

    .line 479
    iget-object v9, v0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    invoke-interface {v9}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v9

    invoke-static {v9, v10}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v9

    sub-long v9, v9, p5

    sub-long/2addr v1, v9

    .line 369
    :cond_2
    invoke-static {v8, v1, v2}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;J)V

    const/4 v9, 0x3

    if-eqz p9, :cond_3

    if-nez p10, :cond_3

    :goto_0
    const/4 v1, 0x3

    goto/16 :goto_6

    .line 374
    :cond_3
    iget-boolean v1, v0, Ll/ۙ᩻ۧ;->᩻:Z

    iget-object v2, v0, Ll/ۙ᩻ۧ;->ܳ:Ll/ܿ᩻ۧ;

    const/4 v10, 0x1

    if-nez v1, :cond_5

    .line 375
    iput-boolean v10, v0, Ll/ۙ᩻ۧ;->ᩳ:Z

    .line 377
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;)J

    move-result-wide v6

    const/4 v10, 0x1

    move-object v1, v2

    move-wide v2, v6

    move-wide/from16 v4, p3

    move/from16 v6, p10

    move v7, v10

    invoke-virtual/range {v1 .. v7}, Ll/ܿ᩻ۧ;->֫(JJZZ)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_5

    .line 385
    :cond_4
    iget-boolean v1, v0, Ll/ۙ᩻ۧ;->ۘ:Z

    if-eqz v1, :cond_14

    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;)J

    move-result-wide v1

    const-wide/16 v3, 0x7530

    cmp-long v5, v1, v3

    if-gez v5, :cond_14

    goto :goto_0

    .line 389
    :cond_5
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;)J

    move-result-wide v11

    .line 488
    iget-wide v13, v0, Ll/ۙ᩻ۧ;->᩷:J

    const-wide/16 v15, -0x7530

    const/4 v1, 0x2

    const/16 v17, 0x0

    cmp-long v18, v13, v6

    if-eqz v18, :cond_6

    iget-boolean v13, v0, Ll/ۙ᩻ۧ;->ۢ:Z

    if-nez v13, :cond_6

    goto :goto_1

    .line 492
    :cond_6
    iget v13, v0, Ll/ۙ᩻ۧ;->ܽ:I

    if-eqz v13, :cond_b

    if-eq v13, v10, :cond_a

    if-eq v13, v1, :cond_8

    if-ne v13, v9, :cond_7

    .line 500
    iget-object v13, v0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    .line 501
    invoke-interface {v13}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v13

    invoke-static {v13, v14}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v13

    iget-wide v9, v0, Ll/ۙ᩻ۧ;->ܺ:J

    sub-long/2addr v13, v9

    .line 502
    iget-boolean v9, v0, Ll/ۙ᩻ۧ;->ۘ:Z

    if-eqz v9, :cond_9

    iget-wide v9, v0, Ll/ۙ᩻ۧ;->ۜ:J

    cmp-long v18, v9, v6

    if-eqz v18, :cond_9

    cmp-long v18, v9, v4

    if-eqz v18, :cond_9

    cmp-long v9, v11, v15

    if-gez v9, :cond_9

    const-wide/32 v9, 0x186a0

    cmp-long v11, v13, v9

    if-lez v11, :cond_9

    goto :goto_2

    .line 507
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_8
    cmp-long v9, v4, p7

    if-ltz v9, :cond_9

    goto :goto_2

    :cond_9
    :goto_1
    const/4 v9, 0x0

    goto :goto_3

    :cond_a
    :goto_2
    const/4 v9, 0x1

    goto :goto_3

    .line 494
    :cond_b
    iget-boolean v9, v0, Ll/ۙ᩻ۧ;->ۘ:Z

    :goto_3
    if-eqz v9, :cond_c

    return v17

    .line 392
    :cond_c
    iget-boolean v9, v0, Ll/ۙ᩻ۧ;->ۘ:Z

    if-eqz v9, :cond_14

    iget-wide v9, v0, Ll/ۙ᩻ۧ;->ۜ:J

    cmp-long v11, v4, v9

    if-nez v11, :cond_d

    goto :goto_7

    .line 397
    :cond_d
    iget-object v9, v0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    invoke-interface {v9}, Ll/ܽۚ֫;->ᩳ()J

    move-result-wide v9

    .line 398
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;)J

    move-result-wide v11

    const-wide/16 v13, 0x3e8

    mul-long v11, v11, v13

    add-long/2addr v11, v9

    .line 399
    invoke-virtual {v3, v11, v12}, Ll/ۛ᩻ۧ;->֫(J)J

    move-result-wide v11

    invoke-static {v8, v11, v12}, Ll/᩶᩻ۧ;->ۧ(Ll/᩶᩻ۧ;J)V

    .line 400
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->ۧ(Ll/᩶᩻ۧ;)J

    move-result-wide v11

    sub-long/2addr v11, v9

    div-long/2addr v11, v13

    invoke-static {v8, v11, v12}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;J)V

    .line 402
    iget-wide v9, v0, Ll/ۙ᩻ۧ;->᩷:J

    cmp-long v3, v9, v6

    if-eqz v3, :cond_e

    iget-boolean v3, v0, Ll/ۙ᩻ۧ;->ۢ:Z

    if-nez v3, :cond_e

    const/4 v3, 0x1

    const/4 v9, 0x1

    goto :goto_4

    :cond_e
    const/4 v3, 0x0

    const/4 v9, 0x0

    .line 404
    :goto_4
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;)J

    move-result-wide v6

    const/4 v10, 0x2

    move-object v1, v2

    move-wide v2, v6

    move-wide/from16 v4, p3

    move/from16 v6, p10

    move v7, v9

    invoke-virtual/range {v1 .. v7}, Ll/ܿ᩻ۧ;->֫(JJZZ)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_5
    const/4 v1, 0x4

    return v1

    .line 407
    :cond_f
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;)J

    move-result-wide v1

    cmp-long v3, v1, v15

    if-gez v3, :cond_10

    if-nez p10, :cond_10

    const/16 v17, 0x1

    :cond_10
    if-eqz v17, :cond_12

    if-eqz v9, :cond_11

    goto/16 :goto_0

    :goto_6
    return v1

    :cond_11
    return v10

    .line 411
    :cond_12
    invoke-static/range {p11 .. p11}, Ll/᩶᩻ۧ;->֫(Ll/᩶᩻ۧ;)J

    move-result-wide v1

    const-wide/32 v3, 0xc350

    cmp-long v5, v1, v3

    if-lez v5, :cond_13

    goto :goto_7

    :cond_13
    const/4 v1, 0x1

    return v1

    :cond_14
    :goto_7
    const/4 v1, 0x5

    return v1
.end method

.method public final ֫()V
    .locals 1

    .line 285
    iget v0, p0, Ll/ۙ᩻ۧ;->ܽ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 286
    iput v0, p0, Ll/ۙ᩻ۧ;->ܽ:I

    :cond_0
    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 260
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۛ᩻ۧ;->֫(F)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 457
    iget p1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    return-void

    .line 232
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    const/4 p1, 0x0

    .line 226
    iput p1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    return-void

    .line 223
    :cond_2
    iput v0, p0, Ll/ۙ᩻ۧ;->ܽ:I

    return-void
.end method

.method public final ֫(Landroid/view/Surface;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 252
    :goto_0
    iput-boolean v2, p0, Ll/ۙ᩻ۧ;->᩻:Z

    .line 253
    iput-boolean v0, p0, Ll/ۙ᩻ۧ;->ᩳ:Z

    .line 254
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۛ᩻ۧ;->֫(Landroid/view/Surface;)V

    .line 457
    iget p1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/ܽۚ֫;)V
    .locals 0

    .line 277
    iput-object p1, p0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    return-void
.end method

.method public final ֫(Z)Z
    .locals 8

    const/4 v0, 0x1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p1, :cond_1

    .line 297
    iget p1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    const/4 v3, 0x3

    if-eq p1, v3, :cond_0

    iget-boolean p1, p0, Ll/ۙ᩻ۧ;->᩻:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/ۙ᩻ۧ;->ᩳ:Z

    if-eqz p1, :cond_1

    .line 301
    :cond_0
    iput-wide v1, p0, Ll/ۙ᩻ۧ;->᩷:J

    return v0

    .line 303
    :cond_1
    iget-wide v3, p0, Ll/ۙ᩻ۧ;->᩷:J

    const/4 p1, 0x0

    cmp-long v5, v3, v1

    if-nez v5, :cond_2

    return p1

    .line 306
    :cond_2
    iget-object v3, p0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    invoke-interface {v3}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۙ᩻ۧ;->᩷:J

    cmp-long v7, v3, v5

    if-gez v7, :cond_3

    return v0

    .line 311
    :cond_3
    iput-wide v1, p0, Ll/ۙ᩻ۧ;->᩷:J

    return p1
.end method

.method public final ۧ(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 439
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 440
    iget v0, p0, Ll/ۙ᩻ۧ;->ۖ:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    return-void

    .line 443
    :cond_1
    iput p1, p0, Ll/ۙ᩻ۧ;->ۖ:F

    .line 444
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۛ᩻ۧ;->ۧ(F)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 434
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۛ᩻ۧ;->֫(I)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 4

    .line 326
    iput-boolean p1, p0, Ll/ۙ᩻ۧ;->ۢ:Z

    const-wide/16 v0, 0x0

    .line 328
    iget-wide v2, p0, Ll/ۙ᩻ۧ;->֫:J

    cmp-long p1, v2, v0

    if-lez p1, :cond_0

    iget-object p1, p0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    invoke-interface {p1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide v0, p0, Ll/ۙ᩻ۧ;->᩷:J

    return-void
.end method

.method public final ۧ()Z
    .locals 3

    .line 269
    iget v0, p0, Ll/ۙ᩻ۧ;->ܽ:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 270
    :goto_0
    iput v1, p0, Ll/ۙ᩻ۧ;->ܽ:I

    .line 271
    iget-object v1, p0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    invoke-interface {v1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۙ᩻ۧ;->ܺ:J

    return v0
.end method

.method public final ܽ()V
    .locals 2

    const/4 v0, 0x1

    .line 238
    iput-boolean v0, p0, Ll/ۙ᩻ۧ;->ۘ:Z

    .line 239
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ۧ:Ll/ܽۚ֫;

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۙ᩻ۧ;->ܺ:J

    .line 240
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    invoke-virtual {v0}, Ll/ۛ᩻ۧ;->ۧ()V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 419
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    invoke-virtual {v0}, Ll/ۛ᩻ۧ;->֫()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 420
    iput-wide v0, p0, Ll/ۙ᩻ۧ;->ۡ:J

    .line 421
    iput-wide v0, p0, Ll/ۙ᩻ۧ;->ۜ:J

    const/4 v2, 0x1

    .line 457
    iget v3, p0, Ll/ۙ᩻ۧ;->ܽ:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Ll/ۙ᩻ۧ;->ܽ:I

    .line 423
    iput-wide v0, p0, Ll/ۙ᩻ۧ;->᩷:J

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    const/4 v0, 0x0

    .line 245
    iput-boolean v0, p0, Ll/ۙ᩻ۧ;->ۘ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 246
    iput-wide v0, p0, Ll/ۙ᩻ۧ;->᩷:J

    .line 247
    iget-object v0, p0, Ll/ۙ᩻ۧ;->ܿ:Ll/ۛ᩻ۧ;

    invoke-virtual {v0}, Ll/ۛ᩻ۧ;->ܽ()V

    return-void
.end method
