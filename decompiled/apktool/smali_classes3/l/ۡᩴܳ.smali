.class public final Ll/ۡᩴܳ;
.super Ljava/lang/Object;
.source "OAYY"


# static fields
.field public static final ֫:Ljava/util/ArrayList;

.field public static final ۧ:Ll/ۡᩴܳ;

.field public static final ܳ:Ll/ۧۤᩴ;

.field public static final ܽ:Landroid/content/SharedPreferences;

.field public static final ܿ:Ll/ۢᩴܳ;

.field public static final ᩳ:Ll/ۚۡ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 2
    new-instance v0, Ll/ۡᩴܳ;

    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    .line 53
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    .line 55
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    const-string v3, "bookmarks"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    sput-object v2, Ll/ۡᩴܳ;->ܽ:Landroid/content/SharedPreferences;

    .line 56
    new-instance v3, Ll/ۚۡ֫;

    invoke-direct {v3}, Ll/ۚۡ֫;-><init>()V

    sput-object v3, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    .line 58
    new-instance v3, Ll/ۧۤᩴ;

    invoke-direct {v3}, Ll/ۧۤᩴ;-><init>()V

    sput-object v3, Ll/ۡᩴܳ;->ܳ:Ll/ۧۤᩴ;

    .line 61
    new-instance v3, Ll/ۢᩴܳ;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    sput-object v3, Ll/ۡᩴܳ;->ܿ:Ll/ۢᩴܳ;

    .line 73
    new-instance v3, Ll/ۙۘܳ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Ll/۫᩻᩻;->֫(Ll/֨ۡ֫;)V

    .line 405
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "bookmarks_data_new"

    invoke-interface {v3, v5}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v3

    const v6, 0x62323434

    const-string v7, "backup"

    const/4 v8, 0x0

    if-nez v3, :cond_3

    invoke-interface {v2, v7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 429
    :cond_0
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "bookmarks_data"

    invoke-interface {v3, v5}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 430
    new-instance v3, Ll/ۜᩴܳ;

    invoke-direct {v3, v8}, Ll/ۜᩴܳ;-><init>(Ljava/lang/String;)V

    .line 431
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v7, v5, v8}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v7

    if-eqz v7, :cond_4

    .line 433
    array-length v9, v7

    const/4 v10, 0x6

    if-ge v9, v10, :cond_1

    goto :goto_2

    .line 434
    :cond_1
    new-instance v9, Ll/۬ۜܽ;

    invoke-direct {v9, v7}, Ll/۬ۜܽ;-><init>([B)V

    .line 435
    invoke-virtual {v9}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    if-ne v7, v6, :cond_4

    .line 436
    invoke-virtual {v9}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v7, :cond_2

    .line 438
    new-instance v11, Ll/ܽᩴܳ;

    invoke-virtual {v9}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Ll/ܽᩴܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    invoke-virtual {v3}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 441
    :cond_2
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v3}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v3

    invoke-interface {v3, v5}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    .line 442
    invoke-direct {v0}, Ll/ۡᩴܳ;->֡()V

    goto :goto_2

    .line 408
    :cond_3
    :goto_1
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0, v5, v8}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v0

    .line 409
    invoke-static {v0}, Ll/ۡᩴܳ;->ۧ([B)Z

    move-result v0

    if-nez v0, :cond_4

    :try_start_0
    const-string v0, ""

    .line 413
    invoke-interface {v2, v7, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 412
    invoke-static {v0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 411
    sget v3, Ll/ۘۤۡ;->֫:I

    .line 195
    array-length v3, v0

    invoke-static {v0, v3}, Ll/ۘۤۡ;->ۧ([BI)[B

    move-result-object v0

    .line 419
    invoke-static {v0}, Ll/ۡᩴܳ;->ۧ([B)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 420
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v3}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v3

    invoke-interface {v3, v5, v0}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[B)Ll/۬ۤۡ;

    move-result-object v0

    .line 421
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 35
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 546
    invoke-virtual {v3, v0, v8}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 447
    :cond_4
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v3, "\rH\rI\rS\r"

    if-eqz v0, :cond_5

    .line 448
    new-instance v0, Ll/ۜᩴܳ;

    invoke-direct {v0, v3}, Ll/ۜᩴܳ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    new-instance v0, Ll/ۜᩴܳ;

    invoke-direct {v0, v8}, Ll/ۜᩴܳ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 451
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ll/ۜᩴܳ;

    invoke-virtual {v7}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_3

    :cond_7
    move-object v5, v8

    :goto_3
    check-cast v5, Ll/ۜᩴܳ;

    if-nez v5, :cond_8

    .line 453
    new-instance v0, Ll/ۜᩴܳ;

    invoke-direct {v0, v3}, Ll/ۜᩴܳ;-><init>(Ljava/lang/String;)V

    .line 451
    invoke-virtual {v1, v4, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    .line 455
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/ۜᩴܳ;

    invoke-virtual {v5}, Ll/ۜᩴܳ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_4

    :cond_a
    move-object v3, v8

    :goto_4
    check-cast v3, Ll/ۜᩴܳ;

    if-nez v3, :cond_b

    new-instance v0, Ll/ۜᩴܳ;

    invoke-direct {v0, v8}, Ll/ۜᩴܳ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_5
    const-string v0, "history"

    .line 457
    invoke-interface {v2, v0, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 460
    :try_start_1
    invoke-static {}, Ll/ۡᩴܳ;->ۖ()Ll/ۜᩴܳ;

    move-result-object v1

    .line 461
    invoke-static {v0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v0

    .line 462
    invoke-static {v0, v6}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 463
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v2

    .line 464
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    :goto_6
    if-ge v4, v2, :cond_c

    .line 466
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v0}, Ll/֫ᩴܳ;->֫(Ll/۬ۜܽ;)Ll/ܽᩴܳ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 472
    :catch_1
    :cond_c
    sget-object v0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 473
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    return-void
.end method

.method private final declared-synchronized ֡()V
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 493
    :try_start_0
    sget-object v1, Ll/ۡᩴܳ;->ܿ:Ll/ۢᩴܳ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    :try_start_1
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    const v3, 0x62323434

    .line 496
    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 497
    sget-object v3, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v1, v4}, Ll/ۤۜܽ;->ۡ(I)V

    .line 1915
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜᩴܳ;

    .line 499
    invoke-virtual {v4}, Ll/ۜᩴܳ;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 500
    invoke-virtual {v4}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 501
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    goto :goto_0

    .line 503
    :cond_1
    invoke-virtual {v4}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v1, v5}, Ll/ۤۜܽ;->ۡ(I)V

    .line 504
    invoke-virtual {v4}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v4

    .line 1915
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽᩴܳ;

    .line 504
    invoke-virtual {v5, v1}, Ll/ܽᩴܳ;->֫(Ll/ۤۜܽ;)V

    goto :goto_1

    .line 507
    :cond_2
    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v1

    .line 508
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v3}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v3

    const-string v4, "bookmarks_data_new"

    invoke-interface {v3, v4, v1}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[B)Ll/۬ۤۡ;

    move-result-object v3

    .line 509
    invoke-interface {v3}, Ll/۬ۤۡ;->apply()V

    .line 510
    const-class v3, Ll/ۡᩴܳ;

    new-instance v4, Ll/ܳۖᩳ;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v1}, Ll/ܳۖᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v5, 0x3e8

    invoke-static {v3, v5, v6, v4}, Ll/֫ۨۡ;->֫(Ljava/lang/Object;JLjava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/ConcurrentModificationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 35
    :try_start_2
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v2

    if-eqz v2, :cond_3

    const/4 v3, 0x0

    .line 546
    invoke-virtual {v2, v1, v3}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_2

    .line 517
    :catch_1
    sget-object v1, Ll/ۡᩴܳ;->ܿ:Ll/ۢᩴܳ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 521
    :cond_3
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static ֫()V
    .locals 1

    .line 75
    sget-object v0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {v0}, Ll/ۡᩴܳ;->᩷()V

    .line 76
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    return-void
.end method

.method public static final ֫(I)V
    .locals 3

    .line 145
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/ۜᩴܳ;

    .line 146
    invoke-virtual {v1}, Ll/ۜᩴܳ;->᩻()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    .line 147
    :cond_0
    invoke-static {}, Ll/ۡᩴܳ;->ܺ()Ll/ۜᩴܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 148
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 149
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 150
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final ֫(II)V
    .locals 1

    .line 138
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-static {v0, p0, p1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 139
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 140
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final ֫(III)V
    .locals 2

    .line 268
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    .line 269
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    .line 270
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜᩴܳ;

    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p0

    const-string p2, "removeAt(...)"

    invoke-static {p0, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ll/ܽᩴܳ;

    .line 271
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜᩴܳ;

    invoke-virtual {p1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 273
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final ֫(ILjava/lang/String;)V
    .locals 1

    .line 124
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜᩴܳ;

    invoke-virtual {p0, p1}, Ll/ۜᩴܳ;->֫(Ljava/lang/String;)V

    .line 125
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 126
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static ֫(ILjava/util/List;)V
    .locals 3

    if-ltz p0, :cond_0

    .line 236
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p0, v1, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 237
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    .line 236
    invoke-static {p0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast p0, Ll/ۜᩴܳ;

    goto :goto_0

    .line 239
    :cond_0
    invoke-static {}, Ll/ۡᩴܳ;->ܺ()Ll/ۜᩴܳ;

    move-result-object p0

    .line 248
    :goto_0
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "bookmark_add_to_top"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    invoke-virtual {p0, p1}, Ll/ۜᩴܳ;->ۧ(Ljava/util/List;)V

    return-void

    .line 251
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۜᩴܳ;->֫(Ljava/util/List;)V

    return-void
.end method

.method public static final ֫(Ljava/lang/String;)V
    .locals 1

    .line 131
    new-instance v0, Ll/ۜᩴܳ;

    invoke-direct {v0, p0}, Ll/ۜᩴܳ;-><init>(Ljava/lang/String;)V

    sget-object p0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 133
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final ֫(Ljava/lang/String;Ll/ܿᩴܳ;)V
    .locals 5

    const-string v0, "path"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "eph"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 159
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-le v0, v2, :cond_1

    const-string v0, "/"

    .line 486
    invoke-static {p0, v0, v1}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    :cond_1
    new-instance v3, Ll/ܽᩴܳ;

    .line 361
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "getFriendlyName(...)"

    invoke-static {v0, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-direct {v3, v0, p0}, Ll/ܽᩴܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-virtual {v3, p1}, Ll/ܽᩴܳ;->֫(Ll/ܿᩴܳ;)V

    .line 163
    invoke-static {}, Ll/ۡᩴܳ;->ۖ()Ll/ۜᩴܳ;

    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    move-object v0, p1

    monitor-enter v0

    .line 165
    :try_start_0
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    const-string v4, "<this>"

    .line 0
    invoke-static {p1, v4}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 169
    :goto_0
    invoke-virtual {v3, p1}, Ll/ܽᩴܳ;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_3

    .line 164
    monitor-exit v0

    return-void

    .line 168
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 169
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 170
    :goto_1
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/16 v1, 0x50

    if-le p1, v1, :cond_4

    .line 171
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 173
    :cond_4
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    monitor-exit v0

    .line 174
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 175
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->ۚ()V

    return-void

    :catchall_0
    move-exception p0

    .line 164
    monitor-exit v0

    throw p0
.end method

.method public static final ֫(Ljava/lang/String;Ll/ܿᩴܳ;I)V
    .locals 3

    const-string v0, "path"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "/"

    const/4 v2, 0x0

    .line 486
    invoke-static {p0, v0, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    :cond_0
    new-instance v0, Ll/ܽᩴܳ;

    .line 361
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getFriendlyName(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    invoke-direct {v0, v1, p0}, Ll/ܽᩴܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    invoke-virtual {v0, p1}, Ll/ܽᩴܳ;->֫(Ll/ܿᩴܳ;)V

    .line 261
    invoke-static {v0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p2, p0}, Ll/ۡᩴܳ;->֫(ILjava/util/List;)V

    .line 262
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 263
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final ֫(Ljava/util/ArrayList;)V
    .locals 2

    .line 1807
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1808
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    .line 329
    invoke-virtual {v1}, Ll/ۜᩴܳ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1807
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 1808
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    .line 330
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 331
    :cond_5
    :goto_1
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 332
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 333
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    .line 334
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static final ֫(Ljava/util/ArrayList;I)V
    .locals 0

    .line 294
    invoke-static {p1, p0}, Ll/ۡᩴܳ;->֫(ILjava/util/List;)V

    .line 295
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 296
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final ֫(Ll/ۗܺ᩷;Ll/֨ۡ֫;)V
    .locals 1

    .line 339
    sget-object v0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    invoke-virtual {v0, p0, p1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static ֫(Ll/ۜᩴܳ;Ljava/util/ArrayList;)V
    .locals 1

    .line 201
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v0

    monitor-enter v0

    .line 203
    :try_start_0
    invoke-virtual {p0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    monitor-exit v0

    .line 205
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 206
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->ۚ()V

    return-void

    :catchall_0
    move-exception p0

    .line 201
    monitor-exit v0

    throw p0
.end method

.method public static ֫([B)V
    .locals 3

    .line 511
    sget-object v0, Ll/ۡᩴܳ;->ܽ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 513
    sget v1, Ll/ۘۤۡ;->֫:I

    .line 150
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {v2, v1, p0}, Ll/ۘۤۡ;->֫(II[B)[B

    move-result-object p0

    .line 513
    invoke-static {p0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    const-string v1, "backup"

    .line 511
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 514
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static final ۖ()Ll/ۜᩴܳ;
    .locals 3

    .line 87
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    .line 231
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    .line 87
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 232
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۘ()I
    .locals 1

    .line 107
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method private final ۚ()V
    .locals 4

    .line 528
    sget-object v0, Ll/ۡᩴܳ;->ܿ:Ll/ۢᩴܳ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v2, 0x3e8

    .line 529
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public static final ۜ()V
    .locals 2

    .line 214
    invoke-static {}, Ll/ۡᩴܳ;->ۖ()Ll/ۜᩴܳ;

    move-result-object v1

    .line 215
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v0

    monitor-enter v0

    .line 216
    :try_start_0
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 217
    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    monitor-exit v0

    .line 218
    sget-object v0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 219
    sget-object v0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {v0}, Ll/ۡᩴܳ;->ۚ()V

    return-void

    :catchall_0
    move-exception v1

    .line 215
    monitor-exit v0

    throw v1
.end method

.method public static final ۡ()Ljava/util/List;
    .locals 2

    .line 91
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v1, "unmodifiableList(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final ۢ()[Ll/᩷ᩴܳ;
    .locals 7

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v4, v3, 0x1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۜᩴܳ;

    .line 98
    invoke-virtual {v5}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v6

    if-nez v6, :cond_0

    .line 99
    new-instance v6, Ll/᩷ᩴܳ;

    invoke-direct {v6, v5, v3}, Ll/᩷ᩴܳ;-><init>(Ll/ۜᩴܳ;I)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    move v3, v4

    goto :goto_0

    :cond_1
    new-array v1, v2, [Ll/᩷ᩴܳ;

    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷ᩴܳ;

    return-object v0
.end method

.method public static final ۧ(I)Ll/ۜᩴܳ;
    .locals 1

    .line 110
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "get(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ll/ۜᩴܳ;

    return-object p0
.end method

.method public static final ۧ(Ljava/lang/String;Ll/ܿᩴܳ;)Ll/ܽᩴܳ;
    .locals 3

    const-string v0, "path"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "/"

    const/4 v2, 0x0

    .line 486
    invoke-static {p0, v0, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    :cond_0
    new-instance v0, Ll/ܽᩴܳ;

    .line 361
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getFriendlyName(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    invoke-direct {v0, v1, p0}, Ll/ܽᩴܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    invoke-virtual {v0, p1}, Ll/ܽᩴܳ;->֫(Ll/ܿᩴܳ;)V

    return-object v0
.end method

.method public static ۧ()V
    .locals 1

    .line 322
    sget-object v0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {v0}, Ll/ۡᩴܳ;->᩷()V

    return-void
.end method

.method public static final ۧ(Ljava/util/ArrayList;I)V
    .locals 3

    .line 1586
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Iterable;)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1661
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1662
    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    .line 287
    invoke-static {v1, v2}, Ll/ۡᩴܳ;->ۧ(Ljava/lang/String;Ll/ܿᩴܳ;)Ll/ܽᩴܳ;

    move-result-object v1

    .line 1662
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 287
    :cond_0
    invoke-static {p1, v0}, Ll/ۡᩴܳ;->֫(ILjava/util/List;)V

    .line 288
    sget-object p0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 289
    sget-object p0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final ۧ(Ljava/lang/String;)Z
    .locals 3

    .line 114
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/ۜᩴܳ;

    .line 115
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    .line 169
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ([B)Z
    .locals 9

    .line 378
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz p0, :cond_3

    array-length v2, p0

    const/4 v3, 0x6

    if-ge v2, v3, :cond_0

    goto :goto_2

    .line 381
    :cond_0
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, p0}, Ll/۬ۜܽ;-><init>([B)V

    const p0, 0x62323434

    .line 383
    :try_start_0
    invoke-static {v2, p0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 384
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p0, :cond_2

    .line 386
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object v4

    .line 387
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v5

    .line 388
    new-instance v6, Ll/ۜᩴܳ;

    invoke-direct {v6, v4}, Ll/ۜᩴܳ;-><init>(Ljava/lang/String;)V

    .line 389
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v5, :cond_1

    .line 391
    invoke-virtual {v6}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v7

    invoke-static {v2}, Ll/֫ᩴܳ;->֫(Ll/۬ۜܽ;)Ll/ܽᩴܳ;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    .line 396
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 35
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v0, p0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_3
    :goto_2
    return v1
.end method

.method public static final ܳ()V
    .locals 6

    .line 2
    sget-object v0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    .line 50
    monitor-enter v0

    .line 535
    :try_start_0
    sget-object v1, Ll/ۡᩴܳ;->ܿ:Ll/ۢᩴܳ;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 537
    :try_start_1
    invoke-static {}, Ll/ۡᩴܳ;->ۖ()Ll/ۜᩴܳ;

    move-result-object v1

    .line 538
    new-instance v3, Ll/ۤۜܽ;

    invoke-direct {v3}, Ll/ۤۜܽ;-><init>()V

    const v4, 0x62323434

    .line 539
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 540
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->ۡ(I)V

    .line 541
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v1

    .line 1915
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽᩴܳ;

    .line 541
    invoke-virtual {v4, v3}, Ll/ܽᩴܳ;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    .line 542
    :cond_0
    sget-object v1, Ll/ۡᩴܳ;->ܽ:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v4, "history"

    .line 544
    invoke-virtual {v3}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v3, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    .line 542
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 545
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catch Ljava/util/ConcurrentModificationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 35
    :try_start_2
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    .line 546
    invoke-virtual {v2, v1, v3}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_1

    .line 547
    :catch_1
    sget-object v1, Ll/ۡᩴܳ;->ܿ:Ll/ۢᩴܳ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 551
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static final ܺ()Ll/ۜᩴܳ;
    .locals 3

    .line 83
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    .line 231
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    .line 83
    invoke-virtual {v1}, Ll/ۜᩴܳ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 232
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic ܽ()Ll/ۚۡ֫;
    .locals 1

    .line 50
    sget-object v0, Ll/ۡᩴܳ;->ᩳ:Ll/ۚۡ֫;

    return-object v0
.end method

.method public static final synthetic ܿ()V
    .locals 1

    .line 2
    sget-object v0, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    .line 50
    invoke-direct {v0}, Ll/ۡᩴܳ;->֡()V

    return-void
.end method

.method public static final synthetic ᩳ()Ljava/util/Map;
    .locals 1

    .line 50
    sget-object v0, Ll/ۡᩴܳ;->ܳ:Ll/ۧۤᩴ;

    return-object v0
.end method

.method public static final ᩴ()V
    .locals 4

    .line 478
    sget-object v0, Ll/ۡᩴܳ;->ܿ:Ll/ۢᩴܳ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v2, 0x7d0

    .line 479
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public static final ᩵()V
    .locals 3

    .line 348
    :try_start_0
    sget-object v0, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    .line 1915
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴܳ;

    .line 349
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v1

    .line 1915
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽᩴܳ;

    .line 350
    invoke-virtual {v2}, Ll/ܽᩴܳ;->ۢ()V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    return-void

    .line 354
    :catch_0
    new-instance v0, Ll/۫ۘܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0xc8

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void
.end method

.method private final declared-synchronized ᩷()V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 303
    :try_start_0
    sget-object v1, Ll/ۡᩴܳ;->֫:Ljava/util/ArrayList;

    .line 1915
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜᩴܳ;

    .line 304
    invoke-virtual {v3}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v3

    .line 777
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 873
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ll/ܽᩴܳ;

    .line 304
    invoke-virtual {v6}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 873
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1915
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽᩴܳ;

    .line 305
    invoke-virtual {v4}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 306
    invoke-virtual {v5}, Ll/ܿᩴܳ;->ۧ()I

    move-result v6

    invoke-static {v6}, Ll/۫᩻᩻;->ܽ(I)Ll/ۗ᩻᩻;

    move-result-object v6

    if-nez v6, :cond_4

    .line 308
    invoke-virtual {v5}, Ll/ܿᩴܳ;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/۫᩻᩻;->֫(Ljava/lang/String;)Ll/ۗ᩻᩻;

    move-result-object v6

    :cond_4
    if-eqz v6, :cond_3

    .line 310
    iget v7, v6, Ll/ۗ᩻᩻;->᩶:I

    invoke-virtual {v5}, Ll/ܿᩴܳ;->ۧ()I

    move-result v8

    if-ne v7, v8, :cond_5

    invoke-virtual {v6}, Ll/ۗ᩻᩻;->֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ll/ܿᩴܳ;->֫()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 311
    :cond_5
    invoke-virtual {v5, v6}, Ll/ܿᩴܳ;->֫(Ll/ۗ᩻᩻;)Ll/ܿᩴܳ;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ܽᩴܳ;->֫(Ll/ܿᩴܳ;)V

    .line 312
    invoke-virtual {v4}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ۗ᩻᩻;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Ll/ۗ᩻᩻;->ܽ()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "fix "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " > "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const/4 v2, 0x1

    goto :goto_1

    :cond_6
    if-eqz v2, :cond_7

    .line 318
    invoke-direct {p0}, Ll/ۡᩴܳ;->֡()V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    .line 321
    :catch_0
    :try_start_1
    new-instance v1, Ll/۬ۘܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0xc8

    invoke-static {v2, v3, v1}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    :cond_7
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static final ᩻()V
    .locals 2

    .line 183
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ۗۘܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
