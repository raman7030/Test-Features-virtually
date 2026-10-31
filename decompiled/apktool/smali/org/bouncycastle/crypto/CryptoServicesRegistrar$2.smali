.class public Lorg/bouncycastle/crypto/CryptoServicesRegistrar$2;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/SecureRandomProvider;


# instance fields
.field public final synthetic val$secureRandom:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>(Ljava/security/SecureRandom;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$2;->val$secureRandom:Ljava/security/SecureRandom;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/security/SecureRandom;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/CryptoServicesRegistrar$2;->val$secureRandom:Ljava/security/SecureRandom;

    return-object v0
.end method
