.class public abstract Lcom/google/android/material/sidesheet/SheetDialog;
.super Ll/۠ܳ;
.source "SheetDialog.java"


# static fields
.field public static final COORDINATOR_LAYOUT_ID:I

.field public static final TOUCH_OUTSIDE_ID:I


# instance fields
.field public backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

.field public behavior:Lcom/google/android/material/sidesheet/Sheet;

.field public cancelable:Z

.field public canceledOnTouchOutside:Z

.field public canceledOnTouchOutsideSet:Z

.field public container:Landroid/widget/FrameLayout;

.field public dismissWithAnimation:Z

.field public sheet:Landroid/widget/FrameLayout;


# direct methods
.method public static synthetic $r8$lambda$mcfSNnLeC1nhFpP-13QvN-GQH5Q(Lcom/google/android/material/sidesheet/SheetDialog;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/google/android/material/sidesheet/SheetDialog;->lambda$wrapInSheet$0(Landroid/view/View;)V

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 1

    .line 55
    sget v0, Ll/᩷۠ܺ;->۫ۧ:I

    sput v0, Lcom/google/android/material/sidesheet/SheetDialog;->COORDINATOR_LAYOUT_ID:I

    .line 56
    sget v0, Ll/᩷۠ܺ;->ۧۡ:I

    sput v0, Lcom/google/android/material/sidesheet/SheetDialog;->TOUCH_OUTSIDE_ID:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;III)V
    .locals 0

    .line 75
    invoke-static {p1, p2, p3, p4}, Lcom/google/android/material/sidesheet/SheetDialog;->getThemeResId(Landroid/content/Context;III)I

    move-result p2

    invoke-direct {p0, p1, p2}, Ll/۠ܳ;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    .line 65
    iput-boolean p1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->canceledOnTouchOutside:Z

    .line 78
    invoke-virtual {p0, p1}, Ll/۠ܳ;->supportRequestWindowFeature(I)Z

    return-void
.end method

.method private ensureContainerAndBehavior()V
    .locals 3

    .line 214
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->container:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    .line 215
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->getLayoutResId()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->container:Landroid/widget/FrameLayout;

    .line 216
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->getDialogId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    .line 217
    invoke-virtual {p0, v0}, Lcom/google/android/material/sidesheet/SheetDialog;->getBehaviorFromSheet(Landroid/widget/FrameLayout;)Lcom/google/android/material/sidesheet/Sheet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->behavior:Lcom/google/android/material/sidesheet/Sheet;

    .line 218
    invoke-virtual {p0, v0}, Lcom/google/android/material/sidesheet/SheetDialog;->addSheetCancelOnHideCallback(Lcom/google/android/material/sidesheet/Sheet;)V

    .line 219
    new-instance v0, Lcom/google/android/material/motion/MaterialBackOrchestrator;

    iget-object v1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->behavior:Lcom/google/android/material/sidesheet/Sheet;

    iget-object v2, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    invoke-direct {v0, v1, v2}, Lcom/google/android/material/motion/MaterialBackOrchestrator;-><init>(Lcom/google/android/material/motion/MaterialBackHandler;Landroid/view/View;)V

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    :cond_0
    return-void
.end method

.method private getContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->container:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    .line 228
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->ensureContainerAndBehavior()V

    .line 230
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->container:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method private getSheet()Landroid/widget/FrameLayout;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    .line 236
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->ensureContainerAndBehavior()V

    .line 238
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public static getThemeResId(Landroid/content/Context;III)I
    .locals 1

    if-nez p1, :cond_1

    .line 365
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 366
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, p2, p1, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 367
    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0

    :cond_0
    return p3

    :cond_1
    return p1
.end method

.method private synthetic lambda$wrapInSheet$0(Landroid/view/View;)V
    .locals 0

    .line 271
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->shouldWindowCloseOnTouchOutside()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 272
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->cancel()V

    :cond_0
    return-void
.end method

