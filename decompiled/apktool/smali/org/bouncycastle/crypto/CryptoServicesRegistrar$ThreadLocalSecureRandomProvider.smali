.class public Lorg/bouncycastle/crypto/CryptoServicesRegistrar$ThreadLocalSecureRandomProvider;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/SecureRandomProvider;


# instance fields
.field public final defaultRandoms:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$ThreadLocalSecureRandomProvider;->defaultRandoms:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/CryptoServicesRegistrar$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$ThreadLocalSecureRandomProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/security/SecureRandom;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$ThreadLocalSecureRandomProvider;->defaultRandoms:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$ThreadLocalSecureRandomProvider;->defaultRandoms:Ljava/lang/ThreadLocal;

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$ThreadLocalSecureRandomProvider;->defaultRandoms:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/SecureRandom;

    return-object v0
.end method
