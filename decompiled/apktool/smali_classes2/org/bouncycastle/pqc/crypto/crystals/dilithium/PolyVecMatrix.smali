.class public Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;
.super Ljava/lang/Object;


# instance fields
.field public final dilithiumK:I

.field public final dilithiumL:I

.field public final mat:[Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumEngine;)V
    .locals 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumEngine;->getDilithiumK()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumK:I

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumEngine;->getDilithiumL()I

    move-result v1

    iput v1, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumL:I

    new-array v0, v0, [Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->mat:[Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumK:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->mat:[Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;

    new-instance v2, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;

    invoke-direct {v2, p1}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;-><init>(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/DilithiumEngine;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private addString()Ljava/lang/String;
    .locals 4

    const-string v0, "["

    const/4 v1, 0x0

    .line 5
    :goto_0
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumK:I

    const-string v3, "]\n"

    if-ge v1, v2, :cond_1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Outer Matrix "

    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ["

    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->mat:[Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumK:I

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    const-string v2, "],\n"

    invoke-static {v0, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public expandMatrix([B)V
    .locals 4

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumK:I

    if-ge v0, v1, :cond_1

    const/4 v1, 0x0

    :goto_1
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumL:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->mat:[Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;

    aget-object v2, v2, v0

    invoke-virtual {v2, v1}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;->getVectorIndex(I)Lorg/bouncycastle/pqc/crypto/crystals/dilithium/Poly;

    move-result-object v2

    shl-int/lit8 v3, v0, 0x8

    add-int/2addr v3, v1

    int-to-short v3, v3

    invoke-virtual {v2, p1, v3}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/Poly;->uniformBlocks([BS)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public pointwiseMontgomery(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecK;Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;)V
    .locals 3

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->dilithiumK:I

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecK;->getVectorIndex(I)Lorg/bouncycastle/pqc/crypto/crystals/dilithium/Poly;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->mat:[Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2, p2}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/Poly;->pointwiseAccountMontgomery(Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecL;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ": \n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/PolyVecMatrix;->addString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
