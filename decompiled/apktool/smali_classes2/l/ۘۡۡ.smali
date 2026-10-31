.class public Ll/ۘۡۡ;
.super Landroid/view/ViewGroup;
.source "PAK1"


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۬:I

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, p2, v0}, Ll/ۘۡۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    sget-object p3, Ll/᩵᩸᩷;->ܿ:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 45
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Ll/ۘۡۡ;->᩸:I

    const/4 p3, 0x1

    .line 46
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Ll/ۘۡۡ;->᩹:I

    const/4 p3, 0x2

    .line 47
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Ll/ۘۡۡ;->ۗ:I

    const/4 p3, 0x3

    .line 48
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Ll/ۘۡۡ;->۬:I

    .line 49
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 9

    sub-int/2addr p4, p2

    .line 107
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    .line 108
    iget-boolean p2, p0, Ll/ۘۡۡ;->᩶:Z

    const/4 p3, 0x0

    if-eqz p2, :cond_1

    .line 109
    iget p2, p0, Ll/ۘۡۡ;->ۙ:I

    const/4 p5, 0x0

    const/4 v0, 0x0

    :goto_0
    if-ge p5, p1, :cond_2

    mul-int/lit8 v1, p5, 0x2

    .line 111
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 112
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 113
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 114
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    if-le v3, v4, :cond_0

    sub-int v5, v3, v4

    .line 118
    div-int/lit8 v5, v5, 0x2

    const/4 v6, 0x0

    goto :goto_1

    :cond_0
    sub-int v5, v4, v3

    .line 120
    div-int/lit8 v6, v5, 0x2

    const/4 v5, 0x0

    :goto_1
    add-int/2addr v6, v0

    .line 125
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 126
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v8, v6

    .line 127
    invoke-virtual {v2, p3, v6, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 129
    iget v2, p0, Ll/ۘۡۡ;->᩸:I

    add-int/2addr v2, p2

    add-int/2addr v5, v0

    .line 132
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v6, v5

    .line 133
    invoke-virtual {v1, v2, v5, p4, v6}, Landroid/view/View;->layout(IIII)V

    .line 134
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    .line 135
    iget v0, p0, Ll/ۘۡۡ;->᩹:I

    add-int/2addr v0, v1

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    const/4 p5, 0x0

    :goto_2
    if-ge p2, p1, :cond_2

    mul-int/lit8 v0, p2, 0x2

    .line 139
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    .line 140
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 141
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v3, p5

    invoke-virtual {v1, p3, p5, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 142
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, p5

    .line 143
    iget p5, p0, Ll/ۘۡۡ;->ۗ:I

    add-int/2addr v1, p5

    .line 144
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    add-int/2addr p5, v1

    invoke-virtual {v0, p3, v1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 145
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    add-int/2addr p5, v1

    .line 146
    iget v0, p0, Ll/ۘۡۡ;->۬:I

    add-int/2addr p5, v0

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 10

    .line 54
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 55
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 58
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    const/high16 v2, -0x80000000

    .line 62
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 63
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x1

    if-ge v4, v1, :cond_2

    mul-int/lit8 v8, v4, 0x2

    .line 65
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    add-int/2addr v8, v7

    .line 66
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 67
    invoke-virtual {v9, v3, p2}, Landroid/view/View;->measure(II)V

    .line 68
    invoke-virtual {v7, v3, p2}, Landroid/view/View;->measure(II)V

    .line 69
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    if-le v8, v5, :cond_0

    .line 70
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 72
    :cond_0
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    if-le v8, v6, :cond_1

    .line 73
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, p2

    .line 77
    iget p2, p0, Ll/ۘۡۡ;->᩸:I

    add-int/2addr p2, v5

    add-int/2addr p2, v6

    if-le p2, v0, :cond_4

    .line 78
    iput-boolean v2, p0, Ll/ۘۡۡ;->᩶:Z

    :goto_1
    if-ge v2, v1, :cond_6

    mul-int/lit8 p2, v2, 0x2

    .line 80
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    add-int/2addr p2, v7

    .line 81
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    if-eqz v2, :cond_3

    .line 83
    iget v4, p0, Ll/ۘۡۡ;->۬:I

    add-int/2addr v3, v4

    .line 85
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v4, p0, Ll/ۘۡۡ;->ۗ:I

    add-int/2addr v0, v4

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    add-int/2addr p2, v0

    add-int/2addr v3, p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 88
    :cond_4
    iput-boolean v7, p0, Ll/ۘۡۡ;->᩶:Z

    .line 89
    iput v5, p0, Ll/ۘۡۡ;->ۙ:I

    :goto_2
    if-ge v2, v1, :cond_6

    mul-int/lit8 p2, v2, 0x2

    .line 91
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    add-int/2addr p2, v7

    .line 92
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    if-eqz v2, :cond_5

    .line 94
    iget v4, p0, Ll/ۘۡۡ;->᩹:I

    add-int/2addr v3, v4

    .line 96
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr v3, p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 99
    :cond_6
    invoke-virtual {p0, p1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method
