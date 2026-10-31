.class public Lorg/bouncycastle/jcajce/provider/asymmetric/RSA;
.super Ljava/lang/Object;


# static fields
.field public static final PREFIX:Ljava/lang/String; = "org.bouncycastle.jcajce.provider.asymmetric.rsa."

.field public static final generalRsaAttributes:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/RSA;->generalRsaAttributes:Ljava/util/Map;

    const-string v1, "SupportedKeyClasses"

    const-string v2, "java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "SupportedKeyFormats"

    const-string v2, "PKCS#8|X.509"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Ljava/util/Map;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/asymmetric/RSA;->generalRsaAttributes:Ljava/util/Map;

    return-object v0
.end method
