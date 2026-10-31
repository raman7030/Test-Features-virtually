.class public Ll/ܺ۟ܿ;
.super Landroid/view/ViewGroup;
.source "I4NO"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2, v0}, Ll/ܺ۟ܿ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    sget-object p3, Ll/᩵᩸᩷;->ܽ:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    const/16 p3, 0x8

    .line 26
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Ll/ܺ۟ܿ;->᩸:I

    if-lez p2, :cond_0

    .line 29
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 5

    .line 54
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    .line 40
    iget p2, p0, Ll/ܺ۟ܿ;->᩸:I

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    const/4 p5, -0x1

    const/4 v0, 0x0

    const/4 v1, -0x1

    :goto_0
    if-ge v0, p1, :cond_2

    .line 63
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne v1, p5, :cond_0

    .line 65
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    :cond_0
    if-eqz v0, :cond_1

    .line 66
    rem-int v3, v0, p2

    if-nez v3, :cond_1

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    add-int/2addr p4, v1

    .line 70
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v3, p3

    add-int v4, p4, v1

    invoke-virtual {v2, p3, p4, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr p3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 77
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 78
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    .line 40
    iget v1, p0, Ll/ܺ۟ܿ;->᩸:I

    .line 83
    div-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/high16 v1, -0x80000000

    .line 84
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 86
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr v0, p2

    goto :goto_1

    .line 89
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 91
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v0, p2}, Landroid/view/View;->measure(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    .line 40
    iget v0, p0, Ll/ܺ۟ܿ;->᩸:I

    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 46
    div-int v2, v1, v0

    .line 47
    rem-int/2addr v1, v0

    if-eqz v1, :cond_2

    add-int/lit8 v2, v2, 0x1

    :cond_2
    mul-int p2, p2, v2

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    add-int v0, v1, p2

    .line 98
    :goto_1
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 33
    iget v0, p0, Ll/ܺ۟ܿ;->᩸:I

    if-eq v0, p1, :cond_0

    .line 34
    iput p1, p0, Ll/ܺ۟ܿ;->᩸:I

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method
