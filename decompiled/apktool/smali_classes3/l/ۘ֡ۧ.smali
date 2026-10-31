.class public final Ll/ۘ֡ۧ;
.super Ljava/lang/Object;
.source "R8JP"

# interfaces
.implements Ll/ܺ֡ۧ;


# static fields
.field public static final ۚ:[D


# instance fields
.field public final ֡:Ll/֨ۚۧ;

.field public final ֫:Ljava/lang/String;

.field public ۖ:Z

.field public ۘ:J

.field public final ۜ:[Z

.field public ۡ:J

.field public ۢ:Z

.field public final ۧ:Ll/ۖ֡ۧ;

.field public ܳ:Ll/᩵ۢۧ;

.field public ܺ:J

.field public ܽ:Ljava/lang/String;

.field public ܿ:Z

.field public ᩳ:J

.field public final ᩴ:Ll/ۛ֡ۧ;

.field public final ᩵:Ll/ᩳ֨֫;

.field public ᩷:Z

.field public ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [D

    .line 51
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘ֡ۧ;->ۚ:[D

    return-void

    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>(Ll/֨ۚۧ;Ljava/lang/String;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Ll/ۘ֡ۧ;->֡:Ll/֨ۚۧ;

    .line 84
    iput-object p2, p0, Ll/ۘ֡ۧ;->֫:Ljava/lang/String;

    const/4 p2, 0x4

    new-array p2, p2, [Z

    .line 85
    iput-object p2, p0, Ll/ۘ֡ۧ;->ۜ:[Z

    .line 86
    new-instance p2, Ll/ۖ֡ۧ;

    .line 305
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    new-array v0, v0, [B

    .line 306
    iput-object v0, p2, Ll/ۖ֡ۧ;->֫:[B

    .line 86
    iput-object p2, p0, Ll/ۘ֡ۧ;->ۧ:Ll/ۖ֡ۧ;

    if-eqz p1, :cond_0

    .line 88
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 p2, 0xb2

    invoke-direct {p1, p2}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/ۘ֡ۧ;->ᩴ:Ll/ۛ֡ۧ;

    .line 89
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ۘ֡ۧ;->᩵:Ll/ᩳ֨֫;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 91
    iput-object p1, p0, Ll/ۘ֡ۧ;->ᩴ:Ll/ۛ֡ۧ;

    .line 92
    iput-object p1, p0, Ll/ۘ֡ۧ;->᩵:Ll/ᩳ֨֫;

    :goto_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 94
    iput-wide p1, p0, Ll/ۘ֡ۧ;->᩻:J

    .line 95
    iput-wide p1, p0, Ll/ۘ֡ۧ;->ܺ:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 100
    iget-object v0, p0, Ll/ۘ֡ۧ;->ۜ:[Z

    invoke-static {v0}, Ll/ܽ۠֫;->֫([Z)V

    .line 101
    iget-object v0, p0, Ll/ۘ֡ۧ;->ۧ:Ll/ۖ֡ۧ;

    invoke-virtual {v0}, Ll/ۖ֡ۧ;->֫()V

    .line 102
    iget-object v0, p0, Ll/ۘ֡ۧ;->ᩴ:Ll/ۛ֡ۧ;

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    :cond_0
    const-wide/16 v0, 0x0

    .line 105
    iput-wide v0, p0, Ll/ۘ֡ۧ;->ۘ:J

    const/4 v0, 0x0

    .line 106
    iput-boolean v0, p0, Ll/ۘ֡ۧ;->ۖ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 107
    iput-wide v0, p0, Ll/ۘ֡ۧ;->᩻:J

    .line 108
    iput-wide v0, p0, Ll/ۘ֡ۧ;->ܺ:J

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 124
    iput-wide p2, p0, Ll/ۘ֡ۧ;->᩻:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 18

    move-object/from16 v0, p0

    .line 129
    iget-object v1, v0, Ll/ۘ֡ۧ;->ܳ:Ll/᩵ۢۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 130
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 131
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    .line 132
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 135
    iget-wide v4, v0, Ll/ۘ֡ۧ;->ۘ:J

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Ll/ۘ֡ۧ;->ۘ:J

    .line 136
    iget-object v4, v0, Ll/ۘ֡ۧ;->ܳ:Ll/᩵ۢۧ;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v5, v6}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 139
    :goto_0
    iget-object v4, v0, Ll/ۘ֡ۧ;->ۜ:[Z

    invoke-static {v1, v2, v3, v4}, Ll/ܽ۠֫;->֫(II[B[Z)I

    move-result v4

    .line 141
    iget-object v5, v0, Ll/ۘ֡ۧ;->ۧ:Ll/ۖ֡ۧ;

    iget-object v7, v0, Ll/ۘ֡ۧ;->ᩴ:Ll/ۛ֡ۧ;

    if-ne v4, v2, :cond_2

    .line 143
    iget-boolean v4, v0, Ll/ۘ֡ۧ;->ܿ:Z

    if-nez v4, :cond_0

    .line 144
    invoke-virtual {v5, v1, v2, v3}, Ll/ۖ֡ۧ;->֫(II[B)V

    :cond_0
    if-eqz v7, :cond_1

    .line 147
    invoke-virtual {v7, v1, v2, v3}, Ll/ۛ֡ۧ;->֫(II[B)V

    :cond_1
    return-void

    .line 153
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    add-int/lit8 v9, v4, 0x3

    aget-byte v8, v8, v9

    and-int/lit16 v8, v8, 0xff

    sub-int v10, v4, v1

    .line 158
    iget-boolean v11, v0, Ll/ۘ֡ۧ;->ܿ:Z

    if-nez v11, :cond_a

    if-lez v10, :cond_3

    .line 160
    invoke-virtual {v5, v1, v4, v3}, Ll/ۖ֡ۧ;->֫(II[B)V

    :cond_3
    if-gez v10, :cond_4

    neg-int v11, v10

    goto :goto_1

    :cond_4
    const/4 v11, 0x0

    .line 165
    :goto_1
    invoke-virtual {v5, v8, v11}, Ll/ۖ֡ۧ;->֫(II)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 167
    iget-object v11, v0, Ll/ۘ֡ۧ;->ܽ:Ljava/lang/String;

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    iget-object v12, v5, Ll/ۖ֡ۧ;->֫:[B

    iget v13, v5, Ll/ۖ֡ۧ;->ܽ:I

    invoke-static {v12, v13}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v12

    const/4 v13, 0x4

    .line 245
    aget-byte v13, v12, v13

    and-int/lit16 v13, v13, 0xff

    const/4 v14, 0x5

    .line 246
    aget-byte v14, v12, v14

    and-int/lit16 v15, v14, 0xff

    const/16 v16, 0x6

    .line 247
    aget-byte v6, v12, v16

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v13, v13, 0x4

    shr-int/lit8 v15, v15, 0x4

    or-int/2addr v13, v15

    and-int/lit8 v14, v14, 0xf

    shl-int/lit8 v14, v14, 0x8

    or-int/2addr v6, v14

    const/4 v14, 0x7

    .line 252
    aget-byte v15, v12, v14

    and-int/lit16 v15, v15, 0xf0

    shr-int/lit8 v15, v15, 0x4

    const/4 v14, 0x2

    if-eq v15, v14, :cond_7

    const/4 v14, 0x3

    if-eq v15, v14, :cond_6

    const/4 v14, 0x4

    if-eq v15, v14, :cond_5

    const/high16 v14, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_5
    mul-int/lit8 v14, v6, 0x79

    int-to-float v14, v14

    mul-int/lit8 v15, v13, 0x64

    goto :goto_2

    :cond_6
    mul-int/lit8 v14, v6, 0x10

    int-to-float v14, v14

    mul-int/lit8 v15, v13, 0x9

    goto :goto_2

    :cond_7
    mul-int/lit8 v14, v6, 0x4

    int-to-float v14, v14

    mul-int/lit8 v15, v13, 0x3

    :goto_2
    int-to-float v15, v15

    div-float/2addr v14, v15

    .line 268
    :goto_3
    new-instance v15, Ll/֨ᩴ֫;

    invoke-direct {v15}, Ll/֨ᩴ֫;-><init>()V

    .line 270
    invoke-virtual {v15, v11}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    .line 271
    iget-object v11, v0, Ll/ۘ֡ۧ;->֫:Ljava/lang/String;

    invoke-virtual {v15, v11}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v11, "video/mpeg2"

    .line 272
    invoke-virtual {v15, v11}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 273
    invoke-virtual {v15, v13}, Ll/֨ᩴ֫;->ۙ(I)V

    .line 274
    invoke-virtual {v15, v6}, Ll/֨ᩴ֫;->ۡ(I)V

    .line 275
    invoke-virtual {v15, v14}, Ll/֨ᩴ֫;->ۧ(F)V

    .line 276
    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v15, v6}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 277
    invoke-virtual {v15}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v6

    const/4 v11, 0x7

    .line 280
    aget-byte v11, v12, v11

    and-int/lit8 v11, v11, 0xf

    add-int/lit8 v11, v11, -0x1

    if-ltz v11, :cond_9

    const/16 v13, 0x8

    if-ge v11, v13, :cond_9

    .line 282
    sget-object v13, Ll/ۘ֡ۧ;->ۚ:[D

    aget-wide v14, v13, v11

    .line 283
    iget v5, v5, Ll/ۖ֡ۧ;->ᩳ:I

    add-int/lit8 v5, v5, 0x9

    .line 284
    aget-byte v5, v12, v5

    and-int/lit8 v11, v5, 0x60

    shr-int/lit8 v11, v11, 0x5

    and-int/lit8 v5, v5, 0x1f

    if-eq v11, v5, :cond_8

    int-to-double v11, v11

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    add-double v11, v11, v16

    add-int/lit8 v5, v5, 0x1

    move/from16 v16, v8

    move v13, v9

    int-to-double v8, v5

    div-double/2addr v11, v8

    mul-double v14, v14, v11

    goto :goto_4

    :cond_8
    move/from16 v16, v8

    move v13, v9

    :goto_4
    const-wide v8, 0x412e848000000000L    # 1000000.0

    div-double/2addr v8, v14

    double-to-long v8, v8

    goto :goto_5

    :cond_9
    move/from16 v16, v8

    move v13, v9

    const-wide/16 v8, 0x0

    .line 292
    :goto_5
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v5

    .line 169
    iget-object v6, v0, Ll/ۘ֡ۧ;->ܳ:Ll/᩵ۢۧ;

    iget-object v8, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ll/۠ᩴ֫;

    invoke-interface {v6, v8}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 170
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iput-wide v5, v0, Ll/ۘ֡ۧ;->ᩳ:J

    const/4 v5, 0x1

    .line 171
    iput-boolean v5, v0, Ll/ۘ֡ۧ;->ܿ:Z

    goto :goto_6

    :cond_a
    move/from16 v16, v8

    move v13, v9

    :goto_6
    if-eqz v7, :cond_d

    if-lez v10, :cond_b

    .line 177
    invoke-virtual {v7, v1, v4, v3}, Ll/ۛ֡ۧ;->֫(II[B)V

    const/4 v1, 0x0

    goto :goto_7

    :cond_b
    neg-int v1, v10

    .line 182
    :goto_7
    invoke-virtual {v7, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 183
    iget-object v1, v7, Ll/ۛ֡ۧ;->ܽ:[B

    iget v5, v7, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v5, v1}, Ll/ܽ۠֫;->֫(I[B)I

    move-result v1

    .line 184
    sget-object v5, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-object v5, v7, Ll/ۛ֡ۧ;->ܽ:[B

    iget-object v6, v0, Ll/ۘ֡ۧ;->᩵:Ll/ᩳ֨֫;

    invoke-virtual {v6, v1, v5}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 185
    iget-object v1, v0, Ll/ۘ֡ۧ;->֡:Ll/֨ۚۧ;

    iget-wide v8, v0, Ll/ۘ֡ۧ;->ܺ:J

    invoke-virtual {v1, v8, v9, v6}, Ll/֨ۚۧ;->֫(JLl/ᩳ֨֫;)V

    :cond_c
    const/16 v1, 0xb2

    move/from16 v5, v16

    if-ne v5, v1, :cond_e

    .line 188
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    add-int/lit8 v6, v4, 0x2

    aget-byte v1, v1, v6

    const/4 v6, 0x1

    if-ne v1, v6, :cond_e

    .line 189
    invoke-virtual {v7, v5}, Ll/ۛ֡ۧ;->ۧ(I)V

    goto :goto_8

    :cond_d
    move/from16 v5, v16

    :cond_e
    :goto_8
    if-eqz v5, :cond_10

    const/16 v1, 0xb3

    if-ne v5, v1, :cond_f

    goto :goto_9

    :cond_f
    const/16 v1, 0xb8

    if-ne v5, v1, :cond_17

    const/4 v1, 0x1

    .line 215
    iput-boolean v1, v0, Ll/ۘ֡ۧ;->ۢ:Z

    goto :goto_c

    :cond_10
    :goto_9
    sub-int v1, v2, v4

    .line 194
    iget-boolean v4, v0, Ll/ۘ֡ۧ;->᩷:Z

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v4, :cond_11

    iget-boolean v4, v0, Ll/ۘ֡ۧ;->ܿ:Z

    if-eqz v4, :cond_11

    iget-wide v7, v0, Ll/ۘ֡ۧ;->ܺ:J

    cmp-long v4, v7, v14

    if-eqz v4, :cond_11

    .line 196
    iget-boolean v9, v0, Ll/ۘ֡ۧ;->ۢ:Z

    .line 197
    iget-wide v10, v0, Ll/ۘ֡ۧ;->ۘ:J

    iget-wide v14, v0, Ll/ۘ֡ۧ;->ۡ:J

    sub-long/2addr v10, v14

    long-to-int v4, v10

    sub-int v10, v4, v1

    .line 198
    iget-object v6, v0, Ll/ۘ֡ۧ;->ܳ:Ll/᩵ۢۧ;

    const/4 v12, 0x0

    move v11, v1

    invoke-interface/range {v6 .. v12}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 200
    :cond_11
    iget-boolean v4, v0, Ll/ۘ֡ۧ;->ۖ:Z

    if-eqz v4, :cond_12

    iget-boolean v4, v0, Ll/ۘ֡ۧ;->᩷:Z

    if-eqz v4, :cond_15

    .line 202
    :cond_12
    iget-wide v6, v0, Ll/ۘ֡ۧ;->ۘ:J

    int-to-long v8, v1

    sub-long/2addr v6, v8

    iput-wide v6, v0, Ll/ۘ֡ۧ;->ۡ:J

    .line 204
    iget-wide v6, v0, Ll/ۘ֡ۧ;->᩻:J

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v6, v8

    if-eqz v1, :cond_13

    goto :goto_a

    .line 206
    :cond_13
    iget-wide v6, v0, Ll/ۘ֡ۧ;->ܺ:J

    cmp-long v1, v6, v8

    if-eqz v1, :cond_14

    .line 207
    iget-wide v10, v0, Ll/ۘ֡ۧ;->ᩳ:J

    add-long/2addr v6, v10

    goto :goto_a

    :cond_14
    move-wide v6, v8

    .line 208
    :goto_a
    iput-wide v6, v0, Ll/ۘ֡ۧ;->ܺ:J

    const/4 v1, 0x0

    .line 209
    iput-boolean v1, v0, Ll/ۘ֡ۧ;->ۢ:Z

    .line 210
    iput-wide v8, v0, Ll/ۘ֡ۧ;->᩻:J

    const/4 v1, 0x1

    .line 211
    iput-boolean v1, v0, Ll/ۘ֡ۧ;->ۖ:Z

    :cond_15
    if-nez v5, :cond_16

    const/4 v1, 0x1

    goto :goto_b

    :cond_16
    const/4 v1, 0x0

    .line 213
    :goto_b
    iput-boolean v1, v0, Ll/ۘ֡ۧ;->᩷:Z

    :cond_17
    :goto_c
    move-object/from16 v6, p1

    move v1, v13

    goto/16 :goto_0
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 2

    .line 113
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 114
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ֡ۧ;->ܽ:Ljava/lang/String;

    .line 115
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ֡ۧ;->ܳ:Ll/᩵ۢۧ;

    .line 116
    iget-object v0, p0, Ll/ۘ֡ۧ;->֡:Ll/֨ۚۧ;

    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {v0, p1, p2}, Ll/֨ۚۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 8

    .line 224
    iget-object v0, p0, Ll/ۘ֡ۧ;->ܳ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 226
    iget-boolean v4, p0, Ll/ۘ֡ۧ;->ۢ:Z

    .line 227
    iget-wide v0, p0, Ll/ۘ֡ۧ;->ۘ:J

    iget-wide v2, p0, Ll/ۘ֡ۧ;->ۡ:J

    sub-long/2addr v0, v2

    long-to-int v5, v0

    .line 228
    iget-object v1, p0, Ll/ۘ֡ۧ;->ܳ:Ll/᩵ۢۧ;

    iget-wide v2, p0, Ll/ۘ֡ۧ;->ܺ:J

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    :cond_0
    return-void
.end method
