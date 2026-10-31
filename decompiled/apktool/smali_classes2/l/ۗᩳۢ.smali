.class public final Ll/ۗᩳۢ;
.super Ljava/lang/Object;
.source "F7HX"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[C

.field public static final ܽ:[J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x400

    new-array v0, v0, [J

    .line 17
    sput-object v0, Ll/ۗᩳۢ;->ܽ:[J

    const-wide/16 v1, -0x1

    .line 21
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([JJ)V

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    .line 24
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x21

    :goto_1
    const/16 v1, 0x23

    if-gt v0, v1, :cond_1

    .line 26
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/16 v0, 0x25

    :goto_2
    const/16 v1, 0x2c

    if-gt v0, v1, :cond_2

    .line 28
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    const/16 v0, 0x2e

    .line 30
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    const/16 v0, 0x3a

    :goto_3
    const/16 v1, 0x40

    if-gt v0, v1, :cond_3

    .line 32
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    const/16 v0, 0x5b

    :goto_4
    const/16 v1, 0x5e

    if-gt v0, v1, :cond_4

    .line 34
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    const/16 v0, 0x60

    .line 36
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    const/16 v0, 0x7b

    :goto_5
    const/16 v1, 0x7f

    if-gt v0, v1, :cond_5

    .line 38
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_5
    const v0, 0xdc00

    :goto_6
    const v1, 0xdfff

    if-gt v0, v1, :cond_6

    .line 40
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_6
    const/16 v0, 0x2028

    .line 42
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    const v0, 0xfff0

    .line 44
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    const v0, 0xfff8

    .line 45
    invoke-static {v0}, Ll/ۗᩳۢ;->֫(I)V

    const/4 v0, 0x2

    new-array v0, v0, [C

    .line 151
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗᩳۢ;->ۧ:[C

    return-void

    :array_0
    .array-data 2
        0x2ds
        0x3es
    .end array-data
.end method

.method public static ֫(III[C[C)I
    .locals 7

    const/4 v0, 0x0

    if-gez p2, :cond_0

    const/4 p2, 0x0

    :cond_0
    if-nez p1, :cond_1

    return p2

    :cond_1
    add-int v1, p2, p1

    const/4 v2, -0x1

    if-le v1, p0, :cond_2

    return v2

    .line 67
    :cond_2
    aget-char v0, p4, v0

    sub-int/2addr p0, p1

    :goto_0
    if-gt p2, p0, :cond_6

    .line 72
    aget-char v1, p3, p2

    const/4 v3, 0x1

    if-eq v1, v0, :cond_3

    :goto_1
    add-int/2addr p2, v3

    if-gt p2, p0, :cond_3

    .line 73
    aget-char v1, p3, p2

    if-eq v1, v0, :cond_3

    goto :goto_1

    :cond_3
    if-gt p2, p0, :cond_5

    add-int/lit8 v1, p2, 0x1

    add-int v4, p2, p1

    :goto_2
    if-ge v1, v4, :cond_4

    .line 79
    aget-char v5, p3, v1

    aget-char v6, p4, v3

    if-ne v5, v6, :cond_4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    if-ne v1, v4, :cond_5

    return p2

    :cond_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    return v2
.end method

.method public static ֫([CI[CI[CI)Ljava/util/ArrayList;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p5

    .line 178
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 181
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/16 v8, 0x1f4

    if-ge v7, v8, :cond_14

    .line 183
    sget-object v7, Ll/ۗᩳۢ;->ۧ:[C

    const/4 v8, 0x2

    invoke-static {v1, v8, v6, v0, v7}, Ll/ۗᩳۢ;->֫(III[C[C)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_0

    goto/16 :goto_b

    :cond_0
    add-int/lit8 v9, v6, -0x1

    :goto_1
    const/16 v10, 0x9

    const/16 v11, 0x20

    if-ltz v9, :cond_2

    .line 118
    aget-char v12, v0, v9

    if-eq v12, v11, :cond_1

    if-ne v12, v10, :cond_2

    :cond_1
    add-int/lit8 v9, v9, -0x1

    goto :goto_1

    :cond_2
    if-gez v9, :cond_4

    :goto_2
    move-object/from16 v12, p2

    :cond_3
    :goto_3
    move-object/from16 v10, p4

    goto/16 :goto_a

    :cond_4
    if-ltz v9, :cond_7

    .line 130
    aget-char v12, v0, v9

    const/16 v13, 0x3b

    if-eq v12, v13, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v12, v9, -0x1

    const/4 v13, -0x1

    :goto_4
    if-ltz v12, :cond_8

    .line 136
    aget-char v14, v0, v12

    const/16 v15, 0x4c

    if-ne v14, v15, :cond_6

    move v13, v12

    :cond_6
    ushr-int/lit8 v15, v14, 0x6

    .line 54
    sget-object v16, Ll/ۗᩳۢ;->ܽ:[J

    aget-wide v15, v16, v15

    and-int/lit8 v14, v14, 0x3f

    const-wide/16 v17, 0x1

    shl-long v17, v17, v14

    and-long v14, v15, v17

    const-wide/16 v16, 0x0

    cmp-long v18, v14, v16

    if-eqz v18, :cond_8

    add-int/lit8 v12, v12, -0x1

    goto :goto_4

    :cond_7
    :goto_5
    const/4 v13, -0x1

    :cond_8
    if-ne v13, v7, :cond_9

    goto :goto_2

    :cond_9
    add-int/lit8 v7, v6, 0x2

    :goto_6
    if-ge v7, v1, :cond_b

    .line 110
    aget-char v12, v0, v7

    if-eq v12, v11, :cond_a

    if-ne v12, v10, :cond_b

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_b
    move-object/from16 v12, p2

    .line 204
    invoke-static {v1, v7, v2, v0, v12}, Ll/ۗᩳۢ;->ۧ(III[C[C)Z

    move-result v14

    if-nez v14, :cond_c

    :goto_7
    goto :goto_3

    :cond_c
    add-int/2addr v7, v2

    const/16 v14, 0x3a

    if-ge v7, v1, :cond_e

    .line 212
    aget-char v15, v0, v7

    if-eq v15, v11, :cond_e

    if-ne v15, v10, :cond_d

    goto :goto_8

    :cond_d
    if-eq v15, v14, :cond_e

    goto :goto_7

    :cond_e
    :goto_8
    if-ge v7, v1, :cond_10

    .line 110
    aget-char v15, v0, v7

    if-eq v15, v11, :cond_f

    if-ne v15, v10, :cond_10

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_10
    if-ge v7, v1, :cond_3

    .line 222
    aget-char v15, v0, v7

    if-eq v15, v14, :cond_11

    goto :goto_7

    :cond_11
    :goto_9
    add-int/lit8 v7, v7, 0x1

    if-ge v7, v1, :cond_12

    .line 110
    aget-char v14, v0, v7

    if-eq v14, v11, :cond_11

    if-ne v14, v10, :cond_12

    goto :goto_9

    :cond_12
    move-object/from16 v10, p4

    .line 231
    invoke-static {v1, v7, v3, v0, v10}, Ll/ۗᩳۢ;->ۧ(III[C[C)Z

    move-result v11

    if-nez v11, :cond_13

    goto :goto_a

    :cond_13
    add-int/2addr v7, v3

    .line 238
    new-instance v11, Ljava/lang/String;

    add-int/lit8 v9, v9, 0x1

    sub-int/2addr v9, v13

    invoke-direct {v11, v0, v13, v9}, Ljava/lang/String;-><init>([CII)V

    .line 239
    filled-new-array {v13, v7}, [I

    move-result-object v7

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v7, v8, v5

    const/4 v7, 0x1

    aput-object v11, v8, v7

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_a
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_14
    :goto_b
    return-object v4
.end method

.method public static ֫([CI[CI[CI[CILl/ۨ֫ۢ;Ll/ᩴ᩵;Ll/ۧۤᩴ;)Ljava/util/ArrayList;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p5

    move/from16 v4, p7

    .line 315
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    .line 318
    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/16 v8, 0x1f4

    if-ge v7, v8, :cond_13

    move-object/from16 v7, p2

    .line 319
    invoke-static {v1, v2, v6, v0, v7}, Ll/ۗᩳۢ;->֫(III[C[C)I

    move-result v6

    const/4 v8, -0x1

    if-ne v6, v8, :cond_0

    goto/16 :goto_b

    :cond_0
    add-int/lit8 v9, v6, -0x1

    :goto_1
    const/16 v10, 0x9

    const/16 v11, 0x20

    if-ltz v9, :cond_2

    .line 118
    aget-char v12, v0, v9

    if-eq v12, v11, :cond_1

    if-ne v12, v10, :cond_2

    :cond_1
    add-int/lit8 v9, v9, -0x1

    goto :goto_1

    :cond_2
    if-gez v9, :cond_4

    :goto_2
    move-object/from16 v12, p4

    :cond_3
    :goto_3
    move-object/from16 v10, p6

    :goto_4
    move-object/from16 v11, p8

    move-object/from16 v14, p9

    move-object/from16 v15, p10

    goto/16 :goto_a

    :cond_4
    if-ltz v9, :cond_7

    .line 130
    aget-char v12, v0, v9

    const/16 v13, 0x3b

    if-eq v12, v13, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v12, v9, -0x1

    const/4 v13, -0x1

    :goto_5
    if-ltz v12, :cond_8

    .line 136
    aget-char v14, v0, v12

    const/16 v15, 0x4c

    if-ne v14, v15, :cond_6

    move v13, v12

    :cond_6
    ushr-int/lit8 v15, v14, 0x6

    .line 54
    sget-object v16, Ll/ۗᩳۢ;->ܽ:[J

    aget-wide v15, v16, v15

    and-int/lit8 v14, v14, 0x3f

    const-wide/16 v17, 0x1

    shl-long v17, v17, v14

    and-long v14, v15, v17

    const-wide/16 v16, 0x0

    cmp-long v18, v14, v16

    if-eqz v18, :cond_8

    add-int/lit8 v12, v12, -0x1

    goto :goto_5

    :cond_7
    :goto_6
    const/4 v13, -0x1

    :cond_8
    if-ne v13, v8, :cond_9

    goto :goto_2

    .line 333
    :cond_9
    new-instance v8, Ljava/lang/String;

    add-int/lit8 v9, v9, 0x1

    sub-int/2addr v9, v13

    invoke-direct {v8, v0, v13, v9}, Ljava/lang/String;-><init>([CII)V

    add-int v9, v6, v2

    :goto_7
    if-ge v9, v1, :cond_b

    .line 110
    aget-char v12, v0, v9

    if-eq v12, v11, :cond_a

    if-ne v12, v10, :cond_b

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_b
    move-object/from16 v12, p4

    .line 338
    invoke-static {v1, v9, v3, v0, v12}, Ll/ۗᩳۢ;->ۧ(III[C[C)Z

    move-result v14

    if-nez v14, :cond_c

    goto :goto_3

    :cond_c
    add-int/2addr v9, v3

    :goto_8
    if-ge v9, v1, :cond_e

    .line 110
    aget-char v14, v0, v9

    if-eq v14, v11, :cond_d

    if-ne v14, v10, :cond_e

    :cond_d
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :cond_e
    if-ge v9, v1, :cond_3

    .line 344
    aget-char v14, v0, v9

    const/16 v15, 0x29

    if-eq v14, v15, :cond_f

    goto :goto_3

    :cond_f
    :goto_9
    add-int/lit8 v9, v9, 0x1

    if-ge v9, v1, :cond_10

    .line 110
    aget-char v14, v0, v9

    if-eq v14, v11, :cond_f

    if-ne v14, v10, :cond_10

    goto :goto_9

    :cond_10
    move-object/from16 v10, p6

    .line 350
    invoke-static {v1, v9, v4, v0, v10}, Ll/ۗᩳۢ;->ۧ(III[C[C)Z

    move-result v11

    if-nez v11, :cond_11

    goto :goto_4

    :cond_11
    add-int/2addr v9, v4

    move-object/from16 v11, p8

    move-object/from16 v14, p9

    move-object/from16 v15, p10

    .line 357
    invoke-static {v11, v14, v8, v15}, Ll/ۛܽۢ;->֫(Ll/ۨ֫ۢ;Ll/ᩴ᩵;Ljava/lang/String;Ll/ۧۤᩴ;)Z

    move-result v8

    if-eqz v8, :cond_12

    .line 358
    filled-new-array {v13, v9}, [I

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    :goto_a
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_13
    :goto_b
    return-object v5
.end method

.method public static ֫([CI[CI[CI[CI[CI)Ljava/util/ArrayList;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p5

    move/from16 v4, p7

    move/from16 v5, p9

    .line 252
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    .line 255
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/16 v9, 0x1f4

    if-ge v8, v9, :cond_11

    move-object/from16 v8, p4

    .line 256
    invoke-static {v1, v3, v7, v0, v8}, Ll/ۗᩳۢ;->֫(III[C[C)I

    move-result v7

    const/4 v9, -0x1

    if-ne v7, v9, :cond_0

    goto/16 :goto_b

    :cond_0
    add-int/lit8 v9, v7, -0x1

    :goto_1
    const/16 v10, 0x9

    const/16 v11, 0x20

    if-ltz v9, :cond_2

    .line 118
    aget-char v12, v0, v9

    if-eq v12, v11, :cond_1

    if-ne v12, v10, :cond_2

    :cond_1
    add-int/lit8 v9, v9, -0x1

    goto :goto_1

    :cond_2
    if-gez v9, :cond_5

    :cond_3
    move-object/from16 v12, p2

    :goto_2
    move-object/from16 v14, p6

    :cond_4
    :goto_3
    move-object/from16 v10, p8

    goto/16 :goto_a

    :cond_5
    add-int/lit8 v9, v9, 0x1

    sub-int/2addr v9, v2

    if-ltz v9, :cond_3

    move-object/from16 v12, p2

    .line 268
    invoke-static {v1, v9, v2, v0, v12}, Ll/ۗᩳۢ;->ۧ(III[C[C)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_4

    :cond_6
    if-lez v9, :cond_8

    add-int/lit8 v13, v9, -0x1

    .line 274
    aget-char v13, v0, v13

    if-eq v13, v11, :cond_8

    if-ne v13, v10, :cond_7

    goto :goto_5

    :cond_7
    ushr-int/lit8 v14, v13, 0x6

    .line 54
    sget-object v15, Ll/ۗᩳۢ;->ܽ:[J

    aget-wide v14, v15, v14

    and-int/lit8 v13, v13, 0x3f

    const-wide/16 v16, 0x1

    shl-long v16, v16, v13

    and-long v13, v14, v16

    const-wide/16 v15, 0x0

    cmp-long v17, v13, v15

    if-eqz v17, :cond_8

    :goto_4
    goto :goto_2

    :cond_8
    :goto_5
    add-int v13, v7, v3

    :goto_6
    if-ge v13, v1, :cond_a

    .line 110
    aget-char v14, v0, v13

    if-eq v14, v11, :cond_9

    if-ne v14, v10, :cond_a

    :cond_9
    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :cond_a
    move-object/from16 v14, p6

    .line 284
    invoke-static {v1, v13, v4, v0, v14}, Ll/ۗᩳۢ;->ۧ(III[C[C)Z

    move-result v15

    if-nez v15, :cond_b

    :goto_7
    goto :goto_3

    :cond_b
    add-int/2addr v13, v4

    :goto_8
    if-ge v13, v1, :cond_d

    .line 110
    aget-char v15, v0, v13

    if-eq v15, v11, :cond_c

    if-ne v15, v10, :cond_d

    :cond_c
    add-int/lit8 v13, v13, 0x1

    goto :goto_8

    :cond_d
    if-ge v13, v1, :cond_4

    .line 290
    aget-char v10, v0, v13

    const/16 v15, 0x29

    if-eq v10, v15, :cond_e

    goto :goto_7

    :cond_e
    :goto_9
    add-int/lit8 v13, v13, 0x1

    if-ge v13, v1, :cond_f

    .line 110
    aget-char v10, v0, v13

    const/16 v15, 0x9

    if-eq v10, v11, :cond_e

    if-ne v10, v15, :cond_f

    goto :goto_9

    :cond_f
    move-object/from16 v10, p8

    .line 296
    invoke-static {v1, v13, v5, v0, v10}, Ll/ۗᩳۢ;->ۧ(III[C[C)Z

    move-result v11

    if-nez v11, :cond_10

    goto :goto_a

    :cond_10
    add-int/2addr v13, v5

    .line 302
    filled-new-array {v9, v13}, [I

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_a
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_11
    :goto_b
    return-object v6
.end method

.method public static ֫(I)V
    .locals 6

    ushr-int/lit8 v0, p0, 0x6

    .line 49
    sget-object v1, Ll/ۗᩳۢ;->ܽ:[J

    aget-wide v2, v1, v0

    and-int/lit8 p0, p0, 0x3f

    const-wide/16 v4, 0x1

    shl-long/2addr v4, p0

    not-long v4, v4

    and-long/2addr v2, v4

    aput-wide v2, v1, v0

    return-void
.end method

.method public static ۧ(III[C[C)Z
    .locals 3

    const/4 v0, 0x0

    if-ltz p1, :cond_3

    add-int v1, p1, p2

    if-le v1, p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-ge p0, p2, :cond_2

    add-int v1, p1, p0

    .line 96
    aget-char v1, p3, v1

    aget-char v2, p4, p0

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method
