.class public final Ll/ۘ᩷ۡ;
.super Ll/ۡ᩷ۡ;
.source "Y169"


# instance fields
.field public final ۧ:Landroid/graphics/drawable/Drawable;

.field public ܽ:Z

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩵᩷ۡ;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 796
    invoke-direct {p0, p1}, Ll/ۡ᩷ۡ;-><init>(Ll/᩵᩷ۡ;)V

    const/4 p1, 0x1

    .line 793
    iput-boolean p1, p0, Ll/ۘ᩷ۡ;->ܽ:Z

    .line 797
    iput-object p2, p0, Ll/ۘ᩷ۡ;->ۧ:Landroid/graphics/drawable/Drawable;

    .line 798
    iput p3, p0, Ll/ۘ᩷ۡ;->ᩳ:I

    .line 799
    invoke-virtual {p0}, Ll/ۘ᩷ۡ;->ܿ()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 849
    iget-object v0, p0, Ll/ۘ᩷ۡ;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/Rect;FF)V
    .locals 7

    .line 804
    iget-boolean v0, p0, Ll/ۘ᩷ۡ;->ܽ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x99

    goto :goto_0

    :cond_0
    const/16 v0, 0x33

    :goto_0
    int-to-float v0, v0

    mul-float v0, v0, p4

    float-to-int p4, v0

    iget-object v0, p0, Ll/ۘ᩷ۡ;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 805
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 806
    iget p4, p0, Ll/ۘ᩷ۡ;->ᩳ:I

    int-to-float p4, p4

    const/4 v1, 0x0

    cmpl-float v2, p4, v1

    if-eqz v2, :cond_7

    .line 808
    iget-object v2, p0, Ll/ۡ᩷ۡ;->֫:Ll/᩵᩷ۡ;

    invoke-static {v2}, Ll/᩵᩷ۡ;->ۧ(Ll/᩵᩷ۡ;)Ll/ᩴ᩷ۡ;

    move-result-object v3

    sget-object v4, Ll/ᩴ᩷ۡ;->᩶:Ll/ᩴ᩷ۡ;

    const v5, 0x3fc90fdb

    const/high16 v6, 0x3f800000    # 1.0f

    if-ne v3, v4, :cond_3

    cmpg-float v1, p3, v1

    if-gez v1, :cond_1

    const/4 p3, 0x0

    goto :goto_1

    :cond_1
    cmpl-float v1, p3, v6

    if-lez v1, :cond_2

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_2
    :goto_1
    mul-float p3, p3, v5

    float-to-double v1, p3

    .line 26
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float p3, v1

    goto :goto_3

    .line 810
    :cond_3
    invoke-static {v2}, Ll/᩵᩷ۡ;->ۧ(Ll/᩵᩷ۡ;)Ll/ᩴ᩷ۡ;

    move-result-object v2

    sget-object v3, Ll/ᩴ᩷ۡ;->ۗ:Ll/ᩴ᩷ۡ;

    if-ne v2, v3, :cond_6

    cmpg-float v1, p3, v1

    if-gez v1, :cond_4

    const/4 p3, 0x0

    goto :goto_2

    :cond_4
    cmpl-float v1, p3, v6

    if-lez v1, :cond_5

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_5
    :goto_2
    mul-float p3, p3, v5

    float-to-double v1, p3

    .line 52
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float p3, v1

    sub-float p3, v6, p3

    :cond_6
    :goto_3
    mul-float p4, p4, p3

    .line 815
    :cond_7
    iget p3, p2, Landroid/graphics/Rect;->left:I

    iget v1, p2, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, v1

    int-to-float p3, p3

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p3, v1

    .line 816
    iget v2, p2, Landroid/graphics/Rect;->top:I

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, p2

    int-to-float p2, v2

    div-float/2addr p2, v1

    .line 817
    invoke-virtual {p1, p4, p3, p2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 818
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-float p4, p4

    .line 819
    invoke-virtual {p1, p4, p3, p2}, Landroid/graphics/Canvas;->rotate(FFF)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 838
    iput-boolean p1, p0, Ll/ۘ᩷ۡ;->ܽ:Z

    .line 839
    iget-object p1, p0, Ll/ۡ᩷ۡ;->֫:Ll/᩵᩷ۡ;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 844
    iget-object v0, p0, Ll/ۘ᩷ۡ;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 824
    iget-boolean v0, p0, Ll/ۘ᩷ۡ;->ܽ:Z

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 834
    iget-object v0, p0, Ll/ۡ᩷ۡ;->֫:Ll/᩵᩷ۡ;

    invoke-static {v0}, Ll/᩵᩷ۡ;->ܽ(Ll/᩵᩷ۡ;)Landroid/graphics/ColorFilter;

    move-result-object v0

    iget-object v1, p0, Ll/ۘ᩷ۡ;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 829
    iget-boolean v0, p0, Ll/ۘ᩷ۡ;->ܽ:Z

    return v0
.end method
