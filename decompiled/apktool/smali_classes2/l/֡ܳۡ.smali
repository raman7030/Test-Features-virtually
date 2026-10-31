.class public final Ll/֡ܳۡ;
.super Landroid/graphics/drawable/ColorDrawable;
.source "X54K"


# instance fields
.field public ֫:I

.field public ۧ:Landroid/view/animation/AccelerateInterpolator;

.field public ܽ:Z

.field public ᩳ:J


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 11
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object p1, p0, Ll/֡ܳۡ;->ۧ:Landroid/view/animation/AccelerateInterpolator;

    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Ll/֡ܳۡ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 35
    iget-boolean v0, p0, Ll/֡ܳۡ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 36
    invoke-super {p0, p1}, Landroid/graphics/drawable/ColorDrawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 40
    :cond_0
    iget-wide v0, p0, Ll/֡ܳۡ;->ᩳ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/֡ܳۡ;->ᩳ:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    .line 42
    iget v0, p0, Ll/֡ܳۡ;->֫:I

    const/4 v2, 0x0

    if-ge v1, v0, :cond_1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    .line 43
    iget-object v0, p0, Ll/֡ܳۡ;->ۧ:Landroid/view/animation/AccelerateInterpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AccelerateInterpolator;->getInterpolation(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v0

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float v1, v1, v0

    float-to-int v0, v1

    .line 44
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 50
    :cond_2
    iput-wide v2, p0, Ll/֡ܳۡ;->ᩳ:J

    const/4 v2, 0x1

    .line 53
    :goto_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/ColorDrawable;->draw(Landroid/graphics/Canvas;)V

    if-nez v2, :cond_3

    .line 55
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_3
    return-void
.end method

.method public final setColor(I)V
    .locals 1

    .line 26
    iget-boolean v0, p0, Ll/֡ܳۡ;->ܽ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Ll/֡ܳۡ;->ܽ:Z

    const/16 v0, 0xff

    .line 28
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 30
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 19
    iput p1, p0, Ll/֡ܳۡ;->֫:I

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/֡ܳۡ;->ᩳ:J

    .line 21
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
