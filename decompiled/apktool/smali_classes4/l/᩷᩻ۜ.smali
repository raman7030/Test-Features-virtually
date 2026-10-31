.class public final Ll/᩷᩻ۜ;
.super Ljava/lang/Object;
.source "Q78Q"


# instance fields
.field public final ֫:Ll/ܺ۟᩻;

.field public final ۧ:Ll/ۤۧۜ;


# direct methods
.method public constructor <init>(Ll/۠᩷ۜ;Ll/ۨۨ᩻;Ll/ܺ۟᩻;Ll/ۤۧۜ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p3, p0, Ll/᩷᩻ۜ;->֫:Ll/ܺ۟᩻;

    .line 40
    iput-object p4, p0, Ll/᩷᩻ۜ;->ۧ:Ll/ۤۧۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳ᩻ۜ;Ll/ۨ᩻ۜ;)Ll/᩶ۜۜ;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 80
    iget-object v3, v2, Ll/ۨ᩻ۜ;->᩻:Ljava/lang/String;

    const/16 v4, 0x2f

    const/16 v5, 0x2e

    if-nez v3, :cond_0

    const-string v3, ""

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    .line 82
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 83
    iget-object v7, v1, Ll/᩷᩻ۜ;->֫:Ll/ܺ۟᩻;

    iget-object v8, v2, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    move-object/from16 v16, v7

    .line 0
    monitor-enter v16

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 2014
    :try_start_0
    invoke-virtual {v7, v0, v8, v10, v9}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;ZLl/ܺۨ᩻;)Ljava/util/ArrayList;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v16

    .line 83
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v14, 0x0

    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿ᩺᩻;

    .line 96
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_2

    .line 99
    :cond_2
    iget-object v9, v8, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-static {v9}, Ll/ܳ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 100
    invoke-static {v9}, Ll/ᩳ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 101
    invoke-virtual {v9, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_3

    .line 102
    invoke-virtual {v10, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 87
    :cond_3
    :goto_2
    iget v9, v2, Ll/ۨ᩻ۜ;->ܳ:I

    if-lt v14, v9, :cond_6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    iget v10, v2, Ll/ۨ᩻ۜ;->ܽ:I

    if-ge v9, v10, :cond_6

    .line 88
    iget-object v9, v1, Ll/᩷᩻ۜ;->֫:Ll/ܺ۟᩻;

    iget-object v10, v2, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v9, v0, v10, v8}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;Ll/ܿ᩺᩻;)Ll/۠ۛ֡;

    move-result-object v8

    .line 143
    invoke-virtual {v8}, Ll/۠ۛ֡;->getFields()Ljava/lang/Iterable;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۘ֫ۚ;

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 147
    :cond_4
    invoke-virtual {v8}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v11, 0x0

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩴ֫ۚ;

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 150
    :cond_5
    invoke-virtual {v8}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v8

    .line 151
    new-instance v9, Ll/᩺ۨ᩻;

    invoke-static {v8}, Ll/ᩳ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v9, v8, v10, v11, v12}, Ll/᩺ۨ᩻;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 88
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_1

    .line 93
    :cond_7
    iget v3, v2, Ll/ۨ᩻ۜ;->ܳ:I

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v3, v4

    if-ge v3, v14, :cond_8

    const/4 v4, 0x1

    const/16 v16, 0x1

    goto :goto_5

    :cond_8
    const/4 v4, 0x0

    const/16 v16, 0x0

    .line 95
    :goto_5
    new-instance v4, Ll/᩶ۜۜ;

    iget-object v10, v0, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    const-string v11, "dex_classes"

    iget-object v12, v2, Ll/ۨ᩻ۜ;->᩻:Ljava/lang/String;

    .line 96
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v13

    iget v15, v2, Ll/ۨ᩻ۜ;->ܽ:I

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v9, v4

    move/from16 v17, v3

    invoke-direct/range {v9 .. v21}, Ll/᩶ۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZILjava/lang/String;Ljava/lang/String;Ll/ۗ᩺᩻;I)V

    .line 98
    iget-object v0, v4, Ll/᩶ۜۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v4

    :catchall_0
    move-exception v0

    .line 2014
    :try_start_1
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ֫(Ll/ܳ᩻ۜ;Ll/ۨ᩻ۜ;Ll/ܺۨ᩻;)Ll/᩶ۜۜ;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 108
    iget-object v9, v1, Ll/ۨ᩻ۜ;->֫:Ljava/lang/String;

    iget v2, v1, Ll/ۨ᩻ۜ;->ܿ:I

    move-object/from16 v13, p0

    .line 109
    iget-object v3, v13, Ll/᩷᩻ۜ;->֫:Ll/ܺ۟᩻;

    iget-object v4, v1, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    move-object/from16 v5, p3

    invoke-virtual {v3, v0, v4, v9, v5}, Ll/ܺ۟᩻;->ۧ(Ll/ܳ᩻ۜ;Ljava/lang/String;Ljava/lang/String;Ll/ܺۨ᩻;)Ll/ܶ᩺᩻;

    move-result-object v3

    .line 111
    iget-object v4, v3, Ll/ܶ᩺᩻;->ܽ:Ljava/lang/String;

    invoke-static {v9, v4}, Ll/ۗ᩺᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗ᩺᩻;

    move-result-object v11

    .line 112
    iget-object v4, v3, Ll/ܶ᩺᩻;->ۧ:Ljava/util/LinkedHashMap;

    iget-object v3, v3, Ll/ܶ᩺᩻;->֫:Ljava/util/LinkedHashMap;

    .line 190
    iget-object v5, v11, Ll/ۗ᩺᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "field"

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩶᩺᩻;

    .line 191
    iget-object v10, v7, Ll/᩶᩺᩻;->ᩳ:Ljava/lang/String;

    iget-object v12, v7, Ll/᩶᩺᩻;->᩻:Ljava/lang/String;

    const-string v14, "method"

    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 192
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۙ᩺᩻;

    if-eqz v8, :cond_0

    .line 194
    iput-object v8, v7, Ll/᩶᩺᩻;->ܿ:Ll/ۙ᩺᩻;

    goto :goto_0

    .line 196
    :cond_1
    iget-object v10, v7, Ll/᩶᩺᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 197
    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩸᩺᩻;

    iput-object v8, v7, Ll/᩶᩺᩻;->ۧ:Ll/᩸᩺᩻;

    goto :goto_0

    .line 113
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 114
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 115
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v3, v2

    const/4 v7, 0x0

    :goto_1
    if-ge v3, v6, :cond_4

    .line 117
    iget v10, v1, Ll/ۨ᩻ۜ;->ᩳ:I

    if-ge v7, v10, :cond_4

    .line 118
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩶᩺᩻;

    .line 119
    iget-object v12, v10, Ll/᩶᩺᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 120
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 122
    :cond_3
    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    add-int v12, v2, v7

    if-ge v12, v6, :cond_5

    const/4 v2, 0x1

    const/4 v8, 0x1

    goto :goto_3

    :cond_5
    const/4 v8, 0x0

    .line 128
    :goto_3
    new-instance v10, Ll/᩶ۜۜ;

    iget-object v2, v0, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget v5, v1, Ll/ۨ᩻ۜ;->ᩳ:I

    const/16 v16, 0x0

    .line 130
    invoke-static {v9}, Ll/ᩳ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v3, "dex_class_outline"

    const-string v4, ""

    move-object v0, v10

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v7

    move v7, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move/from16 v8, v16

    move-object/from16 v18, v10

    move-object/from16 v10, v17

    invoke-direct/range {v0 .. v12}, Ll/᩶ۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZILjava/lang/String;Ljava/lang/String;Ll/ۗ᩺᩻;I)V

    move-object/from16 v0, v18

    .line 132
    iget-object v1, v0, Ll/᩶ۜۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 133
    iget-object v1, v0, Ll/᩶ۜۜ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final ۧ(Ll/ܳ᩻ۜ;Ll/ۨ᩻ۜ;)Ll/᩶ۜۜ;
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 49
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    iget-object v3, v1, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    iget v4, v1, Ll/ۨ᩻ۜ;->ܳ:I

    move-object/from16 v5, p0

    iget-object v6, v5, Ll/᩷᩻ۜ;->֫:Ll/ܺ۟᩻;

    invoke-virtual {v6, v0, v3}, Ll/ܺ۟᩻;->ܽ(Ll/ܳ᩻ۜ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v12, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰܳۜ;

    .line 52
    iget-object v7, v6, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    iget-object v8, v1, Ll/ۨ᩻ۜ;->᩻:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    if-lt v12, v4, :cond_1

    .line 55
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    iget v8, v1, Ll/ۨ᩻ۜ;->ܽ:I

    if-ge v7, v8, :cond_1

    .line 56
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int v15, v3, v4

    if-ge v15, v12, :cond_3

    const/4 v3, 0x1

    const/4 v14, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    const/4 v14, 0x0

    .line 62
    :goto_1
    new-instance v3, Ll/᩶ۜۜ;

    iget-object v8, v0, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget-object v10, v1, Ll/ۨ᩻ۜ;->᩻:Ljava/lang/String;

    .line 63
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    iget v13, v1, Ll/ۨ᩻ۜ;->ܽ:I

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v9, "zip_entries"

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v7, v3

    invoke-direct/range {v7 .. v19}, Ll/᩶ۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZILjava/lang/String;Ljava/lang/String;Ll/ۗ᩺᩻;I)V

    .line 65
    iget-object v1, v3, Ll/᩶ۜۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 67
    :try_start_0
    iget-object v1, v3, Ll/᩶ۜۜ;->ܿ:Ljava/util/HashMap;

    iget-object v4, v0, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    const-string v6, "cache"

    .line 405
    invoke-virtual {v4, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 68
    iget-object v6, v0, Ll/ܳ᩻ۜ;->֨:Ll/᩵ᩳۜ;

    iget-object v7, v0, Ll/ܳ᩻ۜ;->᩷:Ljava/util/ArrayList;

    .line 67
    invoke-static {v4, v6, v7, v2}, Ll/ۗۧۜ;->֫(Ll/ܶ᩵ܿ;Ll/᩵ᩳۜ;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 70
    :catch_0
    iget-object v1, v0, Ll/ܳ᩻ۜ;->᩶:Ljava/lang/String;

    iget-boolean v0, v0, Ll/ܳ᩻ۜ;->ۙ:Z

    invoke-static {v1, v0}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public final ܽ(Ll/ܳ᩻ۜ;Ll/ۨ᩻ۜ;)Ll/᩶ۜۜ;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    .line 142
    iget-object v3, v0, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    iget-object v4, v1, Ll/᩷᩻ۜ;->ۧ:Ll/ۤۧۜ;

    iget-object v5, v1, Ll/᩷᩻ۜ;->֫:Ll/ܺ۟᩻;

    invoke-virtual {v4, v2, v5, v3}, Ll/ۤۧۜ;->ۧ(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;)Ll/ۡᩳۜ;

    move-result-object v4

    .line 146
    :try_start_0
    iget-object v6, v0, Ll/ۨ᩻ۜ;->᩻:Ljava/lang/String;

    iget v7, v0, Ll/ۨ᩻ۜ;->ܳ:I

    iget v8, v0, Ll/ۨ᩻ۜ;->ܽ:I

    .line 165
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 166
    invoke-virtual {v5, v2, v3}, Ll/ܺ۟᩻;->ܽ(Ll/ܳ᩻ۜ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܰܳۜ;

    .line 167
    iget-object v10, v10, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 146
    :cond_0
    invoke-virtual {v4, v7, v8, v6, v9}, Ll/ۡᩳۜ;->֫(IILjava/lang/String;Ljava/util/HashSet;)Ll/ۛܽۜ;

    move-result-object v3
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v4, v3, Ll/ۛܽۜ;->ۧ:Ljava/util/ArrayList;

    .line 154
    new-instance v15, Ll/᩶ۜۜ;

    iget-object v6, v2, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget-object v8, v0, Ll/ۨ᩻ۜ;->᩻:Ljava/lang/String;

    .line 155
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    iget v10, v3, Ll/ۛܽۜ;->ᩳ:I

    iget v11, v0, Ll/ۨ᩻ۜ;->ܽ:I

    iget-boolean v12, v3, Ll/ۛܽۜ;->֫:Z

    iget v13, v3, Ll/ۛܽۜ;->ܽ:I

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v7, "resource_table"

    const/4 v14, 0x0

    const/4 v0, 0x0

    move-object v5, v15

    move-object v2, v15

    move-object v15, v0

    invoke-direct/range {v5 .. v17}, Ll/᩶ۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZILjava/lang/String;Ljava/lang/String;Ll/ۗ᩺᩻;I)V

    .line 157
    iget-object v0, v2, Ll/᩶ۜۜ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v2

    :catch_0
    move-exception v0

    .line 149
    invoke-static {v3}, Ll/ܺ۟᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 150
    invoke-static {v2, v0}, Ll/ۤۧۜ;->֫(Ll/ܳ᩻ۜ;Ll/ۗۛ᩻;)V

    .line 152
    :cond_1
    throw v0
.end method
