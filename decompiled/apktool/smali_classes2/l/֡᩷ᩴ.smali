.class public final synthetic Ll/֡᩷ᩴ;
.super Ljava/lang/Object;
.source "X5U"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 2
    check-cast p1, Ll/ۨۜᩴ;

    .line 4
    check-cast p2, Ll/ۨۜᩴ;

    .line 1032
    invoke-interface {p1}, Ll/ۨۜᩴ;->֫()I

    move-result p1

    invoke-interface {p2}, Ll/ۨۜᩴ;->֫()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
