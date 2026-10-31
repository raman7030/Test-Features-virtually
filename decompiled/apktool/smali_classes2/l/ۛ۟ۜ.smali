.class public final synthetic Ll/ۛ۟ۜ;
.super Ljava/lang/Object;
.source "59KW"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/ۨ۟ۜ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:I


# direct methods
.method public synthetic constructor <init>(Ll/ۨ۟ۜ;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ۟ۜ;->֫:Ll/ۨ۟ۜ;

    iput p2, p0, Ll/ۛ۟ۜ;->ۧ:I

    iput p3, p0, Ll/ۛ۟ۜ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 191
    iget-object v0, p0, Ll/ۛ۟ۜ;->֫:Ll/ۨ۟ۜ;

    iget-object v0, v0, Ll/ۨ۟ۜ;->ۙ:Ll/ܰ۟ۜ;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Ll/ܰ۟ۜ;->֫(Ll/ܰ۟ۜ;F)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 192
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    sub-float/2addr v1, p1

    .line 193
    iget p1, p0, Ll/ۛ۟ۜ;->ۧ:I

    int-to-float p1, p1

    mul-float p1, p1, v1

    float-to-int p1, p1

    iget v2, p0, Ll/ۛ۟ۜ;->ܽ:I

    int-to-float v2, v2

    mul-float v2, v2, v1

    float-to-int v1, v2

    invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollTo(II)V

    .line 194
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method
