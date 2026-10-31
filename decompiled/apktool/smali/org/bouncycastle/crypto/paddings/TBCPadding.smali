.class public Lorg/bouncycastle/crypto/paddings/TBCPadding;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addPadding([BI)I
    .locals 3

    .line 0
    array-length v0, p1

    sub-int/2addr v0, p2

    const/4 v1, 0x0

    if-lez p2, :cond_0

    add-int/lit8 v2, p2, -0x1

    aget-byte v2, p1, v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_0
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    aget-byte v2, p1, v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_1

    :goto_0
    const/16 v1, 0xff

    :cond_1
    int-to-byte v1, v1

    :goto_1
    array-length v2, p1

    if-ge p2, v2, :cond_2

    aput-byte v1, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    return v0
.end method

.method public getPaddingName()Ljava/lang/String;
    .locals 1

    const-string v0, "TBC"

    return-object v0
.end method

.method public init(Ljava/security/SecureRandom;)V
    .locals 0

    return-void
.end method

.method public padCount([B)I
    .locals 5

    .line 0
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x1

    const/4 v3, -0x1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    xor-int/2addr v4, v1

    add-int/lit8 v4, v4, -0x1

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v3, v4

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_0
    return v2
.end method
