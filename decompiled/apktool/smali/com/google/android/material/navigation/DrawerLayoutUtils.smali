.class public Lcom/google/android/material/navigation/DrawerLayoutUtils;
.super Ljava/lang/Object;
.source "DrawerLayoutUtils.java"


# static fields
.field public static final DEFAULT_SCRIM_ALPHA:I

.field public static final DEFAULT_SCRIM_COLOR:I = -0x67000000


# direct methods
.method public static synthetic $r8$lambda$Q0EfB5Np2_kRW5ayeCHnYQx1LkA(Ll/۬ۧ֫;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lcom/google/android/material/navigation/DrawerLayoutUtils;->lambda$getScrimCloseAnimatorUpdateListener$0(Ll/۬ۧ֫;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 1

    const/high16 v0, -0x67000000

    .line 41
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    sput v0, Lcom/google/android/material/navigation/DrawerLayoutUtils;->DEFAULT_SCRIM_ALPHA:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getScrimCloseAnimatorListener(Ll/۬ۧ֫;Landroid/view/View;)Landroid/animation/Animator$AnimatorListener;
    .locals 1

    .line 65
    new-instance v0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;-><init>(Ll/۬ۧ֫;Landroid/view/View;)V

    return-object v0
.end method

.method public static getScrimCloseAnimatorUpdateListener(Ll/۬ۧ֫;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;
    .locals 1

    .line 51
    new-instance v0, Lcom/google/android/material/navigation/DrawerLayoutUtils$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/DrawerLayoutUtils$$ExternalSyntheticLambda0;-><init>(Ll/۬ۧ֫;)V

    return-object v0
.end method

.method public static synthetic lambda$getScrimCloseAnimatorUpdateListener$0(Ll/۬ۧ֫;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 52
    sget v0, Lcom/google/android/material/navigation/DrawerLayoutUtils;->DEFAULT_SCRIM_ALPHA:I

    const/4 v1, 0x0

    .line 53
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(IIF)I

    move-result p1

    const/high16 v0, -0x67000000

    .line 54
    invoke-static {v0, p1}, Ll/۟ۗ;->ܽ(II)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->ܳ(I)V

    return-void
.end method
