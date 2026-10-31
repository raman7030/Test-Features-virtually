.class public final Ll/ۛۖۜ;
.super Ljava/lang/Object;
.source "Y6X9"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/concurrent/locks/Condition;

.field public final ܽ:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    iput-object v0, p0, Ll/ۛۖۜ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۖۜ;->ۧ:Ljava/util/concurrent/locks/Condition;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛۖۜ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۖۜ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۖۜ;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ֫(Ljava/util/Collection;Z)Ll/ۤۖۜ;
    .locals 2

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 51
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 56
    iget-object p1, p0, Ll/ۛۖۜ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 58
    :goto_0
    :try_start_0
    invoke-direct {p0, v0, p2}, Ll/ۛۖۜ;->֫(Ljava/util/ArrayList;Z)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 60
    :try_start_1
    iget-object v1, p0, Ll/ۛۖۜ;->ۧ:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->await()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 62
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    const-string p2, "FILE_OPERATION_INTERRUPTED"

    const-string v0, "File operation was interrupted while waiting for a path claim."

    .line 63
    invoke-static {p2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p2

    throw p2

    .line 67
    :cond_0
    new-instance v1, Ll/۫ۖۜ;

    invoke-direct {v1, v0, p2}, Ll/۫ۖۜ;-><init>(Ljava/util/ArrayList;Z)V

    .line 68
    iget-object p2, p0, Ll/ۛۖۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    new-instance p2, Ll/ۤۖۜ;

    invoke-direct {p2, p0, v1}, Ll/ۤۖۜ;-><init>(Ll/ۛۖۜ;Ll/۫ۖۜ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 72
    throw p2

    :cond_1
    const-string p1, "FILE_INVALID_PATH"

    const-string p2, "At least one path claim is required."

    .line 53
    invoke-static {p1, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ljava/util/ArrayList;Z)Z
    .locals 7

    .line 76
    iget-object v0, p0, Ll/ۛۖۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ۖۜ;

    if-nez p2, :cond_1

    .line 77
    iget-boolean v2, v1, Ll/۫ۖۜ;->ۧ:Z

    if-nez v2, :cond_1

    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 81
    iget-object v4, v1, Ll/۫ۖۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 82
    invoke-static {v3, v5}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 83
    invoke-static {v5, v3}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/ۛۖۜ;)Ljava/util/concurrent/locks/Condition;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۖۜ;->ۧ:Ljava/util/concurrent/locks/Condition;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛۖۜ;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۖۜ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۤۖۜ;
    .locals 1

    .line 25
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ll/ۛۖۜ;->֫(Ljava/util/Collection;Z)Ll/ۤۖۜ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/util/Collection;)Ll/ۤۖۜ;
    .locals 1

    const/4 v0, 0x1

    .line 46
    invoke-direct {p0, p1, v0}, Ll/ۛۖۜ;->֫(Ljava/util/Collection;Z)Ll/ۤۖۜ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/util/List;)Ll/ۤۖۜ;
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, v0}, Ll/ۛۖۜ;->֫(Ljava/util/Collection;Z)Ll/ۤۖۜ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ۤۖۜ;
    .locals 1

    .line 39
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/ۛۖۜ;->֫(Ljava/util/Collection;Z)Ll/ۤۖۜ;

    move-result-object p1

    return-object p1
.end method
