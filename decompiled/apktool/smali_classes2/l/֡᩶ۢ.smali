.class public final Ll/֡᩶ۢ;
.super Landroid/view/View;
.source "81UC"


# instance fields
.field public ֡֫:I

.field public ֨֫:Ll/ܿ᩶ۢ;

.field public ֫֫:Z

.field public ۖ֫:F

.field public ۗ:I

.field public ۗ֫:Z

.field public ۘ֫:Landroid/widget/OverScroller;

.field public ۙ:Ll/֨᩶ۢ;

.field public ۙ֫:F

.field public ۚ֫:I

.field public ۛ:Ll/ۡ᩶ۢ;

.field public ۜ֫:Z

.field public ۟:Z

.field public ۠֫:Landroid/widget/EdgeEffect;

.field public ۡ֫:Landroid/graphics/drawable/BitmapDrawable;

.field public ۢ֫:Ll/ܺ᩶ۢ;

.field public ۤ:Ll/ܿ᩹ۢ;

.field public ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

.field public ۨ:Ll/᩵᩶ۢ;

.field public ۫:Landroid/graphics/PointF;

.field public ۬:Landroid/graphics/PointF;

.field public ۬֫:Z

.field public ܰ:Z

.field public ܳ֫:F

.field public ܶ֫:I

.field public ܺ֫:Landroid/graphics/PointF;

.field public ܽ֫:Landroid/graphics/PointF;

.field public ܿ֫:F

.field public ᩳ֫:F

.field public ᩴ֫:I

.field public ᩵֫:I

.field public ᩶:Landroid/widget/EdgeEffect;

.field public ᩶֫:F

.field public ᩷֫:I

.field public ᩸:F

.field public ᩸֫:I

.field public ᩹:Z

.field public ᩹֫:Z

.field public ᩺:I

