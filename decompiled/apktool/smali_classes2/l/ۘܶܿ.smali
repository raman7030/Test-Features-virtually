.class public final Ll/ۘܶܿ;
.super Ljava/lang/Object;
.source "I9S8"


# static fields
.field public static final ۜ:Ll/ܶ᩵ܿ;


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Landroid/net/Uri;

.field public final ܽ:Ljava/util/Map;

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/ܶ᩵ܿ;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 344
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "localStorageMap"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    sput-object v0, Ll/ۘܶܿ;->ۜ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 348
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    const/4 v0, 0x0

    .line 351
    iput-boolean v0, p0, Ll/ۘܶܿ;->֫:Z

    .line 354
    iput-object p1, p0, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    .line 355
    iput-object p2, p0, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    .line 356
    iput-object p3, p0, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    .line 357
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    const/4 p3, 0x1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string p3, "/"

    .line 358
    invoke-virtual {p1, p3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ":"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 359
    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 361
    :cond_0
    iput-object p1, p0, Ll/ۘܶܿ;->ۧ:Ljava/lang/String;

    .line 362
    sget-object p1, Ll/ۘܶܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘܶܿ;->ᩳ:Ll/ܶ᩵ܿ;

    .line 363
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 365
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object p1

    .line 366
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result p2

    :goto_0
    if-ge v0, p2, :cond_1

    .line 368
    iget-object p3, p0, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 445
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/storage/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .line 377
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 378
    iget-object p1, p0, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 380
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۘܶܿ;->ۧ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, p1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 381
    iget-object v0, p0, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    if-eqz p2, :cond_2

    const/16 p2, 0x2f

    .line 386
    invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p2

    const/4 v1, -0x1

    if-eq p2, v1, :cond_2

    const/4 v1, 0x0

    .line 388
    invoke-virtual {p1, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2, p1, v0}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final declared-synchronized ۧ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 415
    :try_start_0
    iput-boolean v1, p0, Ll/ۘܶܿ;->֫:Z

    .line 416
    sget-object v1, Ll/ۘܶܿ;->ۜ:Ll/ܶ᩵ܿ;

    iget-object v2, p0, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 417
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

.method public final declared-synchronized ܽ()V
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 420
    :try_start_0
    iget-boolean v1, p0, Ll/ۘܶܿ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 421
    monitor-exit v0

    return-void

    .line 423
    :cond_0
    :try_start_1
    iget-object v2, p0, Ll/ۘܶܿ;->ᩳ:Ll/ܶ᩵ܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 425
    :try_start_2
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۨ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 429
    :try_start_3
    new-instance v3, Ll/ۤۜܽ;

    invoke-direct {v3}, Ll/ۤۜܽ;-><init>()V

    .line 430
    iget-object v1, p0, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 431
    :try_start_4
    iget-object v4, p0, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 432
    iget-object v4, p0, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 433
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v3, v6}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 434
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 436
    :cond_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 438
    :try_start_5
    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 442
    :catch_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 436
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v2

    :catch_1
    move-exception v1

    .line 427
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v1
.end method
