.class public final Ll/᩹ܰۧ;
.super Ljava/lang/Object;
.source "W1PL"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 94
    check-cast p1, [I

    check-cast p2, [I

    const/4 v0, 0x0

    .line 97
    aget p1, p1, v0

    aget p2, p2, v0

    sub-int/2addr p1, p2

    return p1
.end method
