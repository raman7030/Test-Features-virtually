.class public final Ll/ۖܿܽ;
.super Ll/ۜᩳܽ;
.source "44RQ"


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public ᩶:[Ll/ᩴܿܽ;


# direct methods
.method public constructor <init>(Ll/᩶ܿܽ;Ll/᩸ܽܽ;)V
    .locals 2

    .line 23
    invoke-direct {p0, p1}, Ll/ۜᩳܽ;-><init>(Ll/ۤᩳܽ;)V

    .line 24
    invoke-virtual {p2}, Ll/᩸ܽܽ;->֫()Ll/ۤܽܽ;

    move-result-object v0

    .line 258
    invoke-super {p0}, Ll/ۜᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v1

    check-cast v1, Ll/۠ܿܽ;

    .line 24
    invoke-virtual {v1}, Ll/۠ᩳܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 26
    iput-object p2, p0, Ll/ۜᩳܽ;->᩹:Ll/᩸ܽܽ;

    .line 271
    iget-object p1, p1, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 27
    new-array p1, p1, [Ll/ᩴܿܽ;

    iput-object p1, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Config layout differs from package"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getType()Ll/֡᩻ܽ;
    .locals 1

    .line 263
    invoke-super {p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    return-object v0
.end method

.method public final getType()Ll/᩶ܿܽ;
    .locals 1

    .line 263
    invoke-super {p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    return-object v0
.end method

.method public final ֨()I
    .locals 1

    .line 207
    iget-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 253
    invoke-super {p0}, Ll/ۜᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۡܿܽ;

    return-object v0
.end method

.method public final ֫(I)Ll/ᩴܿܽ;
    .locals 4

    .line 37
    iget-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    array-length v1, v0

    if-ge p1, v1, :cond_1

    .line 38
    aget-object v1, v0, p1

    if-eqz v1, :cond_0

    return-object v1

    .line 40
    :cond_0
    new-instance v1, Ll/ᩴܿܽ;

    invoke-direct {v1, p0, p1}, Ll/ᩴܿܽ;-><init>(Ll/ۖܿܽ;I)V

    aput-object v1, v0, p1

    return-object v1

    .line 263
    :cond_1
    invoke-super {p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    .line 42
    invoke-virtual {v0, p1}, Ll/᩶ܿܽ;->֫(I)V

    .line 263
    invoke-super {p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    .line 271
    iget-object v0, v0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 43
    new-array v0, v0, [Ll/ᩴܿܽ;

    .line 44
    iget-object v1, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    iput-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    .line 46
    new-instance v1, Ll/ᩴܿܽ;

    invoke-direct {v1, p0, p1}, Ll/ᩴܿܽ;-><init>(Ll/ۖܿܽ;I)V

    aput-object v1, v0, p1

    return-object v1
.end method

.method public final ֫(Ll/ۙۜܽ;Ll/۫ܿܽ;Ll/᩵ۛۡ;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 64
    invoke-virtual/range {p0 .. p0}, Ll/ۜᩳܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ll/᩸ܽܽ;->ᩳ()I

    move-result v5

    add-int/lit8 v5, v5, 0x18

    int-to-short v5, v5

    const/16 v6, 0x201

    .line 68
    invoke-interface {v1, v6}, Ll/ۙۜܽ;->֫(S)V

    .line 69
    invoke-interface {v1, v5}, Ll/ۙۜܽ;->֫(S)V

    .line 70
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v6

    .line 71
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->᩷ܽ()V

    .line 263
    invoke-super/range {p0 .. p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v8

    check-cast v8, Ll/᩶ܿܽ;

    .line 72
    invoke-virtual {v8}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v8

    invoke-interface {v1, v8}, Ll/ۙۜܽ;->writeByte(I)V

    .line 217
    iget-boolean v8, v0, Ll/ۖܿܽ;->ۗ:Z

    .line 226
    iget-boolean v9, v0, Ll/ۖܿܽ;->ۙ:Z

    if-eqz v9, :cond_0

    or-int/lit8 v8, v8, 0x2

    .line 80
    :cond_0
    invoke-interface {v1, v8}, Ll/ۙۜܽ;->writeByte(I)V

    const/4 v8, 0x0

    .line 81
    invoke-interface {v1, v8}, Ll/ۙۜܽ;->writeByte(I)V

    .line 82
    invoke-interface {v1, v8}, Ll/ۙۜܽ;->writeByte(I)V

    .line 217
    iget-boolean v9, v0, Ll/ۖܿܽ;->ۗ:Z

    const/4 v10, 0x1

    if-eqz v9, :cond_5

    .line 84
    iget-object v9, v0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    invoke-static {v9}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v9

    new-instance v11, Ll/ܺܿܽ;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Ll/ܺܿܽ;-><init>(I)V

    invoke-interface {v9, v11}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v9

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v11

    invoke-interface {v9, v11}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    .line 85
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    .line 86
    invoke-interface {v1, v11}, Ll/ۙۜܽ;->writeInt(I)V

    mul-int/lit8 v12, v11, 0x4

    add-int/2addr v5, v12

    .line 87
    invoke-interface {v1, v5}, Ll/ۙۜܽ;->writeInt(I)V

    .line 88
    invoke-virtual {v4, v1}, Ll/᩸ܽܽ;->֫(Ll/ۙۜܽ;)V

    .line 92
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v4

    .line 93
    invoke-interface {v1, v12}, Ll/ۙۜܽ;->skipBytes(I)V

    .line 95
    new-array v12, v11, [I

    .line 96
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v13

    :goto_0
    if-ge v8, v11, :cond_4

    if-eqz v3, :cond_1

    .line 41
    invoke-virtual {v3, v10}, Ll/᩵ۛۡ;->֫(I)Z

    .line 102
    :cond_1
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    const-wide/16 v15, 0x4

    check-cast v10, Ll/ᩴܿܽ;

    .line 103
    invoke-virtual {v10}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v17

    .line 104
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v18

    sub-long v18, v18, v13

    .line 105
    rem-long v20, v18, v15

    const-wide/16 v22, 0x0

    cmp-long v24, v20, v22

    if-nez v24, :cond_3

    move-wide/from16 v20, v13

    .line 108
    div-long v13, v18, v15

    cmp-long v15, v13, v22

    if-ltz v15, :cond_2

    const-wide/32 v15, 0xffff

    cmp-long v18, v13, v15

    if-gtz v18, :cond_2

    long-to-int v14, v13

    shl-int/lit8 v13, v14, 0x10

    or-int v13, v17, v13

    .line 113
    aput v13, v12, v8

    .line 114
    invoke-virtual {v10, v1, v2}, Ll/ᩴܿܽ;->֫(Ll/ۙۜܽ;Ll/۫ܿܽ;)V

    add-int/lit8 v8, v8, 0x1

    const/4 v10, 0x1

    move-wide/from16 v13, v20

    goto :goto_0

    .line 111
    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Sparse offset out of range"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 106
    :cond_3
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_4
    const-wide/16 v2, 0x4

    .line 117
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v8

    .line 118
    invoke-interface {v1, v6, v7}, Ll/ۙۜܽ;->seek(J)V

    sub-long v6, v8, v6

    add-long/2addr v6, v2

    long-to-int v2, v6

    .line 119
    invoke-interface {v1, v2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 120
    invoke-interface {v1, v4, v5}, Ll/ۙۜܽ;->seek(J)V

    .line 121
    invoke-interface {v1, v12}, Ll/ۙۜܽ;->֫([I)V

    .line 122
    invoke-interface {v1, v8, v9}, Ll/ۙۜܽ;->seek(J)V

    return-void

    .line 226
    :cond_5
    iget-boolean v10, v0, Ll/ۖܿܽ;->ۙ:Z

    const/4 v11, -0x1

    if-eqz v10, :cond_d

    .line 263
    invoke-super/range {p0 .. p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v10

    check-cast v10, Ll/᩶ܿܽ;

    .line 271
    iget-object v10, v10, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    .line 125
    invoke-interface {v1, v10}, Ll/ۙۜܽ;->writeInt(I)V

    mul-int/lit8 v12, v10, 0x2

    .line 129
    rem-int/lit8 v13, v12, 0x4

    if-eqz v13, :cond_6

    add-int/lit8 v12, v12, 0x2

    :cond_6
    add-int/2addr v5, v12

    .line 132
    invoke-interface {v1, v5}, Ll/ۙۜܽ;->writeInt(I)V

    .line 134
    invoke-virtual {v4, v1}, Ll/᩸ܽܽ;->֫(Ll/ۙۜܽ;)V

    .line 138
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v4

    .line 139
    invoke-interface {v1, v12}, Ll/ۙۜܽ;->skipBytes(I)V

    .line 141
    new-array v12, v10, [I

    .line 142
    invoke-static {v12, v11}, Ljava/util/Arrays;->fill([II)V

    .line 143
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v13

    .line 248
    invoke-virtual/range {p0 .. p0}, Ll/ۜᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v11

    .line 145
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ᩴܿܽ;

    if-eqz v3, :cond_7

    const/4 v8, 0x1

    .line 41
    invoke-virtual {v3, v8}, Ll/᩵ۛۡ;->֫(I)Z

    .line 149
    :cond_7
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v8

    sub-long/2addr v8, v13

    long-to-int v9, v8

    .line 150
    rem-int/lit8 v8, v9, 0x4

    if-nez v8, :cond_9

    .line 153
    div-int/lit8 v9, v9, 0x4

    const v8, 0xffff

    if-eq v9, v8, :cond_8

    .line 157
    invoke-virtual {v15}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v8

    aput v9, v12, v8

    .line 158
    invoke-virtual {v15, v1, v2}, Ll/ᩴܿܽ;->֫(Ll/ۙۜܽ;Ll/۫ܿܽ;)V

    goto :goto_1

    .line 155
    :cond_8
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Offset 16 out of range"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 151
    :cond_9
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 161
    :cond_a
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v2

    .line 162
    invoke-interface {v1, v6, v7}, Ll/ۙۜܽ;->seek(J)V

    sub-long v6, v2, v6

    const-wide/16 v8, 0x4

    add-long/2addr v6, v8

    long-to-int v7, v6

    .line 163
    invoke-interface {v1, v7}, Ll/ۙۜܽ;->writeInt(I)V

    .line 164
    invoke-interface {v1, v4, v5}, Ll/ۙۜܽ;->seek(J)V

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v10, :cond_c

    .line 166
    aget v5, v12, v4

    const/4 v6, -0x1

    if-ne v5, v6, :cond_b

    const v5, 0xffff

    .line 170
    :cond_b
    invoke-interface {v1, v5}, Ll/ۙۜܽ;->ۡ(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 172
    :cond_c
    invoke-interface {v1, v2, v3}, Ll/ۙۜܽ;->seek(J)V

    return-void

    .line 263
    :cond_d
    invoke-super/range {p0 .. p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v8

    check-cast v8, Ll/᩶ܿܽ;

    .line 271
    iget-object v8, v8, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 175
    invoke-interface {v1, v8}, Ll/ۙۜܽ;->writeInt(I)V

    mul-int/lit8 v9, v8, 0x4

    add-int/2addr v5, v9

    .line 176
    invoke-interface {v1, v5}, Ll/ۙۜܽ;->writeInt(I)V

    .line 177
    invoke-virtual {v4, v1}, Ll/᩸ܽܽ;->֫(Ll/ۙۜܽ;)V

    .line 181
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v4

    .line 182
    invoke-interface {v1, v9}, Ll/ۙۜܽ;->skipBytes(I)V

    .line 184
    new-array v8, v8, [I

    const/4 v9, -0x1

    .line 185
    invoke-static {v8, v9}, Ljava/util/Arrays;->fill([II)V

    .line 186
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v9

    .line 248
    invoke-virtual/range {p0 .. p0}, Ll/ۜᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v11

    .line 188
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩴܿܽ;

    const/4 v13, 0x1

    if-eqz v3, :cond_e

    .line 41
    invoke-virtual {v3, v13}, Ll/᩵ۛۡ;->֫(I)Z

    .line 192
    :cond_e
    invoke-virtual {v12}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v13

    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v14

    sub-long/2addr v14, v9

    long-to-int v15, v14

    aput v15, v8, v13

    .line 193
    invoke-virtual {v12, v1, v2}, Ll/ᩴܿܽ;->֫(Ll/ۙۜܽ;Ll/۫ܿܽ;)V

    goto :goto_3

    .line 196
    :cond_f
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v2

    .line 197
    invoke-interface {v1, v6, v7}, Ll/ۙۜܽ;->seek(J)V

    sub-long v6, v2, v6

    const-wide/16 v9, 0x4

    add-long/2addr v6, v9

    long-to-int v7, v6

    .line 198
    invoke-interface {v1, v7}, Ll/ۙۜܽ;->writeInt(I)V

    .line 199
    invoke-interface {v1, v4, v5}, Ll/ۙۜܽ;->seek(J)V

    .line 200
    invoke-interface {v1, v8}, Ll/ۙۜܽ;->֫([I)V

    .line 201
    invoke-interface {v1, v2, v3}, Ll/ۙۜܽ;->seek(J)V

    return-void
.end method

.method public final ֫(Ll/᩸ܽܽ;)V
    .locals 2

    .line 31
    invoke-virtual {p1}, Ll/᩸ܽܽ;->֫()Ll/ۤܽܽ;

    move-result-object v0

    .line 258
    invoke-super {p0}, Ll/ۜᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v1

    check-cast v1, Ll/۠ܿܽ;

    .line 31
    invoke-virtual {v1}, Ll/۠ᩳܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 33
    iput-object p1, p0, Ll/ۜᩳܽ;->᩹:Ll/᩸ܽܽ;

    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Config layout differs from package"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 0

    .line 230
    iput-boolean p1, p0, Ll/ۖܿܽ;->ۙ:Z

    return-void
.end method

.method public final ۚ֫()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Ll/ۖܿܽ;->ۗ:Z

    return v0
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 258
    invoke-super {p0}, Ll/ۜᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    return-object v0
.end method

.method public final ۧ(I)Ll/ᩴܿܽ;
    .locals 2

    if-ltz p1, :cond_1

    .line 241
    iget-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 243
    :cond_0
    aget-object p1, v0, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge synthetic ۧ(I)Ll/᩷᩻ܽ;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Ll/ۖܿܽ;->ۧ(I)Ll/ᩴܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 221
    iput-boolean p1, p0, Ll/ۖܿܽ;->ۗ:Z

    return-void
.end method

.method public final ܳ()I
    .locals 5

    .line 55
    iget-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public final ܺ(I)Z
    .locals 2

    .line 212
    iget-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I)Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(I)V
    .locals 2

    .line 50
    iget-object v0, p0, Ll/ۖܿܽ;->᩶:[Ll/ᩴܿܽ;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    return-void
.end method

.method public final ᩷ۧ()Z
    .locals 1

    .line 226
    iget-boolean v0, p0, Ll/ۖܿܽ;->ۙ:Z

    return v0
.end method
