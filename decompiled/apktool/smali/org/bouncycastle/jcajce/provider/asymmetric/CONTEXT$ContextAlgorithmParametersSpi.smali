.class public Lorg/bouncycastle/jcajce/provider/asymmetric/CONTEXT$ContextAlgorithmParametersSpi;
.super Ljava/security/AlgorithmParametersSpi;


# instance fields
.field public contextParameterSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/security/AlgorithmParametersSpi;-><init>()V

    return-void
.end method


# virtual methods
.method public engineGetEncoded()[B
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineGetEncoded(Ljava/lang/String;)[B
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineGetParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    if-eqz p1, :cond_1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/CONTEXT$ContextAlgorithmParametersSpi;->contextParameterSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "argument to getParameterSpec must be ContextParameterSpec.class"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "argument to getParameterSpec must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInit(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 1

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/CONTEXT$ContextAlgorithmParametersSpi;->contextParameterSpec:Lorg/bouncycastle/jcajce/spec/ContextParameterSpec;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "argument to engineInit must be a ContextParameterSpec"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInit([B)V
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineInit([BLjava/lang/String;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "not implemented"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineToString()Ljava/lang/String;
    .locals 1

    const-string v0, "ContextParameterSpec"

    return-object v0
.end method

.method public isASN1FormatString(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_1

    const-string v0, "ASN.1"

    .line 0
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
