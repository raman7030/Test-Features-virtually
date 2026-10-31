.class public final Ll/۠ܿۘ;
.super Ljava/lang/Object;
.source "Z1ME"


# direct methods
.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;)Z
    .locals 7

    .line 12
    sget-object v0, Ll/֨ܿۘ;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 18
    invoke-static {p0, p1}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0

    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xa

    .line 13
    invoke-static {p0, v3, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v4

    add-int/2addr v4, v1

    invoke-static {p1, v3, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v3

    add-int/2addr v3, v1

    if-nez v4, :cond_2

    .line 35
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-nez v3, :cond_3

    .line 39
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    xor-int/2addr v6, v5

    if-eqz v6, :cond_4

    goto :goto_3

    .line 44
    :cond_4
    invoke-interface {p0, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    .line 45
    invoke-interface {p1, v2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    .line 46
    invoke-static {v0, v2}, Ll/ۧ᩷ܽ;->ۧ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_3
    return p2

    :cond_5
    if-eqz v5, :cond_6

    return v1

    :cond_6
    move v2, v3

    move v0, v4

    goto :goto_0

    .line 65
    :cond_7
    invoke-static {p0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method
