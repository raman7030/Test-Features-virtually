.class public Ll/᩶ۨۘ;
.super Ll/ۖ᩹ۢ;
.source "X906"


# virtual methods
.method public ֫(Ll/᩸ۨۘ;IF)I
    .locals 1

    .line 103
    iget-object p2, p1, Ll/᩸ۨۘ;->֫:Ljava/lang/String;

    iget p1, p1, Ll/᩸ۨۘ;->ۧ:F

    const-string v0, "em"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/high16 v0, 0x3f000000    # 0.5f

    if-eqz p2, :cond_0

    mul-float p1, p1, p3

    :cond_0
    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method
