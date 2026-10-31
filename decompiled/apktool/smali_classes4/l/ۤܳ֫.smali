.class public Ll/ۤܳ֫;
.super Ll/ۡ᩻֫;
.source "Z4K7"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# static fields
.field public static final SAVED_BACK_STACK_ID:Ljava/lang/String; = "android:backStackId"

.field public static final SAVED_CANCELABLE:Ljava/lang/String; = "android:cancelable"

.field public static final SAVED_DIALOG_STATE_TAG:Ljava/lang/String; = "android:savedDialogState"

.field public static final SAVED_INTERNAL_DIALOG_SHOWING:Ljava/lang/String; = "android:dialogShowing"

.field public static final SAVED_SHOWS_DIALOG:Ljava/lang/String; = "android:showsDialog"

.field public static final SAVED_STYLE:Ljava/lang/String; = "android:style"

.field public static final SAVED_THEME:Ljava/lang/String; = "android:theme"

.field public static final STYLE_NORMAL:I = 0x0

.field public static final STYLE_NO_FRAME:I = 0x2

.field public static final STYLE_NO_INPUT:I = 0x3

.field public static final STYLE_NO_TITLE:I = 0x1


# instance fields
.field public mBackStackId:I

.field public mCancelable:Z

.field public mCreatingDialog:Z

.field public mDialog:Landroid/app/Dialog;

.field public mDialogCreated:Z

.field public mDismissRunnable:Ljava/lang/Runnable;

.field public mDismissed:Z

.field public mHandler:Landroid/os/Handler;

.field public mObserver:Ll/֨ۡ֫;

.field public mOnCancelListener:Landroid/content/DialogInterface$OnCancelListener;

.field public mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

.field public mShownByMe:Z

.field public mShowsDialog:Z

.field public mStyle:I

.field public mTheme:I

.field public mViewDestroyed:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 189
    invoke-direct {p0}, Ll/ۡ᩻֫;-><init>()V

    .line 108
    new-instance v0, Ll/᩶ܳ֫;

    invoke-direct {v0, p0}, Ll/᩶ܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object v0, p0, Ll/ۤܳ֫;->mDismissRunnable:Ljava/lang/Runnable;

    .line 116
    new-instance v0, Ll/ۙܳ֫;

    invoke-direct {v0, p0}, Ll/ۙܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object v0, p0, Ll/ۤܳ֫;->mOnCancelListener:Landroid/content/DialogInterface$OnCancelListener;

    .line 127
    new-instance v0, Ll/ۗܳ֫;

    invoke-direct {v0, p0}, Ll/ۗܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object v0, p0, Ll/ۤܳ֫;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    const/4 v0, 0x0

    .line 138
    iput v0, p0, Ll/ۤܳ֫;->mStyle:I

    .line 139
    iput v0, p0, Ll/ۤܳ֫;->mTheme:I

    const/4 v1, 0x1

    .line 140
    iput-boolean v1, p0, Ll/ۤܳ֫;->mCancelable:Z

    .line 141
    iput-boolean v1, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    const/4 v1, -0x1

    .line 142
    iput v1, p0, Ll/ۤܳ֫;->mBackStackId:I

    .line 144
    new-instance v1, Ll/۬ܳ֫;

    invoke-direct {v1, p0}, Ll/۬ܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object v1, p0, Ll/ۤܳ֫;->mObserver:Ll/֨ۡ֫;

    .line 170
    iput-boolean v0, p0, Ll/ۤܳ֫;->mDialogCreated:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 214
    invoke-direct {p0, p1}, Ll/ۡ᩻֫;-><init>(I)V

    .line 108
    new-instance p1, Ll/᩶ܳ֫;

    invoke-direct {p1, p0}, Ll/᩶ܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object p1, p0, Ll/ۤܳ֫;->mDismissRunnable:Ljava/lang/Runnable;

    .line 116
    new-instance p1, Ll/ۙܳ֫;

    invoke-direct {p1, p0}, Ll/ۙܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object p1, p0, Ll/ۤܳ֫;->mOnCancelListener:Landroid/content/DialogInterface$OnCancelListener;

    .line 127
    new-instance p1, Ll/ۗܳ֫;

    invoke-direct {p1, p0}, Ll/ۗܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object p1, p0, Ll/ۤܳ֫;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    const/4 p1, 0x0

    .line 138
    iput p1, p0, Ll/ۤܳ֫;->mStyle:I

    .line 139
    iput p1, p0, Ll/ۤܳ֫;->mTheme:I

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Ll/ۤܳ֫;->mCancelable:Z

    .line 141
    iput-boolean v0, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    const/4 v0, -0x1

    .line 142
    iput v0, p0, Ll/ۤܳ֫;->mBackStackId:I

    .line 144
    new-instance v0, Ll/۬ܳ֫;

    invoke-direct {v0, p0}, Ll/۬ܳ֫;-><init>(Ll/ۤܳ֫;)V

    iput-object v0, p0, Ll/ۤܳ֫;->mObserver:Ll/֨ۡ֫;

    .line 170
    iput-boolean p1, p0, Ll/ۤܳ֫;->mDialogCreated:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۤܳ֫;)Landroid/app/Dialog;
    .locals 0

    .line 61
    iget-object p0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    return-object p0
