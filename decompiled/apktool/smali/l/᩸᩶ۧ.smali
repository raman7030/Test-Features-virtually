.class public final Ll/᩸᩶ۧ;
.super Ljava/lang/Object;
.source "152K"


# instance fields
.field public ֫:J

.field public ۧ:Ll/᩸᩶ۧ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 459
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 465
    iput-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    return-void
.end method

.method private ۧ()V
    .locals 1

    .line 479
    iget-object v0, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    if-nez v0, :cond_0

    .line 480
    new-instance v0, Ll/᩸᩶ۧ;

    invoke-direct {v0}, Ll/᩸᩶ۧ;-><init>()V

    iput-object v0, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    :cond_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 572
    iget-object v0, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    if-nez v0, :cond_0

    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 573
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    invoke-virtual {v1}, Ll/᩸᩶ۧ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "xx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩸᩶ۧ;->֫:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 505
    iput-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    .line 506
    iget-object v0, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    if-eqz v0, :cond_0

    .line 507
    invoke-virtual {v0}, Ll/᩸᩶ۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_1

    .line 486
    iget-object v1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    if-eqz v1, :cond_0

    sub-int/2addr p1, v0

    .line 487
    invoke-virtual {v1, p1}, Ll/᩸᩶ۧ;->֫(I)V

    :cond_0
    return-void

    .line 490
    :cond_1
    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    not-long v2, v2

    and-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    return-void
.end method

.method public final ֫(IZ)V
    .locals 10

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    .line 513
    invoke-direct {p0}, Ll/᩸᩶ۧ;->ۧ()V

    .line 514
    iget-object v1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1, p2}, Ll/᩸᩶ۧ;->֫(IZ)V

    return-void

    .line 516
    :cond_0
    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    const-wide/high16 v2, -0x8000000000000000L

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    cmp-long v8, v2, v4

    if-eqz v8, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const-wide/16 v3, 0x1

    shl-long v8, v3, p1

    sub-long/2addr v8, v3

    and-long v3, v0, v8

    not-long v8, v8

    and-long/2addr v0, v8

    shl-long/2addr v0, v7

    or-long/2addr v0, v3

    .line 520
    iput-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    if-eqz p2, :cond_2

    .line 522
    invoke-virtual {p0, p1}, Ll/᩸᩶ۧ;->ܿ(I)V

    goto :goto_1

    .line 524
    :cond_2
    invoke-virtual {p0, p1}, Ll/᩸᩶ۧ;->֫(I)V

    :goto_1
    if-nez v2, :cond_4

    .line 526
    iget-object p1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    return-void

    .line 527
    :cond_4
    :goto_2
    invoke-direct {p0}, Ll/᩸᩶ۧ;->ۧ()V

    .line 528
    iget-object p1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    invoke-virtual {p1, v6, v2}, Ll/᩸᩶ۧ;->֫(IZ)V

    return-void
.end method

.method public final ۧ(I)I
    .locals 6

    .line 557
    iget-object v0, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    const/16 v1, 0x40

    const-wide/16 v2, 0x1

    if-nez v0, :cond_1

    if-lt p1, v1, :cond_0

    .line 559
    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    .line 561
    :cond_0
    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    shl-long v4, v2, p1

    sub-long/2addr v4, v2

    and-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_1
    if-ge p1, v1, :cond_2

    .line 564
    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    shl-long v4, v2, p1

    sub-long/2addr v4, v2

    and-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_2
    sub-int/2addr p1, v1

    .line 566
    invoke-virtual {v0, p1}, Ll/᩸᩶ۧ;->ۧ(I)I

    move-result p1

    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final ܽ(I)Z
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    .line 497
    invoke-direct {p0}, Ll/᩸᩶ۧ;->ۧ()V

    .line 498
    iget-object v1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ll/᩸᩶ۧ;->ܽ(I)Z

    move-result p1

    return p1

    .line 500
    :cond_0
    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I)V
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    .line 471
    invoke-direct {p0}, Ll/᩸᩶ۧ;->ۧ()V

    .line 472
    iget-object v1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ll/᩸᩶ۧ;->ܿ(I)V

    return-void

    .line 474
    :cond_0
    iget-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    or-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    return-void
.end method

.method public final ᩳ(I)Z
    .locals 12

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    .line 535
    invoke-direct {p0}, Ll/᩸᩶ۧ;->ۧ()V

    .line 536
    iget-object v1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ll/᩸᩶ۧ;->ᩳ(I)Z

    move-result p1

    return p1

    :cond_0
    const-wide/16 v0, 0x1

    shl-long v2, v0, p1

    .line 539
    iget-wide v4, p0, Ll/᩸᩶ۧ;->֫:J

    and-long v6, v4, v2

    const-wide/16 v8, 0x0

    const/4 p1, 0x1

    const/4 v10, 0x0

    cmp-long v11, v6, v8

    if-eqz v11, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    not-long v7, v2

    and-long/2addr v4, v7

    .line 540
    iput-wide v4, p0, Ll/᩸᩶ۧ;->֫:J

    sub-long/2addr v2, v0

    and-long v0, v4, v2

    not-long v2, v2

    and-long/2addr v2, v4

    .line 544
    invoke-static {v2, v3, p1}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v2

    or-long/2addr v0, v2

    .line 545
    iput-wide v0, p0, Ll/᩸᩶ۧ;->֫:J

    .line 546
    iget-object p1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    if-eqz p1, :cond_3

    .line 547
    invoke-virtual {p1, v10}, Ll/᩸᩶ۧ;->ܽ(I)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x3f

    .line 548
    invoke-virtual {p0, p1}, Ll/᩸᩶ۧ;->ܿ(I)V

    .line 550
    :cond_2
    iget-object p1, p0, Ll/᩸᩶ۧ;->ۧ:Ll/᩸᩶ۧ;

    invoke-virtual {p1, v10}, Ll/᩸᩶ۧ;->ᩳ(I)Z

    :cond_3
    return v6
.end method
