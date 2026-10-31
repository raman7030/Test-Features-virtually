.class public final Ll/᩵ۘ۠;
.super Ljava/lang/Object;
.source "P7KL"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 12

    .line 49
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_9

    :cond_0
    const/4 v1, 0x1

    .line 0
    invoke-static {v1, p0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-eq v2, v3, :cond_2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    const-string v3, "\\R"

    .line 60
    invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 61
    array-length v3, p0

    if-nez v3, :cond_3

    const-string v3, ""

    goto :goto_2

    :cond_3
    sub-int/2addr v3, v1

    .line 63
    aget-object v3, p0, v3

    :goto_2
    if-nez v2, :cond_6

    .line 66
    invoke-static {v3}, Ll/᩵ۘ۠;->ۧ(Ljava/lang/String;)I

    move-result v2

    .line 67
    array-length v5, p0

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_7

    aget-object v7, p0, v6

    .line 0
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_5

    invoke-virtual {v7, v9}, Ljava/lang/String;->codePointAt(I)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v11

    if-nez v11, :cond_4

    .line 70
    invoke-static {v7}, Ll/᩵ۘ۠;->ۧ(Ljava/lang/String;)I

    move-result v7

    .line 0
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-nez v2, :cond_5

    goto :goto_5

    :cond_4
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v10

    add-int/2addr v9, v10

    goto :goto_4

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    .line 78
    :cond_7
    :goto_5
    invoke-virtual {v3, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 79
    array-length v4, p0

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v4, :cond_b

    aget-object v6, p0, v5

    .line 0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v7, :cond_9

    invoke-virtual {v6, v8}, Ljava/lang/String;->codePointAt(I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v10

    if-nez v10, :cond_8

    .line 81
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 83
    sget-object v7, Ll/ᩴۘ۠;->᩹:Ll/ᩴۘ۠;

    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 0
    :cond_8
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    move-result v9

    add-int/2addr v8, v9

    goto :goto_7

    .line 86
    :cond_9
    :goto_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v2, v7, :cond_a

    .line 88
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v1

    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 89
    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 91
    sget-object v6, Ll/ᩴۘ۠;->᩶:Ll/ᩴۘ۠;

    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_b
    :goto_9
    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 5

    .line 99
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method