.method private maybeUpdateWindowAnimationsBasedOnLayoutDirection()V
    .locals 4

    .line 331
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 332
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_1

    .line 334
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v1, v1, Ll/ܰ᩸;

    if-eqz v1, :cond_1

    .line 335
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    .line 336
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܰ᩸;

    .line 337
    iget v1, v1, Ll/ܰ᩸;->ܽ:I

    iget-object v2, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    .line 339
    sget v3, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    .line 134
    invoke-static {v1, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    .line 342
    sget v1, Ll/ᩴ۠ܺ;->᩷:I

    goto :goto_0

    .line 343
    :cond_0
    sget v1, Ll/ᩴ۠ܺ;->ۢ:I

    .line 340
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    :cond_1
    return-void
.end method

.method private shouldWindowCloseOnTouchOutside()Z
    .locals 3

    .line 348
    iget-boolean v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->canceledOnTouchOutsideSet:Z

    if-nez v0, :cond_0

    .line 350
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x101035b

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 351
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->canceledOnTouchOutside:Z

    .line 352
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 353
    iput-boolean v2, p0, Lcom/google/android/material/sidesheet/SheetDialog;->canceledOnTouchOutsideSet:Z

    .line 355
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->canceledOnTouchOutside:Z

    return v0
.end method

.method private updateListeningForBackCallbacks()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    if-nez v0, :cond_0

    return-void

    .line 132
    :cond_0
    iget-boolean v1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    if-eqz v1, :cond_1

    .line 133
    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->startListeningForBackCallbacks()V

    return-void

    .line 135
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->stopListeningForBackCallbacks()V

    return-void
.end method

.method private wrapInSheet(ILandroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/View;
    .locals 2

    .line 252
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->ensureContainerAndBehavior()V

    .line 253
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    sget v1, Lcom/google/android/material/sidesheet/SheetDialog;->COORDINATOR_LAYOUT_ID:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ᩳ᩹;

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    .line 256
    invoke-virtual {p0}, Landroid/app/Dialog;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 259
    :cond_0
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->getSheet()Landroid/widget/FrameLayout;

    move-result-object p1

    .line 260
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    if-nez p3, :cond_1

    .line 262
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 264
    :cond_1
    invoke-virtual {p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 267
    :goto_0
    sget p1, Lcom/google/android/material/sidesheet/SheetDialog;->TOUCH_OUTSIDE_ID:I

    .line 268
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/google/android/material/sidesheet/SheetDialog$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0}, Lcom/google/android/material/sidesheet/SheetDialog$$ExternalSyntheticLambda0;-><init>(Lcom/google/android/material/sidesheet/SheetDialog;)V

    .line 269
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->getSheet()Landroid/widget/FrameLayout;

    move-result-object p1

    new-instance p2, Lcom/google/android/material/sidesheet/SheetDialog$1;

    invoke-direct {p2, p0}, Lcom/google/android/material/sidesheet/SheetDialog$1;-><init>(Lcom/google/android/material/sidesheet/SheetDialog;)V

    .line 277
    invoke-static {p1, p2}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    .line 301
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->container:Landroid/widget/FrameLayout;

    return-object p1
.end method


# virtual methods
.method public abstract addSheetCancelOnHideCallback(Lcom/google/android/material/sidesheet/Sheet;)V
.end method

.method public cancel()V
    .locals 3

    .line 175
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->getBehavior()Lcom/google/android/material/sidesheet/Sheet;

    move-result-object v0

    .line 177
    iget-boolean v1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->dismissWithAnimation:Z

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lcom/google/android/material/sidesheet/Sheet;->getState()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    invoke-interface {v0, v2}, Lcom/google/android/material/sidesheet/Sheet;->setState(I)V

    return-void

    .line 178
    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V

    return-void
.end method

.method public getBehavior()Lcom/google/android/material/sidesheet/Sheet;
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->behavior:Lcom/google/android/material/sidesheet/Sheet;

    if-nez v0, :cond_0

    .line 245
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->ensureContainerAndBehavior()V

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->behavior:Lcom/google/android/material/sidesheet/Sheet;

    return-object v0
.end method

.method public abstract getBehaviorFromSheet(Landroid/widget/FrameLayout;)Lcom/google/android/material/sidesheet/Sheet;
.end method

.method public abstract getDialogId()I
.end method

.method public abstract getLayoutResId()I
.end method

.method public abstract getStateOnStart()I
.end method

.method public isDismissWithSheetAnimationEnabled()Z
    .locals 1

    .line 209
    iget-boolean v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->dismissWithAnimation:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 149
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 150
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->maybeUpdateWindowAnimationsBasedOnLayoutDirection()V

    .line 151
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->updateListeningForBackCallbacks()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 98
    invoke-super {p0, p1}, Ll/۠ܳ;->onCreate(Landroid/os/Bundle;)V

    .line 99
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 101
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    .line 103
    invoke-virtual {p1, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    const/high16 v1, -0x80000000

    .line 105
    invoke-virtual {p1, v1}, Landroid/view/Window;->addFlags(I)V

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const/high16 v0, 0x4000000

    .line 110
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    :cond_0
    const/4 v0, -0x1

    .line 113
    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setLayout(II)V

    :cond_1
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 156
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    .line 157
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->stopListeningForBackCallbacks()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 141
    invoke-super {p0}, Ll/ۜܽ;->onStart()V

    .line 142
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->behavior:Lcom/google/android/material/sidesheet/Sheet;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/material/sidesheet/Sheet;->getState()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 143
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->behavior:Lcom/google/android/material/sidesheet/Sheet;

    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->getStateOnStart()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/android/material/sidesheet/Sheet;->setState(I)V

    :cond_0
    return-void
.end method

.method public setCancelable(Z)V
    .locals 1

    .line 119
    invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 120
    iget-boolean v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    if-eq v0, p1, :cond_0

    .line 121
    iput-boolean p1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    .line 123
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 124
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->updateListeningForBackCallbacks()V

    :cond_1
    return-void
.end method

.method public setCanceledOnTouchOutside(Z)V
    .locals 2

    .line 186
    invoke-super {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 187
    iget-boolean v1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    if-nez v1, :cond_0

    .line 188
    iput-boolean v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    .line 190
    :cond_0
    iput-boolean p1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->canceledOnTouchOutside:Z

    .line 191
    iput-boolean v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->canceledOnTouchOutsideSet:Z

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    const/4 v0, 0x0

    .line 83
    invoke-direct {p0, p1, v0, v0}, Lcom/google/android/material/sidesheet/SheetDialog;->wrapInSheet(ILandroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/View;

    move-result-object p1

    invoke-super {p0, p1}, Ll/۠ܳ;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 88
    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/material/sidesheet/SheetDialog;->wrapInSheet(ILandroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/View;

    move-result-object p1

    invoke-super {p0, p1}, Ll/۠ܳ;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x0

    .line 93
    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/material/sidesheet/SheetDialog;->wrapInSheet(ILandroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/View;

    move-result-object p1

    invoke-super {p0, p1}, Ll/۠ܳ;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setDismissWithSheetAnimationEnabled(Z)V
    .locals 0

    .line 201
    iput-boolean p1, p0, Lcom/google/android/material/sidesheet/SheetDialog;->dismissWithAnimation:Z

    return-void
.end method

.method public setSheetEdge(I)V
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_2

    .line 318
    sget v1, Ll/ܿ᩺;->֫:I

    .line 3941
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-nez v0, :cond_1

    .line 323
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog;->sheet:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 324
    instance-of v1, v0, Ll/ܰ᩸;

    if-eqz v1, :cond_0

    .line 325
    check-cast v0, Ll/ܰ᩸;

    iput p1, v0, Ll/ܰ᩸;->ܽ:I

    .line 326
    invoke-direct {p0}, Lcom/google/android/material/sidesheet/SheetDialog;->maybeUpdateWindowAnimationsBasedOnLayoutDirection()V

    :cond_0
    return-void

    .line 319
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 315
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Sheet view reference is null; sheet edge cannot be changed if the sheet view is null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
