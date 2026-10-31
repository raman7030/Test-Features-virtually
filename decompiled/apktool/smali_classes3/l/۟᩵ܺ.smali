.class public final Ll/۟᩵ܺ;
.super Ljava/lang/Object;
.source "AB8B"


# static fields
.field public static final ۧ:[F

.field public static final ܽ:[F


# instance fields
.field public ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x27

    new-array v1, v0, [F

    .line 265
    fill-array-data v1, :array_0

    sput-object v1, Ll/۟᩵ܺ;->ܽ:[F

    new-array v0, v0, [F

    .line 271
    fill-array-data v0, :array_1

    sput-object v0, Ll/۟᩵ܺ;->ۧ:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x41200000    # 10.0f
        0x42c80000    # 100.0f
        0x447a0000    # 1000.0f
        0x461c4000    # 10000.0f
        0x47c35000    # 100000.0f
        0x49742400    # 1000000.0f
        0x4b189680    # 1.0E7f
        0x4cbebc20    # 1.0E8f
        0x4e6e6b28    # 1.0E9f
        0x501502f9    # 1.0E10f
        0x51ba43b7    # 9.9999998E10f
        0x5368d4a5    # 1.0E12f
        0x551184e7    # 9.9999998E12f
        0x56b5e621    # 1.0E14f
        0x58635fa9    # 9.9999999E14f
        0x5a0e1bca    # 1.00000003E16f
        0x5bb1a2bc    # 9.9999998E16f
        0x5d5e0b6b    # 9.9999998E17f
        0x5f0ac723    # 1.0E19f
        0x60ad78ec    # 1.0E20f
        0x6258d727    # 1.0E21f
        0x64078678    # 1.0E22f
        0x65a96816    # 1.0E23f
        0x6753c21c    # 1.0E24f
        0x69045951    # 1.0E25f
        0x6aa56fa6    # 1.0E26f
        0x6c4ecb8f    # 1.0E27f
        0x6e013f39    # 1.0E28f
        0x6fa18f08    # 1.0E29f
        0x7149f2ca    # 1.0E30f
        0x72fc6f7c    # 1.0E31f
        0x749dc5ae    # 1.0E32f
        0x76453719    # 1.0E33f
        0x77f684df    # 1.0E34f
        0x799a130c    # 1.0E35f
        0x7b4097ce    # 1.0E36f
        0x7cf0bdc2    # 1.0E37f
        0x7e967699    # 1.0E38f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3dcccccd    # 0.1f
        0x3c23d70a    # 0.01f
        0x3a83126f    # 0.001f
        0x38d1b717    # 1.0E-4f
        0x3727c5ac    # 1.0E-5f
        0x358637bd    # 1.0E-6f
        0x33d6bf95    # 1.0E-7f
        0x322bcc77    # 1.0E-8f
        0x3089705f    # 1.0E-9f
        0x2edbe6ff    # 1.0E-10f
        0x2d2febff    # 1.0E-11f
        0x2b8cbccc    # 1.0E-12f
        0x29e12e13    # 1.0E-13f
        0x283424dc    # 1.0E-14f
        0x26901d7d    # 1.0E-15f
        0x24e69595    # 1.0E-16f
        0x233877aa    # 1.0E-17f
        0x219392ef    # 1.0E-18f
        0x1fec1e4a    # 1.0E-19f
        0x1e3ce508    # 1.0E-20f
        0x1c971da0    # 1.0E-21f
        0x1af1c901    # 1.0E-22f
        0x19416d9a    # 1.0E-23f
        0x179abe15    # 1.0E-24f
        0x15f79688    # 1.0E-25f
        0x14461206    # 1.0E-26f
        0x129e74d2    # 1.0E-27f
        0x10fd87b6    # 1.0E-28f
        0xf4ad2f8    # 1.0E-29f
        0xda24260    # 1.0E-30f
        0xc01ceb3    # 1.0E-31f
        0xa4fb11f    # 1.0E-32f
        0x8a6274c    # 1.0E-33f
        0x704ec3d    # 1.0E-34f
        0x554ad2e    # 1.0E-35f
        0x3aa2425    # 1.0E-36f
        0x2081cea    # 1.0E-37f
        0x6ce3ee    # 1.0E-38f
    .end array-data
.end method


# virtual methods
.method public final ֫(IIILjava/lang/String;)F
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    .line 72
    iput v1, v0, Ll/۟᩵ܺ;->֫:I

    const/high16 v4, 0x7fc00000    # Float.NaN

    if-lt v1, v2, :cond_0

    return v4

    .line 77
    :cond_0
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x2d

    const/16 v5, 0x2b

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 81
    :goto_0
    iget v6, v0, Ll/۟᩵ܺ;->֫:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v0, Ll/۟᩵ܺ;->֫:I

    .line 84
    :goto_1
    iget v6, v0, Ll/۟᩵ܺ;->֫:I

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x7fc00000    # Float.NaN

    .line 86
    :goto_2
    iget v15, v0, Ll/۟᩵ܺ;->֫:I

    const-wide/16 v16, 0x0

    const/16 v4, 0x39

    const/16 v5, 0x30

    const-wide v18, 0xcccccccccccccccL

    if-ge v15, v2, :cond_b

    .line 88
    invoke-virtual {v3, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-ne v15, v5, :cond_4

    if-nez v9, :cond_3

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_4
    const/16 v5, 0x31

    if-lt v15, v5, :cond_8

    if-gt v15, v4, :cond_8

    add-int/2addr v9, v10

    :goto_3
    const-wide/16 v4, 0xa

    cmp-long v20, v7, v18

    if-lez v10, :cond_6

    if-lez v20, :cond_5

    return v14

    :cond_5
    mul-long v7, v7, v4

    add-int/lit8 v10, v10, -0x1

    goto :goto_3

    :cond_6
    if-lez v20, :cond_7

    return v14

    :cond_7
    mul-long v7, v7, v4

    add-int/lit8 v15, v15, -0x30

    int-to-long v4, v15

    add-long/2addr v7, v4

    add-int/lit8 v9, v9, 0x1

    cmp-long v4, v7, v16

    if-gez v4, :cond_a

    return v14

    :cond_8
    const/16 v5, 0x2e

    if-ne v15, v5, :cond_b

    if-eqz v12, :cond_9

    goto :goto_5

    .line 128
    :cond_9
    iget v4, v0, Ll/۟᩵ܺ;->֫:I

    sub-int/2addr v4, v6

    const/4 v5, 0x1

    move v13, v4

    const/4 v12, 0x1

    .line 133
    :cond_a
    :goto_4
    iget v4, v0, Ll/۟᩵ܺ;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Ll/۟᩵ܺ;->֫:I

    const/16 v4, 0x2d

    const/16 v5, 0x2b

    goto :goto_2

    :cond_b
    :goto_5
    if-eqz v12, :cond_c

    .line 136
    iget v5, v0, Ll/۟᩵ܺ;->֫:I

    sub-int v5, v5, p3

    add-int/lit8 v6, v13, 0x1

    if-ne v5, v6, :cond_c

    return v14

    :cond_c
    if-nez v9, :cond_e

    if-nez v11, :cond_d

    return v14

    :cond_d
    const/4 v9, 0x1

    :cond_e
    if-eqz v12, :cond_f

    sub-int/2addr v13, v11

    sub-int v10, v13, v9

    .line 161
    :cond_f
    iget v5, v0, Ll/۟᩵ܺ;->֫:I

    if-ge v5, v2, :cond_18

    .line 163
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x45

    if-eq v5, v6, :cond_10

    const/16 v6, 0x65

    if-ne v5, v6, :cond_18

    .line 170
    :cond_10
    iget v5, v0, Ll/۟᩵ܺ;->֫:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v0, Ll/۟᩵ܺ;->֫:I

    if-ne v5, v2, :cond_11

    return v14

    .line 177
    :cond_11
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x2b

    if-eq v5, v6, :cond_13

    const/16 v6, 0x2d

    if-eq v5, v6, :cond_12

    packed-switch v5, :pswitch_data_0

    .line 189
    iget v5, v0, Ll/۟᩵ܺ;->֫:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v0, Ll/۟᩵ܺ;->֫:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto :goto_8

    :pswitch_0
    const/4 v5, 0x0

    goto :goto_7

    :cond_12
    const/4 v5, 0x1

    goto :goto_6

    :cond_13
    const/4 v5, 0x0

    .line 180
    :goto_6
    iget v6, v0, Ll/۟᩵ܺ;->֫:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v0, Ll/۟᩵ܺ;->֫:I

    :goto_7
    const/4 v6, 0x0

    :goto_8
    if-nez v6, :cond_18

    .line 194
    iget v6, v0, Ll/۟᩵ܺ;->֫:I

    const/4 v11, 0x0

    .line 196
    :goto_9
    iget v12, v0, Ll/۟᩵ܺ;->֫:I

    if-ge v12, v2, :cond_15

    .line 198
    invoke-virtual {v3, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x30

    if-lt v12, v13, :cond_15

    if-gt v12, v4, :cond_15

    move/from16 p3, v5

    int-to-long v4, v11

    cmp-long v13, v4, v18

    if-lez v13, :cond_14

    return v14

    :cond_14
    mul-int/lit8 v11, v11, 0xa

    add-int/lit8 v12, v12, -0x30

    add-int/2addr v11, v12

    .line 207
    iget v4, v0, Ll/۟᩵ܺ;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Ll/۟᩵ܺ;->֫:I

    move/from16 v5, p3

    const/16 v4, 0x39

    goto :goto_9

    :cond_15
    move/from16 p3, v5

    .line 214
    iget v2, v0, Ll/۟᩵ܺ;->֫:I

    if-ne v2, v6, :cond_16

    return v14

    :cond_16
    if-eqz p3, :cond_17

    sub-int/2addr v10, v11

    goto :goto_a

    :cond_17
    add-int/2addr v10, v11

    :cond_18
    :goto_a
    add-int/2addr v9, v10

    const/16 v2, 0x27

    if-gt v9, v2, :cond_1e

    const/16 v2, -0x2c

    if-ge v9, v2, :cond_19

    goto :goto_c

    :cond_19
    long-to-float v2, v7

    cmp-long v3, v7, v16

    if-eqz v3, :cond_1c

    if-lez v10, :cond_1a

    .line 244
    sget-object v3, Ll/۟᩵ܺ;->ܽ:[F

    aget v3, v3, v10

    goto :goto_b

    :cond_1a
    if-gez v10, :cond_1c

    const/16 v3, -0x26

    if-ge v10, v3, :cond_1b

    float-to-double v2, v2

    const-wide v4, 0x3bc79ca10c924223L    # 1.0E-20

    mul-double v2, v2, v4

    double-to-float v2, v2

    add-int/lit8 v10, v10, 0x14

    .line 257
    :cond_1b
    sget-object v3, Ll/۟᩵ܺ;->ۧ:[F

    neg-int v4, v10

    aget v3, v3, v4

    :goto_b
    mul-float v2, v2, v3

    :cond_1c
    if-eqz v1, :cond_1d

    neg-float v1, v2

    return v1

    :cond_1d
    return v2

    :cond_1e
    :goto_c
    return v14

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()I
    .locals 1

    .line 44
    iget v0, p0, Ll/۟᩵ܺ;->֫:I

    return v0
.end method
