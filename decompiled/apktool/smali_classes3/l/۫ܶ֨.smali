.class public final Ll/۫ܶ֨;
.super Ljava/lang/Object;
.source "X43L"


# instance fields
.field public ֫:Ljava/util/WeakHashMap;

.field public final synthetic ۧ:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 663
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܶ֨;->ۧ:Ll/ۛ᩸֨;

    .line 665
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ll/۫ܶ֨;->֫:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ܶ֨;)Ljava/util/WeakHashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ܶ֨;->֫:Ljava/util/WeakHashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/᩶֡֨;)Ll/۬ܶ֨;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 716
    iget-object v2, v0, Ll/۫ܶ֨;->֫:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗܶ֨;

    .line 717
    iget-object v4, v0, Ll/۫ܶ֨;->ۧ:Ll/ۛ᩸֨;

    iget-object v5, v4, Ll/ۛ᩸֨;->ᩴ:Ll/ۛ۠۠;

    iget-object v6, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Z)Ll/ܿ᩵֨;

    move-result-object v6

    if-eqz v3, :cond_0

    .line 719
    invoke-virtual {v6}, Ll/ܿ᩵֨;->ۧ()I

    move-result v7

    .line 711
    iget v8, v3, Ll/ۗܶ֨;->ۧ:I

    if-ne v8, v7, :cond_0

    .line 725
    iget-object v1, v3, Ll/ۗܶ֨;->֫:Ll/۬ܶ֨;

    return-object v1

    .line 734
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result v3

    const/4 v7, 0x1

    if-eqz v3, :cond_a

    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v8

    const-wide/16 v10, 0x2000

    and-long/2addr v8, v10

    const-wide/16 v10, 0x0

    cmp-long v3, v8, v10

    if-nez v3, :cond_a

    invoke-virtual/range {p1 .. p1}, Ll/ۛ֡֨;->᩵֫()Z

    move-result v3

    if-nez v3, :cond_a

    .line 739
    new-instance v3, Ll/ᩴܶ۠;

    invoke-direct {v3}, Ll/ᩴܶ۠;-><init>()V

    .line 740
    new-instance v8, Ll/ۤܶ֨;

    invoke-direct {v8, v1, v4}, Ll/ۤܶ֨;-><init>(Ll/᩶֡֨;Ll/ۛ᩸֨;)V

    .line 75
    sget-object v9, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {v6, v8, v9}, Ll/ܿ᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v8

    .line 740
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x2

    const-string v11, "not.a.functional.intf.1"

    const-string v12, "compiler"

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۛ֡֨;

    .line 741
    iget-object v13, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v4, v9, v13}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v13

    .line 742
    invoke-virtual {v3}, Ll/ᩴܶ۠;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_2

    .line 743
    invoke-virtual {v3, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 744
    :cond_2
    iget-object v14, v9, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v3}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v15

    const/16 v16, 0x0

    check-cast v15, Ll/ۛ֡֨;

    iget-object v15, v15, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v14, v15, :cond_3

    iget-object v14, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 745
    invoke-virtual {v3}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۛ֡֨;

    invoke-virtual {v4, v15, v14}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v14

    invoke-virtual {v4, v13, v14}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 746
    invoke-static {v3}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v10

    new-instance v11, Ll/ܶܶ֨;

    invoke-direct {v11, v0, v9}, Ll/ܶܶ֨;-><init>(Ll/۫ܶ֨;Ll/ۛ֡֨;)V

    invoke-interface {v10, v11}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v10

    new-instance v11, Ll/᩸ܶ֨;

    invoke-direct {v11, v0, v1}, Ll/᩸ܶ֨;-><init>(Ll/۫ܶ֨;Ll/᩶֡֨;)V

    .line 747
    invoke-interface {v10, v11}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v10

    new-instance v11, Ll/᩹ܶ֨;

    invoke-direct {v11, v0, v13}, Ll/᩹ܶ֨;-><init>(Ll/۫ܶ֨;Ll/ۙ֨֨;)V

    .line 748
    invoke-interface {v10, v11}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v10

    if-nez v10, :cond_1

    .line 749
    invoke-virtual {v3, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 754
    :cond_3
    invoke-static/range {p1 .. p1}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v2

    sget-object v3, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7137
    new-instance v3, Ll/ۨ۠۠;

    new-array v6, v10, [Ljava/lang/Object;

    aput-object v2, v6, v16

    aput-object v1, v6, v7

    const-string v2, "incompatible.abstracts"

    invoke-direct {v3, v12, v2, v6}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    invoke-virtual {v5, v3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v1, v3, v16

    aput-object v2, v3, v7

    .line 805
    iget-object v1, v4, Ll/ۛ᩸֨;->ᩴ:Ll/ۛ۠۠;

    invoke-virtual {v1, v11, v3}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    .line 809
    new-instance v2, Ll/ۛܶ֨;

    .line 645
    invoke-direct {v2}, Ljava/lang/RuntimeException;-><init>()V

    .line 650
    iput-object v1, v2, Ll/ۛܶ֨;->᩸:Ll/ܽܶ۠;

    .line 753
    throw v2

    .line 757
    :cond_4
    invoke-virtual {v3}, Ll/ᩴܶ۠;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_9

    .line 761
    invoke-virtual {v3}, Ll/ᩴܶ۠;->size()I

    move-result v8

    if-ne v8, v7, :cond_5

    .line 762
    new-instance v4, Ll/۬ܶ֨;

    invoke-virtual {v3}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֡֨;

    invoke-direct {v4, v0, v3}, Ll/۬ܶ֨;-><init>(Ll/۫ܶ֨;Ll/ۛ֡֨;)V

    goto/16 :goto_3

    .line 764
    :cond_5
    invoke-virtual {v3}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v8

    .line 794
    iget-object v9, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    const/4 v11, 0x0

    invoke-virtual {v4, v8, v9, v11}, Ll/ۛ᩸֨;->֫(Ll/ۖܶ۠;Ll/ۙ֨֨;Z)Ll/ܽ۫ᩴ;

    move-result-object v4

    new-instance v8, Ll/᩶ܶ֨;

    invoke-direct {v8, v0}, Ll/᩶ܶ֨;-><init>(Ll/۫ܶ֨;)V

    .line 795
    invoke-virtual {v4, v8}, Ll/ܽ۫ᩴ;->map(Ljava/util/function/Function;)Ll/ܽ۫ᩴ;

    move-result-object v4

    const/4 v8, 0x0

    .line 801
    invoke-virtual {v4, v8}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ܶ֨;

    if-nez v4, :cond_8

    .line 767
    new-instance v2, Ll/ᩴܶ۠;

    invoke-direct {v2}, Ll/ᩴܶ۠;-><init>()V

    .line 768
    invoke-virtual {v3}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֡֨;

    .line 769
    iget-object v6, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v6}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۖܶ۠;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_6

    const-string v6, "descriptor.throws"

    goto :goto_2

    :cond_6
    const-string v6, "descriptor"

    .line 771
    :goto_2
    iget-object v8, v4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v9, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 772
    invoke-virtual {v9}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v9

    iget-object v11, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 773
    invoke-virtual {v11}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v11

    iget-object v4, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 774
    invoke-virtual {v4}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v4

    const/4 v13, 0x4

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v8, v13, v14

    aput-object v9, v13, v7

    aput-object v11, v13, v10

    const/4 v8, 0x3

    aput-object v4, v13, v8

    .line 771
    invoke-virtual {v5, v6, v13}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 777
    :cond_7
    invoke-static/range {p1 .. p1}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v3

    sget-object v4, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7167
    new-instance v4, Ll/ۨ۠۠;

    new-array v6, v10, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v3, v6, v8

    aput-object v1, v6, v7

    const-string v1, "incompatible.descs.in.functional.intf"

    invoke-direct {v4, v12, v1, v6}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    invoke-virtual {v5, v4}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v1

    .line 779
    new-instance v3, Ll/᩺۠۠;

    .line 780
    invoke-virtual {v2}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Ll/᩺۠۠;-><init>(Ll/ܽܶ۠;Ll/ۖܶ۠;)V

    .line 809
    new-instance v1, Ll/ۛܶ֨;

    .line 645
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 650
    iput-object v3, v1, Ll/ۛܶ֨;->᩸:Ll/ܽܶ۠;

    .line 781
    throw v1

    .line 721
    :cond_8
    :goto_3
    new-instance v3, Ll/ۗܶ֨;

    invoke-virtual {v6}, Ll/ܿ᩵֨;->ۧ()I

    move-result v5

    invoke-direct {v3, v4, v5}, Ll/ۗܶ֨;-><init>(Ll/۬ܶ֨;I)V

    invoke-virtual {v2, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4

    .line 760
    :cond_9
    invoke-static/range {p1 .. p1}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v2

    sget-object v3, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7732
    new-instance v3, Ll/ۨ۠۠;

    new-array v6, v10, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v2, v6, v8

    aput-object v1, v6, v7

    const-string v2, "no.abstracts"

    invoke-direct {v3, v12, v2, v6}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    invoke-virtual {v5, v3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v1, v3, v8

    aput-object v2, v3, v7

    .line 805
    iget-object v1, v4, Ll/ۛ᩸֨;->ᩴ:Ll/ۛ۠۠;

    invoke-virtual {v1, v11, v3}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    .line 809
    new-instance v2, Ll/ۛܶ֨;

    .line 645
    invoke-direct {v2}, Ljava/lang/RuntimeException;-><init>()V

    .line 650
    iput-object v1, v2, Ll/ۛܶ֨;->᩸:Ll/ܽܶ۠;

    .line 759
    throw v2

    :cond_a
    new-array v2, v7, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    .line 805
    iget-object v1, v4, Ll/ۛ᩸֨;->ᩴ:Ll/ۛ۠۠;

    const-string v3, "not.a.functional.intf"

    invoke-virtual {v1, v3, v2}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    .line 809
    new-instance v2, Ll/ۛܶ֨;

    .line 645
    invoke-direct {v2}, Ljava/lang/RuntimeException;-><init>()V

    .line 650
    iput-object v1, v2, Ll/ۛܶ֨;->᩸:Ll/ܽܶ۠;

    .line 736
    throw v2
.end method
