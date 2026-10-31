.class public final Ll/ۘۤ᩷;
.super Ll/۟ܶۡ;
.source "31K1"


# instance fields
.field public final synthetic ۜ:Ll/ᩴۤ᩷;

.field public final synthetic ۢ:Ljava/util/LinkedHashMap;

.field public ܳ:Z

.field public final synthetic ᩷:Ll/ܶ᩵ܿ;

.field public final ᩻:Ljava/util/IdentityHashMap;


# direct methods
.method public constructor <init>(Ll/ᩴۤ᩷;Ljava/util/LinkedHashMap;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 2449
    iput-object p1, p0, Ll/ۘۤ᩷;->ۜ:Ll/ᩴۤ᩷;

    iput-object p2, p0, Ll/ۘۤ᩷;->ۢ:Ljava/util/LinkedHashMap;

    iput-object p3, p0, Ll/ۘۤ᩷;->᩷:Ll/ܶ᩵ܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 2451
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ll/ۘۤ᩷;->᩻:Ljava/util/IdentityHashMap;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 2497
    iget-object v0, p0, Ll/ۘۤ᩷;->ۜ:Ll/ᩴۤ᩷;

    invoke-virtual {v0}, Ll/۬ۗܿ;->ۧ()V

    .line 2498
    iget-object v0, v0, Ll/ᩴۤ᩷;->۟:Ll/ܿۛ᩷;

    const/4 v1, 0x1

    const v2, 0x7f1208c9

    .line 24
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "save_as_project1"

    invoke-static {v0, v3, v2, v1}, Ll/ۧۛܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 2503
    iget-object v0, p0, Ll/ۘۤ᩷;->ۜ:Ll/ᩴۤ᩷;

    iget-object v0, v0, Ll/ᩴۤ᩷;->۟:Ll/ܿۛ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 2455
    iget-object v0, p0, Ll/ۘۤ᩷;->ۜ:Ll/ᩴۤ᩷;

    iget-object v0, v0, Ll/ᩴۤ᩷;->۟:Ll/ܿۛ᩷;

    const v1, 0x7f1208d2

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    .line 2456
    iget-object v0, p0, Ll/ۘۤ᩷;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ۨᩳ;

    .line 2457
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, p0, Ll/ۘۤ᩷;->᩻:Ljava/util/IdentityHashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    .line 2458
    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->ۡ(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 2464
    iget-object v0, p0, Ll/ۘۤ᩷;->᩷:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/ۘۤ᩷;->ۢ:Ljava/util/LinkedHashMap;

    iget-object v2, p0, Ll/ۘۤ᩷;->ۜ:Ll/ᩴۤ᩷;

    iget-object v2, v2, Ll/ᩴۤ᩷;->۟:Ll/ܿۛ᩷;

    invoke-static {v2}, Ll/ܿۛ᩷;->᩹(Ll/ܿۛ᩷;)Ll/۫ۛ᩷;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ۛ᩷;->ܿ()V

    .line 2465
    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ۧۢ;->۠()V

    :cond_0
    const/4 v3, 0x0

    .line 2469
    :try_start_0
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->۬()Ll/ۗ᩻᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    goto :goto_0

    .line 2470
    :cond_1
    invoke-static {v2}, Ll/ܿۛ᩷;->۠(Ll/ܿۛ᩷;)Ll/ۧ۫᩷;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۧ۫᩷;->᩷()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    invoke-static {v4, v5}, Ll/ۜ۠ᩴ;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v4

    invoke-static {v4}, Ll/᩹ᩴᩳ;->ۧ(Ll/᩷۠ᩴ;)Ll/ۗ᩻᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    .line 2471
    invoke-static {v2}, Ll/ܿۛ᩷;->۠(Ll/ܿۛ᩷;)Ll/ۧ۫᩷;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 2474
    invoke-static {v2}, Ll/ܿۛ᩷;->۠(Ll/ܿۛ᩷;)Ll/ۧ۫᩷;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/ۧ۫᩷;->֫(Ll/ܶ᩵ܿ;)V

    const/4 v0, 0x1

    .line 2475
    iput-boolean v0, p0, Ll/ۘۤ᩷;->ܳ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2480
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 2482
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۛ᩷;

    invoke-virtual {v4}, Ll/ܳۛ᩷;->ۡ()Ll/۫ۨᩳ;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_2

    .line 2483
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۫ۨᩳ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۛ᩷;

    invoke-virtual {v2}, Ll/ܿۛ᩷;->ۧ֫()Ll/ۧ۫᩷;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/ܳۛ᩷;->ܽ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v4, v1}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    if-nez v3, :cond_3

    move-object v3, v1

    goto :goto_1

    .line 2487
    :cond_3
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 2490
    :cond_4
    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۧۢ;->ܶ()V

    goto/16 :goto_4

    .line 2472
    :cond_5
    :try_start_2
    new-instance v0, Ll/᩵ۤۡ;

    const-string v4, "Move project directory failed."

    .line 14
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2472
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 2480
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 2482
    :try_start_3
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۛ᩷;

    invoke-virtual {v5}, Ll/ܳۛ᩷;->ۡ()Ll/۫ۨᩳ;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_6

    .line 2483
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫ۨᩳ;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۛ᩷;

    invoke-virtual {v2}, Ll/ܿۛ᩷;->ۧ֫()Ll/ۧ۫᩷;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/ܳۛ᩷;->ܽ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v5, v4}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v4

    if-nez v3, :cond_7

    move-object v3, v4

    goto :goto_2

    .line 2487
    :cond_7
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 2490
    :cond_8
    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۧۢ;->ܶ()V

    .line 2491
    :cond_9
    throw v0

    :catch_2
    move-exception v0

    .line 2480
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 2482
    :try_start_4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۛ᩷;

    invoke-virtual {v4}, Ll/ܳۛ᩷;->ۡ()Ll/۫ۨᩳ;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_a

    .line 2483
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۫ۨᩳ;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۛ᩷;

    invoke-virtual {v2}, Ll/ܿۛ᩷;->ۧ֫()Ll/ۧ۫᩷;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ܳۛ᩷;->ܽ(Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_3

    :catch_3
    move-exception v3

    .line 2487
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 2490
    :cond_b
    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-static {v2}, Ll/ܿۛ᩷;->ᩴ(Ll/ܿۛ᩷;)Ll/۫ۧۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۧۢ;->ܶ()V

    :cond_c
    move-object v3, v0

    :cond_d
    :goto_4
    if-nez v3, :cond_e

    return-void

    .line 2492
    :cond_e
    throw v3
.end method

.method public final ᩳ()V
    .locals 4

    .line 2508
    iget-object v0, p0, Ll/ۘۤ᩷;->ۜ:Ll/ᩴۤ᩷;

    iget-object v0, v0, Ll/ᩴۤ᩷;->۟:Ll/ܿۛ᩷;

    iget-boolean v1, p0, Ll/ۘۤ᩷;->ܳ:Z

    if-eqz v1, :cond_0

    .line 2509
    invoke-static {v0}, Ll/ܿۛ᩷;->۬(Ll/ܿۛ᩷;)V

    .line 2510
    invoke-static {v0}, Ll/ܿۛ᩷;->᩶(Ll/ܿۛ᩷;)Ll/ۘۛ᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘۛ᩷;->ۢ()Ll/ۚۡ֫;

    move-result-object v1

    invoke-static {v0}, Ll/ܿۛ᩷;->۠(Ll/ܿۛ᩷;)Ll/ۧ۫᩷;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۧ۫᩷;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 2511
    invoke-static {v0}, Ll/ܿۛ᩷;->᩶(Ll/ܿۛ᩷;)Ll/ۘۛ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۘۛ᩷;->᩷()Ll/ۚۡ֫;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 2513
    :cond_0
    iget-object v0, p0, Ll/ۘۤ᩷;->ۢ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 2514
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۛ᩷;

    invoke-virtual {v2}, Ll/ۡ᩻֫;->getView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ۨᩳ;

    iget-object v3, p0, Ll/ۘۤ᩷;->᩻:Ljava/util/IdentityHashMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2, v1}, Ll/۫ۨᩳ;->ۡ(Z)V

    goto :goto_0

    .line 2516
    :cond_2
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
