.class public final Ll/ۗܿۘ;
.super Ljava/lang/Object;
.source "X1L1"


# direct methods
.method public static ֫(IILjava/lang/CharSequence;)I
    .locals 1

    :goto_0
    if-ge p0, p1, :cond_1

    add-int/lit8 v0, p1, -0x1

    .line 67
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p1
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIII)I
    .locals 3

    move v0, p2

    :goto_0
    if-ge v0, p4, :cond_3

    if-ge p3, p5, :cond_3

    .line 105
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    goto :goto_2

    .line 106
    :cond_1
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    sub-int/2addr v0, p2

    return v0
.end method

.method public static ֫(Ljava/util/List;Ljava/util/List;IIII)Ll/᩹ܳۘ;
    .locals 4

    move v0, p2

    move v1, p3

    :goto_0
    if-ge v0, p4, :cond_1

    if-ge v1, p5, :cond_1

    .line 80
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 50
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr v0, p2

    add-int/2addr p2, v0

    add-int/2addr p3, v0

    move v0, p4

    move v1, p5

    :goto_2
    if-ge p2, v0, :cond_3

    if-ge p3, v1, :cond_3

    add-int/lit8 v2, v0, -0x1

    add-int/lit8 v3, v1, -0x1

    .line 80
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 50
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_3
    :goto_3
    sub-int p0, p4, v0

    sub-int/2addr p4, p0

    sub-int/2addr p5, p0

    .line 210
    new-instance p0, Ll/᩹ܳۘ;

    invoke-direct {p0, p2, p4, p3, p5}, Ll/᩹ܳۘ;-><init>(IIII)V

    return-object p0
.end method

.method public static ֫(I)Z
    .locals 2

    const/16 v0, 0x5f

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x21

    if-lt p0, v0, :cond_1

    const/16 v0, 0x2f

    if-le p0, v0, :cond_4

    :cond_1
    const/16 v0, 0x3a

    if-lt p0, v0, :cond_2

    const/16 v0, 0x40

    if-le p0, v0, :cond_4

    :cond_2
    const/16 v0, 0x5b

    if-lt p0, v0, :cond_3

    const/16 v0, 0x60

    if-le p0, v0, :cond_4

    :cond_3
    const/16 v0, 0x7b

    if-lt p0, v0, :cond_5

    const/16 v0, 0x7e

    if-gt p0, v0, :cond_5

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    return v1
.end method

.method public static ۧ(IILjava/lang/CharSequence;)I
    .locals 1

    :goto_0
    if-ge p0, p1, :cond_1

    .line 62
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method
