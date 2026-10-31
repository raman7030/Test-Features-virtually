.class public final Ll/ۛۚۧ;
.super Landroid/widget/FrameLayout;
.source "A8GL"


# static fields
.field public static final synthetic ۙ:I


# instance fields
.field public ᩶:F

.field public final ᩸:Ll/ۤۚۧ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 115
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 116
    iput v0, p0, Ll/ۛۚۧ;->᩹:I

    if-eqz p2, :cond_0

    .line 120
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v1, Ll/᩺ۘ֫;->֫:[I

    .line 121
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 123
    :try_start_0
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Ll/ۛۚۧ;->᩹:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 126
    throw p2

    .line 128
    :cond_0
    :goto_0
    new-instance p1, Ll/ۤۚۧ;

    invoke-direct {p1, p0}, Ll/ۤۚۧ;-><init>(Ll/ۛۚۧ;)V

    iput-object p1, p0, Ll/ۛۚۧ;->᩸:Ll/ۤۚۧ;

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 9

    .line 172
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 173
    iget p1, p0, Ll/ۛۚۧ;->᩶:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    return-void

    .line 178
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v1, p1

    int-to-float v2, v0

    div-float v3, v1, v2

    .line 181
    iget v4, p0, Ll/ۛۚۧ;->᩶:F

    div-float/2addr v4, v3

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v4, v5

    .line 182
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const v6, 0x3c23d70a    # 0.01f

    iget-object v7, p0, Ll/ۛۚۧ;->᩸:Ll/ۤۚۧ;

    cmpg-float v5, v5, v6

    if-gtz v5, :cond_1

    .line 184
    iget p1, p0, Ll/ۛۚۧ;->᩶:F

    const/4 p2, 0x0

    invoke-virtual {v7, p1, v3, p2}, Ll/ۤۚۧ;->֫(FFZ)V

    return-void

    .line 188
    :cond_1
    iget v5, p0, Ll/ۛۚۧ;->᩹:I

    const/4 v6, 0x1

    if-eqz v5, :cond_6

    if-eq v5, v6, :cond_5

    const/4 v8, 0x2

    if-eq v5, v8, :cond_4

    const/4 v8, 0x4

    if-eq v5, v8, :cond_2

    goto :goto_2

    :cond_2
    cmpl-float p2, v4, p2

    if-lez p2, :cond_3

    .line 197
    iget p1, p0, Ll/ۛۚۧ;->᩶:F

    goto :goto_1

    .line 199
    :cond_3
    iget p2, p0, Ll/ۛۚۧ;->᩶:F

    goto :goto_0

    .line 193
    :cond_4
    iget p1, p0, Ll/ۛۚۧ;->᩶:F

    goto :goto_1

    .line 190
    :cond_5
    iget p2, p0, Ll/ۛۚۧ;->᩶:F

    goto :goto_0

    :cond_6
    cmpl-float p2, v4, p2

    if-lez p2, :cond_7

    .line 204
    iget p2, p0, Ll/ۛۚۧ;->᩶:F

    :goto_0
    div-float/2addr v1, p2

    float-to-int v0, v1

    goto :goto_2

    .line 206
    :cond_7
    iget p1, p0, Ll/ۛۚۧ;->᩶:F

    :goto_1
    mul-float v2, v2, p1

    float-to-int p1, v2

    .line 214
    :goto_2
    iget p2, p0, Ll/ۛۚۧ;->᩶:F

    invoke-virtual {v7, p2, v3, v6}, Ll/ۤۚۧ;->֫(FFZ)V

    const/high16 p2, 0x40000000    # 2.0f

    .line 216
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 217
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 215
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 155
    iget v0, p0, Ll/ۛۚۧ;->᩹:I

    return v0
.end method

.method public final ֫(F)V
    .locals 1

    .line 137
    iget v0, p0, Ll/ۛۚۧ;->᩶:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 138
    iput p1, p0, Ll/ۛۚۧ;->᩶:F

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 164
    iget v0, p0, Ll/ۛۚۧ;->᩹:I

    if-eq v0, p1, :cond_0

    .line 165
    iput p1, p0, Ll/ۛۚۧ;->᩹:I

    .line 166
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method
