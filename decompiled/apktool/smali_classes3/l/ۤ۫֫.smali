.class public final Ll/ۤ۫֫;
.super Ljava/lang/Object;
.source "T8SY"


# instance fields
.field public ֡:J

.field public ֨:I

.field public ֫:Ll/۬۫֫;

.field public ֫֫:J

.field public ۖ:Z

.field public ۗ:I

.field public ۘ:J

.field public ۙ:J

.field public ۚ:J

.field public ۛ:J

.field public ۜ:J

.field public ۟:J

.field public ۠:J

.field public ۡ:Ljava/lang/reflect/Method;

.field public ۢ:J

.field public final ۤ:[J

.field public ۧ:Landroid/media/AudioTrack;

.field public ۨ:J

.field public ۫:I

.field public ۬:J

.field public ܰ:J

.field public ܳ:Ll/ܽۚ֫;

.field public final ܶ:Ll/۫۫֫;

.field public ܺ:Z

.field public ܽ:F

.field public ܿ:J

.field public ᩳ:I

.field public ᩴ:J

.field public ᩵:J

.field public ᩶:Z

.field public ᩷:Z

.field public ᩸:Z

.field public ᩹:I

.field public ᩺:J

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/۫۫֫;)V
    .locals 2

    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    iput-object p1, p0, Ll/ۤ۫֫;->ܶ:Ll/۫۫֫;

    .line 226
    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    const-string v0, "getLatency"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ۫֫;->ۡ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/16 p1, 0xa

    new-array p1, p1, [J

    .line 230
    iput-object p1, p0, Ll/ۤ۫֫;->ۤ:[J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 231
    iput-wide v0, p0, Ll/ۤ۫֫;->ۚ:J

    .line 232
    iput-wide v0, p0, Ll/ۤ۫֫;->᩵:J

    .line 233
    sget-object p1, Ll/ܽۚ֫;->֫:Ll/ܳ֨֫;

    iput-object p1, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    return-void
.end method

.method private ۜ()J
    .locals 10

    .line 663
    iget-object v0, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 665
    iget-wide v0, p0, Ll/ۤ۫֫;->ܰ:J

    return-wide v0

    .line 668
    :cond_0
    iget-object v0, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۤ۫֫;->۟:J

    sub-long/2addr v0, v2

    .line 669
    iget v2, p0, Ll/ۤ۫֫;->ܽ:F

    .line 670
    invoke-static {v0, v1, v2}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide v3

    .line 671
    iget v0, p0, Ll/ۤ۫֫;->ۗ:I

    int-to-long v5, v0

    const-wide/32 v7, 0xf4240

    .line 1659
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    invoke-static/range {v3 .. v9}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    .line 672
    iget-wide v2, p0, Ll/ۤ۫֫;->ܰ:J

    add-long/2addr v2, v0

    return-wide v2
.end method

.method private ܳ(J)V
    .locals 5

    .line 505
    iget-boolean v0, p0, Ll/ۤ۫֫;->᩻:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Ll/ۤ۫֫;->ۙ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    cmp-long v4, p1, v0

    if-gez v4, :cond_0

    goto :goto_0

    :cond_0
    sub-long/2addr p1, v0

    .line 511
    iget v0, p0, Ll/ۤ۫֫;->ܽ:F

    .line 512
    invoke-static {p1, p2, v0}, Ll/ۘ֨֫;->ۧ(JF)J

    move-result-wide p1

    .line 514
    iget-object v0, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    .line 515
    invoke-interface {v0}, Ll/ܽۚ֫;->֫()J

    move-result-wide v0

    invoke-static {p1, p2}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide p1

    sub-long/2addr v0, p1

    .line 516
    iput-wide v2, p0, Ll/ۤ۫֫;->ۙ:J

    .line 517
    iget-object p1, p0, Ll/ۤ۫֫;->ܶ:Ll/۫۫֫;

    check-cast p1, Ll/᩵ۤ֫;

    invoke-virtual {p1, v0, v1}, Ll/᩵ۤ֫;->֫(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method private ܿ(J)J
    .locals 5

    .line 583
    iget v0, p0, Ll/ۤ۫֫;->۫:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_1

    .line 586
    iget-wide p1, p0, Ll/ۤ۫֫;->۟:J

    cmp-long v0, p1, v1

    if-eqz v0, :cond_0

    .line 588
    invoke-direct {p0}, Ll/ۤ۫֫;->ۜ()J

    move-result-wide p1

    iget v0, p0, Ll/ۤ۫֫;->ۗ:I

    .line 587
    invoke-static {v0, p1, p2}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide p1

    goto :goto_0

    .line 637
    :cond_0
    invoke-direct {p0}, Ll/ۤ۫֫;->᩻()J

    move-result-wide p1

    iget v0, p0, Ll/ۤ۫֫;->ۗ:I

    invoke-static {v0, p1, p2}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide p1

    goto :goto_0

    .line 594
    :cond_1
    iget-wide v3, p0, Ll/ۤ۫֫;->᩺:J

    add-long/2addr p1, v3

    iget v0, p0, Ll/ۤ۫֫;->ܽ:F

    .line 595
    invoke-static {p1, p2, v0}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide p1

    .line 599
    :goto_0
    iget-wide v3, p0, Ll/ۤ۫֫;->۠:J

    sub-long/2addr p1, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 600
    iget-wide v3, p0, Ll/ۤ۫֫;->۟:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_2

    .line 601
    iget-wide v0, p0, Ll/ۤ۫֫;->ۜ:J

    iget v2, p0, Ll/ۤ۫֫;->ۗ:I

    .line 602
    invoke-static {v2, v0, v1}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    :cond_2
    return-wide p1
.end method

.method private ᩷()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 608
    iput-wide v0, p0, Ll/ۤ۫֫;->᩺:J

    const/4 v2, 0x0

    .line 609
    iput v2, p0, Ll/ۤ۫֫;->۫:I

    .line 610
    iput v2, p0, Ll/ۤ۫֫;->᩹:I

    .line 611
    iput-wide v0, p0, Ll/ۤ۫֫;->ᩴ:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 612
    iput-wide v0, p0, Ll/ۤ۫֫;->᩵:J

    .line 613
    iput-wide v0, p0, Ll/ۤ۫֫;->ۚ:J

    .line 614
    iput-boolean v2, p0, Ll/ۤ۫֫;->᩶:Z

    return-void
.end method

.method private ᩻()J
    .locals 12

    .line 649
    iget-wide v0, p0, Ll/ۤ۫֫;->۟:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 650
    invoke-direct {p0}, Ll/ۤ۫֫;->ۜ()J

    move-result-wide v0

    .line 651
    iget-wide v2, p0, Ll/ۤ۫֫;->ۜ:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    .line 653
    :cond_0
    iget-object v0, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    .line 654
    iget-wide v4, p0, Ll/ۤ۫֫;->֡:J

    sub-long v4, v0, v4

    const-wide/16 v6, 0x5

    cmp-long v8, v4, v6

    if-ltz v8, :cond_9

    .line 676
    iget-object v4, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1

    goto :goto_1

    .line 682
    :cond_1
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v4

    int-to-long v6, v4

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    .line 683
    iget-boolean v4, p0, Ll/ۤ۫֫;->᩸:Z

    const-wide/16 v8, 0x0

    if-eqz v4, :cond_3

    const/4 v4, 0x2

    if-ne v5, v4, :cond_2

    cmp-long v4, v6, v8

    if-nez v4, :cond_2

    .line 688
    iget-wide v10, p0, Ll/ۤ۫֫;->ۛ:J

    iput-wide v10, p0, Ll/ۤ۫֫;->۬:J

    .line 690
    :cond_2
    iget-wide v10, p0, Ll/ۤ۫֫;->۬:J

    add-long/2addr v6, v10

    .line 693
    :cond_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1d

    if-gt v4, v10, :cond_5

    cmp-long v4, v6, v8

    if-nez v4, :cond_4

    .line 694
    iget-wide v10, p0, Ll/ۤ۫֫;->ۛ:J

    cmp-long v4, v10, v8

    if-lez v4, :cond_4

    const/4 v4, 0x3

    if-ne v5, v4, :cond_4

    .line 702
    iget-wide v4, p0, Ll/ۤ۫֫;->ۢ:J

    cmp-long v6, v4, v2

    if-nez v6, :cond_8

    .line 703
    iput-wide v0, p0, Ll/ۤ۫֫;->ۢ:J

    goto :goto_1

    .line 707
    :cond_4
    iput-wide v2, p0, Ll/ۤ۫֫;->ۢ:J

    .line 711
    :cond_5
    iget-wide v2, p0, Ll/ۤ۫֫;->ۛ:J

    cmp-long v4, v2, v6

    if-lez v4, :cond_7

    .line 712
    iget-boolean v4, p0, Ll/ۤ۫֫;->᩷:Z

    if-eqz v4, :cond_6

    .line 713
    iget-wide v4, p0, Ll/ۤ۫֫;->֫֫:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/ۤ۫֫;->֫֫:J

    const/4 v2, 0x0

    .line 714
    iput-boolean v2, p0, Ll/ۤ۫֫;->᩷:Z

    goto :goto_0

    .line 717
    :cond_6
    iget-wide v2, p0, Ll/ۤ۫֫;->ۨ:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ۤ۫֫;->ۨ:J

    .line 720
    :cond_7
    :goto_0
    iput-wide v6, p0, Ll/ۤ۫֫;->ۛ:J

    .line 657
    :cond_8
    :goto_1
    iput-wide v0, p0, Ll/ۤ۫֫;->֡:J

    .line 659
    :cond_9
    iget-wide v0, p0, Ll/ۤ۫֫;->ۛ:J

    iget-wide v2, p0, Ll/ۤ۫֫;->֫֫:J

    add-long/2addr v0, v2

    iget-wide v2, p0, Ll/ۤ۫֫;->ۨ:J

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 464
    iput-boolean v0, p0, Ll/ۤ۫֫;->᩷:Z

    .line 465
    iget-object v0, p0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    if-eqz v0, :cond_0

    .line 466
    invoke-virtual {v0}, Ll/۬۫֫;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 281
    iput p1, p0, Ll/ۤ۫֫;->ܽ:F

    .line 284
    iget-object p1, p0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    if-eqz p1, :cond_0

    .line 285
    invoke-virtual {p1}, Ll/۬۫֫;->ᩳ()V

    .line 287
    :cond_0
    invoke-direct {p0}, Ll/ۤ۫֫;->᩷()V

    return-void
.end method

.method public final ֫(J)V
    .locals 2

    .line 432
    invoke-direct {p0}, Ll/ۤ۫֫;->᩻()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ۫֫;->ܰ:J

    .line 433
    iget-object v0, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ۫֫;->۟:J

    .line 434
    iput-wide p1, p0, Ll/ۤ۫֫;->ۜ:J

    return-void
.end method

.method public final ֫(Landroid/media/AudioTrack;ZIIIZ)V
    .locals 2

    .line 254
    iput-object p1, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 255
    iput p5, p0, Ll/ۤ۫֫;->ᩳ:I

    .line 256
    new-instance v0, Ll/۬۫֫;

    iget-object v1, p0, Ll/ۤ۫֫;->ܶ:Ll/۫۫֫;

    invoke-direct {v0, p1, v1}, Ll/۬۫֫;-><init>(Landroid/media/AudioTrack;Ll/۫۫֫;)V

    iput-object v0, p0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    .line 257
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result p1

    iput p1, p0, Ll/ۤ۫֫;->ۗ:I

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    .line 633
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-ge p2, v0, :cond_1

    const/4 p2, 0x5

    if-eq p3, p2, :cond_0

    const/4 p2, 0x6

    if-ne p3, p2, :cond_1

    :cond_0
    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 258
    :goto_0
    iput-boolean p2, p0, Ll/ۤ۫֫;->᩸:Z

    .line 259
    invoke-static {p3}, Ll/ۘ֨֫;->ۜ(I)Z

    move-result p2

    iput-boolean p2, p0, Ll/ۤ۫֫;->ۖ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p2, :cond_2

    .line 262
    div-int/2addr p5, p4

    int-to-long p2, p5

    iget p4, p0, Ll/ۤ۫֫;->ۗ:I

    invoke-static {p4, p2, p3}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide p2

    goto :goto_1

    :cond_2
    move-wide p2, v0

    .line 263
    :goto_1
    iput-wide p2, p0, Ll/ۤ۫֫;->ܿ:J

    const-wide/16 p2, 0x0

    .line 264
    iput-wide p2, p0, Ll/ۤ۫֫;->ۛ:J

    .line 265
    iput-wide p2, p0, Ll/ۤ۫֫;->ۨ:J

    .line 266
    iput-boolean p1, p0, Ll/ۤ۫֫;->᩷:Z

    .line 267
    iput-wide p2, p0, Ll/ۤ۫֫;->֫֫:J

    .line 268
    iput-wide p2, p0, Ll/ۤ۫֫;->۬:J

    .line 269
    iput-boolean p1, p0, Ll/ۤ۫֫;->ܺ:Z

    .line 270
    iput-wide v0, p0, Ll/ۤ۫֫;->۟:J

    .line 271
    iput-wide v0, p0, Ll/ۤ۫֫;->ۢ:J

    .line 272
    iput-wide p2, p0, Ll/ۤ۫֫;->ۘ:J

    .line 273
    iput-wide p2, p0, Ll/ۤ۫֫;->۠:J

    const/high16 p2, 0x3f800000    # 1.0f

    .line 274
    iput p2, p0, Ll/ۤ۫֫;->ܽ:F

    .line 275
    iput p1, p0, Ll/ۤ۫֫;->֨:I

    .line 276
    iput-wide v0, p0, Ll/ۤ۫֫;->ۙ:J

    .line 277
    iput-boolean p6, p0, Ll/ۤ۫֫;->᩻:Z

    return-void
.end method

.method public final ֫(Ll/ܽۚ֫;)V
    .locals 0

    .line 486
    iput-object p1, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    return-void
.end method

.method public final ۧ()J
    .locals 18

    move-object/from16 v0, p0

    .line 291
    iget-object v1, v0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v2

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x3

    if-ne v2, v8, :cond_6

    .line 521
    iget-object v2, v0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    invoke-interface {v2}, Ll/ܽۚ֫;->ᩳ()J

    move-result-wide v9

    div-long v13, v9, v3

    .line 522
    iget-wide v9, v0, Ll/ۤ۫֫;->ᩴ:J

    sub-long v9, v13, v9

    const-wide/16 v11, 0x7530

    cmp-long v2, v9, v11

    if-ltz v2, :cond_2

    .line 637
    invoke-direct/range {p0 .. p0}, Ll/ۤ۫֫;->᩻()J

    move-result-wide v9

    iget v2, v0, Ll/ۤ۫֫;->ۗ:I

    invoke-static {v2, v9, v10}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v9

    cmp-long v2, v9, v5

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 529
    :cond_0
    iget v2, v0, Ll/ۤ۫֫;->᩹:I

    iget v11, v0, Ll/ۤ۫֫;->ܽ:F

    .line 530
    invoke-static {v9, v10, v11}, Ll/ۘ֨֫;->ۧ(JF)J

    move-result-wide v9

    sub-long/2addr v9, v13

    iget-object v11, v0, Ll/ۤ۫֫;->ۤ:[J

    aput-wide v9, v11, v2

    .line 532
    iget v2, v0, Ll/ۤ۫֫;->᩹:I

    add-int/2addr v2, v7

    const/16 v9, 0xa

    rem-int/2addr v2, v9

    iput v2, v0, Ll/ۤ۫֫;->᩹:I

    .line 533
    iget v2, v0, Ll/ۤ۫֫;->۫:I

    if-ge v2, v9, :cond_1

    add-int/2addr v2, v7

    .line 534
    iput v2, v0, Ll/ۤ۫֫;->۫:I

    .line 536
    :cond_1
    iput-wide v13, v0, Ll/ۤ۫֫;->ᩴ:J

    .line 537
    iput-wide v5, v0, Ll/ۤ۫֫;->᩺:J

    const/4 v2, 0x0

    .line 538
    :goto_0
    iget v9, v0, Ll/ۤ۫֫;->۫:I

    if-ge v2, v9, :cond_2

    .line 539
    iget-wide v7, v0, Ll/ۤ۫֫;->᩺:J

    aget-wide v15, v11, v2

    move-object v12, v11

    int-to-long v10, v9

    div-long/2addr v15, v10

    add-long/2addr v7, v15

    iput-wide v7, v0, Ll/ۤ۫֫;->᩺:J

    add-int/lit8 v2, v2, 0x1

    move-object v11, v12

    const/4 v7, 0x1

    const/4 v8, 0x3

    goto :goto_0

    .line 543
    :cond_2
    iget-boolean v2, v0, Ll/ۤ۫֫;->᩸:Z

    if-eqz v2, :cond_3

    goto :goto_2

    .line 557
    :cond_3
    iget-boolean v2, v0, Ll/ۤ۫֫;->ۖ:Z

    if-eqz v2, :cond_5

    iget-object v2, v0, Ll/ۤ۫֫;->ۡ:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_5

    iget-wide v7, v0, Ll/ۤ۫֫;->ۘ:J

    sub-long v7, v13, v7

    const-wide/32 v9, 0x7a120

    cmp-long v11, v7, v9

    if-ltz v11, :cond_5

    const/4 v7, 0x0

    .line 563
    :try_start_0
    iget-object v8, v0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    invoke-virtual {v2, v8, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    sget-object v8, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v8, v2

    mul-long v8, v8, v3

    iget-wide v10, v0, Ll/ۤ۫֫;->ܿ:J

    sub-long/2addr v8, v10

    iput-wide v8, v0, Ll/ۤ۫֫;->۠:J

    .line 567
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    iput-wide v8, v0, Ll/ۤ۫֫;->۠:J

    const-wide/32 v10, 0x4c4b40

    cmp-long v2, v8, v10

    if-lez v2, :cond_4

    .line 2280
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v10, "Ignoring impossibly large audio latency: "

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 571
    iput-wide v5, v0, Ll/ۤ۫֫;->۠:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 575
    :catch_0
    iput-object v7, v0, Ll/ۤ۫֫;->ۡ:Ljava/lang/reflect/Method;

    .line 577
    :cond_4
    :goto_1
    iput-wide v13, v0, Ll/ۤ۫֫;->ۘ:J

    .line 551
    :cond_5
    iget-object v11, v0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    iget v12, v0, Ll/ۤ۫֫;->ܽ:F

    .line 553
    invoke-direct {v0, v13, v14}, Ll/ۤ۫֫;->ܿ(J)J

    move-result-wide v15

    .line 552
    invoke-virtual/range {v11 .. v16}, Ll/۬۫֫;->֫(FJJ)V

    .line 298
    :cond_6
    :goto_2
    iget-object v2, v0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    invoke-interface {v2}, Ll/ܽۚ֫;->ᩳ()J

    move-result-wide v7

    div-long/2addr v7, v3

    .line 299
    iget-object v2, v0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    invoke-virtual {v2}, Ll/۬۫֫;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 303
    iget v4, v0, Ll/ۤ۫֫;->ܽ:F

    invoke-virtual {v2, v7, v8, v4}, Ll/۬۫֫;->֫(JF)J

    move-result-wide v9

    goto :goto_3

    .line 304
    :cond_7
    invoke-direct {v0, v7, v8}, Ll/ۤ۫֫;->ܿ(J)J

    move-result-wide v9

    :goto_3
    move-wide v11, v9

    .line 306
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const/4 v4, 0x3

    if-ne v1, v4, :cond_c

    if-nez v3, :cond_8

    .line 308
    invoke-virtual {v2}, Ll/۬۫֫;->ܽ()Z

    move-result v1

    if-nez v1, :cond_9

    .line 311
    :cond_8
    invoke-direct {v0, v11, v12}, Ll/ۤ۫֫;->ܳ(J)V

    .line 314
    :cond_9
    iget-wide v1, v0, Ll/ۤ۫֫;->ۚ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v9, v1, v3

    if-eqz v9, :cond_a

    sub-long v1, v7, v1

    .line 317
    iget-wide v9, v0, Ll/ۤ۫֫;->᩵:J

    sub-long v9, v11, v9

    .line 318
    iget v13, v0, Ll/ۤ۫֫;->ܽ:F

    .line 319
    invoke-static {v1, v2, v13}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide v1

    .line 320
    iget-wide v13, v0, Ll/ۤ۫֫;->᩵:J

    add-long/2addr v13, v1

    sub-long v15, v13, v11

    .line 321
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(J)J

    move-result-wide v15

    cmp-long v17, v9, v5

    if-eqz v17, :cond_a

    const-wide/32 v5, 0xf4240

    cmp-long v9, v15, v5

    if-gez v9, :cond_a

    const-wide/16 v5, 0xa

    mul-long v1, v1, v5

    const-wide/16 v5, 0x64

    .line 326
    div-long/2addr v1, v5

    sub-long v5, v13, v1

    add-long v15, v13, v1

    move-wide v13, v5

    .line 329
    invoke-static/range {v11 .. v16}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v1

    move-wide v11, v1

    .line 335
    :cond_a
    iget-boolean v1, v0, Ll/ۤ۫֫;->᩻:Z

    if-nez v1, :cond_b

    iget-boolean v1, v0, Ll/ۤ۫֫;->᩶:Z

    if-nez v1, :cond_b

    iget-wide v1, v0, Ll/ۤ۫֫;->᩵:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_b

    cmp-long v3, v11, v1

    if-lez v3, :cond_b

    const/4 v3, 0x1

    .line 339
    iput-boolean v3, v0, Ll/ۤ۫֫;->᩶:Z

    sub-long v1, v11, v1

    .line 340
    invoke-static {v1, v2}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v1

    .line 341
    iget v3, v0, Ll/ۤ۫֫;->ܽ:F

    .line 342
    invoke-static {v1, v2, v3}, Ll/ۘ֨֫;->ۧ(JF)J

    move-result-wide v1

    .line 344
    iget-object v3, v0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    .line 345
    invoke-interface {v3}, Ll/ܽۚ֫;->֫()J

    move-result-wide v3

    invoke-static {v1, v2}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v1

    sub-long/2addr v3, v1

    .line 346
    iget-object v1, v0, Ll/ۤ۫֫;->ܶ:Ll/۫۫֫;

    check-cast v1, Ll/᩵ۤ֫;

    invoke-virtual {v1, v3, v4}, Ll/᩵ۤ֫;->֫(J)V

    .line 349
    :cond_b
    iput-wide v7, v0, Ll/ۤ۫֫;->ۚ:J

    .line 350
    iput-wide v11, v0, Ll/ۤ۫֫;->᩵:J

    goto :goto_4

    :cond_c
    const/4 v2, 0x1

    if-ne v1, v2, :cond_d

    .line 354
    invoke-direct {v0, v11, v12}, Ll/ۤ۫֫;->ܳ(J)V

    :cond_d
    :goto_4
    return-wide v11
.end method

.method public final ۧ(J)Z
    .locals 7

    .line 444
    invoke-virtual {p0}, Ll/ۤ۫֫;->ۧ()J

    move-result-wide v0

    iget v2, p0, Ll/ۤ۫֫;->ۗ:I

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    int-to-long v2, v2

    const-wide/32 v4, 0xf4240

    .line 1659
    sget-object v6, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    invoke-static/range {v0 .. v6}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    .line 623
    iget-boolean p1, p0, Ll/ۤ۫֫;->᩸:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    .line 625
    invoke-direct {p0}, Ll/ۤ۫֫;->᩻()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ܳ()V
    .locals 5

    .line 362
    iget-wide v0, p0, Ll/ۤ۫֫;->۟:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 363
    iget-object v0, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ۫֫;->۟:J

    .line 637
    :cond_0
    invoke-direct {p0}, Ll/ۤ۫֫;->᩻()J

    move-result-wide v0

    iget v2, p0, Ll/ۤ۫֫;->ۗ:I

    invoke-static {v2, v0, v1}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v0

    .line 365
    iput-wide v0, p0, Ll/ۤ۫֫;->ۙ:J

    .line 366
    iget-object v0, p0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    invoke-virtual {v0}, Ll/۬۫֫;->ᩳ()V

    return-void
.end method

.method public final ܽ()Z
    .locals 2

    .line 371
    iget-object v0, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(J)Z
    .locals 5

    .line 419
    iget-wide v0, p0, Ll/ۤ۫֫;->ۢ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    iget-object p1, p0, Ll/ۤ۫֫;->ܳ:Ll/ܽۚ֫;

    .line 421
    invoke-interface {p1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide p1

    iget-wide v0, p0, Ll/ۤ۫֫;->ۢ:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0xc8

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()V
    .locals 1

    .line 475
    invoke-direct {p0}, Ll/ۤ۫֫;->᩷()V

    const/4 v0, 0x0

    .line 476
    iput-object v0, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 477
    iput-object v0, p0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    return-void
.end method

.method public final ᩳ()V
    .locals 5

    .line 450
    invoke-direct {p0}, Ll/ۤ۫֫;->᩷()V

    .line 451
    iget-wide v0, p0, Ll/ۤ۫֫;->۟:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 454
    iget-object v0, p0, Ll/ۤ۫֫;->֫:Ll/۬۫֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    invoke-virtual {v0}, Ll/۬۫֫;->ᩳ()V

    .line 456
    :cond_0
    invoke-direct {p0}, Ll/ۤ۫֫;->᩻()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ۫֫;->ܰ:J

    return-void
.end method

.method public final ᩳ(J)Z
    .locals 10

    .line 382
    iget-object v0, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    .line 383
    iget-boolean v1, p0, Ll/ۤ۫֫;->᩸:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 388
    iput-boolean v3, p0, Ll/ۤ۫֫;->ܺ:Z

    return v3

    :cond_0
    if-ne v0, v2, :cond_1

    .line 395
    invoke-direct {p0}, Ll/ۤ۫֫;->᩻()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-nez v1, :cond_1

    return v3

    .line 401
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v1, v4, :cond_3

    .line 495
    iget-object p1, p0, Ll/ۤ۫֫;->ۧ:Landroid/media/AudioTrack;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getUnderrunCount()I

    move-result p1

    .line 496
    iget p2, p0, Ll/ۤ۫֫;->֨:I

    if-le p1, p2, :cond_2

    const/4 v3, 0x1

    .line 499
    :cond_2
    iput p1, p0, Ll/ۤ۫֫;->֨:I

    goto :goto_0

    .line 404
    :cond_3
    iget-boolean v1, p0, Ll/ۤ۫֫;->ܺ:Z

    .line 405
    invoke-virtual {p0, p1, p2}, Ll/ۤ۫֫;->ۧ(J)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۤ۫֫;->ܺ:Z

    if-eqz v1, :cond_4

    if-nez p1, :cond_4

    if-eq v0, v2, :cond_4

    const/4 v3, 0x1

    :cond_4
    :goto_0
    if-eqz v3, :cond_5

    .line 411
    iget v7, p0, Ll/ۤ۫֫;->ᩳ:I

    iget-wide p1, p0, Ll/ۤ۫֫;->ܿ:J

    invoke-static {p1, p2}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v5

    iget-object p1, p0, Ll/ۤ۫֫;->ܶ:Ll/۫۫֫;

    check-cast p1, Ll/᩵ۤ֫;

    .line 2292
    iget-object p1, p1, Ll/᩵ۤ֫;->֫:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 2293
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {p1}, Ll/۠ۤ֫;->ܽ(Ll/۠ۤ֫;)J

    move-result-wide v3

    sub-long v8, v0, v3

    .line 2294
    invoke-static {p1}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object v4

    invoke-interface/range {v4 .. v9}, Ll/᩸۫֫;->֫(JIJ)V

    :cond_5
    return v2
.end method
