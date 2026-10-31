.class public final synthetic Ll/ۨۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ۗ᩺ۡ;

    .line 4
    check-cast p2, Ll/ۗ᩺ۡ;

    .line 734
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    neg-int p1, p1

    return p1
.end method
