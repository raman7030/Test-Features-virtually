.class public final Ll/ۛܽܿ;
.super Ljava/lang/Object;
.source "B7TD"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/᩵ܽܿ;)Ll/ۤܽܿ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 178
    invoke-virtual/range {p2 .. p2}, Ll/᩵ܽܿ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ll/᩵ܽܿ;->֫()Ljava/lang/String;

    move-result-object v3

    .line 33
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_3

    .line 38
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 45
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v6, v11, :cond_7

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v7, v11, :cond_7

    .line 46
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v11

    .line 47
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v12

    .line 48
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v11, v12, :cond_6

    .line 51
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    rsub-int/lit8 v11, v7, 0xf

    .line 95
    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v11

    add-int/lit8 v12, v11, 0xa

    if-nez v7, :cond_1

    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v14

    add-int/lit8 v15, v7, -0x1

    .line 119
    invoke-virtual {v2, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    .line 122
    invoke-static {v15}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-static {v14}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v16

    if-eqz v16, :cond_2

    goto :goto_1

    .line 127
    :cond_2
    invoke-static {v15}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v15

    if-nez v15, :cond_3

    invoke-static {v14}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v14

    if-eqz v14, :cond_3

    :goto_1
    add-int/lit8 v12, v11, 0x1e

    :cond_3
    if-eqz v9, :cond_4

    const/4 v9, 0x5

    const/16 v11, 0xf

    .line 103
    invoke-static {v10, v9, v11, v12}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v12

    :cond_4
    add-int/2addr v8, v12

    .line 57
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v13, :cond_5

    .line 58
    invoke-static {v13}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v9

    if-eqz v9, :cond_5

    add-int/lit8 v8, v8, 0x5

    :cond_5
    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v10, v10, 0x1

    const/4 v9, 0x1

    goto :goto_2

    :cond_6
    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 74
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_8

    :goto_3
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_8
    invoke-static {v4}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v6, Ll/۫ܳᩳ;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-interface {v4, v6}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v4

    invoke-interface {v4}, Ll/ۧ᩺ᩴ;->toArray()[I

    move-result-object v4

    .line 141
    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 143
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x50

    goto :goto_4

    :cond_9
    const/16 v1, 0x32

    goto :goto_4

    :cond_a
    const/4 v1, 0x0

    .line 151
    :goto_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    rsub-int/lit8 v3, v3, 0x32

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v1

    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    add-int/lit8 v3, v3, 0x64

    .line 159
    :cond_b
    array-length v0, v4

    const/4 v1, 0x1

    if-le v0, v1, :cond_c

    .line 160
    array-length v0, v4

    sub-int/2addr v0, v1

    aget v0, v4, v0

    aget v5, v4, v5

    sub-int/2addr v0, v5

    add-int/2addr v0, v1

    .line 161
    array-length v1, v4

    mul-int/lit8 v1, v1, 0x64

    div-int/2addr v1, v0

    .line 162
    div-int/lit8 v1, v1, 0xa

    add-int/2addr v3, v1

    :cond_c
    add-int/2addr v8, v3

    .line 84
    new-instance v0, Ll/ۤܽܿ;

    invoke-direct {v0, v2, v8, v4}, Ll/ۤܽܿ;-><init>(Ljava/lang/String;I[I)V

    return-object v0
.end method
