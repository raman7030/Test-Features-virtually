.class public final Ll/ۤ᩺ܿ;
.super Ljava/lang/Object;
.source "C4PJ"


# static fields
.field public static ᩺:Landroid/graphics/Typeface;


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫:I

.field public ۖ:I

.field public final ۗ:Landroid/graphics/drawable/Drawable;

.field public ۘ:I

.field public ۙ:I

.field public ۚ:I

.field public ۛ:F

.field public ۜ:F

.field public ۠:Ll/֫ۖܽ;

.field public ۡ:I

.field public ۢ:I

.field public ۤ:I

.field public ۧ:F

.field public ۨ:I

.field public final ۫:Landroid/graphics/drawable/Drawable;

.field public final ۬:Landroid/graphics/drawable/Drawable;

.field public ܳ:I

.field public ܶ:I

.field public ܺ:I

.field public ܽ:I

.field public ܿ:F

.field public final ᩳ:Ll/ۧܰܿ;

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:I

.field public ᩷:F

.field public ᩸:F

.field public ᩹:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۜܰܿ;Ll/ۧܰܿ;)V
    .locals 4

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p2, p0, Ll/ۤ᩺ܿ;->ᩳ:Ll/ۧܰܿ;

    .line 35
    new-instance p2, Ll/֫ۖܽ;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ll/֫ۖܽ;-><init>(I)V

    iput-object p2, p0, Ll/ۤ᩺ܿ;->۠:Ll/֫ۖܽ;

    .line 37
    sget-object v0, Ll/ۤ᩺ܿ;->᩺:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 38
    invoke-static {}, Ll/ۙ᩸᩷;->ۖ()Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Ll/ۤ᩺ܿ;->᩺:Landroid/graphics/Typeface;

    .line 40
    :cond_0
    sget-object v0, Ll/ۤ᩺ܿ;->᩺:Landroid/graphics/Typeface;

    invoke-virtual {p2, v0}, Ll/֫ۖܽ;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 41
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 44
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Ll/ۤ᩺ܿ;->ܿ:F

    const v0, -0x22888889

    .line 45
    iput v0, p0, Ll/ۤ᩺ܿ;->ܳ:I

    const v0, 0x39777777

    .line 46
    iput v0, p0, Ll/ۤ᩺ܿ;->ۢ:I

    const/high16 v0, 0x41000000    # 8.0f

    mul-float v0, v0, p2

    .line 47
    iput v0, p0, Ll/ۤ᩺ܿ;->᩷:F

    const/high16 v0, 0x42400000    # 48.0f

    mul-float v0, v0, p2

    .line 48
    iput v0, p0, Ll/ۤ᩺ܿ;->ۜ:F

    const v0, 0x77666666

    .line 49
    iput v0, p0, Ll/ۤ᩺ܿ;->ܶ:I

    const/high16 v0, 0x40800000    # 4.0f

    mul-float p2, p2, v0

    .line 50
    iput p2, p0, Ll/ۤ᩺ܿ;->᩸:F

    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0802b5

    .line 53
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Ll/ۤ᩺ܿ;->۬:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f0802b7

    .line 54
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ᩺ܿ;->۫:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f0802b6

    .line 55
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩺ܿ;->ۗ:Landroid/graphics/drawable/Drawable;

    const/16 v1, 0xd2

    .line 56
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 57
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    const/16 v1, 0xe6

    .line 58
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 64
    sget v1, Ll/᩹֡᩷;->֫:I

    .line 65
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v1, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 66
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 67
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 68
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 69
    iput v1, p0, Ll/ۤ᩺ܿ;->᩻:I

    const p1, -0x5f000001

    const p2, 0x60ffffff

    .line 70
    invoke-static {p1, p2}, Ll/᩹֡᩷;->֫(II)I

    move-result p1

    and-int/2addr p1, v1

    iput p1, p0, Ll/ۤ᩺ܿ;->᩹:I

    .line 73
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, -0x56483a

    .line 74
    iput p1, p0, Ll/ۤ᩺ܿ;->ۙ:I

    const p1, -0xf6000

    .line 75
    iput p1, p0, Ll/ۤ᩺ܿ;->֫:I

    const p1, -0xd4d4d5

    .line 76
    iput p1, p0, Ll/ۤ᩺ܿ;->ᩴ:I

    .line 77
    iput p1, p0, Ll/ۤ᩺ܿ;->᩵:I

    const p1, -0x777778

    .line 78
    iput p1, p0, Ll/ۤ᩺ܿ;->ۚ:I

    const p1, -0xc9c7c6

    .line 79
    iput p1, p0, Ll/ۤ᩺ܿ;->֡:I

    const p1, -0x888889

    .line 80
    iput p1, p0, Ll/ۤ᩺ܿ;->֨:I

    const p1, -0x99999a

    .line 81
    iput p1, p0, Ll/ۤ᩺ܿ;->ۨ:I

    const p1, -0xb8babb

    .line 82
    iput p1, p0, Ll/ۤ᩺ܿ;->ܽ:I

    return-void

    :cond_1
    const/high16 p1, -0x1000000

    .line 84
    iput p1, p0, Ll/ۤ᩺ܿ;->ۙ:I

    const p1, -0x229a00

    .line 85
    iput p1, p0, Ll/ۤ᩺ܿ;->֫:I

    const/4 p1, -0x1

    .line 86
    iput p1, p0, Ll/ۤ᩺ܿ;->ᩴ:I

    const p1, -0x130c01

    .line 87
    iput p1, p0, Ll/ۤ᩺ܿ;->᩵:I

    const p1, -0x4f4f50

    .line 88
    iput p1, p0, Ll/ۤ᩺ܿ;->ۚ:I

    const p2, -0xf0f10

    .line 89
    iput p2, p0, Ll/ۤ᩺ܿ;->֡:I

    const p2, -0x5f5f60

    .line 90
    iput p2, p0, Ll/ۤ᩺ܿ;->֨:I

    .line 91
    iput p1, p0, Ll/ۤ᩺ܿ;->ۨ:I

    const/16 p1, -0x51d

    .line 92
    iput p1, p0, Ll/ۤ᩺ܿ;->ܽ:I

    return-void
