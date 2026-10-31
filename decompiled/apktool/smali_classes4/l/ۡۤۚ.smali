.class public final Ll/ۡۤۚ;
.super Ll/ۜ۫ۚ;
.source "77E4"


# instance fields
.field public final ֫֫:Ljava/util/ArrayList;

.field public ۗ:I

.field public ۙ:Ll/ܰ۫ۚ;

.field public ۛ:Ljava/util/HashMap;

.field public ۜ֫:Ll/۟ۛۚ;

.field public final ۟:Ljava/util/ArrayList;

.field public ۡ֫:Ll/ۡۨۚ;

.field public ۢ֫:Ll/۟ۛۚ;

.field public ۤ:Ll/۟ۛۚ;

.field public ۧ֫:Ll/۟ۛۚ;

.field public ۨ:Ll/ۡۨۚ;

.field public ۫:Ll/ۛۛۚ;

.field public ۬:Ll/ۘۨۚ;

.field public ܰ:Ll/۟ۛۚ;

.field public ܳ֫:Ll/ۨۨۚ;

.field public ܽ֫:Ll/۟ۛۚ;

.field public ܿ֫:Ll/ۜۨۚ;

.field public ᩳ֫:Ll/ۜۨۚ;

.field public ᩶:Ll/ۛۛۚ;

.field public ᩷֫:Ljava/util/HashMap;

.field public ᩺:J

