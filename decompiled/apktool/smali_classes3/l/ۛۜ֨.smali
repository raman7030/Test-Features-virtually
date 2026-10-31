.class public final Ll/ۛۜ֨;
.super Ll/ܰۜ֨;
.source "P1SD"


# instance fields
.field public ֡:I

.field public ۖ:I

.field public final ۘ:I

.field public final ۚ:Ll/֫᩷֨;

.field public final ܺ:[I

.field public final ᩴ:I

.field public final ᩵:Ll/ۨۜ֨;


# direct methods
.method public constructor <init>(IIIIILl/ۘ᩻֨;)V
    .locals 6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p6

    .line 35
    invoke-direct/range {v0 .. v5}, Ll/ܰۜ֨;-><init>(IIIILl/ۘ᩻֨;)V

    const/4 p2, -0x1

    .line 18
    iput p2, p0, Ll/ۛۜ֨;->ۖ:I

    .line 38
    new-instance p2, Ll/ۨۜ֨;

    invoke-direct {p2, p1, p6}, Ll/ۨۜ֨;-><init>(ILl/ۘ᩻֨;)V

    iput-object p2, p0, Ll/ۛۜ֨;->᩵:Ll/ۨۜ֨;

    add-int/lit8 p1, p1, 0x1

    .line 41
    iput p1, p0, Ll/ۛۜ֨;->ۘ:I

    const/4 p2, 0x0

    .line 42
    invoke-virtual {p6, p1, p2}, Ll/ۘ᩻֨;->֫(IZ)[I

    move-result-object p2

    iput-object p2, p0, Ll/ۛۜ֨;->ܺ:[I

    .line 43
    iput p1, p0, Ll/ۛۜ֨;->֡:I

    .line 48
    new-instance p1, Ll/֫᩷֨;

    add-int/lit8 p2, p4, -0x1

    invoke-direct {p1, p2}, Ll/֫᩷֨;-><init>(I)V

    iput-object p1, p0, Ll/ۛۜ֨;->ۚ:Ll/֫᩷֨;

    if-lez p5, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    div-int/lit8 p4, p4, 0x4

    add-int/lit8 p5, p4, 0x4

    :goto_0
    iput p5, p0, Ll/ۛۜ֨;->ᩴ:I

    return-void
.end method

.method private ᩻()I
    .locals 4

    const/4 v0, 0x4

    .line 70
    invoke-virtual {p0, v0}, Ll/ܰۜ֨;->ܽ(I)I

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    iget v1, p0, Ll/ۛۜ֨;->֡:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۛۜ֨;->֡:I

    const v2, 0x7fffffff

    iget v3, p0, Ll/ۛۜ֨;->ۘ:I

    if-ne v1, v2, :cond_0

    sub-int/2addr v2, v3

    .line 75
    iget-object v1, p0, Ll/ۛۜ֨;->᩵:Ll/ۨۜ֨;

    invoke-virtual {v1, v2}, Ll/ۨۜ֨;->֫(I)V

    .line 76
    iget-object v1, p0, Ll/ۛۜ֨;->ܺ:[I

    invoke-static {v3, v2, v1}, Ll/ܰۜ֨;->֫(II[I)V

    .line 77
    iget v1, p0, Ll/ۛۜ֨;->֡:I

    sub-int/2addr v1, v2

    iput v1, p0, Ll/ۛۜ֨;->֡:I

    .line 80
    :cond_0
    iget v1, p0, Ll/ۛۜ֨;->ۖ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۛۜ֨;->ۖ:I

    if-ne v1, v3, :cond_1

    const/4 v1, 0x0

    .line 81
    iput v1, p0, Ll/ۛۜ֨;->ۖ:I

    :cond_1
    return v0
.end method


# virtual methods
.method public final ֫(Ll/ۘ᩻֨;)V
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۛۜ֨;->ܺ:[I

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([I)V

    .line 59
    iget-object v0, p0, Ll/ۛۜ֨;->᩵:Ll/ۨۜ֨;

    invoke-virtual {v0, p1}, Ll/ۨۜ֨;->֫(Ll/ۘ᩻֨;)V

    .line 153
    iget-object v0, p0, Ll/ܰۜ֨;->֫:[B

    invoke-virtual {p1, v0}, Ll/ۘ᩻֨;->֫([B)V

    return-void
.end method

.method public final ۧ()Ll/֫᩷֨;
    .locals 17

    move-object/from16 v0, p0

    .line 89
    iget-object v1, v0, Ll/ۛۜ֨;->ۚ:Ll/֫᩷֨;

    const/4 v2, 0x0

    iput v2, v1, Ll/֫᩷֨;->֫:I

    iget-object v3, v1, Ll/֫᩷֨;->ۧ:[I

    iget-object v4, v1, Ll/֫᩷֨;->ܽ:[I

    .line 92
    invoke-direct/range {p0 .. p0}, Ll/ۛۜ֨;->᩻()I

    move-result v5

    .line 94
    iget v6, v0, Ll/ܰۜ֨;->ܳ:I

    iget v7, v0, Ll/ܰۜ֨;->᩻:I

    if-ge v5, v6, :cond_1

    if-nez v5, :cond_0

    goto/16 :goto_5

    :cond_0
    if-le v7, v5, :cond_2

    move v7, v5

    goto :goto_0

    :cond_1
    move v5, v6

    .line 103
    :cond_2
    :goto_0
    iget v6, v0, Ll/ܰۜ֨;->ۢ:I

    iget-object v8, v0, Ll/ۛۜ֨;->᩵:Ll/ۨۜ֨;

    iget-object v9, v0, Ll/ܰۜ֨;->֫:[B

    invoke-virtual {v8, v6, v9}, Ll/ۨۜ֨;->֫(I[B)V

    .line 104
    iget v6, v0, Ll/ۛۜ֨;->֡:I

    invoke-virtual {v8}, Ll/ۨۜ֨;->֫()I

    move-result v10

    sub-int/2addr v6, v10

    .line 105
    iget v10, v0, Ll/ۛۜ֨;->֡:I

    invoke-virtual {v8}, Ll/ۨۜ֨;->ۧ()I

    move-result v11

    sub-int/2addr v10, v11

    .line 106
    invoke-virtual {v8}, Ll/ۨۜ֨;->ܽ()I

    move-result v11

    .line 107
    iget v12, v0, Ll/ۛۜ֨;->֡:I

    invoke-virtual {v8, v12}, Ll/ۨۜ֨;->ۧ(I)V

    .line 109
    iget v8, v0, Ll/ۛۜ֨;->ۖ:I

    iget-object v12, v0, Ll/ۛۜ֨;->ܺ:[I

    aput v11, v12, v8

    .line 117
    iget v8, v0, Ll/ۛۜ֨;->ۘ:I

    const/4 v13, 0x1

    if-ge v6, v8, :cond_3

    iget v14, v0, Ll/ܰۜ֨;->ۢ:I

    sub-int v15, v14, v6

    aget-byte v15, v9, v15

    aget-byte v14, v9, v14

    if-ne v15, v14, :cond_3

    const/4 v14, 0x2

    .line 119
    aput v14, v4, v2

    add-int/lit8 v15, v6, -0x1

    .line 120
    aput v15, v3, v2

    .line 121
    iput v13, v1, Ll/֫᩷֨;->֫:I

    goto :goto_1

    :cond_3
    const/4 v14, 0x0

    :goto_1
    const/4 v2, 0x3

    if-eq v6, v10, :cond_4

    if-ge v10, v8, :cond_4

    .line 128
    iget v13, v0, Ll/ܰۜ֨;->ۢ:I

    sub-int v15, v13, v10

    aget-byte v15, v9, v15

    aget-byte v13, v9, v13

    if-ne v15, v13, :cond_4

    .line 131
    iget v6, v1, Ll/֫᩷֨;->֫:I

    add-int/lit8 v13, v6, 0x1

    iput v13, v1, Ll/֫᩷֨;->֫:I

    add-int/lit8 v13, v10, -0x1

    aput v13, v3, v6

    const/4 v14, 0x3

    move v6, v10

    .line 136
    :cond_4
    iget v10, v1, Ll/֫᩷֨;->֫:I

    if-lez v10, :cond_5

    .line 137
    iget v10, v0, Ll/ܰۜ֨;->ۢ:I

    invoke-static {v9, v10, v6, v14, v5}, Ll/۟ۜ֨;->֫([BIIII)I

    move-result v14

    .line 139
    iget v6, v1, Ll/֫᩷֨;->֫:I

    add-int/lit8 v6, v6, -0x1

    aput v14, v4, v6

    if-lt v14, v7, :cond_5

    goto :goto_5

    :cond_5
    if-ge v14, v2, :cond_6

    goto :goto_2

    :cond_6
    move v2, v14

    .line 152
    :goto_2
    iget v6, v0, Ll/ۛۜ֨;->ᩴ:I

    .line 155
    :goto_3
    iget v10, v0, Ll/ۛۜ֨;->֡:I

    sub-int/2addr v10, v11

    add-int/lit8 v11, v6, -0x1

    if-eqz v6, :cond_b

    if-lt v10, v8, :cond_7

    goto :goto_5

    .line 163
    :cond_7
    iget v6, v0, Ll/ۛۜ֨;->ۖ:I

    sub-int v13, v6, v10

    if-le v10, v6, :cond_8

    move v6, v8

    goto :goto_4

    :cond_8
    const/4 v6, 0x0

    :goto_4
    add-int/2addr v13, v6

    .line 164
    aget v6, v12, v13

    .line 169
    iget v13, v0, Ll/ܰۜ֨;->ۢ:I

    add-int v14, v13, v2

    sub-int v15, v14, v10

    aget-byte v15, v9, v15

    aget-byte v14, v9, v14

    if-ne v15, v14, :cond_a

    sub-int v14, v13, v10

    aget-byte v14, v9, v14

    aget-byte v15, v9, v13

    if-ne v14, v15, :cond_a

    const/4 v14, 0x1

    .line 172
    invoke-static {v9, v13, v10, v14, v5}, Ll/۟ۜ֨;->֫([BIIII)I

    move-result v13

    if-le v13, v2, :cond_a

    .line 179
    iget v2, v1, Ll/֫᩷֨;->֫:I

    aput v13, v4, v2

    add-int/lit8 v10, v10, -0x1

    .line 180
    aput v10, v3, v2

    add-int/2addr v2, v14

    .line 181
    iput v2, v1, Ll/֫᩷֨;->֫:I

    if-lt v13, v7, :cond_9

    goto :goto_5

    :cond_9
    move v2, v13

    :cond_a
    move/from16 v16, v11

    move v11, v6

    move/from16 v6, v16

    goto :goto_3

    :cond_b
    :goto_5
    return-object v1
.end method

.method public final ᩳ(I)V
    .locals 4

    :goto_0
    add-int/lit8 v0, p1, -0x1

    if-lez p1, :cond_1

    .line 197
    invoke-direct {p0}, Ll/ۛۜ֨;->᩻()I

    move-result p1

    if-eqz p1, :cond_0

    .line 199
    iget-object p1, p0, Ll/ܰۜ֨;->֫:[B

    iget v1, p0, Ll/ܰۜ֨;->ۢ:I

    iget-object v2, p0, Ll/ۛۜ֨;->᩵:Ll/ۨۜ֨;

    invoke-virtual {v2, v1, p1}, Ll/ۨۜ֨;->֫(I[B)V

    .line 200
    iget p1, p0, Ll/ۛۜ֨;->ۖ:I

    invoke-virtual {v2}, Ll/ۨۜ֨;->ܽ()I

    move-result v1

    iget-object v3, p0, Ll/ۛۜ֨;->ܺ:[I

    aput v1, v3, p1

    .line 201
    iget p1, p0, Ll/ۛۜ֨;->֡:I

    invoke-virtual {v2, p1}, Ll/ۨۜ֨;->ۧ(I)V

    :cond_0
    move p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method
