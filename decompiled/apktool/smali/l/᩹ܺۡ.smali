.class public final Ll/᩹ܺۡ;
.super Ljava/lang/Object;
.source "K5RN"


# static fields
.field public static final ֫:Landroid/graphics/Path;

.field public static final ۧ:Landroid/graphics/Path;

.field public static final ܽ:Landroid/graphics/Path;

.field public static final ᩳ:Landroid/graphics/Path;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 28
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    sput-object v7, Ll/᩹ܺۡ;->ۧ:Landroid/graphics/Path;

    const v0, -0x3bfd599a    # -522.6f

    const/4 v8, 0x0

    .line 29
    invoke-virtual {v7, v0, v8}, Landroid/graphics/Path;->moveTo(FF)V

    const v5, 0x43969bd0

    const/4 v9, 0x0

    const v1, 0x42439950

    const/4 v10, 0x0

    const v3, 0x432606cd

    const/4 v11, 0x0

    move-object v0, v7

    move v2, v10

    move v4, v11

    move v6, v9

    .line 30
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    const v5, 0x43d27dc9

    const v1, 0x434594cf

    const v3, 0x43d27dc9

    .line 32
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 42
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    sput-object v0, Ll/᩹ܺۡ;->֫:Landroid/graphics/Path;

    const v1, 0x3dcccccd    # 0.1f

    .line 43
    invoke-virtual {v0, v8, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const v2, 0x3f53ac64

    const/high16 v3, 0x3f800000    # 1.0f

    .line 44
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v2, 0x40000000    # 2.0f

    .line 45
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 55
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    sput-object v0, Ll/᩹ܺۡ;->ᩳ:Landroid/graphics/Path;

    const v4, -0x3cba6666    # -197.6f

    .line 56
    invoke-virtual {v0, v4, v8}, Landroid/graphics/Path;->moveTo(FF)V

    const v14, 0x43078c01

    const/4 v4, 0x0

    const v10, 0x41648256

    const/4 v5, 0x0

    const v12, 0x42aa27d8

    const/4 v6, 0x0

    move-object v9, v0

    move v11, v5

    move v13, v6

    move v15, v4

    .line 57
    invoke-virtual/range {v9 .. v15}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    const v14, 0x43283e4a

    const v10, 0x42590c32

    const v12, 0x42b4d966

    .line 59
    invoke-virtual/range {v9 .. v15}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    const v14, 0x439e3475

    const v10, 0x4310b8b7

    const v12, 0x439e3475

    .line 61
    invoke-virtual/range {v9 .. v15}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 72
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    sput-object v0, Ll/᩹ܺۡ;->ܽ:Landroid/graphics/Path;

    .line 73
    invoke-virtual {v0, v8, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const v4, 0x3f1245ed

    .line 74
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    const v3, 0x3f68f280

    .line 75
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v2, 0x40400000    # 3.0f

    .line 76
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)Landroid/animation/AnimatorSet;
    .locals 7

    .line 88
    sget-object v0, Ll/᩹ܺۡ;->ۧ:Landroid/graphics/Path;

    const-string v1, "translateX"

    const/4 v2, 0x0

    .line 28
    invoke-static {p0, v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v3, 0x7d0

    .line 90
    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 91
    sget-object v1, Ll/ۨܺۡ;->֫:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v1, -0x1

    .line 93
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-string v5, "scaleX"

    .line 95
    sget-object v6, Ll/᩹ܺۡ;->֫:Landroid/graphics/Path;

    .line 28
    invoke-static {p0, v2, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object p0

    .line 97
    invoke-virtual {p0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 98
    sget-object v2, Ll/ۛܺۡ;->֫:Landroid/view/animation/Interpolator;

    invoke-virtual {p0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 100
    invoke-virtual {p0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 102
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/animation/Animator;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p0, v2, v0

    .line 103
    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object v1
.end method

.method public static ۧ(Ljava/lang/Object;)Landroid/animation/AnimatorSet;
    .locals 7

    .line 116
    sget-object v0, Ll/᩹ܺۡ;->ᩳ:Landroid/graphics/Path;

    const-string v1, "translateX"

    const/4 v2, 0x0

    .line 28
    invoke-static {p0, v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v3, 0x7d0

    .line 118
    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 119
    sget-object v1, Ll/ܰܺۡ;->֫:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v1, -0x1

    .line 121
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-string v5, "scaleX"

    .line 123
    sget-object v6, Ll/᩹ܺۡ;->ܽ:Landroid/graphics/Path;

    .line 28
    invoke-static {p0, v2, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object p0

    .line 125
    invoke-virtual {p0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 126
    sget-object v2, Ll/᩺ܺۡ;->֫:Landroid/view/animation/Interpolator;

    invoke-virtual {p0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 128
    invoke-virtual {p0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 130
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/animation/Animator;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p0, v2, v0

    .line 131
    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object v1
.end method
