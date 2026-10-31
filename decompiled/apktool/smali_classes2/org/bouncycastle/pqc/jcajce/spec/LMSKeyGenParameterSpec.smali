.class public Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# static fields
.field public static final otsParameters:Ljava/util/Map;

.field public static final sigParameters:Ljava/util/Map;


# instance fields
.field public final lmOtsParameters:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

.field public final lmSigParams:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->sigParameters:Ljava/util/Map;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->otsParameters:Ljava/util/Map;

    const-string v2, "lms-sha256-n32-h5"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n32_h5:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n32-h10"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n32_h10:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n32-h15"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n32_h15:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n32-h20"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n32_h20:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n32-h25"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n32_h25:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n24-h5"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n24_h5:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n24-h10"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n24_h10:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n24-h15"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n24_h15:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n24-h20"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n24_h20:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-sha256-n24-h25"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_sha256_n24_h25:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n32-h5"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n32_h5:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n32-h10"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n32_h10:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n32-h15"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n32_h15:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n32-h20"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n32_h20:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n32-h25"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n32_h25:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n24-h5"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n24_h5:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n24-h10"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n24_h10:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n24-h15"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n24_h15:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n24-h20"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n24_h20:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lms-shake256-n24-h25"

    sget-object v3, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;->lms_shake256_n24_h25:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sha256-n32-w1"

    sget-object v2, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->sha256_n32_w1:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sha256-n32-w2"

    sget-object v2, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->sha256_n32_w2:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sha256-n32-w4"

    sget-object v2, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->sha256_n32_w4:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sha256-n32-w8"

    sget-object v2, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->sha256_n32_w8:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->lmSigParams:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    iput-object p2, p0, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->lmOtsParameters:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    return-void
.end method

.method public static fromNames(Ljava/lang/String;Ljava/lang/String;)Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;
    .locals 4

    .line 2
    sget-object v0, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->sigParameters:Ljava/util/Map;

    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, " not recognized"

    if-eqz v1, :cond_1

    .line 12
    sget-object v1, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->otsParameters:Ljava/util/Map;

    .line 15
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 20
    new-instance v2, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;

    .line 23
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 26
    check-cast p0, Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    .line 29
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 32
    check-cast p1, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    .line 35
    invoke-direct {v2, p0, p1}, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;)V

    return-object v2

    .line 38
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "LM OTS parameter name "

    .line 0
    invoke-static {v0, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "LM signature parameter name "

    invoke-static {v0, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getOtsParams()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->lmOtsParameters:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    return-object v0
.end method

.method public getSigParams()Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/jcajce/spec/LMSKeyGenParameterSpec;->lmSigParams:Lorg/bouncycastle/pqc/crypto/lms/LMSigParameters;

    return-object v0
.end method