.end method

.method private ֫(Landroid/os/Bundle;)V
    .locals 3

    .line 658
    iget-boolean v0, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 662
    :cond_0
    iget-boolean v0, p0, Ll/ۤܳ֫;->mDialogCreated:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 664
    :try_start_0
    iput-boolean v1, p0, Ll/ۤܳ֫;->mCreatingDialog:Z

    .line 665
    invoke-virtual {p0, p1}, Ll/ۤܳ֫;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    iput-object p1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    .line 668
    iget-boolean v2, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    if-eqz v2, :cond_2

    .line 669
    iget v2, p0, Ll/ۤܳ֫;->mStyle:I

    invoke-virtual {p0, p1, v2}, Ll/ۤܳ֫;->setupDialog(Landroid/app/Dialog;I)V

    .line 670
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 671
    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_1

    .line 672
    iget-object v2, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 674
    :cond_1
    iget-object p1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    iget-boolean v2, p0, Ll/ۤܳ֫;->mCancelable:Z

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 675
    iget-object p1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    iget-object v2, p0, Ll/ۤܳ֫;->mOnCancelListener:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 676
    iget-object p1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    iget-object v2, p0, Ll/ۤܳ֫;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 677
    iput-boolean v1, p0, Ll/ۤܳ֫;->mDialogCreated:Z

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 681
    iput-object p1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 684
    :goto_0
    iput-boolean v0, p0, Ll/ۤܳ֫;->mCreatingDialog:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Ll/ۤܳ֫;->mCreatingDialog:Z

    .line 685
    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method private ֫(ZZZ)V
    .locals 4

    .line 333
    iget-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 336
    iput-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    const/4 v1, 0x0

    .line 337
    iput-boolean v1, p0, Ll/ۤܳ֫;->mShownByMe:Z

    .line 338
    iget-object v2, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    .line 342
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 343
    iget-object v2, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_2

    .line 349
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v2, p0, Ll/ۤܳ֫;->mHandler:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne p2, v2, :cond_1

    .line 350
    iget-object p2, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Ll/ۤܳ֫;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    .line 352
    :cond_1
    iget-object p2, p0, Ll/ۤܳ֫;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Ll/ۤܳ֫;->mDismissRunnable:Ljava/lang/Runnable;

    invoke-virtual {p2, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 356
    :cond_2
    :goto_0
    iput-boolean v0, p0, Ll/ۤܳ֫;->mViewDestroyed:Z

    .line 357
    iget p2, p0, Ll/ۤܳ֫;->mBackStackId:I

    if-ltz p2, :cond_4

    if-eqz p3, :cond_3

    .line 359
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object p1

    iget p2, p0, Ll/ۤܳ֫;->mBackStackId:I

    invoke-virtual {p1, p2}, Ll/ۚۜ֫;->ܽ(I)V

    goto :goto_1

    .line 362
    :cond_3
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object p2

    iget p3, p0, Ll/ۤܳ֫;->mBackStackId:I

    invoke-virtual {p2, p3, p1}, Ll/ۚۜ֫;->ۧ(IZ)V

    :goto_1
    const/4 p1, -0x1

    .line 365
    iput p1, p0, Ll/ۤܳ֫;->mBackStackId:I

    return-void

    .line 367
    :cond_4
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    new-instance v2, Ll/ᩳܳ֫;

    invoke-direct {v2, p2}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 855
    iput-boolean v0, v2, Ll/ܽ᩷֫;->ۖ:Z

    .line 369
    invoke-virtual {v2, p0}, Ll/ᩳܳ֫;->ܽ(Ll/ۡ᩻֫;)Ll/ܽ᩷֫;

    if-eqz p3, :cond_5

    .line 372
    invoke-virtual {v2}, Ll/ᩳܳ֫;->ᩳ()V

    return-void

    :cond_5
    if-eqz p1, :cond_6

    .line 311
    invoke-virtual {v2, v0}, Ll/ᩳܳ֫;->֫(Z)I

    return-void

    .line 306
    :cond_6
    invoke-virtual {v2, v1}, Ll/ᩳܳ֫;->֫(Z)I

    return-void
.end method

.method public static synthetic ۧ(Ll/ۤܳ֫;)Landroid/content/DialogInterface$OnDismissListener;
    .locals 0

    .line 61
    iget-object p0, p0, Ll/ۤܳ֫;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ۤܳ֫;)Z
    .locals 0

    .line 61
    iget-boolean p0, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    return p0
