.class public final Ll/ܽ֡ܽ;
.super Ljava/lang/Object;
.source "U6VY"


# instance fields
.field public final ֡:Ll/ۡ۠ܽ;

.field public final ֨:I

.field public final ֫:J

.field public final ۖ:I

.field public final ۘ:I

.field public final ۚ:Ljava/lang/Object;

.field public final ۜ:Z

.field public final ۠:I

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:J

.field public final ܳ:Z

.field public final ܶ:Ll/ۧۚܽ;

.field public final ܺ:Z

.field public final ܽ:Ljava/lang/Object;

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩴ:Z

.field public final ᩵:Z

.field public final ᩷:Ll/ۧۚܽ;

.field public final ᩸:Z

.field public final ᩹:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۡ۠ܽ;Ljava/lang/Object;Ljava/lang/Object;ZZIII)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p8

    .line 33
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object v1, v0, Ll/ܽ֡ܽ;->֡:Ll/ۡ۠ܽ;

    .line 35
    iput-object v2, v0, Ll/ܽ֡ܽ;->ܽ:Ljava/lang/Object;

    .line 36
    iput-object v3, v0, Ll/ܽ֡ܽ;->ۚ:Ljava/lang/Object;

    .line 37
    iput-boolean v4, v0, Ll/ܽ֡ܽ;->ܳ:Z

    move/from16 v6, p5

    .line 38
    iput-boolean v6, v0, Ll/ܽ֡ܽ;->ܺ:Z

    move/from16 v6, p6

    .line 39
    iput v6, v0, Ll/ܽ֡ܽ;->ۖ:I

    move/from16 v6, p7

    .line 41
    iput v6, v0, Ll/ܽ֡ܽ;->᩹:I

    .line 42
    iput v5, v0, Ll/ܽ֡ܽ;->ۘ:I

    .line 43
    instance-of v6, v2, [I

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v6, :cond_0

    move-object v10, v2

    check-cast v10, [I

    array-length v10, v10

    if-ne v10, v7, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    iput-boolean v10, v0, Ll/ܽ֡ܽ;->ۜ:Z

    const/4 v11, -0x1

    if-eqz v10, :cond_1

    .line 44
    move-object v12, v2

    check-cast v12, [I

    aget v12, v12, v8

    goto :goto_1

    :cond_1
    const/4 v12, -0x1

    :goto_1
    iput v12, v0, Ll/ܽ֡ܽ;->ܿ:I

    if-eqz v10, :cond_2

    .line 45
    move-object v12, v2

    check-cast v12, [I

    aget v12, v12, v9

    goto :goto_2

    :cond_2
    const/4 v12, -0x1

    :goto_2
    iput v12, v0, Ll/ܽ֡ܽ;->ۢ:I

    .line 46
    instance-of v12, v2, Ll/ۧۚܽ;

    const/4 v13, 0x0

    if-eqz v12, :cond_3

    move-object v12, v2

    check-cast v12, Ll/ۧۚܽ;

    goto :goto_3

    :cond_3
    move-object v12, v13

    :goto_3
    iput-object v12, v0, Ll/ܽ֡ܽ;->᩷:Ll/ۧۚܽ;

    .line 47
    instance-of v12, v3, Ll/ۧۚܽ;

    if-eqz v12, :cond_4

    move-object v13, v3

    check-cast v13, Ll/ۧۚܽ;

    :cond_4
    iput-object v13, v0, Ll/ܽ֡ܽ;->ܶ:Ll/ۧۚܽ;

    .line 48
    invoke-static/range {p2 .. p2}, Ll/ܽ֡ܽ;->֫(Ljava/lang/Object;)I

    move-result v12

    iput v12, v0, Ll/ܽ֡ܽ;->ᩳ:I

    .line 49
    invoke-static/range {p3 .. p3}, Ll/ܽ֡ܽ;->֫(Ljava/lang/Object;)I

    move-result v12

    iput v12, v0, Ll/ܽ֡ܽ;->֨:I

    if-eqz v6, :cond_6

    .line 123
    move-object v12, v2

    check-cast v12, [I

    array-length v13, v12

    if-ne v13, v9, :cond_5

    aget v12, v12, v8

    goto :goto_4

    :cond_5
    const/4 v12, -0x1

    goto :goto_4

    .line 124
    :cond_6
    move-object v12, v2

    check-cast v12, Ll/ۧۚܽ;

    sget-object v13, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2478
    invoke-static {v12}, Ll/ܿ֨ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v12

    .line 50
    :goto_4
    iput v12, v0, Ll/ܽ֡ܽ;->᩻:I

    .line 123
    instance-of v13, v3, [I

    if-eqz v13, :cond_7

    move-object v13, v3

    check-cast v13, [I

    array-length v14, v13

    if-ne v14, v9, :cond_8

    aget v11, v13, v8

    goto :goto_5

    .line 124
    :cond_7
    move-object v8, v3

    check-cast v8, Ll/ۧۚܽ;

    sget-object v11, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2478
    invoke-static {v8}, Ll/ܿ֨ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v11

    .line 51
    :cond_8
    :goto_5
    iput v11, v0, Ll/ܽ֡ܽ;->۠:I

    const/16 v8, 0x80

    if-eqz v1, :cond_9

    .line 52
    iget-boolean v13, v1, Ll/ۡ۠ܽ;->ܳ:Z

    if-eqz v13, :cond_9

    if-nez v4, :cond_9

    iget v13, v1, Ll/ۡ۠ܽ;->ܽ:I

    if-gez v13, :cond_9

    if-ltz v12, :cond_9

    if-ge v12, v8, :cond_9

    if-ltz v11, :cond_9

    if-ge v11, v8, :cond_9

    if-eq v12, v11, :cond_9

    const/4 v8, 0x1

    goto :goto_6

    :cond_9
    const/4 v8, 0x0

    :goto_6
    iput-boolean v8, v0, Ll/ܽ֡ܽ;->᩵:Z

    if-nez v1, :cond_a

    const/4 v1, 0x0

    const/4 v7, 0x0

    goto/16 :goto_8

    .line 56
    :cond_a
    iget-object v8, v1, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    .line 57
    iget-boolean v13, v1, Ll/ۡ۠ܽ;->ܳ:Z

    if-eqz v13, :cond_b

    if-nez v4, :cond_b

    const/4 v1, 0x0

    const/4 v7, 0x1

    goto/16 :goto_8

    .line 58
    :cond_b
    iget v15, v1, Ll/ۡ۠ܽ;->ܽ:I

    const/4 v14, 0x3

    if-gez v15, :cond_11

    if-nez v4, :cond_11

    if-ltz v12, :cond_10

    if-ltz v11, :cond_10

    .line 95
    sget-object v4, Ll/ۧ֡ܽ;->֫:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v4, v4, v8

    if-eq v4, v9, :cond_e

    if-eq v4, v7, :cond_d

    if-ne v4, v14, :cond_c

    const/16 v7, 0x8

    goto :goto_7

    .line 101
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid exact literal quantifier type"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    const/4 v7, 0x7

    goto :goto_7

    :cond_e
    if-ne v12, v11, :cond_f

    .line 97
    iget v1, v1, Ll/ۡ۠ܽ;->ᩳ:I

    const/16 v4, 0x400

    if-ge v1, v4, :cond_f

    const/16 v7, 0x9

    goto :goto_7

    :cond_f
    const/4 v7, 0x5

    :cond_10
    :goto_7
    const/4 v1, 0x0

    goto :goto_8

    :cond_11
    if-gez v15, :cond_12

    if-eqz v4, :cond_12

    if-eqz v10, :cond_12

    if-nez v13, :cond_12

    .line 61
    sget-object v4, Ll/֫֨ܽ;->ۗ:Ll/֫֨ܽ;

    if-ne v8, v4, :cond_12

    if-ltz v11, :cond_12

    const/4 v7, 0x6

    goto :goto_7

    :cond_12
    if-ltz v15, :cond_14

    .line 63
    iget-boolean v1, v1, Ll/ۡ۠ܽ;->֫:Z

    if-eqz v1, :cond_14

    if-eqz v10, :cond_14

    if-ltz v11, :cond_14

    sget-object v1, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-eq v8, v1, :cond_13

    sget-object v1, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    if-ne v8, v1, :cond_14

    :cond_13
    const/4 v7, 0x3

    goto :goto_7

    :cond_14
    const/4 v7, 0x4

    goto :goto_7

    .line 64
    :goto_8
    iput v7, v0, Ll/ܽ֡ܽ;->ۡ:I

    const-wide/16 v7, 0x0

    const/4 v4, 0x0

    const/16 v10, 0x80

    move-wide v11, v7

    :goto_9
    if-ge v4, v10, :cond_18

    .line 67
    invoke-static {v4, v2}, Ll/ܽ֡ܽ;->֫(ILjava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_15

    if-nez v5, :cond_17

    invoke-static {v4, v3}, Ll/ܽ֡ܽ;->֫(ILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_17

    :cond_15
    const/16 v13, 0x40

    const-wide/16 v14, 0x1

    if-ge v4, v13, :cond_16

    shl-long v13, v14, v4

    or-long/2addr v7, v13

    goto :goto_a

    :cond_16
    shl-long v13, v14, v4

    or-long/2addr v11, v13

    :cond_17
    :goto_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    .line 72
    :cond_18
    iput-wide v7, v0, Ll/ܽ֡ܽ;->ۧ:J

    .line 73
    iput-wide v11, v0, Ll/ܽ֡ܽ;->֫:J

    if-eqz v6, :cond_1b

    .line 75
    check-cast v2, [I

    if-nez v5, :cond_19

    .line 77
    array-length v4, v2

    if-le v4, v9, :cond_19

    const/4 v4, 0x0

    goto :goto_b

    :cond_19
    const/4 v4, 0x1

    :goto_b
    const/4 v5, 0x1

    .line 78
    :goto_c
    array-length v6, v2

    if-ge v5, v6, :cond_1c

    .line 79
    aget v6, v2, v5

    aget v7, v2, v1

    if-ne v6, v7, :cond_1a

    const/4 v4, 0x0

    :cond_1a
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_1b
    const/4 v4, 0x1

    .line 82
    :cond_1c
    iput-boolean v4, v0, Ll/ܽ֡ܽ;->ᩴ:Z

    const v1, 0xdc00

    :goto_d
    const v2, 0xdfff

    if-gt v1, v2, :cond_1e

    .line 85
    invoke-static {v1, v3}, Ll/ܽ֡ܽ;->֫(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const/4 v1, 0x0

    goto :goto_e

    :cond_1d
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_1e
    const/4 v1, 0x1

    .line 90
    :goto_e
    iput-boolean v1, v0, Ll/ܽ֡ܽ;->᩸:Z

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)I
    .locals 4

    .line 112
    instance-of v0, p0, [I

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, [I

    array-length v0, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/4 v2, -0x1

    :goto_0
    const/16 v3, 0x80

    if-ge v0, v3, :cond_3

    .line 115
    invoke-static {v0, p0}, Ll/ܽ֡ܽ;->֫(ILjava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    if-ltz v2, :cond_2

    :goto_1
    return v1

    :cond_2
    move v2, v0

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method public static ֫([I[Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 193
    invoke-static {p2, p0}, Ll/ܽ֡ܽ;->֫(I[I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v0, p2, 0x2

    .line 194
    aget v0, p0, v0

    if-ltz v0, :cond_1

    .line 216
    array-length v2, p1

    if-ge v0, v2, :cond_1

    aget-object p1, p1, v0

    goto :goto_0

    :cond_1
    move-object p1, v1

    .line 195
    :goto_0
    aget p0, p0, p2

    const/4 p2, 0x1

    if-ne p0, p2, :cond_2

    instance-of p0, p1, Ll/ۧۚܽ;

    if-eqz p0, :cond_6

    return-object p1

    :cond_2
    const/4 p2, 0x3

    if-ne p0, p2, :cond_6

    .line 196
    instance-of p0, p1, [I

    if-eqz p0, :cond_6

    check-cast p1, [I

    array-length p0, p1

    if-nez p0, :cond_3

    goto :goto_2

    .line 197
    :cond_3
    array-length p0, p1

    const/4 p2, 0x0

    :goto_1
    if-ge p2, p0, :cond_5

    aget v0, p1, p2

    if-ltz v0, :cond_6

    const v2, 0xffff

    if-le v0, v2, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 200
    :cond_5
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_2
    return-object v1
.end method

.method public static ֫(II[I)Z
    .locals 1

    .line 208
    invoke-static {p0, p2}, Ll/ܽ֡ܽ;->֫(I[I)Z

    move-result v0

    if-eqz v0, :cond_0

    aget p0, p2, p0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(ILjava/lang/Object;)Z
    .locals 1

    .line 128
    instance-of v0, p1, [I

    if-eqz v0, :cond_1

    check-cast p1, [I

    const/4 v0, 0x0

    aget p1, p1, v0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0

    :cond_1
    check-cast p1, Ll/ۧۚܽ;

    invoke-interface {p1, p0}, Ll/ۧۚܽ;->֫(I)Z

    move-result p0

    return p0
.end method

.method public static ֫(I[I)Z
    .locals 1

    if-ltz p0, :cond_0

    .line 212
    rem-int/lit8 v0, p0, 0x8

    if-nez v0, :cond_0

    array-length p1, p1

    add-int/lit8 p1, p1, -0x8

    if-gt p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ([I[Ljava/lang/Object;I)Ll/ܽ֡ܽ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x0

    if-eqz v0, :cond_16

    if-eqz v1, :cond_16

    .line 136
    invoke-static {v2, v0}, Ll/ܽ֡ܽ;->֫(I[I)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_7

    .line 137
    :cond_0
    aget v4, v0, v2

    const/4 v5, 0x5

    const/16 v6, 0x19

    if-eq v4, v6, :cond_1

    const/4 v7, 0x4

    if-eq v4, v7, :cond_1

    if-eq v4, v5, :cond_1

    goto/16 :goto_7

    :cond_1
    add-int/lit8 v7, v2, 0x1

    .line 139
    aget v7, v0, v7

    .line 140
    invoke-static {v0, v1, v7}, Ll/ܽ֡ܽ;->֫([I[Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_16

    const/4 v8, 0x1

    add-int/2addr v7, v8

    .line 141
    aget v7, v0, v7

    const/4 v9, 0x0

    invoke-static {v7, v9, v0}, Ll/ܽ֡ܽ;->֫(II[I)Z

    move-result v7

    if-nez v7, :cond_2

    goto/16 :goto_7

    :cond_2
    if-eq v4, v6, :cond_6

    add-int/lit8 v6, v2, 0x2

    .line 143
    aget v6, v0, v6

    if-ltz v6, :cond_3

    .line 216
    array-length v7, v1

    if-ge v6, v7, :cond_3

    aget-object v1, v1, v6

    move-object v10, v1

    goto :goto_0

    :cond_3
    move-object v10, v3

    :goto_0
    add-int/lit8 v1, v2, 0x3

    .line 144
    aget v16, v0, v1

    .line 145
    instance-of v0, v10, Ll/ۧۚܽ;

    if-eqz v0, :cond_16

    if-gez v16, :cond_4

    goto/16 :goto_7

    :cond_4
    if-ne v4, v5, :cond_5

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    const/4 v13, 0x0

    .line 148
    :goto_1
    new-instance v0, Ll/ܽ֡ܽ;

    xor-int/lit8 v15, v13, 0x1

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v8, v0

    .line 149
    invoke-direct/range {v8 .. v16}, Ll/ܽ֡ܽ;-><init>(Ll/ۡ۠ܽ;Ljava/lang/Object;Ljava/lang/Object;ZZIII)V

    return-object v0

    :cond_6
    add-int/lit8 v4, v2, 0x2

    .line 151
    aget v4, v0, v4

    if-ltz v4, :cond_7

    .line 216
    array-length v5, v1

    if-ge v4, v5, :cond_7

    aget-object v4, v1, v4

    goto :goto_2

    :cond_7
    move-object v4, v3

    .line 152
    :goto_2
    instance-of v5, v4, Ll/ۡ۠ܽ;

    if-eqz v5, :cond_16

    move-object v9, v4

    check-cast v9, Ll/ۡ۠ܽ;

    iget v4, v9, Ll/ۡ۠ܽ;->ۧ:I

    iget-boolean v5, v9, Ll/ۡ۠ܽ;->֫:Z

    iget v6, v9, Ll/ۡ۠ܽ;->ܽ:I

    iget v7, v9, Ll/ۡ۠ܽ;->ܿ:I

    if-ltz v7, :cond_16

    iget v10, v9, Ll/ۡ۠ܽ;->ᩳ:I

    if-lt v10, v7, :cond_16

    iget-object v12, v9, Ll/ۡ۠ܽ;->᩻:Ll/֫֨ܽ;

    if-eqz v12, :cond_16

    sget-object v13, Ll/֫֨ܽ;->᩶:Ll/֫֨ܽ;

    if-eq v12, v13, :cond_16

    iget-boolean v12, v9, Ll/ۡ۠ܽ;->ܳ:Z

    if-eqz v12, :cond_8

    if-nez v7, :cond_16

    if-eq v10, v8, :cond_8

    goto/16 :goto_7

    :cond_8
    add-int/lit8 v2, v2, 0x3

    .line 156
    aget v2, v0, v2

    .line 157
    invoke-static {v2, v0}, Ll/ܽ֡ܽ;->֫(I[I)Z

    move-result v7

    if-nez v7, :cond_9

    goto/16 :goto_7

    :cond_9
    if-gez v6, :cond_b

    const/4 v7, 0x7

    .line 160
    invoke-static {v2, v7, v0}, Ll/ܽ֡ܽ;->֫(II[I)Z

    move-result v7

    if-eqz v7, :cond_b

    add-int/lit8 v7, v2, 0x2

    .line 162
    aget v7, v0, v7

    if-gez v7, :cond_a

    goto/16 :goto_7

    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 165
    aget v2, v0, v2

    const/4 v10, 0x1

    const/4 v12, 0x1

    goto :goto_3

    :cond_b
    const/4 v7, -0x1

    const/4 v10, 0x0

    const/4 v12, 0x0

    .line 167
    :goto_3
    invoke-static {v0, v1, v2}, Ll/ܽ֡ܽ;->֫([I[Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_c

    goto/16 :goto_7

    :cond_c
    add-int/2addr v2, v8

    .line 169
    aget v1, v0, v2

    const/16 v2, 0x8

    if-ltz v6, :cond_10

    .line 172
    invoke-static {v1, v2, v0}, Ll/ܽ֡ܽ;->֫(II[I)Z

    move-result v2

    if-eqz v2, :cond_16

    add-int/lit8 v2, v1, 0x2

    aget v2, v0, v2

    if-ne v2, v6, :cond_16

    add-int/lit8 v1, v1, 0x3

    aget v0, v0, v1

    if-ne v0, v4, :cond_16

    if-eqz v5, :cond_e

    if-lez v4, :cond_d

    and-int/lit8 v0, v4, 0x1

    if-nez v0, :cond_d

    goto :goto_4

    :cond_d
    return-object v3

    :cond_e
    :goto_4
    if-nez v5, :cond_f

    if-eqz v4, :cond_f

    goto :goto_7

    :cond_f
    if-eqz v5, :cond_14

    move v14, v4

    goto :goto_5

    :cond_10
    const/16 v4, 0x17

    if-eqz v12, :cond_13

    if-nez v5, :cond_16

    .line 179
    invoke-static {v1, v2, v0}, Ll/ܽ֡ܽ;->֫(II[I)Z

    move-result v2

    if-eqz v2, :cond_16

    add-int/lit8 v2, v1, 0x2

    aget v2, v0, v2

    if-ne v2, v7, :cond_16

    add-int/lit8 v2, v1, 0x3

    aget v5, v0, v2

    if-lez v5, :cond_12

    and-int/2addr v5, v8

    if-nez v5, :cond_12

    add-int/2addr v1, v8

    .line 180
    aget v1, v0, v1

    .line 181
    invoke-static {v1, v4, v0}, Ll/ܽ֡ܽ;->֫(II[I)Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_7

    .line 182
    :cond_11
    aget v0, v0, v2

    move v14, v0

    goto :goto_5

    :cond_12
    return-object v3

    :cond_13
    if-nez v5, :cond_16

    .line 183
    invoke-static {v1, v4, v0}, Ll/ܽ֡ܽ;->֫(II[I)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_7

    :cond_14
    const/4 v0, 0x0

    const/4 v14, 0x0

    .line 186
    :goto_5
    instance-of v0, v10, [I

    if-eqz v0, :cond_15

    move-object v0, v10

    check-cast v0, [I

    array-length v0, v0

    move v15, v0

    goto :goto_6

    :cond_15
    const/4 v0, 0x1

    const/4 v15, 0x1

    .line 187
    :goto_6
    new-instance v0, Ll/ܽ֡ܽ;

    const/4 v13, 0x0

    iget v1, v9, Ll/ۡ۠ܽ;->ܿ:I

    move-object v8, v0

    move/from16 v16, v1

    invoke-direct/range {v8 .. v16}, Ll/ܽ֡ܽ;-><init>(Ll/ۡ۠ܽ;Ljava/lang/Object;Ljava/lang/Object;ZZIII)V

    return-object v0

    :cond_16
    :goto_7
    return-object v3
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 4

    const/16 v0, 0x80

    if-ge p1, v0, :cond_2

    const/16 v0, 0x40

    if-ge p1, v0, :cond_0

    .line 107
    iget-wide v0, p0, Ll/ܽ֡ܽ;->ۧ:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ll/ܽ֡ܽ;->֫:J

    :goto_0
    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method
