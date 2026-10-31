.class public final Ll/ۡܽ֫;
.super Ll/ۚܽ֫;
.source "7B5N"


# virtual methods
.method public final getValue(Ljava/lang/Object;)F
    .locals 0

    .line 132
    check-cast p1, Landroid/view/View;

    .line 140
    invoke-virtual {p1}, Landroid/view/View;->getRotation()F

    move-result p1

    return p1
.end method

.method public final setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 132
    check-cast p1, Landroid/view/View;

    .line 135
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    return-void
.end method
