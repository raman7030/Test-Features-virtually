.class public final Ll/۫ᩳۘ;
.super Ljava/lang/Object;
.source "T1MK"


# direct methods
.method public static ֫(Ll/۬ᩳۘ;Ll/۬ᩳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/᩹ܳۘ;Z)I
    .locals 6

    .line 213
    iget v0, p4, Ll/᩹ܳۘ;->ܽ:I

    if-nez v0, :cond_0

    const/4 p0, 0x0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ll/۬ᩳۘ;->֫(I)I

    move-result p0

    move v2, p0

    .line 214
    :goto_0
    iget p0, p4, Ll/᩹ܳۘ;->ᩳ:I

    if-nez p0, :cond_1

    const/4 p0, 0x0

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p1, p0}, Ll/۬ᩳۘ;->֫(I)I

    move-result p0

    move v3, p0

    :goto_1
    if-eqz p5, :cond_2

    move p0, v2

    goto :goto_2

    :cond_2
    move p0, v3

    .line 218
    :goto_2
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move-object v0, p2

    move-object v1, p3

    invoke-static/range {v0 .. v5}, Ll/ۗܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIII)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;
    .locals 9

    .line 44
    invoke-virtual {p2}, Ll/ۙܳۘ;->ۧ()V

    .line 46
    invoke-static {p0}, Ll/۫ᩳۘ;->֫(Ljava/lang/CharSequence;)[I

    move-result-object v0

    .line 47
    invoke-static {p1}, Ll/۫ᩳۘ;->֫(Ljava/lang/CharSequence;)[I

    move-result-object v1

    .line 49
    invoke-static {v0, v1, p2}, Ll/᩻ܳۘ;->֫([I[ILl/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p2

    .line 53
    new-instance v2, Ll/ᩳܳۘ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    .line 338
    invoke-direct {v2, p0, p1}, Ll/ܿܳۘ;-><init>(II)V

    .line 132
    new-instance p0, Ll/ۧܳۘ;

    invoke-direct {p0, p2}, Ll/ۧܳۘ;-><init>(Ll/ۜܳۘ;)V

    .line 54
    invoke-virtual {p0}, Ll/ۧܳۘ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ܳۘ;

    .line 55
    iget-object v4, v3, Ll/۬ܳۘ;->֫:Ljava/lang/Object;

    check-cast v4, Ll/᩹ܳۘ;

    .line 56
    iget-object v3, v3, Ll/۬ܳۘ;->ۧ:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 58
    iget v5, v4, Ll/᩹ܳۘ;->ܽ:I

    iget v6, v4, Ll/᩹ܳۘ;->֫:I

    const/4 v7, 0x0

    :goto_1
    if-ge v5, v6, :cond_0

    .line 285
    aget v8, v0, v5

    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int v5, v7, p1

    .line 59
    iget v6, v4, Ll/᩹ܳۘ;->ᩳ:I

    iget v4, v4, Ll/᩹ܳۘ;->ۧ:I

    const/4 v7, 0x0

    :goto_2
    if-ge v6, v4, :cond_1

    .line 285
    aget v8, v1, v6

    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int v4, v7, p2

    if-eqz v3, :cond_2

    .line 62
    invoke-virtual {v2, p1, p2, v5, v4}, Ll/ܿܳۘ;->ۧ(IIII)V

    :cond_2
    move p2, v4

    move p1, v5

    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {v2}, Ll/ᩳܳۘ;->ܳ()Ll/֫ܳۘ;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;)[I
    .locals 5

    .line 226
    new-instance v0, Ll/ܺۢᩴ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ܺۢᩴ;-><init>(I)V

    .line 228
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 232
    invoke-static {p0, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    .line 233
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    .line 235
    invoke-virtual {v0, v3}, Ll/ܺۢᩴ;->add(I)Z

    add-int/2addr v2, v4

    goto :goto_0

    .line 240
    :cond_0
    invoke-virtual {v0}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/֫ܳۘ;
    .locals 12

    .line 99
    invoke-virtual {p2}, Ll/ۙܳۘ;->ۧ()V

    .line 101
    invoke-static {p0}, Ll/۫ᩳۘ;->ۧ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;

    move-result-object v6

    .line 102
    invoke-static {p1}, Ll/۫ᩳۘ;->ۧ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;

    move-result-object v7

    .line 104
    iget-object v0, v6, Ll/۬ᩳۘ;->֫:[I

    iget-object v1, v7, Ll/۬ᩳۘ;->֫:[I

    invoke-static {v0, v1, p2}, Ll/᩻ܳۘ;->֫([I[ILl/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p2

    .line 176
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 178
    invoke-interface {p2}, Ll/֫ܳۘ;->֫()Ll/ܰܿۘ;

    move-result-object p2

    iget-object p2, p2, Ll/ܰܿۘ;->᩸:Ll/֫ܳۘ;

    invoke-interface {p2}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ll/᩹ܳۘ;

    .line 181
    iget v0, v9, Ll/᩹ܳۘ;->ܽ:I

    iget v1, v9, Ll/᩹ܳۘ;->֫:I

    if-ne v0, v1, :cond_0

    const/4 v5, 0x1

    move-object v0, v6

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, v9

    .line 182
    invoke-static/range {v0 .. v5}, Ll/۫ᩳۘ;->֫(Ll/۬ᩳۘ;Ll/۬ᩳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/᩹ܳۘ;Z)I

    move-result v0

    move v10, v0

    move v11, v10

    goto :goto_1

    .line 300
    :cond_0
    iget-object v2, v6, Ll/۬ᩳۘ;->ۧ:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, -0x1

    .line 185
    invoke-virtual {v6, v1}, Ll/۬ᩳۘ;->֫(I)I

    move-result v1

    move v10, v0

    move v11, v1

    .line 190
    :goto_1
    iget v0, v9, Ll/᩹ܳۘ;->ᩳ:I

    iget v1, v9, Ll/᩹ܳۘ;->ۧ:I

    if-ne v0, v1, :cond_1

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, v9

    .line 191
    invoke-static/range {v0 .. v5}, Ll/۫ᩳۘ;->֫(Ll/۬ᩳۘ;Ll/۬ᩳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/᩹ܳۘ;Z)I

    move-result v0

    move v1, v0

    goto :goto_2

    .line 300
    :cond_1
    iget-object v2, v7, Ll/۬ᩳۘ;->ۧ:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, -0x1

    .line 194
    invoke-virtual {v7, v1}, Ll/۬ᩳۘ;->֫(I)I

    move-result v1

    .line 197
    :goto_2
    new-instance v2, Ll/᩹ܳۘ;

    invoke-direct {v2, v10, v11, v0, v1}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 199
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {v8, p0, p1}, Ll/᩻ܳۘ;->֫(Ljava/util/ArrayList;II)Ll/֫ܳۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;
    .locals 7

    .line 245
    new-instance v0, Ll/ܺۢᩴ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ܺۢᩴ;-><init>(I)V

    .line 246
    new-instance v1, Ll/ܺۢᩴ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ll/ܺۢᩴ;-><init>(I)V

    .line 248
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 252
    invoke-static {p0, v3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v4

    .line 253
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    const/16 v6, 0x80

    if-ge v4, v6, :cond_0

    int-to-char v6, v4

    .line 37
    invoke-static {v6}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 256
    :cond_0
    invoke-virtual {v0, v4}, Ll/ܺۢᩴ;->add(I)Z

    .line 257
    invoke-virtual {v1, v3}, Ll/ܺۢᩴ;->add(I)Z

    :goto_1
    add-int/2addr v3, v5

    goto :goto_0

    .line 263
    :cond_1
    new-instance p0, Ll/۬ᩳۘ;

    invoke-virtual {v0}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v0

    invoke-virtual {v1}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll/۬ᩳۘ;-><init>([I[I)V

    return-object p0
.end method

.method public static ܽ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;
    .locals 8

    .line 115
    invoke-virtual {p2}, Ll/ۙܳۘ;->ۧ()V

    .line 117
    invoke-static {p0}, Ll/۫ᩳۘ;->ܽ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;

    move-result-object v0

    .line 118
    invoke-static {p1}, Ll/۫ᩳۘ;->ܽ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;

    move-result-object v1

    .line 120
    iget-object v2, v0, Ll/۬ᩳۘ;->֫:[I

    iget-object v3, v1, Ll/۬ᩳۘ;->֫:[I

    invoke-static {v2, v3, p2}, Ll/᩻ܳۘ;->֫([I[ILl/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p2

    .line 134
    new-instance v2, Ll/ᩳܳۘ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    .line 338
    invoke-direct {v2, p0, p1}, Ll/ܿܳۘ;-><init>(II)V

    .line 136
    invoke-interface {p2}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܳۘ;

    .line 137
    iget p2, p1, Ll/᩹ܳۘ;->֫:I

    iget v3, p1, Ll/᩹ܳۘ;->ܽ:I

    sub-int/2addr p2, v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p2, :cond_0

    .line 140
    iget-object v5, v0, Ll/۬ᩳۘ;->ۧ:[I

    add-int v6, v3, v4

    aget v5, v5, v6

    .line 141
    iget-object v6, v1, Ll/۬ᩳۘ;->ۧ:[I

    iget v7, p1, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v7, v4

    aget v6, v6, v7

    const/4 v7, 0x1

    .line 295
    invoke-virtual {v2, v5, v6, v7}, Ll/ܿܳۘ;->֫(III)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {v2}, Ll/ᩳܳۘ;->ܳ()Ll/֫ܳۘ;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;
    .locals 5

    .line 268
    new-instance v0, Ll/ܺۢᩴ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ܺۢᩴ;-><init>(I)V

    .line 269
    new-instance v1, Ll/ܺۢᩴ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ll/ܺۢᩴ;-><init>(I)V

    const/4 v2, 0x0

    .line 271
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 272
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 20
    invoke-static {v3}, Ll/ۗܿۘ;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 274
    invoke-virtual {v0, v3}, Ll/ܺۢᩴ;->add(I)Z

    .line 275
    invoke-virtual {v1, v2}, Ll/ܺۢᩴ;->add(I)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 279
    :cond_1
    new-instance p0, Ll/۬ᩳۘ;

    invoke-virtual {v0}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v0

    invoke-virtual {v1}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll/۬ᩳۘ;-><init>([I[I)V

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;
    .locals 8

    .line 78
    invoke-virtual {p2}, Ll/ۙܳۘ;->ۧ()V

    .line 80
    invoke-static {p0}, Ll/۫ᩳۘ;->ۧ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;

    move-result-object v1

    .line 81
    invoke-static {p1}, Ll/۫ᩳۘ;->ۧ(Ljava/lang/CharSequence;)Ll/۬ᩳۘ;

    move-result-object v2

    .line 83
    iget-object v0, v1, Ll/۬ᩳۘ;->֫:[I

    iget-object v3, v2, Ll/۬ᩳۘ;->֫:[I

    invoke-static {v0, v3, p2}, Ll/᩻ܳۘ;->֫([I[ILl/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object v5

    .line 162
    new-instance v7, Ll/ۢܿۘ;

    move-object v0, v7

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ll/ۢܿۘ;-><init>(Ll/۬ᩳۘ;Ll/۬ᩳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۜܳۘ;Ll/ۙܳۘ;)V

    invoke-virtual {v7}, Ll/ܺܿۘ;->֫()Ll/ۜܳۘ;

    move-result-object p0

    return-object p0
.end method
