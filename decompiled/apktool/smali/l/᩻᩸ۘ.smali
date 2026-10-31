.class public Ll/᩻᩸ۘ;
.super Landroid/widget/RelativeLayout;
.source "51RR"


# virtual methods
.method public final onMeasure(II)V
    .locals 0

    .line 59
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    .line 63
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 65
    throw p2
.end method
