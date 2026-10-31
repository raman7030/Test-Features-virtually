.class public final Ll/ۗۜۚ;
.super Ljava/lang/Object;
.source "G5VL"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 117
    check-cast p1, Ll/ᩳۧۚ;

    check-cast p2, Ll/ᩳۧۚ;

    .line 120
    invoke-interface {p1}, Ll/ᩳۧۚ;->getKey()I

    move-result p1

    invoke-interface {p2}, Ll/ᩳۧۚ;->getKey()I

    move-result p2

    .line 133
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
