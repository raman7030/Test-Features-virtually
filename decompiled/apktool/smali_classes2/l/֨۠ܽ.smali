.class public final Ll/֨۠ܽ;
.super Ljava/lang/Object;
.source "D6VQ"


# direct methods
.method public static ֫([IILl/۠۠ܽ;Ljava/lang/CharSequence;I)I
    .locals 9

    const/4 v0, -0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v3, :cond_8

    if-eq p1, v1, :cond_8

    const/4 v1, 0x5

    const/4 v4, 0x3

    if-eq p1, v4, :cond_1

    const/4 v5, 0x4

    if-eq p1, v5, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown regex literal type: "

    .line 0
    invoke-static {p1, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_1
    :goto_0
    iget v5, p2, Ll/۠۠ܽ;->ܽ֫:I

    .line 60
    :goto_1
    array-length v6, p0

    if-ge v2, v6, :cond_7

    if-lt p4, v5, :cond_2

    .line 62
    iput-boolean v3, p2, Ll/۠۠ܽ;->ܺ:Z

    return v0

    .line 66
    :cond_2
    invoke-static {p3, p4}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    .line 67
    aget v7, p0, v2

    if-eq v7, v6, :cond_4

    if-eq p1, v4, :cond_c

    if-ne p1, v1, :cond_3

    .line 69
    invoke-static {v6}, Ll/ۗᩳۘ;->ۧ(I)I

    move-result v8

    goto :goto_2

    :cond_3
    invoke-static {v6}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v8

    :goto_2
    if-eq v7, v8, :cond_4

    goto :goto_6

    .line 72
    :cond_4
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr p4, v6

    if-le p4, v5, :cond_5

    .line 74
    iput-boolean v3, p2, Ll/۠۠ܽ;->ܺ:Z

    return v0

    .line 77
    :cond_5
    invoke-virtual {p2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    return p4

    :cond_8
    if-ne p1, v1, :cond_9

    const/4 p1, 0x1

    goto :goto_3

    :cond_9
    const/4 p1, 0x0

    .line 40
    :goto_3
    iget v1, p2, Ll/۠۠ܽ;->ܽ֫:I

    sub-int/2addr v1, p4

    .line 41
    :goto_4
    array-length v4, p0

    if-ge v2, v4, :cond_f

    if-lt v2, v1, :cond_a

    .line 43
    iput-boolean v3, p2, Ll/۠۠ܽ;->ܺ:Z

    return v0

    :cond_a
    add-int v4, p4, v2

    .line 46
    invoke-interface {p3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 47
    aget v5, p0, v2

    if-eq v5, v4, :cond_d

    if-eqz p1, :cond_b

    .line 49
    invoke-static {v4}, Ll/ۗᩳۘ;->ۧ(I)I

    move-result v4

    goto :goto_5

    :cond_b
    invoke-static {v4}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v4

    :goto_5
    if-eq v5, v4, :cond_d

    :cond_c
    :goto_6
    return v0

    .line 52
    :cond_d
    invoke-virtual {p2}, Ll/۠۠ܽ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_e

    :goto_7
    const/4 p0, -0x2

    return p0

    :cond_e
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 54
    :cond_f
    array-length p0, p0

    add-int/2addr p4, p0

    return p4
.end method
