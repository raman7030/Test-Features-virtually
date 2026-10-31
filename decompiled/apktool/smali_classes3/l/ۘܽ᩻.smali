.class public Ll/ۘܽ᩻;
.super Ll/᩶ܶۢ;
.source "T7BL"


# static fields
.field public static final synthetic ܽۧ:I


# instance fields
.field public final ֫ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۗ֫:Ljava/util/LinkedHashSet;

.field public final ۛ֫:Ljava/util/concurrent/LinkedBlockingQueue;

.field public ۟֫:Z

.field public final ۤ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۧۧ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۨ֫:Ljava/util/LinkedHashSet;

.field public final ۫֫:Ljava/util/ArrayList;

.field public volatile ۬֫:Z

.field public ܰ֫:Z

.field public final ᩺֫:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 42
    invoke-direct {p0}, Ll/᩶ܶۢ;-><init>()V

    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۘܽ᩻;->֫ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۘܽ᩻;->ۤ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۘܽ᩻;->ۧۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 48
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۘܽ᩻;->᩺֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x1388

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Ll/ۘܽ᩻;->ۛ֫:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘܽ᩻;->۫֫:Ljava/util/ArrayList;

    .line 51
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ۘܽ᩻;->ۨ֫:Ljava/util/LinkedHashSet;

    .line 52
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ۘܽ᩻;->ۗ֫:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public static synthetic ֫(Ll/ۘܽ᩻;I)V
    .locals 7

    .line 164
    iget-object v0, p0, Ll/ۘܽ᩻;->᩺֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 167
    :cond_0
    :goto_0
    :try_start_0
    invoke-direct {p0}, Ll/ۘܽ᩻;->᩺֫()Ll/ۖܽ᩻;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v1, Ll/ۖܽ᩻;->ۧ:Ll/ܽۤܳ;

    .line 168
    iget-object v3, v1, Ll/ۖܽ᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {p0, v3}, Ll/ۘܽ᩻;->֫(Ljava/lang/CharSequence;)V

    .line 169
    iget-object v3, p0, Ll/ۘܽ᩻;->ۤ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v3

    int-to-long v3, v3

    iget-object v5, p0, Ll/ۘܽ᩻;->֫ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    invoke-static {v5, p1}, Ljava/lang/Math;->max(II)I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {p0, v3, v4, v5, v6}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    .line 170
    iget-object v1, v1, Ll/ۖܽ᩻;->֫:Ll/ܶ᩵ܿ;

    .line 171
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 172
    iget-boolean v4, p0, Ll/ۘܽ᩻;->ܰ֫:Z

    if-eqz v4, :cond_2

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 173
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lbin/mt/plus/Features;->deleteFile(Ljava/lang/String;)Z

    move-result v4

    .line 174
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-nez v5, :cond_1

    .line 175
    invoke-direct {p0, v3}, Ll/ۘܽ᩻;->᩸(Ljava/lang/String;)V

    :cond_1
    if-eqz v4, :cond_0

    .line 178
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ܽۤܳ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 182
    :cond_2
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫()Z

    move-result v4

    if-nez v4, :cond_3

    .line 183
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 184
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 186
    :cond_3
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 187
    invoke-direct {p0, v3}, Ll/ۘܽ᩻;->᩸(Ljava/lang/String;)V

    .line 188
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ܽۤܳ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 192
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 193
    throw p0
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 341
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 344
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    const-string v0, "/"

    .line 0
    invoke-static {p2, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 344
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 345
    :goto_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    iget-object v1, p0, Ll/ۘܽ᩻;->ۛ֫:Ljava/util/concurrent/LinkedBlockingQueue;

    iget-object v2, p0, Ll/ۘܽ᩻;->֫ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_6

    .line 346
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 347
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 348
    new-instance v0, Ll/ۖܽ᩻;

    sget-object v2, Ll/ܽۤܳ;->ۙ:Ll/ܽۤܳ;

    invoke-direct {v0, p1, p2, v2}, Ll/ۖܽ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܽۤܳ;)V

    invoke-virtual {v1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    return-void

    .line 351
    :cond_2
    iget-boolean v0, p0, Ll/ۘܽ᩻;->ܰ֫:Z

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 352
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 353
    new-instance v0, Ll/ۖܽ᩻;

    sget-object v2, Ll/ܽۤܳ;->ۙ:Ll/ܽۤܳ;

    invoke-direct {v0, p1, p2, v2}, Ll/ۖܽ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܽۤܳ;)V

    invoke-virtual {v1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 v0, 0x1

    .line 413
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 356
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 357
    invoke-direct {p0, v1, p2}, Ll/ۘܽ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_1

    .line 359
    :cond_4
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_2
    return-void

    .line 362
    :cond_5
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 364
    new-instance v0, Ll/ۖܽ᩻;

    sget-object v1, Ll/ܽۤܳ;->᩶:Ll/ܽۤܳ;

    invoke-direct {v0, p1, p2, v1}, Ll/ۖܽ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܽۤܳ;)V

    iget-object p1, p0, Ll/ۘܽ᩻;->۫֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 367
    :cond_6
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 368
    new-instance v0, Ll/ۖܽ᩻;

    sget-object v2, Ll/ܽۤܳ;->᩹:Ll/ܽۤܳ;

    invoke-direct {v0, p1, p2, v2}, Ll/ۖܽ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܽۤܳ;)V

    invoke-virtual {v1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    return-void
.end method

.method private ۛ֫()Ljava/util/ArrayList;
    .locals 4

    .line 316
    new-instance v1, Ljava/util/ArrayList;

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 430
    :try_start_0
    new-instance v2, Ljava/util/LinkedHashSet;

    iget-object v3, p0, Ll/ۘܽ᩻;->ۨ֫:Ljava/util/LinkedHashSet;

    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 316
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1

    :catchall_0
    move-exception v1

    .line 430
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ۧ([Ljava/lang/String;)[Ll/֫֨ۢ;
    .locals 5

    .line 323
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 324
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    .line 326
    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 325
    invoke-static {v4}, Ll/ᩴ᩵ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 329
    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    new-array p0, p0, [Ll/֫֨ۢ;

    .line 331
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    add-int/lit8 v3, v2, 0x1

    .line 332
    sget-object v4, Ll/ܽ֨ۢ;->ۙ:Ll/ܽ֨ۢ;

    invoke-static {v1, v4}, Ll/֫֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)Ll/֫֨ۢ;

    move-result-object v1

    aput-object v1, p0, v2

    move v2, v3

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method private ۨ֫()Ljava/util/ArrayList;
    .locals 5

    .line 302
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 437
    :try_start_0
    new-instance v2, Ljava/util/LinkedHashSet;

    iget-object v3, p0, Ll/ۘܽ᩻;->ۗ֫:Ljava/util/LinkedHashSet;

    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 303
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    .line 304
    invoke-static {v2, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 305
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 306
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 309
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0

    :catchall_0
    move-exception v1

    .line 437
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private declared-synchronized ᩳ(Ll/ܿ۠ۢ;)V
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 402
    :try_start_0
    iget-boolean v1, p0, Ll/ۘܽ᩻;->۟֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 403
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 405
    :try_start_1
    iput-boolean v1, p0, Ll/ۘܽ᩻;->۟֫:Z

    .line 406
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object v2

    const-string v1, "remoteTaskId"

    .line 407
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 410
    invoke-direct {p0}, Ll/ۘܽ᩻;->ۨ֫()Ljava/util/ArrayList;

    move-result-object v6

    .line 411
    invoke-direct {p0}, Ll/ۘܽ᩻;->ۛ֫()Ljava/util/ArrayList;

    move-result-object v7

    .line 412
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v4, p0

    move-object v5, p1

    move-object v8, v9

    .line 406
    invoke-virtual/range {v2 .. v9}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ܿ۠ۢ;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 415
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private declared-synchronized ᩸(Ljava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 421
    :try_start_0
    invoke-static {p1}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 422
    iget-object v1, p0, Ll/ۘܽ᩻;->ۨ֫:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 423
    iget-object v1, p0, Ll/ۘܽ᩻;->ۗ֫:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ll/ᩴ᩵ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 424
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

.method private ᩺֫()Ll/ۖܽ᩻;
    .locals 4

    .line 376
    iget-object v0, p0, Ll/ۘܽ᩻;->ۧۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 378
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    .line 381
    :try_start_1
    iget-object v0, p0, Ll/ۘܽ᩻;->ۛ֫:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖܽ᩻;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 394
    iget-object v1, p0, Ll/ۘܽ᩻;->ۧۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object v0

    .line 388
    :cond_1
    :try_start_2
    iget-boolean v0, p0, Ll/ۘܽ᩻;->۬֫:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_0

    .line 394
    :catch_0
    :cond_2
    iget-object v0, p0, Ll/ۘܽ᩻;->ۧۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/ۘܽ᩻;->ۧۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 395
    throw v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;
    .locals 0

    .line 350
    invoke-static {p1}, Ll/ܿ۠ۢ;->֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;

    move-result-object p1

    .line 249
    invoke-direct {p0, p1}, Ll/ۘܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-object p1
.end method

.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 267
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 268
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string v0, "remoteTaskId"

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "deleteFrom"

    .line 71
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۚ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a27

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 63
    sget-object v0, Ll/᩻ܶۢ;->᩻:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 11

    const-string v0, "recycle"

    .line 118
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "ARG_PATHS"

    if-eqz v0, :cond_5

    .line 141
    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 128
    invoke-static {v0}, Ll/ۘܽ᩻;->ۧ([Ljava/lang/String;)[Ll/֫֨ۢ;

    move-result-object v3

    invoke-static {v3}, Ll/ᩳ֨ۢ;->֫([Ll/֫֨ۢ;)V

    const/4 v3, 0x0

    .line 129
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_4

    .line 130
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 131
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    goto/16 :goto_c

    .line 133
    :cond_0
    aget-object v4, v0, v3

    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 134
    aget-object v5, v0, v3

    new-array v6, v2, [Ljava/lang/String;

    invoke-static {v5, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 135
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    .line 136
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Ll/ۘܽ᩻;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v3, v3, 0x1

    int-to-long v7, v3

    .line 137
    array-length v9, v0

    int-to-long v9, v9

    invoke-virtual {p0, v7, v8, v9, v10}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    .line 138
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v7

    invoke-static {v7}, Ll/ܽۤܳ;->֫(Z)Ll/ܽۤܳ;

    move-result-object v7

    .line 139
    invoke-static {v5}, Ll/ᩴ᩵ۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v8

    const v9, 0x7f120642

    if-nez v8, :cond_1

    .line 140
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-static {v9, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/String;)Ll/ܿ۠ۢ;

    move-result-object v0

    goto/16 :goto_c

    .line 142
    :cond_1
    invoke-virtual {v5, p0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܿۖ᩷;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 143
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    goto/16 :goto_c

    .line 146
    :cond_2
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-static {v9, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/String;)Ll/ܿ۠ۢ;

    move-result-object v0

    goto/16 :goto_c

    .line 148
    :cond_3
    invoke-direct {p0, v4}, Ll/ۘܽ᩻;->᩸(Ljava/lang/String;)V

    .line 149
    invoke-virtual {v7, v6}, Ll/ܽۤܳ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 151
    :cond_4
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    goto/16 :goto_c

    .line 141
    :cond_5
    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v3, "speedMode"

    .line 159
    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, p0, Ll/ۘܽ᩻;->ܰ֫:Z

    const-string v3, "minTotal"

    .line 160
    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v3

    .line 161
    invoke-static {v0}, Ll/ۘܽ᩻;->ۧ([Ljava/lang/String;)[Ll/֫֨ۢ;

    move-result-object v4

    invoke-static {v4}, Ll/ᩳ֨ۢ;->֫([Ll/֫֨ۢ;)V

    .line 163
    new-instance v4, Ll/ܺܽ᩻;

    invoke-direct {v4, p0, v3}, Ll/ܺܽ᩻;-><init>(Ll/ۘܽ᩻;I)V

    .line 196
    iput-boolean v1, p0, Ll/ۘܽ᩻;->۬֫:Z

    const/4 v3, 0x4

    .line 197
    sget v5, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 198
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v3, :cond_6

    .line 200
    sget-object v7, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v7, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 202
    :cond_6
    array-length v3, v0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_8

    aget-object v6, v0, v4

    new-array v7, v2, [Ljava/lang/String;

    .line 203
    invoke-static {v6, v7}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    const-string v7, ""

    invoke-direct {p0, v6, v7}, Ll/ۘܽ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 204
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_3

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 208
    :cond_8
    :goto_3
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    .line 209
    iget-object v3, p0, Ll/ۘܽ᩻;->۫֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖܽ᩻;

    .line 210
    iget-object v6, v4, Ll/ۖܽ᩻;->ܽ:Ljava/lang/String;

    const/16 v7, 0x2f

    invoke-static {v6, v7}, Ll/ۢܺ֡;->֫(Ljava/lang/String;C)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Ll/ۜ۠ۢ;

    invoke-direct {v7, v1}, Ll/ۜ۠ۢ;-><init>(I)V

    invoke-static {v0, v6, v7}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 211
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 213
    :cond_9
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/ۖ᩵;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 214
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 216
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v1

    :goto_5
    if-ltz v4, :cond_f

    .line 217
    :goto_6
    iget-object v1, p0, Ll/ۘܽ᩻;->ۛ֫:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Ll/ۘܽ᩻;->ۧۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget-object v6, p0, Ll/ۘܽ᩻;->᩺֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-eq v1, v6, :cond_a

    goto :goto_9

    .line 224
    :cond_a
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v6, 0x0

    .line 369
    invoke-virtual {v0, v1, v6}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 224
    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_b

    goto :goto_8

    .line 228
    :cond_b
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖܽ᩻;

    .line 229
    iget-object v7, p0, Ll/ۘܽ᩻;->ۛ֫:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v7, v6}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    :goto_8
    add-int/lit8 v4, v4, -0x1

    goto :goto_5

    .line 218
    :cond_d
    :goto_9
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_a

    :cond_e
    const-wide/16 v6, 0xa

    .line 222
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_6

    .line 232
    :cond_f
    :goto_a
    iput-boolean v2, p0, Ll/ۘܽ᩻;->۬֫:Z

    .line 233
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Future;

    .line 235
    :try_start_0
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    nop

    goto :goto_b

    .line 240
    :cond_10
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    .line 119
    :goto_c
    invoke-direct {p0, v0}, Ll/ۘܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-object v0
.end method

.method public final ۢ(I)V
    .locals 1

    .line 276
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 277
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string v0, "remoteTaskId"

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 293
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 294
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    .line 295
    invoke-direct {p0, p1}, Ll/ۘܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-void
.end method

.method public final ۫֫()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final ܶ(Ljava/lang/String;)V
    .locals 1

    .line 258
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 259
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string v0, "remoteTaskId"

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ܺ()Ll/ۗܺ᩷;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷()V
    .locals 3

    const-string v0, "remoteTaskId"

    .line 104
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 105
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object v1

    const/4 v2, 0x0

    .line 106
    invoke-virtual {v1, v0, p0, v2}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ᩴܽ᩻;)V

    const-string v2, "recycle"

    .line 107
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f12063d

    goto :goto_0

    :cond_0
    const v2, 0x7f12087c

    :goto_0
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v2, "..."

    .line 108
    invoke-virtual {p0, v2}, Ll/ۘܽ᩻;->֫(Ljava/lang/CharSequence;)V

    .line 109
    invoke-virtual {v1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ᩹֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
