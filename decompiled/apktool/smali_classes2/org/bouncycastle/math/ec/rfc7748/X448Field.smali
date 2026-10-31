.class public abstract Lorg/bouncycastle/math/ec/rfc7748/X448Field;
.super Ljava/lang/Object;


# static fields
.field public static final M28:I = 0xfffffff

.field public static final P32:[I

.field public static final SIZE:I = 0x10

.field public static final U32:J = 0xffffffffL


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->P32:[I

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x2
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static add([I[I[I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 0
    aget v1, p0, v0

    aget v2, p1, v0

    add-int/2addr v1, v2

    aput v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static addOne([I)V
    .locals 2

    const/4 v0, 0x0

    .line 0
    aget v1, p0, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p0, v0

    return-void
.end method

.method public static addOne([II)V
    .locals 1

    .line 0
    aget v0, p0, p1

    add-int/lit8 v0, v0, 0x1

    aput v0, p0, p1

    return-void
.end method

.method public static areEqual([I[I)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x10

    if-ge v0, v2, :cond_0

    .line 0
    aget v2, p0, v0

    aget v3, p1, v0

    xor-int/2addr v2, v3

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    ushr-int/lit8 p0, v1, 0x1

    and-int/lit8 p1, v1, 0x1

    or-int/2addr p0, p1

    add-int/lit8 p0, p0, -0x1

    shr-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static areEqualVar([I[I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->areEqual([I[I)I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static carry([I)V
    .locals 34

    const/4 v0, 0x0

    .line 0
    aget v1, p0, v0

    const/4 v2, 0x1

    aget v3, p0, v2

    const/4 v4, 0x2

    aget v5, p0, v4

    const/4 v6, 0x3

    aget v7, p0, v6

    const/4 v8, 0x4

    aget v9, p0, v8

    const/4 v10, 0x5

    aget v11, p0, v10

    const/4 v12, 0x6

    aget v13, p0, v12

    const/4 v14, 0x7

    aget v15, p0, v14

    const/16 v16, 0x8

    aget v17, p0, v16

    const/16 v18, 0x9

    aget v19, p0, v18

    const/16 v20, 0xa

    aget v21, p0, v20

    const/16 v22, 0xb

    aget v23, p0, v22

    const/16 v24, 0xc

    aget v25, p0, v24

    const/16 v26, 0xd

    aget v27, p0, v26

    const/16 v28, 0xe

    aget v29, p0, v28

    const/16 v30, 0xf

    aget v31, p0, v30

    ushr-int/lit8 v32, v1, 0x1c

    add-int v3, v3, v32

    const v32, 0xfffffff

    and-int v1, v1, v32

    ushr-int/lit8 v33, v9, 0x1c

    add-int v11, v11, v33

    and-int v9, v9, v32

    ushr-int/lit8 v33, v17, 0x1c

    add-int v19, v19, v33

    and-int v17, v17, v32

    ushr-int/lit8 v33, v25, 0x1c

    add-int v27, v27, v33

    and-int v25, v25, v32

    ushr-int/lit8 v33, v3, 0x1c

    add-int v5, v5, v33

    and-int v3, v3, v32

    ushr-int/lit8 v33, v11, 0x1c

    add-int v13, v13, v33

    and-int v11, v11, v32

    ushr-int/lit8 v33, v19, 0x1c

    add-int v21, v21, v33

    and-int v19, v19, v32

    ushr-int/lit8 v33, v27, 0x1c

    add-int v29, v29, v33

    and-int v27, v27, v32

    ushr-int/lit8 v33, v5, 0x1c

    add-int v7, v7, v33

    and-int v5, v5, v32

    ushr-int/lit8 v33, v13, 0x1c

    add-int v15, v15, v33

    and-int v13, v13, v32

    ushr-int/lit8 v33, v21, 0x1c

    add-int v23, v23, v33

    and-int v21, v21, v32

    ushr-int/lit8 v33, v29, 0x1c

    add-int v31, v31, v33

    and-int v29, v29, v32

    ushr-int/lit8 v33, v31, 0x1c

    and-int v31, v31, v32

    add-int v1, v1, v33

    add-int v17, v17, v33

    ushr-int/lit8 v33, v7, 0x1c

    add-int v9, v9, v33

    and-int v7, v7, v32

    ushr-int/lit8 v33, v15, 0x1c

    add-int v17, v17, v33

    and-int v15, v15, v32

    ushr-int/lit8 v33, v23, 0x1c

    add-int v25, v25, v33

    and-int v23, v23, v32

    ushr-int/lit8 v33, v1, 0x1c

    add-int v3, v3, v33

    and-int v1, v1, v32

    ushr-int/lit8 v33, v9, 0x1c

    add-int v11, v11, v33

    and-int v9, v9, v32

    ushr-int/lit8 v33, v17, 0x1c

    add-int v19, v19, v33

    and-int v17, v17, v32

    ushr-int/lit8 v33, v25, 0x1c

    add-int v27, v27, v33

    and-int v25, v25, v32

    aput v1, p0, v0

    aput v3, p0, v2

    aput v5, p0, v4

    aput v7, p0, v6

    aput v9, p0, v8

    aput v11, p0, v10

    aput v13, p0, v12

    aput v15, p0, v14

    aput v17, p0, v16

    aput v19, p0, v18

    aput v21, p0, v20

    aput v23, p0, v22

    aput v25, p0, v24

    aput v27, p0, v26

    aput v29, p0, v28

    aput v31, p0, v30

    return-void
.end method

.method public static cmov(I[II[II)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    add-int v1, p4, v0

    .line 0
    aget v2, p3, v1

    add-int v3, p2, v0

    aget v3, p1, v3

    xor-int/2addr v3, v2

    and-int/2addr v3, p0

    xor-int/2addr v2, v3

    aput v2, p3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static cnegate(I[I)V
    .locals 2

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    invoke-static {v0, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sub([I[I[I)V

    neg-int p0, p0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, p1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->cmov(I[II[II)V

    return-void
.end method

.method public static copy([II[II)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    add-int v1, p3, v0

    add-int v2, p1, v0

    .line 0
    aget v2, p0, v2

    aput v2, p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static create()[I
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [I

    return-object v0
.end method

.method public static createTable(I)[I
    .locals 0

    mul-int/lit8 p0, p0, 0x10

    .line 0
    new-array p0, p0, [I

    return-object p0
.end method

.method public static cswap(I[I[I)V
    .locals 4

    const/4 v0, 0x0

    rsub-int/lit8 p0, p0, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 0
    aget v1, p1, v0

    aget v2, p2, v0

    xor-int v3, v1, v2

    and-int/2addr v3, p0

    xor-int/2addr v1, v3

    aput v1, p1, v0

    xor-int v1, v2, v3

    aput v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static decode([BI[I)V
    .locals 2

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, p1, p2, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x7

    const/4 v1, 0x2

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0xe

    const/4 v1, 0x4

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x15

    const/4 v1, 0x6

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x1c

    const/16 v1, 0x8

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x23

    const/16 v1, 0xa

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x2a

    const/16 v1, 0xc

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 p1, p1, 0x31

    const/16 v0, 0xe

    invoke-static {p0, p1, p2, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    return-void
.end method

.method public static decode([BI[II)V
    .locals 2

    .line 0
    invoke-static {p0, p1, p2, p3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x7

    add-int/lit8 v1, p3, 0x2

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0xe

    add-int/lit8 v1, p3, 0x4

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x15

    add-int/lit8 v1, p3, 0x6

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x1c

    add-int/lit8 v1, p3, 0x8

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x23

    add-int/lit8 v1, p3, 0xa

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 v0, p1, 0x2a

    add-int/lit8 v1, p3, 0xc

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    add-int/lit8 p1, p1, 0x31

    add-int/lit8 p3, p3, 0xe

    invoke-static {p0, p1, p2, p3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    return-void
.end method

.method public static decode([B[I)V
    .locals 3

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    const/4 v0, 0x7

    const/4 v1, 0x2

    invoke-static {p0, v0, p1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    const/4 v0, 0x4

    const/16 v1, 0xe

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    const/16 v0, 0x15

    const/4 v2, 0x6

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    const/16 v0, 0x1c

    const/16 v2, 0x8

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    const/16 v0, 0x23

    const/16 v2, 0xa

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    const/16 v0, 0x2a

    const/16 v2, 0xc

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    const/16 v0, 0x31

    invoke-static {p0, v0, p1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode56([BI[II)V

    return-void
.end method

.method public static decode([II[I)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, p1, p2, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode224([II[II)V

    add-int/lit8 p1, p1, 0x7

    const/16 v0, 0x8

    invoke-static {p0, p1, p2, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode224([II[II)V

    return-void
.end method

.method public static decode224([II[II)V
    .locals 8

    .line 0
    aget v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    aget v1, p0, v1

    add-int/lit8 v2, p1, 0x2

    aget v2, p0, v2

    add-int/lit8 v3, p1, 0x3

    aget v3, p0, v3

    add-int/lit8 v4, p1, 0x4

    aget v4, p0, v4

    add-int/lit8 v5, p1, 0x5

    aget v5, p0, v5

    add-int/lit8 p1, p1, 0x6

    aget p0, p0, p1

    const p1, 0xfffffff

    and-int v6, v0, p1

    aput v6, p2, p3

    add-int/lit8 v6, p3, 0x1

    ushr-int/lit8 v0, v0, 0x1c

    shl-int/lit8 v7, v1, 0x4

    or-int/2addr v0, v7

    and-int/2addr v0, p1

    aput v0, p2, v6

    add-int/lit8 v0, p3, 0x2

    ushr-int/lit8 v1, v1, 0x18

    shl-int/lit8 v6, v2, 0x8

    or-int/2addr v1, v6

    and-int/2addr v1, p1

    aput v1, p2, v0

    add-int/lit8 v0, p3, 0x3

    ushr-int/lit8 v1, v2, 0x14

    shl-int/lit8 v2, v3, 0xc

    or-int/2addr v1, v2

    and-int/2addr v1, p1

    aput v1, p2, v0

    add-int/lit8 v0, p3, 0x4

    ushr-int/lit8 v1, v3, 0x10

    shl-int/lit8 v2, v4, 0x10

    or-int/2addr v1, v2

    and-int/2addr v1, p1

    aput v1, p2, v0

    add-int/lit8 v0, p3, 0x5

    ushr-int/lit8 v1, v4, 0xc

    shl-int/lit8 v2, v5, 0x14

    or-int/2addr v1, v2

    and-int/2addr v1, p1

    aput v1, p2, v0

    add-int/lit8 v0, p3, 0x6

    ushr-int/lit8 v1, v5, 0x8

    shl-int/lit8 v2, p0, 0x18

    or-int/2addr v1, v2

    and-int/2addr p1, v1

    aput p1, p2, v0

    add-int/lit8 p3, p3, 0x7

    ushr-int/lit8 p0, p0, 0x4

    aput p0, p2, p3

    return-void
.end method

.method public static decode24([BI)I
    .locals 2

    .line 0
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x2

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x10

    or-int/2addr p0, v0

    return p0
.end method

.method public static decode32([BI)I
    .locals 2

    .line 0
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static decode56([BI[II)V
    .locals 1

    .line 0
    invoke-static {p0, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode32([BI)I

    move-result v0

    add-int/lit8 p1, p1, 0x4

    invoke-static {p0, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode24([BI)I

    move-result p0

    const p1, 0xfffffff

    and-int/2addr p1, v0

    aput p1, p2, p3

    add-int/lit8 p3, p3, 0x1

    ushr-int/lit8 p1, v0, 0x1c

    shl-int/lit8 p0, p0, 0x4

    or-int/2addr p0, p1

    aput p0, p2, p3

    return-void
.end method

.method public static encode([II[BI)V
    .locals 2

    .line 0
    invoke-static {p0, p1, p2, p3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p1, 0x2

    add-int/lit8 v1, p3, 0x7

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p1, 0x4

    add-int/lit8 v1, p3, 0xe

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p1, 0x6

    add-int/lit8 v1, p3, 0x15

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p1, 0x8

    add-int/lit8 v1, p3, 0x1c

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p1, 0xa

    add-int/lit8 v1, p3, 0x23

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p1, 0xc

    add-int/lit8 v1, p3, 0x2a

    invoke-static {p0, v0, p2, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 p1, p1, 0xe

    add-int/lit8 p3, p3, 0x31

    invoke-static {p0, p1, p2, p3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    return-void
.end method

.method public static encode([I[B)V
    .locals 3

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    const/4 v0, 0x2

    const/4 v1, 0x7

    invoke-static {p0, v0, p1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    const/4 v0, 0x4

    const/16 v1, 0xe

    invoke-static {p0, v0, p1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    const/4 v0, 0x6

    const/16 v2, 0x15

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    const/16 v0, 0x8

    const/16 v2, 0x1c

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    const/16 v0, 0xa

    const/16 v2, 0x23

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    const/16 v0, 0xc

    const/16 v2, 0x2a

    invoke-static {p0, v0, p1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    const/16 v0, 0x31

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    return-void
.end method

.method public static encode([I[BI)V
    .locals 2

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0, p1, p2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p2, 0x7

    const/4 v1, 0x2

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p2, 0xe

    const/4 v1, 0x4

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p2, 0x15

    const/4 v1, 0x6

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p2, 0x1c

    const/16 v1, 0x8

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p2, 0x23

    const/16 v1, 0xa

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 v0, p2, 0x2a

    const/16 v1, 0xc

    invoke-static {p0, v1, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    add-int/lit8 p2, p2, 0x31

    const/16 v0, 0xe

    invoke-static {p0, v0, p1, p2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode56([II[BI)V

    return-void
.end method

.method public static encode([I[II)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0, p1, p2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode224([II[II)V

    add-int/lit8 p2, p2, 0x7

    const/16 v0, 0x8

    invoke-static {p0, v0, p1, p2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode224([II[II)V

    return-void
.end method

.method public static encode224([II[II)V
    .locals 7

    .line 0
    aget v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    aget v1, p0, v1

    add-int/lit8 v2, p1, 0x2

    aget v2, p0, v2

    add-int/lit8 v3, p1, 0x3

    aget v3, p0, v3

    add-int/lit8 v4, p1, 0x4

    aget v4, p0, v4

    add-int/lit8 v5, p1, 0x5

    aget v5, p0, v5

    add-int/lit8 v6, p1, 0x6

    aget v6, p0, v6

    add-int/lit8 p1, p1, 0x7

    aget p0, p0, p1

    shl-int/lit8 p1, v1, 0x1c

    or-int/2addr p1, v0

    aput p1, p2, p3

    add-int/lit8 p1, p3, 0x1

    ushr-int/lit8 v0, v1, 0x4

    shl-int/lit8 v1, v2, 0x18

    or-int/2addr v0, v1

    aput v0, p2, p1

    add-int/lit8 p1, p3, 0x2

    ushr-int/lit8 v0, v2, 0x8

    shl-int/lit8 v1, v3, 0x14

    or-int/2addr v0, v1

    aput v0, p2, p1

    add-int/lit8 p1, p3, 0x3

    ushr-int/lit8 v0, v3, 0xc

    shl-int/lit8 v1, v4, 0x10

    or-int/2addr v0, v1

    aput v0, p2, p1

    add-int/lit8 p1, p3, 0x4

    ushr-int/lit8 v0, v4, 0x10

    shl-int/lit8 v1, v5, 0xc

    or-int/2addr v0, v1

    aput v0, p2, p1

    add-int/lit8 p1, p3, 0x5

    ushr-int/lit8 v0, v5, 0x14

    shl-int/lit8 v1, v6, 0x8

    or-int/2addr v0, v1

    aput v0, p2, p1

    add-int/lit8 p3, p3, 0x6

    ushr-int/lit8 p1, v6, 0x18

    shl-int/lit8 p0, p0, 0x4

    or-int/2addr p0, p1

    aput p0, p2, p3

    return-void
.end method

.method public static encode24(I[BI)V
    .locals 2

    int-to-byte v0, p0

    .line 0
    aput-byte v0, p1, p2

    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 p2, p2, 0x2

    ushr-int/lit8 p0, p0, 0x10

    int-to-byte p0, p0

    aput-byte p0, p1, p2

    return-void
.end method

.method public static encode32(I[BI)V
    .locals 2

    int-to-byte v0, p0

    .line 0
    aput-byte v0, p1, p2

    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x2

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 p2, p2, 0x3

    ushr-int/lit8 p0, p0, 0x18

    int-to-byte p0, p0

    aput-byte p0, p1, p2

    return-void
.end method

.method public static encode56([II[BI)V
    .locals 1

    .line 0
    aget v0, p0, p1

    add-int/lit8 p1, p1, 0x1

    aget p0, p0, p1

    shl-int/lit8 p1, p0, 0x1c

    or-int/2addr p1, v0

    invoke-static {p1, p2, p3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode32(I[BI)V

    ushr-int/lit8 p0, p0, 0x4

    add-int/lit8 p3, p3, 0x4

    invoke-static {p0, p2, p3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode24(I[BI)V

    return-void
.end method

.method public static inv([I[I)V
    .locals 3

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    const/16 v1, 0xe

    new-array v1, v1, [I

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->copy([II[II)V

    invoke-static {v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->normalize([I)V

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode([I[II)V

    sget-object p0, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->P32:[I

    invoke-static {p0, v1, v1}, Lorg/bouncycastle/math/raw/Mod;->modOddInverse([I[I[I)I

    invoke-static {v1, v2, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode([II[I)V

    return-void
.end method

.method public static invVar([I[I)V
    .locals 3

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    const/16 v1, 0xe

    new-array v1, v1, [I

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->copy([II[II)V

    invoke-static {v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->normalize([I)V

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->encode([I[II)V

    sget-object p0, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->P32:[I

    invoke-static {p0, v1, v1}, Lorg/bouncycastle/math/raw/Mod;->modOddInverseVar([I[I[I)Z

    invoke-static {v1, v2, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->decode([II[I)V

    return-void
.end method

.method public static isOne([I)I
    .locals 3

    const/4 v0, 0x0

    .line 0
    aget v0, p0, v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    aget v2, p0, v1

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    ushr-int/lit8 p0, v0, 0x1

    and-int/lit8 v0, v0, 0x1

    or-int/2addr p0, v0

    add-int/lit8 p0, p0, -0x1

    shr-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static isOneVar([I)Z
    .locals 0

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->isOne([I)I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isZero([I)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x10

    if-ge v0, v2, :cond_0

    .line 0
    aget v2, p0, v0

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    ushr-int/lit8 p0, v1, 0x1

    and-int/lit8 v0, v1, 0x1

    or-int/2addr p0, v0

    add-int/lit8 p0, p0, -0x1

    shr-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static isZeroVar([I)Z
    .locals 0

    .line 0
    invoke-static {p0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->isZero([I)I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static mul([II[I)V
    .locals 37

    const/4 v0, 0x0

    .line 0
    aget v0, p0, v0

    const/4 v1, 0x1

    aget v1, p0, v1

    const/4 v2, 0x2

    aget v2, p0, v2

    const/4 v3, 0x3

    aget v3, p0, v3

    const/4 v4, 0x4

    aget v4, p0, v4

    const/4 v5, 0x5

    aget v5, p0, v5

    const/4 v6, 0x6

    aget v6, p0, v6

    const/4 v7, 0x7

    aget v7, p0, v7

    const/16 v8, 0x8

    aget v10, p0, v8

    const/16 v11, 0x9

    aget v13, p0, v11

    const/16 v14, 0xa

    aget v11, p0, v14

    const/16 v16, 0xb

    const/16 v17, 0x3

    aget v12, p0, v16

    const/16 v18, 0xc

    const/16 v19, 0x4

    aget v9, p0, v18

    const/16 v20, 0xd

    const/16 v21, 0x5

    aget v8, p0, v20

    const/16 v22, 0xe

    const/16 v23, 0x6

    aget v14, p0, v22

    const/16 v24, 0xf

    const/16 v25, 0x7

    aget v15, p0, v24

    move/from16 v26, v0

    int-to-long v0, v1

    move/from16 v27, v9

    move/from16 v28, v10

    move/from16 v9, p1

    int-to-long v9, v9

    mul-long v0, v0, v9

    move/from16 v29, v4

    long-to-int v4, v0

    const v30, 0xfffffff

    and-int v4, v4, v30

    const/16 v31, 0x1c

    ushr-long v0, v0, v31

    move/from16 p0, v4

    int-to-long v4, v5

    mul-long v4, v4, v9

    move/from16 v32, v15

    long-to-int v15, v4

    and-int v15, v15, v30

    ushr-long v4, v4, v31

    move/from16 v33, v12

    int-to-long v12, v13

    mul-long v12, v12, v9

    move/from16 p1, v15

    long-to-int v15, v12

    and-int v15, v15, v30

    ushr-long v12, v12, v31

    move/from16 v34, v7

    int-to-long v7, v8

    mul-long v7, v7, v9

    move/from16 v35, v15

    long-to-int v15, v7

    and-int v15, v15, v30

    ushr-long v7, v7, v31

    move/from16 v36, v3

    int-to-long v2, v2

    mul-long v2, v2, v9

    add-long/2addr v2, v0

    long-to-int v0, v2

    and-int v0, v0, v30

    const/4 v1, 0x2

    aput v0, p2, v1

    ushr-long v0, v2, v31

    int-to-long v2, v6

    mul-long v2, v2, v9

    add-long/2addr v2, v4

    long-to-int v4, v2

    and-int v4, v4, v30

    aput v4, p2, v23

    ushr-long v2, v2, v31

    int-to-long v4, v11

    mul-long v4, v4, v9

    add-long/2addr v4, v12

    long-to-int v6, v4

    and-int v6, v6, v30

    const/16 v11, 0xa

    aput v6, p2, v11

    ushr-long v4, v4, v31

    int-to-long v11, v14

    mul-long v11, v11, v9

    add-long/2addr v11, v7

    long-to-int v6, v11

    and-int v6, v6, v30

    aput v6, p2, v22

    ushr-long v6, v11, v31

    move/from16 v8, v36

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v0

    long-to-int v0, v11

    and-int v0, v0, v30

    aput v0, p2, v17

    ushr-long v0, v11, v31

    move/from16 v8, v34

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v2

    long-to-int v2, v11

    and-int v2, v2, v30

    aput v2, p2, v25

    ushr-long v2, v11, v31

    move/from16 v8, v33

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v4

    long-to-int v4, v11

    and-int v4, v4, v30

    aput v4, p2, v16

    ushr-long v4, v11, v31

    move/from16 v8, v32

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v6

    long-to-int v6, v11

    and-int v6, v6, v30

    aput v6, p2, v24

    ushr-long v6, v11, v31

    add-long/2addr v2, v6

    move/from16 v8, v29

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v0

    long-to-int v0, v11

    and-int v0, v0, v30

    aput v0, p2, v19

    ushr-long v0, v11, v31

    move/from16 v8, v28

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v2

    long-to-int v2, v11

    and-int v2, v2, v30

    const/16 v3, 0x8

    aput v2, p2, v3

    ushr-long v2, v11, v31

    move/from16 v8, v27

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v4

    long-to-int v4, v11

    and-int v4, v4, v30

    aput v4, p2, v18

    ushr-long v4, v11, v31

    move/from16 v8, v26

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v6

    long-to-int v6, v11

    and-int v6, v6, v30

    const/4 v7, 0x0

    aput v6, p2, v7

    ushr-long v6, v11, v31

    long-to-int v7, v6

    add-int v6, p0, v7

    const/4 v7, 0x1

    aput v6, p2, v7

    long-to-int v1, v0

    add-int v0, p1, v1

    aput v0, p2, v21

    long-to-int v0, v2

    add-int v0, v35, v0

    const/16 v1, 0x9

    aput v0, p2, v1

    long-to-int v0, v4

    add-int/2addr v15, v0

    aput v15, p2, v20

    return-void
.end method

.method public static mul([I[I[I)V
    .locals 140

    const/4 v0, 0x0

    .line 0
    aget v0, p0, v0

    const/4 v1, 0x1

    aget v1, p0, v1

    const/4 v2, 0x2

    aget v2, p0, v2

    const/4 v3, 0x3

    aget v3, p0, v3

    const/4 v4, 0x4

    aget v4, p0, v4

    const/4 v5, 0x5

    aget v5, p0, v5

    const/4 v6, 0x6

    aget v6, p0, v6

    const/4 v7, 0x7

    aget v7, p0, v7

    const/16 v8, 0x8

    const/4 v9, 0x0

    aget v10, p0, v8

    const/16 v11, 0x9

    aget v13, p0, v11

    const/16 v14, 0xa

    aget v11, p0, v14

    const/16 v17, 0xb

    const/16 v18, 0x3

    aget v14, p0, v17

    const/16 v20, 0xc

    const/16 v21, 0x4

    aget v8, p0, v20

    const/16 v23, 0xd

    const/16 v24, 0x5

    aget v15, p0, v23

    const/16 v26, 0xe

    const/16 v27, 0x6

    aget v12, p0, v26

    const/16 v29, 0xf

    const/16 v30, 0x7

    move/from16 v31, v7

    aget v7, p0, v29

    move/from16 p0, v7

    aget v7, p1, v9

    const/16 v28, 0x1

    aget v9, p1, v28

    move/from16 v32, v9

    const/16 v25, 0x2

    aget v9, p1, v25

    move/from16 v33, v9

    aget v9, p1, v18

    move/from16 v34, v9

    aget v9, p1, v21

    move/from16 v35, v9

    aget v9, p1, v24

    move/from16 v36, v9

    aget v9, p1, v27

    move/from16 v37, v9

    aget v9, p1, v30

    move/from16 v38, v9

    const/16 v22, 0x8

    aget v9, p1, v22

    move/from16 v39, v7

    const/16 v16, 0x9

    aget v7, p1, v16

    move/from16 v40, v7

    const/16 v19, 0xa

    aget v7, p1, v19

    move/from16 v41, v7

    aget v7, p1, v17

    move/from16 v42, v7

    aget v7, p1, v20

    move/from16 v43, v7

    aget v7, p1, v23

    move/from16 v44, v7

    aget v7, p1, v26

    move/from16 v45, v7

    aget v7, p1, v29

    move/from16 p1, v7

    add-int v7, v0, v10

    move/from16 v46, v7

    add-int v7, v1, v13

    move/from16 v47, v7

    add-int v7, v2, v11

    move/from16 v48, v7

    add-int v7, v3, v14

    move/from16 v49, v7

    add-int v7, v4, v8

    move/from16 v50, v7

    add-int v7, v5, v15

    move/from16 v51, v7

    add-int v7, v6, v12

    move/from16 v52, v7

    add-int v7, v31, p0

    move/from16 v53, v7

    add-int v7, v39, v9

    move/from16 v54, v7

    add-int v7, v32, v40

    move/from16 v55, v7

    add-int v7, v33, v41

    move/from16 v56, v7

    add-int v7, v34, v42

    move/from16 v57, v7

    add-int v7, v35, v43

    move/from16 v58, v7

    add-int v7, v36, v44

    move/from16 v59, v7

    add-int v7, v37, v45

    move/from16 v60, v7

    add-int v7, v38, p1

    move/from16 v61, v13

    move/from16 v62, v14

    int-to-long v13, v0

    move/from16 v63, v7

    move/from16 v0, v39

    move/from16 v39, v8

    int-to-long v7, v0

    mul-long v64, v13, v7

    move-wide/from16 v66, v13

    move/from16 v0, v31

    int-to-long v13, v0

    move-wide/from16 v68, v7

    move/from16 v0, v32

    int-to-long v7, v0

    mul-long v70, v13, v7

    move-wide/from16 v72, v13

    int-to-long v13, v6

    move/from16 v0, v33

    move-wide/from16 v32, v7

    int-to-long v6, v0

    mul-long v74, v13, v6

    add-long v74, v74, v70

    move-wide/from16 v70, v13

    int-to-long v13, v5

    move-wide/from16 v76, v6

    move/from16 v0, v34

    int-to-long v5, v0

    mul-long v7, v13, v5

    add-long v7, v7, v74

    move-wide/from16 v74, v13

    int-to-long v13, v4

    move/from16 v0, v35

    move-wide/from16 v34, v5

    int-to-long v4, v0

    mul-long v78, v13, v4

    add-long v78, v78, v7

    int-to-long v6, v3

    move-wide/from16 v80, v13

    move/from16 v0, v36

    int-to-long v13, v0

    mul-long v82, v6, v13

    add-long v82, v82, v78

    int-to-long v2, v2

    move/from16 v0, v37

    move-wide/from16 v36, v6

    int-to-long v6, v0

    mul-long v78, v2, v6

    add-long v78, v78, v82

    int-to-long v0, v1

    move-wide/from16 v82, v2

    move/from16 v8, v38

    int-to-long v2, v8

    mul-long v84, v0, v2

    add-long v84, v84, v78

    move-wide/from16 v78, v2

    int-to-long v2, v10

    int-to-long v8, v9

    mul-long v86, v2, v8

    move/from16 v10, p0

    move-wide/from16 v88, v2

    int-to-long v2, v10

    move-wide/from16 v90, v8

    move/from16 v10, v40

    int-to-long v8, v10

    mul-long v92, v2, v8

    move-wide/from16 v94, v2

    int-to-long v2, v12

    move/from16 v10, v41

    move-wide/from16 v40, v8

    int-to-long v8, v10

    mul-long v96, v2, v8

    add-long v96, v96, v92

    move-wide/from16 v92, v2

    int-to-long v2, v15

    move-wide/from16 v98, v8

    move/from16 v10, v42

    int-to-long v8, v10

    mul-long v100, v2, v8

    add-long v100, v100, v96

    move/from16 v10, v39

    move-wide/from16 v38, v2

    int-to-long v2, v10

    move/from16 v10, v43

    move-wide/from16 v42, v8

    int-to-long v8, v10

    mul-long v96, v2, v8

    add-long v96, v96, v100

    move-wide/from16 v100, v2

    move/from16 v10, v62

    int-to-long v2, v10

    move-wide/from16 v102, v8

    move/from16 v10, v44

    int-to-long v8, v10

    mul-long v104, v2, v8

    add-long v104, v104, v96

    int-to-long v10, v11

    move/from16 v12, v45

    move-wide/from16 v44, v2

    int-to-long v2, v12

    mul-long v96, v10, v2

    add-long v96, v96, v104

    move/from16 v12, v61

    move-wide/from16 v61, v10

    int-to-long v10, v12

    move/from16 v12, p1

    move-wide/from16 v104, v2

    int-to-long v2, v12

    mul-long v106, v10, v2

    add-long v106, v106, v96

    move-wide/from16 v96, v2

    move/from16 v12, v46

    int-to-long v2, v12

    move-wide/from16 p0, v8

    move/from16 v12, v54

    int-to-long v8, v12

    mul-long v108, v2, v8

    move/from16 v12, v53

    move-wide/from16 v53, v2

    int-to-long v2, v12

    move-wide/from16 v110, v8

    move/from16 v12, v55

    int-to-long v8, v12

    mul-long v112, v2, v8

    move-wide/from16 v114, v2

    move/from16 v12, v52

    int-to-long v2, v12

    move/from16 v12, v56

    move-wide/from16 v55, v8

    int-to-long v8, v12

    mul-long v116, v2, v8

    add-long v116, v116, v112

    move/from16 v12, v51

    move-wide/from16 v51, v2

    int-to-long v2, v12

    move-wide/from16 v112, v8

    move/from16 v12, v57

    int-to-long v8, v12

    mul-long v118, v2, v8

    add-long v118, v118, v116

    move-wide/from16 v116, v2

    move/from16 v12, v50

    int-to-long v2, v12

    move/from16 v12, v58

    move-wide/from16 v57, v8

    int-to-long v8, v12

    mul-long v120, v2, v8

    add-long v120, v120, v118

    move/from16 v12, v49

    move-wide/from16 v49, v2

    int-to-long v2, v12

    move-wide/from16 v118, v8

    move/from16 v12, v59

    int-to-long v8, v12

    mul-long v122, v2, v8

    add-long v122, v122, v120

    move-wide/from16 v120, v2

    move/from16 v12, v48

    int-to-long v2, v12

    move/from16 v12, v60

    move-wide/from16 v59, v8

    int-to-long v8, v12

    mul-long v124, v2, v8

    add-long v124, v124, v122

    move/from16 v12, v47

    move-wide/from16 v46, v2

    int-to-long v2, v12

    move-wide/from16 v122, v8

    move/from16 v12, v63

    int-to-long v8, v12

    mul-long v126, v2, v8

    add-long v126, v126, v124

    add-long v86, v64, v86

    add-long v86, v86, v126

    move-wide/from16 v124, v8

    sub-long v8, v86, v84

    long-to-int v12, v8

    const v15, 0xfffffff

    and-int/2addr v12, v15

    const/16 v15, 0x1c

    ushr-long/2addr v8, v15

    add-long v106, v106, v108

    sub-long v106, v106, v64

    move-wide/from16 v63, v8

    add-long v8, v106, v126

    const v31, 0xfffffff

    move/from16 v48, v12

    long-to-int v12, v8

    and-int v12, v12, v31

    ushr-long/2addr v8, v15

    mul-long v84, v0, v68

    mul-long v86, v66, v32

    add-long v86, v86, v84

    mul-long v84, v72, v76

    mul-long v106, v70, v34

    add-long v106, v106, v84

    mul-long v84, v74, v4

    add-long v84, v84, v106

    mul-long v106, v80, v13

    add-long v106, v106, v84

    mul-long v84, v36, v6

    add-long v84, v84, v106

    mul-long v106, v82, v78

    add-long v106, v106, v84

    mul-long v84, v10, v90

    mul-long v108, v88, v40

    add-long v108, v108, v84

    mul-long v84, v94, v98

    mul-long v126, v92, v42

    add-long v126, v126, v84

    mul-long v84, v38, v102

    add-long v84, v84, v126

    mul-long v126, v100, p0

    add-long v126, v126, v84

    mul-long v84, v44, v104

    add-long v84, v84, v126

    mul-long v126, v61, v96

    add-long v126, v126, v84

    mul-long v84, v2, v110

    mul-long v128, v53, v55

    add-long v128, v128, v84

    mul-long v84, v114, v112

    mul-long v130, v51, v57

    add-long v130, v130, v84

    mul-long v84, v116, v118

    add-long v84, v84, v130

    mul-long v130, v49, v59

    add-long v130, v130, v84

    mul-long v84, v120, v122

    add-long v84, v84, v130

    mul-long v130, v46, v124

    add-long v130, v130, v84

    add-long v108, v86, v108

    add-long v108, v108, v130

    sub-long v108, v108, v106

    move-wide/from16 v84, v2

    add-long v2, v108, v63

    move/from16 v63, v12

    long-to-int v12, v2

    and-int v12, v12, v31

    ushr-long/2addr v2, v15

    add-long v126, v126, v128

    sub-long v126, v126, v86

    add-long v126, v126, v130

    add-long v8, v126, v8

    move/from16 v64, v12

    long-to-int v12, v8

    and-int v12, v12, v31

    ushr-long/2addr v8, v15

    mul-long v86, v82, v68

    mul-long v106, v0, v32

    add-long v106, v106, v86

    mul-long v86, v66, v76

    add-long v86, v86, v106

    mul-long v106, v72, v34

    mul-long v108, v70, v4

    add-long v108, v108, v106

    mul-long v106, v74, v13

    add-long v106, v106, v108

    mul-long v108, v80, v6

    add-long v108, v108, v106

    mul-long v106, v36, v78

    add-long v106, v106, v108

    mul-long v108, v61, v90

    mul-long v126, v10, v40

    add-long v126, v126, v108

    mul-long v108, v88, v98

    add-long v108, v108, v126

    mul-long v126, v94, v42

    mul-long v128, v92, v102

    add-long v128, v128, v126

    mul-long v126, v38, p0

    add-long v126, v126, v128

    mul-long v128, v100, v104

    add-long v128, v128, v126

    mul-long v126, v44, v96

    add-long v126, v126, v128

    mul-long v128, v46, v110

    mul-long v130, v84, v55

    add-long v130, v130, v128

    mul-long v128, v53, v112

    add-long v128, v128, v130

    mul-long v130, v114, v57

    mul-long v132, v51, v118

    add-long v132, v132, v130

    mul-long v130, v116, v59

    add-long v130, v130, v132

    mul-long v132, v49, v122

    add-long v132, v132, v130

    mul-long v130, v120, v124

    add-long v130, v130, v132

    add-long v108, v86, v108

    add-long v108, v108, v130

    sub-long v108, v108, v106

    add-long v2, v108, v2

    move/from16 v65, v12

    long-to-int v12, v2

    and-int v12, v12, v31

    ushr-long/2addr v2, v15

    add-long v126, v126, v128

    sub-long v126, v126, v86

    add-long v126, v126, v130

    add-long v8, v126, v8

    move/from16 v86, v12

    long-to-int v12, v8

    and-int v12, v12, v31

    ushr-long/2addr v8, v15

    mul-long v106, v36, v68

    mul-long v108, v82, v32

    add-long v108, v108, v106

    mul-long v106, v0, v76

    add-long v106, v106, v108

    mul-long v108, v66, v34

    add-long v108, v108, v106

    mul-long v106, v72, v4

    mul-long v126, v70, v13

    add-long v126, v126, v106

    mul-long v106, v74, v6

    add-long v106, v106, v126

    mul-long v126, v80, v78

    add-long v126, v126, v106

    mul-long v106, v44, v90

    mul-long v128, v61, v40

    add-long v128, v128, v106

    mul-long v106, v10, v98

    add-long v106, v106, v128

    mul-long v128, v88, v42

    add-long v128, v128, v106

    mul-long v106, v94, v102

    mul-long v130, v92, p0

    add-long v130, v130, v106

    mul-long v106, v38, v104

    add-long v106, v106, v130

    mul-long v130, v100, v96

    add-long v130, v130, v106

    mul-long v106, v120, v110

    mul-long v132, v46, v55

    add-long v132, v132, v106

    mul-long v106, v84, v112

    add-long v106, v106, v132

    mul-long v132, v53, v57

    add-long v132, v132, v106

    mul-long v106, v114, v118

    mul-long v134, v51, v59

    add-long v134, v134, v106

    mul-long v106, v116, v122

    add-long v106, v106, v134

    mul-long v134, v49, v124

    add-long v134, v134, v106

    add-long v128, v108, v128

    add-long v128, v128, v134

    sub-long v128, v128, v126

    add-long v2, v128, v2

    move/from16 v87, v12

    long-to-int v12, v2

    and-int v12, v12, v31

    ushr-long/2addr v2, v15

    add-long v130, v130, v132

    sub-long v130, v130, v108

    add-long v130, v130, v134

    add-long v8, v130, v8

    move/from16 v106, v12

    long-to-int v12, v8

    and-int v12, v12, v31

    ushr-long/2addr v8, v15

    mul-long v107, v80, v68

    mul-long v126, v36, v32

    add-long v126, v126, v107

    mul-long v107, v82, v76

    add-long v107, v107, v126

    mul-long v126, v0, v34

    add-long v126, v126, v107

    mul-long v107, v66, v4

    add-long v107, v107, v126

    mul-long v126, v72, v13

    mul-long v128, v70, v6

    add-long v128, v128, v126

    mul-long v126, v74, v78

    add-long v126, v126, v128

    mul-long v128, v100, v90

    mul-long v130, v44, v40

    add-long v130, v130, v128

    mul-long v128, v61, v98

    add-long v128, v128, v130

    mul-long v130, v10, v42

    add-long v130, v130, v128

    mul-long v128, v88, v102

    add-long v128, v128, v130

    mul-long v130, v94, p0

    mul-long v132, v92, v104

    add-long v132, v132, v130

    mul-long v130, v38, v96

    add-long v130, v130, v132

    mul-long v132, v49, v110

    mul-long v134, v120, v55

    add-long v134, v134, v132

    mul-long v132, v46, v112

    add-long v132, v132, v134

    mul-long v134, v84, v57

    add-long v134, v134, v132

    mul-long v132, v53, v118

    add-long v132, v132, v134

    mul-long v134, v114, v59

    mul-long v136, v51, v122

    add-long v136, v136, v134

    mul-long v134, v116, v124

    add-long v134, v134, v136

    add-long v128, v107, v128

    add-long v128, v128, v134

    sub-long v128, v128, v126

    add-long v2, v128, v2

    move/from16 v109, v12

    long-to-int v12, v2

    and-int v12, v12, v31

    ushr-long/2addr v2, v15

    add-long v130, v130, v132

    sub-long v130, v130, v107

    add-long v130, v130, v134

    add-long v8, v130, v8

    move/from16 v107, v12

    long-to-int v12, v8

    and-int v12, v12, v31

    ushr-long/2addr v8, v15

    mul-long v126, v74, v68

    mul-long v128, v80, v32

    add-long v128, v128, v126

    mul-long v126, v36, v76

    add-long v126, v126, v128

    mul-long v128, v82, v34

    add-long v128, v128, v126

    mul-long v126, v0, v4

    add-long v126, v126, v128

    mul-long v128, v66, v13

    add-long v128, v128, v126

    mul-long v126, v72, v6

    mul-long v130, v70, v78

    add-long v130, v130, v126

    mul-long v126, v38, v90

    mul-long v132, v100, v40

    add-long v132, v132, v126

    mul-long v126, v44, v98

    add-long v126, v126, v132

    mul-long v132, v61, v42

    add-long v132, v132, v126

    mul-long v126, v10, v102

    add-long v126, v126, v132

    mul-long v132, v88, p0

    add-long v132, v132, v126

    mul-long v126, v94, v104

    mul-long v134, v92, v96

    add-long v134, v134, v126

    mul-long v126, v116, v110

    mul-long v136, v49, v55

    add-long v136, v136, v126

    mul-long v126, v120, v112

    add-long v126, v126, v136

    mul-long v136, v46, v57

    add-long v136, v136, v126

    mul-long v126, v84, v118

    add-long v126, v126, v136

    mul-long v136, v53, v59

    add-long v136, v136, v126

    mul-long v126, v114, v122

    mul-long v138, v51, v124

    add-long v138, v138, v126

    add-long v132, v128, v132

    add-long v132, v132, v138

    sub-long v132, v132, v130

    add-long v2, v132, v2

    move/from16 v108, v12

    long-to-int v12, v2

    and-int v12, v12, v31

    ushr-long/2addr v2, v15

    add-long v134, v134, v136

    sub-long v134, v134, v128

    add-long v134, v134, v138

    add-long v8, v134, v8

    move/from16 v126, v12

    long-to-int v12, v8

    and-int v12, v12, v31

    ushr-long/2addr v8, v15

    mul-long v127, v70, v68

    mul-long v129, v74, v32

    add-long v129, v129, v127

    mul-long v127, v80, v76

    add-long v127, v127, v129

    mul-long v129, v36, v34

    add-long v129, v129, v127

    mul-long v127, v82, v4

    add-long v127, v127, v129

    mul-long v129, v0, v13

    add-long v129, v129, v127

    mul-long v127, v66, v6

    add-long v127, v127, v129

    mul-long v129, v72, v78

    mul-long v131, v92, v90

    mul-long v133, v38, v40

    add-long v133, v133, v131

    mul-long v131, v100, v98

    add-long v131, v131, v133

    mul-long v133, v44, v42

    add-long v133, v133, v131

    mul-long v131, v61, v102

    add-long v131, v131, v133

    mul-long v133, v10, p0

    add-long v133, v133, v131

    mul-long v131, v88, v104

    add-long v131, v131, v133

    mul-long v133, v94, v96

    mul-long v135, v51, v110

    mul-long v137, v116, v55

    add-long v137, v137, v135

    mul-long v135, v49, v112

    add-long v135, v135, v137

    mul-long v137, v120, v57

    add-long v137, v137, v135

    mul-long v135, v46, v118

    add-long v135, v135, v137

    mul-long v137, v84, v59

    add-long v137, v137, v135

    mul-long v135, v53, v122

    add-long v135, v135, v137

    mul-long v137, v114, v124

    add-long v131, v127, v131

    add-long v131, v131, v137

    sub-long v131, v131, v129

    add-long v2, v131, v2

    move/from16 v129, v12

    long-to-int v12, v2

    and-int v12, v12, v31

    ushr-long/2addr v2, v15

    add-long v133, v133, v135

    sub-long v133, v133, v127

    add-long v133, v133, v137

    add-long v8, v133, v8

    move/from16 v127, v12

    long-to-int v12, v8

    and-int v12, v12, v31

    ushr-long/2addr v8, v15

    mul-long v68, v68, v72

    mul-long v32, v32, v70

    add-long v32, v32, v68

    mul-long v68, v74, v76

    add-long v68, v68, v32

    mul-long v32, v80, v34

    add-long v32, v32, v68

    mul-long v4, v4, v36

    add-long v4, v4, v32

    mul-long v13, v13, v82

    add-long/2addr v13, v4

    mul-long v0, v0, v6

    add-long/2addr v0, v13

    mul-long v13, v66, v78

    add-long/2addr v13, v0

    mul-long v0, v94, v90

    mul-long v4, v92, v40

    add-long/2addr v4, v0

    mul-long v0, v38, v98

    add-long/2addr v0, v4

    mul-long v4, v100, v42

    add-long/2addr v4, v0

    mul-long v0, v44, v102

    add-long/2addr v0, v4

    mul-long v4, v61, p0

    add-long/2addr v4, v0

    mul-long v10, v10, v104

    add-long/2addr v10, v4

    mul-long v0, v88, v96

    add-long/2addr v0, v10

    mul-long v4, v114, v110

    mul-long v6, v51, v55

    add-long/2addr v6, v4

    mul-long v4, v116, v112

    add-long/2addr v4, v6

    mul-long v6, v49, v57

    add-long/2addr v6, v4

    mul-long v4, v120, v118

    add-long/2addr v4, v6

    mul-long v6, v46, v59

    add-long/2addr v6, v4

    mul-long v4, v84, v122

    add-long/2addr v4, v6

    mul-long v6, v53, v124

    add-long/2addr v6, v4

    add-long/2addr v0, v13

    add-long/2addr v0, v2

    long-to-int v2, v0

    and-int v2, v2, v31

    ushr-long/2addr v0, v15

    sub-long/2addr v6, v13

    add-long/2addr v6, v8

    long-to-int v3, v6

    and-int v3, v3, v31

    ushr-long v4, v6, v15

    add-long/2addr v0, v4

    move/from16 v6, v63

    int-to-long v6, v6

    add-long/2addr v0, v6

    long-to-int v6, v0

    and-int v6, v6, v31

    ushr-long/2addr v0, v15

    move/from16 v7, v48

    int-to-long v7, v7

    add-long/2addr v4, v7

    long-to-int v7, v4

    and-int v7, v7, v31

    ushr-long/2addr v4, v15

    long-to-int v1, v0

    add-int v0, v65, v1

    long-to-int v1, v4

    add-int v1, v64, v1

    const/4 v4, 0x0

    aput v7, p2, v4

    const/4 v4, 0x1

    aput v1, p2, v4

    const/4 v1, 0x2

    aput v86, p2, v1

    aput v106, p2, v18

    aput v107, p2, v21

    aput v126, p2, v24

    aput v127, p2, v27

    aput v2, p2, v30

    const/16 v1, 0x8

    aput v6, p2, v1

    const/16 v1, 0x9

    aput v0, p2, v1

    const/16 v0, 0xa

    aput v87, p2, v0

    aput v109, p2, v17

    aput v108, p2, v20

    aput v129, p2, v23

    aput v12, p2, v26

    aput v3, p2, v29

    return-void
.end method

.method public static negate([I[I)V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    invoke-static {v0, p0, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sub([I[I[I)V

    return-void
.end method

.method public static normalize([I)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->reduce([II)V

    const/4 v0, -0x1

    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->reduce([II)V

    return-void
.end method

.method public static one([I)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 0
    aput v1, p0, v0

    :goto_0
    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    aput v0, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static powPm3d4([I[I)V
    .locals 4

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    invoke-static {p0, v0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    invoke-static {p0, v1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {v1, v0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v3

    invoke-static {v0, v2, v3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {v1, v3, v3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    const/16 v1, 0x9

    invoke-static {v3, v1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {v3, v0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    invoke-static {p0, v1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v2

    const/16 v3, 0x12

    invoke-static {v1, v3, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {v0, v2, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    const/16 v1, 0x25

    invoke-static {v2, v1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {v2, v0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v3

    invoke-static {v0, v1, v3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {v2, v3, v3}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    const/16 v1, 0x6f

    invoke-static {v3, v1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {v3, v0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    invoke-static {p0, v1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object p0

    const/16 v2, 0xdf

    invoke-static {v1, v2, p0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([II[I)V

    invoke-static {p0, v0, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    return-void
.end method

.method public static reduce([II)V
    .locals 13

    const/16 v0, 0xf

    .line 0
    aget v1, p0, v0

    const v2, 0xfffffff

    and-int v3, v1, v2

    const/16 v4, 0x1c

    ushr-int/2addr v1, v4

    add-int/2addr v1, p1

    int-to-long v5, v1

    const/4 p1, 0x0

    move-wide v7, v5

    :goto_0
    const-wide v9, 0xffffffffL

    const/16 v1, 0x8

    if-ge p1, v1, :cond_0

    aget v1, p0, p1

    int-to-long v11, v1

    and-long/2addr v9, v11

    add-long/2addr v7, v9

    long-to-int v1, v7

    and-int/2addr v1, v2

    aput v1, p0, p1

    shr-long/2addr v7, v4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    add-long/2addr v7, v5

    :goto_1
    if-ge v1, v0, :cond_1

    aget p1, p0, v1

    int-to-long v5, p1

    and-long/2addr v5, v9

    add-long/2addr v7, v5

    long-to-int p1, v7

    and-int/2addr p1, v2

    aput p1, p0, v1

    shr-long/2addr v7, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    long-to-int p1, v7

    add-int/2addr v3, p1

    aput v3, p0, v0

    return-void
.end method

.method public static sqr([II[I)V
    .locals 0

    .line 0
    invoke-static {p0, p2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-lez p1, :cond_0

    invoke-static {p2, p2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static sqr([I[I)V
    .locals 112

    const/4 v0, 0x0

    .line 0
    aget v0, p0, v0

    const/4 v1, 0x1

    aget v1, p0, v1

    const/4 v2, 0x2

    aget v2, p0, v2

    const/4 v3, 0x3

    aget v3, p0, v3

    const/4 v4, 0x4

    aget v4, p0, v4

    const/4 v5, 0x5

    aget v5, p0, v5

    const/4 v6, 0x6

    aget v6, p0, v6

    const/4 v7, 0x7

    aget v7, p0, v7

    const/16 v8, 0x8

    aget v10, p0, v8

    const/16 v11, 0x9

    aget v13, p0, v11

    const/16 v14, 0xa

    aget v11, p0, v14

    const/16 v16, 0xb

    const/16 v17, 0x3

    aget v14, p0, v16

    const/16 v18, 0xc

    const/16 v19, 0x4

    aget v8, p0, v18

    const/16 v20, 0xd

    const/16 v21, 0x5

    aget v15, p0, v20

    const/16 v22, 0xe

    const/16 v23, 0x6

    aget v12, p0, v22

    const/16 v24, 0xf

    const/16 v25, 0x7

    aget v9, p0, v24

    move/from16 v26, v7

    mul-int/lit8 v7, v0, 0x2

    move/from16 p0, v7

    mul-int/lit8 v7, v1, 0x2

    move/from16 v27, v7

    mul-int/lit8 v7, v2, 0x2

    move/from16 v28, v7

    mul-int/lit8 v7, v3, 0x2

    move/from16 v29, v7

    mul-int/lit8 v7, v4, 0x2

    move/from16 v30, v7

    mul-int/lit8 v7, v5, 0x2

    move/from16 v31, v7

    mul-int/lit8 v7, v6, 0x2

    move/from16 v32, v7

    mul-int/lit8 v7, v10, 0x2

    move/from16 v33, v7

    mul-int/lit8 v7, v13, 0x2

    move/from16 v34, v7

    mul-int/lit8 v7, v11, 0x2

    move/from16 v35, v7

    mul-int/lit8 v7, v14, 0x2

    move/from16 v36, v7

    mul-int/lit8 v7, v8, 0x2

    move/from16 v37, v7

    mul-int/lit8 v7, v15, 0x2

    move/from16 v38, v7

    mul-int/lit8 v7, v12, 0x2

    move/from16 v39, v7

    add-int v7, v0, v10

    move/from16 v40, v10

    add-int v10, v1, v13

    move/from16 v41, v13

    add-int v13, v2, v11

    move/from16 v42, v11

    add-int v11, v3, v14

    move/from16 v43, v14

    add-int v14, v4, v8

    move/from16 v44, v3

    add-int v3, v5, v15

    move/from16 v45, v2

    add-int v2, v6, v12

    move/from16 v46, v1

    add-int v1, v26, v9

    move/from16 v47, v1

    mul-int/lit8 v1, v7, 0x2

    move/from16 v48, v1

    mul-int/lit8 v1, v10, 0x2

    move/from16 v49, v10

    mul-int/lit8 v10, v13, 0x2

    move/from16 v50, v13

    mul-int/lit8 v13, v11, 0x2

    move/from16 v51, v11

    mul-int/lit8 v11, v14, 0x2

    move/from16 v52, v11

    mul-int/lit8 v11, v3, 0x2

    move/from16 v53, v11

    mul-int/lit8 v11, v2, 0x2

    move/from16 v55, v13

    move/from16 v54, v14

    int-to-long v13, v0

    mul-long v13, v13, v13

    move-wide/from16 v56, v13

    move/from16 v0, v26

    int-to-long v13, v0

    move/from16 v26, v10

    move/from16 v0, v27

    move/from16 v27, v11

    int-to-long v10, v0

    mul-long v58, v13, v10

    move-wide/from16 v60, v10

    int-to-long v10, v6

    move-wide/from16 v62, v13

    move/from16 v0, v28

    int-to-long v13, v0

    mul-long v64, v10, v13

    add-long v64, v64, v58

    int-to-long v5, v5

    move/from16 v0, v29

    move-wide/from16 v28, v10

    int-to-long v10, v0

    mul-long v58, v5, v10

    add-long v58, v58, v64

    move-wide/from16 v64, v5

    int-to-long v4, v4

    mul-long v66, v4, v4

    add-long v66, v66, v58

    move-wide/from16 v58, v4

    move/from16 v0, v40

    int-to-long v4, v0

    mul-long v4, v4, v4

    move-wide/from16 v68, v10

    int-to-long v9, v9

    move-wide/from16 v70, v13

    move/from16 v0, v34

    int-to-long v13, v0

    mul-long v72, v9, v13

    int-to-long v11, v12

    move/from16 v0, v35

    move-wide/from16 v34, v13

    int-to-long v13, v0

    mul-long v74, v11, v13

    add-long v74, v74, v72

    move-wide/from16 v72, v11

    int-to-long v11, v15

    move-wide/from16 v76, v9

    move/from16 v0, v36

    int-to-long v9, v0

    mul-long v78, v11, v9

    add-long v78, v78, v74

    move-wide/from16 v74, v11

    int-to-long v11, v8

    mul-long v80, v11, v11

    add-long v80, v80, v78

    int-to-long v6, v7

    mul-long v6, v6, v6

    move-wide/from16 v78, v11

    move/from16 v0, v47

    int-to-long v11, v0

    int-to-long v0, v1

    const-wide v82, 0xffffffffL

    and-long v0, v0, v82

    mul-long v84, v11, v0

    move-wide/from16 v86, v0

    int-to-long v0, v2

    move-wide/from16 v88, v11

    move/from16 v2, v26

    int-to-long v11, v2

    and-long v11, v11, v82

    mul-long v90, v0, v11

    add-long v90, v90, v84

    int-to-long v2, v3

    move-wide/from16 v84, v0

    move/from16 v8, v55

    int-to-long v0, v8

    and-long v0, v0, v82

    mul-long v92, v2, v0

    add-long v92, v92, v90

    move/from16 v8, v54

    move-wide/from16 v54, v2

    int-to-long v2, v8

    mul-long v90, v2, v2

    add-long v90, v90, v92

    add-long v4, v56, v4

    add-long v4, v4, v90

    sub-long v4, v4, v66

    long-to-int v8, v4

    const v15, 0xfffffff

    and-int/2addr v8, v15

    const/16 v26, 0x1c

    ushr-long v4, v4, v26

    add-long v80, v80, v6

    sub-long v80, v80, v56

    add-long v6, v80, v90

    move/from16 v36, v8

    long-to-int v8, v6

    and-int/2addr v8, v15

    ushr-long v6, v6, v26

    move/from16 v15, v46

    move-wide/from16 v46, v2

    int-to-long v2, v15

    move/from16 v15, p0

    move-wide/from16 v56, v6

    int-to-long v6, v15

    mul-long v66, v2, v6

    mul-long v80, v62, v70

    mul-long v90, v28, v68

    add-long v90, v90, v80

    move-wide/from16 v80, v2

    move/from16 v15, v30

    int-to-long v2, v15

    mul-long v92, v64, v2

    add-long v92, v92, v90

    move-wide/from16 v90, v2

    move/from16 v15, v41

    int-to-long v2, v15

    move-wide/from16 v94, v6

    move/from16 v15, v33

    int-to-long v6, v15

    mul-long v96, v2, v6

    mul-long v98, v76, v13

    mul-long v100, v72, v9

    add-long v100, v100, v98

    move-wide/from16 v98, v13

    move/from16 v15, v37

    int-to-long v13, v15

    mul-long v102, v74, v13

    add-long v102, v102, v100

    move-wide/from16 v100, v13

    move/from16 v15, v49

    int-to-long v13, v15

    move/from16 p0, v8

    move/from16 v15, v48

    move-wide/from16 v48, v9

    int-to-long v8, v15

    and-long v8, v8, v82

    mul-long v104, v13, v8

    mul-long v106, v88, v11

    mul-long v108, v84, v0

    add-long v108, v108, v106

    move-wide/from16 v106, v11

    move/from16 v10, v52

    int-to-long v10, v10

    and-long v10, v10, v82

    mul-long v110, v54, v10

    add-long v110, v110, v108

    add-long v96, v66, v96

    add-long v96, v96, v110

    sub-long v96, v96, v92

    add-long v4, v96, v4

    long-to-int v12, v4

    const v15, 0xfffffff

    and-int/2addr v12, v15

    ushr-long v4, v4, v26

    add-long v102, v102, v104

    sub-long v102, v102, v66

    add-long v102, v102, v110

    move-wide/from16 v66, v4

    add-long v4, v102, v56

    move/from16 v30, v12

    long-to-int v12, v4

    and-int/2addr v12, v15

    ushr-long v4, v4, v26

    move-wide/from16 v56, v4

    move/from16 v15, v45

    int-to-long v4, v15

    mul-long v92, v4, v94

    mul-long v80, v80, v80

    add-long v80, v80, v92

    mul-long v92, v62, v68

    mul-long v96, v28, v90

    add-long v96, v96, v92

    mul-long v92, v64, v64

    add-long v92, v92, v96

    move/from16 v15, v42

    move-wide/from16 v41, v4

    int-to-long v4, v15

    mul-long v96, v4, v6

    mul-long v2, v2, v2

    add-long v2, v2, v96

    mul-long v96, v76, v48

    mul-long v102, v72, v100

    add-long v102, v102, v96

    mul-long v96, v74, v74

    add-long v96, v96, v102

    move-wide/from16 v102, v4

    move/from16 v15, v50

    int-to-long v4, v15

    mul-long v104, v4, v8

    mul-long v13, v13, v13

    add-long v13, v13, v104

    mul-long v104, v88, v0

    mul-long v108, v84, v10

    add-long v108, v108, v104

    mul-long v104, v54, v54

    add-long v104, v104, v108

    add-long v2, v80, v2

    add-long v2, v2, v104

    sub-long v2, v2, v92

    add-long v2, v2, v66

    long-to-int v15, v2

    const v33, 0xfffffff

    and-int v15, v15, v33

    ushr-long v2, v2, v26

    add-long v96, v96, v13

    sub-long v96, v96, v80

    add-long v96, v96, v104

    add-long v13, v96, v56

    move/from16 v37, v15

    long-to-int v15, v13

    and-int v15, v15, v33

    ushr-long v13, v13, v26

    move/from16 v33, v15

    move/from16 v15, v44

    move-wide/from16 v44, v0

    int-to-long v0, v15

    mul-long v56, v0, v94

    mul-long v66, v41, v60

    add-long v66, v66, v56

    mul-long v56, v62, v90

    move-wide/from16 v80, v0

    move/from16 v15, v31

    int-to-long v0, v15

    mul-long v90, v28, v0

    add-long v90, v90, v56

    move-wide/from16 v56, v0

    move/from16 v15, v43

    int-to-long v0, v15

    mul-long v92, v0, v6

    mul-long v96, v102, v34

    add-long v96, v96, v92

    mul-long v92, v76, v100

    move-wide/from16 v100, v0

    move/from16 v15, v38

    int-to-long v0, v15

    mul-long v104, v72, v0

    add-long v104, v104, v92

    move/from16 v15, v51

    move-wide/from16 v50, v0

    int-to-long v0, v15

    mul-long v92, v0, v8

    mul-long v108, v4, v86

    add-long v108, v108, v92

    mul-long v10, v10, v88

    move/from16 v15, v53

    move-wide/from16 v52, v4

    int-to-long v4, v15

    and-long v4, v4, v82

    mul-long v92, v84, v4

    add-long v92, v92, v10

    add-long v96, v66, v96

    add-long v96, v96, v92

    sub-long v96, v96, v90

    add-long v2, v96, v2

    long-to-int v10, v2

    const v11, 0xfffffff

    and-int/2addr v10, v11

    ushr-long v2, v2, v26

    add-long v104, v104, v108

    sub-long v104, v104, v66

    add-long v104, v104, v92

    add-long v13, v104, v13

    long-to-int v15, v13

    and-int/2addr v15, v11

    ushr-long v13, v13, v26

    mul-long v66, v58, v94

    mul-long v90, v80, v60

    add-long v90, v90, v66

    mul-long v41, v41, v41

    add-long v41, v41, v90

    mul-long v56, v56, v62

    mul-long v66, v28, v28

    add-long v66, v66, v56

    mul-long v56, v78, v6

    mul-long v90, v100, v34

    add-long v90, v90, v56

    mul-long v56, v102, v102

    add-long v56, v56, v90

    mul-long v50, v50, v76

    mul-long v90, v72, v72

    add-long v90, v90, v50

    mul-long v50, v46, v8

    mul-long v92, v0, v86

    add-long v92, v92, v50

    mul-long v50, v52, v52

    add-long v50, v50, v92

    mul-long v4, v4, v88

    mul-long v52, v84, v84

    add-long v52, v52, v4

    add-long v56, v41, v56

    add-long v56, v56, v52

    sub-long v56, v56, v66

    add-long v2, v56, v2

    long-to-int v4, v2

    const v5, 0xfffffff

    and-int/2addr v4, v5

    ushr-long v2, v2, v26

    add-long v90, v90, v50

    sub-long v90, v90, v41

    add-long v90, v90, v52

    add-long v13, v90, v13

    long-to-int v11, v13

    and-int/2addr v11, v5

    ushr-long v13, v13, v26

    mul-long v41, v64, v94

    mul-long v50, v58, v60

    add-long v50, v50, v41

    mul-long v41, v80, v70

    add-long v41, v41, v50

    move/from16 v31, v4

    move/from16 v5, v32

    int-to-long v4, v5

    mul-long v4, v4, v62

    mul-long v50, v74, v6

    mul-long v52, v78, v34

    add-long v52, v52, v50

    mul-long v50, v100, v98

    add-long v50, v50, v52

    move/from16 v38, v10

    move/from16 v32, v11

    move/from16 v11, v39

    int-to-long v10, v11

    mul-long v10, v10, v76

    mul-long v52, v54, v8

    mul-long v56, v46, v86

    add-long v56, v56, v52

    mul-long v52, v0, v106

    add-long v52, v52, v56

    move-wide/from16 v56, v0

    move/from16 v39, v15

    move/from16 v15, v27

    int-to-long v0, v15

    and-long v0, v0, v82

    mul-long v0, v0, v88

    add-long v50, v41, v50

    add-long v50, v50, v0

    sub-long v50, v50, v4

    add-long v2, v50, v2

    long-to-int v4, v2

    const v5, 0xfffffff

    and-int/2addr v4, v5

    ushr-long v2, v2, v26

    add-long v10, v10, v52

    sub-long v10, v10, v41

    add-long/2addr v10, v0

    add-long/2addr v10, v13

    long-to-int v0, v10

    and-int/2addr v0, v5

    ushr-long v10, v10, v26

    mul-long v13, v28, v94

    mul-long v41, v64, v60

    add-long v41, v41, v13

    mul-long v13, v58, v70

    add-long v13, v13, v41

    mul-long v41, v80, v80

    add-long v41, v41, v13

    mul-long v13, v62, v62

    mul-long v50, v72, v6

    mul-long v52, v74, v34

    add-long v52, v52, v50

    mul-long v50, v78, v98

    add-long v50, v50, v52

    mul-long v52, v100, v100

    add-long v52, v52, v50

    mul-long v50, v76, v76

    mul-long v66, v84, v8

    mul-long v80, v54, v86

    add-long v80, v80, v66

    mul-long v66, v46, v106

    add-long v66, v66, v80

    mul-long v56, v56, v56

    add-long v56, v56, v66

    mul-long v66, v88, v88

    add-long v52, v41, v52

    add-long v52, v52, v66

    sub-long v52, v52, v13

    add-long v1, v52, v2

    long-to-int v3, v1

    const v5, 0xfffffff

    and-int/2addr v3, v5

    ushr-long v1, v1, v26

    add-long v50, v50, v56

    sub-long v50, v50, v41

    add-long v50, v50, v66

    add-long v10, v50, v10

    long-to-int v13, v10

    and-int/2addr v13, v5

    ushr-long v10, v10, v26

    mul-long v14, v62, v94

    mul-long v27, v28, v60

    add-long v27, v27, v14

    mul-long v14, v64, v70

    add-long v14, v14, v27

    mul-long v27, v68, v58

    add-long v27, v27, v14

    mul-long v5, v76, v6

    mul-long v14, v72, v34

    add-long/2addr v14, v5

    mul-long v5, v74, v98

    add-long/2addr v5, v14

    mul-long v14, v78, v48

    add-long/2addr v14, v5

    mul-long v5, v88, v8

    mul-long v7, v84, v86

    add-long/2addr v7, v5

    mul-long v5, v54, v106

    add-long/2addr v5, v7

    mul-long v7, v46, v44

    add-long/2addr v7, v5

    add-long v14, v14, v27

    add-long/2addr v14, v1

    long-to-int v1, v14

    const v2, 0xfffffff

    and-int/2addr v1, v2

    ushr-long v5, v14, v26

    sub-long v7, v7, v27

    add-long/2addr v7, v10

    long-to-int v9, v7

    and-int/2addr v9, v2

    ushr-long v7, v7, v26

    add-long/2addr v5, v7

    move/from16 v10, p0

    int-to-long v10, v10

    add-long/2addr v5, v10

    long-to-int v10, v5

    and-int/2addr v10, v2

    ushr-long v5, v5, v26

    move/from16 v11, v36

    int-to-long v14, v11

    add-long/2addr v7, v14

    long-to-int v11, v7

    and-int/2addr v2, v11

    ushr-long v7, v7, v26

    long-to-int v6, v5

    add-int/2addr v12, v6

    long-to-int v5, v7

    add-int v5, v30, v5

    const/4 v6, 0x0

    aput v2, p1, v6

    const/4 v2, 0x1

    aput v5, p1, v2

    const/4 v2, 0x2

    aput v37, p1, v2

    aput v38, p1, v17

    aput v31, p1, v19

    aput v4, p1, v21

    aput v3, p1, v23

    aput v1, p1, v25

    const/16 v1, 0x8

    aput v10, p1, v1

    const/16 v1, 0x9

    aput v12, p1, v1

    const/16 v1, 0xa

    aput v33, p1, v1

    aput v39, p1, v16

    aput v32, p1, v18

    aput v0, p1, v20

    aput v13, p1, v22

    aput v9, p1, v24

    return-void
.end method

.method public static sqrtRatioVar([I[I[I)Z
    .locals 3

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v1

    invoke-static {p0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    invoke-static {v0, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {v0, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    invoke-static {v0, p0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {v1, p0, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {v1, p1, v1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v2

    invoke-static {v1, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->powPm3d4([I[I)V

    invoke-static {v2, v0, v2}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    invoke-static {v2, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sqr([I[I)V

    invoke-static {v0, p1, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->mul([I[I[I)V

    invoke-static {p0, v0, v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sub([I[I[I)V

    invoke-static {v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->normalize([I)V

    invoke-static {v0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->isZeroVar([I)Z

    move-result p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    invoke-static {v2, p1, p2, p1}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->copy([II[II)V

    const/4 p0, 0x1

    return p0

    :cond_0
    return p1
.end method

.method public static sub([I[I[I)V
    .locals 49

    const/4 v0, 0x0

    .line 0
    aget v1, p0, v0

    const/4 v2, 0x1

    aget v3, p0, v2

    const/4 v4, 0x2

    aget v5, p0, v4

    const/4 v6, 0x3

    aget v7, p0, v6

    const/4 v8, 0x4

    aget v9, p0, v8

    const/4 v10, 0x5

    aget v11, p0, v10

    const/4 v12, 0x6

    aget v13, p0, v12

    const/4 v14, 0x7

    aget v15, p0, v14

    const/16 v16, 0x8

    aget v17, p0, v16

    const/16 v18, 0x9

    aget v19, p0, v18

    const/16 v20, 0xa

    aget v21, p0, v20

    const/16 v22, 0xb

    aget v23, p0, v22

    const/16 v24, 0xc

    aget v25, p0, v24

    const/16 v26, 0xd

    aget v27, p0, v26

    const/16 v28, 0xe

    aget v29, p0, v28

    const/16 v30, 0xf

    aget v31, p0, v30

    aget v32, p1, v0

    aget v33, p1, v2

    aget v34, p1, v4

    aget v35, p1, v6

    aget v36, p1, v8

    aget v37, p1, v10

    aget v38, p1, v12

    aget v39, p1, v14

    aget v40, p1, v16

    aget v41, p1, v18

    aget v42, p1, v20

    aget v43, p1, v22

    aget v44, p1, v24

    aget v45, p1, v26

    aget v46, p1, v28

    aget v47, p1, v30

    const v48, 0x1ffffffe

    add-int v1, v1, v48

    sub-int v1, v1, v32

    add-int v3, v3, v48

    sub-int v3, v3, v33

    add-int v5, v5, v48

    sub-int v5, v5, v34

    add-int v7, v7, v48

    sub-int v7, v7, v35

    add-int v9, v9, v48

    sub-int v9, v9, v36

    add-int v11, v11, v48

    sub-int v11, v11, v37

    add-int v13, v13, v48

    sub-int v13, v13, v38

    add-int v15, v15, v48

    sub-int v15, v15, v39

    const v32, 0x1ffffffc

    add-int v17, v17, v32

    sub-int v17, v17, v40

    add-int v19, v19, v48

    sub-int v19, v19, v41

    add-int v21, v21, v48

    sub-int v21, v21, v42

    add-int v23, v23, v48

    sub-int v23, v23, v43

    add-int v25, v25, v48

    sub-int v25, v25, v44

    add-int v27, v27, v48

    sub-int v27, v27, v45

    add-int v29, v29, v48

    sub-int v29, v29, v46

    add-int v31, v31, v48

    sub-int v31, v31, v47

    ushr-int/lit8 v32, v3, 0x1c

    add-int v5, v5, v32

    const v32, 0xfffffff

    and-int v3, v3, v32

    ushr-int/lit8 v33, v11, 0x1c

    add-int v13, v13, v33

    and-int v11, v11, v32

    ushr-int/lit8 v33, v19, 0x1c

    add-int v21, v21, v33

    and-int v19, v19, v32

    ushr-int/lit8 v33, v27, 0x1c

    add-int v29, v29, v33

    and-int v27, v27, v32

    ushr-int/lit8 v33, v5, 0x1c

    add-int v7, v7, v33

    and-int v5, v5, v32

    ushr-int/lit8 v33, v13, 0x1c

    add-int v15, v15, v33

    and-int v13, v13, v32

    ushr-int/lit8 v33, v21, 0x1c

    add-int v23, v23, v33

    and-int v21, v21, v32

    ushr-int/lit8 v33, v29, 0x1c

    add-int v31, v31, v33

    and-int v29, v29, v32

    ushr-int/lit8 v33, v31, 0x1c

    and-int v31, v31, v32

    add-int v1, v1, v33

    add-int v17, v17, v33

    ushr-int/lit8 v33, v7, 0x1c

    add-int v9, v9, v33

    and-int v7, v7, v32

    ushr-int/lit8 v33, v15, 0x1c

    add-int v17, v17, v33

    and-int v15, v15, v32

    ushr-int/lit8 v33, v23, 0x1c

    add-int v25, v25, v33

    and-int v23, v23, v32

    ushr-int/lit8 v33, v1, 0x1c

    add-int v3, v3, v33

    and-int v1, v1, v32

    ushr-int/lit8 v33, v9, 0x1c

    add-int v11, v11, v33

    and-int v9, v9, v32

    ushr-int/lit8 v33, v17, 0x1c

    add-int v19, v19, v33

    and-int v17, v17, v32

    ushr-int/lit8 v33, v25, 0x1c

    add-int v27, v27, v33

    and-int v25, v25, v32

    aput v1, p2, v0

    aput v3, p2, v2

    aput v5, p2, v4

    aput v7, p2, v6

    aput v9, p2, v8

    aput v11, p2, v10

    aput v13, p2, v12

    aput v15, p2, v14

    aput v17, p2, v16

    aput v19, p2, v18

    aput v21, p2, v20

    aput v23, p2, v22

    aput v25, p2, v24

    aput v27, p2, v26

    aput v29, p2, v28

    aput v31, p2, v30

    return-void
.end method

.method public static subOne([I)V
    .locals 3

    .line 0
    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->create()[I

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v2, v0, v1

    invoke-static {p0, v0, p0}, Lorg/bouncycastle/math/ec/rfc7748/X448Field;->sub([I[I[I)V

    return-void
.end method

.method public static zero([I)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    .line 0
    aput v0, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
