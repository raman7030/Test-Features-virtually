.class public abstract Ll/۟۬ۧ;
.super Ll/ۜ۬ۧ;
.source "92WK"


# static fields
.field public static final MILLISECONDS_PER_INCH:F = 100.0f


# instance fields
.field public mGravityScroller:Landroid/widget/Scroller;

.field public mRecyclerView:Ll/۬۬ۧ;

.field public final mScrollListener:Ll/ۢ۬ۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ll/ۜ۬ۧ;-><init>()V

    .line 43
    new-instance v0, Ll/᩺۬ۧ;

    invoke-direct {v0, p0}, Ll/᩺۬ۧ;-><init>(Ll/۟۬ۧ;)V

    iput-object v0, p0, Ll/۟۬ۧ;->mScrollListener:Ll/ۢ۬ۧ;

    return-void
.end method

.method private ֫()V
    .locals 2

    .line 124
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, p0, Ll/۟۬ۧ;->mScrollListener:Ll/ۢ۬ۧ;

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->removeOnScrollListener(Ll/ۢ۬ۧ;)V

    .line 125
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->setOnFlingListener(Ll/ۜ۬ۧ;)V

    return-void
.end method

.method private ֫(Ll/ܿ۬ۧ;II)Z
    .locals 2

    .line 159
    instance-of v0, p1, Ll/۠۬ۧ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 163
    :cond_0
    invoke-virtual {p0, p1}, Ll/۟۬ۧ;->createScroller(Ll/ܿ۬ۧ;)Ll/ܶ۬ۧ;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 168
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ll/۟۬ۧ;->findTargetSnapPosition(Ll/ܿ۬ۧ;II)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    return v1

    .line 173
    :cond_2
    invoke-virtual {v0, p2}, Ll/ܶ۬ۧ;->setTargetPosition(I)V

    .line 174
    invoke-virtual {p1, v0}, Ll/ܿ۬ۧ;->startSmoothScroll(Ll/ܶ۬ۧ;)V

    const/4 p1, 0x1

    return p1
.end method

.method private ۧ()V
    .locals 2

    .line 113
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getOnFlingListener()Ll/ۜ۬ۧ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 116
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, p0, Ll/۟۬ۧ;->mScrollListener:Ll/ۢ۬ۧ;

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->addOnScrollListener(Ll/ۢ۬ۧ;)V

    .line 117
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0, p0}, Ll/۬۬ۧ;->setOnFlingListener(Ll/ۜ۬ۧ;)V

    return-void

    .line 114
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "An instance of OnFlingListener already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public attachToRecyclerView(Ll/۬۬ۧ;)V
    .locals 2

    .line 94
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 98
    invoke-direct {p0}, Ll/۟۬ۧ;->֫()V

    .line 100
    :cond_1
    iput-object p1, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz p1, :cond_2

    .line 102
    invoke-direct {p0}, Ll/۟۬ۧ;->ۧ()V

    .line 103
    new-instance p1, Landroid/widget/Scroller;

    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-direct {p1, v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p1, p0, Ll/۟۬ۧ;->mGravityScroller:Landroid/widget/Scroller;

    .line 105
    invoke-virtual {p0}, Ll/۟۬ۧ;->snapToTargetExistingView()V

    :cond_2
    :goto_0
    return-void
.end method

.method public abstract calculateDistanceToFinalSnap(Ll/ܿ۬ۧ;Landroid/view/View;)[I
.end method

.method public calculateScrollDistance(II)[I
    .locals 9

    .line 140
    iget-object v0, p0, Ll/۟۬ۧ;->mGravityScroller:Landroid/widget/Scroller;

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v5, -0x80000000

    const v6, 0x7fffffff

    move v3, p1

    move v4, p2

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 142
    iget-object p1, p0, Ll/۟۬ۧ;->mGravityScroller:Landroid/widget/Scroller;

    invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalX()I

    move-result p1

    .line 143
    iget-object p2, p0, Ll/۟۬ۧ;->mGravityScroller:Landroid/widget/Scroller;

    invoke-virtual {p2}, Landroid/widget/Scroller;->getFinalY()I

    move-result p2

    filled-new-array {p1, p2}, [I

    move-result-object p1

    return-object p1
.end method

.method public createScroller(Ll/ܿ۬ۧ;)Ll/ܶ۬ۧ;
    .locals 0

    .line 212
    invoke-virtual {p0, p1}, Ll/۟۬ۧ;->createSnapScroller(Ll/ܿ۬ۧ;)Ll/᩷ۗۧ;

    move-result-object p1

    return-object p1
.end method

.method public createSnapScroller(Ll/ܿ۬ۧ;)Ll/᩷ۗۧ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 228
    instance-of p1, p1, Ll/۠۬ۧ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 231
    :cond_0
    new-instance p1, Ll/ܰ۬ۧ;

    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Ll/ܰ۬ۧ;-><init>(Ll/۟۬ۧ;Landroid/content/Context;)V

    return-object p1
.end method

.method public abstract findSnapView(Ll/ܿ۬ۧ;)Landroid/view/View;
.end method

.method public abstract findTargetSnapPosition(Ll/ܿ۬ۧ;II)I
.end method

.method public onFling(II)Z
    .locals 4

    .line 66
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 70
    :cond_0
    iget-object v2, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v2}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v2

    if-nez v2, :cond_1

    return v1

    .line 74
    :cond_1
    iget-object v2, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v2}, Ll/۬۬ۧ;->getMinFlingVelocity()I

    move-result v2

    .line 75
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-gt v3, v2, :cond_2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-le v3, v2, :cond_3

    .line 76
    :cond_2
    invoke-direct {p0, v0, p1, p2}, Ll/۟۬ۧ;->֫(Ll/ܿ۬ۧ;II)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public snapToTargetExistingView()V
    .locals 4

    .line 184
    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 187
    :cond_0
    invoke-virtual {v0}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 191
    :cond_1
    invoke-virtual {p0, v0}, Ll/۟۬ۧ;->findSnapView(Ll/ܿ۬ۧ;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 195
    :cond_2
    invoke-virtual {p0, v0, v1}, Ll/۟۬ۧ;->calculateDistanceToFinalSnap(Ll/ܿ۬ۧ;Landroid/view/View;)[I

    move-result-object v0

    const/4 v1, 0x0

    .line 196
    aget v1, v0, v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    aget v3, v0, v2

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    .line 197
    :cond_4
    :goto_1
    iget-object v3, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    aget v0, v0, v2

    invoke-virtual {v3, v1, v0}, Ll/۬۬ۧ;->smoothScrollBy(II)V

    return-void
.end method
