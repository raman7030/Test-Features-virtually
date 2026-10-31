.class public final Ll/۬ܿۡ;
.super Ljava/lang/Object;
.source "Y6RB"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۖ:Ljava/lang/CharSequence;

.field public final ۘ:Ljava/util/ArrayList;

.field public final ۜ:[I

.field public final ۡ:Ljava/util/ArrayList;

.field public final ۢ:[I

.field public final ۧ:[Z

.field public final ܳ:[I

.field public final ܺ:Ll/᩻ܰۢ;

.field public final ܽ:Ll/ۖܰۢ;

.field public final ܿ:[Z

.field public final ᩳ:[Z

.field public final ᩴ:Ljava/util/List;

.field public final ᩷:[I

.field public final ᩻:[I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/util/List;Ll/ۡܳ֡;Ll/ۖܰۢ;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 33
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Ll/۬ܿۡ;->֫:Ljava/util/ArrayList;

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Ll/۬ܿۡ;->ۡ:Ljava/util/ArrayList;

    .line 31
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Ll/۬ܿۡ;->ۘ:Ljava/util/ArrayList;

    .line 34
    iput-object v1, v0, Ll/۬ܿۡ;->ۖ:Ljava/lang/CharSequence;

    move-object/from16 v4, p2

    .line 35
    iput-object v4, v0, Ll/۬ܿۡ;->ᩴ:Ljava/util/List;

    .line 36
    iput-object v3, v0, Ll/۬ܿۡ;->ܽ:Ll/ۖܰۢ;

    .line 37
    new-instance v5, Ll/᩻ܰۢ;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v5, v2, v4, v3}, Ll/᩻ܰۢ;-><init>(Ll/ۡܳ֡;ILl/ۖܰۢ;)V

    iput-object v5, v0, Ll/۬ܿۡ;->ܺ:Ll/᩻ܰۢ;

    .line 39
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v4, v3}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result v3

    const/4 v5, 0x1

    add-int/2addr v3, v5

    new-array v3, v3, [I

    iput-object v3, v0, Ll/۬ܿۡ;->ۜ:[I

    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 41
    :goto_0
    iget-object v7, v0, Ll/۬ܿۡ;->ۜ:[I

    array-length v8, v7

    if-ge v3, v8, :cond_1

    .line 42
    aput v6, v7, v3

    .line 43
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v6, v7, :cond_0

    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    add-int/2addr v6, v7

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    const/4 v6, 0x1

    .line 46
    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    const/16 v8, 0xa

    if-ge v3, v7, :cond_3

    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v7, v8, :cond_2

    add-int/lit8 v6, v6, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 47
    :cond_3
    new-array v3, v6, [I

    iput-object v3, v0, Ll/۬ܿۡ;->᩻:[I

    const/4 v3, 0x0

    const/4 v7, 0x1

    .line 48
    :goto_2
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v3, v9, :cond_5

    .line 49
    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-ne v9, v8, :cond_4

    iget-object v9, v0, Ll/۬ܿۡ;->᩻:[I

    add-int/lit8 v10, v7, 0x1

    add-int/lit8 v11, v3, 0x1

    aput v11, v9, v7

    move v7, v10

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 51
    :cond_5
    new-array v3, v6, [I

    iput-object v3, v0, Ll/۬ܿۡ;->ۢ:[I

    .line 52
    new-array v3, v6, [I

    iput-object v3, v0, Ll/۬ܿۡ;->᩷:[I

    .line 53
    new-array v3, v6, [I

    iput-object v3, v0, Ll/۬ܿۡ;->ܳ:[I

    .line 54
    new-array v7, v6, [Z

    iput-object v7, v0, Ll/۬ܿۡ;->ܿ:[Z

    .line 55
    new-array v7, v6, [Z

    iput-object v7, v0, Ll/۬ܿۡ;->ᩳ:[Z

    .line 56
    new-array v7, v6, [Z

    iput-object v7, v0, Ll/۬ܿۡ;->ۧ:[Z

    const/4 v7, -0x1

    .line 57
    invoke-static {v3, v7}, Ljava/util/Arrays;->fill([II)V

    const/4 v3, 0x0

    :goto_3
    const/16 v7, 0xc

    if-ge v3, v6, :cond_a

    .line 59
    iget-object v8, v0, Ll/۬ܿۡ;->᩻:[I

    aget v8, v8, v3

    if-nez v8, :cond_6

    const-string v9, "\ufeff"

    .line 26
    invoke-static {v1, v4, v4, v9, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_6

    add-int/lit8 v8, v8, 0x1

    :cond_6
    const/4 v9, 0x0

    .line 62
    :goto_4
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-ge v8, v10, :cond_9

    .line 63
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    const/16 v11, 0x20

    if-ne v10, v11, :cond_7

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_7
    const/16 v11, 0x9

    if-ne v10, v11, :cond_8

    .line 65
    rem-int/lit8 v10, v9, 0x8

    rsub-int/lit8 v10, v10, 0x8

    add-int/2addr v10, v9

    move v9, v10

    goto :goto_5

    :cond_8
    if-ne v10, v7, :cond_9

    const/4 v9, 0x0

    :goto_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 70
    :cond_9
    iget-object v7, v0, Ll/۬ܿۡ;->ۢ:[I

    aput v8, v7, v3

    .line 71
    iget-object v7, v0, Ll/۬ܿۡ;->᩷:[I

    aput v9, v7, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 73
    :cond_a
    move-object v1, v2

    check-cast v1, Ll/ۜ֫ۡ;

    .line 80
    iget-object v2, v0, Ll/۬ܿۡ;->ۜ:[I

    iget-object v3, v0, Ll/۬ܿۡ;->ᩴ:Ljava/util/List;

    .line 245
    const-class v6, Ll/᩶ᩳۡ;

    invoke-virtual {v1, v6, v4}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v7

    check-cast v7, Ll/᩶ᩳۡ;

    if-nez v7, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v1, v6, v4}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v1

    check-cast v1, Ll/᩶ᩳۡ;

    .line 450
    const-class v4, Ll/᩹ᩳۡ;

    invoke-virtual {v1, v4}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 81
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ᩳۡ;

    .line 82
    iget-object v6, v4, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    invoke-interface {v6}, Ll/֡ܳ֡;->ܽ()I

    move-result v6

    .line 83
    :goto_7
    iget-object v7, v4, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v7

    if-lt v6, v7, :cond_e

    .line 84
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܳ֡;

    .line 85
    invoke-interface {v7}, Ll/֡ܳ֡;->ۧ()I

    move-result v8

    if-nez v8, :cond_d

    invoke-interface {v7}, Ll/֡ܳ֡;->getType()I

    move-result v7

    invoke-static {v7}, Ll/ۚܰۢ;->֫(I)Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_8

    :cond_d
    add-int/lit8 v6, v6, -0x1

    goto :goto_7

    .line 88
    :cond_e
    :goto_8
    iget-object v7, v4, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v7

    if-lt v6, v7, :cond_c

    .line 89
    iget-object v7, v0, Ll/۬ܿۡ;->ۘ:Ljava/util/ArrayList;

    new-instance v8, Ll/ۗܿۡ;

    iget-object v4, v4, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v4

    aget v4, v2, v4

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ܳ֡;

    invoke-interface {v6}, Ll/֡ܳ֡;->ܿ()I

    move-result v6

    add-int/2addr v6, v5

    aget v6, v2, v6

    invoke-direct {v8, v4, v6}, Ll/ۗܿۡ;-><init>(II)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 95
    :cond_f
    :goto_9
    iget-object v1, v0, Ll/۬ܿۡ;->ۜ:[I

    iget-object v2, v0, Ll/۬ܿۡ;->ᩴ:Ljava/util/List;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 96
    :goto_a
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v7, v4, :cond_1a

    .line 97
    iget-object v4, v0, Ll/۬ܿۡ;->ܽ:Ll/ۖܰۢ;

    invoke-virtual {v4}, Ll/ۖܰۢ;->֫()V

    .line 98
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳ֡;

    .line 99
    invoke-interface {v4}, Ll/֡ܳ֡;->getType()I

    move-result v14

    const/4 v6, 0x2

    if-ne v14, v6, :cond_10

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_10
    const/4 v6, 0x3

    if-ne v14, v6, :cond_11

    add-int/lit8 v3, v3, -0x1

    .line 102
    :cond_11
    :goto_b
    invoke-static {v14}, Ll/ۚܰۢ;->֫(I)Z

    move-result v6

    if-nez v6, :cond_19

    const/16 v6, 0x68

    if-eq v14, v6, :cond_19

    if-ne v14, v5, :cond_12

    goto/16 :goto_12

    .line 103
    :cond_12
    iget-object v6, v0, Ll/۬ܿۡ;->ܺ:Ll/᩻ܰۢ;

    iget-object v6, v6, Ll/᩻ܰۢ;->ۧ:[I

    aget v6, v6, v7

    if-le v6, v7, :cond_13

    move v15, v6

    goto :goto_c

    :cond_13
    move v15, v7

    .line 104
    :goto_c
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ܳ֡;

    .line 105
    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v8

    if-ltz v8, :cond_19

    invoke-interface {v6}, Ll/֡ܳ֡;->ܿ()I

    move-result v8

    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v9

    if-ge v8, v9, :cond_14

    goto :goto_12

    .line 106
    :cond_14
    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v4

    aget v10, v1, v4

    .line 107
    invoke-interface {v6}, Ll/֡ܳ֡;->ܿ()I

    move-result v4

    add-int/2addr v4, v5

    aget v4, v1, v4

    .line 108
    new-instance v13, Ll/᩹ܿۡ;

    .line 326
    iget-object v6, v0, Ll/۬ܿۡ;->᩻:[I

    invoke-static {v6, v10}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v6

    if-ltz v6, :cond_15

    :goto_d
    move v12, v6

    goto :goto_e

    :cond_15
    neg-int v6, v6

    add-int/lit8 v6, v6, -0x2

    goto :goto_d

    :goto_e
    move-object v6, v13

    move v8, v15

    move v9, v14

    move v11, v4

    move-object v5, v13

    move v13, v3

    .line 108
    invoke-direct/range {v6 .. v13}, Ll/᩹ܿۡ;-><init>(IIIIIII)V

    .line 109
    iget-object v6, v0, Ll/۬ܿۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v6, 0x69

    if-ne v14, v6, :cond_18

    .line 326
    iget-object v6, v0, Ll/۬ܿۡ;->᩻:[I

    invoke-static {v6, v4}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v6

    if-ltz v6, :cond_16

    goto :goto_f

    :cond_16
    neg-int v6, v6

    add-int/lit8 v6, v6, -0x2

    .line 110
    :goto_f
    invoke-static {v5}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v5

    if-le v6, v5, :cond_18

    .line 111
    iget-object v5, v0, Ll/۬ܿۡ;->ܿ:[Z

    .line 326
    iget-object v6, v0, Ll/۬ܿۡ;->᩻:[I

    invoke-static {v6, v4}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v4

    if-ltz v4, :cond_17

    goto :goto_10

    :cond_17
    neg-int v4, v4

    add-int/lit8 v4, v4, -0x2

    :goto_10
    const/4 v6, 0x1

    .line 111
    aput-boolean v6, v5, v4

    goto :goto_11

    :cond_18
    const/4 v6, 0x1

    :goto_11
    move v7, v15

    goto :goto_13

    :cond_19
    :goto_12
    const/4 v6, 0x1

    :goto_13
    add-int/2addr v7, v6

    const/4 v5, 0x1

    goto/16 :goto_a

    .line 118
    :cond_1a
    iget-object v1, v0, Ll/۬ܿۡ;->ۖ:Ljava/lang/CharSequence;

    iget-object v2, v0, Ll/۬ܿۡ;->ۡ:Ljava/util/ArrayList;

    iget-object v3, v0, Ll/۬ܿۡ;->᩻:[I

    iget-object v4, v0, Ll/۬ܿۡ;->᩷:[I

    iget-object v5, v0, Ll/۬ܿۡ;->ᩳ:[Z

    iget-object v6, v0, Ll/۬ܿۡ;->ܿ:[Z

    iget-object v7, v0, Ll/۬ܿۡ;->ۧ:[Z

    iget-object v8, v0, Ll/۬ܿۡ;->ܳ:[I

    new-instance v9, Ljava/util/ArrayDeque;

    invoke-direct {v9}, Ljava/util/ArrayDeque;-><init>()V

    .line 120
    iget-object v10, v0, Ll/۬ܿۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, -0x1

    :goto_14
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_30

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩹ܿۡ;

    .line 121
    iget-object v13, v0, Ll/۬ܿۡ;->ܽ:Ll/ۖܰۢ;

    invoke-virtual {v13}, Ll/ۖܰۢ;->֫()V

    .line 122
    iget-object v13, v0, Ll/۬ܿۡ;->ۢ:[I

    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v14

    aget v13, v13, v14

    invoke-static {v12}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v15

    if-ne v13, v15, :cond_1b

    const/4 v13, 0x1

    goto :goto_15

    :cond_1b
    const/4 v13, 0x0

    .line 123
    :goto_15
    invoke-static {v12}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v15

    const/16 v14, 0xf

    if-eq v15, v14, :cond_1d

    const/16 v14, 0x10

    if-eq v15, v14, :cond_1d

    const/16 v14, 0x11

    if-ne v15, v14, :cond_1c

    goto :goto_16

    :cond_1c
    const/4 v14, 0x0

    goto :goto_17

    :cond_1d
    :goto_16
    const/4 v14, 0x1

    :goto_17
    const/16 v15, 0x67

    if-eqz v13, :cond_20

    .line 124
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v16

    aget-boolean v16, v6, v16

    if-nez v16, :cond_20

    .line 125
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_1e

    .line 126
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v16

    invoke-virtual {v9}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ll/᩶ܿۡ;

    invoke-static/range {v17 .. v17}, Ll/᩶ܿۡ;->֫(Ll/᩶ܿۡ;)I

    move-result v17

    xor-int/lit8 v18, v14, 0x1

    add-int v17, v17, v18

    aput v17, v8, v16

    goto :goto_18

    :cond_1e
    move-object/from16 p2, v10

    .line 127
    invoke-static {v12}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v10

    if-ne v10, v15, :cond_1f

    .line 128
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v10

    const/16 v16, 0x1

    aput-boolean v16, v5, v10

    goto :goto_19

    :cond_1f
    const/16 v16, 0x1

    .line 130
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v10

    invoke-static {v12}, Ll/᩹ܿۡ;->ᩳ(Ll/᩹ܿۡ;)I

    move-result v17

    aput v17, v8, v10

    .line 131
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v10

    aput-boolean v16, v7, v10

    goto :goto_19

    :cond_20
    :goto_18
    move-object/from16 p2, v10

    .line 134
    :goto_19
    invoke-static {v12}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v10

    if-ne v10, v15, :cond_21

    .line 335
    iget-object v10, v0, Ll/۬ܿۡ;->ۖ:Ljava/lang/CharSequence;

    invoke-static {v12}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v15

    move-object/from16 v16, v5

    invoke-static {v12}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v5

    invoke-static {v15, v5, v10}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 134
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    goto :goto_1a

    :cond_21
    move-object/from16 v16, v5

    const-string v5, ""

    :goto_1a
    const-string v10, "# fmt: off"

    .line 135
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_23

    const-string v15, "# fmt: on"

    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_22

    goto :goto_1b

    :cond_22
    move-object/from16 p3, v4

    move-object/from16 v17, v6

    goto/16 :goto_1e

    :cond_23
    :goto_1b
    if-eqz v13, :cond_2f

    .line 137
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v13

    aget v13, v4, v13

    if-nez v13, :cond_2f

    invoke-virtual {v9}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_2f

    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v13

    aget-boolean v13, v6, v13

    if-nez v13, :cond_2f

    invoke-static {v12}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v13

    .line 196
    iget-object v15, v0, Ll/۬ܿۡ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v17

    const/16 v18, 0x0

    move/from16 v0, v17

    move-object/from16 v17, v6

    const/4 v6, 0x0

    :goto_1c
    if-ge v6, v0, :cond_25

    add-int v18, v6, v0

    move/from16 p1, v0

    ushr-int/lit8 v0, v18, 0x1

    .line 199
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ll/ۗܿۡ;

    move-object/from16 p3, v4

    invoke-static/range {v18 .. v18}, Ll/ۗܿۡ;->֫(Ll/ۗܿۡ;)I

    move-result v4

    if-gt v4, v13, :cond_24

    add-int/lit8 v6, v0, 0x1

    move/from16 v0, p1

    :cond_24
    move-object/from16 v4, p3

    goto :goto_1c

    :cond_25
    move-object/from16 p3, v4

    .line 202
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_26

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗܿۡ;

    invoke-static {v0}, Ll/ۗܿۡ;->ۧ(Ll/ۗܿۡ;)I

    move-result v0

    if-lt v0, v13, :cond_2f

    .line 141
    :cond_26
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    if-gez v11, :cond_27

    .line 143
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v0

    aget v0, v3, v0

    move v11, v0

    goto :goto_1e

    .line 142
    :cond_27
    sget-object v0, Ll/֡ܰۢ;->᩶:Ll/֡ܰۢ;

    const-string v1, "Nested format directives"

    invoke-static {v0, v1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object v0

    throw v0

    :cond_28
    if-ltz v11, :cond_2e

    .line 146
    new-instance v0, Ll/ۗܿۡ;

    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    .line 331
    array-length v5, v3

    if-ge v4, v5, :cond_29

    aget v4, v3, v4

    goto :goto_1d

    :cond_29
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 146
    :goto_1d
    invoke-direct {v0, v11, v4}, Ll/ۗܿۡ;-><init>(II)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, -0x1

    const/4 v11, -0x1

    .line 150
    :goto_1e
    invoke-static {v12}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v0

    const/16 v4, 0xc

    if-eq v0, v4, :cond_2b

    const/16 v4, 0xd

    if-eq v0, v4, :cond_2b

    const/16 v4, 0xe

    if-ne v0, v4, :cond_2a

    goto :goto_1f

    :cond_2a
    if-eqz v14, :cond_2d

    .line 153
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2d

    .line 154
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_21

    .line 151
    :cond_2b
    :goto_1f
    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v0

    aget v0, v8, v0

    if-ltz v0, :cond_2c

    invoke-static {v12}, Ll/᩹ܿۡ;->ܿ(Ll/᩹ܿۡ;)I

    move-result v0

    aget v0, v8, v0

    goto :goto_20

    :cond_2c
    invoke-static {v12}, Ll/᩹ܿۡ;->ᩳ(Ll/᩹ܿۡ;)I

    move-result v0

    invoke-virtual {v9}, Ljava/util/ArrayDeque;->size()I

    move-result v4

    add-int/2addr v0, v4

    .line 152
    :goto_20
    new-instance v4, Ll/᩶ܿۡ;

    invoke-direct {v4, v0}, Ll/᩶ܿۡ;-><init>(I)V

    invoke-virtual {v9, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_2d
    :goto_21
    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move-object/from16 v4, p3

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    goto/16 :goto_14

    .line 145
    :cond_2e
    sget-object v0, Ll/֡ܰۢ;->᩶:Ll/֡ܰۢ;

    const-string v1, "Unmatched format directive"

    invoke-static {v0, v1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object v0

    throw v0

    .line 139
    :cond_2f
    sget-object v0, Ll/֡ܰۢ;->᩶:Ll/֡ܰۢ;

    const-string v1, "Unsafe format directive boundary"

    invoke-static {v0, v1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object v0

    throw v0

    :cond_30
    move-object/from16 p3, v4

    move-object/from16 v16, v5

    const/4 v0, 0x0

    if-ltz v11, :cond_31

    .line 157
    new-instance v3, Ll/ۗܿۡ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {v3, v11, v1}, Ll/ۗܿۡ;-><init>(II)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    :cond_31
    array-length v1, v8

    new-array v1, v1, [I

    .line 161
    array-length v2, v8

    add-int/lit8 v2, v2, -0x1

    const/4 v3, -0x1

    :goto_22
    if-ltz v2, :cond_33

    .line 162
    aput v3, v1, v2

    .line 163
    aget-boolean v4, v7, v2

    if-eqz v4, :cond_32

    move v3, v2

    :cond_32
    add-int/lit8 v2, v2, -0x1

    goto :goto_22

    :cond_33
    const/4 v2, 0x0

    const/4 v3, -0x1

    .line 166
    :goto_23
    array-length v4, v8

    if-ge v2, v4, :cond_3e

    .line 167
    aget-boolean v4, v16, v2

    if-eqz v4, :cond_3c

    .line 168
    aget v4, v1, v2

    .line 169
    aget v5, p3, v2

    if-nez v5, :cond_34

    aput v0, v8, v2

    goto :goto_27

    :cond_34
    if-ltz v3, :cond_35

    .line 182
    aget v6, p3, v3

    if-nez v6, :cond_35

    const/4 v6, -0x1

    goto :goto_24

    :cond_35
    move v6, v3

    :goto_24
    if-ltz v4, :cond_36

    .line 183
    aget v9, p3, v4

    if-nez v9, :cond_36

    const/4 v4, -0x1

    :cond_36
    if-gez v6, :cond_37

    goto :goto_25

    :cond_37
    if-gez v4, :cond_38

    goto :goto_26

    .line 186
    :cond_38
    aget v9, p3, v6

    .line 187
    aget v10, p3, v4

    .line 188
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v11

    if-ge v5, v11, :cond_39

    if-ge v9, v10, :cond_3a

    goto :goto_26

    :cond_39
    if-gt v9, v5, :cond_3a

    if-gt v10, v5, :cond_3b

    if-le v9, v10, :cond_3a

    goto :goto_26

    :cond_3a
    :goto_25
    move v6, v4

    :cond_3b
    :goto_26
    if-ltz v6, :cond_3d

    .line 172
    aget v4, v8, v6

    aput v4, v8, v2

    goto :goto_27

    .line 174
    :cond_3c
    aget-boolean v4, v7, v2

    if-eqz v4, :cond_3d

    move v3, v2

    :cond_3d
    :goto_27
    add-int/lit8 v2, v2, 0x1

    goto :goto_23

    :cond_3e
    return-void
.end method

.method private ֫(Ljava/util/ArrayList;IILjava/lang/String;)V
    .locals 3

    .line 298
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    .line 30
    iget-object v2, p0, Ll/۬ܿۡ;->ۖ:Ljava/lang/CharSequence;

    invoke-static {v2, v1, p2, p4, v0}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sub-int v0, p3, p2

    .line 298
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 299
    :cond_0
    invoke-direct {p0, p2, p3}, Ll/۬ܿۡ;->֫(II)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ll/ۙܿۡ;

    invoke-direct {v0, p2, p3, p4}, Ll/ۙܿۡ;-><init>(IILjava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private ֫(II)Z
    .locals 6

    .line 304
    iget-object v0, p0, Ll/۬ܿۡ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    add-int v4, v3, v1

    ushr-int/lit8 v4, v4, 0x1

    .line 307
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗܿۡ;

    invoke-static {v5}, Ll/ۗܿۡ;->֫(Ll/ۗܿۡ;)I

    move-result v5

    if-gt v5, p1, :cond_0

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_0
    move v1, v4

    goto :goto_0

    .line 310
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v3, v1, :cond_3

    .line 311
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗܿۡ;

    .line 312
    invoke-static {v0}, Ll/ۗܿۡ;->ۧ(Ll/ۗܿۡ;)I

    move-result v1

    if-ge p1, v1, :cond_2

    invoke-static {v0}, Ll/ۗܿۡ;->ۧ(Ll/ۗܿۡ;)I

    move-result p1

    if-le p2, p1, :cond_3

    :cond_2
    return v4

    :cond_3
    return v2
.end method


# virtual methods
.method public final ֫(ZILl/ᩴ᩷ܿ;)V
    .locals 21

    move-object/from16 v1, p0

    .line 206
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x20

    if-eqz p1, :cond_0

    const-string v3, "\t"

    move/from16 v8, p2

    goto :goto_0

    :cond_0
    move/from16 v8, p2

    .line 207
    invoke-static {v2, v8}, Ll/ۢܺ֡;->֫(CI)Ljava/lang/String;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 208
    :goto_1
    iget-object v6, v1, Ll/۬ܿۡ;->ܳ:[I

    array-length v7, v6

    iget-object v9, v1, Ll/۬ܿۡ;->ۖ:Ljava/lang/CharSequence;

    iget-object v10, v1, Ll/۬ܿۡ;->ܽ:Ll/ۖܰۢ;

    const/4 v11, 0x1

    if-ge v5, v7, :cond_4

    .line 209
    invoke-virtual {v10}, Ll/ۖܰۢ;->֫()V

    .line 210
    aget v7, v6, v5

    if-ltz v7, :cond_3

    iget-object v7, v1, Ll/۬ܿۡ;->ܿ:[Z

    aget-boolean v7, v7, v5

    if-eqz v7, :cond_1

    goto :goto_2

    .line 211
    :cond_1
    iget-object v7, v1, Ll/۬ܿۡ;->᩻:[I

    aget v7, v7, v5

    if-nez v7, :cond_2

    const-string v10, "\ufeff"

    .line 26
    invoke-static {v9, v4, v4, v10, v11}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_2

    add-int/lit8 v7, v7, 0x1

    .line 213
    :cond_2
    iget-object v9, v1, Ll/۬ܿۡ;->ۢ:[I

    aget v9, v9, v5

    aget v6, v6, v5

    invoke-static {v6, v3}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v0, v7, v9, v6}, Ll/۬ܿۡ;->֫(Ljava/util/ArrayList;IILjava/lang/String;)V

    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 216
    :cond_4
    iget-object v3, v1, Ll/۬ܿۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v7, v1, Ll/۬ܿۡ;->ᩴ:Ljava/util/List;

    iget-object v11, v1, Ll/۬ܿۡ;->ܺ:Ll/᩻ܰۢ;

    if-eqz v6, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩹ܿۡ;

    .line 217
    invoke-virtual {v10}, Ll/ۖܰۢ;->֫()V

    if-eqz v5, :cond_19

    .line 218
    invoke-static {v5}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v12

    invoke-static {v6}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v13

    :goto_4
    const/16 v14, 0xc

    if-ge v12, v13, :cond_6

    .line 319
    invoke-interface {v9, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    if-eq v15, v2, :cond_5

    const/16 v2, 0x9

    if-eq v15, v2, :cond_5

    if-eq v15, v14, :cond_5

    goto/16 :goto_e

    :cond_5
    add-int/lit8 v12, v12, 0x1

    const/16 v2, 0x20

    goto :goto_4

    .line 218
    :cond_6
    invoke-static {v5}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v2

    const/16 v12, 0x67

    if-eq v2, v12, :cond_19

    invoke-static {v5}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v2

    const/16 v13, 0x69

    if-eq v2, v13, :cond_19

    invoke-static {v6}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v2

    if-eq v2, v13, :cond_19

    .line 221
    invoke-static {v5}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v2

    invoke-static {v6}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v13

    .line 276
    invoke-static {v6}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v14

    if-ne v14, v12, :cond_7

    const-string v5, "  "

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    move-object/from16 v19, v10

    goto/16 :goto_d

    .line 339
    :cond_7
    invoke-static {v5}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v12

    invoke-static {v5}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v14

    sub-int/2addr v12, v14

    const/16 v14, 0x8

    const-string v15, ""

    if-gt v12, v14, :cond_8

    .line 335
    invoke-static {v5}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v12

    invoke-static {v5}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v14

    invoke-static {v12, v14, v9}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    goto :goto_5

    :cond_8
    move-object v12, v15

    .line 339
    :goto_5
    invoke-static {v6}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v14

    invoke-static {v6}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v17

    sub-int v14, v14, v17

    move-object/from16 v17, v4

    const/16 v4, 0x8

    if-gt v14, v4, :cond_9

    .line 335
    invoke-static {v6}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v4

    invoke-static {v6}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v14

    invoke-static {v4, v14, v9}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_9
    move-object v4, v15

    :goto_6
    const-string v14, "."

    .line 280
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    const-string v8, "..."

    if-nez v16, :cond_a

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    :cond_a
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_18

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    goto/16 :goto_b

    :cond_b
    move-object/from16 v16, v15

    const-string v15, ","

    .line 283
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_16

    move-object/from16 v18, v3

    const-string v3, ";"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_15

    move-object/from16 v19, v10

    const-string v10, ":"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    invoke-static {v6}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v10

    move-object/from16 v20, v0

    const/16 v0, 0xf

    if-eq v10, v0, :cond_17

    const/16 v0, 0x10

    if-eq v10, v0, :cond_17

    const/16 v0, 0x11

    if-ne v10, v0, :cond_c

    goto/16 :goto_a

    .line 284
    :cond_c
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v10, " "

    if-nez v0, :cond_13

    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto/16 :goto_8

    .line 285
    :cond_d
    iget-object v0, v11, Ll/᩻ܰۢ;->ܽ:[Z

    invoke-static {v5}, Ll/᩹ܿۡ;->ܽ(Ll/᩹ܿۡ;)I

    move-result v3

    aget-boolean v0, v0, v3

    if-nez v0, :cond_17

    iget-object v0, v11, Ll/᩻ܰۢ;->ᩳ:[Z

    invoke-static {v6}, Ll/᩹ܿۡ;->ۧ(Ll/᩹ܿۡ;)I

    move-result v3

    aget-boolean v0, v0, v3

    if-eqz v0, :cond_e

    goto/16 :goto_a

    .line 286
    :cond_e
    invoke-static {v5}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v0

    const/16 v3, 0xc

    if-eq v0, v3, :cond_17

    const/16 v3, 0xd

    if-eq v0, v3, :cond_17

    const/16 v3, 0xe

    if-ne v0, v3, :cond_f

    goto :goto_a

    .line 287
    :cond_f
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_7

    .line 293
    :cond_10
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-static {v6}, Ll/᩹ܿۡ;->ۧ(Ll/᩹ܿۡ;)I

    move-result v0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳ֡;

    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v0

    const/16 v3, 0x63

    if-ne v0, v3, :cond_13

    goto :goto_a

    :cond_11
    :goto_7
    const-string v0, "from"

    .line 288
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "import"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_8

    .line 290
    :cond_12
    invoke-static {v5}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v0

    const/16 v3, 0x64

    if-ne v0, v3, :cond_17

    :cond_13
    :goto_8
    move-object v5, v10

    goto :goto_c

    :cond_14
    move-object/from16 v20, v0

    goto :goto_a

    :cond_15
    move-object/from16 v20, v0

    goto :goto_9

    :cond_16
    move-object/from16 v20, v0

    move-object/from16 v18, v3

    :goto_9
    move-object/from16 v19, v10

    :cond_17
    :goto_a
    move-object/from16 v5, v16

    goto :goto_c

    :cond_18
    :goto_b
    move-object/from16 v20, v0

    move-object/from16 v18, v3

    move-object/from16 v19, v10

    .line 281
    invoke-static {v5}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v0

    invoke-static {v6}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v3

    invoke-static {v0, v3, v9}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    :goto_c
    move-object/from16 v0, v20

    .line 221
    :goto_d
    invoke-direct {v1, v0, v2, v13, v5}, Ll/۬ܿۡ;->֫(Ljava/util/ArrayList;IILjava/lang/String;)V

    goto :goto_f

    :cond_19
    :goto_e
    move-object/from16 v18, v3

    move-object/from16 v17, v4

    move-object/from16 v19, v10

    :goto_f
    const/16 v2, 0x20

    move/from16 v8, p2

    move-object v5, v6

    move-object/from16 v4, v17

    move-object/from16 v3, v18

    move-object/from16 v10, v19

    goto/16 :goto_3

    :cond_1a
    move-object/from16 v18, v3

    move-object/from16 v19, v10

    .line 225
    new-instance v2, Ll/᩸ܿۡ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 226
    invoke-virtual/range {p3 .. p3}, Ll/ᩴ᩷ܿ;->֫()Ll/ᩴ᩷ܿ;

    move-result-object v2

    .line 228
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙܿۡ;

    .line 229
    invoke-virtual/range {v19 .. v19}, Ll/ۖܰۢ;->֫()V

    .line 230
    invoke-static {v5}, Ll/ۙܿۡ;->ܽ(Ll/ۙܿۡ;)I

    move-result v6

    if-lt v6, v4, :cond_1b

    .line 231
    invoke-static {v5}, Ll/ۙܿۡ;->ܽ(Ll/ۙܿۡ;)I

    move-result v6

    invoke-virtual {v2, v4, v6, v9}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    invoke-static {v5}, Ll/ۙܿۡ;->ۧ(Ll/ۙܿۡ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 232
    invoke-static {v5}, Ll/ۙܿۡ;->֫(Ll/ۙܿۡ;)I

    move-result v4

    goto :goto_10

    .line 230
    :cond_1b
    sget-object v0, Ll/֡ܰۢ;->᩹:Ll/֡ܰۢ;

    const-string v3, "Overlapping whitespace edits"

    invoke-static {v0, v3}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object v0

    throw v0

    .line 234
    :cond_1c
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-virtual {v2, v4, v3, v9}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 235
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/high16 v4, 0x100000

    if-gt v3, v4, :cond_26

    .line 238
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 258
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Z

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 261
    :goto_11
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    if-ge v4, v9, :cond_21

    .line 262
    invoke-virtual/range {v19 .. v19}, Ll/ۖܰۢ;->֫()V

    .line 263
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֡ܳ֡;

    .line 264
    invoke-interface {v9}, Ll/֡ܳ֡;->getType()I

    move-result v10

    const/16 v12, 0x67

    if-ne v10, v12, :cond_1d

    const/4 v8, 0x1

    .line 265
    :cond_1d
    invoke-interface {v9}, Ll/֡ܳ֡;->getType()I

    move-result v10

    const/4 v12, -0x1

    if-eq v10, v12, :cond_1e

    invoke-interface {v9}, Ll/֡ܳ֡;->getType()I

    move-result v10

    const/16 v12, 0x66

    if-ne v10, v12, :cond_20

    .line 266
    invoke-interface {v9}, Ll/֡ܳ֡;->ۧ()I

    move-result v9

    if-nez v9, :cond_20

    :cond_1e
    if-eqz v8, :cond_1f

    add-int/lit8 v8, v4, 0x1

    const/4 v9, 0x1

    .line 267
    invoke-static {v3, v6, v8, v9}, Ljava/util/Arrays;->fill([ZIIZ)V

    :cond_1f
    add-int/lit8 v6, v4, 0x1

    const/4 v8, 0x0

    :cond_20
    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    .line 243
    :cond_21
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_25

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹ܿۡ;

    .line 244
    invoke-virtual/range {v19 .. v19}, Ll/ۖܰۢ;->֫()V

    .line 245
    :goto_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v6, v9, :cond_22

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۙܿۡ;

    invoke-static {v9}, Ll/ۙܿۡ;->֫(Ll/ۙܿۡ;)I

    move-result v9

    invoke-static {v8}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v10

    if-gt v9, v10, :cond_22

    add-int/lit8 v9, v6, 0x1

    .line 246
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙܿۡ;

    .line 247
    invoke-static {v6}, Ll/ۙܿۡ;->ۧ(Ll/ۙܿۡ;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    invoke-static {v6}, Ll/ۙܿۡ;->֫(Ll/ۙܿۡ;)I

    move-result v12

    invoke-static {v6}, Ll/ۙܿۡ;->ܽ(Ll/ۙܿۡ;)I

    move-result v6

    sub-int/2addr v12, v6

    sub-int/2addr v10, v12

    add-int/2addr v7, v10

    move v6, v9

    goto :goto_13

    .line 249
    :cond_22
    new-instance v9, Ll/᩸ܰۢ;

    invoke-static {v8}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v10

    add-int v13, v10, v7

    invoke-static {v8}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v10

    add-int v14, v10, v7

    invoke-static {v8}, Ll/᩹ܿۡ;->᩻(Ll/᩹ܿۡ;)I

    move-result v15

    iget-object v10, v11, Ll/᩻ܰۢ;->֫:[Z

    invoke-static {v8}, Ll/᩹ܿۡ;->ۧ(Ll/᩹ܿۡ;)I

    move-result v12

    aget-boolean v16, v10, v12

    invoke-static {v8}, Ll/᩹ܿۡ;->ۧ(Ll/᩹ܿۡ;)I

    move-result v10

    aget-boolean v10, v3, v10

    if-nez v10, :cond_24

    invoke-static {v8}, Ll/᩹ܿۡ;->ܳ(Ll/᩹ܿۡ;)I

    move-result v10

    invoke-static {v8}, Ll/᩹ܿۡ;->֫(Ll/᩹ܿۡ;)I

    move-result v8

    .line 250
    invoke-direct {v1, v10, v8}, Ll/۬ܿۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_23

    goto :goto_14

    :cond_23
    const/4 v8, 0x0

    const/16 v17, 0x0

    goto :goto_15

    :cond_24
    :goto_14
    const/4 v8, 0x1

    const/16 v17, 0x1

    :goto_15
    move-object v12, v9

    invoke-direct/range {v12 .. v17}, Ll/᩸ܰۢ;-><init>(IIIZZ)V

    .line 249
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_12

    .line 252
    :cond_25
    new-instance v0, Ll/᩹ܰۢ;

    iget-object v6, v1, Ll/۬ܿۡ;->ܽ:Ll/ۖܰۢ;

    move-object v3, v0

    move-object v4, v2

    move/from16 v7, p1

    move/from16 v8, p2

    move-object/from16 v9, p3

    invoke-direct/range {v3 .. v9}, Ll/᩹ܰۢ;-><init>(Ll/ᩴ᩷ܿ;Ljava/util/ArrayList;Ll/ۖܰۢ;ZILl/ᩴ᩷ܿ;)V

    invoke-virtual {v0}, Ll/᩹ܰۢ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    invoke-virtual {v2}, Ll/ᩴ᩷ܿ;->close()V

    return-void

    .line 236
    :cond_26
    :try_start_1
    sget-object v0, Ll/֡ܰۢ;->ۙ:Ll/֡ܰۢ;

    const-string v3, "Formatted source length limit exceeded"

    invoke-static {v0, v3}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 226
    :try_start_2
    invoke-virtual {v2}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_16

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_16
    throw v3
.end method
