.class public final Ll/ۖ֡;
.super Ll/᩷֡;
.source "V1BL"


# instance fields
.field public ֫:[D

.field public ۧ:[[D

.field public ܽ:[[D


# direct methods
.method public constructor <init>([D[[D)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 24
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 30
    array-length v3, v1

    const/4 v4, 0x0

    .line 31
    aget-object v5, v2, v4

    array-length v5, v5

    add-int/lit8 v6, v3, -0x1

    const/4 v7, 0x2

    new-array v8, v7, [I

    const/4 v9, 0x1

    aput v5, v8, v9

    aput v6, v8, v4

    .line 32
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [[D

    new-array v7, v7, [I

    aput v5, v7, v9

    aput v3, v7, v4

    .line 33
    invoke-static {v10, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[D

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_2

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v6, :cond_1

    add-int/lit8 v10, v9, 0x1

    .line 36
    aget-wide v11, v1, v10

    aget-wide v13, v1, v9

    sub-double/2addr v11, v13

    .line 37
    aget-object v13, v8, v9

    aget-object v14, v2, v10

    aget-wide v15, v14, v7

    aget-object v14, v2, v9

    aget-wide v17, v14, v7

    sub-double v15, v15, v17

    div-double/2addr v15, v11

    aput-wide v15, v13, v7

    if-nez v9, :cond_0

    .line 39
    aget-object v9, v4, v9

    aput-wide v15, v9, v7

    goto :goto_2

    .line 41
    :cond_0
    aget-object v11, v4, v9

    add-int/lit8 v9, v9, -0x1

    aget-object v9, v8, v9

    aget-wide v12, v9, v7

    add-double/2addr v12, v15

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    mul-double v12, v12, v14

    aput-wide v12, v11, v7

    :goto_2
    move v9, v10

    goto :goto_1

    .line 44
    :cond_1
    aget-object v9, v4, v6

    add-int/lit8 v10, v3, -0x2

    aget-object v10, v8, v10

    aget-wide v11, v10, v7

    aput-wide v11, v9, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_3
    if-ge v3, v6, :cond_6

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v5, :cond_5

    .line 49
    aget-object v9, v8, v3

    aget-wide v10, v9, v7

    const-wide/16 v12, 0x0

    cmpl-double v9, v10, v12

    if-nez v9, :cond_3

    .line 50
    aget-object v9, v4, v3

    aput-wide v12, v9, v7

    add-int/lit8 v9, v3, 0x1

    .line 51
    aget-object v9, v4, v9

    aput-wide v12, v9, v7

    goto :goto_5

    .line 53
    :cond_3
    aget-object v9, v4, v3

    aget-wide v12, v9, v7

    div-double/2addr v12, v10

    add-int/lit8 v9, v3, 0x1

    .line 54
    aget-object v14, v4, v9

    aget-wide v15, v14, v7

    div-double v10, v15, v10

    .line 55
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v14

    const-wide/high16 v16, 0x4022000000000000L    # 9.0

    cmpl-double v18, v14, v16

    if-lez v18, :cond_4

    const-wide/high16 v16, 0x4008000000000000L    # 3.0

    div-double v16, v16, v14

    .line 58
    aget-object v14, v4, v3

    mul-double v12, v12, v16

    aget-object v15, v8, v3

    aget-wide v18, v15, v7

    mul-double v12, v12, v18

    aput-wide v12, v14, v7

    .line 59
    aget-object v9, v4, v9

    mul-double v16, v16, v10

    aget-wide v10, v15, v7

    mul-double v16, v16, v10

    aput-wide v16, v9, v7

    :cond_4
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 64
    :cond_6
    iput-object v1, v0, Ll/ۖ֡;->֫:[D

    .line 65
    iput-object v2, v0, Ll/ۖ֡;->ܽ:[[D

    .line 66
    iput-object v4, v0, Ll/ۖ֡;->ۧ:[[D

    return-void
.end method

.method public static ֫(DDDDDD)D
    .locals 10

    mul-double v0, p2, p2

    const-wide/high16 v2, -0x3fe8000000000000L    # -6.0

    mul-double v2, v2, v0

    mul-double v2, v2, p6

    const-wide/high16 v4, 0x4018000000000000L    # 6.0

    mul-double v6, p2, v4

    mul-double v8, v6, p6

    add-double/2addr v8, v2

    mul-double v4, v4, v0

    mul-double v4, v4, p4

    add-double/2addr v4, v8

    mul-double v6, v6, p4

    sub-double/2addr v4, v6

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    mul-double v2, v2, p0

    mul-double v6, v2, p10

    mul-double v6, v6, v0

    add-double/2addr v6, v4

    mul-double v2, v2, p8

    mul-double v2, v2, v0

    add-double/2addr v2, v6

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double v0, v0, p0

    mul-double v0, v0, p10

    mul-double v0, v0, p2

    sub-double/2addr v2, v0

    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    mul-double v0, v0, p0

    mul-double v0, v0, p8

    mul-double v0, v0, p2

    sub-double/2addr v2, v0

    mul-double v0, p0, p8

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public static ۧ(DDDDDD)D
    .locals 12

    mul-double v0, p2, p2

    mul-double v2, v0, p2

    const-wide/high16 v4, -0x4000000000000000L    # -2.0

    mul-double v4, v4, v2

    mul-double v4, v4, p6

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    mul-double v6, v6, v0

    mul-double v8, v6, p6

    add-double/2addr v8, v4

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double v10, v2, v4

    mul-double v10, v10, p4

    add-double/2addr v10, v8

    mul-double v6, v6, p4

    sub-double/2addr v10, v6

    add-double v10, v10, p4

    mul-double v6, p0, p10

    mul-double v8, v6, v2

    add-double/2addr v8, v10

    mul-double v10, p0, p8

    mul-double v2, v2, v10

    add-double/2addr v2, v8

    mul-double v6, v6, v0

    sub-double/2addr v2, v6

    mul-double v4, v4, p0

    mul-double v4, v4, p8

    mul-double v4, v4, v0

    sub-double/2addr v2, v4

    mul-double v10, v10, p2

    add-double/2addr v10, v2

    return-wide v10
.end method


# virtual methods
.method public final ֫(D)D
    .locals 24

    move-object/from16 v0, p0

    .line 147
    iget-object v1, v0, Ll/ۖ֡;->֫:[D

    array-length v2, v1

    const/4 v3, 0x0

    .line 148
    aget-wide v4, v1, v3

    iget-object v6, v0, Ll/ۖ֡;->ܽ:[[D

    cmpg-double v7, p1, v4

    if-gtz v7, :cond_0

    .line 149
    aget-object v1, v6, v3

    aget-wide v2, v1, v3

    return-wide v2

    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 151
    aget-wide v4, v1, v2

    cmpl-double v7, p1, v4

    if-ltz v7, :cond_1

    .line 152
    aget-object v1, v6, v2

    aget-wide v2, v1, v3

    return-wide v2

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    .line 156
    aget-wide v7, v1, v4

    cmpl-double v5, p1, v7

    if-nez v5, :cond_2

    .line 157
    aget-object v1, v6, v4

    aget-wide v2, v1, v3

    return-wide v2

    :cond_2
    add-int/lit8 v5, v4, 0x1

    .line 159
    aget-wide v9, v1, v5

    cmpg-double v11, p1, v9

    if-gez v11, :cond_3

    sub-double v12, v9, v7

    sub-double v1, p1, v7

    div-double v14, v1, v12

    .line 162
    aget-object v1, v6, v4

    aget-wide v16, v1, v3

    .line 163
    aget-object v1, v6, v5

    aget-wide v18, v1, v3

    .line 164
    iget-object v1, v0, Ll/ۖ֡;->ۧ:[[D

    aget-object v2, v1, v4

    aget-wide v20, v2, v3

    .line 165
    aget-object v1, v1, v5

    aget-wide v22, v1, v3

    .line 166
    invoke-static/range {v12 .. v23}, Ll/ۖ֡;->ۧ(DDDDDD)D

    move-result-wide v1

    return-wide v1

    :cond_3
    move v4, v5

    goto :goto_0

    :cond_4
    const-wide/16 v1, 0x0

    return-wide v1
.end method

.method public final ֫(D[D)V
    .locals 24

    move-object/from16 v0, p0

    .line 71
    iget-object v1, v0, Ll/ۖ֡;->֫:[D

    array-length v2, v1

    .line 72
    iget-object v3, v0, Ll/ۖ֡;->ܽ:[[D

    const/4 v4, 0x0

    aget-object v5, v3, v4

    array-length v5, v5

    .line 73
    aget-wide v6, v1, v4

    cmpg-double v8, p1, v6

    if-gtz v8, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v5, :cond_4

    .line 75
    aget-object v2, v3, v4

    aget-wide v6, v2, v1

    aput-wide v6, p3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 79
    aget-wide v6, v1, v2

    cmpl-double v8, p1, v6

    if-ltz v8, :cond_1

    :goto_1
    if-ge v4, v5, :cond_4

    .line 81
    aget-object v1, v3, v2

    aget-wide v6, v1, v4

    aput-wide v6, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v2, :cond_4

    .line 87
    aget-wide v7, v1, v6

    cmpl-double v9, p1, v7

    if-nez v9, :cond_2

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v5, :cond_2

    .line 89
    aget-object v8, v3, v6

    aget-wide v9, v8, v7

    aput-wide v9, p3, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v6, 0x1

    .line 92
    aget-wide v8, v1, v7

    cmpg-double v10, p1, v8

    if-gez v10, :cond_3

    .line 93
    aget-wide v10, v1, v6

    sub-double/2addr v8, v10

    sub-double v1, p1, v10

    div-double/2addr v1, v8

    :goto_4
    if-ge v4, v5, :cond_4

    .line 96
    aget-object v10, v3, v6

    aget-wide v16, v10, v4

    .line 97
    aget-object v10, v3, v7

    aget-wide v18, v10, v4

    .line 98
    iget-object v10, v0, Ll/ۖ֡;->ۧ:[[D

    aget-object v11, v10, v6

    aget-wide v20, v11, v4

    .line 99
    aget-object v10, v10, v7

    aget-wide v22, v10, v4

    move-wide v12, v8

    move-wide v14, v1

    .line 100
    invoke-static/range {v12 .. v23}, Ll/ۖ֡;->ۧ(DDDDDD)D

    move-result-wide v10

    aput-wide v10, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_3
    move v6, v7

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final ֫(D[F)V
    .locals 24

    move-object/from16 v0, p0

    .line 109
    iget-object v1, v0, Ll/ۖ֡;->֫:[D

    array-length v2, v1

    .line 110
    iget-object v3, v0, Ll/ۖ֡;->ܽ:[[D

    const/4 v4, 0x0

    aget-object v5, v3, v4

    array-length v5, v5

    .line 111
    aget-wide v6, v1, v4

    cmpg-double v8, p1, v6

    if-gtz v8, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v5, :cond_4

    .line 113
    aget-object v2, v3, v4

    aget-wide v6, v2, v1

    double-to-float v2, v6

    aput v2, p3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 117
    aget-wide v6, v1, v2

    cmpl-double v8, p1, v6

    if-ltz v8, :cond_1

    :goto_1
    if-ge v4, v5, :cond_4

    .line 119
    aget-object v1, v3, v2

    aget-wide v6, v1, v4

    double-to-float v1, v6

    aput v1, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v2, :cond_4

    .line 125
    aget-wide v7, v1, v6

    cmpl-double v9, p1, v7

    if-nez v9, :cond_2

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v5, :cond_2

    .line 127
    aget-object v8, v3, v6

    aget-wide v9, v8, v7

    double-to-float v8, v9

    aput v8, p3, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v6, 0x1

    .line 130
    aget-wide v8, v1, v7

    cmpg-double v10, p1, v8

    if-gez v10, :cond_3

    .line 131
    aget-wide v10, v1, v6

    sub-double/2addr v8, v10

    sub-double v1, p1, v10

    div-double/2addr v1, v8

    :goto_4
    if-ge v4, v5, :cond_4

    .line 134
    aget-object v10, v3, v6

    aget-wide v16, v10, v4

    .line 135
    aget-object v10, v3, v7

    aget-wide v18, v10, v4

    .line 136
    iget-object v10, v0, Ll/ۖ֡;->ۧ:[[D

    aget-object v11, v10, v6

    aget-wide v20, v11, v4

    .line 137
    aget-object v10, v10, v7

    aget-wide v22, v10, v4

    move-wide v12, v8

    move-wide v14, v1

    .line 138
    invoke-static/range {v12 .. v23}, Ll/ۖ֡;->ۧ(DDDDDD)D

    move-result-wide v10

    double-to-float v10, v10

    aput v10, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_3
    move v6, v7

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final ֫()[D
    .locals 1

    .line 225
    iget-object v0, p0, Ll/ۖ֡;->֫:[D

    return-object v0
.end method

.method public final ۧ(D)D
    .locals 24

    move-object/from16 v0, p0

    .line 202
    iget-object v1, v0, Ll/ۖ֡;->֫:[D

    array-length v2, v1

    const/4 v3, 0x0

    .line 204
    aget-wide v4, v1, v3

    cmpg-double v6, p1, v4

    if-gez v6, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v4, v2, -0x1

    .line 206
    aget-wide v4, v1, v4

    cmpl-double v6, p1, v4

    if-ltz v6, :cond_1

    goto :goto_0

    :cond_1
    move-wide/from16 v4, p1

    :goto_0
    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v7, v2, -0x1

    if-ge v6, v7, :cond_3

    add-int/lit8 v7, v6, 0x1

    .line 210
    aget-wide v8, v1, v7

    cmpg-double v10, v4, v8

    if-gtz v10, :cond_2

    .line 211
    aget-wide v10, v1, v6

    sub-double/2addr v8, v10

    sub-double/2addr v4, v10

    div-double v14, v4, v8

    .line 213
    iget-object v1, v0, Ll/ۖ֡;->ܽ:[[D

    aget-object v2, v1, v6

    aget-wide v16, v2, v3

    .line 214
    aget-object v1, v1, v7

    aget-wide v18, v1, v3

    .line 215
    iget-object v1, v0, Ll/ۖ֡;->ۧ:[[D

    aget-object v2, v1, v6

    aget-wide v20, v2, v3

    .line 216
    aget-object v1, v1, v7

    aget-wide v22, v1, v3

    move-wide v12, v8

    .line 217
    invoke-static/range {v12 .. v23}, Ll/ۖ֡;->֫(DDDDDD)D

    move-result-wide v1

    div-double/2addr v1, v8

    return-wide v1

    :cond_2
    move v6, v7

    goto :goto_1

    :cond_3
    const-wide/16 v1, 0x0

    return-wide v1
.end method

.method public final ۧ(D[D)V
    .locals 26

    move-object/from16 v0, p0

    .line 175
    iget-object v1, v0, Ll/ۖ֡;->֫:[D

    array-length v2, v1

    .line 176
    iget-object v3, v0, Ll/ۖ֡;->ܽ:[[D

    const/4 v4, 0x0

    aget-object v5, v3, v4

    array-length v5, v5

    .line 177
    aget-wide v6, v1, v4

    cmpg-double v8, p1, v6

    if-gtz v8, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v6, v2, -0x1

    .line 179
    aget-wide v6, v1, v6

    cmpl-double v8, p1, v6

    if-ltz v8, :cond_1

    goto :goto_0

    :cond_1
    move-wide/from16 v6, p1

    :goto_0
    const/4 v8, 0x0

    :goto_1
    add-int/lit8 v9, v2, -0x1

    if-ge v8, v9, :cond_3

    add-int/lit8 v9, v8, 0x1

    .line 184
    aget-wide v10, v1, v9

    cmpg-double v12, v6, v10

    if-gtz v12, :cond_2

    .line 185
    aget-wide v12, v1, v8

    sub-double/2addr v10, v12

    sub-double/2addr v6, v12

    div-double/2addr v6, v10

    :goto_2
    if-ge v4, v5, :cond_3

    .line 188
    aget-object v1, v3, v8

    aget-wide v18, v1, v4

    .line 189
    aget-object v1, v3, v9

    aget-wide v20, v1, v4

    .line 190
    iget-object v1, v0, Ll/ۖ֡;->ۧ:[[D

    aget-object v2, v1, v8

    aget-wide v22, v2, v4

    .line 191
    aget-object v1, v1, v9

    aget-wide v24, v1, v4

    move-wide v14, v10

    move-wide/from16 v16, v6

    .line 192
    invoke-static/range {v14 .. v25}, Ll/ۖ֡;->֫(DDDDDD)D

    move-result-wide v1

    div-double/2addr v1, v10

    aput-wide v1, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    move v8, v9

    goto :goto_1

    :cond_3
    return-void
.end method
