.class public final Ll/֡ۨ֨;
.super Ljava/lang/Object;
.source "D7LF"


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public ۧ:Ljava/util/LinkedHashMap;

.field public ܳ:Ll/ۖܶ۠;

.field public ܽ:Ll/ۜۨ֨;

.field public ܿ:Ll/ۛ᩸֨;

.field public ᩳ:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۜۨ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/֡ۨ֨;->ۧ:Ljava/util/LinkedHashMap;

    .line 592
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֡ۨ֨;->֫:Ljava/util/HashMap;

    .line 93
    iput-object p2, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    .line 94
    iput-object p3, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    .line 95
    iput-object p1, p0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    .line 96
    iget-object p1, p1, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    iput-object p1, p0, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    return-void
.end method

.method private ֫(Ljava/util/function/Predicate;)Ll/ۖܶ۠;
    .locals 4

    .line 151
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 152
    iget-object v1, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 153
    check-cast v2, Ll/֨֨֨;

    .line 154
    invoke-interface {p1, v2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 155
    iget-object v2, v2, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 158
    :cond_1
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Ll/ܽۨ֨;Ll/֨᩸۠;)V
    .locals 13

    .line 488
    new-instance v0, Ll/ۚۛ֨;

    iget-object v1, p0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1, p0, p2}, Ll/ۚۛ֨;-><init>(Ll/ۜۨ֨;Ll/֡ۨ֨;Ll/֨᩸۠;)V

    .line 1639
    invoke-virtual {v1, p0, p2}, Ll/ۜۨ֨;->֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V

    .line 1640
    new-instance v2, Ll/֡ۛ֨;

    invoke-direct {v2, v0}, Ll/֡ۛ֨;-><init>(Ll/ۚۛ֨;)V

    .line 1641
    :goto_0
    invoke-interface {p1}, Ll/۠ۛ֨;->֫()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1642
    invoke-static {v1}, Ll/ۜۨ֨;->֫(Ll/ۜۨ֨;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 1644
    invoke-static {v1}, Ll/ۜۨ֨;->ۧ(Ll/ۜۨ֨;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1920
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1921
    iget-object v5, v2, Ll/֡ۛ֨;->ۧ:Ll/ۚۛ֨;

    iget-object v5, v5, Ll/ۚۛ֨;->֫:Ll/֡ۨ֨;

    iget-object v5, v5, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v5}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ֨֨;

    .line 1922
    check-cast v6, Ll/֨֨֨;

    .line 1923
    iget-object v7, v6, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    const/4 v8, 0x1

    new-array v9, v8, [Ll/᩵֨֨;

    sget-object v10, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    aput-object v10, v9, v3

    .line 1924
    invoke-virtual {v6, v9}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v9

    new-array v10, v8, [Ll/᩵֨֨;

    sget-object v11, Ll/᩵֨֨;->᩶:Ll/᩵֨֨;

    aput-object v11, v10, v3

    invoke-virtual {v6, v10}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v10

    new-array v11, v8, [Ll/᩵֨֨;

    sget-object v12, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    aput-object v12, v11, v3

    .line 1925
    invoke-virtual {v6, v11}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v6

    const/4 v11, 0x4

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v7, v11, v3

    aput-object v9, v11, v8

    const/4 v7, 0x2

    aput-object v10, v11, v7

    const/4 v7, 0x3

    aput-object v6, v11, v7

    const-string v6, "var %s - upper bounds = %s, lower bounds = %s, eq bounds = %s\\n"

    .line 1923
    invoke-static {v6, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1927
    :cond_0
    iget-object v3, v2, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "inferenceGraph"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v4}, Ll/ۚ۠۠;->֫(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1644
    invoke-virtual {v0, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۜۨ֨;->֫(Ll/ۜۨ֨;Ll/ۖܶ۠;)V

    .line 1646
    :cond_1
    invoke-interface {p1, v2}, Ll/۠ۛ֨;->֫(Ll/֡ۛ֨;)Ll/᩵ۛ֨;

    move-result-object v0

    .line 1647
    iget-object v3, v0, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Ll/ۖܶ۠;->֫(Ljava/lang/Iterable;)Ll/ۖܶ۠;

    move-result-object v3

    .line 1648
    invoke-virtual {p0}, Ll/֡ۨ֨;->ܿ()Ll/ۖܶ۠;

    move-result-object v4

    :goto_2
    const/4 v5, 0x0

    .line 1651
    :try_start_0
    invoke-virtual {p0}, Ll/֡ۨ֨;->ᩳ()Ll/ۖܶ۠;

    move-result-object v6

    invoke-static {v6, v3}, Ll/ۙ֨֨;->֫(Ll/ۖܶ۠;Ll/ۖܶ۠;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 1653
    invoke-static {}, Ll/ᩴۛ֨;->values()[Ll/ᩴۛ֨;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_3

    aget-object v9, v6, v8

    .line 1654
    iget-object v9, v9, Ll/ᩴۛ֨;->᩸:Ljava/util/EnumSet;

    invoke-virtual {p0, v3, v9}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;Ljava/util/EnumSet;)Ll/ۖܶ۠;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۖܶ۠;->ܽ()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 1655
    invoke-virtual {v1, p0, p2}, Ll/ۜۨ֨;->֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V

    goto :goto_2

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 1660
    :cond_3
    invoke-static {v5}, Ll/ۜۨ֨;->֫(Ll/ܽܶ۠;)Ll/۬ۛ֨;

    move-result-object v6

    throw v6
    :try_end_0
    .catch Ll/۬ۛ֨; {:try_start_0 .. :try_end_0} :catch_0

    .line 1665
    :catch_0
    invoke-virtual {p0, v4}, Ll/֡ۨ֨;->ܳ(Ll/ۖܶ۠;)V

    .line 1666
    invoke-virtual {v1, v3, p0}, Ll/ۜۨ֨;->֫(Ll/ۖܶ۠;Ll/֡ۨ֨;)V

    .line 1667
    invoke-virtual {v1, p0, p2}, Ll/ۜۨ֨;->֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V

    .line 1859
    :cond_4
    iget-object v3, v2, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ll/۫ۙ;->֫(Z)V

    .line 1860
    iget-object v3, v2, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1861
    invoke-virtual {v2, v0, v5}, Ll/֡ۛ֨;->֫(Ll/᩵ۛ֨;Ll/᩵ۛ֨;)V

    goto/16 :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 579
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Inference vars: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nUndet vars: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۖܶ۠;ZLl/֨᩸۠;)Ll/֡ۨ֨;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 338
    invoke-virtual/range {p1 .. p1}, Ll/ۖܶ۠;->ۧ()I

    move-result v2

    iget-object v3, v0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v3}, Ll/ۖܶ۠;->ۧ()I

    move-result v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 347
    :cond_0
    iget-object v2, v0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    .line 348
    sget-object v4, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {v3, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v4

    if-eqz v4, :cond_1

    check-cast v3, Ll/ۡ֨֨;

    invoke-virtual {v3}, Ll/ۡ֨֨;->۫֫()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 352
    :cond_2
    new-instance v2, Ll/᩵ۨ֨;

    invoke-direct {v2, v0}, Ll/᩵ۨ֨;-><init>(Ll/֡ۨ֨;)V

    .line 407
    invoke-static/range {p1 .. p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v3

    new-instance v4, Ll/ᩴۨ֨;

    invoke-direct {v4, v2}, Ll/ᩴۨ֨;-><init>(Ll/᩵ۨ֨;)V

    invoke-interface {v3, v4}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 354
    iget-object v3, v2, Ll/᩵ۨ֨;->᩹:Ljava/util/LinkedHashSet;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    iget-object v4, v0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v4}, Ll/ۖܶ۠;->ۧ()I

    move-result v4

    if-ne v3, v4, :cond_3

    :goto_0
    return-object v0

    .line 358
    :cond_3
    iget-object v3, v2, Ll/᩵ۨ֨;->᩹:Ljava/util/LinkedHashSet;

    invoke-static {v3}, Ll/ۖܶ۠;->֫(Ljava/lang/Iterable;)Ll/ۖܶ۠;

    move-result-object v3

    .line 359
    iget-object v4, v0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v4, v3}, Ll/ۖܶ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v4

    .line 362
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 363
    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙ֨֨;

    .line 364
    invoke-virtual {v0, v7}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    check-cast v7, Ll/֨֨֨;

    .line 365
    iget-object v8, v7, Ll/֨֨֨;->ܰ:Ljava/util/ArrayDeque;

    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    invoke-static {v8}, Ll/۫ۙ;->֫(Z)V

    .line 2029
    new-instance v8, Ll/֨֨֨;

    iget-object v9, v7, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    check-cast v9, Ll/ۡ֨֨;

    iget-object v10, v7, Ll/֨֨֨;->ۧ֫:Ll/ۚ֨֨;

    iget-object v11, v0, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    invoke-direct {v8, v9, v10, v11}, Ll/֨֨֨;-><init>(Ll/ۡ֨֨;Ll/ۚ֨֨;Ll/ۛ᩸֨;)V

    .line 2030
    invoke-virtual {v7, v8, v11}, Ll/֨֨֨;->֫(Ll/֨֨֨;Ll/ۛ᩸֨;)V

    .line 367
    invoke-static {}, Ll/᩵֨֨;->values()[Ll/᩵֨֨;

    move-result-object v9

    array-length v10, v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v10, :cond_4

    aget-object v13, v9, v12

    const/4 v14, 0x1

    new-array v14, v14, [Ll/᩵֨֨;

    .line 368
    aput-object v13, v14, v11

    invoke-virtual {v7, v14}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v11

    invoke-static {v11}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v11

    new-instance v14, Ll/ۗܿۢ;

    const/4 v15, 0x3

    invoke-direct {v14, v15, v4}, Ll/ۗܿۢ;-><init>(ILjava/lang/Object;)V

    .line 369
    invoke-interface {v11, v14}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v11

    .line 370
    invoke-static {}, Ll/ۖܶ۠;->ܿ()Ll/ۨۨᩴ;

    move-result-object v14

    invoke-interface {v11, v14}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖܶ۠;

    .line 371
    invoke-virtual {v8, v13, v11}, Ll/֨֨֨;->֫(Ll/᩵֨֨;Ll/ۖܶ۠;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v11, 0x0

    goto :goto_2

    .line 227
    :cond_4
    invoke-virtual {v5, v8}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 377
    :cond_5
    new-instance v6, Ll/֡ۨ֨;

    iget-object v7, v0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    invoke-direct {v6, v7, v3, v5}, Ll/֡ۨ֨;-><init>(Ll/ۜۨ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    .line 378
    iget-object v5, v6, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v5}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙ֨֨;

    .line 380
    invoke-static {v7}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v8

    new-instance v9, Ll/᩷ۨ֨;

    invoke-direct {v9, v0, v7, v2, v1}, Ll/᩷ۨ֨;-><init>(Ll/֡ۨ֨;Ll/ۙ֨֨;Ll/᩵ۨ֨;Ll/֨᩸۠;)V

    invoke-virtual {v6, v8, v9}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;Ll/ۘۛ֨;)V

    goto :goto_3

    :cond_6
    if-eqz p2, :cond_7

    .line 391
    iget-object v2, v2, Ll/᩵ۨ֨;->᩸:Ljava/util/LinkedHashSet;

    invoke-static {v2}, Ll/ۖܶ۠;->֫(Ljava/lang/Iterable;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ۖܶ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v2

    .line 392
    new-instance v4, Ll/ۢۨ֨;

    invoke-direct {v4, v0, v2, v1}, Ll/ۢۨ֨;-><init>(Ll/֡ۨ֨;Ll/ۖܶ۠;Ll/֨᩸۠;)V

    invoke-virtual {v6, v3, v4}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;Ll/ۘۛ֨;)V

    :cond_7
    return-object v6
.end method

.method public final ֫()Ll/ۖܶ۠;
    .locals 2

    .line 143
    new-instance v0, Ll/ᩳ᩶ܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/ᩳ᩶ܳ;-><init>(I)V

    invoke-direct {p0, v0}, Ll/֡ۨ֨;->֫(Ljava/util/function/Predicate;)Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 2

    .line 238
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 239
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 240
    invoke-virtual {p0, v1}, Ll/֡ۨ֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۖܶ۠;Ljava/util/EnumSet;)Ll/ۖܶ۠;
    .locals 5

    .line 533
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 534
    invoke-virtual {p0}, Ll/֡ۨ֨;->ᩳ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۖܶ۠;->ۧ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 535
    invoke-virtual {p0, v1}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    check-cast v1, Ll/֨֨֨;

    .line 536
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۨ֨;

    .line 537
    invoke-virtual {v3, v1, p0}, Ll/ۧۨ֨;->֫(Ll/֨֨֨;Ll/֡ۨ֨;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 538
    invoke-virtual {v3, v1, p0}, Ll/ۧۨ֨;->ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨֨֨;->ᩳ(Ll/ۙ֨֨;)V

    .line 539
    iget-object v1, v1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    .line 227
    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 544
    :cond_2
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 5

    .line 234
    iget-object v0, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    .line 220
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 221
    iget-object v2, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    .line 222
    check-cast v3, Ll/֨֨֨;

    .line 223
    invoke-virtual {v3}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v3, v3, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    :goto_1
    invoke-virtual {v1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 225
    :cond_1
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    .line 234
    iget-object v2, p0, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    invoke-virtual {v2, p1, v0, v1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/ۙ֨֨;Z)Ll/ۙ֨֨;
    .locals 2

    .line 595
    iget-object v0, p0, Ll/֡ۨ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    if-eqz v1, :cond_0

    return-object v1

    .line 600
    :cond_0
    iget-object v1, p0, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    if-eq v1, p2, :cond_1

    if-nez p3, :cond_1

    .line 602
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public final ֫(Ll/֡ۨ֨;Z)V
    .locals 3

    .line 327
    iget-object v0, p1, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    iget-object v1, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 327
    iput-object v0, p1, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    if-eqz p2, :cond_0

    .line 328
    invoke-virtual {p0}, Ll/֡ۨ֨;->ܿ()Ll/ۖܶ۠;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    .line 329
    :goto_0
    iget-object v0, p1, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {p2, v0}, Ll/ۖܶ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p2, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    .line 329
    iput-object p2, p1, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    .line 332
    iget-object p2, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 333
    iget-object v1, p1, Ll/֡ۨ֨;->ۧ:Ljava/util/LinkedHashMap;

    new-instance v2, Ll/ۡۨ֨;

    invoke-direct {v2, p0}, Ll/ۡۨ֨;-><init>(Ll/֡ۨ֨;)V

    invoke-static {v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/֨᩸۠;)V
    .locals 2

    .line 496
    new-instance v0, Ll/ܺۨ֨;

    iget-object v1, p0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Ll/ܺۨ֨;-><init>(Ll/֡ۨ֨;Ll/ۜۨ֨;)V

    invoke-direct {p0, v0, p1}, Ll/֡ۨ֨;->֫(Ll/ܽۨ֨;Ll/֨᩸۠;)V

    return-void
.end method

.method public final ֫(Ll/ۖܶ۠;Ll/֨᩸۠;)V
    .locals 2

    .line 507
    new-instance v0, Ll/ۖۨ֨;

    iget-object v1, p0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, p0, v1, p1, p1}, Ll/ۖۨ֨;-><init>(Ll/֡ۨ֨;Ll/ۜۨ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    invoke-direct {p0, v0, p2}, Ll/֡ۨ֨;->֫(Ll/ܽۨ֨;Ll/֨᩸۠;)V

    return-void
.end method

.method public final ֫(Ll/ۖܶ۠;Ll/ۘۛ֨;)V
    .locals 1

    .line 249
    iget-object v0, p0, Ll/֡ۨ֨;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, p1}, Ll/֡ۨ֨;->ᩳ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(ZLl/֨᩸۠;Ljava/util/EnumSet;)V
    .locals 5

    .line 529
    :cond_0
    iget-object v0, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p0, v0, p3}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;Ljava/util/EnumSet;)Ll/ۖܶ۠;

    move-result-object v0

    .line 557
    invoke-virtual {p0}, Ll/֡ۨ֨;->ᩳ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    if-nez v1, :cond_3

    if-eqz p1, :cond_1

    goto :goto_1

    .line 560
    :cond_1
    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 563
    invoke-virtual {p0}, Ll/֡ۨ֨;->ᩳ()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v2, p1, p0}, Ll/ۜۨ֨;->֫(Ll/ۖܶ۠;Ll/֡ۨ֨;)V

    goto :goto_1

    .line 568
    :cond_2
    iget-object v1, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 569
    check-cast v2, Ll/֨֨֨;

    .line 570
    invoke-virtual {p0, v0}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v3

    iget-object v4, p0, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    invoke-virtual {v2, v4, v0, v3}, Ll/֨֨֨;->֫(Ll/ۛ᩸֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    goto :goto_0

    .line 574
    :cond_3
    :goto_1
    invoke-virtual {v2, p0, p2}, Ll/ۜۨ֨;->֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V

    return-void
.end method

.method public final ۧ()Ll/ۖܶ۠;
    .locals 2

    .line 135
    new-instance v0, Ll/֡ܰ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/֡ܰ֨;-><init>(I)V

    invoke-direct {p0, v0}, Ll/֡ۨ֨;->֫(Ljava/util/function/Predicate;)Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 2

    .line 212
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 213
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 214
    invoke-virtual {p0, v1}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 216
    :cond_0
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 3

    .line 208
    iget-object v0, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    iget-object v1, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    iget-object v2, p0, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    invoke-virtual {v2, p1, v0, v1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۖܶ۠;Ll/֨᩸۠;)V
    .locals 3

    .line 518
    new-instance v0, Ll/ۘۨ֨;

    iget-object v1, p0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ll/֡ۨ֨;->ᩳ()Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۖܶ۠;->ۧ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-direct {v0, p0, v1, p1}, Ll/ۘۨ֨;-><init>(Ll/֡ۨ֨;Ll/ۜۨ֨;Ll/ۖܶ۠;)V

    invoke-direct {p0, v0, p2}, Ll/֡ۨ֨;->֫(Ll/ܽۨ֨;Ll/֨᩸۠;)V

    return-void
.end method

.method public final ܳ(Ll/ۖܶ۠;)V
    .locals 7

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 298
    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 300
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 301
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 302
    :goto_1
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 303
    iget-object v2, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    iget-object v3, v2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/֨֨֨;

    .line 304
    iget-object v4, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v4, Ll/֨֨֨;

    .line 305
    iget-object v5, v3, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object v6, v4, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    if-ne v5, v6, :cond_1

    .line 306
    iget-object v2, p0, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    invoke-virtual {v4, v3, v2}, Ll/֨֨֨;->֫(Ll/֨֨֨;Ll/ۛ᩸֨;)V

    .line 307
    iget-object v2, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    iget-object v2, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v2, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    .line 308
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 227
    invoke-virtual {v0, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 310
    iget-object v2, v3, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    .line 227
    invoke-virtual {v1, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 312
    :cond_1
    iget-object v2, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v2, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    goto :goto_1

    .line 315
    :cond_2
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    .line 316
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    return-void
.end method

.method public final ܽ(Ll/ۙ֨֨;)Ll/ۖܶ۠;
    .locals 4

    .line 179
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 112
    iget-object v1, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    .line 180
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 181
    invoke-virtual {p1, v2}, Ll/ۙ֨֨;->֫(Ll/ۙ֨֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 227
    invoke-virtual {v0, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 185
    :cond_1
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()V
    .locals 2

    .line 257
    iget-object v0, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p0}, Ll/֡ۨ֨;->ᩳ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֡ۨ֨;->ܿ(Ll/ۖܶ۠;)V

    return-void
.end method

.method public final ܽ(Ll/ۖܶ۠;)Z
    .locals 2

    .line 169
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 165
    iget-object v1, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()Ll/ۖܶ۠;
    .locals 7

    .line 286
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 287
    iget-object v1, p0, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 288
    check-cast v2, Ll/֨֨֨;

    iget-object v3, p0, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    iget-object v3, v3, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    .line 2029
    new-instance v4, Ll/֨֨֨;

    iget-object v5, v2, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    check-cast v5, Ll/ۡ֨֨;

    iget-object v6, v2, Ll/֨֨֨;->ۧ֫:Ll/ۚ֨֨;

    invoke-direct {v4, v5, v6, v3}, Ll/֨֨֨;-><init>(Ll/ۡ֨֨;Ll/ۚ֨֨;Ll/ۛ᩸֨;)V

    .line 2030
    invoke-virtual {v2, v4, v3}, Ll/֨֨֨;->֫(Ll/֨֨֨;Ll/ۛ᩸֨;)V

    .line 227
    invoke-virtual {v0, v4}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 290
    :cond_0
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ(Ll/ۖܶ۠;)V
    .locals 6

    .line 263
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Ll/֡ۨ֨;->ۧ:Ljava/util/LinkedHashMap;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 264
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖܶ۠;

    iget-object v5, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {v5, p1}, Ll/ۖܶ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ۙ֨֨;->֫(Ll/ۖܶ۠;Ll/ۖܶ۠;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 266
    :try_start_0
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘۛ֨;

    invoke-interface {v4, p0}, Ll/ۘۛ֨;->֫(Ll/֡ۨ֨;)V

    .line 267
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ll/۬ۛ֨; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return-void

    .line 278
    :cond_2
    throw v2
.end method

.method public final ᩳ()Ll/ۖܶ۠;
    .locals 2

    .line 127
    new-instance v0, Ll/ܺܰ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ܺܰ֨;-><init>(I)V

    invoke-direct {p0, v0}, Ll/֡ۨ֨;->֫(Ljava/util/function/Predicate;)Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 3

    .line 189
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 190
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 191
    invoke-virtual {p0, v1}, Ll/֡ۨ֨;->ܽ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ll/ۖܶ۠;)V

    goto :goto_0

    .line 193
    :cond_0
    new-instance p1, Ll/ᩴܶ۠;

    invoke-direct {p1}, Ll/ᩴܶ۠;-><init>()V

    .line 194
    invoke-virtual {v0}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 195
    invoke-virtual {p1, v1}, Ll/ᩴܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 227
    invoke-virtual {p1, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 199
    :cond_2
    invoke-virtual {p1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
