.class public Ll/ۡ᩻֫;
.super Ljava/lang/Object;
.source "J4LB"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Ll/᩻ۡ֫;
.implements Ll/۬ܺ֫;
.implements Ll/ۙۢ֫;
.implements Ll/᩹۫ۧ;


# static fields
.field public static final ACTIVITY_CREATED:I = 0x4

.field public static final ATTACHED:I = 0x0

.field public static final AWAITING_ENTER_EFFECTS:I = 0x6

.field public static final AWAITING_EXIT_EFFECTS:I = 0x3

.field public static final CREATED:I = 0x1

.field public static final INITIALIZING:I = -0x1

.field public static final RESUMED:I = 0x7

.field public static final STARTED:I = 0x5

.field public static final USE_DEFAULT_TRANSITION:Ljava/lang/Object;

.field public static final VIEW_CREATED:I = 0x2


# instance fields
.field public mAdded:Z

.field public mAnimationInfo:Ll/ܳ᩻֫;

.field public mArguments:Landroid/os/Bundle;

.field public mBackStackNesting:I

.field public mBeingSaved:Z

.field public mCalled:Z

.field public mChildFragmentManager:Ll/ۚۜ֫;

.field public mContainer:Landroid/view/ViewGroup;

.field public mContainerId:I

.field public mContentLayoutId:I

.field public mDefaultFactory:Ll/ܶܺ֫;

.field public mDeferStart:Z

.field public mDetached:Z

.field public mFragmentId:I

.field public mFragmentManager:Ll/ۚۜ֫;

.field public mFromLayout:Z

.field public mHasMenu:Z

.field public mHidden:Z

.field public mHiddenChanged:Z

.field public mHost:Ll/ۙ᩻֫;

.field public mInLayout:Z

.field public mIsCreated:Z

.field public mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

.field public mLayoutInflater:Landroid/view/LayoutInflater;

.field public mLifecycleRegistry:Ll/᩷ۡ֫;

.field public mMaxState:Ll/ܰۢ֫;

.field public mMenuVisible:Z

.field public final mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final mOnPreAttachedListeners:Ljava/util/ArrayList;

.field public mParentFragment:Ll/ۡ᩻֫;

.field public mPerformedCreateView:Z

.field public mPostponedDurationRunnable:Ljava/lang/Runnable;

.field public mPreviousWho:Ljava/lang/String;

.field public mRemoving:Z

.field public mRestored:Z

.field public mRetainInstance:Z

.field public mRetainInstanceChangedWhileDetached:Z

.field public mSavedFragmentState:Landroid/os/Bundle;

.field public final mSavedStateAttachListener:Ll/ۜ᩻֫;

.field public mSavedStateRegistryController:Ll/᩸۫ۧ;

.field public mSavedUserVisibleHint:Ljava/lang/Boolean;

.field public mSavedViewRegistryState:Landroid/os/Bundle;

.field public mSavedViewState:Landroid/util/SparseArray;

.field public mState:I

.field public mTag:Ljava/lang/String;

.field public mTarget:Ll/ۡ᩻֫;

.field public mTargetRequestCode:I

.field public mTargetWho:Ljava/lang/String;

.field public mUserVisibleHint:Z

.field public mView:Landroid/view/View;

.field public mViewLifecycleOwner:Ll/ۖ᩷֫;

.field public mViewLifecycleOwnerLiveData:Ll/ۚۡ֫;

