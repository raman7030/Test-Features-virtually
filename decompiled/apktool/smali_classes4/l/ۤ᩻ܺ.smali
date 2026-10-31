.class public final Ll/ۤ᩻ܺ;
.super Ll/ۗۜܺ;
.source "O69P"


# instance fields
.field public ۗ:Ll/᩶᩻ܺ;

.field public final ۛ:Ll/᩹ܺܺ;

.field public final ۤ:Z

.field public final ۨ:Ll/ۧۖܺ;

.field public ۫:Ll/ܰ᩻ܺ;

.field public final ۬:Ll/᩶ܿܺ;


# direct methods
.method public constructor <init>(Ll/᩹ܺܺ;Ll/᩶ܿܺ;ZLl/ۧۖܺ;)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, -0x1

    .line 91
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    if-eqz p2, :cond_1

    if-eqz p4, :cond_0

    .line 105
    iput-object p1, p0, Ll/ۤ᩻ܺ;->ۛ:Ll/᩹ܺܺ;

    .line 106
    iput-object p2, p0, Ll/ۤ᩻ܺ;->۬:Ll/᩶ܿܺ;

    .line 107
    iput-boolean p3, p0, Ll/ۤ᩻ܺ;->ۤ:Z

    .line 108
    iput-object p4, p0, Ll/ۤ᩻ܺ;->ۨ:Ll/ۧۖܺ;

    const/4 p1, 0x0

    .line 109
    iput-object p1, p0, Ll/ۤ᩻ܺ;->ۗ:Ll/᩶᩻ܺ;

    .line 110
    iput-object p1, p0, Ll/ۤ᩻ܺ;->۫:Ll/ܰ᩻ܺ;

    return-void

    .line 102
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "throwsList == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 98
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "code == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CodeItem{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    iget-object v1, p0, Ll/ۤ᩻ܺ;->ۛ:Ll/᩹ܺܺ;

    invoke-virtual {v1}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 118
    sget-object v0, Ll/ۘۜܺ;->۟:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 6

    .line 126
    invoke-virtual {p1}, Ll/֫ۜܺ;->֫()Ll/ۙۜܺ;

    move-result-object v0

    .line 127
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v1

    .line 129
    iget-object v2, p0, Ll/ۤ᩻ܺ;->۬:Ll/᩶ܿܺ;

    invoke-virtual {v2}, Ll/᩶ܿܺ;->᩷()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ll/᩶ܿܺ;->ۜ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 130
    :cond_0
    new-instance v3, Ll/ܰ᩻ܺ;

    iget-boolean v4, p0, Ll/ۤ᩻ܺ;->ۤ:Z

    iget-object v5, p0, Ll/ۤ᩻ܺ;->ۛ:Ll/᩹ܺܺ;

    invoke-direct {v3, v2, v4, v5}, Ll/ܰ᩻ܺ;-><init>(Ll/᩶ܿܺ;ZLl/᩹ܺܺ;)V

    iput-object v3, p0, Ll/ۤ᩻ܺ;->۫:Ll/ܰ᩻ܺ;

    .line 131
    invoke-virtual {v0, v3}, Ll/ۙۜܺ;->֫(Ll/ۗۜܺ;)V

    .line 134
    :cond_1
    invoke-virtual {v2}, Ll/᩶ܿܺ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 135
    invoke-virtual {v2}, Ll/᩶ܿܺ;->֫()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺܺ;

    .line 136
    invoke-virtual {v1, v3}, Ll/ܽ᩷ܺ;->ۧ(Ll/۟ܺܺ;)V

    goto :goto_0

    .line 138
    :cond_2
    new-instance v0, Ll/᩶᩻ܺ;

    invoke-direct {v0, v2}, Ll/᩶᩻ܺ;-><init>(Ll/᩶ܿܺ;)V

    iput-object v0, p0, Ll/ۤ᩻ܺ;->ۗ:Ll/᩶᩻ܺ;

    .line 141
    :cond_3
    invoke-virtual {v2}, Ll/᩶ܿܺ;->ܽ()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۡܺ;

    .line 142
    invoke-virtual {p1, v1}, Ll/֫ۜܺ;->ۧ(Ll/ܰۡܺ;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ۤ᩻ܺ;->ۛ:Ll/᩹ܺܺ;

    invoke-virtual {v0}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 252
    invoke-virtual/range {p2 .. p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    .line 350
    iget-object v3, v1, Ll/ۤ᩻ܺ;->۬:Ll/᩶ܿܺ;

    invoke-virtual {v3}, Ll/᩶ܿܺ;->ᩳ()Ll/ۗܿܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗܿܺ;->ܶ()I

    move-result v4

    .line 341
    invoke-virtual {v3}, Ll/᩶ܿܺ;->ᩳ()Ll/ۗܿܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۗܿܺ;->۠()I

    move-result v5

    .line 332
    iget-boolean v6, v1, Ll/ۤ᩻ܺ;->ۤ:Z

    .line 139
    iget-object v7, v1, Ll/ۤ᩻ܺ;->ۛ:Ll/᩹ܺܺ;

    invoke-virtual {v7, v6}, Ll/ܽܺܺ;->֫(Z)Ll/᩺ܺܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܰܺܺ;->֨()I

    move-result v6

    .line 256
    invoke-virtual {v3}, Ll/᩶ܿܺ;->ᩳ()Ll/ۗܿܺ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۗܿܺ;->֨()I

    move-result v8

    and-int/lit8 v9, v8, 0x1

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    .line 258
    :goto_0
    iget-object v11, v1, Ll/ۤ᩻ܺ;->ۗ:Ll/᩶᩻ܺ;

    if-nez v11, :cond_1

    const/4 v11, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Ll/᩶᩻ܺ;->֫()I

    move-result v11

    .line 259
    :goto_1
    iget-object v12, v1, Ll/ۤ᩻ܺ;->۫:Ll/ܰ᩻ܺ;

    if-nez v12, :cond_2

    const/4 v12, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v12}, Ll/ۗۜܺ;->ܿ()I

    move-result v12

    :goto_2
    const/4 v13, 0x2

    if-eqz v2, :cond_6

    .line 262
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x20

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v10, v14}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 263
    invoke-static {v4}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "  registers_size: "

    invoke-virtual {v14, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v10}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 264
    invoke-static {v6}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "  ins_size:       "

    invoke-virtual {v14, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v10}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 265
    invoke-static {v5}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "  outs_size:      "

    invoke-virtual {v14, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v10}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 266
    invoke-static {v11}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "  tries_size:     "

    invoke-virtual {v14, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v10}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 267
    invoke-static {v12}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v10

    const-string v13, "  debug_off:      "

    invoke-virtual {v13, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x4

    invoke-virtual {v0, v13, v10}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 268
    invoke-static {v8}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "  insns_size:     "

    invoke-virtual {v14, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v10}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 271
    iget-object v10, v1, Ll/ۤ᩻ܺ;->ۨ:Ll/ۧۖܺ;

    invoke-interface {v10}, Ll/ۧۖܺ;->size()I

    move-result v13

    if-eqz v13, :cond_6

    .line 273
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "  throws "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 306
    invoke-interface {v10}, Ll/ۧۖܺ;->size()I

    move-result v14

    if-nez v14, :cond_3

    const-string v10, "<empty>"

    move-object/from16 v16, v7

    goto :goto_4

    .line 312
    :cond_3
    new-instance v15, Ljava/lang/StringBuilder;

    move-object/from16 v16, v7

    const/16 v7, 0x64

    invoke-direct {v15, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v14, :cond_5

    move/from16 v17, v14

    if-eqz v7, :cond_4

    const-string v14, ", "

    .line 316
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    :cond_4
    invoke-interface {v10, v7}, Ll/ۧۖܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    move/from16 v14, v17

    goto :goto_3

    .line 321
    :cond_5
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 273
    :goto_4
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v0, v10, v7}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    goto :goto_5

    :cond_6
    move-object/from16 v16, v7

    .line 277
    :goto_5
    invoke-virtual {v0, v4}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 278
    invoke-virtual {v0, v6}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 279
    invoke-virtual {v0, v5}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 280
    invoke-virtual {v0, v11}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 281
    invoke-virtual {v0, v12}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 282
    invoke-virtual {v0, v8}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 316
    invoke-virtual {v3}, Ll/᩶ܿܺ;->ᩳ()Ll/ۗܿܺ;

    move-result-object v3

    .line 319
    :try_start_0
    invoke-virtual {v3, v0}, Ll/ۗܿܺ;->֫(Ll/ᩳᩴܺ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 286
    iget-object v3, v1, Ll/ۤ᩻ܺ;->ۗ:Ll/᩶᩻ܺ;

    if-eqz v3, :cond_9

    if-eqz v9, :cond_8

    if-eqz v2, :cond_7

    const-string v3, "  padding: 0"

    const/4 v4, 0x2

    .line 289
    invoke-virtual {v0, v4, v3}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    :cond_7
    const/4 v3, 0x0

    .line 291
    invoke-virtual {v0, v3}, Ll/ᩳᩴܺ;->ܳ(I)V

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    .line 294
    :goto_6
    iget-object v4, v1, Ll/ۤ᩻ܺ;->ۗ:Ll/᩶᩻ܺ;

    invoke-virtual {v4, v0}, Ll/᩶᩻ܺ;->֫(Ll/ᩳᩴܺ;)V

    goto :goto_7

    :cond_9
    const/4 v3, 0x0

    :goto_7
    if-eqz v2, :cond_a

    .line 302
    iget-object v2, v1, Ll/ۤ᩻ܺ;->۫:Ll/ܰ᩻ܺ;

    if-eqz v2, :cond_a

    const-string v2, "  debug info"

    .line 303
    invoke-virtual {v0, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 304
    iget-object v2, v1, Ll/ۤ᩻ܺ;->۫:Ll/ܰ᩻ܺ;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3, v0}, Ll/ܰ᩻ܺ;->ܽ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    :cond_a
    return-void

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "...while writing instructions for "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    invoke-virtual/range {v16 .. v16}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 321
    invoke-static {v0, v2}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object v0

    throw v0
.end method

.method public final ۧ(Ll/ۙۜܺ;I)V
    .locals 1

    .line 208
    invoke-virtual {p1}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object p1

    .line 215
    new-instance p2, Ll/۫᩻ܺ;

    invoke-direct {p2, p1}, Ll/۫᩻ܺ;-><init>(Ll/֫ۜܺ;)V

    iget-object v0, p0, Ll/ۤ᩻ܺ;->۬:Ll/᩶ܿܺ;

    invoke-virtual {v0, p2}, Ll/᩶ܿܺ;->֫(Ll/᩹ܿܺ;)V

    .line 226
    iget-object p2, p0, Ll/ۤ᩻ܺ;->ۗ:Ll/᩶᩻ܺ;

    if-eqz p2, :cond_0

    .line 227
    invoke-virtual {p2, p1}, Ll/᩶᩻ܺ;->֫(Ll/֫ۜܺ;)V

    .line 228
    iget-object p1, p0, Ll/ۤ᩻ܺ;->ۗ:Ll/᩶᩻ܺ;

    invoke-virtual {p1}, Ll/᩶᩻ܺ;->ۧ()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 239
    :goto_0
    invoke-virtual {v0}, Ll/᩶ܿܺ;->ᩳ()Ll/ۗܿܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۗܿܺ;->֨()I

    move-result p2

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_1

    add-int/lit8 p2, p2, 0x1

    :cond_1
    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, 0x10

    add-int/2addr p2, p1

    .line 244
    invoke-virtual {p0, p2}, Ll/ۗۜܺ;->֫(I)V

    return-void
.end method
