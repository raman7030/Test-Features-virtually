.class public Ll/ܿۜܳ;
.super Landroid/view/ViewGroup;
.source "OAKT"


# instance fields
.field public ֫֫:I

.field public ۗ:Z

.field public ۙ:Landroid/view/ViewGroup;

.field public ۛ:I

.field public ۟:Ll/ܳܺ;

.field public ۤ:Ll/ᩳۡ;

.field public ۧ֫:I

.field public ۨ:I

.field public ۫:I

.field public ۬:Landroid/widget/TextView;

.field public ܰ:Ll/ܳܺ;

.field public ᩶:I

.field public ᩸:Landroid/view/View;

.field public ᩹:Ll/ܳܺ;

.field public ᩺:Ll/ܳܺ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Ll/ܿۜܳ;->ۗ:Z

    .line 42
    invoke-direct {p0}, Ll/ܿۜܳ;->ۢ()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Ll/ܿۜܳ;->ۗ:Z

    .line 47
    invoke-direct {p0}, Ll/ܿۜܳ;->ۢ()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Ll/ܿۜܳ;->ۗ:Z

    .line 52
    invoke-direct {p0}, Ll/ܿۜܳ;->ۢ()V

    return-void
.end method

.method private ۢ()V
    .locals 4

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 59
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x42000000    # 32.0f

    mul-float v2, v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 60
    iput v2, p0, Ll/ܿۜܳ;->ۨ:I

    const/high16 v2, 0x40400000    # 3.0f

    mul-float v2, v2, v1

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 61
    iput v2, p0, Ll/ܿۜܳ;->۫:I

    const/high16 v2, 0x40800000    # 4.0f

    mul-float v2, v2, v1

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 62
    iput v2, p0, Ll/ܿۜܳ;->ۧ֫:I

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v1

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 63
    iput v2, p0, Ll/ܿۜܳ;->ۛ:I

    const/high16 v2, 0x40a00000    # 5.0f

    mul-float v1, v1, v2

    add-float/2addr v1, v3

    float-to-int v1, v1

    .line 64
    iput v1, p0, Ll/ܿۜܳ;->᩶:I

    .line 66
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ܿۜܳ;->᩸:Landroid/view/View;

    .line 67
    new-instance v1, Ll/ᩳۡ;

    invoke-direct {v1, v0}, Ll/ᩳۡ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    .line 68
    new-instance v1, Ll/ܳܺ;

    invoke-direct {v1, v0}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    .line 69
    new-instance v1, Ll/ܳܺ;

    invoke-direct {v1, v0}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    .line 70
    new-instance v1, Ll/ܳܺ;

    invoke-direct {v1, v0}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    .line 71
    new-instance v1, Ll/ܳܺ;

    invoke-direct {v1, v0}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    .line 72
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d01d6

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    .line 73
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ܿۜܳ;->۬:Landroid/widget/TextView;

    .line 74
    iget-object v0, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 76
    iget-object v0, p0, Ll/ܿۜܳ;->᩸:Landroid/view/View;

    const v1, 0x7f0a01e3

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 77
    iget-object v0, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    const v1, 0x7f0a01e9

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 78
    iget-object v0, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    const v1, 0x7f0a01eb

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 79
    iget-object v0, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    const v1, 0x7f0a01ea

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 80
    iget-object v0, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    const v1, 0x7f0a01e8

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 81
    iget-object v0, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    const v1, 0x7f0a01ec

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 83
    iget-object v0, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 84
    iget-object v0, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 85
    iget-object v0, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v0, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 88
    iget-object v0, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 89
    iget-object v0, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 90
    iget-object v0, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, -0x112f2f30

    .line 94
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    const v1, -0x663b3b3c

    .line 95
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 96
    iget-object v2, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    const v3, 0x7f080145

    invoke-virtual {v2, v3}, Ll/ᩳۡ;->setImageResource(I)V

    .line 97
    iget-object v2, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    const-string v3, "\u6587\u4ef6\u540d"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    iget-object v2, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    const-string v3, "2020-11-11 20:30"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object v2, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    const-string v3, "16.9MB"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 101
    :cond_0
    sget-object v0, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    .line 102
    sget-object v1, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    .line 104
    :goto_0
    iget-object v2, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 105
    iget-object v0, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 106
    iget-object v0, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 107
    iget-object v0, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 108
    sget v0, Ll/᩹֡᩷;->ᩴ֫:I

    iput v0, p0, Ll/ܿۜܳ;->֫֫:I

    .line 110
    iget-object v0, p0, Ll/ܿۜܳ;->᩸:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 111
    iget-object v0, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    iget-object v0, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 113
    iget-object v0, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 114
    iget-object v0, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 115
    iget-object v0, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    iget-object v0, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 6

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 189
    iget-boolean p1, p0, Ll/ܿۜܳ;->ۗ:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 190
    iget-object p1, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/ViewGroup;->layout(IIII)V

    return-void

    .line 194
    :cond_0
    iget p1, p0, Ll/ܿۜܳ;->ۨ:I

    .line 195
    iget p3, p0, Ll/ܿۜܳ;->۫:I

    .line 196
    iget-object v0, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    .line 197
    iget-object v1, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    .line 198
    iget-object v2, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    .line 199
    iget-object v3, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    .line 201
    iget-object v4, p0, Ll/ܿۜܳ;->᩸:Landroid/view/View;

    invoke-virtual {v4, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    sub-int p2, p5, p1

    .line 203
    div-int/lit8 p2, p2, 0x2

    .line 204
    iget-object v4, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    add-int v5, p3, p1

    add-int/2addr p1, p2

    invoke-virtual {v4, p3, p2, v5, p1}, Landroid/view/View;->layout(IIII)V

    .line 207
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 p2, 0x8

    if-ne p1, p2, :cond_1

    .line 208
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    sub-int/2addr p5, p1

    div-int/lit8 p5, p5, 0x2

    goto :goto_0

    .line 210
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    sub-int/2addr p5, p1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    sub-int/2addr p5, p1

    div-int/lit8 p5, p5, 0x2

    .line 212
    :goto_0
    iget p1, p0, Ll/ܿۜܳ;->ۛ:I

    add-int/2addr v5, p1

    .line 213
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    add-int/2addr p1, v5

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    add-int/2addr p2, p5

    invoke-virtual {v0, v5, p5, p1, p2}, Landroid/view/View;->layout(IIII)V

    .line 215
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    add-int/2addr p1, p5

    .line 216
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    add-int/2addr p2, v5

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, p1

    invoke-virtual {v1, v5, p1, p2, v4}, Landroid/view/View;->layout(IIII)V

    .line 219
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    .line 222
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    add-int/2addr p2, v5

    iget v4, p0, Ll/ܿۜܳ;->᩶:I

    add-int v5, p2, v4

    .line 224
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    add-int/2addr p2, v5

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v2, v5, p1, p2, v1}, Landroid/view/View;->layout(IIII)V

    sub-int/2addr p4, p3

    .line 227
    invoke-virtual {v0}, Landroid/widget/TextView;->getBaseline()I

    move-result p1

    add-int/2addr p1, p5

    invoke-virtual {v3}, Landroid/widget/TextView;->getBaseline()I

    move-result p2

    sub-int/2addr p1, p2

    .line 228
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    sub-int p2, p4, p2

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    add-int/2addr p3, p1

    invoke-virtual {v3, p2, p1, p4, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 160
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 161
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 162
    iget-boolean v0, p0, Ll/ܿۜܳ;->ۗ:Z

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {v0, v2, p2}, Landroid/view/View;->measure(II)V

    .line 164
    iget-object p2, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 168
    :cond_0
    iget v0, p0, Ll/ܿۜܳ;->۫:I

    iget v2, p0, Ll/ܿۜܳ;->ۨ:I

    add-int v3, v0, v2

    iget v4, p0, Ll/ܿۜܳ;->ۛ:I

    add-int/2addr v3, v4

    add-int/2addr v3, v0

    sub-int v0, p1, v3

    .line 169
    iget v3, p0, Ll/ܿۜܳ;->ۧ֫:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr p2, v3

    const/high16 v3, 0x40000000    # 2.0f

    .line 171
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 172
    iget-object v3, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    invoke-virtual {v3, v2, v2}, Landroid/view/View;->measure(II)V

    .line 174
    iget-object v2, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->measure(II)V

    .line 175
    iget-object v2, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->measure(II)V

    .line 176
    iget-object v2, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->measure(II)V

    .line 178
    iget-object v2, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v0, v2

    .line 179
    iget-object v2, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {v2, v0, p2}, Landroid/view/View;->measure(II)V

    .line 181
    iget p2, p0, Ll/ܿۜܳ;->ۧ֫:I

    mul-int/lit8 p2, p2, 0x2

    iget v0, p0, Ll/ܿۜܳ;->ۨ:I

    iget-object v1, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, p2

    .line 182
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 144
    iget v0, p0, Ll/ܿۜܳ;->֫֫:I

    sget v1, Ll/᩹֡᩷;->ᩴ֫:I

    if-eq v0, v1, :cond_0

    .line 145
    sget-object v0, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    .line 146
    sget-object v1, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    .line 147
    iget-object v2, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 148
    iget-object v0, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 149
    iget-object v0, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 150
    iget-object v0, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 151
    iget-object v0, p0, Ll/ܿۜܳ;->۬:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 152
    iget-object v0, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    sget v1, Ll/᩹֡᩷;->ܳ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 153
    iget-object v0, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    sget v1, Ll/᩹֡᩷;->ܳ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 154
    sget v0, Ll/᩹֡᩷;->ᩴ֫:I

    iput v0, p0, Ll/ܿۜܳ;->֫֫:I

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 120
    iget-boolean v0, p0, Ll/ܿۜܳ;->ۗ:Z

    if-eq v0, p1, :cond_1

    .line 121
    iput-boolean p1, p0, Ll/ܿۜܳ;->ۗ:Z

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    .line 123
    iget-object p1, p0, Ll/ܿۜܳ;->᩸:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 124
    iget-object p1, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 125
    iget-object p1, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 126
    iget-object p1, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 127
    iget-object p1, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 128
    iget-object p1, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 129
    iget-object p1, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 131
    :cond_0
    iget-object p1, p0, Ll/ܿۜܳ;->᩸:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 132
    iget-object p1, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 133
    iget-object p1, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 134
    iget-object p1, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 135
    iget-object p1, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 136
    iget-object p1, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 137
    iget-object p1, p0, Ll/ܿۜܳ;->ۙ:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 139
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void
.end method

.method public final ۜ()Ll/ܳܺ;
    .locals 1

    .line 252
    iget-object v0, p0, Ll/ܿۜܳ;->۟:Ll/ܳܺ;

    return-object v0
.end method

.method public final ۧ()Landroid/view/View;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/ܿۜܳ;->᩸:Landroid/view/View;

    return-object v0
.end method

.method public final ܳ()Ll/ܳܺ;
    .locals 1

    .line 244
    iget-object v0, p0, Ll/ܿۜܳ;->᩺:Ll/ܳܺ;

    return-object v0
.end method

.method public final ܽ()Ll/ܳܺ;
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ܿۜܳ;->᩹:Ll/ܳܺ;

    return-object v0
.end method

.method public final ܿ()Ll/ᩳۡ;
    .locals 1

    .line 236
    iget-object v0, p0, Ll/ܿۜܳ;->ۤ:Ll/ᩳۡ;

    return-object v0
.end method

.method public final ᩳ()Landroid/widget/TextView;
    .locals 1

    .line 256
    iget-object v0, p0, Ll/ܿۜܳ;->۬:Landroid/widget/TextView;

    return-object v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 260
    iput v0, p0, Ll/ܿۜܳ;->۫:I

    .line 261
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final ᩻()Ll/ܳܺ;
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ܿۜܳ;->ܰ:Ll/ܳܺ;

    return-object v0
.end method
