.class public final Ll/ۘ۬ܳ;
.super Ljava/lang/Object;
.source "P712"


# direct methods
.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0x2e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2c

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p0, v0, :cond_1

    const/16 v0, 0x23

    if-eq p0, v0, :cond_1

    const/16 v0, 0x24

    if-eq p0, v0, :cond_1

    const/16 v0, 0x7b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x7d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x28

    if-eq p0, v0, :cond_1

    const/16 v0, 0x29

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5d

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

.method public static ֫(Ljava/util/List;)Z
    .locals 16

    .line 32
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 33
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    int-to-float v0, v1

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float v0, v0, v1

    float-to-int v0, v0

    const/4 v1, 0x1

    .line 38
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 42
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/16 v4, 0x41

    const/16 v5, 0x61

    const/4 v6, 0x2

    if-eqz v3, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 43
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    const/16 v12, 0x10

    if-ge v8, v7, :cond_11

    .line 71
    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    move-result v13

    .line 72
    invoke-static {v13}, Ll/ۘ۬ܳ;->ۧ(C)Z

    move-result v14

    if-eqz v14, :cond_a

    add-int/lit8 v9, v9, 0x1

    const/16 v12, 0x46

    const/16 v14, 0x66

    if-lez v10, :cond_5

    add-int/lit8 v10, v10, 0x1

    if-lt v13, v5, :cond_3

    if-le v13, v14, :cond_4

    :cond_3
    if-lt v13, v4, :cond_10

    if-gt v13, v12, :cond_10

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_5
    if-eqz v8, :cond_6

    add-int/lit8 v15, v8, -0x1

    .line 79
    invoke-virtual {v3, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    invoke-static {v15}, Ll/ۘ۬ܳ;->֫(C)Z

    move-result v15

    if-eqz v15, :cond_10

    :cond_6
    if-lt v13, v5, :cond_7

    if-le v13, v14, :cond_8

    :cond_7
    if-lt v13, v4, :cond_9

    if-gt v13, v12, :cond_9

    :cond_8
    const/4 v10, 0x1

    goto :goto_2

    :cond_9
    const/4 v10, 0x0

    :goto_2
    const/4 v11, 0x1

    move v11, v10

    const/4 v10, 0x1

    goto :goto_4

    :cond_a
    if-ge v9, v12, :cond_b

    if-lt v10, v12, :cond_c

    if-lt v11, v6, :cond_c

    .line 88
    :cond_b
    invoke-static {v13}, Ll/ۘ۬ܳ;->֫(C)Z

    move-result v9

    if-eqz v9, :cond_c

    goto :goto_5

    :cond_c
    const/16 v9, 0x2d

    if-eq v13, v9, :cond_d

    const/16 v9, 0x5f

    if-eq v13, v9, :cond_d

    const/16 v9, 0x3a

    if-ne v13, v9, :cond_f

    :cond_d
    add-int/lit8 v9, v8, 0x1

    if-ge v9, v7, :cond_f

    .line 92
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ll/ۘ۬ܳ;->ۧ(C)Z

    move-result v9

    if-nez v9, :cond_e

    goto :goto_3

    :cond_e
    const/4 v9, 0x0

    goto :goto_4

    :cond_f
    :goto_3
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :cond_10
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_11
    if-ge v9, v12, :cond_12

    if-lt v10, v12, :cond_2

    if-lt v11, v6, :cond_2

    :cond_12
    :goto_5
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v0, :cond_2

    goto/16 :goto_12

    .line 48
    :cond_13
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 49
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/16 v4, 0x2e

    if-eqz v3, :cond_25

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 50
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v6

    if-eqz v6, :cond_15

    goto :goto_6

    .line 53
    :cond_15
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v6, "."

    .line 106
    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    .line 107
    invoke-virtual {v3, v4, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-le v4, v6, :cond_16

    goto :goto_7

    .line 108
    :cond_16
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    :goto_7
    sub-int v7, v4, v6

    const/16 v8, 0x14

    if-ge v7, v8, :cond_18

    :cond_17
    const/4 v7, 0x0

    goto/16 :goto_d

    :cond_18
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    :goto_8
    if-ge v6, v4, :cond_24

    .line 117
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x7a

    const/16 v14, 0x39

    const/16 v15, 0x30

    if-lt v12, v15, :cond_19

    if-gt v12, v14, :cond_19

    const/4 v9, 0x0

    const/4 v12, 0x1

    goto :goto_a

    :cond_19
    const/16 v14, 0x5a

    if-lt v12, v5, :cond_1a

    if-le v12, v13, :cond_1b

    :cond_1a
    const/16 v15, 0x41

    if-lt v12, v15, :cond_22

    if-gt v12, v14, :cond_22

    :cond_1b
    if-gt v12, v14, :cond_1c

    const/4 v8, 0x2

    goto :goto_9

    :cond_1c
    const/4 v8, 0x1

    :goto_9
    const/4 v12, 0x1

    move v12, v9

    move v9, v8

    const/4 v8, 0x1

    :goto_a
    const/4 v14, 0x2

    const/4 v15, 0x1

    if-ne v11, v14, :cond_1d

    if-eq v9, v15, :cond_1f

    :cond_1d
    if-ne v11, v15, :cond_20

    if-ne v9, v14, :cond_20

    add-int/lit8 v14, v6, 0x1

    if-ge v14, v4, :cond_20

    .line 133
    invoke-virtual {v3, v14}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_1e

    invoke-virtual {v3, v14}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-le v15, v13, :cond_1f

    .line 134
    :cond_1e
    invoke-virtual {v3, v14}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v15, 0x30

    if-lt v13, v15, :cond_20

    invoke-virtual {v3, v14}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x39

    if-gt v13, v14, :cond_20

    :cond_1f
    const/4 v13, 0x1

    goto :goto_b

    :cond_20
    const/4 v13, 0x0

    :goto_b
    const/4 v14, -0x1

    if-eq v11, v14, :cond_21

    if-eq v11, v9, :cond_21

    if-nez v13, :cond_21

    add-int/lit8 v10, v10, 0x1

    :cond_21
    move v11, v9

    move v9, v12

    goto :goto_c

    :cond_22
    const/16 v13, 0x2d

    const/16 v14, 0x5f

    if-eq v12, v13, :cond_23

    if-ne v12, v14, :cond_17

    :cond_23
    :goto_c
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_24
    if-eqz v8, :cond_17

    if-eqz v9, :cond_17

    const/4 v4, 0x4

    if-lt v10, v4, :cond_17

    :goto_d
    if-lez v7, :cond_14

    .line 57
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v6, Ll/ۛۚۢ;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Ll/ۛۚۢ;-><init>(I)V

    invoke-static {v1, v4, v6}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_25
    const/4 v2, 0x4

    .line 149
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 150
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_26
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 151
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 152
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 153
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v5, v0, :cond_27

    goto :goto_e

    :cond_27
    const/16 v6, 0x80

    new-array v6, v6, [I

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_f
    if-ge v7, v3, :cond_2b

    .line 161
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_29

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const/4 v12, 0x0

    .line 162
    invoke-virtual {v11, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-ne v12, v4, :cond_28

    const/4 v12, 0x1

    goto :goto_11

    :cond_28
    const/4 v12, 0x0

    :goto_11
    add-int/2addr v12, v7

    .line 163
    invoke-virtual {v11, v12}, Ljava/lang/String;->charAt(I)C

    move-result v11

    aget v12, v6, v11

    add-int/lit8 v12, v12, 0x1

    aput v12, v6, v11

    .line 164
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    goto :goto_10

    :cond_29
    mul-int/lit8 v10, v10, 0x2

    if-gt v10, v5, :cond_2a

    add-int/lit8 v8, v8, 0x1

    :cond_2a
    const/4 v9, 0x0

    .line 169
    invoke-static {v6, v9}, Ljava/util/Arrays;->fill([II)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_f

    :cond_2b
    mul-int/lit8 v8, v8, 0x2

    if-lt v8, v3, :cond_26

    :goto_12
    const/4 v0, 0x1

    return v0

    :cond_2c
    const/4 v0, 0x0

    return v0
.end method

.method public static ۧ(C)Z
    .locals 1

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-le p0, v0, :cond_2

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-le p0, v0, :cond_2

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_3

    const/16 v0, 0x46

    if-gt p0, v0, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method
