.class public final Ll/᩷ۗۖ;
.super Ljava/lang/Object;
.source "94T8"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 229
    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, Ljava/util/Map$Entry;

    .line 232
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩶ۖ;

    iget p1, p1, Ll/ᩳ᩶ۖ;->ۗ:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳ᩶ۖ;

    iget p2, p2, Ll/ᩳ᩶ۖ;->ۗ:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
