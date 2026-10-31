.class public final Lcom/google/android/material/color/utilities/QuantizerWsmeans;
.super Ljava/lang/Object;
.source "QuantizerWsmeans.java"


# static fields
.field public static final MAX_ITERATIONS:I = 0xa

.field public static final MIN_MOVEMENT_DISTANCE:D = 3.0


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static quantize([I[II)Ljava/util/Map;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 80
    new-instance v2, Ljava/util/Random;

    const-wide/32 v3, 0x42688

    invoke-direct {v2, v3, v4}, Ljava/util/Random;-><init>(J)V

    .line 82
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 83
    array-length v4, v0

    new-array v4, v4, [[D

    .line 84
    array-length v5, v0

    new-array v5, v5, [I

    .line 85
    new-instance v6, Lcom/google/android/material/color/utilities/PointProviderLab;

    invoke-direct {v6}, Lcom/google/android/material/color/utilities/PointProviderLab;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 88
    :goto_0
    array-length v9, v0

    const/4 v10, 0x1

    if-ge v7, v9, :cond_1

    .line 89
    aget v9, v0, v7

    .line 90
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v3, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-nez v11, :cond_0

    .line 92
    invoke-interface {v6, v9}, Lcom/google/android/material/color/utilities/PointProvider;->fromInt(I)[D

    move-result-object v11

    aput-object v11, v4, v8

    .line 93
    aput v9, v5, v8

    add-int/lit8 v8, v8, 0x1

    .line 96
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 98
    :cond_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    add-int/2addr v11, v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 102
    :cond_1
    new-array v0, v8, [I

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v8, :cond_2

    .line 104
    aget v9, v5, v7

    .line 105
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 106
    aput v9, v0, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    move/from16 v7, p2

    .line 109
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 110
    array-length v5, v1

    if-eqz v5, :cond_3

    .line 111
    array-length v5, v1

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 114
    :cond_3
    new-array v5, v3, [[D

    const/4 v7, 0x0

    const/4 v9, 0x0

    .line 116
    :goto_3
    array-length v10, v1

    if-ge v7, v10, :cond_4

    .line 117
    aget v10, v1, v7

    invoke-interface {v6, v10}, Lcom/google/android/material/color/utilities/PointProvider;->fromInt(I)[D

    move-result-object v10

    aput-object v10, v5, v7

    add-int/lit8 v9, v9, 0x1

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    sub-int v1, v3, v9

    if-lez v1, :cond_5

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v1, :cond_5

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 126
    :cond_5
    new-array v1, v8, [I

    const/4 v7, 0x0

    :goto_5
    if-ge v7, v8, :cond_6

    .line 128
    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    aput v9, v1, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 131
    :cond_6
    new-array v2, v3, [[I

    const/4 v7, 0x0

    :goto_6
    if-ge v7, v3, :cond_7

    .line 133
    new-array v9, v3, [I

    aput-object v9, v2, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 136
    :cond_7
    new-array v7, v3, [[Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;

    const/4 v9, 0x0

    :goto_7
    if-ge v9, v3, :cond_9

    .line 138
    new-array v10, v3, [Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;

    aput-object v10, v7, v9

    const/4 v10, 0x0

    :goto_8
    if-ge v10, v3, :cond_8

    .line 140
    aget-object v11, v7, v9

    new-instance v12, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;

    invoke-direct {v12}, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;-><init>()V

    aput-object v12, v11, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    .line 144
    :cond_9
    new-array v9, v3, [I

    const/4 v10, 0x0

    :goto_9
    const/16 v11, 0xa

    if-ge v10, v11, :cond_16

    const/4 v11, 0x0

    :goto_a
    if-ge v11, v3, :cond_c

    add-int/lit8 v12, v11, 0x1

    move v13, v12

    :goto_b
    if-ge v13, v3, :cond_a

    .line 148
    aget-object v14, v5, v11

    aget-object v15, v5, v13

    invoke-interface {v6, v14, v15}, Lcom/google/android/material/color/utilities/PointProvider;->distance([D[D)D

    move-result-wide v14

    .line 149
    aget-object v16, v7, v13

    move/from16 p0, v12

    aget-object v12, v16, v11

    iput-wide v14, v12, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->distance:D

    .line 150
    iput v11, v12, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->index:I

    .line 151
    aget-object v12, v7, v11

    aget-object v12, v12, v13

    iput-wide v14, v12, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->distance:D

    .line 152
    iput v13, v12, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->index:I

    add-int/lit8 v13, v13, 0x1

    move/from16 v12, p0

    goto :goto_b

    :cond_a
    move/from16 p0, v12

    .line 154
    aget-object v12, v7, v11

    invoke-static {v12}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    const/4 v12, 0x0

    :goto_c
    if-ge v12, v3, :cond_b

    .line 156
    aget-object v13, v2, v11

    aget-object v14, v7, v11

    aget-object v14, v14, v12

    iget v14, v14, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->index:I

    aput v14, v13, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_c

    :cond_b
    move/from16 v11, p0

    goto :goto_a

    :cond_c
    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_d
    if-ge v12, v8, :cond_11

    .line 162
    aget-object v14, v4, v12

    .line 163
    aget v15, v1, v12

    .line 164
    aget-object v11, v5, v15

    .line 165
    invoke-interface {v6, v14, v11}, Lcom/google/android/material/color/utilities/PointProvider;->distance([D[D)D

    move-result-wide v16

    const/4 v11, -0x1

    const/16 v18, 0x0

    move-object/from16 v18, v2

    move-wide/from16 v19, v16

    const/4 v2, 0x0

    :goto_e
    if-ge v2, v3, :cond_f

    .line 170
    aget-object v21, v7, v15

    move-object/from16 p1, v7

    aget-object v7, v21, v2

    move/from16 v21, v8

    iget-wide v7, v7, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->distance:D

    const-wide/high16 v22, 0x4010000000000000L    # 4.0

    mul-double v22, v22, v16

    cmpl-double v24, v7, v22

    if-ltz v24, :cond_d

    goto :goto_f

    .line 173
    :cond_d
    aget-object v7, v5, v2

    invoke-interface {v6, v14, v7}, Lcom/google/android/material/color/utilities/PointProvider;->distance([D[D)D

    move-result-wide v7

    cmpg-double v22, v7, v19

    if-gez v22, :cond_e

    move v11, v2

    move-wide/from16 v19, v7

    :cond_e
    :goto_f
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v7, p1

    move/from16 v8, v21

    goto :goto_e

    :cond_f
    move-object/from16 p1, v7

    move/from16 v21, v8

    const/4 v2, -0x1

    if-eq v11, v2, :cond_10

    .line 181
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v14

    sub-double/2addr v7, v14

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    const-wide/high16 v14, 0x4008000000000000L    # 3.0

    cmpl-double v2, v7, v14

    if-lez v2, :cond_10

    add-int/lit8 v13, v13, 0x1

    .line 184
    aput v11, v1, v12

    :cond_10
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v7, p1

    move-object/from16 v2, v18

    move/from16 v8, v21

    goto :goto_d

    :cond_11
    move-object/from16 v18, v2

    move-object/from16 p1, v7

    move/from16 v21, v8

    if-nez v13, :cond_12

    if-eqz v10, :cond_12

    goto/16 :goto_13

    .line 193
    :cond_12
    new-array v2, v3, [D

    .line 194
    new-array v7, v3, [D

    .line 195
    new-array v8, v3, [D

    const/4 v11, 0x0

    .line 196
    invoke-static {v9, v11}, Ljava/util/Arrays;->fill([II)V

    move/from16 v12, v21

    :goto_10
    if-ge v11, v12, :cond_13

    .line 198
    aget v13, v1, v11

    .line 199
    aget-object v14, v4, v11

    .line 200
    aget v15, v0, v11

    .line 201
    aget v16, v9, v13

    add-int v16, v16, v15

    aput v16, v9, v13

    .line 202
    aget-wide v16, v2, v13

    const/16 v19, 0x0

    aget-wide v19, v14, v19

    const/16 v21, 0x2

    move-object/from16 v22, v0

    move-object/from16 v23, v1

    int-to-double v0, v15

    mul-double v19, v19, v0

    add-double v19, v19, v16

    aput-wide v19, v2, v13

    .line 203
    aget-wide v15, v7, v13

    const/16 v17, 0x1

    aget-wide v19, v14, v17

    mul-double v19, v19, v0

    add-double v19, v19, v15

    aput-wide v19, v7, v13

    .line 204
    aget-wide v15, v8, v13

    aget-wide v19, v14, v21

    mul-double v19, v19, v0

    add-double v19, v19, v15

    aput-wide v19, v8, v13

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    goto :goto_10

    :cond_13
    move-object/from16 v22, v0

    move-object/from16 v23, v1

    const/4 v0, 0x2

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v3, :cond_15

    .line 208
    aget v11, v9, v1

    if-nez v11, :cond_14

    const/4 v11, 0x3

    new-array v11, v11, [D

    .line 210
    fill-array-data v11, :array_0

    aput-object v11, v5, v1

    move/from16 v21, v12

    const/4 v12, 0x1

    goto :goto_12

    .line 213
    :cond_14
    aget-wide v13, v2, v1

    move/from16 v21, v12

    int-to-double v11, v11

    div-double/2addr v13, v11

    .line 214
    aget-wide v15, v7, v1

    div-double/2addr v15, v11

    .line 215
    aget-wide v19, v8, v1

    div-double v19, v19, v11

    .line 216
    aget-object v11, v5, v1

    const/4 v12, 0x0

    aput-wide v13, v11, v12

    const/4 v12, 0x1

    .line 217
    aput-wide v15, v11, v12

    .line 218
    aput-wide v19, v11, v0

    :goto_12
    add-int/lit8 v1, v1, 0x1

    move/from16 v12, v21

    goto :goto_11

    :cond_15
    move/from16 v21, v12

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, p1

    move-object/from16 v2, v18

    move/from16 v8, v21

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    goto/16 :goto_9

    .line 222
    :cond_16
    :goto_13
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v3, :cond_19

    .line 224
    aget v2, v9, v1

    if-nez v2, :cond_17

    goto :goto_15

    .line 229
    :cond_17
    aget-object v4, v5, v1

    invoke-interface {v6, v4}, Lcom/google/android/material/color/utilities/PointProvider;->toInt([D)I

    move-result v4

    .line 230
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    goto :goto_15

    .line 234
    :cond_18
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :cond_19
    return-object v0

    nop

    :array_0
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data
.end method
