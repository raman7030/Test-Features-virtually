.class public Lorg/bouncycastle/crypto/prng/X931SecureRandom;
.super Ljava/security/SecureRandom;


# instance fields
.field public final drbg:Lorg/bouncycastle/crypto/prng/X931RNG;

.field public final predictionResistant:Z

.field public final randomSource:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/prng/X931RNG;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->randomSource:Ljava/security/SecureRandom;

    iput-object p2, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/X931RNG;

    iput-boolean p3, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->predictionResistant:Z

    return-void
.end method


# virtual methods
.method public generateSeed(I)[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/X931RNG;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/prng/X931RNG;->getEntropySource()Lorg/bouncycastle/crypto/prng/EntropySource;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/prng/EntropyUtil;->generateSeed(Lorg/bouncycastle/crypto/prng/EntropySource;I)[B

    move-result-object p1

    return-object p1
.end method

.method public nextBytes([B)V
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/X931RNG;

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->predictionResistant:Z

    invoke-virtual {v1, p1, v2}, Lorg/bouncycastle/crypto/prng/X931RNG;->generate([BZ)I

    move-result v1

    if-gez v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/X931RNG;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/prng/X931RNG;->reseed()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/X931RNG;

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->predictionResistant:Z

    invoke-virtual {v1, p1, v2}, Lorg/bouncycastle/crypto/prng/X931RNG;->generate([BZ)I

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setSeed(J)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->randomSource:Ljava/security/SecureRandom;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2}, Ljava/security/SecureRandom;->setSeed(J)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setSeed([B)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/X931SecureRandom;->randomSource:Ljava/security/SecureRandom;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ljava/security/SecureRandom;->setSeed([B)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
