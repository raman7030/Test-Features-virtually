.class public final Ll/۫ܶ֡;
.super Ljava/lang/Object;
.source "K5E8"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 119
    check-cast p1, Ll/۬ܶ֡;

    check-cast p2, Ll/۬ܶ֡;

    .line 121
    invoke-virtual {p1}, Ll/۬ܶ֡;->᩻()Ll/۫᩶֡;

    move-result-object p1

    iget-object p1, p1, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    .line 209
    iget p1, p1, Ll/ۚۙ֡;->᩹:I

    .line 122
    invoke-virtual {p2}, Ll/۬ܶ֡;->᩻()Ll/۫᩶֡;

    move-result-object p2

    iget-object p2, p2, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    if-ge p1, p2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
