.class public abstract Lorg/bouncycastle/pqc/math/ntru/Polynomial;
.super Ljava/lang/Object;


# instance fields
.field public coeffs:[S

.field public params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->n()I

    move-result v0

    new-array v0, v0, [S

    iput-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iput-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    return-void
.end method

.method public static bothNegativeMask(SS)S
    .locals 0

    and-int/2addr p0, p1

    ushr-int/lit8 p0, p0, 0xf

    int-to-short p0, p0

    return p0
.end method

.method public static mod3(B)B
    .locals 0

    and-int/lit16 p0, p0, 0xff

    .line 0
    rem-int/lit8 p0, p0, 0x3

    int-to-byte p0, p0

    return p0
.end method

.method public static mod3(S)S
    .locals 1

    const v0, 0xffff

    and-int/2addr p0, v0

    .line 0
    rem-int/lit8 p0, p0, 0x3

    int-to-short p0, p0

    return p0
.end method

.method public static modQ(II)I
    .locals 0

    .line 0
    rem-int/2addr p0, p1

    return p0
.end method

.method private r2InvToRqInv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object v4, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v4, v4, v2

    neg-int v4, v4

    int-to-short v4, v4

    aput-short v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_1
    if-ge p2, v0, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object v3, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v3, p2

    aput-short v3, v2, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p4, p0, p3}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    iget-object p1, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short p2, p1, v1

    add-int/lit8 p2, p2, 0x2

    int-to-short p2, p2

    aput-short p2, p1, v1

    invoke-virtual {p5, p4, p0}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    invoke-virtual {p4, p5, p3}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    iget-object p1, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short p2, p1, v1

    add-int/lit8 p2, p2, 0x2

    int-to-short p2, p2

    aput-short p2, p1, v1

    invoke-virtual {p0, p4, p5}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    invoke-virtual {p4, p0, p3}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    iget-object p1, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short p2, p1, v1

    add-int/lit8 p2, p2, 0x2

    int-to-short p2, p2

    aput-short p2, p1, v1

    invoke-virtual {p5, p4, p0}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    invoke-virtual {p4, p5, p3}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    iget-object p1, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short p2, p1, v1

    add-int/lit8 p2, p2, 0x2

    int-to-short p2, p2

    aput-short p2, p1, v1

    invoke-virtual {p0, p4, p5}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    return-void
.end method


# virtual methods
.method public abstract lift(Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
.end method

.method public mod3PhiN()V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->n()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v2, v1

    add-int/lit8 v4, v0, -0x1

    aget-short v4, v2, v4

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v3

    int-to-short v3, v4

    invoke-static {v3}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3(S)S

    move-result v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public modQPhiN()V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->n()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v2, v1

    add-int/lit8 v4, v0, -0x1

    aget-short v4, v2, v4

    sub-int/2addr v3, v4

    int-to-short v3, v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r2Inv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v3

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v4

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v5

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->r2Inv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    return-void
.end method

.method public r2Inv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 10

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    iget-object v1, p5, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput-short v3, v1, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v4, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v3, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_1
    add-int/lit8 v4, v0, -0x1

    if-ge v1, v4, :cond_1

    iget-object v5, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v6, v0, -0x2

    sub-int/2addr v6, v1

    iget-object v7, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v8, v7, v1

    aget-short v4, v7, v4

    xor-int/2addr v4, v8

    and-int/2addr v4, v3

    int-to-short v4, v4

    aput-short v4, v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v2, p1, v4

    const/4 p1, 0x0

    const/4 v1, 0x1

    :goto_2
    mul-int/lit8 v5, v4, 0x2

    sub-int/2addr v5, v3

    if-ge p1, v5, :cond_7

    move v5, v4

    :goto_3
    if-lez v5, :cond_2

    iget-object v6, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v7, v5, -0x1

    aget-short v7, v6, v7

    aput-short v7, v6, v5

    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    :cond_2
    iget-object v5, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v2, v5, v2

    iget-object v5, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v5, v5, v2

    iget-object v6, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v2, v6, v2

    and-int/2addr v2, v5

    int-to-short v2, v2

    neg-int v6, v1

    int-to-short v7, v6

    neg-int v5, v5

    int-to-short v5, v5

    invoke-static {v7, v5}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->bothNegativeMask(SS)S

    move-result v5

    xor-int/2addr v6, v1

    and-int/2addr v6, v5

    xor-int/2addr v1, v6

    int-to-short v1, v1

    add-int/2addr v1, v3

    int-to-short v1, v1

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v0, :cond_3

    iget-object v6, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v3

    iget-object v8, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v9, v8, v3

    xor-int/2addr v9, v7

    and-int/2addr v9, v5

    int-to-short v9, v9

    xor-int/2addr v7, v9

    int-to-short v7, v7

    aput-short v7, v6, v3

    aget-short v6, v8, v3

    xor-int/2addr v6, v9

    int-to-short v6, v6

    aput-short v6, v8, v3

    iget-object v6, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v3

    iget-object v8, p5, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v9, v8, v3

    xor-int/2addr v9, v7

    and-int/2addr v9, v5

    int-to-short v9, v9

    xor-int/2addr v7, v9

    int-to-short v7, v7

    aput-short v7, v6, v3

    aget-short v6, v8, v3

    xor-int/2addr v6, v9

    int-to-short v6, v6

    aput-short v6, v8, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_3
    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v0, :cond_4

    iget-object v6, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v5

    iget-object v8, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v8, v8, v5

    and-int/2addr v8, v2

    xor-int/2addr v7, v8

    int-to-short v7, v7

    aput-short v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_4
    const/4 v5, 0x0

    :goto_6
    if-ge v5, v0, :cond_5

    iget-object v6, p5, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v5

    iget-object v8, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v8, v8, v5

    and-int/2addr v8, v2

    xor-int/2addr v7, v8

    int-to-short v7, v7

    aput-short v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_5
    const/4 v2, 0x0

    :goto_7
    if-ge v2, v4, :cond_6

    iget-object v5, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v6, v2, 0x1

    aget-short v7, v5, v6

    aput-short v7, v5, v2

    move v2, v6

    goto :goto_7

    :cond_6
    iget-object v2, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v3, v2, v4

    add-int/lit8 p1, p1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    goto/16 :goto_2

    :cond_7
    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_8
    if-ge p2, v4, :cond_8

    iget-object p3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object p5, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v1, v0, -0x2

    sub-int/2addr v1, p2

    aget-short p5, p5, v1

    aput-short p5, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_8
    iget-object p2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short p1, p2, v4

    return-void
.end method

.method public rqInv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v3

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v4

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v5

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqInv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    return-void
.end method

.method public rqInv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 6

    .line 0
    invoke-virtual {p2, p1}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->r2Inv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->r2InvToRqInv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    return-void
.end method

.method public rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v1, v3, v2

    const/4 v3, 0x1

    :goto_1
    sub-int v4, v0, v2

    if-ge v3, v4, :cond_0

    iget-object v4, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v5, v4, v2

    iget-object v6, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int v7, v2, v3

    aget-short v6, v6, v7

    iget-object v7, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    sub-int v8, v0, v3

    aget-short v7, v7, v8

    mul-int v6, v6, v7

    add-int/2addr v6, v5

    int-to-short v5, v6

    aput-short v5, v4, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_2
    add-int/lit8 v4, v2, 0x1

    if-ge v3, v4, :cond_1

    iget-object v4, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v5, v4, v2

    iget-object v6, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    sub-int v7, v2, v3

    aget-short v6, v6, v7

    iget-object v7, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v7, v3

    mul-int v6, v6, v7

    add-int/2addr v6, v5

    int-to-short v5, v6

    aput-short v5, v4, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method public rqSumZeroFromBytes([B)V
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    invoke-virtual {p0, p1}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->sqFromBytes([B)V

    iget-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    aput-short v1, p1, v0

    :goto_0
    iget-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result p1

    if-ge v1, p1, :cond_0

    iget-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v2, p1, v0

    aget-short v3, p1, v1

    sub-int/2addr v2, v3

    int-to-short v2, v2

    aput-short v2, p1, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public rqSumZeroToBytes(I)[B
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->sqToBytes(I)[B

    move-result-object p1

    return-object p1
.end method

.method public rqToS3(Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 6

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object v3, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v3, v1

    const v4, 0xffff

    and-int/2addr v3, v4

    iget-object v4, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->q()I

    move-result v4

    invoke-static {v3, v4}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->modQ(II)I

    move-result v3

    int-to-short v3, v3

    aput-short v3, v2, v1

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v2, v2, v1

    iget-object v3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->logQ()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    ushr-int/2addr v2, v3

    int-to-short v2, v2

    iget-object v3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v4, v3, v1

    iget-object v5, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->logQ()I

    move-result v5

    and-int/lit8 v5, v5, 0x1

    rsub-int/lit8 v5, v5, 0x1

    shl-int/2addr v2, v5

    add-int/2addr v4, v2

    int-to-short v2, v4

    aput-short v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3PhiN()V

    return-void
.end method

.method public s3FromBytes([B)V
    .locals 8

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    if-ge v2, v3, :cond_0

    aget-byte v3, p1, v2

    iget-object v4, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    mul-int/lit8 v5, v2, 0x5

    int-to-short v6, v3

    aput-short v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    and-int/lit16 v3, v3, 0xff

    mul-int/lit16 v7, v3, 0xab

    ushr-int/lit8 v7, v7, 0x9

    int-to-short v7, v7

    aput-short v7, v4, v6

    add-int/lit8 v6, v5, 0x2

    mul-int/lit8 v7, v3, 0x39

    ushr-int/lit8 v7, v7, 0x9

    int-to-short v7, v7

    aput-short v7, v4, v6

    add-int/lit8 v6, v5, 0x3

    mul-int/lit8 v7, v3, 0x13

    ushr-int/lit8 v7, v7, 0x9

    int-to-short v7, v7

    aput-short v7, v4, v6

    add-int/lit8 v5, v5, 0x4

    mul-int/lit16 v3, v3, 0xcb

    ushr-int/lit8 v3, v3, 0xe

    int-to-short v3, v3

    aput-short v3, v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v2

    iget-object v3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v3}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    mul-int/lit8 v3, v3, 0x5

    if-le v2, v3, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v2}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v2

    div-int/lit8 v2, v2, 0x5

    aget-byte p1, p1, v2

    const/4 v3, 0x0

    :goto_1
    mul-int/lit8 v4, v2, 0x5

    add-int/2addr v4, v3

    iget-object v5, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v5

    if-ge v4, v5, :cond_1

    iget-object v5, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    int-to-short v6, p1

    aput-short v6, v5, v4

    and-int/lit16 p1, p1, 0xff

    mul-int/lit16 p1, p1, 0xab

    shr-int/lit8 p1, p1, 0x9

    int-to-byte p1, p1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v0, v0, -0x1

    aput-short v1, p1, v0

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3PhiN()V

    return-void
.end method

.method public s3Inv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v3

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v4

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v5

    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->createPolynomial()Lorg/bouncycastle/pqc/math/ntru/Polynomial;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->s3Inv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    return-void
.end method

.method public s3Inv(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 10

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    iget-object v1, p5, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput-short v3, v1, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v4, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v3, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_1
    add-int/lit8 v4, v0, -0x1

    if-ge v1, v4, :cond_1

    iget-object v5, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v6, v0, -0x2

    sub-int/2addr v6, v1

    iget-object v7, p1, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v8, v7, v1

    and-int/lit8 v8, v8, 0x3

    aget-short v4, v7, v4

    and-int/lit8 v4, v4, 0x3

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v8

    int-to-short v4, v4

    invoke-static {v4}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3(S)S

    move-result v4

    aput-short v4, v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v2, p1, v4

    const/4 p1, 0x0

    const/4 v1, 0x1

    :goto_2
    mul-int/lit8 v5, v4, 0x2

    sub-int/2addr v5, v3

    if-ge p1, v5, :cond_7

    move v5, v4

    :goto_3
    if-lez v5, :cond_2

    iget-object v6, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v7, v5, -0x1

    aget-short v7, v6, v7

    aput-short v7, v6, v5

    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    :cond_2
    iget-object v5, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v2, v5, v2

    iget-object v5, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v5, v5, v2

    mul-int/lit8 v5, v5, 0x2

    iget-object v6, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v6, v6, v2

    mul-int v5, v5, v6

    int-to-byte v5, v5

    invoke-static {v5}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3(B)B

    move-result v5

    int-to-short v5, v5

    neg-int v6, v1

    int-to-short v7, v6

    iget-object v8, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v2, v8, v2

    neg-int v2, v2

    int-to-short v2, v2

    invoke-static {v7, v2}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->bothNegativeMask(SS)S

    move-result v2

    xor-int/2addr v6, v1

    and-int/2addr v6, v2

    xor-int/2addr v1, v6

    int-to-short v1, v1

    add-int/2addr v1, v3

    int-to-short v1, v1

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v0, :cond_3

    iget-object v6, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v3

    iget-object v8, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v9, v8, v3

    xor-int/2addr v9, v7

    and-int/2addr v9, v2

    int-to-short v9, v9

    xor-int/2addr v7, v9

    int-to-short v7, v7

    aput-short v7, v6, v3

    aget-short v6, v8, v3

    xor-int/2addr v6, v9

    int-to-short v6, v6

    aput-short v6, v8, v3

    iget-object v6, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v3

    iget-object v8, p5, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v9, v8, v3

    xor-int/2addr v9, v7

    and-int/2addr v9, v2

    int-to-short v9, v9

    xor-int/2addr v7, v9

    int-to-short v7, v7

    aput-short v7, v6, v3

    aget-short v6, v8, v3

    xor-int/2addr v6, v9

    int-to-short v6, v6

    aput-short v6, v8, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v0, :cond_4

    iget-object v6, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v3

    iget-object v8, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v8, v8, v3

    mul-int v8, v8, v5

    add-int/2addr v8, v7

    int-to-byte v7, v8

    invoke-static {v7}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3(B)B

    move-result v7

    int-to-short v7, v7

    aput-short v7, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_4
    const/4 v3, 0x0

    :goto_6
    if-ge v3, v0, :cond_5

    iget-object v6, p5, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v7, v6, v3

    iget-object v8, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v8, v8, v3

    mul-int v8, v8, v5

    add-int/2addr v8, v7

    int-to-byte v7, v8

    invoke-static {v7}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3(B)B

    move-result v7

    int-to-short v7, v7

    aput-short v7, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_5
    const/4 v3, 0x0

    :goto_7
    if-ge v3, v4, :cond_6

    iget-object v5, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v6, v3, 0x1

    aget-short v7, v5, v6

    aput-short v7, v5, v3

    move v3, v6

    goto :goto_7

    :cond_6
    iget-object v3, p3, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short v2, v3, v4

    add-int/lit8 p1, p1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    goto/16 :goto_2

    :cond_7
    const/4 p1, 0x0

    iget-object p2, p2, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short p2, p2, p1

    const/4 p3, 0x0

    :goto_8
    if-ge p3, v4, :cond_8

    iget-object p5, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    iget-object v1, p4, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    add-int/lit8 v2, v0, -0x2

    sub-int/2addr v2, p3

    aget-short v1, v1, v2

    mul-int v1, v1, p2

    int-to-byte v1, v1

    invoke-static {v1}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3(B)B

    move-result v1

    int-to-short v1, v1

    aput-short v1, p5, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_8

    :cond_8
    iget-object p2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aput-short p1, p2, v4

    return-void
.end method

.method public s3Mul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->mod3PhiN()V

    return-void
.end method

.method public s3ToBytes([BI)V
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->packDegree()I

    move-result v0

    add-int/lit8 v1, v0, -0x5

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v4, v3, v2

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v5, v2, 0x1

    aget-short v5, v3, v5

    and-int/lit16 v5, v5, 0xff

    mul-int/lit8 v5, v5, 0x3

    add-int/lit8 v6, v2, 0x2

    aget-short v6, v3, v6

    and-int/lit16 v6, v6, 0xff

    mul-int/lit8 v6, v6, 0x9

    add-int/lit8 v7, v2, 0x3

    aget-short v7, v3, v7

    and-int/lit16 v7, v7, 0xff

    mul-int/lit8 v7, v7, 0x1b

    add-int/lit8 v8, v2, 0x4

    aget-short v3, v3, v8

    and-int/lit16 v3, v3, 0xff

    mul-int/lit8 v3, v3, 0x51

    add-int/lit8 v8, p2, 0x1

    add-int/2addr v4, v5

    add-int/2addr v4, v6

    add-int/2addr v4, v7

    add-int/2addr v4, v3

    int-to-byte v3, v4

    aput-byte v3, p1, p2

    add-int/lit8 v2, v2, 0x5

    move p2, v8

    goto :goto_0

    :cond_0
    if-ge v2, v0, :cond_2

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v1, v1, v0

    and-int/lit16 v1, v1, 0xff

    :goto_1
    add-int/lit8 v0, v0, -0x1

    if-lt v0, v2, :cond_1

    mul-int/lit8 v1, v1, 0x3

    iget-object v3, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v3, v0

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v1, v3

    goto :goto_1

    :cond_1
    int-to-byte v0, v1

    aput-byte v0, p1, p2

    :cond_2
    return-void
.end method

.method public s3ToBytes(I)[B
    .locals 1

    .line 0
    new-array p1, p1, [B

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->s3ToBytes([BI)V

    return-object p1
.end method

.method public abstract sqFromBytes([B)V
.end method

.method public sqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->rqMul(Lorg/bouncycastle/pqc/math/ntru/Polynomial;Lorg/bouncycastle/pqc/math/ntru/Polynomial;)V

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->modQPhiN()V

    return-void
.end method

.method public abstract sqToBytes(I)[B
.end method

.method public trinaryZqToZ3()V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v2, v1

    const v4, 0xffff

    and-int/2addr v3, v4

    iget-object v4, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->q()I

    move-result v4

    invoke-static {v3, v4}, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->modQ(II)I

    move-result v3

    int-to-short v3, v3

    aput-short v3, v2, v1

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v2, v1

    iget-object v4, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v4}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->logQ()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    ushr-int v4, v3, v4

    xor-int/2addr v3, v4

    and-int/lit8 v3, v3, 0x3

    int-to-short v3, v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z3ToZq()V
    .locals 6

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->coeffs:[S

    aget-short v3, v2, v1

    ushr-int/lit8 v4, v3, 0x1

    neg-int v4, v4

    iget-object v5, p0, Lorg/bouncycastle/pqc/math/ntru/Polynomial;->params:Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;

    invoke-virtual {v5}, Lorg/bouncycastle/pqc/math/ntru/parameters/NTRUParameterSet;->q()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    int-to-short v3, v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
