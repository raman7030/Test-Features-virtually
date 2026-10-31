.class public final Ll/ۢܿܳ;
.super Landroid/widget/HorizontalScrollView;
.source "O6KI"


# instance fields
.field public ᩶:Ljava/lang/String;

.field public ᩸:Z

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ᩴܿܳ;Ljava/lang/String;Ll/ۗᩳܳ;)V
    .locals 10

    .line 29
    iget-object p2, p2, Ll/ᩴܿܳ;->֫:Ljava/util/List;

    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢܿܳ;->᩹:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Ll/ۢܿܳ;->᩸:Z

    const/4 v1, 0x0

    .line 30
    invoke-virtual {p0, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->setHorizontalFadingEdgeEnabled(Z)V

    const/16 v0, 0xc

    .line 32
    invoke-direct {p0, v0}, Ll/ۢܿܳ;->֫(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setFadingEdgeLength(I)V

    .line 33
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p1, 0x10

    .line 35
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 37
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {p1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 38
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge p1, v3, :cond_1

    .line 39
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘܿܳ;

    if-lez p1, :cond_0

    const-string v4, "/"

    .line 41
    invoke-direct {p0, v4}, Ll/ۢܿܳ;->ۧ(Ljava/lang/String;)Ll/ܳܺ;

    move-result-object v4

    .line 42
    sget v5, Ll/᩹֡᩷;->ۜ֫:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x3

    .line 43
    invoke-direct {p0, v5}, Ll/ۢܿܳ;->֫(I)I

    move-result v6

    invoke-direct {p0, v5}, Ll/ۢܿܳ;->֫(I)I

    move-result v5

    invoke-virtual {v4, v6, v1, v5, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v5, 0x2

    .line 44
    invoke-virtual {v4, v5}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 45
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    :cond_0
    invoke-virtual {v3}, Ll/ۘܿܳ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Ll/ۢܿܳ;->ۧ(Ljava/lang/String;)Ll/ܳܺ;

    move-result-object v4

    const/16 v5, 0x8

    .line 48
    invoke-direct {p0, v5}, Ll/ۢܿܳ;->֫(I)I

    move-result v6

    const/4 v7, 0x4

    invoke-direct {p0, v7}, Ll/ۢܿܳ;->֫(I)I

    move-result v8

    invoke-direct {p0, v5}, Ll/ۢܿܳ;->֫(I)I

    move-result v5

    invoke-direct {p0, v7}, Ll/ۢܿܳ;->֫(I)I

    move-result v7

    invoke-virtual {v4, v6, v8, v5, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 49
    invoke-virtual {v3}, Ll/ۘܿܳ;->ܽ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 50
    invoke-virtual {v3}, Ll/ۘܿܳ;->ܽ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 73
    new-instance v5, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const v6, 0x10100a1

    .line 74
    filled-new-array {v6}, [I

    move-result-object v6

    sget v7, Ll/᩹֡᩷;->֫:I

    const v8, 0xffffff

    and-int/2addr v7, v8

    const/high16 v9, 0x28000000

    or-int/2addr v7, v9

    invoke-direct {p0, v7}, Ll/ۢܿܳ;->ۧ(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v6, v1, [I

    .line 75
    invoke-direct {p0, v1}, Ll/ۢܿܳ;->ۧ(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 76
    new-instance v6, Landroid/graphics/drawable/RippleDrawable;

    sget v7, Ll/᩹֡᩷;->֫:I

    and-int/2addr v7, v8

    const/high16 v8, 0x33000000

    or-int/2addr v7, v8

    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    const/4 v8, -0x1

    .line 77
    invoke-direct {p0, v8}, Ll/ۢܿܳ;->ۧ(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v8

    invoke-direct {v6, v7, v5, v8}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 51
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 52
    new-instance v5, Ll/᩷ܿܳ;

    invoke-direct {v5, p0, v3, p4}, Ll/᩷ܿܳ;-><init>(Ll/ۢܿܳ;Ll/ۘܿܳ;Ll/ۗᩳܳ;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    iget-object v3, p0, Ll/ۢܿܳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_0

    .line 59
    :cond_1
    invoke-direct {p0, p3}, Ll/ۢܿܳ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method private ֫(I)I
    .locals 1

    int-to-float p1, p1

    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method private ֫(Landroid/widget/TextView;Z)V
    .locals 2

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 98
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 99
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    sub-int/2addr p1, v0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    if-eqz p2, :cond_1

    .line 100
    invoke-virtual {p0, p1, v1}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    return-void

    .line 101
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->scrollTo(II)V

    return-void
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 3

    .line 88
    iput-object p1, p0, Ll/ۢܿܳ;->᩶:Ljava/lang/String;

    .line 89
    iget-object v0, p0, Ll/ۢܿܳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 90
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 91
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Ll/ۢܿܳ;->֫(Landroid/widget/TextView;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۢܿܳ;Ll/ۘܿܳ;Ll/ۗᩳܳ;)V
    .locals 1

    .line 53
    invoke-virtual {p1}, Ll/ۘܿܳ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۢܿܳ;->֫(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Ll/ۘܿܳ;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll/ۗᩳܳ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private ۧ(I)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 81
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 82
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 p1, 0x5

    .line 83
    invoke-direct {p0, p1}, Ll/ۢܿܳ;->֫(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    return-object v0
.end method

.method private ۧ(Ljava/lang/String;)Ll/ܳܺ;
    .locals 2

    .line 63
    new-instance v0, Ll/ܳܺ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    const/high16 v1, 0x41600000    # 14.0f

    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 65
    sget v1, Ll/᩹֡᩷;->ܳ֫:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const/4 v1, 0x1

    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 68
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object v0
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 0

    .line 114
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 115
    iget-boolean p1, p0, Ll/ۢܿܳ;->᩸:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-lez p1, :cond_1

    const/4 p1, 0x0

    .line 116
    iput-boolean p1, p0, Ll/ۢܿܳ;->᩸:Z

    .line 118
    iget-object p2, p0, Ll/ۢܿܳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 119
    invoke-virtual {p3}, Landroid/view/View;->isSelected()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 120
    invoke-direct {p0, p3, p1}, Ll/ۢܿܳ;->֫(Landroid/widget/TextView;Z)V

    :cond_1
    return-void
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۢܿܳ;->᩶:Ljava/lang/String;

    return-object v0
.end method
