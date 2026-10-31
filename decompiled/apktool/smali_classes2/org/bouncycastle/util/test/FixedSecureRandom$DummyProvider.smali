.class public Lorg/bouncycastle/util/test/FixedSecureRandom$DummyProvider;
.super Ljava/security/Provider;


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-string v2, "BCFIPS Fixed Secure Random Provider"

    const-string v3, "BCFIPS_FIXED_RNG"

    .line 0
    invoke-direct {p0, v3, v0, v1, v2}, Ljava/security/Provider;-><init>(Ljava/lang/String;DLjava/lang/String;)V

    return-void
.end method
