.class public final Ll/ᩴ۠;
.super Ljava/lang/Object;
.source "D1JM"


# instance fields
.field public ֡:I

.field public ֫:Z

.field public ۖ:I

.field public ۘ:F

.field public ۜ:Ll/ܶ۠;

.field public ۡ:Ll/ܶ۠;

.field public ۢ:Ll/ܶ۠;

.field public ۧ:Ll/ܶ۠;

.field public ܳ:Z

.field public ܺ:Ll/ܶ۠;

.field public ܽ:Ll/ܶ۠;

.field public ܿ:Z

.field public ᩳ:Ll/ܶ۠;

.field public ᩴ:Ljava/util/ArrayList;

.field public ᩵:I

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܶ۠;IZ)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput v0, p0, Ll/ᩴ۠;->ۘ:F

    .line 64
    iput-object p1, p0, Ll/ᩴ۠;->ۧ:Ll/ܶ۠;

    .line 65
    iput p2, p0, Ll/ᩴ۠;->ۖ:I

    .line 66
    iput-boolean p3, p0, Ll/ᩴ۠;->᩷:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 17

    move-object/from16 v0, p0

    .line 234
    iget-boolean v1, v0, Ll/ᩴ۠;->֫:Z

    const/4 v2, 0x1

    if-nez v1, :cond_17

    .line 84
    iget v1, v0, Ll/ᩴ۠;->ۖ:I

    mul-int/lit8 v3, v1, 0x2

    .line 91
    iget-object v4, v0, Ll/ᩴ۠;->ۧ:Ll/ܶ۠;

    const/4 v5, 0x0

    move-object v6, v4

    move-object v7, v6

    :goto_0
    if-nez v5, :cond_12

    .line 93
    iget v8, v0, Ll/ᩴ۠;->᩵:I

    add-int/2addr v8, v2

    iput v8, v0, Ll/ᩴ۠;->᩵:I

    .line 94
    iget-object v8, v6, Ll/ܶ۠;->ۢ֫:[Ll/ܶ۠;

    iget-object v9, v6, Ll/ܶ۠;->ۘ֫:[I

    iget-object v10, v6, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    const/4 v11, 0x0

    aput-object v11, v8, v1

    .line 95
    iget-object v8, v6, Ll/ܶ۠;->ۨ:[Ll/ܶ۠;

    aput-object v11, v8, v1

    .line 96
    invoke-virtual {v6}, Ll/ܶ۠;->۠()I

    move-result v8

    const/16 v11, 0x8

    if-eq v8, v11, :cond_d

    .line 98
    invoke-virtual {v6, v1}, Ll/ܶ۠;->ۧ(I)Ll/۠۠;

    sget-object v8, Ll/۠۠;->᩶:Ll/۠۠;

    .line 101
    aget-object v12, v10, v3

    invoke-virtual {v12}, Ll/ۚ۠;->ܽ()I

    add-int/lit8 v12, v3, 0x1

    .line 102
    aget-object v13, v10, v12

    invoke-virtual {v13}, Ll/ۚ۠;->ܽ()I

    .line 103
    aget-object v13, v10, v3

    invoke-virtual {v13}, Ll/ۚ۠;->ܽ()I

    .line 104
    aget-object v12, v10, v12

    invoke-virtual {v12}, Ll/ۚ۠;->ܽ()I

    .line 106
    iget-object v12, v0, Ll/ᩴ۠;->ᩳ:Ll/ܶ۠;

    if-nez v12, :cond_0

    .line 107
    iput-object v6, v0, Ll/ᩴ۠;->ᩳ:Ll/ܶ۠;

    .line 109
    :cond_0
    iput-object v6, v0, Ll/ᩴ۠;->ܺ:Ll/ܶ۠;

    .line 112
    iget-object v12, v6, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v12, v12, v1

    if-ne v12, v8, :cond_d

    .line 113
    aget v12, v9, v1

    const/4 v13, 0x3

    if-eqz v12, :cond_1

    if-eq v12, v13, :cond_1

    const/4 v14, 0x2

    if-ne v12, v14, :cond_9

    .line 116
    :cond_1
    iget v12, v0, Ll/ᩴ۠;->֡:I

    add-int/2addr v12, v2

    iput v12, v0, Ll/ᩴ۠;->֡:I

    .line 117
    iget-object v12, v6, Ll/ܶ۠;->᩸֫:[F

    aget v12, v12, v1

    const/4 v14, 0x0

    cmpl-float v15, v12, v14

    if-lez v15, :cond_2

    .line 119
    iget v15, v0, Ll/ᩴ۠;->ۘ:F

    add-float/2addr v15, v12

    iput v15, v0, Ll/ᩴ۠;->ۘ:F

    .line 77
    :cond_2
    invoke-virtual {v6}, Ll/ܶ۠;->۠()I

    move-result v15

    if-eq v15, v11, :cond_6

    iget-object v11, v6, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v11, v11, v1

    if-ne v11, v8, :cond_6

    aget v8, v9, v1

    if-eqz v8, :cond_3

    if-ne v8, v13, :cond_6

    :cond_3
    cmpg-float v8, v12, v14

    if-gez v8, :cond_4

    .line 124
    iput-boolean v2, v0, Ll/ᩴ۠;->᩻:Z

    goto :goto_1

    .line 126
    :cond_4
    iput-boolean v2, v0, Ll/ᩴ۠;->ܳ:Z

    .line 128
    :goto_1
    iget-object v8, v0, Ll/ᩴ۠;->ᩴ:Ljava/util/ArrayList;

    if-nez v8, :cond_5

    .line 129
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v0, Ll/ᩴ۠;->ᩴ:Ljava/util/ArrayList;

    .line 131
    :cond_5
    iget-object v8, v0, Ll/ᩴ۠;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    :cond_6
    iget-object v8, v0, Ll/ᩴ۠;->ܽ:Ll/ܶ۠;

    if-nez v8, :cond_7

    .line 135
    iput-object v6, v0, Ll/ᩴ۠;->ܽ:Ll/ܶ۠;

    .line 137
    :cond_7
    iget-object v8, v0, Ll/ᩴ۠;->ۡ:Ll/ܶ۠;

    if-eqz v8, :cond_8

    .line 138
    iget-object v8, v8, Ll/ܶ۠;->ۨ:[Ll/ܶ۠;

    aput-object v6, v8, v1

    .line 140
    :cond_8
    iput-object v6, v0, Ll/ᩴ۠;->ۡ:Ll/ܶ۠;

    :cond_9
    if-nez v1, :cond_b

    .line 143
    iget v8, v6, Ll/ܶ۠;->ܰ:I

    if-eqz v8, :cond_a

    goto :goto_2

    .line 145
    :cond_a
    iget v8, v6, Ll/ܶ۠;->ܽ֫:I

    if-nez v8, :cond_d

    iget v8, v6, Ll/ܶ۠;->֫֫:I

    goto :goto_2

    .line 149
    :cond_b
    iget v8, v6, Ll/ܶ۠;->᩺:I

    if-eqz v8, :cond_c

    goto :goto_2

    .line 151
    :cond_c
    iget v8, v6, Ll/ܶ۠;->ۧ֫:I

    if-nez v8, :cond_d

    iget v8, v6, Ll/ܶ۠;->۟:I

    :cond_d
    :goto_2
    if-eq v7, v6, :cond_e

    .line 163
    iget-object v7, v7, Ll/ܶ۠;->ۢ֫:[Ll/ܶ۠;

    aput-object v6, v7, v1

    :cond_e
    add-int/lit8 v7, v3, 0x1

    .line 168
    aget-object v7, v10, v7

    iget-object v7, v7, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v7, :cond_f

    .line 170
    iget-object v7, v7, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 171
    iget-object v8, v7, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v8, v8, v3

    iget-object v8, v8, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v8, :cond_f

    iget-object v8, v8, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    if-eq v8, v6, :cond_10

    :cond_f
    const/4 v7, 0x0

    :cond_10
    if-eqz v7, :cond_11

    goto :goto_3

    :cond_11
    const/4 v5, 0x1

    move-object v7, v6

    :goto_3
    move-object/from16 v16, v7

    move-object v7, v6

    move-object/from16 v6, v16

    goto/16 :goto_0

    .line 184
    :cond_12
    iget-object v5, v0, Ll/ᩴ۠;->ᩳ:Ll/ܶ۠;

    if-eqz v5, :cond_13

    .line 185
    iget-object v5, v5, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v5, v5, v3

    invoke-virtual {v5}, Ll/ۚ۠;->ܽ()I

    .line 187
    :cond_13
    iget-object v5, v0, Ll/ᩴ۠;->ܺ:Ll/ܶ۠;

    if-eqz v5, :cond_14

    .line 188
    iget-object v5, v5, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    add-int/2addr v3, v2

    aget-object v3, v5, v3

    invoke-virtual {v3}, Ll/ۚ۠;->ܽ()I

    .line 190
    :cond_14
    iput-object v6, v0, Ll/ᩴ۠;->ۢ:Ll/ܶ۠;

    if-nez v1, :cond_15

    .line 192
    iget-boolean v1, v0, Ll/ᩴ۠;->᩷:Z

    if-eqz v1, :cond_15

    .line 193
    iput-object v6, v0, Ll/ᩴ۠;->ۜ:Ll/ܶ۠;

    goto :goto_4

    .line 195
    :cond_15
    iput-object v4, v0, Ll/ᩴ۠;->ۜ:Ll/ܶ۠;

    .line 198
    :goto_4
    iget-boolean v1, v0, Ll/ᩴ۠;->ܳ:Z

    if-eqz v1, :cond_16

    iget-boolean v1, v0, Ll/ᩴ۠;->᩻:Z

    if-eqz v1, :cond_16

    const/4 v1, 0x1

    goto :goto_5

    :cond_16
    const/4 v1, 0x0

    :goto_5
    iput-boolean v1, v0, Ll/ᩴ۠;->ܿ:Z

    .line 237
    :cond_17
    iput-boolean v2, v0, Ll/ᩴ۠;->֫:Z

    return-void
.end method
