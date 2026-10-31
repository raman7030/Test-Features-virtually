.class public final Ll/ۤ᩹֫;
.super Ljava/lang/Object;
.source "Y8PU"

# interfaces
.implements Ll/۬ۙ֫;


# instance fields
.field public ֫:F

.field public ۖ:J

.field public ۘ:J

.field public ۜ:J

.field public ۡ:J

.field public final ۢ:F

.field public ۧ:J

.field public ܳ:F

.field public ܺ:J

.field public ܽ:J

.field public final ܿ:J

.field public ᩳ:J

.field public final ᩴ:J

.field public ᩷:F

.field public ᩻:J


# direct methods
.method public constructor <init>(FJJ)V
    .locals 0

    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 292
    iput-wide p2, p0, Ll/ۤ᩹֫;->ܿ:J

    .line 293
    iput-wide p4, p0, Ll/ۤ᩹֫;->ᩴ:J

    .line 294
    iput p1, p0, Ll/ۤ᩹֫;->ۢ:F

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 295
    iput-wide p1, p0, Ll/ۤ᩹֫;->ۜ:J

    .line 296
    iput-wide p1, p0, Ll/ۤ᩹֫;->ۘ:J

    .line 297
    iput-wide p1, p0, Ll/ۤ᩹֫;->ۡ:J

    .line 298
    iput-wide p1, p0, Ll/ۤ᩹֫;->᩻:J

    const p3, 0x3f7851ec    # 0.97f

    .line 299
    iput p3, p0, Ll/ۤ᩹֫;->᩷:F

    const p3, 0x3f83d70a    # 1.03f

    .line 300
    iput p3, p0, Ll/ۤ᩹֫;->ܳ:F

    const/high16 p3, 0x3f800000    # 1.0f

    .line 301
    iput p3, p0, Ll/ۤ᩹֫;->֫:F

    .line 302
    iput-wide p1, p0, Ll/ۤ᩹֫;->ᩳ:J

    .line 303
    iput-wide p1, p0, Ll/ۤ᩹֫;->ܽ:J

    .line 304
    iput-wide p1, p0, Ll/ۤ᩹֫;->ۧ:J

    .line 305
    iput-wide p1, p0, Ll/ۤ᩹֫;->ۖ:J

    .line 306
    iput-wide p1, p0, Ll/ۤ᩹֫;->ܺ:J

    return-void
.end method

