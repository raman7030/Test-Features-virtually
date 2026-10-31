.class public Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;
.super Lorg/bouncycastle/math/ec/AbstractECLookupTable;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve;

.field public final synthetic val$len:I

.field public final synthetic val$table:[I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve;I[I)V
    .locals 0

    .line 0
    iput p2, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->val$len:I

    iput-object p3, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->val$table:[I

    iput-object p1, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->this$0:Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve;

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/AbstractECLookupTable;-><init>()V

    return-void
.end method

.method private createPoint([I[I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->this$0:Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve;

    new-instance v1, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1FieldElement;

    invoke-direct {v1, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1FieldElement;-><init>([I)V

    new-instance p1, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1FieldElement;

    invoke-direct {p1, p2}, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1FieldElement;-><init>([I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve;->access$000()[Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p2

    invoke-virtual {v0, v1, p1, p2}, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve;->createRawPoint(Lorg/bouncycastle/math/ec/ECFieldElement;Lorg/bouncycastle/math/ec/ECFieldElement;[Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->val$len:I

    return v0
.end method

.method public lookup(I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 9

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat192;->create()[I

    move-result-object v0

    invoke-static {}, Lorg/bouncycastle/math/raw/Nat192;->create()[I

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget v4, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->val$len:I

    if-ge v2, v4, :cond_1

    xor-int v4, v2, p1

    add-int/lit8 v4, v4, -0x1

    shr-int/lit8 v4, v4, 0x1f

    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x6

    if-ge v5, v6, :cond_0

    aget v6, v0, v5

    iget-object v7, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->val$table:[I

    add-int v8, v3, v5

    aget v8, v7, v8

    and-int/2addr v8, v4

    xor-int/2addr v6, v8

    aput v6, v0, v5

    aget v6, v1, v5

    add-int/lit8 v8, v3, 0x6

    add-int/2addr v8, v5

    aget v7, v7, v8

    and-int/2addr v7, v4

    xor-int/2addr v6, v7

    aput v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0xc

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->createPoint([I[I)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method

.method public lookupVar(I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 6

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/raw/Nat192;->create()[I

    move-result-object v0

    invoke-static {}, Lorg/bouncycastle/math/raw/Nat192;->create()[I

    move-result-object v1

    mul-int/lit8 p1, p1, 0xc

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x6

    if-ge v2, v3, :cond_0

    iget-object v4, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->val$table:[I

    add-int v5, p1, v2

    aget v5, v4, v5

    aput v5, v0, v2

    add-int/2addr v3, p1

    add-int/2addr v3, v2

    aget v3, v4, v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/math/ec/custom/sec/SecP192K1Curve$1;->createPoint([I[I)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method
