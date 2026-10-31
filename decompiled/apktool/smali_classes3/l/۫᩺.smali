.class public final Ll/۫᩺;
.super Ljava/lang/Object;
.source "R9NW"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/ܿܰ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:Ll/᩸ܰ;

.field public final synthetic ܿ:Landroid/view/View;

.field public final synthetic ᩳ:Ll/᩸ܰ;


# direct methods
.method public constructor <init>(Ll/ܿܰ;Ll/᩸ܰ;Ll/᩸ܰ;ILandroid/view/View;)V
    .locals 0

    .line 822
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩺;->֫:Ll/ܿܰ;

    iput-object p2, p0, Ll/۫᩺;->ᩳ:Ll/᩸ܰ;

    iput-object p3, p0, Ll/۫᩺;->ܽ:Ll/᩸ܰ;

    iput p4, p0, Ll/۫᩺;->ۧ:I

    iput-object p5, p0, Ll/۫᩺;->ܿ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 14

    .line 825
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget-object v0, p0, Ll/۫᩺;->֫:Ll/ܿܰ;

    invoke-virtual {v0, p1}, Ll/ܿܰ;->֫(F)V

    .line 829
    invoke-virtual {v0}, Ll/ܿܰ;->ۧ()F

    move-result p1

    .line 826
    sget v1, Ll/᩺᩺;->ܿ:I

    .line 708
    new-instance v1, Ll/᩻ܰ;

    iget-object v2, p0, Ll/۫᩺;->ᩳ:Ll/᩸ܰ;

    invoke-direct {v1, v2}, Ll/᩻ܰ;-><init>(Ll/᩸ܰ;)V

    const/4 v3, 0x1

    :goto_0
    const/16 v4, 0x100

    if-gt v3, v4, :cond_1

    .line 711
    iget v4, p0, Ll/۫᩺;->ۧ:I

    and-int/2addr v4, v3

    if-nez v4, :cond_0

    .line 712
    invoke-virtual {v2, v3}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ll/᩻ܰ;->֫(ILl/ۧ۬;)V

    goto :goto_1

    .line 715
    :cond_0
    invoke-virtual {v2, v3}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v4

    .line 716
    iget-object v5, p0, Ll/۫᩺;->ܽ:Ll/᩸ܰ;

    invoke-virtual {v5, v3}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v5

    .line 717
    iget v6, v4, Ll/ۧ۬;->ۧ:I

    iget v7, v5, Ll/ۧ۬;->ۧ:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v7, p1

    mul-float v6, v6, v7

    float-to-double v8, v6

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    add-double/2addr v8, v10

    double-to-int v6, v8

    iget v8, v4, Ll/ۧ۬;->ᩳ:I

    iget v9, v5, Ll/ۧ۬;->ᩳ:I

    sub-int/2addr v8, v9

    int-to-float v8, v8

    mul-float v8, v8, v7

    float-to-double v8, v8

    add-double/2addr v8, v10

    double-to-int v8, v8

    iget v9, v4, Ll/ۧ۬;->ܽ:I

    iget v12, v5, Ll/ۧ۬;->ܽ:I

    sub-int/2addr v9, v12

    int-to-float v9, v9

    mul-float v9, v9, v7

    float-to-double v12, v9

    add-double/2addr v12, v10

    double-to-int v9, v12

    iget v12, v4, Ll/ۧ۬;->֫:I

    iget v5, v5, Ll/ۧ۬;->֫:I

    sub-int/2addr v12, v5

    int-to-float v5, v12

    mul-float v5, v5, v7

    float-to-double v12, v5

    add-double/2addr v12, v10

    double-to-int v5, v12

    invoke-static {v4, v6, v8, v9, v5}, Ll/᩸ܰ;->֫(Ll/ۧ۬;IIII)Ll/ۧ۬;

    move-result-object v4

    .line 725
    invoke-virtual {v1, v3, v4}, Ll/᩻ܰ;->֫(ILl/ۧ۬;)V

    :goto_1
    shl-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 728
    :cond_1
    invoke-virtual {v1}, Ll/᩻ܰ;->֫()Ll/᩸ܰ;

    move-result-object p1

    .line 831
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 832
    iget-object v1, p0, Ll/۫᩺;->ܿ:Landroid/view/View;

    invoke-static {v1, p1, v0}, Ll/᩺᩺;->֫(Landroid/view/View;Ll/᩸ܰ;Ljava/util/List;)V

    return-void
.end method
