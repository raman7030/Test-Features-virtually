.class public final synthetic Ll/ܺۖۡ;
.super Ljava/lang/Object;
.source "W5L3"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 1

    .line 2
    sget p1, Ll/ۚۖۡ;->᩺:I

    .line 132
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۖۡ;

    .line 481
    iget-object p1, p1, Ll/᩵ۖۡ;->۫:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    goto :goto_1

    .line 485
    :cond_0
    invoke-virtual {p2}, Landroid/text/Layout;->getLineCount()I

    move-result p4

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p4, :cond_2

    .line 487
    invoke-virtual {p2, p5}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_1

    .line 488
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return p3
.end method
