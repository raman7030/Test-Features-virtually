.class public Ll/ܿۘ;
.super Landroid/widget/HorizontalScrollView;
.source "A4VG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 77
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 0

    .line 277
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 225
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 227
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩻;->֫(Landroid/content/Context;)Ll/᩶᩻;

    move-result-object p1

    .line 230
    invoke-virtual {p1}, Ll/᩶᩻;->ܿ()I

    .line 200
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 231
    invoke-virtual {p1}, Ll/᩶᩻;->ᩳ()I

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 286
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V

    return-void
.end method

.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 371
    check-cast p2, Ll/ᩳۘ;

    .line 372
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 97
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 99
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    const/4 p1, 0x0

    .line 101
    throw p1
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
