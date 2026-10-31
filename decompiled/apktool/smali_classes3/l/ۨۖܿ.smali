.class public final Ll/ۨۖܿ;
.super Ljava/lang/Object;
.source "770B"


# static fields
.field public static final ᩳ:[Ll/ۤ᩷ܿ;


# instance fields
.field public final ֫:[Ll/ۤ᩷ܿ;

.field public final ۧ:Ll/᩺ܺܿ;

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ۤ᩷ܿ;

    .line 14
    sput-object v0, Ll/ۨۖܿ;->ᩳ:[Ll/ۤ᩷ܿ;

    return-void
.end method

.method public constructor <init>(Ll/᩺ܺܿ;I[Ll/ۤ᩷ܿ;)V
    .locals 10

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "program"

    .line 26
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۨۖܿ;->ۧ:Ll/᩺ܺܿ;

    const-string v0, "indexes"

    .line 27
    invoke-static {p3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p3

    check-cast v0, [Ll/ۤ᩷ܿ;

    iput-object v0, p0, Ll/ۨۖܿ;->֫:[Ll/ۤ᩷ܿ;

    if-ltz p2, :cond_4

    .line 28
    array-length v0, p3

    const/16 v1, 0x10

    if-gt v0, v1, :cond_4

    .line 33
    array-length v0, p3

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-wide v4, v1

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_2

    aget-object v7, p3, v6

    const-string v8, "index"

    .line 34
    invoke-static {v7, v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    invoke-virtual {v7}, Ll/ۤ᩷ܿ;->ܽ()Ll/᩺ܺܿ;

    move-result-object v8

    if-ne v8, p1, :cond_1

    invoke-virtual {v7}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v8

    if-ne v8, p2, :cond_1

    invoke-virtual {v7}, Ll/ۤ᩷ܿ;->ᩳ()I

    move-result v8

    if-eqz v8, :cond_1

    .line 38
    invoke-virtual {v7}, Ll/ۤ᩷ܿ;->֫()I

    move-result v8

    int-to-long v8, v8

    add-long/2addr v1, v8

    .line 39
    invoke-virtual {v7}, Ll/ۤ᩷ܿ;->ܳ()I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v4, v7

    const-wide/16 v7, 0x400

    cmp-long v9, v1, v7

    if-gtz v9, :cond_0

    const-wide/32 v7, 0x40000

    cmp-long v9, v4, v7

    if-gtz v9, :cond_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint cache exceeds state budget"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint cache index identity differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 45
    :cond_2
    iput p2, p0, Ll/ۨۖܿ;->ܽ:I

    .line 48
    array-length v0, p3

    if-nez v0, :cond_3

    .line 121
    invoke-static {p1, p2, v3}, Ll/ۤ᩷ܿ;->֫(Ll/᩺ܺܿ;IZ)Ll/ۤ᩷ܿ;

    return-void

    .line 49
    :cond_3
    aget-object p1, p3, v3

    return-void

    .line 29
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax window checkpoint cache"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ۤ᩷ܿ;Ll/ۤ᩷ܿ;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 179
    :goto_0
    invoke-virtual {p1}, Ll/ۤ᩷ܿ;->ᩳ()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 180
    invoke-virtual {p1, v1}, Ll/ۤ᩷ܿ;->ᩳ(I)Ll/᩶ۘܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v2

    sget-object v3, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-eq v2, v3, :cond_0

    goto :goto_1

    .line 184
    :cond_0
    invoke-virtual {p1, v1}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v2

    .line 185
    invoke-virtual {p1, v1}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v3

    .line 195
    invoke-virtual {p0}, Ll/ۤ᩷ܿ;->ܽ()Ll/᩺ܺܿ;

    move-result-object v4

    invoke-virtual {p0, v4, v2}, Ll/ۤ᩷ܿ;->֫(Ll/᩺ܺܿ;I)I

    move-result v4

    if-ltz v4, :cond_1

    .line 196
    invoke-virtual {p0, v4}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v5

    if-ne v5, v2, :cond_1

    .line 197
    invoke-virtual {p0, v4}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v2

    if-lt v2, v3, :cond_1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ll/᩺ܺܿ;I)Ll/ۨۖܿ;
    .locals 2

    .line 54
    new-instance v0, Ll/ۨۖܿ;

    sget-object v1, Ll/ۨۖܿ;->ᩳ:[Ll/ۤ᩷ܿ;

    invoke-direct {v0, p0, p1, v1}, Ll/ۨۖܿ;-><init>(Ll/᩺ܺܿ;I[Ll/ۤ᩷ܿ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ۨۖܿ;->֫:[Ll/ۤ᩷ܿ;

    array-length v0, v0

    return v0
.end method

.method public final ֫(I)Ll/ۤ᩷ܿ;
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۨۖܿ;->֫:[Ll/ۤ᩷ܿ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(Ll/᩺ܺܿ;I)Ll/ۤ᩷ܿ;
    .locals 9

    const-string v0, "expectedProgram"

    .line 59
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 60
    iget-object v1, p0, Ll/ۨۖܿ;->ۧ:Ll/᩺ܺܿ;

    if-eq v1, p1, :cond_0

    return-object v0

    .line 61
    :cond_0
    iget p1, p0, Ll/ۨۖܿ;->ܽ:I

    invoke-static {p2, p2, p1}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 65
    iget-object p1, p0, Ll/ۨۖܿ;->֫:[Ll/ۤ᩷ܿ;

    array-length v2, p1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_3

    aget-object v6, p1, v5

    .line 66
    invoke-virtual {v6, v1, p2}, Ll/ۤ᩷ܿ;->֫(Ll/᩺ܺܿ;I)I

    move-result v7

    if-ltz v7, :cond_2

    .line 68
    invoke-virtual {v6, v7}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v8

    .line 69
    invoke-virtual {v6, v7}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v7

    if-gt v8, v3, :cond_1

    if-ne v8, v3, :cond_2

    if-le v7, v4, :cond_2

    :cond_1
    move-object v0, v6

    move v4, v7

    move v3, v8

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final ֫(Ll/ۤ᩷ܿ;)Ll/ۨۖܿ;
    .locals 6

    const-string v0, "used"

    .line 130
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    invoke-virtual {p1}, Ll/ۤ᩷ܿ;->ܽ()Ll/᩺ܺܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۖܿ;->ۧ:Ll/᩺ܺܿ;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v0

    iget v2, p0, Ll/ۨۖܿ;->ܽ:I

    if-ne v0, v2, :cond_3

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 134
    :goto_0
    iget-object v4, p0, Ll/ۨۖܿ;->֫:[Ll/ۤ᩷ܿ;

    array-length v5, v4

    if-ge v3, v5, :cond_2

    .line 135
    aget-object v5, v4, v3

    if-ne v5, p1, :cond_1

    if-nez v3, :cond_0

    return-object p0

    .line 148
    :cond_0
    invoke-virtual {v4}, [Ll/ۤ᩷ܿ;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۤ᩷ܿ;

    .line 149
    aget-object v4, p1, v3

    const/4 v5, 0x1

    .line 150
    invoke-static {p1, v0, p1, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 151
    aput-object v4, p1, v0

    .line 152
    new-instance v0, Ll/ۨۖܿ;

    invoke-direct {v0, v1, v2, p1}, Ll/ۨۖܿ;-><init>(Ll/᩺ܺܿ;I[Ll/ۤ᩷ܿ;)V

    return-object v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 137
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Touched checkpoint is not cached"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 132
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Touched checkpoint identity differs"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/ۤ᩷ܿ;)Ll/ۨۖܿ;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 86
    invoke-virtual/range {p1 .. p1}, Ll/ۤ᩷ܿ;->ܽ()Ll/᩺ܺܿ;

    move-result-object v2

    iget-object v3, v0, Ll/ۨۖܿ;->ۧ:Ll/᩺ܺܿ;

    if-ne v2, v3, :cond_10

    invoke-virtual/range {p1 .. p1}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v2

    iget v4, v0, Ll/ۨۖܿ;->ܽ:I

    if-ne v2, v4, :cond_10

    .line 89
    invoke-virtual/range {p1 .. p1}, Ll/ۤ᩷ܿ;->ᩳ()I

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, v0, Ll/ۨۖܿ;->֫:[Ll/ۤ᩷ܿ;

    array-length v5, v2

    const/4 v6, 0x0

    if-lez v5, :cond_0

    aget-object v5, v2, v6

    if-ne v5, v1, :cond_0

    goto/16 :goto_9

    :cond_0
    const/4 v5, 0x0

    .line 90
    :goto_0
    array-length v7, v2

    const/4 v8, 0x1

    if-ge v5, v7, :cond_4

    .line 91
    aget-object v7, v2, v5

    if-eq v7, v1, :cond_2

    .line 143
    invoke-static {v7, v1}, Ll/ۨۖܿ;->֫(Ll/ۤ᩷ܿ;Ll/ۤ᩷ܿ;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-static {v1, v7}, Ll/ۨۖܿ;->֫(Ll/ۤ᩷ܿ;Ll/ۤ᩷ܿ;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v5, :cond_3

    goto/16 :goto_9

    .line 148
    :cond_3
    invoke-virtual {v2}, [Ll/ۤ᩷ܿ;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۤ᩷ܿ;

    .line 149
    aget-object v2, v1, v5

    .line 150
    invoke-static {v1, v6, v1, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 151
    aput-object v2, v1, v6

    .line 152
    new-instance v2, Ll/ۨۖܿ;

    invoke-direct {v2, v3, v4, v1}, Ll/ۨۖܿ;-><init>(Ll/᩺ܺܿ;I[Ll/ۤ᩷ܿ;)V

    return-object v2

    :cond_4
    const/4 v5, 0x0

    .line 157
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ll/ۤ᩷ܿ;->ᩳ()I

    move-result v7

    if-ge v5, v7, :cond_f

    .line 158
    invoke-virtual {v1, v5}, Ll/ۤ᩷ܿ;->ᩳ(I)Ll/᩶ۘܿ;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v7

    sget-object v9, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-eq v7, v9, :cond_5

    goto :goto_4

    .line 162
    :cond_5
    invoke-virtual {v1, v5}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v7

    .line 163
    invoke-virtual {v1, v5}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v9

    .line 165
    array-length v10, v2

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_7

    aget-object v12, v2, v11

    .line 195
    invoke-virtual {v12}, Ll/ۤ᩷ܿ;->ܽ()Ll/᩺ܺܿ;

    move-result-object v13

    invoke-virtual {v12, v13, v7}, Ll/ۤ᩷ܿ;->֫(Ll/᩺ܺܿ;I)I

    move-result v13

    if-ltz v13, :cond_6

    .line 196
    invoke-virtual {v12, v13}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v14

    if-ne v14, v7, :cond_6

    .line 197
    invoke-virtual {v12, v13}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v12

    if-lt v12, v9, :cond_6

    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 98
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ll/ۤ᩷ܿ;->֫()I

    move-result v5

    .line 99
    invoke-virtual/range {p1 .. p1}, Ll/ۤ᩷ܿ;->ܳ()I

    move-result v7

    const/16 v9, 0x400

    if-gt v5, v9, :cond_e

    const/high16 v9, 0x40000

    if-gt v7, v9, :cond_e

    .line 105
    array-length v9, v2

    add-int/2addr v9, v8

    const/16 v10, 0x10

    .line 106
    invoke-static {v10, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    new-array v10, v9, [Ll/ۤ᩷ܿ;

    int-to-long v11, v5

    int-to-long v13, v7

    .line 110
    aput-object v1, v10, v6

    .line 111
    array-length v5, v2

    :goto_5
    if-ge v6, v5, :cond_c

    aget-object v7, v2, v6

    .line 113
    invoke-static {v1, v7}, Ll/ۨۖܿ;->֫(Ll/ۤ᩷ܿ;Ll/ۤ᩷ܿ;)Z

    move-result v15

    if-nez v15, :cond_a

    if-ne v8, v9, :cond_8

    goto :goto_6

    .line 114
    :cond_8
    invoke-virtual {v7}, Ll/ۤ᩷ܿ;->֫()I

    move-result v15

    move-object/from16 v16, v2

    int-to-long v1, v15

    add-long/2addr v1, v11

    .line 115
    invoke-virtual {v7}, Ll/ۤ᩷ܿ;->ܳ()I

    move-result v15

    move-wide/from16 v17, v11

    int-to-long v11, v15

    add-long/2addr v11, v13

    const-wide/16 v19, 0x400

    cmp-long v15, v1, v19

    if-gtz v15, :cond_b

    const-wide/32 v19, 0x40000

    cmp-long v15, v11, v19

    if-lez v15, :cond_9

    goto :goto_7

    :cond_9
    add-int/lit8 v13, v8, 0x1

    .line 120
    aput-object v7, v10, v8

    move v8, v13

    move-wide v13, v11

    move-wide v11, v1

    goto :goto_8

    :cond_a
    :goto_6
    move-object/from16 v16, v2

    move-wide/from16 v17, v11

    :cond_b
    :goto_7
    move-wide/from16 v11, v17

    :goto_8
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    goto :goto_5

    :cond_c
    if-eq v8, v9, :cond_d

    .line 124
    invoke-static {v10, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, [Ll/ۤ᩷ܿ;

    .line 125
    :cond_d
    new-instance v1, Ll/ۨۖܿ;

    invoke-direct {v1, v3, v4, v10}, Ll/ۨۖܿ;-><init>(Ll/᩺ܺܿ;I[Ll/ۤ᩷ܿ;)V

    return-object v1

    .line 102
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Checkpoint cache update exceeds state budget"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    :goto_9
    return-object v0

    .line 87
    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Checkpoint cache update identity differs"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۧ()Ll/᩺ܺܿ;
    .locals 1

    .line 212
    iget-object v0, p0, Ll/ۨۖܿ;->ۧ:Ll/᩺ܺܿ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 217
    iget v0, p0, Ll/ۨۖܿ;->ܽ:I

    return v0
.end method
