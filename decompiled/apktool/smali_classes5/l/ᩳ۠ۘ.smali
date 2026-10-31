.class public final Ll/ᩳ۠ۘ;
.super Ll/ۙ֨ۘ;
.source "27KL"


# static fields
.field public static final synthetic ᩳ֫:I


# instance fields
.field public ֫֫:I

.field public ۛ:I

.field public ۟:Ll/᩸ܽ֫;

.field public ۧ֫:F

.field public ۨ:Landroid/view/ViewGroup;

.field public ܰ:Ll/᩸ܽ֫;

.field public final ܽ֫:Landroid/widget/LinearLayout;

.field public ᩺:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2, v0}, Ll/ᩳ۠ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0, p1, p2, p3}, Ll/ۙ֨ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    new-instance p3, Landroid/widget/LinearLayout;

    invoke-direct {p3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/ᩳ۠ۘ;->ܽ֫:Landroid/widget/LinearLayout;

    .line 37
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/16 v2, 0x18

    int-to-float v2, v2

    mul-float v1, v1, v2

    float-to-int v1, v1

    const/4 v2, 0x0

    .line 42
    invoke-virtual {p0, v1, v2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 43
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 44
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    invoke-virtual {p3, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 46
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/high16 p3, 0x40000000    # 2.0f

    .line 48
    invoke-virtual {p0, p3}, Ll/ۙ֨ۘ;->֫(F)F

    move-result p3

    iput p3, p0, Ll/ᩳ۠ۘ;->ۧ֫:F

    .line 27
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v1, 0x7f04011a

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 29
    iget p1, v0, Landroid/util/TypedValue;->data:I

    .line 49
    iput p1, p0, Ll/ᩳ۠ۘ;->ۛ:I

    .line 50
    iput p1, p0, Ll/ᩳ۠ۘ;->֫֫:I

    const/4 v0, 0x5

    if-eqz p2, :cond_0

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 55
    sget-object v4, Ll/ܳ᩻ܳ;->ܽ:[I

    .line 53
    invoke-virtual {v1, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v1, "obtainStyledAttributes(...)"

    .line 54
    invoke-static {p2, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    .line 59
    iput p1, p0, Ll/ᩳ۠ۘ;->ۛ:I

    .line 65
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    .line 64
    iput p1, p0, Ll/ᩳ۠ۘ;->֫֫:I

    const/4 p1, 0x6

    .line 71
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Ll/ᩳ۠ۘ;->ۧ֫:F

    .line 76
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 80
    invoke-virtual {p0, v2, v0}, Ll/ۙ֨ۘ;->֫(II)V

    .line 81
    invoke-direct {p0, v2}, Ll/ᩳ۠ۘ;->֫(Z)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 88
    :cond_1
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ll/᩷۠ۘ;

    invoke-virtual {p1}, Ll/᩷۠ۘ;->ܽ()Z

    move-result p1

    if-ne p1, v3, :cond_2

    return-void

    .line 92
    :cond_2
    iget-object p1, p0, Ll/ᩳ۠ۘ;->᩺:Landroid/widget/ImageView;

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_3

    .line 93
    iget-object p1, p0, Ll/ᩳ۠ۘ;->᩺:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 96
    :cond_3
    invoke-direct {p0, v2}, Ll/ᩳ۠ۘ;->֫(Z)Landroid/view/ViewGroup;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ۠ۘ;->ۨ:Landroid/view/ViewGroup;

    const p2, 0x7f0a0697

    .line 97
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ᩳ۠ۘ;->᩺:Landroid/widget/ImageView;

    .line 98
    iget-object p1, p0, Ll/ᩳ۠ۘ;->ۨ:Landroid/view/ViewGroup;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 99
    new-instance p1, Ll/᩸ܽ֫;

    iget-object p2, p0, Ll/ᩳ۠ۘ;->ۨ:Landroid/view/ViewGroup;

    sget-object p3, Ll/֨ܽ֫;->ۚ:Ll/ۚܽ֫;

    invoke-direct {p1, p2, p3}, Ll/᩸ܽ֫;-><init>(Ljava/lang/Object;Ll/ܶܽ֫;)V

    iput-object p1, p0, Ll/ᩳ۠ۘ;->۟:Ll/᩸ܽ֫;

    .line 100
    new-instance p1, Ll/᩹ܽ֫;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/᩹ܽ֫;-><init>(F)V

    const/high16 p3, 0x3f800000    # 1.0f

    .line 101
    invoke-virtual {p1, p3}, Ll/᩹ܽ֫;->֫(F)V

    const/high16 v0, 0x43960000    # 300.0f

    .line 102
    invoke-virtual {p1, v0}, Ll/᩹ܽ֫;->ܽ(F)V

    .line 103
    iget-object v1, p0, Ll/ᩳ۠ۘ;->۟:Ll/᩸ܽ֫;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Ll/᩸ܽ֫;->֫(Ll/᩹ܽ֫;)V

    .line 105
    new-instance p1, Ll/ܽ۠ۘ;

    invoke-direct {p1, p0}, Ll/ܽ۠ۘ;-><init>(Ll/ᩳ۠ۘ;)V

    .line 116
    new-instance v1, Ll/᩸ܽ֫;

    iget-object v2, p0, Ll/ᩳ۠ۘ;->ۨ:Landroid/view/ViewGroup;

    invoke-direct {v1, v2, p1}, Ll/᩸ܽ֫;-><init>(Ljava/lang/Object;Ll/ܶܽ֫;)V

    iput-object v1, p0, Ll/ᩳ۠ۘ;->ܰ:Ll/᩸ܽ֫;

    .line 117
    new-instance p1, Ll/᩹ܽ֫;

    invoke-direct {p1, p2}, Ll/᩹ܽ֫;-><init>(F)V

    .line 118
    invoke-virtual {p1, p3}, Ll/᩹ܽ֫;->֫(F)V

    .line 119
    invoke-virtual {p1, v0}, Ll/᩹ܽ֫;->ܽ(F)V

    .line 120
    iget-object p2, p0, Ll/ᩳ۠ۘ;->ܰ:Ll/᩸ܽ֫;

    invoke-static {p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ll/᩸ܽ֫;->֫(Ll/᩹ܽ֫;)V

    return-void
.end method

.method private final ֫(Z)Landroid/view/ViewGroup;
    .locals 6

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d01ed

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    .line 141
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutDirection(I)V

    const v1, 0x7f0a0697

    .line 143
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz p1, :cond_0

    const v3, 0x7f0802ea

    goto :goto_0

    :cond_0
    const v3, 0x7f0802e9

    .line 144
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 147
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 148
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v4

    float-to-int v4, v4

    iput v4, v3, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 149
    iput v4, v3, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    const/16 v4, 0xf

    const/4 v5, -0x1

    .line 150
    invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 152
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܳ()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ܳ()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v4, v2, v5, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 154
    invoke-direct {p0, v1, p1}, Ll/ᩳ۠ۘ;->֫(Landroid/view/View;Z)V

    return-object v0
.end method

.method public static final synthetic ֫(Ll/ᩳ۠ۘ;)Landroid/widget/ImageView;
    .locals 0

    .line 20
    iget-object p0, p0, Ll/ᩳ۠ۘ;->᩺:Landroid/widget/ImageView;

    return-object p0
.end method

.method private final ֫(Landroid/view/View;Z)V
    .locals 1

    .line 159
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/drawable/GradientDrawable;

    if-eqz p2, :cond_0

    .line 161
    iget p2, p0, Ll/ᩳ۠ۘ;->ۧ֫:F

    float-to-int p2, p2

    iget v0, p0, Ll/ᩳ۠ۘ;->֫֫:I

    invoke-virtual {p1, p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    goto :goto_0

    .line 163
    :cond_0
    iget p2, p0, Ll/ᩳ۠ۘ;->ۛ:I

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 165
    :goto_0
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->ᩳ()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    return-void
.end method

.method public static final synthetic ۧ(Ll/ᩳ۠ۘ;)Ll/᩸ܽ֫;
    .locals 0

    .line 20
    iget-object p0, p0, Ll/ᩳ۠ۘ;->ܰ:Ll/᩸ܽ֫;

    return-object p0
.end method

.method public static final synthetic ܽ(Ll/ᩳ۠ۘ;)Ll/᩸ܽ֫;
    .locals 0

    .line 20
    iget-object p0, p0, Ll/ᩳ۠ۘ;->۟:Ll/᩸ܽ֫;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ۨ֨ۘ;
    .locals 1

    .line 178
    new-instance v0, Ll/ۧ۠ۘ;

    invoke-direct {v0, p0}, Ll/ۧ۠ۘ;-><init>(Ll/ᩳ۠ۘ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    const/4 v0, 0x1

    .line 124
    invoke-direct {p0, v0}, Ll/ᩳ۠ۘ;->֫(Z)Landroid/view/ViewGroup;

    move-result-object v0

    .line 125
    new-instance v1, Ll/֫۠ۘ;

    invoke-direct {v1, p0, p1}, Ll/֫۠ۘ;-><init>(Ll/ᩳ۠ۘ;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0697

    .line 131
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iget-object v1, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    iget-object p1, p0, Ll/ᩳ۠ۘ;->ܽ֫:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final ۜ()Ll/᩶֨ۘ;
    .locals 1

    .line 222
    sget-object v0, Ll/᩶֨ۘ;->۟:Ll/᩶֨ۘ;

    return-object v0
.end method

.method public final ۡ()V
    .locals 3

    .line 173
    iget-object v0, p0, Ll/ᩳ۠ۘ;->ܽ֫:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 174
    iget-object v0, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    .line 0
    invoke-static {v0, v2}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/ᩳ۠ۘ;->֫(Landroid/view/View;Z)V

    return-void
.end method