.end method


# virtual methods
.method public createFragmentContainer()Ll/ܶ᩻֫;
    .locals 2

    .line 526
    invoke-super {p0}, Ll/ۡ᩻֫;->createFragmentContainer()Ll/ܶ᩻֫;

    move-result-object v0

    .line 527
    new-instance v1, Ll/۫ܳ֫;

    invoke-direct {v1, p0, v0}, Ll/۫ܳ֫;-><init>(Ll/ۤܳ֫;Ll/ܶ᩻֫;)V

    return-object v1
.end method

.method public dismiss()V
    .locals 1

    const/4 v0, 0x0

    .line 310
    invoke-direct {p0, v0, v0, v0}, Ll/ۤܳ֫;->֫(ZZZ)V

    return-void
.end method

.method public dismissAllowingStateLoss()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 329
    invoke-direct {p0, v0, v1, v1}, Ll/ۤܳ֫;->֫(ZZZ)V

    return-void
.end method

.method public dismissNow()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 319
    invoke-direct {p0, v0, v0, v1}, Ll/ۤܳ֫;->֫(ZZZ)V

    return-void
.end method

.method public getDialog()Landroid/app/Dialog;
    .locals 1

    .line 388
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method public getShowsDialog()Z
    .locals 1

    .line 460
    iget-boolean v0, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    return v0
.end method

.method public getTheme()I
    .locals 1

    .line 409
    iget v0, p0, Ll/ۤܳ֫;->mTheme:I

    return v0
.end method

