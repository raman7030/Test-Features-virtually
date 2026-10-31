.class public final Ll/᩷ۙۧ;
.super Ljava/lang/Object;
.source "I5WF"


# static fields
.field public static final ֫:Ljava/util/Comparator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 87
    new-instance v0, Ll/֫ۙۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩷ۙۧ;->֫:Ljava/util/Comparator;

    return-void
.end method

.method public static ֫(Ll/ۧۙۧ;)Ll/ܿۙۧ;
    .locals 19

    move-object/from16 v0, p0

    .line 124
    invoke-virtual/range {p0 .. p0}, Ll/ۧۙۧ;->ۧ()I

    move-result v1

    .line 125
    invoke-virtual/range {p0 .. p0}, Ll/ۧۙۧ;->֫()I

    move-result v2

    .line 127
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 131
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 133
    new-instance v5, Ll/᩻ۙۧ;

    .line 580
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const/4 v6, 0x0

    .line 581
    iput v6, v5, Ll/᩻ۙۧ;->ᩳ:I

    .line 582
    iput v1, v5, Ll/᩻ۙۧ;->ܽ:I

    .line 583
    iput v6, v5, Ll/᩻ۙۧ;->ۧ:I

    .line 584
    iput v2, v5, Ll/᩻ۙۧ;->֫:I

    .line 133
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v2

    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 135
    div-int/lit8 v1, v1, 0x2

    .line 139
    new-instance v5, Ll/ܽۙۧ;

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v2

    invoke-direct {v5, v1}, Ll/ܽۙۧ;-><init>(I)V

    .line 140
    new-instance v6, Ll/ܽۙۧ;

    invoke-direct {v6, v1}, Ll/ܽۙۧ;-><init>(I)V

    .line 143
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 144
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1c

    .line 0
    invoke-static {v4, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v7

    .line 145
    check-cast v7, Ll/᩻ۙۧ;

    .line 191
    invoke-virtual {v7}, Ll/᩻ۙۧ;->ۧ()I

    move-result v8

    if-lt v8, v2, :cond_15

    invoke-virtual {v7}, Ll/᩻ۙۧ;->֫()I

    move-result v8

    if-ge v8, v2, :cond_0

    goto/16 :goto_11

    .line 194
    :cond_0
    invoke-virtual {v7}, Ll/᩻ۙۧ;->ۧ()I

    move-result v8

    invoke-virtual {v7}, Ll/᩻ۙۧ;->֫()I

    move-result v9

    add-int/2addr v8, v9

    add-int/2addr v8, v2

    div-int/lit8 v8, v8, 0x2

    .line 195
    iget v9, v7, Ll/᩻ۙۧ;->ᩳ:I

    invoke-virtual {v5, v2, v9}, Ll/ܽۙۧ;->֫(II)V

    .line 196
    iget v9, v7, Ll/᩻ۙۧ;->ܽ:I

    invoke-virtual {v6, v2, v9}, Ll/ܽۙۧ;->֫(II)V

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_15

    .line 217
    invoke-virtual {v7}, Ll/᩻ۙۧ;->ۧ()I

    move-result v10

    invoke-virtual {v7}, Ll/᩻ۙۧ;->֫()I

    move-result v11

    sub-int/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    rem-int/lit8 v10, v10, 0x2

    if-ne v10, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    .line 218
    :goto_2
    invoke-virtual {v7}, Ll/᩻ۙۧ;->ۧ()I

    move-result v10

    invoke-virtual {v7}, Ll/᩻ۙۧ;->֫()I

    move-result v11

    sub-int/2addr v10, v11

    neg-int v11, v9

    move v12, v11

    :goto_3
    if-gt v12, v9, :cond_9

    if-eq v12, v11, :cond_3

    if-eq v12, v9, :cond_2

    add-int/lit8 v13, v12, 0x1

    .line 226
    invoke-virtual {v5, v13}, Ll/ܽۙۧ;->֫(I)I

    move-result v13

    add-int/lit8 v14, v12, -0x1

    invoke-virtual {v5, v14}, Ll/ܽۙۧ;->֫(I)I

    move-result v14

    if-le v13, v14, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v13, v12, -0x1

    .line 231
    invoke-virtual {v5, v13}, Ll/ܽۙۧ;->֫(I)I

    move-result v13

    add-int/lit8 v14, v13, 0x1

    goto :goto_5

    :cond_3
    :goto_4
    add-int/lit8 v13, v12, 0x1

    .line 228
    invoke-virtual {v5, v13}, Ll/ܽۙۧ;->֫(I)I

    move-result v13

    move v14, v13

    .line 234
    :goto_5
    iget v15, v7, Ll/᩻ۙۧ;->ۧ:I

    move/from16 v16, v8

    iget v8, v7, Ll/᩻ۙۧ;->ᩳ:I

    sub-int v8, v14, v8

    add-int/2addr v8, v15

    sub-int/2addr v8, v12

    if-eqz v9, :cond_5

    if-eq v14, v13, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v15, v8, -0x1

    goto :goto_7

    :cond_5
    :goto_6
    move v15, v8

    :goto_7
    move-object/from16 v17, v4

    .line 237
    :goto_8
    iget v4, v7, Ll/᩻ۙۧ;->ܽ:I

    if-ge v14, v4, :cond_6

    iget v4, v7, Ll/᩻ۙۧ;->֫:I

    if-ge v8, v4, :cond_6

    .line 239
    invoke-virtual {v0, v14, v8}, Ll/ۧۙۧ;->ۧ(II)Z

    move-result v4

    if-eqz v4, :cond_6

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    .line 244
    :cond_6
    invoke-virtual {v5, v12, v14}, Ll/ܽۙۧ;->֫(II)V

    if-eqz v2, :cond_7

    sub-int v4, v10, v12

    move/from16 v18, v2

    add-int/lit8 v2, v11, 0x1

    if-lt v4, v2, :cond_8

    add-int/lit8 v2, v9, -0x1

    if-gt v4, v2, :cond_8

    .line 252
    invoke-virtual {v6, v4}, Ll/ܽۙۧ;->֫(I)I

    move-result v2

    if-gt v2, v14, :cond_8

    .line 254
    new-instance v2, Ll/ۜۙۧ;

    .line 501
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 255
    iput v13, v2, Ll/ۜۙۧ;->ᩳ:I

    .line 256
    iput v15, v2, Ll/ۜۙۧ;->ܿ:I

    .line 257
    iput v14, v2, Ll/ۜۙۧ;->֫:I

    .line 258
    iput v8, v2, Ll/ۜۙۧ;->ۧ:I

    const/4 v4, 0x0

    .line 259
    iput-boolean v4, v2, Ll/ۜۙۧ;->ܽ:Z

    goto :goto_9

    :cond_7
    move/from16 v18, v2

    :cond_8
    add-int/lit8 v12, v12, 0x2

    move/from16 v8, v16

    move-object/from16 v4, v17

    move/from16 v2, v18

    goto :goto_3

    :cond_9
    move-object/from16 v17, v4

    move/from16 v16, v8

    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_a

    move-object/from16 v18, v7

    goto/16 :goto_12

    .line 274
    :cond_a
    invoke-virtual {v7}, Ll/᩻ۙۧ;->ۧ()I

    move-result v2

    invoke-virtual {v7}, Ll/᩻ۙۧ;->֫()I

    move-result v4

    sub-int/2addr v2, v4

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_b

    const/4 v2, 0x1

    goto :goto_a

    :cond_b
    const/4 v2, 0x0

    .line 275
    :goto_a
    invoke-virtual {v7}, Ll/᩻ۙۧ;->ۧ()I

    move-result v4

    invoke-virtual {v7}, Ll/᩻ۙۧ;->֫()I

    move-result v8

    sub-int/2addr v4, v8

    move v8, v11

    :goto_b
    if-gt v8, v9, :cond_13

    if-eq v8, v11, :cond_d

    if-eq v8, v9, :cond_c

    add-int/lit8 v10, v8, 0x1

    .line 287
    invoke-virtual {v6, v10}, Ll/ܽۙۧ;->֫(I)I

    move-result v10

    add-int/lit8 v12, v8, -0x1

    invoke-virtual {v6, v12}, Ll/ܽۙۧ;->֫(I)I

    move-result v12

    if-ge v10, v12, :cond_c

    goto :goto_c

    :cond_c
    add-int/lit8 v10, v8, -0x1

    .line 292
    invoke-virtual {v6, v10}, Ll/ܽۙۧ;->֫(I)I

    move-result v10

    add-int/lit8 v12, v10, -0x1

    goto :goto_d

    :cond_d
    :goto_c
    add-int/lit8 v10, v8, 0x1

    .line 289
    invoke-virtual {v6, v10}, Ll/ܽۙۧ;->֫(I)I

    move-result v10

    move v12, v10

    .line 295
    :goto_d
    iget v13, v7, Ll/᩻ۙۧ;->֫:I

    iget v14, v7, Ll/᩻ۙۧ;->ܽ:I

    sub-int/2addr v14, v12

    sub-int/2addr v14, v8

    sub-int/2addr v13, v14

    if-eqz v9, :cond_f

    if-eq v12, v10, :cond_e

    goto :goto_e

    :cond_e
    add-int/lit8 v14, v13, 0x1

    goto :goto_f

    :cond_f
    :goto_e
    move v14, v13

    .line 298
    :goto_f
    iget v15, v7, Ll/᩻ۙۧ;->ᩳ:I

    if-le v12, v15, :cond_10

    iget v15, v7, Ll/᩻ۙۧ;->ۧ:I

    if-le v13, v15, :cond_10

    add-int/lit8 v15, v12, -0x1

    move-object/from16 v18, v7

    add-int/lit8 v7, v13, -0x1

    .line 300
    invoke-virtual {v0, v15, v7}, Ll/ۧۙۧ;->ۧ(II)Z

    move-result v7

    if-eqz v7, :cond_11

    add-int/lit8 v12, v12, -0x1

    add-int/lit8 v13, v13, -0x1

    move-object/from16 v7, v18

    goto :goto_f

    :cond_10
    move-object/from16 v18, v7

    .line 305
    :cond_11
    invoke-virtual {v6, v8, v12}, Ll/ܽۙۧ;->֫(II)V

    if-eqz v2, :cond_12

    sub-int v7, v4, v8

    if-lt v7, v11, :cond_12

    if-gt v7, v9, :cond_12

    .line 313
    invoke-virtual {v5, v7}, Ll/ܽۙۧ;->֫(I)I

    move-result v7

    if-lt v7, v12, :cond_12

    .line 315
    new-instance v2, Ll/ۜۙۧ;

    .line 501
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 317
    iput v12, v2, Ll/ۜۙۧ;->ᩳ:I

    .line 318
    iput v13, v2, Ll/ۜۙۧ;->ܿ:I

    .line 319
    iput v10, v2, Ll/ۜۙۧ;->֫:I

    .line 320
    iput v14, v2, Ll/ۜۙۧ;->ۧ:I

    const/4 v4, 0x1

    .line 321
    iput-boolean v4, v2, Ll/ۜۙۧ;->ܽ:Z

    goto :goto_10

    :cond_12
    add-int/lit8 v8, v8, 0x2

    move-object/from16 v7, v18

    goto :goto_b

    :cond_13
    move-object/from16 v18, v7

    const/4 v2, 0x0

    :goto_10
    if-eqz v2, :cond_14

    goto :goto_12

    :cond_14
    add-int/lit8 v9, v9, 0x1

    const/4 v2, 0x1

    move/from16 v8, v16

    move-object/from16 v4, v17

    move-object/from16 v7, v18

    goto/16 :goto_1

    :cond_15
    :goto_11
    move-object/from16 v17, v4

    move-object/from16 v18, v7

    const/4 v2, 0x0

    :goto_12
    if-eqz v2, :cond_1b

    .line 149
    invoke-virtual {v2}, Ll/ۜۙۧ;->֫()I

    move-result v4

    if-lez v4, :cond_19

    .line 528
    iget v4, v2, Ll/ۜۙۧ;->ۧ:I

    iget v7, v2, Ll/ۜۙۧ;->ܿ:I

    sub-int/2addr v4, v7

    iget v8, v2, Ll/ۜۙۧ;->֫:I

    iget v9, v2, Ll/ۜۙۧ;->ᩳ:I

    sub-int/2addr v8, v9

    if-eq v4, v8, :cond_18

    .line 546
    iget-boolean v10, v2, Ll/ۜۙۧ;->ܽ:Z

    if-eqz v10, :cond_16

    .line 548
    new-instance v4, Ll/ᩳۙۧ;

    invoke-virtual {v2}, Ll/ۜۙۧ;->֫()I

    move-result v8

    invoke-direct {v4, v9, v7, v8}, Ll/ᩳۙۧ;-><init>(III)V

    goto :goto_13

    :cond_16
    if-le v4, v8, :cond_17

    .line 552
    new-instance v4, Ll/ᩳۙۧ;

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v2}, Ll/ۜۙۧ;->֫()I

    move-result v8

    invoke-direct {v4, v9, v7, v8}, Ll/ᩳۙۧ;-><init>(III)V

    goto :goto_13

    .line 554
    :cond_17
    new-instance v4, Ll/ᩳۙۧ;

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v2}, Ll/ۜۙۧ;->֫()I

    move-result v8

    invoke-direct {v4, v9, v7, v8}, Ll/ᩳۙۧ;-><init>(III)V

    goto :goto_13

    .line 559
    :cond_18
    new-instance v4, Ll/ᩳۙۧ;

    invoke-direct {v4, v9, v7, v8}, Ll/ᩳۙۧ;-><init>(III)V

    .line 150
    :goto_13
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    :cond_19
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1a

    new-instance v4, Ll/᩻ۙۧ;

    invoke-direct {v4}, Ll/᩻ۙۧ;-><init>()V

    const/4 v7, 0x1

    goto :goto_14

    :cond_1a
    const/4 v7, 0x1

    .line 0
    invoke-static {v1, v7}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v4

    .line 153
    check-cast v4, Ll/᩻ۙۧ;

    :goto_14
    move-object/from16 v8, v18

    .line 155
    iget v9, v8, Ll/᩻ۙۧ;->ᩳ:I

    iput v9, v4, Ll/᩻ۙۧ;->ᩳ:I

    .line 156
    iget v9, v8, Ll/᩻ۙۧ;->ۧ:I

    iput v9, v4, Ll/᩻ۙۧ;->ۧ:I

    .line 157
    iget v9, v2, Ll/ۜۙۧ;->ᩳ:I

    iput v9, v4, Ll/᩻ۙۧ;->ܽ:I

    .line 158
    iget v9, v2, Ll/ۜۙۧ;->ܿ:I

    iput v9, v4, Ll/᩻ۙۧ;->֫:I

    move-object/from16 v9, v17

    .line 159
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    iget v4, v8, Ll/᩻ۙۧ;->ܽ:I

    iput v4, v8, Ll/᩻ۙۧ;->ܽ:I

    .line 165
    iget v4, v8, Ll/᩻ۙۧ;->֫:I

    iput v4, v8, Ll/᩻ۙۧ;->֫:I

    .line 166
    iget v4, v2, Ll/ۜۙۧ;->֫:I

    iput v4, v8, Ll/᩻ۙۧ;->ᩳ:I

    .line 167
    iget v2, v2, Ll/ۜۙۧ;->ۧ:I

    iput v2, v8, Ll/᩻ۙۧ;->ۧ:I

    .line 168
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v7

    goto :goto_15

    :cond_1b
    move-object/from16 v9, v17

    move-object/from16 v8, v18

    const/4 v2, 0x1

    .line 170
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_15
    move-object v4, v9

    goto/16 :goto_0

    .line 175
    :cond_1c
    sget-object v1, Ll/᩷ۙۧ;->֫:Ljava/util/Comparator;

    invoke-static {v3, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 177
    new-instance v1, Ll/ܿۙۧ;

    .line 178
    invoke-virtual {v5}, Ll/ܽۙۧ;->֫()[I

    move-result-object v2

    invoke-virtual {v6}, Ll/ܽۙۧ;->֫()[I

    move-result-object v4

    invoke-direct {v1, v0, v3, v2, v4}, Ll/ܿۙۧ;-><init>(Ll/ۧۙۧ;Ljava/util/ArrayList;[I[I)V

    return-object v1
.end method
