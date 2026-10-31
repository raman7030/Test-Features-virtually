.class public final Ll/ۖۙۧ;
.super Ljava/lang/Object;
.source "34UR"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/ۘۙۧ;


# direct methods
.method public constructor <init>(Ll/ۘۙۧ;)V
    .locals 0

    .line 577
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۙۧ;->֫:Ll/ۘۙۧ;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 582
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    .line 583
    iget-object v0, p0, Ll/ۖۙۧ;->֫:Ll/ۘۙۧ;

    iget-object v1, v0, Ll/ۘۙۧ;->᩶:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 584
    iget-object v1, v0, Ll/ۘۙۧ;->۬:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 585
    invoke-virtual {v0}, Ll/ۘۙۧ;->֫()V

    return-void
.end method
