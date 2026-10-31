.class public final Ll/᩹ᩴᩳ;
.super Ljava/lang/Object;
.source "J6S5"


# static fields
.field public static final ܳ:Ljava/util/HashMap;

.field public static final synthetic ܿ:I


# instance fields
.field public final ֫:Ll/᩷۠ᩴ;

.field public final ۧ:Ll/ۗ᩻᩵;

.field public final ܽ:Ll/ۗ᩻᩵;

.field public ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/᩹ᩴᩳ;->ܳ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ll/᩷۠ᩴ;Ll/ۗ᩻᩵;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩹ᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    .line 17
    iput-object p1, p0, Ll/᩹ᩴᩳ;->֫:Ll/᩷۠ᩴ;

    iput-object p2, p0, Ll/᩹ᩴᩳ;->ܽ:Ll/ۗ᩻᩵;

    return-void
.end method

.method public static synthetic ֫(Ljava/util/Map$Entry;)Ll/ۗ᩻᩵;
    .locals 0

    .line 38
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹ᩴᩳ;

    iget-object p0, p0, Ll/᩹ᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    return-object p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;)Ll/᩹ᩴᩳ;
    .locals 4

    .line 22
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object p0

    .line 23
    sget-object v1, Ll/᩹ᩴᩳ;->ܳ:Ljava/util/HashMap;

    move-object v0, v1

    monitor-enter v0

    .line 24
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ᩴᩳ;

    .line 25
    new-instance v3, Ll/᩹ᩴᩳ;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 26
    invoke-static {v2}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, v2, Ll/᩹ᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    :goto_0
    invoke-direct {v3, p0, v2}, Ll/᩹ᩴᩳ;-><init>(Ll/᩷۠ᩴ;Ll/ۗ᩻᩵;)V

    .line 27
    invoke-virtual {v1, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception p0

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic ֫(Ll/᩹ᩴᩳ;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 3

    .line 48
    sget-object v1, Ll/᩹ᩴᩳ;->ܳ:Ljava/util/HashMap;

    move-object v0, v1

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Ll/᩹ᩴᩳ;->֫:Ll/᩷۠ᩴ;

    invoke-static {v1, v2, p0}, Ll/ܰ۬ᩴ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    if-nez p1, :cond_1

    .line 50
    iget-object p0, p0, Ll/᩹ᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 51
    :cond_1
    iget-object p0, p0, Ll/᩹ᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 48
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ(Ll/᩷۠ᩴ;)Ll/ۗ᩻᩵;
    .locals 3

    .line 34
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object p0

    .line 35
    sget-object v1, Ll/᩹ᩴᩳ;->ܳ:Ljava/util/HashMap;

    move-object v0, v1

    monitor-enter v0

    .line 36
    :try_start_0
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/۠ᩴᩳ;

    invoke-direct {v2, p0}, Ll/۠ᩴᩳ;-><init>(Ll/᩷۠ᩴ;)V

    .line 37
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v1, Ll/ܶᩴᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܶᩴᩳ;-><init>(I)V

    .line 38
    invoke-interface {p0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v1, Ll/᩸ᩴᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/ۗ᩻᩵;

    .line 36
    invoke-static {p0}, Ll/ۗ᩻᩵;->֫([Ll/ۗ᩻᩵;)Ll/ۗ᩻᩵;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫()Ll/ۗ᩻᩵;
    .locals 2

    .line 42
    new-instance v0, Ll/ܺ۫᩷;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ll/ܺ۫᩷;-><init>(I)V

    iget-object v1, p0, Ll/᩹ᩴᩳ;->ܽ:Ll/ۗ᩻᩵;

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 2

    move-object v0, p0

    .line 46
    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll/᩹ᩴᩳ;->ᩳ:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/᩹ᩴᩳ;->ᩳ:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    iget-object v0, p0, Ll/᩹ᩴᩳ;->ܽ:Ll/ۗ᩻᩵;

    new-instance v1, Ll/ۜ֡ܳ;

    invoke-direct {v1, p0, p1}, Ll/ۜ֡ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    return-void

    :catchall_0
    move-exception p1

    .line 46
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
