.class public final Ll/ۛۜ֫;
.super Ljava/lang/Object;
.source "P1GH"


# instance fields
.field public final ֫:Ll/ۤ᩻֫;

.field public final ۧ:Ll/ۡ᩻֫;

.field public ܽ:I

.field public ܿ:Z

.field public final ᩳ:Ll/ۨۜ֫;


# direct methods
.method public constructor <init>(Ll/ۤ᩻֫;Ll/ۨۜ֫;Ljava/lang/ClassLoader;Ll/᩶᩻֫;Ll/۬ۜ֫;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Ll/ۛۜ֫;->ܿ:Z

    const/4 v0, -0x1

    .line 52
    iput v0, p0, Ll/ۛۜ֫;->ܽ:I

    .line 83
    iput-object p1, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    .line 84
    iput-object p2, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    .line 81
    iget-object p1, p5, Ll/۬ۜ֫;->᩹:Ljava/lang/String;

    invoke-virtual {p4, p1}, Ll/᩶᩻֫;->֫(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object p1

    .line 82
    iget-object p2, p5, Ll/۬ۜ֫;->᩸:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 83
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 85
    :cond_0
    invoke-virtual {p1, p2}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V

    .line 86
    iget-object p2, p5, Ll/۬ۜ֫;->۟:Ljava/lang/String;

    iput-object p2, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    .line 87
    iget-boolean p2, p5, Ll/۬ۜ֫;->۬:Z

    iput-boolean p2, p1, Ll/ۡ᩻֫;->mFromLayout:Z

    const/4 p2, 0x1

    .line 88
    iput-boolean p2, p1, Ll/ۡ᩻֫;->mRestored:Z

    .line 89
    iget p2, p5, Ll/۬ۜ֫;->ۗ:I

    iput p2, p1, Ll/ۡ᩻֫;->mFragmentId:I

    .line 90
    iget p2, p5, Ll/۬ۜ֫;->᩶:I

    iput p2, p1, Ll/ۡ᩻֫;->mContainerId:I

    .line 91
    iget-object p2, p5, Ll/۬ۜ֫;->ܰ:Ljava/lang/String;

    iput-object p2, p1, Ll/ۡ᩻֫;->mTag:Ljava/lang/String;

    .line 92
    iget-boolean p2, p5, Ll/۬ۜ֫;->ۨ:Z

    iput-boolean p2, p1, Ll/ۡ᩻֫;->mRetainInstance:Z

    .line 93
    iget-boolean p2, p5, Ll/۬ۜ֫;->ۛ:Z

    iput-boolean p2, p1, Ll/ۡ᩻֫;->mRemoving:Z

    .line 94
    iget-boolean p2, p5, Ll/۬ۜ֫;->ۙ:Z

    iput-boolean p2, p1, Ll/ۡ᩻֫;->mDetached:Z

    .line 95
    iget-boolean p2, p5, Ll/۬ۜ֫;->۫:Z

    iput-boolean p2, p1, Ll/ۡ᩻֫;->mHidden:Z

    .line 96
    invoke-static {}, Ll/ܰۢ֫;->values()[Ll/ܰۢ֫;

    move-result-object p2

    iget p3, p5, Ll/۬ۜ֫;->ۤ:I

    aget-object p2, p2, p3

    iput-object p2, p1, Ll/ۡ᩻֫;->mMaxState:Ll/ܰۢ֫;

    .line 97
    iget-object p2, p5, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 98
    iput-object p2, p1, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    goto :goto_0

    .line 103
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    .line 85
    :goto_0
    iput-object p1, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    const/4 p2, 0x2

    .line 86
    invoke-static {p2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 87
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public constructor <init>(Ll/ۤ᩻֫;Ll/ۨۜ֫;Ll/ۡ᩻֫;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Ll/ۛۜ֫;->ܿ:Z

    const/4 v0, -0x1

    .line 52
    iput v0, p0, Ll/ۛۜ֫;->ܽ:I

    .line 63
    iput-object p1, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    .line 64
    iput-object p2, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    .line 65
    iput-object p3, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    return-void
.end method

.method public constructor <init>(Ll/ۤ᩻֫;Ll/ۨۜ֫;Ll/ۡ᩻֫;Ll/۬ۜ֫;)V
    .locals 2

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Ll/ۛۜ֫;->ܿ:Z

    const/4 v1, -0x1

    .line 52
    iput v1, p0, Ll/ۛۜ֫;->ܽ:I

    .line 104
    iput-object p1, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    .line 105
    iput-object p2, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    .line 106
    iput-object p3, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    const/4 p1, 0x0

    .line 107
    iput-object p1, p3, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    .line 108
    iput-object p1, p3, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 109
    iput v0, p3, Ll/ۡ᩻֫;->mBackStackNesting:I

    .line 110
    iput-boolean v0, p3, Ll/ۡ᩻֫;->mInLayout:Z

    .line 111
    iput-boolean v0, p3, Ll/ۡ᩻֫;->mAdded:Z

    .line 112
    iget-object p2, p3, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    if-eqz p2, :cond_0

    iget-object p2, p2, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 113
    iput-object p1, p3, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    .line 114
    iget-object p1, p4, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 115
    iput-object p1, p3, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    return-void

    .line 120
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 839
    iget-object v0, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    iget-object v1, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    invoke-virtual {v0, v1}, Ll/ۨۜ֫;->ۧ(Ll/ۡ᩻֫;)I

    move-result v0

    .line 840
    iget-object v2, v1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    iget-object v1, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 136
    iput p1, p0, Ll/ۛۜ֫;->ܽ:I

    return-void
.end method

.method public final ֫(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 404
    iget-object v0, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    iget-object v1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    if-nez v1, :cond_0

    goto :goto_1

    .line 407
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 408
    iget-object p1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, v0, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    .line 410
    iget-object p1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:view_registry_state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v0, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 412
    iget-object p1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 414
    iget-object p1, v0, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 415
    iget-object p1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, v0, Ll/ۡ᩻֫;->mTargetRequestCode:I

    .line 418
    :cond_1
    iget-object p1, v0, Ll/ۡ᩻֫;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    .line 419
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    const/4 p1, 0x0

    .line 420
    iput-object p1, v0, Ll/ۡ᩻֫;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    goto :goto_0

    .line 422
    :cond_2
    iget-object p1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v2, "android:user_visible_hint"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    .line 425
    :goto_0
    iget-boolean p1, v0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    if-nez p1, :cond_3

    .line 426
    iput-boolean v1, v0, Ll/ۡ᩻֫;->mDeferStart:Z

    :cond_3
    :goto_1
    return-void
.end method

.method public final ۖ()V
    .locals 3

    .line 715
    iget-object v0, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    .line 718
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 719
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 723
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 724
    iget-object v2, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 725
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 726
    iput-object v1, v0, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    .line 728
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 729
    iget-object v2, v0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {v2, v1}, Ll/ۖ᩷֫;->ۧ(Landroid/os/Bundle;)V

    .line 730
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 731
    iput-object v1, v0, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    :cond_3
    :goto_0
    return-void
.end method

.method public final ۜ()V
    .locals 4

    .line 384
    iget-object v0, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    iget-boolean v1, v0, Ll/ۡ᩻֫;->mFromLayout:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Ll/ۡ᩻֫;->mInLayout:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Ll/ۡ᩻֫;->mPerformedCreateView:Z

    if-nez v1, :cond_2

    const/4 v1, 0x3

    .line 385
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 386
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 388
    :cond_0
    iget-object v1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ll/ۡ᩻֫;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Ll/ۡ᩻֫;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 390
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    .line 391
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 392
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    const v3, 0x7f0a0221

    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 393
    iget-boolean v1, v0, Ll/ۡ᩻֫;->mHidden:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 394
    :cond_1
    invoke-virtual {v0}, Ll/ۡ᩻֫;->performViewCreated()V

    .line 395
    iget-object v1, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    invoke-virtual {v1, v2}, Ll/ۤ᩻֫;->ۖ(Z)V

    const/4 v1, 0x2

    .line 397
    iput v1, v0, Ll/ۡ᩻֫;->mState:I

    :cond_2
    return-void
.end method

.method public final ۡ()V
    .locals 4

    const/4 v0, 0x3

    .line 593
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    iget-object v1, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    if-eqz v0, :cond_0

    .line 594
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 596
    :cond_0
    invoke-virtual {v1}, Ll/ۡ᩻֫;->getFocusedView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 614
    iget-object v2, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-ne v0, v2, :cond_1

    goto :goto_1

    .line 617
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_3

    .line 619
    iget-object v3, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-ne v2, v3, :cond_2

    .line 598
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const/4 v2, 0x2

    .line 599
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 600
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 601
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 602
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_2

    .line 622
    :cond_2
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_0

    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 605
    invoke-virtual {v1, v0}, Ll/ۡ᩻֫;->setFocusedView(Landroid/view/View;)V

    .line 606
    invoke-virtual {v1}, Ll/ۡ᩻֫;->performResume()V

    .line 607
    iget-object v2, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/ۤ᩻֫;->᩷(Z)V

    .line 608
    iput-object v0, v1, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    .line 609
    iput-object v0, v1, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    .line 610
    iput-object v0, v1, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    return-void
.end method

.method public final ۢ()V
    .locals 9

    .line 235
    iget-boolean v0, p0, Ll/ۛۜ֫;->ܿ:Z

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    if-eqz v0, :cond_1

    .line 236
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    const/4 v3, 0x0

    .line 243
    :try_start_0
    iput-boolean v0, p0, Ll/ۛۜ֫;->ܿ:Z

    const/4 v4, 0x0

    .line 247
    :goto_0
    invoke-virtual {p0}, Ll/ۛۜ֫;->ܽ()I

    move-result v5

    iget v6, v2, Ll/ۡ᩻֫;->mState:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v7, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    const/4 v8, 0x3

    if-eq v5, v6, :cond_f

    .line 249
    iget-object v4, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    if-le v5, v6, :cond_7

    add-int/lit8 v6, v6, 0x1

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_2

    .line 285
    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Ll/ۛۜ֫;->ۡ()V

    goto/16 :goto_2

    :pswitch_1
    const/4 v4, 0x6

    .line 282
    iput v4, v2, Ll/ۡ᩻֫;->mState:I

    goto/16 :goto_2

    .line 585
    :pswitch_2
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 586
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 588
    :cond_2
    invoke-virtual {v2}, Ll/ۡ᩻֫;->performStart()V

    .line 589
    invoke-virtual {v4, v3}, Ll/ۤ᩻֫;->ۡ(Z)V

    goto/16 :goto_2

    .line 267
    :pswitch_3
    iget-object v4, v2, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v4, :cond_3

    iget-object v4, v2, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v4, :cond_3

    .line 270
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v5

    .line 269
    invoke-static {v4, v5}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/ۚۜ֫;)Ll/ۗ᩷֫;

    move-result-object v4

    .line 271
    iget-object v5, v2, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    .line 273
    invoke-static {v5}, Ll/᩶᩷֫;->֫(I)Ll/᩶᩷֫;

    move-result-object v5

    .line 274
    invoke-virtual {v4, v5, p0}, Ll/ۗ᩷֫;->֫(Ll/᩶᩷֫;Ll/ۛۜ֫;)V

    :cond_3
    const/4 v4, 0x4

    .line 276
    iput v4, v2, Ll/ۡ᩻֫;->mState:I

    goto/16 :goto_2

    .line 576
    :pswitch_4
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 577
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 579
    :cond_4
    iget-object v5, v2, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v2, v5}, Ll/ۡ᩻֫;->performActivityCreated(Landroid/os/Bundle;)V

    .line 580
    invoke-virtual {v4, v3}, Ll/ۤ᩻֫;->֫(Z)V

    goto/16 :goto_2

    .line 260
    :pswitch_5
    invoke-virtual {p0}, Ll/ۛۜ֫;->ۜ()V

    .line 261
    invoke-virtual {p0}, Ll/ۛۜ֫;->ᩳ()V

    goto/16 :goto_2

    .line 469
    :pswitch_6
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 470
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 472
    :cond_5
    iget-boolean v5, v2, Ll/ۡ᩻֫;->mIsCreated:Z

    if-nez v5, :cond_6

    .line 473
    invoke-virtual {v4, v3}, Ll/ۤ᩻֫;->ۜ(Z)V

    .line 475
    iget-object v5, v2, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v2, v5}, Ll/ۡ᩻֫;->performCreate(Landroid/os/Bundle;)V

    .line 476
    invoke-virtual {v4, v3}, Ll/ۤ᩻֫;->ܽ(Z)V

    goto/16 :goto_2

    .line 479
    :cond_6
    iget-object v4, v2, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v2, v4}, Ll/ۡ᩻֫;->restoreChildFragmentState(Landroid/os/Bundle;)V

    .line 480
    iput v0, v2, Ll/ۡ᩻֫;->mState:I

    goto/16 :goto_2

    .line 254
    :pswitch_7
    invoke-virtual {p0}, Ll/ۛۜ֫;->ۧ()V

    goto/16 :goto_2

    :cond_7
    add-int/lit8 v6, v6, -0x1

    packed-switch v6, :pswitch_data_1

    goto/16 :goto_2

    .line 628
    :pswitch_8
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 629
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 631
    :cond_8
    invoke-virtual {v2}, Ll/ۡ᩻֫;->performPause()V

    .line 632
    invoke-virtual {v4, v3}, Ll/ۤ᩻֫;->ܳ(Z)V

    goto/16 :goto_2

    :pswitch_9
    const/4 v4, 0x5

    .line 296
    iput v4, v2, Ll/ۡ᩻֫;->mState:I

    goto :goto_2

    .line 636
    :pswitch_a
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 637
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 639
    :cond_9
    invoke-virtual {v2}, Ll/ۡ᩻֫;->performStop()V

    .line 640
    invoke-virtual {v4, v3}, Ll/ۤ᩻֫;->ܺ(Z)V

    goto :goto_2

    .line 302
    :pswitch_b
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 303
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 305
    :cond_a
    iget-boolean v4, v2, Ll/ۡ᩻֫;->mBeingSaved:Z

    if-eqz v4, :cond_b

    .line 306
    invoke-virtual {p0}, Ll/ۛۜ֫;->ܺ()V

    goto :goto_1

    .line 307
    :cond_b
    iget-object v4, v2, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v4, :cond_c

    .line 310
    iget-object v4, v2, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    if-nez v4, :cond_c

    .line 311
    invoke-virtual {p0}, Ll/ۛۜ֫;->ۖ()V

    .line 314
    :cond_c
    :goto_1
    iget-object v4, v2, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v4, :cond_d

    iget-object v4, v2, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v4, :cond_d

    .line 317
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v5

    .line 316
    invoke-static {v4, v5}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/ۚۜ֫;)Ll/ۗ᩷֫;

    move-result-object v4

    .line 318
    invoke-virtual {v4, p0}, Ll/ۗ᩷֫;->ۧ(Ll/ۛۜ֫;)V

    .line 320
    :cond_d
    iput v8, v2, Ll/ۡ᩻֫;->mState:I

    goto :goto_2

    .line 323
    :pswitch_c
    iput-boolean v3, v2, Ll/ۡ᩻֫;->mInLayout:Z

    .line 324
    iput v1, v2, Ll/ۡ᩻֫;->mState:I

    goto :goto_2

    .line 327
    :pswitch_d
    invoke-virtual {p0}, Ll/ۛۜ֫;->ܳ()V

    .line 328
    iput v0, v2, Ll/ۡ᩻֫;->mState:I

    goto :goto_2

    .line 331
    :pswitch_e
    iget-boolean v4, v2, Ll/ۡ᩻֫;->mBeingSaved:Z

    if-eqz v4, :cond_e

    iget-object v4, v2, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    .line 332
    invoke-virtual {v7, v4}, Ll/ۨۜ֫;->ܳ(Ljava/lang/String;)Ll/۬ۜ֫;

    move-result-object v4

    if-nez v4, :cond_e

    .line 333
    invoke-virtual {p0}, Ll/ۛۜ֫;->ܺ()V

    .line 335
    :cond_e
    invoke-virtual {p0}, Ll/ۛۜ֫;->ܿ()V

    goto :goto_2

    .line 338
    :pswitch_f
    invoke-virtual {p0}, Ll/ۛۜ֫;->᩻()V

    :goto_2
    const/4 v4, 0x1

    goto/16 :goto_0

    :cond_f
    if-nez v4, :cond_12

    const/4 v0, -0x1

    if-ne v6, v0, :cond_12

    .line 347
    iget-boolean v0, v2, Ll/ۡ᩻֫;->mRemoving:Z

    if-eqz v0, :cond_12

    invoke-virtual {v2}, Ll/ۡ᩻֫;->isInBackStack()Z

    move-result v0

    if-nez v0, :cond_12

    iget-boolean v0, v2, Ll/ۡ᩻֫;->mBeingSaved:Z

    if-nez v0, :cond_12

    .line 348
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 349
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 351
    :cond_10
    invoke-virtual {v7}, Ll/ۨۜ֫;->ܳ()Ll/᩹ۜ֫;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/᩹ۜ֫;->ۧ(Ll/ۡ᩻֫;)V

    .line 352
    invoke-virtual {v7, p0}, Ll/ۨۜ֫;->ۧ(Ll/ۛۜ֫;)V

    .line 353
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 354
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 356
    :cond_11
    invoke-virtual {v2}, Ll/ۡ᩻֫;->initState()V

    .line 359
    :cond_12
    iget-boolean v0, v2, Ll/ۡ᩻֫;->mHiddenChanged:Z

    if-eqz v0, :cond_16

    .line 360
    iget-object v0, v2, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_14

    iget-object v0, v2, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_14

    .line 364
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v1

    .line 363
    invoke-static {v0, v1}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/ۚۜ֫;)Ll/ۗ᩷֫;

    move-result-object v0

    .line 365
    iget-boolean v1, v2, Ll/ۡ᩻֫;->mHidden:Z

    if-eqz v1, :cond_13

    .line 366
    invoke-virtual {v0, p0}, Ll/ۗ᩷֫;->֫(Ll/ۛۜ֫;)V

    goto :goto_3

    .line 368
    :cond_13
    invoke-virtual {v0, p0}, Ll/ۗ᩷֫;->ܽ(Ll/ۛۜ֫;)V

    .line 371
    :cond_14
    :goto_3
    iget-object v0, v2, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_15

    .line 372
    invoke-virtual {v0, v2}, Ll/ۚۜ֫;->᩷(Ll/ۡ᩻֫;)V

    .line 374
    :cond_15
    iput-boolean v3, v2, Ll/ۡ᩻֫;->mHiddenChanged:Z

    .line 375
    iget-boolean v0, v2, Ll/ۡ᩻֫;->mHidden:Z

    invoke-virtual {v2, v0}, Ll/ۡ᩻֫;->onHiddenChanged(Z)V

    .line 376
    iget-object v0, v2, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۜ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 379
    :cond_16
    iput-boolean v3, p0, Ll/ۛۜ֫;->ܿ:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v3, p0, Ll/ۛۜ֫;->ܿ:Z

    .line 380
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final ۧ()V
    .locals 7

    const/4 v0, 0x3

    .line 431
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    iget-object v1, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    if-eqz v0, :cond_0

    .line 432
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 437
    :cond_0
    iget-object v0, v1, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    const/4 v2, 0x0

    const-string v3, " that does not belong to this FragmentManager!"

    const-string v4, " declared target fragment "

    const-string v5, "Fragment "

    iget-object v6, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    if-eqz v0, :cond_2

    .line 438
    iget-object v0, v0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ll/ۨۜ֫;->ܿ(Ljava/lang/String;)Ll/ۛۜ֫;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 445
    iget-object v3, v1, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    iget-object v3, v3, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    iput-object v3, v1, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 446
    iput-object v2, v1, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    move-object v2, v0

    goto :goto_0

    .line 441
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 447
    :cond_2
    iget-object v0, v1, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 448
    invoke-virtual {v6, v0}, Ll/ۨۜ֫;->ܿ(Ljava/lang/String;)Ll/ۛۜ֫;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_0

    .line 451
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 0
    invoke-static {v2, v1, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 451
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 459
    invoke-virtual {v2}, Ll/ۛۜ֫;->ۢ()V

    .line 461
    :cond_5
    iget-object v0, v1, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۠()Ll/ۙ᩻֫;

    move-result-object v0

    iput-object v0, v1, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    .line 462
    iget-object v0, v1, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->᩹()Ll/ۡ᩻֫;

    move-result-object v0

    iput-object v0, v1, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    .line 463
    iget-object v0, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/ۤ᩻֫;->᩻(Z)V

    .line 464
    invoke-virtual {v1}, Ll/ۡ᩻֫;->performAttach()V

    .line 465
    invoke-virtual {v0, v2}, Ll/ۤ᩻֫;->ۧ(Z)V

    return-void
.end method

.method public final ܳ()V
    .locals 4

    const/4 v0, 0x3

    .line 736
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    iget-object v1, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    if-eqz v0, :cond_0

    .line 737
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 742
    :cond_0
    iget-object v0, v1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v2, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v2, :cond_1

    .line 743
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 745
    :cond_1
    invoke-virtual {v1}, Ll/ۡ᩻֫;->performDestroyView()V

    .line 746
    iget-object v0, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/ۤ᩻֫;->ۘ(Z)V

    const/4 v0, 0x0

    .line 747
    iput-object v0, v1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    .line 748
    iput-object v0, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 751
    iput-object v0, v1, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    .line 752
    iget-object v3, v1, Ll/ۡ᩻֫;->mViewLifecycleOwnerLiveData:Ll/ۚۡ֫;

    invoke-virtual {v3, v0}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 753
    iput-boolean v2, v1, Ll/ۡ᩻֫;->mInLayout:Z

    return-void
.end method

.method public final ܺ()V
    .locals 5

    .line 644
    new-instance v0, Ll/۬ۜ֫;

    iget-object v1, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    invoke-direct {v0, v1}, Ll/۬ۜ֫;-><init>(Ll/ۡ᩻֫;)V

    .line 646
    iget v2, v1, Ll/ۡ᩻֫;->mState:I

    const/4 v3, -0x1

    if-le v2, v3, :cond_9

    iget-object v2, v0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    if-nez v2, :cond_9

    .line 679
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 681
    invoke-virtual {v1, v2}, Ll/ۡ᩻֫;->performSaveInstanceState(Landroid/os/Bundle;)V

    .line 682
    iget-object v3, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ll/ۤ᩻֫;->ۢ(Z)V

    .line 683
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    .line 687
    :cond_0
    iget-object v3, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v3, :cond_1

    .line 688
    invoke-virtual {p0}, Ll/ۛۜ֫;->ۖ()V

    .line 690
    :cond_1
    iget-object v3, v1, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    if-eqz v3, :cond_3

    if-nez v2, :cond_2

    .line 692
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_2
    const-string v3, "android:view_state"

    .line 694
    iget-object v4, v1, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 697
    :cond_3
    iget-object v3, v1, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    if-eqz v3, :cond_5

    if-nez v2, :cond_4

    .line 699
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_4
    const-string v3, "android:view_registry_state"

    .line 701
    iget-object v4, v1, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 703
    :cond_5
    iget-boolean v3, v1, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    if-nez v3, :cond_7

    if-nez v2, :cond_6

    .line 705
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_6
    const-string v3, "android:user_visible_hint"

    .line 708
    iget-boolean v4, v1, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 647
    :cond_7
    iput-object v2, v0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    .line 649
    iget-object v3, v1, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    if-eqz v3, :cond_a

    if-nez v2, :cond_8

    .line 651
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    .line 653
    :cond_8
    iget-object v2, v0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    const-string v3, "android:target_state"

    iget-object v4, v1, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    iget v2, v1, Ll/ۡ᩻֫;->mTargetRequestCode:I

    if-eqz v2, :cond_a

    .line 657
    iget-object v3, v0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    const-string v4, "android:target_req_state"

    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 664
    :cond_9
    iget-object v2, v1, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    iput-object v2, v0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    .line 666
    :cond_a
    :goto_0
    iget-object v2, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    iget-object v1, v1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Ll/ۨۜ֫;->֫(Ljava/lang/String;Ll/۬ۜ֫;)Ll/۬ۜ֫;

    return-void
.end method

.method public final ܽ()I
    .locals 10

    .line 147
    iget-object v0, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    iget-object v1, v0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-nez v1, :cond_0

    .line 148
    iget v0, v0, Ll/ۡ᩻֫;->mState:I

    return v0

    .line 151
    :cond_0
    iget v1, p0, Ll/ۛۜ֫;->ܽ:I

    .line 154
    sget-object v2, Ll/ۤۜ֫;->֫:[I

    iget-object v3, v0, Ll/ۡ᩻֫;->mMaxState:Ll/ܰۢ֫;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x5

    const/4 v4, -0x1

    const/4 v5, 0x3

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v2, v8, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v6, :cond_1

    .line 168
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 165
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    .line 162
    :cond_2
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    .line 159
    :cond_3
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 172
    :cond_4
    :goto_0
    iget-boolean v2, v0, Ll/ۡ᩻֫;->mFromLayout:Z

    if-eqz v2, :cond_7

    .line 173
    iget-boolean v2, v0, Ll/ۡ᩻֫;->mInLayout:Z

    if-eqz v2, :cond_5

    .line 176
    iget v1, p0, Ll/ۛۜ֫;->ܽ:I

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 179
    iget-object v2, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_7

    .line 180
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    .line 183
    :cond_5
    iget v2, p0, Ll/ۛۜ֫;->ܽ:I

    if-ge v2, v6, :cond_6

    .line 188
    iget v2, v0, Ll/ۡ᩻֫;->mState:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    .line 193
    :cond_6
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 198
    :cond_7
    :goto_1
    iget-boolean v2, v0, Ll/ۡ᩻֫;->mAdded:Z

    if-nez v2, :cond_8

    .line 199
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 202
    :cond_8
    iget-object v2, v0, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_9

    .line 204
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v9

    .line 203
    invoke-static {v2, v9}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/ۚۜ֫;)Ll/ۗ᩷֫;

    move-result-object v2

    .line 205
    invoke-virtual {v2, p0}, Ll/ۗ᩷֫;->ᩳ(Ll/ۛۜ֫;)Ll/᩹᩷֫;

    move-result-object v2

    goto :goto_2

    :cond_9
    const/4 v2, 0x0

    .line 207
    :goto_2
    sget-object v9, Ll/᩹᩷֫;->᩹:Ll/᩹᩷֫;

    if-ne v2, v9, :cond_a

    const/4 v2, 0x6

    .line 209
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    .line 210
    :cond_a
    sget-object v9, Ll/᩹᩷֫;->ۙ:Ll/᩹᩷֫;

    if-ne v2, v9, :cond_b

    .line 212
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_3

    .line 213
    :cond_b
    iget-boolean v2, v0, Ll/ۡ᩻֫;->mRemoving:Z

    if-eqz v2, :cond_d

    .line 214
    invoke-virtual {v0}, Ll/ۡ᩻֫;->isInBackStack()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 216
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    .line 219
    :cond_c
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 224
    :cond_d
    :goto_3
    iget-boolean v2, v0, Ll/ۡ᩻֫;->mDeferStart:Z

    if-eqz v2, :cond_e

    iget v2, v0, Ll/ۡ᩻֫;->mState:I

    if-ge v2, v3, :cond_e

    .line 225
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 227
    :cond_e
    invoke-static {v7}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 228
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_f
    return v1
.end method

.method public final ܿ()V
    .locals 8

    const/4 v0, 0x3

    .line 757
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    iget-object v1, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    if-eqz v0, :cond_0

    .line 758
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 760
    :cond_0
    iget-boolean v0, v1, Ll/ۡ᩻֫;->mRemoving:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ll/ۡ᩻֫;->isInBackStack()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v4, 0x0

    .line 762
    iget-object v5, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    if-eqz v0, :cond_2

    iget-boolean v6, v1, Ll/ۡ᩻֫;->mBeingSaved:Z

    if-nez v6, :cond_2

    .line 763
    iget-object v6, v1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, Ll/ۨۜ֫;->֫(Ljava/lang/String;Ll/۬ۜ֫;)Ll/۬ۜ֫;

    :cond_2
    if-nez v0, :cond_5

    .line 766
    invoke-virtual {v5}, Ll/ۨۜ֫;->ܳ()Ll/᩹ۜ֫;

    move-result-object v6

    invoke-virtual {v6, v1}, Ll/᩹ۜ֫;->ܳ(Ll/ۡ᩻֫;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    .line 802
    :cond_3
    iget-object v0, v1, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 803
    invoke-virtual {v5, v0}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 804
    iget-boolean v3, v0, Ll/ۡ᩻֫;->mRetainInstance:Z

    if-eqz v3, :cond_4

    .line 808
    iput-object v0, v1, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    .line 811
    :cond_4
    iput v2, v1, Ll/ۡ᩻֫;->mState:I

    return-void

    .line 768
    :cond_5
    :goto_1
    iget-object v6, v1, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    .line 770
    instance-of v7, v6, Ll/۬ܺ֫;

    if-eqz v7, :cond_6

    .line 771
    invoke-virtual {v5}, Ll/ۨۜ֫;->ܳ()Ll/᩹ۜ֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩹ۜ֫;->ܿ()Z

    move-result v3

    goto :goto_2

    .line 772
    :cond_6
    invoke-virtual {v6}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 773
    invoke-virtual {v6}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v6

    check-cast v6, Landroid/app/Activity;

    .line 774
    invoke-virtual {v6}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v6

    xor-int/2addr v3, v6

    :cond_7
    :goto_2
    if-eqz v0, :cond_8

    .line 778
    iget-boolean v0, v1, Ll/ۡ᩻֫;->mBeingSaved:Z

    if-eqz v0, :cond_9

    :cond_8
    if-eqz v3, :cond_a

    .line 779
    :cond_9
    invoke-virtual {v5}, Ll/ۨۜ֫;->ܳ()Ll/᩹ۜ֫;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/᩹ۜ֫;->ۧ(Ll/ۡ᩻֫;)V

    .line 781
    :cond_a
    invoke-virtual {v1}, Ll/ۡ᩻֫;->performDestroy()V

    .line 782
    iget-object v0, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    invoke-virtual {v0, v2}, Ll/ۤ᩻֫;->ᩳ(Z)V

    .line 786
    invoke-virtual {v5}, Ll/ۨۜ֫;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜ֫;

    if-eqz v2, :cond_b

    .line 126
    iget-object v2, v2, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    .line 789
    iget-object v3, v1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    iget-object v6, v2, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 790
    iput-object v1, v2, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    .line 791
    iput-object v4, v2, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    goto :goto_3

    .line 795
    :cond_c
    iget-object v0, v1, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_d

    .line 798
    invoke-virtual {v5, v0}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v0

    iput-object v0, v1, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    .line 800
    :cond_d
    invoke-virtual {v5, p0}, Ll/ۨۜ֫;->ۧ(Ll/ۛۜ֫;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 6

    .line 485
    iget-object v0, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    iget-boolean v1, v0, Ll/ۡ᩻֫;->mFromLayout:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x3

    .line 490
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 491
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 493
    :cond_1
    iget-object v1, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ll/ۡ᩻֫;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 496
    iget-object v2, v0, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_2

    goto :goto_1

    .line 498
    :cond_2
    iget v2, v0, Ll/ۡ᩻֫;->mContainerId:I

    if-eqz v2, :cond_6

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    .line 503
    iget-object v2, v0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v2}, Ll/ۚۜ֫;->֡()Ll/ܶ᩻֫;

    move-result-object v2

    .line 504
    iget v3, v0, Ll/ۡ᩻֫;->mContainerId:I

    invoke-virtual {v2, v3}, Ll/ܶ᩻֫;->֫(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    if-nez v2, :cond_4

    .line 506
    iget-boolean v3, v0, Ll/ۡ᩻֫;->mRestored:Z

    if-eqz v3, :cond_3

    goto :goto_1

    .line 509
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, v0, Ll/ۡ᩻֫;->mContainerId:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "unknown"

    .line 513
    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No view found for id 0x"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v0, Ll/ۡ᩻֫;->mContainerId:I

    .line 514
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") for fragment "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 518
    :cond_4
    instance-of v3, v2, Ll/᩸᩻֫;

    if-nez v3, :cond_7

    .line 519
    invoke-static {v0, v2}, Ll/᩺᩷֫;->ۧ(Ll/ۡ᩻֫;Landroid/view/ViewGroup;)V

    goto :goto_1

    .line 500
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot create fragment "

    const-string v3, " for a container view with no id"

    .line 0
    invoke-static {v2, v0, v3}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 500
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    const/4 v2, 0x0

    .line 523
    :cond_7
    :goto_1
    iput-object v2, v0, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    .line 524
    iget-object v3, v0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Ll/ۡ᩻֫;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 525
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    const/4 v3, 0x2

    if-eqz v1, :cond_c

    const/4 v4, 0x0

    .line 526
    invoke-virtual {v1, v4}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 527
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    const v5, 0x7f0a0221

    invoke-virtual {v1, v5, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v2, :cond_8

    .line 529
    invoke-virtual {p0}, Ll/ۛۜ֫;->֫()V

    .line 531
    :cond_8
    iget-boolean v1, v0, Ll/ۡ᩻֫;->mHidden:Z

    if-eqz v1, :cond_9

    .line 532
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 535
    :cond_9
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    sget v2, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 536
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-static {v1}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    goto :goto_2

    .line 538
    :cond_a
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 539
    new-instance v2, Ll/۫ۜ֫;

    invoke-direct {v2, v1}, Ll/۫ۜ֫;-><init>(Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 552
    :goto_2
    invoke-virtual {v0}, Ll/ۡ᩻֫;->performViewCreated()V

    .line 553
    iget-object v1, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    invoke-virtual {v1, v4}, Ll/ۤ᩻֫;->ۖ(Z)V

    .line 555
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    .line 556
    iget-object v2, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    .line 557
    invoke-virtual {v0, v2}, Ll/ۡ᩻֫;->setPostOnViewCreatedAlpha(F)V

    .line 558
    iget-object v2, v0, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_c

    if-nez v1, :cond_c

    .line 560
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 562
    invoke-virtual {v0, v1}, Ll/ۡ᩻֫;->setFocusedView(Landroid/view/View;)V

    .line 563
    invoke-static {v3}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 564
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 569
    :cond_b
    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 572
    :cond_c
    iput v3, v0, Ll/ۡ᩻֫;->mState:I

    return-void
.end method

.method public final ᩷()Ll/ۡ᩻֫;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    return-object v0
.end method

.method public final ᩻()V
    .locals 4

    const/4 v0, 0x3

    .line 816
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    iget-object v2, p0, Ll/ۛۜ֫;->ۧ:Ll/ۡ᩻֫;

    if-eqz v1, :cond_0

    .line 817
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 819
    :cond_0
    invoke-virtual {v2}, Ll/ۡ᩻֫;->performDetach()V

    .line 820
    iget-object v1, p0, Ll/ۛۜ֫;->֫:Ll/ۤ᩻֫;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ll/ۤ᩻֫;->ܿ(Z)V

    const/4 v1, -0x1

    .line 822
    iput v1, v2, Ll/ۡ᩻֫;->mState:I

    const/4 v1, 0x0

    .line 823
    iput-object v1, v2, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    .line 824
    iput-object v1, v2, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    .line 825
    iput-object v1, v2, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 826
    iget-boolean v1, v2, Ll/ۡ᩻֫;->mRemoving:Z

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Ll/ۡ᩻֫;->isInBackStack()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 827
    :cond_1
    iget-object v1, p0, Ll/ۛۜ֫;->ᩳ:Ll/ۨۜ֫;

    invoke-virtual {v1}, Ll/ۨۜ֫;->ܳ()Ll/᩹ۜ֫;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/᩹ۜ֫;->ܳ(Ll/ۡ᩻֫;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 828
    :goto_0
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 829
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 831
    :cond_2
    invoke-virtual {v2}, Ll/ۡ᩻֫;->initState()V

    :cond_3
    return-void
.end method
