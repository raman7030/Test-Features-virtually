.class public abstract Lorg/bouncycastle/math/raw/Mont256;
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

.method public static inverse32(I)I
    .locals 2

    const/4 v0, 0x2

    .line 0
    invoke-static {p0, p0, v0, p0}, Ll/᩸ܳۡ;->֫(IIII)I

    move-result v1

    invoke-static {p0, v1, v0, v1}, Ll/᩸ܳۡ;->֫(IIII)I

    move-result v1

    invoke-static {p0, v1, v0, v1}, Ll/᩸ܳۡ;->֫(IIII)I

    move-result v1

    invoke-static {p0, v1, v0, v1}, Ll/᩸ܳۡ;->֫(IIII)I

    move-result p0

    return p0
.end method

.method public static multAdd([I[I[I[II)V
    .locals 24

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const/4 v2, 0x0

    .line 0
    aget v3, p1, v2

    int-to-long v3, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    const/16 v9, 0x8

    if-ge v7, v9, :cond_1

    aget v2, v0, v2

    int-to-long v9, v2

    and-long/2addr v9, v5

    aget v2, p0, v7

    int-to-long v11, v2

    and-long/2addr v11, v5

    mul-long v13, v11, v3

    and-long v15, v13, v5

    add-long/2addr v9, v15

    const/4 v2, 0x0

    long-to-int v15, v9

    mul-int v15, v15, p4

    move-wide/from16 v16, v3

    int-to-long v3, v15

    and-long/2addr v3, v5

    aget v2, v1, v2

    move v15, v7

    move/from16 v18, v8

    int-to-long v7, v2

    and-long/2addr v7, v5

    mul-long v7, v7, v3

    and-long v19, v7, v5

    add-long v9, v9, v19

    const/16 v2, 0x20

    ushr-long/2addr v9, v2

    ushr-long/2addr v13, v2

    add-long/2addr v9, v13

    ushr-long/2addr v7, v2

    add-long/2addr v9, v7

    const/4 v2, 0x1

    :goto_1
    const/16 v7, 0x8

    if-ge v2, v7, :cond_0

    aget v8, p1, v2

    int-to-long v13, v8

    and-long/2addr v13, v5

    mul-long v13, v13, v11

    aget v8, v1, v2

    int-to-long v7, v8

    and-long/2addr v7, v5

    mul-long v7, v7, v3

    and-long v20, v13, v5

    and-long v22, v7, v5

    add-long v20, v20, v22

    move-wide/from16 v22, v3

    aget v3, v0, v2

    int-to-long v3, v3

    and-long/2addr v3, v5

    add-long v20, v20, v3

    add-long v3, v20, v9

    add-int/lit8 v9, v2, -0x1

    const/16 v10, 0x20

    long-to-int v5, v3

    aput v5, v0, v9

    ushr-long/2addr v3, v10

    ushr-long v5, v13, v10

    add-long/2addr v3, v5

    ushr-long v5, v7, v10

    add-long v9, v3, v5

    add-int/lit8 v2, v2, 0x1

    move-wide/from16 v3, v22

    const-wide v5, 0xffffffffL

    goto :goto_1

    :cond_0
    const/16 v2, 0x20

    move/from16 v8, v18

    int-to-long v3, v8

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    add-long/2addr v9, v3

    const/4 v3, 0x7

    long-to-int v4, v9

    aput v4, v0, v3

    ushr-long v2, v9, v2

    long-to-int v8, v2

    add-int/lit8 v7, v15, 0x1

    const/4 v2, 0x0

    move-wide/from16 v3, v16

    goto :goto_0

    :cond_1
    if-nez v8, :cond_3

    invoke-static/range {p2 .. p3}, Lorg/bouncycastle/math/raw/Nat256;->gte([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_2
    invoke-static {v0, v1, v0}, Lorg/bouncycastle/math/raw/Nat256;->sub([I[I[I)I

    return-void
.end method

.method public static multAddXF([I[I[I[I)V
    .locals 25

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const/4 v2, 0x0

    .line 0
    aget v3, p1, v2

    int-to-long v3, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    const/16 v9, 0x8

    if-ge v7, v9, :cond_1

    aget v10, p0, v7

    int-to-long v10, v10

    and-long/2addr v10, v5

    mul-long v12, v10, v3

    aget v2, v0, v2

    int-to-long v14, v2

    and-long/2addr v14, v5

    add-long/2addr v12, v14

    and-long v14, v12, v5

    const/16 v2, 0x20

    ushr-long/2addr v12, v2

    add-long/2addr v12, v14

    const/16 v16, 0x1

    const/4 v2, 0x1

    :goto_1
    if-ge v2, v9, :cond_0

    aget v9, p1, v2

    move-wide/from16 v17, v3

    int-to-long v3, v9

    and-long/2addr v3, v5

    mul-long v3, v3, v10

    aget v9, v1, v2

    move-wide/from16 v19, v10

    int-to-long v9, v9

    and-long/2addr v9, v5

    mul-long v9, v9, v14

    and-long v21, v3, v5

    and-long v23, v9, v5

    add-long v21, v21, v23

    aget v11, v0, v2

    move-wide/from16 v23, v14

    int-to-long v14, v11

    and-long/2addr v14, v5

    add-long v21, v21, v14

    add-long v11, v21, v12

    add-int/lit8 v13, v2, -0x1

    long-to-int v14, v11

    aput v14, v0, v13

    const/16 v13, 0x20

    ushr-long/2addr v11, v13

    ushr-long/2addr v3, v13

    add-long/2addr v11, v3

    ushr-long v3, v9, v13

    add-long v12, v11, v3

    add-int/lit8 v2, v2, 0x1

    const/16 v9, 0x8

    move-wide/from16 v3, v17

    move-wide/from16 v10, v19

    move-wide/from16 v14, v23

    goto :goto_1

    :cond_0
    move-wide/from16 v17, v3

    int-to-long v2, v8

    and-long/2addr v2, v5

    add-long/2addr v12, v2

    const/4 v2, 0x7

    long-to-int v3, v12

    aput v3, v0, v2

    const/16 v2, 0x20

    ushr-long v2, v12, v2

    long-to-int v8, v2

    add-int/lit8 v7, v7, 0x1

    const/4 v2, 0x0

    move-wide/from16 v3, v17

    goto :goto_0

    :cond_1
    if-nez v8, :cond_3

    invoke-static/range {p2 .. p3}, Lorg/bouncycastle/math/raw/Nat256;->gte([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_2
    invoke-static {v0, v1, v0}, Lorg/bouncycastle/math/raw/Nat256;->sub([I[I[I)I

    return-void
.end method

.method public static reduce([I[II)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x8

    if-ge v3, v4, :cond_1

    .line 0
    aget v5, v0, v2

    mul-int v6, v5, p2

    int-to-long v6, v6

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    aget v2, v1, v2

    int-to-long v10, v2

    and-long/2addr v10, v8

    mul-long v10, v10, v6

    int-to-long v12, v5

    and-long/2addr v12, v8

    add-long/2addr v10, v12

    const/16 v2, 0x20

    ushr-long/2addr v10, v2

    const/4 v5, 0x1

    :goto_1
    if-ge v5, v4, :cond_0

    aget v12, v1, v5

    int-to-long v12, v12

    and-long/2addr v12, v8

    mul-long v12, v12, v6

    aget v14, v0, v5

    int-to-long v14, v14

    and-long/2addr v14, v8

    add-long/2addr v12, v14

    add-long/2addr v12, v10

    add-int/lit8 v10, v5, -0x1

    long-to-int v11, v12

    aput v11, v0, v10

    ushr-long v10, v12, v2

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x7

    long-to-int v4, v10

    aput v4, v0, v2

    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-static/range {p0 .. p1}, Lorg/bouncycastle/math/raw/Nat256;->gte([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v0, v1, v0}, Lorg/bouncycastle/math/raw/Nat256;->sub([I[I[I)I

    :cond_2
    return-void
.end method

.method public static reduceXF([I[I)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x8

    if-ge v1, v2, :cond_1

    .line 0
    aget v3, p0, v0

    int-to-long v3, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    const/4 v7, 0x1

    move-wide v8, v3

    :goto_1
    if-ge v7, v2, :cond_0

    aget v10, p1, v7

    int-to-long v10, v10

    and-long/2addr v10, v5

    mul-long v10, v10, v3

    aget v12, p0, v7

    int-to-long v12, v12

    and-long/2addr v12, v5

    add-long/2addr v10, v12

    add-long/2addr v10, v8

    add-int/lit8 v8, v7, -0x1

    long-to-int v9, v10

    aput v9, p0, v8

    const/16 v8, 0x20

    ushr-long v8, v10, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x7

    long-to-int v3, v8

    aput v3, p0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lorg/bouncycastle/math/raw/Nat256;->gte([I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, p1, p0}, Lorg/bouncycastle/math/raw/Nat256;->sub([I[I[I)I

    :cond_2
    return-void
.end method
