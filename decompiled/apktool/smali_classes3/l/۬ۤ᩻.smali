.class public final Ll/۬ۤ᩻;
.super Ljava/lang/Object;
.source "I6X2"


# static fields
.field public static final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    .line 29
    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۤ᩻;->֫:[I

    return-void

    :array_0
    .array-data 4
        0x7f0a0121
        0x7f0a0127
        0x7f0a0128
        0x7f0a0129
        0x7f0a012a
        0x7f0a012b
        0x7f0a012c
        0x7f0a012d
        0x7f0a012e
        0x7f0a0122
        0x7f0a0123
        0x7f0a0124
        0x7f0a0125
        0x7f0a0126
    .end array-data
.end method

.method public static ֫(Ll/ۗܺ᩷;ILl/֡۫᩻;)V
    .locals 12

    const v0, 0x7f0d00f7

    .line 46
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120596

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a0278

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 50
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    const/high16 v4, 0x42400000    # 48.0f

    .line 51
    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/high16 v4, 0x40800000    # 4.0f

    .line 52
    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 53
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 56
    invoke-static {p1}, Ll/᩸ۛ᩻;->֫(I)I

    move-result p1

    filled-new-array {p1}, [I

    move-result-object p1

    .line 121
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v4, 0x1

    .line 122
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 123
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v4, 0x7f08013c

    .line 124
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 125
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    int-to-float v4, v4

    const v5, 0x3ecccccc    # 0.39999998f

    mul-float v4, v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    .line 126
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 127
    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x0

    .line 128
    invoke-virtual {v1, v4}, Landroid/view/View;->setClickable(Z)V

    .line 129
    invoke-virtual {v1, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 130
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 58
    aget v2, p1, v4

    .line 173
    invoke-static {p0, v2}, Ll/᩸ۛ᩻;->֫(Landroid/content/Context;I)I

    move-result v2

    .line 164
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 212
    invoke-static {v2}, Ll/۟۫ۡ;->֫(I)I

    move-result v2

    const/16 v5, 0xdc

    if-le v2, v5, :cond_0

    const v2, -0xc4c4c5

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    .line 165
    :goto_0
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 60
    new-instance v2, Ll/᩶ۤ᩻;

    invoke-direct {v2, v3, v1, p0, p1}, Ll/᩶ۤ᩻;-><init>(Landroid/graphics/drawable/GradientDrawable;Landroid/widget/ImageView;Ll/ۗܺ᩷;[I)V

    const/high16 v5, 0x1000000

    .line 64
    invoke-static {p0, v5}, Ll/᩸ۛ᩻;->֫(Landroid/content/Context;I)I

    move-result v6

    const v7, 0x7f0a0108

    .line 66
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    invoke-static {p0, v8, v5, v6, v2}, Ll/۬ۤ᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/ImageView;IILl/᩶ۤ᩻;)V

    .line 69
    invoke-static {p0, v4}, Ll/᩸ۛ᩻;->֫(Landroid/content/Context;I)I

    move-result v5

    const v6, 0x7f0a0104

    .line 71
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    invoke-static {p0, v8, v4, v5, v2}, Ll/۬ۤ᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/ImageView;IILl/᩶ۤ᩻;)V

    .line 100
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/ܽ᩸;

    .line 102
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/ܽ᩸;

    const v8, 0x7f0a0106

    .line 104
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ܽ᩸;

    const v10, 0x7f0a0152

    .line 106
    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Ll/ܽ᩸;

    const v11, 0x7f0a0121

    .line 107
    iput v11, v5, Ll/ܽ᩸;->᩹֫:I

    .line 108
    iput v11, v5, Ll/ܽ᩸;->ۘ:I

    const v5, 0x7f0a0127

    .line 109
    iput v5, v6, Ll/ܽ᩸;->᩹֫:I

    .line 110
    iput v5, v6, Ll/ܽ᩸;->ۘ:I

    const v5, 0x7f0a0128

    .line 111
    iput v5, v9, Ll/ܽ᩸;->᩹֫:I

    .line 112
    iput v5, v9, Ll/ܽ᩸;->ۘ:I

    .line 113
    iput v7, v10, Ll/ܽ᩸;->᩹֫:I

    const v5, 0x7f0a0105

    .line 114
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    const/16 v5, 0xe

    if-ge v4, v5, :cond_1

    .line 151
    sget-object v5, Ll/۬ۤ᩻;->֫:[I

    aget v5, v5, v4

    .line 152
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    .line 153
    invoke-virtual {v5}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v6

    .line 154
    invoke-static {p0, v5, v6, v6, v2}, Ll/۬ۤ᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/ImageView;IILl/᩶ۤ᩻;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v4, 0x7f1201a3

    .line 78
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 79
    new-instance v4, Ll/ۙۤ᩻;

    invoke-direct {v4, v3, v1, p0, p1}, Ll/ۙۤ᩻;-><init>(Landroid/graphics/drawable/GradientDrawable;Landroid/widget/ImageView;Ll/ۗܺ᩷;[I)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    .line 87
    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v0, Ll/ۗۡܳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2, p1}, Ll/ۗۡܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x7f12070a

    .line 88
    invoke-virtual {p0, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 p2, 0x0

    .line 90
    invoke-virtual {p0, p1, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 91
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    .line 92
    invoke-static {p0}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Landroid/widget/ImageView;IILl/᩶ۤ᩻;)V
    .locals 1

    .line 139
    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 140
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 141
    sget v0, Ll/᩸ۛ᩻;->֫:I

    if-eqz p2, :cond_1

    const/high16 v0, 0x1000000

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    sget-object p0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const p2, 0xffffff

    and-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p3, v0

    const-string p2, "#%06X"

    invoke-static {p0, p2, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    const p2, 0x7f120a6a

    .line 142
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 141
    :goto_1
    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 144
    invoke-virtual {p1, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
