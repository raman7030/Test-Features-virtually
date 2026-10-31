.class public final Ll/᩷ܽ֫;
.super Ll/ۚܽ֫;
.source "7B5N"


# virtual methods
.method public final getValue(Ljava/lang/Object;)F
    .locals 0

    .line 102
    check-cast p1, Landroid/view/View;

    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    move-result p1

    return p1
.end method

.method public final setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 102
    check-cast p1, Landroid/view/View;

    .line 105
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method
