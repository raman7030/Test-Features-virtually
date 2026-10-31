.class public final Ll/᩶ܰ֨;
.super Ll/֡ۚ۠;
.source "T7LF"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashSet;

.field public final synthetic ܿ:Ll/ۗܰ֨;

.field public ᩳ:Ll/֡֡֨;


# direct methods
.method public constructor <init>(Ll/ۗܰ֨;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 766
    iput-object p1, p0, Ll/᩶ܰ֨;->ܿ:Ll/ۗܰ֨;

    .line 768
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/᩶ܰ֨;->ܽ:Ljava/util/HashSet;

    .line 769
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/᩶ܰ֨;->֫:Ljava/util/HashMap;

    .line 770
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/᩶ܰ֨;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡֡۠;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 880
    iget-object v2, v1, Ll/֡֡۠;->۫:Ll/۫᩵۠;

    iget-object v3, v1, Ll/֡֡۠;->۬:Ll/ۖܶ۠;

    invoke-static {v2}, Ll/۟ۚ۠;->ۜ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object v4

    .line 881
    iget-object v5, v0, Ll/᩶ܰ֨;->ܿ:Ll/ۗܰ֨;

    invoke-static {v5}, Ll/ۗܰ֨;->᩷(Ll/ۗܰ֨;)Ll/᩷ۚ֨;

    move-result-object v6

    iget-object v7, v0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    invoke-virtual {v6, v7, v4}, Ll/᩷ۚ֨;->ۧ(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/۠֡֨;

    move-result-object v4

    .line 882
    invoke-static {v5}, Ll/ۗܰ֨;->ۧ(Ll/ۗܰ֨;)Ll/ۢۗ֨;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5972
    new-instance v6, Ll/ۚۙ֨;

    invoke-direct {v6, v4}, Ll/ۚۙ֨;-><init>(Ll/۠֡֨;)V

    .line 5985
    invoke-virtual {v6, v2}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    .line 884
    iget-object v6, v0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v6, v6, Ll/֡֡֨;->۟:Ljava/util/EnumSet;

    sget-object v7, Ll/ᩴ֡֨;->ۙ:Ll/ᩴ֡֨;

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 885
    invoke-static {v5}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v6

    sget-object v7, Ll/ۛᩴ۠;->ۡܽ:Ll/۫۠۠;

    invoke-virtual {v6, v1, v7}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 887
    :cond_0
    new-instance v6, Ll/ᩴۚܳ;

    const/16 v7, 0x8

    invoke-direct {v6, v7}, Ll/ᩴۚܳ;-><init>(I)V

    iget-object v7, v0, Ll/᩶ܰ֨;->ۧ:Ljava/util/HashMap;

    invoke-static {v7, v4, v6}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖܶ۠;

    .line 888
    invoke-virtual {v6}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v12, "compiler"

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩻ᩴ֨;

    .line 919
    invoke-static {v5}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 968
    new-instance v13, Ll/۫۠۠;

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v4, v11, v10

    const-string v10, "conflicting.opens"

    invoke-direct {v13, v12, v10, v11}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    invoke-virtual {v9, v2, v13}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_7

    .line 894
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 895
    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۫᩵۠;

    .line 960
    invoke-static {v8}, Ll/۟ۚ۠;->ۜ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object v9

    .line 961
    invoke-static {v5}, Ll/ۗܰ֨;->ܳ(Ll/ۗܰ֨;)Ll/ۛᩴ֨;

    move-result-object v10

    invoke-virtual {v10, v9}, Ll/ۛᩴ֨;->֫(Ll/ۤܶ۠;)Ll/֡֡֨;

    move-result-object v9

    .line 962
    invoke-static {v9, v8}, Ll/۟ۚ۠;->ۧ(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    .line 897
    invoke-static {v5}, Ll/ۗܰ֨;->ܽ(Ll/ۗܰ֨;)Ll/ܶ۬֨;

    move-result-object v10

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10, v8, v9}, Ll/ܶ۬֨;->֫(Ll/۫᩵۠;Ll/֡֡֨;)V

    .line 898
    invoke-virtual {v6}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const-string v14, "conflicting.opens.to.module"

    if-eqz v13, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩻ᩴ֨;

    .line 924
    iget-object v13, v13, Ll/᩻ᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-eqz v13, :cond_3

    .line 925
    invoke-virtual {v13}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    const/16 v16, 0x0

    check-cast v15, Ll/֡֡֨;

    if-ne v9, v15, :cond_2

    .line 934
    invoke-static {v5}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v15

    sget-object v17, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    move-object/from16 v18, v3

    .line 976
    new-instance v3, Ll/۫۠۠;

    move-object/from16 v17, v10

    new-array v10, v11, [Ljava/lang/Object;

    aput-object v9, v10, v16

    invoke-direct {v3, v12, v14, v10}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    invoke-virtual {v15, v8, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_4

    :cond_2
    move-object/from16 v18, v3

    move-object/from16 v17, v10

    :goto_4
    move-object/from16 v10, v17

    move-object/from16 v3, v18

    goto :goto_3

    :cond_3
    move-object/from16 v18, v3

    move-object/from16 v17, v10

    move-object/from16 v10, v17

    move-object/from16 v3, v18

    goto :goto_2

    :cond_4
    move-object/from16 v18, v3

    const/4 v3, 0x0

    .line 901
    invoke-interface {v2, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    .line 934
    invoke-static {v5}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v10

    sget-object v13, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 976
    new-instance v13, Ll/۫۠۠;

    new-array v15, v11, [Ljava/lang/Object;

    aput-object v9, v15, v3

    invoke-direct {v13, v12, v14, v15}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    invoke-virtual {v10, v8, v13}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_5
    move-object/from16 v3, v18

    goto/16 :goto_1

    .line 905
    :cond_6
    invoke-static {v2}, Ll/ۖܶ۠;->֫(Ljava/lang/Iterable;)Ll/ۖܶ۠;

    move-result-object v2

    goto :goto_5

    :cond_7
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_9

    .line 908
    invoke-virtual {v2}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_6

    :cond_8
    return-void

    .line 909
    :cond_9
    :goto_6
    const-class v3, Ll/ۜᩴ֨;

    invoke-static {v3}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v3

    .line 910
    new-instance v5, Ll/᩻ᩴ֨;

    invoke-direct {v5, v4, v2, v3}, Ll/᩻ᩴ֨;-><init>(Ll/۠֡֨;Ll/ۖܶ۠;Ljava/util/EnumSet;)V

    .line 911
    iget-object v2, v0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v3, v2, Ll/֡֡֨;->ۧ֫:Ll/ۖܶ۠;

    invoke-virtual {v3, v5}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    iput-object v3, v2, Ll/֡֡֨;->ۧ֫:Ll/ۖܶ۠;

    .line 912
    iput-object v5, v1, Ll/֡֡۠;->ۗ:Ll/᩻ᩴ֨;

    .line 914
    invoke-virtual {v6, v5}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v7, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۘ֡۠;)V
    .locals 7

    .line 774
    iget-object v0, p1, Ll/ۘ֡۠;->ۛ:Ll/֡֡֨;

    invoke-static {v0}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    .line 776
    invoke-virtual {p1}, Ll/ۘ֡۠;->ۚ()Ll/ۜܺ֨;

    move-result-object v0

    sget-object v1, Ll/ۜܺ֨;->᩹:Ll/ۜܺ֨;

    if-ne v0, v1, :cond_0

    .line 777
    iget-object v0, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v0, v0, Ll/֡֡֨;->۟:Ljava/util/EnumSet;

    sget-object v1, Ll/ᩴ֡֨;->ۙ:Ll/ᩴ֡֨;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 779
    :cond_0
    iget-object v0, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-wide v1, v0, Ll/ۛ֡֨;->᩶:J

    iget-object v3, p1, Ll/ۘ֡۠;->۫:Ll/ۖ֡۠;

    iget-wide v3, v3, Ll/ۖ֡۠;->۬:J

    const-wide/32 v5, 0x20000

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    iput-wide v1, v0, Ll/ۛ֡֨;->᩶:J

    .line 781
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    .line 782
    iget-object v0, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    .line 783
    iget-object v0, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/֡֡֨;->ۧ֫:Ll/ۖܶ۠;

    .line 784
    iget-object p1, p1, Ll/ۘ֡۠;->ۗ:Ll/ۖܶ۠;

    new-instance v0, Ll/᩹ۨ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩹ۨ֨;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 785
    iget-object p1, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v0, p1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    .line 786
    iget-object p1, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v0, p1, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    .line 787
    iget-object p1, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v0, p1, Ll/֡֡֨;->ۧ֫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/֡֡֨;->ۧ֫:Ll/ۖܶ۠;

    .line 944
    iget-object p1, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object p1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v0, p0, Ll/᩶ܰ֨;->ܿ:Ll/ۗܰ֨;

    invoke-static {v0}, Ll/ۗܰ֨;->᩻(Ll/ۗܰ֨;)Ll/ۛܶ۠;

    move-result-object v1

    iget-object v1, v1, Ll/ۛܶ۠;->ۚۧ:Ll/ۤܶ۠;

    if-ne p1, v1, :cond_1

    goto :goto_0

    .line 947
    :cond_1
    iget-object p1, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object p1, p1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢᩴ֨;

    .line 948
    iget-object v1, v1, Ll/ۢᩴ֨;->ۧ:Ll/֡֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-static {v0}, Ll/ۗܰ֨;->᩻(Ll/ۗܰ֨;)Ll/ۛܶ۠;

    move-result-object v2

    iget-object v2, v2, Ll/ۛܶ۠;->ۚۧ:Ll/ۤܶ۠;

    if-ne v1, v2, :cond_2

    :goto_0
    return-void

    .line 952
    :cond_3
    invoke-static {v0}, Ll/ۗܰ֨;->᩷(Ll/ۗܰ֨;)Ll/᩷ۚ֨;

    move-result-object p1

    invoke-static {v0}, Ll/ۗܰ֨;->᩻(Ll/ۗܰ֨;)Ll/ۛܶ۠;

    move-result-object v0

    iget-object v0, v0, Ll/ۛܶ۠;->ۚۧ:Ll/ۤܶ۠;

    invoke-virtual {p1, v0}, Ll/᩷ۚ֨;->֫(Ll/ۤܶ۠;)Ll/֡֡֨;

    move-result-object p1

    .line 953
    new-instance v0, Ll/ۢᩴ֨;

    sget-object v1, Ll/ۡᩴ֨;->ۙ:Ll/ۡᩴ֨;

    .line 955
    invoke-static {v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۢᩴ֨;-><init>(Ll/֡֡֨;Ljava/util/EnumSet;)V

    .line 956
    iget-object p1, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v1, p1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    return-void
.end method

.method public final ֫(Ll/۫֡۠;)V
    .locals 10

    .line 793
    iget-object v0, p1, Ll/۫֡۠;->ۤ:Ll/۫᩵۠;

    .line 960
    invoke-static {v0}, Ll/۟ۚ۠;->ۜ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object v1

    .line 961
    iget-object v2, p0, Ll/᩶ܰ֨;->ܿ:Ll/ۗܰ֨;

    invoke-static {v2}, Ll/ۗܰ֨;->ܳ(Ll/ۗܰ֨;)Ll/ۛᩴ֨;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/ۛᩴ֨;->֫(Ll/ۤܶ۠;)Ll/֡֡֨;

    move-result-object v1

    .line 962
    invoke-static {v1, v0}, Ll/۟ۚ۠;->ۧ(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    .line 794
    iget-object v3, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v7, "compiler"

    if-eq v3, v4, :cond_0

    .line 795
    invoke-static {v2}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2493
    new-instance v3, Ll/۫۠۠;

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    const-string v5, "module.not.found"

    invoke-direct {v3, v7, v5, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    invoke-virtual {p1, v0, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 796
    invoke-static {v2}, Ll/ۗܰ֨;->ۡ(Ll/ۗܰ֨;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/HashSet;

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 797
    :cond_0
    iget-object v3, p0, Ll/᩶ܰ֨;->ܽ:Ljava/util/HashSet;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 798
    invoke-static {v2}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1242
    new-instance v2, Ll/۫۠۠;

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v1, v3, v5

    const-string v1, "duplicate.requires"

    invoke-direct {v2, v7, v1, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 798
    invoke-virtual {p1, v0, v2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 800
    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 801
    const-class v0, Ll/ۡᩴ֨;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 802
    iget-boolean v3, p1, Ll/۫֡۠;->۫:Z

    if-eqz v3, :cond_3

    .line 803
    invoke-static {v2}, Ll/ۗܰ֨;->᩷(Ll/ۗܰ֨;)Ll/᩷ۚ֨;

    move-result-object v3

    iget-object v3, v3, Ll/᩷ۚ֨;->ܿ֫:Ll/֡֡֨;

    if-ne v1, v3, :cond_2

    invoke-static {v2}, Ll/ۗܰ֨;->ۜ(Ll/ۗܰ֨;)Ll/ܽ֡֨;

    move-result-object v3

    sget-object v4, Ll/ܽ֡֨;->ۙ:Ll/ܽ֡֨;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_2

    .line 804
    invoke-static {v2}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v3

    invoke-static {v2}, Ll/ۗܰ֨;->᩻(Ll/ۗܰ֨;)Ll/ۛܶ۠;

    move-result-object v4

    iget-object v4, v4, Ll/ۛܶ۠;->ۚܽ:Ll/ۤܶ۠;

    sget-object v8, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2463
    new-instance v8, Ll/۫۠۠;

    new-array v9, v6, [Ljava/lang/Object;

    aput-object v4, v9, v5

    const-string v4, "modifier.not.allowed.here"

    invoke-direct {v8, v7, v4, v9}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    invoke-virtual {v3, p1, v8}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_0

    .line 806
    :cond_2
    sget-object v3, Ll/ۡᩴ֨;->۫:Ll/ۡᩴ֨;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 809
    :cond_3
    :goto_0
    iget-boolean v3, p1, Ll/۫֡۠;->۬:Z

    if-eqz v3, :cond_5

    .line 810
    invoke-static {v2}, Ll/ۗܰ֨;->᩷(Ll/ۗܰ֨;)Ll/᩷ۚ֨;

    move-result-object v3

    iget-object v3, v3, Ll/᩷ۚ֨;->ܿ֫:Ll/֡֡֨;

    if-ne v1, v3, :cond_4

    invoke-static {v2}, Ll/ۗܰ֨;->ۜ(Ll/ۗܰ֨;)Ll/ܽ֡֨;

    move-result-object v3

    sget-object v4, Ll/ܽ֡֨;->ۙ:Ll/ܽ֡֨;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_4

    .line 811
    invoke-static {v2}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v2

    sget-object v3, Ll/ᩴᩴ֨;->ۜۧ:Ll/ᩴᩴ֨;

    invoke-static {v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2455
    new-instance v4, Ll/۫۠۠;

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v5

    const-string v3, "mod.not.allowed.here"

    invoke-direct {v4, v7, v3, v6}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 811
    invoke-virtual {v2, p1, v4}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_1

    .line 813
    :cond_4
    sget-object v2, Ll/ۡᩴ֨;->ۗ:Ll/ۡᩴ֨;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 816
    :cond_5
    :goto_1
    new-instance v2, Ll/ۢᩴ֨;

    invoke-direct {v2, v1, v0}, Ll/ۢᩴ֨;-><init>(Ll/֡֡֨;Ljava/util/EnumSet;)V

    .line 817
    iput-object v2, p1, Ll/۫֡۠;->ۗ:Ll/ۢᩴ֨;

    .line 818
    iget-object p1, p0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v0, p1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    return-void
.end method

.method public final ֫(Ll/۬֡۠;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/۬᩵۠;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 824
    iget-object v2, v1, Ll/۬᩵۠;->۫:Ll/۫᩵۠;

    iget-object v3, v1, Ll/۬᩵۠;->۬:Ll/ۖܶ۠;

    invoke-static {v2}, Ll/۟ۚ۠;->ۜ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object v4

    .line 825
    iget-object v5, v0, Ll/᩶ܰ֨;->ܿ:Ll/ۗܰ֨;

    invoke-static {v5}, Ll/ۗܰ֨;->᩷(Ll/ۗܰ֨;)Ll/᩷ۚ֨;

    move-result-object v6

    iget-object v7, v0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    invoke-virtual {v6, v7, v4}, Ll/᩷ۚ֨;->ۧ(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/۠֡֨;

    move-result-object v4

    .line 826
    invoke-static {v5}, Ll/ۗܰ֨;->ۧ(Ll/ۗܰ֨;)Ll/ۢۗ֨;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5972
    new-instance v6, Ll/ۚۙ֨;

    invoke-direct {v6, v4}, Ll/ۚۙ֨;-><init>(Ll/۠֡֨;)V

    .line 5985
    invoke-virtual {v6, v2}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    .line 828
    new-instance v6, Ll/᩹ܰ֨;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v7, v0, Ll/᩶ܰ֨;->֫:Ljava/util/HashMap;

    invoke-static {v7, v4, v6}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖܶ۠;

    .line 829
    invoke-virtual {v6}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v12, "compiler"

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܿᩴ֨;

    .line 860
    invoke-static {v5}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 952
    new-instance v13, Ll/۫۠۠;

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v4, v11, v10

    const-string v10, "conflicting.exports"

    invoke-direct {v13, v12, v10, v11}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 860
    invoke-virtual {v9, v2, v13}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_0

    :cond_0
    if-eqz v3, :cond_6

    .line 835
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 836
    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۫᩵۠;

    .line 960
    invoke-static {v8}, Ll/۟ۚ۠;->ۜ(Ll/ۚۚ۠;)Ll/ۤܶ۠;

    move-result-object v9

    .line 961
    invoke-static {v5}, Ll/ۗܰ֨;->ܳ(Ll/ۗܰ֨;)Ll/ۛᩴ֨;

    move-result-object v10

    invoke-virtual {v10, v9}, Ll/ۛᩴ֨;->֫(Ll/ۤܶ۠;)Ll/֡֡֨;

    move-result-object v9

    .line 962
    invoke-static {v9, v8}, Ll/۟ۚ۠;->ۧ(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    .line 838
    invoke-static {v5}, Ll/ۗܰ֨;->ܽ(Ll/ۗܰ֨;)Ll/ܶ۬֨;

    move-result-object v10

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10, v8, v9}, Ll/ܶ۬֨;->֫(Ll/۫᩵۠;Ll/֡֡֨;)V

    .line 839
    invoke-virtual {v6}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const-string v14, "conflicting.exports.to.module"

    if-eqz v13, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܿᩴ֨;

    .line 865
    iget-object v13, v13, Ll/ܿᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-eqz v13, :cond_2

    .line 866
    invoke-virtual {v13}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    const/16 v16, 0x0

    check-cast v15, Ll/֡֡֨;

    if-ne v9, v15, :cond_1

    .line 875
    invoke-static {v5}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v15

    sget-object v17, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    move-object/from16 v18, v3

    .line 960
    new-instance v3, Ll/۫۠۠;

    move-object/from16 v17, v10

    new-array v10, v11, [Ljava/lang/Object;

    aput-object v9, v10, v16

    invoke-direct {v3, v12, v14, v10}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    invoke-virtual {v15, v8, v3}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_4

    :cond_1
    move-object/from16 v18, v3

    move-object/from16 v17, v10

    :goto_4
    move-object/from16 v10, v17

    move-object/from16 v3, v18

    goto :goto_3

    :cond_2
    move-object/from16 v18, v3

    move-object/from16 v17, v10

    move-object/from16 v10, v17

    move-object/from16 v3, v18

    goto :goto_2

    :cond_3
    move-object/from16 v18, v3

    const/4 v3, 0x0

    .line 842
    invoke-interface {v2, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    .line 875
    invoke-static {v5}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v10

    sget-object v13, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 960
    new-instance v13, Ll/۫۠۠;

    new-array v15, v11, [Ljava/lang/Object;

    aput-object v9, v15, v3

    invoke-direct {v13, v12, v14, v15}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    invoke-virtual {v10, v8, v13}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_4
    move-object/from16 v3, v18

    goto/16 :goto_1

    .line 846
    :cond_5
    invoke-static {v2}, Ll/ۖܶ۠;->֫(Ljava/lang/Iterable;)Ll/ۖܶ۠;

    move-result-object v2

    goto :goto_5

    :cond_6
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_8

    .line 849
    invoke-virtual {v2}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    return-void

    .line 850
    :cond_8
    :goto_6
    const-class v3, Ll/ܳᩴ֨;

    invoke-static {v3}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v3

    .line 851
    new-instance v5, Ll/ܿᩴ֨;

    invoke-direct {v5, v4, v2, v3}, Ll/ܿᩴ֨;-><init>(Ll/۠֡֨;Ll/ۖܶ۠;Ljava/util/EnumSet;)V

    .line 852
    iget-object v2, v0, Ll/᩶ܰ֨;->ᩳ:Ll/֡֡֨;

    iget-object v3, v2, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    invoke-virtual {v3, v5}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    iput-object v3, v2, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    .line 853
    iput-object v5, v1, Ll/۬᩵۠;->ۗ:Ll/ܿᩴ֨;

    .line 855
    invoke-virtual {v6, v5}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v7, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩷ۚ۠;)V
    .locals 0

    return-void
.end method
