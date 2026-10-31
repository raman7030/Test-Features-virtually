.class public abstract Ll/ۚᩳ۠;
.super Ll/ܰᩳ۠;
.source "B7KX"


# instance fields
.field public final synthetic ۗ:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ܰᩳ۠;)V
    .locals 0

    .line 518
    iput-object p1, p0, Ll/ۚᩳ۠;->ۗ:Ll/ۧܿ۠;

    .line 519
    invoke-direct {p0, p1, p2, p3}, Ll/ܰᩳ۠;-><init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ܰᩳ۠;)V

    return-void
.end method

.method public static ֫(Ll/֫ۤ֨;Ll/ۚ᩵۠;)Ll/֫ۤ֨;
    .locals 4

    .line 523
    iget-object v0, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-static {v0}, Ll/ܰ᩵֨;->ۜ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;

    move-result-object v0

    .line 525
    iget-object v1, p0, Ll/֫ۤ֨;->۬:Ll/֫ۤ֨;

    iget-object v1, v1, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast v1, Ll/ۡۗ֨;

    iget-object v1, v1, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    sget-object v2, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v3, 0x0

    .line 82
    invoke-virtual {v1, v3, v2}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v1

    .line 525
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֡֨;

    .line 526
    invoke-virtual {v2}, Ll/ۛ֡֨;->ۡ֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 527
    invoke-virtual {v0, v2}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    goto :goto_0

    .line 531
    :cond_1
    iget-object v1, p1, Ll/ۚ᩵۠;->ܰ:Ll/ۖܶ۠;

    if-eqz v1, :cond_2

    .line 533
    :goto_1
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 535
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ܳۚ۠;

    iget-object v2, v2, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v2}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    .line 534
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    .line 536
    :cond_2
    iget-object p0, p0, Ll/֫ۤ֨;->۬:Ll/֫ۤ֨;

    .line 537
    iget-object v1, p0, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast v1, Ll/ۡۗ֨;

    invoke-virtual {v1, v0}, Ll/ۡۗ֨;->֫(Ll/ܰ᩵֨;)Ll/ۡۗ֨;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/֫ۤ֨;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/֫ۤ֨;

    move-result-object p1

    const/4 v0, 0x1

    .line 538
    iput-boolean v0, p1, Ll/֫ۤ֨;->᩸:Z

    .line 539
    iput-object p0, p1, Ll/֫ۤ֨;->۬:Ll/֫ۤ֨;

    .line 540
    iget-object p0, p1, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast p0, Ll/ۡۗ֨;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll/ۡۗ֨;->᩻:Z

    return-object p1
.end method


# virtual methods
.method public ֫(Ll/۫᩵۠;)Ll/۫᩵۠;
    .locals 0

    return-object p1
.end method

