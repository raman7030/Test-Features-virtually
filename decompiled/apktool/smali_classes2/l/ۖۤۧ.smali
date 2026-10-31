.class public final Ll/ۖۤۧ;
.super Ljava/lang/Object;
.source "D5XC"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/᩵ۤۧ;

.field public final synthetic ۧ:Ll/ᩴۤۧ;


# direct methods
.method public constructor <init>(Ll/᩵ۤۧ;Ll/ᩴۤۧ;)V
    .locals 0

    .line 569
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۤۧ;->֫:Ll/᩵ۤۧ;

    iput-object p2, p0, Ll/ۖۤۧ;->ۧ:Ll/ᩴۤۧ;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 572
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 573
    iget-object v0, p0, Ll/ۖۤۧ;->ۧ:Ll/ᩴۤۧ;

    invoke-static {p1, v0}, Ll/᩵ۤۧ;->֫(FLl/ᩴۤۧ;)V

    const/4 v1, 0x0

    .line 574
    iget-object v2, p0, Ll/ۖۤۧ;->֫:Ll/᩵ۤۧ;

    invoke-virtual {v2, p1, v0, v1}, Ll/᩵ۤۧ;->֫(FLl/ᩴۤۧ;Z)V

    .line 575
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
