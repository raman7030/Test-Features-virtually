.class public final Ll/ۧ᩷ܽ;
.super Ljava/lang/Object;
.source "UC3T"


# direct methods
.method public static ֫(IILjava/lang/CharSequence;)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge p0, p1, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    .line 155
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0xc8

    if-lt p0, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(I[B)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 25
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 26
    aget-byte p1, p1, v2

    and-int/2addr p1, v0

    const/16 v3, 0xfe

    if-ne p0, v3, :cond_0

    if-ne p1, v0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez p1, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    xor-int/2addr v2, v3

    if-eqz v2, :cond_2

    return v0

    :cond_2
    if-nez p0, :cond_3

    return v1

    .line 25
    :cond_3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 26
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_4
    :goto_2
    if-ge v4, v2, :cond_8

    if-ge v5, v3, :cond_8

    .line 31
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v6, v7, :cond_5

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    :goto_3
    if-eq v4, v2, :cond_6

    .line 38
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v7

    if-eqz v7, :cond_6

    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-eq v5, v3, :cond_7

    .line 42
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v7

    if-eqz v7, :cond_7

    add-int/lit8 v5, v5, 0x1

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    if-nez v6, :cond_4

    return v0

    :cond_8
    :goto_5
    if-eq v4, v2, :cond_a

    .line 51
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v6

    if-nez v6, :cond_9

    return v0

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_a
    :goto_6
    if-eq v5, v3, :cond_c

    .line 54
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result p0

    if-nez p0, :cond_b

    return v0

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_c
    return v1
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v1, 0x4a

    if-eq p0, v1, :cond_1

    const/16 v1, 0x44

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(I)Z
    .locals 1

    const/16 v0, 0x64

    if-lt p0, v0, :cond_0

    const/16 v0, 0xc8

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(I[B)Z
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 38
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 39
    aget-byte p1, p1, v2

    and-int/2addr p1, v0

    if-ne p0, v0, :cond_0

    const/16 p0, 0xfe

    if-ne p1, p0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public static ۧ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 5

    .line 105
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 106
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 109
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 110
    invoke-static {v4}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v3, v0, :cond_3

    add-int/lit8 v4, v0, -0x1

    .line 115
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 116
    invoke-static {v4}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-ge v2, v1, :cond_5

    .line 122
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 123
    invoke-static {v4}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    if-ge v2, v1, :cond_7

    add-int/lit8 v4, v1, -0x1

    .line 128
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 129
    invoke-static {v4}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    .line 133
    :cond_7
    :goto_4
    new-instance v4, Ll/ܿ᩻ۘ;

    invoke-direct {v4, v3, v0, p0}, Ll/ܿ᩻ۘ;-><init>(IILjava/lang/CharSequence;)V

    .line 134
    new-instance p0, Ll/ܿ᩻ۘ;

    invoke-direct {p0, v2, v1, p1}, Ll/ܿ᩻ۘ;-><init>(IILjava/lang/CharSequence;)V

    .line 65
    invoke-static {v4, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static ܽ(I[B)Z
    .locals 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 51
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 52
    aget-byte v3, p1, v2

    and-int/2addr v3, v0

    const/4 v4, 0x2

    .line 53
    aget-byte v4, p1, v4

    and-int/2addr v4, v0

    const/4 v5, 0x3

    .line 54
    aget-byte p1, p1, v5

    and-int/2addr p1, v0

    if-nez p0, :cond_0

    if-nez v3, :cond_0

    const/16 p0, 0xfe

    if-ne v4, p0, :cond_0

    if-ne p1, v0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public static ܿ(I[B)Z
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 11
    aget-byte p0, p1, v1

    and-int/lit16 p0, p0, 0xff

    const/4 v0, 0x1

    .line 12
    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x2

    .line 13
    aget-byte p1, p1, v3

    and-int/lit16 p1, p1, 0xff

    const/16 v3, 0xef

    if-ne p0, v3, :cond_0

    const/16 p0, 0xbb

    if-ne v2, p0, :cond_0

    const/16 p0, 0xbf

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method public static ᩳ(I[B)Z
    .locals 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 66
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 67
    aget-byte v3, p1, v2

    and-int/2addr v3, v0

    const/4 v4, 0x2

    .line 68
    aget-byte v4, p1, v4

    and-int/2addr v4, v0

    const/4 v5, 0x3

    .line 69
    aget-byte p1, p1, v5

    and-int/2addr p1, v0

    if-ne p0, v0, :cond_0

    const/16 p0, 0xfe

    if-ne v3, p0, :cond_0

    if-nez v4, :cond_0

    if-nez p1, :cond_0

    return v2

    :cond_0
    return v1
.end method
