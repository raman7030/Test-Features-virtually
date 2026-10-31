.class public final Ll/ۨۛۘ;
.super Ll/۟۬ۘ;
.source "T8YQ"


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    const-string v0, "ol"

    const-string v1, "ul"

    .line 78
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V
    .locals 16

    .line 28
    invoke-interface/range {p3 .. p3}, Ll/ܶ۬ۘ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 32
    :cond_0
    invoke-interface/range {p3 .. p3}, Ll/ܶ۬ۘ;->֫()Ll/֨۬ۘ;

    move-result-object v0

    .line 33
    invoke-interface {v0}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ol"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 34
    invoke-interface {v0}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ul"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v1, :cond_1

    if-nez v3, :cond_1

    goto/16 :goto_3

    .line 40
    :cond_1
    invoke-interface/range {p1 .. p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object v3

    .line 41
    invoke-interface/range {p1 .. p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v5

    .line 42
    invoke-virtual {v3}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object v6

    const-class v7, Ll/᩵ۚ֡;

    invoke-interface {v6, v7}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v0

    .line 83
    :cond_2
    :goto_0
    invoke-interface {v9}, Ll/֨۬ۘ;->ܽ()Ll/֨۬ۘ;

    move-result-object v9

    if-eqz v9, :cond_4

    .line 84
    invoke-interface {v9}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    .line 85
    invoke-interface {v9}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 47
    :cond_4
    invoke-interface {v0}, Ll/֨۬ۘ;->ᩳ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x1

    const/4 v4, 0x1

    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֨۬ۘ;

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    .line 49
    invoke-static {v10, v11, v9}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/֨۬ۘ;)V

    new-array v12, v2, [I

    aput v7, v12, v7

    if-eqz v1, :cond_6

    .line 52
    sget-object v13, Ll/ۙۙۘ;->᩻:Ll/ۨ᩶ۘ;

    invoke-interface/range {p1 .. p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v14

    new-instance v15, Ll/ۛۛۘ;

    invoke-direct {v15, v12}, Ll/ۛۛۘ;-><init>([I)V

    invoke-virtual {v13, v14, v15}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    :cond_6
    if-eqz v6, :cond_5

    const-string v13, "li"

    .line 55
    invoke-interface {v9}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    if-eqz v1, :cond_7

    .line 59
    sget-object v13, Ll/ۙۙۘ;->ܿ:Ll/ۨ᩶ۘ;

    sget-object v14, Ll/᩹ۙۘ;->᩶:Ll/᩹ۙۘ;

    invoke-virtual {v13, v5, v14}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 60
    sget-object v13, Ll/ۙۙۘ;->ܳ:Ll/ۨ᩶ۘ;

    add-int/lit8 v14, v4, 0x1

    aput v4, v12, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v13, v5, v4}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    move v4, v14

    goto :goto_2

    .line 62
    :cond_7
    sget-object v12, Ll/ۙۙۘ;->ܿ:Ll/ۨ᩶ۘ;

    sget-object v13, Ll/᩹ۙۘ;->᩹:Ll/᩹ۙۘ;

    invoke-virtual {v12, v5, v13}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 63
    sget-object v12, Ll/ۙۙۘ;->֫:Ll/ۨ᩶ۘ;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v5, v13}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 67
    :goto_2
    invoke-interface/range {p1 .. p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v12

    .line 68
    invoke-interface {v6, v3, v5}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object v13

    .line 69
    invoke-interface {v9}, Ll/ܶ۬ۘ;->start()I

    move-result v14

    .line 70
    invoke-interface {v9}, Ll/ܶ۬ۘ;->end()I

    move-result v9

    .line 66
    invoke-static {v12, v13, v14, v9}, Ll/ᩳۙۘ;->֫(Ll/ᩳۙۘ;Ljava/lang/Object;II)V

    goto :goto_1

    :cond_8
    :goto_3
    return-void
.end method
