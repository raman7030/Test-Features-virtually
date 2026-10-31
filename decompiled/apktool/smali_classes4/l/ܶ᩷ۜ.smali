.class public final Ll/ܶ᩷ۜ;
.super Ljava/lang/Object;
.source "I770"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Z
    .locals 4

    const/4 v0, 0x0

    if-ltz p2, :cond_3

    .line 44
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 47
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    add-int v2, p2, v1

    .line 48
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static ֫(Ll/ᩴ֫ۚ;Ljava/lang/String;)Z
    .locals 5

    .line 19
    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x28

    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v1, v2, :cond_4

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    add-int/2addr v1, v0

    .line 25
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    .line 26
    invoke-static {p1, v3, v1}, Ll/ܶ᩷ۜ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    .line 29
    :cond_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x29

    if-eq v2, v3, :cond_3

    goto :goto_1

    :cond_3
    add-int/2addr v1, v0

    .line 35
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    .line 36
    invoke-static {p1, p0, v1}, Ll/ܶ᩷ۜ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/2addr p0, v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0
.end method
