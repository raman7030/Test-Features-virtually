.class public final Ll/ᩴ᩹ۢ;
.super Ljava/lang/Object;
.source "H1TP"


# instance fields
.field public final ֫:I

.field public ۧ:Z

.field public ܳ:[C

.field public ܽ:Z

.field public final ܿ:[J

.field public ᩳ:S


# direct methods
.method public constructor <init>(IJ)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Ll/ᩴ᩹ۢ;->֫:I

    const/high16 v0, 0x3fc00000    # 1.5f

    int-to-float v1, p1

    mul-float v1, v1, v0

    float-to-int v0, v1

    .line 44
    new-array v0, v0, [C

    iput-object v0, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    .line 45
    new-array p1, p1, [J

    iput-object p1, p0, Ll/ᩴ᩹ۢ;->ܿ:[J

    .line 46
    invoke-virtual {p0, p2, p3}, Ll/ᩴ᩹ۢ;->֫(J)V

    return-void
.end method

.method private ܽ(I)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 123
    :cond_0
    iget-short v3, p0, Ll/ᩴ᩹ۢ;->ᩳ:S

    if-ge v1, v3, :cond_3

    .line 124
    iget-object v3, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    add-int/lit8 v4, v1, 0x1

    aget-char v3, v3, v1

    .line 125
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    add-int/lit8 v1, v1, 0x2

    aget-char v4, v5, v4

    invoke-static {v3, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v3

    goto :goto_0

    :cond_1
    move v1, v4

    .line 126
    :goto_0
    invoke-static {v3}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v3

    if-lez v3, :cond_0

    if-ne v2, p1, :cond_2

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/2addr v2, v3

    if-le v2, p1, :cond_0

    :cond_3
    return v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 78
    iget-short v0, p0, Ll/ᩴ᩹ۢ;->ᩳ:S

    return v0
.end method

.method public final ֫(I)I
    .locals 6

    .line 85
    iget v0, p0, Ll/ᩴ᩹ۢ;->֫:I

    if-ne p1, v0, :cond_0

    .line 78
    iget-short p1, p0, Ll/ᩴ᩹ۢ;->ᩳ:S

    return p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 91
    :goto_0
    iget-object v2, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    add-int/lit8 v3, v0, 0x1

    aget-char v2, v2, v0

    .line 92
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 93
    iget-object v4, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    add-int/lit8 v5, v0, 0x2

    aget-char v3, v4, v3

    invoke-static {v2, v3}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v2

    move v3, v5

    .line 94
    :cond_1
    invoke-static {v2}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v2

    if-lez v2, :cond_5

    add-int/2addr v1, v2

    if-ne v1, p1, :cond_4

    .line 98
    :goto_1
    iget-short p1, p0, Ll/ᩴ᩹ۢ;->ᩳ:S

    if-ge v3, p1, :cond_3

    .line 100
    iget-object p1, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    aget-char p1, p1, v3

    invoke-static {p1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 101
    iget-object p1, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    aget-char v0, p1, v3

    add-int/lit8 v1, v3, 0x1

    aget-char p1, p1, v1

    invoke-static {v0, p1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result p1

    invoke-static {p1}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result p1

    if-gtz p1, :cond_3

    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    .line 106
    :cond_2
    iget-object p1, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    aget-char p1, p1, v3

    invoke-static {p1}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result p1

    if-gtz p1, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return v3

    :cond_4
    if-le v1, p1, :cond_5

    return v0

    :cond_5
    move v0, v3

    goto :goto_0
.end method

.method public final ֫(IIJ)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-wide/from16 v2, p3

    .line 145
    iget-object v4, v0, Ll/ᩴ᩹ۢ;->ܿ:[J

    aput-wide v2, v4, p1

    .line 147
    invoke-static/range {p2 .. p2}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v4

    .line 150
    iget-boolean v5, v0, Ll/ᩴ᩹ۢ;->ۧ:Z

    const/4 v6, 0x1

    if-nez v5, :cond_2

    const/high16 v5, 0x10000

    if-ge v1, v5, :cond_1

    if-eq v4, v6, :cond_0

    goto :goto_0

    .line 154
    :cond_0
    iget-object v2, v0, Ll/ᩴ᩹ۢ;->ܳ:[C

    int-to-char v1, v1

    aput-char v1, v2, p1

    return-void

    .line 152
    :cond_1
    :goto_0
    iput-boolean v6, v0, Ll/ᩴ᩹ۢ;->ۧ:Z

    :cond_2
    if-gtz v4, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    if-lez p1, :cond_4

    add-int/lit8 v6, p1, -0x1

    .line 161
    invoke-direct {v0, v6}, Ll/ᩴ᩹ۢ;->ܽ(I)Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    const/16 v7, 0x20

    const/4 v8, 0x2

    if-eqz v5, :cond_5

    if-eqz v6, :cond_7

    add-int/lit8 v2, p1, -0x1

    goto :goto_3

    :cond_5
    if-eqz v6, :cond_6

    add-int/lit8 v6, p1, -0x1

    .line 168
    invoke-virtual {v0, v6, v7, v2, v3}, Ll/ᩴ᩹ۢ;->֫(IIJ)V

    :cond_6
    if-ne v4, v8, :cond_7

    add-int/lit8 v6, p1, 0x1

    .line 170
    invoke-direct {v0, v6}, Ll/ᩴ᩹ۢ;->ܽ(I)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 171
    invoke-virtual {v0, v6, v7, v2, v3}, Ll/ᩴ᩹ۢ;->֫(IIJ)V

    :cond_7
    move/from16 v2, p1

    .line 174
    :goto_3
    iget-object v3, v0, Ll/ᩴ᩹ۢ;->ܳ:[C

    .line 175
    invoke-virtual {v0, v2}, Ll/ᩴ᩹ۢ;->֫(I)I

    move-result v6

    .line 466
    aget-char v7, v3, v6

    .line 467
    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_8

    add-int/lit8 v8, v6, 0x1

    aget-char v8, v3, v8

    invoke-static {v7, v8}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v7

    :cond_8
    invoke-static {v7}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v7

    add-int v8, v2, v7

    .line 180
    iget v9, v0, Ll/ᩴ᩹ۢ;->֫:I

    if-ge v8, v9, :cond_9

    .line 181
    invoke-virtual {v0, v8}, Ll/ᩴ᩹ۢ;->֫(I)I

    move-result v8

    goto :goto_4

    .line 184
    :cond_9
    iget-short v8, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    :goto_4
    sub-int/2addr v8, v6

    .line 188
    invoke-static/range {p2 .. p2}, Ljava/lang/Character;->charCount(I)I

    move-result v10

    if-eqz v5, :cond_a

    add-int/2addr v10, v8

    :cond_a
    add-int v11, v6, v8

    add-int v13, v6, v10

    sub-int/2addr v10, v8

    if-lez v10, :cond_c

    .line 203
    iget-short v14, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    sub-int v15, v14, v11

    add-int/2addr v14, v10

    .line 204
    array-length v12, v3

    if-le v14, v12, :cond_b

    .line 206
    array-length v12, v3

    add-int/2addr v12, v9

    new-array v12, v12, [C

    const/4 v14, 0x0

    .line 207
    invoke-static {v3, v14, v12, v14, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 208
    invoke-static {v3, v11, v12, v13, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 209
    iput-object v12, v0, Ll/ᩴ᩹ۢ;->ܳ:[C

    move-object v3, v12

    goto :goto_5

    .line 211
    :cond_b
    invoke-static {v3, v11, v3, v13, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5

    :cond_c
    if-gez v10, :cond_d

    .line 215
    iget-short v12, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    sub-int/2addr v12, v11

    invoke-static {v3, v11, v3, v13, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 217
    :cond_d
    :goto_5
    iget-short v11, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    add-int/2addr v11, v10

    int-to-short v10, v11

    iput-short v10, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    if-eqz v5, :cond_e

    goto :goto_6

    :cond_e
    const/4 v8, 0x0

    :goto_6
    add-int/2addr v6, v8

    .line 221
    invoke-static {v1, v3, v6}, Ljava/lang/Character;->toChars(I[CI)I

    const/4 v1, 0x2

    if-ne v7, v1, :cond_10

    const/4 v1, 0x1

    if-ne v4, v1, :cond_10

    .line 225
    iget-short v1, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    add-int/lit8 v2, v1, 0x1

    array-length v4, v3

    if-le v2, v4, :cond_f

    .line 226
    array-length v1, v3

    add-int/2addr v1, v9

    new-array v1, v1, [C

    const/4 v2, 0x0

    .line 227
    invoke-static {v3, v2, v1, v2, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v13, 0x1

    .line 228
    iget-short v4, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    sub-int/2addr v4, v13

    invoke-static {v3, v13, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 229
    iput-object v1, v0, Ll/ᩴ᩹ۢ;->ܳ:[C

    move-object v3, v1

    goto :goto_7

    :cond_f
    add-int/lit8 v2, v13, 0x1

    sub-int/2addr v1, v13

    .line 231
    invoke-static {v3, v13, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_7
    const/16 v1, 0x20

    .line 233
    aput-char v1, v3, v13

    .line 235
    iget-short v1, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    add-int/lit8 v1, v1, 0x1

    int-to-short v1, v1

    iput-short v1, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    return-void

    :cond_10
    const/4 v1, 0x1

    if-ne v7, v1, :cond_14

    const/4 v1, 0x2

    if-ne v4, v1, :cond_14

    add-int/lit8 v4, v9, -0x1

    if-eq v2, v4, :cond_13

    sub-int/2addr v9, v1

    if-ne v2, v9, :cond_11

    int-to-short v1, v13

    .line 242
    iput-short v1, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    return-void

    .line 246
    :cond_11
    iget-object v1, v0, Ll/ᩴ᩹ۢ;->ܳ:[C

    aget-char v1, v1, v13

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, 0x2

    goto :goto_8

    :cond_12
    const/4 v1, 0x1

    :goto_8
    add-int/2addr v1, v13

    sub-int v2, v1, v13

    .line 250
    iget-short v4, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    sub-int/2addr v4, v1

    invoke-static {v3, v1, v3, v13, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 251
    iget-short v1, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    sub-int/2addr v1, v2

    int-to-short v1, v1

    iput-short v1, v0, Ll/ᩴ᩹ۢ;->ᩳ:S

    return-void

    .line 238
    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :cond_14
    return-void
.end method

.method public final ֫(J)V
    .locals 2

    .line 137
    iget-object v0, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    const/16 v1, 0x20

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([CC)V

    .line 138
    iget-object v0, p0, Ll/ᩴ᩹ۢ;->ܿ:[J

    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->fill([JJ)V

    .line 139
    iget p1, p0, Ll/ᩴ᩹ۢ;->֫:I

    int-to-short p1, p1

    iput-short p1, p0, Ll/ᩴ᩹ۢ;->ᩳ:S

    const/4 p1, 0x0

    .line 140
    iput-boolean p1, p0, Ll/ᩴ᩹ۢ;->ۧ:Z

    return-void
.end method

.method public final ֫(Ll/ᩴ᩹ۢ;III)V
    .locals 8

    .line 53
    iget-boolean v0, p0, Ll/ᩴ᩹ۢ;->ۧ:Z

    iget-boolean v1, p1, Ll/ᩴ᩹ۢ;->ۧ:Z

    or-int/2addr v0, v1

    iput-boolean v0, p0, Ll/ᩴ᩹ۢ;->ۧ:Z

    .line 54
    invoke-virtual {p1, p2}, Ll/ᩴ᩹ۢ;->֫(I)I

    move-result v0

    .line 55
    invoke-virtual {p1, p3}, Ll/ᩴ᩹ۢ;->֫(I)I

    move-result p3

    if-lez p2, :cond_0

    add-int/lit8 v1, p2, -0x1

    .line 56
    invoke-direct {p1, v1}, Ll/ᩴ᩹ۢ;->ܽ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 57
    :goto_0
    iget-object v2, p1, Ll/ᩴ᩹ۢ;->ܳ:[C

    if-ne p0, p1, :cond_1

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v2

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-ge v0, p3, :cond_5

    .line 60
    aget-char v4, v2, v0

    .line 61
    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_2

    add-int/lit8 v0, v0, 0x1

    aget-char v5, v2, v0

    invoke-static {v4, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v4

    :cond_2
    if-eqz v1, :cond_3

    const/16 v4, 0x20

    const/4 v1, 0x0

    .line 67
    :cond_3
    invoke-static {v4}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v5

    if-lez v5, :cond_4

    add-int/2addr p4, v3

    add-int/2addr p2, v3

    move v3, v5

    .line 263
    :cond_4
    iget-object v5, p1, Ll/ᩴ᩹ۢ;->ܿ:[J

    aget-wide v6, v5, p2

    .line 73
    invoke-virtual {p0, p4, v4, v6, v7}, Ll/ᩴ᩹ۢ;->֫(IIJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public final ۧ(I)J
    .locals 3

    .line 263
    iget-object v0, p0, Ll/ᩴ᩹ۢ;->ܿ:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ۧ()Z
    .locals 5

    .line 78
    iget-short v0, p0, Ll/ᩴ᩹ۢ;->ᩳ:S

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 258
    iget-object v3, p0, Ll/ᩴ᩹ۢ;->ܳ:[C

    aget-char v3, v3, v2

    const/16 v4, 0x20

    if-eq v3, v4, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method
