.class public final Ll/ۘۗۧ;
.super Ll/᩷ۗۧ;
.source "63JU"


# instance fields
.field public final synthetic ֫:Ll/ᩴۗۧ;


# direct methods
.method public constructor <init>(Ll/ᩴۗۧ;Landroid/content/Context;)V
    .locals 0

    .line 177
    iput-object p1, p0, Ll/ۘۗۧ;->֫:Ll/ᩴۗۧ;

    invoke-direct {p0, p2}, Ll/᩷ۗۧ;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final calculateSpeedPerPixel(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 193
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr v0, p1

    return v0
.end method

.method public final calculateTimeForScrolling(I)I
    .locals 1

    const/16 v0, 0x64

    .line 198
    invoke-super {p0, p1}, Ll/᩷ۗۧ;->calculateTimeForScrolling(I)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final onTargetFound(Landroid/view/View;Ll/᩸۬ۧ;Ll/֨۬ۧ;)V
    .locals 2

    .line 181
    iget-object p2, p0, Ll/ۘۗۧ;->֫:Ll/ᩴۗۧ;

    iget-object v0, p2, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Ll/ᩴۗۧ;->calculateDistanceToFinalSnap(Ll/ܿ۬ۧ;Landroid/view/View;)[I

    move-result-object p1

    const/4 p2, 0x0

    .line 183
    aget p2, p1, p2

    const/4 v0, 0x1

    .line 184
    aget p1, p1, v0

    .line 185
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩷ۗۧ;->calculateTimeForDeceleration(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 187
    iget-object v1, p0, Ll/᩷ۗۧ;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p3, p2, p1, v1, v0}, Ll/֨۬ۧ;->֫(IILandroid/view/animation/Interpolator;I)V

    :cond_0
    return-void
.end method