.method public isCancelable()Z
    .locals 1

    .line 430
    iget-boolean v0, p0, Ll/ۤܳ֫;->mCancelable:Z

    return v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 718
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 466
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onAttach(Landroid/content/Context;)V

    .line 467
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewLifecycleOwnerLiveData()Ll/֡ۡ֫;

    move-result-object p1

    iget-object v0, p0, Ll/ۤܳ֫;->mObserver:Ll/֨ۡ֫;

    invoke-virtual {p1, v0}, Ll/֡ۡ֫;->֫(Ll/֨ۡ֫;)V

    .line 468
    iget-boolean p1, p0, Ll/ۤܳ֫;->mShownByMe:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 471
    iput-boolean p1, p0, Ll/ۤܳ֫;->mDismissed:Z

    :cond_0
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 492
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onCreate(Landroid/os/Bundle;)V

    .line 494
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Ll/ۤܳ֫;->mHandler:Landroid/os/Handler;

    .line 496
    iget v0, p0, Ll/ۡ᩻֫;->mContainerId:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    .line 499
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۤܳ֫;->mStyle:I

    const-string v0, "android:theme"

    .line 500
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۤܳ֫;->mTheme:I

    const-string v0, "android:cancelable"

    .line 501
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۤܳ֫;->mCancelable:Z

    const-string v0, "android:showsDialog"

    .line 502
    iget-boolean v1, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    .line 503
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Ll/ۤܳ֫;->mBackStackId:I

    :cond_1
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    const/4 p1, 0x3

    .line 633
    invoke-static {p1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 634
    invoke-virtual {p0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 636
    :cond_0
    new-instance p1, Ll/ۜܽ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤܳ֫;->getTheme()I

    move-result v1

    invoke-direct {p1, v0, v1}, Ll/ۜܽ;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public onDestroyView()V
    .locals 2

    .line 778
    invoke-super {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    .line 779
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 783
    iput-boolean v1, p0, Ll/ۤܳ֫;->mViewDestroyed:Z

    const/4 v1, 0x0

    .line 787
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 788
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 789
    iget-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    if-nez v0, :cond_0

    .line 792
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    invoke-virtual {p0, v0}, Ll/ۤܳ֫;->onDismiss(Landroid/content/DialogInterface;)V

    .line 794
    :cond_0
    iput-object v1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    const/4 v0, 0x0

    .line 795
    iput-boolean v0, p0, Ll/ۤܳ֫;->mDialogCreated:Z

    :cond_1
    return-void
.end method

.method public onDetach()V
    .locals 2

    .line 478
    invoke-super {p0}, Ll/ۡ᩻֫;->onDetach()V

    .line 479
    iget-boolean v0, p0, Ll/ۤܳ֫;->mShownByMe:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 483
    iput-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    .line 485
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewLifecycleOwnerLiveData()Ll/֡ۡ֫;

    move-result-object v0

    iget-object v1, p0, Ll/ۤܳ֫;->mObserver:Ll/֨ۡ֫;

    invoke-virtual {v0, v1}, Ll/֡ۡ֫;->ۧ(Ll/֨ۡ֫;)V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 645
    iget-boolean p1, p0, Ll/ۤܳ֫;->mViewDestroyed:Z

    if-nez p1, :cond_1

    const/4 p1, 0x3

    .line 650
    invoke-static {p1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 651
    invoke-virtual {p0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 653
    invoke-direct {p0, v0, v0, p1}, Ll/ۤܳ֫;->֫(ZZZ)V

    :cond_1
    return-void
.end method

.method public onFindViewById(I)Landroid/view/View;
    .locals 1

    .line 546
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 547
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 3

    .line 566
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 567
    iget-boolean v1, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Ll/ۤܳ֫;->mCreatingDialog:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 579
    :cond_0
    invoke-direct {p0, p1}, Ll/ۤܳ֫;->֫(Landroid/os/Bundle;)V

    .line 581
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 582
    invoke-virtual {p0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 585
    :cond_1
    iget-object p1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz p1, :cond_3

    .line 586
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1

    .line 568
    :cond_2
    :goto_0
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 569
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "getting layout inflater for DialogFragment "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    return-object v0
.end method

.method public onHasView()Z
    .locals 1

    .line 553
    iget-boolean v0, p0, Ll/ۤܳ֫;->mDialogCreated:Z

    return v0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 740
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 741
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 742
    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:dialogShowing"

    const/4 v2, 0x0

    .line 743
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "android:savedDialogState"

    .line 744
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 746
    :cond_0
    iget v0, p0, Ll/ۤܳ֫;->mStyle:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    .line 747
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 749
    :cond_1
    iget v0, p0, Ll/ۤܳ֫;->mTheme:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    .line 750
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 752
    :cond_2
    iget-boolean v0, p0, Ll/ۤܳ֫;->mCancelable:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    .line 753
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 755
    :cond_3
    iget-boolean v0, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    .line 756
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 758
    :cond_4
    iget v0, p0, Ll/ۤܳ֫;->mBackStackId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    .line 759
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 724
    invoke-super {p0}, Ll/ۡ᩻֫;->onStart()V

    .line 726
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 727
    iput-boolean v1, p0, Ll/ۤܳ֫;->mViewDestroyed:Z

    .line 728
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 730
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 731
    invoke-static {v0, p0}, Ll/ۛܺ֫;->֫(Landroid/view/View;Ll/᩻ۡ֫;)V

    const v1, 0x7f0a068c

    .line 38
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 733
    invoke-static {v0, p0}, Ll/ۗ᩻ۚ;->֫(Landroid/view/View;Ll/᩹۫ۧ;)V

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 766
    invoke-super {p0}, Ll/ۡ᩻֫;->onStop()V

    .line 767
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 768
    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 1

    .line 692
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 693
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "android:savedDialogState"

    .line 694
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 696
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    .line 510
    invoke-super {p0, p1, p2, p3}, Ll/ۡ᩻֫;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 513
    iget-object p1, p0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-nez p1, :cond_0

    .line 514
    iget-object p1, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "android:savedDialogState"

    .line 515
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 517
    iget-object p2, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final requireDialog()Landroid/app/Dialog;
    .locals 3

    .line 400
    invoke-virtual {p0}, Ll/ۤܳ֫;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 402
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DialogFragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " does not have a Dialog."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setCancelable(Z)V
    .locals 1

    .line 422
    iput-boolean p1, p0, Ll/ۤܳ֫;->mCancelable:Z

    .line 423
    iget-object v0, p0, Ll/ۤܳ֫;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_0
    return-void
.end method

.method public setShowsDialog(Z)V
    .locals 0

    .line 453
    iput-boolean p1, p0, Ll/ۤܳ֫;->mShowsDialog:Z

    return-void
.end method

.method public setStyle(II)V
    .locals 2

    const/4 v0, 0x2

    .line 232
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 233
    invoke-virtual {p0}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 236
    :cond_0
    iput p1, p0, Ll/ۤܳ֫;->mStyle:I

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    :cond_1
    const p1, 0x1030059

    .line 238
    iput p1, p0, Ll/ۤܳ֫;->mTheme:I

    :cond_2
    if-eqz p2, :cond_3

    .line 241
    iput p2, p0, Ll/ۤܳ֫;->mTheme:I

    :cond_3
    return-void
.end method

.method public setupDialog(Landroid/app/Dialog;I)V
    .locals 2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    return-void

    .line 596
    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_1

    const/16 v1, 0x18

    .line 598
    invoke-virtual {p2, v1}, Landroid/view/Window;->addFlags(I)V

    .line 604
    :cond_1
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    return-void
.end method

.method public show(Ll/ܽ᩷֫;Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    .line 275
    iput-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    const/4 v1, 0x1

    .line 276
    iput-boolean v1, p0, Ll/ۤܳ֫;->mShownByMe:Z

    .line 224
    invoke-virtual {p1, v0, p0, p2, v1}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    .line 278
    iput-boolean v0, p0, Ll/ۤܳ֫;->mViewDestroyed:Z

    .line 279
    check-cast p1, Ll/ᩳܳ֫;

    .line 306
    invoke-virtual {p1, v0}, Ll/ᩳܳ֫;->֫(Z)I

    move-result p1

    .line 279
    iput p1, p0, Ll/ۤܳ֫;->mBackStackId:I

    return p1
.end method

.method public show(Ll/ۚۜ֫;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 257
    iput-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    const/4 v1, 0x1

    .line 258
    iput-boolean v1, p0, Ll/ۤܳ֫;->mShownByMe:Z

    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    new-instance v2, Ll/ᩳܳ֫;

    invoke-direct {v2, p1}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 855
    iput-boolean v1, v2, Ll/ܽ᩷֫;->ۖ:Z

    .line 224
    invoke-virtual {v2, v0, p0, p2, v1}, Ll/ᩳܳ֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    .line 306
    invoke-virtual {v2, v0}, Ll/ᩳܳ֫;->֫(Z)I

    return-void
.end method

.method public showNow(Ll/ۚۜ֫;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 295
    iput-boolean v0, p0, Ll/ۤܳ֫;->mDismissed:Z

    const/4 v1, 0x1

    .line 296
    iput-boolean v1, p0, Ll/ۤܳ֫;->mShownByMe:Z

    .line 297
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    new-instance v2, Ll/ᩳܳ֫;

    invoke-direct {v2, p1}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 855
    iput-boolean v1, v2, Ll/ܽ᩷֫;->ۖ:Z

    .line 224
    invoke-virtual {v2, v0, p0, p2, v1}, Ll/ᩳܳ֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    .line 300
    invoke-virtual {v2}, Ll/ᩳܳ֫;->ᩳ()V

    return-void
.end method
