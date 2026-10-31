.class public abstract Ll/ܶ۬ۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public mLayoutManager:Ll/ܿ۬ۧ;

.field public mPendingInitialRun:Z

.field public mRecyclerView:Ll/۬۬ۧ;

.field public final mRecyclingAction:Ll/֨۬ۧ;

.field public mRunning:Z

.field public mStarted:Z

.field public mTargetPosition:I

.field public mTargetView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12718
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 12702
    iput v0, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    .line 12719
    new-instance v0, Ll/֨۬ۧ;

    invoke-direct {v0}, Ll/֨۬ۧ;-><init>()V

    iput-object v0, p0, Ll/ܶ۬ۧ;->mRecyclingAction:Ll/֨۬ۧ;

    return-void
.end method


# virtual methods
.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 2

    .line 12776
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    .line 12777
    instance-of v1, v0, Ll/۠۬ۧ;

    if-eqz v1, :cond_0

    .line 12778
    check-cast v0, Ll/۠۬ۧ;

    .line 12779
    invoke-interface {v0, p1}, Ll/۠۬ۧ;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 1

    .line 12913
    iget-object v0, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    invoke-virtual {v0, p1}, Ll/ܿ۬ۧ;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    .line 12906
    iget-object v0, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getChildPosition(Landroid/view/View;)I
    .locals 1

    .line 12899
    iget-object v0, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->getChildLayoutPosition(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public getLayoutManager()Ll/ܿ۬ۧ;
    .locals 1

    .line 12792
    iget-object v0, p0, Ll/ܶ۬ۧ;->mLayoutManager:Ll/ܿ۬ۧ;

    return-object v0
.end method

.method public getTargetPosition()I
    .locals 1

    .line 12844
    iget v0, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    return v0
.end method

.method public instantScrollToPosition(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 12922
    iget-object v0, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->scrollToPosition(I)V

    return-void
.end method

.method public isPendingInitialRun()Z
    .locals 1

    .line 12826
    iget-boolean v0, p0, Ll/ܶ۬ۧ;->mPendingInitialRun:Z

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 12834
    iget-boolean v0, p0, Ll/ܶ۬ۧ;->mRunning:Z

    return v0
.end method

.method public normalize(Landroid/graphics/PointF;)V
    .locals 2

    .line 12940
    iget v0, p1, Landroid/graphics/PointF;->x:F

    mul-float v0, v0, v0

    iget v1, p1, Landroid/graphics/PointF;->y:F

    mul-float v1, v1, v1

    add-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 12942
    iget v1, p1, Landroid/graphics/PointF;->x:F

    div-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/PointF;->x:F

    .line 12943
    iget v1, p1, Landroid/graphics/PointF;->y:F

    div-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method public onAnimation(II)V
    .locals 6

    .line 12848
    iget-object v0, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 12849
    iget v1, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    if-nez v0, :cond_1

    .line 12850
    :cond_0
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->stop()V

    .line 12858
    :cond_1
    iget-boolean v1, p0, Ll/ܶ۬ۧ;->mPendingInitialRun:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ܶ۬ۧ;->mTargetView:Landroid/view/View;

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/ܶ۬ۧ;->mLayoutManager:Ll/ܿ۬ۧ;

    if-eqz v1, :cond_3

    .line 12859
    iget v1, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    invoke-virtual {p0, v1}, Ll/ܶ۬ۧ;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 12860
    iget v3, v1, Landroid/graphics/PointF;->x:F

    const/4 v4, 0x0

    cmpl-float v5, v3, v4

    if-nez v5, :cond_2

    iget v5, v1, Landroid/graphics/PointF;->y:F

    cmpl-float v4, v5, v4

    if-eqz v4, :cond_3

    .line 12862
    :cond_2
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    float-to-int v3, v3

    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 12863
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    float-to-int v1, v1

    .line 12861
    invoke-virtual {v0, v3, v1, v2}, Ll/۬۬ۧ;->scrollStep(II[I)V

    :cond_3
    const/4 v1, 0x0

    .line 12868
    iput-boolean v1, p0, Ll/ܶ۬ۧ;->mPendingInitialRun:Z

    .line 12870
    iget-object v1, p0, Ll/ܶ۬ۧ;->mTargetView:Landroid/view/View;

    if-eqz v1, :cond_5

    .line 12872
    invoke-virtual {p0, v1}, Ll/ܶ۬ۧ;->getChildPosition(Landroid/view/View;)I

    move-result v1

    iget v3, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    if-ne v1, v3, :cond_4

    .line 12873
    iget-object v1, p0, Ll/ܶ۬ۧ;->mTargetView:Landroid/view/View;

    iget-object v2, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    iget-object v3, p0, Ll/ܶ۬ۧ;->mRecyclingAction:Ll/֨۬ۧ;

    invoke-virtual {p0, v1, v2, v3}, Ll/ܶ۬ۧ;->onTargetFound(Landroid/view/View;Ll/᩸۬ۧ;Ll/֨۬ۧ;)V

    .line 12874
    iget-object v1, p0, Ll/ܶ۬ۧ;->mRecyclingAction:Ll/֨۬ۧ;

    invoke-virtual {v1, v0}, Ll/֨۬ۧ;->֫(Ll/۬۬ۧ;)V

    .line 12875
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->stop()V

    goto :goto_0

    .line 12878
    :cond_4
    iput-object v2, p0, Ll/ܶ۬ۧ;->mTargetView:Landroid/view/View;

    .line 12881
    :cond_5
    :goto_0
    iget-boolean v1, p0, Ll/ܶ۬ۧ;->mRunning:Z

    if-eqz v1, :cond_6

    .line 12882
    iget-object v1, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    iget-object v2, p0, Ll/ܶ۬ۧ;->mRecyclingAction:Ll/֨۬ۧ;

    invoke-virtual {p0, p1, p2, v1, v2}, Ll/ܶ۬ۧ;->onSeekTargetStep(IILl/᩸۬ۧ;Ll/֨۬ۧ;)V

    .line 12883
    iget-object p1, p0, Ll/ܶ۬ۧ;->mRecyclingAction:Ll/֨۬ۧ;

    invoke-virtual {p1}, Ll/֨۬ۧ;->֫()Z

    move-result p1

    .line 12884
    iget-object p2, p0, Ll/ܶ۬ۧ;->mRecyclingAction:Ll/֨۬ۧ;

    invoke-virtual {p2, v0}, Ll/֨۬ۧ;->֫(Ll/۬۬ۧ;)V

    if-eqz p1, :cond_6

    .line 12887
    iget-boolean p1, p0, Ll/ܶ۬ۧ;->mRunning:Z

    if-eqz p1, :cond_6

    const/4 p1, 0x1

    .line 12888
    iput-boolean p1, p0, Ll/ܶ۬ۧ;->mPendingInitialRun:Z

    .line 12889
    iget-object p1, v0, Ll/۬۬ۧ;->mViewFlinger:Ll/ۙ۬ۧ;

    invoke-virtual {p1}, Ll/ۙ۬ۧ;->֫()V

    :cond_6
    return-void
.end method

.method public onChildAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 12926
    invoke-virtual {p0, p1}, Ll/ܶ۬ۧ;->getChildPosition(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getTargetPosition()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 12927
    iput-object p1, p0, Ll/ܶ۬ۧ;->mTargetView:Landroid/view/View;

    .line 12928
    sget p1, Ll/۬۬ۧ;->HORIZONTAL:I

    :cond_0
    return-void
.end method

.method public abstract onSeekTargetStep(IILl/᩸۬ۧ;Ll/֨۬ۧ;)V
.end method

.method public abstract onStart()V
.end method

.method public abstract onStop()V
.end method

.method public abstract onTargetFound(Landroid/view/View;Ll/᩸۬ۧ;Ll/֨۬ۧ;)V
.end method

.method public setTargetPosition(I)V
    .locals 0

    .line 12762
    iput p1, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    return-void
.end method

.method public start(Ll/۬۬ۧ;Ll/ܿ۬ۧ;)V
    .locals 2

    .line 12737
    iget-object v0, p1, Ll/۬۬ۧ;->mViewFlinger:Ll/ۙ۬ۧ;

    .line 6029
    iget-object v1, v0, Ll/ۙ۬ۧ;->۫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6030
    iget-object v0, v0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 12746
    iput-object p1, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 12747
    iput-object p2, p0, Ll/ܶ۬ۧ;->mLayoutManager:Ll/ܿ۬ۧ;

    .line 12748
    iget p2, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 12751
    iget-object p1, p1, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    iput p2, p1, Ll/᩸۬ۧ;->ۖ:I

    const/4 p1, 0x1

    .line 12752
    iput-boolean p1, p0, Ll/ܶ۬ۧ;->mRunning:Z

    .line 12753
    iput-boolean p1, p0, Ll/ܶ۬ۧ;->mPendingInitialRun:Z

    .line 12754
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getTargetPosition()I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ܶ۬ۧ;->findViewByPosition(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Ll/ܶ۬ۧ;->mTargetView:Landroid/view/View;

    .line 12755
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->onStart()V

    .line 12756
    iget-object p2, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object p2, p2, Ll/۬۬ۧ;->mViewFlinger:Ll/ۙ۬ۧ;

    invoke-virtual {p2}, Ll/ۙ۬ۧ;->֫()V

    .line 12758
    iput-boolean p1, p0, Ll/ܶ۬ۧ;->mStarted:Z

    return-void

    .line 12749
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid target position"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final stop()V
    .locals 3

    .line 12802
    iget-boolean v0, p0, Ll/ܶ۬ۧ;->mRunning:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 12805
    iput-boolean v0, p0, Ll/ܶ۬ۧ;->mRunning:Z

    .line 12806
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->onStop()V

    .line 12807
    iget-object v1, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v1, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    const/4 v2, -0x1

    iput v2, v1, Ll/᩸۬ۧ;->ۖ:I

    const/4 v1, 0x0

    .line 12808
    iput-object v1, p0, Ll/ܶ۬ۧ;->mTargetView:Landroid/view/View;

    .line 12809
    iput v2, p0, Ll/ܶ۬ۧ;->mTargetPosition:I

    .line 12810
    iput-boolean v0, p0, Ll/ܶ۬ۧ;->mPendingInitialRun:Z

    .line 12812
    iget-object v0, p0, Ll/ܶ۬ۧ;->mLayoutManager:Ll/ܿ۬ۧ;

    invoke-virtual {v0, p0}, Ll/ܿ۬ۧ;->onSmoothScrollerStopped(Ll/ܶ۬ۧ;)V

    .line 12814
    iput-object v1, p0, Ll/ܶ۬ۧ;->mLayoutManager:Ll/ܿ۬ۧ;

    .line 12815
    iput-object v1, p0, Ll/ܶ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    return-void
.end method
