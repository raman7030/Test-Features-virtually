.class public final Ll/ᩳܽ֫;
.super Ll/ۚܽ֫;
.source "7B5N"


# virtual methods
.method public final getValue(Ljava/lang/Object;)F
    .locals 0

    .line 238
    check-cast p1, Landroid/view/View;

    .line 246
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public final setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 238
    check-cast p1, Landroid/view/View;

    float-to-int p2, p2

    .line 241
    invoke-virtual {p1, p2}, Landroid/view/View;->setScrollX(I)V

    return-void
.end method
