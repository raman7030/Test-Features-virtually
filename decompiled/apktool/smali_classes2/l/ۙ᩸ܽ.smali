.class public final synthetic Ll/ۙ᩸ܽ;
.super Ljava/lang/Object;
.source "D77D"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 2
    check-cast p1, Ll/ܰܶܽ;

    .line 4
    check-cast p2, Ll/ܰܶܽ;

    .line 21
    iget-wide v0, p2, Ll/ܰܶܽ;->֫:J

    iget-wide v2, p1, Ll/ܰܶܽ;->֫:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 25
    :cond_0
    iget v0, p1, Ll/ܰܶܽ;->ۧ:I

    iget v1, p2, Ll/ܰܶܽ;->ۧ:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 29
    :cond_1
    iget v0, p1, Ll/ܰܶܽ;->ܿ:I

    iget v1, p2, Ll/ܰܶܽ;->ܿ:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 33
    :cond_2
    iget p1, p1, Ll/ܰܶܽ;->ܽ:I

    iget p2, p2, Ll/ܰܶܽ;->ܽ:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
