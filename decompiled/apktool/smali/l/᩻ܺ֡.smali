.class public final Ll/᩻ܺ֡;
.super Ljava/lang/Object;
.source "85KM"


# direct methods
.method public static ֫(IILjava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 7

    .line 264
    instance-of v0, p2, Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p3, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 265
    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    move-object v4, p3

    check-cast v4, Ljava/lang/String;

    const/4 v2, 0x1

    move v3, p0

    move v6, p1

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    return p0

    .line 272
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p0

    .line 273
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ltz p0, :cond_6

    if-gez p1, :cond_1

    goto :goto_2

    :cond_1
    if-lt v0, p1, :cond_6

    if-ge v1, p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_0
    add-int/lit8 v0, p1, -0x1

    if-lez p1, :cond_5

    add-int/lit8 p1, p0, 0x1

    .line 286
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    add-int/lit8 v1, v5, 0x1

    .line 287
    invoke-interface {p3, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne p0, v2, :cond_3

    goto :goto_1

    .line 298
    :cond_3
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    if-eq v3, v4, :cond_4

    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    if-eq p0, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move p0, p1

    move p1, v0

    move v5, v1

    goto :goto_0

    :cond_5
    const/4 p0, 0x1

    return p0

    :cond_6
    :goto_2
    const/4 p0, 0x0

    return p0
.end method
