.class public final Ll/ۘ᩷֨;
.super Ll/ۖ᩷֨;
.source "71RJ"


# instance fields
.field public ۫:Ll/֫᩷֨;


# direct methods
.method public constructor <init>(Ll/ܶ᩷֨;IIIIIIILl/ۘ᩻֨;)V
    .locals 11

    const/4 v0, 0x1

    move/from16 v1, p5

    .line 30
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v3, 0x110

    move v1, p4

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    move-object/from16 v7, p9

    .line 29
    invoke-static/range {v1 .. v7}, Ll/ܰۜ֨;->֫(IIIIIILl/ۘ᩻֨;)Ll/ܰۜ֨;

    move-result-object v6

    move-object v4, p0

    move-object v5, p1

    move v7, p2

    move v8, p3

    move v9, p4

    move/from16 v10, p6

    invoke-direct/range {v4 .. v10}, Ll/ۖ᩷֨;-><init>(Ll/ܶ᩷֨;Ll/ܰۜ֨;IIII)V

    const/4 v0, 0x0

    move-object v1, p0

    .line 17
    iput-object v0, v1, Ll/ۘ᩷֨;->۫:Ll/֫᩷֨;

    return-void
.end method


# virtual methods
.method public final ܿ()I
    .locals 16

    move-object/from16 v0, p0

    .line 47
    iget v1, v0, Ll/ۖ᩷֨;->ۙ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 48
    invoke-virtual/range {p0 .. p0}, Ll/ۖ᩷֨;->ᩳ()Ll/֫᩷֨;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ᩷֨;->۫:Ll/֫᩷֨;

    .line 50
    :cond_0
    iput v2, v0, Ll/ۖ᩷֨;->ᩴ:I

    .line 56
    iget-object v1, v0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    invoke-virtual {v1}, Ll/ܰۜ֨;->֫()I

    move-result v2

    const/16 v3, 0x111

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ge v2, v3, :cond_1

    const/4 v1, 0x1

    goto/16 :goto_7

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 63
    :goto_0
    iget v8, v0, Ll/ۖ᩷֨;->᩹:I

    iget-object v9, v0, Ll/ܿ᩷֨;->ۡ:[I

    const/4 v10, 0x4

    if-ge v5, v10, :cond_5

    .line 64
    aget v9, v9, v5

    invoke-virtual {v1, v9, v2}, Ll/ܰۜ֨;->ۧ(II)I

    move-result v9

    if-ge v9, v3, :cond_2

    goto :goto_1

    :cond_2
    if-lt v9, v8, :cond_3

    .line 70
    iput v5, v0, Ll/ۖ᩷֨;->ᩴ:I

    add-int/lit8 v1, v9, -0x1

    .line 71
    invoke-virtual {v0, v1}, Ll/ۖ᩷֨;->֫(I)V

    return v9

    :cond_3
    if-le v9, v6, :cond_4

    move v7, v5

    move v6, v9

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 85
    :cond_5
    iget-object v5, v0, Ll/ۘ᩷֨;->۫:Ll/֫᩷֨;

    iget v11, v5, Ll/֫᩷֨;->֫:I

    if-lez v11, :cond_8

    .line 86
    iget-object v12, v5, Ll/֫᩷֨;->ܽ:[I

    sub-int/2addr v11, v4

    aget v12, v12, v11

    .line 87
    iget-object v5, v5, Ll/֫᩷֨;->ۧ:[I

    aget v5, v5, v11

    if-lt v12, v8, :cond_6

    add-int/2addr v5, v10

    .line 90
    iput v5, v0, Ll/ۖ᩷֨;->ᩴ:I

    add-int/lit8 v1, v12, -0x1

    .line 91
    invoke-virtual {v0, v1}, Ll/ۖ᩷֨;->֫(I)V

    return v12

    .line 95
    :cond_6
    :goto_2
    iget-object v8, v0, Ll/ۘ᩷֨;->۫:Ll/֫᩷֨;

    iget v11, v8, Ll/֫᩷֨;->֫:I

    if-le v11, v4, :cond_7

    iget-object v4, v8, Ll/֫᩷֨;->ܽ:[I

    add-int/lit8 v13, v11, -0x2

    aget v14, v4, v13

    add-int/lit8 v14, v14, 0x1

    if-ne v12, v14, :cond_7

    .line 97
    iget-object v14, v8, Ll/֫᩷֨;->ۧ:[I

    aget v13, v14, v13

    ushr-int/lit8 v15, v5, 0x7

    if-ge v13, v15, :cond_7

    add-int/lit8 v5, v11, -0x1

    .line 100
    iput v5, v8, Ll/֫᩷֨;->֫:I

    add-int/lit8 v11, v11, -0x2

    .line 101
    aget v12, v4, v11

    .line 102
    aget v5, v14, v11

    const/4 v4, 0x1

    goto :goto_2

    :cond_7
    const/4 v15, 0x1

    if-ne v12, v3, :cond_9

    const/16 v4, 0x80

    if-lt v5, v4, :cond_9

    const/4 v12, 0x1

    goto :goto_3

    :cond_8
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x1

    :cond_9
    :goto_3
    if-lt v6, v3, :cond_c

    add-int/lit8 v4, v6, 0x1

    if-ge v4, v12, :cond_b

    add-int/lit8 v4, v6, 0x2

    if-lt v4, v12, :cond_a

    const/16 v4, 0x200

    if-ge v5, v4, :cond_b

    :cond_a
    add-int/lit8 v4, v6, 0x3

    if-lt v4, v12, :cond_c

    const v4, 0x8000

    if-lt v5, v4, :cond_c

    .line 113
    :cond_b
    iput v7, v0, Ll/ۖ᩷֨;->ᩴ:I

    add-int/lit8 v1, v6, -0x1

    .line 114
    invoke-virtual {v0, v1}, Ll/ۖ᩷֨;->֫(I)V

    return v6

    :cond_c
    if-lt v12, v3, :cond_14

    if-gt v2, v3, :cond_d

    goto :goto_6

    .line 124
    :cond_d
    invoke-virtual/range {p0 .. p0}, Ll/ۖ᩷֨;->ᩳ()Ll/֫᩷֨;

    move-result-object v2

    iput-object v2, v0, Ll/ۘ᩷֨;->۫:Ll/֫᩷֨;

    .line 126
    iget v4, v2, Ll/֫᩷֨;->֫:I

    if-lez v4, :cond_11

    .line 127
    iget-object v6, v2, Ll/֫᩷֨;->ܽ:[I

    add-int/lit8 v4, v4, -0x1

    aget v6, v6, v4

    .line 128
    iget-object v2, v2, Ll/֫᩷֨;->ۧ:[I

    aget v2, v2, v4

    if-lt v6, v12, :cond_e

    if-lt v2, v5, :cond_14

    :cond_e
    add-int/lit8 v4, v12, 0x1

    if-ne v6, v4, :cond_10

    ushr-int/lit8 v7, v2, 0x7

    if-ge v5, v7, :cond_f

    goto :goto_4

    :cond_f
    return v15

    :cond_10
    :goto_4
    if-gt v6, v4, :cond_14

    add-int/lit8 v6, v6, 0x1

    if-lt v6, v12, :cond_11

    const/4 v4, 0x3

    if-lt v12, v4, :cond_11

    ushr-int/lit8 v4, v5, 0x7

    if-ge v2, v4, :cond_11

    return v15

    :cond_11
    add-int/lit8 v2, v12, -0x1

    .line 140
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v10, :cond_13

    .line 142
    aget v4, v9, v3

    invoke-virtual {v1, v4, v2}, Ll/ܰۜ֨;->ۧ(II)I

    move-result v4

    if-ne v4, v2, :cond_12

    goto :goto_6

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_13
    add-int/2addr v5, v10

    .line 145
    iput v5, v0, Ll/ۖ᩷֨;->ᩴ:I

    add-int/lit8 v1, v12, -0x2

    .line 146
    invoke-virtual {v0, v1}, Ll/ۖ᩷֨;->֫(I)V

    return v12

    :cond_14
    :goto_6
    move v1, v15

    :goto_7
    return v1
.end method
