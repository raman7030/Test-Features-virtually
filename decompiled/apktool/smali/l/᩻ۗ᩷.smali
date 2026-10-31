.class public Ll/᩻ۗ᩷;
.super Ll/ۘۙ᩷;
.source "B6LU"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻ۗ᩷;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩻ۗ᩷;->ܳ(I)V

    return-void
.end method

.method private ܳ(I)V
    .locals 3

    int-to-long v0, p1

    const/4 p1, 0x2

    .line 38
    invoke-static {v0, v1, p1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    move-result-object p1

    .line 0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance p1, Ljava/math/BigDecimal;

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-direct {p1, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object p1

    .line 38
    :goto_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    const p1, 0x7f120518

    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ܽ(Ljava/lang/String;)I
    .locals 4

    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2c

    const/16 v1, 0x2e

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    .line 50
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v1, :cond_1

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v3, 0x39

    if-gt v2, v3, :cond_0

    goto :goto_1

    .line 52
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid line spacing"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 54
    :cond_2
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0}, Ljava/math/BigDecimal;->scale()I

    move-result p0

    const/4 v1, 0x2

    if-gt p0, v1, :cond_4

    .line 56
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValueExact()I

    move-result p0

    const/16 v0, 0x50

    if-lt p0, v0, :cond_3

    const/16 v0, 0xc8

    if-gt p0, v0, :cond_3

    return p0

    .line 57
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Line spacing out of range"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 55
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Too many decimal places"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 49
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Empty line spacing"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 11

    .line 63
    invoke-static {}, Ll/᩸᩺ᩳ;->ܺ()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 64
    new-instance v2, Ll/ۤۤᩳ;

    invoke-direct {v2, p1}, Ll/ۤۤᩳ;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    .line 65
    invoke-virtual {v2, v3}, Ll/ۤۤᩳ;->֨(Z)V

    const/4 v4, 0x1

    .line 66
    invoke-virtual {v2, v4}, Ll/۫ۨᩳ;->ۡ(Z)V

    .line 67
    invoke-virtual {v2, v3}, Ll/۫ۨᩳ;->ᩴ(Z)V

    .line 68
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 69
    new-instance v5, Ll/ܽۗ᩷;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 70
    instance-of v5, p1, Ll/ۖۢᩳ;

    if-eqz v5, :cond_0

    const-string v5, "diff_text_font_size"

    goto :goto_0

    :cond_0
    const-string v5, "edit_text_font_size"

    .line 72
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v6

    instance-of v7, p1, Ll/ۖۢᩳ;

    if-eqz v7, :cond_1

    const-string v7, "12"

    goto :goto_1

    :cond_1
    const-string v7, "15"

    :goto_1
    invoke-interface {v6, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/16 v5, 0xf

    .line 74
    :goto_2
    invoke-static {}, Ll/᩸᩺ᩳ;->ۖ()I

    move-result v6

    int-to-float v5, v5

    invoke-virtual {v2, v5, v6}, Ll/۫ۨᩳ;->֫(FI)V

    int-to-float v5, v0

    div-float/2addr v5, v1

    .line 75
    invoke-virtual {v2, v5}, Ll/۫ۨᩳ;->֫(F)V

    .line 76
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v1

    const v6, 0x7f12079c

    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 77
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v6, -0xcfcfd0

    const v7, -0xa0a0b

    .line 78
    invoke-static {v6, v7}, Ll/᩹֡᩷;->֫(II)I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v6, 0x41000000    # 8.0f

    .line 79
    invoke-static {v6}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v1, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 80
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v1, 0x41400000    # 12.0f

    .line 81
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v6

    .line 82
    invoke-virtual {v2, v6, v6, v6, v6}, Ll/۫ۨᩳ;->setPadding(IIII)V

    .line 84
    new-instance v6, Ll/ܺۡ;

    const/4 v7, 0x0

    .line 41
    invoke-direct {v6, p1, v7}, Ll/ܺۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v8, 0x42400000    # 48.0f

    .line 85
    invoke-static {v8}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v8

    invoke-virtual {v6, v8}, Landroid/view/View;->setMinimumHeight(I)V

    const/16 v8, 0x18

    .line 86
    invoke-virtual {v6, v8}, Landroid/widget/ProgressBar;->setMax(I)V

    add-int/lit8 v0, v0, -0x50

    int-to-float v0, v0

    const/high16 v8, 0x40a00000    # 5.0f

    div-float/2addr v0, v8

    .line 87
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 88
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 89
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 90
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 92
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۚ֫()F

    move-result v8

    div-float/2addr v8, v5

    const/high16 v9, 0x40c00000    # 6.0f

    mul-float v8, v8, v9

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v8, v8

    .line 93
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v9

    add-int/2addr v9, v8

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v8

    add-int/2addr v8, v9

    .line 94
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v9, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 95
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    iput v1, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 96
    invoke-virtual {v0, v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v1

    const v8, 0x7f120517

    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 99
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x2

    invoke-direct {v1, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v8, 0x41800000    # 16.0f

    .line 100
    invoke-static {v8}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v8

    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 101
    invoke-virtual {v0, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    new-instance v1, Ll/ᩳۗ᩷;

    invoke-direct {v1, p0, p1}, Ll/ᩳۗ᩷;-><init>(Ll/᩻ۗ᩷;Ll/ۗܺ᩷;)V

    .line 117
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/CharSequence;)V

    const/16 p1, 0x2002

    .line 118
    invoke-virtual {v1, p1}, Ll/۬ۗܿ;->ܿ(I)V

    .line 43
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v5, v4, v3

    const-string v5, "%.2f"

    invoke-static {p1, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 119
    invoke-virtual {v1, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 120
    invoke-virtual {v1}, Ll/۬ۗܿ;->֫()V

    .line 121
    new-instance p1, Ll/᩵֨᩷;

    const/4 v4, 0x3

    invoke-direct {p1, v4, v1}, Ll/᩵֨᩷;-><init>(ILjava/lang/Object;)V

    const v4, 0x7f1208b4

    .line 232
    invoke-virtual {v1, v4, p1, v7}, Ll/۬ۗܿ;->֫(ILandroid/view/View$OnClickListener;Ll/᩻۟ܳ;)V

    .line 122
    invoke-virtual {v1}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 123
    invoke-virtual {v1}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 124
    new-instance p1, Ll/ܿۗ᩷;

    invoke-direct {p1, v6, v2}, Ll/ܿۗ᩷;-><init>(Ll/ܺۡ;Ll/ۤۤᩳ;)V

    invoke-virtual {v1, p1}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    .line 135
    new-instance p1, Ll/ܳۗ᩷;

    invoke-direct {p1, v1}, Ll/ܳۗ᩷;-><init>(Ll/۬ۗܿ;)V

    invoke-virtual {v6, p1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 142
    invoke-virtual {v1, v3}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method

.method public final ۤ()V
    .locals 2

    .line 33
    invoke-super {p0}, Ll/֫᩸ۧ;->ۤ()V

    .line 34
    invoke-static {}, Ll/᩸᩺ᩳ;->ܺ()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {p0, v0}, Ll/᩻ۗ᩷;->ܳ(I)V

    return-void
.end method
