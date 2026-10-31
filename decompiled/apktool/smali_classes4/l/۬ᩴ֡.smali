.class public final Ll/۬ᩴ֡;
.super Ll/ܺ֨֡;
.source "4917"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 15

    .line 302
    invoke-interface/range {p2 .. p2}, Ll/ᩴ֨֡;->ۧ()Ll/ᩳ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ֨֡;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    .line 303
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 306
    check-cast v3, Ll/ܽ֨֡;

    invoke-virtual {v3}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v3

    const/16 v4, 0x7c

    const/4 v5, 0x0

    .line 307
    invoke-static {v4, v3, v5}, Ll/ۡ۠ۘ;->֫(CLjava/lang/CharSequence;I)I

    move-result v3

    const/4 v6, -0x1

    if-eq v3, v6, :cond_f

    .line 308
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object v3

    .line 310
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->getIndex()I

    move-result v6

    invoke-virtual {v3}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-virtual {v3, v6, v7}, Ll/ܽ֨֡;->֫(II)Ll/ܽ֨֡;

    move-result-object v3

    .line 311
    invoke-virtual {v3}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v3

    .line 212
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    const/4 v9, 0x0

    .line 217
    :goto_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-ge v7, v10, :cond_d

    .line 218
    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    const/16 v11, 0x9

    if-eq v10, v11, :cond_c

    const/16 v11, 0x20

    if-eq v10, v11, :cond_c

    const/16 v11, 0x2d

    const/16 v12, 0x3a

    if-eq v10, v11, :cond_3

    if-eq v10, v12, :cond_3

    if-eq v10, v4, :cond_1

    goto/16 :goto_6

    :cond_1
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v9, v9, 0x1

    if-le v9, v1, :cond_2

    goto/16 :goto_6

    :cond_2
    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    if-nez v9, :cond_4

    .line 232
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_6

    :cond_4
    if-ne v10, v12, :cond_5

    add-int/lit8 v7, v7, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    goto :goto_2

    :cond_5
    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_2
    const/4 v13, 0x0

    .line 245
    :goto_3
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-ge v7, v14, :cond_6

    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    if-ne v14, v11, :cond_6

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v9, v9, 0x1

    const/4 v13, 0x1

    goto :goto_3

    :cond_6
    if-nez v13, :cond_7

    goto :goto_6

    .line 254
    :cond_7
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v7, v11, :cond_8

    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-ne v11, v12, :cond_8

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v9, v9, 0x1

    const/4 v11, 0x1

    goto :goto_4

    :cond_8
    const/4 v11, 0x0

    .line 259
    :goto_4
    new-instance v12, Ll/۫ᩴ֡;

    if-eqz v10, :cond_9

    if-eqz v11, :cond_9

    .line 282
    sget-object v10, Ll/ܶᩴ֡;->᩹:Ll/ܶᩴ֡;

    goto :goto_5

    :cond_9
    if-eqz v10, :cond_a

    .line 284
    sget-object v10, Ll/ܶᩴ֡;->᩶:Ll/ܶᩴ֡;

    goto :goto_5

    :cond_a
    if-eqz v11, :cond_b

    .line 286
    sget-object v10, Ll/ܶᩴ֡;->ۙ:Ll/ܶᩴ֡;

    goto :goto_5

    :cond_b
    move-object v10, v2

    .line 259
    :goto_5
    invoke-direct {v12, v10, v9}, Ll/۫ᩴ֡;-><init>(Ll/ܶᩴ֡;I)V

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_c
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    :cond_d
    if-nez v8, :cond_e

    :goto_6
    move-object v6, v2

    :cond_e
    if-eqz v6, :cond_f

    .line 312
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_f

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 313
    check-cast v0, Ll/ܽ֨֡;

    .line 314
    invoke-static {v0}, Ll/ۤᩴ֡;->ۧ(Ll/ܽ֨֡;)Ljava/util/ArrayList;

    move-result-object v3

    .line 315
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v4, v3, :cond_f

    .line 316
    new-instance v2, Ll/ۤᩴ֡;

    invoke-direct {v2, v6, v0}, Ll/ۤᩴ֡;-><init>(Ljava/util/ArrayList;Ll/ܽ֨֡;)V

    new-array v0, v1, [Ll/ۖ֨֡;

    aput-object v2, v0, v5

    .line 17
    new-instance v2, Ll/᩷᩵֡;

    invoke-direct {v2, v0}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 318
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->getIndex()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/᩷᩵֡;->ۧ(I)Ll/᩷᩵֡;

    .line 319
    invoke-virtual {v2, v1}, Ll/᩷᩵֡;->ܽ(I)Ll/᩷᩵֡;

    :cond_f
    :goto_7
    return-object v2
.end method