.field public ᩻֫:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 124
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 84
    iput-boolean p2, p0, Ll/֡᩶ۢ;->֫֫:Z

    const/4 v0, -0x1

    .line 85
    iput v0, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    iput v0, p0, Ll/֡᩶ۢ;->᩵֫:I

    iput v0, p0, Ll/֡᩶ۢ;->֡֫:I

    iput v0, p0, Ll/֡᩶ۢ;->ۚ֫:I

    .line 878
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Ll/֡᩶ۢ;->۫:Landroid/graphics/PointF;

    .line 879
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Ll/֡᩶ۢ;->᩻֫:Landroid/graphics/PointF;

    .line 880
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Ll/֡᩶ۢ;->۬:Landroid/graphics/PointF;

    .line 1311
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Ll/֡᩶ۢ;->ܽ֫:Landroid/graphics/PointF;

    .line 1312
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Ll/֡᩶ۢ;->ܺ֫:Landroid/graphics/PointF;

    const/4 v0, 0x1

    .line 129
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 130
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 131
    invoke-virtual {p0, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 132
    invoke-virtual {p0, v0}, Landroid/view/View;->setScrollbarFadingEnabled(Z)V

    .line 133
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 134
    invoke-virtual {p0, p2}, Landroid/view/View;->setDefaultFocusHighlightEnabled(Z)V

    .line 137
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/high16 v1, 0x40400000    # 3.0f

    .line 138
    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v2, v2, v1

    iput v2, p0, Ll/֡᩶ۢ;->᩸:F

    .line 139
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float v1, v1, v0

    iput v1, p0, Ll/֡᩶ۢ;->ܳ֫:F

    const/high16 v1, 0x41f00000    # 30.0f

    mul-float v0, v0, v1

    .line 140
    iput v0, p0, Ll/֡᩶ۢ;->ܿ֫:F

    .line 142
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Ll/֡᩶ۢ;->᩸֫:I

    .line 144
    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-direct {v0, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    .line 145
    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-direct {v0, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    .line 147
    new-instance v0, Ll/ۡ᩶ۢ;

    new-instance v1, Ll/ۘ᩶ۢ;

    invoke-direct {v1, p0}, Ll/ۘ᩶ۢ;-><init>(Ll/֡᩶ۢ;)V

    invoke-direct {v0, p1, v1}, Ll/ۡ᩶ۢ;-><init>(Landroid/content/Context;Ll/ۘ᩶ۢ;)V

    iput-object v0, p0, Ll/֡᩶ۢ;->ۛ:Ll/ۡ᩶ۢ;

    .line 266
    new-instance v0, Landroid/widget/OverScroller;

    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/֡᩶ۢ;->ۘ֫:Landroid/widget/OverScroller;

    const-string v0, "accessibility"

    .line 267
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    if-eqz p1, :cond_1

    .line 268
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    :cond_1
    iput-boolean p2, p0, Ll/֡᩶ۢ;->᩹:Z

    return-void
.end method

.method public static bridge synthetic ֡(Ll/֡᩶ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֡᩶ۢ;->ܶ֫:I

    return p0
.end method

.method public static ֫(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 3

    .line 1372
    iget v0, p0, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float v2, v0, v1

    sub-float/2addr v0, v1

    mul-float v0, v0, v2

    .line 1373
    iget p0, p0, Landroid/graphics/PointF;->y:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    sub-float v1, p0, p1

    invoke-static {p0, p1, v1, v0}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p0

    float-to-double p0, p0

    .line 1375
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    return-object p0
.end method

.method private ֫(I)V
    .locals 6

    if-nez p1, :cond_0

    goto :goto_5

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 862
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_6

    .line 864
    iget-object v3, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v3}, Ll/ܿ᩹ۢ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v1, :cond_2

    const/16 v3, 0x13

    goto :goto_2

    :cond_2
    const/16 v3, 0x14

    .line 867
    :goto_2
    invoke-virtual {p0, v3, v0}, Ll/֡᩶ۢ;->֫(II)Z

    goto :goto_4

    .line 869
    :cond_3
    iget-object v3, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v3}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֫᩹ۢ;->ۧ()I

    move-result v3

    neg-int v3, v3

    iget v4, p0, Ll/֡᩶ۢ;->ܶ֫:I

    if-eqz v1, :cond_4

    const/4 v5, -0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x1

    :goto_3
    add-int/2addr v4, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p0, Ll/֡᩶ۢ;->ܶ֫:I

    .line 870
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_5
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    :goto_5
    return-void
.end method

.method private ֫(IZZ)V
    .locals 2

    .line 1152
    iget-object v0, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    if-nez v0, :cond_0

    goto/16 :goto_b

    .line 1154
    :cond_0
    iget-boolean v0, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 1155
    invoke-virtual {p0, v0}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    :cond_1
    const/4 v0, 0x1

    if-nez p2, :cond_3

    .line 1158
    iget-object p2, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    invoke-interface {p2}, Ll/֨᩶ۢ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-nez p3, :cond_5

    .line 1159
    iget-object p3, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    invoke-interface {p3}, Ll/֨᩶ۢ;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 1161
    :cond_5
    :goto_2
    iget-object p3, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    iget-object v1, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-interface {p3, p1, v1}, Ll/֨᩶ۢ;->ۧ(ILl/ܿ᩶ۢ;)Z

    move-result p3

    .line 1162
    iget-object v1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    if-eqz v1, :cond_7

    invoke-static {v1}, Ll/᩵᩶ۢ;->֫(Ll/᩵᩶ۢ;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-nez p3, :cond_6

    if-nez p2, :cond_6

    if-eqz v0, :cond_7

    .line 1164
    :cond_6
    iget-object v1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    invoke-static {v1}, Ll/᩵᩶ۢ;->ۧ(Ll/᩵᩶ۢ;)V

    :cond_7
    if-eqz p3, :cond_8

    goto/16 :goto_b

    :cond_8
    const/16 p3, 0x5e

    if-eqz p2, :cond_17

    const/16 p2, 0x61

    if-lt p1, p2, :cond_9

    const/16 p2, 0x7a

    if-gt p1, p2, :cond_9

    add-int/lit8 p1, p1, -0x60

    goto/16 :goto_9

    :cond_9
    const/16 p2, 0x41

    if-lt p1, p2, :cond_a

    const/16 p2, 0x5a

    if-gt p1, p2, :cond_a

    add-int/lit8 p1, p1, -0x40

    goto :goto_9

    :cond_a
    const/16 p2, 0x20

    if-eq p1, p2, :cond_16

    const/16 p2, 0x32

    if-ne p1, p2, :cond_b

    goto :goto_8

    :cond_b
    const/16 p2, 0x5b

    if-eq p1, p2, :cond_15

    const/16 p2, 0x33

    if-ne p1, p2, :cond_c

    goto :goto_7

    :cond_c
    const/16 p2, 0x5c

    if-eq p1, p2, :cond_14

    const/16 p2, 0x34

    if-ne p1, p2, :cond_d

    goto :goto_6

    :cond_d
    const/16 p2, 0x5d

    if-eq p1, p2, :cond_13

    const/16 p2, 0x35

    if-ne p1, p2, :cond_e

    goto :goto_5

    :cond_e
    if-eq p1, p3, :cond_12

    const/16 p2, 0x36

    if-ne p1, p2, :cond_f

    goto :goto_4

    :cond_f
    const/16 p2, 0x5f

    if-eq p1, p2, :cond_11

    const/16 p2, 0x37

    if-eq p1, p2, :cond_11

    const/16 p2, 0x2f

    if-ne p1, p2, :cond_10

    goto :goto_3

    :cond_10
    const/16 p2, 0x38

    if-ne p1, p2, :cond_17

    const/16 p1, 0x7f

    goto :goto_9

    :cond_11
    :goto_3
    const/16 p1, 0x1f

    goto :goto_9

    :cond_12
    :goto_4
    const/16 p1, 0x1e

    goto :goto_9

    :cond_13
    :goto_5
    const/16 p1, 0x1d

    goto :goto_9

    :cond_14
    :goto_6
    const/16 p1, 0x1c

    goto :goto_9

    :cond_15
    :goto_7
    const/16 p1, 0x1b

    goto :goto_9

    :cond_16
    :goto_8
    const/4 p1, 0x0

    :cond_17
    :goto_9
    const/4 p2, -0x1

    if-le p1, p2, :cond_1c

    const/16 p2, 0x2c6

    if-eq p1, p2, :cond_1a

    const/16 p2, 0x2cb

    if-eq p1, p2, :cond_19

    const/16 p2, 0x2dc

    if-eq p1, p2, :cond_18

    move p3, p1

    goto :goto_a

    :cond_18
    const/16 p3, 0x7e

    goto :goto_a

    :cond_19
    const/16 p3, 0x60

    .line 1209
    :cond_1a
    :goto_a
    iget-object p1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    if-eqz p1, :cond_1b

    invoke-static {p1}, Ll/᩵᩶ۢ;->֫(Ll/᩵᩶ۢ;)Z

    move-result p1

    if-nez p1, :cond_1b

    .line 1210
    iget-object p1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    invoke-static {p1}, Ll/᩵᩶ۢ;->ܽ(Ll/᩵᩶ۢ;)V

    .line 1212
    :cond_1b
    iget-object p1, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-virtual {p1, p3, v0}, Ll/ܿ᩶ۢ;->֫(IZ)V

    .line 1213
    invoke-direct {p0}, Ll/֡᩶ۢ;->ܿ()V

    :cond_1c
    :goto_b
    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡᩶ۢ;F)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡᩶ۢ;->ۖ֫:F

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡᩶ۢ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֡᩶ۢ;->֫(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡᩶ۢ;IZ)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, p2, v0}, Ll/֡᩶ۢ;->֫(IZZ)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡᩶ۢ;Ll/᩵᩶ۢ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    return-void
.end method

.method public static bridge synthetic ۖ(Ll/֡᩶ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֡᩶ۢ;->֡֫:I

    return p0
.end method

.method public static bridge synthetic ۘ(Ll/֡᩶ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֡᩶ۢ;->ۚ֫:I

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/֡᩶ۢ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/֡᩶ۢ;->֫֫:Z

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/֡᩶ۢ;)Ll/ܺ᩶ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/֡᩶ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->ۘ֫:Landroid/widget/OverScroller;

    return-object p0
.end method

.method public static ۧ(Landroid/view/MotionEvent;)F
    .locals 4

    const/4 v0, 0x0

    .line 1056
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    .line 1057
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p0

    sub-float/2addr v0, p0

    mul-float v1, v1, v1

    mul-float v0, v0, v0

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 1058
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֡᩶ۢ;)Ll/֨᩶ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/֡᩶ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֡᩶ۢ;->᩺:I

    return p0
.end method

.method public static bridge synthetic ܺ(Ll/֡᩶ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֡᩶ۢ;->᩵֫:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/֡᩶ۢ;)Landroid/graphics/PointF;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->۫:Landroid/graphics/PointF;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    return-object p0
.end method

.method private ܿ()V
    .locals 1

    .line 1260
    iget v0, p0, Ll/֡᩶ۢ;->ܶ֫:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1261
    iput v0, p0, Ll/֡᩶ۢ;->ܶ֫:I

    .line 1262
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->֫()V

    .line 1263
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/֡᩶ۢ;)Ll/ܿ᩶ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    return-object p0
.end method

.method public static bridge synthetic ᩵(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/֡᩶ۢ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/֡᩶ۢ;->ۖ֫:F

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/֡᩶ۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֡᩶ۢ;->֫֫:Z

    return p0
.end method


# virtual methods
.method public final computeVerticalScrollExtent()I
    .locals 1

    .line 749
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget v0, v0, Ll/ܿ᩹ۢ;->᩹:I

    return v0
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    .line 754
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫᩹ۢ;->֫()I

    move-result v0

    iget v1, p0, Ll/֡᩶ۢ;->ܶ֫:I

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v1, v1, Ll/ܿ᩹ۢ;->᩹:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final computeVerticalScrollRange()I
    .locals 1

    .line 744
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫᩹ۢ;->֫()I

    move-result v0

    return v0
.end method

.method public final isOpaque()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    const/4 v0, 0x0

    .line 424
    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/high16 v1, 0x2000000

    .line 429
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 431
    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 434
    new-instance p1, Ll/᩵᩶ۢ;

    invoke-direct {p1, p0}, Ll/᩵᩶ۢ;-><init>(Ll/֡᩶ۢ;)V

    return-object p1
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1316
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-nez v0, :cond_0

    const/high16 v0, -0x1000000

    .line 1317
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    return-void

    .line 1319
    :cond_0
    iget v0, p0, Ll/֡᩶ۢ;->᩸:F

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1321
    iget-object v2, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget-object v3, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v5, p0, Ll/֡᩶ۢ;->ܶ֫:I

    iget v6, p0, Ll/֡᩶ۢ;->֡֫:I

    iget v7, p0, Ll/֡᩶ۢ;->ۚ֫:I

    iget v8, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    iget v9, p0, Ll/֡᩶ۢ;->᩵֫:I

    move-object v4, p1

    invoke-virtual/range {v2 .. v9}, Ll/ܺ᩶ۢ;->֫(Ll/ܿ᩹ۢ;Landroid/graphics/Canvas;IIIII)V

    .line 1323
    iget-boolean v0, p0, Ll/֡᩶ۢ;->֫֫:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 1324
    iget-object v0, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v0

    .line 1325
    div-int/lit8 v3, v0, 0x4

    .line 1327
    iget v4, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    int-to-float v4, v4

    iget-object v5, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v5, v5, Ll/ܺ᩶ۢ;->ܿ:F

    mul-float v4, v4, v5

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-int/2addr v4, v3

    .line 1328
    iget v5, p0, Ll/֡᩶ۢ;->֡֫:I

    add-int/2addr v5, v2

    iget v6, p0, Ll/֡᩶ۢ;->ܶ֫:I

    sub-int/2addr v5, v6

    iget-object v6, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v7, v6, Ll/ܺ᩶ۢ;->ܽ:I

    mul-int v5, v5, v7

    iget v6, v6, Ll/ܺ᩶ۢ;->ᩳ:I

    add-int/2addr v5, v6

    .line 1329
    iget-object v6, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    sub-int v7, v4, v0

    invoke-virtual {v6}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v8

    add-int/2addr v8, v5

    invoke-virtual {v6, v7, v5, v4, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1330
    iget-object v4, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 1332
    iget v4, p0, Ll/֡᩶ۢ;->᩵֫:I

    add-int/2addr v4, v2

    int-to-float v4, v4

    iget-object v5, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v5, v5, Ll/ܺ᩶ۢ;->ܿ:F

    mul-float v4, v4, v5

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    sub-int/2addr v4, v3

    .line 1333
    iget v3, p0, Ll/֡᩶ۢ;->ۚ֫:I

    add-int/2addr v3, v2

    iget v5, p0, Ll/֡᩶ۢ;->ܶ֫:I

    sub-int/2addr v3, v5

    iget-object v5, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v6, v5, Ll/ܺ᩶ۢ;->ܽ:I

    mul-int v3, v3, v6

    iget v5, v5, Ll/ܺ᩶ۢ;->ᩳ:I

    add-int/2addr v3, v5

    .line 1334
    iget-object v5, p0, Ll/֡᩶ۢ;->ۡ֫:Landroid/graphics/drawable/BitmapDrawable;

    add-int/2addr v0, v4

    invoke-virtual {v5}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v6

    add-int/2addr v6, v3

    invoke-virtual {v5, v4, v3, v0, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1335
    iget-object v0, p0, Ll/֡᩶ۢ;->ۡ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 1337
    iget-object v0, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 1338
    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iget v5, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v0

    int-to-float v0, v5

    div-float/2addr v0, v4

    iget-object v5, p0, Ll/֡᩶ۢ;->ܽ֫:Landroid/graphics/PointF;

    invoke-virtual {v5, v3, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 1339
    iget-object v0, p0, Ll/֡᩶ۢ;->ۡ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 1340
    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v5

    int-to-float v3, v3

    div-float/2addr v3, v4

    iget v5, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v0

    int-to-float v0, v5

    div-float/2addr v0, v4

    iget-object v4, p0, Ll/֡᩶ۢ;->ܺ֫:Landroid/graphics/PointF;

    invoke-virtual {v4, v3, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 1343
    :cond_1
    iget v0, p0, Ll/֡᩶ۢ;->᩸:F

    neg-float v0, v0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/16 v0, 0x104

    .line 1346
    iget-object v3, p0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_3

    .line 1347
    iget-object v3, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget-object v3, v3, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    iget-object v3, v3, Ll/ܽ᩹ۢ;->֫:[I

    aget v3, v3, v0

    .line 1429
    iget-object v4, p0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v4, v3}, Landroid/widget/EdgeEffect;->setColor(I)V

    .line 1348
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 1349
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p1, v4, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1350
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v5, p0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v5, v1, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 1351
    iget-object v1, p0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 1352
    :goto_0
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 1355
    :goto_1
    iget-object v3, p0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_5

    .line 1356
    iget-object v3, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget-object v3, v3, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    iget-object v3, v3, Ll/ܽ᩹ۢ;->֫:[I

    aget v0, v3, v0

    .line 1429
    iget-object v3, p0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    invoke-virtual {v3, v0}, Landroid/widget/EdgeEffect;->setColor(I)V

    .line 1357
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/high16 v3, 0x43340000    # 180.0f

    .line 1358
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 1359
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1360
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v5, p0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    invoke-virtual {v5, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 1361
    iget-object v3, p0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_4

    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    or-int/2addr v1, v2

    .line 1362
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_5
    if-eqz v1, :cond_6

    .line 1366
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_6
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 8

    .line 1090
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 1092
    :cond_0
    iget-object v0, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    iget-object v2, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-interface {v0, p1, v2}, Ll/֨᩶ۢ;->֫(ILl/ܿ᩶ۢ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1093
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v1

    .line 1095
    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 1097
    :cond_2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    if-nez p1, :cond_4

    .line 1098
    iget-object p1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    if-eqz p1, :cond_3

    invoke-static {p1}, Ll/᩵᩶ۢ;->ܽ(Ll/᩵᩶ۢ;)V

    .line 1099
    :cond_3
    iget-object p1, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getCharacters()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return v1

    .line 1103
    :cond_4
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    .line 1104
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v2

    and-int/lit8 v3, v0, 0x10

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    const/4 v3, 0x1

    goto :goto_0

    :cond_5
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    if-eqz v2, :cond_7

    const/high16 v5, 0x40000000    # 2.0f

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    .line 1110
    :goto_2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result v6

    const/high16 v7, -0x80000000

    if-eqz v6, :cond_8

    or-int/2addr v5, v7

    .line 1111
    :cond_8
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v6

    if-eqz v6, :cond_9

    const/high16 v6, 0x20000000

    or-int/2addr v5, v6

    .line 1112
    :cond_9
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isFunctionPressed()Z

    move-result v6

    if-nez v6, :cond_a

    invoke-virtual {p0, p1, v5}, Ll/֡᩶ۢ;->֫(II)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_5

    :cond_a
    if-eqz v0, :cond_b

    const/16 p1, 0x7000

    goto :goto_3

    :cond_b
    const/16 p1, 0x7012

    .line 1124
    :goto_3
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    not-int p1, p1

    and-int/2addr p1, v0

    .line 1126
    invoke-virtual {p2, p1}, Landroid/view/KeyEvent;->getUnicodeChar(I)I

    move-result p1

    if-nez p1, :cond_c

    return v4

    .line 1131
    :cond_c
    iget p2, p0, Ll/֡᩶ۢ;->ۗ:I

    and-int v0, p1, v7

    if-eqz v0, :cond_e

    if-eqz p2, :cond_d

    .line 1135
    invoke-direct {p0, p2, v2, v3}, Ll/֡᩶ۢ;->֫(IZZ)V

    :cond_d
    const v0, 0x7fffffff

    and-int/2addr p1, v0

    .line 1136
    iput p1, p0, Ll/֡᩶ۢ;->ۗ:I

    goto :goto_4

    :cond_e
    if-eqz p2, :cond_10

    .line 1139
    invoke-static {p2, p1}, Landroid/view/KeyCharacterMap;->getDeadChar(II)I

    move-result v0

    if-lez v0, :cond_f

    move p1, v0

    .line 1141
    :cond_f
    iput v4, p0, Ll/֡᩶ۢ;->ۗ:I

    .line 1143
    :cond_10
    invoke-direct {p0, p1, v2, v3}, Ll/֡᩶ۢ;->֫(IZZ)V

    .line 1146
    :goto_4
    iget p1, p0, Ll/֡᩶ۢ;->ۗ:I

    if-eq p1, p2, :cond_11

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_11
    :goto_5
    return v1
.end method

.method public final onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 1072
    iget-boolean v0, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 1073
    invoke-virtual {p0, p1}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1

    .line 1075
    :cond_0
    iget-object v0, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1242
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 1244
    :cond_0
    iget-object v0, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1247
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1249
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1273
    invoke-virtual {p0}, Ll/֡᩶ۢ;->ᩳ()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 893
    iget-object v2, v0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    const/4 v3, 0x1

    if-nez v2, :cond_0

    goto/16 :goto_7

    .line 894
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v4, 0x3

    const/4 v5, 0x2

    .line 896
    iget-object v6, v0, Ll/֡᩶ۢ;->۫:Landroid/graphics/PointF;

    const/4 v7, 0x0

    if-eqz v2, :cond_7

    if-eq v2, v3, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_4

    const/4 v8, 0x5

    if-eq v2, v8, :cond_2

    const/4 v8, 0x6

    if-eq v2, v8, :cond_1

    goto/16 :goto_1

    .line 925
    :cond_1
    iget v8, v0, Ll/֡᩶ۢ;->᩷֫:I

    sub-int/2addr v8, v3

    iput v8, v0, Ll/֡᩶ۢ;->᩷֫:I

    .line 926
    iget-boolean v9, v0, Ll/֡᩶ۢ;->۬֫:Z

    if-eqz v9, :cond_8

    if-nez v8, :cond_8

    .line 927
    iput-boolean v7, v0, Ll/֡᩶ۢ;->۬֫:Z

    goto/16 :goto_1

    .line 915
    :cond_2
    iget v8, v0, Ll/֡᩶ۢ;->᩷֫:I

    add-int/2addr v8, v3

    iput v8, v0, Ll/֡᩶ۢ;->᩷֫:I

    if-ne v8, v3, :cond_8

    .line 917
    iput-boolean v3, v0, Ll/֡᩶ۢ;->۬֫:Z

    .line 918
    iput-boolean v3, v0, Ll/֡᩶ۢ;->ۗ֫:Z

    .line 822
    iget-object v8, v0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v8, v8, Ll/ܺ᩶ۢ;->᩻:F

    .line 919
    iput v8, v0, Ll/֡᩶ۢ;->ۙ֫:F

    .line 920
    invoke-static/range {p1 .. p1}, Ll/֡᩶ۢ;->ۧ(Landroid/view/MotionEvent;)F

    move-result v8

    iput v8, v0, Ll/֡᩶ۢ;->᩶֫:F

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    .line 921
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v8

    iget-object v9, v0, Ll/֡᩶ۢ;->ۛ:Ll/ۡ᩶ۢ;

    invoke-virtual {v9, v8}, Ll/ۡ᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 906
    :cond_3
    iget-boolean v8, v0, Ll/֡᩶ۢ;->ۜ֫:Z

    if-nez v8, :cond_8

    new-instance v8, Landroid/graphics/PointF;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    invoke-direct {v8, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v6, v8}, Ll/֡᩶ۢ;->֫(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v8

    iget v9, v0, Ll/֡᩶ۢ;->᩸֫:I

    int-to-float v9, v9

    cmpl-float v8, v8, v9

    if-ltz v8, :cond_8

    .line 907
    iput-boolean v3, v0, Ll/֡᩶ۢ;->ۜ֫:Z

    goto :goto_1

    .line 273
    :cond_4
    iget-object v8, v0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    if-eqz v8, :cond_5

    .line 274
    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 275
    iget-object v8, v0, Ll/֡᩶ۢ;->۠֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v8

    goto :goto_0

    :cond_5
    const/4 v8, 0x0

    .line 277
    :goto_0
    iget-object v9, v0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    if-eqz v9, :cond_6

    .line 278
    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 279
    iget-object v9, v0, Ll/֡᩶ۢ;->᩶:Landroid/widget/EdgeEffect;

    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v9

    or-int/2addr v8, v9

    :cond_6
    if-eqz v8, :cond_8

    .line 282
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1

    .line 898
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    invoke-virtual {v6, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 899
    iput-boolean v7, v0, Ll/֡᩶ۢ;->ܰ:Z

    .line 900
    iput-boolean v7, v0, Ll/֡᩶ۢ;->ۜ֫:Z

    .line 901
    iput-boolean v7, v0, Ll/֡᩶ۢ;->۬֫:Z

    .line 902
    iput-boolean v7, v0, Ll/֡᩶ۢ;->ۗ֫:Z

    .line 903
    iput-boolean v7, v0, Ll/֡᩶ۢ;->᩹֫:Z

    :cond_8
    :goto_1
    if-ne v2, v5, :cond_c

    .line 933
    iget-boolean v8, v0, Ll/֡᩶ۢ;->۬֫:Z

    if-eqz v8, :cond_c

    iget v8, v0, Ll/֡᩶ۢ;->᩷֫:I

    if-ne v8, v3, :cond_c

    .line 934
    invoke-static/range {p1 .. p1}, Ll/֡᩶ۢ;->ۧ(Landroid/view/MotionEvent;)F

    move-result v1

    .line 935
    iget-boolean v2, v0, Ll/֡᩶ۢ;->᩹֫:Z

    if-nez v2, :cond_9

    .line 936
    iget v2, v0, Ll/֡᩶ۢ;->᩶֫:F

    sub-float v2, v1, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v4, v0, Ll/֡᩶ۢ;->᩸֫:I

    int-to-float v4, v4

    cmpl-float v2, v2, v4

    if-lez v2, :cond_1c

    .line 937
    iput-boolean v3, v0, Ll/֡᩶ۢ;->᩹֫:Z

    .line 940
    :cond_9
    iget v2, v0, Ll/֡᩶ۢ;->ۙ֫:F

    mul-float v2, v2, v1

    iget v1, v0, Ll/֡᩶ۢ;->᩶֫:F

    div-float/2addr v2, v1

    .line 941
    iget v1, v0, Ll/֡᩶ۢ;->ܿ֫:F

    cmpl-float v4, v2, v1

    if-lez v4, :cond_a

    :goto_2
    move v2, v1

    goto :goto_3

    .line 943
    :cond_a
    iget v1, v0, Ll/֡᩶ۢ;->ܳ֫:F

    cmpg-float v4, v2, v1

    if-gez v4, :cond_b

    goto :goto_2

    .line 946
    :cond_b
    :goto_3
    new-instance v1, Ll/ܺ᩶ۢ;

    iget-object v4, v0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget-object v4, v4, Ll/ܺ᩶ۢ;->ۜ:Landroid/graphics/Typeface;

    invoke-direct {v1, v2, v4}, Ll/ܺ᩶ۢ;-><init>(FLandroid/graphics/Typeface;)V

    iput-object v1, v0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    .line 947
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    return v3

    :cond_c
    if-eq v2, v3, :cond_d

    if-ne v2, v4, :cond_e

    .line 953
    :cond_d
    iget-boolean v4, v0, Ll/֡᩶ۢ;->ۗ֫:Z

    if-eqz v4, :cond_e

    iget-boolean v4, v0, Ll/֡᩶ۢ;->᩹֫:Z

    if-eqz v4, :cond_e

    .line 954
    invoke-virtual/range {p0 .. p0}, Ll/֡᩶ۢ;->ᩳ()V

    return v3

    .line 959
    :cond_e
    iget-boolean v4, v0, Ll/֡᩶ۢ;->ۗ֫:Z

    if-eqz v4, :cond_f

    goto/16 :goto_7

    .line 963
    :cond_f
    iget-boolean v4, v0, Ll/֡᩶ۢ;->֫֫:Z

    if-nez v4, :cond_10

    .line 964
    iget-object v2, v0, Ll/֡᩶ۢ;->ۛ:Ll/ۡ᩶ۢ;

    invoke-virtual {v2, v1}, Ll/ۡ᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    return v3

    .line 967
    :cond_10
    iget-boolean v4, v0, Ll/֡᩶ۢ;->ܰ:Z

    iget-object v8, v0, Ll/֡᩶ۢ;->۬:Landroid/graphics/PointF;

    if-eqz v4, :cond_1d

    if-eq v2, v3, :cond_1a

    if-eq v2, v5, :cond_11

    goto/16 :goto_8

    .line 983
    :cond_11
    iget-boolean v2, v0, Ll/֡᩶ۢ;->ۜ֫:Z

    if-nez v2, :cond_12

    goto/16 :goto_7

    .line 986
    :cond_12
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v4, v0, Ll/֡᩶ۢ;->᩻֫:Landroid/graphics/PointF;

    invoke-virtual {v4, v2, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 987
    iget v1, v8, Landroid/graphics/PointF;->x:F

    iget v2, v8, Landroid/graphics/PointF;->y:F

    invoke-virtual {v4, v1, v2}, Landroid/graphics/PointF;->offset(FF)V

    .line 988
    iget v1, v4, Landroid/graphics/PointF;->x:F

    iget-object v2, v0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v5, v2, Ll/ܺ᩶ۢ;->ܿ:F

    div-float/2addr v1, v5

    float-to-int v1, v1

    .line 989
    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget v2, v2, Ll/ܺ᩶ۢ;->ܽ:I

    int-to-float v2, v2

    div-float/2addr v4, v2

    float-to-int v2, v4

    iget v4, v0, Ll/֡᩶ۢ;->ܶ֫:I

    add-int/2addr v2, v4

    .line 990
    iget-boolean v4, v0, Ll/֡᩶ۢ;->۟:Z

    if-eqz v4, :cond_13

    .line 991
    iput v1, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    .line 992
    iput v2, v0, Ll/֡᩶ۢ;->֡֫:I

    goto :goto_4

    .line 994
    :cond_13
    iput v1, v0, Ll/֡᩶ۢ;->᩵֫:I

    .line 995
    iput v2, v0, Ll/֡᩶ۢ;->ۚ֫:I

    .line 999
    :goto_4
    iget-object v1, v0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v2, v1, Ll/ܿ᩹ۢ;->ۜ:I

    sub-int/2addr v2, v3

    .line 1000
    invoke-virtual {v1}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫᩹ۢ;->ۧ()I

    move-result v1

    neg-int v1, v1

    .line 1001
    iget-object v4, v0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v4, v4, Ll/ܿ᩹ۢ;->᩹:I

    sub-int/2addr v4, v3

    .line 1003
    iget v5, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    iput v5, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    .line 1004
    iget v5, v0, Ll/֡᩶ۢ;->᩵֫:I

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v0, Ll/֡᩶ۢ;->᩵֫:I

    .line 1005
    iget v2, v0, Ll/֡᩶ۢ;->֡֫:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v0, Ll/֡᩶ۢ;->֡֫:I

    .line 1006
    iget v2, v0, Ll/֡᩶ۢ;->ۚ֫:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Ll/֡᩶ۢ;->ۚ֫:I

    .line 1008
    iget v2, v0, Ll/֡᩶ۢ;->֡֫:I

    if-ne v2, v1, :cond_14

    iget v4, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    iget v5, v0, Ll/֡᩶ۢ;->᩵֫:I

    if-gt v4, v5, :cond_15

    :cond_14
    if-le v2, v1, :cond_16

    .line 1010
    :cond_15
    iget-boolean v4, v0, Ll/֡᩶ۢ;->۟:Z

    xor-int/2addr v4, v3

    iput-boolean v4, v0, Ll/֡᩶ۢ;->۟:Z

    .line 1011
    iget v4, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    .line 1012
    iget v5, v0, Ll/֡᩶ۢ;->᩵֫:I

    iput v5, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    .line 1013
    iput v1, v0, Ll/֡᩶ۢ;->֡֫:I

    .line 1014
    iput v4, v0, Ll/֡᩶ۢ;->᩵֫:I

    .line 1015
    iput v2, v0, Ll/֡᩶ۢ;->ۚ֫:I

    .line 1018
    :cond_16
    iget-boolean v1, v0, Ll/֡᩶ۢ;->۟:Z

    if-eqz v1, :cond_17

    iget v1, v0, Ll/֡᩶ۢ;->֡֫:I

    goto :goto_5

    :cond_17
    iget v1, v0, Ll/֡᩶ۢ;->ۚ֫:I

    .line 1062
    :goto_5
    iget v2, v0, Ll/֡᩶ۢ;->ܶ֫:I

    if-ge v1, v2, :cond_18

    sub-int/2addr v1, v2

    .line 1063
    invoke-direct {v0, v1}, Ll/֡᩶ۢ;->֫(I)V

    goto :goto_6

    .line 1064
    :cond_18
    iget-object v4, v0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v4, v4, Ll/ܿ᩹ۢ;->᩹:I

    add-int/2addr v2, v4

    if-gt v2, v1, :cond_19

    sub-int/2addr v1, v2

    add-int/2addr v1, v3

    .line 1065
    invoke-direct {v0, v1}, Ll/֡᩶ۢ;->֫(I)V

    .line 1022
    :cond_19
    :goto_6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    return v3

    .line 971
    :cond_1a
    iget-boolean v1, v0, Ll/֡᩶ۢ;->ۜ֫:Z

    const-string v2, "term_copy_text_tip"

    if-nez v1, :cond_1b

    iget v1, v0, Ll/֡᩶ۢ;->֡֫:I

    iget v4, v0, Ll/֡᩶ۢ;->ۚ֫:I

    if-ne v1, v4, :cond_1b

    iget v5, v0, Ll/֡᩶ۢ;->᩵֫:I

    iget v6, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    sub-int v8, v5, v6

    const/16 v9, 0xa

    if-ge v8, v9, :cond_1b

    .line 972
    iget-object v8, v0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v8, v6, v1, v5, v4}, Ll/ܿ᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 973
    iget-object v4, v0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-virtual {v4, v1}, Ll/ܿ᩶ۢ;->֫(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 974
    invoke-virtual {v0, v1}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    .line 975
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 976
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v2, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return v3

    .line 978
    :cond_1b
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1c

    const v1, 0x7f120a35

    .line 979
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1c
    :goto_7
    return v3

    :cond_1d
    if-nez v2, :cond_1f

    .line 1028
    iget-object v2, v0, Ll/֡᩶ۢ;->ܽ֫:Landroid/graphics/PointF;

    invoke-static {v6, v2}, Ll/֡᩶ۢ;->֫(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v2

    .line 1029
    iget-object v4, v0, Ll/֡᩶ۢ;->ܺ֫:Landroid/graphics/PointF;

    invoke-static {v6, v4}, Ll/֡᩶ۢ;->֫(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v4

    cmpg-float v5, v2, v4

    if-gez v5, :cond_1e

    .line 1030
    iget v5, v0, Ll/֡᩶ۢ;->ᩳ֫:F

    cmpg-float v2, v2, v5

    if-gtz v2, :cond_1e

    .line 1031
    iput-boolean v3, v0, Ll/֡᩶ۢ;->ܰ:Z

    .line 1032
    iput-boolean v3, v0, Ll/֡᩶ۢ;->۟:Z

    .line 1034
    iget v1, v0, Ll/֡᩶ۢ;->ᩴ֫:I

    int-to-float v1, v1

    iget-object v2, v0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v4, v2, Ll/ܺ᩶ۢ;->ܿ:F

    mul-float v1, v1, v4

    .line 1035
    iget v4, v0, Ll/֡᩶ۢ;->֡֫:I

    iget v5, v0, Ll/֡᩶ۢ;->ܶ֫:I

    sub-int/2addr v4, v5

    iget v2, v2, Ll/ܺ᩶ۢ;->ܽ:I

    mul-int v4, v4, v2

    int-to-float v2, v4

    .line 1036
    iget v4, v6, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v4

    iget v4, v6, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v4

    invoke-virtual {v8, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 1037
    iput-boolean v7, v0, Ll/֡᩶ۢ;->ۜ֫:Z

    return v3

    .line 1039
    :cond_1e
    iget v2, v0, Ll/֡᩶ۢ;->ᩳ֫:F

    cmpg-float v2, v4, v2

    if-gtz v2, :cond_1f

    .line 1040
    iput-boolean v3, v0, Ll/֡᩶ۢ;->ܰ:Z

    .line 1041
    iput-boolean v7, v0, Ll/֡᩶ۢ;->۟:Z

    .line 1043
    iget v1, v0, Ll/֡᩶ۢ;->᩵֫:I

    int-to-float v1, v1

    iget-object v2, v0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v4, v2, Ll/ܺ᩶ۢ;->ܿ:F

    mul-float v1, v1, v4

    .line 1044
    iget v4, v0, Ll/֡᩶ۢ;->ۚ֫:I

    iget v5, v0, Ll/֡᩶ۢ;->ܶ֫:I

    sub-int/2addr v4, v5

    iget v2, v2, Ll/ܺ᩶ۢ;->ܽ:I

    mul-int v4, v4, v2

    int-to-float v2, v4

    .line 1045
    iget v4, v6, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v4

    iget v4, v6, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v4

    invoke-virtual {v8, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 1046
    iput-boolean v7, v0, Ll/֡᩶ۢ;->ۜ֫:Z

    return v3

    .line 1051
    :cond_1f
    :goto_8
    iget-object v2, v0, Ll/֡᩶ۢ;->ۛ:Ll/ۡ᩶ۢ;

    invoke-virtual {v2, v1}, Ll/ۡ᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    return v3
.end method

.method public final setOnKeyListener(Landroid/view/View$OnKeyListener;)V
    .locals 1

    .line 296
    instance-of v0, p1, Ll/֨᩶ۢ;

    if-eqz v0, :cond_0

    .line 297
    check-cast p1, Ll/֨᩶ۢ;

    .line 291
    iput-object p1, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    :cond_0
    return-void
.end method

.method public final ֫(F)V
    .locals 2

    .line 826
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 827
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float p1, p1, v0

    .line 836
    iget-object v0, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    if-eqz v0, :cond_1

    iget v1, v0, Ll/ܺ᩶ۢ;->᩻:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 837
    :cond_1
    :goto_0
    new-instance v1, Ll/ܺ᩶ۢ;

    if-nez v0, :cond_2

    invoke-static {}, Ll/ۙ᩸᩷;->ۖ()Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, v0, Ll/ܺ᩶ۢ;->ۜ:Landroid/graphics/Typeface;

    :goto_1
    invoke-direct {v1, p1, v0}, Ll/ܺ᩶ۢ;-><init>(FLandroid/graphics/Typeface;)V

    iput-object v1, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    .line 838
    invoke-virtual {p0}, Ll/֡᩶ۢ;->ᩳ()V

    return-void
.end method

.method public final ֫(Landroid/graphics/Typeface;)V
    .locals 2

    .line 843
    iget-object v0, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget-object v1, v0, Ll/ܺ᩶ۢ;->ۜ:Landroid/graphics/Typeface;

    if-eq v1, p1, :cond_0

    .line 844
    new-instance v1, Ll/ܺ᩶ۢ;

    iget v0, v0, Ll/ܺ᩶ۢ;->᩻:F

    invoke-direct {v1, v0, p1}, Ll/ܺ᩶ۢ;-><init>(FLandroid/graphics/Typeface;)V

    iput-object v1, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    .line 845
    invoke-virtual {p0}, Ll/֡᩶ۢ;->ᩳ()V

    .line 846
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1383
    iget-boolean v0, p0, Ll/֡᩶ۢ;->֫֫:Z

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-nez v0, :cond_5

    .line 1386
    iget-object v0, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    if-nez v0, :cond_0

    .line 1387
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0802b5

    const/4 v2, 0x0

    .line 1388
    invoke-static {v0, v1, v2}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    iput-object v1, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    const v1, 0x7f0802b7

    .line 1389
    invoke-static {v0, v1, v2}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    iput-object v0, p0, Ll/֡᩶ۢ;->ۡ֫:Landroid/graphics/drawable/BitmapDrawable;

    .line 1390
    iget-object v0, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    const/16 v1, 0xd2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;->setAlpha(I)V

    .line 1391
    iget-object v0, p0, Ll/֡᩶ۢ;->ۡ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;->setAlpha(I)V

    .line 1392
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    sget v1, Ll/᩹֡᩷;->֫:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 1393
    iget-object v1, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/BitmapDrawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 1394
    iget-object v1, p0, Ll/֡᩶ۢ;->ۡ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/BitmapDrawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 1395
    iget-object v0, p0, Ll/֡᩶ۢ;->ۧ֫:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3fe66666    # 1.8f

    mul-float v0, v0, v1

    iput v0, p0, Ll/֡᩶ۢ;->ᩳ֫:F

    .line 1398
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v1, v1, Ll/ܺ᩶ۢ;->ܿ:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    .line 1399
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v1, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v1, v1, Ll/ܺ᩶ۢ;->ܽ:I

    int-to-float v1, v1

    div-float/2addr p1, v1

    float-to-int p1, p1

    iget v1, p0, Ll/֡᩶ۢ;->ܶ֫:I

    add-int/2addr p1, v1

    .line 1401
    iget-object v1, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v1}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫᩹ۢ;->ۧ()I

    move-result v1

    neg-int v1, v1

    .line 1402
    iget-object v2, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v3, v2, Ll/ܿ᩹ۢ;->᩹:I

    add-int/lit8 v3, v3, -0x1

    if-lt p1, v1, :cond_4

    if-le p1, v3, :cond_1

    goto :goto_2

    .line 1407
    :cond_1
    iput v0, p0, Ll/֡᩶ۢ;->᩵֫:I

    iput v0, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    .line 1408
    iput p1, p0, Ll/֡᩶ۢ;->ۚ֫:I

    iput p1, p0, Ll/֡᩶ۢ;->֡֫:I

    .line 1410
    invoke-virtual {v2}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object p1

    .line 1411
    iget v0, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    iget v1, p0, Ll/֡᩶ۢ;->֡֫:I

    invoke-virtual {p1, v0, v1, v0, v1}, Ll/֫᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1413
    :goto_0
    iget v0, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    if-lez v0, :cond_2

    add-int/lit8 v1, v0, -0x1

    iget v2, p0, Ll/֡᩶ۢ;->֡֫:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v1, v2, v0, v2}, Ll/֫᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1414
    iget v0, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    goto :goto_0

    .line 1416
    :cond_2
    :goto_1
    iget v0, p0, Ll/֡᩶ۢ;->᩵֫:I

    iget-object v1, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v1, v1, Ll/ܿ᩹ۢ;->ۜ:I

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_3

    add-int/lit8 v1, v0, 0x1

    iget v2, p0, Ll/֡᩶ۢ;->֡֫:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v1, v2, v0, v2}, Ll/֫᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1417
    iget v0, p0, Ll/֡᩶ۢ;->᩵֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֡᩶ۢ;->᩵֫:I

    goto :goto_1

    .line 1421
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_4
    :goto_2
    return-void

    :cond_5
    const/4 p1, -0x1

    .line 1423
    iput p1, p0, Ll/֡᩶ۢ;->ۚ֫:I

    iput p1, p0, Ll/֡᩶ۢ;->᩵֫:I

    iput p1, p0, Ll/֡᩶ۢ;->֡֫:I

    iput p1, p0, Ll/֡᩶ۢ;->ᩴ֫:I

    .line 1424
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ll/ۚ᩶ۢ;)V
    .locals 0

    .line 291
    iput-object p1, p0, Ll/֡᩶ۢ;->ۙ:Ll/֨᩶ۢ;

    return-void
.end method

.method public final ֫(Ll/ܿ᩶ۢ;)V
    .locals 4

    .line 371
    iget-object v0, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    if-ne p1, v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 374
    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->᩷()Ll/ܽ᩶ۢ;

    move-result-object v0

    .line 375
    invoke-static {v0}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 376
    check-cast v0, Ll/ᩴ᩶ۢ;

    invoke-virtual {v0, v1}, Ll/ᩴ᩶ۢ;->֫(Ll/֡᩶ۢ;)V

    .line 380
    :cond_1
    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->᩷()Ll/ܽ᩶ۢ;

    move-result-object v0

    .line 381
    invoke-static {v0}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 382
    check-cast v0, Ll/ᩴ᩶ۢ;

    invoke-virtual {v0, p0}, Ll/ᩴ᩶ۢ;->֫(Ll/֡᩶ۢ;)V

    :cond_2
    const/4 v0, 0x0

    .line 385
    iput v0, p0, Ll/֡᩶ۢ;->ܶ֫:I

    .line 388
    iget v2, p0, Ll/֡᩶ۢ;->᩺:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p0, Ll/֡᩶ۢ;->᩺:I

    .line 389
    iput-object v1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    .line 390
    iput-object p1, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    .line 391
    iput-object v1, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    .line 392
    iput v0, p0, Ll/֡᩶ۢ;->ۗ:I

    .line 394
    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->ۡ()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_5

    .line 395
    iget-object v0, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    if-eqz v0, :cond_3

    iget v0, v0, Ll/ܺ᩶ۢ;->᩻:F

    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->ۡ()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_5

    .line 396
    :cond_3
    new-instance v0, Ll/ܺ᩶ۢ;

    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->ۡ()F

    move-result p1

    iget-object v1, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    if-nez v1, :cond_4

    invoke-static {}, Ll/ۙ᩸᩷;->ۖ()Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_0

    :cond_4
    iget-object v1, v1, Ll/ܺ᩶ۢ;->ۜ:Landroid/graphics/Typeface;

    :goto_0
    invoke-direct {v0, p1, v1}, Ll/ܺ᩶ۢ;-><init>(FLandroid/graphics/Typeface;)V

    iput-object v0, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    .line 399
    :cond_5
    invoke-virtual {p0}, Ll/֡᩶ۢ;->ᩳ()V

    .line 402
    invoke-virtual {p0, v3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 405
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p1, :cond_6

    .line 406
    invoke-virtual {p1, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final ֫()Z
    .locals 3

    .line 1463
    iget-object v0, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 1451
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "clipboard"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    goto :goto_0

    .line 1455
    :cond_1
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1457
    invoke-virtual {v0, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 1465
    :cond_2
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final ֫(II)Z
    .locals 2

    .line 1221
    iget-boolean v0, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1222
    invoke-virtual {p0, v0}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    .line 1224
    :cond_0
    iget-object v0, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object v0

    .line 1225
    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ۜ()Z

    move-result v1

    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->᩷()Z

    move-result v0

    invoke-static {p1, p2, v1, v0}, Ll/᩺ܶۢ;->֫(IIZZ)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 1227
    :cond_1
    iget-object v1, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-virtual {v1, v0}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    .line 1228
    iget-object v0, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    if-eqz v0, :cond_2

    invoke-static {v0, p1, p2}, Ll/᩵᩶ۢ;->֫(Ll/᩵᩶ۢ;II)V

    .line 1229
    :cond_2
    invoke-direct {p0}, Ll/֡᩶ۢ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()V
    .locals 7

    .line 758
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 770
    :cond_0
    iget v1, p0, Ll/֡᩶ۢ;->ܶ֫:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 774
    :goto_0
    iget-boolean v4, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-nez v4, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    .line 776
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫᩹ۢ;->ۧ()I

    move-result v0

    .line 777
    iget-object v4, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v4}, Ll/ܿ᩹ۢ;->ܳ()I

    move-result v4

    .line 778
    iget v5, p0, Ll/֡᩶ۢ;->ܶ֫:I

    neg-int v6, v5

    add-int/2addr v6, v4

    if-le v6, v0, :cond_5

    .line 783
    iget-boolean v0, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    .line 784
    invoke-virtual {p0, v0}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    :cond_5
    sub-int/2addr v5, v4

    .line 788
    iput v5, p0, Ll/֡᩶ۢ;->ܶ֫:I

    .line 789
    iget v0, p0, Ll/֡᩶ۢ;->֡֫:I

    sub-int/2addr v0, v4

    iput v0, p0, Ll/֡᩶ۢ;->֡֫:I

    .line 790
    iget v0, p0, Ll/֡᩶ۢ;->ۚ֫:I

    sub-int/2addr v0, v4

    iput v0, p0, Ll/֡᩶ۢ;->ۚ֫:I

    :goto_2
    if-eqz v1, :cond_6

    .line 795
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    :cond_6
    move v0, v2

    :goto_3
    if-nez v0, :cond_8

    .line 799
    iget v0, p0, Ll/֡᩶ۢ;->ܶ֫:I

    if-eqz v0, :cond_8

    const/4 v1, -0x3

    if-ge v0, v1, :cond_7

    .line 805
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 807
    :cond_7
    iput v3, p0, Ll/֡᩶ۢ;->ܶ֫:I

    .line 810
    :cond_8
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->֫()V

    .line 811
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 814
    iget-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v0

    iget v1, p0, Ll/֡᩶ۢ;->ܶ֫:I

    iget-object v2, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    iget v4, v2, Ll/ܿ᩹ۢ;->ۜ:I

    iget v2, v2, Ll/ܿ᩹ۢ;->᩹:I

    add-int/2addr v2, v1

    .line 815
    invoke-virtual {v0, v3, v1, v4, v2}, Ll/֫᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object v0

    .line 816
    iget-boolean v1, p0, Ll/֡᩶ۢ;->᩹:Z

    if-eqz v1, :cond_9

    .line 817
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_9
    :goto_4
    return-void
.end method

.method public final ܽ()V
    .locals 3

    .line 1451
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1455
    :cond_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 1457
    invoke-virtual {v0, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v1

    .line 1470
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1471
    iget-boolean v2, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-eqz v2, :cond_2

    .line 1472
    invoke-virtual {p0, v1}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    .line 1474
    :cond_2
    iget-object v1, p0, Ll/֡᩶ۢ;->ۨ:Ll/᩵᩶ۢ;

    if-eqz v1, :cond_3

    invoke-static {v1}, Ll/᩵᩶ۢ;->ܽ(Ll/᩵᩶ۢ;)V

    .line 1476
    :cond_3
    iget-object v1, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܿ᩹ۢ;->֫(Ljava/lang/String;)V

    .line 1477
    invoke-direct {p0}, Ll/֡᩶ۢ;->ܿ()V

    :cond_4
    return-void
.end method

.method public final ᩳ()V
    .locals 7

    .line 1280
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll/֡᩶ۢ;->᩸:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 1281
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v0, :cond_6

    if-eqz v1, :cond_6

    .line 1282
    iget-object v2, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    int-to-float v0, v0

    .line 1285
    iget-object v2, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v2, v2, Ll/ܺ᩶ۢ;->ܿ:F

    div-float v2, v0, v2

    float-to-int v2, v2

    const/4 v3, 0x4

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v4, v2

    .line 1286
    iget-object v5, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v6, v5, Ll/ܺ᩶ۢ;->ܿ:F

    mul-float v4, v4, v6

    sub-float/2addr v0, v4

    iget v4, p0, Ll/֡᩶ۢ;->᩸:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_1

    add-int/lit8 v2, v2, -0x1

    .line 1290
    :cond_1
    iget v0, v5, Ll/ܺ᩶ۢ;->ᩳ:I

    sub-int/2addr v1, v0

    iget v0, v5, Ll/ܺ᩶ۢ;->ܽ:I

    div-int/2addr v1, v0

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1291
    iget-boolean v1, p0, Ll/֡᩶ۢ;->֫֫:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-eqz v1, :cond_2

    iget v1, v1, Ll/ܿ᩹ۢ;->ۜ:I

    if-eq v2, v1, :cond_2

    const/4 v1, 0x0

    .line 1292
    invoke-virtual {p0, v1}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    .line 1294
    :cond_2
    iget-object v1, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    if-eqz v1, :cond_3

    iget v3, v1, Ll/ܿ᩹ۢ;->ۜ:I

    if-ne v2, v3, :cond_3

    iget v3, v1, Ll/ܿ᩹ۢ;->᩹:I

    if-eq v0, v3, :cond_6

    .line 1296
    :cond_3
    iget-boolean v3, p0, Ll/֡᩶ۢ;->֫֫:Z

    const/4 v4, -0x1

    if-eqz v3, :cond_4

    if-eqz v1, :cond_4

    .line 1297
    invoke-virtual {v1}, Ll/ܿ᩹ۢ;->ܽ()I

    move-result v1

    goto :goto_0

    :cond_4
    const/4 v1, -0x1

    .line 1299
    :goto_0
    iget-object v3, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    iget-object v5, p0, Ll/֡᩶ۢ;->ۢ֫:Ll/ܺ᩶ۢ;

    iget v5, v5, Ll/ܺ᩶ۢ;->᩻:F

    invoke-virtual {v3, v2, v5, v0}, Ll/ܿ᩶ۢ;->֫(IFI)V

    .line 1300
    iget-object v0, p0, Ll/֡᩶ۢ;->֨֫:Ll/ܿ᩶ۢ;

    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object v0

    iput-object v0, p0, Ll/֡᩶ۢ;->ۤ:Ll/ܿ᩹ۢ;

    const/4 v2, 0x0

    .line 1301
    iput v2, p0, Ll/֡᩶ۢ;->ܶ֫:I

    if-eq v1, v4, :cond_5

    .line 1303
    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ܽ()I

    move-result v0

    sub-int/2addr v0, v1

    .line 1304
    iget v1, p0, Ll/֡᩶ۢ;->֡֫:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/֡᩶ۢ;->֡֫:I

    .line 1305
    iget v1, p0, Ll/֡᩶ۢ;->ۚ֫:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/֡᩶ۢ;->ۚ֫:I

    .line 1307
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_6
    :goto_1
    return-void
.end method
