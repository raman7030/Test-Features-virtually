.class public final Ll/᩺ܺܿ;
.super Ljava/lang/Object;
.source "86ZM"


# instance fields
.field public final ֫:Z

.field public final ۖ:I

.field public final ۘ:Z

.field public final ۜ:Z

.field public final ۡ:Ll/ܶۜܿ;

.field public final ۢ:I

.field public final ۧ:Z

.field public final ܳ:Z

.field public final ܺ:I

.field public final ܽ:Ljava/util/IdentityHashMap;

.field public final ܿ:Ll/᩸᩷ܿ;

.field public final ᩳ:[Ll/ܶۜܿ;

.field public final ᩷:[Ll/᩶ܺܿ;

.field public final ᩻:Z


# direct methods
.method public constructor <init>([Ll/᩶ܺܿ;Ll/ܶۜܿ;Ll/᩸᩷ܿ;III)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 43
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object v1, v0, Ll/᩺ܺܿ;->᩷:[Ll/᩶ܺܿ;

    .line 45
    iput-object v2, v0, Ll/᩺ܺܿ;->ۡ:Ll/ܶۜܿ;

    move-object/from16 v3, p3

    .line 46
    iput-object v3, v0, Ll/᩺ܺܿ;->ܿ:Ll/᩸᩷ܿ;

    .line 47
    sget v3, Ll/ۜ᩷ܿ;->֫:I

    .line 1172
    invoke-virtual/range {p2 .. p2}, Ll/ܶۜܿ;->᩻()Ll/۟ۜܿ;

    move-result-object v3

    invoke-static {v3}, Ll/۟ۜܿ;->ۧ(Ll/۟ۜܿ;)Ll/᩸᩷ܿ;

    move/from16 v3, p4

    .line 48
    iput v3, v0, Ll/᩺ܺܿ;->ۖ:I

    move/from16 v3, p5

    .line 49
    iput v3, v0, Ll/᩺ܺܿ;->ܺ:I

    move/from16 v3, p6

    .line 50
    iput v3, v0, Ll/᩺ܺܿ;->ۢ:I

    .line 56
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 57
    new-instance v4, Ljava/util/IdentityHashMap;

    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 58
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x0

    .line 59
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    array-length v2, v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v5, v2, :cond_8

    aget-object v11, v1, v5

    .line 61
    instance-of v12, v11, Ll/۫ܺܿ;

    if-eqz v12, :cond_1

    check-cast v11, Ll/۫ܺܿ;

    .line 62
    iget-object v12, v11, Ll/۫ܺܿ;->ܳ:Ll/ۨۘܽ;

    invoke-virtual {v12}, Ll/ۨۘܽ;->ܽ()Z

    move-result v12

    if-eqz v12, :cond_0

    const/4 v7, 0x0

    .line 63
    :cond_0
    iget-boolean v11, v11, Ll/۫ܺܿ;->ܿ:Z

    if-eqz v11, :cond_7

    const/4 v8, 0x0

    goto :goto_2

    .line 64
    :cond_1
    instance-of v12, v11, Ll/ۤܺܿ;

    if-eqz v12, :cond_7

    check-cast v11, Ll/ۤܺܿ;

    iget-object v12, v11, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    if-eqz v12, :cond_4

    .line 67
    iget-object v6, v12, Ll/۠ܺܿ;->ᩳ:[Ll/ܶۜܿ;

    array-length v13, v6

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v13, :cond_3

    aget-object v15, v6, v14

    if-eqz v15, :cond_2

    .line 68
    invoke-virtual {v4, v15}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_2

    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v15, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, p1

    goto :goto_1

    :cond_3
    const/4 v6, 0x1

    .line 74
    :cond_4
    iget-object v1, v11, Ll/ۤܺܿ;->᩷:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    if-nez v12, :cond_5

    iget-object v1, v11, Ll/ۤܺܿ;->ܽ:Ll/ۚܺܿ;

    iget-object v1, v1, Ll/ۚܺܿ;->ۧ:[I

    array-length v1, v1

    if-eqz v1, :cond_7

    :cond_5
    iget-boolean v1, v11, Ll/ۤܺܿ;->᩻:Z

    if-nez v1, :cond_6

    iget-boolean v11, v11, Ll/ۤܺܿ;->ۢ:Z

    if-eqz v11, :cond_6

    if-eqz v12, :cond_7

    :cond_6
    const/4 v9, 0x1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    const/4 v10, 0x1

    :cond_7
    :goto_2
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, p1

    goto :goto_0

    :cond_8
    const/4 v1, 0x0

    new-array v1, v1, [Ll/ܶۜܿ;

    .line 82
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ܶۜܿ;

    iput-object v1, v0, Ll/᩺ܺܿ;->ᩳ:[Ll/ܶۜܿ;

    .line 83
    iput-object v4, v0, Ll/᩺ܺܿ;->ܽ:Ljava/util/IdentityHashMap;

    .line 84
    iput-boolean v6, v0, Ll/᩺ܺܿ;->᩻:Z

    .line 86
    iput-boolean v7, v0, Ll/᩺ܺܿ;->ۘ:Z

    if-eqz v7, :cond_9

    if-eqz v8, :cond_9

    const/4 v1, 0x1

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    .line 88
    :goto_3
    iput-boolean v1, v0, Ll/᩺ܺܿ;->ۜ:Z

    .line 90
    iput-boolean v8, v0, Ll/᩺ܺܿ;->ܳ:Z

    if-eqz v7, :cond_a

    if-eqz v8, :cond_a

    if-eqz v9, :cond_a

    const/4 v1, 0x1

    goto :goto_4

    :cond_a
    const/4 v1, 0x0

    .line 92
    :goto_4
    iput-boolean v1, v0, Ll/᩺ܺܿ;->ۧ:Z

    if-eqz v1, :cond_b

    if-eqz v10, :cond_b

    const/4 v1, 0x1

    goto :goto_5

    :cond_b
    const/4 v1, 0x0

    .line 93
    :goto_5
    iput-boolean v1, v0, Ll/᩺ܺܿ;->֫:Z

    return-void
.end method

.method public static ֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
    .locals 3

    .line 600
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, ": "

    .line 0
    invoke-static {p1, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 600
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    iget-object v1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    if-nez v1, :cond_0

    const-string p0, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫([I[Ll/۟ۘܽ;)Ll/ۚܺܿ;
    .locals 5

    .line 392
    array-length v0, p0

    new-array v1, v0, [Ll/۟ۘܽ;

    .line 394
    sget-object v2, Ll/۟ۘܽ;->᩻:Ll/۟ۘܽ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 395
    aget v4, p0, v3

    aget-object v4, p1, v4

    aput-object v4, v1, v3

    .line 396
    invoke-virtual {v2, v4}, Ll/۟ۘܽ;->֫(Ll/۟ۘܽ;)Ll/۟ۘܽ;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 398
    :cond_0
    new-instance p1, Ll/ۚܺܿ;

    invoke-direct {p1, p0, v1, v2}, Ll/ۚܺܿ;-><init>([I[Ll/۟ۘܽ;Ll/۟ۘܽ;)V

    return-object p1
.end method

.method public static ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;
    .locals 34

    move-object/from16 v0, p0

    const-string v1, "language"

    .line 101
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    invoke-virtual/range {p0 .. p0}, Ll/ܶۜܿ;->᩵()V

    .line 103
    invoke-static/range {p0 .. p0}, Ll/ۜ᩷ܿ;->֫(Ll/ܶۜܿ;)Ll/ۧ᩷ܿ;

    move-result-object v1

    .line 104
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 105
    new-instance v3, Ljava/util/IdentityHashMap;

    invoke-direct {v3}, Ljava/util/IdentityHashMap;-><init>()V

    .line 106
    new-instance v4, Ljava/util/IdentityHashMap;

    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 107
    new-instance v5, Ll/֨ܺܿ;

    invoke-virtual/range {p0 .. p0}, Ll/ܶۜܿ;->ۖ()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    invoke-direct {v5, v0, v0, v6, v7}, Ll/֨ܺܿ;-><init>(Ll/ܶۜܿ;Ll/ۢܺܿ;Ljava/util/List;Ll/ܶܺܿ;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x0

    .line 108
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v0, v6}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x0

    .line 109
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-ge v6, v7, :cond_19

    .line 110
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֨ܺܿ;

    const/4 v10, 0x0

    .line 111
    :goto_1
    iget-object v11, v7, Ll/֨ܺܿ;->֫:[I

    array-length v11, v11

    if-ge v10, v11, :cond_18

    .line 112
    iget-object v11, v7, Ll/֨ܺܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۢܺܿ;

    .line 113
    invoke-virtual {v3, v11}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    if-nez v12, :cond_17

    .line 115
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 116
    invoke-virtual {v3, v11, v12}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    instance-of v13, v11, Ll/ܶۜܿ;

    if-eqz v13, :cond_0

    move-object v14, v11

    check-cast v14, Ll/ܶۜܿ;

    goto :goto_2

    :cond_0
    iget-object v14, v7, Ll/֨ܺܿ;->ܿ:Ll/ܶۜܿ;

    :goto_2
    if-eqz v13, :cond_1

    .line 427
    move-object v5, v11

    check-cast v5, Ll/ܶۜܿ;

    .line 428
    invoke-virtual {v5}, Ll/ܶۜܿ;->᩵()V

    .line 429
    invoke-virtual {v5}, Ll/ܶۜܿ;->ۖ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5

    goto/16 :goto_3

    .line 431
    :cond_1
    instance-of v13, v11, Ll/֡ۜܿ;

    if-eqz v13, :cond_2

    move-object v8, v11

    check-cast v8, Ll/֡ۜܿ;

    .line 433
    :try_start_0
    invoke-virtual {v8}, Ll/֡ۜܿ;->ۧ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14, v8}, Ll/ܶۜܿ;->ۧ(Ljava/lang/String;)Ll/ۢܺܿ;

    move-result-object v8

    .line 0
    new-array v13, v9, [Ljava/lang/Object;

    aput-object v8, v13, v5

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v5, v13, v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 433
    invoke-static {v5}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    .line 435
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 438
    :cond_2
    instance-of v15, v11, Ll/ۨ᩻ܿ;

    if-eqz v15, :cond_3

    move-object v8, v11

    check-cast v8, Ll/ۨ᩻ܿ;

    .line 440
    :try_start_1
    new-instance v13, Ll/ᩴܺܿ;

    invoke-direct {v13, v5}, Ll/ᩴܺܿ;-><init>(I)V

    invoke-static {v4, v14, v13}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    .line 442
    invoke-virtual {v8}, Ll/ۨ᩻ܿ;->ۧ()Ljava/lang/String;

    move-result-object v8

    const/4 v13, 0x0

    new-instance v15, Ll/᩵ܺܿ;

    invoke-direct {v15, v14}, Ll/᩵ܺܿ;-><init>(Ll/ܶۜܿ;)V

    invoke-static {v5, v8, v15}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۢܺܿ;

    .line 0
    new-array v8, v9, [Ljava/lang/Object;

    aput-object v5, v8, v13

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v8, v8, v13

    invoke-static {v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v5}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 444
    invoke-static {v5}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 446
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 449
    :cond_3
    instance-of v5, v11, Ll/ۖۜܿ;

    if-eqz v5, :cond_5

    move-object v5, v11

    check-cast v5, Ll/ۖۜܿ;

    .line 450
    invoke-virtual {v5}, Ll/ۖۜܿ;->ۧ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_4

    .line 453
    invoke-virtual {v5}, Ll/ۖۜܿ;->ۧ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5

    goto :goto_3

    :cond_4
    const-string v0, "Empty competition"

    .line 451
    invoke-static {v11, v0}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 455
    :cond_5
    instance-of v5, v11, Ll/᩵ۜܿ;

    if-eqz v5, :cond_7

    move-object v5, v11

    check-cast v5, Ll/᩵ۜܿ;

    .line 456
    invoke-virtual {v5}, Ll/᩵ۜܿ;->ܿ()I

    move-result v9

    if-ltz v9, :cond_6

    invoke-virtual {v5}, Ll/᩵ۜܿ;->ܿ()I

    move-result v9

    if-gt v9, v8, :cond_6

    .line 459
    invoke-virtual {v5}, Ll/᩵ۜܿ;->ۧ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5

    :goto_3
    move-object/from16 v17, v3

    move-object/from16 v25, v4

    goto/16 :goto_d

    :cond_6
    const-string v0, "Invalid group type"

    .line 457
    invoke-static {v5, v0}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 461
    :cond_7
    instance-of v5, v11, Ll/۠᩷ܿ;

    if-eqz v5, :cond_13

    move-object v5, v11

    check-cast v5, Ll/۠᩷ܿ;

    .line 462
    invoke-virtual {v5}, Ll/۠᩷ܿ;->ᩳ()Ll/֫ۜܿ;

    move-result-object v8

    const-string v9, "end"

    const-string v15, "start"

    if-eqz v8, :cond_12

    .line 465
    invoke-virtual {v8, v14}, Ll/֫ۜܿ;->֫(Ll/ܶۜܿ;)Ll/֫ۜܿ;

    move-result-object v8

    .line 466
    invoke-virtual {v8}, Ll/֫ۜܿ;->ۧ()I

    move-result v13

    .line 467
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܿ()Z

    move-result v17

    if-eqz v17, :cond_8

    invoke-virtual {v8}, Ll/֫ۜܿ;->ܽ()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_8

    move/from16 v22, v13

    goto :goto_4

    :cond_8
    const/16 v17, -0x1

    const/16 v22, -0x1

    .line 469
    :goto_4
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܿ()Z

    move-result v17

    if-eqz v17, :cond_a

    if-gez v22, :cond_9

    const/16 v17, 0x0

    goto :goto_5

    :cond_9
    const/16 v17, 0x1

    :goto_5
    add-int v17, v13, v17

    move/from16 v0, v17

    goto :goto_6

    :cond_a
    const/16 v17, 0x1

    const/4 v0, 0x1

    :goto_6
    move-object/from16 v17, v3

    .line 470
    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v25, v4

    add-int/lit8 v4, v0, 0x2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 471
    invoke-virtual {v5}, Ll/۠᩷ܿ;->ܺ()Ll/ۢܺܿ;

    move-result-object v4

    invoke-static {v4, v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    invoke-virtual {v5}, Ll/۠᩷ܿ;->᩻()Ll/ۢܺܿ;

    move-result-object v4

    invoke-static {v4, v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    new-array v4, v0, [Ll/ܶۜܿ;

    .line 474
    new-array v5, v0, [I

    .line 475
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_b

    new-array v9, v13, [Ljava/lang/String;

    goto :goto_7

    :cond_b
    const/4 v9, 0x0

    :goto_7
    move-object/from16 v21, v9

    const/4 v9, 0x0

    :goto_8
    if-ge v9, v0, :cond_10

    .line 477
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܿ()Z

    move-result v15

    if-eqz v15, :cond_d

    if-ge v9, v13, :cond_c

    .line 478
    invoke-virtual {v8, v9}, Ll/֫ۜܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_9

    :cond_c
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܽ()Ljava/lang/String;

    move-result-object v15

    goto :goto_9

    .line 479
    :cond_d
    invoke-virtual {v8}, Ll/֫ۜܿ;->ᩳ()Ljava/lang/String;

    move-result-object v15

    .line 480
    :goto_9
    invoke-static {v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v15}, Ll/ۧ᩷ܿ;->֫(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v15

    .line 481
    aput-object v15, v4, v9

    .line 482
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܿ()Z

    move-result v18

    if-eqz v18, :cond_e

    if-ge v9, v13, :cond_e

    invoke-virtual {v8, v9}, Ll/֫ۜܿ;->֫(I)Ljava/lang/String;

    move-result-object v18

    aput-object v18, v21, v9

    :cond_e
    if-nez v15, :cond_f

    const/16 v16, -0x1

    .line 484
    aput v16, v5, v9

    goto :goto_a

    :cond_f
    const/16 v16, -0x1

    .line 486
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v18

    aput v18, v5, v9

    .line 487
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    .line 490
    :cond_10
    new-instance v0, Ll/ܶܺܿ;

    .line 491
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-virtual {v8}, Ll/֫ۜܿ;->֫()I

    move-result v9

    move/from16 v19, v9

    goto :goto_b

    :cond_11
    const/4 v9, -0x1

    const/16 v19, -0x1

    .line 492
    :goto_b
    invoke-virtual {v8}, Ll/֫ۜܿ;->ܳ()Z

    move-result v20

    move-object/from16 v18, v0

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    invoke-direct/range {v18 .. v24}, Ll/ܶܺܿ;-><init>(IZ[Ljava/lang/String;I[Ll/ܶۜܿ;[I)V

    .line 493
    new-instance v5, Ll/ۙܺܿ;

    invoke-direct {v5, v3, v0}, Ll/ۙܺܿ;-><init>(Ljava/util/List;Ll/ܶܺܿ;)V

    goto/16 :goto_d

    :cond_12
    move-object/from16 v17, v3

    move-object/from16 v25, v4

    .line 495
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ll/۠᩷ܿ;->ܿ()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 496
    invoke-virtual {v5}, Ll/۠᩷ܿ;->ܺ()Ll/ۢܺܿ;

    move-result-object v3

    invoke-static {v3, v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    invoke-virtual {v5}, Ll/۠᩷ܿ;->᩻()Ll/ۢܺܿ;

    move-result-object v3

    invoke-static {v3, v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    invoke-virtual {v5}, Ll/۠᩷ܿ;->ܿ()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 499
    invoke-static {v0}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5

    goto :goto_d

    :cond_13
    move-object/from16 v17, v3

    move-object/from16 v25, v4

    .line 501
    instance-of v0, v11, Ll/֨᩷ܿ;

    if-eqz v0, :cond_15

    move-object v0, v11

    check-cast v0, Ll/֨᩷ܿ;

    .line 502
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/֨᩷ܿ;->ܳ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 503
    invoke-virtual {v0}, Ll/֨᩷ܿ;->ܳ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡܺܿ;

    .line 504
    invoke-virtual {v4}, Ll/ۡܺܿ;->ܽ()Ll/ۢܺܿ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 506
    :cond_14
    invoke-static {v3}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5

    goto :goto_d

    .line 508
    :cond_15
    instance-of v0, v11, Ll/ۘ᩷ܿ;

    if-eqz v0, :cond_16

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 509
    invoke-static {v0}, Ll/ۙܺܿ;->֫(Ljava/util/List;)Ll/ۙܺܿ;

    move-result-object v5

    .line 119
    :goto_d
    new-instance v0, Ll/֨ܺܿ;

    iget-object v3, v5, Ll/ۙܺܿ;->ۧ:Ljava/util/List;

    iget-object v4, v5, Ll/ۙܺܿ;->֫:Ll/ܶܺܿ;

    invoke-direct {v0, v14, v11, v3, v4}, Ll/֨ܺܿ;-><init>(Ll/ܶۜܿ;Ll/ۢܺܿ;Ljava/util/List;Ll/ܶܺܿ;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_16
    const-string v0, "Unknown syntax rule"

    .line 511
    invoke-static {v11, v0}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_17
    move-object/from16 v17, v3

    move-object/from16 v25, v4

    .line 121
    :goto_e
    iget-object v0, v7, Ll/֨ܺܿ;->֫:[I

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v0, v10

    add-int/lit8 v10, v10, 0x1

    const/4 v5, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, v17

    move-object/from16 v4, v25

    goto/16 :goto_1

    :cond_18
    move-object/from16 v17, v3

    move-object/from16 v25, v4

    add-int/lit8 v6, v6, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_19
    const/4 v0, 0x1

    .line 516
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [B

    .line 517
    new-instance v4, Ljava/util/ArrayDeque;

    invoke-direct {v4}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v5, 0x0

    .line 518
    :goto_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_21

    .line 519
    aget-byte v6, v3, v5

    if-eqz v6, :cond_1a

    goto :goto_13

    .line 522
    :cond_1a
    aput-byte v0, v3, v5

    .line 523
    new-instance v0, Ll/᩸ܺܿ;

    invoke-direct {v0, v5}, Ll/᩸ܺܿ;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 524
    :cond_1b
    :goto_10
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    .line 525
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ܺܿ;

    .line 526
    iget v6, v0, Ll/᩸ܺܿ;->֫:I

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֨ܺܿ;

    .line 527
    iget-object v7, v6, Ll/֨ܺܿ;->ۧ:Ll/ܶܺܿ;

    iget-object v8, v6, Ll/֨ܺܿ;->֫:[I

    if-nez v7, :cond_1c

    array-length v7, v8

    goto :goto_11

    :cond_1c
    array-length v7, v8

    const/4 v9, 0x2

    invoke-static {v9, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 528
    :goto_11
    iget-object v6, v6, Ll/֨ܺܿ;->ܽ:Ll/ۢܺܿ;

    instance-of v6, v6, Ll/֡ۜܿ;

    if-nez v6, :cond_1f

    iget v6, v0, Ll/᩸ܺܿ;->ۧ:I

    if-ne v6, v7, :cond_1d

    goto :goto_12

    :cond_1d
    add-int/lit8 v7, v6, 0x1

    .line 533
    iput v7, v0, Ll/᩸ܺܿ;->ۧ:I

    aget v0, v8, v6

    .line 534
    aget-byte v6, v3, v0

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1e

    if-nez v6, :cond_1b

    .line 538
    aput-byte v7, v3, v0

    .line 539
    new-instance v6, Ll/᩸ܺܿ;

    invoke-direct {v6, v0}, Ll/᩸ܺܿ;-><init>(I)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_10

    .line 535
    :cond_1e
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ܺܿ;

    iget-object v0, v0, Ll/֨ܺܿ;->ܽ:Ll/ۢܺܿ;

    const-string v1, "Cyclic eager syntax structure"

    invoke-static {v0, v1}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 529
    :cond_1f
    :goto_12
    iget v0, v0, Ll/᩸ܺܿ;->֫:I

    const/4 v6, 0x2

    aput-byte v6, v3, v0

    .line 530
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_10

    :cond_20
    :goto_13
    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x1

    goto :goto_f

    .line 547
    :cond_21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v3, v0, [Ll/۟ۘܽ;

    .line 548
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [B

    const/4 v5, 0x0

    :goto_14
    if-ge v5, v0, :cond_24

    .line 550
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֨ܺܿ;

    iget-object v6, v6, Ll/֨ܺܿ;->ܽ:Ll/ۢܺܿ;

    .line 551
    instance-of v7, v6, Ll/֨᩷ܿ;

    if-eqz v7, :cond_22

    check-cast v6, Ll/֨᩷ܿ;

    .line 552
    invoke-virtual {v6}, Ll/֨᩷ܿ;->ܽ()Ll/ۚ᩷ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۚ᩷ܿ;->ᩳ()Ll/۟ۘܽ;

    move-result-object v6

    aput-object v6, v3, v5

    const/4 v6, 0x2

    .line 553
    aput-byte v6, v4, v5

    goto :goto_15

    :cond_22
    const/4 v7, 0x2

    .line 554
    instance-of v8, v6, Ll/ۘ᩷ܿ;

    if-eqz v8, :cond_23

    check-cast v6, Ll/ۘ᩷ܿ;

    .line 555
    invoke-virtual {v6}, Ll/ۘ᩷ܿ;->ᩳ()Ll/ۖ᩷ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۖ᩷ܿ;->ܿ()Ll/۟ۘܽ;

    move-result-object v6

    aput-object v6, v3, v5

    .line 556
    aput-byte v7, v4, v5

    :cond_23
    :goto_15
    add-int/lit8 v5, v5, 0x1

    goto :goto_14

    .line 559
    :cond_24
    new-instance v5, Ljava/util/ArrayDeque;

    invoke-direct {v5}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v6, 0x0

    :goto_16
    if-ge v6, v0, :cond_2d

    .line 561
    aget-byte v7, v4, v6

    if-eqz v7, :cond_25

    goto/16 :goto_1a

    :cond_25
    const/4 v7, 0x1

    .line 564
    aput-byte v7, v4, v6

    .line 565
    new-instance v7, Ll/᩸ܺܿ;

    invoke-direct {v7, v6}, Ll/᩸ܺܿ;-><init>(I)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 566
    :goto_17
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_2c

    .line 567
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩸ܺܿ;

    .line 568
    iget v8, v7, Ll/᩸ܺܿ;->֫:I

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֨ܺܿ;

    .line 569
    iget-object v9, v8, Ll/֨ܺܿ;->֫:[I

    array-length v9, v9

    .line 570
    iget-object v10, v8, Ll/֨ܺܿ;->ܽ:Ll/ۢܺܿ;

    instance-of v11, v10, Ll/۠᩷ܿ;

    if-nez v11, :cond_26

    .line 571
    instance-of v11, v10, Ll/᩵ۜܿ;

    if-eqz v11, :cond_27

    check-cast v10, Ll/᩵ۜܿ;

    invoke-virtual {v10}, Ll/᩵ۜܿ;->ܿ()I

    move-result v10

    const/4 v11, 0x2

    if-eq v10, v11, :cond_27

    :cond_26
    const/4 v10, 0x1

    .line 572
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 574
    :cond_27
    iget v10, v7, Ll/᩸ܺܿ;->ۧ:I

    if-eq v10, v9, :cond_2b

    iget-object v9, v7, Ll/᩸ܺܿ;->ܽ:Ll/۟ۘܽ;

    invoke-virtual {v9}, Ll/۟ۘܽ;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_28

    goto :goto_19

    .line 580
    :cond_28
    iget-object v8, v8, Ll/֨ܺܿ;->֫:[I

    iget v9, v7, Ll/᩸ܺܿ;->ۧ:I

    aget v8, v8, v9

    .line 581
    aget-byte v10, v4, v8

    if-nez v10, :cond_29

    const/4 v7, 0x1

    .line 582
    aput-byte v7, v4, v8

    .line 583
    new-instance v7, Ll/᩸ܺܿ;

    invoke-direct {v7, v8}, Ll/᩸ܺܿ;-><init>(I)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_17

    :cond_29
    const/4 v11, 0x1

    add-int/lit8 v9, v9, 0x1

    .line 585
    iput v9, v7, Ll/᩸ܺܿ;->ۧ:I

    .line 586
    iget-object v9, v7, Ll/᩸ܺܿ;->ܽ:Ll/۟ۘܽ;

    if-ne v10, v11, :cond_2a

    sget-object v8, Ll/۟ۘܽ;->ۜ:Ll/۟ۘܽ;

    goto :goto_18

    :cond_2a
    aget-object v8, v3, v8

    :goto_18
    invoke-virtual {v9, v8}, Ll/۟ۘܽ;->֫(Ll/۟ۘܽ;)Ll/۟ۘܽ;

    move-result-object v8

    iput-object v8, v7, Ll/᩸ܺܿ;->ܽ:Ll/۟ۘܽ;

    goto :goto_17

    .line 575
    :cond_2b
    :goto_19
    iget v8, v7, Ll/᩸ܺܿ;->֫:I

    iget-object v7, v7, Ll/᩸ܺܿ;->ܽ:Ll/۟ۘܽ;

    aput-object v7, v3, v8

    const/4 v7, 0x2

    .line 576
    aput-byte v7, v4, v8

    .line 577
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_17

    :cond_2c
    :goto_1a
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_16

    .line 127
    :cond_2d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v4, v0, [Ll/᩶ܺܿ;

    const/4 v5, 0x0

    :goto_1b
    if-ge v5, v0, :cond_4f

    .line 129
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֨ܺܿ;

    aget-object v15, v3, v5

    .line 280
    iget-object v7, v6, Ll/֨ܺܿ;->ܿ:Ll/ܶۜܿ;

    iget-object v8, v6, Ll/֨ܺܿ;->ۧ:Ll/ܶܺܿ;

    iget-object v9, v6, Ll/֨ܺܿ;->֫:[I

    .line 281
    iget-object v6, v6, Ll/֨ܺܿ;->ܽ:Ll/ۢܺܿ;

    .line 282
    instance-of v10, v6, Ll/֨᩷ܿ;

    if-eqz v10, :cond_34

    check-cast v6, Ll/֨᩷ܿ;

    .line 283
    invoke-virtual {v6}, Ll/֨᩷ܿ;->ܿ()Ljava/util/List;

    move-result-object v8

    .line 284
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    new-array v13, v10, [I

    .line 285
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    new-array v14, v10, [Ll/᩸᩷ܿ;

    .line 286
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    new-array v15, v10, [Ll/ۡۜܿ;

    const/4 v10, 0x0

    .line 287
    :goto_1c
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    if-ge v10, v11, :cond_30

    .line 288
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۗ᩷ܿ;

    .line 289
    iget v12, v11, Ll/ۗ᩷ܿ;->᩹:I

    aput v12, v13, v10

    .line 290
    iget-object v12, v11, Ll/ۗ᩷ܿ;->ۙ:Ljava/lang/String;

    move/from16 v20, v0

    const-string v0, "parseColor("

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 291
    invoke-virtual {v11}, Ll/ۗ᩷ܿ;->֫()Ll/ۡۜܿ;

    move-result-object v0

    aput-object v0, v15, v10

    .line 292
    invoke-virtual {v0}, Ll/ۡۜܿ;->ܽ()I

    move-result v0

    if-nez v0, :cond_2e

    .line 595
    sget-object v0, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    goto :goto_1d

    :cond_2e
    invoke-virtual {v7, v0}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v0

    .line 292
    :goto_1d
    aput-object v0, v14, v10

    goto :goto_1e

    .line 295
    :cond_2f
    iget v0, v11, Ll/ۗ᩷ܿ;->᩶:I

    invoke-virtual {v7, v0}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v0

    aput-object v0, v14, v10

    :goto_1e
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v20

    goto :goto_1c

    :cond_30
    move/from16 v20, v0

    .line 298
    new-instance v0, Ll/۫ܺܿ;

    invoke-virtual {v6}, Ll/֨᩷ܿ;->ܽ()Ll/ۚ᩷ܿ;

    move-result-object v12

    .line 403
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 404
    invoke-virtual {v6}, Ll/֨᩷ܿ;->ܳ()Ljava/util/List;

    move-result-object v10

    const/4 v11, 0x0

    move-object/from16 v21, v1

    .line 405
    :goto_1f
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    if-ge v11, v1, :cond_31

    .line 406
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡܺܿ;

    invoke-virtual {v1}, Ll/ۡܺܿ;->֫()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v16, v10

    new-instance v10, Ll/֡ܺܿ;

    move-object/from16 v22, v2

    const/4 v2, 0x0

    invoke-direct {v10, v2}, Ll/֡ܺܿ;-><init>(I)V

    invoke-static {v8, v1, v10}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    aget v2, v9, v11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v10, v16

    move-object/from16 v2, v22

    goto :goto_1f

    :cond_31
    move-object/from16 v22, v2

    .line 408
    invoke-interface {v8}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Ll/ۨܺܿ;

    .line 411
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_33

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 412
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    move-object/from16 v16, v2

    new-array v2, v11, [I

    const/16 v17, 0x0

    move-object/from16 v23, v4

    const/4 v4, 0x0

    :goto_21
    if-ge v4, v11, :cond_32

    .line 414
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v17

    move/from16 v24, v5

    move-object/from16 v5, v17

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    move/from16 v5, v24

    goto :goto_21

    :cond_32
    move/from16 v24, v5

    add-int/lit8 v4, v8, 0x1

    .line 416
    new-instance v5, Ll/ۨܺܿ;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-direct {v5, v10, v9, v2}, Ll/ۨܺܿ;-><init>(II[I)V

    aput-object v5, v1, v8

    add-int/2addr v9, v11

    move v8, v4

    move-object/from16 v2, v16

    move-object/from16 v4, v23

    move/from16 v5, v24

    goto :goto_20

    :cond_33
    move-object/from16 v23, v4

    move/from16 v24, v5

    .line 299
    invoke-virtual {v6}, Ll/֨᩷ܿ;->᩻()Z

    move-result v17

    .line 1172
    invoke-virtual {v7}, Ll/ܶۜܿ;->᩻()Ll/۟ۜܿ;

    move-result-object v2

    invoke-static {v2}, Ll/۟ۜܿ;->ۧ(Ll/۟ۜܿ;)Ll/᩸᩷ܿ;

    move-result-object v18

    move-object v11, v0

    move-object/from16 v16, v1

    .line 300
    invoke-direct/range {v11 .. v18}, Ll/۫ܺܿ;-><init>(Ll/ۚ᩷ܿ;[I[Ll/᩸᩷ܿ;[Ll/ۡۜܿ;[Ll/ۨܺܿ;ZLl/᩸᩷ܿ;)V

    goto/16 :goto_35

    :cond_34
    move/from16 v20, v0

    move-object/from16 v21, v1

    move-object/from16 v22, v2

    move-object/from16 v23, v4

    move/from16 v24, v5

    .line 302
    instance-of v0, v6, Ll/ۘ᩷ܿ;

    if-eqz v0, :cond_35

    check-cast v6, Ll/ۘ᩷ܿ;

    .line 303
    new-instance v0, Ll/ۗܺܿ;

    invoke-virtual {v6}, Ll/ۘ᩷ܿ;->ᩳ()Ll/ۖ᩷ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖ᩷ܿ;->֫()Ll/ۖ᩷ܿ;

    move-result-object v1

    .line 304
    invoke-virtual {v6}, Ll/ۘ᩷ܿ;->ۧ()I

    move-result v2

    invoke-virtual {v7, v2}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۗܺܿ;-><init>(Ll/ۖ᩷ܿ;Ll/᩸᩷ܿ;)V

    goto/16 :goto_35

    .line 306
    :cond_35
    instance-of v0, v6, Ll/֡ۜܿ;

    if-nez v0, :cond_4e

    instance-of v1, v6, Ll/ۨ᩻ܿ;

    if-eqz v1, :cond_36

    goto/16 :goto_33

    .line 309
    :cond_36
    instance-of v0, v6, Ll/᩵ۜܿ;

    if-eqz v0, :cond_38

    check-cast v6, Ll/᩵ۜܿ;

    .line 310
    invoke-virtual {v6}, Ll/᩵ۜܿ;->ܿ()I

    move-result v0

    .line 311
    new-instance v1, Ll/᩹ܺܿ;

    invoke-virtual {v6}, Ll/᩵ۜܿ;->ܽ()I

    move-result v2

    if-nez v2, :cond_37

    .line 595
    sget-object v2, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    goto :goto_22

    :cond_37
    invoke-virtual {v7, v2}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v2

    .line 311
    :goto_22
    invoke-direct {v1, v0, v9, v2, v15}, Ll/᩹ܺܿ;-><init>(I[ILl/᩸᩷ܿ;Ll/۟ۘܽ;)V

    goto/16 :goto_34

    .line 313
    :cond_38
    instance-of v0, v6, Ll/۠᩷ܿ;

    if-eqz v0, :cond_4d

    check-cast v6, Ll/۠᩷ܿ;

    if-nez v8, :cond_39

    .line 314
    array-length v0, v9

    add-int/lit8 v0, v0, -0x2

    goto :goto_23

    :cond_39
    const/4 v0, 0x0

    .line 315
    :goto_23
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ۖ()Z

    move-result v13

    if-nez v8, :cond_3a

    move v1, v0

    goto :goto_24

    :cond_3a
    const/4 v1, 0x1

    .line 317
    :goto_24
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ۜ()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-nez v8, :cond_3b

    xor-int/lit8 v2, v13, 0x1

    add-int/2addr v0, v2

    goto :goto_25

    :cond_3b
    const/4 v0, 0x0

    .line 318
    :goto_25
    new-array v2, v0, [I

    const/4 v4, 0x2

    const/4 v5, 0x0

    :goto_26
    if-ge v5, v0, :cond_3d

    if-nez v13, :cond_3c

    if-ne v5, v1, :cond_3c

    const/4 v10, 0x1

    .line 320
    aget v10, v9, v10

    goto :goto_27

    :cond_3c
    add-int/lit8 v10, v4, 0x1

    aget v4, v9, v4

    move/from16 v33, v10

    move v10, v4

    move/from16 v4, v33

    :goto_27
    aput v10, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_26

    .line 322
    :cond_3d
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ܳ()I

    move-result v0

    if-nez v0, :cond_3e

    .line 595
    sget-object v0, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    goto :goto_28

    :cond_3e
    invoke-virtual {v7, v0}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v0

    :goto_28
    move-object v11, v0

    .line 323
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ܽ()I

    move-result v0

    if-nez v0, :cond_3f

    move-object v12, v11

    goto :goto_29

    .line 324
    :cond_3f
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ܽ()I

    move-result v0

    invoke-virtual {v7, v0}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v0

    move-object v12, v0

    .line 325
    :goto_29
    invoke-virtual {v6}, Ll/۠᩷ܿ;->᩷()Ljava/util/BitSet;

    move-result-object v0

    if-nez v8, :cond_40

    const/4 v4, 0x0

    move-object/from16 v17, v15

    goto/16 :goto_2d

    .line 339
    :cond_40
    iget-object v4, v8, Ll/ܶܺܿ;->ܳ:[Ll/ܶۜܿ;

    .line 340
    array-length v5, v4

    .line 341
    new-array v10, v5, [I

    .line 342
    new-array v14, v5, [Ll/ܶۜܿ;

    const/16 v16, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    :goto_2a
    if-ge v15, v5, :cond_42

    move/from16 v16, v5

    .line 344
    iget-object v5, v8, Ll/ܶܺܿ;->ۧ:[I

    aget v5, v5, v15

    if-gez v5, :cond_41

    const/4 v5, -0x1

    goto :goto_2b

    .line 345
    :cond_41
    aget v5, v9, v5

    :goto_2b
    aput v5, v10, v15

    .line 346
    aget-object v5, v4, v15

    aput-object v5, v14, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v5, v16

    goto :goto_2a

    .line 348
    :cond_42
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ۡ()I

    move-result v4

    if-nez v4, :cond_45

    .line 350
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ܽ()I

    move-result v4

    if-nez v4, :cond_44

    .line 351
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ܳ()I

    move-result v4

    if-nez v4, :cond_43

    .line 595
    sget-object v4, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    goto :goto_2c

    :cond_43
    invoke-virtual {v7, v4}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v4

    goto :goto_2c

    .line 352
    :cond_44
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ܽ()I

    move-result v4

    invoke-virtual {v7, v4}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v4

    goto :goto_2c

    .line 353
    :cond_45
    invoke-virtual {v7, v4}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v4

    :goto_2c
    move-object/from16 v32, v4

    .line 354
    new-instance v4, Ll/۠ܺܿ;

    iget v5, v8, Ll/ܶܺܿ;->֫:I

    iget-boolean v7, v8, Ll/ܶܺܿ;->ᩳ:Z

    iget-object v15, v8, Ll/ܶܺܿ;->ܿ:[Ljava/lang/String;

    iget v8, v8, Ll/ܶܺܿ;->ܽ:I

    move-object/from16 v25, v4

    move/from16 v26, v5

    move/from16 v27, v7

    move-object/from16 v28, v15

    move/from16 v29, v8

    move-object/from16 v30, v10

    move-object/from16 v31, v14

    invoke-direct/range {v25 .. v32}, Ll/۠ܺܿ;-><init>(IZ[Ljava/lang/String;I[I[Ll/ܶۜܿ;Ll/᩸᩷ܿ;)V

    .line 362
    :goto_2d
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ܺ()Ll/ۢܺܿ;

    move-result-object v5

    instance-of v7, v5, Ll/֨᩷ܿ;

    if-eqz v7, :cond_4b

    check-cast v5, Ll/֨᩷ܿ;

    .line 363
    invoke-virtual {v5}, Ll/֨᩷ܿ;->ۧ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_46

    goto/16 :goto_30

    .line 366
    :cond_46
    invoke-virtual {v6}, Ll/۠᩷ܿ;->᩻()Ll/ۢܺܿ;

    move-result-object v7

    instance-of v8, v7, Ll/֨᩷ܿ;

    if-eqz v8, :cond_4a

    check-cast v7, Ll/֨᩷ܿ;

    .line 369
    invoke-virtual {v5}, Ll/֨᩷ܿ;->ۧ()Ljava/util/List;

    move-result-object v5

    .line 370
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    new-array v8, v8, [I

    .line 371
    new-instance v10, Ljava/util/HashMap;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v14

    mul-int/lit8 v14, v14, 0x2

    invoke-direct {v10, v14}, Ljava/util/HashMap;-><init>(I)V

    const/4 v14, 0x0

    .line 372
    :goto_2e
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v15

    if-ge v14, v15, :cond_47

    .line 373
    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/᩺᩻ܿ;

    .line 374
    invoke-virtual {v15}, Ll/᩺᩻ܿ;->֫()I

    move-result v16

    aput v16, v8, v14

    .line 375
    invoke-virtual {v15}, Ll/᩺᩻ܿ;->ܽ()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v10, v15, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v5, v16

    goto :goto_2e

    .line 377
    :cond_47
    invoke-virtual {v7}, Ll/֨᩷ܿ;->ܽ()Ll/ۚ᩷ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۚ᩷ܿ;->ܿ()Ljava/util/List;

    move-result-object v5

    .line 378
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v14

    new-array v15, v14, [I

    const/16 v16, 0x0

    move-object/from16 v18, v4

    const/4 v4, 0x0

    :goto_2f
    if-ge v4, v14, :cond_49

    .line 380
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v19, v5

    move-object/from16 v5, v16

    check-cast v5, Ljava/lang/String;

    .line 381
    invoke-virtual {v10, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Integer;

    if-eqz v16, :cond_48

    .line 385
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aput v5, v15, v4

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v5, v19

    goto :goto_2f

    :cond_48
    const-string v0, "Undefined scope variable: "

    .line 0
    invoke-static {v0, v5}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 383
    invoke-static {v6, v0}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 387
    :cond_49
    new-instance v4, Ll/ۛܺܿ;

    invoke-virtual {v7}, Ll/֨᩷ܿ;->ܽ()Ll/ۚ᩷ܿ;

    move-result-object v5

    invoke-direct {v4, v8, v15, v5}, Ll/ۛܺܿ;-><init>([I[ILl/ۚ᩷ܿ;)V

    goto :goto_31

    :cond_4a
    const-string v0, "start exports require a direct end match"

    .line 367
    invoke-static {v6, v0}, Ll/᩺ܺܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_4b
    :goto_30
    move-object/from16 v18, v4

    const/4 v4, 0x0

    .line 329
    :goto_31
    new-instance v5, Ll/ۤܺܿ;

    const/4 v7, 0x0

    aget v8, v9, v7

    const/4 v7, 0x1

    aget v9, v9, v7

    invoke-static {v2, v3}, Ll/᩺ܺܿ;->֫([I[Ll/۟ۘܽ;)Ll/ۚܺܿ;

    move-result-object v10

    .line 330
    invoke-virtual {v6}, Ll/۠᩷ܿ;->ۘ()Z

    move-result v14

    if-nez v0, :cond_4c

    .line 331
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    goto :goto_32

    :cond_4c
    invoke-virtual {v0}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/BitSet;

    :goto_32
    move-object/from16 v16, v0

    move-object v7, v5

    move-object/from16 v2, v17

    move v15, v1

    move-object/from16 v17, v18

    move-object/from16 v18, v4

    move-object/from16 v19, v2

    invoke-direct/range {v7 .. v19}, Ll/ۤܺܿ;-><init>(IILl/ۚܺܿ;Ll/᩸᩷ܿ;Ll/᩸᩷ܿ;ZZILjava/util/BitSet;Ll/۠ܺܿ;Ll/ۛܺܿ;Ll/۟ۘܽ;)V

    move-object v0, v5

    goto :goto_35

    .line 334
    :cond_4d
    invoke-static {v9, v3}, Ll/᩺ܺܿ;->֫([I[Ll/۟ۘܽ;)Ll/ۚܺܿ;

    move-result-object v0

    goto :goto_35

    :cond_4e
    :goto_33
    move-object v2, v15

    .line 307
    new-instance v1, Ll/۬ܺܿ;

    const/4 v4, 0x0

    aget v4, v9, v4

    invoke-direct {v1, v4, v0, v2}, Ll/۬ܺܿ;-><init>(IZLl/۟ۘܽ;)V

    :goto_34
    move-object v0, v1

    .line 129
    :goto_35
    aput-object v0, v23, v24

    add-int/lit8 v5, v24, 0x1

    move/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v4, v23

    goto/16 :goto_1b

    :cond_4f
    move-object/from16 v21, v1

    move-object/from16 v22, v2

    move-object/from16 v23, v4

    .line 132
    new-instance v0, Ll/᩺ܺܿ;

    invoke-virtual/range {p0 .. p0}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v4

    const/16 v1, 0x40

    .line 133
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 143
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_50
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_51

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ܺܿ;

    .line 144
    iget-object v2, v2, Ll/֨ܺܿ;->ۧ:Ll/ܶܺܿ;

    if-eqz v2, :cond_50

    const/4 v1, 0x1

    goto :goto_36

    :cond_51
    const/4 v1, 0x0

    .line 149
    :goto_36
    invoke-virtual/range {p0 .. p0}, Ll/ܶۜܿ;->hashCode()I

    move-result v2

    if-nez v1, :cond_53

    :cond_52
    move v6, v2

    goto :goto_3a

    :cond_53
    mul-int/lit8 v2, v2, 0x1f

    const v1, 0x454d4244

    add-int/2addr v2, v1

    .line 152
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_54
    :goto_37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_52

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ܺܿ;

    .line 153
    iget-object v3, v3, Ll/֨ܺܿ;->ۧ:Ll/ܶܺܿ;

    if-nez v3, :cond_55

    goto :goto_37

    :cond_55
    mul-int/lit8 v2, v2, 0x1f

    .line 154
    iget-object v3, v3, Ll/ܶܺܿ;->ܳ:[Ll/ܶۜܿ;

    array-length v6, v3

    add-int/2addr v2, v6

    .line 155
    array-length v6, v3

    const/4 v7, 0x0

    :goto_38
    if-ge v7, v6, :cond_54

    aget-object v8, v3, v7

    mul-int/lit8 v2, v2, 0x1f

    if-nez v8, :cond_56

    const/4 v9, 0x0

    goto :goto_39

    :cond_56
    const/4 v9, 0x1

    :goto_39
    add-int/2addr v2, v9

    if-eqz v8, :cond_57

    mul-int/lit8 v2, v2, 0x1f

    .line 157
    invoke-virtual {v8}, Ll/ܶۜܿ;->hashCode()I

    move-result v8

    add-int/2addr v8, v2

    move v2, v8

    :cond_57
    add-int/lit8 v7, v7, 0x1

    goto :goto_38

    .line 134
    :goto_3a
    invoke-virtual/range {v21 .. v21}, Ll/ۧ᩷ܿ;->֫()I

    move-result v7

    move-object v1, v0

    move-object/from16 v2, v23

    move-object/from16 v3, p0

    invoke-direct/range {v1 .. v7}, Ll/᩺ܺܿ;-><init>([Ll/᩶ܺܿ;Ll/ܶۜܿ;Ll/᩸᩷ܿ;III)V

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 180
    iget-object v0, p0, Ll/᩺ܺܿ;->ᩳ:[Ll/ܶۜܿ;

    array-length v0, v0

    return v0
.end method

.method public final ֫(Ll/ܶۜܿ;)I
    .locals 1

    .line 190
    iget-object v0, p0, Ll/᩺ܺܿ;->ܽ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 191
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)Ll/ۗۢܿ;
    .locals 2

    .line 199
    new-instance v0, Ll/ۗۢܿ;

    const-string v1, "text"

    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 200
    invoke-direct {v0, p0, p1, p2}, Ll/ۗۢܿ;-><init>(Ll/᩺ܺܿ;Ljava/lang/CharSequence;Ll/ܿۖ᩷;)V

    return-object v0
.end method

.method public final ֫(I)Ll/ܶۜܿ;
    .locals 2

    .line 185
    iget-object v0, p0, Ll/᩺ܺܿ;->ᩳ:[Ll/ܶۜܿ;

    array-length v1, v0

    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۜ()Z
    .locals 1

    .line 216
    iget-boolean v0, p0, Ll/᩺ܺܿ;->ۜ:Z

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 175
    iget-boolean v0, p0, Ll/᩺ܺܿ;->᩻:Z

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 231
    iget-boolean v0, p0, Ll/᩺ܺܿ;->ۧ:Z

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Ll/᩺ܺܿ;->᩻:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/᩺ܺܿ;->ۢ:I

    invoke-static {v0}, Ll/ۜ᩷ܿ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 236
    iget-boolean v0, p0, Ll/᩺ܺܿ;->֫:Z

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 165
    iget v0, p0, Ll/᩺ܺܿ;->ܺ:I

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 211
    iget-boolean v0, p0, Ll/᩺ܺܿ;->ۘ:Z

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 226
    iget-boolean v0, p0, Ll/᩺ܺܿ;->ܳ:Z

    return v0
.end method
