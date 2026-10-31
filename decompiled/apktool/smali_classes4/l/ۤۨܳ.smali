.class public Ll/ۤۨܳ;
.super Ll/ۛܶۢ;
.source "E29Y"


# instance fields
.field public ܺ֫:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 530
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    .line 531
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۤۨܳ;->ܺ֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 6

    const-string p1, "compressToAnother"

    .line 641
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 642
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    :goto_0
    move v2, p1

    .line 643
    iget-object p1, p0, Ll/ۤۨܳ;->ܺ֫:Ljava/util/List;

    invoke-static {p1}, Ll/᩻᩺ܳ;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    move-object v0, p4

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v0 .. v5}, Ll/᩻᩺ܳ;->֫(Ll/ܿ۠ۢ;ZZLl/ܽۢܳ;Ll/ܽۢܳ;Ljava/util/List;)V

    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "output"

    .line 540
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a26

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 535
    sget-object v0, Ll/᩻ܶۢ;->ۚ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 19

    move-object/from16 v9, p0

    const-string v0, "output"

    .line 552
    invoke-virtual {v9, v0}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "ARG_PATHS"

    .line 141
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    const-string v1, "password"

    .line 554
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "level"

    .line 555
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v1

    const-string v2, "headerEncryption"

    .line 556
    invoke-virtual {v9, v2}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "deleteSources"

    .line 557
    invoke-virtual {v9, v3}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v11

    const-string v3, "splitSize"

    .line 558
    invoke-virtual {v9, v3}, Ll/ۘ۠ۢ;->ۖ(Ljava/lang/String;)J

    move-result-wide v12

    const-string v3, "replaceExisting"

    .line 559
    invoke-virtual {v9, v3}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    .line 561
    invoke-static {v9, v10, v4}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Z)Ll/֫ۤܳ;

    move-result-object v14

    .line 562
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 563
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide/16 v15, -0x1

    if-nez v3, :cond_1

    cmp-long v3, v12, v15

    if-eqz v3, :cond_2

    :cond_1
    const/4 v4, 0x1

    .line 565
    :cond_2
    invoke-static {v0, v4}, Ll/᩹۟ܳ;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩹۟ܳ;

    move-result-object v0

    .line 567
    invoke-virtual {v0}, Ll/᩹۟ܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v17

    .line 568
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 569
    new-instance v6, Ll/᩹ܳᩳ;

    invoke-direct {v6}, Ll/᩹ܳᩳ;-><init>()V

    .line 570
    iget-object v3, v14, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iput v3, v6, Ll/᩹ܳᩳ;->᩹:I

    .line 571
    iput v1, v6, Ll/᩹ܳᩳ;->᩶:I

    .line 572
    iput-boolean v2, v6, Ll/᩹ܳᩳ;->᩸:Z

    .line 574
    :try_start_0
    new-instance v5, Ll/۫ۨܳ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v1, v5

    move-object/from16 v2, p0

    move-wide v3, v12

    move-object v15, v5

    move-object/from16 v5, v17

    move-object/from16 v16, v10

    move-object v10, v6

    move-object v6, v8

    move-object/from16 v18, v8

    move-object v8, v14

    :try_start_1
    invoke-direct/range {v1 .. v8}, Ll/۫ۨܳ;-><init>(Ll/ۤۨܳ;JLl/ܶ᩵ܿ;Ljava/util/ArrayList;Ljava/lang/String;Ll/֫ۤܳ;)V

    invoke-static {v10, v15}, Ll/۬ܳᩳ;->֫(Ll/᩹ܳᩳ;Ll/ۙܳᩳ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 621
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 622
    invoke-static/range {v18 .. v18}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 623
    invoke-virtual/range {v17 .. v17}, Ll/ܶ᩵ܿ;->۫()Z

    .line 624
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_3
    const-wide/16 v1, -0x1

    cmp-long v3, v12, v1

    if-nez v3, :cond_4

    .line 627
    sget-object v1, Ll/᩸۟ܳ;->᩹:Ll/᩸۟ܳ;

    goto :goto_0

    .line 628
    :cond_4
    sget-object v1, Ll/᩸۟ܳ;->᩶:Ll/᩸۟ܳ;

    :goto_0
    move-object/from16 v2, v18

    .line 626
    invoke-virtual {v0, v2, v1}, Ll/᩹۟ܳ;->֫(Ljava/util/List;Ll/᩸۟ܳ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v9, Ll/ۤۨܳ;->ܺ֫:Ljava/util/List;

    .line 630
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 631
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_5
    if-eqz v11, :cond_6

    .line 634
    iget-object v0, v9, Ll/ۤۨܳ;->ܺ֫:Ljava/util/List;

    invoke-virtual {v14}, Ll/֫ۤܳ;->ܽ()I

    move-result v1

    move-object/from16 v2, v16

    invoke-static {v9, v2, v0, v1}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Ljava/util/List;I)V

    .line 636
    :cond_6
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object/from16 v2, v18

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v2, v8

    .line 617
    :goto_1
    invoke-static {v2}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 618
    invoke-virtual/range {v17 .. v17}, Ll/ܶ᩵ܿ;->۫()Z

    .line 619
    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 648
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 545
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 546
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
