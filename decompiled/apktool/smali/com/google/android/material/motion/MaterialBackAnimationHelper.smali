.class public abstract Lcom/google/android/material/motion/MaterialBackAnimationHelper;
.super Ljava/lang/Object;
.source "MaterialBackAnimationHelper.java"


# static fields
.field public static final CANCEL_DURATION_DEFAULT:I = 0x64

.field public static final HIDE_DURATION_MAX_DEFAULT:I = 0x12c

.field public static final HIDE_DURATION_MIN_DEFAULT:I = 0x96

.field public static final TAG:Ljava/lang/String; = "MaterialBackHelper"


# instance fields
.field public backEvent:Ll/᩶ۧ;

.field public final cancelDuration:I

.field public final hideDurationMax:I

.field public final hideDurationMin:I

.field public final progressInterpolator:Landroid/animation/TimeInterpolator;

.field public final view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 58
    sget v0, Ll/ᩳ۠ܺ;->۟᩸:I

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    .line 62
    invoke-static {v1, v1, v1, v2}, Ll/۠۟;->֫(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v1

    .line 59
    invoke-static {p1, v0, v1}, Lcom/google/android/material/motion/MotionUtils;->resolveThemeInterpolator(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->progressInterpolator:Landroid/animation/TimeInterpolator;

    .line 63
    sget v0, Ll/ᩳ۠ܺ;->֡᩸:I

    const/16 v1, 0x12c

    .line 64
    invoke-static {p1, v0, v1}, Lcom/google/android/material/motion/MotionUtils;->resolveThemeDuration(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->hideDurationMax:I

    .line 66
    sget v0, Ll/ᩳ۠ܺ;->᩸᩸:I

    const/16 v1, 0x96

    .line 67
    invoke-static {p1, v0, v1}, Lcom/google/android/material/motion/MotionUtils;->resolveThemeDuration(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->hideDurationMin:I

    .line 69
    sget v0, Ll/ᩳ۠ܺ;->ܶ᩸:I

    const/16 v1, 0x64

    .line 70
    invoke-static {p1, v0, v1}, Lcom/google/android/material/motion/MotionUtils;->resolveThemeDuration(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->cancelDuration:I

    return-void
.end method


# virtual methods
.method public interpolateProgress(F)F
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->progressInterpolator:Landroid/animation/TimeInterpolator;

    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    return p1
.end method

.method public onCancelBackProgress()Ll/᩶ۧ;
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->backEvent:Ll/᩶ۧ;

    const/4 v1, 0x0

    .line 107
    iput-object v1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->backEvent:Ll/᩶ۧ;

    return-object v0
.end method

.method public onHandleBackInvoked()Ll/᩶ۧ;
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->backEvent:Ll/᩶ۧ;

    const/4 v1, 0x0

    .line 95
    iput-object v1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->backEvent:Ll/᩶ۧ;

    return-object v0
.end method

.method public onStartBackProgress(Ll/᩶ۧ;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->backEvent:Ll/᩶ۧ;

    return-void
.end method

.method public onUpdateBackProgress(Ll/᩶ۧ;)Ll/᩶ۧ;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->backEvent:Ll/᩶ۧ;

    .line 88
    iput-object p1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->backEvent:Ll/᩶ۧ;

    return-object v0
.end method
