.class public Ll/ۖܺ;
.super Landroid/widget/LinearLayout;
.source "34ZC"


# instance fields
.field public ᩶:Z

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 49
    iput v0, p0, Ll/ۖܺ;->᩹:I

    .line 53
    sget-object v3, Ll/ۗᩳ;->ܺ:[I

    invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v0

    .line 54
    invoke-static/range {v1 .. v6}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 56
    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۖܺ;->᩸:Z

    .line 57
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 61
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    move-result v0

    if-ne v0, p2, :cond_0

    .line 62
    invoke-direct {p0, p1}, Ll/ۖܺ;->֫(Z)V

    :cond_0
    return-void
.end method

.method private ֫(Z)V
    .locals 1

    .line 164
    iget-boolean v0, p0, Ll/ۖܺ;->᩶:Z

    if-eq v0, p1, :cond_4

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Ll/ۖܺ;->᩸:Z

    if-eqz v0, :cond_4

    .line 165
    :cond_0
    iput-boolean p1, p0, Ll/ۖܺ;->᩶:Z

    .line 167
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    if-eqz p1, :cond_1

    const v0, 0x800005

    goto :goto_0

    :cond_1
    const/16 v0, 0x50

    .line 168
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    const v0, 0x7f0a0543

    .line 170
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    const/16 p1, 0x8

    goto :goto_1

    :cond_2
    const/4 p1, 0x4

    .line 172
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x2

    :goto_2
    if-ltz p1, :cond_4

    .line 179
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    :cond_4
    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 6

    .line 78
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    const/4 v1, 0x0

    .line 80
    iget-boolean v2, p0, Ll/ۖܺ;->᩸:Z

    if-eqz v2, :cond_1

    .line 81
    iget v3, p0, Ll/ۖܺ;->᩹:I

    if-le v0, v3, :cond_0

    .line 185
    iget-boolean v3, p0, Ll/ۖܺ;->᩶:Z

    if-eqz v3, :cond_0

    .line 83
    invoke-direct {p0, v1}, Ll/ۖܺ;->֫(Z)V

    .line 86
    :cond_0
    iput v0, p0, Ll/ۖܺ;->᩹:I

    .line 185
    :cond_1
    iget-boolean v3, p0, Ll/ۖܺ;->᩶:Z

    const/4 v4, 0x1

    if-nez v3, :cond_2

    .line 95
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v3, v5, :cond_2

    const/high16 v3, -0x80000000

    .line 96
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    move v0, p1

    .line 104
    :goto_0
    invoke-super {p0, v0, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    if-eqz v2, :cond_3

    .line 185
    iget-boolean v0, p0, Ll/ۖܺ;->᩶:Z

    if-nez v0, :cond_3

    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidthAndState()I

    move-result v0

    const/high16 v2, -0x1000000

    and-int/2addr v0, v2

    const/high16 v2, 0x1000000

    if-ne v0, v2, :cond_3

    .line 114
    invoke-direct {p0, v4}, Ll/ۖܺ;->֫(Z)V

    const/4 v3, 0x1

    :cond_3
    if-eqz v3, :cond_4

    .line 121
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 155
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_1
    const/4 v3, -0x1

    if-ge v2, v0, :cond_6

    .line 156
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    const/4 v2, -0x1

    :goto_2
    if-ltz v2, :cond_a

    .line 129
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 130
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v0, v5

    iget v5, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v5

    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v0

    .line 185
    iget-boolean v0, p0, Ll/ۖܺ;->᩶:Z

    if-eqz v0, :cond_9

    add-int/2addr v2, v4

    .line 155
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :goto_3
    if-ge v2, v0, :cond_8

    .line 156
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_7

    move v3, v2

    goto :goto_4

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    :goto_4
    if-ltz v3, :cond_a

    .line 136
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x41800000    # 16.0f

    mul-float v2, v2, v3

    float-to-int v2, v2

    add-int/2addr v0, v2

    goto :goto_5

    .line 140
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    :goto_5
    add-int/2addr v1, v0

    .line 144
    :cond_a
    sget v0, Ll/ܿ᩺;->֫:I

    .line 2393
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    if-eq v0, v1, :cond_b

    .line 145
    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    if-nez p2, :cond_b

    .line 149
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_b
    return-void
.end method
