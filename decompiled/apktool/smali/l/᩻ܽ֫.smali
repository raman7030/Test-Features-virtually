.class public final Ll/᩻ܽ֫;
.super Ll/ۚܽ֫;
.source "7B5N"


# virtual methods
.method public final getValue(Ljava/lang/Object;)F
    .locals 0

    .line 72
    check-cast p1, Landroid/view/View;

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    return p1
.end method

.method public final setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 72
    check-cast p1, Landroid/view/View;

    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method
