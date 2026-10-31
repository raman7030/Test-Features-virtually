.class public final synthetic Ll/۟ۨۡ;
.super Ljava/lang/Object;
.source "64YZ"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ܿۘܽ;

    .line 4
    check-cast p2, Ll/ܿۘܽ;

    .line 96
    invoke-virtual {p1}, Ll/ܿۘܽ;->ܿ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩺ۡ;

    iget-object v0, v0, Ll/ܳ᩺ۡ;->֫:Ll/ܽᩳܽ;

    .line 97
    invoke-virtual {p2}, Ll/ܿۘܽ;->ܿ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩺ۡ;

    iget-object v1, v1, Ll/ܳ᩺ۡ;->֫:Ll/ܽᩳܽ;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    .line 99
    iget p1, v0, Ll/ܽᩳܽ;->֫:I

    .line 100
    iget p2, v1, Ll/ܽᩳܽ;->֫:I

    if-nez p1, :cond_0

    const p1, 0x7fffffff

    :cond_0
    if-nez p2, :cond_1

    const p2, 0x7fffffff

    .line 107
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :cond_2
    if-nez v0, :cond_3

    if-nez v1, :cond_3

    .line 110
    invoke-virtual {p1}, Ll/ܿۘܽ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ܿۘܽ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1
.end method
