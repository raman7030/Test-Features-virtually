.class public final Ll/᩹ۛ᩻;
.super Ll/ۜۡۡ;
.source "Y6VJ"


# instance fields
.field public ֫ۧ:Landroid/view/View;

.field public ۧۧ:I

.field public ܽۧ:Landroid/view/View;

.field public ᩳۧ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Ll/ۜۡۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 14
    iput p1, p0, Ll/᩹ۛ᩻;->ᩳۧ:I

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 6

    .line 31
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 32
    iget-object v1, p0, Ll/᩹ۛ᩻;->ܽۧ:Landroid/view/View;

    if-eqz v1, :cond_1

    if-lez v0, :cond_1

    .line 34
    iget v2, p0, Ll/᩹ۛ᩻;->ᩳۧ:I

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v2, v0, :cond_0

    .line 35
    iput v0, p0, Ll/᩹ۛ᩻;->ᩳۧ:I

    .line 46
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    const/4 v4, 0x0

    .line 47
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 46
    invoke-virtual {v1, v2, v5}, Landroid/view/View;->measure(II)V

    .line 48
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 36
    iget-object v2, p0, Ll/᩹ۛ᩻;->֫ۧ:Landroid/view/View;

    .line 46
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 47
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 46
    invoke-virtual {v2, v0, v4}, Landroid/view/View;->measure(II)V

    .line 48
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 36
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/᩹ۛ᩻;->ۧۧ:I

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    iput v2, p0, Ll/᩹ۛ᩻;->ۧۧ:I

    .line 39
    :cond_0
    iget v0, p0, Ll/᩹ۛ᩻;->ۧۧ:I

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    .line 40
    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 42
    :cond_1
    invoke-super {p0, p1, p2}, Ll/֡ܰۧ;->onMeasure(II)V

    return-void
.end method

.method public final ֫(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ۛ᩻;->ܽۧ:Landroid/view/View;

    .line 24
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ۛ᩻;->֫ۧ:Landroid/view/View;

    const/4 p1, -0x1

    .line 25
    iput p1, p0, Ll/᩹ۛ᩻;->ᩳۧ:I

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
