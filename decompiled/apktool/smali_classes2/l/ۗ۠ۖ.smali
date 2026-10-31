.class public final Ll/ۗ۠ۖ;
.super Ljava/lang/Object;
.source "Y23S"


# direct methods
.method public static ֫(Ll/᩹۠ۖ;)I
    .locals 2

    const/4 v0, 0x1

    .line 41
    invoke-static {p0, v0}, Ll/ۗ۠ۖ;->֫(Ll/᩹۠ۖ;Z)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Ll/ۗ۠ۖ;->֫(Ll/᩹۠ۖ;Z)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static ֫(Ll/᩹۠ۖ;Z)I
    .locals 9

    if-eqz p1, :cond_0

    .line 199
    invoke-virtual {p0}, Ll/᩹۠ۖ;->ܽ()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/᩹۠ۖ;->ᩳ()I

    move-result v0

    :goto_0
    if-eqz p1, :cond_1

    .line 200
    invoke-virtual {p0}, Ll/᩹۠ۖ;->ᩳ()I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ll/᩹۠ۖ;->ܽ()I

    move-result v1

    .line 201
    :goto_1
    invoke-virtual {p0}, Ll/᩹۠ۖ;->ۧ()[[B

    move-result-object p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    if-ge v2, v0, :cond_7

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x5

    if-ge v5, v1, :cond_5

    if-eqz p1, :cond_2

    .line 206
    aget-object v8, p0, v2

    aget-byte v8, v8, v5

    goto :goto_4

    :cond_2
    aget-object v8, p0, v5

    aget-byte v8, v8, v2

    :goto_4
    if-ne v8, v4, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_3
    if-lt v6, v7, :cond_4

    add-int/lit8 v6, v6, -0x2

    add-int/2addr v3, v6

    :cond_4
    const/4 v4, 0x1

    move v4, v8

    const/4 v6, 0x1

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    if-lt v6, v7, :cond_6

    add-int/lit8 v6, v6, -0x2

    add-int/2addr v6, v3

    move v3, v6

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    return v3
.end method
