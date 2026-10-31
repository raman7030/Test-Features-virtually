.class public final Ll/۟ۘۘ;
.super Ljava/lang/Object;
.source "O8D0"

# interfaces
.implements Ll/ۙۘۘ;


# static fields
.field public static ֨:Ljava/util/logging/Logger;

.field public static final synthetic ۚ:I


# instance fields
.field public ֡:Z

.field public final ֫:Ljava/util/ArrayList;

.field public ۖ:Z

.field public final ۘ:Ljava/util/ArrayList;

.field public ۜ:I

.field public ۡ:Ll/ۤۘۘ;

.field public ۢ:D

.field public final ۧ:Ll/۬ۘۘ;

.field public ܳ:J

.field public ܺ:Ll/ܰۘۘ;

.field public final ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ܿ:Ll/᩺ۘۘ;

.field public final ᩳ:Ll/ܶ֨ۘ;

.field public ᩴ:Z

.field public final ᩵:Ljava/util/ArrayList;

.field public ᩷:Ll/ܰۘۘ;

.field public ᩻:D


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 96
    const-class v0, Ll/۟ۘۘ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 103
    invoke-static {}, Ll/ۗ᩻ۚ;->֫()Ll/۬ۘۘ;

    move-result-object v0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v1, Ll/ܶ֨ۘ;

    invoke-direct {v1}, Ll/ܶ֨ۘ;-><init>()V

    iput-object v1, p0, Ll/۟ۘۘ;->ᩳ:Ll/ܶ֨ۘ;

    const/4 v1, 0x1

    .line 72
    iput-boolean v1, p0, Ll/۟ۘۘ;->ۖ:Z

    .line 73
    iput-boolean v1, p0, Ll/۟ۘۘ;->֡:Z

    const v1, 0xac44

    .line 75
    iput v1, p0, Ll/۟ۘۘ;->ۜ:I

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    int-to-double v4, v1

    div-double/2addr v2, v4

    .line 76
    iput-wide v2, p0, Ll/۟ۘۘ;->᩻:D

    .line 79
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/۟ۘۘ;->֫:Ljava/util/ArrayList;

    .line 81
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    .line 83
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/۟ۘۘ;->᩵:Ljava/util/ArrayList;

    .line 88
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Ll/۟ۘۘ;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 99
    iput-object v0, p0, Ll/۟ۘۘ;->ۧ:Ll/۬ۘۘ;

    return-void
.end method

.method public static synthetic ֫(Ll/۟ۘۘ;)Ll/۬ۘۘ;
    .locals 0

    .line 55
    iget-object p0, p0, Ll/۟ۘۘ;->ۧ:Ll/۬ۘۘ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/۟ۘۘ;Ll/ۤۘۘ;)V
    .locals 0

    .line 55
    iput-object p1, p0, Ll/۟ۘۘ;->ۡ:Ll/ۤۘۘ;

    return-void
.end method

.method public static ֫(Ll/۟ۘۘ;Ll/᩻᩵ۘ;)V
    .locals 2

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    invoke-virtual {p1}, Ll/᩻᩵ۘ;->ܽ()Ll/ۙᩴۘ;

    move-result-object v0

    if-nez v0, :cond_1

    .line 548
    iget-object v0, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 549
    :try_start_0
    iget-object v1, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 550
    iget-object p0, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 552
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return-void
.end method

.method public static synthetic ۧ(Ll/۟ۘۘ;)Ll/ۤۘۘ;
    .locals 0

    .line 55
    iget-object p0, p0, Ll/۟ۘۘ;->ۡ:Ll/ۤۘۘ;

    return-object p0
.end method

.method public static ܽ(Ll/۟ۘۘ;)V
    .locals 1

    .line 368
    iget-object p0, p0, Ll/۟ۘۘ;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 369
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "JSyn V17.2.0 (build 467, 2025-06-29)"

    return-object v0
.end method

