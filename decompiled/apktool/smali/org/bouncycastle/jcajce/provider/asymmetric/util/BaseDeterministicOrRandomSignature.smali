.class public abstract Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;
.super Ljava/security/SignatureSpi;


# instance fields
.field public engineParams:Ljava/security/AlgorithmParameters;

.field public final helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

.field public isInitState:Z

.field public keyParams:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

.field public final originalSpec:Ljava/security/spec/AlgorithmParameterSpec;

.field public paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    new-instance p1, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;

    invoke-direct {p1}, Lorg/bouncycastle/jcajce/util/BCJcaJceHelper;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->isInitState:Z

    sget-object p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->EMPTY_CONTEXT_SPEC:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->originalSpec:Ljava/security/spec/AlgorithmParameterSpec;

    return-void
.end method

.method private reInit()V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->keyParams:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;->isPrivate()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ljava/security/SignatureSpi;->appRandom:Ljava/security/SecureRandom;

    if-eqz v1, :cond_0

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    move-object v0, v2

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eqz v1, :cond_1

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithContext;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->getContext()[B

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/crypto/params/ParametersWithContext;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v2

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eqz v1, :cond_3

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithContext;

    invoke-virtual {v1}, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->getContext()[B

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/crypto/params/ParametersWithContext;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v2

    :cond_3
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v1, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->reInitialize(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method


# virtual methods
.method public final engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "GetParameter unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->engineParams:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eqz v0, :cond_0

    sget-object v1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->EMPTY_CONTEXT_SPEC:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eq v0, v1, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->helper:Lorg/bouncycastle/jcajce/util/JcaJceHelper;

    const-string v1, "CONTEXT"

    invoke-interface {v0, v1}, Lorg/bouncycastle/jcajce/util/JcaJceHelper;->createAlgorithmParameters(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->engineParams:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/bouncycastle/util/Exceptions;->illegalStateException(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->engineParams:Ljava/security/AlgorithmParameters;

    return-object v0
.end method

.method public final engineInitSign(Ljava/security/PrivateKey;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-virtual {p0, p1, v0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->signInit(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V

    sget-object p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->EMPTY_CONTEXT_SPEC:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->isInitState:Z

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->reInit()V

    return-void
.end method

.method public final engineInitSign(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->signInit(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V

    sget-object p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->EMPTY_CONTEXT_SPEC:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->isInitState:Z

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->reInit()V

    return-void
.end method

.method public final engineInitVerify(Ljava/security/PublicKey;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->verifyInit(Ljava/security/PublicKey;)V

    sget-object p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;->EMPTY_CONTEXT_SPEC:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->isInitState:Z

    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->reInit()V

    return-void
.end method

.method public final engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SetParameter unsupported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 1

    if-nez p1, :cond_1

    .line 0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->originalSpec:Ljava/security/spec/AlgorithmParameterSpec;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->isInitState:Z

    if-eqz v0, :cond_4

    instance-of v0, p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eqz v0, :cond_2

    check-cast p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lorg/bouncycastle/jcajce/util/SpecUtil;->getContextFrom(Ljava/security/spec/AlgorithmParameterSpec;)[B

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;-><init>([B)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->paramSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    :goto_1
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->reInit()V

    return-void

    :cond_3
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "unknown AlgorithmParameterSpec in signature"

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/security/ProviderException;

    const-string v0, "cannot call setParameter in the middle of update"

    invoke-direct {p1, v0}, Ljava/security/ProviderException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final engineUpdate(B)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->isInitState:Z

    invoke-virtual {p0, p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->updateEngine(B)V

    return-void
.end method

.method public final engineUpdate([BII)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->isInitState:Z

    invoke-virtual {p0, p1, p2, p3}, Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseDeterministicOrRandomSignature;->updateEngine([BII)V

    return-void
.end method

.method public abstract reInitialize(ZLorg/bouncycastle/crypto/CipherParameters;)V
.end method

.method public abstract signInit(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
.end method

.method public abstract updateEngine(B)V
.end method

.method public abstract updateEngine([BII)V
.end method

.method public abstract verifyInit(Ljava/security/PublicKey;)V
.end method
