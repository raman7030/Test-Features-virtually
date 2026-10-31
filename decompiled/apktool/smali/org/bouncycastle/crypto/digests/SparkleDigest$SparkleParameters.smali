.class public final enum Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;
.super Ljava/lang/Enum;


# static fields
.field public static final synthetic $VALUES:[Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

.field public static final enum ESCH256:Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

.field public static final enum ESCH384:Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;


# direct methods
.method public static synthetic $values()[Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    .line 0
    sget-object v1, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->ESCH256:Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->ESCH384:Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    const-string v1, "ESCH256"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->ESCH256:Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    new-instance v0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    const-string v1, "ESCH384"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->ESCH384:Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    invoke-static {}, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->$values()[Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->$VALUES:[Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    return-object p0
.end method

.method public static values()[Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->$VALUES:[Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    invoke-virtual {v0}, [Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/bouncycastle/crypto/digests/SparkleDigest$SparkleParameters;

    return-object v0
.end method
