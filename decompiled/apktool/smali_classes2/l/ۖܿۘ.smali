.class public final Ll/ۖܿۘ;
.super Ll/ᩴܿۘ;
.source "L1LP"


# direct methods
.method private ֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;I)Ljava/lang/Integer;
    .locals 4

    .line 273
    iget-object v0, p0, Ll/ᩴܿۘ;->֫:Ljava/util/List;

    iget-object v1, p0, Ll/ᩴܿۘ;->ۧ:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Ll/᩶ܳۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    iget v1, p4, Ll/᩹ܳۘ;->ܽ:I

    iget p4, p4, Ll/᩹ܳۘ;->ᩳ:I

    invoke-virtual {p1, v1, p4}, Ll/᩶ܳۘ;->ۧ(II)I

    move-result p1

    add-int/lit8 p2, p2, 0x1

    const/4 p4, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-ge v1, p2, :cond_1

    add-int v3, p1, v1

    .line 224
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ᩳۘ;

    invoke-virtual {v3}, Ll/᩺ᩳۘ;->ۧ()I

    move-result v3

    if-gt v3, p5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    add-int/lit8 p1, p1, -0x1

    add-int/lit8 p3, p3, 0x1

    const/4 p2, 0x0

    :goto_2
    if-ge p2, p3, :cond_3

    sub-int v3, p1, p2

    .line 231
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ᩳۘ;

    invoke-virtual {v3}, Ll/᩺ᩳۘ;->ۧ()I

    move-result v3

    if-gt v3, p5, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    const/4 p2, -0x1

    :goto_3
    if-ne v1, v2, :cond_4

    if-ne p2, v2, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    if-eqz v1, :cond_7

    if-nez p2, :cond_5

    goto :goto_5

    :cond_5
    if-eq v1, v2, :cond_6

    goto :goto_4

    :cond_6
    neg-int v1, p2

    .line 241
    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 239
    :cond_7
    :goto_5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;Ll/᩹ܳۘ;I)Ljava/lang/Integer;
    .locals 4

    .line 291
    invoke-virtual {p1}, Ll/᩶ܳۘ;->ۧ()Ll/᩶ܳۘ;

    move-result-object p1

    .line 292
    iget-object v0, p0, Ll/ᩴܿۘ;->֫:Ljava/util/List;

    iget-object v1, p0, Ll/ᩴܿۘ;->ۧ:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Ll/᩶ܳۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    iget v1, p4, Ll/᩹ܳۘ;->֫:I

    iget p4, p4, Ll/᩹ܳۘ;->ۧ:I

    invoke-virtual {p1, v1, p4}, Ll/᩶ܳۘ;->ۧ(II)I

    move-result p4

    .line 294
    iget v1, p5, Ll/᩹ܳۘ;->ܽ:I

    iget p5, p5, Ll/᩹ܳۘ;->ᩳ:I

    invoke-virtual {p1, v1, p5}, Ll/᩶ܳۘ;->ۧ(II)I

    move-result p1

    add-int/lit8 p2, p2, 0x1

    const/4 p5, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-ge v1, p2, :cond_1

    add-int v3, p4, v1

    .line 224
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ᩳۘ;

    invoke-virtual {v3}, Ll/᩺ᩳۘ;->ۧ()I

    move-result v3

    if-gt v3, p6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    add-int/lit8 p1, p1, -0x1

    add-int/lit8 p3, p3, 0x1

    const/4 p2, 0x0

    :goto_2
    if-ge p2, p3, :cond_3

    sub-int p4, p1, p2

    .line 231
    invoke-interface {v0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩺ᩳۘ;

    invoke-virtual {p4}, Ll/᩺ᩳۘ;->ۧ()I

    move-result p4

    if-gt p4, p6, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    const/4 p2, -0x1

    :goto_3
    if-ne v1, v2, :cond_4

    if-ne p2, v2, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    if-eqz v1, :cond_7

    if-nez p2, :cond_5

    goto :goto_5

    :cond_5
    if-eq v1, v2, :cond_6

    goto :goto_4

    :cond_6
    neg-int v1, p2

    .line 241
    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 239
    :cond_7
    :goto_5
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;Ll/᩹ܳۘ;)I
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p5

    .line 249
    invoke-direct/range {v0 .. v5}, Ll/ۖܿۘ;->֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;I)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 252
    invoke-direct/range {v0 .. v6}, Ll/ۖܿۘ;->֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;Ll/᩹ܳۘ;I)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 253
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    const/4 v5, 0x3

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p5

    .line 255
    invoke-direct/range {v0 .. v5}, Ll/ۖܿۘ;->֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;I)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 256
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_2
    const/4 v6, 0x3

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 258
    invoke-direct/range {v0 .. v6}, Ll/ۖܿۘ;->֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;Ll/᩹ܳۘ;I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 259
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method
