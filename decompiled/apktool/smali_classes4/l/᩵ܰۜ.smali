.class public final Ll/᩵ܰۜ;
.super Ljava/lang/Object;
.source "S6MQ"


# instance fields
.field public ֫:I

.field public ۧ:J

.field public ܽ:F

.field public ᩳ:F


# virtual methods
.method public final ֫(IIFFFJ)F
    .locals 8

    cmpl-float v0, p3, p4

    if-nez v0, :cond_0

    return p3

    .line 787
    :cond_0
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 788
    iget v2, p0, Ll/᩵ܰۜ;->ܽ:F

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-gez v2, :cond_3

    if-lt p2, v0, :cond_2

    if-gt p2, v1, :cond_2

    if-lt p1, v0, :cond_2

    if-le p1, v1, :cond_1

    goto :goto_0

    .line 792
    :cond_1
    iget-wide v2, p0, Ll/᩵ܰۜ;->ۧ:J

    cmp-long p2, p6, v2

    if-lez p2, :cond_3

    int-to-double v4, p1

    .line 793
    iget p2, p0, Ll/᩵ܰۜ;->֫:I

    int-to-double v6, p2

    sub-double/2addr v4, v6

    const-wide v6, 0x408f400000000000L    # 1000.0

    mul-double v4, v4, v6

    sub-long v2, p6, v2

    long-to-double v2, v2

    div-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    double-to-float p2, v2

    iput p2, p0, Ll/᩵ܰۜ;->ᩳ:F

    .line 794
    iput p1, p0, Ll/᩵ܰۜ;->֫:I

    .line 795
    iput-wide p6, p0, Ll/᩵ܰۜ;->ۧ:J

    goto :goto_1

    .line 791
    :cond_2
    :goto_0
    iget p2, p0, Ll/᩵ܰۜ;->ᩳ:F

    const/high16 p6, 0x447a0000    # 1000.0f

    mul-float p5, p5, p6

    add-float/2addr p5, p2

    div-float/2addr p2, p5

    iput p2, p0, Ll/᩵ܰۜ;->ܽ:F

    .line 798
    :cond_3
    :goto_1
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-float p5, p2

    .line 799
    invoke-static {p4, p5}, Ljava/lang/Math;->min(FF)F

    move-result p4

    invoke-static {p3, p4}, Ljava/lang/Math;->max(FF)F

    move-result p3

    int-to-double p4, p1

    int-to-double p1, p2

    sub-double/2addr p4, p1

    .line 800
    iget p1, p0, Ll/᩵ܰۜ;->ܽ:F

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    float-to-double p1, p1

    mul-double p4, p4, p1

    double-to-float p1, p4

    add-float/2addr p3, p1

    return p3
.end method

.method public final ֫(IFJ)V
    .locals 0

    .line 779
    iput p1, p0, Ll/᩵ܰۜ;->֫:I

    .line 780
    iput-wide p3, p0, Ll/᩵ܰۜ;->ۧ:J

    .line 781
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iput p1, p0, Ll/᩵ܰۜ;->ᩳ:F

    const/high16 p1, -0x40800000    # -1.0f

    .line 782
    iput p1, p0, Ll/᩵ܰۜ;->ܽ:F

    return-void
.end method
