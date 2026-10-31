.class public final Ll/᩶֫ۖ;
.super Ll/᩹۟ܺ;
.source "97QO"


# instance fields
.field public final ۜ:Ljava/lang/String;

.field public ۢ:Ll/֨᩵۠;

.field public final ܳ:[Ll/᩹֫ۖ;

.field public ܿ:I

.field public final ᩷:Ll/ܳ۬ܺ;

.field public final ᩻:Ll/᩶۬ܺ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 25
    invoke-direct/range {p0 .. p0}, Ll/᩶۟ܺ;-><init>()V

    .line 902
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    iput-object v1, v0, Ll/᩶֫ۖ;->ۜ:Ljava/lang/String;

    .line 283
    invoke-static/range {p1 .. p1}, Ll/۬۟ܺ;->ᩳ(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v2

    invoke-static {v2}, Ll/ܳ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ܳ۬ܺ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩶۟ܺ;->ۧ(Ll/ܳ۬ܺ;)V

    .line 344
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object v2

    .line 422
    new-instance v3, Ll/۫۬ܺ;

    invoke-direct {v3}, Ll/۫۬ܺ;-><init>()V

    .line 359
    invoke-virtual {v3, v2}, Ll/۫۬ܺ;->֫(Ljava/lang/Iterable;)Ll/۫۬ܺ;

    sget-object v2, Ll/᩶ۘ۠;->ۗ֫:Ll/᩶ۘ۠;

    invoke-virtual {v3, v2}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    invoke-virtual {v3}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object v2

    .line 360
    new-instance v3, Ll/ۗ֨۠;

    invoke-direct {v3}, Ll/ۗ֨۠;-><init>()V

    .line 361
    invoke-static {v3}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v4

    const-string v5, "--enable-preview"

    const-string v6, "true"

    invoke-virtual {v4, v5, v6}, Ll/ۨܶ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    new-instance v4, Ll/ۨܿ۠;

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v6, 0x0

    invoke-direct {v4, v3, v6, v5}, Ll/ۨܿ۠;-><init>(Ll/ۗ֨۠;ZLjava/nio/charset/Charset;)V

    .line 363
    const-class v5, Ll/ۧ᩶۠;

    invoke-virtual {v3, v5, v4}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 364
    new-instance v4, Ll/᩺᩹۠;

    invoke-direct {v4}, Ll/᩺᩹۠;-><init>()V

    .line 365
    const-class v5, Ll/ܰ᩹۠;

    invoke-virtual {v3, v5, v4}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 366
    invoke-static {v3}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v4

    .line 367
    new-instance v5, Ll/ܶ֫ۖ;

    const-string v7, "Source.java"

    .line 368
    invoke-static {v7}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v7

    sget-object v8, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    invoke-direct {v5, v7, v8, v1}, Ll/ܶ֫ۖ;-><init>(Ljava/net/URI;Ll/ܽ᩶۠;Ljava/lang/String;)V

    .line 367
    invoke-virtual {v4, v5}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 485
    new-instance v5, Ll/ۚܶ۠;

    const/4 v7, 0x0

    .line 138
    invoke-direct {v5, v4, v7}, Ll/ۚܶ۠;-><init>(Ll/᩹ܶ۠;Ljava/util/function/Predicate;)V

    .line 99
    invoke-static {v3}, Ll/ۘۘ۠;->֫(Ll/ۗ֨۠;)Ll/ۘۘ۠;

    move-result-object v3

    const-string v4, "\n//EOF"

    .line 100
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 101
    new-instance v7, Ll/ۚۧۖ;

    array-length v8, v4

    invoke-direct {v7, v3, v4, v8}, Ll/ۚۧۖ;-><init>(Ll/ۘۘ۠;[CI)V

    .line 102
    new-instance v4, Ll/֡ۧۖ;

    invoke-direct {v4, v3, v7}, Ll/֡ۧۖ;-><init>(Ll/ۘۘ۠;Ll/ۙۖ۠;)V

    .line 726
    new-instance v3, Ll/֫۬ܺ;

    invoke-direct {v3}, Ll/֫۬ܺ;-><init>()V

    .line 104
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x0

    .line 107
    :goto_0
    invoke-virtual {v4}, Ll/ۖۘ۠;->ܽ()V

    .line 88
    invoke-virtual {v4, v6}, Ll/ۖۘ۠;->ۧ(I)Ll/᩹ۘ۠;

    move-result-object v10

    .line 109
    iget-object v11, v10, Ll/᩹ۘ۠;->֫:Ll/ۖܶ۠;

    iget v12, v10, Ll/᩹ۘ۠;->ۧ:I

    iget v13, v10, Ll/᩹ۘ۠;->ᩳ:I

    iget-object v14, v10, Ll/᩹ۘ۠;->ܽ:Ll/᩶ۘ۠;

    if-eqz v11, :cond_2

    .line 110
    invoke-virtual {v7}, Ll/ۚۧۖ;->ᩴ()Ljava/util/HashMap;

    move-result-object v11

    .line 144
    iget-object v15, v10, Ll/᩹ۘ۠;->֫:Ll/ۖܶ۠;

    if-nez v15, :cond_0

    .line 145
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v11

    goto :goto_1

    .line 148
    :cond_0
    invoke-static {v15}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Ll/᩵ۧۖ;

    invoke-direct {v15, v11}, Ll/᩵ۧۖ;-><init>(Ljava/util/HashMap;)V

    invoke-interface {v6, v15}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    invoke-static {}, Ll/ܳ۬ܺ;->᩷()Ll/ۨۨᩴ;

    move-result-object v11

    invoke-interface {v6, v11}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳ۬ܺ;

    invoke-virtual {v6}, Ll/ܳ۬ܺ;->᩻()Ll/ܳ۬ܺ;

    move-result-object v11

    const/4 v6, 0x0

    .line 375
    :goto_1
    invoke-virtual {v11, v6}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v6

    .line 110
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֨ۧۖ;

    .line 111
    invoke-virtual {v11}, Ll/֨ۧۖ;->֫()I

    move-result v15

    if-ge v9, v15, :cond_1

    .line 112
    new-instance v15, Ll/۠ۧۖ;

    move-object/from16 v16, v6

    invoke-virtual {v11}, Ll/֨ۧۖ;->֫()I

    move-result v6

    move-object/from16 v17, v7

    const/4 v7, 0x0

    invoke-direct {v15, v7, v7, v9, v6}, Ll/۠ۧۖ;-><init>(Ljava/lang/String;Ll/᩶ۘ۠;II)V

    invoke-virtual {v3, v15}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    move-object/from16 v16, v6

    move-object/from16 v17, v7

    const/4 v7, 0x0

    .line 114
    :goto_3
    new-instance v6, Ll/۠ۧۖ;

    .line 115
    invoke-virtual {v11}, Ll/֨ۧۖ;->֫()I

    move-result v9

    invoke-virtual {v11}, Ll/֨ۧۖ;->֫()I

    move-result v15

    invoke-virtual {v11}, Ll/֨ۧۖ;->ۧ()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v18

    add-int v15, v18, v15

    invoke-direct {v6, v7, v7, v9, v15}, Ll/۠ۧۖ;-><init>(Ljava/lang/String;Ll/᩶ۘ۠;II)V

    .line 114
    invoke-virtual {v3, v6}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 116
    invoke-virtual {v11}, Ll/֨ۧۖ;->֫()I

    move-result v6

    invoke-virtual {v11}, Ll/֨ۧۖ;->ۧ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int v9, v7, v6

    move-object/from16 v6, v16

    move-object/from16 v7, v17

    goto :goto_2

    :cond_2
    move-object/from16 v17, v7

    .line 119
    invoke-interface {v2, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "\""

    if-eqz v6, :cond_3

    .line 120
    sget-object v4, Ll/᩶ۘ۠;->ۗ֫:Ll/᩶ۘ۠;

    move v12, v9

    if-eq v14, v4, :cond_6

    move v8, v13

    goto :goto_5

    :cond_3
    if-ge v9, v13, :cond_4

    .line 126
    new-instance v6, Ll/۠ۧۖ;

    const/4 v11, 0x0

    invoke-direct {v6, v11, v11, v9, v13}, Ll/۠ۧۖ;-><init>(Ljava/lang/String;Ll/᩶ۘ۠;II)V

    invoke-virtual {v3, v6}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 128
    :cond_4
    new-instance v6, Ll/۠ۧۖ;

    .line 130
    sget-object v9, Ll/᩶ۘ۠;->֨ܽ:Ll/᩶ۘ۠;

    if-ne v14, v9, :cond_5

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ll/᩹ۘ۠;->ܳ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    :goto_4
    invoke-direct {v6, v9, v14, v13, v12}, Ll/۠ۧۖ;-><init>(Ljava/lang/String;Ll/᩶ۘ۠;II)V

    .line 128
    invoke-virtual {v3, v6}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    const/4 v6, 0x0

    .line 88
    invoke-virtual {v4, v6}, Ll/ۖۘ۠;->ۧ(I)Ll/᩹ۘ۠;

    move-result-object v6

    .line 135
    iget-object v6, v6, Ll/᩹ۘ۠;->ܽ:Ll/᩶ۘ۠;

    sget-object v9, Ll/᩶ۘ۠;->ۗ֫:Ll/᩶ۘ۠;

    if-ne v6, v9, :cond_35

    :cond_6
    :goto_5
    if-ge v12, v8, :cond_7

    .line 137
    new-instance v4, Ll/۠ۧۖ;

    const/4 v6, 0x0

    invoke-direct {v4, v6, v6, v12, v8}, Ll/۠ۧۖ;-><init>(Ljava/lang/String;Ll/᩶ۘ۠;II)V

    invoke-virtual {v3, v4}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 139
    :cond_7
    invoke-virtual {v3}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v3

    .line 376
    invoke-virtual {v5}, Ll/ۚܶ۠;->֫()Ljava/util/Queue;

    move-result-object v4

    .line 377
    invoke-static {v4}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v5, Ll/᩸᩹ۡ;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Ll/᩸᩹ۡ;-><init>(I)V

    invoke-interface {v4, v5}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 378
    new-instance v1, Ll/᩸֫ۖ;

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v9, 0x0

    const-string v10, ""

    const-string v11, ""

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v15}, Ll/᩸֫ۖ;-><init>(ILjava/lang/String;Ljava/lang/String;IIZLl/᩶ۘ۠;)V

    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    goto/16 :goto_19

    .line 381
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    .line 375
    invoke-virtual {v3, v6}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v3

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    .line 384
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠ۧۖ;

    .line 385
    invoke-virtual {v6}, Ll/۠ۧۖ;->ۧ()Ll/᩶ۘ۠;

    move-result-object v10

    invoke-virtual {v2, v10}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    goto/16 :goto_18

    .line 388
    :cond_9
    invoke-virtual {v6}, Ll/۠ۧۖ;->ܽ()I

    move-result v10

    .line 390
    invoke-virtual {v6}, Ll/۠ۧۖ;->֫()I

    move-result v12

    invoke-virtual {v1, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 392
    invoke-virtual {v6}, Ll/۠ۧۖ;->ۧ()Ll/᩶ۘ۠;

    move-result-object v12

    sget-object v13, Ll/᩶ۘ۠;->֨ܽ:Ll/᩶ۘ۠;

    if-ne v12, v13, :cond_a

    .line 393
    invoke-virtual {v6}, Ll/۠ۧۖ;->ᩳ()Ljava/lang/String;

    move-result-object v12

    goto :goto_7

    :cond_a
    move-object v12, v10

    :goto_7
    const/4 v13, 0x0

    .line 395
    invoke-virtual {v12, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    .line 399
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 400
    invoke-static {v13}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v15

    if-eqz v15, :cond_f

    .line 403
    invoke-static {v10}, Ll/۬۟ܺ;->ᩳ(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v13

    .line 404
    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_e

    .line 405
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 406
    invoke-static {v15}, Ll/۬۟ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 408
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v16

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v17

    sub-int v1, v16, v17

    move-object/from16 v20, v2

    const/4 v2, 0x0

    invoke-virtual {v15, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 409
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    .line 410
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    :cond_b
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_c
    move-object/from16 v20, v2

    .line 413
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    .line 414
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    :goto_9
    move-object/from16 v1, p1

    move-object/from16 v2, v20

    goto :goto_8

    :cond_e
    move-object/from16 v20, v2

    const/4 v1, 0x0

    const/4 v2, 0x0

    goto/16 :goto_e

    :cond_f
    move-object/from16 v20, v2

    const-string v1, "\'"

    .line 417
    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    invoke-virtual {v12, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto/16 :goto_f

    :cond_10
    const-string v1, "//"

    .line 421
    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_14

    const-string v2, "/*"

    invoke-virtual {v12, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_c

    .line 433
    :cond_11
    invoke-static {v13}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    move-result v1

    if-nez v1, :cond_13

    .line 434
    invoke-static {v13}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-nez v1, :cond_13

    const/16 v1, 0x2e

    if-ne v13, v1, :cond_12

    .line 435
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_12

    invoke-virtual {v12, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_b

    .line 446
    :cond_12
    invoke-virtual {v12}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v2, v1

    const/4 v5, 0x0

    :goto_a
    if-ge v5, v2, :cond_18

    aget-char v13, v1, v5

    .line 447
    invoke-static {v13}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    .line 439
    :cond_13
    :goto_b
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 423
    :cond_14
    :goto_c
    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    const-string v1, "\n"

    .line 424
    invoke-virtual {v10, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_15

    const-string v1, "\r"

    invoke-virtual {v10, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 425
    :cond_15
    invoke-static {v10}, Ll/۬۟ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 426
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v2, v5

    const/4 v5, 0x0

    invoke-virtual {v12, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 428
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    sub-int/2addr v12, v13

    invoke-virtual {v10, v5, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    move-object v12, v2

    move-object v10, v5

    goto :goto_d

    :cond_16
    const/4 v1, 0x0

    :goto_d
    move-object v2, v1

    .line 432
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    :goto_e
    const/4 v5, 0x0

    move-object v15, v12

    const/16 v18, 0x0

    goto :goto_11

    .line 420
    :cond_17
    :goto_f
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    :goto_10
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x1

    move-object v15, v12

    const/16 v18, 0x1

    .line 450
    :goto_11
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v12, 0x1

    if-ne v5, v12, :cond_1a

    .line 451
    new-instance v5, Ll/᩸֫ۖ;

    if-eqz v1, :cond_19

    add-int/lit8 v1, v11, 0x1

    move v13, v11

    move v11, v1

    goto :goto_12

    :cond_19
    const/4 v1, -0x1

    const/4 v13, -0x1

    .line 459
    :goto_12
    invoke-virtual {v6}, Ll/۠ۧۖ;->ۧ()Ll/᩶ۘ۠;

    move-result-object v19

    move-object v12, v5

    move-object v14, v10

    move/from16 v16, v8

    move/from16 v17, v9

    invoke-direct/range {v12 .. v19}, Ll/᩸֫ۖ;-><init>(ILjava/lang/String;Ljava/lang/String;IIZLl/᩶ۘ۠;)V

    .line 451
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 460
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v8

    .line 461
    invoke-static {v9, v10}, Ll/᩶֫ۖ;->֫(ILjava/lang/String;)I

    move-result v5

    move/from16 v26, v5

    goto :goto_16

    .line 464
    :cond_1a
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1c

    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    goto :goto_13

    .line 465
    :cond_1b
    new-instance v1, Ll/ᩴ֫ۖ;

    const-string v2, "Unicode escapes not allowed in whitespace or multi-character operators"

    invoke-direct {v1, v2}, Ll/ᩴ֫ۖ;-><init>(Ljava/lang/String;)V

    throw v1

    .line 468
    :cond_1c
    :goto_13
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 469
    new-instance v12, Ll/᩸֫ۖ;

    if-eqz v1, :cond_1d

    add-int/lit8 v13, v11, 0x1

    move/from16 v22, v11

    move v11, v13

    goto :goto_15

    :cond_1d
    const/4 v13, -0x1

    const/16 v22, -0x1

    :goto_15
    const/16 v28, 0x0

    move-object/from16 v21, v12

    move-object/from16 v23, v6

    move-object/from16 v24, v6

    move/from16 v25, v8

    move/from16 v26, v9

    move/from16 v27, v18

    invoke-direct/range {v21 .. v28}, Ll/᩸֫ۖ;-><init>(ILjava/lang/String;Ljava/lang/String;IIZLl/᩶ۘ۠;)V

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v8, v6

    .line 471
    invoke-static {v9, v10}, Ll/᩶֫ۖ;->֫(ILjava/lang/String;)I

    move-result v9

    goto :goto_14

    :cond_1e
    move v1, v8

    move/from16 v26, v9

    :goto_16
    if-eqz v2, :cond_1f

    .line 475
    new-instance v5, Ll/᩸֫ۖ;

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v22, -0x1

    move-object/from16 v21, v5

    move-object/from16 v23, v2

    move-object/from16 v24, v2

    move/from16 v25, v1

    invoke-direct/range {v21 .. v28}, Ll/᩸֫ۖ;-><init>(ILjava/lang/String;Ljava/lang/String;IIZLl/᩶ۘ۠;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    const/4 v1, 0x0

    move v8, v2

    const/4 v9, 0x0

    goto :goto_17

    :cond_1f
    move v8, v1

    move/from16 v9, v26

    :goto_17
    move-object/from16 v1, p1

    move-object/from16 v2, v20

    goto/16 :goto_6

    .line 480
    :cond_20
    :goto_18
    new-instance v1, Ll/᩸֫ۖ;

    const/16 v16, 0x1

    const/16 v17, 0x0

    const-string v12, ""

    const-string v13, ""

    move-object v10, v1

    move v14, v8

    move v15, v9

    invoke-direct/range {v10 .. v17}, Ll/᩸֫ۖ;-><init>(ILjava/lang/String;Ljava/lang/String;IIZLl/᩶ۘ۠;)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    invoke-static {v4}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v1

    .line 345
    :goto_19
    invoke-static {v1}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸֫ۖ;

    invoke-virtual {v2}, Ll/᩸֫ۖ;->getIndex()I

    move-result v2

    iput v2, v0, Ll/᩶֫ۖ;->ܿ:I

    .line 346
    invoke-virtual {v0, v1}, Ll/᩶۟ܺ;->֫(Ll/ܳ۬ܺ;)V

    .line 318
    invoke-static {}, Ll/ۢ۬ܺ;->᩻()Ll/ۜ۬ܺ;

    move-result-object v2

    .line 319
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸֫ۖ;

    .line 320
    invoke-virtual {v4}, Ll/᩸֫ۖ;->getPosition()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4}, Ll/᩸֫ۖ;->᩻()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    goto :goto_1a

    .line 322
    :cond_21
    invoke-virtual {v2}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    .line 499
    sget v2, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v2, Ll/֫۬ܺ;

    invoke-direct {v2}, Ll/֫۬ܺ;-><init>()V

    .line 501
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    .line 726
    new-instance v4, Ll/֫۬ܺ;

    invoke-direct {v4}, Ll/֫۬ܺ;-><init>()V

    const/4 v5, 0x0

    :cond_22
    :goto_1b
    if-ge v5, v3, :cond_2d

    .line 508
    :goto_1c
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸֫ۖ;

    invoke-virtual {v6}, Ll/᩸֫ۖ;->ۜ()Z

    move-result v6

    const-string v7, "\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/"

    if-nez v6, :cond_24

    add-int/lit8 v6, v5, 0x1

    .line 509
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸֫ۖ;

    .line 510
    invoke-virtual {v4, v5}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 571
    invoke-virtual {v5}, Ll/᩸֫ۖ;->ܽ()Z

    move-result v8

    if-eqz v8, :cond_23

    .line 572
    invoke-virtual {v5}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_23

    .line 512
    :goto_1d
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸֫ۖ;

    invoke-virtual {v5}, Ll/᩸֫ۖ;->ܳ()Z

    move-result v5

    if-eqz v5, :cond_23

    add-int/lit8 v6, v6, 0x1

    goto :goto_1d

    :cond_23
    move v5, v6

    goto :goto_1c

    :cond_24
    add-int/lit8 v6, v5, 0x1

    .line 518
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸֫ۖ;

    .line 726
    new-instance v8, Ll/֫۬ܺ;

    invoke-direct {v8}, Ll/֫۬ܺ;-><init>()V

    :goto_1e
    if-ge v6, v3, :cond_2c

    .line 523
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩸֫ۖ;

    invoke-virtual {v9}, Ll/᩸֫ۖ;->ۜ()Z

    move-result v9

    if-nez v9, :cond_2c

    .line 531
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩸֫ۖ;

    invoke-virtual {v9}, Ll/᩸֫ۖ;->ܽ()Z

    move-result v9

    if-eqz v9, :cond_28

    .line 532
    invoke-virtual {v5}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_0

    goto :goto_1f

    :sswitch_0
    const-string v10, "<"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_25

    goto :goto_1f

    :cond_25
    const/4 v9, 0x2

    goto :goto_20

    :sswitch_1
    const-string v10, "."

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_26

    goto :goto_1f

    :cond_26
    const/4 v9, 0x1

    goto :goto_20

    :sswitch_2
    const-string v10, "("

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_27

    goto :goto_1f

    :cond_27
    const/4 v9, 0x0

    goto :goto_20

    :goto_1f
    const/4 v9, -0x1

    :goto_20
    packed-switch v9, :pswitch_data_0

    .line 541
    :cond_28
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩸֫ۖ;

    invoke-virtual {v9}, Ll/᩸֫ۖ;->ۧ()Z

    move-result v9

    if-eqz v9, :cond_29

    .line 542
    invoke-virtual {v5}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, ";"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2c

    .line 549
    :cond_29
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩸֫ۖ;

    .line 571
    invoke-virtual {v9}, Ll/᩸֫ۖ;->ܽ()Z

    move-result v10

    if-eqz v10, :cond_2a

    .line 572
    invoke-virtual {v9}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2a

    .line 550
    new-instance v7, Ll/᩹֫ۖ;

    invoke-virtual {v4}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v4

    invoke-virtual {v8}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v8

    invoke-direct {v7, v4, v5, v8}, Ll/᩹֫ۖ;-><init>(Ljava/util/List;Ll/᩸֫ۖ;Ljava/util/List;)V

    invoke-virtual {v2, v7}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 726
    new-instance v4, Ll/֫۬ܺ;

    invoke-direct {v4}, Ll/֫۬ܺ;-><init>()V

    add-int/lit8 v5, v6, 0x1

    .line 551
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸֫ۖ;

    invoke-virtual {v4, v6}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 553
    :goto_21
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸֫ۖ;

    invoke-virtual {v6}, Ll/᩸֫ۖ;->ܳ()Z

    move-result v6

    if-eqz v6, :cond_22

    add-int/lit8 v5, v5, 0x1

    goto :goto_21

    :cond_2a
    add-int/lit8 v9, v6, 0x1

    .line 558
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸֫ۖ;

    .line 559
    invoke-virtual {v8, v6}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 560
    invoke-virtual {v6}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v6

    sget v10, Ll/۬۟ܺ;->֫:I

    .line 105
    invoke-static {}, Ll/ۨ۠ܺ;->ۧ()Ll/ۨ۠ܺ;

    move-result-object v10

    .line 497
    invoke-virtual {v10, v6}, Ll/ۨ۠ܺ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2b

    move v6, v9

    goto :goto_22

    :cond_2b
    move v6, v9

    goto/16 :goto_1e

    .line 564
    :cond_2c
    :goto_22
    :pswitch_0
    new-instance v7, Ll/᩹֫ۖ;

    invoke-virtual {v4}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v4

    invoke-virtual {v8}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v8

    invoke-direct {v7, v4, v5, v8}, Ll/᩹֫ۖ;-><init>(Ljava/util/List;Ll/᩸֫ۖ;Ljava/util/List;)V

    invoke-virtual {v2, v7}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 726
    new-instance v4, Ll/֫۬ܺ;

    invoke-direct {v4}, Ll/֫۬ܺ;-><init>()V

    move v5, v6

    goto/16 :goto_1b

    .line 567
    :cond_2d
    invoke-virtual {v2}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v1

    .line 286
    iput-object v1, v0, Ll/᩶֫ۖ;->᩷:Ll/ܳ۬ܺ;

    .line 287
    sget v2, Ll/᩶۬ܺ;->᩶:I

    .line 102
    new-instance v2, Ll/᩸۬ܺ;

    invoke-direct {v2}, Ll/᩸۬ܺ;-><init>()V

    const/4 v3, 0x0

    .line 375
    invoke-virtual {v1, v3}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v1

    .line 288
    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹֫ۖ;

    .line 289
    invoke-static {v3}, Ll/ᩴۧۖ;->֫(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;

    move-result-object v4

    .line 290
    invoke-interface {v4}, Ll/ܶ۟ܺ;->getPosition()I

    move-result v5

    .line 291
    invoke-interface {v4}, Ll/ܶ۟ܺ;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2e

    .line 292
    invoke-interface {v4}, Ll/ܶ۟ܺ;->length()I

    move-result v4

    const/4 v6, 0x1

    sub-int/2addr v4, v6

    add-int/2addr v5, v4

    .line 294
    :cond_2e
    invoke-static {v3}, Ll/ᩴۧۖ;->ۧ(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;

    move-result-object v4

    invoke-interface {v4}, Ll/ܶ۟ܺ;->getPosition()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ܰۤܺ;->֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ll/᩸۬ܺ;->֫(Ll/ܰۤܺ;Ljava/lang/Object;)V

    goto :goto_23

    .line 296
    :cond_2f
    invoke-virtual {v2}, Ll/᩸۬ܺ;->֫()Ll/᩶۬ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/᩶֫ۖ;->᩻:Ll/᩶۬ܺ;

    .line 299
    iget v1, v0, Ll/᩶֫ۖ;->ܿ:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    new-array v1, v1, [Ll/᩹֫ۖ;

    iput-object v1, v0, Ll/᩶֫ۖ;->ܳ:[Ll/᩹֫ۖ;

    .line 300
    iget-object v1, v0, Ll/᩶֫ۖ;->᩷:Ll/ܳ۬ܺ;

    const/4 v2, 0x0

    .line 375
    invoke-virtual {v1, v2}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v1

    .line 300
    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_34

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹֫ۖ;

    .line 301
    invoke-virtual {v3}, Ll/᩹֫ۖ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v4

    .line 375
    invoke-virtual {v4, v2}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v2

    .line 301
    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_31

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ۟ܺ;

    .line 302
    invoke-interface {v4}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v5

    if-gez v5, :cond_30

    goto :goto_25

    .line 305
    :cond_30
    iget-object v5, v0, Ll/᩶֫ۖ;->ܳ:[Ll/᩹֫ۖ;

    invoke-interface {v4}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v4

    aput-object v3, v5, v4

    goto :goto_25

    .line 307
    :cond_31
    iget-object v2, v0, Ll/᩶֫ۖ;->ܳ:[Ll/᩹֫ۖ;

    invoke-virtual {v3}, Ll/᩹֫ۖ;->֫()Ll/᩸֫ۖ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸֫ۖ;->getIndex()I

    move-result v4

    aput-object v3, v2, v4

    .line 308
    invoke-virtual {v3}, Ll/᩹֫ۖ;->ܽ()Ll/ܳ۬ܺ;

    move-result-object v2

    const/4 v4, 0x0

    .line 375
    invoke-virtual {v2, v4}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v2

    .line 308
    :goto_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_33

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ۟ܺ;

    .line 309
    invoke-interface {v4}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v5

    if-gez v5, :cond_32

    goto :goto_26

    .line 312
    :cond_32
    iget-object v5, v0, Ll/᩶֫ۖ;->ܳ:[Ll/᩹֫ۖ;

    invoke-interface {v4}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v4

    aput-object v3, v5, v4

    goto :goto_26

    :cond_33
    const/4 v2, 0x0

    goto :goto_24

    :cond_34
    return-void

    :cond_35
    move-object/from16 v20, v2

    const/4 v6, 0x0

    move-object/from16 v1, p1

    move v9, v12

    move-object/from16 v7, v17

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x28 -> :sswitch_2
        0x2e -> :sswitch_1
        0x3c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(ILjava/lang/String;)I
    .locals 3

    .line 489
    invoke-static {p1}, Ll/۬۟ܺ;->ܿ(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v0

    .line 906
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 907
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 489
    check-cast v1, Ljava/lang/Integer;

    .line 490
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    .line 491
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr p0, p1

    return p0

    .line 493
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 651
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "tokens"

    iget-object v2, p0, Ll/᩶֫ۖ;->᩷:Ll/ܳ۬ܺ;

    .line 652
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "super"

    .line 653
    invoke-super {p0}, Ll/᩹۟ܺ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 654
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/Collection;)Ll/᩹ۨܺ;
    .locals 7

    .line 679
    invoke-static {}, Ll/᩹ۨܺ;->ۧ()Ll/᩹ۨܺ;

    move-result-object v0

    .line 680
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۤܺ;

    .line 682
    invoke-static {}, Ll/᩵ۗܺ;->֫()Ll/᩵ۗܺ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܰۤܺ;->֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;

    move-result-object v1

    .line 584
    invoke-virtual {v1}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Ll/᩶֫ۖ;->ۜ:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    if-gt v2, v4, :cond_2

    .line 595
    invoke-virtual {v1}, Ll/ܰۤܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 596
    invoke-virtual {v1}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v1

    .line 646
    :cond_0
    iget-object v2, p0, Ll/᩶֫ۖ;->᩻:Ll/᩶۬ܺ;

    .line 599
    invoke-virtual {v2, v1}, Ll/᩶۬ܺ;->֫(Ll/ܰۤܺ;)Ll/᩶۬ܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶۬ܺ;->֫()Ll/ۢ۬ܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ۬ܺ;->values()Ll/᩺ۗܺ;

    move-result-object v1

    .line 600
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 601
    sget-object v1, Ll/᩶۟ܺ;->ܽ:Ll/ܰۤܺ;

    goto :goto_1

    .line 604
    :cond_1
    invoke-virtual {v1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹֫ۖ;

    invoke-virtual {v2}, Ll/᩹֫ۖ;->֫()Ll/᩸֫ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸֫ۖ;->getIndex()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹֫ۖ;

    invoke-virtual {v1}, Ll/᩹֫ۖ;->֫()Ll/᩸֫ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸֫ۖ;->getIndex()I

    move-result v1

    add-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 603
    invoke-static {v2, v1}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v1

    .line 681
    :goto_1
    invoke-virtual {v0, v1}, Ll/᩹ۨܺ;->֫(Ll/ܰۤܺ;)V

    goto/16 :goto_0

    .line 585
    :cond_2
    new-instance p1, Ll/ᩴ֫ۖ;

    .line 588
    invoke-virtual {v1}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v0

    .line 589
    invoke-virtual {v1}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sub-int/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 590
    invoke-virtual {v1}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v1

    .line 591
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v4, v6

    aput-object v2, v4, v5

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    const-string v0, "error: invalid offset (%d) or length (%d); offset + length (%d) > file length (%d)"

    .line 586
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ᩴ֫ۖ;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-object v0
.end method

.method public final ֫(Ll/֨᩵۠;)V
    .locals 0

    .line 674
    iput-object p1, p0, Ll/᩶֫ۖ;->ۢ:Ll/֨᩵۠;

    return-void
.end method

.method public final ۧ()Ll/᩶۬ܺ;
    .locals 1

    .line 646
    iget-object v0, p0, Ll/᩶֫ۖ;->᩻:Ll/᩶۬ܺ;

    return-object v0
.end method

.method public final ܽ(I)I
    .locals 2

    .line 667
    iget-object v0, p0, Ll/᩶֫ۖ;->ۢ:Ll/֨᩵۠;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, v0, Ll/֨᩵۠;->ۤ:Ll/ܰܶ۠;

    .line 668
    invoke-interface {v0, p1}, Ll/ܰܶ۠;->ۧ(I)I

    move-result p1

    return p1

    .line 497
    :cond_0
    new-instance p1, Ll/ܿ᩸ܺ;

    const-string v0, "Expected compilation unit to be set."

    invoke-static {v0, v1}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 497
    throw p1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 332
    iget-object v0, p0, Ll/᩶֫ۖ;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 614
    iget v0, p0, Ll/᩶֫ۖ;->ܿ:I

    return v0
.end method

.method public final ܿ(I)Ll/᩸۟ܺ;
    .locals 1

    .line 624
    iget-object v0, p0, Ll/᩶֫ۖ;->ܳ:[Ll/᩹֫ۖ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ᩳ(I)I
    .locals 2

    .line 661
    iget-object v0, p0, Ll/᩶֫ۖ;->ۢ:Ll/֨᩵۠;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, v0, Ll/֨᩵۠;->ۤ:Ll/ܰܶ۠;

    .line 662
    invoke-interface {v0, p1}, Ll/ܰܶ۠;->֫(I)I

    move-result p1

    return p1

    .line 497
    :cond_0
    new-instance p1, Ll/ܿ᩸ܺ;

    const-string v0, "Expected compilation unit to be set."

    invoke-static {v0, v1}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 497
    throw p1
.end method

.method public final ᩳ()Ll/ܳ۬ܺ;
    .locals 1

    .line 634
    iget-object v0, p0, Ll/᩶֫ۖ;->᩷:Ll/ܳ۬ܺ;

    return-object v0
.end method
