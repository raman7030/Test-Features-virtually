.class public abstract Ll/ᩳۧ۠;
.super Ll/֨ۧ۠;
.source "A451"


# instance fields
.field public final synthetic ܳ:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    .locals 6

    .line 3445
    sget-object v5, Ll/ܽܽ۠;->۬:Ll/ܽܽ۠;

    .line 3448
    iput-object p1, p0, Ll/ᩳۧ۠;->ܳ:Ll/᩹ܽ۠;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    .line 3449
    invoke-direct/range {v0 .. v5}, Ll/֨ۧ۠;-><init>(Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ܽܽ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֫ۤ֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 10

    .line 3466
    iget-object p1, p4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {p1}, Ll/֨ᩴ֨;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3468
    iget-object v4, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    iget-object v8, p0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    .line 2567
    iget-object v0, p0, Ll/ᩳۧ۠;->ܳ:Ll/᩹ܽ۠;

    iget-object v9, v0, Ll/᩹ܽ۠;->᩸:Ll/۬֫۠;

    iget-object v5, p0, Ll/֨ۧ۠;->ܽ:Ll/ۤܶ۠;

    const/4 v6, 0x1

    iget-object v7, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    move-object v1, p4

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v9}, Ll/᩹ܽ۠;->֫(Ll/ۛ֡֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;ZLl/ۖܶ۠;Ll/ۖܶ۠;Ll/֡ۧ۠;)Ll/ۛ֡֨;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p4
.end method

