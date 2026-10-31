.class public abstract Ll/ܰ۫֫;
.super Ll/ۙ᩹֫;
.source "L8FI"

# interfaces
.implements Ll/᩺ۙ֫;


# instance fields
.field public final ֡֫:Ll/֡۫֫;

.field public final ֨֫:Ll/᩸᩸֫;

.field public ۖ֫:Z

.field public ۗ֫:J

.field public ۘ֫:I

.field public ۙ֫:J

.field public ۚ֫:Z

.field public ۛ֫:J

.field public ۜ֫:Z

.field public ۠֫:Z

.field public ۡ֫:Ll/ۗ᩹֫;

.field public ۢ֫:Ll/֨᩸֫;

.field public ۤ֫:Z

.field public ۨ֫:I

.field public ۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

.field public ۬֫:J

.field public ܰ֫:Ll/֡ۛ֫;

.field public ܳ֫:Z

.field public ܶ֫:Ll/᩸᩸֫;

.field public ܺ֫:Ll/֡ۛ֫;

.field public ᩴ֫:I

.field public ᩵֫:I

.field public ᩶֫:Z

.field public ᩷֫:J

.field public ᩸֫:Ll/۠ᩴ֫;

.field public ᩹֫:Z

.field public final ᩺֫:[J

.field public final ᩻֫:Ll/ۙ۫֫;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ll/ۚ۫֫;Ll/ۙ۫֫;)V
    .locals 2

    const/4 v0, 0x1

    .line 226
    invoke-direct {p0, v0}, Ll/ۙ᩹֫;-><init>(I)V

    .line 227
    new-instance v1, Ll/֡۫֫;

    invoke-direct {v1, p1, p2}, Ll/֡۫֫;-><init>(Landroid/os/Handler;Ll/ۚ۫֫;)V

    iput-object v1, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    .line 228
    iput-object p3, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    .line 229
    new-instance p1, Ll/᩺۫֫;

    invoke-direct {p1, p0}, Ll/᩺۫֫;-><init>(Ll/ܰ۫֫;)V

    invoke-interface {p3, p1}, Ll/ۙ۫֫;->֫(Ll/᩸۫֫;)V

    .line 123
    new-instance p1, Ll/᩸᩸֫;

    const/4 p2, 0x0

    .line 132
    invoke-direct {p1, p2, p2}, Ll/᩸᩸֫;-><init>(II)V

    .line 230
    iput-object p1, p0, Ll/ܰ۫֫;->֨֫:Ll/᩸᩸֫;

    .line 231
    iput p2, p0, Ll/ܰ۫֫;->ۘ֫:I

    .line 232
    iput-boolean v0, p0, Ll/ܰ۫֫;->ۜ֫:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 233
    invoke-direct {p0, p1, p2}, Ll/ܰ۫֫;->ܽ(J)V

    const/16 p3, 0xa

    new-array p3, p3, [J

    .line 234
    iput-object p3, p0, Ll/ܰ۫֫;->᩺֫:[J

    .line 235
    iput-wide p1, p0, Ll/ܰ۫֫;->ۙ֫:J

    .line 236
    iput-wide p1, p0, Ll/ܰ۫֫;->ۗ֫:J

    .line 237
    iput-wide p1, p0, Ll/ܰ۫֫;->۬֫:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ۫֫;)Ll/֡۫֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    return-object p0
.end method

.method private ֫(Ll/ۗۙ֫;)V
    .locals 7

    .line 849
    iget-object v3, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    iget-object p1, p1, Ll/ۗۙ֫;->֫:Ll/֡ۛ֫;

    .line 839
    iget-object v0, p0, Ll/ܰ۫֫;->ܰ֫:Ll/֡ۛ֫;

    invoke-static {v0, p1}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 840
    iput-object p1, p0, Ll/ܰ۫֫;->ܰ֫:Ll/֡ۛ֫;

    .line 851
    iget-object v2, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    .line 852
    iput-object v3, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    .line 853
    iget v0, v3, Ll/۠ᩴ֫;->ᩴ:I

    iput v0, p0, Ll/ܰ۫֫;->ᩴ֫:I

    .line 854
    iget v0, v3, Ll/۠ᩴ֫;->᩵:I

    iput v0, p0, Ll/ܰ۫֫;->᩵֫:I

    .line 856
    iget-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    iget-object v6, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    if-nez v0, :cond_0

    .line 857
    invoke-direct {p0}, Ll/ܰ۫֫;->ᩳ֫()V

    .line 858
    iget-object p1, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    const/4 v0, 0x0

    invoke-virtual {v6, p1, v0}, Ll/֡۫֫;->֫(Ll/۠ᩴ֫;Ll/۬᩹֫;)V

    return-void

    .line 863
    :cond_0
    iget-object v1, p0, Ll/ܰ۫֫;->ܺ֫:Ll/֡ۛ֫;

    if-eq p1, v1, :cond_1

    .line 864
    new-instance p1, Ll/۬᩹֫;

    .line 866
    invoke-interface {v0}, Ll/֨᩸֫;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v5, 0x80

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    goto :goto_0

    .line 872
    :cond_1
    invoke-interface {v0}, Ll/֨᩸֫;->getName()Ljava/lang/String;

    move-result-object v1

    .line 437
    new-instance p1, Ll/۬᩹֫;

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    .line 875
    :goto_0
    iget v0, p1, Ll/۬᩹֫;->ܿ:I

    if-nez v0, :cond_3

    .line 876
    iget-boolean v0, p0, Ll/ܰ۫֫;->ۖ֫:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 878
    iput v1, p0, Ll/ܰ۫֫;->ۘ֫:I

    goto :goto_1

    .line 881
    :cond_2
    invoke-direct {p0}, Ll/ܰ۫֫;->ܿ֫()V

    .line 882
    invoke-direct {p0}, Ll/ܰ۫֫;->ᩳ֫()V

    .line 883
    iput-boolean v1, p0, Ll/ܰ۫֫;->ۜ֫:Z

    .line 886
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    invoke-virtual {v6, v0, p1}, Ll/֡۫֫;->֫(Ll/۠ᩴ֫;Ll/۬᩹֫;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܰ۫֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܰ۫֫;->۠֫:Z

    return-void
.end method

.method private ۧ֫()Z
    .locals 8

    .line 447
    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    iget-object v1, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_2

    .line 448
    iget-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    invoke-interface {v0}, Ll/֨᩸֫;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    iput-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    if-nez v0, :cond_0

    return v3

    .line 452
    :cond_0
    iget v0, v0, Ll/᩶᩸֫;->᩶:I

    if-lez v0, :cond_1

    .line 453
    iget-object v4, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    iget v5, v4, Ll/ۗ᩹֫;->ۢ:I

    add-int/2addr v5, v0

    iput v5, v4, Ll/ۗ᩹֫;->ۢ:I

    .line 454
    invoke-interface {v1}, Ll/ۙ۫֫;->᩷()V

    .line 456
    :cond_1
    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 516
    invoke-interface {v1}, Ll/ۙ۫֫;->᩷()V

    .line 517
    iget v0, p0, Ll/ܰ۫֫;->ۨ֫:I

    if-eqz v0, :cond_2

    .line 518
    iget-object v0, p0, Ll/ܰ۫֫;->᩺֫:[J

    aget-wide v4, v0, v3

    invoke-direct {p0, v4, v5}, Ll/ܰ۫֫;->ܽ(J)V

    .line 519
    iget v4, p0, Ll/ܰ۫֫;->ۨ֫:I

    sub-int/2addr v4, v2

    iput v4, p0, Ll/ܰ۫֫;->ۨ֫:I

    .line 520
    invoke-static {v0, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 460
    :cond_2
    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    .line 461
    iget v0, p0, Ll/ܰ۫֫;->ۘ֫:I

    const/4 v5, 0x2

    if-ne v0, v5, :cond_3

    .line 463
    invoke-direct {p0}, Ll/ܰ۫֫;->ܿ֫()V

    .line 464
    invoke-direct {p0}, Ll/ܰ۫֫;->ᩳ֫()V

    .line 466
    iput-boolean v2, p0, Ll/ܰ۫֫;->ۜ֫:Z

    return v3

    .line 468
    :cond_3
    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-virtual {v0}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ᩴ()V

    .line 469
    iput-object v4, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 599
    :try_start_0
    iput-boolean v2, p0, Ll/ܰ۫֫;->ۤ֫:Z

    .line 600
    invoke-interface {v1}, Ll/ۙ۫֫;->ۜ()V

    .line 601
    iget-wide v0, p0, Ll/ܰ۫֫;->ۗ֫:J

    iput-wide v0, p0, Ll/ܰ۫֫;->۬֫:J
    :try_end_0
    .catch Ll/᩶۫֫; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception v0

    .line 473
    iget-boolean v1, v0, Ll/᩶۫֫;->᩶:Z

    const/16 v2, 0x138a

    iget-object v3, v0, Ll/᩶۫֫;->᩹:Ll/۠ᩴ֫;

    invoke-virtual {p0, v0, v3, v1, v2}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object v0

    throw v0

    :cond_4
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 479
    iput-wide v5, p0, Ll/ܰ۫֫;->۬֫:J

    .line 481
    iget-boolean v0, p0, Ll/ܰ۫֫;->ۜ֫:Z

    if-eqz v0, :cond_5

    .line 482
    iget-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    .line 483
    invoke-virtual {p0, v0}, Ll/ܰ۫֫;->֫(Ll/֨᩸֫;)Ll/۠ᩴ֫;

    move-result-object v0

    .line 484
    invoke-virtual {v0}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v0

    iget v5, p0, Ll/ܰ۫֫;->ᩴ֫:I

    .line 485
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->᩷(I)V

    iget v5, p0, Ll/ܰ۫֫;->᩵֫:I

    .line 486
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ۢ(I)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget-object v5, v5, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    .line 487
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget-object v5, v5, Ll/۠ᩴ֫;->ۡ:Ljava/lang/Object;

    .line 488
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->֫(Ljava/lang/Object;)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget-object v5, v5, Ll/۠ᩴ֫;->ܶ:Ljava/lang/String;

    .line 489
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget-object v5, v5, Ll/۠ᩴ֫;->᩹:Ljava/lang/String;

    .line 490
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ᩳ(Ljava/lang/String;)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget-object v5, v5, Ll/۠ᩴ֫;->᩶:Ljava/util/List;

    .line 491
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ۧ(Ljava/util/List;)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget-object v5, v5, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    .line 492
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget v5, v5, Ll/۠ᩴ֫;->ᩳ֫:I

    .line 493
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ܶ(I)V

    iget-object v5, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iget v5, v5, Ll/۠ᩴ֫;->۟:I

    .line 494
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 495
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 496
    invoke-interface {v1, v0, v4}, Ll/ۙ۫֫;->֫(Ll/۠ᩴ֫;[I)V

    .line 497
    iput-boolean v3, p0, Ll/ܰ۫֫;->ۜ֫:Z

    .line 500
    :cond_5
    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    iget-object v5, v0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    iget-wide v6, v0, Ll/᩶᩸֫;->ۙ:J

    invoke-interface {v1, v2, v6, v7, v5}, Ll/ۙ۫֫;->֫(IJLjava/nio/ByteBuffer;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 502
    iget-object v0, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    iget v1, v0, Ll/ۗ᩹֫;->ۜ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/ۗ᩹֫;->ۜ:I

    .line 503
    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-virtual {v0}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ᩴ()V

    .line 504
    iput-object v4, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    return v2

    .line 509
    :cond_6
    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    iget-wide v0, v0, Ll/᩶᩸֫;->ۙ:J

    iput-wide v0, p0, Ll/ܰ۫֫;->۬֫:J

    return v3
.end method

.method private ܳ֫()V
    .locals 5

    .line 890
    invoke-virtual {p0}, Ll/ܰ۫֫;->ۧ()Z

    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0}, Ll/ۙ۫֫;->᩻()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 893
    iget-boolean v2, p0, Ll/ܰ۫֫;->ܳ֫:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 895
    :cond_0
    iget-wide v2, p0, Ll/ܰ۫֫;->᩷֫:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Ll/ܰ۫֫;->᩷֫:J

    const/4 v0, 0x0

    .line 896
    iput-boolean v0, p0, Ll/ܰ۫֫;->ܳ֫:Z

    :cond_1
    return-void
.end method

.method private ܽ(J)V
    .locals 3

    .line 530
    iput-wide p1, p0, Ll/ܰ۫֫;->ۛ֫:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 532
    iget-object p1, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/ܰ۫֫;)V
    .locals 0

    .line 97
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۨ()V

    return-void
.end method

.method private ܽ֫()Z
    .locals 6

    .line 537
    iget-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    iget v2, p0, Ll/ܰ۫֫;->ۘ֫:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_a

    iget-boolean v2, p0, Ll/ܰ۫֫;->᩹֫:Z

    if-eqz v2, :cond_0

    goto/16 :goto_0

    .line 544
    :cond_0
    iget-object v2, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    if-nez v2, :cond_1

    .line 545
    invoke-interface {v0}, Ll/֨᩸֫;->ܽ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸᩸֫;

    iput-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 551
    :cond_1
    iget v0, p0, Ll/ܰ۫֫;->ۘ֫:I

    const/4 v2, 0x0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    .line 552
    iget-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Ll/ۘ᩸֫;->ܿ(I)V

    .line 553
    iget-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    iget-object v4, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    invoke-interface {v0, v4}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 554
    iput-object v2, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    .line 555
    iput v3, p0, Ll/ܰ۫֫;->ۘ֫:I

    return v1

    .line 559
    :cond_2
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object v0

    .line 560
    iget-object v3, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    invoke-virtual {p0, v0, v3, v1}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result v3

    const/4 v5, -0x5

    if-eq v3, v5, :cond_9

    const/4 v0, -0x4

    if-eq v3, v0, :cond_4

    const/4 v0, -0x3

    if-ne v3, v0, :cond_3

    .line 562
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩻()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 564
    iget-wide v2, p0, Ll/ܰ۫֫;->ۙ֫:J

    iput-wide v2, p0, Ll/ܰ۫֫;->ۗ֫:J

    return v1

    .line 594
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 571
    :cond_4
    iget-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 572
    iput-boolean v4, p0, Ll/ܰ۫֫;->᩹֫:Z

    .line 573
    iget-wide v3, p0, Ll/ܰ۫֫;->ۙ֫:J

    iput-wide v3, p0, Ll/ܰ۫֫;->ۗ֫:J

    .line 574
    iget-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    iget-object v3, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    invoke-interface {v0, v3}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 575
    iput-object v2, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    return v1

    .line 578
    :cond_5
    iget-boolean v0, p0, Ll/ܰ۫֫;->ۚ֫:Z

    if-nez v0, :cond_6

    .line 579
    iput-boolean v4, p0, Ll/ܰ۫֫;->ۚ֫:Z

    .line 580
    iget-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Ll/ۘ᩸֫;->ۧ(I)V

    .line 582
    :cond_6
    iget-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    iget-wide v0, v0, Ll/᩸᩸֫;->ۤ:J

    iput-wide v0, p0, Ll/ܰ۫֫;->ۙ֫:J

    .line 583
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩻()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    invoke-virtual {v0}, Ll/ۘ᩸֫;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 584
    :cond_7
    iget-wide v0, p0, Ll/ܰ۫֫;->ۙ֫:J

    iput-wide v0, p0, Ll/ܰ۫֫;->ۗ֫:J

    .line 586
    :cond_8
    iget-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    invoke-virtual {v0}, Ll/᩸᩸֫;->ᩴ()V

    .line 587
    iget-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    iget-object v1, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    iput-object v1, v0, Ll/᩸᩸֫;->ۗ:Ll/۠ᩴ֫;

    .line 588
    iget-object v1, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    invoke-interface {v1, v0}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 589
    iput-boolean v4, p0, Ll/ܰ۫֫;->ۖ֫:Z

    .line 590
    iget-object v0, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    iget v1, v0, Ll/ۗ᩹֫;->᩻:I

    add-int/2addr v1, v4

    iput v1, v0, Ll/ۗ᩹֫;->᩻:I

    .line 591
    iput-object v2, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    return v4

    .line 568
    :cond_9
    invoke-direct {p0, v0}, Ll/ܰ۫֫;->֫(Ll/ۗۙ֫;)V

    return v4

    :cond_a
    :goto_0
    return v1
.end method

.method private ܿ֫()V
    .locals 4

    const/4 v0, 0x0

    .line 823
    iput-object v0, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    .line 824
    iput-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    const/4 v1, 0x0

    .line 825
    iput v1, p0, Ll/ܰ۫֫;->ۘ֫:I

    .line 826
    iput-boolean v1, p0, Ll/ܰ۫֫;->ۖ֫:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 827
    iput-wide v1, p0, Ll/ܰ۫֫;->ۙ֫:J

    .line 828
    iput-wide v1, p0, Ll/ܰ۫֫;->ۗ֫:J

    .line 829
    iget-object v1, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    if-eqz v1, :cond_0

    .line 830
    iget-object v2, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    iget v3, v2, Ll/ۗ᩹֫;->ۧ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Ll/ۗ᩹֫;->ۧ:I

    .line 831
    invoke-interface {v1}, Ll/֨᩸֫;->֫()V

    .line 832
    iget-object v1, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    invoke-interface {v1}, Ll/֨᩸֫;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    invoke-virtual {v2, v1}, Ll/֡۫֫;->֫(Ljava/lang/String;)V

    .line 833
    iput-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    .line 844
    :cond_0
    iget-object v1, p0, Ll/ܰ۫֫;->ܺ֫:Ll/֡ۛ֫;

    invoke-static {v1, v0}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 845
    iput-object v0, p0, Ll/ܰ۫֫;->ܺ֫:Ll/֡ۛ֫;

    return-void
.end method

.method private ᩳ֫()V
    .locals 12

    .line 778
    iget-object v0, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 782
    :cond_0
    iget-object v0, p0, Ll/ܰ۫֫;->ܰ֫:Ll/֡ۛ֫;

    .line 844
    iget-object v1, p0, Ll/ܰ۫֫;->ܺ֫:Ll/֡ۛ֫;

    invoke-static {v1, v0}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 845
    iput-object v0, p0, Ll/ܰ۫֫;->ܺ֫:Ll/֡ۛ֫;

    if-eqz v0, :cond_2

    .line 786
    invoke-interface {v0}, Ll/֡ۛ֫;->ܽ()Ll/ᩴ᩸֫;

    move-result-object v0

    if-nez v0, :cond_2

    .line 788
    iget-object v0, p0, Ll/ܰ۫֫;->ܺ֫:Ll/֡ۛ֫;

    invoke-interface {v0}, Ll/֡ۛ֫;->getError()Ll/᩵ۛ֫;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    const/16 v0, 0xfa1

    .line 800
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const-string v3, "createAudioDecoder"

    .line 38
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 802
    iget-object v3, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    invoke-virtual {p0, v3}, Ll/ܰ۫֫;->ۧ(Ll/۠ᩴ֫;)Ll/֨᩸֫;

    move-result-object v3

    iput-object v3, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    .line 803
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v4

    check-cast v3, Ll/ۗ᩸֫;

    invoke-virtual {v3, v4, v5}, Ll/ۗ᩸֫;->ۧ(J)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 805
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    .line 806
    iget-object v6, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    iget-object v3, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    .line 807
    invoke-interface {v3}, Ll/֨᩸֫;->getName()Ljava/lang/String;

    move-result-object v7

    sub-long v10, v8, v1

    .line 806
    invoke-virtual/range {v6 .. v11}, Ll/֡۫֫;->֫(Ljava/lang/String;JJ)V

    .line 810
    iget-object v1, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    iget v2, v1, Ll/ۗ᩹֫;->֫:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Ll/ۗ᩹֫;->֫:I
    :try_end_0
    .catch Ll/۠᩸֫; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 817
    iget-object v2, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    invoke-virtual {p0, v1, v2, v0}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v1

    const-string v2, "Audio codec error"

    .line 812
    invoke-static {v2, v1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 813
    iget-object v2, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    invoke-virtual {v2, v1}, Ll/֡۫֫;->֫(Ljava/lang/Exception;)V

    .line 814
    iget-object v2, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    invoke-virtual {p0, v1, v2, v0}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 2

    .line 277
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v0}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 245
    invoke-static {v1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    .line 280
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܰ۫֫;->ܿ(Ll/۠ᩴ֫;)I

    move-result p1

    const/4 v0, 0x2

    if-gt p1, v0, :cond_1

    .line 245
    invoke-static {p1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    :cond_1
    or-int/lit16 p1, p1, 0xa8

    return p1
.end method

.method public abstract ֫(Ll/֨᩸֫;)Ll/۠ᩴ֫;
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x2

    .line 742
    iget-object v1, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    if-eq p1, v0, :cond_6

    const/4 v0, 0x3

    if-eq p1, v0, :cond_5

    const/4 v0, 0x6

    if-eq p1, v0, :cond_4

    const/16 v0, 0xc

    if-eq p1, v0, :cond_2

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 758
    :cond_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v1, p1}, Ll/ۙ۫֫;->֫(I)V

    return-void

    .line 755
    :cond_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v1, p1}, Ll/ۙ۫֫;->֫(Z)V

    return-void

    .line 761
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_3

    .line 762
    invoke-static {v1, p2}, Ll/ۨ۫֫;->֫(Ll/ۙ۫֫;Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void

    .line 751
    :cond_4
    check-cast p2, Ll/ܿᩴ֫;

    .line 752
    invoke-interface {v1, p2}, Ll/ۙ۫֫;->֫(Ll/ܿᩴ֫;)V

    return-void

    .line 747
    :cond_5
    check-cast p2, Ll/ᩳᩴ֫;

    .line 748
    invoke-interface {v1, p2}, Ll/ۙ۫֫;->֫(Ll/ᩳᩴ֫;)V

    return-void

    .line 744
    :cond_6
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {v1, p1}, Ll/ۙ۫֫;->֫(F)V

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 317
    iget-boolean p1, p0, Ll/ܰ۫֫;->ۤ֫:Z

    const/16 p2, 0x138a

    if-eqz p1, :cond_0

    .line 319
    :try_start_0
    iget-object p1, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {p1}, Ll/ۙ۫֫;->ۜ()V

    .line 320
    iget-wide p3, p0, Ll/ܰ۫֫;->ۗ֫:J

    iput-wide p3, p0, Ll/ܰ۫֫;->۬֫:J
    :try_end_0
    .catch Ll/᩶۫֫; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 322
    iget-object p3, p1, Ll/᩶۫֫;->᩹:Ll/۠ᩴ֫;

    iget-boolean p4, p1, Ll/᩶۫֫;->᩶:Z

    invoke-virtual {p0, p1, p3, p4, p2}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    .line 329
    :cond_0
    iget-object p1, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    if-nez p1, :cond_2

    .line 331
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object p1

    .line 332
    iget-object p3, p0, Ll/ܰ۫֫;->֨֫:Ll/᩸᩸֫;

    invoke-virtual {p3}, Ll/᩸᩸֫;->ۧ()V

    .line 333
    iget-object p3, p0, Ll/ܰ۫֫;->֨֫:Ll/᩸᩸֫;

    const/4 p4, 0x2

    invoke-virtual {p0, p1, p3, p4}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result p3

    const/4 p4, -0x5

    if-ne p3, p4, :cond_1

    .line 335
    invoke-direct {p0, p1}, Ll/ܰ۫֫;->֫(Ll/ۗۙ֫;)V

    goto :goto_0

    :cond_1
    const/4 p1, -0x4

    if-ne p3, p1, :cond_5

    .line 338
    iget-object p1, p0, Ll/ܰ۫֫;->֨֫:Ll/᩸᩸֫;

    invoke-virtual {p1}, Ll/ۘ᩸֫;->᩻()Z

    move-result p1

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 p1, 0x1

    .line 339
    iput-boolean p1, p0, Ll/ܰ۫֫;->᩹֫:Z

    .line 599
    :try_start_1
    iput-boolean p1, p0, Ll/ܰ۫֫;->ۤ֫:Z

    .line 600
    iget-object p1, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {p1}, Ll/ۙ۫֫;->ۜ()V

    .line 601
    iget-wide p3, p0, Ll/ܰ۫֫;->ۗ֫:J

    iput-wide p3, p0, Ll/ܰ۫֫;->۬֫:J
    :try_end_1
    .catch Ll/᩶۫֫; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    const/4 p3, 0x0

    .line 343
    invoke-virtual {p0, p1, p3, p2}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    .line 354
    :cond_2
    :goto_0
    invoke-direct {p0}, Ll/ܰ۫֫;->ᩳ֫()V

    .line 356
    iget-object p1, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    if-eqz p1, :cond_5

    const/16 p1, 0x1389

    :try_start_2
    const-string p3, "drainAndFeed"

    .line 38
    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 360
    :goto_1
    invoke-direct {p0}, Ll/ܰ۫֫;->ۧ֫()Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    .line 361
    :cond_3
    :goto_2
    invoke-direct {p0}, Ll/ܰ۫֫;->ܽ֫()Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_2

    .line 49
    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catch Ll/۠᩸֫; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ll/۠۫֫; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ll/ܶ۫֫; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ll/᩶۫֫; {:try_start_2 .. :try_end_2} :catch_2

    .line 378
    iget-object p1, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    move-object v0, p1

    .line 0
    monitor-enter v0

    .line 133
    monitor-exit v0

    return-void

    :catch_2
    move-exception p1

    .line 375
    iget-object p3, p1, Ll/᩶۫֫;->᩹:Ll/۠ᩴ֫;

    iget-boolean p4, p1, Ll/᩶۫֫;->᩶:Z

    invoke-virtual {p0, p1, p3, p4, p2}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :catch_3
    move-exception p2

    .line 372
    iget-object p3, p2, Ll/ܶ۫֫;->᩹:Ll/۠ᩴ֫;

    iget-boolean p4, p2, Ll/ܶ۫֫;->᩶:Z

    invoke-virtual {p0, p2, p3, p4, p1}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :catch_4
    move-exception p2

    .line 369
    iget-object p3, p2, Ll/۠۫֫;->᩸:Ll/۠ᩴ֫;

    invoke-virtual {p0, p2, p3, p1}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :catch_5
    move-exception p1

    const-string p2, "Audio codec error"

    .line 365
    invoke-static {p2, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 366
    iget-object p2, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    invoke-virtual {p2, p1}, Ll/֡۫֫;->֫(Ljava/lang/Exception;)V

    .line 367
    iget-object p2, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    const/16 p3, 0xfa3

    invoke-virtual {p0, p1, p2, p3}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :cond_5
    return-void
.end method

.method public final ֫(JZ)V
    .locals 2

    .line 673
    iget-object p3, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {p3}, Ll/ۙ۫֫;->flush()V

    .line 675
    iput-wide p1, p0, Ll/ܰ۫֫;->᩷֫:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 676
    iput-wide p1, p0, Ll/ܰ۫֫;->۬֫:J

    const/4 p1, 0x0

    .line 677
    iput-boolean p1, p0, Ll/ܰ۫֫;->۠֫:Z

    const/4 p2, 0x1

    .line 678
    iput-boolean p2, p0, Ll/ܰ۫֫;->ܳ֫:Z

    .line 679
    iput-boolean p1, p0, Ll/ܰ۫֫;->᩹֫:Z

    .line 680
    iput-boolean p1, p0, Ll/ܰ۫֫;->ۤ֫:Z

    .line 681
    iget-object p2, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    if-eqz p2, :cond_2

    .line 605
    iget p2, p0, Ll/ܰ۫֫;->ۘ֫:I

    if-eqz p2, :cond_0

    .line 606
    invoke-direct {p0}, Ll/ܰ۫֫;->ܿ֫()V

    .line 607
    invoke-direct {p0}, Ll/ܰ۫֫;->ᩳ֫()V

    return-void

    :cond_0
    const/4 p2, 0x0

    .line 609
    iput-object p2, p0, Ll/ܰ۫֫;->ܶ֫:Ll/᩸᩸֫;

    .line 610
    iget-object p3, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    if-eqz p3, :cond_1

    .line 611
    invoke-virtual {p3}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ᩴ()V

    .line 612
    iput-object p2, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 614
    :cond_1
    iget-object p2, p0, Ll/ܰ۫֫;->ۢ֫:Ll/֨᩸֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    invoke-interface {p2}, Ll/֨᩸֫;->flush()V

    .line 616
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ll/֨᩸֫;->ۧ(J)V

    .line 617
    iput-boolean p1, p0, Ll/ܰ۫֫;->ۖ֫:Z

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۖ᩵֫;)V
    .locals 1

    .line 649
    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0, p1}, Ll/ۙ۫֫;->֫(Ll/ۖ᩵֫;)V

    return-void
.end method

.method public final ֫(ZZ)V
    .locals 0

    .line 660
    new-instance p1, Ll/ۗ᩹֫;

    .line 31
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 660
    iput-object p1, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    .line 661
    iget-object p2, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    invoke-virtual {p2, p1}, Ll/֡۫֫;->ۧ(Ll/ۗ᩹֫;)V

    .line 662
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object p1

    iget-boolean p1, p1, Ll/ܿ۬֫;->ۧ:Z

    iget-object p2, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    if-eqz p1, :cond_0

    .line 663
    invoke-interface {p2}, Ll/ۙ۫֫;->ۢ()V

    goto :goto_0

    .line 665
    :cond_0
    invoke-interface {p2}, Ll/ۙ۫֫;->ܳ()V

    .line 667
    :goto_0
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩶()Ll/ܰ۬֫;

    move-result-object p1

    invoke-interface {p2, p1}, Ll/ۙ۫֫;->֫(Ll/ܰ۬֫;)V

    .line 668
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object p1

    invoke-interface {p2, p1}, Ll/ۙ۫֫;->֫(Ll/ܽۚ֫;)V

    return-void
.end method

.method public final ֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V
    .locals 2

    const/4 p1, 0x0

    .line 723
    iput-boolean p1, p0, Ll/ܰ۫֫;->ۚ֫:Z

    .line 724
    iget-wide p1, p0, Ll/ܰ۫֫;->ۛ֫:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    .line 725
    invoke-direct {p0, p4, p5}, Ll/ܰ۫֫;->ܽ(J)V

    return-void

    .line 727
    :cond_0
    iget p1, p0, Ll/ܰ۫֫;->ۨ֫:I

    iget-object p2, p0, Ll/ܰ۫֫;->᩺֫:[J

    array-length p3, p2

    if-ne p1, p3, :cond_1

    .line 728
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Too many stream changes, so dropping offset: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Ll/ܰ۫֫;->ۨ֫:I

    add-int/lit8 p3, p3, -0x1

    aget-wide v0, p2, p3

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 733
    iput p1, p0, Ll/ܰ۫֫;->ۨ֫:I

    .line 735
    :goto_0
    iget p1, p0, Ll/ܰ۫֫;->ۨ֫:I

    add-int/lit8 p1, p1, -0x1

    aput-wide p4, p2, p1

    return-void
.end method

.method public final ֫֫()V
    .locals 1

    const/4 v0, 0x1

    .line 387
    iput-boolean v0, p0, Ll/ܰ۫֫;->ܳ֫:Z

    return-void
.end method

.method public final ۚ()Ll/᩺ۙ֫;
    .locals 0

    return-object p0
.end method

.method public final ۟()V
    .locals 1

    .line 694
    invoke-direct {p0}, Ll/ܰ۫֫;->ܳ֫()V

    .line 695
    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0}, Ll/ۙ۫֫;->pause()V

    const/4 v0, 0x0

    .line 696
    iput-boolean v0, p0, Ll/ܰ۫֫;->᩶֫:Z

    return-void
.end method

.method public final ۢ()Z
    .locals 2

    .line 642
    iget-boolean v0, p0, Ll/ܰ۫֫;->۠֫:Z

    const/4 v1, 0x0

    .line 643
    iput-boolean v1, p0, Ll/ܰ۫֫;->۠֫:Z

    return v0
.end method

.method public final ۤ()V
    .locals 5

    .line 701
    iget-object v0, p0, Ll/ܰ۫֫;->֡֫:Ll/֡۫֫;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    const/4 v2, 0x1

    .line 702
    iput-boolean v2, p0, Ll/ܰ۫֫;->ۜ֫:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 703
    invoke-direct {p0, v2, v3}, Ll/ܰ۫֫;->ܽ(J)V

    const/4 v4, 0x0

    .line 704
    iput-boolean v4, p0, Ll/ܰ۫֫;->۠֫:Z

    .line 705
    iput-wide v2, p0, Ll/ܰ۫֫;->۬֫:J

    .line 839
    :try_start_0
    iget-object v2, p0, Ll/ܰ۫֫;->ܰ֫:Ll/֡ۛ֫;

    invoke-static {v2, v1}, Ll/ᩴۛ֫;->֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V

    .line 840
    iput-object v1, p0, Ll/ܰ۫֫;->ܰ֫:Ll/֡ۛ֫;

    .line 708
    invoke-direct {p0}, Ll/ܰ۫֫;->ܿ֫()V

    .line 709
    iget-object v1, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v1}, Ll/ۙ۫֫;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 711
    iget-object v1, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    invoke-virtual {v0, v1}, Ll/֡۫֫;->֫(Ll/ۗ᩹֫;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ll/ܰ۫֫;->ۡ֫:Ll/ۗ᩹֫;

    invoke-virtual {v0, v2}, Ll/֡۫֫;->֫(Ll/ۗ᩹֫;)V

    .line 712
    throw v1
.end method

.method public final ۧ(JJ)J
    .locals 8

    .line 248
    iget-wide v0, p0, Ll/ܰ۫֫;->۬֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 249
    :goto_0
    iget-boolean v1, p0, Ll/ܰ۫֫;->᩶֫:Z

    const-wide/16 v4, 0x2710

    if-nez v1, :cond_2

    if-nez v0, :cond_1

    .line 252
    iget-boolean p1, p0, Ll/ܰ۫֫;->ۤ֫:Z

    if-eqz p1, :cond_5

    :cond_1
    const-wide/32 p1, 0xf4240

    return-wide p1

    .line 256
    :cond_2
    iget-object v1, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v1}, Ll/ۙ۫֫;->ᩳ()J

    move-result-wide v6

    if-eqz v0, :cond_5

    cmp-long v0, v6, v2

    if-nez v0, :cond_3

    goto :goto_2

    .line 263
    :cond_3
    iget-wide v2, p0, Ll/ܰ۫֫;->۬֫:J

    sub-long/2addr v2, p1

    .line 264
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-float p1, p1

    .line 654
    invoke-interface {v1}, Ll/ۙ۫֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {v1}, Ll/ۙ۫֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object p2

    .line 268
    iget p2, p2, Ll/ۖ᩵֫;->ܽ:F

    goto :goto_1

    :cond_4
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_1
    div-float/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    float-to-long p1, p1

    .line 271
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    sub-long/2addr v0, p3

    sub-long/2addr p1, v0

    .line 272
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_5
    :goto_2
    return-wide v4
.end method

.method public abstract ۧ(Ll/۠ᩴ֫;)Ll/֨᩸֫;
.end method

.method public final ۧ()Z
    .locals 1

    .line 623
    iget-boolean v0, p0, Ll/ܰ۫֫;->ۤ֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0}, Ll/ۙ۫֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܰ()V
    .locals 1

    .line 688
    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0}, Ll/ۙ۫֫;->ܿ()V

    const/4 v0, 0x1

    .line 689
    iput-boolean v0, p0, Ll/ܰ۫֫;->᩶֫:Z

    return-void
.end method

.method public final ܽ(Ll/۠ᩴ֫;)I
    .locals 1

    .line 312
    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0, p1}, Ll/ۙ۫֫;->ۧ(Ll/۠ᩴ֫;)I

    move-result p1

    return p1
.end method

.method public final ܽ()Ll/ۖ᩵֫;
    .locals 1

    .line 654
    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0}, Ll/ۙ۫֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object v0

    return-object v0
.end method

.method public abstract ܿ(Ll/۠ᩴ֫;)I
.end method

.method public final ܿ()Z
    .locals 1

    .line 628
    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0}, Ll/ۙ۫֫;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܰ۫֫;->᩸֫:Ll/۠ᩴ֫;

    if-eqz v0, :cond_0

    .line 629
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܰ۫֫;->۫֫:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ(Ll/۠ᩴ֫;)Z
    .locals 1

    .line 302
    iget-object v0, p0, Ll/ܰ۫֫;->᩻֫:Ll/ۙ۫֫;

    invoke-interface {v0, p1}, Ll/ۙ۫֫;->֫(Ll/۠ᩴ֫;)Z

    move-result p1

    return p1
.end method

.method public final ᩴ()J
    .locals 2

    .line 634
    invoke-virtual {p0}, Ll/ۙ᩹֫;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 635
    invoke-direct {p0}, Ll/ܰ۫֫;->ܳ֫()V

    .line 637
    :cond_0
    iget-wide v0, p0, Ll/ܰ۫֫;->᩷֫:J

    return-wide v0
.end method
