.class public final Ll/ۖۡ;
.super Ll/ۜۡ;
.source "C5WO"


# instance fields
.field public ۜ:Landroid/graphics/PorterDuff$Mode;

.field public ܳ:Landroid/graphics/drawable/Drawable;

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩷:Ll/ܺۡ;

.field public ᩻:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Ll/ܺۡ;)V
    .locals 1

    .line 42
    invoke-direct {p0, p1}, Ll/ۜۡ;-><init>(Landroid/widget/AbsSeekBar;)V

    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Ll/ۖۡ;->᩻:Landroid/content/res/ColorStateList;

    .line 37
    iput-object v0, p0, Ll/ۖۡ;->ۜ:Landroid/graphics/PorterDuff$Mode;

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Ll/ۖۡ;->ᩳ:Z

    .line 39
    iput-boolean v0, p0, Ll/ۖۡ;->ܿ:Z

    .line 43
    iput-object p1, p0, Ll/ۖۡ;->᩷:Ll/ܺۡ;

    return-void
.end method

.method private ᩳ()V
    .locals 2

    .line 128
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Ll/ۖۡ;->ᩳ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ۖۡ;->ܿ:Z

    if-eqz v1, :cond_3

    .line 129
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Ll/۠۬;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    .line 131
    iget-boolean v1, p0, Ll/ۖۡ;->ᩳ:Z

    if-eqz v1, :cond_1

    .line 132
    iget-object v1, p0, Ll/ۖۡ;->᩻:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 135
    :cond_1
    iget-boolean v0, p0, Ll/ۖۡ;->ܿ:Z

    if-eqz v0, :cond_2

    .line 136
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Ll/ۖۡ;->ۜ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 141
    :cond_2
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Ll/ۖۡ;->᩷:Ll/ܺۡ;

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;)V
    .locals 7

    .line 165
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 166
    iget-object v0, p0, Ll/ۖۡ;->᩷:Ll/ܺۡ;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_3

    .line 168
    iget-object v3, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    .line 169
    iget-object v4, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    if-ltz v3, :cond_0

    .line 170
    div-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :goto_0
    if-ltz v4, :cond_1

    .line 171
    div-int/lit8 v2, v4, 0x2

    .line 172
    :cond_1
    iget-object v4, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    neg-int v5, v3

    neg-int v6, v2

    invoke-virtual {v4, v5, v6, v3, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 174
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    .line 175
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    int-to-float v3, v1

    div-float/2addr v2, v3

    .line 176
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 177
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v0, 0x0

    :goto_1
    if-gt v0, v1, :cond_2

    .line 179
    iget-object v4, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    const/4 v4, 0x0

    .line 180
    invoke-virtual {p1, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 182
    :cond_2
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;I)V
    .locals 9

    .line 48
    invoke-super {p0, p1, p2}, Ll/ۜۡ;->֫(Landroid/util/AttributeSet;I)V

    .line 50
    iget-object v6, p0, Ll/ۖۡ;->᩷:Ll/ܺۡ;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Ll/ۗᩳ;->ۜ:[I

    const/4 v7, 0x0

    invoke-static {v0, p1, v2, p2, v7}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v8

    .line 52
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 53
    invoke-virtual {v8}, Ll/᩺ۘ;->ܽ()Landroid/content/res/TypedArray;

    move-result-object v4

    move-object v0, v6

    move-object v3, p1

    move v5, p2

    .line 52
    invoke-static/range {v0 .. v5}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 55
    invoke-virtual {v8, v7}, Ll/᩺ۘ;->ܿ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {v6, p1}, Landroid/widget/AbsSeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const/4 p1, 0x1

    .line 60
    invoke-virtual {v8, p1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 80
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 84
    :cond_1
    iput-object p2, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_3

    .line 87
    invoke-virtual {p2, v6}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 88
    invoke-virtual {v6}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    invoke-static {p2, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    .line 89
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 90
    invoke-virtual {v6}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 92
    :cond_2
    invoke-direct {p0}, Ll/ۖۡ;->ᩳ()V

    .line 95
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    const/4 p2, 0x3

    .line 63
    invoke-virtual {v8, p2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    .line 64
    invoke-virtual {v8, p2, v0}, Ll/᩺ۘ;->ܽ(II)I

    move-result p2

    iget-object v0, p0, Ll/ۖۡ;->ۜ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p2, v0}, Ll/ܶܺ;->֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p2

    iput-object p2, p0, Ll/ۖۡ;->ۜ:Landroid/graphics/PorterDuff$Mode;

    .line 66
    iput-boolean p1, p0, Ll/ۖۡ;->ܿ:Z

    :cond_4
    const/4 p2, 0x2

    .line 69
    invoke-virtual {v8, p2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 70
    invoke-virtual {v8, p2}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    iput-object p2, p0, Ll/ۖۡ;->᩻:Landroid/content/res/ColorStateList;

    .line 71
    iput-boolean p1, p0, Ll/ۖۡ;->ᩳ:Z

    .line 74
    :cond_5
    invoke-virtual {v8}, Ll/᩺ۘ;->ܿ()V

    .line 76
    invoke-direct {p0}, Ll/ۖۡ;->ᩳ()V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 154
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 156
    iget-object v1, p0, Ll/ۖۡ;->᩷:Ll/ܺۡ;

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 157
    invoke-virtual {v1, v0}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ۖۡ;->ܳ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 149
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method
