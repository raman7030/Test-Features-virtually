.class public final Ll/᩹ۧۧ;
.super Ljava/lang/Object;
.source "J8Q3"

# interfaces
.implements Ll/ۢۧۧ;
.implements Ll/᩷ۧۧ;


# instance fields
.field public final ۗ:Ll/ᩳ᩸ۡ;

.field public ۙ:Ll/᩶֫ۧ;

.field public final ۛ:Ljava/util/IdentityHashMap;

.field public final ۤ:[Z

.field public ۨ:Ll/ۛܽۧ;

.field public final ۫:[Ll/ۢۧۧ;

.field public ۬:[Ll/ۢۧۧ;

.field public final ᩶:Ljava/util/ArrayList;

.field public ᩸:Ll/᩷ۧۧ;

.field public final ᩹:Ljava/util/HashMap;


# direct methods
.method public varargs constructor <init>(Ll/ᩳ᩸ۡ;[J[Ll/ۢۧۧ;)V
    .locals 5

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Ll/᩹ۧۧ;->ۗ:Ll/ᩳ᩸ۡ;

    .line 57
    iput-object p3, p0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩹ۧۧ;->᩶:Ljava/util/ArrayList;

    .line 59
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩹ۧۧ;->᩹:Ljava/util/HashMap;

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance p1, Ll/᩶֫ۧ;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ll/᩶֫ۧ;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 60
    iput-object p1, p0, Ll/᩹ۧۧ;->ۙ:Ll/᩶֫ۧ;

    .line 61
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ll/᩹ۧۧ;->ۛ:Ljava/util/IdentityHashMap;

    const/4 p1, 0x0

    new-array v0, p1, [Ll/ۢۧۧ;

    .line 62
    iput-object v0, p0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    .line 63
    array-length v0, p3

    new-array v0, v0, [Z

    iput-object v0, p0, Ll/᩹ۧۧ;->ۤ:[Z

    .line 64
    :goto_0
    array-length v0, p3

    if-ge p1, v0, :cond_1

    .line 65
    aget-wide v0, p2, p1

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 66
    iget-object v2, p0, Ll/᩹ۧۧ;->ۤ:[Z

    const/4 v3, 0x1

    aput-boolean v3, v2, p1

    .line 67
    iget-object v2, p0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    new-instance v3, Ll/۫ܽۧ;

    aget-object v4, p3, p1

    invoke-direct {v3, v4, v0, v1}, Ll/۫ܽۧ;-><init>(Ll/ۢۧۧ;J)V

    aput-object v3, v2, p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(J)J
    .locals 4

    .line 255
    iget-object v0, p0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0, p1, p2}, Ll/ۢۧۧ;->֫(J)J

    move-result-wide p1

    const/4 v0, 0x1

    .line 257
    :goto_0
    iget-object v1, p0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 258
    aget-object v1, v1, v0

    invoke-interface {v1, p1, p2}, Ll/ۢۧۧ;->֫(J)J

    move-result-wide v1

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 259
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected child seekToUs result."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-wide p1
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 3

    .line 267
    iget-object v0, p0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    array-length v1, v0

    const/4 v2, 0x0

    if-lez v1, :cond_0

    aget-object v0, v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    aget-object v0, v0, v2

    .line 268
    :goto_0
    invoke-interface {v0, p1, p2, p3}, Ll/ۢۧۧ;->֫(JLl/ۢ۬֫;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 112
    array-length v3, v1

    new-array v3, v3, [I

    .line 113
    array-length v4, v1

    new-array v4, v4, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 114
    :goto_0
    array-length v7, v1

    iget-object v8, v0, Ll/᩹ۧۧ;->ۛ:Ljava/util/IdentityHashMap;

    if-ge v6, v7, :cond_3

    .line 115
    aget-object v7, v2, v6

    if-nez v7, :cond_0

    const/4 v7, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v8, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    :goto_1
    const/4 v8, -0x1

    if-nez v7, :cond_1

    const/4 v7, -0x1

    goto :goto_2

    .line 116
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_2
    aput v7, v3, v6

    .line 117
    aget-object v7, v1, v6

    if-eqz v7, :cond_2

    .line 118
    invoke-interface {v7}, Ll/ᩴܿۧ;->ܿ()Ll/۬᩵֫;

    move-result-object v7

    .line 120
    iget-object v7, v7, Ll/۬᩵֫;->ܽ:Ljava/lang/String;

    const-string v8, ":"

    .line 121
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    aput v7, v4, v6

    goto :goto_3

    .line 123
    :cond_2
    aput v8, v4, v6

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 126
    :cond_3
    invoke-virtual {v8}, Ljava/util/IdentityHashMap;->clear()V

    .line 128
    array-length v5, v1

    new-array v6, v5, [Ll/ᩴܽۧ;

    .line 129
    array-length v7, v1

    new-array v7, v7, [Ll/ᩴܽۧ;

    .line 130
    array-length v9, v1

    new-array v14, v9, [Ll/ۢܿۧ;

    .line 131
    new-instance v15, Ljava/util/ArrayList;

    iget-object v13, v0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    array-length v9, v13

    invoke-direct {v15, v9}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v9, 0x0

    move-wide/from16 v16, p5

    const/4 v12, 0x0

    .line 132
    :goto_4
    array-length v9, v13

    if-ge v12, v9, :cond_e

    const/4 v9, 0x0

    .line 133
    :goto_5
    array-length v11, v1

    if-ge v9, v11, :cond_6

    .line 134
    aget v11, v3, v9

    if-ne v11, v12, :cond_4

    aget-object v11, v2, v9

    goto :goto_6

    :cond_4
    const/4 v11, 0x0

    :goto_6
    aput-object v11, v7, v9

    .line 135
    aget v11, v4, v9

    if-ne v11, v12, :cond_5

    .line 136
    aget-object v11, v1, v9

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    invoke-interface {v11}, Ll/ᩴܿۧ;->ܿ()Ll/۬᩵֫;

    move-result-object v10

    move-object/from16 v18, v15

    .line 138
    iget-object v15, v0, Ll/᩹ۧۧ;->᩹:Ljava/util/HashMap;

    .line 139
    invoke-virtual {v15, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۬᩵֫;

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    new-instance v15, Ll/᩸ۧۧ;

    invoke-direct {v15, v11, v10}, Ll/᩸ۧۧ;-><init>(Ll/ۢܿۧ;Ll/۬᩵֫;)V

    aput-object v15, v14, v9

    const/4 v10, 0x0

    goto :goto_7

    :cond_5
    move-object/from16 v18, v15

    const/4 v10, 0x0

    .line 143
    aput-object v10, v14, v9

    :goto_7
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v15, v18

    goto :goto_5

    :cond_6
    move-object/from16 v18, v15

    .line 146
    aget-object v9, v13, v12

    move-object v10, v14

    move-object/from16 v11, p2

    move v15, v12

    move-object v12, v7

    move-object/from16 v19, v13

    move-object/from16 v13, p4

    move v2, v15

    move-object/from16 v0, v18

    move-object/from16 v18, v14

    move-wide/from16 v14, v16

    .line 147
    invoke-interface/range {v9 .. v15}, Ll/ۢۧۧ;->֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J

    move-result-wide v9

    if-nez v2, :cond_7

    move-wide/from16 v16, v9

    goto :goto_8

    :cond_7
    cmp-long v11, v9, v16

    if-nez v11, :cond_d

    :goto_8
    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 155
    :goto_9
    array-length v11, v1

    if-ge v9, v11, :cond_b

    .line 156
    aget v11, v4, v9

    const/4 v12, 0x1

    if-ne v11, v2, :cond_8

    .line 158
    aget-object v10, v7, v9

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    aget-object v11, v7, v9

    aput-object v11, v6, v9

    .line 161
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v8, v10, v11}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v10, 0x1

    goto :goto_b

    .line 162
    :cond_8
    aget v11, v3, v9

    if-ne v11, v2, :cond_a

    .line 164
    aget-object v11, v7, v9

    if-nez v11, :cond_9

    goto :goto_a

    :cond_9
    const/4 v12, 0x0

    :goto_a
    invoke-static {v12}, Ll/᩺֡֫;->ۧ(Z)V

    :cond_a
    :goto_b
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_b
    if-eqz v10, :cond_c

    .line 168
    aget-object v9, v19, v2

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/lit8 v12, v2, 0x1

    move-object/from16 v2, p3

    move-object v15, v0

    move-object/from16 v14, v18

    move-object/from16 v13, v19

    move-object/from16 v0, p0

    goto/16 :goto_4

    .line 152
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Children enabled at different positions."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object v0, v15

    const/4 v1, 0x0

    move-object/from16 v2, p3

    .line 172
    invoke-static {v6, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v1, v1, [Ll/ۢۧۧ;

    .line 174
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۢۧۧ;

    move-object v2, v0

    move-object/from16 v0, p0

    iput-object v1, v0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    .line 175
    new-instance v1, Ll/ܿ᩺᩵;

    const/4 v3, 0x5

    invoke-direct {v1, v3}, Ll/ܿ᩺᩵;-><init>(I)V

    .line 178
    invoke-static {v2, v1}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object v1

    .line 176
    iget-object v3, v0, Ll/᩹ۧۧ;->ۗ:Ll/ᩳ᩸ۡ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    new-instance v3, Ll/᩶֫ۧ;

    invoke-direct {v3, v2, v1}, Ll/᩶֫ۧ;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 176
    iput-object v3, v0, Ll/᩹ۧۧ;->ۙ:Ll/᩶֫ۧ;

    return-wide v16
.end method

.method public final ֫(I)Ll/ۢۧۧ;
    .locals 2

    .line 78
    iget-object v0, p0, Ll/᩹ۧۧ;->ۤ:[Z

    aget-boolean v0, v0, p1

    iget-object v1, p0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    if-eqz v0, :cond_0

    .line 79
    aget-object p1, v1, p1

    check-cast p1, Ll/۫ܽۧ;

    invoke-virtual {p1}, Ll/۫ܽۧ;->ᩳ()Ll/ۢۧۧ;

    move-result-object p1

    return-object p1

    .line 80
    :cond_0
    aget-object p1, v1, p1

    return-object p1
.end method

.method public final ֫(JZ)V
    .locals 4

    .line 184
    iget-object v0, p0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 185
    invoke-interface {v3, p1, p2, p3}, Ll/ۢۧۧ;->֫(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֡ܽۧ;)V
    .locals 0

    .line 38
    check-cast p1, Ll/ۢۧۧ;

    .line 311
    iget-object p1, p0, Ll/᩹ۧۧ;->᩸:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    invoke-interface {p1, p0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 13

    .line 275
    iget-object v0, p0, Ll/᩹ۧۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 276
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 280
    :cond_0
    iget-object p1, p0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v3, p1, v1

    .line 281
    invoke-interface {v3}, Ll/ۢۧۧ;->᩻()Ll/ۛܽۧ;

    move-result-object v3

    iget v3, v3, Ll/ۛܽۧ;->ۧ:I

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 283
    :cond_1
    new-array v0, v2, [Ll/۬᩵֫;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 285
    :goto_1
    array-length v3, p1

    if-ge v1, v3, :cond_5

    .line 286
    aget-object v3, p1, v1

    invoke-interface {v3}, Ll/ۢۧۧ;->᩻()Ll/ۛܽۧ;

    move-result-object v3

    .line 287
    iget v4, v3, Ll/ۛܽۧ;->ۧ:I

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_4

    .line 289
    invoke-virtual {v3, v5}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v6

    .line 290
    iget v7, v6, Ll/۬᩵֫;->ᩳ:I

    new-array v7, v7, [Ll/۠ᩴ֫;

    const/4 v8, 0x0

    .line 291
    :goto_3
    iget v9, v6, Ll/۬᩵֫;->ᩳ:I

    const-string v10, ":"

    if-ge v8, v9, :cond_3

    .line 292
    invoke-virtual {v6, v8}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v9

    .line 295
    invoke-virtual {v9}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    iget-object v9, v9, Ll/۠ᩴ֫;->ܶ:Ljava/lang/String;

    if-nez v9, :cond_2

    const-string v9, ""

    :cond_2
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    .line 297
    invoke-virtual {v11}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v9

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 299
    :cond_3
    new-instance v8, Ll/۬᩵֫;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v6, Ll/۬᩵֫;->ܽ:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v7}, Ll/۬᩵֫;-><init>(Ljava/lang/String;[Ll/۠ᩴ֫;)V

    .line 301
    iget-object v7, p0, Ll/᩹ۧۧ;->᩹:Ljava/util/HashMap;

    invoke-virtual {v7, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v2, 0x1

    .line 302
    aput-object v8, v0, v2

    add-int/lit8 v5, v5, 0x1

    move v2, v6

    goto :goto_2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 305
    :cond_5
    new-instance p1, Ll/ۛܽۧ;

    invoke-direct {p1, v0}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    iput-object p1, p0, Ll/᩹ۧۧ;->ۨ:Ll/ۛܽۧ;

    .line 306
    iget-object p1, p0, Ll/᩹ۧۧ;->᩸:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    invoke-interface {p1, p0}, Ll/᩷ۧۧ;->֫(Ll/ۢۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۧۧ;J)V
    .locals 3

    .line 85
    iput-object p1, p0, Ll/᩹ۧۧ;->᩸:Ll/᩷ۧۧ;

    .line 86
    iget-object p1, p0, Ll/᩹ۧۧ;->᩶:Ljava/util/ArrayList;

    iget-object v0, p0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    invoke-static {p1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 87
    array-length p1, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v2, v0, v1

    .line 88
    invoke-interface {v2, p0, p2, p3}, Ll/ۢۧۧ;->֫(Ll/᩷ۧۧ;J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 210
    iget-object v0, p0, Ll/᩹ۧۧ;->ۙ:Ll/᩶֫ۧ;

    invoke-virtual {v0}, Ll/᩶֫ۧ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 5

    .line 196
    iget-object v0, p0, Ll/᩹ۧۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 198
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 200
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢۧۧ;

    invoke-interface {v4, p1}, Ll/֡ܽۧ;->֫(Ll/ۨۙ֫;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v2

    .line 204
    :cond_1
    iget-object v0, p0, Ll/᩹ۧۧ;->ۙ:Ll/᩶֫ۧ;

    invoke-virtual {v0, p1}, Ll/᩶֫ۧ;->֫(Ll/ۨۙ֫;)Z

    move-result p1

    return p1
.end method

.method public final ۜ()J
    .locals 2

    .line 250
    iget-object v0, p0, Ll/᩹ۧۧ;->ۙ:Ll/᩶֫ۧ;

    invoke-virtual {v0}, Ll/᩶֫ۧ;->ۜ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 215
    iget-object v0, p0, Ll/᩹ۧۧ;->ۙ:Ll/᩶֫ۧ;

    invoke-virtual {v0}, Ll/᩶֫ۧ;->ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 1

    .line 191
    iget-object v0, p0, Ll/᩹ۧۧ;->ۙ:Ll/᩶֫ۧ;

    invoke-virtual {v0, p1, p2}, Ll/᩶֫ۧ;->ۧ(J)V

    return-void
.end method

.method public final ܽ()J
    .locals 15

    .line 221
    iget-object v0, p0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    array-length v1, v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    move-wide v5, v2

    :goto_0
    if-ge v4, v1, :cond_8

    aget-object v7, v0, v4

    .line 222
    invoke-interface {v7}, Ll/ۢۧۧ;->ܽ()J

    move-result-wide v8

    const-string v10, "Unexpected child seekToUs result."

    cmp-long v11, v8, v2

    if-eqz v11, :cond_5

    cmp-long v11, v5, v2

    if-nez v11, :cond_3

    .line 227
    iget-object v5, p0, Ll/᩹ۧۧ;->۬:[Ll/ۢۧۧ;

    array-length v6, v5

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v6, :cond_2

    aget-object v12, v5, v11

    if-ne v12, v7, :cond_0

    goto :goto_2

    .line 231
    :cond_0
    invoke-interface {v12, v8, v9}, Ll/ۢۧۧ;->֫(J)J

    move-result-wide v12

    cmp-long v14, v12, v8

    if-nez v14, :cond_1

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 232
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_2
    move-wide v5, v8

    goto :goto_3

    :cond_3
    cmp-long v7, v8, v5

    if-nez v7, :cond_4

    goto :goto_3

    .line 236
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Conflicting discontinuities."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    cmp-long v8, v5, v2

    if-eqz v8, :cond_7

    .line 240
    invoke-interface {v7, v5, v6}, Ll/ۢۧۧ;->֫(J)J

    move-result-wide v7

    cmp-long v9, v7, v5

    if-nez v9, :cond_6

    goto :goto_3

    .line 241
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_8
    return-wide v5
.end method

.method public final ܿ()V
    .locals 4

    .line 94
    iget-object v0, p0, Ll/᩹ۧۧ;->۫:[Ll/ۢۧۧ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 95
    invoke-interface {v3}, Ll/ۢۧۧ;->ܿ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩻()Ll/ۛܽۧ;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/᩹ۧۧ;->ۨ:Ll/ۛܽۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method