.method public final ֫(Ll/֫ۤ֨;Ll/ܽܽ۠;)Ll/ۛ֡֨;
    .locals 3

    .line 3454
    invoke-virtual {p0, p1, p2}, Ll/ᩳۧ۠;->ۧ(Ll/֫ۤ֨;Ll/ܽܽ۠;)Ll/ۛ֡֨;

    move-result-object p1

    .line 3455
    iget-object p2, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->ۛ:Ll/֨ᩴ֨;

    if-ne p2, v0, :cond_0

    .line 3456
    invoke-virtual {p1}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object p1

    check-cast p1, Ll/ۨ֫۠;

    .line 3457
    iget-object p2, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    .line 4604
    iget-object v0, p1, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 4605
    iget-object v1, p1, Ll/ۨ֫۠;->ܰ:Ll/᩹ܽ۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, p2, v2}, Ll/ۛ᩸֨;->֫(Ll/ۖܶ۠;Ll/ۙ֨֨;Z)Ll/ܽ۫ᩴ;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֡֨;

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۛ֡֨;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 3475
    iget-object v2, v0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    .line 217
    iget-object v3, v0, Ll/ᩳۧ۠;->ܳ:Ll/᩹ܽ۠;

    iget-object v4, v3, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    iget-object v5, v3, Ll/᩹ܽ۠;->ᩳ֫:Ll/᩷ۚ֨;

    iget-object v6, v3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object v7, v3, Ll/᩹ܽ۠;->ۜ֫:Ljava/util/EnumSet;

    iget-object v8, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v8}, Ll/֨ᩴ֨;->ۧ()Z

    move-result v8

    if-nez v8, :cond_0

    .line 219
    sget-object v9, Ll/᩸ܽ۠;->ۨ:Ll/᩸ܽ۠;

    invoke-virtual {v7, v9}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v8, :cond_1

    .line 221
    sget-object v9, Ll/᩸ܽ۠;->ۗ:Ll/᩸ܽ۠;

    invoke-virtual {v7, v9}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    goto :goto_0

    .line 225
    :cond_1
    iget-object v9, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v10, v3, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v10, v10, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v9, v10, :cond_2

    iget-object v9, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v10, v5, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    iget-object v10, v10, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v9, v10, :cond_2

    sget-object v9, Ll/᩸ܽ۠;->ۤ:Ll/᩸ܽ۠;

    .line 227
    invoke-virtual {v7, v9}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_0

    .line 229
    :cond_2
    iget-object v5, v5, Ll/᩷ۚ֨;->ۗ֫:Ll/ܳ֡֨;

    iget-object v5, v5, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-ne v2, v5, :cond_3

    sget-object v5, Ll/᩸ܽ۠;->ۛ:Ll/᩸ܽ۠;

    .line 230
    invoke-virtual {v7, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    .line 232
    :cond_3
    iget-object v5, v3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    invoke-static {v5}, Ll/۫ۧ۠;->ۧ(Ll/۫ۧ۠;)Z

    move-result v5

    if-eqz v5, :cond_4

    sget-object v5, Ll/᩸ܽ۠;->۫:Ll/᩸ܽ۠;

    .line 233
    invoke-virtual {v7, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :goto_0
    return-void

    .line 239
    :cond_4
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 240
    iget-object v9, v3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    invoke-static {v9}, Ll/۫ۧ۠;->֫(Ll/۫ۧ۠;)Ll/ۖܶ۠;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, -0x1

    const/4 v11, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۬ۧ۠;

    .line 241
    iget-object v15, v3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    iget-object v15, v15, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    iget-object v14, v12, Ll/۬ۧ۠;->ܽ:Ll/ܽܽ۠;

    iget-object v13, v12, Ll/۬ۧ۠;->ᩳ:Ll/ۛ֡֨;

    if-ne v15, v14, :cond_b

    .line 242
    invoke-virtual {v12}, Ll/۬ۧ۠;->֫()Z

    move-result v14

    if-eqz v14, :cond_5

    sget-object v14, Ll/᩸ܽ۠;->᩶:Ll/᩸ܽ۠;

    invoke-virtual {v7, v14}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    .line 243
    :cond_5
    invoke-virtual {v12}, Ll/۬ۧ۠;->֫()Z

    move-result v14

    if-nez v14, :cond_6

    sget-object v14, Ll/᩸ܽ۠;->۬:Ll/᩸ܽ۠;

    invoke-virtual {v7, v14}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    goto/16 :goto_5

    .line 246
    :cond_6
    invoke-virtual {v12}, Ll/۬ۧ۠;->֫()Z

    move-result v14

    const-string v15, "compiler"

    if-eqz v14, :cond_9

    .line 247
    iget-object v12, v12, Ll/۬ۧ۠;->ۧ:Ll/ۙ֨֨;

    .line 266
    iget-object v14, v13, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    move-object/from16 v18, v7

    sget-object v7, Ll/ۢ۠֨;->ۧ֫:Ll/ۢ۠֨;

    invoke-virtual {v14, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 267
    sget-object v7, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7984
    new-instance v7, Ll/ۨ۠۠;

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v12, v14, v17

    const-string v12, "partial.inst.sig"

    invoke-direct {v7, v15, v12, v14}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    invoke-virtual {v6, v7}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v7

    goto :goto_2

    :cond_7
    const/4 v7, 0x0

    :goto_2
    if-nez v7, :cond_8

    const-string v12, "applicable.method.found"

    goto :goto_3

    :cond_8
    const-string v12, "applicable.method.found.1"

    .line 274
    :goto_3
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x3

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v14, v15, v17

    const/4 v14, 0x1

    aput-object v13, v15, v14

    const/4 v14, 0x2

    aput-object v7, v15, v14

    invoke-virtual {v6, v12, v15}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v7

    goto :goto_4

    :cond_9
    move-object/from16 v18, v7

    const/4 v7, 0x3

    .line 248
    iget-object v12, v12, Ll/۬ۧ۠;->֫:Ll/ܽܶ۠;

    .line 278
    sget-object v19, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7834
    new-instance v14, Ll/ۨ۠۠;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    new-array v7, v7, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v19, v7, v17

    const/16 v17, 0x1

    aput-object v13, v7, v17

    const/16 v16, 0x2

    aput-object v12, v7, v16

    const-string v12, "not.applicable.method.found"

    invoke-direct {v14, v15, v12, v7}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    invoke-virtual {v6, v14}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v7

    .line 246
    :goto_4
    invoke-virtual {v5, v7}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    if-ne v13, v1, :cond_a

    move v10, v11

    :cond_a
    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_b
    :goto_5
    move-object/from16 v18, v7

    :goto_6
    move-object/from16 v7, v18

    goto/16 :goto_1

    :cond_c
    const/4 v7, 0x2

    if-nez v8, :cond_d

    const-string v8, "verbose.resolve.multi"

    goto :goto_7

    :cond_d
    const-string v8, "verbose.resolve.multi.1"

    .line 255
    :goto_7
    new-instance v9, Ll/ۗ۫֨;

    iget-object v11, v3, Ll/᩹ܽ۠;->ᩴ:Ll/۫۫֨;

    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v12, Ll/ܰ۬֨;->᩶:Ll/ܰ۬֨;

    iget-object v13, v3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    iget-object v13, v13, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    invoke-direct {v9, v11, v12, v1, v13}, Ll/ۗ۫֨;-><init>(Ll/۫۫֨;Ll/ܰ۬֨;Ll/ۛ֡֨;Ll/ܽܽ۠;)V

    iget-object v1, v0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    invoke-virtual {v1, v9}, Ll/ۖܶ۠;->֫(Ljava/util/function/Function;)Ll/ۖܶ۠;

    move-result-object v1

    .line 256
    invoke-virtual {v4}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v9

    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 257
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    iget-object v11, v11, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    .line 258
    invoke-virtual {v3, v1}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Object;

    move-result-object v1

    .line 259
    iget-object v12, v0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    invoke-virtual {v3, v12}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Object;

    move-result-object v3

    const/4 v12, 0x6

    new-array v12, v12, [Ljava/lang/Object;

    iget-object v13, v0, Ll/֨ۧ۠;->ܽ:Ll/ۤܶ۠;

    const/4 v14, 0x0

    aput-object v13, v12, v14

    const/4 v13, 0x1

    aput-object v2, v12, v13

    aput-object v10, v12, v7

    const/4 v2, 0x3

    aput-object v11, v12, v2

    const/4 v2, 0x4

    aput-object v1, v12, v2

    const/4 v1, 0x5

    aput-object v3, v12, v1

    .line 201
    invoke-virtual {v6, v8, v12}, Ll/ۛ۠۠;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܰ۠۠;

    move-result-object v11

    .line 212
    const-class v1, Ll/᩶۠۠;

    invoke-static {v1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v8

    const/4 v7, 0x0

    move-object/from16 v10, p1

    invoke-virtual/range {v6 .. v11}, Ll/ۛ۠۠;->֫(Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/ۙ۠۠;)Ll/ܽܶ۠;

    move-result-object v1

    .line 260
    new-instance v2, Ll/᩺۠۠;

    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ll/᩺۠۠;-><init>(Ll/ܽܶ۠;Ll/ۖܶ۠;)V

    .line 261
    invoke-virtual {v4, v2}, Ll/᩹ܶ۠;->֫(Ll/ܽܶ۠;)V

    return-void
.end method

.method public abstract ۧ(Ll/֫ۤ֨;Ll/ܽܽ۠;)Ll/ۛ֡֨;
.end method
