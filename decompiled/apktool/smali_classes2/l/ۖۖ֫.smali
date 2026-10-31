.class public final Ll/ۖۖ֫;
.super Ljava/lang/Object;
.source "X32D"


# static fields
.field public static ܳ:Ll/ۖۖ֫;

.field public static final ᩻:Ljava/lang/Object;


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Landroid/content/Context;

.field public final ܽ:Landroid/os/Handler;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 100
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖۖ֫;->᩻:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    .line 92
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۖۖ֫;->֫:Ljava/util/HashMap;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖۖ֫;->ᩳ:Ljava/util/ArrayList;

    .line 114
    iput-object p1, p0, Ll/ۖۖ֫;->ۧ:Landroid/content/Context;

    .line 115
    new-instance v0, Ll/ۢۖ֫;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/ۢۖ֫;-><init>(Ll/ۖۖ֫;Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۖۖ֫;->ܽ:Landroid/os/Handler;

    return-void
.end method

.method public static ֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;
    .locals 2

    .line 105
    sget-object v0, Ll/ۖۖ֫;->᩻:Ljava/lang/Object;

    monitor-enter v0

    .line 106
    :try_start_0
    sget-object v1, Ll/ۖۖ֫;->ܳ:Ll/ۖۖ֫;

    if-nez v1, :cond_0

    .line 107
    new-instance v1, Ll/ۖۖ֫;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Ll/ۖۖ֫;-><init>(Landroid/content/Context;)V

    sput-object v1, Ll/ۖۖ֫;->ܳ:Ll/ۖۖ֫;

    .line 109
    :cond_0
    sget-object p0, Ll/ۖۖ֫;->ܳ:Ll/ۖۖ֫;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 110
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫()V
    .locals 9

    .line 298
    :cond_0
    iget-object v0, p0, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    monitor-enter v0

    .line 299
    :try_start_0
    iget-object v1, p0, Ll/ۖۖ֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_1

    .line 301
    monitor-exit v0

    return-void

    .line 303
    :cond_1
    new-array v2, v1, [Ll/ۡۖ֫;

    .line 304
    iget-object v3, p0, Ll/ۖۖ֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 305
    iget-object v3, p0, Ll/ۖۖ֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 306
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 308
    aget-object v3, v2, v0

    .line 309
    iget-object v4, v3, Ll/ۡۖ֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_3

    .line 311
    iget-object v6, v3, Ll/ۡۖ֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܺۖ֫;

    .line 312
    iget-boolean v7, v6, Ll/ܺۖ֫;->ۧ:Z

    if-nez v7, :cond_2

    .line 313
    iget-object v6, v6, Ll/ܺۖ֫;->ᩳ:Landroid/content/BroadcastReceiver;

    iget-object v7, p0, Ll/ۖۖ֫;->ۧ:Landroid/content/Context;

    iget-object v8, v3, Ll/ۡۖ֫;->֫:Landroid/content/Intent;

    invoke-virtual {v6, v7, v8}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 306
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Landroid/content/BroadcastReceiver;)V
    .locals 11

    .line 170
    iget-object v0, p0, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    monitor-enter v0

    .line 171
    :try_start_0
    iget-object v1, p0, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 173
    monitor-exit v0

    return-void

    .line 175
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_0
    if-ltz v2, :cond_5

    .line 176
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺۖ֫;

    .line 177
    iput-boolean v3, v4, Ll/ܺۖ֫;->ۧ:Z

    const/4 v5, 0x0

    .line 178
    :goto_1
    iget-object v6, v4, Ll/ܺۖ֫;->ܽ:Landroid/content/IntentFilter;

    invoke-virtual {v6}, Landroid/content/IntentFilter;->countActions()I

    move-result v6

    if-ge v5, v6, :cond_4

    .line 179
    iget-object v6, v4, Ll/ܺۖ֫;->ܽ:Landroid/content/IntentFilter;

    invoke-virtual {v6, v5}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v6

    .line 180
    iget-object v7, p0, Ll/ۖۖ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    if-eqz v7, :cond_3

    .line 182
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v3

    :goto_2
    if-ltz v8, :cond_2

    .line 183
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܺۖ֫;

    .line 184
    iget-object v10, v9, Ll/ܺۖ֫;->ᩳ:Landroid/content/BroadcastReceiver;

    if-ne v10, p1, :cond_1

    .line 185
    iput-boolean v3, v9, Ll/ܺۖ֫;->ۧ:Z

    .line 186
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v8, v8, -0x1

    goto :goto_2

    .line 189
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-gtz v7, :cond_3

    .line 190
    iget-object v7, p0, Ll/ۖۖ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 195
    :cond_5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 6

    .line 140
    iget-object v0, p0, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    monitor-enter v0

    .line 141
    :try_start_0
    new-instance v1, Ll/ܺۖ֫;

    invoke-direct {v1, p1, p2}, Ll/ܺۖ֫;-><init>(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 142
    iget-object v2, p0, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    const/4 v3, 0x1

    if-nez v2, :cond_0

    .line 144
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    iget-object v4, p0, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v4, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 148
    :goto_0
    invoke-virtual {p2}, Landroid/content/IntentFilter;->countActions()I

    move-result v2

    if-ge p1, v2, :cond_2

    .line 149
    invoke-virtual {p2, p1}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v2

    .line 150
    iget-object v4, p0, Ll/ۖۖ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_1

    .line 152
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    iget-object v5, p0, Ll/ۖۖ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 157
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Landroid/content/Intent;)Z
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 213
    iget-object v2, v1, Ll/ۖۖ֫;->ܿ:Ljava/util/HashMap;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 214
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 215
    iget-object v3, v1, Ll/ۖۖ֫;->ۧ:Landroid/content/Context;

    .line 216
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    .line 215
    invoke-virtual {v0, v3}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v10

    .line 217
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v11

    .line 218
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v12

    .line 219
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v13

    .line 222
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getFlags()I

    move-result v3

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v15, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v15, 0x0

    :goto_0
    if-eqz v15, :cond_1

    .line 223
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 227
    :cond_1
    iget-object v3, v1, Ll/ۖۖ֫;->֫:Ljava/util/HashMap;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/util/ArrayList;

    if-eqz v9, :cond_b

    if-eqz v15, :cond_2

    .line 229
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_2
    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v8, v3

    const/4 v7, 0x0

    .line 232
    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v7, v3, :cond_8

    .line 233
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ll/ܺۖ֫;

    if-eqz v15, :cond_3

    .line 234
    iget-object v3, v6, Ll/ܺۖ֫;->ܽ:Landroid/content/IntentFilter;

    invoke-static {v3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 236
    :cond_3
    iget-boolean v3, v6, Ll/ܺۖ֫;->֫:Z

    if-eqz v3, :cond_4

    move-object/from16 v19, v2

    move/from16 v18, v7

    move-object v2, v8

    move-object/from16 v20, v9

    goto :goto_3

    .line 243
    :cond_4
    iget-object v3, v6, Ll/ܺۖ֫;->ܽ:Landroid/content/IntentFilter;

    const-string v17, "LocalBroadcastManager"

    move-object v4, v2

    move-object v5, v10

    move-object v14, v6

    move-object v6, v12

    move/from16 v18, v7

    move-object v7, v11

    move-object/from16 v19, v2

    move-object v2, v8

    move-object v8, v13

    move-object/from16 v20, v9

    move-object/from16 v9, v17

    invoke-virtual/range {v3 .. v9}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_7

    if-eqz v15, :cond_5

    .line 247
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    :cond_5
    if-nez v2, :cond_6

    .line 249
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    :cond_6
    move-object v8, v2

    .line 251
    :goto_2
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    .line 252
    iput-boolean v2, v14, Ll/ܺۖ֫;->֫:Z

    goto :goto_4

    :cond_7
    :goto_3
    move-object v8, v2

    :goto_4
    add-int/lit8 v7, v18, 0x1

    move-object/from16 v2, v19

    move-object/from16 v9, v20

    goto :goto_1

    :cond_8
    move-object v2, v8

    if-eqz v2, :cond_b

    const/4 v3, 0x0

    .line 269
    :goto_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_9

    .line 270
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺۖ֫;

    const/4 v5, 0x0

    iput-boolean v5, v4, Ll/ܺۖ֫;->֫:Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 272
    :cond_9
    iget-object v3, v1, Ll/ۖۖ֫;->ᩳ:Ljava/util/ArrayList;

    new-instance v4, Ll/ۡۖ֫;

    invoke-direct {v4, v0, v2}, Ll/ۡۖ֫;-><init>(Landroid/content/Intent;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    iget-object v0, v1, Ll/ۖۖ֫;->ܽ:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_a

    .line 274
    iget-object v0, v1, Ll/ۖۖ֫;->ܽ:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 276
    :cond_a
    monitor-exit v16

    return v2

    .line 279
    :cond_b
    monitor-exit v16

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final ۧ(Landroid/content/Intent;)V
    .locals 0

    .line 289
    invoke-virtual {p0, p1}, Ll/ۖۖ֫;->֫(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 290
    invoke-virtual {p0}, Ll/ۖۖ֫;->֫()V

    :cond_0
    return-void
.end method
