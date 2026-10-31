.class public Lorg/bouncycastle/math/ec/ECCurve$F2m$1;
.super Lorg/bouncycastle/math/ec/AbstractECLookupTable;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/math/ec/ECCurve$F2m;

.field public final synthetic val$FE_LONGS:I

.field public final synthetic val$ks:[I

.field public final synthetic val$len:I

.field public final synthetic val$table:[J


# direct methods
.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve$F2m;II[J[I)V
    .locals 0

    .line 0
    iput p2, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$len:I

    iput p3, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    iput-object p4, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$table:[J

    iput-object p5, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$ks:[I

    iput-object p1, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->this$0:Lorg/bouncycastle/math/ec/ECCurve$F2m;

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/AbstractECLookupTable;-><init>()V

    return-void
.end method

.method private createPoint([J[J)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 4

    .line 0
    new-instance v0, Lorg/bouncycastle/math/ec/ECFieldElement$F2m;

    iget-object v1, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->this$0:Lorg/bouncycastle/math/ec/ECCurve$F2m;

    invoke-static {v1}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->access$100(Lorg/bouncycastle/math/ec/ECCurve$F2m;)I

    move-result v1

    iget-object v2, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$ks:[I

    new-instance v3, Lorg/bouncycastle/math/ec/LongArray;

    invoke-direct {v3, p1}, Lorg/bouncycastle/math/ec/LongArray;-><init>([J)V

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/math/ec/ECFieldElement$F2m;-><init>(I[ILorg/bouncycastle/math/ec/LongArray;)V

    new-instance p1, Lorg/bouncycastle/math/ec/ECFieldElement$F2m;

    iget-object v1, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->this$0:Lorg/bouncycastle/math/ec/ECCurve$F2m;

    invoke-static {v1}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->access$100(Lorg/bouncycastle/math/ec/ECCurve$F2m;)I

    move-result v1

    iget-object v2, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$ks:[I

    new-instance v3, Lorg/bouncycastle/math/ec/LongArray;

    invoke-direct {v3, p2}, Lorg/bouncycastle/math/ec/LongArray;-><init>([J)V

    invoke-direct {p1, v1, v2, v3}, Lorg/bouncycastle/math/ec/ECFieldElement$F2m;-><init>(I[ILorg/bouncycastle/math/ec/LongArray;)V

    iget-object p2, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->this$0:Lorg/bouncycastle/math/ec/ECCurve$F2m;

    invoke-virtual {p2, v0, p1}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->createRawPoint(Lorg/bouncycastle/math/ec/ECFieldElement;Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$len:I

    return v0
.end method

.method public lookup(I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 13

    .line 0
    iget v0, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    invoke-static {v0}, Lorg/bouncycastle/math/raw/Nat;->create64(I)[J

    move-result-object v0

    iget v1, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    invoke-static {v1}, Lorg/bouncycastle/math/raw/Nat;->create64(I)[J

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget v4, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$len:I

    if-ge v2, v4, :cond_1

    xor-int v4, v2, p1

    add-int/lit8 v4, v4, -0x1

    shr-int/lit8 v4, v4, 0x1f

    int-to-long v4, v4

    const/4 v6, 0x0

    :goto_1
    iget v7, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    if-ge v6, v7, :cond_0

    aget-wide v8, v0, v6

    iget-object v10, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$table:[J

    add-int v11, v3, v6

    aget-wide v11, v10, v11

    and-long/2addr v11, v4

    xor-long/2addr v8, v11

    aput-wide v8, v0, v6

    aget-wide v8, v1, v6

    add-int/2addr v7, v3

    add-int/2addr v7, v6

    aget-wide v11, v10, v7

    and-long v10, v11, v4

    xor-long v7, v8, v10

    aput-wide v7, v1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    mul-int/lit8 v7, v7, 0x2

    add-int/2addr v3, v7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->createPoint([J[J)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method

.method public lookupVar(I)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 7

    .line 0
    iget v0, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    invoke-static {v0}, Lorg/bouncycastle/math/raw/Nat;->create64(I)[J

    move-result-object v0

    iget v1, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    invoke-static {v1}, Lorg/bouncycastle/math/raw/Nat;->create64(I)[J

    move-result-object v1

    iget v2, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    mul-int p1, p1, v2

    mul-int/lit8 p1, p1, 0x2

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$FE_LONGS:I

    if-ge v2, v3, :cond_0

    iget-object v4, p0, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->val$table:[J

    add-int v5, p1, v2

    aget-wide v5, v4, v5

    aput-wide v5, v0, v2

    add-int/2addr v3, p1

    add-int/2addr v3, v2

    aget-wide v3, v4, v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/math/ec/ECCurve$F2m$1;->createPoint([J[J)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    return-object p1
.end method
