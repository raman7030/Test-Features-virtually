.class public final Ll/ۙܿܳ;
.super Ljava/lang/Object;
.source "56MU"

# interfaces
.implements Ll/ܳ֨֡;
.implements Ll/ܿ֨֡;


# instance fields
.field public ֫:Ll/ۙ᩵֡;

.field public ۧ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/ۙܿܳ;->ۧ:I

    return-void
.end method

.method private ֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V
    .locals 3

    .line 152
    invoke-virtual {p2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ֨֡;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽ֨֡;

    .line 153
    iget v2, p0, Ll/ۙܿܳ;->ۧ:I

    invoke-virtual {v1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    sub-int/2addr v2, v1

    iput v2, p0, Ll/ۙܿܳ;->ۧ:I

    goto :goto_0

    .line 155
    :cond_0
    invoke-virtual {p2, p1}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;)V

    return-void
.end method


# virtual methods
.method public final create()Ll/ܿ֨֡;
    .locals 0

    return-object p0
.end method

.method public final ֫()Ljava/util/Set;
    .locals 6

    const/16 v0, 0x24

    .line 35
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    const/16 v1, 0x5c

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    .line 0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v1, v3, v4

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "duplicate element: "

    invoke-static {v1, v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩺᩵֡;)Ll/ۙ֡֡;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 40
    invoke-virtual/range {p1 .. p1}, Ll/᩺᩵֡;->֫()Ll/ۢ֨֡;

    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܿ()I

    move-result v3

    const/16 v4, 0x24

    .line 42
    invoke-virtual {v2, v4}, Ll/ۢ֨֡;->ܽ(C)Z

    move-result v5

    const/16 v6, 0x28

    const/16 v7, 0x5b

    if-eqz v5, :cond_2

    .line 46
    invoke-virtual {v2, v4}, Ll/ۢ֨֡;->ܽ(C)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v7, "$$"

    goto :goto_0

    :cond_0
    const-string v7, "$"

    :goto_0
    if-nez v6, :cond_1

    .line 48
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܽ()C

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v8

    if-nez v8, :cond_3

    .line 49
    invoke-static {v3}, Ljava/lang/Character;->isDigit(I)Z

    move-result v8

    if-nez v8, :cond_3

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v7

    goto :goto_5

    .line 51
    :cond_2
    invoke-virtual {v2}, Ll/ۢ֨֡;->ۧ()V

    .line 52
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܽ()C

    move-result v3

    if-eq v3, v6, :cond_4

    if-eq v3, v7, :cond_4

    :cond_3
    :goto_1
    const/4 v0, 0x0

    goto/16 :goto_18

    :cond_4
    if-ne v3, v7, :cond_5

    const/4 v3, 0x1

    const/4 v6, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_6

    const-string v3, "\\["

    goto :goto_3

    :cond_6
    const-string v3, "\\("

    :goto_3
    move-object v7, v3

    if-eqz v6, :cond_7

    const-string v3, "\\]"

    goto :goto_4

    :cond_7
    const-string v3, "\\)"

    .line 57
    :goto_4
    invoke-virtual {v2}, Ll/ۢ֨֡;->ۧ()V

    .line 59
    :goto_5
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_6
    const/16 v12, 0x1000

    if-gt v8, v12, :cond_3

    .line 63
    iget v12, v1, Ll/ۙܿܳ;->ۧ:I

    if-lez v12, :cond_3

    .line 64
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܽ()C

    move-result v12

    if-eqz v12, :cond_3

    const/16 v13, 0xa

    if-eq v12, v13, :cond_3

    const/16 v13, 0x60

    if-ne v12, v13, :cond_8

    if-nez v9, :cond_8

    goto :goto_1

    :cond_8
    if-nez v9, :cond_f

    const/16 v13, 0x3c

    if-ne v12, v13, :cond_f

    .line 102
    invoke-virtual/range {p1 .. p1}, Ll/᩺᩵֡;->֫()Ll/ۢ֨֡;

    move-result-object v13

    .line 103
    invoke-virtual {v13}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v14

    .line 105
    :try_start_0
    new-instance v15, Ll/᩸֡֡;

    .line 9
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 105
    invoke-virtual {v15, v0}, Ll/᩸֡֡;->֫(Ll/᩺᩵֡;)Ll/ۙ֡֡;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v15, :cond_9

    const/4 v15, 0x1

    goto :goto_7

    :cond_9
    const/4 v15, 0x0

    .line 106
    :goto_7
    invoke-direct {v1, v14, v13}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    if-nez v15, :cond_3

    .line 111
    iget v13, v1, Ll/ۙܿܳ;->ۧ:I

    if-gtz v13, :cond_a

    move-object/from16 v16, v7

    goto :goto_a

    .line 112
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ll/᩺᩵֡;->֫()Ll/ۢ֨֡;

    move-result-object v13

    .line 113
    invoke-virtual {v13}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v14

    .line 115
    :try_start_1
    invoke-virtual {v13}, Ll/ۢ֨֡;->ۧ()V

    .line 116
    :goto_8
    invoke-virtual {v13}, Ll/ۢ֨֡;->ܽ()C

    move-result v15

    const/16 v11, 0x20

    move-object/from16 v16, v7

    const/16 v7, 0x3e

    if-le v15, v11, :cond_b

    invoke-virtual {v13}, Ll/ۢ֨֡;->ܽ()C

    move-result v11

    const/16 v15, 0x3c

    if-eq v11, v15, :cond_b

    invoke-virtual {v13}, Ll/ۢ֨֡;->ܽ()C

    move-result v11

    if-eq v11, v7, :cond_b

    invoke-virtual {v13}, Ll/ۢ֨֡;->ۧ()V

    move-object/from16 v7, v16

    goto :goto_8

    .line 117
    :cond_b
    invoke-virtual {v13}, Ll/ۢ֨֡;->ܽ()C

    move-result v11

    if-eq v11, v7, :cond_c

    goto :goto_9

    .line 119
    :cond_c
    invoke-direct {v1, v14, v13}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    .line 120
    iget v7, v1, Ll/ۙܿܳ;->ۧ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gtz v7, :cond_d

    .line 122
    :goto_9
    invoke-direct {v1, v14, v13}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    :goto_a
    const/4 v7, 0x0

    goto :goto_c

    .line 121
    :cond_d
    :try_start_2
    new-instance v7, Ll/ܺ֡֡;

    .line 13
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 121
    invoke-virtual {v7, v0}, Ll/ܺ֡֡;->֫(Ll/᩺᩵֡;)Ll/ۙ֡֡;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v7, :cond_e

    const/4 v7, 0x1

    goto :goto_b

    :cond_e
    const/4 v7, 0x0

    .line 122
    :goto_b
    invoke-direct {v1, v14, v13}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    :goto_c
    if-eqz v7, :cond_10

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    invoke-direct {v1, v14, v13}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 106
    invoke-direct {v1, v14, v13}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    throw v0

    :cond_f
    move-object/from16 v16, v7

    :cond_10
    if-nez v9, :cond_19

    const/16 v7, 0x5d

    if-ne v12, v7, :cond_19

    .line 127
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v11

    .line 129
    :try_start_3
    invoke-virtual {v2}, Ll/ۢ֨֡;->ۧ()V

    const/16 v13, 0x5b

    .line 130
    invoke-virtual {v2, v13}, Ll/ۢ֨֡;->ܽ(C)Z

    move-result v13

    if-eqz v13, :cond_13

    .line 131
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v13

    .line 132
    invoke-static {v2}, Ll/۟᩸᩵;->ۧ(Ll/ۢ֨֡;)Z

    move-result v14

    if-nez v14, :cond_11

    goto :goto_d

    .line 133
    :cond_11
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v14

    .line 134
    invoke-virtual {v2, v7}, Ll/ۢ֨֡;->ܽ(C)Z

    move-result v7

    if-nez v7, :cond_12

    :goto_d
    goto :goto_e

    .line 135
    :cond_12
    invoke-virtual {v2, v13, v14}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object v7

    invoke-virtual {v7}, Ll/ᩳ֨֡;->֫()Ljava/lang/String;

    move-result-object v7

    .line 137
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_17

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v13

    const/16 v14, 0x3e7

    if-gt v13, v14, :cond_17

    iget-object v13, v1, Ll/ۙܿܳ;->֫:Ll/ۙ᩵֡;

    .line 138
    invoke-virtual {v13, v7}, Ll/ۙ᩵֡;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_17

    .line 139
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v7

    goto :goto_f

    :cond_13
    const/16 v7, 0x28

    .line 141
    invoke-virtual {v2, v7}, Ll/ۢ֨֡;->ܽ(C)Z

    move-result v7

    if-nez v7, :cond_14

    goto :goto_e

    .line 142
    :cond_14
    invoke-virtual {v2}, Ll/ۢ֨֡;->᩻()I

    .line 143
    invoke-static {v2}, Ll/۟᩸᩵;->֫(Ll/ۢ֨֡;)Z

    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v7, :cond_15

    .line 147
    :goto_e
    invoke-direct {v1, v11, v2}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    const/4 v7, 0x0

    goto :goto_10

    .line 144
    :cond_15
    :try_start_4
    invoke-virtual {v2}, Ll/ۢ֨֡;->᩻()I

    move-result v7

    if-lez v7, :cond_16

    .line 145
    invoke-static {v2}, Ll/۟᩸᩵;->ܽ(Ll/ۢ֨֡;)Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-virtual {v2}, Ll/ۢ֨֡;->᩻()I

    :cond_16
    const/16 v7, 0x29

    .line 146
    invoke-virtual {v2, v7}, Ll/ۢ֨֡;->ܽ(C)Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_f

    :cond_17
    const/4 v7, 0x0

    .line 147
    :goto_f
    invoke-direct {v1, v11, v2}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    :goto_10
    if-eqz v7, :cond_19

    .line 72
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v10

    invoke-virtual {v2, v10, v7}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object v10

    .line 73
    invoke-virtual {v10}, Ll/ᩳ֨֡;->ۧ()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v12, 0x1

    if-eq v11, v12, :cond_18

    goto/16 :goto_1

    .line 74
    :cond_18
    invoke-virtual {v10}, Ll/ᩳ֨֡;->ۧ()Ljava/util/ArrayList;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܽ֨֡;

    invoke-virtual {v10}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v10

    .line 75
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v11

    sub-int/2addr v11, v12

    add-int/2addr v8, v11

    .line 76
    invoke-virtual {v2, v7}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;)V

    .line 77
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v7

    sub-int/2addr v7, v12

    invoke-interface {v10, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    move-object/from16 v10, v16

    goto/16 :goto_17

    :catchall_2
    move-exception v0

    .line 147
    invoke-direct {v1, v11, v2}, Ll/ۙܿܳ;->֫(Ll/᩷֨֡;Ll/ۢ֨֡;)V

    throw v0

    .line 81
    :cond_19
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v7

    if-nez v9, :cond_26

    .line 82
    invoke-virtual {v2, v3}, Ll/ۢ֨֡;->֫(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_26

    if-lez v8, :cond_25

    if-eqz v5, :cond_1a

    if-nez v6, :cond_1a

    .line 83
    invoke-static {v10}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v10

    if-nez v10, :cond_25

    .line 84
    invoke-virtual {v2}, Ll/ۢ֨֡;->ܽ()C

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->isDigit(C)Z

    move-result v10

    if-nez v10, :cond_25

    invoke-virtual {v2}, Ll/ۢ֨֡;->ܽ()C

    move-result v10

    const/16 v11, 0x24

    if-eq v10, v11, :cond_25

    .line 85
    :cond_1a
    invoke-virtual {v2, v4, v7}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ֨֡;->֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v5, :cond_24

    if-nez v6, :cond_24

    const/4 v4, 0x0

    .line 160
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v5

    if-nez v5, :cond_1b

    goto/16 :goto_14

    :cond_1b
    const/4 v5, 0x0

    .line 162
    :goto_11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v5, v7, :cond_1d

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    move-result v7

    if-nez v7, :cond_1c

    .line 163
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x2e

    if-eq v7, v8, :cond_1c

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x2c

    if-ne v7, v8, :cond_1d

    :cond_1c
    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    .line 164
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v5, v7, :cond_1e

    goto :goto_14

    .line 165
    :cond_1e
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x3b

    if-eq v7, v8, :cond_22

    const/16 v8, 0x3a

    if-eq v7, v8, :cond_22

    const/16 v8, 0x21

    if-eq v7, v8, :cond_22

    const/16 v8, 0x3f

    if-ne v7, v8, :cond_1f

    goto :goto_13

    .line 167
    :cond_1f
    invoke-static {v7}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v7

    if-nez v7, :cond_20

    goto :goto_14

    .line 168
    :cond_20
    :goto_12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v5, v7, :cond_21

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v7

    if-eqz v7, :cond_21

    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    .line 169
    :cond_21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eq v5, v7, :cond_22

    const-string v7, "+-=*/^_\\<>$"

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v7, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-gez v5, :cond_23

    :cond_22
    :goto_13
    const/4 v4, 0x1

    :cond_23
    :goto_14
    if-nez v4, :cond_3

    .line 87
    :cond_24
    new-instance v4, Ll/᩶ܿܳ;

    move-object/from16 v10, v16

    .line 0
    invoke-static {v10, v0, v3}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 87
    invoke-direct {v4, v0, v3, v6}, Ll/᩶ܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v2}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v0

    .line 21
    new-instance v2, Ll/ۙ֡֡;

    invoke-direct {v2, v4, v0}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object v2

    :cond_25
    move-object/from16 v10, v16

    .line 91
    invoke-virtual {v2, v7}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;)V

    goto :goto_15

    :cond_26
    move-object/from16 v10, v16

    :goto_15
    const/16 v7, 0x5c

    if-ne v12, v7, :cond_27

    if-nez v9, :cond_27

    const/4 v7, 0x1

    goto :goto_16

    :cond_27
    const/4 v7, 0x0

    .line 95
    :goto_16
    invoke-virtual {v2}, Ll/ۢ֨֡;->ۧ()V

    move v9, v7

    move v7, v12

    :goto_17
    add-int/lit8 v8, v8, 0x1

    .line 63
    iget v11, v1, Ll/ۙܿܳ;->ۧ:I

    add-int/lit8 v11, v11, -0x1

    iput v11, v1, Ll/ۙܿܳ;->ۧ:I

    move-object/from16 v17, v10

    move v10, v7

    move-object/from16 v7, v17

    goto/16 :goto_6

    :goto_18
    return-object v0
.end method

.method public final ֫(Ll/ۙ᩵֡;)V
    .locals 0

    .line 33
    iput-object p1, p0, Ll/ۙܿܳ;->֫:Ll/ۙ᩵֡;

    return-void
.end method