.method public final ֫(Ll/֫ۤ֨;Ll/֫ۤ֨;)V
    .locals 22

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    .line 677
    iget-object v8, v0, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    .line 678
    iget-object v9, v8, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    .line 679
    iget-object v0, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    move-object v10, v0

    check-cast v10, Ll/᩶ۚ֨;

    .line 684
    iget-object v0, v8, Ll/ۚ᩵۠;->۬:Ll/۫᩵۠;

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    iget-object v14, v7, Ll/ۚᩳ۠;->ۗ:Ll/ۧܿ۠;

    if-eqz v0, :cond_1

    .line 685
    invoke-virtual {v7, v0}, Ll/ۚᩳ۠;->֫(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v0

    .line 686
    invoke-static {v14}, Ll/ۧܿ۠;->ۧ(Ll/ۧܿ۠;)Ll/ۢۗ֨;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x1

    move-object v2, v0

    move-object/from16 v3, p2

    invoke-virtual/range {v1 .. v6}, Ll/ۢۗ֨;->֫(Ll/۫᩵۠;Ll/֫ۤ֨;ZZZ)Ll/ۙ֨֨;

    move-result-object v1

    .line 687
    invoke-static {v14}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->ۨ֫:Ll/ۙ֨֨;

    if-ne v1, v2, :cond_0

    .line 688
    invoke-static {v14}, Ll/ۧܿ۠;->᩷(Ll/ۧܿ۠;)Ll/᩹ܶ۠;

    move-result-object v2

    iget-object v3, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2241
    new-instance v4, Ll/۫۠۠;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const-string v3, "compiler"

    const-string v6, "invalid.supertype.record"

    invoke-direct {v4, v3, v6, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    invoke-virtual {v2, v8, v4}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_0
    move-object v6, v0

    goto :goto_2

    .line 692
    :cond_1
    iget-object v0, v8, Ll/ۚ᩵۠;->ۤ:Ll/ۖ֡۠;

    iget-wide v0, v0, Ll/ۖ֡۠;->۬:J

    const-wide/16 v2, 0x4000

    and-long/2addr v0, v2

    cmp-long v2, v0, v11

    if-eqz v2, :cond_2

    .line 693
    invoke-static {v14}, Ll/ۧܿ۠;->ۧ(Ll/ۧܿ۠;)Ll/ۢۗ֨;

    move-result-object v15

    iget v0, v8, Ll/ۚۚ۠;->᩸:I

    .line 549
    invoke-static {v14}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v1

    .line 111
    iput v0, v1, Ll/ܿ֨۠;->ܽ:I

    .line 549
    invoke-static {v14}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v0

    invoke-static {v14}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->᩹:Ll/ܳ֡֨;

    .line 550
    invoke-virtual {v0, v2}, Ll/ܿ֨۠;->ۧ(Ll/ۛ֡֨;)Ll/۫᩵۠;

    move-result-object v0

    invoke-static {v14}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v2

    iget-object v3, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 551
    invoke-virtual {v2, v3}, Ll/ܿ֨۠;->ܽ(Ll/ۙ֨֨;)Ll/۫᩵۠;

    move-result-object v2

    invoke-static {v2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    .line 550
    invoke-virtual {v1, v0, v2}, Ll/ܿ֨۠;->ܳ(Ll/۫᩵۠;Ll/ۖܶ۠;)Ll/ܽۚ۠;

    move-result-object v16

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v18, 0x1

    move-object/from16 v17, p2

    .line 693
    invoke-virtual/range {v15 .. v20}, Ll/ۢۗ֨;->֫(Ll/۫᩵۠;Ll/֫ۤ֨;ZZZ)Ll/ۙ֨֨;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    .line 695
    :cond_2
    iget-object v0, v9, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    invoke-static {v14}, Ll/ۧܿ۠;->ܺ(Ll/ۧܿ۠;)Ll/ۛܶ۠;

    move-result-object v1

    iget-object v1, v1, Ll/ۛܶ۠;->᩶ۧ:Ll/ۤܶ۠;

    if-ne v0, v1, :cond_3

    .line 696
    sget-object v0, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    goto :goto_0

    .line 697
    :cond_3
    invoke-virtual {v9}, Ll/ܳ֡֨;->ۨ֫()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v14}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v0

    iget-object v0, v0, Ll/᩷ۚ֨;->ۨ֫:Ll/ۙ֨֨;

    goto :goto_0

    :cond_4
    invoke-static {v14}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v0

    iget-object v0, v0, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    goto :goto_0

    :goto_1
    move-object v6, v13

    .line 556
    :goto_2
    sget-object v0, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {v1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    .line 559
    :cond_5
    new-instance v15, Ll/ۘᩳ۠;

    invoke-virtual {v1}, Ll/ۙ֨֨;->᩺()Ll/ۙ֨֨;

    move-result-object v2

    iget-object v3, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    const/4 v5, 0x0

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v6}, Ll/ۘᩳ۠;-><init>(Ll/ۚᩳ۠;Ll/ۙ֨֨;Ll/᩶֡֨;Ll/֫ۤ֨;ZLl/۫᩵۠;)V

    move-object v1, v15

    .line 699
    :goto_3
    iput-object v1, v10, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    .line 702
    new-instance v15, Ll/ᩴܶ۠;

    invoke-direct {v15}, Ll/ᩴܶ۠;-><init>()V

    .line 704
    iget-object v0, v8, Ll/ۚ᩵۠;->۫:Ll/ۖܶ۠;

    .line 705
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_6
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩵۠;

    .line 706
    invoke-virtual {v7, v0}, Ll/ۚᩳ۠;->֫(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v17

    .line 707
    invoke-static {v14}, Ll/ۧܿ۠;->ۧ(Ll/ۧܿ۠;)Ll/ۢۗ֨;

    move-result-object v1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v4, 0x0

    move-object/from16 v2, v17

    move-object/from16 v3, p2

    invoke-virtual/range {v1 .. v6}, Ll/ۢۗ֨;->֫(Ll/۫᩵۠;Ll/֫ۤ֨;ZZZ)Ll/ۙ֨֨;

    move-result-object v0

    .line 708
    sget-object v1, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 709
    invoke-virtual {v15, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    if-eqz v13, :cond_6

    .line 710
    invoke-virtual {v13, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    if-nez v13, :cond_8

    .line 713
    new-instance v13, Ll/ᩴܶ۠;

    invoke-direct {v13}, Ll/ᩴܶ۠;-><init>()V

    invoke-virtual {v13, v15}, Ll/ᩴܶ۠;->֫(Ll/ᩴܶ۠;)V

    .line 556
    :cond_8
    sget-object v1, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_5

    .line 559
    :cond_9
    new-instance v18, Ll/ۘᩳ۠;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩺()Ll/ۙ֨֨;

    move-result-object v2

    iget-object v3, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    const/4 v5, 0x1

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    move-object/from16 v4, p2

    move-object/from16 v6, v17

    invoke-direct/range {v0 .. v6}, Ll/ۘᩳ۠;-><init>(Ll/ۚᩳ۠;Ll/ۙ֨֨;Ll/᩶֡֨;Ll/֫ۤ֨;ZLl/۫᩵۠;)V

    .line 714
    :goto_5
    invoke-virtual {v13, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    const/4 v0, 0x1

    .line 719
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 720
    iget-object v2, v8, Ll/ۚ᩵۠;->ۨ:Ll/ۖܶ۠;

    .line 721
    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Ll/۫᩵۠;

    .line 722
    invoke-static {v14}, Ll/ۧܿ۠;->ۧ(Ll/ۧܿ۠;)Ll/ۢۗ֨;

    move-result-object v16

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, p2

    invoke-virtual/range {v16 .. v21}, Ll/ۢۗ֨;->֫(Ll/۫᩵۠;Ll/֫ۤ֨;ZZZ)Ll/ۙ֨֨;

    move-result-object v3

    .line 723
    iget-object v3, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_6

    .line 726
    :cond_b
    iget-wide v2, v9, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v4, 0x2000

    and-long/2addr v2, v4

    cmp-long v4, v2, v11

    if-eqz v4, :cond_c

    .line 727
    invoke-static {v14}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->ۧ:Ll/ۙ֨֨;

    invoke-static {v2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    iput-object v2, v10, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    .line 728
    iput-object v2, v10, Ll/᩶ۚ֨;->ۤ:Ll/ۖܶ۠;

    goto :goto_8

    .line 730
    :cond_c
    invoke-virtual {v15}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v2

    iput-object v2, v10, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    if-nez v13, :cond_d

    goto :goto_7

    .line 732
    :cond_d
    invoke-virtual {v13}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v2

    :goto_7
    iput-object v2, v10, Ll/᩶ۚ֨;->ۤ:Ll/ۖܶ۠;

    .line 739
    :goto_8
    invoke-virtual {v1}, Ll/ᩴܶ۠;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    .line 740
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v2

    iput-object v2, v9, Ll/ܳ֡֨;->ۧ֫:Ll/ۖܶ۠;

    .line 742
    :cond_e
    invoke-virtual {v1}, Ll/ᩴܶ۠;->isEmpty()Z

    move-result v1

    xor-int/2addr v0, v1

    iput-boolean v0, v9, Ll/ܳ֡֨;->۟:Z

    return-void
.end method
