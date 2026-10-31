.class public Ll/ۢ᩺ܽ;
.super Landroid/view/ViewGroup;
.source "U13V"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, p1, p2, v0}, Ll/ۢ᩺ܽ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 3

    .line 42
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p3, 0x2

    if-eq p1, p3, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    const/4 p5, 0x1

    .line 46
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    sub-int/2addr p4, p2

    .line 48
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 49
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 50
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 51
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 52
    invoke-virtual {p3, p1, p1, p2, v0}, Landroid/view/View;->layout(IIII)V

    add-int/2addr p2, v1

    if-le p2, p4, :cond_1

    add-int/2addr v2, v0

    .line 54
    invoke-virtual {p5, p1, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_1
    sub-int p2, p4, v1

    .line 56
    invoke-virtual {p5, p2, p1, p4, v2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 24
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 25
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eq p2, v0, :cond_0

    .line 26
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 29
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    const/4 v0, 0x1

    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const/high16 v2, -0x80000000

    .line 31
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {p2, v3, v1}, Landroid/view/View;->measure(II)V

    .line 32
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v2, v1}, Landroid/view/View;->measure(II)V

    .line 33
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v1

    if-le v2, p1, :cond_1

    .line 34
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v0, p2

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 36
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method
