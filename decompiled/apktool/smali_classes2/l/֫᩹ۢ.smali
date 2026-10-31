.class public final Ll/֫᩹ۢ;
.super Ljava/lang/Object;
.source "I1TM"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:[Ll/ᩴ᩹ۢ;

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(III)V
    .locals 8

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Ll/֫᩹ۢ;->֫:I

    .line 27
    iput v0, p0, Ll/֫᩹ۢ;->ᩳ:I

    .line 38
    iput p1, p0, Ll/֫᩹ۢ;->ۧ:I

    .line 39
    iput p2, p0, Ll/֫᩹ۢ;->ܳ:I

    .line 40
    iput p3, p0, Ll/֫᩹ۢ;->ܿ:I

    .line 41
    new-array p2, p2, [Ll/ᩴ᩹ۢ;

    iput-object p2, p0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    const/16 v5, 0x20

    .line 43
    sget-wide v6, Ll/᩻᩶ۢ;->֫:J

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move v3, p1

    move v4, p3

    invoke-virtual/range {v0 .. v7}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    return-void
.end method

.method private ֫(II)V
    .locals 5

    if-nez p2, :cond_0

    return-void

    .line 312
    :cond_0
    iget v0, p0, Ll/֫᩹ۢ;->ܳ:I

    add-int/lit8 p2, p2, -0x1

    .line 316
    iget-object v1, p0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    add-int v2, p1, p2

    add-int/lit8 v2, v2, 0x1

    rem-int/2addr v2, v0

    aget-object v1, v1, v2

    :goto_0
    if-ltz p2, :cond_1

    .line 319
    iget-object v2, p0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    add-int v3, p1, p2

    add-int/lit8 v4, v3, 0x1

    rem-int/2addr v4, v0

    rem-int/2addr v3, v0

    aget-object v3, v2, v3

    aput-object v3, v2, v4

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 321
    :cond_1
    iget-object p2, p0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    rem-int/2addr p1, v0

    aput-object v1, p2, p1

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 98
    iget v0, p0, Ll/֫᩹ۢ;->֫:I

    iget v1, p0, Ll/֫᩹ۢ;->ܿ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(IIII)Ljava/lang/String;
    .locals 15

    move-object v0, p0

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    iget v2, v0, Ll/֫᩹ۢ;->ۧ:I

    .line 94
    iget v3, v0, Ll/֫᩹ۢ;->֫:I

    neg-int v3, v3

    move/from16 v4, p2

    if-ge v4, v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    .line 55
    :goto_0
    iget v4, v0, Ll/֫᩹ۢ;->ܿ:I

    move/from16 v5, p4

    if-lt v5, v4, :cond_1

    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    move v5, v3

    :goto_2
    if-gt v5, v4, :cond_c

    if-ne v5, v3, :cond_2

    move/from16 v6, p1

    goto :goto_3

    :cond_2
    const/4 v6, 0x0

    :goto_3
    if-ne v5, v4, :cond_3

    add-int/lit8 v7, p3, 0x1

    if-le v7, v2, :cond_4

    :cond_3
    move v7, v2

    .line 66
    :cond_4
    iget-object v8, v0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    invoke-virtual {p0, v5}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v9

    aget-object v8, v8, v9

    .line 67
    invoke-virtual {v8, v6}, Ll/ᩴ᩹ۢ;->֫(I)I

    move-result v6

    .line 68
    iget v9, v0, Ll/֫᩹ۢ;->ۧ:I

    if-ge v7, v9, :cond_5

    invoke-virtual {v8, v7}, Ll/ᩴ᩹ۢ;->֫(I)I

    move-result v9

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Ll/ᩴ᩹ۢ;->֫()I

    move-result v9

    :goto_4
    if-ne v9, v6, :cond_6

    add-int/lit8 v9, v7, 0x1

    .line 71
    invoke-virtual {v8, v9}, Ll/ᩴ᩹ۢ;->֫(I)I

    move-result v9

    .line 73
    :cond_6
    iget-object v8, v8, Ll/ᩴ᩹ۢ;->ܳ:[C

    .line 135
    iget-object v10, v0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    invoke-virtual {p0, v5}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v11

    aget-object v10, v10, v11

    iget-boolean v10, v10, Ll/ᩴ᩹ۢ;->ܽ:Z

    const/4 v11, -0x1

    if-eqz v10, :cond_7

    if-ne v7, v2, :cond_7

    add-int/lit8 v9, v9, -0x1

    goto :goto_6

    :cond_7
    const/4 v7, -0x1

    move v12, v6

    :goto_5
    if-ge v12, v9, :cond_9

    .line 82
    aget-char v13, v8, v12

    const/16 v14, 0x20

    if-eq v13, v14, :cond_8

    move v7, v12

    :cond_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_9
    move v9, v7

    :goto_6
    if-eq v9, v11, :cond_a

    sub-int/2addr v9, v6

    add-int/lit8 v9, v9, 0x1

    if-lez v9, :cond_a

    .line 87
    invoke-virtual {v1, v8, v6, v9}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    :cond_a
    if-nez v10, :cond_b

    if-ge v5, v4, :cond_b

    .line 88
    iget v6, v0, Ll/֫᩹ۢ;->ܿ:I

    add-int/lit8 v6, v6, -0x1

    if-ge v5, v6, :cond_b

    const/16 v6, 0xa

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 90
    :cond_c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public final ֫(I)Ll/ᩴ᩹ۢ;
    .locals 5

    .line 397
    iget-object v0, p0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    aget-object v1, v0, p1

    if-nez v1, :cond_0

    new-instance v1, Ll/ᩴ᩹ۢ;

    iget v2, p0, Ll/֫᩹ۢ;->ۧ:I

    const-wide/16 v3, 0x0

    invoke-direct {v1, v2, v3, v4}, Ll/ᩴ᩹ۢ;-><init>(IJ)V

    aput-object v1, v0, p1

    :cond_0
    return-object v1
.end method

.method public final ֫(IIIIII)V
    .locals 4

    if-nez p3, :cond_0

    goto :goto_2

    :cond_0
    if-ltz p1, :cond_4

    add-int v0, p1, p3

    .line 370
    iget v1, p0, Ll/֫᩹ۢ;->ۧ:I

    if-gt v0, v1, :cond_4

    if-ltz p2, :cond_4

    add-int v2, p2, p4

    iget v3, p0, Ll/֫᩹ۢ;->ܿ:I

    if-gt v2, v3, :cond_4

    if-ltz p5, :cond_4

    add-int/2addr p3, p5

    if-gt p3, v1, :cond_4

    if-ltz p6, :cond_4

    add-int p3, p6, p4

    if-gt p3, v3, :cond_4

    const/4 p3, 0x0

    if-le p2, p6, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-ge p3, p4, :cond_3

    if-eqz v1, :cond_2

    move v2, p3

    goto :goto_1

    :cond_2
    add-int/lit8 v2, p3, 0x1

    sub-int v2, p4, v2

    :goto_1
    add-int v3, p2, v2

    .line 375
    invoke-virtual {p0, v3}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v3

    invoke-virtual {p0, v3}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object v3

    add-int/2addr v2, p6

    .line 376
    invoke-virtual {p0, v2}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v2

    invoke-virtual {p0, v2}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object v2

    invoke-virtual {v2, v3, p1, v0, p5}, Ll/ᩴ᩹ۢ;->֫(Ll/ᩴ᩹ۢ;III)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void

    .line 371
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(IIIIIJ)V
    .locals 8

    if-ltz p1, :cond_2

    add-int v0, p1, p3

    .line 386
    iget v1, p0, Ll/֫᩹ۢ;->ۧ:I

    if-gt v0, v1, :cond_2

    if-ltz p2, :cond_2

    add-int v0, p2, p4

    iget v1, p0, Ll/֫᩹ۢ;->ܿ:I

    if-gt v0, v1, :cond_2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p3, :cond_0

    add-int v3, p1, v1

    add-int v4, p2, v0

    move-object v2, p0

    move v5, p5

    move-wide v6, p6

    .line 393
    invoke-virtual/range {v2 .. v7}, Ll/֫᩹ۢ;->֫(IIIJ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 387
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(IIIJ)V
    .locals 1

    .line 401
    iget v0, p0, Ll/֫᩹ۢ;->ܿ:I

    if-ge p2, v0, :cond_0

    iget v0, p0, Ll/֫᩹ۢ;->ۧ:I

    if-ge p1, v0, :cond_0

    .line 404
    invoke-virtual {p0, p2}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result p2

    .line 405
    invoke-virtual {p0, p2}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object p2

    invoke-virtual {p2, p1, p3, p4, p5}, Ll/ᩴ᩹ۢ;->֫(IIJ)V

    return-void

    .line 402
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(III[IJZ)V
    .locals 28

    move-object/from16 v6, p0

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move-wide/from16 v7, p5

    .line 152
    iget v3, v6, Ll/֫᩹ۢ;->ۧ:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v0, v3, :cond_8

    iget v3, v6, Ll/֫᩹ۢ;->ܳ:I

    if-gt v1, v3, :cond_8

    .line 154
    iget v0, v6, Ll/֫᩹ۢ;->ܿ:I

    sub-int v3, v0, v1

    if-lez v3, :cond_3

    if-ge v3, v0, :cond_3

    sub-int/2addr v0, v4

    :goto_0
    if-lez v0, :cond_5

    .line 158
    aget v7, p4, v4

    if-lt v7, v0, :cond_0

    goto :goto_2

    .line 159
    :cond_0
    invoke-virtual {v6, v0}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v7

    .line 160
    iget-object v8, v6, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    aget-object v7, v8, v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ll/ᩴ᩹ۢ;->ۧ()Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_1
    add-int/lit8 v3, v3, -0x1

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    if-gez v3, :cond_5

    .line 166
    iget v0, v6, Ll/֫᩹ۢ;->֫:I

    neg-int v0, v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eq v3, v0, :cond_5

    const/4 v9, 0x0

    :goto_1
    sub-int v10, v0, v3

    if-ge v9, v10, :cond_4

    .line 170
    iget v10, v6, Ll/֫᩹ۢ;->ᩳ:I

    iget v11, v6, Ll/֫᩹ۢ;->ܿ:I

    add-int/2addr v10, v11

    add-int/2addr v10, v9

    iget v11, v6, Ll/֫᩹ۢ;->ܳ:I

    rem-int/2addr v10, v11

    invoke-virtual {v6, v10}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object v10

    invoke-virtual {v10, v7, v8}, Ll/ᩴ᩹ۢ;->֫(J)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_4
    move v3, v0

    .line 174
    :cond_5
    :goto_2
    iget v0, v6, Ll/֫᩹ۢ;->ᩳ:I

    add-int/2addr v0, v3

    iput v0, v6, Ll/֫᩹ۢ;->ᩳ:I

    .line 175
    iget v7, v6, Ll/֫᩹ۢ;->ܳ:I

    if-gez v0, :cond_6

    add-int/2addr v0, v7

    goto :goto_3

    :cond_6
    rem-int/2addr v0, v7

    :goto_3
    iput v0, v6, Ll/֫᩹ۢ;->ᩳ:I

    .line 176
    iput v2, v6, Ll/֫᩹ۢ;->ܳ:I

    if-eqz p7, :cond_7

    const/4 v0, 0x0

    goto :goto_4

    .line 177
    :cond_7
    iget v0, v6, Ll/֫᩹ۢ;->֫:I

    add-int/2addr v0, v3

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_4
    iput v0, v6, Ll/֫᩹ۢ;->֫:I

    .line 178
    aget v0, p4, v4

    sub-int/2addr v0, v3

    aput v0, p4, v4

    .line 179
    iput v1, v6, Ll/֫᩹ۢ;->ܿ:I

    goto/16 :goto_1a

    .line 182
    :cond_8
    iget-object v9, v6, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    .line 183
    new-array v3, v2, [Ll/ᩴ᩹ۢ;

    iput-object v3, v6, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v2, :cond_9

    .line 185
    iget-object v10, v6, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    new-instance v11, Ll/ᩴ᩹ۢ;

    invoke-direct {v11, v0, v7, v8}, Ll/ᩴ᩹ۢ;-><init>(IJ)V

    aput-object v11, v10, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 187
    :cond_9
    iget v3, v6, Ll/֫᩹ۢ;->֫:I

    .line 188
    iget v10, v6, Ll/֫᩹ۢ;->ᩳ:I

    .line 189
    iget v11, v6, Ll/֫᩹ۢ;->ܿ:I

    .line 190
    iget v12, v6, Ll/֫᩹ۢ;->ܳ:I

    .line 191
    iput v2, v6, Ll/֫᩹ۢ;->ܳ:I

    .line 192
    iput v1, v6, Ll/֫᩹ۢ;->ܿ:I

    .line 193
    iput v5, v6, Ll/֫᩹ۢ;->ᩳ:I

    iput v5, v6, Ll/֫᩹ۢ;->֫:I

    .line 194
    iput v0, v6, Ll/֫᩹ۢ;->ۧ:I

    .line 198
    aget v13, p4, v4

    .line 199
    aget v14, p4, v5

    neg-int v0, v3

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    move v15, v0

    const/4 v0, 0x0

    :goto_6
    if-ge v15, v11, :cond_24

    add-int v16, v10, v15

    if-gez v16, :cond_a

    add-int v16, v12, v16

    goto :goto_7

    .line 212
    :cond_a
    rem-int v16, v16, v12

    :goto_7
    move/from16 p7, v10

    .line 214
    aget-object v10, v9, v16

    if-ne v15, v13, :cond_b

    const/16 v16, 0x1

    goto :goto_8

    :cond_b
    const/16 v16, 0x0

    :goto_8
    if-eqz v10, :cond_23

    if-nez v3, :cond_c

    if-nez v16, :cond_d

    .line 217
    :cond_c
    invoke-virtual {v10}, Ll/ᩴ᩹ۢ;->ۧ()Z

    move-result v17

    if-eqz v17, :cond_d

    goto/16 :goto_18

    :cond_d
    if-lez v4, :cond_10

    const/16 v17, 0x0

    move/from16 p1, v0

    const/4 v0, 0x0

    :goto_9
    if-ge v0, v4, :cond_f

    move/from16 p2, v3

    .line 223
    iget v3, v6, Ll/֫᩹ۢ;->ܿ:I

    move-object/from16 v17, v9

    add-int/lit8 v9, v3, -0x1

    if-ne v5, v9, :cond_e

    const/4 v9, 0x0

    .line 224
    invoke-virtual {v6, v9, v3, v7, v8}, Ll/֫᩹ۢ;->֫(IIJ)V

    goto :goto_a

    :cond_e
    add-int/lit8 v5, v5, 0x1

    :goto_a
    add-int/lit8 v0, v0, 0x1

    const/4 v3, 0x0

    move/from16 v3, p2

    move-object/from16 v9, v17

    const/16 p1, 0x0

    goto :goto_9

    :cond_f
    move/from16 p2, v3

    move-object/from16 v17, v9

    const/4 v4, 0x0

    move/from16 v0, p1

    const/4 v9, 0x0

    goto :goto_b

    :cond_10
    move/from16 p2, v3

    move-object/from16 v17, v9

    move v9, v4

    :goto_b
    if-nez v16, :cond_14

    .line 235
    iget-boolean v3, v10, Ll/ᩴ᩹ۢ;->ܽ:Z

    if-eqz v3, :cond_11

    goto :goto_e

    :cond_11
    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 p1, v0

    .line 240
    :goto_c
    invoke-virtual {v10}, Ll/ᩴ᩹ۢ;->֫()I

    move-result v0

    if-ge v3, v0, :cond_13

    .line 242
    iget-object v0, v10, Ll/ᩴ᩹ۢ;->ܳ:[C

    aget-char v0, v0, v3

    move/from16 p3, v4

    const/16 v4, 0x20

    if-eq v0, v4, :cond_12

    add-int/lit8 v0, v3, 0x1

    move v4, v0

    goto :goto_d

    :cond_12
    move/from16 v4, p3

    :goto_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_13
    move/from16 p3, v4

    goto :goto_f

    :cond_14
    :goto_e
    move/from16 p1, v0

    .line 237
    invoke-virtual {v10}, Ll/ᩴ᩹ۢ;->֫()I

    move-result v4

    if-eqz v16, :cond_15

    const/4 v0, 0x1

    const/16 v16, 0x1

    goto :goto_10

    :cond_15
    :goto_f
    const/4 v0, 0x0

    const/16 v16, 0x0

    :goto_10
    const-wide/16 v18, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    move/from16 v0, p1

    move-wide/from16 v20, v18

    move/from16 v19, p2

    move/from16 v18, v1

    move v1, v5

    const/4 v5, 0x0

    :goto_11
    if-ge v3, v4, :cond_1f

    move/from16 p1, v4

    .line 250
    iget-object v4, v10, Ll/ᩴ᩹ۢ;->ܳ:[C

    aget-char v4, v4, v3

    .line 251
    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v22

    move/from16 p3, v9

    if-eqz v22, :cond_16

    iget-object v9, v10, Ll/ᩴ᩹ۢ;->ܳ:[C

    add-int/lit8 v3, v3, 0x1

    aget-char v9, v9, v3

    invoke-static {v4, v9}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v4

    :cond_16
    move v9, v3

    move v3, v4

    .line 252
    invoke-static {v3}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v22

    if-lez v22, :cond_17

    .line 263
    iget-object v4, v10, Ll/ᩴ᩹ۢ;->ܿ:[J

    aget-wide v20, v4, v5

    :cond_17
    add-int v4, v0, v22

    move/from16 p2, v0

    .line 257
    iget v0, v6, Ll/֫᩹ۢ;->ۧ:I

    if-le v4, v0, :cond_1a

    .line 131
    iget-object v0, v6, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    invoke-virtual {v6, v1}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v4

    aget-object v0, v0, v4

    const/4 v4, 0x1

    iput-boolean v4, v0, Ll/ᩴ᩹ۢ;->ܽ:Z

    .line 259
    iget v0, v6, Ll/֫᩹ۢ;->ܿ:I

    add-int/lit8 v4, v0, -0x1

    if-ne v1, v4, :cond_19

    if-eqz v19, :cond_18

    add-int/lit8 v2, v2, -0x1

    :cond_18
    const/4 v4, 0x0

    .line 261
    invoke-virtual {v6, v4, v0, v7, v8}, Ll/֫᩹ۢ;->֫(IIJ)V

    goto :goto_12

    :cond_19
    add-int/lit8 v1, v1, 0x1

    :goto_12
    const/4 v0, 0x0

    move/from16 v24, v1

    move/from16 v25, v2

    const/16 v23, 0x0

    goto :goto_13

    :cond_1a
    move/from16 v23, p2

    move/from16 v24, v1

    move/from16 v25, v2

    :goto_13
    if-gtz v22, :cond_1b

    if-lez v23, :cond_1b

    const/4 v0, 0x1

    goto :goto_14

    :cond_1b
    const/4 v0, 0x0

    :goto_14
    sub-int v1, v23, v0

    move-object/from16 v0, p0

    move/from16 v2, v24

    move/from16 v27, p1

    move/from16 v26, v12

    move v12, v5

    move-wide/from16 v4, v20

    .line 270
    invoke-virtual/range {v0 .. v5}, Ll/֫᩹ۢ;->֫(IIIJ)V

    if-lez v22, :cond_1d

    if-ne v13, v15, :cond_1c

    if-ne v14, v12, :cond_1c

    const/16 v19, 0x1

    move/from16 v18, v23

    move/from16 v2, v24

    goto :goto_15

    :cond_1c
    move/from16 v2, v25

    :goto_15
    add-int v5, v12, v22

    add-int v0, v23, v22

    if-eqz v16, :cond_1e

    if-eqz v19, :cond_1e

    move/from16 v1, v24

    goto :goto_16

    :cond_1d
    move v5, v12

    move/from16 v0, v23

    move/from16 v2, v25

    :cond_1e
    add-int/lit8 v3, v9, 0x1

    move/from16 v9, p3

    move/from16 v1, v24

    move/from16 v12, v26

    move/from16 v4, v27

    goto/16 :goto_11

    :cond_1f
    move/from16 p2, v0

    move/from16 p3, v9

    move/from16 v26, v12

    :goto_16
    add-int/lit8 v3, v11, -0x1

    if-eq v15, v3, :cond_22

    .line 284
    iget-boolean v3, v10, Ll/ᩴ᩹ۢ;->ܽ:Z

    if-nez v3, :cond_22

    .line 285
    iget v0, v6, Ll/֫᩹ۢ;->ܿ:I

    add-int/lit8 v3, v0, -0x1

    if-ne v1, v3, :cond_21

    if-eqz v19, :cond_20

    add-int/lit8 v2, v2, -0x1

    :cond_20
    const/4 v3, 0x0

    .line 287
    invoke-virtual {v6, v3, v0, v7, v8}, Ll/֫᩹ۢ;->֫(IIJ)V

    goto :goto_17

    :cond_21
    add-int/lit8 v1, v1, 0x1

    :goto_17
    const/4 v0, 0x0

    :cond_22
    move/from16 v4, p3

    move v5, v1

    move/from16 v1, v18

    move/from16 v3, v19

    goto :goto_19

    :cond_23
    :goto_18
    move/from16 p2, v3

    move-object/from16 v17, v9

    move/from16 v26, v12

    add-int/lit8 v4, v4, 0x1

    move/from16 v3, p2

    :goto_19
    add-int/lit8 v15, v15, 0x1

    move/from16 v10, p7

    move-object/from16 v9, v17

    move/from16 v12, v26

    goto/16 :goto_6

    :cond_24
    const/4 v0, 0x0

    .line 295
    aput v1, p4, v0

    const/4 v1, 0x1

    .line 296
    aput v2, p4, v1

    :goto_1a
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 300
    aget v2, p4, v1

    if-ltz v2, :cond_26

    aget v2, p4, v0

    if-gez v2, :cond_25

    goto :goto_1b

    :cond_25
    return-void

    :cond_26
    :goto_1b
    aput v1, p4, v0

    aput v1, p4, v1

    return-void
.end method

.method public final ֫(IIJ)V
    .locals 2

    add-int/lit8 v0, p2, -0x1

    if-gt p1, v0, :cond_2

    if-ltz p1, :cond_2

    .line 332
    iget v1, p0, Ll/֫᩹ۢ;->ܿ:I

    if-gt p2, v1, :cond_2

    .line 337
    iget v1, p0, Ll/֫᩹ۢ;->ᩳ:I

    invoke-direct {p0, v1, p1}, Ll/֫᩹ۢ;->֫(II)V

    .line 340
    invoke-virtual {p0, p2}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result p1

    iget v1, p0, Ll/֫᩹ۢ;->ܿ:I

    sub-int/2addr v1, p2

    invoke-direct {p0, p1, v1}, Ll/֫᩹ۢ;->֫(II)V

    .line 343
    iget p1, p0, Ll/֫᩹ۢ;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iget p2, p0, Ll/֫᩹ۢ;->ܳ:I

    rem-int/2addr p1, p2

    iput p1, p0, Ll/֫᩹ۢ;->ᩳ:I

    .line 345
    iget p1, p0, Ll/֫᩹ۢ;->֫:I

    iget v1, p0, Ll/֫᩹ۢ;->ܿ:I

    sub-int/2addr p2, v1

    if-ge p1, p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֫᩹ۢ;->֫:I

    .line 348
    :cond_0
    invoke-virtual {p0, v0}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result p1

    .line 349
    iget-object p2, p0, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    aget-object v0, p2, p1

    if-nez v0, :cond_1

    .line 350
    new-instance v0, Ll/ᩴ᩹ۢ;

    iget v1, p0, Ll/֫᩹ۢ;->ۧ:I

    invoke-direct {v0, v1, p3, p4}, Ll/ᩴ᩹ۢ;-><init>(IJ)V

    aput-object v0, p2, p1

    return-void

    .line 352
    :cond_1
    invoke-virtual {v0, p3, p4}, Ll/ᩴ᩹ۢ;->֫(J)V

    return-void

    .line 333
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 94
    iget v0, p0, Ll/֫᩹ۢ;->֫:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 123
    iget v0, p0, Ll/֫᩹ۢ;->֫:I

    neg-int v0, v0

    if-lt p1, v0, :cond_1

    iget v0, p0, Ll/֫᩹ۢ;->ܿ:I

    if-gt p1, v0, :cond_1

    .line 126
    iget v0, p0, Ll/֫᩹ۢ;->ᩳ:I

    add-int/2addr v0, p1

    .line 127
    iget p1, p0, Ll/֫᩹ۢ;->ܳ:I

    if-gez v0, :cond_0

    add-int/2addr p1, v0

    return p1

    :cond_0
    rem-int/2addr v0, p1

    return v0

    .line 124
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 4

    .line 94
    iget v0, p0, Ll/֫᩹ۢ;->֫:I

    neg-int v0, v0

    .line 47
    iget v1, p0, Ll/֫᩹ۢ;->ۧ:I

    iget v2, p0, Ll/֫᩹ۢ;->ܿ:I

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v1, v2}, Ll/֫᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
