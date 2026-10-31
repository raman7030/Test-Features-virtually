.class public Ll/ܰ۟ۜ;
.super Landroid/view/View;
.source "59KW"


# instance fields
.field public ֡֫:I

.field public ֨֫:I

.field public ֫֫:F

.field public ۖ֫:Z

.field public ۗ:I

.field public ۗ֫:Ljava/util/Stack;

.field public ۘ֫:F

.field public ۙ:Ll/᩶۟ۜ;

.field public ۙ֫:I

.field public ۚ֫:Ljava/util/Stack;

.field public ۛ:I

.field public ۜ֫:Ll/ۤ۟ۜ;

.field public ۟:F

.field public ۠֫:F

.field public ۡ֫:F

.field public ۢ֫:F

.field public ۤ:I

.field public ۤ֫:Z

.field public ۧ֫:I

.field public ۨ:I

.field public ۫:Ll/۬۟ۜ;

.field public ۫֫:Ljava/util/ArrayList;

.field public ۬:Ll/۬۟ۜ;

.field public ۬֫:Ljava/util/ArrayList;

.field public ܰ:Ll/۬۟ۜ;

.field public ܳ֫:I

.field public ܶ֫:Z

.field public ܺ֫:Z

.field public ܽ֫:Ll/֨ۛ;

.field public ܿ֫:I

.field public ᩳ֫:I

.field public ᩴ֫:F

.field public ᩵֫:Ll/֫ۖܽ;

.field public ᩶:Z

.field public ᩶֫:I

.field public ᩷֫:I

.field public ᩸:Ll/۬۟ۜ;

.field public ᩸֫:Z

.field public ᩹:Landroid/graphics/drawable/BitmapDrawable;

.field public ᩹֫:Ll/ܺ֫᩷;

.field public ᩺:Ll/۬۟ۜ;

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 89
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 40
    iput p2, p0, Ll/ܰ۟ۜ;->᩷֫:I

    .line 41
    iput p2, p0, Ll/ܰ۟ۜ;->ۗ:I

    .line 42
    iput p2, p0, Ll/ܰ۟ۜ;->֨֫:I

    const/high16 v0, 0x40a00000    # 5.0f

    .line 47
    iput v0, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 55
    new-instance v0, Ll/᩶۟ۜ;

    invoke-direct {v0}, Ll/᩶۟ۜ;-><init>()V

    iput-object v0, p0, Ll/ܰ۟ۜ;->ۙ:Ll/᩶۟ۜ;

    .line 61
    new-instance v0, Ll/֫ۖܽ;

    invoke-direct {v0}, Ll/֫ۖܽ;-><init>()V

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩵֫:Ll/֫ۖܽ;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    .line 71
    iput p2, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    const/4 p2, 0x1

    .line 72
    iput-boolean p2, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    .line 79
    new-instance p2, Ljava/util/Stack;

    invoke-direct {p2}, Ljava/util/Stack;-><init>()V

    iput-object p2, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    .line 80
    new-instance p2, Ljava/util/Stack;

    invoke-direct {p2}, Ljava/util/Stack;-><init>()V

    iput-object p2, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    .line 90
    invoke-direct {p0, p1}, Ll/ܰ۟ۜ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 94
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 40
    iput p2, p0, Ll/ܰ۟ۜ;->᩷֫:I

    .line 41
    iput p2, p0, Ll/ܰ۟ۜ;->ۗ:I

    .line 42
    iput p2, p0, Ll/ܰ۟ۜ;->֨֫:I

    const/high16 p3, 0x40a00000    # 5.0f

    .line 47
    iput p3, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 55
    new-instance p3, Ll/᩶۟ۜ;

    invoke-direct {p3}, Ll/᩶۟ۜ;-><init>()V

    iput-object p3, p0, Ll/ܰ۟ۜ;->ۙ:Ll/᩶۟ۜ;

    .line 61
    new-instance p3, Ll/֫ۖܽ;

    invoke-direct {p3}, Ll/֫ۖܽ;-><init>()V

    iput-object p3, p0, Ll/ܰ۟ۜ;->᩵֫:Ll/֫ۖܽ;

    .line 64
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    .line 65
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    .line 71
    iput p2, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    const/4 p2, 0x1

    .line 72
    iput-boolean p2, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    .line 79
    new-instance p2, Ljava/util/Stack;

    invoke-direct {p2}, Ljava/util/Stack;-><init>()V

    iput-object p2, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    .line 80
    new-instance p2, Ljava/util/Stack;

    invoke-direct {p2}, Ljava/util/Stack;-><init>()V

    iput-object p2, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    .line 95
    invoke-direct {p0, p1}, Ll/ܰ۟ۜ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method private ֡()V
    .locals 2

    .line 946
    new-instance v0, Ll/ܺ֫᩷;

    invoke-direct {v0}, Ll/ܺ֫᩷;-><init>()V

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩹֫:Ll/ܺ֫᩷;

    .line 947
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۘ()Ll/ۡ֫᩷;

    move-result-object v1

    iput-object v1, v0, Ll/ܺ֫᩷;->ۧ:Ll/ۡ֫᩷;

    return-void
.end method

.method public static ֫(Landroid/view/MotionEvent;)F
    .locals 4

    const/4 v0, 0x0

    .line 689
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    .line 690
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p0

    sub-float/2addr v0, p0

    mul-float v1, v1, v1

    mul-float v0, v0, v0

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 691
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    return-object p0
.end method

