.class public final synthetic Ll/ۜܳܽ;
.super Ljava/lang/Object;
.source "L1ES"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/᩸᩻ܽ;

    .line 4
    check-cast p2, Ll/᩸᩻ܽ;

    .line 219
    iget v0, p1, Ll/᩸᩻ܽ;->ۧ:I

    iget v1, p2, Ll/᩸᩻ܽ;->ۧ:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 222
    :cond_0
    iget p2, p2, Ll/᩸᩻ܽ;->֫:I

    iget p1, p1, Ll/᩸᩻ܽ;->֫:I

    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
