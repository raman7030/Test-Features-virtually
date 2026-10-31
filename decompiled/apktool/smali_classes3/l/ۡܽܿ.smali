.class public final Ll/ۡܽܿ;
.super Ljava/lang/Object;
.source "Y6MY"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܽܿ;->֫:Ljava/util/ArrayList;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;IILjava/util/function/BooleanSupplier;)I
    .locals 6

    sub-int v0, p2, p1

    const v1, 0x186a0

    if-gt v0, v1, :cond_0

    return p2

    :cond_0
    add-int/2addr v1, p1

    move v0, v1

    :goto_0
    if-le v0, p1, :cond_2

    .line 128
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x7f

    if-le v2, v3, :cond_2

    and-int/lit16 v2, v0, 0x3ff

    if-nez v2, :cond_1

    .line 129
    invoke-static {p3}, Ll/ۡܽܿ;->֫(Ljava/util/function/BooleanSupplier;)V

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v0, v1, :cond_6

    .line 133
    invoke-static {p3}, Ll/ۡܽܿ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 134
    invoke-static {v0, p2, p0}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v2

    :goto_2
    if-ge v2, p2, :cond_4

    .line 137
    invoke-static {p0, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    .line 138
    invoke-static {v3}, Ljava/lang/Character;->getType(I)I

    move-result v4

    const/4 v5, 0x6

    if-eq v4, v5, :cond_3

    const/16 v5, 0x8

    if-eq v4, v5, :cond_3

    const/4 v5, 0x7

    if-eq v4, v5, :cond_3

    goto :goto_3

    .line 141
    :cond_3
    invoke-static {p3}, Ll/ۡܽܿ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 142
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_2

    :cond_4
    :goto_3
    if-le v2, v1, :cond_5

    if-ne v0, p1, :cond_6

    return v2

    :cond_5
    move v0, v2

    goto :goto_1

    :cond_6
    return v0
.end method

.method public static ֫(Ll/۟᩸ᩳ;Ll/᩷۟ᩳ;Ll/ۙ۟ᩳ;Ljava/util/function/BooleanSupplier;)Ljava/util/ArrayList;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 52
    new-instance v11, Ll/ۡܽܿ;

    invoke-direct {v11}, Ll/ۡܽܿ;-><init>()V

    const/4 v3, 0x0

    const/4 v12, 0x0

    .line 53
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/᩷۟ᩳ;->size()I

    move-result v3

    if-ge v12, v3, :cond_d

    .line 54
    invoke-static/range {p3 .. p3}, Ll/ۡܽܿ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 55
    invoke-virtual {v1, v12}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v3

    add-int/lit8 v13, v3, 0x1

    .line 56
    invoke-virtual {v1, v12}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v14

    invoke-virtual {v1, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v15

    if-eqz p2, :cond_8

    .line 57
    invoke-virtual/range {p2 .. p2}, Ll/ۙ۟ᩳ;->ܽ()I

    move-result v3

    if-le v13, v3, :cond_0

    invoke-virtual/range {p2 .. p2}, Ll/ۙ۟ᩳ;->֫()I

    move-result v3

    if-lt v12, v3, :cond_8

    :cond_0
    move v10, v12

    :goto_1
    if-ge v10, v13, :cond_b

    .line 60
    invoke-static/range {p3 .. p3}, Ll/ۡܽܿ;->֫(Ljava/util/function/BooleanSupplier;)V

    add-int/lit8 v9, v10, 0x1

    .line 62
    invoke-virtual {v1, v10}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v4

    .line 63
    invoke-virtual {v1, v10}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v8

    sub-int v3, v8, v4

    const v5, 0x186a0

    if-le v3, v5, :cond_4

    .line 67
    :goto_2
    invoke-static/range {p3 .. p3}, Ll/ۡܽܿ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 68
    invoke-static {v0, v4, v8, v2}, Ll/ۡܽܿ;->֫(Ljava/lang/CharSequence;IILjava/util/function/BooleanSupplier;)I

    move-result v7

    if-ne v10, v12, :cond_1

    if-ne v4, v14, :cond_1

    const/4 v3, 0x1

    const/16 v16, 0x1

    goto :goto_3

    :cond_1
    const/4 v3, 0x0

    const/16 v16, 0x0

    :goto_3
    if-ne v9, v13, :cond_2

    if-ne v7, v15, :cond_2

    const/4 v3, 0x1

    const/16 v17, 0x1

    goto :goto_4

    :cond_2
    const/4 v3, 0x0

    const/16 v17, 0x0

    :goto_4
    const/16 v18, 0x1

    move-object v3, v11

    move v5, v7

    move v6, v10

    move/from16 v19, v7

    move v7, v9

    move/from16 v20, v8

    move/from16 v8, v16

    move/from16 v16, v9

    move/from16 v9, v17

    move/from16 v17, v14

    move v14, v10

    move/from16 v10, v18

    .line 69
    invoke-direct/range {v3 .. v10}, Ll/ۡܽܿ;->֫(IIIIZZZ)V

    move/from16 v4, v19

    move/from16 v3, v20

    if-lt v4, v3, :cond_3

    move/from16 v10, v16

    goto :goto_8

    :cond_3
    move v8, v3

    move v10, v14

    move/from16 v9, v16

    move/from16 v14, v17

    goto :goto_2

    :cond_4
    move/from16 v16, v9

    move/from16 v17, v14

    move v14, v10

    move/from16 v10, v16

    :goto_5
    if-ge v10, v13, :cond_5

    sub-int v3, v10, v14

    const/16 v6, 0x1f4

    if-ge v3, v6, :cond_5

    .line 77
    invoke-virtual {v1, v10}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    sub-int/2addr v3, v4

    if-gt v3, v5, :cond_5

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_5
    add-int/lit8 v3, v10, -0x1

    .line 78
    invoke-virtual {v1, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v5

    if-ne v14, v12, :cond_6

    const/4 v3, 0x1

    const/4 v8, 0x1

    goto :goto_6

    :cond_6
    const/4 v3, 0x0

    const/4 v8, 0x0

    :goto_6
    if-ne v10, v13, :cond_7

    const/4 v3, 0x1

    const/4 v9, 0x1

    goto :goto_7

    :cond_7
    const/4 v3, 0x0

    const/4 v9, 0x0

    :goto_7
    const/16 v16, 0x1

    move-object v3, v11

    move v6, v14

    move v7, v10

    move v14, v10

    move/from16 v10, v16

    invoke-direct/range {v3 .. v10}, Ll/ۡܽܿ;->֫(IIIIZZZ)V

    move v10, v14

    :goto_8
    move/from16 v14, v17

    goto/16 :goto_1

    :cond_8
    move/from16 v17, v14

    move/from16 v4, v17

    .line 84
    :goto_9
    invoke-static/range {p3 .. p3}, Ll/ۡܽܿ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 85
    invoke-static {v0, v4, v15, v2}, Ll/ۡܽܿ;->֫(Ljava/lang/CharSequence;IILjava/util/function/BooleanSupplier;)I

    move-result v14

    move/from16 v10, v17

    if-ne v4, v10, :cond_9

    const/4 v3, 0x1

    const/4 v8, 0x1

    goto :goto_a

    :cond_9
    const/4 v3, 0x0

    const/4 v8, 0x0

    :goto_a
    if-ne v14, v15, :cond_a

    const/4 v3, 0x1

    const/4 v9, 0x1

    goto :goto_b

    :cond_a
    const/4 v3, 0x0

    const/4 v9, 0x0

    :goto_b
    const/16 v16, 0x0

    move-object v3, v11

    move v5, v14

    move v6, v12

    move v7, v13

    move/from16 v17, v10

    move/from16 v10, v16

    .line 86
    invoke-direct/range {v3 .. v10}, Ll/ۡܽܿ;->֫(IIIIZZZ)V

    if-lt v14, v15, :cond_c

    :cond_b
    move v12, v13

    goto/16 :goto_0

    :cond_c
    move v4, v14

    goto :goto_9

    .line 92
    :cond_d
    invoke-direct {v11}, Ll/ۡܽܿ;->֫()V

    .line 93
    iget-object v0, v11, Ll/ۡܽܿ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method private ֫()V
    .locals 3

    .line 115
    iget-object v0, p0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 116
    :cond_0
    new-instance v0, Ll/᩷ܽܿ;

    iget-object v1, p0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    iget v2, p0, Ll/ۡܽܿ;->ܽ:I

    invoke-direct {v0, v1, v2}, Ll/᩷ܽܿ;-><init>(Ljava/util/ArrayList;I)V

    iget-object v1, p0, Ll/ۡܽܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 118
    iput v0, p0, Ll/ۡܽܿ;->ܽ:I

    return-void
.end method

.method private ֫(IIIIZZZ)V
    .locals 14

    move-object v0, p0

    move/from16 v9, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v8, p7

    const/4 v1, 0x1

    if-eqz v8, :cond_0

    sub-int v2, v5, v4

    move v10, v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const/4 v10, 0x1

    .line 98
    :goto_0
    iget-object v2, v0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const v11, 0x186a0

    if-nez v2, :cond_2

    iget v2, v0, Ll/ۡܽܿ;->ܽ:I

    add-int/2addr v2, v10

    const/16 v3, 0x1f4

    if-gt v2, v3, :cond_1

    iget-object v2, v0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    const/4 v3, 0x0

    .line 99
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢܽܿ;

    invoke-static {v2}, Ll/ۢܽܿ;->ᩳ(Ll/ۢܽܿ;)I

    move-result v2

    sub-int v2, v9, v2

    if-le v2, v11, :cond_2

    :cond_1
    invoke-direct {p0}, Ll/ۡܽܿ;->֫()V

    .line 100
    :cond_2
    iget-object v2, v0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    iget-object v2, v0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    .line 0
    invoke-static {v2, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 100
    check-cast v1, Ll/ۢܽܿ;

    :goto_1
    if-eqz v1, :cond_4

    .line 101
    invoke-static {v1}, Ll/ۢܽܿ;->ۧ(Ll/ۢܽܿ;)Z

    move-result v2

    if-ne v2, v8, :cond_4

    invoke-static {v1}, Ll/ۢܽܿ;->ܽ(Ll/ۢܽܿ;)I

    move-result v2

    if-ne v2, v4, :cond_4

    invoke-static {v1}, Ll/ۢܽܿ;->ܿ(Ll/ۢܽܿ;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz p5, :cond_4

    .line 103
    invoke-static {v1, v9}, Ll/ۢܽܿ;->֫(Ll/ۢܽܿ;I)V

    .line 104
    invoke-static {v1, v5}, Ll/ۢܽܿ;->ۧ(Ll/ۢܽܿ;I)V

    move/from16 v7, p6

    .line 105
    invoke-static {v1, v7}, Ll/ۢܽܿ;->֫(Ll/ۢܽܿ;Z)V

    goto :goto_2

    :cond_4
    move/from16 v7, p6

    .line 107
    iget-object v12, v0, Ll/ۡܽܿ;->ۧ:Ljava/util/ArrayList;

    new-instance v13, Ll/ۢܽܿ;

    move-object v1, v13

    move v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Ll/ۢܽܿ;-><init>(IIIIZZZ)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    :goto_2
    iget v1, v0, Ll/ۡܽܿ;->ܽ:I

    add-int/2addr v1, v10

    iput v1, v0, Ll/ۡܽܿ;->ܽ:I

    sub-int v1, v9, p1

    if-lt v1, v11, :cond_5

    .line 111
    invoke-direct {p0}, Ll/ۡܽܿ;->֫()V

    :cond_5
    return-void
.end method

.method public static ֫(Ljava/util/function/BooleanSupplier;)V
    .locals 1

    .line 151
    invoke-interface {p0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Wrap planning canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
