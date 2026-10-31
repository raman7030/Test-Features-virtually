.class public Lorg/bouncycastle/util/BigIntegers$Cache;
.super Ljava/lang/Object;


# instance fields
.field public final preserve:[Ljava/math/BigInteger;

.field public preserveCounter:I

.field public final values:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->values:Ljava/util/Map;

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/math/BigInteger;

    iput-object v0, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->preserve:[Ljava/math/BigInteger;

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->preserveCounter:I

    return-void
.end method


# virtual methods
.method public declared-synchronized add(Ljava/math/BigInteger;)V
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->values:Ljava/util/Map;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->preserve:[Ljava/math/BigInteger;

    iget v2, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->preserveCounter:I

    aput-object p1, v1, v2

    add-int/lit8 v2, v2, 0x1

    array-length p1, v1

    rem-int/2addr v2, p1

    iput v2, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->preserveCounter:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method public declared-synchronized clear()V
    .locals 4

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->values:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->preserve:[Ljava/math/BigInteger;

    array-length v3, v2

    if-eq v1, v3, :cond_0

    const/4 v3, 0x0

    aput-object v3, v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
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

.method public declared-synchronized contains(Ljava/math/BigInteger;)Z
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->values:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized size()I
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/util/BigIntegers$Cache;->values:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
