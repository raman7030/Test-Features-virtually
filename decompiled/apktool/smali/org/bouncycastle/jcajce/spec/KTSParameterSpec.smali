.class public Lorg/bouncycastle/jcajce/spec/KTSParameterSpec;
.super Lorg/bouncycastle/jcajce/spec/KEMKDFSpec;

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# instance fields
.field public final parameterSpec:Ljava/security/spec/AlgorithmParameterSpec;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/security/spec/AlgorithmParameterSpec;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V
    .locals 0

    .line 0
    invoke-direct {p0, p4, p5, p1, p2}, Lorg/bouncycastle/jcajce/spec/KEMKDFSpec;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[BLjava/lang/String;I)V

    iput-object p3, p0, Lorg/bouncycastle/jcajce/spec/KTSParameterSpec;->parameterSpec:Ljava/security/spec/AlgorithmParameterSpec;

    return-void
.end method


# virtual methods
.method public getParameterSpec()Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/spec/KTSParameterSpec;->parameterSpec:Ljava/security/spec/AlgorithmParameterSpec;

    return-object v0
.end method
