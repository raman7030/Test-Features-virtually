.class public final Ll/ܿܽ֫;
.super Ll/ۚܽ֫;
.source "7B5N"


# virtual methods
.method public final getValue(Ljava/lang/Object;)F
    .locals 0

    .line 253
    check-cast p1, Landroid/view/View;

    .line 261
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public final setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 253
    check-cast p1, Landroid/view/View;

    float-to-int p2, p2

    .line 256
    invoke-virtual {p1, p2}, Landroid/view/View;->setScrollY(I)V

    return-void
.end method
