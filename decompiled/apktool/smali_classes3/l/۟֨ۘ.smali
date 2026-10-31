.class public final Ll/۟֨ۘ;
.super Ll/ۙ֨ۘ;
.source "Y7LE"


# static fields
.field public static final synthetic ܿ֫:I


# instance fields
.field public ֫֫:I

.field public ۛ:F

.field public ۟:Landroid/view/ViewGroup;

.field public ۧ֫:F

.field public ۨ:I

.field public ܰ:Ll/᩸ܽ֫;

.field public ܽ֫:F

.field public final ᩳ֫:Landroid/widget/LinearLayout;

.field public final ᩺:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, v0}, Ll/۟֨ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2, p3}, Ll/ۙ֨ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    new-instance p3, Landroid/widget/LinearLayout;

    invoke-direct {p3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/۟֨ۘ;->ᩳ֫:Landroid/widget/LinearLayout;

    const/high16 v0, 0x41c00000    # 24.0f

    .line 44
    invoke-virtual {p0, v0}, Ll/ۙ֨ۘ;->֫(F)F

    move-result v0

    const/4 v1, 0x0

    .line 45
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    float-to-int v0, v0

    .line 46
    invoke-virtual {p0, v0, v1, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 47
    invoke-virtual {p3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v0, -0x2

    .line 48
    invoke-virtual {p0, p3, v0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    const/high16 p3, 0x40000000    # 2.0f

    .line 53
    invoke-virtual {p0, p3}, Ll/ۙ֨ۘ;->֫(F)F

    move-result p3

    iput p3, p0, Ll/۟֨ۘ;->ۧ֫:F

    .line 27
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v2, 0x7f04011a

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 29
    iget p1, v0, Landroid/util/TypedValue;->data:I

    .line 54
    iput p1, p0, Ll/۟֨ۘ;->ۨ:I

    .line 55
    iput p1, p0, Ll/۟֨ۘ;->֫֫:I

    const/high16 v0, 0x43960000    # 300.0f

    .line 56
    iput v0, p0, Ll/۟֨ۘ;->ܽ֫:F

    const/high16 v2, 0x3f000000    # 0.5f

    .line 57
    iput v2, p0, Ll/۟֨ۘ;->ۛ:F

    if-eqz p2, :cond_0

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 62
    sget-object v5, Ll/ܳ᩻ܳ;->ۧ:[I

    .line 60
    invoke-virtual {v4, p2, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v4, "obtainStyledAttributes(...)"

    .line 61
    invoke-static {p2, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    .line 67
    invoke-virtual {p2, v4, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    .line 66
    iput p1, p0, Ll/۟֨ۘ;->ۨ:I

    const/4 v4, 0x6

    .line 71
    invoke-virtual {p2, v4, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Ll/۟֨ۘ;->֫֫:I

    const/16 p1, 0x8

    .line 76
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    .line 75
    iput p1, p0, Ll/۟֨ۘ;->ܽ֫:F

    .line 77
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Ll/۟֨ۘ;->ۛ:F

    const/4 p1, 0x7

    .line 83
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Ll/۟֨ۘ;->ۧ֫:F

    .line 88
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 91
    :cond_0
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result p1

    iput p1, p0, Ll/۟֨ۘ;->᩺:F

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x5

    .line 94
    invoke-virtual {p0, v1, p1}, Ll/ۙ֨ۘ;->֫(II)V

    .line 95
    invoke-direct {p0, v1}, Ll/۟֨ۘ;->֫(Z)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 102
    :cond_1
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ll/᩷۠ۘ;

    invoke-virtual {p1}, Ll/᩷۠ۘ;->ܽ()Z

    move-result p1

    if-ne p1, v3, :cond_2

    return-void

    .line 106
    :cond_2
    iget-object p1, p0, Ll/۟֨ۘ;->۟:Landroid/view/ViewGroup;

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_3

    .line 107
    iget-object p1, p0, Ll/۟֨ۘ;->۟:Landroid/view/ViewGroup;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 110
    :cond_3
    invoke-direct {p0, v1}, Ll/۟֨ۘ;->֫(Z)Landroid/view/ViewGroup;

    move-result-object p1

    iput-object p1, p0, Ll/۟֨ۘ;->۟:Landroid/view/ViewGroup;

    .line 111
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    new-instance p1, Ll/᩸ܽ֫;

    iget-object p2, p0, Ll/۟֨ۘ;->۟:Landroid/view/ViewGroup;

    sget-object p3, Ll/֨ܽ֫;->ۚ:Ll/ۚܽ֫;

    invoke-direct {p1, p2, p3}, Ll/᩸ܽ֫;-><init>(Ljava/lang/Object;Ll/ܶܽ֫;)V

    iput-object p1, p0, Ll/۟֨ۘ;->ܰ:Ll/᩸ܽ֫;

    .line 113
    new-instance p1, Ll/᩹ܽ֫;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/᩹ܽ֫;-><init>(F)V

    .line 114
    iget p2, p0, Ll/۟֨ۘ;->ۛ:F

    invoke-virtual {p1, p2}, Ll/᩹ܽ֫;->֫(F)V

    .line 115
    iget p2, p0, Ll/۟֨ۘ;->ܽ֫:F

    invoke-virtual {p1, p2}, Ll/᩹ܽ֫;->ܽ(F)V

    .line 116
    iget-object p2, p0, Ll/۟֨ۘ;->ܰ:Ll/᩸ܽ֫;

    invoke-static {p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ll/᩸ܽ֫;->֫(Ll/᩹ܽ֫;)V

    return-void
.end method

.method private final ֫(Z)Landroid/view/ViewGroup;
    .locals 6

    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d01ca

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    .line 137
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutDirection(I)V

    const v1, 0x7f0a055e

    .line 140
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const v3, 0x7f0802b1

    goto :goto_0

    :cond_0
    const v3, 0x7f0802b0

    .line 141
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 144
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz p1, :cond_1

    .line 145
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v4

    goto :goto_1

    :cond_1
    iget v4, p0, Ll/۟֨ۘ;->᩺:F

    :goto_1
    float-to-int v4, v4

    iput v4, v3, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 146
    iput v4, v3, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    const/16 v4, 0xf

    const/4 v5, -0x1

    .line 147
    invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 149
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܳ()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܳ()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v4, v2, v5, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 151
    invoke-direct {p0, v1, p1}, Ll/۟֨ۘ;->֫(Landroid/view/View;Z)V

    return-object v0
.end method

.method public static final synthetic ֫(Ll/۟֨ۘ;)Ll/᩸ܽ֫;
    .locals 0

    .line 19
    iget-object p0, p0, Ll/۟֨ۘ;->ܰ:Ll/᩸ܽ֫;

    return-object p0
.end method

.method private final ֫(Landroid/view/View;Z)V
    .locals 1

    const v0, 0x7f0a055e

    .line 157
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/drawable/GradientDrawable;

    if-eqz p2, :cond_0

    .line 159
    iget p2, p0, Ll/۟֨ۘ;->ۧ֫:F

    float-to-int p2, p2

    iget v0, p0, Ll/۟֨ۘ;->֫֫:I

    invoke-virtual {p1, p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    goto :goto_0

    .line 161
    :cond_0
    iget p2, p0, Ll/۟֨ۘ;->ۨ:I

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 163
    :goto_0
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ᩳ()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۨ֨ۘ;
    .locals 1

    .line 176
    new-instance v0, Ll/ܰ֨ۘ;

    invoke-direct {v0, p0}, Ll/ܰ֨ۘ;-><init>(Ll/۟֨ۘ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    const/4 v0, 0x1

    .line 120
    invoke-direct {p0, v0}, Ll/۟֨ۘ;->֫(Z)Landroid/view/ViewGroup;

    move-result-object v0

    .line 121
    new-instance v1, Ll/᩺֨ۘ;

    invoke-direct {v1, p0, p1}, Ll/᩺֨ۘ;-><init>(Ll/۟֨ۘ;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a055e

    .line 127
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iget-object v1, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object p1, p0, Ll/۟֨ۘ;->ᩳ֫:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final ۜ()Ll/᩶֨ۘ;
    .locals 1

    .line 198
    sget-object v0, Ll/᩶֨ۘ;->ܰ:Ll/᩶֨ۘ;

    return-object v0
.end method

.method public final ۡ()V
    .locals 3

    .line 167
    iget-object v0, p0, Ll/۟֨ۘ;->ᩳ֫:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 168
    iget-object v0, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    .line 0
    invoke-static {v0, v2}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/۟֨ۘ;->֫(Landroid/view/View;Z)V

    return-void
.end method
