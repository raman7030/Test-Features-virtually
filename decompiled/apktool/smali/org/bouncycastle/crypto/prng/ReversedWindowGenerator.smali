.class public Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/prng/RandomGenerator;


# instance fields
.field public final generator:Lorg/bouncycastle/crypto/prng/RandomGenerator;

.field public window:[B

.field public windowCount:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/prng/RandomGenerator;I)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-lt p2, v0, :cond_0

    iput-object p1, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->generator:Lorg/bouncycastle/crypto/prng/RandomGenerator;

    new-array p1, p2, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->window:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "windowSize must be at least 2"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "generator cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private doNextBytes([BII)V
    .locals 7

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p3, :cond_1

    :try_start_0
    iget v3, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->windowCount:I

    const/4 v4, 0x1

    if-ge v3, v4, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->generator:Lorg/bouncycastle/crypto/prng/RandomGenerator;

    iget-object v5, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->window:[B

    array-length v6, v5

    invoke-interface {v3, v5, v1, v6}, Lorg/bouncycastle/crypto/prng/RandomGenerator;->nextBytes([BII)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->window:[B

    array-length v3, v3

    iput v3, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->windowCount:I

    :cond_0
    add-int/lit8 v3, v2, 0x1

    add-int/2addr v2, p2

    iget-object v5, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->window:[B

    iget v6, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->windowCount:I

    sub-int/2addr v6, v4

    iput v6, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->windowCount:I

    aget-byte v4, v5, v6

    aput-byte v4, p1, v2

    move v2, v3

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public addSeedMaterial(J)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput v1, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->windowCount:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->generator:Lorg/bouncycastle/crypto/prng/RandomGenerator;

    invoke-interface {v1, p1, p2}, Lorg/bouncycastle/crypto/prng/RandomGenerator;->addSeedMaterial(J)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public addSeedMaterial([B)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput v1, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->windowCount:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->generator:Lorg/bouncycastle/crypto/prng/RandomGenerator;

    invoke-interface {v1, p1}, Lorg/bouncycastle/crypto/prng/RandomGenerator;->addSeedMaterial([B)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public nextBytes([B)V
    .locals 2

    const/4 v0, 0x0

    .line 0
    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->doNextBytes([BII)V

    return-void
.end method

.method public nextBytes([BII)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/prng/ReversedWindowGenerator;->doNextBytes([BII)V

    return-void
.end method
