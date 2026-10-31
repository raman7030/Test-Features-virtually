.class public final Ll/۟ۨۜ;
.super Ljava/lang/Object;
.source "M6JW"


# instance fields
.field public ֫:J

.field public final ۧ:Landroid/graphics/RectF;

.field public ܽ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/۟ۨۜ;->ۧ:Landroid/graphics/RectF;

    const-wide/16 v0, -0x1

    .line 8
    iput-wide v0, p0, Ll/۟ۨۜ;->ܽ:J

    iput-wide v0, p0, Ll/۟ۨۜ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫(JLandroid/graphics/RectF;Z)J
    .locals 9

    .line 11
    iget-wide v0, p0, Ll/۟ۨۜ;->ܽ:J

    sub-long v0, p1, v0

    const-wide/16 v2, 0x1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 12
    iget v2, p3, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Ll/۟ۨۜ;->ۧ:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v4, p3, Landroid/graphics/RectF;->top:F

    iget v5, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget v4, p3, Landroid/graphics/RectF;->right:F

    iget v5, v3, Landroid/graphics/RectF;->right:F

    sub-float/2addr v4, v5

    .line 13
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p3, Landroid/graphics/RectF;->bottom:F

    iget v6, v3, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 12
    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 15
    iget-wide v4, p0, Ll/۟ۨۜ;->ܽ:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_0

    const/high16 v4, 0x447a0000    # 1000.0f

    mul-float v2, v2, v4

    long-to-float v0, v0

    div-float/2addr v2, v0

    .line 16
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const v1, 0x3ecccccd    # 0.4f

    mul-float v0, v0, v1

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {v3, p3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 18
    iput-wide p1, p0, Ll/۟ۨۜ;->ܽ:J

    if-nez p4, :cond_1

    const-wide/16 p1, -0x1

    .line 25
    iput-wide p1, p0, Ll/۟ۨۜ;->֫:J

    return-wide v6

    .line 20
    :cond_1
    iget-wide p3, p0, Ll/۟ۨۜ;->֫:J

    cmp-long v1, p3, v6

    if-gez v1, :cond_2

    iput-wide p1, p0, Ll/۟ۨۜ;->֫:J

    :cond_2
    if-eqz v0, :cond_3

    const-wide/16 p3, 0x28

    goto :goto_1

    :cond_3
    const-wide/16 p3, 0x50

    .line 22
    :goto_1
    iget-wide v1, p0, Ll/۟ۨۜ;->֫:J

    if-eqz v0, :cond_4

    const/16 v0, 0x78

    goto :goto_2

    :cond_4
    const/16 v0, 0x190

    :goto_2
    int-to-long v3, v0

    add-long/2addr v1, v3

    sub-long/2addr v1, p1

    invoke-static {p3, p4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-static {v6, v7, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫()V
    .locals 2

    const-wide/16 v0, -0x1

    .line 25
    iput-wide v0, p0, Ll/۟ۨۜ;->֫:J

    return-void
.end method

.method public final ۧ()V
    .locals 2

    const-wide/16 v0, -0x1

    .line 28
    iput-wide v0, p0, Ll/۟ۨۜ;->֫:J

    iput-wide v0, p0, Ll/۟ۨۜ;->ܽ:J

    .line 29
    iget-object v0, p0, Ll/۟ۨۜ;->ۧ:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    return-void
.end method
