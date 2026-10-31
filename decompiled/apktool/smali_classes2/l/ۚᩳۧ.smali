.class public final synthetic Ll/ۚᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/Integer;

    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 2397
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 2398
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v1

    .line 2399
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method
