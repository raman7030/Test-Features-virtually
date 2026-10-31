.class public abstract Ll/ۙ֨ۘ;
.super Landroid/widget/FrameLayout;
.source "L7JV"


# static fields
.field public static final synthetic ۤ:I


# instance fields
.field public ۗ:F

.field public ۙ:F

.field public ۫:Ll/᩷۠ۘ;

.field public ۬:F

.field public ᩶:I

.field public final ᩸:Ljava/util/ArrayList;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Ll/ۙ֨ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 69
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    const/4 p3, 0x1

    .line 71
    iput-boolean p3, p0, Ll/ۙ֨ۘ;->᩹:Z

    const v0, -0xff0001

    .line 72
    iput v0, p0, Ll/ۙ֨ۘ;->᩶:I

    .line 78
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶֨ۘ;->֫()F

    move-result v1

    invoke-virtual {p0, v1}, Ll/ۙ֨ۘ;->֫(F)F

    move-result v1

    iput v1, p0, Ll/ۙ֨ۘ;->ۗ:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v1, v2

    .line 79
    iput v2, p0, Ll/ۙ֨ۘ;->ۙ:F

    .line 80
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩶֨ۘ;->ۧ()F

    move-result v3

    invoke-virtual {p0, v3}, Ll/ۙ֨ۘ;->֫(F)F

    move-result v3

    iput v3, p0, Ll/ۙ֨ۘ;->۬:F

    if-eqz p2, :cond_0

    .line 84
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩶֨ۘ;->ܺ()[I

    move-result-object v4

    const/4 v5, 0x0

    .line 59
    invoke-virtual {p1, p2, v4, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 85
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩶֨ۘ;->᩻()I

    move-result p2

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    .line 74
    iput p2, p0, Ll/ۙ֨ۘ;->᩶:I

    .line 75
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۢ()V

    .line 86
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩶֨ۘ;->ۢ()I

    move-result p2

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Ll/ۙ֨ۘ;->ۗ:F

    .line 87
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩶֨ۘ;->᩷()I

    move-result p2

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Ll/ۙ֨ۘ;->ۙ:F

    .line 88
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩶֨ۘ;->ۡ()I

    move-result p2

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Ll/ۙ֨ۘ;->۬:F

    .line 89
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۜ()Ll/᩶֨ۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩶֨ۘ;->ܿ()I

    move-result p2

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ll/ۙ֨ۘ;->᩹:Z

    .line 59
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۙ֨ۘ;)V
    .locals 4

    .line 112
    iget-object v0, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/᩷۠ۘ;->֫()I

    move-result v0

    .line 113
    iget-object v1, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v2, v0, :cond_0

    .line 114
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {p0, v2, v0}, Ll/ۙ֨ۘ;->֫(II)V

    goto :goto_1

    .line 115
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, v0, :cond_1

    .line 116
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    .line 142
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۡ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 153
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۢ()V

    .line 1915
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 169
    iget v2, p0, Ll/ۙ֨ۘ;->ۗ:F

    float-to-int v2, v2

    invoke-static {v2, v1}, Ll/ۛ֨ۘ;->֫(ILandroid/view/View;)V

    goto :goto_2

    .line 160
    :cond_2
    iget-object v0, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/᩷۠ۘ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 161
    iget-object v0, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/᩷۠ۘ;->ܿ()V

    .line 162
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->֫()Ll/ۨ֨ۘ;

    move-result-object v0

    .line 163
    iget-object v1, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Ll/᩷۠ۘ;->֫(Ll/ۨ֨ۘ;)V

    .line 164
    iget-object p0, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    invoke-static {p0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ll/᩷۠ۘ;->ۧ()I

    move-result p0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ll/ۨ֨ۘ;->֫(FI)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 2

    .line 107
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 108
    new-instance v0, Ll/᩹ܶ᩷;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0}, Ll/᩹ܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 213
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 214
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    .line 215
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    const/high16 p1, 0x43340000    # 180.0f

    .line 216
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotation(F)V

    .line 217
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 222
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 223
    new-instance p1, Ll/ۘ᩷ᩳ;

    const/16 v0, 0x8

    invoke-direct {p1, v0, p0}, Ll/ۘ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫(F)F
    .locals 1

    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, p1

    return v0
.end method

.method public abstract ֫()Ll/ۨ֨ۘ;
.end method

.method public abstract ֫(I)V
.end method

.method public final ֫(II)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v1, p1, v0

    .line 136
    invoke-virtual {p0, v1}, Ll/ۙ֨ۘ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩷۠ۘ;)V
    .locals 0

    .line 94
    iput-object p1, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    return-void
.end method

.method public abstract ۜ()Ll/᩶֨ۘ;
.end method

.method public abstract ۡ()V
.end method

.method public final ۢ()V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 122
    invoke-virtual {p0, v1}, Ll/ۙ֨ۘ;->ۧ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract ۧ(I)V
.end method

.method public final ۧ()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/ۙ֨ۘ;->᩹:Z

    return v0
.end method

.method public final ܳ()F
    .locals 1

    .line 80
    iget v0, p0, Ll/ۙ֨ۘ;->۬:F

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ۙ֨ۘ;->᩶:I

    return v0
.end method

.method public final ܿ()F
    .locals 1

    .line 78
    iget v0, p0, Ll/ۙ֨ۘ;->ۗ:F

    return v0
.end method

.method public final ᩳ()F
    .locals 1

    .line 79
    iget v0, p0, Ll/ۙ֨ۘ;->ۙ:F

    return v0
.end method

.method public final ᩷()V
    .locals 2

    .line 147
    iget-object v0, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    if-nez v0, :cond_0

    return-void

    .line 150
    :cond_0
    new-instance v0, Ll/᩵᩺ᩳ;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ᩻()Ll/᩹֨ۘ;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۙ֨ۘ;->۫:Ll/᩷۠ۘ;

    return-object v0
.end method
