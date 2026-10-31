.class public Ll/ۧ᩷ۡ;
.super Landroid/view/ViewGroup;
.source "797N"


# instance fields
.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, v0}, Ll/ۧ᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x40c00000    # 6.0f

    mul-float p1, p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Ll/ۧ᩷ۡ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 6

    .line 67
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    .line 68
    iget p2, p0, Ll/ۧ᩷ۡ;->ۙ:I

    .line 69
    iget p3, p0, Ll/ۧ᩷ۡ;->᩶:I

    .line 70
    iget p4, p0, Ll/ۧ᩷ۡ;->᩸:I

    const/4 p5, 0x0

    const/4 v0, 0x0

    :goto_0
    if-ge p5, p1, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    if-ge v1, p4, :cond_2

    add-int v3, p5, v1

    if-lt v3, p1, :cond_0

    goto :goto_3

    .line 78
    :cond_0
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-lt p4, p1, :cond_1

    .line 79
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    goto :goto_2

    :cond_1
    move v4, p2

    :goto_2
    add-int/2addr v4, v2

    add-int v5, v0, p3

    .line 80
    invoke-virtual {v3, v2, v0, v4, v5}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_1

    :cond_2
    :goto_3
    add-int/2addr v0, p3

    add-int/2addr p5, p4

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 40
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 44
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    .line 46
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    const/high16 v6, -0x80000000

    .line 47
    invoke-static {p1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v5, v6, v0}, Landroid/view/View;->measure(II)V

    .line 48
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    .line 49
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v4, v6

    if-ge v2, v6, :cond_0

    move v2, v6

    :cond_0
    if-ge v3, v5, :cond_1

    move v3, v5

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 58
    :cond_2
    iput v2, p0, Ll/ۧ᩷ۡ;->ۙ:I

    .line 59
    iput v3, p0, Ll/ۧ᩷ۡ;->᩶:I

    if-gt v4, p1, :cond_3

    move v0, p2

    goto :goto_2

    :cond_3
    const/4 v0, 0x1

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    mul-int v1, v2, v0

    mul-int/lit8 v1, v1, 0x2

    .line 32
    iget v3, p0, Ll/ۧ᩷ۡ;->᩹:I

    add-int/2addr v1, v3

    if-gt v1, p1, :cond_5

    mul-int/lit8 v0, v0, 0x2

    goto :goto_1

    .line 60
    :cond_5
    :goto_2
    iput v0, p0, Ll/ۧ᩷ۡ;->᩸:I

    int-to-float p2, p2

    int-to-float v0, v0

    div-float/2addr p2, v0

    float-to-double v0, p2

    .line 61
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p2, v0

    .line 62
    iget v0, p0, Ll/ۧ᩷ۡ;->᩶:I

    mul-int p2, p2, v0

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method
