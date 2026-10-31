.class public Ll/ᩳ۫᩵;
.super Ljava/lang/Object;
.source "HAYQ"

# interfaces
.implements Ll/ۤ۬᩵;
.implements Ll/ۢ۫᩵;


# static fields
.field public static final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _parentHandle:Ljava/lang/Object;

.field public volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "_state"

    const-class v2, Ll/ᩳ۫᩵;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 129
    invoke-static {}, Ll/ܿ۫᩵;->ܽ()Ll/ܺ۬᩵;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ܿ۫᩵;->ᩳ()Ll/ܺ۬᩵;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ᩳ۫᩵;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 131
    iput-object p1, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method private final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 847
    instance-of v0, p1, Ll/᩶۬᩵;

    if-nez v0, :cond_0

    .line 848
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object p1

    return-object p1

    .line 855
    :cond_0
    instance-of v0, p1, Ll/ܺ۬᩵;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/۟۬᩵;

    if-eqz v0, :cond_5

    :cond_1
    instance-of v0, p1, Ll/ۖۗ᩵;

    if-nez v0, :cond_5

    instance-of v0, p2, Ll/ᩴۗ᩵;

    if-nez v0, :cond_5

    .line 856
    move-object v0, p1

    check-cast v0, Ll/᩶۬᩵;

    .line 292
    sget-object v1, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1284
    instance-of p1, p2, Ll/᩶۬᩵;

    if-eqz p1, :cond_2

    new-instance p1, Ll/ۙ۬᩵;

    move-object v2, p2

    check-cast v2, Ll/᩶۬᩵;

    invoke-direct {p1, v2}, Ll/ۙ۬᩵;-><init>(Ll/᩶۬᩵;)V

    goto :goto_0

    :cond_2
    move-object p1, p2

    .line 0
    :cond_3
    :goto_0
    invoke-virtual {v1, p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 295
    invoke-direct {p0, v0, p2}, Ll/ᩳ۫᩵;->֫(Ll/᩶۬᩵;Ljava/lang/Object;)V

    return-object p2

    .line 0
    :cond_4
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_3

    .line 860
    invoke-static {}, Ll/ܿ۫᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object p1

    return-object p1

    .line 863
    :cond_5
    check-cast p1, Ll/᩶۬᩵;

    .line 873
    invoke-direct {p0, p1}, Ll/ᩳ۫᩵;->֫(Ll/᩶۬᩵;)Ll/᩻۫᩵;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-static {}, Ll/ܿ۫᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object p1

    return-object p1

    .line 877
    :cond_6
    instance-of v0, p1, Ll/ۧ۫᩵;

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Ll/ۧ۫᩵;

    goto :goto_1

    :cond_7
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_8

    new-instance v0, Ll/ۧ۫᩵;

    invoke-direct {v0, v1, v2}, Ll/ۧ۫᩵;-><init>(Ll/᩻۫᩵;Ljava/lang/Throwable;)V

    :cond_8
    move-object v3, v0

    move-object v0, v3

    .line 20
    monitor-enter v0

    .line 882
    :try_start_0
    invoke-virtual {v3}, Ll/ۧ۫᩵;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 884
    :cond_9
    :try_start_1
    invoke-virtual {v3}, Ll/ۧ۫᩵;->᩻()V

    if-eq v3, p1, :cond_c

    .line 889
    sget-object v4, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_a
    invoke-virtual {v4, p0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, p1, :cond_a

    .line 889
    invoke-static {}, Ll/ܿ۫᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    .line 894
    :cond_c
    :goto_2
    :try_start_2
    invoke-virtual {v3}, Ll/ۧ۫᩵;->ۧ()Z

    move-result v4

    .line 895
    instance-of v5, p2, Ll/ᩴۗ᩵;

    if-eqz v5, :cond_d

    move-object v5, p2

    check-cast v5, Ll/ᩴۗ᩵;

    goto :goto_3

    :cond_d
    move-object v5, v2

    :goto_3
    if-eqz v5, :cond_e

    iget-object v5, v5, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    invoke-virtual {v3, v5}, Ll/ۧ۫᩵;->֫(Ljava/lang/Throwable;)V

    .line 897
    :cond_e
    invoke-virtual {v3}, Ll/ۧ۫᩵;->֫()Ljava/lang/Throwable;

    move-result-object v5

    if-nez v4, :cond_f

    goto :goto_4

    :cond_f
    move-object v5, v2

    .line 898
    :goto_4
    sget-object v4, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    if-eqz v5, :cond_10

    .line 900
    invoke-direct {p0, v1, v5}, Ll/ᩳ۫᩵;->֫(Ll/᩻۫᩵;Ljava/lang/Throwable;)V

    .line 913
    :cond_10
    instance-of v0, p1, Ll/ۖۗ᩵;

    if-eqz v0, :cond_11

    move-object v0, p1

    check-cast v0, Ll/ۖۗ᩵;

    goto :goto_5

    :cond_11
    move-object v0, v2

    :goto_5
    if-nez v0, :cond_12

    invoke-interface {p1}, Ll/᩶۬᩵;->ᩳ()Ll/᩻۫᩵;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-static {p1}, Ll/ᩳ۫᩵;->֫(Ll/᩷ۛ᩵;)Ll/ۖۗ᩵;

    move-result-object v2

    goto :goto_6

    :cond_12
    move-object v2, v0

    :cond_13
    :goto_6
    if-eqz v2, :cond_16

    .line 918
    :cond_14
    iget-object p1, v2, Ll/ۖۗ᩵;->ۗ:Ll/ᩳ۫᩵;

    .line 920
    new-instance v0, Ll/֫۫᩵;

    invoke-direct {v0, p0, v3, v2, p2}, Ll/֫۫᩵;-><init>(Ll/ᩳ۫᩵;Ll/ۧ۫᩵;Ll/ۖۗ᩵;Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 918
    invoke-static {p1, v0, v1}, Ll/۬۬᩵;->֫(Ll/ۤ۬᩵;Ll/۟۬᩵;I)Ll/ۡ۬᩵;

    move-result-object p1

    .line 922
    sget-object v0, Ll/ۜ۫᩵;->᩸:Ll/ۜ۫᩵;

    if-eq p1, v0, :cond_15

    .line 904
    sget-object p1, Ll/ܿ۫᩵;->ܽ:Ll/ܶۛ᩵;

    return-object p1

    .line 923
    :cond_15
    invoke-static {v2}, Ll/ᩳ۫᩵;->֫(Ll/᩷ۛ᩵;)Ll/ۖۗ᩵;

    move-result-object v2

    if-nez v2, :cond_14

    .line 906
    :cond_16
    invoke-direct {p0, v3, p2}, Ll/ᩳ۫᩵;->֫(Ll/ۧ۫᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 898
    monitor-exit v0

    throw p1
.end method

.method private final ֫(Ll/ۧ۫᩵;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 208
    instance-of v0, p2, Ll/ᩴۗ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ll/ᩴۗ᩵;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    move-object v2, v0

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    move-object v0, p1

    .line 20
    monitor-enter v0

    .line 212
    :try_start_0
    invoke-virtual {p1}, Ll/ۧ۫᩵;->ۧ()Z

    .line 213
    invoke-virtual {p1, v2}, Ll/ۧ۫᩵;->ۧ(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v3

    .line 246
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    .line 248
    invoke-virtual {p1}, Ll/ۧ۫᩵;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 703
    new-instance v4, Ll/ۛ۬᩵;

    .line 27
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->֫()Ljava/lang/String;

    move-result-object v6

    .line 703
    invoke-direct {v4, v6, v1, p0}, Ll/ۛ۬᩵;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ll/ᩳ۫᩵;)V

    move-object v1, v4

    goto :goto_2

    .line 1486
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Throwable;

    .line 259
    instance-of v7, v7, Ljava/util/concurrent/CancellationException;

    if-nez v7, :cond_3

    move-object v1, v6

    :cond_4
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_5

    goto :goto_2

    .line 261
    :cond_5
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz v1, :cond_9

    .line 270
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x1

    if-gt v4, v6, :cond_7

    goto :goto_4

    .line 271
    :cond_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 21
    new-instance v6, Ljava/util/IdentityHashMap;

    invoke-direct {v6, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v6}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v4

    .line 278
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    if-eq v6, v1, :cond_8

    if-eq v6, v1, :cond_8

    .line 281
    instance-of v7, v6, Ljava/util/concurrent/CancellationException;

    if-nez v7, :cond_8

    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 75
    invoke-static {v1, v6}, Ll/ۧ۠᩵;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 216
    :cond_9
    :goto_4
    monitor-exit v0

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    if-ne v1, v2, :cond_b

    goto :goto_5

    .line 225
    :cond_b
    new-instance p2, Ll/ᩴۗ᩵;

    .line 42
    invoke-direct {p2, v1, v5}, Ll/ᩴۗ᩵;-><init>(Ljava/lang/Throwable;Z)V

    :goto_5
    if-eqz v1, :cond_e

    .line 229
    invoke-direct {p0, v1}, Ll/ᩳ۫᩵;->ܽ(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p0, v1}, Ll/ᩳ۫᩵;->ۧ(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_c
    if-eqz p2, :cond_d

    .line 230
    move-object v0, p2

    check-cast v0, Ll/ᩴۗ᩵;

    invoke-virtual {v0}, Ll/ᩴۗ᩵;->֫()Z

    goto :goto_6

    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 237
    :cond_e
    :goto_6
    sget-object v1, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1284
    instance-of v0, p2, Ll/᩶۬᩵;

    if-eqz v0, :cond_f

    new-instance v0, Ll/ۙ۬᩵;

    move-object v2, p2

    check-cast v2, Ll/᩶۬᩵;

    invoke-direct {v0, v2}, Ll/ۙ۬᩵;-><init>(Ll/᩶۬᩵;)V

    goto :goto_7

    :cond_f
    move-object v0, p2

    .line 0
    :cond_10
    :goto_7
    invoke-virtual {v1, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_8

    :cond_11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_10

    .line 240
    :goto_8
    invoke-direct {p0, p1, p2}, Ll/ᩳ۫᩵;->֫(Ll/᩶۬᩵;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p1

    .line 216
    monitor-exit v0

    throw p1
.end method

.method public static ֫(Ll/᩷ۛ᩵;)Ll/ۖۗ᩵;
    .locals 1

    .line 941
    :goto_0
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩷ۛ᩵;->᩷()Ll/᩷ۛ᩵;

    move-result-object p0

    goto :goto_0

    .line 943
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->ۜ()Ll/᩷ۛ᩵;

    move-result-object p0

    .line 944
    invoke-virtual {p0}, Ll/᩷ۛ᩵;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 945
    instance-of v0, p0, Ll/ۖۗ᩵;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ۖۗ᩵;

    return-object p0

    .line 946
    :cond_1
    instance-of v0, p0, Ll/᩻۫᩵;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0
.end method

.method private final ֫(Ll/᩶۬᩵;)Ll/᩻۫᩵;
    .locals 3

    .line 773
    invoke-interface {p1}, Ll/᩶۬᩵;->ᩳ()Ll/᩻۫᩵;

    move-result-object v0

    if-nez v0, :cond_4

    .line 775
    instance-of v0, p1, Ll/ܺ۬᩵;

    if-eqz v0, :cond_0

    new-instance p1, Ll/᩻۫᩵;

    invoke-direct {p1}, Ll/᩻۫᩵;-><init>()V

    return-object p1

    .line 776
    :cond_0
    instance-of v0, p1, Ll/۟۬᩵;

    if-eqz v0, :cond_3

    .line 779
    move-object v0, p1

    check-cast v0, Ll/۟۬᩵;

    .line 535
    new-instance p1, Ll/᩻۫᩵;

    invoke-direct {p1}, Ll/᩻۫᩵;-><init>()V

    invoke-virtual {v0, p1}, Ll/᩷ۛ᩵;->֫(Ll/᩻۫᩵;)V

    .line 537
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->ۜ()Ll/᩷ۛ᩵;

    move-result-object v1

    .line 0
    :cond_1
    sget-object p1, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 780
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 782
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State should have list: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    return-object v0
.end method

.method public static final ֫(Ll/ᩳ۫᩵;Ll/ۧ۫᩵;Ll/ۖۗ᩵;Ljava/lang/Object;)V
    .locals 3

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    invoke-static {p2}, Ll/ᩳ۫᩵;->֫(Ll/᩷ۛ᩵;)Ll/ۖۗ᩵;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 918
    :cond_0
    iget-object v0, p2, Ll/ۖۗ᩵;->ۗ:Ll/ᩳ۫᩵;

    .line 920
    new-instance v1, Ll/֫۫᩵;

    invoke-direct {v1, p0, p1, p2, p3}, Ll/֫۫᩵;-><init>(Ll/ᩳ۫᩵;Ll/ۧ۫᩵;Ll/ۖۗ᩵;Ljava/lang/Object;)V

    const/4 v2, 0x1

    .line 918
    invoke-static {v0, v1, v2}, Ll/۬۬᩵;->֫(Ll/ۤ۬᩵;Ll/۟۬᩵;I)Ll/ۡ۬᩵;

    move-result-object v0

    .line 922
    sget-object v1, Ll/ۜ۫᩵;->᩸:Ll/ۜ۫᩵;

    if-eq v0, v1, :cond_1

    return-void

    .line 923
    :cond_1
    invoke-static {p2}, Ll/ᩳ۫᩵;->֫(Ll/᩷ۛ᩵;)Ll/ۖۗ᩵;

    move-result-object p2

    if-nez p2, :cond_0

    .line 935
    :cond_2
    invoke-direct {p0, p1, p3}, Ll/ᩳ۫᩵;->֫(Ll/ۧ۫᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 936
    invoke-virtual {p0, p1}, Ll/ᩳ۫᩵;->ܽ(Ljava/lang/Object;)V

    return-void
.end method

.method private final ֫(Ll/᩶۬᩵;Ljava/lang/Object;)V
    .locals 7

    .line 133
    iget-object v0, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Ll/ܺۗ᩵;

    if-eqz v0, :cond_0

    .line 308
    invoke-interface {v0}, Ll/ۡ۬᩵;->ܿ()V

    .line 309
    sget-object v0, Ll/ۜ۫᩵;->᩸:Ll/ۜ۫᩵;

    .line 134
    iput-object v0, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    .line 311
    :cond_0
    instance-of v0, p2, Ll/ᩴۗ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Ll/ᩴۗ᩵;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    goto :goto_1

    :cond_2
    move-object p2, v1

    .line 316
    :goto_1
    instance-of v0, p1, Ll/۟۬᩵;

    const-string v2, " for "

    const-string v3, "Exception in completion handler "

    if-eqz v0, :cond_3

    .line 318
    :try_start_0
    move-object v0, p1

    check-cast v0, Ll/۟۬᩵;

    invoke-virtual {v0, p2}, Ll/֡ۗ᩵;->ۧ(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    .line 320
    new-instance v0, Ll/ۚۗ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 320
    invoke-virtual {p0, v0}, Ll/ᩳ۫᩵;->֫(Ll/ۚۗ᩵;)V

    goto :goto_4

    .line 323
    :cond_3
    invoke-interface {p1}, Ll/᩶۬᩵;->ᩳ()Ll/᩻۫᩵;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 645
    invoke-virtual {p1}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۛ᩵;

    .line 646
    :goto_2
    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 647
    instance-of v4, v0, Ll/۟۬᩵;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Ll/۟۬᩵;

    .line 368
    :try_start_1
    invoke-virtual {v4, p2}, Ll/֡ۗ᩵;->ۧ(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    if-eqz v1, :cond_4

    .line 75
    invoke-static {v1, v5}, Ll/ۧ۠᩵;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 371
    :cond_4
    new-instance v1, Ll/ۚۗ᩵;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-direct {v1, v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 370
    sget-object v4, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    .line 648
    :cond_5
    :goto_3
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->ۜ()Ll/᩷ۛ᩵;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    .line 375
    invoke-virtual {p0, v1}, Ll/ᩳ۫᩵;->֫(Ll/ۚۗ᩵;)V

    :cond_7
    :goto_4
    return-void
.end method

.method private final ֫(Ll/᩻۫᩵;Ljava/lang/Throwable;)V
    .locals 6

    .line 645
    invoke-virtual {p1}, Ll/᩷ۛ᩵;->᩻()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۛ᩵;

    const/4 v1, 0x0

    .line 646
    :goto_0
    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 647
    instance-of v2, v0, Ll/ۨ۬᩵;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ll/۟۬᩵;

    .line 368
    :try_start_0
    invoke-virtual {v2, p2}, Ll/֡ۗ᩵;->ۧ(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 75
    invoke-static {v1, v3}, Ll/ۧ۠᩵;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 371
    :cond_0
    new-instance v1, Ll/ۚۗ᩵;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exception in completion handler "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-direct {v1, v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 370
    sget-object v2, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    .line 648
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->ۜ()Ll/᩷ۛ᩵;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 375
    invoke-virtual {p0, v1}, Ll/ᩳ۫᩵;->֫(Ll/ۚۗ᩵;)V

    .line 332
    :cond_3
    invoke-direct {p0, p2}, Ll/ᩳ۫᩵;->ܽ(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static ۜ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1061
    instance-of v0, p0, Ll/ۧ۫᩵;

    if-eqz v0, :cond_1

    .line 1062
    check-cast p0, Ll/ۧ۫᩵;

    invoke-virtual {p0}, Ll/ۧ۫᩵;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Cancelling"

    return-object p0

    .line 1063
    :cond_0
    invoke-virtual {p0}, Ll/ۧ۫᩵;->ܿ()Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Completing"

    return-object p0

    .line 1066
    :cond_1
    instance-of v0, p0, Ll/᩶۬᩵;

    if-eqz v0, :cond_4

    check-cast p0, Ll/᩶۬᩵;

    invoke-interface {p0}, Ll/᩶۬᩵;->ܽ()Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const-string p0, "Active"

    return-object p0

    :cond_3
    const-string p0, "New"

    return-object p0

    .line 1067
    :cond_4
    instance-of p0, p0, Ll/ᩴۗ᩵;

    if-eqz p0, :cond_5

    const-string p0, "Cancelled"

    return-object p0

    :cond_5
    const-string p0, "Completed"

    return-object p0
.end method

.method private final ܽ(Ljava/lang/Throwable;)Z
    .locals 4

    .line 344
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۡ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 350
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 133
    iget-object v2, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    check-cast v2, Ll/ܺۗ᩵;

    if-eqz v2, :cond_4

    .line 353
    sget-object v3, Ll/ۜ۫᩵;->᩸:Ll/ۜ۫᩵;

    if-ne v2, v3, :cond_1

    goto :goto_1

    .line 358
    :cond_1
    invoke-interface {v2, p1}, Ll/ܺۗ᩵;->֫(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method private final ᩻(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 719
    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_1

    .line 703
    new-instance p1, Ll/ۛ۬᩵;

    .line 27
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->֫()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 703
    invoke-direct {p1, v0, v1, p0}, Ll/ۛ۬᩵;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ll/ᩳ۫᩵;)V

    :cond_1
    return-object p1

    :cond_2
    if-eqz p1, :cond_3

    .line 720
    check-cast p1, Ll/ۢ۫᩵;

    invoke-interface {p1}, Ll/ۢ۫᩵;->᩻()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getKey()Ll/ܿ᩸᩵;
    .locals 1

    .line 29
    sget-object v0, Ll/۫۬᩵;->᩸:Ll/۫۬᩵;

    return-object v0
.end method

.method public final start()Z
    .locals 4

    .line 177
    :goto_0
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v0

    .line 393
    instance-of v1, v0, Ll/ܺ۬᩵;

    sget-object v2, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    if-eqz v1, :cond_3

    .line 394
    move-object v1, v0

    check-cast v1, Ll/ܺ۬᩵;

    invoke-virtual {v1}, Ll/ܺ۬᩵;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 395
    :cond_0
    invoke-static {}, Ll/ܿ۫᩵;->ܽ()Ll/ܺ۬᩵;

    move-result-object v1

    .line 0
    :cond_1
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 396
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ܺ()V

    goto :goto_1

    .line 0
    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_1

    goto :goto_0

    .line 399
    :cond_3
    instance-of v1, v0, Ll/᩹۬᩵;

    if-eqz v1, :cond_6

    .line 400
    move-object v1, v0

    check-cast v1, Ll/᩹۬᩵;

    invoke-virtual {v1}, Ll/᩹۬᩵;->ᩳ()Ll/᩻۫᩵;

    move-result-object v1

    .line 0
    :cond_4
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 401
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ܺ()V

    :goto_1
    const/4 v0, 0x1

    return v0

    .line 0
    :cond_5
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_4

    goto :goto_0

    :cond_6
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1050
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1053
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    .line 1053
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/ᩳ۫᩵;->ۜ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1050
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/ۧ۬᩵;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;
    .locals 0

    .line 70
    invoke-interface {p2, p1, p0}, Ll/᩵᩹᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public final ֫(ZZLl/۟۬᩵;)Ll/ۡ۬᩵;
    .locals 11

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 512
    instance-of v0, p3, Ll/ۨ۬᩵;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ll/ۨ۬᩵;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    .line 513
    new-instance v0, Ll/ۗ۬᩵;

    invoke-direct {v0, p3}, Ll/ۗ۬᩵;-><init>(Ll/۟۬᩵;)V

    :cond_1
    move-object v2, v0

    goto :goto_1

    :cond_2
    move-object v2, p3

    .line 1355
    :goto_1
    iput-object p0, v2, Ll/۟۬᩵;->ۙ:Ll/ᩳ۫᩵;

    .line 177
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v3

    .line 461
    instance-of v0, v3, Ll/ܺ۬᩵;

    if-eqz v0, :cond_a

    .line 462
    move-object v0, v3

    check-cast v0, Ll/ܺ۬᩵;

    invoke-virtual {v0}, Ll/ܺ۬᩵;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 464
    sget-object v4, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_4
    invoke-virtual {v4, p0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_8

    :cond_5
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v3, :cond_4

    goto :goto_2

    .line 528
    :cond_6
    new-instance v3, Ll/᩻۫᩵;

    invoke-direct {v3}, Ll/᩻۫᩵;-><init>()V

    .line 529
    invoke-virtual {v0}, Ll/ܺ۬᩵;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_7

    move-object v4, v3

    goto :goto_3

    :cond_7
    new-instance v4, Ll/᩹۬᩵;

    invoke-direct {v4, v3}, Ll/᩹۬᩵;-><init>(Ll/᩻۫᩵;)V

    .line 530
    :goto_3
    sget-object v5, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_8
    invoke-virtual {v5, p0, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_8

    goto :goto_2

    .line 468
    :cond_a
    instance-of v0, v3, Ll/᩶۬᩵;

    if-eqz v0, :cond_18

    .line 469
    move-object v4, v3

    check-cast v4, Ll/᩶۬᩵;

    invoke-interface {v4}, Ll/᩶۬᩵;->ᩳ()Ll/᩻۫᩵;

    move-result-object v5

    if-nez v5, :cond_d

    .line 471
    move-object v0, v3

    check-cast v0, Ll/۟۬᩵;

    .line 535
    new-instance v3, Ll/᩻۫᩵;

    invoke-direct {v3}, Ll/᩻۫᩵;-><init>()V

    invoke-virtual {v0, v3}, Ll/᩷ۛ᩵;->֫(Ll/᩻۫᩵;)V

    .line 537
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->ۜ()Ll/᩷ۛ᩵;

    move-result-object v6

    .line 539
    sget-object v7, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_b
    invoke-virtual {v7, p0, v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_2

    :cond_c
    invoke-virtual {v7, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_b

    goto :goto_2

    .line 474
    :cond_d
    sget-object v6, Ll/ۜ۫᩵;->᩸:Ll/ۜ۫᩵;

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz p1, :cond_14

    .line 475
    instance-of v0, v3, Ll/ۧ۫᩵;

    if-eqz v0, :cond_14

    move-object v0, v3

    .line 20
    monitor-enter v0

    .line 478
    :try_start_0
    move-object v9, v3

    check-cast v9, Ll/ۧ۫᩵;

    invoke-virtual {v9}, Ll/ۧ۫᩵;->֫()Ljava/lang/Throwable;

    move-result-object v9

    if-eqz v9, :cond_e

    .line 47
    instance-of v10, p3, Ll/ۖۗ᩵;

    if-eqz v10, :cond_13

    .line 481
    move-object v10, v3

    check-cast v10, Ll/ۧ۫᩵;

    invoke-virtual {v10}, Ll/ۧ۫᩵;->ܿ()Z

    move-result v10

    if-nez v10, :cond_13

    .line 483
    :cond_e
    check-cast v3, Ll/᩶۬᩵;

    .line 91
    new-instance v6, Ll/ܽ۫᩵;

    invoke-direct {v6, v2, p0, v3}, Ll/ܽ۫᩵;-><init>(Ll/۟۬᩵;Ll/ᩳ۫᩵;Ll/᩶۬᩵;)V

    .line 156
    :goto_4
    invoke-virtual {v5}, Ll/᩷ۛ᩵;->᩷()Ll/᩷ۛ᩵;

    move-result-object v3

    .line 157
    invoke-virtual {v3, v2, v5, v6}, Ll/᩷ۛ᩵;->֫(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;Ll/᩻ۛ᩵;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v3, v8, :cond_10

    if-eq v3, v7, :cond_f

    goto :goto_4

    :cond_f
    const/4 v3, 0x0

    goto :goto_5

    :cond_10
    const/4 v3, 0x1

    :goto_5
    if-nez v3, :cond_11

    .line 483
    monitor-exit v0

    goto/16 :goto_2

    :cond_11
    if-nez v9, :cond_12

    .line 485
    monitor-exit v0

    return-object v2

    :cond_12
    move-object v6, v2

    .line 489
    :cond_13
    :try_start_1
    sget-object v3, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_6

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_14
    move-object v9, v1

    :goto_6
    if-eqz v9, :cond_16

    if-eqz p2, :cond_15

    .line 22
    invoke-interface {p3, v9}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    return-object v6

    .line 91
    :cond_16
    new-instance v0, Ll/ܽ۫᩵;

    invoke-direct {v0, v2, p0, v4}, Ll/ܽ۫᩵;-><init>(Ll/۟۬᩵;Ll/ᩳ۫᩵;Ll/᩶۬᩵;)V

    .line 156
    :goto_7
    invoke-virtual {v5}, Ll/᩷ۛ᩵;->᩷()Ll/᩷ۛ᩵;

    move-result-object v3

    .line 157
    invoke-virtual {v3, v2, v5, v0}, Ll/᩷ۛ᩵;->֫(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;Ll/᩻ۛ᩵;)I

    move-result v3

    if-eq v3, v8, :cond_17

    if-eq v3, v7, :cond_3

    goto :goto_7

    :cond_17
    :goto_8
    return-object v2

    :cond_18
    if-eqz p2, :cond_1b

    .line 503
    instance-of p1, v3, Ll/ᩴۗ᩵;

    if-eqz p1, :cond_19

    check-cast v3, Ll/ᩴۗ᩵;

    goto :goto_9

    :cond_19
    move-object v3, v1

    :goto_9
    if-eqz v3, :cond_1a

    iget-object v1, v3, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    .line 22
    :cond_1a
    invoke-interface {p3, v1}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    :cond_1b
    sget-object p1, Ll/ۜ۫᩵;->᩸:Ll/ۜ۫᩵;

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 112
    invoke-static {p0, p1}, Ll/ܽ᩸᩵;->֫(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳ۫᩵;)Ll/ܺۗ᩵;
    .locals 1

    .line 970
    new-instance v0, Ll/ۖۗ᩵;

    invoke-direct {v0, p1}, Ll/ۖۗ᩵;-><init>(Ll/ᩳ۫᩵;)V

    const/4 p1, 0x2

    invoke-static {p0, v0, p1}, Ll/۬۬᩵;->֫(Ll/ۤ۬᩵;Ll/۟۬᩵;I)Ll/ۡ۬᩵;

    move-result-object p1

    check-cast p1, Ll/ܺۗ᩵;

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;
    .locals 1

    const-string v0, "key"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    sget-object v0, Ll/۫۬᩵;->᩸:Ll/۫۬᩵;

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    .line 703
    new-instance p1, Ll/ۛ۬᩵;

    .line 27
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->֫()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 703
    invoke-direct {p1, v0, v1, p0}, Ll/ۛ۬᩵;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ll/ᩳ۫᩵;)V

    .line 632
    :cond_0
    invoke-virtual {p0, p1}, Ll/ᩳ۫᩵;->ܿ(Ljava/lang/Object;)Z

    return-void
.end method

.method public ֫(Ll/ۚۗ᩵;)V
    .locals 0

    .line 980
    throw p1
.end method

.method public final ֫(Ll/۟۬᩵;)V
    .locals 4

    .line 177
    :goto_0
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v0

    .line 592
    instance-of v1, v0, Ll/۟۬᩵;

    if-eqz v1, :cond_3

    if-eq v0, p1, :cond_0

    goto :goto_1

    .line 595
    :cond_0
    invoke-static {}, Ll/ܿ۫᩵;->ܽ()Ll/ܺ۬᩵;

    move-result-object v1

    .line 0
    :cond_1
    sget-object v2, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_1

    goto :goto_0

    .line 597
    :cond_3
    instance-of v1, v0, Ll/᩶۬᩵;

    if-eqz v1, :cond_4

    .line 599
    check-cast v0, Ll/᩶۬᩵;

    invoke-interface {v0}, Ll/᩶۬᩵;->ᩳ()Ll/᩻۫᩵;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 245
    invoke-virtual {p1}, Ll/᩷ۛ᩵;->ۖ()Ll/᩷ۛ᩵;

    :cond_4
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۤ۬᩵;)V
    .locals 2

    .line 143
    sget-object v0, Ll/ۜ۫᩵;->᩸:Ll/ۜ۫᩵;

    if-nez p1, :cond_0

    .line 134
    iput-object v0, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    return-void

    .line 148
    :cond_0
    invoke-interface {p1}, Ll/ۤ۬᩵;->start()Z

    .line 150
    invoke-interface {p1, p0}, Ll/ۤ۬᩵;->֫(Ll/ᩳ۫᩵;)Ll/ܺۗ᩵;

    move-result-object p1

    .line 134
    iput-object p1, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    .line 186
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ll/᩶۬᩵;

    if-nez v1, :cond_1

    .line 154
    invoke-interface {p1}, Ll/ۡ۬᩵;->ܿ()V

    .line 134
    iput-object v0, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ljava/lang/Object;
    .locals 2

    .line 1482
    :goto_0
    iget-object v0, p0, Ll/ᩳ۫᩵;->_state:Ljava/lang/Object;

    .line 167
    instance-of v1, v0, Ll/᩵ۛ᩵;

    if-nez v1, :cond_0

    return-object v0

    .line 168
    :cond_0
    check-cast v0, Ll/᩵ۛ᩵;

    invoke-virtual {v0, p0}, Ll/᩵ۛ᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 112
    invoke-static {p0, p1}, Ll/ܽ᩸᩵;->֫(Ll/ᩳ᩸᩵;Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 177
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v0

    .line 828
    invoke-direct {p0, v0, p1}, Ll/ᩳ۫᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 830
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 831
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 832
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Job "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 910
    instance-of v2, p1, Ll/ᩴۗ᩵;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p1, Ll/ᩴۗ᩵;

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_2

    iget-object v3, p1, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    .line 831
    :cond_2
    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 835
    :cond_3
    invoke-static {}, Ll/ܿ۫᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0
.end method

.method public ܺ()V
    .locals 0

    return-void
.end method

.method public ܽ(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public ܽ()Z
    .locals 2

    .line 182
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v0

    .line 183
    instance-of v1, v0, Ll/᩶۬᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩶۬᩵;

    invoke-interface {v0}, Ll/᩶۬᩵;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ(Ljava/lang/Object;)Z
    .locals 9

    .line 663
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object v0

    .line 0
    instance-of v1, p0, Ll/᩺۬᩵;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    .line 177
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v0

    .line 691
    instance-of v1, v0, Ll/᩶۬᩵;

    if-eqz v1, :cond_2

    instance-of v1, v0, Ll/ۧ۫᩵;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ll/ۧ۫᩵;

    invoke-virtual {v1}, Ll/ۧ۫᩵;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 695
    :cond_1
    new-instance v1, Ll/ᩴۗ᩵;

    invoke-direct {p0, p1}, Ll/ᩳ۫᩵;->᩻(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    .line 42
    invoke-direct {v1, v4, v2}, Ll/ᩴۗ᩵;-><init>(Ljava/lang/Throwable;Z)V

    .line 696
    invoke-direct {p0, v0, v1}, Ll/ᩳ۫᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 697
    invoke-static {}, Ll/ܿ۫᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object v1

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 693
    :cond_2
    :goto_0
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object v0

    .line 668
    :goto_1
    sget-object v1, Ll/ܿ۫᩵;->ܽ:Ll/ܶۛ᩵;

    if-ne v0, v1, :cond_3

    goto/16 :goto_5

    .line 670
    :cond_3
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object v1

    if-ne v0, v1, :cond_13

    const/4 v1, 0x0

    move-object v4, v1

    .line 177
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v5

    .line 734
    instance-of v0, v5, Ll/ۧ۫᩵;

    if-eqz v0, :cond_b

    move-object v0, v5

    .line 20
    monitor-enter v0

    .line 736
    :try_start_0
    move-object v6, v5

    check-cast v6, Ll/ۧ۫᩵;

    invoke-virtual {v6}, Ll/ۧ۫᩵;->ܳ()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {}, Ll/ܿ۫᩵;->ܳ()Ll/ܶۛ᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto/16 :goto_3

    .line 738
    :cond_5
    :try_start_1
    move-object v6, v5

    check-cast v6, Ll/ۧ۫᩵;

    invoke-virtual {v6}, Ll/ۧ۫᩵;->ۧ()Z

    move-result v6

    if-nez p1, :cond_6

    if-nez v6, :cond_8

    :cond_6
    if-nez v4, :cond_7

    .line 741
    invoke-direct {p0, p1}, Ll/ᩳ۫᩵;->᩻(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    .line 742
    :cond_7
    move-object p1, v5

    check-cast p1, Ll/ۧ۫᩵;

    invoke-virtual {p1, v4}, Ll/ۧ۫᩵;->֫(Ljava/lang/Throwable;)V

    .line 745
    :cond_8
    move-object p1, v5

    check-cast p1, Ll/ۧ۫᩵;

    invoke-virtual {p1}, Ll/ۧ۫᩵;->֫()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v6, :cond_9

    move-object v1, p1

    :cond_9
    monitor-exit v0

    if-eqz v1, :cond_a

    .line 747
    check-cast v5, Ll/ۧ۫᩵;

    invoke-virtual {v5}, Ll/ۧ۫᩵;->ᩳ()Ll/᩻۫᩵;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Ll/ᩳ۫᩵;->֫(Ll/᩻۫᩵;Ljava/lang/Throwable;)V

    .line 748
    :cond_a
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object p1

    goto :goto_3

    :catchall_0
    move-exception p1

    .line 745
    monitor-exit v0

    throw p1

    .line 750
    :cond_b
    instance-of v0, v5, Ll/᩶۬᩵;

    if-eqz v0, :cond_12

    if-nez v4, :cond_c

    .line 752
    invoke-direct {p0, p1}, Ll/ᩳ۫᩵;->᩻(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    .line 753
    :cond_c
    move-object v0, v5

    check-cast v0, Ll/᩶۬᩵;

    invoke-interface {v0}, Ll/᩶۬᩵;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_10

    .line 790
    invoke-direct {p0, v0}, Ll/ᩳ۫᩵;->֫(Ll/᩶۬᩵;)Ll/᩻۫᩵;

    move-result-object v6

    if-nez v6, :cond_d

    goto :goto_2

    .line 792
    :cond_d
    new-instance v7, Ll/ۧ۫᩵;

    invoke-direct {v7, v6, v4}, Ll/ۧ۫᩵;-><init>(Ll/᩻۫᩵;Ljava/lang/Throwable;)V

    .line 793
    sget-object v8, Ll/ᩳ۫᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_e
    invoke-virtual {v8, p0, v0, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 795
    invoke-direct {p0, v6, v4}, Ll/ᩳ۫᩵;->֫(Ll/᩻۫᩵;Ljava/lang/Throwable;)V

    .line 755
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object p1

    goto :goto_3

    .line 0
    :cond_f
    invoke-virtual {v8, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v0, :cond_e

    goto/16 :goto_2

    .line 758
    :cond_10
    new-instance v0, Ll/ᩴۗ᩵;

    .line 42
    invoke-direct {v0, v4, v2}, Ll/ᩴۗ᩵;-><init>(Ljava/lang/Throwable;Z)V

    .line 758
    invoke-direct {p0, v5, v0}, Ll/ᩳ۫᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 760
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object v6

    if-eq v0, v6, :cond_11

    .line 761
    invoke-static {}, Ll/ܿ۫᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object v5

    if-eq v0, v5, :cond_4

    goto :goto_4

    .line 760
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot happen in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 766
    :cond_12
    invoke-static {}, Ll/ܿ۫᩵;->ܳ()Ll/ܶۛ᩵;

    move-result-object p1

    :goto_3
    move-object v0, p1

    .line 674
    :cond_13
    :goto_4
    invoke-static {}, Ll/ܿ۫᩵;->֫()Ll/ܶۛ᩵;

    move-result-object p1

    if-ne v0, p1, :cond_14

    goto :goto_5

    .line 675
    :cond_14
    sget-object p1, Ll/ܿ۫᩵;->ܽ:Ll/ܶۛ᩵;

    if-ne v0, p1, :cond_15

    :goto_5
    return v3

    .line 676
    :cond_15
    invoke-static {}, Ll/ܿ۫᩵;->ܳ()Ll/ܶۛ᩵;

    move-result-object p1

    if-ne v0, p1, :cond_16

    return v2

    .line 678
    :cond_16
    invoke-virtual {p0, v0}, Ll/ᩳ۫᩵;->ܽ(Ljava/lang/Object;)V

    return v3
.end method

.method public final ᩳ()Ljava/util/concurrent/CancellationException;
    .locals 4

    .line 415
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v0

    .line 416
    instance-of v1, v0, Ll/ۧ۫᩵;

    const-string v2, "Job is still new or active: "

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    check-cast v0, Ll/ۧ۫᩵;

    invoke-virtual {v0}, Ll/ۧ۫᩵;->֫()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " is cancelling"

    .line 416
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 424
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v3, :cond_2

    .line 703
    new-instance v2, Ll/ۛ۬᩵;

    if-nez v1, :cond_1

    .line 27
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->֫()Ljava/lang/String;

    move-result-object v1

    .line 703
    :cond_1
    invoke-direct {v2, v1, v0, p0}, Ll/ۛ۬᩵;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ll/ᩳ۫᩵;)V

    return-object v2

    :cond_2
    return-object v3

    .line 416
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 417
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 418
    :cond_4
    instance-of v1, v0, Ll/᩶۬᩵;

    if-nez v1, :cond_8

    .line 419
    instance-of v1, v0, Ll/ᩴۗ᩵;

    if-eqz v1, :cond_7

    check-cast v0, Ll/ᩴۗ᩵;

    iget-object v0, v0, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    .line 424
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_5

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/CancellationException;

    :cond_5
    if-nez v3, :cond_6

    .line 703
    new-instance v1, Ll/ۛ۬᩵;

    .line 27
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->֫()Ljava/lang/String;

    move-result-object v2

    .line 703
    invoke-direct {v1, v2, v0, p0}, Ll/ۛ۬᩵;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ll/ᩳ۫᩵;)V

    return-object v1

    :cond_6
    return-object v3

    .line 420
    :cond_7
    new-instance v0, Ll/ۛ۬᩵;

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " has completed normally"

    .line 420
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3, p0}, Ll/ۛ۬᩵;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ll/ᩳ۫᩵;)V

    return-object v0

    .line 418
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ᩳ(Ljava/lang/Object;)V
    .locals 0

    .line 105
    invoke-virtual {p0, p1}, Ll/ᩳ۫᩵;->ܽ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩷()Ll/ܺۗ᩵;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ᩳ۫᩵;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Ll/ܺۗ᩵;

    return-object v0
.end method

.method public final ᩻()Ljava/util/concurrent/CancellationException;
    .locals 4

    .line 707
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object v0

    .line 709
    instance-of v1, v0, Ll/ۧ۫᩵;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ll/ۧ۫᩵;

    invoke-virtual {v1}, Ll/ۧ۫᩵;->֫()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    .line 710
    :cond_0
    instance-of v1, v0, Ll/ᩴۗ᩵;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ll/ᩴۗ᩵;

    iget-object v1, v1, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    goto :goto_0

    .line 711
    :cond_1
    instance-of v1, v0, Ll/᩶۬᩵;

    if-nez v1, :cond_4

    move-object v1, v2

    .line 714
    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Ll/ۛ۬᩵;

    invoke-static {v0}, Ll/ᩳ۫᩵;->ۜ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Ll/ۛ۬᩵;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ll/ᩳ۫᩵;)V

    :cond_3
    return-object v2

    .line 711
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
