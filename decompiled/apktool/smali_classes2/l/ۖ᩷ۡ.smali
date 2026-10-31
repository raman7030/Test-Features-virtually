.class public final Ll/ۖ᩷ۡ;
.super Ljava/lang/Object;
.source "Y169"


# instance fields
.field public ֫:I

.field public final ۧ:Landroid/graphics/Paint;

.field public ܽ:I

.field public ᩳ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 854
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 855
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ۖ᩷ۡ;->ۧ:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 877
    iput v0, p0, Ll/ۖ᩷ۡ;->ܽ:I

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 861
    iput p1, p0, Ll/ۖ᩷ۡ;->֫:I

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;IFF)Z
    .locals 8

    .line 885
    iget v0, p0, Ll/ۖ᩷ۡ;->ܽ:I

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ۖ᩷ۡ;->ۧ:Landroid/graphics/Paint;

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    .line 886
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Ll/ۖ᩷ۡ;->ᩳ:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x64

    cmp-long v0, v4, v6

    if-ltz v0, :cond_0

    .line 888
    iput v1, p0, Ll/ۖ᩷ۡ;->ܽ:I

    goto :goto_0

    .line 890
    :cond_0
    div-int/lit8 v0, p2, 0x2

    long-to-float v1, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v1, v4

    int-to-float v4, v0

    sub-int/2addr p2, v0

    int-to-float p2, p2

    mul-float p2, p2, v1

    add-float/2addr p2, v4

    float-to-int p2, p2

    .line 893
    iget v0, p0, Ll/ۖ᩷ۡ;->֫:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float p2, p2

    .line 894
    invoke-virtual {p1, p3, p4, p2, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return v3

    .line 899
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۖ᩷ۡ;->ܽ:I

    const/4 v4, 0x0

    if-ne v0, v1, :cond_2

    .line 900
    iget v0, p0, Ll/ۖ᩷ۡ;->֫:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float p2, p2

    .line 901
    invoke-virtual {p1, p3, p4, p2, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return v4

    :cond_2
    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 906
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v5, p0, Ll/ۖ᩷ۡ;->ᩳ:J

    sub-long/2addr v0, v5

    const-wide/16 v5, 0x190

    cmp-long v7, v0, v5

    if-ltz v7, :cond_3

    .line 908
    iput v4, p0, Ll/ۖ᩷ۡ;->ܽ:I

    return v3

    :cond_3
    mul-int/lit8 v4, p2, 0x3

    .line 910
    div-int/lit8 v4, v4, 0x4

    long-to-float v0, v0

    const/high16 v1, 0x43c80000    # 400.0f

    div-float/2addr v0, v1

    int-to-float v1, p2

    sub-int/2addr p2, v4

    int-to-float p2, p2

    mul-float p2, p2, v0

    sub-float/2addr v1, p2

    float-to-int p2, v1

    .line 913
    iget v1, p0, Ll/ۖ᩷ۡ;->֫:I

    ushr-int/lit8 v4, v1, 0x18

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    cmpg-float v6, v0, v6

    if-gez v6, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    cmpl-float v6, v0, v5

    if-lez v6, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    :cond_5
    :goto_1
    const v6, 0x3fc90fdb

    mul-float v0, v0, v6

    float-to-double v6, v0

    .line 39
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v0, v6

    sub-float/2addr v5, v0

    mul-float v5, v5, v4

    float-to-int v0, v5

    shl-int/lit8 v0, v0, 0x18

    const v4, 0xffffff

    and-int/2addr v1, v4

    or-int/2addr v0, v1

    .line 915
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float p2, p2

    .line 916
    invoke-virtual {p1, p3, p4, p2, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return v3

    :cond_6
    return v4
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x1

    .line 865
    iput v0, p0, Ll/ۖ᩷ۡ;->ܽ:I

    .line 866
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۖ᩷ۡ;->ᩳ:J

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 881
    iget v0, p0, Ll/ۖ᩷ۡ;->ܽ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 870
    iget v0, p0, Ll/ۖ᩷ۡ;->ܽ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x3

    .line 871
    iput v0, p0, Ll/ۖ᩷ۡ;->ܽ:I

    .line 872
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۖ᩷ۡ;->ᩳ:J

    return-void
.end method
