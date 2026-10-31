.class public Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;
.super Ljava/lang/Object;


# static fields
.field public static final INSTANCE:Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;-><init>()V

    sput-object v0, Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;->INSTANCE:Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;->INSTANCE:Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;

    return-object v0
.end method

.method public static getFriend(Lorg/bouncycastle/crypto/digests/AsconBaseDigest$Friend;)Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;
    .locals 1

    if-eqz p0, :cond_0

    .line 0
    sget-object p0, Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;->INSTANCE:Lorg/bouncycastle/crypto/digests/ISAPDigest$Friend;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "This method is only for use by AsconBaseDigest"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
