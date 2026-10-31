.class public Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;
.super Lorg/bouncycastle/math/ec/AbstractECLookupTable;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve;

.field public final synthetic val$len:I

.field public final synthetic val$table:[I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve;I[I)V
    .locals 0

    .line 0
    iput p2, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->val$len:I

    iput-object p3, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->val$table:[I

    iput-object p1, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->this$0:Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve;

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/AbstractECLookupTable;-><init>()V

    return-void
.end method

.method private createPoint([I[I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->this$0:Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve;

    new-instance v1, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1FieldElement;

    invoke-direct {v1, p1}, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1FieldElement;-><init>([I)V

    new-instance p1, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1FieldElement;

    invoke-direct {p1, p2}, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1FieldElement;-><init>([I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve;->access$000()[Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p2

    invoke-virtual {v0, v1, p1, p2}, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve;->createRawPoint(Lorg/bouncycastle/math/ec/ECFieldElement;Lorg/bouncycastle/math/ec/ECFieldElement;[Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->val$len:I

    return v0
.end method

.method public lookup(I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 10

    const/16 v0, 0x11

    .line 0
    invoke-static {v0}, Lorg/bouncycastle/math/raw/Nat;->create(I)[I

    move-result-object v1

    invoke-static {v0}, Lorg/bouncycastle/math/raw/Nat;->create(I)[I

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget v5, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->val$len:I

    if-ge v3, v5, :cond_1

    xor-int v5, v3, p1

    add-int/lit8 v5, v5, -0x1

    shr-int/lit8 v5, v5, 0x1f

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v0, :cond_0

    aget v7, v1, v6

    iget-object v8, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->val$table:[I

    add-int v9, v4, v6

    aget v9, v8, v9

    and-int/2addr v9, v5

    xor-int/2addr v7, v9

    aput v7, v1, v6

    aget v7, v2, v6

    add-int/lit8 v9, v4, 0x11

    add-int/2addr v9, v6

    aget v8, v8, v9

    and-int/2addr v8, v5

    xor-int/2addr v7, v8

    aput v7, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x22

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v1, v2}, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->createPoint([I[I)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method

.method public lookupVar(I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 7

    const/16 v0, 0x11

    .line 0
    invoke-static {v0}, Lorg/bouncycastle/math/raw/Nat;->create(I)[I

    move-result-object v1

    invoke-static {v0}, Lorg/bouncycastle/math/raw/Nat;->create(I)[I

    move-result-object v2

    mul-int/lit8 p1, p1, 0x22

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget v4, v1, v3

    iget-object v5, p0, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->val$table:[I

    add-int v6, p1, v3

    aget v6, v5, v6

    xor-int/2addr v4, v6

    aput v4, v1, v3

    aget v4, v2, v3

    add-int/lit8 v6, p1, 0x11

    add-int/2addr v6, v3

    aget v5, v5, v6

    xor-int/2addr v4, v5

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v1, v2}, Lorg/bouncycastle/math/ec/custom/sec/SecP521R1Curve$1;->createPoint([I[I)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method
