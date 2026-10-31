.class public final Ll/᩶ۘ;
.super Landroid/util/Property;
.source "V51X"


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 119
    check-cast p1, Ll/ۗۘ;

    .line 122
    iget p1, p1, Ll/ۗۘ;->mThumbPosition:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 119
    check-cast p1, Ll/ۗۘ;

    check-cast p2, Ljava/lang/Float;

    .line 127
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۗۘ;->setThumbPosition(F)V

    return-void
.end method
