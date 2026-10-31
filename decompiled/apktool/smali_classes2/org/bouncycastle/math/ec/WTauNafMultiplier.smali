.class public Lorg/bouncycastle/math/ec/WTauNafMultiplier;
.super Lorg/bouncycastle/math/ec/AbstractECMultiplier;


# static fields
.field public static final PRECOMP_NAME:Ljava/lang/String; = "bc_wtnaf"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/math/ec/AbstractECMultiplier;-><init>()V

    return-void
.end method

.method public static multiplyFromWTnaf(Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;[B)Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;
    .locals 5

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/math/ec/ECCurve$AbstractF2m;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve;->getA()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    move-result v1

    new-instance v2, Lorg/bouncycastle/math/ec/WTauNafMultiplier$1;

    invoke-direct {v2, p0, v1}, Lorg/bouncycastle/math/ec/WTauNafMultiplier$1;-><init>(Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;B)V

    const-string v1, "bc_wtnaf"

    invoke-virtual {v0, p0, v1, v2}, Lorg/bouncycastle/math/ec/ECCurve;->precompute(Lorg/bouncycastle/math/ec/ECPoint;Ljava/lang/String;Lorg/bouncycastle/math/ec/PreCompCallback;)Lorg/bouncycastle/math/ec/PreCompInfo;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/math/ec/WTauNafPreCompInfo;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/WTauNafPreCompInfo;->getPreComp()[Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    move-result-object v0

    array-length v1, v0

    new-array v1, v1, [Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECPoint;->negate()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECCurve;->getInfinity()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_1
    if-ltz v2, :cond_3

    add-int/lit8 v3, v3, 0x1

    aget-byte v4, p1, v2

    if-eqz v4, :cond_2

    invoke-virtual {p0, v3}, Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;->tauPow(I)Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    move-result-object p0

    if-lez v4, :cond_1

    ushr-int/lit8 v3, v4, 0x1

    aget-object v3, v0, v3

    goto :goto_2

    :cond_1
    neg-int v3, v4

    ushr-int/lit8 v3, v3, 0x1

    aget-object v3, v1, v3

    :goto_2
    invoke-virtual {p0, v3}, Lorg/bouncycastle/math/ec/ECPoint;->add(Lorg/bouncycastle/math/ec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    const/4 v3, 0x0

    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_3
    if-lez v3, :cond_4

    invoke-virtual {p0, v3}, Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;->tauPow(I)Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method private multiplyWTnaf(Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;Lorg/bouncycastle/math/ec/ZTauElement;BB)Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;
    .locals 2

    if-nez p3, :cond_0

    .line 0
    sget-object p3, Lorg/bouncycastle/math/ec/Tnaf;->alpha0:[Lorg/bouncycastle/math/ec/ZTauElement;

    goto :goto_0

    :cond_0
    sget-object p3, Lorg/bouncycastle/math/ec/Tnaf;->alpha1:[Lorg/bouncycastle/math/ec/ZTauElement;

    :goto_0
    const/4 v0, 0x4

    invoke-static {p4, v0}, Lorg/bouncycastle/math/ec/Tnaf;->getTw(BI)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    invoke-static {p4, p2, v0, v1, p3}, Lorg/bouncycastle/math/ec/Tnaf;->tauAdicWNaf(BLorg/bouncycastle/math/ec/ZTauElement;II[Lorg/bouncycastle/math/ec/ZTauElement;)[B

    move-result-object p2

    invoke-static {p1, p2}, Lorg/bouncycastle/math/ec/WTauNafMultiplier;->multiplyFromWTnaf(Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;[B)Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public multiplyPositive(Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 4

    .line 0
    instance-of v0, p1, Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/math/ec/ECCurve$AbstractF2m;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve;->getA()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    move-result v1

    invoke-static {v1}, Lorg/bouncycastle/math/ec/Tnaf;->getMu(I)B

    move-result v2

    const/16 v3, 0xa

    invoke-static {v0, p2, v1, v2, v3}, Lorg/bouncycastle/math/ec/Tnaf;->partModReduction(Lorg/bouncycastle/math/ec/ECCurve$AbstractF2m;Ljava/math/BigInteger;BBB)Lorg/bouncycastle/math/ec/ZTauElement;

    move-result-object p2

    invoke-direct {p0, p1, p2, v1, v2}, Lorg/bouncycastle/math/ec/WTauNafMultiplier;->multiplyWTnaf(Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;Lorg/bouncycastle/math/ec/ZTauElement;BB)Lorg/bouncycastle/math/ec/ECPoint$AbstractF2m;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only ECPoint.AbstractF2m can be used in WTauNafMultiplier"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
