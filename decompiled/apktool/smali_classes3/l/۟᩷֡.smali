.class public final Ll/۟᩷֡;
.super Ljava/lang/Object;
.source "T8FC"


# direct methods
.method public static ֫(IILjava/lang/String;[B)Z
    .locals 9

    .line 169
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    if-ltz p0, :cond_8

    add-int/2addr p1, p0

    .line 174
    array-length v0, p3

    if-le p1, v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    add-int v2, p0, v0

    add-int/lit8 v3, v2, 0x3

    const/16 v4, 0x7f

    if-ge v3, p1, :cond_4

    .line 184
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    add-int/lit8 v6, v0, 0x1

    .line 185
    invoke-virtual {p2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    add-int/lit8 v7, v0, 0x2

    .line 186
    invoke-virtual {p2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    add-int/lit8 v8, v0, 0x3

    .line 187
    invoke-virtual {p2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-gt v5, v4, :cond_8

    if-gt v6, v4, :cond_8

    if-gt v7, v4, :cond_8

    if-le v8, v4, :cond_2

    goto :goto_2

    :cond_2
    int-to-byte v4, v5

    .line 194
    aget-byte v5, p3, v2

    if-ne v4, v5, :cond_8

    int-to-byte v4, v6

    add-int/lit8 v5, v2, 0x1

    aget-byte v5, p3, v5

    if-ne v4, v5, :cond_8

    int-to-byte v4, v7

    add-int/lit8 v2, v2, 0x2

    aget-byte v2, p3, v2

    if-ne v4, v2, :cond_8

    int-to-byte v2, v8

    aget-byte v3, p3, v3

    if-eq v2, v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_4
    :goto_1
    add-int v2, p0, v0

    if-ge v2, p1, :cond_7

    .line 205
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-le v3, v4, :cond_5

    goto :goto_2

    :cond_5
    int-to-byte v3, v3

    .line 209
    aget-byte v2, p3, v2

    if-eq v3, v2, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    const/4 p0, 0x1

    return p0

    :cond_8
    :goto_2
    return v1
.end method
