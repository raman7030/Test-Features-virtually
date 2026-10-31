.class public final Ll/֫ܺܺ;
.super Ll/ܿᩴܺ;
.source "IBDV"

# interfaces
.implements Ljava/lang/Comparable;


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 117
    check-cast p1, Ll/֫ܺܺ;

    invoke-virtual {p0, p1}, Ll/֫ܺܺ;->֫(Ll/֫ܺܺ;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/֫ܺܺ;)I
    .locals 7

    .line 134
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 135
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_2

    .line 139
    invoke-virtual {p0, v4}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۡܺ;

    .line 140
    invoke-virtual {p1, v4}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۡܺ;

    .line 141
    invoke-virtual {v5, v6}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v5

    if-eqz v5, :cond_1

    return v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    if-ge v0, v1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-le v0, v1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v3
.end method
