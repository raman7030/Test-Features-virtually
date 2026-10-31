.class public final Ll/᩷ܿۘ;
.super Ljava/lang/Object;
.source "M1ME"


# direct methods
.method public static ֫(Ljava/lang/CharSequence;)Ljava/util/ArrayList;
    .locals 11

    .line 268
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 270
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    :goto_0
    if-ge v3, v1, :cond_b

    .line 277
    invoke-static {p0, v3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    .line 278
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    const/16 v8, 0x80

    if-ge v6, v8, :cond_0

    int-to-char v9, v6

    .line 37
    invoke-static {v9}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x0

    goto :goto_1

    .line 33
    :cond_0
    invoke-static {v6}, Ll/ۗܿۘ;->֫(I)Z

    move-result v9

    xor-int/lit8 v9, v9, 0x1

    :goto_1
    if-eqz v9, :cond_7

    if-ge v6, v8, :cond_1

    goto :goto_2

    .line 42
    :cond_1
    invoke-static {v6}, Ljava/lang/Character;->isDigit(I)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    .line 44
    :cond_2
    sget v8, Ll/֫᩻᩵;->֫:I

    ushr-int/lit8 v8, v6, 0x10

    if-nez v8, :cond_7

    .line 45
    invoke-static {v6}, Ljava/lang/Character;->isIdeographic(I)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_3

    .line 46
    :cond_3
    invoke-static {v6}, Ljava/lang/Character;->isAlphabetic(I)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_3

    .line 48
    :cond_4
    invoke-static {v6}, Ll/۟ܳ᩵;->֫(I)Ll/۟ܳ᩵;

    move-result-object v8

    .line 49
    sget-object v10, Ll/۟ܳ᩵;->ۙ֫:Ll/۟ܳ᩵;

    if-eq v8, v10, :cond_7

    sget-object v10, Ll/۟ܳ᩵;->ܰ֫:Ll/۟ܳ᩵;

    if-eq v8, v10, :cond_7

    sget-object v10, Ll/۟ܳ᩵;->֡ܽ:Ll/۟ܳ᩵;

    if-eq v8, v10, :cond_7

    sget-object v10, Ll/۟ܳ᩵;->ۛ֫:Ll/۟ܳ᩵;

    if-ne v8, v10, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    if-ne v4, v2, :cond_6

    const/4 v5, 0x0

    move v4, v3

    :cond_6
    mul-int/lit8 v5, v5, 0x1f

    add-int/2addr v5, v6

    goto :goto_4

    :cond_7
    :goto_3
    if-eq v4, v2, :cond_8

    .line 291
    new-instance v8, Ll/ۜܿۘ;

    invoke-direct {v8, v4, v3, v5, p0}, Ll/ۜܿۘ;-><init>(IIILjava/lang/CharSequence;)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, -0x1

    :cond_8
    if-eqz v9, :cond_9

    .line 296
    new-instance v8, Ll/ۜܿۘ;

    add-int v9, v3, v7

    invoke-direct {v8, v3, v9, v6, p0}, Ll/ۜܿۘ;-><init>(IIILjava/lang/CharSequence;)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    const/16 v8, 0xa

    if-ne v6, v8, :cond_a

    .line 298
    new-instance v6, Ll/ܳܿۘ;

    invoke-direct {v6, v3}, Ll/ܳܿۘ;-><init>(I)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_4
    add-int/2addr v3, v7

    goto :goto_0

    :cond_b
    if-eq v4, v2, :cond_c

    .line 306
    new-instance v2, Ll/ۜܿۘ;

    invoke-direct {v2, v4, v1, v5, p0}, Ll/ۜܿۘ;-><init>(IIILjava/lang/CharSequence;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    return-object v0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۗܳۘ;
    .locals 9

    .line 193
    new-instance v0, Ll/ܳ᩻ۘ;

    invoke-direct {v0, p1, p2}, Ll/ܳ᩻ۘ;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 194
    invoke-static {p0, v0, p3}, Ll/۫ᩳۘ;->ܽ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p3

    .line 196
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 205
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 206
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 207
    invoke-interface {p3}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ܳۘ;

    .line 208
    iget v4, v3, Ll/᩹ܳۘ;->ۧ:I

    iget v5, v3, Ll/᩹ܳۘ;->ᩳ:I

    iget v6, v3, Ll/᩹ܳۘ;->֫:I

    iget v7, v3, Ll/᩹ܳۘ;->ܽ:I

    if-gt v4, v0, :cond_0

    .line 209
    new-instance v3, Ll/᩹ܳۘ;

    invoke-direct {v3, v7, v6, v5, v4}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-lt v5, v0, :cond_1

    .line 211
    new-instance v3, Ll/᩹ܳۘ;

    sub-int/2addr v5, v0

    sub-int/2addr v4, v0

    invoke-direct {v3, v7, v6, v5, v4}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sub-int v4, v0, v5

    .line 214
    new-instance v8, Ll/᩹ܳۘ;

    add-int/2addr v4, v7

    invoke-direct {v8, v7, v4, v5, v0}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    new-instance v5, Ll/᩹ܳۘ;

    iget v3, v3, Ll/᩹ܳۘ;->ۧ:I

    sub-int/2addr v3, v0

    const/4 v7, 0x0

    invoke-direct {v5, v4, v6, v7, v3}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 198
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {p3, p1, v1}, Ll/᩻ܳۘ;->֫(IILjava/util/List;)Ll/֫ܳۘ;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p1

    .line 199
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {p0, p2, v2}, Ll/᩻ܳۘ;->֫(IILjava/util/List;)Ll/֫ܳۘ;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p0

    .line 32
    new-instance p2, Ll/ۗܳۘ;

    .line 27
    invoke-direct {p2, p1, p0}, Ll/۬ܳۘ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static ֫(ILjava/lang/CharSequence;)Z
    .locals 3

    const/16 v0, 0xa

    if-gez p0, :cond_0

    goto :goto_1

    .line 231
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne p0, v1, :cond_1

    goto :goto_1

    .line 232
    :cond_1
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, p0, -0x1

    :goto_0
    if-ltz v1, :cond_a

    .line 236
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v2, v0, :cond_3

    goto :goto_4

    .line 238
    :cond_3
    invoke-static {v2}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_1
    if-gez p0, :cond_4

    goto :goto_3

    .line 246
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne p0, v1, :cond_5

    goto :goto_3

    .line 247
    :cond_5
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_3

    .line 249
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p0, v1, :cond_a

    .line 250
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v0, :cond_7

    goto :goto_4

    .line 252
    :cond_7
    invoke-static {v1}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v1

    if-nez v1, :cond_8

    :goto_3
    const/4 p0, 0x0

    return p0

    :cond_8
    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    :cond_9
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_a
    :goto_4
    const/4 p0, 0x1

    return p0
.end method
