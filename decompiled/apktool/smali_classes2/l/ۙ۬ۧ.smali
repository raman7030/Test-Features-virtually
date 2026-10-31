.class public final Ll/ۙ۬ۧ;
.super Ljava/lang/Object;
.source "Y6A7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ۗ:Landroid/widget/OverScroller;

.field public ۙ:I

.field public final synthetic ۫:Ll/۬۬ۧ;

.field public ۬:Z

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:Landroid/view/animation/Interpolator;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;)V
    .locals 2

    .line 5775
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۬ۧ;->۫:Ll/۬۬ۧ;

    .line 5767
    sget-object v0, Ll/۬۬ۧ;->sQuinticInterpolator:Landroid/view/animation/Interpolator;

    iput-object v0, p0, Ll/ۙ۬ۧ;->᩹:Landroid/view/animation/Interpolator;

    const/4 v1, 0x0

    .line 5770
    iput-boolean v1, p0, Ll/ۙ۬ۧ;->᩸:Z

    .line 5773
    iput-boolean v1, p0, Ll/ۙ۬ۧ;->۬:Z

    .line 5776
    new-instance v1, Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v0, p0

    .line 5781
    iget-object v9, v0, Ll/ۙ۬ۧ;->۫:Ll/۬۬ۧ;

    iget-object v1, v9, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    if-nez v1, :cond_0

    .line 6029
    invoke-virtual {v9, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6030
    iget-object v1, v0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void

    :cond_0
    const/4 v10, 0x0

    .line 5786
    iput-boolean v10, v0, Ll/ۙ۬ۧ;->۬:Z

    const/4 v11, 0x1

    .line 5787
    iput-boolean v11, v0, Ll/ۙ۬ۧ;->᩸:Z

    .line 5789
    invoke-virtual {v9}, Ll/۬۬ۧ;->consumePendingUpdateOperations()V

    .line 5801
    iget-object v12, v0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    .line 5802
    invoke-virtual {v12}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 5803
    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    .line 5804
    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    .line 5805
    iget v3, v0, Ll/ۙ۬ۧ;->᩶:I

    sub-int v3, v1, v3

    .line 5806
    iget v4, v0, Ll/ۙ۬ۧ;->ۙ:I

    sub-int v4, v2, v4

    .line 5807
    iput v1, v0, Ll/ۙ۬ۧ;->᩶:I

    .line 5808
    iput v2, v0, Ll/ۙ۬ۧ;->ۙ:I

    .line 5810
    invoke-virtual {v9, v3}, Ll/۬۬ۧ;->consumeFlingInHorizontalStretch(I)I

    move-result v7

    .line 5811
    invoke-virtual {v9, v4}, Ll/۬۬ۧ;->consumeFlingInVerticalStretch(I)I

    move-result v8

    .line 5817
    iget-object v4, v9, Ll/۬۬ۧ;->mReusableIntPair:[I

    aput v10, v4, v10

    .line 5818
    aput v10, v4, v11

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v9

    move v2, v7

    move v3, v8

    .line 5819
    invoke-virtual/range {v1 .. v6}, Ll/۬۬ۧ;->dispatchNestedPreScroll(II[I[II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5821
    iget-object v1, v9, Ll/۬۬ۧ;->mReusableIntPair:[I

    aget v2, v1, v10

    sub-int/2addr v7, v2

    .line 5822
    aget v1, v1, v11

    sub-int/2addr v8, v1

    .line 5827
    :cond_1
    invoke-virtual {v9}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    const/4 v13, 0x2

    if-eq v1, v13, :cond_2

    .line 5828
    invoke-virtual {v9, v7, v8}, Ll/۬۬ۧ;->considerReleasingGlowsOnScroll(II)V

    .line 5832
    :cond_2
    iget-object v1, v9, Ll/۬۬ۧ;->mAdapter:Ll/᩶ۗۧ;

    if-eqz v1, :cond_6

    .line 5833
    iget-object v1, v9, Ll/۬۬ۧ;->mReusableIntPair:[I

    aput v10, v1, v10

    .line 5834
    aput v10, v1, v11

    .line 5835
    invoke-virtual {v9, v7, v8, v1}, Ll/۬۬ۧ;->scrollStep(II[I)V

    .line 5836
    iget-object v1, v9, Ll/۬۬ۧ;->mReusableIntPair:[I

    aget v2, v1, v10

    .line 5837
    aget v1, v1, v11

    sub-int/2addr v7, v2

    sub-int/2addr v8, v1

    .line 5843
    iget-object v3, v9, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    iget-object v3, v3, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-eqz v3, :cond_5

    .line 5844
    invoke-virtual {v3}, Ll/ܶ۬ۧ;->isPendingInitialRun()Z

    move-result v4

    if-nez v4, :cond_5

    .line 5845
    invoke-virtual {v3}, Ll/ܶ۬ۧ;->isRunning()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 5846
    iget-object v4, v9, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    invoke-virtual {v4}, Ll/᩸۬ۧ;->֫()I

    move-result v4

    if-nez v4, :cond_3

    .line 5848
    invoke-virtual {v3}, Ll/ܶ۬ۧ;->stop()V

    goto :goto_0

    .line 5849
    :cond_3
    invoke-virtual {v3}, Ll/ܶ۬ۧ;->getTargetPosition()I

    move-result v5

    if-lt v5, v4, :cond_4

    sub-int/2addr v4, v11

    .line 5850
    invoke-virtual {v3, v4}, Ll/ܶ۬ۧ;->setTargetPosition(I)V

    .line 5851
    invoke-virtual {v3, v2, v1}, Ll/ܶ۬ۧ;->onAnimation(II)V

    goto :goto_0

    .line 5853
    :cond_4
    invoke-virtual {v3, v2, v1}, Ll/ܶ۬ۧ;->onAnimation(II)V

    :cond_5
    :goto_0
    move v14, v1

    move v15, v2

    move/from16 v16, v7

    move/from16 v17, v8

    goto :goto_1

    :cond_6
    const/4 v2, 0x0

    const/4 v1, 0x0

    move/from16 v16, v7

    move/from16 v17, v8

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 5858
    :goto_1
    iget-object v1, v9, Ll/۬۬ۧ;->mItemDecorations:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 5859
    invoke-virtual {v9}, Landroid/view/View;->invalidate()V

    .line 5863
    :cond_7
    iget-object v8, v9, Ll/۬۬ۧ;->mReusableIntPair:[I

    aput v10, v8, v10

    .line 5864
    aput v10, v8, v11

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v1, v9

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    .line 5865
    invoke-virtual/range {v1 .. v8}, Ll/۬۬ۧ;->dispatchNestedScroll(IIII[II[I)V

    .line 5867
    iget-object v1, v9, Ll/۬۬ۧ;->mReusableIntPair:[I

    aget v2, v1, v10

    sub-int v16, v16, v2

    .line 5868
    aget v1, v1, v11

    sub-int v17, v17, v1

    if-nez v15, :cond_8

    if-eqz v14, :cond_9

    .line 5871
    :cond_8
    invoke-virtual {v9, v15, v14}, Ll/۬۬ۧ;->dispatchOnScrolled(II)V

    .line 5874
    :cond_9
    invoke-static {v9}, Ll/۬۬ۧ;->֫(Ll/۬۬ۧ;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 5875
    invoke-virtual {v9}, Landroid/view/View;->invalidate()V

    .line 5883
    :cond_a
    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    invoke-virtual {v12}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v2

    if-ne v1, v2, :cond_b

    const/4 v1, 0x1

    goto :goto_2

    :cond_b
    const/4 v1, 0x0

    .line 5884
    :goto_2
    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    invoke-virtual {v12}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v3

    if-ne v2, v3, :cond_c

    const/4 v2, 0x1

    goto :goto_3

    :cond_c
    const/4 v2, 0x0

    .line 5885
    :goto_3
    invoke-virtual {v12}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v3

    if-nez v3, :cond_f

    if-nez v1, :cond_d

    if-eqz v16, :cond_e

    :cond_d
    if-nez v2, :cond_f

    if-eqz v17, :cond_e

    goto :goto_4

    :cond_e
    const/4 v1, 0x0

    goto :goto_5

    :cond_f
    :goto_4
    const/4 v1, 0x1

    .line 5892
    :goto_5
    iget-object v2, v9, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    iget-object v2, v2, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-eqz v2, :cond_10

    .line 5894
    invoke-virtual {v2}, Ll/ܶ۬ۧ;->isPendingInitialRun()Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    if-eqz v1, :cond_17

    .line 5900
    invoke-virtual {v9}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    if-eq v1, v13, :cond_15

    .line 5901
    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    float-to-int v1, v1

    if-gez v16, :cond_11

    neg-int v2, v1

    goto :goto_6

    :cond_11
    if-lez v16, :cond_12

    move v2, v1

    goto :goto_6

    :cond_12
    const/4 v2, 0x0

    :goto_6
    if-gez v17, :cond_13

    neg-int v1, v1

    goto :goto_7

    :cond_13
    if-lez v17, :cond_14

    goto :goto_7

    :cond_14
    const/4 v1, 0x0

    .line 5904
    :goto_7
    invoke-virtual {v9, v2, v1}, Ll/۬۬ۧ;->absorbGlows(II)V

    .line 5907
    :cond_15
    sget-boolean v1, Ll/۬۬ۧ;->ALLOW_THREAD_GAP_WORK:Z

    if-eqz v1, :cond_18

    .line 5908
    iget-object v1, v9, Ll/۬۬ۧ;->mPrefetchRegistry:Ll/᩵ۙۧ;

    .line 152
    iget-object v2, v1, Ll/᩵ۙۧ;->ۧ:[I

    if-eqz v2, :cond_16

    const/4 v3, -0x1

    .line 153
    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([II)V

    .line 155
    :cond_16
    iput v10, v1, Ll/᩵ۙۧ;->֫:I

    goto :goto_9

    .line 5913
    :cond_17
    :goto_8
    invoke-virtual/range {p0 .. p0}, Ll/ۙ۬ۧ;->֫()V

    .line 5914
    iget-object v1, v9, Ll/۬۬ۧ;->mGapWorker:Ll/ۚۙۧ;

    if-eqz v1, :cond_18

    .line 5915
    invoke-virtual {v1, v9, v15, v14}, Ll/ۚۙۧ;->֫(Ll/۬۬ۧ;II)V

    .line 5920
    :cond_18
    :goto_9
    iget-object v1, v9, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    iget-object v1, v1, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-eqz v1, :cond_19

    .line 5922
    invoke-virtual {v1}, Ll/ܶ۬ۧ;->isPendingInitialRun()Z

    move-result v2

    if-eqz v2, :cond_19

    .line 5923
    invoke-virtual {v1, v10, v10}, Ll/ܶ۬ۧ;->onAnimation(II)V

    .line 5926
    :cond_19
    iput-boolean v10, v0, Ll/ۙ۬ۧ;->᩸:Z

    .line 5927
    iget-boolean v1, v0, Ll/ۙ۬ۧ;->۬:Z

    if-eqz v1, :cond_1a

    .line 5944
    invoke-virtual {v9, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 5945
    sget v1, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {v9, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    .line 5930
    :cond_1a
    invoke-virtual {v9, v10}, Ll/۬۬ۧ;->setScrollState(I)V

    .line 5931
    invoke-virtual {v9, v11}, Ll/۬۬ۧ;->stopNestedScroll(I)V

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 5936
    iget-boolean v0, p0, Ll/ۙ۬ۧ;->᩸:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 5937
    iput-boolean v0, p0, Ll/ۙ۬ۧ;->۬:Z

    return-void

    .line 5944
    :cond_0
    iget-object v0, p0, Ll/ۙ۬ۧ;->۫:Ll/۬۬ۧ;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 5945
    sget v1, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(II)V
    .locals 12

    const/4 v0, 0x2

    .line 5949
    iget-object v1, p0, Ll/ۙ۬ۧ;->۫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Ll/۬۬ۧ;->setScrollState(I)V

    const/4 v0, 0x0

    .line 5950
    iput v0, p0, Ll/ۙ۬ۧ;->ۙ:I

    iput v0, p0, Ll/ۙ۬ۧ;->᩶:I

    .line 5954
    iget-object v0, p0, Ll/ۙ۬ۧ;->᩹:Landroid/view/animation/Interpolator;

    sget-object v2, Ll/۬۬ۧ;->sQuinticInterpolator:Landroid/view/animation/Interpolator;

    if-eq v0, v2, :cond_0

    .line 5955
    iput-object v2, p0, Ll/ۙ۬ۧ;->᩹:Landroid/view/animation/Interpolator;

    .line 5956
    new-instance v0, Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    .line 5958
    :cond_0
    iget-object v3, p0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    const/high16 v10, -0x80000000

    const v11, 0x7fffffff

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    move v6, p1

    move v7, p2

    invoke-virtual/range {v3 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 5960
    invoke-virtual {p0}, Ll/ۙ۬ۧ;->֫()V

    return-void
.end method

.method public final ֫(IILandroid/view/animation/Interpolator;I)V
    .locals 9

    const/high16 v0, -0x80000000

    const/4 v1, 0x0

    .line 5979
    iget-object v2, p0, Ll/ۙ۬ۧ;->۫:Ll/۬۬ۧ;

    if-ne p4, v0, :cond_3

    .line 6017
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p4

    .line 6018
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-le p4, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 6020
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v4

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v4

    :goto_1
    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move p4, v0

    :goto_2
    int-to-float p4, p4

    int-to-float v0, v4

    div-float/2addr p4, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p4, v0

    const/high16 v0, 0x43960000    # 300.0f

    mul-float p4, p4, v0

    float-to-int p4, p4

    const/16 v0, 0x7d0

    .line 6025
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result p4

    :cond_3
    move v8, p4

    if-nez p3, :cond_4

    .line 5983
    sget-object p3, Ll/۬۬ۧ;->sQuinticInterpolator:Landroid/view/animation/Interpolator;

    .line 5988
    :cond_4
    iget-object p4, p0, Ll/ۙ۬ۧ;->᩹:Landroid/view/animation/Interpolator;

    if-eq p4, p3, :cond_5

    .line 5989
    iput-object p3, p0, Ll/ۙ۬ۧ;->᩹:Landroid/view/animation/Interpolator;

    .line 5990
    new-instance p4, Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p4, v0, p3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p4, p0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    .line 5994
    :cond_5
    iput v1, p0, Ll/ۙ۬ۧ;->ۙ:I

    iput v1, p0, Ll/ۙ۬ۧ;->᩶:I

    const/4 p3, 0x2

    .line 5997
    invoke-virtual {v2, p3}, Ll/۬۬ۧ;->setScrollState(I)V

    .line 5998
    iget-object v3, p0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p1

    move v7, p2

    invoke-virtual/range {v3 .. v8}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 6000
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x17

    if-ge p1, p2, :cond_6

    .line 6004
    iget-object p1, p0, Ll/ۙ۬ۧ;->ۗ:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 6007
    :cond_6
    invoke-virtual {p0}, Ll/ۙ۬ۧ;->֫()V

    return-void
.end method
