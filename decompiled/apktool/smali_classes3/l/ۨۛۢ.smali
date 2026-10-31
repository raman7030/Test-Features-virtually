.class public final Ll/ۨۛۢ;
.super Ljava/lang/Object;
.source "66ND"


# instance fields
.field public final ֫:[Z

.field public final ۖ:[Z

.field public final ۘ:Ljava/util/List;

.field public final ۜ:[Z

.field public final ۡ:I

.field public final ۢ:Ljava/lang/CharSequence;

.field public final ۧ:Ll/ۙۛۢ;

.field public final ܳ:Ljava/lang/String;

.field public final ܺ:[Z

.field public final ܽ:[Z

.field public final ܿ:[I

.field public final ᩳ:[I

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:[Z

.field public final ᩻:[Z


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/util/List;Ll/ۡۛۢ;Ll/ۗ᩶ۢ;Ljava/lang/String;Ll/ۙۛۢ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 29
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p1

    .line 30
    iput-object v2, v0, Ll/ۨۛۢ;->ۢ:Ljava/lang/CharSequence;

    move-object/from16 v2, p2

    .line 31
    iput-object v2, v0, Ll/ۨۛۢ;->ۘ:Ljava/util/List;

    move-object/from16 v3, p6

    .line 32
    iput-object v3, v0, Ll/ۨۛۢ;->ۧ:Ll/ۙۛۢ;

    .line 33
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [I

    iput-object v3, v0, Ll/ۨۛۢ;->ᩳ:[I

    .line 34
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [I

    iput-object v3, v0, Ll/ۨۛۢ;->ܿ:[I

    .line 35
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Z

    iput-object v3, v0, Ll/ۨۛۢ;->֫:[Z

    .line 36
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Z

    iput-object v3, v0, Ll/ۨۛۢ;->ۖ:[Z

    .line 37
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Z

    iput-object v3, v0, Ll/ۨۛۢ;->ܺ:[Z

    .line 38
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Z

    iput-object v3, v0, Ll/ۨۛۢ;->᩻:[Z

    .line 39
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Z

    iput-object v3, v0, Ll/ۨۛۢ;->᩷:[Z

    .line 40
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Z

    iput-object v3, v0, Ll/ۨۛۢ;->ۜ:[Z

    .line 41
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Z

    iput-object v2, v0, Ll/ۨۛۢ;->ܽ:[Z

    const/16 v2, 0x10

    .line 42
    invoke-virtual/range {p4 .. p4}, Ll/ۗ᩶ۢ;->֫()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Ll/ۨۛۢ;->ۡ:I

    .line 43
    invoke-virtual/range {p4 .. p4}, Ll/ۗ᩶ۢ;->ۧ()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    const-string v2, "\t"

    goto :goto_1

    :cond_0
    if-ltz v2, :cond_27

    if-eqz v2, :cond_4

    const-string v4, " "

    if-ne v2, v3, :cond_1

    move-object v2, v4

    goto :goto_1

    :cond_1
    const v6, 0x7fffffff

    .line 0
    div-int/2addr v6, v2

    if-gt v3, v6, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v3, "Repeating 1 bytes String "

    const-string v4, " times will produce a String exceeding maximum size."

    invoke-static {v2, v3, v4}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    const-string v2, ""

    .line 43
    :goto_1
    iput-object v2, v0, Ll/ۨۛۢ;->ᩴ:Ljava/lang/String;

    move-object/from16 v2, p5

    .line 44
    iput-object v2, v0, Ll/ۨۛۢ;->ܳ:Ljava/lang/String;

    .line 64
    iget-object v2, v0, Ll/ۨۛۢ;->᩷:[Z

    iget-object v3, v0, Ll/ۨۛۢ;->ܺ:[Z

    iget-object v4, v0, Ll/ۨۛۢ;->ᩳ:[I

    iget-object v6, v0, Ll/ۨۛۢ;->֫:[Z

    iget-object v7, v0, Ll/ۨۛۢ;->ۧ:Ll/ۙۛۢ;

    iget-object v8, v0, Ll/ۨۛۢ;->ۖ:[Z

    iget-object v9, v0, Ll/ۨۛۢ;->ۘ:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    new-array v10, v10, [I

    .line 65
    new-instance v11, Ljava/util/ArrayDeque;

    invoke-direct {v11}, Ljava/util/ArrayDeque;-><init>()V

    .line 66
    new-instance v12, Ll/ۛۛۢ;

    invoke-direct {v12, v1, v5, v5}, Ll/ۛۛۢ;-><init>(Ll/ۡܳ֡;IZ)V

    invoke-virtual {v11, v12}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 67
    :goto_2
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1e

    .line 68
    invoke-virtual {v7}, Ll/ۙۛۢ;->֫()V

    .line 69
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛۛۢ;

    .line 70
    invoke-static {v5}, Ll/ۛۛۢ;->֫(Ll/ۛۛۢ;)Ll/ۡܳ֡;

    move-result-object v12

    .line 71
    invoke-virtual {v12}, Ll/᩵ܳ֡;->ۧ()I

    move-result v13

    const/16 v14, 0x12

    if-ne v13, v14, :cond_5

    .line 74
    iget-object v14, v0, Ll/ۨۛۢ;->ܿ:[I

    iget-object v15, v12, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v15}, Ll/֡ܳ֡;->ܽ()I

    move-result v15

    iget-object v1, v12, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->ܿ()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    aput v1, v14, v15

    :cond_5
    const/4 v1, 0x3

    const/4 v14, 0x6

    if-eq v13, v1, :cond_6

    if-ne v13, v14, :cond_7

    .line 77
    :cond_6
    iget-object v1, v12, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/4 v14, 0x1

    if-eq v1, v14, :cond_7

    iget-object v1, v12, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->ܽ()I

    move-result v1

    aput-boolean v14, v6, v1

    :cond_7
    const/4 v1, 0x1

    const/4 v14, 0x5

    if-ne v13, v14, :cond_9

    .line 79
    invoke-virtual {v12}, Ll/ۡܳ֡;->getChildCount()I

    move-result v14

    if-lez v14, :cond_9

    .line 80
    invoke-virtual {v12, v1}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v1

    invoke-interface {v1}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v14, "const"

    .line 81
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    const-string v14, "close"

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    goto :goto_3

    .line 82
    :cond_8
    new-instance v2, Ll/֡ۤۢ;

    sget-object v3, Ll/᩵ۤۢ;->ۙ:Ll/᩵ۤۢ;

    iget-object v4, v12, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v4}, Ll/֡ܳ֡;->getLine()I

    move-result v4

    iget-object v5, v12, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    .line 83
    invoke-interface {v5}, Ll/֡ܳ֡;->֫()I

    move-result v5

    const-string v6, "Unknown local attribute: "

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Ll/֡ۤۢ;-><init>(Ll/᩵ۤۢ;IILjava/lang/String;)V

    throw v2

    .line 86
    :cond_9
    :goto_3
    invoke-virtual {v12}, Ll/ۡܳ֡;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_4
    if-ltz v1, :cond_1d

    .line 87
    invoke-virtual {v12, v1}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v14

    .line 88
    instance-of v15, v14, Ll/ۡܳ֡;

    if-eqz v15, :cond_d

    check-cast v14, Ll/ۡܳ֡;

    .line 89
    invoke-static {v5}, Ll/ۛۛۢ;->ܽ(Ll/ۛۛۢ;)I

    move-result v15

    move-object/from16 p1, v7

    .line 90
    invoke-virtual {v14}, Ll/᩵ܳ֡;->ۧ()I

    move-result v7

    move-object/from16 p2, v9

    const/4 v9, 0x2

    if-ne v7, v9, :cond_a

    const/4 v7, 0x1

    if-eq v13, v7, :cond_a

    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v9, v1, -0x1

    .line 93
    invoke-virtual {v12, v9}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v9

    check-cast v9, Ll/ۘ᩷֡;

    invoke-interface {v9}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v9

    invoke-interface {v9}, Ll/֡ܳ֡;->ܽ()I

    move-result v9

    add-int/2addr v9, v7

    add-int/lit8 v7, v1, 0x1

    .line 94
    invoke-virtual {v12, v7}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v7

    check-cast v7, Ll/ۘ᩷֡;

    invoke-interface {v7}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v7

    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v7

    .line 95
    aget v16, v10, v9

    add-int/lit8 v16, v16, 0x1

    aput v16, v10, v9

    .line 96
    aget v9, v10, v7

    add-int/lit8 v9, v9, -0x1

    aput v9, v10, v7

    .line 98
    :cond_a
    invoke-virtual {v14}, Ll/᩵ܳ֡;->ۧ()I

    move-result v7

    const/4 v9, 0x2

    if-eq v7, v9, :cond_c

    .line 99
    invoke-static {v5}, Ll/ۛۛۢ;->ۧ(Ll/ۛۛۢ;)Z

    move-result v9

    if-nez v9, :cond_b

    const/16 v9, 0xc

    if-eq v7, v9, :cond_b

    const/16 v9, 0xe

    if-eq v7, v9, :cond_b

    const/16 v9, 0xb

    if-eq v7, v9, :cond_b

    const/16 v9, 0x14

    if-eq v7, v9, :cond_b

    const/16 v9, 0xa

    if-eq v7, v9, :cond_b

    const/4 v9, 0x4

    if-eq v7, v9, :cond_b

    const/16 v9, 0x9

    if-ne v7, v9, :cond_c

    :cond_b
    const/4 v7, 0x1

    goto :goto_5

    :cond_c
    const/4 v7, 0x0

    .line 104
    :goto_5
    new-instance v9, Ll/ۛۛۢ;

    invoke-direct {v9, v14, v15, v7}, Ll/ۛۛۢ;-><init>(Ll/ۡܳ֡;IZ)V

    invoke-virtual {v11, v9}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_d
    move-object/from16 p1, v7

    move-object/from16 p2, v9

    .line 105
    instance-of v7, v14, Ll/ۘ᩷֡;

    if-eqz v7, :cond_1c

    check-cast v14, Ll/ۘ᩷֡;

    .line 106
    invoke-interface {v14}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v7

    .line 107
    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v9

    invoke-interface {v7}, Ll/֡ܳ֡;->getType()I

    move-result v7

    .line 108
    invoke-static {v5}, Ll/ۛۛۢ;->ܽ(Ll/ۛۛۢ;)I

    move-result v14

    aput v14, v4, v9

    .line 109
    iget-object v14, v0, Ll/ۨۛۢ;->ܽ:[Z

    invoke-static {v5}, Ll/ۛۛۢ;->ۧ(Ll/ۛۛۢ;)Z

    move-result v15

    aput-boolean v15, v14, v9

    const/4 v14, 0x6

    if-eq v7, v14, :cond_e

    const/16 v14, 0xd

    if-eq v7, v14, :cond_e

    const/16 v14, 0xc

    if-eq v7, v14, :cond_e

    const/16 v14, 0x9

    if-ne v7, v14, :cond_f

    :cond_e
    const/4 v14, 0x1

    .line 110
    aput-boolean v14, v6, v9

    :cond_f
    const/16 v14, 0x1e

    const/16 v15, 0x13

    if-ne v7, v14, :cond_11

    const/16 v14, 0x11

    if-eq v13, v14, :cond_10

    if-ne v13, v15, :cond_11

    :cond_10
    const/4 v14, 0x1

    .line 111
    aput-boolean v14, v8, v9

    goto :goto_6

    :cond_11
    const/4 v14, 0x1

    :goto_6
    const/16 v15, 0x2f

    if-ne v7, v15, :cond_12

    const/16 v15, 0x17

    if-eq v13, v15, :cond_12

    .line 112
    aput-boolean v14, v8, v9

    :cond_12
    const/4 v15, 0x5

    if-ne v13, v15, :cond_14

    const/16 v15, 0x13

    if-ne v7, v15, :cond_13

    .line 114
    aput-boolean v14, v3, v9

    :cond_13
    const/16 v15, 0x14

    if-ne v7, v15, :cond_14

    .line 115
    aput-boolean v14, v8, v9

    :cond_14
    const/16 v14, 0xc

    if-ne v13, v14, :cond_17

    if-nez v1, :cond_17

    const/16 v14, 0x1c

    if-eq v7, v14, :cond_16

    const/16 v14, 0x1b

    if-eq v7, v14, :cond_16

    const/16 v14, 0x1d

    if-ne v7, v14, :cond_15

    goto :goto_7

    :cond_15
    const/16 v14, 0xc

    const/4 v15, 0x1

    goto :goto_9

    :cond_16
    :goto_7
    const/4 v14, 0x1

    .line 118
    aput-boolean v14, v3, v9

    goto :goto_8

    :cond_17
    const/4 v14, 0x1

    :goto_8
    const/4 v15, 0x1

    const/16 v14, 0xc

    :goto_9
    if-ne v13, v14, :cond_18

    if-ne v1, v15, :cond_18

    const/4 v14, 0x1

    const/4 v15, 0x0

    .line 120
    invoke-virtual {v12, v15}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v15

    instance-of v15, v15, Ll/ۛۤۢ;

    if-eqz v15, :cond_18

    aput-boolean v14, v2, v9

    :cond_18
    const/16 v14, 0xf

    if-ne v13, v14, :cond_1a

    const/16 v15, 0x1a

    if-eq v7, v15, :cond_19

    const/16 v15, 0x26

    if-ne v7, v15, :cond_1a

    :cond_19
    const/4 v15, 0x1

    .line 121
    aput-boolean v15, v2, v9

    :cond_1a
    if-eq v7, v14, :cond_1b

    const/16 v14, 0x18

    if-eq v13, v14, :cond_1b

    const/4 v14, 0x2

    if-eq v7, v14, :cond_1b

    const/16 v14, 0x15

    if-ne v7, v14, :cond_1c

    .line 123
    :cond_1b
    iget-object v7, v0, Ll/ۨۛۢ;->ۜ:[Z

    const/4 v14, 0x1

    aput-boolean v14, v7, v9

    :cond_1c
    :goto_a
    add-int/lit8 v1, v1, -0x1

    move-object/from16 v7, p1

    move-object/from16 v9, p2

    goto/16 :goto_4

    :cond_1d
    move-object/from16 v1, p3

    goto/16 :goto_2

    :cond_1e
    move-object/from16 p1, v7

    move-object/from16 p2, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 129
    :goto_b
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_21

    and-int/lit16 v3, v2, 0x3ff

    if-nez v3, :cond_1f

    .line 130
    invoke-virtual/range {p1 .. p1}, Ll/ۙۛۢ;->֫()V

    .line 131
    :cond_1f
    aget v3, v10, v2

    add-int/2addr v1, v3

    move-object/from16 v3, p2

    .line 132
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳ֡;

    invoke-static {v5}, Ll/ۨۛۢ;->֫(Ll/֡ܳ֡;)Z

    move-result v5

    if-eqz v5, :cond_20

    aput v1, v4, v2

    :cond_20
    add-int/lit8 v2, v2, 0x1

    move-object/from16 p2, v3

    goto :goto_b

    .line 126
    :cond_21
    const-class v1, Ll/ۤۤۢ;

    const/4 v2, 0x0

    move-object/from16 v3, p3

    invoke-virtual {v3, v1, v2}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v1

    check-cast v1, Ll/ۤۤۢ;

    .line 161
    const-class v3, Ll/۫ۤۢ;

    invoke-virtual {v1, v3, v2}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v1

    check-cast v1, Ll/۫ۤۢ;

    .line 138
    iget-object v3, v0, Ll/ۨۛۢ;->ۘ:Ljava/util/List;

    new-instance v4, Ljava/util/ArrayList;

    .line 193
    const-class v5, Ll/ܺۛۢ;

    invoke-virtual {v1, v5}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v5

    .line 138
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 199
    const-class v5, Ll/ۢۛۢ;

    invoke-virtual {v1, v5, v2}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v6

    check-cast v6, Ll/ۢۛۢ;

    if-eqz v6, :cond_22

    invoke-virtual {v1, v5, v2}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v1

    check-cast v1, Ll/ۢۛۢ;

    .line 139
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    const/4 v1, 0x0

    .line 141
    :goto_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_26

    .line 142
    iget-object v5, v0, Ll/ۨۛۢ;->ۧ:Ll/ۙۛۢ;

    invoke-virtual {v5}, Ll/ۙۛۢ;->֫()V

    .line 143
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡܳ֡;

    add-int/lit8 v2, v2, 0x1

    .line 144
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v2, v6, :cond_23

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡܳ֡;

    iget-object v6, v6, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v6}, Ll/֡ܳ֡;->ܽ()I

    move-result v6

    goto :goto_d

    :cond_23
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    :goto_d
    if-ge v1, v6, :cond_25

    .line 146
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܳ֡;

    invoke-static {v7}, Ll/ۨۛۢ;->֫(Ll/֡ܳ֡;)Z

    move-result v7

    if-eqz v7, :cond_24

    .line 147
    iget-object v1, v0, Ll/ۨۛۢ;->᩻:[Z

    iget-object v6, v5, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v6}, Ll/֡ܳ֡;->ܽ()I

    move-result v6

    iget-object v7, v5, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    invoke-static {v1, v6, v7, v8}, Ljava/util/Arrays;->fill([ZIIZ)V

    goto :goto_e

    :cond_24
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_25
    const/4 v8, 0x1

    .line 151
    :goto_e
    iget-object v1, v5, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->ܽ()I

    move-result v1

    add-int/2addr v1, v8

    goto :goto_c

    :cond_26
    return-void

    .line 0
    :cond_27
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "count is negative: "

    invoke-static {v2, v3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ۙۛۢ;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 51
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_5

    and-int/lit16 v1, v0, 0x3ff

    if-nez v1, :cond_0

    .line 52
    invoke-virtual {p1}, Ll/ۙۛۢ;->֫()V

    .line 53
    :cond_0
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    const/16 v3, 0xd

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 55
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ge v0, p1, :cond_4

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-ne v1, v3, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0xd

    :goto_1
    if-ne p0, v2, :cond_4

    if-ne v1, v3, :cond_3

    const-string p0, "\r\n"

    return-object p0

    :cond_3
    const-string p0, "\n\r"

    return-object p0

    .line 58
    :cond_4
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const-string p0, "\n"

    return-object p0
.end method

.method public static ֫(IILjava/lang/CharSequence;)Z
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_3

    and-int/lit16 v0, p0, 0x3ff

    if-nez v0, :cond_0

    .line 209
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 210
    :cond_0
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/֡ܳ֡;)Z
    .locals 2

    .line 206
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v0

    const/16 v1, 0x40

    if-eq v0, v1, :cond_1

    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result p0

    const/16 v0, 0x42

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ᩴ᩷ܿ;)V
    .locals 23

    move-object/from16 v0, p0

    .line 156
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 157
    iget-object v2, v0, Ll/ۨۛۢ;->ۘ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳ֡;

    .line 158
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/16 v6, 0x41

    if-eq v5, v6, :cond_0

    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v5

    if-eq v5, v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 160
    :cond_1
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 161
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 164
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    iget-object v9, v0, Ll/ۨۛۢ;->ۧ:Ll/ۙۛۢ;

    if-ge v4, v7, :cond_1a

    .line 165
    invoke-virtual {v9}, Ll/ۙۛۢ;->֫()V

    .line 166
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܳ֡;

    .line 167
    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v8

    invoke-interface {v7}, Ll/֡ܳ֡;->getType()I

    move-result v15

    .line 168
    iget-object v9, v0, Ll/ۨۛۢ;->ᩳ:[I

    aget v9, v9, v8

    const/16 v10, 0x2e

    const/16 v11, 0x30

    const/16 v12, 0x1f

    if-eq v15, v12, :cond_2

    if-eq v15, v11, :cond_2

    if-ne v15, v10, :cond_3

    .line 169
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 170
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_4

    const/4 v10, 0x0

    const/16 v21, 0x0

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۤۛۢ;

    invoke-static {v10}, Ll/ۤۛۢ;->֫(Ll/ۤۛۢ;)I

    move-result v10

    move/from16 v21, v10

    :goto_2
    add-int v13, v9, v21

    .line 172
    invoke-interface {v7}, Ll/֡ܳ֡;->ᩳ()I

    move-result v9

    iget-object v10, v0, Ll/ۨۛۢ;->ۢ:Ljava/lang/CharSequence;

    invoke-static {v6, v9, v10}, Ll/ۨۛۢ;->֫(IILjava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 175
    invoke-interface {v7}, Ll/֡ܳ֡;->ᩳ()I

    move-result v9

    :goto_3
    if-le v9, v6, :cond_5

    add-int/lit8 v11, v9, -0x1

    .line 176
    invoke-interface {v10, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    const/16 v14, 0xa

    if-eq v12, v14, :cond_5

    invoke-interface {v10, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    const/16 v12, 0xd

    if-eq v11, v12, :cond_5

    add-int/lit8 v9, v9, -0x1

    goto :goto_3

    :cond_5
    move v14, v9

    goto :goto_4

    :cond_6
    const/4 v6, -0x1

    const/4 v14, -0x1

    .line 179
    :goto_4
    iget-object v6, v0, Ll/ۨۛۢ;->᩻:[Z

    aget-boolean v9, v6, v8

    if-nez v9, :cond_8

    invoke-static {v7}, Ll/ۨۛۢ;->֫(Ll/֡ܳ֡;)Z

    move-result v9

    if-nez v9, :cond_8

    if-eqz v3, :cond_7

    .line 180
    invoke-interface {v3}, Ll/֡ܳ֡;->ܽ()I

    move-result v9

    aget-boolean v6, v6, v9

    if-nez v6, :cond_8

    invoke-static {v3}, Ll/ۨۛۢ;->֫(Ll/֡ܳ֡;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_7
    const/4 v6, 0x0

    const/16 v17, 0x0

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v6, 0x1

    const/16 v17, 0x1

    :goto_6
    const/16 v6, 0x2f

    const-string v9, ""

    const/16 v10, 0x43

    if-eqz v3, :cond_12

    .line 181
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v11

    if-ne v11, v10, :cond_9

    goto/16 :goto_8

    .line 195
    :cond_9
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v10

    invoke-interface {v7}, Ll/֡ܳ֡;->getType()I

    move-result v11

    .line 196
    invoke-static {v7}, Ll/ۨۛۢ;->֫(Ll/֡ܳ֡;)Z

    move-result v12

    if-eqz v12, :cond_a

    const-string v9, "  "

    goto/16 :goto_8

    :cond_a
    const/16 v12, 0x1c

    const-string v16, " "

    if-ne v10, v12, :cond_b

    if-ne v11, v12, :cond_b

    goto :goto_7

    :cond_b
    if-ne v10, v6, :cond_d

    if-eq v11, v6, :cond_c

    const/16 v6, 0x3b

    if-ne v11, v6, :cond_d

    :cond_c
    :goto_7
    move-object/from16 v9, v16

    goto :goto_8

    :cond_d
    const/16 v6, 0xf

    if-eq v11, v6, :cond_12

    const/4 v6, 0x1

    if-eq v11, v6, :cond_12

    const/16 v6, 0x1f

    if-eq v11, v6, :cond_12

    const/16 v6, 0x30

    if-eq v11, v6, :cond_12

    const/16 v6, 0x2e

    if-ne v11, v6, :cond_e

    goto :goto_8

    :cond_e
    const/16 v6, 0x1a

    if-eq v11, v6, :cond_12

    const/16 v12, 0x26

    if-ne v11, v12, :cond_f

    goto :goto_8

    :cond_f
    if-eq v10, v6, :cond_12

    if-eq v10, v12, :cond_12

    const/16 v6, 0x1e

    if-eq v10, v6, :cond_12

    const/16 v6, 0x2f

    if-eq v10, v6, :cond_12

    const/16 v6, 0x2d

    if-ne v10, v6, :cond_10

    goto :goto_8

    :cond_10
    const/16 v6, 0x16

    if-eq v10, v6, :cond_12

    if-ne v11, v6, :cond_11

    goto :goto_8

    .line 202
    :cond_11
    iget-object v6, v0, Ll/ۨۛۢ;->ۖ:[Z

    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v10

    aget-boolean v6, v6, v10

    if-nez v6, :cond_12

    iget-object v6, v0, Ll/ۨۛۢ;->ܺ:[Z

    invoke-interface {v3}, Ll/֡ܳ֡;->ܽ()I

    move-result v10

    aget-boolean v6, v6, v10

    if-eqz v6, :cond_13

    :cond_12
    :goto_8
    move-object/from16 v16, v9

    .line 182
    :cond_13
    iget-object v6, v0, Ll/ۨۛۢ;->֫:[Z

    if-eqz v3, :cond_14

    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v9

    const/16 v10, 0x43

    if-eq v9, v10, :cond_14

    aget-boolean v9, v6, v8

    if-eqz v9, :cond_14

    if-nez v17, :cond_14

    const/4 v9, 0x1

    const/16 v18, 0x1

    goto :goto_9

    :cond_14
    const/4 v9, 0x0

    const/16 v18, 0x0

    .line 183
    :goto_9
    iget-object v9, v0, Ll/ۨۛۢ;->᩷:[Z

    aget-boolean v9, v9, v8

    if-nez v9, :cond_16

    if-eqz v3, :cond_15

    iget-object v9, v0, Ll/ۨۛۢ;->ۜ:[Z

    invoke-interface {v3}, Ll/֡ܳ֡;->ܽ()I

    move-result v3

    aget-boolean v3, v9, v3

    if-eqz v3, :cond_15

    goto :goto_a

    :cond_15
    const/4 v3, 0x0

    goto :goto_b

    :cond_16
    :goto_a
    const/4 v3, 0x1

    .line 184
    :goto_b
    new-instance v12, Ll/᩹ۤۢ;

    invoke-interface {v7}, Ll/֡ܳ֡;->ᩳ()I

    move-result v10

    invoke-interface {v7}, Ll/֡ܳ֡;->ܿ()I

    move-result v9

    const/4 v11, 0x1

    add-int/lit8 v19, v9, 0x1

    iget-object v9, v0, Ll/ۨۛۢ;->ܽ:[Z

    aget-boolean v9, v9, v8

    if-eqz v9, :cond_17

    aget-boolean v6, v6, v8

    if-nez v6, :cond_17

    const/4 v6, 0x1

    goto :goto_c

    :cond_17
    const/4 v6, 0x0

    :goto_c
    iget-object v9, v0, Ll/ۨۛۢ;->ܿ:[I

    aget v20, v9, v8

    move-object v9, v12

    move/from16 v11, v19

    move-object v8, v12

    move v12, v15

    move-object/from16 v22, v1

    move v1, v15

    move-object/from16 v15, v16

    move/from16 v16, v18

    move/from16 v18, v3

    move/from16 v19, v6

    invoke-direct/range {v9 .. v20}, Ll/᩹ۤۢ;-><init>(IIIIILjava/lang/String;ZZZZI)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v3, 0x1e

    if-eq v1, v3, :cond_18

    const/16 v3, 0x2f

    if-eq v1, v3, :cond_18

    const/16 v3, 0x2d

    if-ne v1, v3, :cond_19

    .line 187
    :cond_18
    new-instance v1, Ll/ۤۛۢ;

    add-int/lit8 v3, v21, 0x1

    invoke-direct {v1, v3}, Ll/ۤۛۢ;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 189
    :cond_19
    invoke-interface {v7}, Ll/֡ܳ֡;->ܿ()I

    move-result v1

    add-int/lit8 v6, v1, 0x1

    add-int/lit8 v4, v4, 0x1

    move-object v3, v7

    move-object/from16 v1, v22

    goto/16 :goto_1

    .line 191
    :cond_1a
    new-instance v1, Ll/᩶ۤۢ;

    iget-object v7, v0, Ll/ۨۛۢ;->ܳ:Ljava/lang/String;

    iget v8, v0, Ll/ۨۛۢ;->ۡ:I

    iget-object v4, v0, Ll/ۨۛۢ;->ۢ:Ljava/lang/CharSequence;

    iget-object v6, v0, Ll/ۨۛۢ;->ᩴ:Ljava/lang/String;

    move-object v3, v1

    move-object/from16 v10, p1

    invoke-direct/range {v3 .. v10}, Ll/᩶ۤۢ;-><init>(Ljava/lang/CharSequence;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ILl/ۙۛۢ;Ll/ᩴ᩷ܿ;)V

    invoke-virtual {v1}, Ll/᩶ۤۢ;->֫()V

    return-void
.end method
