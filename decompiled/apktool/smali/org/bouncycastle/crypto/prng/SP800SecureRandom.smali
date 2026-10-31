.class public Lorg/bouncycastle/crypto/prng/SP800SecureRandom;
.super Ljava/security/SecureRandom;


# instance fields
.field public drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

.field public final drbgProvider:Lorg/bouncycastle/crypto/prng/DRBGProvider;

.field public final entropySource:Lorg/bouncycastle/crypto/prng/EntropySource;

.field public final predictionResistant:Z

.field public final randomSource:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/prng/EntropySource;Lorg/bouncycastle/crypto/prng/DRBGProvider;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->randomSource:Ljava/security/SecureRandom;

    iput-object p2, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->entropySource:Lorg/bouncycastle/crypto/prng/EntropySource;

    iput-object p3, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbgProvider:Lorg/bouncycastle/crypto/prng/DRBGProvider;

    iput-boolean p4, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->predictionResistant:Z

    return-void
.end method


# virtual methods
.method public generateSeed(I)[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->entropySource:Lorg/bouncycastle/crypto/prng/EntropySource;

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/prng/EntropyUtil;->generateSeed(Lorg/bouncycastle/crypto/prng/EntropySource;I)[B

    move-result-object p1

    return-object p1
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbgProvider:Lorg/bouncycastle/crypto/prng/DRBGProvider;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/prng/DRBGProvider;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public nextBytes([B)V
    .locals 4

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbgProvider:Lorg/bouncycastle/crypto/prng/DRBGProvider;

    iget-object v2, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->entropySource:Lorg/bouncycastle/crypto/prng/EntropySource;

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/prng/DRBGProvider;->get(Lorg/bouncycastle/crypto/prng/EntropySource;)Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->predictionResistant:Z

    const/4 v3, 0x0

    invoke-interface {v1, p1, v3, v2}, Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;->generate([B[BZ)I

    move-result v1

    if-gez v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    invoke-interface {v1, v3}, Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;->reseed([B)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->predictionResistant:Z

    invoke-interface {v1, p1, v3, v2}, Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;->generate([B[BZ)I

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

.method public reseed([B)V
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbgProvider:Lorg/bouncycastle/crypto/prng/DRBGProvider;

    iget-object v2, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->entropySource:Lorg/bouncycastle/crypto/prng/EntropySource;

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/prng/DRBGProvider;->get(Lorg/bouncycastle/crypto/prng/EntropySource;)Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->drbg:Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;

    invoke-interface {v1, p1}, Lorg/bouncycastle/crypto/prng/drbg/SP80090DRBG;->reseed([B)V

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
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->randomSource:Ljava/security/SecureRandom;

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
    iget-object v1, p0, Lorg/bouncycastle/crypto/prng/SP800SecureRandom;->randomSource:Ljava/security/SecureRandom;

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