.method private ֫(Landroid/content/Context;)V
    .locals 6

    .line 99
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 100
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Ll/ܰ۟ۜ;->ۙ֫:I

    .line 101
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledDoubleTapSlop()I

    move-result v0

    mul-int v0, v0, v0

    .line 103
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41000000    # 8.0f

    mul-float v1, v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    .line 104
    iput v1, p0, Ll/ܰ۟ۜ;->᩶֫:I

    iput v1, p0, Ll/ܰ۟ۜ;->ᩳ֫:I

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 107
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0802b2

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 108
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 109
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-virtual {v1, v2, v2, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 110
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 111
    invoke-direct {p0, v3}, Ll/ܰ۟ۜ;->֫(Landroid/graphics/Bitmap;)V

    const/high16 v1, 0x40800000    # 4.0f

    .line 112
    iput v1, p0, Ll/ܰ۟ۜ;->ۡ֫:F

    iput v1, p0, Ll/ܰ۟ۜ;->ۢ֫:F

    iput v1, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 114
    :cond_0
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iget-object v3, p0, Ll/ܰ۟ۜ;->᩵֫:Ll/֫ۖܽ;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 115
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 116
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 117
    new-instance v1, Ll/֨ۛ;

    new-instance v2, Ll/ۨ۟ۜ;

    invoke-direct {v2, p0, v0}, Ll/ۨ۟ۜ;-><init>(Ll/ܰ۟ۜ;I)V

    invoke-direct {v1, p1, v2}, Ll/֨ۛ;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Ll/ܰ۟ۜ;->ܽ֫:Ll/֨ۛ;

    .line 219
    invoke-virtual {v1}, Ll/֨ۛ;->֫()V

    return-void
.end method

.method private ֫(Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 255
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    .line 256
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    .line 257
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    .line 258
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    const/4 v0, 0x0

    .line 259
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 260
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 261
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 262
    iput-boolean p1, p0, Ll/ܰ۟ۜ;->ܶ֫:Z

    goto :goto_0

    .line 264
    :cond_0
    invoke-direct {p0}, Ll/ܰ۟ۜ;->᩵()F

    move-result p1

    iput p1, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 266
    :goto_0
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۚ()V

    goto :goto_1

    :cond_1
    const/16 p1, 0x64

    .line 268
    iput p1, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    iput p1, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    const/4 p1, 0x0

    .line 269
    iput-object p1, p0, Ll/ܰ۟ۜ;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    .line 271
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private ֫(Ll/ۙ۟ۜ;)V
    .locals 1

    .line 699
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    if-eqz v0, :cond_0

    .line 700
    invoke-interface {v0, p1}, Ll/ۤ۟ۜ;->ۧ(Ll/ۙ۟ۜ;)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/ۡ֫᩷;)V
    .locals 7

    .line 821
    iget-object v0, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 822
    iget-object v1, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 823
    iget-object v2, p1, Ll/ۡ֫᩷;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬۟ۜ;

    .line 824
    invoke-virtual {v3}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 826
    :cond_0
    iget-object v2, p1, Ll/ۡ֫᩷;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬۟ۜ;

    .line 827
    invoke-virtual {v3}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 829
    :cond_1
    iget-object v2, p1, Ll/ۡ֫᩷;->ܽ:Ll/۬۟ۜ;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    move-object v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    .line 830
    iget-object v2, p1, Ll/ۡ֫᩷;->ᩳ:Ll/۬۟ۜ;

    if-nez v2, :cond_3

    move-object v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v2

    :goto_3
    iput-object v2, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    .line 831
    iget-object v2, p1, Ll/ۡ֫᩷;->ܿ:Ll/۬۟ۜ;

    if-nez v2, :cond_4

    move-object v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v2

    :goto_4
    iput-object v2, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    .line 832
    iget-object v2, p1, Ll/ۡ֫᩷;->ܳ:Ll/۬۟ۜ;

    if-nez v2, :cond_5

    move-object v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v2

    :goto_5
    iput-object v2, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    .line 833
    iget v4, p1, Ll/ۡ֫᩷;->֫:I

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-ne v4, v5, :cond_6

    .line 834
    iput-object v3, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    .line 836
    :cond_6
    iget v5, p1, Ll/ۡ֫᩷;->᩻:I

    if-eqz v5, :cond_d

    if-eq v5, v6, :cond_a

    const/4 v0, 0x2

    if-eq v5, v0, :cond_7

    goto :goto_6

    :cond_7
    if-nez v4, :cond_8

    .line 861
    iget-object v0, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    :cond_8
    if-ne v4, v6, :cond_9

    .line 863
    iput-object v2, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    .line 865
    :cond_9
    iput-object v3, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    :cond_a
    if-nez v4, :cond_b

    .line 852
    iget-object v0, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    :cond_b
    if-ne v4, v6, :cond_c

    .line 854
    iget-object v0, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    .line 856
    :cond_c
    iput-object v3, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    .line 839
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v4, v2, :cond_e

    .line 840
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬۟ۜ;

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    .line 842
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v4, v0

    .line 843
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_f

    .line 844
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬۟ۜ;

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    goto :goto_6

    .line 846
    :cond_f
    iput-object v3, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    .line 870
    :goto_6
    iget v0, p1, Ll/ۡ֫᩷;->᩻:I

    iget v1, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    if-eq v0, v1, :cond_10

    .line 871
    iput v0, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    .line 872
    iget-object v1, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    if-eqz v1, :cond_10

    .line 873
    invoke-interface {v1, v0}, Ll/ۤ۟ۜ;->֫(I)V

    .line 876
    :cond_10
    iget p1, p1, Ll/ۡ֫᩷;->ۧ:I

    iget v0, p0, Ll/ܰ۟ۜ;->ۗ:I

    if-eq p1, v0, :cond_11

    .line 877
    iput p1, p0, Ll/ܰ۟ۜ;->ۗ:I

    .line 717
    iget-object p1, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    if-eqz p1, :cond_11

    .line 718
    invoke-virtual {p0}, Ll/ܰ۟ۜ;->ۜ()Z

    move-result v0

    invoke-interface {p1, v0}, Ll/ۤ۟ۜ;->֫(Z)V

    .line 880
    :cond_11
    iget-object p1, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    invoke-direct {p0, p1}, Ll/ܰ۟ۜ;->֫(Ll/ۙ۟ۜ;)V

    .line 881
    iput-boolean v6, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    .line 882
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ۟ۜ;F)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܰ۟ۜ;->۠֫:F

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ۟ۜ;Ll/ۙ۟ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܰ۟ۜ;->֫(Ll/ۙ۟ۜ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ۟ۜ;Ll/۬۟ۜ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ۟ۜ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    return-void
.end method

.method private ۖ()V
    .locals 3

    .line 711
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    if-eqz v0, :cond_0

    .line 712
    iget-object v1, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/ۤ۟ۜ;->֫(ZZ)V

    :cond_0
    return-void
.end method

.method private ۘ()Ll/ۡ֫᩷;
    .locals 7

    .line 772
    new-instance v0, Ll/ۡ֫᩷;

    invoke-direct {v0}, Ll/ۡ֫᩷;-><init>()V

    .line 773
    iget v1, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    iput v1, v0, Ll/ۡ֫᩷;->᩻:I

    .line 774
    iget v1, p0, Ll/ܰ۟ۜ;->ۗ:I

    iput v1, v0, Ll/ۡ֫᩷;->ۧ:I

    .line 775
    iget-object v1, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬۟ۜ;

    .line 776
    iget-object v4, v0, Ll/ۡ֫᩷;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 778
    :cond_0
    iget-object v2, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬۟ۜ;

    .line 779
    iget-object v5, v0, Ll/ۡ֫᩷;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 781
    :cond_1
    iget-object v3, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    const/4 v4, 0x0

    if-nez v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v3

    :goto_2
    iput-object v3, v0, Ll/ۡ֫᩷;->ܽ:Ll/۬۟ۜ;

    .line 782
    iget-object v3, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    if-nez v3, :cond_3

    move-object v3, v4

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v3

    :goto_3
    iput-object v3, v0, Ll/ۡ֫᩷;->ᩳ:Ll/۬۟ۜ;

    .line 783
    iget-object v3, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    if-nez v3, :cond_4

    move-object v3, v4

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v3

    :goto_4
    iput-object v3, v0, Ll/ۡ֫᩷;->ܿ:Ll/۬۟ۜ;

    .line 784
    iget-object v3, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v4

    :goto_5
    iput-object v4, v0, Ll/ۡ֫᩷;->ܳ:Ll/۬۟ۜ;

    .line 785
    iget-object v3, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    if-eqz v3, :cond_e

    .line 786
    iget v4, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    const/4 v5, -0x1

    if-eqz v4, :cond_c

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v4, v2, :cond_9

    const/4 v6, 0x2

    if-eq v4, v6, :cond_6

    goto :goto_6

    .line 807
    :cond_6
    iget-object v4, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    if-ne v3, v4, :cond_7

    .line 808
    iput v1, v0, Ll/ۡ֫᩷;->֫:I

    return-object v0

    .line 809
    :cond_7
    iget-object v1, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    if-ne v3, v1, :cond_8

    .line 810
    iput v2, v0, Ll/ۡ֫᩷;->֫:I

    return-object v0

    .line 812
    :cond_8
    iput v5, v0, Ll/ۡ֫᩷;->֫:I

    return-object v0

    .line 798
    :cond_9
    iget-object v4, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    if-ne v3, v4, :cond_a

    .line 799
    iput v1, v0, Ll/ۡ֫᩷;->֫:I

    return-object v0

    .line 800
    :cond_a
    iget-object v1, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    if-ne v3, v1, :cond_b

    .line 801
    iput v2, v0, Ll/ۡ֫᩷;->֫:I

    return-object v0

    .line 803
    :cond_b
    iput v5, v0, Ll/ۡ֫᩷;->֫:I

    return-object v0

    .line 788
    :cond_c
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    if-ne v3, v5, :cond_d

    .line 790
    iget-object v3, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    if-eq v3, v5, :cond_d

    .line 792
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v3, v1

    .line 795
    :cond_d
    iput v3, v0, Ll/ۡ֫᩷;->֫:I

    :cond_e
    :goto_6
    return-object v0
.end method

.method private ۚ()V
    .locals 4

    .line 275
    iget-object v0, p0, Ll/ܰ۟ۜ;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    if-nez v0, :cond_0

    goto :goto_0

    .line 278
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    add-float/2addr v1, v2

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget v3, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    int-to-float v3, v3

    add-float/2addr v3, v2

    div-float/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Ll/ܰ۟ۜ;->ۢ֫:F

    const/high16 v1, 0x41800000    # 16.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 280
    iput v1, p0, Ll/ܰ۟ۜ;->ۢ֫:F

    .line 282
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x5

    int-to-float v0, v0

    .line 283
    iget v1, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    int-to-float v1, v1

    add-float/2addr v1, v2

    div-float v1, v0, v1

    iget v3, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    int-to-float v3, v3

    add-float/2addr v3, v2

    div-float/2addr v0, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Ll/ܰ۟ۜ;->ۡ֫:F

    const v1, 0x3e99999a    # 0.3f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 285
    iput v1, p0, Ll/ܰ۟ۜ;->ۡ֫:F

    .line 287
    :cond_2
    iget v0, p0, Ll/ܰ۟ۜ;->۠֫:F

    iget v1, p0, Ll/ܰ۟ۜ;->ۢ֫:F

    cmpl-float v2, v0, v1

    if-lez v2, :cond_3

    .line 288
    iput v1, p0, Ll/ܰ۟ۜ;->۠֫:F

    return-void

    .line 289
    :cond_3
    iget v1, p0, Ll/ܰ۟ۜ;->ۡ֫:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 290
    iput v1, p0, Ll/ܰ۟ۜ;->۠֫:F

    :cond_4
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܰ۟ۜ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰ۟ۜ;->۠֫:F

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/ܰ۟ۜ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ܰ۟ۜ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܰ۟ۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    return p0
.end method

.method public static bridge synthetic ܺ(Ll/ܰ۟ۜ;)F
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܰ۟ۜ;->᩵()F

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܰ۟ۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    return-object p0
.end method

.method private ᩴ()V
    .locals 2

    .line 951
    iget v0, p0, Ll/ܰ۟ۜ;->᩷֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܰ۟ۜ;->᩷֫:I

    iput v0, p0, Ll/ܰ۟ۜ;->ۗ:I

    .line 717
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    if-eqz v0, :cond_0

    .line 718
    invoke-virtual {p0}, Ll/ܰ۟ۜ;->ۜ()Z

    move-result v1

    invoke-interface {v0, v1}, Ll/ۤ۟ۜ;->֫(Z)V

    .line 953
    :cond_0
    iget-object v0, p0, Ll/ܰ۟ۜ;->᩹֫:Ll/ܺ֫᩷;

    if-eqz v0, :cond_1

    .line 954
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۘ()Ll/ۡ֫᩷;

    move-result-object v1

    iput-object v1, v0, Ll/ܺ֫᩷;->֫:Ll/ۡ֫᩷;

    .line 955
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    iget-object v1, p0, Ll/ܰ۟ۜ;->᩹֫:Ll/ܺ֫᩷;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 956
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    const/4 v0, 0x0

    .line 957
    iput-object v0, p0, Ll/ܰ۟ۜ;->᩹֫:Ll/ܺ֫᩷;

    .line 958
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۖ()V

    :cond_1
    return-void
.end method

.method private ᩵()F
    .locals 4

    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Ll/ܰ۟ۜ;->ᩳ֫:I

    mul-int/lit8 v1, v1, 0x6

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    add-float/2addr v1, v2

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    iget v3, p0, Ll/ܰ۟ۜ;->ᩳ֫:I

    mul-int/lit8 v3, v3, 0x6

    sub-int/2addr v1, v3

    int-to-float v1, v1

    iget v3, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    int-to-float v3, v3

    add-float/2addr v3, v2

    div-float/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/high16 v1, 0x41800000    # 16.0f

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    return v1

    :cond_0
    return v0
.end method

.method public static bridge synthetic ᩷(Ll/ܰ۟ۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰ۟ۜ;->᩶֫:I

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ܰ۟ۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    return p0
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 549
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 550
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 551
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v8

    .line 552
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v9

    add-int v10, v8, v1

    add-int v11, v9, v2

    .line 556
    iget v12, v0, Ll/ܰ۟ۜ;->۠֫:F

    .line 557
    iget v3, v0, Ll/ܰ۟ۜ;->ܳ֫:I

    int-to-float v3, v3

    mul-float v3, v3, v12

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 558
    iget v5, v0, Ll/ܰ۟ۜ;->ܿ֫:I

    int-to-float v5, v5

    mul-float v5, v5, v12

    add-float/2addr v5, v4

    float-to-int v5, v5

    add-float/2addr v4, v12

    float-to-int v4, v4

    const/4 v6, 0x1

    .line 559
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v13

    .line 561
    div-int/lit8 v1, v1, 0x2

    .line 562
    div-int/lit8 v2, v2, 0x2

    .line 563
    div-int/lit8 v4, v3, 0x2

    sub-int v14, v1, v4

    .line 564
    div-int/lit8 v1, v5, 0x2

    sub-int v15, v2, v1

    add-int v6, v14, v3

    add-int v4, v15, v5

    .line 571
    iget-object v2, v0, Ll/ܰ۟ۜ;->ۙ:Ll/᩶۟ۜ;

    iget v1, v2, Ll/᩶۟ۜ;->֫:I

    invoke-virtual {v7, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 573
    iget v1, v0, Ll/ܰ۟ۜ;->ᩳ֫:I

    add-int/2addr v3, v13

    add-int/2addr v3, v13

    .line 574
    div-int/2addr v3, v1

    add-int/2addr v5, v13

    add-int/2addr v5, v13

    .line 575
    div-int/2addr v5, v1

    move/from16 v16, v12

    .line 576
    iget-object v12, v2, Ll/᩶۟ۜ;->ۧ:[I

    const/16 v17, 0x0

    move-object/from16 v17, v2

    const/4 v7, 0x0

    .line 577
    :goto_0
    iget-object v2, v0, Ll/ܰ۟ۜ;->᩵֫:Ll/֫ۖܽ;

    if-gt v7, v3, :cond_4

    sub-int v18, v14, v13

    mul-int v19, v7, v1

    move/from16 v20, v14

    add-int v14, v19, v18

    move/from16 v18, v3

    add-int v3, v6, v13

    move/from16 v19, v6

    add-int v6, v14, v1

    .line 579
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-le v6, v8, :cond_3

    if-lt v14, v10, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-gt v3, v5, :cond_3

    sub-int v21, v15, v13

    mul-int v22, v3, v1

    move/from16 v23, v5

    add-int v5, v22, v21

    move/from16 v21, v10

    add-int v10, v4, v13

    move/from16 v22, v4

    add-int v4, v5, v1

    .line 585
    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-le v4, v9, :cond_2

    if-lt v5, v11, :cond_1

    goto :goto_2

    :cond_1
    add-int v10, v7, v3

    .line 589
    rem-int/lit8 v10, v10, 0x2

    aget v10, v12, v10

    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v10, v14

    int-to-float v5, v5

    move-object/from16 v24, v12

    int-to-float v12, v6

    int-to-float v4, v4

    move/from16 v25, v1

    move-object/from16 v1, p1

    move/from16 v26, v14

    move-object/from16 v14, v17

    move-object/from16 v17, v2

    move v2, v10

    move/from16 v10, v18

    move/from16 v18, v3

    move v3, v5

    move/from16 v5, v22

    move/from16 v22, v4

    move v4, v12

    move v12, v5

    move/from16 v5, v22

    move/from16 v22, v10

    move/from16 v10, v19

    move/from16 v19, v6

    move-object/from16 v6, v17

    .line 590
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_3

    :cond_2
    :goto_2
    move/from16 v25, v1

    move-object/from16 v24, v12

    move/from16 v26, v14

    move-object/from16 v14, v17

    move/from16 v10, v19

    move/from16 v12, v22

    move-object/from16 v17, v2

    move/from16 v19, v6

    move/from16 v22, v18

    move/from16 v18, v3

    :goto_3
    add-int/lit8 v3, v18, 0x1

    move v4, v12

    move-object/from16 v2, v17

    move/from16 v6, v19

    move/from16 v18, v22

    move/from16 v5, v23

    move-object/from16 v12, v24

    move/from16 v1, v25

    move/from16 v19, v10

    move-object/from16 v17, v14

    move/from16 v10, v21

    move/from16 v14, v26

    goto :goto_1

    :cond_3
    :goto_4
    move/from16 v25, v1

    move/from16 v23, v5

    move/from16 v21, v10

    move-object/from16 v24, v12

    move-object/from16 v14, v17

    move/from16 v22, v18

    move/from16 v10, v19

    move v12, v4

    add-int/lit8 v7, v7, 0x1

    move v6, v10

    move v4, v12

    move-object/from16 v17, v14

    move/from16 v14, v20

    move/from16 v10, v21

    move/from16 v3, v22

    move/from16 v5, v23

    move-object/from16 v12, v24

    move/from16 v1, v25

    goto/16 :goto_0

    :cond_4
    move v12, v4

    move/from16 v21, v10

    move/from16 v20, v14

    move-object/from16 v14, v17

    move-object/from16 v17, v2

    move v10, v6

    .line 594
    iget-object v1, v0, Ll/ܰ۟ۜ;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_5

    move/from16 v7, v20

    .line 596
    invoke-virtual {v1, v7, v15, v10, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move-object/from16 v6, p1

    .line 597
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_5

    :cond_5
    move-object/from16 v6, p1

    move/from16 v7, v20

    .line 599
    :goto_5
    iget v5, v14, Ll/᩶۟ۜ;->ᩳ:I

    .line 600
    iget v4, v14, Ll/᩶۟ۜ;->ܿ:I

    .line 601
    iget v3, v14, Ll/᩶۟ۜ;->ܳ:I

    .line 602
    iget v1, v0, Ll/ܰ۟ۜ;->ۧ֫:I

    if-nez v1, :cond_6

    const/4 v2, 0x1

    const/16 v18, 0x1

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    const/16 v18, 0x0

    :goto_6
    const/4 v2, 0x1

    if-ne v1, v2, :cond_7

    const/4 v2, 0x1

    const/16 v19, 0x1

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    const/16 v19, 0x0

    :goto_7
    const/4 v2, 0x2

    if-ne v1, v2, :cond_8

    const/4 v1, 0x1

    const/16 v20, 0x1

    goto :goto_8

    :cond_8
    const/4 v1, 0x0

    const/16 v20, 0x0

    .line 605
    :goto_8
    iget-boolean v2, v0, Ll/ܰ۟ۜ;->᩻֫:Z

    .line 606
    iget-object v1, v0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    move-object/from16 v22, v1

    .line 608
    iget-object v1, v0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_9
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/high16 v24, 0x3f800000    # 1.0f

    if-eqz v1, :cond_b

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    move/from16 v25, v2

    int-to-float v2, v7

    move/from16 v26, v3

    .line 609
    iget v3, v1, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v3, v3

    mul-float v3, v3, v16

    add-float v27, v3, v2

    .line 610
    iget v3, v1, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v3, v3

    mul-float v3, v3, v16

    add-float v28, v3, v2

    const/high16 v2, -0x1000000

    move-object/from16 v3, v17

    .line 611
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    sub-int v2, v15, v13

    int-to-float v2, v2

    move-object/from16 v17, v14

    int-to-float v14, v15

    move/from16 v29, v8

    move-object/from16 v8, v22

    move/from16 v22, v10

    move-object v10, v1

    move-object/from16 v1, p1

    move/from16 v30, v2

    move/from16 v2, v27

    move-object/from16 v31, v3

    move/from16 v3, v30

    move/from16 v30, v4

    move/from16 v4, v28

    move/from16 v32, v7

    move v7, v5

    move v5, v14

    move-object/from16 v6, v31

    .line 612
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v18, :cond_a

    if-eqz v25, :cond_a

    move-object/from16 v6, v31

    .line 614
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v5, v12

    move-object/from16 v1, p1

    move/from16 v2, v27

    move v3, v14

    move/from16 v4, v28

    move-object v14, v6

    .line 615
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-ne v8, v10, :cond_9

    move/from16 v4, v26

    goto :goto_a

    :cond_9
    move/from16 v4, v30

    .line 616
    :goto_a
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v10, v9

    add-float v4, v27, v24

    int-to-float v6, v11

    move-object/from16 v1, p1

    move/from16 v2, v27

    move v3, v10

    move v5, v6

    move/from16 v27, v6

    move-object v6, v14

    .line 617
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sub-float v2, v28, v24

    move/from16 v4, v28

    move/from16 v5, v27

    .line 618
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_b

    :cond_a
    move-object/from16 v14, v31

    :goto_b
    move-object/from16 v6, p1

    move v5, v7

    move/from16 v10, v22

    move/from16 v2, v25

    move/from16 v3, v26

    move/from16 v4, v30

    move/from16 v7, v32

    move-object/from16 v22, v8

    move/from16 v8, v29

    move-object/from16 v38, v17

    move-object/from16 v17, v14

    move-object/from16 v14, v38

    goto/16 :goto_9

    :cond_b
    move/from16 v25, v2

    move/from16 v26, v3

    move/from16 v30, v4

    move/from16 v32, v7

    move/from16 v29, v8

    move-object/from16 v8, v22

    move v7, v5

    move/from16 v22, v10

    move-object/from16 v38, v17

    move-object/from16 v17, v14

    move-object/from16 v14, v38

    .line 621
    iget-object v1, v0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ll/ۙ۟ۜ;

    int-to-float v1, v15

    .line 622
    iget v2, v6, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v2, v2

    mul-float v2, v2, v16

    add-float v23, v2, v1

    .line 623
    iget v2, v6, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v2, v2

    mul-float v2, v2, v16

    add-float v27, v2, v1

    const/high16 v1, -0x1000000

    .line 624
    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    sub-int v1, v32, v13

    int-to-float v2, v1

    move/from16 v5, v32

    int-to-float v4, v5

    move-object/from16 v1, p1

    move/from16 v3, v23

    move/from16 v28, v4

    move-object/from16 v31, v10

    move v10, v5

    move/from16 v5, v27

    move/from16 v32, v11

    move-object v11, v6

    move-object v6, v14

    .line 625
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v18, :cond_d

    if-eqz v25, :cond_d

    .line 627
    invoke-virtual {v14, v7}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v6, v22

    int-to-float v4, v6

    move-object/from16 v1, p1

    move/from16 v2, v28

    move/from16 v3, v23

    move/from16 v5, v27

    move/from16 v22, v9

    move v9, v6

    move-object v6, v14

    .line 628
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-ne v8, v11, :cond_c

    move/from16 v4, v26

    goto :goto_d

    :cond_c
    move/from16 v4, v30

    .line 629
    :goto_d
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v11, v29

    int-to-float v6, v11

    move/from16 v5, v21

    int-to-float v4, v5

    add-float v21, v23, v24

    move-object/from16 v1, p1

    move v2, v6

    move/from16 v3, v23

    move/from16 v23, v4

    move/from16 v33, v5

    move/from16 v5, v21

    move/from16 v21, v6

    move-object v6, v14

    .line 630
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sub-float v3, v27, v24

    move/from16 v2, v21

    move/from16 v5, v27

    .line 631
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_e

    :cond_d
    move/from16 v33, v21

    move/from16 v11, v29

    move/from16 v38, v22

    move/from16 v22, v9

    move/from16 v9, v38

    :goto_e
    move/from16 v29, v11

    move/from16 v11, v32

    move/from16 v21, v33

    move/from16 v32, v10

    move-object/from16 v10, v31

    move/from16 v38, v22

    move/from16 v22, v9

    move/from16 v9, v38

    goto/16 :goto_c

    :cond_e
    move/from16 v33, v21

    move/from16 v10, v32

    move/from16 v32, v11

    move/from16 v11, v29

    move/from16 v38, v22

    move/from16 v22, v9

    move/from16 v9, v38

    xor-int/lit8 v1, v19, 0x1

    const/4 v2, 0x0

    move/from16 v18, v1

    const/4 v6, 0x0

    :goto_f
    const/4 v1, 0x2

    if-ge v6, v1, :cond_17

    if-eqz v18, :cond_13

    .line 637
    iget-object v1, v0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    if-eqz v1, :cond_12

    int-to-float v2, v10

    .line 639
    iget v3, v1, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v3, v3

    mul-float v3, v3, v16

    add-float v21, v3, v2

    .line 640
    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v1, v1

    mul-float v1, v1, v16

    add-float v23, v2, v1

    int-to-float v1, v15

    .line 641
    iget-object v2, v0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    iget v3, v2, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v3, v3

    mul-float v3, v3, v16

    add-float v27, v3, v1

    .line 642
    iget v2, v2, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v2, v2

    mul-float v2, v2, v16

    add-float v28, v2, v1

    const/high16 v1, -0x1000000

    .line 643
    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v12

    add-int v4, v12, v13

    int-to-float v5, v4

    move-object/from16 v1, p1

    move/from16 v2, v21

    move/from16 v4, v23

    move/from16 v29, v6

    move-object v6, v14

    .line 644
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    int-to-float v2, v9

    add-int v6, v9, v13

    int-to-float v4, v6

    move/from16 v3, v27

    move/from16 v5, v28

    move-object v6, v14

    .line 645
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v19, :cond_11

    if-eqz v25, :cond_11

    .line 647
    invoke-virtual {v14, v7}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v2, v21

    move/from16 v3, v27

    move/from16 v4, v23

    move/from16 v5, v28

    move-object v6, v14

    .line 648
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 649
    iget-object v1, v0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    if-ne v8, v1, :cond_f

    move/from16 v4, v26

    goto :goto_10

    :cond_f
    move/from16 v4, v30

    :goto_10
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v6, v22

    int-to-float v5, v6

    add-float v4, v21, v24

    move/from16 v3, v32

    int-to-float v2, v3

    move-object/from16 v1, p1

    move/from16 v22, v2

    move/from16 v2, v21

    move/from16 v21, v7

    move v7, v3

    move v3, v5

    move/from16 v31, v5

    move/from16 v5, v22

    move/from16 v32, v7

    move v7, v6

    move-object v6, v14

    .line 650
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sub-float v2, v23, v24

    move/from16 v3, v31

    move/from16 v4, v23

    .line 651
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 652
    iget-object v1, v0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    if-ne v8, v1, :cond_10

    move/from16 v4, v26

    goto :goto_11

    :cond_10
    move/from16 v4, v30

    :goto_11
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v6, v11

    move/from16 v5, v33

    int-to-float v4, v5

    add-float v22, v27, v24

    move-object/from16 v1, p1

    move v2, v6

    move/from16 v3, v27

    move/from16 v23, v4

    move/from16 v34, v5

    move/from16 v5, v22

    move/from16 v22, v6

    move-object v6, v14

    .line 653
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sub-float v3, v28, v24

    move/from16 v2, v22

    move/from16 v5, v28

    .line 654
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_14

    :cond_11
    move/from16 v21, v7

    move/from16 v7, v22

    move/from16 v34, v33

    goto/16 :goto_14

    :cond_12
    move/from16 v29, v6

    move/from16 v21, v7

    move/from16 v7, v22

    move/from16 v31, v32

    move/from16 v27, v33

    goto/16 :goto_15

    :cond_13
    move/from16 v29, v6

    move/from16 v21, v7

    move/from16 v7, v22

    move/from16 v34, v33

    .line 658
    iget-object v1, v0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    if-eqz v1, :cond_16

    int-to-float v6, v10

    .line 660
    iget v2, v1, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v2, v2

    mul-float v2, v2, v16

    add-float v22, v2, v6

    .line 661
    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v1, v1

    mul-float v1, v1, v16

    add-float v23, v1, v6

    int-to-float v5, v15

    .line 662
    iget-object v1, v0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    iget v2, v1, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v2, v2

    mul-float v2, v2, v16

    add-float v27, v2, v5

    .line 663
    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v1, v1

    mul-float v1, v1, v16

    add-float v28, v1, v5

    const/high16 v1, -0x10000

    .line 664
    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v4, v12

    add-int v1, v12, v13

    int-to-float v3, v1

    move-object/from16 v1, p1

    move v2, v6

    move/from16 v31, v3

    move v3, v4

    move/from16 v33, v4

    move/from16 v4, v22

    move/from16 v35, v5

    move/from16 v5, v31

    move/from16 v36, v6

    move-object v6, v14

    .line 665
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    int-to-float v6, v9

    move/from16 v2, v23

    move/from16 v3, v33

    move v4, v6

    move/from16 v31, v6

    move-object v6, v14

    .line 666
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int v6, v9, v13

    int-to-float v6, v6

    move/from16 v2, v31

    move/from16 v3, v35

    move v4, v6

    move/from16 v5, v27

    move/from16 v37, v6

    move-object v6, v14

    .line 667
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v3, v28

    move/from16 v4, v37

    move/from16 v5, v33

    .line 668
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v20, :cond_16

    if-eqz v25, :cond_16

    move-object/from16 v6, v17

    .line 670
    iget v1, v6, Ll/᩶۟ۜ;->ܽ:I

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v2, v36

    move/from16 v3, v35

    move/from16 v4, v31

    move/from16 v5, v27

    move-object v6, v14

    .line 671
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v3, v28

    move/from16 v5, v33

    .line 672
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v3, v27

    move/from16 v4, v22

    move/from16 v5, v28

    .line 673
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v2, v23

    move/from16 v4, v31

    .line 674
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 675
    iget-object v1, v0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    if-ne v8, v1, :cond_14

    move/from16 v4, v26

    goto :goto_12

    :cond_14
    move/from16 v4, v30

    :goto_12
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v6, v7

    add-float v4, v22, v24

    move/from16 v5, v32

    int-to-float v3, v5

    move-object/from16 v1, p1

    move/from16 v2, v22

    move/from16 v22, v3

    move v3, v6

    move/from16 v31, v5

    move/from16 v5, v22

    move/from16 v32, v6

    move-object v6, v14

    .line 676
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sub-float v2, v23, v24

    move/from16 v3, v32

    move/from16 v4, v23

    .line 677
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 678
    iget-object v1, v0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    if-ne v8, v1, :cond_15

    move/from16 v4, v26

    goto :goto_13

    :cond_15
    move/from16 v4, v30

    :goto_13
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v6, v11

    move/from16 v5, v34

    int-to-float v4, v5

    add-float v22, v27, v24

    move-object/from16 v1, p1

    move v2, v6

    move/from16 v3, v27

    move/from16 v23, v4

    move/from16 v27, v5

    move/from16 v5, v22

    move/from16 v22, v6

    move-object v6, v14

    .line 679
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sub-float v3, v28, v24

    move/from16 v2, v22

    move/from16 v5, v28

    .line 680
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_15

    :cond_16
    :goto_14
    move/from16 v31, v32

    move/from16 v27, v34

    :goto_15
    xor-int/lit8 v18, v18, 0x1

    add-int/lit8 v6, v29, 0x1

    move/from16 v22, v7

    move/from16 v7, v21

    move/from16 v33, v27

    move/from16 v32, v31

    goto/16 :goto_f

    :cond_17
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 304
    iget-boolean p1, p0, Ll/ܰ۟ۜ;->ܶ֫:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 305
    iput-boolean p1, p0, Ll/ܰ۟ۜ;->ܶ֫:Z

    .line 306
    invoke-direct {p0}, Ll/ܰ۟ۜ;->᩵()F

    move-result p1

    iput p1, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 308
    :cond_0
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۚ()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 14

    .line 328
    iget-object v0, p0, Ll/ܰ۟ۜ;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto/16 :goto_c

    .line 331
    :cond_0
    iget-object v0, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    .line 332
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_14

    if-eq v2, v4, :cond_3

    const/4 v6, 0x5

    if-eq v2, v6, :cond_2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    goto/16 :goto_b

    .line 375
    :cond_1
    iget p1, p0, Ll/ܰ۟ۜ;->֡֫:I

    sub-int/2addr p1, v1

    iput p1, p0, Ll/ܰ۟ۜ;->֡֫:I

    return v1

    .line 362
    :cond_2
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->ۖ֫:Z

    .line 363
    iget v0, p0, Ll/ܰ۟ۜ;->֡֫:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܰ۟ۜ;->֡֫:I

    .line 364
    iget-boolean v0, p0, Ll/ܰ۟ۜ;->ۤ֫:Z

    if-nez v0, :cond_1b

    .line 365
    invoke-static {p1}, Ll/ܰ۟ۜ;->֫(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Ll/ܰ۟ۜ;->ۘ֫:F

    .line 366
    iget v0, p0, Ll/ܰ۟ۜ;->۠֫:F

    iput v0, p0, Ll/ܰ۟ۜ;->ᩴ֫:F

    .line 367
    iput-boolean v1, p0, Ll/ܰ۟ۜ;->ۤ֫:Z

    .line 368
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    .line 370
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    add-float/2addr v2, v0

    div-float/2addr v2, v3

    iput v2, p0, Ll/ܰ۟ۜ;->۟:F

    .line 371
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v0

    div-float/2addr p1, v3

    iput p1, p0, Ll/ܰ۟ۜ;->֫֫:F

    return v1

    .line 378
    :cond_3
    iget v2, p0, Ll/ܰ۟ۜ;->֡֫:I

    if-ne v2, v1, :cond_7

    iget-boolean v2, p0, Ll/ܰ۟ۜ;->ۤ֫:Z

    if-eqz v2, :cond_7

    .line 379
    invoke-static {p1}, Ll/ܰ۟ۜ;->֫(Landroid/view/MotionEvent;)F

    move-result p1

    .line 380
    iget-boolean v0, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    if-nez v0, :cond_4

    .line 381
    iget v0, p0, Ll/ܰ۟ۜ;->ۘ֫:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Ll/ܰ۟ۜ;->ۙ֫:I

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1b

    .line 382
    iput-boolean v1, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    .line 383
    iget-object v0, p0, Ll/ܰ۟ۜ;->ܽ֫:Ll/֨ۛ;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 386
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/2addr v0, v4

    .line 387
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    div-int/2addr v2, v4

    .line 388
    iget v3, p0, Ll/ܰ۟ۜ;->۟:F

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    int-to-float v0, v0

    sub-float/2addr v3, v0

    iget v4, p0, Ll/ܰ۟ۜ;->۠֫:F

    div-float/2addr v3, v4

    .line 389
    iget v4, p0, Ll/ܰ۟ۜ;->֫֫:F

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v4, v5

    int-to-float v2, v2

    sub-float/2addr v4, v2

    iget v5, p0, Ll/ܰ۟ۜ;->۠֫:F

    div-float/2addr v4, v5

    .line 390
    iget v5, p0, Ll/ܰ۟ۜ;->ᩴ֫:F

    mul-float v5, v5, p1

    iget p1, p0, Ll/ܰ۟ۜ;->ۘ֫:F

    div-float/2addr v5, p1

    iput v5, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 391
    iget p1, p0, Ll/ܰ۟ۜ;->ۢ֫:F

    cmpl-float v6, v5, p1

    if-lez v6, :cond_5

    .line 392
    iput p1, p0, Ll/ܰ۟ۜ;->۠֫:F

    goto :goto_0

    .line 393
    :cond_5
    iget p1, p0, Ll/ܰ۟ۜ;->ۡ֫:F

    cmpg-float v5, v5, p1

    if-gez v5, :cond_6

    .line 394
    iput p1, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 396
    :cond_6
    :goto_0
    iget p1, p0, Ll/ܰ۟ۜ;->۠֫:F

    mul-float v3, v3, p1

    mul-float v4, v4, p1

    .line 398
    iget p1, p0, Ll/ܰ۟ۜ;->۟:F

    sub-float/2addr v3, p1

    add-float/2addr v3, v0

    float-to-int p1, v3

    iget v0, p0, Ll/ܰ۟ۜ;->֫֫:F

    sub-float/2addr v4, v0

    add-float/2addr v4, v2

    float-to-int v0, v4

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->scrollTo(II)V

    .line 399
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v1

    :cond_7
    if-eqz v0, :cond_17

    .line 401
    iget-boolean v2, v0, Ll/۬۟ۜ;->᩶:Z

    iget-boolean v3, p0, Ll/ܰ۟ۜ;->ۖ֫:Z

    if-eqz v3, :cond_17

    .line 402
    iget-boolean v3, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    if-nez v3, :cond_c

    .line 403
    iget v3, p0, Ll/ܰ۟ۜ;->۟:F

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    float-to-int v6, v6

    sub-int/2addr v3, v6

    .line 404
    iget v6, p0, Ll/ܰ۟ۜ;->֫֫:F

    float-to-int v6, v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    float-to-int v7, v7

    sub-int/2addr v6, v7

    mul-int v3, v3, v3

    mul-int v6, v6, v6

    add-int/2addr v6, v3

    .line 405
    iget v3, p0, Ll/ܰ۟ۜ;->ۙ֫:I

    mul-int v3, v3, v3

    if-le v6, v3, :cond_17

    .line 406
    invoke-direct {p0}, Ll/ܰ۟ۜ;->֡()V

    .line 407
    iput-boolean v1, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    .line 408
    iget-object v3, p0, Ll/ܰ۟ۜ;->ܽ֫:Ll/֨ۛ;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v6

    invoke-virtual {v3, v6}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 409
    iget-boolean v3, p0, Ll/ܰ۟ۜ;->ܺ֫:Z

    if-eqz v3, :cond_9

    .line 410
    iget v2, v0, Ll/ۙ۟ۜ;->᩹:I

    iput v2, p0, Ll/ܰ۟ۜ;->ۤ:I

    .line 411
    iput v5, p0, Ll/ܰ۟ۜ;->ۨ:I

    .line 412
    iget v2, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    if-nez v2, :cond_8

    iget v2, v0, Ll/ۙ۟ۜ;->᩸:I

    goto :goto_1

    :cond_8
    iget v2, v0, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr v2, v1

    :goto_1
    iput v2, p0, Ll/ܰ۟ۜ;->ۛ:I

    goto/16 :goto_b

    .line 414
    :cond_9
    iget v3, v0, Ll/ۙ۟ۜ;->᩸:I

    iput v3, p0, Ll/ܰ۟ۜ;->ۤ:I

    .line 415
    iget v3, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    if-nez v3, :cond_a

    iget v3, v0, Ll/ۙ۟ۜ;->᩹:I

    goto :goto_2

    :cond_a
    iget v3, v0, Ll/ۙ۟ۜ;->᩹:I

    add-int/2addr v3, v1

    :goto_2
    iput v3, p0, Ll/ܰ۟ۜ;->ۨ:I

    if-eqz v2, :cond_b

    .line 416
    iget v2, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    goto :goto_3

    :cond_b
    iget v2, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    :goto_3
    iput v2, p0, Ll/ܰ۟ۜ;->ۛ:I

    goto/16 :goto_b

    :cond_c
    if-eqz v2, :cond_d

    .line 420
    iget v2, p0, Ll/ܰ۟ۜ;->֫֫:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    goto :goto_4

    :cond_d
    iget v2, p0, Ll/ܰ۟ۜ;->۟:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    :goto_4
    sub-float/2addr v2, v3

    iget v3, p0, Ll/ܰ۟ۜ;->۠֫:F

    div-float/2addr v2, v3

    .line 421
    iget v3, p0, Ll/ܰ۟ۜ;->ۤ:I

    float-to-int v2, v2

    sub-int/2addr v3, v2

    .line 422
    iget v2, p0, Ll/ܰ۟ۜ;->ۛ:I

    if-le v3, v2, :cond_e

    :goto_5
    move v3, v2

    goto :goto_6

    .line 424
    :cond_e
    iget v2, p0, Ll/ܰ۟ۜ;->ۨ:I

    if-ge v3, v2, :cond_f

    goto :goto_5

    .line 427
    :cond_f
    :goto_6
    iget-boolean v2, p0, Ll/ܰ۟ۜ;->ܺ֫:Z

    if-eqz v2, :cond_10

    .line 428
    iput v3, v0, Ll/ۙ۟ۜ;->᩹:I

    goto :goto_7

    .line 430
    :cond_10
    iput v3, v0, Ll/ۙ۟ۜ;->᩸:I

    .line 432
    :goto_7
    iget v2, v0, Ll/ۙ۟ۜ;->᩹:I

    iget v3, v0, Ll/ۙ۟ۜ;->᩸:I

    if-ne v2, v3, :cond_11

    .line 433
    iget-boolean v2, p0, Ll/ܰ۟ۜ;->᩶:Z

    if-eqz v2, :cond_12

    .line 434
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->᩶:Z

    .line 435
    invoke-virtual {p0, v5}, Landroid/view/View;->performHapticFeedback(I)Z

    goto :goto_8

    .line 437
    :cond_11
    iget-boolean v2, p0, Ll/ܰ۟ۜ;->᩶:Z

    if-nez v2, :cond_12

    .line 438
    iput-boolean v1, p0, Ll/ܰ۟ۜ;->᩶:Z

    .line 705
    :cond_12
    :goto_8
    iget-object v2, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    if-eqz v2, :cond_13

    .line 706
    invoke-interface {v2, v0}, Ll/ۤ۟ۜ;->֫(Ll/ۙ۟ۜ;)V

    .line 441
    :cond_13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_b

    .line 334
    :cond_14
    iput v5, p0, Ll/ܰ۟ۜ;->֡֫:I

    .line 335
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->ۤ֫:Z

    .line 336
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->ۖ֫:Z

    if-eqz v0, :cond_17

    .line 338
    new-instance v2, Ll/ۗ۟ۜ;

    iget v6, p0, Ll/ܰ۟ۜ;->۠֫:F

    iget v7, p0, Ll/ܰ۟ۜ;->᩶֫:I

    invoke-direct {v2, v6, v7}, Ll/ۗ۟ۜ;-><init>(FI)V

    .line 340
    iget-boolean v6, v0, Ll/۬۟ۜ;->᩶:Z

    const/high16 v7, 0x3f000000    # 0.5f

    if-eqz v6, :cond_15

    .line 341
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    .line 342
    iget v8, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    int-to-float v8, v8

    iget v9, p0, Ll/ܰ۟ۜ;->۠֫:F

    mul-float v8, v8, v9

    add-float/2addr v8, v7

    float-to-int v7, v8

    .line 343
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v9

    int-to-float v9, v9

    add-float/2addr v8, v9

    sub-int/2addr v6, v7

    int-to-float v6, v6

    div-float/2addr v6, v3

    sub-float/2addr v8, v6

    .line 344
    invoke-virtual {v2, v0, v8}, Ll/ۗ۟ۜ;->ۧ(Ll/ۙ۟ۜ;F)I

    move-result v2

    goto :goto_9

    .line 346
    :cond_15
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    .line 347
    iget v8, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    int-to-float v8, v8

    iget v9, p0, Ll/ܰ۟ۜ;->۠֫:F

    mul-float v8, v8, v9

    add-float/2addr v8, v7

    float-to-int v7, v8

    .line 348
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v9

    int-to-float v9, v9

    add-float/2addr v8, v9

    sub-int/2addr v6, v7

    int-to-float v6, v6

    div-float/2addr v6, v3

    sub-float/2addr v8, v6

    .line 349
    invoke-virtual {v2, v0, v8}, Ll/ۗ۟ۜ;->ۧ(Ll/ۙ۟ۜ;F)I

    move-result v2

    :goto_9
    if-eqz v2, :cond_17

    .line 352
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iput v3, p0, Ll/ܰ۟ۜ;->۟:F

    .line 353
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, p0, Ll/ܰ۟ۜ;->֫֫:F

    .line 354
    iput-boolean v1, p0, Ll/ܰ۟ۜ;->ۖ֫:Z

    .line 355
    iput-boolean v1, p0, Ll/ܰ۟ۜ;->᩶:Z

    const/4 v3, -0x1

    if-ne v2, v3, :cond_16

    const/4 v2, 0x1

    goto :goto_a

    :cond_16
    const/4 v2, 0x0

    .line 356
    :goto_a
    iput-boolean v2, p0, Ll/ܰ۟ۜ;->ܺ֫:Z

    .line 357
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    .line 446
    :cond_17
    :goto_b
    iget-boolean v2, p0, Ll/ܰ۟ۜ;->ۤ֫:Z

    if-nez v2, :cond_18

    iget-boolean v2, p0, Ll/ܰ۟ۜ;->ۖ֫:Z

    if-eqz v2, :cond_19

    :cond_18
    iget-boolean v2, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    if-nez v2, :cond_1a

    .line 447
    :cond_19
    iget-object v2, p0, Ll/ܰ۟ۜ;->ܽ֫:Ll/֨ۛ;

    invoke-virtual {v2, p1}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 449
    :cond_1a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eq p1, v1, :cond_1c

    const/4 v2, 0x3

    if-eq p1, v2, :cond_1c

    :cond_1b
    :goto_c
    return v1

    .line 452
    :cond_1c
    iget-boolean p1, p0, Ll/ܰ۟ۜ;->ۖ֫:Z

    if-eqz p1, :cond_35

    if-eqz v0, :cond_35

    iget-boolean p1, v0, Ll/۬۟ۜ;->᩶:Z

    iget-boolean v2, p0, Ll/ܰ۟ۜ;->᩸֫:Z

    if-eqz v2, :cond_35

    .line 453
    iget v2, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    if-nez v2, :cond_24

    .line 454
    iget v2, v0, Ll/ۙ۟ۜ;->᩹:I

    iget v3, v0, Ll/ۙ۟ۜ;->᩸:I

    iget-object v4, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    iget-object v6, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    if-ne v2, v3, :cond_1e

    if-eqz p1, :cond_1d

    .line 456
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_d

    .line 458
    :cond_1d
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 460
    :goto_d
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x0

    .line 461
    invoke-direct {p0, p1}, Ll/ܰ۟ۜ;->֫(Ll/ۙ۟ۜ;)V

    goto/16 :goto_12

    :cond_1e
    if-eqz p1, :cond_1f

    move-object v4, v6

    .line 464
    :cond_1f
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_20
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_23

    .line 465
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬۟ۜ;

    if-ne v3, v0, :cond_21

    goto :goto_e

    .line 469
    :cond_21
    iget v4, v0, Ll/ۙ۟ۜ;->᩹:I

    iget v6, v3, Ll/ۙ۟ۜ;->᩹:I

    if-gt v4, v6, :cond_22

    iget v7, v0, Ll/ۙ۟ۜ;->᩸:I

    if-gt v6, v7, :cond_22

    .line 470
    iget v2, v3, Ll/ۙ۟ۜ;->᩸:I

    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Ll/ۙ۟ۜ;->᩸:I

    .line 471
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_f

    .line 473
    :cond_22
    iget v3, v3, Ll/ۙ۟ۜ;->᩸:I

    if-gt v4, v3, :cond_20

    iget v4, v0, Ll/ۙ۟ۜ;->᩸:I

    if-gt v3, v4, :cond_20

    .line 474
    iput v6, v0, Ll/ۙ۟ۜ;->᩹:I

    .line 475
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    :goto_f
    const/4 v2, 0x1

    goto :goto_e

    :cond_23
    if-eqz v2, :cond_34

    .line 480
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 481
    invoke-direct {p0, v0}, Ll/ܰ۟ۜ;->֫(Ll/ۙ۟ۜ;)V

    goto/16 :goto_12

    :cond_24
    if-ne v2, v1, :cond_2a

    .line 485
    iget-object p1, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    if-ne v0, p1, :cond_27

    iget-object v2, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    if-eqz v2, :cond_27

    .line 486
    iget v0, v2, Ll/ۙ۟ۜ;->᩹:I

    iget v3, p1, Ll/ۙ۟ۜ;->᩹:I

    if-le v0, v3, :cond_25

    .line 487
    iput v3, v2, Ll/ۙ۟ۜ;->᩹:I

    .line 489
    :cond_25
    iget v0, v2, Ll/ۙ۟ۜ;->᩸:I

    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    if-ge v0, p1, :cond_26

    .line 490
    iput p1, v2, Ll/ۙ۟ۜ;->᩸:I

    .line 492
    :cond_26
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_12

    .line 493
    :cond_27
    iget-object p1, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    if-ne v0, p1, :cond_34

    iget-object v0, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    if-eqz v0, :cond_34

    .line 494
    iget v2, v0, Ll/ۙ۟ۜ;->᩹:I

    iget v3, p1, Ll/ۙ۟ۜ;->᩹:I

    if-le v2, v3, :cond_28

    .line 495
    iput v3, v0, Ll/ۙ۟ۜ;->᩹:I

    .line 497
    :cond_28
    iget v2, v0, Ll/ۙ۟ۜ;->᩸:I

    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    if-ge v2, p1, :cond_29

    .line 498
    iput p1, v0, Ll/ۙ۟ۜ;->᩸:I

    .line 500
    :cond_29
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_12

    :cond_2a
    if-ne v2, v4, :cond_34

    .line 503
    iget-object p1, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    if-ne v0, p1, :cond_2f

    iget-object v2, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    if-eqz v2, :cond_2f

    .line 504
    iget v0, p1, Ll/ۙ۟ۜ;->᩹:I

    iget v3, v2, Ll/ۙ۟ۜ;->᩸:I

    if-lt v0, v3, :cond_2b

    .line 505
    iput v0, v2, Ll/ۙ۟ۜ;->᩹:I

    add-int/2addr v0, v1

    .line 506
    iput v0, v2, Ll/ۙ۟ۜ;->᩸:I

    goto :goto_10

    .line 507
    :cond_2b
    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    iget v4, v2, Ll/ۙ۟ۜ;->᩹:I

    if-gt p1, v4, :cond_2c

    .line 508
    iput p1, v2, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr p1, v1

    .line 509
    iput p1, v2, Ll/ۙ۟ۜ;->᩹:I

    goto :goto_10

    :cond_2c
    if-le v0, v4, :cond_2d

    .line 512
    iput v0, v2, Ll/ۙ۟ۜ;->᩹:I

    :cond_2d
    if-ge p1, v3, :cond_2e

    .line 515
    iput p1, v2, Ll/ۙ۟ۜ;->᩸:I

    .line 518
    :cond_2e
    :goto_10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_12

    .line 519
    :cond_2f
    iget-object p1, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    if-ne v0, p1, :cond_34

    iget-object v0, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    if-eqz v0, :cond_34

    .line 520
    iget v2, p1, Ll/ۙ۟ۜ;->᩹:I

    iget v3, v0, Ll/ۙ۟ۜ;->᩸:I

    if-lt v2, v3, :cond_30

    .line 521
    iput v2, v0, Ll/ۙ۟ۜ;->᩹:I

    add-int/2addr v2, v1

    .line 522
    iput v2, v0, Ll/ۙ۟ۜ;->᩸:I

    goto :goto_11

    .line 523
    :cond_30
    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    iget v4, v0, Ll/ۙ۟ۜ;->᩹:I

    if-gt p1, v4, :cond_31

    .line 524
    iput p1, v0, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr p1, v1

    .line 525
    iput p1, v0, Ll/ۙ۟ۜ;->᩹:I

    goto :goto_11

    :cond_31
    if-le v2, v4, :cond_32

    .line 528
    iput v2, v0, Ll/ۙ۟ۜ;->᩹:I

    :cond_32
    if-ge p1, v3, :cond_33

    .line 531
    iput p1, v0, Ll/ۙ۟ۜ;->᩸:I

    .line 534
    :cond_33
    :goto_11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 537
    :cond_34
    :goto_12
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ᩴ()V

    .line 539
    :cond_35
    iput v5, p0, Ll/ܰ۟ۜ;->֡֫:I

    .line 540
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->ۤ֫:Z

    .line 541
    iput-boolean v5, p0, Ll/ܰ۟ۜ;->ۖ֫:Z

    return v1
.end method

.method public final ֫()V
    .locals 4

    .line 1031
    invoke-virtual {p0}, Ll/ܰ۟ۜ;->᩻()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1032
    invoke-direct {p0}, Ll/ܰ۟ۜ;->֡()V

    .line 1033
    iget-object v0, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ll/۬۟ۜ;

    iget v2, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    invoke-direct {v0, v1, v2, v1}, Ll/۬۟ۜ;-><init>(IIZ)V

    :goto_0
    iput-object v0, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    .line 1034
    iget-object v0, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v0, Ll/۬۟ۜ;

    iget v2, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    :goto_1
    iput-object v0, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    .line 1035
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ᩴ()V

    .line 1036
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 727
    iput p1, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    const/4 p1, 0x1

    .line 728
    iput-boolean p1, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    const/4 p1, 0x0

    .line 729
    iput-object p1, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    .line 730
    invoke-direct {p0, p1}, Ll/ܰ۟ۜ;->֫(Ll/ۙ۟ۜ;)V

    .line 731
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 12

    .line 982
    iget v0, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v1, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    invoke-static {v0, v1, p1}, Ll/ᩳ֫᩷;->֫(IILjava/lang/String;)Ll/ܽ֫᩷;

    move-result-object p1

    .line 1014
    new-instance v9, Ll/ܽ֫᩷;

    iget-object v3, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    iget-object v4, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    iget-object v5, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    iget-object v6, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    iget v7, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v8, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    iget-object v10, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    iget-object v11, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    move-object v0, v9

    move-object v1, v10

    move-object v2, v11

    invoke-direct/range {v0 .. v8}, Ll/ܽ֫᩷;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;II)V

    .line 983
    invoke-virtual {v9, p1}, Ll/ܽ֫᩷;->֫(Ll/ܽ֫᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 986
    :cond_0
    invoke-direct {p0}, Ll/ܰ۟ۜ;->֡()V

    .line 987
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 988
    iget-object v0, p1, Ll/ܽ֫᩷;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    .line 989
    new-instance v3, Ll/۬۟ۜ;

    iget v4, v1, Ll/ۙ۟ۜ;->᩹:I

    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v3, v4, v1, v2}, Ll/۬۟ۜ;-><init>(IIZ)V

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 991
    :cond_1
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 992
    iget-object v0, p1, Ll/ܽ֫᩷;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    .line 993
    new-instance v4, Ll/۬۟ۜ;

    iget v5, v1, Ll/ۙ۟ۜ;->᩹:I

    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v4, v5, v1, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 995
    :cond_2
    iget-object v0, p1, Ll/ܽ֫᩷;->֫:Ll/ۙ۟ۜ;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 996
    iput-object v1, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    iput-object v1, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    goto :goto_2

    .line 998
    :cond_3
    new-instance v4, Ll/۬۟ۜ;

    iget v5, v0, Ll/ۙ۟ۜ;->᩹:I

    iget v0, v0, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v4, v5, v0, v2}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v4, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    .line 999
    new-instance v0, Ll/۬۟ۜ;

    iget-object v4, p1, Ll/ܽ֫᩷;->ۧ:Ll/ۙ۟ۜ;

    iget v5, v4, Ll/ۙ۟ۜ;->᩹:I

    iget v4, v4, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v0, v5, v4, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    .line 1001
    :goto_2
    new-instance v0, Ll/۬۟ۜ;

    iget-object v4, p1, Ll/ܽ֫᩷;->ܽ:Ll/ۙ۟ۜ;

    iget v5, v4, Ll/ۙ۟ۜ;->᩹:I

    iget v4, v4, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v0, v5, v4, v2}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    .line 1002
    new-instance v0, Ll/۬۟ۜ;

    iget-object p1, p1, Ll/ܽ֫᩷;->ᩳ:Ll/ۙ۟ۜ;

    iget v2, p1, Ll/ۙ۟ۜ;->᩹:I

    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v0, v2, p1, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    .line 1003
    iput-object v1, p0, Ll/ܰ۟ۜ;->᩸:Ll/۬۟ۜ;

    .line 1004
    iput-boolean v3, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    .line 1005
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ᩴ()V

    .line 1006
    invoke-direct {p0, v1}, Ll/ܰ۟ۜ;->֫(Ll/ۙ۟ۜ;)V

    .line 1007
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ll/ۢ֫᩷;)V
    .locals 11

    .line 223
    invoke-virtual {p1}, Ll/ۢ֫᩷;->ܽ()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܰ۟ۜ;->֫(Landroid/graphics/Bitmap;)V

    .line 224
    iget-object v0, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 225
    iget-object v1, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/4 v2, 0x0

    .line 226
    iput-object v2, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    .line 227
    iput-object v2, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    .line 228
    invoke-virtual {p1}, Ll/ۢ֫᩷;->ᩳ()Ll/۫۟ۜ;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    .line 229
    iget-object v5, v2, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    iget-object v6, v2, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    iget-object v2, v2, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    .line 230
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۙ۟ۜ;

    .line 231
    new-instance v9, Ll/۬۟ۜ;

    iget v10, v8, Ll/ۙ۟ۜ;->᩹:I

    iget v8, v8, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v9, v10, v8, v4}, Ll/۬۟ۜ;-><init>(IIZ)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 233
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙ۟ۜ;

    .line 234
    new-instance v8, Ll/۬۟ۜ;

    iget v9, v7, Ll/ۙ۟ۜ;->᩹:I

    iget v7, v7, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v8, v9, v7, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 236
    :cond_1
    iget v0, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v1, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    .line 188
    invoke-static {v2, v6, v0, v1}, Ll/۫۟ۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 238
    new-instance v0, Ll/۬۟ۜ;

    iget v1, v5, Landroid/graphics/Rect;->left:I

    iget v2, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v6, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v6

    invoke-direct {v0, v1, v2, v4}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    .line 239
    new-instance v0, Ll/۬۟ۜ;

    iget v1, v5, Landroid/graphics/Rect;->top:I

    iget v2, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v2, v5

    invoke-direct {v0, v1, v2, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    .line 242
    :cond_2
    invoke-virtual {p1}, Ll/ۢ֫᩷;->ܿ()Ll/ܿ֫᩷;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 244
    new-instance v0, Ll/۬۟ۜ;

    iget v1, p1, Ll/ܿ֫᩷;->ۧ:I

    iget v2, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v5, p1, Ll/ܿ֫᩷;->ܽ:I

    sub-int/2addr v2, v5

    invoke-direct {v0, v1, v2, v4}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    .line 245
    new-instance v0, Ll/۬۟ۜ;

    iget v1, p1, Ll/ܿ֫᩷;->ᩳ:I

    iget v2, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    iget p1, p1, Ll/ܿ֫᩷;->֫:I

    sub-int/2addr v2, p1

    invoke-direct {v0, v1, v2, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object v0, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    goto :goto_2

    .line 247
    :cond_3
    new-instance p1, Ll/۬۟ۜ;

    iget v0, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    invoke-direct {p1, v4, v0, v4}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object p1, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    .line 248
    new-instance p1, Ll/۬۟ۜ;

    iget v0, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    invoke-direct {p1, v4, v0, v3}, Ll/۬۟ۜ;-><init>(IIZ)V

    iput-object p1, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    .line 250
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 4

    const v0, 0x71527391

    .line 886
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 887
    iget v1, p0, Ll/ܰ۟ۜ;->᩷֫:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 888
    iget v1, p0, Ll/ܰ۟ۜ;->֨֫:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 889
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۘ()Ll/ۡ֫᩷;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۡ֫᩷;->֫(Ll/ۤۜܽ;)V

    .line 890
    iget-object v1, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 891
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ֫᩷;

    .line 892
    iget-object v3, v2, Ll/ܺ֫᩷;->ۧ:Ll/ۡ֫᩷;

    invoke-virtual {v3, p1}, Ll/ۡ֫᩷;->֫(Ll/ۤۜܽ;)V

    .line 893
    iget-object v2, v2, Ll/ܺ֫᩷;->֫:Ll/ۡ֫᩷;

    invoke-virtual {v2, p1}, Ll/ۡ֫᩷;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    .line 895
    :cond_0
    iget-object v1, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 896
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ֫᩷;

    .line 897
    iget-object v3, v2, Ll/ܺ֫᩷;->ۧ:Ll/ۡ֫᩷;

    invoke-virtual {v3, p1}, Ll/ۡ֫᩷;->֫(Ll/ۤۜܽ;)V

    .line 898
    iget-object v2, v2, Ll/ܺ֫᩷;->֫:Ll/ۡ֫᩷;

    invoke-virtual {v2, p1}, Ll/ۡ֫᩷;->֫(Ll/ۤۜܽ;)V

    goto :goto_1

    .line 900
    :cond_1
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 901
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 902
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 903
    iget v0, p0, Ll/ܰ۟ۜ;->۠֫:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 904
    iget-boolean v0, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/ۤ۟ۜ;)V
    .locals 0

    .line 695
    iput-object p1, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 7

    const v0, 0x71527391

    .line 909
    :try_start_0
    invoke-static {p1, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 913
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, p0, Ll/ܰ۟ۜ;->᩷֫:I

    .line 914
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, p0, Ll/ܰ۟ۜ;->֨֫:I

    .line 915
    new-instance v1, Ll/ۡ֫᩷;

    invoke-direct {v1}, Ll/ۡ֫᩷;-><init>()V

    invoke-virtual {v1, p1}, Ll/ۡ֫᩷;->֫(Ll/۬ۜܽ;)V

    invoke-direct {p0, v1}, Ll/ܰ۟ۜ;->֫(Ll/ۡ֫᩷;)V

    .line 916
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v1

    .line 917
    iget-object v2, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 919
    new-instance v5, Ll/ܺ֫᩷;

    invoke-direct {v5}, Ll/ܺ֫᩷;-><init>()V

    .line 920
    new-instance v6, Ll/ۡ֫᩷;

    invoke-direct {v6}, Ll/ۡ֫᩷;-><init>()V

    invoke-virtual {v6, p1}, Ll/ۡ֫᩷;->֫(Ll/۬ۜܽ;)V

    iput-object v6, v5, Ll/ܺ֫᩷;->ۧ:Ll/ۡ֫᩷;

    .line 921
    new-instance v6, Ll/ۡ֫᩷;

    invoke-direct {v6}, Ll/ۡ֫᩷;-><init>()V

    invoke-virtual {v6, p1}, Ll/ۡ֫᩷;->֫(Ll/۬ۜܽ;)V

    iput-object v6, v5, Ll/ܺ֫᩷;->֫:Ll/ۡ֫᩷;

    .line 922
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 924
    :cond_0
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v1

    .line 925
    iget-object v2, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_1

    .line 927
    new-instance v5, Ll/ܺ֫᩷;

    invoke-direct {v5}, Ll/ܺ֫᩷;-><init>()V

    .line 928
    new-instance v6, Ll/ۡ֫᩷;

    invoke-direct {v6}, Ll/ۡ֫᩷;-><init>()V

    invoke-virtual {v6, p1}, Ll/ۡ֫᩷;->֫(Ll/۬ۜܽ;)V

    iput-object v6, v5, Ll/ܺ֫᩷;->ۧ:Ll/ۡ֫᩷;

    .line 929
    new-instance v6, Ll/ۡ֫᩷;

    invoke-direct {v6}, Ll/ۡ֫᩷;-><init>()V

    invoke-virtual {v6, p1}, Ll/ۡ֫᩷;->֫(Ll/۬ۜܽ;)V

    iput-object v6, v5, Ll/ܺ֫᩷;->֫:Ll/ۡ֫᩷;

    .line 930
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 932
    :cond_1
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۖ()V

    .line 934
    :try_start_1
    invoke-static {p1, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 938
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->scrollTo(II)V

    .line 939
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۜ()F

    move-result v0

    iput v0, p0, Ll/ܰ۟ۜ;->۠֫:F

    .line 940
    iput-boolean v3, p0, Ll/ܰ۟ۜ;->ܶ֫:Z

    .line 941
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    .line 942
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :catch_0
    move-exception p1

    .line 936
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 911
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Z)V
    .locals 10

    if-eqz p1, :cond_0

    .line 1070
    iget-object v0, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    .line 1071
    :goto_0
    new-instance v1, Ll/۬۟ۜ;

    invoke-direct {v1, p1}, Ll/۬۟ۜ;-><init>(Z)V

    if-eqz p1, :cond_1

    .line 1072
    iget p1, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    goto :goto_1

    :cond_1
    iget p1, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    .line 1074
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    goto/16 :goto_4

    .line 1077
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_4

    .line 1078
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬۟ۜ;

    .line 1079
    iget v4, v2, Ll/ۙ۟ۜ;->᩹:I

    iget v2, v2, Ll/ۙ۟ۜ;->᩸:I

    sub-int v5, p1, v2

    if-lt v4, v5, :cond_3

    add-int/lit8 p1, v4, -0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v3, v2, 0x1

    goto :goto_4

    .line 1087
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1088
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_7

    .line 1089
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬۟ۜ;

    if-nez v6, :cond_5

    .line 1091
    new-instance v8, Ll/᩺۟ۜ;

    iget v7, v7, Ll/ۙ۟ۜ;->᩹:I

    sub-int/2addr v7, v4

    invoke-direct {v8, v3, v7}, Ll/᩺۟ۜ;-><init>(II)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    add-int/lit8 v8, v5, -0x1

    if-ne v6, v8, :cond_6

    .line 1093
    new-instance v8, Ll/᩺۟ۜ;

    iget v7, v7, Ll/ۙ۟ۜ;->᩸:I

    add-int/2addr v7, v4

    invoke-direct {v8, v7, p1}, Ll/᩺۟ۜ;-><init>(II)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    add-int/lit8 v8, v6, -0x1

    .line 1095
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۬۟ۜ;

    .line 1096
    new-instance v9, Ll/᩺۟ۜ;

    iget v8, v8, Ll/ۙ۟ۜ;->᩸:I

    add-int/2addr v8, v4

    iget v7, v7, Ll/ۙ۟ۜ;->᩹:I

    sub-int/2addr v7, v4

    invoke-direct {v9, v8, v7}, Ll/᩺۟ۜ;-><init>(II)V

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 1099
    :cond_7
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1100
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺۟ۜ;

    .line 1101
    iget v3, p1, Ll/᩺۟ۜ;->᩹:I

    .line 1102
    iget p1, p1, Ll/᩺۟ۜ;->᩸:I

    :goto_4
    sub-int v2, p1, v3

    if-gtz v2, :cond_8

    const p1, 0x7f1206f4

    .line 1106
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 1109
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    const/high16 v5, 0x41800000    # 16.0f

    mul-float v4, v4, v5

    float-to-int v4, v4

    if-le v2, v4, :cond_9

    sub-int/2addr v2, v4

    .line 1111
    div-int/lit8 v2, v2, 0x2

    sub-int/2addr p1, v2

    add-int/2addr v3, v2

    .line 1115
    :cond_9
    iput v3, v1, Ll/ۙ۟ۜ;->᩹:I

    .line 1116
    iput p1, v1, Ll/ۙ۟ۜ;->᩸:I

    .line 1117
    invoke-direct {p0}, Ll/ܰ۟ۜ;->֡()V

    .line 1118
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1119
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1120
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ᩴ()V

    .line 1121
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۜ()Z
    .locals 2

    .line 963
    iget v0, p0, Ll/ܰ۟ۜ;->֨֫:I

    iget v1, p0, Ll/ܰ۟ۜ;->ۗ:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()V
    .locals 1

    .line 1024
    invoke-direct {p0}, Ll/ܰ۟ۜ;->֡()V

    const/4 v0, 0x0

    .line 1025
    iput-object v0, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    iput-object v0, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    .line 1026
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ᩴ()V

    .line 1027
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۢ()V
    .locals 2

    .line 762
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 765
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֫᩷;

    .line 766
    iget-object v1, v0, Ll/ܺ֫᩷;->֫:Ll/ۡ֫᩷;

    invoke-direct {p0, v1}, Ll/ܰ۟ۜ;->֫(Ll/ۡ֫᩷;)V

    .line 767
    iget-object v1, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۖ()V

    return-void
.end method

.method public final ۧ(Ll/ۢ֫᩷;)V
    .locals 8

    .line 1041
    new-instance v0, Ll/۫۟ۜ;

    invoke-direct {v0}, Ll/۫۟ۜ;-><init>()V

    .line 1042
    iget-object v1, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬۟ۜ;

    .line 1043
    iget-object v4, v0, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    new-instance v5, Ll/ۙ۟ۜ;

    iget v6, v3, Ll/ۙ۟ۜ;->᩹:I

    iget v3, v3, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v5, v6, v3}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1045
    :cond_0
    iget-object v2, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬۟ۜ;

    .line 1046
    iget-object v5, v0, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    new-instance v6, Ll/ۙ۟ۜ;

    iget v7, v4, Ll/ۙ۟ۜ;->᩹:I

    iget v4, v4, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v6, v7, v4}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1048
    :cond_1
    iget-object v3, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    if-eqz v3, :cond_2

    .line 1049
    iget-object v1, v0, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    iget v2, v3, Ll/ۙ۟ۜ;->᩹:I

    iput v2, v1, Landroid/graphics/Rect;->left:I

    .line 1050
    iget v2, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v3, v3, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->right:I

    .line 1051
    iget-object v2, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    iget v3, v2, Ll/ۙ۟ۜ;->᩹:I

    iput v3, v1, Landroid/graphics/Rect;->top:I

    .line 1052
    iget v3, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    iget v2, v2, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr v3, v2

    iput v3, v1, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    .line 1054
    :cond_2
    iget-object v3, v0, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    iget v4, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v5, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    invoke-static {v1, v2, v4, v5}, Ll/۫۟ۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1056
    :goto_2
    invoke-virtual {p1, v0}, Ll/ۢ֫᩷;->֫(Ll/۫۟ۜ;)V

    .line 1057
    iget-object v0, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    if-eqz v0, :cond_3

    .line 1058
    new-instance v0, Ll/ܿ֫᩷;

    invoke-direct {v0}, Ll/ܿ֫᩷;-><init>()V

    .line 1059
    iget-object v1, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    iget v2, v1, Ll/ۙ۟ۜ;->᩹:I

    iput v2, v0, Ll/ܿ֫᩷;->ۧ:I

    .line 1060
    iget v2, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr v2, v1

    iput v2, v0, Ll/ܿ֫᩷;->ܽ:I

    .line 1061
    iget-object v1, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    iget v2, v1, Ll/ۙ۟ۜ;->᩹:I

    iput v2, v0, Ll/ܿ֫᩷;->ᩳ:I

    .line 1062
    iget v2, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr v2, v1

    iput v2, v0, Ll/ܿ֫᩷;->֫:I

    .line 1063
    invoke-virtual {p1, v0}, Ll/ۢ֫᩷;->֫(Ll/ܿ֫᩷;)V

    return-void

    :cond_3
    const/4 v0, 0x0

    .line 1065
    invoke-virtual {p1, v0}, Ll/ۢ֫᩷;->֫(Ll/ܿ֫᩷;)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 967
    iget p1, p0, Ll/ܰ۟ۜ;->᩷֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܰ۟ۜ;->᩷֫:I

    neg-int p1, p1

    goto :goto_0

    :cond_0
    iget p1, p0, Ll/ܰ۟ۜ;->ۗ:I

    :goto_0
    iput p1, p0, Ll/ܰ۟ۜ;->֨֫:I

    .line 717
    iget-object p1, p0, Ll/ܰ۟ۜ;->ۜ֫:Ll/ۤ۟ۜ;

    if-eqz p1, :cond_1

    .line 718
    invoke-virtual {p0}, Ll/ܰ۟ۜ;->ۜ()Z

    move-result v0

    invoke-interface {p1, v0}, Ll/ۤ۟ۜ;->֫(Z)V

    :cond_1
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 748
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 10

    .line 1014
    new-instance v9, Ll/ܽ֫᩷;

    iget-object v3, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    iget-object v4, p0, Ll/ܰ۟ۜ;->۫:Ll/۬۟ۜ;

    iget-object v5, p0, Ll/ܰ۟ۜ;->᩺:Ll/۬۟ۜ;

    iget-object v6, p0, Ll/ܰ۟ۜ;->ܰ:Ll/۬۟ۜ;

    iget v7, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v8, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    iget-object v1, p0, Ll/ܰ۟ۜ;->۬֫:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܰ۟ۜ;->۫֫:Ljava/util/ArrayList;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ll/ܽ֫᩷;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;II)V

    .line 975
    iget v0, p0, Ll/ܰ۟ۜ;->ܳ֫:I

    iget v1, p0, Ll/ܰ۟ۜ;->ܿ֫:I

    invoke-static {v9, v0, v1}, Ll/ᩳ֫᩷;->֫(Ll/ܽ֫᩷;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()V
    .locals 2

    .line 752
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 755
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֫᩷;

    .line 756
    iget-object v1, v0, Ll/ܺ֫᩷;->ۧ:Ll/ۡ֫᩷;

    invoke-direct {p0, v1}, Ll/ܰ۟ۜ;->֫(Ll/ۡ֫᩷;)V

    .line 757
    iget-object v1, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۖ()V

    return-void
.end method

.method public final ܽ(Z)V
    .locals 0

    .line 739
    iput-boolean p1, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    .line 740
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 744
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 723
    iget v0, p0, Ll/ܰ۟ۜ;->ۧ֫:I

    return v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 1125
    iget-object v0, p0, Ll/ܰ۟ۜ;->ۗ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ܰ۟ۜ;->ۚ֫:Ljava/util/Stack;

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 1126
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 1127
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 1128
    invoke-direct {p0}, Ll/ܰ۟ۜ;->ۖ()V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 735
    iget-boolean v0, p0, Ll/ܰ۟ۜ;->᩻֫:Z

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 1020
    iget-object v0, p0, Ll/ܰ۟ۜ;->۬:Ll/۬۟ۜ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