.method public final ֫(D)D
    .locals 2

    .line 582
    iget v0, p0, Ll/۟ۘۘ;->ۜ:I

    int-to-double v0, v0

    mul-double p1, p1, v0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    div-double/2addr v0, p1

    const-wide/high16 p1, 0x3f00000000000000L    # 3.0517578125E-5

    .line 569
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫()Ll/᩸֨ۘ;
    .locals 5

    .line 403
    new-instance v0, Ll/᩸֨ۘ;

    .line 398
    iget-wide v1, p0, Ll/۟ۘۘ;->ܳ:J

    long-to-double v1, v1

    iget-wide v3, p0, Ll/۟ۘۘ;->᩻:D

    mul-double v1, v1, v3

    .line 403
    invoke-direct {v0, v1, v2}, Ll/᩸֨ۘ;-><init>(D)V

    return-object v0
.end method

.method public final ֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V
    .locals 6

    .line 422
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ll/᩸֨ۘ;->֫()D

    move-result-wide v0

    .line 398
    iget-wide v2, p0, Ll/۟ۘۘ;->ܳ:J

    long-to-double v2, v2

    iget-wide v4, p0, Ll/۟ۘۘ;->᩻:D

    mul-double v2, v2, v4

    cmpg-double v4, v0, v2

    if-gtz v4, :cond_0

    .line 423
    invoke-interface {p2}, Ll/۠֨ۘ;->run()V

    return-void

    .line 425
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "scheduling "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", at time "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/᩸֨ۘ;->֫()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Ll/۟ۘۘ;->ᩳ:Ll/ܶ֨ۘ;

    invoke-virtual {v0, p1, p2}, Ll/ܶ֨ۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(Ll/᩻᩵ۘ;)V
    .locals 1

    .line 658
    invoke-virtual {p1, p0}, Ll/᩻᩵ۘ;->֫(Ll/۟ۘۘ;)V

    .line 659
    iget-object v0, p0, Ll/۟ۘۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۜ()V
    .locals 9

    const-string v1, "Synth thread new priority = "

    const-string v2, "Synth thread old priority = "

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 218
    :try_start_0
    iget-boolean v3, p0, Ll/۟ۘۘ;->ᩴ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 219
    monitor-exit v0

    return-void

    :cond_0
    const v3, 0xac44

    .line 222
    :try_start_1
    iput v3, p0, Ll/۟ۘۘ;->ۜ:I

    int-to-double v3, v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    div-double/2addr v5, v3

    .line 223
    iput-wide v5, p0, Ll/۟ۘۘ;->᩻:D

    .line 136
    new-instance v5, Ll/ܰۘۘ;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ll/ܰۘۘ;-><init>(I)V

    iput-object v5, p0, Ll/۟ۘۘ;->᩷:Ll/ܰۘۘ;

    .line 138
    new-instance v5, Ll/ܰۘۘ;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Ll/ܰۘۘ;-><init>(I)V

    iput-object v5, p0, Ll/۟ۘۘ;->ܺ:Ll/ܰۘۘ;

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    div-double/2addr v7, v3

    .line 233
    iput-wide v7, p0, Ll/۟ۘۘ;->ۢ:D

    .line 235
    iget-boolean v3, p0, Ll/۟ۘۘ;->֡:Z

    if-eqz v3, :cond_2

    .line 236
    new-instance v3, Ll/᩺ۘۘ;

    invoke-direct {v3, p0}, Ll/᩺ۘۘ;-><init>(Ll/۟ۘۘ;)V

    iput-object v3, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    .line 238
    sget-object v3, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    invoke-virtual {v2}, Ljava/lang/Thread;->getPriority()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 239
    iget-object v2, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    invoke-virtual {v2}, Ljava/lang/Thread;->getPriority()I

    move-result v2

    add-int/2addr v2, v6

    const/16 v4, 0xa

    if-le v2, v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    .line 240
    invoke-virtual {v2}, Ljava/lang/Thread;->getPriority()I

    move-result v2

    add-int/lit8 v4, v2, 0x2

    .line 241
    :goto_0
    iget-object v2, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    invoke-virtual {v2, v4}, Ljava/lang/Thread;->setPriority(I)V

    .line 242
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    invoke-virtual {v1}, Ljava/lang/Thread;->getPriority()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 243
    iget-object v1, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :cond_2
    const/4 v1, 0x1

    .line 246
    iput-boolean v1, p0, Ll/۟ۘۘ;->ᩴ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۧ()V
    .locals 12

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v4, 0x8

    if-ge v2, v4, :cond_8

    .line 378
    iget-object v4, p0, Ll/۟ۘۘ;->᩷:Ll/ܰۘۘ;

    if-eqz v4, :cond_0

    .line 379
    invoke-virtual {v4, v0}, Ll/ܰۘۘ;->֫(I)I

    move-result v0

    :cond_0
    move v4, v0

    .line 382
    invoke-virtual {p0}, Ll/۟ۘۘ;->֫()Ll/᩸֨ۘ;

    move-result-object v0

    .line 407
    iget-object v5, p0, Ll/۟ۘۘ;->ᩳ:Ll/ܶ֨ۘ;

    invoke-virtual {v5, v0}, Ll/ܶ֨ۘ;->֫(Ll/᩸֨ۘ;)Ljava/util/List;

    move-result-object v6

    :goto_1
    if-eqz v6, :cond_2

    .line 410
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    .line 411
    invoke-interface {v6, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠֨ۘ;

    .line 412
    sget-object v8, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "processing "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ", at time "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/᩸֨ۘ;->֫()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 413
    invoke-interface {v7}, Ll/۠֨ۘ;->run()V

    goto :goto_2

    .line 416
    :cond_1
    invoke-virtual {v5, v0}, Ll/ܶ֨ۘ;->֫(Ll/᩸֨ۘ;)Ljava/util/List;

    move-result-object v6

    goto :goto_1

    .line 448
    :cond_2
    iget-object v0, p0, Ll/۟ۘۘ;->ܺ:Ll/ܰۘۘ;

    const/4 v5, 0x0

    .line 183
    :goto_3
    iget-object v6, v0, Ll/ܰۘۘ;->֫:[Ll/ۨۘۘ;

    array-length v7, v6

    if-ge v5, v7, :cond_3

    .line 184
    aget-object v6, v6, v5

    invoke-virtual {v6}, Ll/ۨۘۘ;->֫()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 452
    :cond_3
    iget-object v0, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 453
    :try_start_0
    iget-object v5, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v5

    .line 454
    :goto_4
    invoke-interface {v5}, Ljava/util/ListIterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 455
    invoke-interface {v5}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻᩵ۘ;

    .line 456
    iget-boolean v7, p0, Ll/۟ۘۘ;->ۖ:Z

    if-eqz v7, :cond_4

    .line 574
    iget-wide v7, p0, Ll/۟ۘۘ;->ܳ:J

    .line 457
    invoke-virtual {v6, v7, v8}, Ll/᩻᩵ۘ;->֫(J)V

    goto :goto_4

    .line 459
    :cond_4
    invoke-virtual {v6}, Ll/᩻᩵ۘ;->ۧ()V

    goto :goto_4

    .line 463
    :cond_5
    iget-object v5, p0, Ll/۟ۘۘ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻᩵ۘ;

    .line 464
    iget-object v7, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 465
    invoke-virtual {v6}, Ll/᩻᩵ۘ;->֫()V

    goto :goto_5

    .line 467
    :cond_6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 468
    iget-object v0, p0, Ll/۟ۘۘ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 389
    iget-object v0, p0, Ll/۟ۘۘ;->ܺ:Ll/ܰۘۘ;

    if-eqz v0, :cond_7

    .line 390
    invoke-virtual {v0, v3}, Ll/ܰۘۘ;->ۧ(I)I

    move-result v0

    move v3, v0

    .line 392
    :cond_7
    iget-wide v5, p0, Ll/۟ۘۘ;->ܳ:J

    const-wide/16 v7, 0x8

    add-long/2addr v5, v7

    iput-wide v5, p0, Ll/۟ۘۘ;->ܳ:J

    add-int/lit8 v2, v2, 0x1

    move v0, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    .line 467
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_8
    return-void
.end method

.method public final ۧ(D)V
    .locals 6

    .line 398
    iget-wide v0, p0, Ll/۟ۘۘ;->ܳ:J

    long-to-double v2, v0

    iget-wide v4, p0, Ll/۟ۘۘ;->᩻:D

    mul-double v2, v2, v4

    add-double/2addr v2, p1

    long-to-double p1, v0

    mul-double p1, p1, v4

    :goto_0
    sub-double p1, v2, p1

    const-wide/16 v0, 0x0

    cmpl-double v4, p1, v0

    if-lez v4, :cond_2

    .line 671
    iget-boolean v0, p0, Ll/۟ۘۘ;->֡:Z

    if-eqz v0, :cond_1

    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double p1, p1, v0

    double-to-long p1, p1

    const-wide/16 v0, 0x0

    cmp-long v4, p1, v0

    if-gtz v4, :cond_0

    const-wide/16 p1, 0x1

    .line 676
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_1

    .line 679
    :cond_1
    invoke-virtual {p0}, Ll/۟ۘۘ;->ۧ()V

    .line 398
    :goto_1
    iget-wide p1, p0, Ll/۟ۘۘ;->ܳ:J

    long-to-double p1, p1

    iget-wide v0, p0, Ll/۟ۘۘ;->᩻:D

    mul-double p1, p1, v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۧ(Ll/᩻᩵ۘ;)V
    .locals 2

    .line 536
    invoke-virtual {p0}, Ll/۟ۘۘ;->֫()Ll/᩸֨ۘ;

    move-result-object v0

    .line 514
    invoke-virtual {p1}, Ll/᩻᩵ۘ;->ܽ()Ll/ۙᩴۘ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 515
    new-instance v1, Ll/ۛۘۘ;

    invoke-direct {v1, p0, p1}, Ll/ۛۘۘ;-><init>(Ll/۟ۘۘ;Ll/᩻᩵ۘ;)V

    invoke-virtual {p0, v0, v1}, Ll/۟ۘۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    :cond_0
    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 645
    iget-boolean v0, p0, Ll/۟ۘۘ;->֡:Z

    return v0
.end method

.method public final ܽ()D
    .locals 2

    .line 590
    iget-wide v0, p0, Ll/۟ۘۘ;->᩻:D

    return-wide v0
.end method

.method public final ܿ()D
    .locals 2

    .line 563
    iget-wide v0, p0, Ll/۟ۘۘ;->ۢ:D

    return-wide v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 582
    iget v0, p0, Ll/۟ۘۘ;->ۜ:I

    return v0
.end method

.method public final declared-synchronized ᩷()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 257
    :try_start_0
    iget-boolean v1, p0, Ll/۟ۘۘ;->ᩴ:Z

    if-nez v1, :cond_0

    .line 258
    sget-object v1, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    const-string v2, "JSyn already stopped."

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 259
    monitor-exit v0

    return-void

    .line 262
    :cond_0
    :try_start_1
    iget-boolean v1, p0, Ll/۟ۘۘ;->֡:Z

    if-eqz v1, :cond_1

    .line 264
    iget-object v1, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_1

    .line 267
    :try_start_2
    invoke-virtual {v1}, Ll/᩺ۘۘ;->֫()V

    .line 268
    iget-object v1, p0, Ll/۟ۘۘ;->ܿ:Ll/᩺ۘۘ;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Thread;->join(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 274
    :catch_0
    :cond_1
    :try_start_3
    iget-object v1, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 275
    :try_start_4
    iget-object v2, p0, Ll/۟ۘۘ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 276
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v1, 0x0

    .line 277
    :try_start_5
    iput-boolean v1, p0, Ll/۟ۘۘ;->ᩴ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 278
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 276
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v1
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x0

    .line 640
    iput-boolean v0, p0, Ll/۟ۘۘ;->֡:Z

    return-void
.end method
