.class public final synthetic Ll/᩺֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 2
    check-cast p1, [I

    .line 4
    check-cast p2, [I

    const/4 v0, 0x0

    .line 2688
    aget p1, p1, v0

    aget p2, p2, v0

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
