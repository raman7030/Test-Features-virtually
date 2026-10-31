.class public final Ll/᩵֨ۜ;
.super Ljava/lang/Object;
.source "274F"


# instance fields
.field public ֫:Ll/ۖ֨ۜ;

.field public ۜ:Ll/ᩴ᩺֫;

.field public final ۧ:Ljava/util/HashSet;

.field public final ܳ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ll/᩷ۛ᩻;

.field public final ᩳ:Ljava/util/HashSet;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/᩷ۛ᩻;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۜ;->ܳ:Ljava/util/HashMap;

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۜ;->ۧ:Ljava/util/HashSet;

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۜ;->ᩳ:Ljava/util/HashSet;

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۜ;->ܽ:Ljava/util/HashMap;

    .line 41
    iput-object p1, p0, Ll/᩵֨ۜ;->ܿ:Ll/᩷ۛ᩻;

    return-void
.end method

.method private ֫(Ll/ᩴ᩺֫;Ll/۫᩺֫;)V
    .locals 22

    move-object/from16 v0, p0

    .line 95
    iget-object v1, v0, Ll/᩵֨ۜ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 96
    iget-object v2, v0, Ll/᩵֨ۜ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 97
    iget-object v3, v0, Ll/᩵֨ۜ;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    .line 98
    iget-object v4, v0, Ll/᩵֨ۜ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    move-object/from16 v5, p2

    .line 99
    iget-object v5, v5, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬᩺֫;

    .line 100
    iget-object v6, v6, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    const/4 v7, 0x0

    move-object/from16 v8, p1

    invoke-virtual {v8, v6, v7}, Ll/ᩴ᩺֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v7

    if-nez v7, :cond_1

    goto :goto_0

    .line 101
    :cond_1
    iget-object v9, v7, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    .line 104
    invoke-virtual {v4, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iget-object v10, v7, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩸᩺֫;

    .line 106
    iget-object v12, v11, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    if-eqz v12, :cond_3

    .line 184
    new-instance v15, Ll/ᩴ֨ۜ;

    const-wide/16 v19, -0x1

    iget-object v13, v12, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    .line 185
    invoke-static {v9, v13}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    move-object/from16 v21, v4

    move-object/from16 p2, v5

    iget-wide v4, v12, Ll/᩹᩺֫;->᩹:J

    iget-wide v12, v12, Ll/᩹᩺֫;->᩸:J

    cmp-long v16, v12, v19

    if-nez v16, :cond_2

    move-wide/from16 v17, v19

    goto :goto_2

    :cond_2
    move-wide/from16 v17, v12

    :goto_2
    move-object v13, v15

    move-object v12, v15

    move-wide v15, v4

    .line 187
    invoke-direct/range {v13 .. v18}, Ll/ᩴ֨ۜ;-><init>(Landroid/net/Uri;JJ)V

    .line 107
    invoke-virtual {v3, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    move-object/from16 v21, v4

    move-object/from16 p2, v5

    const-wide/16 v19, -0x1

    .line 184
    :goto_3
    new-instance v4, Ll/ᩴ֨ۜ;

    iget-object v5, v11, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    .line 185
    invoke-static {v9, v5}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    iget-wide v14, v11, Ll/᩹᩺֫;->᩹:J

    move-object v5, v9

    iget-wide v8, v11, Ll/᩹᩺֫;->᩸:J

    cmp-long v12, v8, v19

    if-nez v12, :cond_4

    move-wide/from16 v16, v19

    goto :goto_4

    :cond_4
    move-wide/from16 v16, v8

    :goto_4
    move-object v12, v4

    .line 187
    invoke-direct/range {v12 .. v17}, Ll/ᩴ֨ۜ;-><init>(Landroid/net/Uri;JJ)V

    .line 110
    new-instance v8, Ll/ۘ֨ۜ;

    invoke-direct {v8, v6, v7, v11}, Ll/ۘ֨ۜ;-><init>(Landroid/net/Uri;Ll/ۙ᩺֫;Ll/᩸᩺֫;)V

    invoke-static {v1, v4, v8}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۘ֨ۜ;

    if-eqz v8, :cond_5

    .line 112
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5
    move-object/from16 v8, p1

    move-object v9, v5

    move-object/from16 v4, v21

    move-object/from16 v5, p2

    goto :goto_1

    :cond_6
    return-void
.end method

.method private ܽ()V
    .locals 4

    .line 80
    iget-object v0, p0, Ll/᩵֨ۜ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/᩵֨ۜ;->ᩳ:Ljava/util/HashSet;

    iget-object v3, p0, Ll/᩵֨ۜ;->ۧ:Ljava/util/HashSet;

    if-eqz v1, :cond_0

    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    if-nez v1, :cond_0

    return-void

    .line 84
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 85
    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    .line 86
    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 87
    iget-object v0, p0, Ll/᩵֨ۜ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    .line 89
    iget-wide v0, p0, Ll/᩵֨ۜ;->᩻:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩵֨ۜ;->᩻:J

    .line 90
    iget-object v0, p0, Ll/᩵֨ۜ;->ܿ:Ll/᩷ۛ᩻;

    invoke-virtual {v0}, Ll/᩷ۛ᩻;->run()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 162
    :try_start_0
    iget-object v1, p0, Ll/᩵֨ۜ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 163
    iget-object v1, p0, Ll/᩵֨ۜ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 164
    iget-object v1, p0, Ll/᩵֨ۜ;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 165
    iget-object v1, p0, Ll/᩵֨ۜ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    const/4 v1, 0x0

    .line 166
    iput-object v1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    .line 167
    iput-object v1, p0, Ll/᩵֨ۜ;->ۜ:Ll/ᩴ᩺֫;

    .line 168
    iget-wide v1, p0, Ll/᩵֨ۜ;->᩻:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩵֨ۜ;->᩻:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Landroid/net/Uri;Ll/ۙ᩺֫;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 52
    :try_start_0
    iget-object v1, p0, Ll/᩵֨ۜ;->ۜ:Ll/ᩴ᩺֫;

    if-eqz p2, :cond_7

    if-nez v1, :cond_0

    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {v1}, Ll/ᩴ᩺֫;->ۧ()Ll/۫᩺֫;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 57
    iget-object v3, v2, Ll/۫᩺֫;->ۖ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 173
    :cond_1
    iget-object v3, v2, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬᩺֫;

    .line 174
    iget-object v4, v4, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    invoke-virtual {v4, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 65
    iget-object v3, p0, Ll/᩵֨ۜ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, p2, :cond_3

    .line 66
    monitor-exit v0

    return-void

    .line 68
    :cond_3
    :try_start_1
    iget-object v3, p0, Ll/᩵֨ۜ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-object p1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    .line 70
    iput-object p1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    .line 71
    iget-object p1, p0, Ll/᩵֨ۜ;->ܿ:Ll/᩷ۛ᩻;

    invoke-virtual {p1}, Ll/᩷ۛ᩻;->run()V

    .line 74
    :cond_4
    invoke-direct {p0, v1, v2}, Ll/᩵֨ۜ;->֫(Ll/ᩴ᩺֫;Ll/۫᩺֫;)V

    .line 75
    iget-wide p1, p0, Ll/᩵֨ۜ;->᩻:J

    const-wide/16 v1, 0x1

    add-long/2addr p1, v1

    iput-wide p1, p0, Ll/᩵֨ۜ;->᩻:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    monitor-exit v0

    return-void

    .line 63
    :cond_5
    monitor-exit v0

    return-void

    .line 58
    :cond_6
    :goto_0
    :try_start_2
    invoke-direct {p0}, Ll/᩵֨ۜ;->ܽ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    monitor-exit v0

    return-void

    .line 54
    :cond_7
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ۗ۠֫;)V
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 121
    :try_start_0
    new-instance v8, Ll/ᩴ֨ۜ;

    iget-object v2, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v3, p1, Ll/ۗ۠֫;->᩻:J

    iget-wide v5, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v9, -0x1

    cmp-long p1, v5, v9

    if-nez p1, :cond_0

    move-wide v5, v9

    :cond_0
    move-object v1, v8

    .line 124
    invoke-direct/range {v1 .. v6}, Ll/ᩴ֨ۜ;-><init>(Landroid/net/Uri;JJ)V

    .line 125
    iget-object p1, p0, Ll/᩵֨ۜ;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {p1, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 126
    monitor-exit v0

    return-void

    .line 128
    :cond_1
    :try_start_1
    iget-object p1, p0, Ll/᩵֨ۜ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {p1, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 129
    iget-object p1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 130
    iput-object p1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    .line 131
    iget-object p1, p0, Ll/᩵֨ۜ;->ܿ:Ll/᩷ۛ᩻;

    invoke-virtual {p1}, Ll/᩷ۛ᩻;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    :cond_2
    monitor-exit v0

    return-void

    .line 135
    :cond_3
    :try_start_2
    iget-object p1, p0, Ll/᩵֨ۜ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ֨ۜ;

    .line 136
    iget-object v1, p0, Ll/᩵֨ۜ;->ۜ:Ll/ᩴ᩺֫;

    if-eqz p1, :cond_7

    if-nez v1, :cond_4

    goto :goto_0

    .line 140
    :cond_4
    new-instance v10, Ll/ۖ֨ۜ;

    invoke-static {p1}, Ll/ۘ֨ۜ;->ۧ(Ll/ۘ֨ۜ;)Landroid/net/Uri;

    move-result-object v2

    iget-wide v3, p0, Ll/᩵֨ۜ;->᩻:J

    invoke-static {p1}, Ll/ۘ֨ۜ;->֫(Ll/ۘ֨ۜ;)Ll/ۙ᩺֫;

    move-result-object v5

    .line 144
    invoke-virtual {v1}, Ll/ᩴ᩺֫;->֫()J

    move-result-wide v6

    invoke-static {p1}, Ll/ۘ֨ۜ;->ܽ(Ll/ۘ֨ۜ;)Ll/᩸᩺֫;

    move-result-object v9

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Ll/ۖ֨ۜ;-><init>(Landroid/net/Uri;JLl/ۙ᩺֫;JLl/ᩴ֨ۜ;Ll/᩸᩺֫;)V

    .line 147
    iget-object p1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    if-eqz p1, :cond_6

    invoke-static {p1}, Ll/ۖ֨ۜ;->֫(Ll/ۖ֨ۜ;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {v10}, Ll/ۖ֨ۜ;->֫(Ll/ۖ֨ۜ;)Landroid/net/Uri;

    move-result-object v1

    .line 148
    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;

    invoke-static {p1}, Ll/ۖ֨ۜ;->ۧ(Ll/ۖ֨ۜ;)J

    move-result-wide v1

    invoke-static {v10}, Ll/ۖ֨ۜ;->ۧ(Ll/ۖ֨ۜ;)J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-eqz p1, :cond_6

    .line 150
    :cond_5
    iget-object p1, p0, Ll/᩵֨ۜ;->ܿ:Ll/᩷ۛ᩻;

    invoke-virtual {p1}, Ll/᩷ۛ᩻;->run()V

    .line 152
    :cond_6
    iput-object v10, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 153
    monitor-exit v0

    return-void

    .line 138
    :cond_7
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ᩴ᩺֫;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 46
    :try_start_0
    iput-object p1, p0, Ll/᩵֨ۜ;->ۜ:Ll/ᩴ᩺֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()Ll/ۖ֨ۜ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 158
    :try_start_0
    iget-object v1, p0, Ll/᩵֨ۜ;->֫:Ll/ۖ֨ۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
