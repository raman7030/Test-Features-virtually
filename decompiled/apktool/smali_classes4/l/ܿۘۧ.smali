.class public final Ll/ܿۘۧ;
.super Ljava/lang/Object;
.source "T8TF"


# static fields
.field public static final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1d

    new-array v0, v0, [I

    .line 43
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿۘۧ;->֫:[I

    return-void

    :array_0
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.89096448E8f
        0x4d344120    # 1.89010432E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
.end method

.method public static ֫(Ll/۠᩷ۧ;Z)Ll/ۘۢۧ;
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-static {p0, v0, p1}, Ll/ܿۘۧ;->֫(Ll/۠᩷ۧ;ZZ)Ll/ۘۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۠᩷ۧ;ZZ)Ll/ۘۢۧ;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 111
    invoke-interface/range {p0 .. p0}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v2

    const-wide/16 v4, 0x1000

    const-wide/16 v6, -0x1

    cmp-long v8, v2, v6

    if-eqz v8, :cond_1

    cmp-long v9, v2, v4

    if-lez v9, :cond_0

    goto :goto_0

    :cond_0
    move-wide v4, v2

    :cond_1
    :goto_0
    long-to-int v5, v4

    .line 118
    new-instance v4, Ll/ᩳ֨֫;

    const/16 v9, 0x40

    invoke-direct {v4, v9}, Ll/ᩳ֨֫;-><init>(I)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v10, v5, :cond_15

    const/16 v12, 0x8

    .line 125
    invoke-virtual {v4, v12}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 127
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v13

    const/4 v14, 0x1

    invoke-interface {v0, v14, v9, v12, v13}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result v9

    if-nez v9, :cond_2

    goto/16 :goto_9

    .line 132
    :cond_2
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v15

    .line 133
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    const-wide/16 v17, 0x1

    cmp-long v13, v15, v17

    if-nez v13, :cond_3

    .line 138
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v13

    .line 137
    invoke-interface {v0, v12, v12, v13}, Ll/۠᩷ۧ;->֫(II[B)V

    const/16 v12, 0x10

    .line 139
    invoke-virtual {v4, v12}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 140
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v15

    :goto_2
    move-wide v6, v15

    goto :goto_3

    :cond_3
    const-wide/16 v17, 0x0

    cmp-long v13, v15, v17

    if-nez v13, :cond_4

    .line 143
    invoke-interface/range {p0 .. p0}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v17

    cmp-long v13, v17, v6

    if-eqz v13, :cond_4

    .line 145
    invoke-interface/range {p0 .. p0}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v15

    sub-long v17, v17, v15

    int-to-long v12, v12

    add-long v15, v17, v12

    :cond_4
    const/16 v12, 0x8

    goto :goto_2

    :goto_3
    int-to-long v13, v12

    cmp-long v19, v6, v13

    if-gez v19, :cond_5

    .line 151
    new-instance v0, Ll/᩺ۤۡ;

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_5
    add-int/2addr v10, v12

    const v12, 0x6d6f6f76

    if-ne v9, v12, :cond_7

    long-to-int v7, v6

    add-int/2addr v5, v7

    if-eqz v8, :cond_6

    int-to-long v6, v5

    cmp-long v9, v6, v2

    if-lez v9, :cond_6

    long-to-int v5, v2

    :cond_6
    move-wide/from16 v19, v2

    goto/16 :goto_7

    :cond_7
    const v12, 0x6d6f6f66

    if-eq v9, v12, :cond_14

    const v12, 0x6d766578

    if-ne v9, v12, :cond_8

    goto/16 :goto_8

    :cond_8
    const v12, 0x6d646174

    if-ne v9, v12, :cond_9

    const/4 v11, 0x1

    :cond_9
    move-wide/from16 v19, v2

    int-to-long v2, v10

    add-long/2addr v2, v6

    sub-long/2addr v2, v13

    move/from16 v21, v11

    int-to-long v11, v5

    cmp-long v22, v2, v11

    if-ltz v22, :cond_a

    move/from16 v11, v21

    const/4 v13, 0x0

    goto/16 :goto_a

    :cond_a
    sub-long/2addr v6, v13

    long-to-int v2, v6

    add-int/2addr v10, v2

    const v3, 0x66747970

    if-ne v9, v3, :cond_12

    const/16 v3, 0x8

    if-ge v2, v3, :cond_b

    .line 189
    new-instance v0, Ll/᩺ۤۡ;

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 191
    :cond_b
    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 192
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v0, v6, v2, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 193
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    .line 194
    invoke-static {v2, v1}, Ll/ܿۘۧ;->֫(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v11, 0x1

    goto :goto_4

    :cond_c
    move/from16 v11, v21

    :goto_4
    const/4 v2, 0x4

    .line 198
    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 199
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    div-int/2addr v3, v2

    if-nez v11, :cond_f

    if-lez v3, :cond_f

    .line 202
    new-array v13, v3, [I

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v3, :cond_e

    .line 204
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    aput v6, v13, v2

    .line 205
    invoke-static {v6, v1}, Ll/ܿۘۧ;->֫(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v14, 0x1

    goto :goto_6

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_e
    move v14, v11

    goto :goto_6

    :cond_f
    move v14, v11

    const/4 v13, 0x0

    :goto_6
    if-nez v14, :cond_11

    .line 213
    new-instance v0, Ll/ۜۚۜ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz v13, :cond_10

    .line 40
    invoke-static {v13}, Ll/ۙ᩺ܺ;->֫([I)V

    return-object v0

    .line 41
    :cond_10
    sget v1, Ll/ۙ᩺ܺ;->᩶:I

    return-object v0

    :cond_11
    move v11, v14

    goto :goto_7

    :cond_12
    if-eqz v2, :cond_13

    .line 217
    invoke-interface {v0, v2}, Ll/۠᩷ۧ;->֫(I)V

    :cond_13
    move/from16 v11, v21

    :goto_7
    const/4 v9, 0x0

    move-wide/from16 v2, v19

    const-wide/16 v6, -0x1

    goto/16 :goto_1

    :cond_14
    :goto_8
    const/4 v0, 0x1

    const/4 v13, 0x0

    goto :goto_b

    :cond_15
    :goto_9
    const/4 v0, 0x0

    move-object v13, v0

    :goto_a
    const/4 v0, 0x0

    :goto_b
    if-nez v11, :cond_16

    .line 221
    sget-object v0, Ll/۟ۖۧ;->᩸:Ll/۟ۖۧ;

    return-object v0

    :cond_16
    move/from16 v1, p1

    if-eq v1, v0, :cond_18

    if-eqz v0, :cond_17

    .line 224
    sget-object v0, Ll/۫ۖۧ;->᩸:Ll/۫ۖۧ;

    return-object v0

    .line 225
    :cond_17
    sget-object v0, Ll/۫ۖۧ;->᩹:Ll/۫ۖۧ;

    return-object v0

    :cond_18
    return-object v13
.end method

.method public static ֫(Ll/ܺ᩷ۧ;)Ll/ۘۢۧ;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 88
    invoke-static {p0, v0, v1}, Ll/ܿۘۧ;->֫(Ll/۠᩷ۧ;ZZ)Ll/ۘۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IZ)Z
    .locals 3

    ushr-int/lit8 v0, p0, 0x8

    const v1, 0x336770

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    const v0, 0x68656963

    if-ne p0, v0, :cond_1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1d

    if-ge v0, v1, :cond_3

    .line 241
    sget-object v1, Ll/ܿۘۧ;->֫:[I

    aget v1, v1, v0

    if-ne v1, p0, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return p1
.end method
