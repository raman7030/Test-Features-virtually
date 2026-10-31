.class public final Ll/ۤۜ֨;
.super Ll/ܰۜ֨;
.source "21RU"


# instance fields
.field public final ֡:Ll/֫᩷֨;

.field public final ۖ:I

.field public final ۘ:I

.field public final ۚ:[I

.field public ܺ:I

.field public final ᩴ:Ll/ۨۜ֨;

.field public ᩵:I


# direct methods
.method public constructor <init>(IIIIILl/ۘ᩻֨;)V
    .locals 6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p6

    .line 28
    invoke-direct/range {v0 .. v5}, Ll/ܰۜ֨;-><init>(IIIILl/ۘ᩻֨;)V

    const/4 p2, -0x1

    .line 18
    iput p2, p0, Ll/ۤۜ֨;->ܺ:I

    add-int/lit8 p2, p1, 0x1

    .line 31
    iput p2, p0, Ll/ۤۜ֨;->ۖ:I

    .line 32
    iput p2, p0, Ll/ۤۜ֨;->᩵:I

    .line 34
    new-instance p3, Ll/ۨۜ֨;

    invoke-direct {p3, p1, p6}, Ll/ۨۜ֨;-><init>(ILl/ۘ᩻֨;)V

    iput-object p3, p0, Ll/ۤۜ֨;->ᩴ:Ll/ۨۜ֨;

    mul-int/lit8 p2, p2, 0x2

    const/4 p1, 0x0

    .line 35
    invoke-virtual {p6, p2, p1}, Ll/ۘ᩻֨;->֫(IZ)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۤۜ֨;->ۚ:[I

    .line 40
    new-instance p1, Ll/֫᩷֨;

    add-int/lit8 p2, p4, -0x1

    invoke-direct {p1, p2}, Ll/֫᩷֨;-><init>(I)V

    iput-object p1, p0, Ll/ۤۜ֨;->֡:Ll/֫᩷֨;

    if-lez p5, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    div-int/lit8 p4, p4, 0x2

    add-int/lit8 p5, p4, 0x10

    :goto_0
    iput p5, p0, Ll/ۤۜ֨;->ۘ:I

    return-void
.end method

.method private ܽ(II)V
    .locals 13

    .line 195
    iget v0, p0, Ll/ۤۜ֨;->ܺ:I

    shl-int/lit8 v1, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    shl-int/lit8 v0, v0, 0x1

    .line 198
    iget v2, p0, Ll/ۤۜ֨;->ۘ:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 201
    :goto_0
    iget v5, p0, Ll/ۤۜ֨;->᩵:I

    sub-int/2addr v5, p2

    add-int/lit8 v6, v2, -0x1

    .line 203
    iget-object v7, p0, Ll/ۤۜ֨;->ۚ:[I

    if-eqz v2, :cond_4

    iget v2, p0, Ll/ۤۜ֨;->ۖ:I

    if-lt v5, v2, :cond_0

    goto :goto_3

    .line 209
    :cond_0
    iget v8, p0, Ll/ۤۜ֨;->ܺ:I

    sub-int v9, v8, v5

    if-le v5, v8, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v9, v2

    shl-int/lit8 v2, v9, 0x1

    .line 211
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 213
    iget v9, p0, Ll/ܰۜ֨;->ۢ:I

    add-int v10, v9, v8

    sub-int/2addr v10, v5

    iget-object v11, p0, Ll/ܰۜ֨;->֫:[B

    aget-byte v10, v11, v10

    add-int v12, v9, v8

    aget-byte v12, v11, v12

    if-ne v10, v12, :cond_2

    add-int/lit8 v8, v8, 0x1

    .line 217
    invoke-static {v11, v9, v5, v8, p1}, Ll/۟ۜ֨;->֫([BIIII)I

    move-result v8

    if-ne v8, p1, :cond_2

    .line 220
    aget p1, v7, v2

    aput p1, v7, v0

    add-int/lit8 v2, v2, 0x1

    .line 221
    aget p1, v7, v2

    aput p1, v7, v1

    return-void

    .line 226
    :cond_2
    iget v9, p0, Ll/ܰۜ֨;->ۢ:I

    add-int v10, v9, v8

    sub-int/2addr v10, v5

    aget-byte v5, v11, v10

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v9, v8

    aget-byte v9, v11, v9

    and-int/lit16 v9, v9, 0xff

    if-ge v5, v9, :cond_3

    .line 228
    aput p2, v7, v0

    add-int/lit8 v2, v2, 0x1

    .line 230
    aget p2, v7, v2

    move v0, v2

    move v4, v8

    goto :goto_2

    .line 233
    :cond_3
    aput p2, v7, v1

    .line 235
    aget p2, v7, v2

    move v1, v2

    move v3, v8

    :goto_2
    move v2, v6

    goto :goto_0

    :cond_4
    :goto_3
    const/4 p1, 0x0

    .line 204
    aput p1, v7, v1

    .line 205
    aput p1, v7, v0

    return-void
.end method

.method private ᩻()I
    .locals 5

    .line 53
    iget v0, p0, Ll/ܰۜ֨;->᩻:I

    invoke-virtual {p0, v0}, Ll/ܰۜ֨;->ܽ(I)I

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    iget v1, p0, Ll/ۤۜ֨;->᩵:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۤۜ֨;->᩵:I

    const v2, 0x7fffffff

    iget v3, p0, Ll/ۤۜ֨;->ۖ:I

    if-ne v1, v2, :cond_0

    sub-int/2addr v2, v3

    .line 58
    iget-object v1, p0, Ll/ۤۜ֨;->ᩴ:Ll/ۨۜ֨;

    invoke-virtual {v1, v2}, Ll/ۨۜ֨;->֫(I)V

    mul-int/lit8 v1, v3, 0x2

    .line 59
    iget-object v4, p0, Ll/ۤۜ֨;->ۚ:[I

    invoke-static {v1, v2, v4}, Ll/ܰۜ֨;->֫(II[I)V

    .line 60
    iget v1, p0, Ll/ۤۜ֨;->᩵:I

    sub-int/2addr v1, v2

    iput v1, p0, Ll/ۤۜ֨;->᩵:I

    .line 63
    :cond_0
    iget v1, p0, Ll/ۤۜ֨;->ܺ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۤۜ֨;->ܺ:I

    if-ne v1, v3, :cond_1

    const/4 v1, 0x0

    .line 64
    iput v1, p0, Ll/ۤۜ֨;->ܺ:I

    :cond_1
    return v0
.end method


# virtual methods
.method public final ֫(Ll/ۘ᩻֨;)V
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۤۜ֨;->ۚ:[I

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([I)V

    .line 48
    iget-object v0, p0, Ll/ۤۜ֨;->ᩴ:Ll/ۨۜ֨;

    invoke-virtual {v0, p1}, Ll/ۨۜ֨;->֫(Ll/ۘ᩻֨;)V

    .line 153
    iget-object v0, p0, Ll/ܰۜ֨;->֫:[B

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([B)V

    return-void
.end method

.method public final ۧ()Ll/֫᩷֨;
    .locals 24

    move-object/from16 v0, p0

    .line 72
    iget-object v1, v0, Ll/ۤۜ֨;->֡:Ll/֫᩷֨;

    const/4 v2, 0x0

    iput v2, v1, Ll/֫᩷֨;->֫:I

    iget-object v3, v1, Ll/֫᩷֨;->ۧ:[I

    iget-object v4, v1, Ll/֫᩷֨;->ܽ:[I

    .line 76
    invoke-direct/range {p0 .. p0}, Ll/ۤۜ֨;->᩻()I

    move-result v5

    .line 78
    iget v6, v0, Ll/ܰۜ֨;->ܳ:I

    iget v7, v0, Ll/ܰۜ֨;->᩻:I

    if-ge v5, v6, :cond_1

    if-nez v5, :cond_0

    return-object v1

    :cond_0
    if-le v7, v5, :cond_2

    move v7, v5

    goto :goto_0

    :cond_1
    move v5, v6

    .line 87
    :cond_2
    :goto_0
    iget v6, v0, Ll/ܰۜ֨;->ۢ:I

    iget-object v8, v0, Ll/ۤۜ֨;->ᩴ:Ll/ۨۜ֨;

    iget-object v9, v0, Ll/ܰۜ֨;->֫:[B

    invoke-virtual {v8, v6, v9}, Ll/ۨۜ֨;->֫(I[B)V

    .line 88
    iget v6, v0, Ll/ۤۜ֨;->᩵:I

    invoke-virtual {v8}, Ll/ۨۜ֨;->֫()I

    move-result v10

    sub-int/2addr v6, v10

    .line 89
    iget v10, v0, Ll/ۤۜ֨;->᩵:I

    invoke-virtual {v8}, Ll/ۨۜ֨;->ۧ()I

    move-result v11

    sub-int/2addr v10, v11

    .line 90
    invoke-virtual {v8}, Ll/ۨۜ֨;->ܽ()I

    move-result v11

    .line 91
    iget v12, v0, Ll/ۤۜ֨;->᩵:I

    invoke-virtual {v8, v12}, Ll/ۨۜ֨;->ۧ(I)V

    .line 99
    iget v8, v0, Ll/ۤۜ֨;->ۖ:I

    const/4 v12, 0x1

    if-ge v6, v8, :cond_3

    iget v13, v0, Ll/ܰۜ֨;->ۢ:I

    sub-int v14, v13, v6

    aget-byte v14, v9, v14

    aget-byte v13, v9, v13

    if-ne v14, v13, :cond_3

    const/4 v13, 0x2

    .line 101
    aput v13, v4, v2

    add-int/lit8 v14, v6, -0x1

    .line 102
    aput v14, v3, v2

    .line 103
    iput v12, v1, Ll/֫᩷֨;->֫:I

    goto :goto_1

    :cond_3
    const/4 v13, 0x0

    :goto_1
    const/4 v2, 0x3

    if-eq v6, v10, :cond_4

    if-ge v10, v8, :cond_4

    .line 110
    iget v14, v0, Ll/ܰۜ֨;->ۢ:I

    sub-int v15, v14, v10

    const/16 v16, 0x0

    aget-byte v15, v9, v15

    aget-byte v14, v9, v14

    if-ne v15, v14, :cond_5

    .line 113
    iget v6, v1, Ll/֫᩷֨;->֫:I

    add-int/lit8 v13, v6, 0x1

    iput v13, v1, Ll/֫᩷֨;->֫:I

    add-int/lit8 v13, v10, -0x1

    aput v13, v3, v6

    const/4 v13, 0x3

    move v6, v10

    goto :goto_2

    :cond_4
    const/16 v16, 0x0

    .line 118
    :cond_5
    :goto_2
    iget v10, v1, Ll/֫᩷֨;->֫:I

    if-lez v10, :cond_6

    .line 119
    iget v10, v0, Ll/ܰۜ֨;->ۢ:I

    invoke-static {v9, v10, v6, v13, v5}, Ll/۟ۜ֨;->֫([BIIII)I

    move-result v13

    .line 121
    iget v6, v1, Ll/֫᩷֨;->֫:I

    sub-int/2addr v6, v12

    aput v13, v4, v6

    if-lt v13, v7, :cond_6

    .line 126
    invoke-direct {v0, v7, v11}, Ll/ۤۜ֨;->ܽ(II)V

    return-object v1

    :cond_6
    if-ge v13, v2, :cond_7

    goto :goto_3

    :cond_7
    move v2, v13

    .line 138
    :goto_3
    iget v6, v0, Ll/ۤۜ֨;->ܺ:I

    shl-int/2addr v6, v12

    add-int/lit8 v10, v6, 0x1

    .line 141
    iget v12, v0, Ll/ۤۜ֨;->ۘ:I

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 144
    :goto_4
    iget v15, v0, Ll/ۤۜ֨;->᩵:I

    sub-int/2addr v15, v11

    add-int/lit8 v17, v12, -0x1

    move/from16 v18, v11

    .line 149
    iget-object v11, v0, Ll/ۤۜ֨;->ۚ:[I

    if-eqz v12, :cond_e

    if-lt v15, v8, :cond_8

    goto/16 :goto_8

    .line 155
    :cond_8
    iget v12, v0, Ll/ۤۜ֨;->ܺ:I

    sub-int v19, v12, v15

    if-le v15, v12, :cond_9

    move v12, v8

    goto :goto_5

    :cond_9
    const/4 v12, 0x0

    :goto_5
    add-int v19, v19, v12

    shl-int/lit8 v12, v19, 0x1

    .line 157
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v19

    move/from16 v20, v8

    .line 159
    iget v8, v0, Ll/ܰۜ֨;->ۢ:I

    add-int v21, v8, v19

    sub-int v22, v21, v15

    move/from16 v23, v13

    aget-byte v13, v9, v22

    move/from16 v22, v14

    aget-byte v14, v9, v21

    if-ne v13, v14, :cond_c

    add-int/lit8 v13, v19, 0x1

    .line 160
    invoke-static {v9, v8, v15, v13, v5}, Ll/۟ۜ֨;->֫([BIIII)I

    move-result v8

    if-le v8, v2, :cond_b

    .line 165
    iget v2, v1, Ll/֫᩷֨;->֫:I

    aput v8, v4, v2

    add-int/lit8 v13, v15, -0x1

    .line 166
    aput v13, v3, v2

    add-int/lit8 v2, v2, 0x1

    .line 167
    iput v2, v1, Ll/֫᩷֨;->֫:I

    if-lt v8, v7, :cond_a

    .line 170
    aget v2, v11, v12

    aput v2, v11, v6

    add-int/lit8 v12, v12, 0x1

    .line 171
    aget v2, v11, v12

    aput v2, v11, v10

    return-object v1

    :cond_a
    move v2, v8

    move/from16 v19, v2

    goto :goto_6

    :cond_b
    move/from16 v19, v8

    .line 177
    :cond_c
    :goto_6
    iget v8, v0, Ll/ܰۜ֨;->ۢ:I

    add-int v8, v8, v19

    sub-int v13, v8, v15

    aget-byte v13, v9, v13

    and-int/lit16 v13, v13, 0xff

    aget-byte v8, v9, v8

    and-int/lit16 v8, v8, 0xff

    if-ge v13, v8, :cond_d

    .line 179
    aput v18, v11, v6

    add-int/lit8 v12, v12, 0x1

    .line 181
    aget v6, v11, v12

    move v11, v6

    move v6, v12

    move/from16 v14, v19

    move/from16 v13, v23

    goto :goto_7

    .line 184
    :cond_d
    aput v18, v11, v10

    .line 186
    aget v8, v11, v12

    move v11, v8

    move v10, v12

    move/from16 v13, v19

    move/from16 v14, v22

    :goto_7
    move/from16 v12, v17

    move/from16 v8, v20

    goto/16 :goto_4

    .line 150
    :cond_e
    :goto_8
    aput v16, v11, v10

    .line 151
    aput v16, v11, v6

    return-object v1
.end method

.method public final ᩳ(I)V
    .locals 4

    :goto_0
    add-int/lit8 v0, p1, -0x1

    if-lez p1, :cond_2

    .line 245
    invoke-direct {p0}, Ll/ۤۜ֨;->᩻()I

    move-result p1

    .line 247
    iget v1, p0, Ll/ܰۜ֨;->᩻:I

    if-ge p1, v1, :cond_0

    if-nez p1, :cond_1

    goto :goto_1

    :cond_0
    move p1, v1

    .line 254
    :cond_1
    iget-object v1, p0, Ll/ܰۜ֨;->֫:[B

    iget v2, p0, Ll/ܰۜ֨;->ۢ:I

    iget-object v3, p0, Ll/ۤۜ֨;->ᩴ:Ll/ۨۜ֨;

    invoke-virtual {v3, v2, v1}, Ll/ۨۜ֨;->֫(I[B)V

    .line 255
    invoke-virtual {v3}, Ll/ۨۜ֨;->ܽ()I

    move-result v1

    .line 256
    iget v2, p0, Ll/ۤۜ֨;->᩵:I

    invoke-virtual {v3, v2}, Ll/ۨۜ֨;->ۧ(I)V

    .line 258
    invoke-direct {p0, p1, v1}, Ll/ۤۜ֨;->ܽ(II)V

    :goto_1
    move p1, v0

    goto :goto_0

    :cond_2
    return-void
.end method