.method private ܽ()V
    .locals 7

    .line 381
    iget-wide v0, p0, Ll/ۤ᩹֫;->ۜ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    .line 382
    iget-wide v4, p0, Ll/ۤ᩹֫;->ۘ:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    goto :goto_0

    .line 386
    :cond_0
    iget-wide v4, p0, Ll/ۤ᩹֫;->ۡ:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    cmp-long v6, v0, v4

    if-gez v6, :cond_1

    move-wide v0, v4

    .line 389
    :cond_1
    iget-wide v4, p0, Ll/ۤ᩹֫;->᩻:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_2

    cmp-long v6, v0, v4

    if-lez v6, :cond_2

    goto :goto_0

    :cond_2
    move-wide v4, v0

    goto :goto_0

    :cond_3
    move-wide v4, v2

    .line 394
    :goto_0
    iget-wide v0, p0, Ll/ۤ᩹֫;->ܽ:J

    cmp-long v6, v0, v4

    if-nez v6, :cond_4

    return-void

    .line 397
    :cond_4
    iput-wide v4, p0, Ll/ۤ᩹֫;->ܽ:J

    .line 398
    iput-wide v4, p0, Ll/ۤ᩹֫;->ۧ:J

    .line 399
    iput-wide v2, p0, Ll/ۤ᩹֫;->ۖ:J

    .line 400
    iput-wide v2, p0, Ll/ۤ᩹֫;->ܺ:J

    .line 401
    iput-wide v2, p0, Ll/ۤ᩹֫;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ֫(JJ)F
    .locals 18

    move-object/from16 v0, p0

    .line 350
    iget-wide v1, v0, Ll/ۤ᩹֫;->ۜ:J

    const/high16 v3, 0x3f800000    # 1.0f

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v1, v4

    if-nez v6, :cond_0

    return v3

    :cond_0
    sub-long v1, p1, p3

    .line 406
    iget-wide v6, v0, Ll/ۤ᩹֫;->ۖ:J

    cmp-long v8, v6, v4

    if-nez v8, :cond_1

    .line 407
    iput-wide v1, v0, Ll/ۤ᩹֫;->ۖ:J

    const-wide/16 v1, 0x0

    .line 408
    iput-wide v1, v0, Ll/ۤ᩹֫;->ܺ:J

    goto :goto_0

    :cond_1
    long-to-float v6, v6

    .line 460
    iget v7, v0, Ll/ۤ᩹֫;->ۢ:F

    mul-float v6, v6, v7

    sub-float v8, v3, v7

    long-to-float v9, v1

    mul-float v9, v9, v8

    add-float/2addr v9, v6

    float-to-long v9, v9

    .line 413
    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    iput-wide v9, v0, Ll/ۤ᩹֫;->ۖ:J

    sub-long/2addr v1, v9

    .line 420
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    .line 421
    iget-wide v9, v0, Ll/ۤ᩹֫;->ܺ:J

    long-to-float v6, v9

    mul-float v7, v7, v6

    long-to-float v1, v1

    mul-float v8, v8, v1

    add-float/2addr v8, v7

    float-to-long v1, v8

    .line 422
    iput-wide v1, v0, Ll/ۤ᩹֫;->ܺ:J

    .line 356
    :goto_0
    iget-wide v1, v0, Ll/ۤ᩹֫;->ᩳ:J

    const-wide/16 v6, 0x3e8

    cmp-long v8, v1, v4

    if-eqz v8, :cond_2

    .line 357
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v8, v0, Ll/ۤ᩹֫;->ᩳ:J

    sub-long/2addr v1, v8

    cmp-long v8, v1, v6

    if-gez v8, :cond_2

    .line 358
    iget v1, v0, Ll/ۤ᩹֫;->֫:F

    return v1

    .line 360
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۤ᩹֫;->ᩳ:J

    .line 431
    iget-wide v1, v0, Ll/ۤ᩹֫;->ۖ:J

    const-wide/16 v8, 0x3

    iget-wide v10, v0, Ll/ۤ᩹֫;->ܺ:J

    mul-long v10, v10, v8

    add-long v16, v10, v1

    .line 433
    iget-wide v1, v0, Ll/ۤ᩹֫;->ۧ:J

    const v8, 0x33d6bf95    # 1.0E-7f

    cmp-long v9, v1, v16

    if-lez v9, :cond_5

    .line 437
    invoke-static {v6, v7}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v1

    .line 438
    iget v4, v0, Ll/ۤ᩹֫;->֫:F

    sub-float/2addr v4, v3

    long-to-float v1, v1

    mul-float v4, v4, v1

    float-to-long v4, v4

    .line 440
    iget v2, v0, Ll/ۤ᩹֫;->ܳ:F

    sub-float/2addr v2, v3

    mul-float v2, v2, v1

    float-to-long v1, v2

    add-long/2addr v4, v1

    .line 442
    iget-wide v1, v0, Ll/ۤ᩹֫;->ܽ:J

    iget-wide v6, v0, Ll/ۤ᩹֫;->ۧ:J

    sub-long/2addr v6, v4

    const/4 v4, 0x3

    new-array v5, v4, [J

    const/4 v9, 0x0

    aput-wide v16, v5, v9

    const/4 v10, 0x1

    aput-wide v1, v5, v10

    const/4 v1, 0x2

    aput-wide v6, v5, v1

    .line 215
    aget-wide v1, v5, v9

    :goto_1
    if-ge v10, v4, :cond_4

    .line 217
    aget-wide v6, v5, v10

    cmp-long v9, v6, v1

    if-lez v9, :cond_3

    move-wide v1, v6

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 443
    :cond_4
    iput-wide v1, v0, Ll/ۤ᩹֫;->ۧ:J

    goto :goto_2

    .line 448
    :cond_5
    iget v1, v0, Ll/ۤ᩹֫;->֫:F

    sub-float/2addr v1, v3

    const/4 v2, 0x0

    .line 449
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float/2addr v1, v8

    float-to-long v1, v1

    sub-long v12, p1, v1

    .line 450
    iget-wide v14, v0, Ll/ۤ᩹֫;->ۧ:J

    .line 451
    invoke-static/range {v12 .. v17}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۤ᩹֫;->ۧ:J

    .line 452
    iget-wide v6, v0, Ll/ۤ᩹֫;->᩻:J

    cmp-long v9, v6, v4

    if-eqz v9, :cond_6

    cmp-long v4, v1, v6

    if-lez v4, :cond_6

    .line 454
    iput-wide v6, v0, Ll/ۤ᩹֫;->ۧ:J

    .line 363
    :cond_6
    :goto_2
    iget-wide v1, v0, Ll/ۤ᩹֫;->ۧ:J

    sub-long v1, p1, v1

    .line 364
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    iget-wide v6, v0, Ll/ۤ᩹֫;->ܿ:J

    cmp-long v9, v4, v6

    if-gez v9, :cond_7

    .line 365
    iput v3, v0, Ll/ۤ᩹֫;->֫:F

    goto :goto_3

    :cond_7
    long-to-float v1, v1

    mul-float v8, v8, v1

    add-float/2addr v8, v3

    .line 368
    iget v1, v0, Ll/ۤ᩹֫;->᩷:F

    iget v2, v0, Ll/ۤ᩹֫;->ܳ:F

    .line 369
    invoke-static {v8, v1, v2}, Ll/ۘ֨֫;->֫(FFF)F

    move-result v1

    iput v1, v0, Ll/ۤ᩹֫;->֫:F

    .line 371
    :goto_3
    iget v1, v0, Ll/ۤ᩹֫;->֫:F

    return v1
.end method

.method public final ֫()J
    .locals 2

    .line 376
    iget-wide v0, p0, Ll/ۤ᩹֫;->ۧ:J

    return-wide v0
.end method

.method public final ֫(J)V
    .locals 0

    .line 331
    iput-wide p1, p0, Ll/ۤ᩹֫;->ۘ:J

    .line 332
    invoke-direct {p0}, Ll/ۤ᩹֫;->ܽ()V

    return-void
.end method

.method public final ֫(Ll/ۛᩴ֫;)V
    .locals 3

    .line 311
    iget-wide v0, p1, Ll/ۛᩴ֫;->ܿ:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ᩹֫;->ۜ:J

    .line 312
    iget-wide v0, p1, Ll/ۛᩴ֫;->ܽ:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ᩹֫;->ۡ:J

    .line 313
    iget-wide v0, p1, Ll/ۛᩴ֫;->֫:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ᩹֫;->᩻:J

    .line 315
    iget v0, p1, Ll/ۛᩴ֫;->ᩳ:F

    const v1, -0x800001

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x3f7851ec    # 0.97f

    .line 317
    :goto_0
    iput v0, p0, Ll/ۤ᩹֫;->᩷:F

    .line 319
    iget p1, p1, Ll/ۛᩴ֫;->ۧ:F

    cmpl-float v1, p1, v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const p1, 0x3f83d70a    # 1.03f

    .line 321
    :goto_1
    iput p1, p0, Ll/ۤ᩹֫;->ܳ:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    cmpl-float p1, p1, v1

    if-nez p1, :cond_2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 324
    iput-wide v0, p0, Ll/ۤ᩹֫;->ۜ:J

    .line 326
    :cond_2
    invoke-direct {p0}, Ll/ۤ᩹֫;->ܽ()V

    return-void
.end method

.method public final ۧ()V
    .locals 7

    .line 337
    iget-wide v0, p0, Ll/ۤ᩹֫;->ۧ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    .line 340
    :cond_0
    iget-wide v4, p0, Ll/ۤ᩹֫;->ᩴ:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Ll/ۤ᩹֫;->ۧ:J

    .line 341
    iget-wide v4, p0, Ll/ۤ᩹֫;->᩻:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    .line 343
    iput-wide v4, p0, Ll/ۤ᩹֫;->ۧ:J

    .line 345
    :cond_1
    iput-wide v2, p0, Ll/ۤ᩹֫;->ᩳ:J

    return-void
.end method
