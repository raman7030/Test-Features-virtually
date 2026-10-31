.class public final Ll/ۤ֨ۘ;
.super Ll/ۙ֨ۘ;
.source "K7JY"


# static fields
.field public static final synthetic ۧ֫:I


# instance fields
.field public ֫֫:I

.field public final ۛ:Landroid/animation/ArgbEvaluator;

.field public ۟:Z

.field public ۨ:F

.field public ܰ:Landroid/widget/LinearLayout;

.field public ᩺:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, p2, v0}, Ll/ۤ֨ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0, p1, p2, p3}, Ll/ۙ֨ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    new-instance p1, Landroid/animation/ArgbEvaluator;

    invoke-direct {p1}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p1, p0, Ll/ۤ֨ۘ;->ۛ:Landroid/animation/ArgbEvaluator;

    .line 41
    new-instance p1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll/ۤ֨ۘ;->ܰ:Landroid/widget/LinearLayout;

    const/4 p3, 0x0

    .line 42
    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 43
    iget-object p1, p0, Ll/ۤ֨ۘ;->ܰ:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_3

    const/4 v0, -0x2

    invoke-virtual {p0, p1, v0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    const/high16 p1, 0x40200000    # 2.5f

    .line 45
    iput p1, p0, Ll/ۤ֨ۘ;->᩺:F

    if-eqz p2, :cond_1

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ll/ܳ᩻ܳ;->֫:[I

    .line 59
    invoke-virtual {v0, p2, v1, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/16 v0, 0x8

    const v1, -0xff0001

    .line 50
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    .line 30
    iput v0, p0, Ll/ۤ֨ۘ;->֫֫:I

    .line 31
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ۢ()V

    const/4 v0, 0x6

    .line 56
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    .line 55
    iput p1, p0, Ll/ۤ֨ۘ;->᩺:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    .line 62
    iput v0, p0, Ll/ۤ֨ۘ;->᩺:F

    :cond_0
    const/4 p1, 0x7

    .line 66
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    .line 65
    iput-boolean p1, p0, Ll/ۤ֨ۘ;->۟:Z

    const/4 p1, 0x3

    const/4 v0, 0x0

    .line 69
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    .line 68
    iput p1, p0, Ll/ۤ֨ۘ;->ۨ:F

    .line 59
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x5

    .line 75
    invoke-virtual {p0, p3, p1}, Ll/ۙ֨ۘ;->֫(II)V

    .line 76
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->᩷()V

    :cond_2
    return-void

    :cond_3
    const-string p1, "linearLayout"

    .line 43
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static final synthetic ֫(Ll/ۤ֨ۘ;)Landroid/animation/ArgbEvaluator;
    .locals 0

    .line 14
    iget-object p0, p0, Ll/ۤ֨ۘ;->ۛ:Landroid/animation/ArgbEvaluator;

    return-object p0
.end method

.method public static final synthetic ۧ(Ll/ۤ֨ۘ;)F
    .locals 0

    .line 14
    iget p0, p0, Ll/ۤ֨ۘ;->᩺:F

    return p0
.end method

.method public static final synthetic ܽ(Ll/ۤ֨ۘ;)Z
    .locals 0

    .line 14
    iget-boolean p0, p0, Ll/ۤ֨ۘ;->۟:Z

    return p0
.end method


# virtual methods
.method public final ֫()Ll/ۨ֨ۘ;
    .locals 1

    .line 121
    new-instance v0, Ll/۫֨ۘ;

    invoke-direct {v0, p0}, Ll/۫֨ۘ;-><init>(Ll/ۤ֨ۘ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 6

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0116

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a015e

    .line 84
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 85
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 87
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 89
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 90
    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 91
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܳ()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܳ()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v4, v2, v5, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 92
    new-instance v2, Ll/ۗ֨ۘ;

    invoke-direct {v2}, Ll/ۗ֨ۘ;-><init>()V

    .line 93
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ᩳ()F

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez p1, :cond_0

    .line 95
    iget v3, p0, Ll/ۤ֨ۘ;->֫֫:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܽ()I

    move-result v3

    :goto_0
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_2

    .line 97
    :cond_1
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object v3

    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v3, Ll/᩷۠ۘ;

    invoke-virtual {v3}, Ll/᩷۠ۘ;->ۧ()I

    move-result v3

    if-ne v3, p1, :cond_2

    iget v3, p0, Ll/ۤ֨ۘ;->֫֫:I

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܽ()I

    move-result v3

    :goto_1
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 99
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 101
    new-instance v2, Ll/۬֨ۘ;

    invoke-direct {v2, p0, p1}, Ll/۬֨ۘ;-><init>(Ll/ۤ֨ۘ;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    iget p1, p0, Ll/ۤ֨ۘ;->ۨ:F

    const v2, 0x3f4ccccd    # 0.8f

    mul-float p1, p1, v2

    float-to-int p1, p1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    invoke-virtual {v0, p1, v2, p1, v3}, Landroid/view/View;->setPadding(IIII)V

    const/4 p1, 0x2

    int-to-float p1, p1

    .line 108
    iget v2, p0, Ll/ۤ֨ۘ;->ۨ:F

    mul-float v2, v2, p1

    float-to-int p1, v2

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    invoke-virtual {v0, v2, p1, v3, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 111
    iget-object p1, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    iget-object p1, p0, Ll/ۤ֨ۘ;->ܰ:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_3
    const-string p1, "linearLayout"

    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۜ()Ll/᩶֨ۘ;
    .locals 1

    .line 195
    sget-object v0, Ll/᩶֨ۘ;->᩺:Ll/᩶֨ۘ;

    return-object v0
.end method

.method public final ۡ()V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "linearLayout"

    .line 116
    iget-object v2, p0, Ll/ۤ֨ۘ;->ܰ:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 117
    iget-object v0, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    return-void

    .line 116
    :cond_0
    invoke-static {v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I)V
    .locals 3

    .line 180
    iget-object v0, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    .line 181
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v2, v1, Ll/ۗ֨ۘ;

    if-eqz v2, :cond_0

    check-cast v1, Ll/ۗ֨ۘ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 184
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v2, Ll/᩷۠ۘ;

    invoke-virtual {v2}, Ll/᩷۠ۘ;->ۧ()I

    move-result v2

    if-eq p1, v2, :cond_2

    iget-boolean v2, p0, Ll/ۤ֨ۘ;->۟:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v2, Ll/᩷۠ۘ;

    invoke-virtual {v2}, Ll/᩷۠ۘ;->ۧ()I

    move-result v2

    if-ge p1, v2, :cond_1

    goto :goto_1

    .line 187
    :cond_1
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܽ()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_2

    .line 185
    :cond_2
    :goto_1
    iget p1, p0, Ll/ۤ֨ۘ;->֫֫:I

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 191
    :cond_3
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 192
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ܺ()I
    .locals 1

    .line 28
    iget v0, p0, Ll/ۤ֨ۘ;->֫֫:I

    return v0
.end method
