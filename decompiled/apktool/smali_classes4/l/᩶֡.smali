.class public final Ll/᩶֡;
.super Ljava/lang/Object;
.source "71DP"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 177
    check-cast p1, Ll/ܿۚ;

    check-cast p2, Ll/ܿۚ;

    .line 180
    iget p1, p1, Ll/ܿۚ;->ܽ:I

    iget p2, p2, Ll/ܿۚ;->ܽ:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