.field public ᩻֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۨۨۚ;ILl/ۜۨۚ;Ll/ۜۨۚ;)V
    .locals 5

    .line 92
    iget-object v0, p1, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v1, Ll/ۙ۬ۚ;->ۤ:Ll/ۙ۬ۚ;

    invoke-direct {p0, v0, v1}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    const/4 v1, 0x0

    .line 75
    iput v1, p0, Ll/ۡۤۚ;->ۗ:I

    const-wide/16 v2, 0x0

    .line 78
    iput-wide v2, p0, Ll/ۡۤۚ;->᩺:J

    .line 85
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ۡۤۚ;->᩻֫:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 88
    iput-object v2, p0, Ll/ۡۤۚ;->ۢ֫:Ll/۟ۛۚ;

    .line 89
    iput-object v2, p0, Ll/ۡۤۚ;->ۤ:Ll/۟ۛۚ;

    .line 93
    iput-object p1, p0, Ll/ۡۤۚ;->ܳ֫:Ll/ۨۨۚ;

    .line 94
    iget-object v3, p1, Ll/ۨۨۚ;->ܺ:Ll/ܰ۫ۚ;

    iput-object v3, p0, Ll/ۡۤۚ;->ۙ:Ll/ܰ۫ۚ;

    .line 95
    invoke-virtual {p1}, Ll/۫ۨۚ;->ۧ()Ll/᩶ۗۚ;

    move-result-object v3

    check-cast v3, Ll/ۘۨۚ;

    iput-object v3, p0, Ll/ۡۤۚ;->۬:Ll/ۘۨۚ;

    .line 96
    iput-object p3, p0, Ll/ۡۤۚ;->ܿ֫:Ll/ۜۨۚ;

    .line 97
    iput-object p4, p0, Ll/ۡۤۚ;->ᩳ֫:Ll/ۜۨۚ;

    .line 98
    new-instance p3, Ljava/util/ArrayList;

    if-eqz p4, :cond_0

    .line 53
    iget v4, p4, Ll/ۜۨۚ;->᩸:I

    goto :goto_0

    :cond_0
    move v4, p2

    .line 98
    :goto_0
    invoke-static {v4, v2}, Ljava/util/Collections;->nCopies(ILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {p3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, Ll/ۡۤۚ;->۟:Ljava/util/ArrayList;

    .line 99
    new-instance p3, Ljava/util/ArrayList;

    if-eqz p4, :cond_1

    .line 53
    iget p2, p4, Ll/ۜۨۚ;->᩸:I

    .line 99
    :cond_1
    invoke-static {p2, v2}, Ljava/util/Collections;->nCopies(ILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, Ll/ۡۤۚ;->֫֫:Ljava/util/ArrayList;

    .line 100
    new-instance p2, Ll/ۡۨۚ;

    invoke-direct {p2, p1, v3}, Ll/ۡۨۚ;-><init>(Ll/ۨۨۚ;Ll/ۘۨۚ;)V

    iput-object p2, p0, Ll/ۡۤۚ;->ۡ֫:Ll/ۡۨۚ;

    iput-object p2, p0, Ll/ۡۤۚ;->ۨ:Ll/ۡۨۚ;

    .line 101
    new-instance p1, Ll/ۛۛۚ;

    invoke-direct {p1, v1}, Ll/ۛۛۚ;-><init>(I)V

    iput-object p1, p0, Ll/ۡۤۚ;->۫:Ll/ۛۛۚ;

    .line 102
    new-instance p1, Ll/ۛۛۚ;

    invoke-direct {p1}, Ll/ۛۛۚ;-><init>()V

    iput-object p1, p0, Ll/ۡۤۚ;->᩶:Ll/ۛۛۚ;

    .line 103
    invoke-virtual {v3}, Ll/᩶ۗۚ;->ۜ()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 104
    new-instance p2, Ll/۟ۛۚ;

    sget-object p3, Ll/ۙ۬ۚ;->֫֫:Ll/ۙ۬ۚ;

    invoke-direct {p2, v0, p3}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object p2, p0, Ll/ۡۤۚ;->ܰ:Ll/۟ۛۚ;

    .line 105
    invoke-virtual {p1, p2}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۜۤۚ;
    .locals 2

    .line 250
    iget-object v0, p0, Ll/ۡۤۚ;->ۛ:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 251
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/ۡۤۚ;->ۛ:Ljava/util/HashMap;

    const/4 v0, 0x0

    goto :goto_0

    .line 254
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜۤۚ;

    :goto_0
    if-nez v0, :cond_1

    .line 257
    new-instance v0, Ll/ۜۤۚ;

    .line 532
    invoke-direct {v0, p1}, Ll/᩷ۤۚ;-><init>(Ljava/lang/String;)V

    .line 258
    iget-object v1, p0, Ll/ۡۤۚ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final ֫(JLjava/lang/String;)Ll/ۢۤۚ;
    .locals 2

    .line 188
    iget-object v0, p0, Ll/ۡۤۚ;->᩷֫:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 189
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/ۡۤۚ;->᩷֫:Ljava/util/HashMap;

    const/4 v0, 0x0

    goto :goto_0

    .line 192
    :cond_0
    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۤۚ;

    :goto_0
    if-nez v0, :cond_1

    .line 195
    new-instance v0, Ll/ۢۤۚ;

    .line 542
    invoke-direct {v0, p3}, Ll/᩷ۤۚ;-><init>(Ljava/lang/String;)V

    const/4 v1, -0x1

    .line 537
    iput v1, v0, Ll/ۢۤۚ;->۫:I

    .line 538
    iput v1, v0, Ll/ۢۤۚ;->ۗ:I

    .line 543
    iput-wide p1, v0, Ll/ۢۤۚ;->۬:J

    .line 196
    iget-object p1, p0, Ll/ۡۤۚ;->᩷֫:Ljava/util/HashMap;

    invoke-virtual {p1, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final ֫(JLl/ܶ᩺ۚ;Ll/ۜۨۚ;Ljava/lang/Object;)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v10, p4

    const/16 v11, 0x4000

    .line 436
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 420
    new-instance v13, Ll/ۡۨۚ;

    iget-object v3, v0, Ll/ۡۤۚ;->ܳ֫:Ll/ۨۨۚ;

    iget-object v14, v0, Ll/ۡۤۚ;->۬:Ll/ۘۨۚ;

    invoke-direct {v13, v3, v14}, Ll/ۡۨۚ;-><init>(Ll/ۨۨۚ;Ll/ۘۨۚ;)V

    iget v4, v0, Ll/ۡۤۚ;->ۗ:I

    invoke-virtual {v14}, Ll/ۘۨۚ;->ۘ()J

    move-result-wide v5

    move-object v3, v13

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    invoke-virtual/range {v3 .. v9}, Ll/ۡۨۚ;->֫(IJLl/ܶ᩺ۚ;Ll/ۜۨۚ;Ljava/lang/Object;)V

    .line 421
    iget-object v3, v0, Ll/ۡۤۚ;->ۨ:Ll/ۡۨۚ;

    iput-object v13, v3, Ll/ۡۨۚ;->ܿ:Ll/ۡۨۚ;

    .line 422
    iput-object v13, v0, Ll/ۡۤۚ;->ۨ:Ll/ۡۨۚ;

    .line 423
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩺ۚ;->᩻()I

    move-result v3

    .line 424
    sget-object v4, Ll/᩻ۤۚ;->֫:[I

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x2

    const-string v7, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes"

    const/4 v8, 0x3

    const/4 v9, 0x1

    if-eq v4, v9, :cond_5

    if-eq v4, v6, :cond_1

    if-eq v4, v8, :cond_0

    .line 443
    instance-of v4, v10, Ll/ܺۤۚ;

    if-eqz v4, :cond_4

    .line 444
    move-object v4, v10

    check-cast v4, Ll/ܺۤۚ;

    iget-object v5, v4, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    .line 445
    sget-object v6, Ll/ۙۛۚ;->ۙ:Ll/ۙۛۚ;

    if-eq v5, v6, :cond_4

    .line 446
    sget-object v6, Ll/ۙۛۚ;->᩶:Ll/ۙۛۚ;

    .line 89
    iget v5, v5, Ll/ۙۛۚ;->᩸:I

    iget v7, v6, Ll/ۙۛۚ;->᩸:I

    if-le v5, v7, :cond_4

    .line 90
    iput-object v6, v4, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    goto :goto_0

    .line 440
    :cond_0
    move-object v4, v10

    check-cast v4, Ll/ܺۤۚ;

    sget-object v5, Ll/ۙۛۚ;->ۙ:Ll/ۙۛۚ;

    .line 89
    iget-object v6, v4, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    iget v6, v6, Ll/ۙۛۚ;->᩸:I

    iget v7, v5, Ll/ۙۛۚ;->᩸:I

    if-le v6, v7, :cond_4

    .line 90
    iput-object v5, v4, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    goto :goto_0

    .line 433
    :cond_1
    move-object/from16 v3, p5

    check-cast v3, Ll/ۚ۟ۚ;

    iget v4, v0, Ll/ۡۤۚ;->ۗ:I

    .line 100
    iput v4, v3, Ll/ۚ۟ۚ;->ۜ:I

    rsub-int/lit8 v10, v4, 0x3

    and-int/2addr v10, v8

    .line 101
    iput v10, v3, Ll/ۚ۟ۚ;->᩻:I

    add-int/2addr v10, v9

    .line 102
    iget-object v13, v3, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    add-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x8

    add-int/2addr v10, v13

    .line 103
    iget-object v13, v3, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    if-nez v13, :cond_2

    .line 104
    new-instance v13, Ll/ۜۨۚ;

    add-int/2addr v4, v10

    invoke-direct {v13, v4}, Ll/ۜۨۚ;-><init>(I)V

    iput-object v13, v3, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    .line 434
    :cond_2
    sget v3, Ll/᩹᩺ۚ;->֫:I

    if-lt v10, v11, :cond_3

    .line 435
    sget-object v3, Ll/ܶ᩺ۚ;->ۙܳ:Ll/ܶ᩺ۚ;

    .line 436
    invoke-virtual {v3}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v3, v8, v5

    aput-object v4, v8, v9

    aput-object v12, v8, v6

    .line 435
    invoke-virtual {v14, v1, v2, v7, v8}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    move v3, v10

    :cond_4
    :goto_0
    const/4 v4, 0x0

    goto/16 :goto_5

    .line 426
    :cond_5
    move-object/from16 v3, p5

    check-cast v3, Ll/ۚ۟ۚ;

    iget v4, v0, Ll/ۡۤۚ;->ۗ:I

    .line 125
    iget-object v5, v3, Ll/ۚ۟ۚ;->ۧ:Ll/ۘۨۚ;

    iget-object v8, v3, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    if-lez v8, :cond_9

    const/4 v10, 0x0

    const v11, 0x7fffffff

    const/high16 v13, -0x80000000

    :goto_1
    if-ge v10, v8, :cond_8

    .line 130
    iget-object v15, v3, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-le v15, v13, :cond_6

    move v13, v15

    :cond_6
    if-ge v15, v11, :cond_7

    move v11, v15

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_8
    sub-int v10, v13, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_9
    const/4 v10, 0x0

    const v11, 0x7fffffff

    const/high16 v13, -0x80000000

    .line 140
    :goto_2
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v17, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v15, v6, v17

    aput-object v16, v6, v9

    const-string v15, "  recalcTableSwitch: low=%d high=%d"

    .line 19
    invoke-static {v15, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v15, 0x0

    new-array v15, v15, [Ljava/lang/Object;

    .line 140
    invoke-virtual {v5, v6, v15}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iput v4, v3, Ll/ۚ۟ۚ;->ۜ:I

    rsub-int/lit8 v6, v4, 0x3

    and-int/lit8 v6, v6, 0x3

    .line 142
    iput v6, v3, Ll/ۚ۟ۚ;->᩻:I

    add-int/lit8 v6, v6, 0x1

    const/4 v15, 0x4

    const/4 v9, 0x3

    .line 143
    invoke-static {v10, v9, v15, v6}, Ll/᩶ۢᩴ;->֫(IIII)I

    move-result v6

    .line 144
    iget-object v9, v3, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    if-nez v9, :cond_a

    .line 145
    new-instance v9, Ll/ۜۨۚ;

    add-int/2addr v4, v6

    invoke-direct {v9, v4}, Ll/ۜۨۚ;-><init>(I)V

    iput-object v9, v3, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    .line 147
    :cond_a
    new-array v4, v10, [Ll/ۜۨۚ;

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v10, :cond_b

    .line 149
    iget-object v15, v3, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    aput-object v15, v4, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_b
    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_c

    .line 152
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v15, v3, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    move/from16 p4, v8

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object v10, v8, v0

    const/4 v10, 0x1

    aput-object v15, v8, v10

    const-string v10, "   keys.data[%d]=%s"

    .line 19
    invoke-static {v10, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-array v0, v0, [Ljava/lang/Object;

    .line 152
    invoke-virtual {v5, v8, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget-object v0, v3, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int/2addr v0, v11

    iget-object v8, v3, Ll/ۚ۟ۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۜۨۚ;

    aput-object v8, v4, v0

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move/from16 v8, p4

    goto :goto_4

    .line 155
    :cond_c
    iput-object v4, v3, Ll/ۚ۟ۚ;->᩷:[Ll/ۜۨۚ;

    const/4 v4, 0x0

    .line 156
    iput-object v4, v3, Ll/ۚ۟ۚ;->ܿ:Ljava/util/ArrayList;

    .line 157
    iput-object v4, v3, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    .line 158
    iput v13, v3, Ll/ۚ۟ۚ;->ܽ:I

    .line 159
    iput v11, v3, Ll/ۚ۟ۚ;->ܳ:I

    .line 427
    sget v0, Ll/᩹᩺ۚ;->֫:I

    const/16 v0, 0x4000

    if-lt v6, v0, :cond_d

    .line 428
    sget-object v0, Ll/ܶ᩺ۚ;->ۚۡ:Ll/ܶ᩺ۚ;

    .line 429
    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v0, v5, v8

    const/4 v0, 0x1

    aput-object v3, v5, v0

    const/4 v0, 0x2

    aput-object v12, v5, v0

    .line 428
    invoke-virtual {v14, v1, v2, v7, v5}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_d
    move v3, v6

    .line 450
    :goto_5
    invoke-virtual {v14}, Ll/᩶ۗۚ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 451
    invoke-virtual {v14, v1, v2}, Ll/ۘۨۚ;->֫(J)J

    move-result-wide v0

    move-object/from16 v2, p0

    .line 452
    iget-wide v5, v2, Ll/ۡۤۚ;->᩺:J

    cmp-long v7, v0, v5

    if-eqz v7, :cond_f

    .line 453
    iget-object v5, v2, Ll/ۡۤۚ;->ܰ:Ll/۟ۛۚ;

    new-instance v6, Ll/᩶ۨۚ;

    iget v7, v2, Ll/ۡۤۚ;->ۗ:I

    invoke-direct {v6, v7, v0, v1}, Ll/᩶ۨۚ;-><init>(IJ)V

    invoke-virtual {v5, v6}, Ll/۟ۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 454
    iput-wide v0, v2, Ll/ۡۤۚ;->᩺:J

    goto :goto_6

    :cond_e
    move-object/from16 v2, p0

    .line 457
    :cond_f
    :goto_6
    iget-object v0, v2, Ll/ۡۤۚ;->᩻֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    .line 472
    iget-object v1, v2, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    if-nez v1, :cond_11

    .line 473
    new-instance v1, Ll/۟ۛۚ;

    iget-object v5, v2, Ll/ۡۤۚ;->ۙ:Ll/ܰ۫ۚ;

    iget-object v6, v5, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    .line 474
    iget-object v5, v5, Ll/ܰ۫ۚ;->ۘ:Ll/᩹۬ۚ;

    invoke-virtual {v5}, Ll/᩹۬ۚ;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_10

    sget-object v5, Ll/ۙ۬ۚ;->᩶֫:Ll/ۙ۬ۚ;

    goto :goto_7

    :cond_10
    sget-object v5, Ll/ۙ۬ۚ;->᩹֫:Ll/ۙ۬ۚ;

    :goto_7
    invoke-direct {v1, v6, v5}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v1, v2, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    .line 475
    iget-object v5, v2, Ll/ۡۤۚ;->᩶:Ll/ۛۛۚ;

    invoke-virtual {v5, v1}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    goto :goto_8

    .line 477
    :cond_11
    invoke-virtual {v1}, Ll/۟ۛۚ;->size()I

    move-result v1

    :cond_12
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_13

    .line 478
    iget-object v5, v2, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    invoke-virtual {v5, v1}, Ll/۟ۛۚ;->get(I)Ll/֫ۨۚ;

    move-result-object v5

    check-cast v5, Ll/᩵۟ۚ;

    .line 479
    invoke-virtual {v5}, Ll/᩵۟ۚ;->ܿ()Z

    move-result v6

    if-nez v6, :cond_12

    move-object v4, v5

    .line 459
    :cond_13
    :goto_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵۟ۚ;

    .line 460
    invoke-virtual {v5}, Ll/᩵۟ۚ;->ܿ()Z

    move-result v6

    if-nez v6, :cond_14

    .line 461
    iget v6, v2, Ll/ۡۤۚ;->ۗ:I

    invoke-virtual {v5, v6}, Ll/᩵۟ۚ;->ۧ(I)V

    .line 462
    invoke-virtual {v5, v4}, Ll/᩵۟ۚ;->֫(Ll/᩵۟ۚ;)V

    goto :goto_9

    .line 465
    :cond_15
    iget-object v1, v2, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    invoke-virtual {v1, v0}, Ll/۟ۛۚ;->addAll(Ljava/util/Collection;)Z

    .line 466
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 468
    :cond_16
    iget v0, v2, Ll/ۡۤۚ;->ۗ:I

    add-int/2addr v0, v3

    iput v0, v2, Ll/ۡۤۚ;->ۗ:I

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 4

    .line 171
    iget-object v0, p0, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    if-nez v0, :cond_2

    .line 172
    new-instance v0, Ll/ܿۤۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 173
    iget-object v1, p0, Ll/ۡۤۚ;->᩶:Ll/ۛۛۚ;

    invoke-virtual {v1, v0}, Ll/ۛۛۚ;->֫(Ll/ܿۤۚ;)Ll/ܽ۫ᩴ;

    move-result-object v0

    const/4 v2, 0x0

    .line 174
    invoke-virtual {v0, v2}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۛۚ;

    if-nez v0, :cond_1

    .line 176
    new-instance v0, Ll/۟ۛۚ;

    iget-object v2, p0, Ll/ۡۤۚ;->ۙ:Ll/ܰ۫ۚ;

    iget-object v3, v2, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    iget-object v2, v2, Ll/ܰ۫ۚ;->ۘ:Ll/᩹۬ۚ;

    invoke-virtual {v2}, Ll/᩹۬ۚ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ll/ۙ۬ۚ;->᩶֫:Ll/ۙ۬ۚ;

    goto :goto_0

    :cond_0
    sget-object v2, Ll/ۙ۬ۚ;->᩹֫:Ll/ۙ۬ۚ;

    :goto_0
    invoke-direct {v0, v3, v2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v0, p0, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    .line 177
    invoke-virtual {v1, v0}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    goto :goto_1

    .line 179
    :cond_1
    iput-object v0, p0, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    .line 182
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/ۡۤۚ;->ۜ֫:Ll/۟ۛۚ;

    invoke-virtual {v0, p1}, Ll/۟ۛۚ;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;Z)V
    .locals 2

    if-eqz p2, :cond_0

    .line 162
    iget-object v0, p0, Ll/ۡۤۚ;->ܽ֫:Ll/۟ۛۚ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۡۤۚ;->ۧ֫:Ll/۟ۛۚ;

    :goto_0
    if-nez v0, :cond_2

    .line 164
    new-instance v0, Ll/۟ۛۚ;

    iget-object v1, p0, Ll/ۡۤۚ;->ܳ֫:Ll/ۨۨۚ;

    iget-object v1, v1, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    if-eqz p2, :cond_1

    sget-object p2, Ll/ۙ۬ۚ;->ᩳ֫:Ll/ۙ۬ۚ;

    goto :goto_1

    :cond_1
    sget-object p2, Ll/ۙ۬ۚ;->ܽ֫:Ll/ۙ۬ۚ;

    :goto_1
    invoke-direct {v0, v1, p2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    .line 165
    iget-object p2, p0, Ll/ۡۤۚ;->᩶:Ll/ۛۛۚ;

    invoke-virtual {p2, v0}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 167
    :cond_2
    invoke-virtual {v0, p1}, Ll/۟ۛۚ;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 3

    .line 498
    iget-object v0, p0, Ll/ۡۤۚ;->ܿ֫:Ll/ۜۨۚ;

    if-eqz v0, :cond_0

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 499
    :goto_0
    iget-object v1, p0, Ll/ۡۤۚ;->ᩳ֫:Ll/ۜۨۚ;

    if-eqz v1, :cond_1

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    goto :goto_1

    :cond_1
    iget-object v1, p0, Ll/ۡۤۚ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Ll/ۡۤۚ;->֫֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 500
    :goto_1
    invoke-super {p0, p1}, Ll/ۜ۫ۚ;->֫(Ll/֡۫ۚ;)V

    .line 501
    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 502
    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 503
    iget v0, p0, Ll/ۡۤۚ;->ۗ:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 504
    iget-object v0, p0, Ll/ۡۤۚ;->ۡ֫:Ll/ۡۨۚ;

    :goto_2
    iget-object v0, v0, Ll/ۡۨۚ;->ܿ:Ll/ۡۨۚ;

    if-eqz v0, :cond_2

    .line 505
    invoke-virtual {v0, p1}, Ll/ۡۨۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_2

    .line 507
    :cond_2
    iget-object v0, p0, Ll/ۡۤۚ;->۫:Ll/ۛۛۚ;

    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    .line 508
    iget-object v0, p0, Ll/ۡۤۚ;->᩶:Ll/ۛۛۚ;

    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final ֫(Ll/ܶ᩺ۚ;)V
    .locals 9

    .line 383
    sget-object v0, Ll/ܶ᩺ۚ;->᩸ۡ:Ll/ܶ᩺ۚ;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ll/ۡۤۚ;->۟:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۡۤۚ;->֫֫:Ljava/util/ArrayList;

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 384
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 385
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 386
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗۨۚ;

    iget v4, p0, Ll/ۡۤۚ;->ۗ:I

    invoke-virtual {v3, v4}, Ll/ۗۨۚ;->֫(I)V

    .line 387
    iget-object v3, p0, Ll/ۡۤۚ;->۬:Ll/ۘۨۚ;

    invoke-virtual {v3}, Ll/ۘۨۚ;->ۘ()J

    move-result-wide v4

    sget-object v6, Ll/ܶ᩺ۚ;->᩸ۡ:Ll/ܶ᩺ۚ;

    if-ne p1, v6, :cond_1

    const-string v6, "endvar {0}; expected for the local variable"

    goto :goto_2

    :cond_1
    const-string v6, "endtype {0}; expected for the local variable"

    .line 388
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v7, v8, v1

    .line 387
    invoke-virtual {v3, v4, v5, v6, v8}, Ll/ۘۨۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ܳ()Ll/᩵۟ۚ;
    .locals 4

    .line 396
    iget-object v0, p0, Ll/ۡۤۚ;->᩻֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 398
    new-instance v1, Ll/᩵۟ۚ;

    .line 415
    iget-object v2, p0, Ll/ۡۤۚ;->ۙ:Ll/ܰ۫ۚ;

    iget-object v2, v2, Ll/ܰ۫ۚ;->ۘ:Ll/᩹۬ۚ;

    invoke-virtual {v2}, Ll/᩹۬ۚ;->ܿ()Z

    move-result v2

    .line 398
    iget-object v3, p0, Ll/ۡۤۚ;->۬:Ll/ۘۨۚ;

    invoke-direct {v1, v3, v2}, Ll/᩵۟ۚ;-><init>(Ll/ۘۨۚ;Z)V

    .line 399
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 401
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵۟ۚ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 490
    iget v0, p0, Ll/ۡۤۚ;->ۗ:I

    add-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Ll/ۡۤۚ;->۫:Ll/ۛۛۚ;

    .line 492
    invoke-virtual {v1}, Ll/ۛۛۚ;->ۧ()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/ۡۤۚ;->᩶:Ll/ۛۛۚ;

    invoke-virtual {v0}, Ll/ۛۛۚ;->ۧ()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final ܿ()V
    .locals 11

    .line 227
    iget-object v0, p0, Ll/ۡۤۚ;->᩷֫:Ljava/util/HashMap;

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۡۤۚ;->۬:Ll/ۘۨۚ;

    if-nez v0, :cond_0

    goto :goto_2

    .line 230
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢۤۚ;

    .line 231
    iget-boolean v5, v4, Ll/᩷ۤۚ;->᩶:Z

    if-nez v5, :cond_1

    .line 232
    iget-wide v5, v4, Ll/ۢۤۚ;->۬:J

    iget-object v4, v4, Ll/᩷ۤۚ;->ۙ:Ljava/lang/String;

    new-array v7, v2, [Ljava/lang/Object;

    aput-object v4, v7, v1

    const-string v4, "No <catch {0}> declared"

    invoke-virtual {v3, v5, v6, v4, v7}, Ll/ۘۨۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 236
    :cond_2
    iget-object v0, p0, Ll/ۡۤۚ;->۫:Ll/ۛۛۚ;

    .line 45
    iget-object v0, v0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 236
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۨۚ;

    .line 237
    iget-object v5, v4, Ll/ᩳۨۚ;->ۙ:Ll/ۢۤۚ;

    iget-wide v6, v4, Ll/ᩳۨۚ;->᩶:J

    .line 238
    iget v4, v5, Ll/ۢۤۚ;->۫:I

    iget-object v8, v5, Ll/᩷ۤۚ;->ۙ:Ljava/lang/String;

    const/4 v9, -0x1

    if-ne v4, v9, :cond_4

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v8, v4, v1

    const-string v10, "No <try {0}> found"

    .line 239
    invoke-virtual {v3, v6, v7, v10, v4}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 241
    :cond_4
    iget v4, v5, Ll/ۢۤۚ;->ۗ:I

    if-ne v4, v9, :cond_3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v8, v4, v1

    const-string v5, "No <endtry {0}> found"

    .line 242
    invoke-virtual {v3, v6, v7, v5, v4}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 111
    :cond_5
    :goto_2
    sget-object v0, Ll/ܶ᩺ۚ;->᩸ۡ:Ll/ܶ᩺ۚ;

    invoke-virtual {p0, v0}, Ll/ۡۤۚ;->֫(Ll/ܶ᩺ۚ;)V

    .line 112
    sget-object v0, Ll/ܶ᩺ۚ;->۠ۡ:Ll/ܶ᩺ۚ;

    invoke-virtual {p0, v0}, Ll/ۡۤۚ;->֫(Ll/ܶ᩺ۚ;)V

    .line 281
    iget-object v0, p0, Ll/ۡۤۚ;->ۛ:Ljava/util/HashMap;

    if-nez v0, :cond_6

    goto :goto_4

    .line 284
    :cond_6
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜۤۚ;

    .line 286
    iget-boolean v5, v4, Ll/᩷ۤۚ;->᩹:Z

    if-nez v5, :cond_7

    .line 287
    iget-object v4, v4, Ll/᩷ۤۚ;->ۙ:Ljava/lang/String;

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v4, v5, v1

    const-string v4, "Label {0} not declared"

    invoke-virtual {v3, v4, v5}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 115
    :cond_8
    :goto_4
    iget-object v0, p0, Ll/ۡۤۚ;->ۢ֫:Ll/۟ۛۚ;

    iget-object v1, p0, Ll/ۡۤۚ;->᩶:Ll/ۛۛۚ;

    if-eqz v0, :cond_9

    .line 116
    invoke-virtual {v1, v0}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 118
    :cond_9
    iget-object v0, p0, Ll/ۡۤۚ;->ۤ:Ll/۟ۛۚ;

    if-eqz v0, :cond_a

    .line 119
    invoke-virtual {v1, v0}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    :cond_a
    return-void
.end method
