.class public final Ll/᩵֫ۧ;
.super Ll/ܰ֫ۧ;
.source "U8SG"


# instance fields
.field public final ܳ:J

.field public final ܽ:J

.field public final ܿ:Z

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۙ᩵֫;JJZ)V
    .locals 9

    .line 458
    invoke-direct {p0, p1}, Ll/ܰ֫ۧ;-><init>(Ll/ۙ᩵֫;)V

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p4, v0

    if-eqz v2, :cond_1

    cmp-long v0, p4, p2

    if-ltz v0, :cond_0

    goto :goto_0

    .line 460
    :cond_0
    new-instance p1, Ll/֡֫ۧ;

    const/4 v6, 0x2

    move-object v3, p1

    move-wide v4, p2

    move-wide v7, p4

    invoke-direct/range {v3 .. v8}, Ll/֡֫ۧ;-><init>(JIJ)V

    throw p1

    .line 463
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ۙ᩵֫;->֫()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_a

    .line 466
    new-instance v0, Ll/᩶᩵֫;

    invoke-direct {v0}, Ll/᩶᩵֫;-><init>()V

    const-wide/16 v4, 0x0

    .line 1097
    invoke-virtual {p1, v1, v0, v4, v5}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p1

    .line 467
    invoke-static {v4, v5, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    if-nez p6, :cond_3

    .line 468
    iget-boolean p6, p1, Ll/᩶᩵֫;->ܳ:Z

    if-nez p6, :cond_3

    cmp-long p6, p2, v4

    if-eqz p6, :cond_3

    iget-boolean p6, p1, Ll/᩶᩵֫;->᩻:Z

    if-eqz p6, :cond_2

    goto :goto_1

    .line 469
    :cond_2
    new-instance p1, Ll/֡֫ۧ;

    invoke-direct {p1, v3}, Ll/֡֫ۧ;-><init>(I)V

    throw p1

    :cond_3
    :goto_1
    if-nez v2, :cond_4

    .line 471
    iget-wide p4, p1, Ll/᩶᩵֫;->ۧ:J

    goto :goto_2

    :cond_4
    invoke-static {v4, v5, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p4

    .line 472
    :goto_2
    iget-wide v2, p1, Ll/᩶᩵֫;->ۧ:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p6, v2, v4

    if-eqz p6, :cond_6

    cmp-long v0, p4, v2

    if-lez v0, :cond_5

    move-wide p4, v2

    :cond_5
    cmp-long v0, p2, p4

    if-lez v0, :cond_6

    move-wide p2, p4

    .line 480
    :cond_6
    iput-wide p2, p0, Ll/᩵֫ۧ;->ܳ:J

    .line 481
    iput-wide p4, p0, Ll/᩵֫ۧ;->ᩳ:J

    cmp-long v0, p4, v4

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    sub-long v4, p4, p2

    .line 482
    :goto_3
    iput-wide v4, p0, Ll/᩵֫ۧ;->ܽ:J

    .line 483
    iget-boolean p1, p1, Ll/᩶᩵֫;->ܿ:Z

    if-eqz p1, :cond_9

    if-eqz v0, :cond_8

    if-eqz p6, :cond_9

    cmp-long p1, p4, v2

    if-nez p1, :cond_9

    :cond_8
    const/4 v1, 0x1

    :cond_9
    iput-boolean v1, p0, Ll/᩵֫ۧ;->ܿ:Z

    return-void

    .line 464
    :cond_a
    new-instance p1, Ll/֡֫ۧ;

    invoke-direct {p1, v1}, Ll/֡֫ۧ;-><init>(I)V

    throw p1
.end method


# virtual methods
.method public final ֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;
    .locals 6

    const/4 p1, 0x0

    const-wide/16 p3, 0x0

    .line 491
    iget-object v0, p0, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    .line 492
    iget-wide p3, p2, Ll/᩶᩵֫;->ܺ:J

    iget-wide v0, p0, Ll/᩵֫ۧ;->ܳ:J

    add-long/2addr p3, v0

    iput-wide p3, p2, Ll/᩶᩵֫;->ܺ:J

    .line 493
    iget-wide p3, p0, Ll/᩵֫ۧ;->ܽ:J

    iput-wide p3, p2, Ll/᩶᩵֫;->ۧ:J

    .line 494
    iget-boolean p1, p0, Ll/᩵֫ۧ;->ܿ:Z

    iput-boolean p1, p2, Ll/᩶᩵֫;->ܿ:Z

    .line 495
    iget-wide p3, p2, Ll/᩶᩵֫;->֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, v2

    if-eqz p1, :cond_1

    .line 496
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    iput-wide p3, p2, Ll/᩶᩵֫;->֫:J

    .line 498
    iget-wide v4, p0, Ll/᩵֫ۧ;->ᩳ:J

    cmp-long p1, v4, v2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    :goto_0
    sub-long/2addr p3, v0

    .line 499
    iput-wide p3, p2, Ll/᩶᩵֫;->֫:J

    .line 501
    :cond_1
    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide p3

    .line 502
    iget-wide v0, p2, Ll/᩶᩵֫;->ۖ:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    add-long/2addr v0, p3

    .line 503
    iput-wide v0, p2, Ll/᩶᩵֫;->ۖ:J

    .line 505
    :cond_2
    iget-wide v0, p2, Ll/᩶᩵֫;->᩵:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_3

    add-long/2addr v0, p3

    .line 506
    iput-wide v0, p2, Ll/᩶᩵֫;->᩵:J

    :cond_3
    return-object p2
.end method

.method public final ֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;
    .locals 10

    .line 513
    iget-object v0, p0, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2, p3}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 693
    iget-wide v0, p2, Ll/᩹᩵֫;->ܿ:J

    .line 514
    iget-wide v2, p0, Ll/᩵֫ۧ;->ܳ:J

    sub-long v6, v0, v2

    .line 516
    iget-wide v0, p0, Ll/᩵֫ۧ;->ܽ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    sub-long/2addr v0, v6

    move-wide v4, v0

    .line 517
    :goto_0
    iget-object v1, p2, Ll/᩹᩵֫;->ܽ:Ljava/lang/Object;

    iget-object v2, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    .line 619
    sget-object v8, Ll/۟ۘ֫;->ܽ:Ll/۟ۘ֫;

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v9}, Ll/᩹᩵֫;->֫(Ljava/lang/Object;Ljava/lang/Object;IJJLl/۟ۘ֫;Z)V

    return-object p2
.end method
