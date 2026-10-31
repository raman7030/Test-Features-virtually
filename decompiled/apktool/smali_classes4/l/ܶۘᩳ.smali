.class public final Ll/ܶۘᩳ;
.super Ljava/lang/Object;
.source "G6SF"


# static fields
.field public static final synthetic ۜ:I

.field public static final ۢ:Ljava/util/HashMap;

.field public static final ᩷:Ljava/lang/ref/ReferenceQueue;


# instance fields
.field public final ֫:Ljava/util/IdentityHashMap;

.field public ۧ:Ll/ۗ᩻᩵;

.field public ܳ:Z

.field public final ܽ:Ljava/lang/Object;

.field public ܿ:Ljava/lang/Throwable;

.field public final ᩳ:Ll/ۗ᩻᩵;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܶۘᩳ;->ۢ:Ljava/util/HashMap;

    .line 22
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    sput-object v0, Ll/ܶۘᩳ;->᩷:Ljava/lang/ref/ReferenceQueue;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܶۘᩳ;->ܽ:Ljava/lang/Object;

    .line 24
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/ܶۘᩳ;->ᩳ:Ll/ۗ᩻᩵;

    .line 25
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ܶۘᩳ;->֫:Ljava/util/IdentityHashMap;

    const/4 v0, 0x0

    .line 26
    invoke-static {v0}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۘᩳ;->ۧ:Ll/ۗ᩻᩵;

    return-void
.end method

.method public static ֫(Ll/᩷۠ᩴ;)Ll/ܶۘᩳ;
    .locals 6

    .line 33
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object p0

    .line 34
    sget-object v0, Ll/ܶۘᩳ;->ۢ:Ljava/util/HashMap;

    monitor-enter v0

    .line 36
    :goto_0
    :try_start_0
    sget-object v1, Ll/ܶۘᩳ;->᩷:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v1

    check-cast v1, Ll/֨ۘᩳ;

    if-eqz v1, :cond_0

    sget-object v2, Ll/ܶۘᩳ;->ۢ:Ljava/util/HashMap;

    iget-object v3, v1, Ll/֨ۘᩳ;->֫:Ll/᩷۠ᩴ;

    invoke-static {v2, v3, v1}, Ll/ܰ۬ᩴ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    .line 37
    :cond_0
    sget-object v1, Ll/ܶۘᩳ;->ۢ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۘᩳ;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶۘᩳ;

    :goto_1
    if-nez v2, :cond_3

    .line 40
    new-instance v2, Ll/ܶۘᩳ;

    invoke-direct {v2}, Ll/ܶۘᩳ;-><init>()V

    const/4 v3, 0x1

    new-array v3, v3, [Ll/ܳ۠ᩴ;

    .line 42
    sget-object v4, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {p0, v3}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ll/ܶۘᩳ;->֫()Ll/ۗ᩻᩵;

    .line 43
    :cond_2
    new-instance v3, Ll/֨ۘᩳ;

    invoke-direct {v3, p0, v2}, Ll/֨ۘᩳ;-><init>(Ll/᩷۠ᩴ;Ll/ܶۘᩳ;)V

    invoke-virtual {v1, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_3
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܶۘᩳ;Ljava/lang/Throwable;)V
    .locals 3

    move-object v0, p0

    .line 99
    monitor-enter v0

    .line 100
    :try_start_0
    iget-boolean v1, p0, Ll/ܶۘᩳ;->ܳ:Z

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    .line 101
    iget-object v1, p0, Ll/ܶۘᩳ;->ܿ:Ljava/lang/Throwable;

    if-nez v1, :cond_0

    iput-object p1, p0, Ll/ܶۘᩳ;->ܿ:Ljava/lang/Throwable;

    goto :goto_0

    :cond_0
    if-eq v1, p1, :cond_1

    .line 102
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 104
    :cond_1
    :goto_0
    iget p1, p0, Ll/ܶۘᩳ;->᩻:I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    iput p1, p0, Ll/ܶۘᩳ;->᩻:I

    .line 105
    iget-boolean v2, p0, Ll/ܶۘᩳ;->ܳ:Z

    if-eqz v2, :cond_2

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 106
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    .line 107
    invoke-direct {p0}, Ll/ܶۘᩳ;->ᩳ()V

    :cond_3
    return-void

    :catchall_0
    move-exception p0

    .line 106
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ܽ()Ljava/lang/ref/ReferenceQueue;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶۘᩳ;->᩷:Ljava/lang/ref/ReferenceQueue;

    return-object v0
.end method

.method private ᩳ()V
    .locals 2

    move-object v0, p0

    .line 112
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/ܶۘᩳ;->ܿ:Ljava/lang/Throwable;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 114
    iget-object v0, p0, Ll/ܶۘᩳ;->ᩳ:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Ll/ܶۘᩳ;->ᩳ:Ll/ۗ᩻᩵;

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v1

    .line 112
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫()Ll/ۗ᩻᩵;
    .locals 3

    move-object v0, p0

    .line 59
    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ll/ܶۘᩳ;->ܳ:Z

    iget v2, p0, Ll/ܶۘᩳ;->᩻:I

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_1

    .line 60
    invoke-direct {p0}, Ll/ܶۘᩳ;->ᩳ()V

    :cond_1
    move-object v0, p0

    .line 62
    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Ll/ܶۘᩳ;->ۧ:Ll/ۗ᩻᩵;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    iget-object v0, p0, Ll/ܶۘᩳ;->ᩳ:Ll/ۗ᩻᩵;

    new-instance v2, Ll/᩶ܽܽ;

    invoke-direct {v2, v1}, Ll/᩶ܽܽ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/֡ۘᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 62
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 59
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final ֫(Ll/۟᩺ᩳ;Ljava/util/concurrent/ThreadPoolExecutor;)Ll/ۗ᩻᩵;
    .locals 5

    move-object v0, p0

    .line 78
    monitor-enter v0

    .line 79
    :try_start_0
    iget-object v1, p0, Ll/ܶۘᩳ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩻᩵;

    if-nez v1, :cond_0

    .line 81
    new-instance v1, Ll/ۗ᩻᩵;

    invoke-direct {v1}, Ll/ۗ᩻᩵;-><init>()V

    .line 82
    iget-object v2, p0, Ll/ܶۘᩳ;->ۧ:Ll/ۗ᩻᩵;

    const/4 v3, 0x2

    new-array v3, v3, [Ll/ۗ᩻᩵;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    invoke-static {v3}, Ll/ۗ᩻᩵;->֫([Ll/ۗ᩻᩵;)Ll/ۗ᩻᩵;

    move-result-object v2

    iput-object v2, p0, Ll/ܶۘᩳ;->ۧ:Ll/ۗ᩻᩵;

    .line 84
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    :try_start_1
    new-instance v0, Ll/ۚۘᩳ;

    invoke-direct {v0, p1, v1}, Ll/ۚۘᩳ;-><init>(Ll/۟᩺ᩳ;Ll/ۗ᩻᩵;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 91
    invoke-virtual {v1, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 92
    :goto_0
    new-instance p1, Ll/֡ۘᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, p1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 84
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()Ll/۠ۘᩳ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 51
    :try_start_0
    iget-boolean v1, p0, Ll/ܶۘᩳ;->ܳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    :try_start_1
    iget v1, p0, Ll/ܶۘᩳ;->᩻:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܶۘᩳ;->᩻:I

    .line 53
    new-instance v1, Ll/۠ۘᩳ;

    invoke-direct {v1, p0}, Ll/۠ۘᩳ;-><init>(Ll/ܶۘᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