.end method

.method private ܽ(I)V
    .locals 8

    .line 113
    iput p1, p0, Ll/ۤ᩺ܿ;->ۘ:I

    .line 114
    iget-object v0, p0, Ll/ۤ᩺ܿ;->ᩳ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->᩻()I

    move-result v1

    iput v1, p0, Ll/ۤ᩺ܿ;->ۖ:I

    .line 115
    invoke-virtual {v0}, Ll/ۧܰܿ;->ܽ()I

    move-result v2

    iput v2, p0, Ll/ۤ᩺ܿ;->ܺ:I

    int-to-float p1, p1

    .line 118
    iget v3, p0, Ll/ۤ᩺ܿ;->᩷:F

    const/high16 v4, 0x3fc00000    # 1.5f

    mul-float v3, v3, v4

    sub-float v3, p1, v3

    const/4 v4, 0x1

    add-int/2addr v1, v4

    .line 122
    invoke-virtual {v0}, Ll/ۧܰܿ;->ܽ()I

    move-result v0

    const/4 v5, 0x3

    invoke-static {v0, v5, v1, v4}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    int-to-float v1, v2

    add-float/2addr v0, v1

    div-float/2addr p1, v0

    .line 131
    iget-object v1, p0, Ll/ۤ᩺ܿ;->۠:Ll/֫ۖܽ;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    const-string v2, "0"

    .line 132
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    iput v5, p0, Ll/ۤ᩺ܿ;->ۧ:F

    mul-float v5, v5, v0

    const v6, 0x3f8147ae    # 1.01f

    cmpl-float v5, v5, v3

    if-lez v5, :cond_1

    :cond_0
    div-float/2addr p1, v6

    .line 137
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 138
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    iput v5, p0, Ll/ۤ᩺ܿ;->ۧ:F

    mul-float v5, v5, v0

    cmpl-float v5, v5, v3

    if-gtz v5, :cond_0

    goto :goto_1

    :cond_1
    :goto_0
    mul-float v5, p1, v6

    .line 146
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 147
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v7

    iput v7, p0, Ll/ۤ᩺ܿ;->ۧ:F

    mul-float v7, v7, v0

    cmpg-float v7, v7, v3

    if-ltz v7, :cond_2

    .line 149
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 150
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    iput p1, p0, Ll/ۤ᩺ܿ;->ۧ:F

    .line 155
    :goto_1
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p1

    .line 156
    iget v0, p1, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, p1

    float-to-int v0, v0

    add-int/2addr v0, v4

    iput v0, p0, Ll/ۤ᩺ܿ;->ۡ:I

    neg-float p1, p1

    .line 157
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ll/ۤ᩺ܿ;->᩶:I

    .line 159
    iget p1, p0, Ll/ۤ᩺ܿ;->ۧ:F

    const v0, 0x3e6147ae    # 0.22f

    mul-float v0, v0, p1

    iput v0, p0, Ll/ۤ᩺ܿ;->ۛ:F

    const v0, 0x3e8a3d71    # 0.27f

    mul-float p1, p1, v0

    .line 160
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ll/ۤ᩺ܿ;->ۤ:I

    return-void

    :cond_2
    move p1, v5

    goto :goto_0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 103
    iget v0, p0, Ll/ۤ᩺ܿ;->ۘ:I

    invoke-virtual {p0, v0}, Ll/ۤ᩺ܿ;->֫(I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 107
    iget v0, p0, Ll/ۤ᩺ܿ;->ۖ:I

    iget-object v1, p0, Ll/ۤ᩺ܿ;->ᩳ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->᩻()I

    move-result v2

    if-ne v0, v2, :cond_0

    iget v0, p0, Ll/ۤ᩺ܿ;->ܺ:I

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܽ()I

    move-result v1

    if-eq v0, v1, :cond_1

    :cond_0
    if-gtz p1, :cond_2

    :cond_1
    return-void

    .line 109
    :cond_2
    invoke-direct {p0, p1}, Ll/ۤ᩺ܿ;->ܽ(I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 97
    iget v0, p0, Ll/ۤ᩺ܿ;->ۘ:I

    if-ne v0, p1, :cond_0

    return-void

    .line 99
    :cond_0
    invoke-direct {p0, p1}, Ll/ۤ᩺ܿ;->ܽ(I)V

    return-void
.end method