.field public mWho:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 131
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۡ᩻֫;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 583
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 143
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    .line 155
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    const/4 v0, 0x0

    .line 164
    iput-object v0, p0, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 170
    iput-object v0, p0, Ll/ۡ᩻֫;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    .line 205
    new-instance v0, Ll/֨ۜ֫;

    .line 30
    invoke-direct {v0}, Ll/ۚۜ֫;-><init>()V

    .line 205
    iput-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const/4 v0, 0x1

    .line 242
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    .line 258
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    .line 267
    new-instance v0, Ll/ۨܳ֫;

    invoke-direct {v0, p0}, Ll/ۨܳ֫;-><init>(Ll/ۡ᩻֫;)V

    iput-object v0, p0, Ll/ۡ᩻֫;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    .line 294
    sget-object v0, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    iput-object v0, p0, Ll/ۡ᩻֫;->mMaxState:Ll/ܰۢ֫;

    .line 301
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwnerLiveData:Ll/ۚۡ֫;

    .line 310
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۡ᩻֫;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 312
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡ᩻֫;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    .line 318
    new-instance v0, Ll/᩺ܳ֫;

    invoke-direct {v0, p0}, Ll/᩺ܳ֫;-><init>(Ll/ۡ᩻֫;)V

    iput-object v0, p0, Ll/ۡ᩻֫;->mSavedStateAttachListener:Ll/ۜ᩻֫;

    .line 584
    invoke-direct {p0}, Ll/ۡ᩻֫;->ᩳ()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 610
    invoke-direct {p0}, Ll/ۡ᩻֫;-><init>()V

    .line 611
    iput p1, p0, Ll/ۡ᩻֫;->mContentLayoutId:I

    return-void
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)Ll/ۡ᩻֫;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 635
    invoke-static {p0, p1, v0}, Ll/ۡ᩻֫;->֫(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ll/ۡ᩻֫;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ll/ۡ᩻֫;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    .line 662
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    .line 661
    invoke-static {p0, p1}, Ll/᩶᩻֫;->ܽ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    .line 663
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡ᩻֫;

    if-eqz p2, :cond_0

    .line 665
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 666
    invoke-virtual {p0, p2}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 681
    new-instance p2, Ll/᩻᩻֫;

    const-string v0, ": calling Fragment constructor caused an exception"

    .line 0
    invoke-static {v1, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 563
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 681
    throw p2

    :catch_1
    move-exception p0

    .line 678
    new-instance p2, Ll/᩻᩻֫;

    const-string v0, ": could not find Fragment constructor"

    .line 0
    invoke-static {v1, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 563
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 678
    throw p2

    :catch_2
    move-exception p0

    .line 674
    new-instance p2, Ll/᩻᩻֫;

    .line 0
    invoke-static {v1, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 563
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 674
    throw p2

    :catch_3
    move-exception p0

    .line 670
    new-instance p2, Ll/᩻᩻֫;

    .line 0
    invoke-static {v1, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 563
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 670
    throw p2
.end method

.method private ֫(Z)Ll/ۡ᩻֫;
    .locals 1

    if-eqz p1, :cond_0

    .line 918
    invoke-static {p0}, Ll/᩺᩷֫;->ᩳ(Ll/ۡ᩻֫;)V

    .line 921
    :cond_0
    iget-object p1, p0, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    if-eqz p1, :cond_1

    return-object p1

    .line 925
    :cond_1
    iget-object p1, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz p1, :cond_2

    iget-object v0, p0, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 927
    invoke-virtual {p1, v0}, Ll/ۚۜ֫;->֫(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(Ll/᩸ᩳ;Ll/ܽ᩵;Ll/᩷ᩳ;)Ll/ۢᩳ;
    .locals 8

    .line 3583
    iget v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 3589
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 3595
    new-instance v1, Ll/ܿ᩻֫;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p2

    move-object v5, v0

    move-object v6, p1

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Ll/ܿ᩻֫;-><init>(Ll/ۡ᩻֫;Ll/ܽ᩵;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩸ᩳ;Ll/᩷ᩳ;)V

    invoke-direct {p0, v1}, Ll/ۡ᩻֫;->֫(Ll/ۜ᩻֫;)V

    .line 3604
    new-instance p1, Ll/ۛܳ֫;

    invoke-direct {p1, v0}, Ll/ۛܳ֫;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-object p1

    .line 3584
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string p3, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."

    .line 0
    invoke-static {p2, p0, p3}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 3584
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/ۜ᩻֫;)V
    .locals 1

    .line 3633
    iget v0, p0, Ll/ۡ᩻֫;->mState:I

    if-ltz v0, :cond_0

    .line 3634
    invoke-virtual {p1}, Ll/ۜ᩻֫;->֫()V

    return-void

    .line 3637
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ۧ()Ll/ܳ᩻֫;
    .locals 3

    .line 3383
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    .line 3384
    new-instance v0, Ll/ܳ᩻֫;

    .line 3650
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 3672
    iput-object v1, v0, Ll/ܳ᩻֫;->ᩳ:Ljava/lang/Object;

    .line 3673
    sget-object v2, Ll/ۡ᩻֫;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    iput-object v2, v0, Ll/ܳ᩻֫;->ᩴ:Ljava/lang/Object;

    .line 3674
    iput-object v1, v0, Ll/ܳ᩻֫;->᩻:Ljava/lang/Object;

    .line 3675
    iput-object v2, v0, Ll/ܳ᩻֫;->ۘ:Ljava/lang/Object;

    .line 3676
    iput-object v1, v0, Ll/ܳ᩻֫;->᩵:Ljava/lang/Object;

    .line 3677
    iput-object v2, v0, Ll/ܳ᩻֫;->֡:Ljava/lang/Object;

    const/high16 v2, 0x3f800000    # 1.0f

    .line 3684
    iput v2, v0, Ll/ܳ᩻֫;->ۖ:F

    .line 3685
    iput-object v1, v0, Ll/ܳ᩻֫;->ۜ:Landroid/view/View;

    .line 3384
    iput-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    .line 3386
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    return-object v0
.end method

.method private ܽ()I
    .locals 2

    .line 426
    iget-object v0, p0, Ll/ۡ᩻֫;->mMaxState:Ll/ܰۢ֫;

    sget-object v1, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    if-nez v1, :cond_0

    goto :goto_0

    .line 429
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    invoke-direct {v1}, Ll/ۡ᩻֫;->ܽ()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    .line 427
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method private ܿ()V
    .locals 1

    const/4 v0, 0x3

    .line 3147
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3148
    invoke-virtual {p0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 3150
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 3151
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p0, v0}, Ll/ۡ᩻֫;->restoreViewState(Landroid/os/Bundle;)V

    :cond_1
    const/4 v0, 0x0

    .line 3153
    iput-object v0, p0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    return-void
.end method

.method private ᩳ()V
    .locals 2

    .line 615
    new-instance v0, Ll/᩷ۡ֫;

    invoke-direct {v0, p0}, Ll/᩷ۡ֫;-><init>(Ll/᩻ۡ֫;)V

    iput-object v0, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    .line 92
    new-instance v0, Ll/᩸۫ۧ;

    invoke-direct {v0, p0}, Ll/᩸۫ۧ;-><init>(Ll/᩹۫ۧ;)V

    .line 616
    iput-object v0, p0, Ll/ۡ᩻֫;->mSavedStateRegistryController:Ll/᩸۫ۧ;

    const/4 v0, 0x0

    .line 619
    iput-object v0, p0, Ll/ۡ᩻֫;->mDefaultFactory:Ll/ܶܺ֫;

    .line 620
    iget-object v0, p0, Ll/ۡ᩻֫;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۡ᩻֫;->mSavedStateAttachListener:Ll/ۜ᩻֫;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 621
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedStateAttachListener:Ll/ۜ᩻֫;

    invoke-direct {p0, v0}, Ll/ۡ᩻֫;->֫(Ll/ۜ᩻֫;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public callStartTransitionListener(Z)V
    .locals 2

    .line 2906
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2907
    iput-boolean v1, v0, Ll/ܳ᩻֫;->ܿ:Z

    .line 2909
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    iget-object v1, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v1, :cond_2

    .line 55
    invoke-virtual {v1}, Ll/ۚۜ֫;->᩶()Ll/۬᩷֫;

    move-result-object v1

    .line 56
    invoke-static {v0, v1}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/۬᩷֫;)Ll/ۗ᩷֫;

    move-result-object v0

    .line 2913
    invoke-virtual {v0}, Ll/ۗ᩷֫;->ᩳ()V

    if-eqz p1, :cond_1

    .line 2918
    iget-object p1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {p1}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object p1

    new-instance v1, Ll/۟ܳ֫;

    invoke-direct {v1, v0}, Ll/۟ܳ֫;-><init>(Ll/ۗ᩷֫;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 2926
    :cond_1
    invoke-virtual {v0}, Ll/ۗ᩷֫;->֫()V

    :cond_2
    return-void
.end method

.method public createFragmentContainer()Ll/ܶ᩻֫;
    .locals 1

    .line 3037
    new-instance v0, Ll/֫᩻֫;

    invoke-direct {v0, p0}, Ll/֫᩻֫;-><init>(Ll/ۡ᩻֫;)V

    return-object v0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .line 2943
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2944
    iget v0, p0, Ll/ۡ᩻֫;->mFragmentId:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    .line 2945
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2946
    iget v0, p0, Ll/ۡ᩻֫;->mContainerId:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    .line 2947
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۡ᩻֫;->mTag:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2948
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Ll/ۡ᩻֫;->mState:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    .line 2949
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    .line 2950
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Ll/ۡ᩻֫;->mBackStackNesting:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 2951
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mAdded:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    .line 2952
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mRemoving:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    .line 2953
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mFromLayout:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    .line 2954
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mInLayout:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2955
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    .line 2956
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mDetached:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    .line 2957
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    .line 2958
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2959
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mRetainInstance:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    .line 2960
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2961
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_0

    .line 2962
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2963
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2965
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_1

    .line 2966
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2967
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2969
    :cond_1
    iget-object v0, p0, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    if-eqz v0, :cond_2

    .line 2970
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2971
    iget-object v0, p0, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2973
    :cond_2
    iget-object v0, p0, Ll/ۡ᩻֫;->mArguments:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    .line 2974
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۡ᩻֫;->mArguments:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2976
    :cond_3
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    .line 2977
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2978
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2980
    :cond_4
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    .line 2981
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2982
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2984
    :cond_5
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    if-eqz v0, :cond_6

    .line 2985
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewRegistryState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2986
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    const/4 v0, 0x0

    .line 2988
    invoke-direct {p0, v0}, Ll/ۡ᩻֫;->֫(Z)Ll/ۡ᩻֫;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 2990
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mTarget="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    .line 2991
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2992
    iget v0, p0, Ll/ۡ᩻֫;->mTargetRequestCode:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 2994
    :cond_7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopDirection="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getPopDirection()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2995
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getEnterAnim()I

    move-result v0

    if-eqz v0, :cond_8

    .line 2996
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getEnterAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 2998
    :cond_8
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getExitAnim()I

    move-result v0

    if-eqz v0, :cond_9

    .line 2999
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getExitAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3001
    :cond_9
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getPopEnterAnim()I

    move-result v0

    if-eqz v0, :cond_a

    .line 3002
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3003
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getPopEnterAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3005
    :cond_a
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getPopExitAnim()I

    move-result v0

    if-eqz v0, :cond_b

    .line 3006
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getPopExitAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 3008
    :cond_b
    iget-object v0, p0, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_c

    .line 3009
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 3011
    :cond_c
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_d

    .line 3012
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 3014
    :cond_d
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getAnimatingAway()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 3015
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    .line 3016
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3017
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getAnimatingAway()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 3019
    :cond_e
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 3020
    invoke-static {p0}, Ll/ܿۖ֫;->֫(Ll/᩻ۡ֫;)Ll/ܿۖ֫;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܿۖ֫;->֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 3022
    :cond_f
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 3023
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Child "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 3024
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const-string v1, "  "

    .line 0
    invoke-static {p1, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3024
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۚۜ֫;->֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 715
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public findFragmentByWho(Ljava/lang/String;)Ll/ۡ᩻֫;
    .locals 1

    .line 3029
    iget-object v0, p0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 3032
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p1}, Ll/ۚۜ֫;->ܽ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object p1

    return-object p1
.end method

.method public generateActivityResultKey()Ljava/lang/String;
    .locals 2

    .line 3643
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fragment_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_rq#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ᩻֫;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getActivity()Ll/֡᩻֫;
    .locals 1

    .line 981
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll/ۙ᩻֫;->ܽ()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Ll/֡᩻֫;

    return-object v0
.end method

.method public getAllowEnterTransitionOverlap()Z
    .locals 1

    .line 2768
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ܳ᩻֫;->֫:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2769
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public getAllowReturnTransitionOverlap()Z
    .locals 1

    .line 2793
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ܳ᩻֫;->ۧ:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2794
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public getAnimatingAway()Landroid/view/View;
    .locals 2

    .line 3502
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3505
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public final getArguments()Landroid/os/Bundle;
    .locals 1

    .line 785
    iget-object v0, p0, Ll/ۡ᩻֫;->mArguments:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getChildFragmentManager()Ll/ۚۜ֫;
    .locals 3

    .line 1141
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    .line 1144
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    return-object v0

    .line 1142
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " has not been attached yet."

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1142
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 954
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultViewModelCreationExtras()Ll/۟ܺ֫;
    .locals 4

    .line 474
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 475
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    .line 476
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    .line 477
    check-cast v0, Landroid/app/Application;

    goto :goto_1

    .line 480
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const/4 v1, 0x3

    .line 482
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 484
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 488
    :cond_2
    new-instance v1, Ll/ܽۖ֫;

    invoke-direct {v1}, Ll/ܽۖ֫;-><init>()V

    if-eqz v0, :cond_3

    .line 490
    sget-object v2, Ll/۠ܺ֫;->ᩳ:Ll/ܰܺ֫;

    .line 61
    invoke-virtual {v1}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    :cond_3
    sget-object v0, Ll/᩷ܺ֫;->ۧ:Ll/ܳܺ֫;

    .line 61
    invoke-virtual {v1}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    sget-object v0, Ll/᩷ܺ֫;->ܽ:Ll/᩻ܺ֫;

    .line 61
    invoke-virtual {v1}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 495
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 61
    invoke-virtual {v1}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    sget-object v3, Ll/᩷ܺ֫;->֫:Ll/ܿܺ֫;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1
.end method

.method public getDefaultViewModelProviderFactory()Ll/ܶܺ֫;
    .locals 3

    .line 435
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_4

    .line 438
    iget-object v0, p0, Ll/ۡ᩻֫;->mDefaultFactory:Ll/ܶܺ֫;

    if-nez v0, :cond_3

    .line 440
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 441
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    .line 442
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    .line 443
    check-cast v0, Landroid/app/Application;

    goto :goto_1

    .line 446
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const/4 v1, 0x3

    .line 448
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 450
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 454
    :cond_2
    new-instance v1, Ll/ۖܺ֫;

    .line 457
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v0, p0, v2}, Ll/ۖܺ֫;-><init>(Landroid/app/Application;Ll/᩹۫ۧ;Landroid/os/Bundle;)V

    iput-object v1, p0, Ll/ۡ᩻֫;->mDefaultFactory:Ll/ܶܺ֫;

    .line 459
    :cond_3
    iget-object v0, p0, Ll/ۡ᩻֫;->mDefaultFactory:Ll/ܶܺ֫;

    return-object v0

    .line 436
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getEnterAnim()I
    .locals 1

    .line 3405
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3408
    :cond_0
    iget v0, v0, Ll/ܳ᩻֫;->ܽ:I

    return v0
.end method

.method public getEnterTransition()Ljava/lang/Object;
    .locals 1

    .line 2551
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2554
    :cond_0
    iget-object v0, v0, Ll/ܳ᩻֫;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method

.method public getEnterTransitionCallback()Ll/᩻ۙ;
    .locals 2

    .line 3488
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3491
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public getExitAnim()I
    .locals 1

    .line 3413
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3416
    :cond_0
    iget v0, v0, Ll/ܳ᩻֫;->ܳ:I

    return v0
.end method

.method public getExitTransition()Ljava/lang/Object;
    .locals 1

    .line 2630
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2633
    :cond_0
    iget-object v0, v0, Ll/ܳ᩻֫;->᩻:Ljava/lang/Object;

    return-object v0
.end method

.method public getExitTransitionCallback()Ll/᩻ۙ;
    .locals 2

    .line 3495
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3498
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public getFocusedView()Landroid/view/View;
    .locals 1

    .line 3524
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3527
    :cond_0
    iget-object v0, v0, Ll/ܳ᩻֫;->ۜ:Landroid/view/View;

    return-object v0
.end method

.method public final getFragmentManager()Ll/ۚۜ֫;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1088
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    return-object v0
.end method

.method public final getHost()Ljava/lang/Object;
    .locals 1

    .line 1008
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll/ۙ᩻֫;->ܳ()Ll/֡᩻֫;

    move-result-object v0

    return-object v0
.end method

.method public final getId()I
    .locals 1

    .line 754
    iget v0, p0, Ll/ۡ᩻֫;->mFragmentId:I

    return v0
.end method

.method public final getLayoutInflater()Landroid/view/LayoutInflater;
    .locals 1

    .line 1736
    iget-object v0, p0, Ll/ۡ᩻֫;->mLayoutInflater:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 1737
    invoke-virtual {p0, v0}, Ll/ۡ᩻֫;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1770
    iget-object p1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz p1, :cond_0

    .line 1774
    invoke-virtual {p1}, Ll/ۙ᩻֫;->ۜ()Landroid/view/LayoutInflater;

    move-result-object p1

    .line 1775
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ܶ()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    .line 141
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    .line 1771
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getLifecycle()Ll/۟ۢ֫;
    .locals 1

    .line 335
    iget-object v0, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    return-object v0
.end method

.method public getLoaderManager()Ll/ܿۖ֫;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1425
    invoke-static {p0}, Ll/ܿۖ֫;->֫(Ll/᩻ۡ֫;)Ll/ܿۖ֫;

    move-result-object v0

    return-object v0
.end method

.method public getNextTransition()I
    .locals 1

    .line 3450
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3453
    :cond_0
    iget v0, v0, Ll/ܳ᩻֫;->ۢ:I

    return v0
.end method

.method public final getParentFragment()Ll/ۡ᩻֫;
    .locals 1

    .line 1153
    iget-object v0, p0, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    return-object v0
.end method

.method public final getParentFragmentManager()Ll/ۚۜ֫;
    .locals 3

    .line 1105
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_0

    return-object v0

    .line 1107
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not associated with a fragment manager."

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1107
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getPopDirection()Z
    .locals 1

    .line 3436
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3439
    :cond_0
    iget-boolean v0, v0, Ll/ܳ᩻֫;->᩷:Z

    return v0
.end method

.method public getPopEnterAnim()I
    .locals 1

    .line 3421
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3424
    :cond_0
    iget v0, v0, Ll/ܳ᩻֫;->ۡ:I

    return v0
.end method

.method public getPopExitAnim()I
    .locals 1

    .line 3429
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3432
    :cond_0
    iget v0, v0, Ll/ܳ᩻֫;->ܺ:I

    return v0
.end method

.method public getPostOnViewCreatedAlpha()F
    .locals 1

    .line 3513
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 3516
    :cond_0
    iget v0, v0, Ll/ܳ᩻֫;->ۖ:F

    return v0
.end method

.method public getReenterTransition()Ljava/lang/Object;
    .locals 2

    .line 2668
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2671
    :cond_0
    iget-object v0, v0, Ll/ܳ᩻֫;->ۘ:Ljava/lang/Object;

    sget-object v1, Ll/ۡ᩻֫;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getExitTransition()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1031
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final getRetainInstance()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1321
    invoke-static {p0}, Ll/᩺᩷֫;->ۧ(Ll/ۡ᩻֫;)V

    .line 1322
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mRetainInstance:Z

    return v0
.end method

.method public getReturnTransition()Ljava/lang/Object;
    .locals 2

    .line 2590
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2593
    :cond_0
    iget-object v0, v0, Ll/ܳ᩻֫;->ᩴ:Ljava/lang/Object;

    sget-object v1, Ll/ۡ᩻֫;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getEnterTransition()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final getSavedStateRegistry()Ll/ܶ۫ۧ;
    .locals 1

    .line 503
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedStateRegistryController:Ll/᩸۫ۧ;

    invoke-virtual {v0}, Ll/᩸۫ۧ;->֫()Ll/ܶ۫ۧ;

    move-result-object v0

    return-object v0
.end method

.method public getSharedElementEnterTransition()Ljava/lang/Object;
    .locals 1

    .line 2701
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2704
    :cond_0
    iget-object v0, v0, Ll/ܳ᩻֫;->᩵:Ljava/lang/Object;

    return-object v0
.end method

.method public getSharedElementReturnTransition()Ljava/lang/Object;
    .locals 2

    .line 2739
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2742
    :cond_0
    iget-object v0, v0, Ll/ܳ᩻֫;->֡:Ljava/lang/Object;

    sget-object v1, Ll/ۡ᩻֫;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 2743
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getSharedElementEnterTransition()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getSharedElementSourceNames()Ljava/util/ArrayList;
    .locals 1

    .line 3466
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ܳ᩻֫;->ۚ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 3467
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getSharedElementTargetNames()Ljava/util/ArrayList;
    .locals 1

    .line 3474
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ܳ᩻֫;->֨:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 3475
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 1

    .line 1053
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1066
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    .line 762
    iget-object v0, p0, Ll/ۡ᩻֫;->mTag:Ljava/lang/String;

    return-object v0
.end method

.method public final getTargetFragment()Ll/ۡ᩻֫;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 908
    invoke-direct {p0, v0}, Ll/ۡ᩻֫;->֫(Z)Ll/ۡ᩻֫;

    move-result-object v0

    return-object v0
.end method

.method public final getTargetRequestCode()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 943
    invoke-static {p0}, Ll/᩺᩷֫;->ܽ(Ll/ۡ᩻֫;)V

    .line 944
    iget v0, p0, Ll/ۡ᩻֫;->mTargetRequestCode:I

    return v0
.end method

.method public final getText(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1042
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public getUserVisibleHint()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1413
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 2050
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    return-object v0
.end method

.method public getViewLifecycleOwner()Ll/᩻ۡ֫;
    .locals 2

    .line 376
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    if-eqz v0, :cond_0

    return-object v0

    .line 377
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getViewLifecycleOwnerLiveData()Ll/֡ۡ֫;
    .locals 1

    .line 397
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwnerLiveData:Ll/ۚۡ֫;

    return-object v0
.end method

.method public getViewModelStore()Ll/ۗܺ֫;
    .locals 2

    .line 413
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_1

    .line 416
    invoke-direct {p0}, Ll/ۡ᩻֫;->ܽ()I

    move-result v0

    sget-object v1, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 421
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p0}, Ll/ۚۜ֫;->᩻(Ll/ۡ᩻֫;)Ll/ۗܺ֫;

    move-result-object v0

    return-object v0

    .line 417
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 414
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hasOptionsMenu()Z
    .locals 1

    .line 1250
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 722
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public initState()V
    .locals 3

    .line 2264
    invoke-direct {p0}, Ll/ۡ᩻֫;->ᩳ()V

    .line 2265
    iget-object v0, p0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    iput-object v0, p0, Ll/ۡ᩻֫;->mPreviousWho:Ljava/lang/String;

    .line 2266
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    const/4 v0, 0x0

    .line 2267
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mAdded:Z

    .line 2268
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mRemoving:Z

    .line 2269
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mFromLayout:Z

    .line 2270
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mInLayout:Z

    .line 2271
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mRestored:Z

    .line 2272
    iput v0, p0, Ll/ۡ᩻֫;->mBackStackNesting:I

    const/4 v1, 0x0

    .line 2273
    iput-object v1, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 2274
    new-instance v2, Ll/֨ۜ֫;

    .line 30
    invoke-direct {v2}, Ll/ۚۜ֫;-><init>()V

    .line 2274
    iput-object v2, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    .line 2275
    iput-object v1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    .line 2276
    iput v0, p0, Ll/ۡ᩻֫;->mFragmentId:I

    .line 2277
    iput v0, p0, Ll/ۡ᩻֫;->mContainerId:I

    .line 2278
    iput-object v1, p0, Ll/ۡ᩻֫;->mTag:Ljava/lang/String;

    .line 2279
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    .line 2280
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mDetached:Z

    return-void
.end method

.method public final isAdded()Z
    .locals 1

    .line 1183
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mAdded:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isDetached()Z
    .locals 1

    .line 1192
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mDetached:Z

    return v0
.end method

.method public final isHidden()Z
    .locals 3

    .line 1242
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    .line 1243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 687
    :cond_0
    invoke-virtual {v2}, Ll/ۡ᩻֫;->isHidden()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final isInBackStack()Z
    .locals 1

    .line 708
    iget v0, p0, Ll/ۡ᩻֫;->mBackStackNesting:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isInLayout()Z
    .locals 1

    .line 1212
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mInLayout:Z

    return v0
.end method

.method public final isMenuVisible()Z
    .locals 2

    .line 1256
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۡ᩻֫;->mParentFragment:Ll/ۡ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 675
    :cond_0
    invoke-virtual {v0}, Ll/ۡ᩻֫;->isMenuVisible()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_2

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public isPostponed()Z
    .locals 1

    .line 3531
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3534
    :cond_0
    iget-boolean v0, v0, Ll/ܳ᩻֫;->ܿ:Z

    return v0
.end method

.method public final isRemoving()Z
    .locals 1

    .line 1201
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mRemoving:Z

    return v0
.end method

.method public final isResumed()Z
    .locals 2

    .line 1220
    iget v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v1, 0x7

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isStateSaved()Z
    .locals 1

    .line 812
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 815
    :cond_0
    invoke-virtual {v0}, Ll/ۚۜ֫;->۬()Z

    move-result v0

    return v0
.end method

.method public final isVisible()Z
    .locals 1

    .line 1229
    invoke-virtual {p0}, Ll/ۡ᩻֫;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۡ᩻֫;->isHidden()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1230
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public noteStateNotSaved()V
    .locals 1

    .line 3193
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۫()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 2096
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x2

    .line 1577
    invoke-static {p1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1578
    invoke-virtual {p0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    invoke-static {p3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 1896
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    .line 1877
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 1878
    iget-object p1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll/ۙ᩻֫;->ܽ()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 1880
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 1881
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onAttach(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public onAttachFragment(Ll/ۡ᩻֫;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    .line 2185
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x1

    .line 1964
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 1965
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->restoreChildFragmentState(Landroid/os/Bundle;)V

    .line 1966
    iget-object p1, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    .line 1398
    iget v1, p1, Ll/ۚۜ֫;->᩻:I

    if-lt v1, v0, :cond_0

    return-void

    .line 1967
    :cond_0
    invoke-virtual {p1}, Ll/ۚۜ֫;->ܿ()V

    return-void
.end method

.method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreateAnimator(IZI)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .line 2450
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 2022
    iget p3, p0, Ll/ۡ᩻֫;->mContentLayoutId:I

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    .line 2023
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x1

    .line 2254
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onDestroyOptionsMenu()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    const/4 v0, 0x1

    .line 2244
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onDetach()V
    .locals 1

    const/4 v0, 0x1

    .line 2290
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1720
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1
.end method

.method public onHiddenChanged(Z)V
    .locals 0

    return-void
.end method

.method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    .line 1845
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1

    const/4 p1, 0x1

    .line 1825
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 1826
    iget-object p1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll/ۙ᩻֫;->ܽ()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 1828
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 1829
    invoke-virtual {p0, p1, p2, p3}, Ll/ۡ᩻֫;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    .line 2229
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 0

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public onOptionsMenuClosed(Landroid/view/Menu;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onPause()V
    .locals 1

    const/4 v0, 0x1

    .line 2211
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 0

    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onPrimaryNavigationFragmentChanged(Z)V
    .locals 0

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onResume()V
    .locals 1

    const/4 v0, 0x1

    .line 2135
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 1

    const/4 v0, 0x1

    .line 2123
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onStop()V
    .locals 1

    const/4 v0, 0x1

    .line 2222
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    .line 2112
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    return-void
.end method

.method public performActivityCreated(Landroid/os/Bundle;)V
    .locals 2

    .line 3134
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۫()V

    const/4 v0, 0x3

    .line 3135
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v0, 0x0

    .line 3136
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3137
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onActivityCreated(Landroid/os/Bundle;)V

    .line 3138
    iget-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz p1, :cond_0

    .line 3142
    invoke-direct {p0}, Ll/ۡ᩻֫;->ܿ()V

    .line 3143
    iget-object p1, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {p1}, Ll/ۚۜ֫;->ܽ()V

    return-void

    .line 3139
    :cond_0
    new-instance p1, Ll/۫᩷֫;

    const-string v0, "Fragment "

    const-string v1, " did not call through to super.onActivityCreated()"

    .line 0
    invoke-static {v0, p0, v1}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3139
    throw p1
.end method

.method public performAttach()V
    .locals 3

    .line 3056
    iget-object v0, p0, Ll/ۡ᩻֫;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ᩻֫;

    .line 3057
    invoke-virtual {v1}, Ll/ۜ᩻֫;->֫()V

    goto :goto_0

    .line 3059
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3060
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    iget-object v1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->createFragmentContainer()Ll/ܶ᩻֫;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Ll/ۚۜ֫;->֫(Ll/ۙ᩻֫;Ll/ܶ᩻֫;Ll/ۡ᩻֫;)V

    const/4 v0, 0x0

    .line 3061
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    .line 3062
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3063
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {v0}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۡ᩻֫;->onAttach(Landroid/content/Context;)V

    .line 3064
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v0, :cond_1

    .line 3068
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p0}, Ll/ۚۜ֫;->ܳ(Ll/ۡ᩻֫;)V

    .line 3069
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ᩳ()V

    return-void

    .line 3065
    :cond_1
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onAttach()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3065
    throw v0
.end method

.method public performConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 3216
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public performContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 3269
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    if-nez v0, :cond_1

    .line 3270
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3273
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p1}, Ll/ۚۜ֫;->֫(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public performCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 3073
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۫()V

    const/4 v0, 0x1

    .line 3074
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v1, 0x0

    .line 3075
    iput-boolean v1, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3077
    iget-object v1, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    new-instance v2, Ll/ۧ᩻֫;

    invoke-direct {v2, p0}, Ll/ۧ᩻֫;-><init>(Ll/ۡ᩻֫;)V

    invoke-virtual {v1, v2}, Ll/᩷ۡ֫;->֫(Ll/ܳۡ֫;)V

    .line 3089
    iget-object v1, p0, Ll/ۡ᩻֫;->mSavedStateRegistryController:Ll/᩸۫ۧ;

    invoke-virtual {v1, p1}, Ll/᩸۫ۧ;->֫(Landroid/os/Bundle;)V

    .line 3090
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onCreate(Landroid/os/Bundle;)V

    .line 3091
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mIsCreated:Z

    .line 3092
    iget-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz p1, :cond_0

    .line 3096
    iget-object p1, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    sget-object v0, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    invoke-virtual {p1, v0}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void

    .line 3093
    :cond_0
    new-instance p1, Ll/۫᩷֫;

    const-string v0, "Fragment "

    const-string v1, " did not call through to super.onCreate()"

    .line 0
    invoke-static {v0, p0, v1}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3093
    throw p1
.end method

.method public performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    .line 3234
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 3235
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    if-eqz v0, :cond_0

    .line 3237
    invoke-virtual {p0, p1, p2}, Ll/ۡ᩻֫;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const/4 v1, 0x1

    .line 3239
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p1, p2}, Ll/ۚۜ֫;->֫(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    or-int/2addr p1, v1

    return p1

    :cond_1
    return v1
.end method

.method public performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 2

    .line 3101
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۫()V

    const/4 v0, 0x1

    .line 3102
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mPerformedCreateView:Z

    .line 3103
    new-instance v0, Ll/ۖ᩷֫;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewModelStore()Ll/ۗܺ֫;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۖ᩷֫;-><init>(Ll/ۡ᩻֫;Ll/ۗܺ֫;)V

    iput-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    .line 3104
    invoke-virtual {p0, p1, p2, p3}, Ll/ۡ᩻֫;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 3107
    iget-object p1, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {p1}, Ll/ۖ᩷֫;->֫()V

    .line 3111
    iget-object p1, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    iget-object p2, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-static {p1, p2}, Ll/ۛܺ֫;->֫(Landroid/view/View;Ll/᩻ۡ֫;)V

    .line 3112
    iget-object p1, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    iget-object p2, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    const-string p3, "<this>"

    .line 0
    invoke-static {p1, p3}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a068c

    .line 38
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 3113
    iget-object p1, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    iget-object p2, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-static {p1, p2}, Ll/ۗ᩻ۚ;->֫(Landroid/view/View;Ll/᩹۫ۧ;)V

    .line 3115
    iget-object p1, p0, Ll/ۡ᩻֫;->mViewLifecycleOwnerLiveData:Ll/ۚۡ֫;

    iget-object p2, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {p1, p2}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    return-void

    .line 3117
    :cond_0
    iget-object p1, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {p1}, Ll/ۖ᩷֫;->ۧ()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 3121
    iput-object p1, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    return-void

    .line 3118
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performDestroy()V
    .locals 3

    .line 3351
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ܳ()V

    .line 3352
    iget-object v0, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x0

    .line 3353
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    .line 3354
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3355
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mIsCreated:Z

    .line 3356
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onDestroy()V

    .line 3357
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v0, :cond_0

    return-void

    .line 3358
    :cond_0
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onDestroy()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3358
    throw v0
.end method

.method public performDestroyView()V
    .locals 3

    .line 3330
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->᩻()V

    .line 3331
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {v0}, Ll/ۖ᩷֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    .line 3332
    invoke-virtual {v0, v1}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3333
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    sget-object v1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/ۖ᩷֫;->֫(Ll/᩺ۢ֫;)V

    :cond_0
    const/4 v0, 0x1

    .line 3335
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v0, 0x0

    .line 3336
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3337
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    .line 3338
    iget-boolean v1, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v1, :cond_1

    .line 3346
    invoke-static {p0}, Ll/ܿۖ֫;->֫(Ll/᩻ۡ֫;)Ll/ܿۖ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿۖ֫;->֫()V

    .line 3347
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mPerformedCreateView:Z

    return-void

    .line 3339
    :cond_1
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onDestroyView()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3339
    throw v0
.end method

.method public performDetach()V
    .locals 3

    const/4 v0, -0x1

    .line 3364
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v0, 0x0

    .line 3365
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3366
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onDetach()V

    const/4 v0, 0x0

    .line 3367
    iput-object v0, p0, Ll/ۡ᩻֫;->mLayoutInflater:Landroid/view/LayoutInflater;

    .line 3368
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v0, :cond_1

    .line 3376
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۗ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3377
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ܳ()V

    .line 3378
    new-instance v0, Ll/֨ۜ֫;

    .line 30
    invoke-direct {v0}, Ll/ۚۜ֫;-><init>()V

    .line 3378
    iput-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    :cond_0
    return-void

    .line 3369
    :cond_1
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onDetach()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3369
    throw v0
.end method

.method public performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1752
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ᩻֫;->mLayoutInflater:Landroid/view/LayoutInflater;

    return-object p1
.end method

.method public performLowMemory()V
    .locals 0

    .line 3220
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onLowMemory()V

    return-void
.end method

.method public performMultiWindowModeChanged(Z)V
    .locals 0

    .line 3208
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onMultiWindowModeChanged(Z)V

    return-void
.end method

.method public performOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 3257
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    if-nez v0, :cond_1

    .line 3258
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    if-eqz v0, :cond_0

    .line 3259
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3263
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p1}, Ll/ۚۜ֫;->ۧ(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public performOptionsMenuClosed(Landroid/view/Menu;)V
    .locals 1

    .line 3279
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    if-nez v0, :cond_1

    .line 3280
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    if-eqz v0, :cond_0

    .line 3281
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onOptionsMenuClosed(Landroid/view/Menu;)V

    .line 3283
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p1}, Ll/ۚۜ֫;->֫(Landroid/view/Menu;)V

    :cond_1
    return-void
.end method

.method public performPause()V
    .locals 3

    .line 3298
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->᩷()V

    .line 3299
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3300
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    sget-object v1, Ll/᩺ۢ֫;->۬:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/ۖ᩷֫;->֫(Ll/᩺ۢ֫;)V

    .line 3302
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->۬:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x6

    .line 3303
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v0, 0x0

    .line 3304
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3305
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onPause()V

    .line 3306
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v0, :cond_1

    return-void

    .line 3307
    :cond_1
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onPause()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3307
    throw v0
.end method

.method public performPictureInPictureModeChanged(Z)V
    .locals 0

    .line 3212
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onPictureInPictureModeChanged(Z)V

    return-void
.end method

.method public performPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 3246
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHidden:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 3247
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    if-eqz v0, :cond_0

    .line 3249
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onPrepareOptionsMenu(Landroid/view/Menu;)V

    const/4 v1, 0x1

    .line 3251
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p1}, Ll/ۚۜ֫;->ۧ(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr p1, v1

    return p1

    :cond_1
    return v1
.end method

.method public performPrimaryNavigationFragmentChanged()V
    .locals 2

    .line 3197
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ll/ۚۜ֫;->᩵(Ll/ۡ᩻֫;)Z

    move-result v0

    .line 3199
    iget-object v1, p0, Ll/ۡ᩻֫;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 3200
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 3201
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Ll/ۡ᩻֫;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    .line 3202
    invoke-virtual {p0, v0}, Ll/ۡ᩻֫;->onPrimaryNavigationFragmentChanged(Z)V

    .line 3203
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۢ()V

    return-void
.end method

.method public performResume()V
    .locals 3

    .line 3176
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۫()V

    .line 3177
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۚۜ֫;->ۧ(Z)Z

    const/4 v0, 0x7

    .line 3178
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v0, 0x0

    .line 3179
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3180
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onResume()V

    .line 3181
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v0, :cond_1

    .line 3185
    iget-object v0, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 3186
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3187
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {v0, v1}, Ll/ۖ᩷֫;->֫(Ll/᩺ۢ֫;)V

    .line 3189
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۡ()V

    return-void

    .line 3182
    :cond_1
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onResume()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3182
    throw v0
.end method

.method public performSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 3288
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 3289
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedStateRegistryController:Ll/᩸۫ۧ;

    invoke-virtual {v0, p1}, Ll/᩸۫ۧ;->ۧ(Landroid/os/Bundle;)V

    .line 3290
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۛ()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:support:fragments"

    .line 3292
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public performStart()V
    .locals 3

    .line 3158
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->۫()V

    .line 3159
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۚۜ֫;->ۧ(Z)Z

    const/4 v0, 0x5

    .line 3160
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v0, 0x0

    .line 3161
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3162
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onStart()V

    .line 3163
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v0, :cond_1

    .line 3167
    iget-object v0, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 3168
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3169
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {v0, v1}, Ll/ۖ᩷֫;->֫(Ll/᩺ۢ֫;)V

    .line 3171
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ܺ()V

    return-void

    .line 3164
    :cond_1
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onStart()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3164
    throw v0
.end method

.method public performStop()V
    .locals 3

    .line 3314
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۖ()V

    .line 3315
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3316
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    sget-object v1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/ۖ᩷֫;->֫(Ll/᩺ۢ֫;)V

    .line 3318
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x4

    .line 3319
    iput v0, p0, Ll/ۡ᩻֫;->mState:I

    const/4 v0, 0x0

    .line 3320
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 3321
    invoke-virtual {p0}, Ll/ۡ᩻֫;->onStop()V

    .line 3322
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz v0, :cond_1

    return-void

    .line 3323
    :cond_1
    new-instance v0, Ll/۫᩷֫;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onStop()"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 3323
    throw v0
.end method

.method public performViewCreated()V
    .locals 2

    .line 3128
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    iget-object v1, p0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p0, v0, v1}, Ll/ۡ᩻֫;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 3129
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۘ()V

    return-void
.end method

.method public postponeEnterTransition()V
    .locals 2

    .line 2826
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܳ᩻֫;->ܿ:Z

    return-void
.end method

.method public final postponeEnterTransition(JLjava/util/concurrent/TimeUnit;)V
    .locals 2

    .line 2858
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܳ᩻֫;->ܿ:Z

    .line 2860
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_0

    .line 2861
    invoke-virtual {v0}, Ll/ۚۜ֫;->۠()Ll/ۙ᩻֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v0

    goto :goto_0

    .line 2863
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2865
    :goto_0
    iget-object v1, p0, Ll/ۡ᩻֫;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2866
    iget-object v1, p0, Ll/ۡ᩻֫;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final registerForActivityResult(Ll/᩸ᩳ;Ll/᩵ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;
    .locals 1

    .line 3569
    new-instance v0, Ll/ᩳ᩻֫;

    invoke-direct {v0, p2}, Ll/ᩳ᩻֫;-><init>(Ll/᩵ᩳ;)V

    invoke-direct {p0, p1, v0, p3}, Ll/ۡ᩻֫;->֫(Ll/᩸ᩳ;Ll/ܽ᩵;Ll/᩷ᩳ;)Ll/ۢᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final registerForActivityResult(Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;
    .locals 1

    .line 3551
    new-instance v0, Ll/ܽ᩻֫;

    invoke-direct {v0, p0}, Ll/ܽ᩻֫;-><init>(Ll/ۡ᩻֫;)V

    invoke-direct {p0, p1, v0, p2}, Ll/ۡ᩻֫;->֫(Ll/᩸ᩳ;Ll/ܽ᩵;Ll/᩷ᩳ;)Ll/ۢᩳ;

    move-result-object p1

    return-object p1
.end method

.method public registerForContextMenu(Landroid/view/View;)V
    .locals 0

    .line 2464
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    return-void
.end method

.method public final requestPermissions([Ljava/lang/String;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1651
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    .line 1654
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;[Ljava/lang/String;I)V

    return-void

    .line 1652
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string v0, " not attached to Activity"

    .line 0
    invoke-static {p2, p0, v0}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1652
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final requireActivity()Ll/֡᩻֫;
    .locals 3

    .line 993
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 995
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to an activity."

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 995
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireArguments()Landroid/os/Bundle;
    .locals 3

    .line 796
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 798
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " does not have any arguments."

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 798
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireContext()Landroid/content/Context;
    .locals 3

    .line 965
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 967
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to a context."

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 967
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireFragmentManager()Ll/ۚۜ֫;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1132
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v0

    return-object v0
.end method

.method public final requireHost()Ljava/lang/Object;
    .locals 3

    .line 1019
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getHost()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 1021
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to a host."

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1021
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireParentFragment()Ll/ۡ᩻֫;
    .locals 3

    .line 1165
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragment()Ll/ۡ᩻֫;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1167
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Fragment "

    if-nez v0, :cond_0

    .line 1169
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, " is not attached to any Fragment or host"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1169
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1172
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not a child Fragment, it is directly attached to "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1173
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v0
.end method

.method public final requireView()Landroid/view/View;
    .locals 3

    .line 2061
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2063
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2063
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public restoreChildFragmentState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "android:support:fragments"

    .line 1986
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1989
    iget-object v0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0, p1}, Ll/ۚۜ֫;->֫(Landroid/os/Parcelable;)V

    .line 1990
    iget-object p1, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {p1}, Ll/ۚۜ֫;->ܿ()V

    :cond_0
    return-void
.end method

.method public final restoreViewState(Landroid/os/Bundle;)V
    .locals 3

    .line 688
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 689
    iget-object v2, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 690
    iput-object v1, p0, Ll/ۡ᩻֫;->mSavedViewState:Landroid/util/SparseArray;

    .line 692
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 693
    iget-object v0, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    iget-object v2, p0, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Ll/ۖ᩷֫;->֫(Landroid/os/Bundle;)V

    .line 694
    iput-object v1, p0, Ll/ۡ᩻֫;->mSavedViewRegistryState:Landroid/os/Bundle;

    :cond_1
    const/4 v0, 0x0

    .line 696
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mCalled:Z

    .line 697
    invoke-virtual {p0, p1}, Ll/ۡ᩻֫;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 698
    iget-boolean p1, p0, Ll/ۡ᩻֫;->mCalled:Z

    if-eqz p1, :cond_3

    .line 702
    iget-object p1, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz p1, :cond_2

    .line 703
    iget-object p1, p0, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    sget-object v0, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    invoke-virtual {p1, v0}, Ll/ۖ᩷֫;->֫(Ll/᩺ۢ֫;)V

    :cond_2
    return-void

    .line 699
    :cond_3
    new-instance p1, Ll/۫᩷֫;

    const-string v0, "Fragment "

    const-string v1, " did not call through to super.onViewStateRestored()"

    .line 0
    invoke-static {v0, p0, v1}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 699
    throw p1
.end method

.method public setAllowEnterTransitionOverlap(Z)V
    .locals 1

    .line 2756
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Ll/ܳ᩻֫;->֫:Ljava/lang/Boolean;

    return-void
.end method

.method public setAllowReturnTransitionOverlap(Z)V
    .locals 1

    .line 2781
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Ll/ܳ᩻֫;->ۧ:Ljava/lang/Boolean;

    return-void
.end method

.method public setAnimations(IIII)V
    .locals 1

    .line 3394
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    .line 3397
    :cond_0
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput p1, v0, Ll/ܳ᩻֫;->ܽ:I

    .line 3398
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object p1

    iput p2, p1, Ll/ܳ᩻֫;->ܳ:I

    .line 3399
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object p1

    iput p3, p1, Ll/ܳ᩻֫;->ۡ:I

    .line 3400
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object p1

    iput p4, p1, Ll/ܳ᩻֫;->ܺ:I

    return-void
.end method

.method public setArguments(Landroid/os/Bundle;)V
    .locals 1

    .line 773
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/ۡ᩻֫;->isStateSaved()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 774
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 776
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ۡ᩻֫;->mArguments:Landroid/os/Bundle;

    return-void
.end method

.method public setEnterSharedElementCallback(Ll/᩻ۙ;)V
    .locals 0

    .line 2509
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setEnterTransition(Ljava/lang/Object;)V
    .locals 1

    .line 2537
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-object p1, v0, Ll/ܳ᩻֫;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public setExitSharedElementCallback(Ll/᩻ۙ;)V
    .locals 0

    .line 2520
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setExitTransition(Ljava/lang/Object;)V
    .locals 1

    .line 2613
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-object p1, v0, Ll/ܳ᩻֫;->᩻:Ljava/lang/Object;

    return-void
.end method

.method public setFocusedView(Landroid/view/View;)V
    .locals 1

    .line 3520
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-object p1, v0, Ll/ܳ᩻֫;->ۜ:Landroid/view/View;

    return-void
.end method

.method public setHasOptionsMenu(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1339
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    if-eq v0, p1, :cond_0

    .line 1340
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    .line 1341
    invoke-virtual {p0}, Ll/ۡ᩻֫;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ll/ۡ᩻֫;->isHidden()Z

    move-result p1

    if-nez p1, :cond_0

    .line 1342
    iget-object p1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {p1}, Ll/ۙ᩻֫;->᩷()V

    :cond_0
    return-void
.end method

.method public setInitialSavedState(Ll/ۢ᩻֫;)V
    .locals 1

    .line 827
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 830
    iget-object p1, p1, Ll/ۢ᩻֫;->᩸:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 831
    :goto_0
    iput-object p1, p0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    return-void

    .line 828
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMenuVisibility(Z)V
    .locals 1

    .line 1357
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    if-eq v0, p1, :cond_0

    .line 1358
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    .line 1359
    iget-boolean p1, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ll/ۡ᩻֫;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ll/ۡ᩻֫;->isHidden()Z

    move-result p1

    if-nez p1, :cond_0

    .line 1360
    iget-object p1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {p1}, Ll/ۙ᩻֫;->᩷()V

    :cond_0
    return-void
.end method

.method public setNextTransition(I)V
    .locals 1

    .line 3457
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    return-void

    .line 3460
    :cond_0
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    .line 3461
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iput p1, v0, Ll/ܳ᩻֫;->ۢ:I

    return-void
.end method

.method public setPopDirection(Z)V
    .locals 1

    .line 3443
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-nez v0, :cond_0

    return-void

    .line 3446
    :cond_0
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-boolean p1, v0, Ll/ܳ᩻֫;->᩷:Z

    return-void
.end method

.method public setPostOnViewCreatedAlpha(F)V
    .locals 1

    .line 3509
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput p1, v0, Ll/ܳ᩻֫;->ۖ:F

    return-void
.end method

.method public setReenterTransition(Ljava/lang/Object;)V
    .locals 1

    .line 2652
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-object p1, v0, Ll/ܳ᩻֫;->ۘ:Ljava/lang/Object;

    return-void
.end method

.method public setRetainInstance(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1294
    invoke-static {p0}, Ll/᩺᩷֫;->ܿ(Ll/ۡ᩻֫;)V

    .line 1295
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mRetainInstance:Z

    .line 1296
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 1298
    invoke-virtual {v0, p0}, Ll/ۚۜ֫;->ۧ(Ll/ۡ᩻֫;)V

    return-void

    .line 1300
    :cond_0
    invoke-virtual {v0, p0}, Ll/ۚۜ֫;->ۡ(Ll/ۡ᩻֫;)V

    return-void

    :cond_1
    const/4 p1, 0x1

    .line 1303
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mRetainInstanceChangedWhileDetached:Z

    return-void
.end method

.method public setReturnTransition(Ljava/lang/Object;)V
    .locals 1

    .line 2573
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-object p1, v0, Ll/ܳ᩻֫;->ᩴ:Ljava/lang/Object;

    return-void
.end method

.method public setSharedElementEnterTransition(Ljava/lang/Object;)V
    .locals 1

    .line 2687
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-object p1, v0, Ll/ܳ᩻֫;->᩵:Ljava/lang/Object;

    return-void
.end method

.method public setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    .line 3482
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    .line 3483
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iput-object p1, v0, Ll/ܳ᩻֫;->ۚ:Ljava/util/ArrayList;

    .line 3484
    iput-object p2, v0, Ll/ܳ᩻֫;->֨:Ljava/util/ArrayList;

    return-void
.end method

.method public setSharedElementReturnTransition(Ljava/lang/Object;)V
    .locals 1

    .line 2722
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iput-object p1, v0, Ll/ܳ᩻֫;->֡:Ljava/lang/Object;

    return-void
.end method

.method public setTargetFragment(Ll/ۡ᩻֫;I)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    .line 859
    invoke-static {p0, p1, p2}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;Ll/ۡ᩻֫;I)V

    .line 865
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 866
    iget-object v2, p1, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    if-ne v0, v2, :cond_2

    goto :goto_1

    .line 869
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Fragment "

    const-string v1, " must share the same FragmentManager to be set as a target fragment"

    .line 0
    invoke-static {v0, p1, v1}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 869
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    move-object v0, p1

    :goto_2
    if-eqz v0, :cond_5

    .line 875
    invoke-virtual {v0, p0}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x0

    .line 874
    invoke-direct {v0, v2}, Ll/ۡ᩻֫;->֫(Z)Ll/ۡ᩻֫;

    move-result-object v0

    goto :goto_2

    .line 876
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Setting "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as the target of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " would create a target cycle"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    if-nez p1, :cond_6

    .line 881
    iput-object v1, p0, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 882
    iput-object v1, p0, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    goto :goto_3

    .line 883
    :cond_6
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_7

    iget-object v0, p1, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_7

    .line 885
    iget-object p1, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    iput-object p1, p0, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 886
    iput-object v1, p0, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    goto :goto_3

    .line 889
    :cond_7
    iput-object v1, p0, Ll/ۡ᩻֫;->mTargetWho:Ljava/lang/String;

    .line 890
    iput-object p1, p0, Ll/ۡ᩻֫;->mTarget:Ll/ۡ᩻֫;

    .line 892
    :goto_3
    iput p2, p0, Ll/ۡ᩻֫;->mTargetRequestCode:I

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1389
    invoke-static {p0, p1}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;Z)V

    .line 1390
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    const/4 v1, 0x5

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    iget v0, p0, Ll/ۡ᩻֫;->mState:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v0, :cond_0

    .line 1391
    invoke-virtual {p0}, Ll/ۡ᩻֫;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mIsCreated:Z

    if-eqz v0, :cond_0

    .line 1392
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 1393
    invoke-virtual {v0, p0}, Ll/ۚۜ֫;->ᩳ(Ll/ۡ᩻֫;)Ll/ۛۜ֫;

    move-result-object v2

    .line 1392
    invoke-virtual {v0, v2}, Ll/ۚۜ֫;->֫(Ll/ۛۜ֫;)V

    .line 1395
    :cond_0
    iput-boolean p1, p0, Ll/ۡ᩻֫;->mUserVisibleHint:Z

    .line 1396
    iget v0, p0, Ll/ۡ᩻֫;->mState:I

    if-ge v0, v1, :cond_1

    if-nez p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ۡ᩻֫;->mDeferStart:Z

    .line 1397
    iget-object v0, p0, Ll/ۡ᩻֫;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_2

    .line 1400
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ᩻֫;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    :cond_2
    return-void
.end method

.method public shouldShowRequestPermissionRationale(Ljava/lang/String;)Z
    .locals 1

    .line 1702
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    .line 1703
    invoke-virtual {v0, p1}, Ll/ۙ᩻֫;->ۧ(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public startActivity(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1433
    invoke-virtual {p0, p1, v0}, Ll/ۡ᩻֫;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 1442
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 1445
    invoke-virtual {v0, p1, v1, p2}, Ll/ۙ᩻֫;->֫(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 1443
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string v0, " not attached to Activity"

    .line 0
    invoke-static {p2, p0, v0}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1443
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1471
    invoke-virtual {p0, p1, p2, v0}, Ll/ۡ᩻֫;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1499
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    .line 1502
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 1500
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string p3, " not attached to Activity"

    .line 0
    invoke-static {p2, p0, p3}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1500
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 10
    .param p1    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object v9, p0

    .line 1538
    iget-object v0, v9, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 1541
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1542
    invoke-virtual {p0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static/range {p7 .. p7}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1546
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v0 .. v8}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    .line 1539
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to Activity"

    .line 0
    invoke-static {v1, p0, v2}, Ll/۟ۖᩴ;->֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1539
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public startPostponedEnterTransition()V
    .locals 2

    .line 2880
    iget-object v0, p0, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    iget-boolean v0, v0, Ll/ܳ᩻֫;->ܿ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2884
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-nez v0, :cond_1

    .line 2885
    invoke-direct {p0}, Ll/ۡ᩻֫;->ۧ()Ll/ܳ᩻֫;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/ܳ᩻֫;->ܿ:Z

    return-void

    .line 2886
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {v1}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 2887
    iget-object v0, p0, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    invoke-virtual {v0}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ll/ܰܳ֫;

    invoke-direct {v1, p0}, Ll/ܰܳ֫;-><init>(Ll/ۡ᩻֫;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 2894
    invoke-virtual {p0, v0}, Ll/ۡ᩻֫;->callStartTransitionListener(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 728
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 729
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 730
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    .line 731
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} ("

    .line 733
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    iget-object v1, p0, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    iget v1, p0, Ll/ۡ᩻֫;->mFragmentId:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    .line 737
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    iget v1, p0, Ll/ۡ᩻֫;->mFragmentId:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    :cond_0
    iget-object v1, p0, Ll/ۡ᩻֫;->mTag:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    .line 741
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    iget-object v1, p0, Ll/ۡ᩻֫;->mTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    .line 744
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public unregisterForContextMenu(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 2475
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    return-void
.end method
