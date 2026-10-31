.class public abstract Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;
.super Ljava/lang/Object;


# static fields
.field public static final M:J = 0xffffffffL


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addShifted_NP(II[I[I[I[I)V
    .locals 21

    move/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const/16 v4, 0x20

    const/4 v5, 0x0

    const-wide v6, 0xffffffffL

    const-wide/16 v8, 0x0

    if-nez v1, :cond_0

    move-wide v10, v8

    :goto_0
    if-gt v5, v0, :cond_3

    .line 0
    aget v1, v2, v5

    aget v3, p2, v5

    int-to-long v12, v3

    and-long/2addr v12, v6

    add-long/2addr v8, v12

    int-to-long v12, v1

    and-long/2addr v12, v6

    add-long/2addr v8, v12

    add-long/2addr v10, v12

    aget v1, p3, v5

    int-to-long v12, v1

    and-long/2addr v12, v6

    add-long/2addr v10, v12

    long-to-int v1, v10

    ushr-long/2addr v10, v4

    aput v1, v2, v5

    int-to-long v12, v1

    and-long/2addr v12, v6

    add-long/2addr v8, v12

    long-to-int v1, v8

    aput v1, p2, v5

    ushr-long/2addr v8, v4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    if-ge v1, v4, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    move-wide v10, v8

    const/4 v12, 0x0

    :goto_1
    if-gt v5, v0, :cond_3

    aget v13, v2, v5

    shl-int v14, v13, v1

    neg-int v15, v1

    ushr-int/2addr v3, v15

    or-int/2addr v3, v14

    aget v14, p2, v5

    move-wide/from16 v16, v10

    int-to-long v10, v14

    and-long/2addr v10, v6

    add-long/2addr v8, v10

    int-to-long v10, v3

    and-long/2addr v10, v6

    add-long/2addr v8, v10

    aget v3, p3, v5

    shl-int v10, v3, v1

    ushr-int/2addr v4, v15

    or-int/2addr v4, v10

    int-to-long v10, v13

    and-long/2addr v10, v6

    add-long v10, v16, v10

    move v14, v3

    int-to-long v3, v4

    and-long/2addr v3, v6

    add-long/2addr v10, v3

    long-to-int v3, v10

    const/16 v4, 0x20

    ushr-long/2addr v10, v4

    aput v3, v2, v5

    shl-int v16, v3, v1

    ushr-int/2addr v12, v15

    or-int v12, v12, v16

    move v15, v5

    int-to-long v4, v12

    and-long/2addr v4, v6

    add-long/2addr v8, v4

    long-to-int v4, v8

    aput v4, p2, v15

    const/16 v4, 0x20

    ushr-long/2addr v8, v4

    add-int/lit8 v5, v15, 0x1

    move v12, v3

    move v3, v13

    move v4, v14

    goto :goto_1

    :cond_1
    const/16 v4, 0x20

    invoke-static {v2, v5, v3, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    ushr-int/lit8 v10, v1, 0x5

    and-int/lit8 v1, v1, 0x1f

    if-nez v1, :cond_2

    move-wide v11, v8

    move v1, v10

    :goto_2
    if-gt v1, v0, :cond_3

    aget v5, p2, v1

    int-to-long v13, v5

    and-long/2addr v13, v6

    add-long/2addr v8, v13

    sub-int v5, v1, v10

    aget v13, v3, v5

    int-to-long v13, v13

    and-long/2addr v13, v6

    add-long/2addr v8, v13

    aget v13, v2, v1

    int-to-long v13, v13

    and-long/2addr v13, v6

    add-long/2addr v11, v13

    aget v13, p3, v5

    int-to-long v13, v13

    and-long/2addr v13, v6

    add-long/2addr v11, v13

    long-to-int v13, v11

    aput v13, v2, v1

    ushr-long/2addr v11, v4

    aget v5, v2, v5

    int-to-long v13, v5

    and-long/2addr v13, v6

    add-long/2addr v8, v13

    long-to-int v5, v8

    aput v5, p2, v1

    ushr-long/2addr v8, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide v11, v8

    move v15, v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_3
    if-gt v15, v0, :cond_3

    sub-int v16, v15, v10

    aget v17, v3, v16

    shl-int v18, v17, v1

    neg-int v4, v1

    ushr-int/2addr v5, v4

    or-int v5, v5, v18

    aget v0, p2, v15

    move/from16 v18, v10

    move-wide/from16 v19, v11

    int-to-long v10, v0

    and-long/2addr v10, v6

    add-long/2addr v8, v10

    int-to-long v10, v5

    and-long/2addr v10, v6

    add-long/2addr v8, v10

    aget v11, p3, v16

    shl-int v0, v11, v1

    ushr-int v5, v13, v4

    or-int/2addr v0, v5

    aget v5, v2, v15

    int-to-long v12, v5

    and-long/2addr v12, v6

    add-long v12, v19, v12

    move/from16 p1, v11

    int-to-long v10, v0

    and-long/2addr v10, v6

    add-long/2addr v12, v10

    long-to-int v0, v12

    aput v0, v2, v15

    const/16 v0, 0x20

    ushr-long v11, v12, v0

    aget v5, v2, v16

    shl-int v10, v5, v1

    ushr-int v4, v14, v4

    or-int/2addr v4, v10

    int-to-long v13, v4

    and-long/2addr v13, v6

    add-long/2addr v8, v13

    long-to-int v4, v8

    aput v4, p2, v15

    ushr-long/2addr v8, v0

    add-int/lit8 v15, v15, 0x1

    move/from16 v0, p0

    move/from16 v13, p1

    move v14, v5

    move/from16 v5, v17

    move/from16 v10, v18

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    return-void
.end method

.method public static addShifted_UV(II[I[I[I[I)V
    .locals 16

    move/from16 v0, p0

    ushr-int/lit8 v1, p1, 0x5

    and-int/lit8 v2, p1, 0x1f

    const/16 v3, 0x20

    const-wide v4, 0xffffffffL

    const-wide/16 v6, 0x0

    if-nez v2, :cond_0

    move v2, v1

    move-wide v8, v6

    :goto_0
    if-gt v2, v0, :cond_1

    .line 0
    aget v10, p2, v2

    int-to-long v10, v10

    and-long/2addr v10, v4

    add-long/2addr v6, v10

    aget v10, p3, v2

    int-to-long v10, v10

    and-long/2addr v10, v4

    add-long/2addr v8, v10

    sub-int v10, v2, v1

    aget v11, p4, v10

    int-to-long v11, v11

    and-long/2addr v11, v4

    add-long/2addr v6, v11

    aget v10, p5, v10

    int-to-long v10, v10

    and-long/2addr v10, v4

    add-long/2addr v8, v10

    long-to-int v10, v6

    aput v10, p2, v2

    ushr-long/2addr v6, v3

    long-to-int v10, v8

    aput v10, p3, v2

    ushr-long/2addr v8, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v8, 0x0

    move v11, v1

    move-wide v8, v6

    const/4 v10, 0x0

    :goto_1
    if-gt v11, v0, :cond_1

    sub-int v12, v11, v1

    aget v13, p4, v12

    aget v12, p5, v12

    shl-int v14, v13, v2

    neg-int v15, v2

    ushr-int/2addr v3, v15

    or-int/2addr v3, v14

    shl-int v14, v12, v2

    ushr-int/2addr v10, v15

    or-int/2addr v10, v14

    aget v14, p2, v11

    int-to-long v14, v14

    and-long/2addr v14, v4

    add-long/2addr v6, v14

    aget v14, p3, v11

    int-to-long v14, v14

    and-long/2addr v14, v4

    add-long/2addr v8, v14

    int-to-long v14, v3

    and-long/2addr v14, v4

    add-long/2addr v6, v14

    int-to-long v14, v10

    and-long/2addr v14, v4

    add-long/2addr v8, v14

    long-to-int v3, v6

    aput v3, p2, v11

    const/16 v3, 0x20

    ushr-long/2addr v6, v3

    long-to-int v10, v8

    aput v10, p3, v11

    ushr-long/2addr v8, v3

    add-int/lit8 v11, v11, 0x1

    move v10, v12

    move v3, v13

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static getBitLength(I[I)I
    .locals 2

    .line 0
    aget v0, p1, p0

    shr-int/lit8 v0, v0, 0x1f

    :goto_0
    if-lez p0, :cond_0

    aget v1, p1, p0

    if-ne v1, v0, :cond_0

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, p0, 0x20

    add-int/lit8 v1, v1, 0x20

    aget p0, p1, p0

    xor-int/2addr p0, v0

    invoke-static {p0}, Lorg/bouncycastle/util/Integers;->numberOfLeadingZeros(I)I

    move-result p0

    sub-int/2addr v1, p0

    return v1
.end method

.method public static getBitLengthPositive(I[I)I
    .locals 1

    :goto_0
    if-lez p0, :cond_0

    .line 0
    aget v0, p1, p0

    if-nez v0, :cond_0

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, p0, 0x20

    add-int/lit8 v0, v0, 0x20

    aget p0, p1, p0

    invoke-static {p0}, Lorg/bouncycastle/util/Integers;->numberOfLeadingZeros(I)I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method public static lessThan(I[I[I)Z
    .locals 3

    .line 0
    :cond_0
    aget v0, p1, p0

    const/high16 v1, -0x80000000

    add-int/2addr v0, v1

    aget v2, p2, p0

    add-int/2addr v2, v1

    if-ge v0, v2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 v1, 0x0

    if-le v0, v2, :cond_2

    return v1

    :cond_2
    add-int/lit8 p0, p0, -0x1

    if-gez p0, :cond_0

    return v1
.end method

.method public static subShifted_NP(II[I[I[I[I)V
    .locals 21

    move/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const/16 v4, 0x20

    const/4 v5, 0x0

    const-wide v6, 0xffffffffL

    const-wide/16 v8, 0x0

    if-nez v1, :cond_0

    move-wide v10, v8

    :goto_0
    if-gt v5, v0, :cond_3

    .line 0
    aget v1, v2, v5

    aget v3, p2, v5

    int-to-long v12, v3

    and-long/2addr v12, v6

    add-long/2addr v8, v12

    int-to-long v12, v1

    and-long/2addr v12, v6

    sub-long/2addr v8, v12

    add-long/2addr v10, v12

    aget v1, p3, v5

    int-to-long v12, v1

    and-long/2addr v12, v6

    sub-long/2addr v10, v12

    long-to-int v1, v10

    shr-long/2addr v10, v4

    aput v1, v2, v5

    int-to-long v12, v1

    and-long/2addr v12, v6

    sub-long/2addr v8, v12

    long-to-int v1, v8

    aput v1, p2, v5

    shr-long/2addr v8, v4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    if-ge v1, v4, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    move-wide v10, v8

    const/4 v12, 0x0

    :goto_1
    if-gt v5, v0, :cond_3

    aget v13, v2, v5

    shl-int v14, v13, v1

    neg-int v15, v1

    ushr-int/2addr v3, v15

    or-int/2addr v3, v14

    aget v14, p2, v5

    move-wide/from16 v16, v10

    int-to-long v10, v14

    and-long/2addr v10, v6

    add-long/2addr v8, v10

    int-to-long v10, v3

    and-long/2addr v10, v6

    sub-long/2addr v8, v10

    aget v3, p3, v5

    shl-int v10, v3, v1

    ushr-int/2addr v4, v15

    or-int/2addr v4, v10

    int-to-long v10, v13

    and-long/2addr v10, v6

    add-long v10, v16, v10

    move v14, v3

    int-to-long v3, v4

    and-long/2addr v3, v6

    sub-long/2addr v10, v3

    long-to-int v3, v10

    const/16 v4, 0x20

    shr-long/2addr v10, v4

    aput v3, v2, v5

    shl-int v16, v3, v1

    ushr-int/2addr v12, v15

    or-int v12, v12, v16

    move v15, v5

    int-to-long v4, v12

    and-long/2addr v4, v6

    sub-long/2addr v8, v4

    long-to-int v4, v8

    aput v4, p2, v15

    const/16 v4, 0x20

    shr-long/2addr v8, v4

    add-int/lit8 v5, v15, 0x1

    move v12, v3

    move v3, v13

    move v4, v14

    goto :goto_1

    :cond_1
    const/16 v4, 0x20

    invoke-static {v2, v5, v3, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    ushr-int/lit8 v10, v1, 0x5

    and-int/lit8 v1, v1, 0x1f

    if-nez v1, :cond_2

    move-wide v11, v8

    move v1, v10

    :goto_2
    if-gt v1, v0, :cond_3

    aget v5, p2, v1

    int-to-long v13, v5

    and-long/2addr v13, v6

    add-long/2addr v8, v13

    sub-int v5, v1, v10

    aget v13, v3, v5

    int-to-long v13, v13

    and-long/2addr v13, v6

    sub-long/2addr v8, v13

    aget v13, v2, v1

    int-to-long v13, v13

    and-long/2addr v13, v6

    add-long/2addr v11, v13

    aget v13, p3, v5

    int-to-long v13, v13

    and-long/2addr v13, v6

    sub-long/2addr v11, v13

    long-to-int v13, v11

    aput v13, v2, v1

    shr-long/2addr v11, v4

    aget v5, v2, v5

    int-to-long v13, v5

    and-long/2addr v13, v6

    sub-long/2addr v8, v13

    long-to-int v5, v8

    aput v5, p2, v1

    shr-long/2addr v8, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide v11, v8

    move v15, v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_3
    if-gt v15, v0, :cond_3

    sub-int v16, v15, v10

    aget v17, v3, v16

    shl-int v18, v17, v1

    neg-int v4, v1

    ushr-int/2addr v5, v4

    or-int v5, v5, v18

    aget v0, p2, v15

    move/from16 v18, v10

    move-wide/from16 v19, v11

    int-to-long v10, v0

    and-long/2addr v10, v6

    add-long/2addr v8, v10

    int-to-long v10, v5

    and-long/2addr v10, v6

    sub-long/2addr v8, v10

    aget v11, p3, v16

    shl-int v0, v11, v1

    ushr-int v5, v13, v4

    or-int/2addr v0, v5

    aget v5, v2, v15

    int-to-long v12, v5

    and-long/2addr v12, v6

    add-long v12, v19, v12

    move/from16 p1, v11

    int-to-long v10, v0

    and-long/2addr v10, v6

    sub-long/2addr v12, v10

    long-to-int v0, v12

    aput v0, v2, v15

    const/16 v0, 0x20

    shr-long v11, v12, v0

    aget v5, v2, v16

    shl-int v10, v5, v1

    ushr-int v4, v14, v4

    or-int/2addr v4, v10

    int-to-long v13, v4

    and-long/2addr v13, v6

    sub-long/2addr v8, v13

    long-to-int v4, v8

    aput v4, p2, v15

    shr-long/2addr v8, v0

    add-int/lit8 v15, v15, 0x1

    move/from16 v0, p0

    move/from16 v13, p1

    move v14, v5

    move/from16 v5, v17

    move/from16 v10, v18

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    return-void
.end method

.method public static subShifted_UV(II[I[I[I[I)V
    .locals 16

    move/from16 v0, p0

    ushr-int/lit8 v1, p1, 0x5

    and-int/lit8 v2, p1, 0x1f

    const/16 v3, 0x20

    const-wide v4, 0xffffffffL

    const-wide/16 v6, 0x0

    if-nez v2, :cond_0

    move v2, v1

    move-wide v8, v6

    :goto_0
    if-gt v2, v0, :cond_1

    .line 0
    aget v10, p2, v2

    int-to-long v10, v10

    and-long/2addr v10, v4

    add-long/2addr v6, v10

    aget v10, p3, v2

    int-to-long v10, v10

    and-long/2addr v10, v4

    add-long/2addr v8, v10

    sub-int v10, v2, v1

    aget v11, p4, v10

    int-to-long v11, v11

    and-long/2addr v11, v4

    sub-long/2addr v6, v11

    aget v10, p5, v10

    int-to-long v10, v10

    and-long/2addr v10, v4

    sub-long/2addr v8, v10

    long-to-int v10, v6

    aput v10, p2, v2

    shr-long/2addr v6, v3

    long-to-int v10, v8

    aput v10, p3, v2

    shr-long/2addr v8, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v8, 0x0

    move v11, v1

    move-wide v8, v6

    const/4 v10, 0x0

    :goto_1
    if-gt v11, v0, :cond_1

    sub-int v12, v11, v1

    aget v13, p4, v12

    aget v12, p5, v12

    shl-int v14, v13, v2

    neg-int v15, v2

    ushr-int/2addr v3, v15

    or-int/2addr v3, v14

    shl-int v14, v12, v2

    ushr-int/2addr v10, v15

    or-int/2addr v10, v14

    aget v14, p2, v11

    int-to-long v14, v14

    and-long/2addr v14, v4

    add-long/2addr v6, v14

    aget v14, p3, v11

    int-to-long v14, v14

    and-long/2addr v14, v4

    add-long/2addr v8, v14

    int-to-long v14, v3

    and-long/2addr v14, v4

    sub-long/2addr v6, v14

    int-to-long v14, v10

    and-long/2addr v14, v4

    sub-long/2addr v8, v14

    long-to-int v3, v6

    aput v3, p2, v11

    const/16 v3, 0x20

    shr-long/2addr v6, v3

    long-to-int v10, v8

    aput v10, p3, v11

    shr-long/2addr v8, v3

    add-int/lit8 v11, v11, 0x1

    move v10, v12

    move v3, v13

    goto :goto_1

    :cond_1
    return-void
.end method
