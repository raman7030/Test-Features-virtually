.class public final Ll/᩺ۖܿ;
.super Ljava/lang/Object;
.source "I6ZU"


# static fields
.field public static final ۧ:Ll/᩺ۖܿ;


# instance fields
.field public final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 305
    new-instance v1, Ll/᩺ۖܿ;

    invoke-direct {v1, v0}, Ll/᩺ۖܿ;-><init>([I)V

    sput-object v1, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    return-void
.end method

.method public constructor <init>([I)V
    .locals 0

    .line 310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 311
    iput-object p1, p0, Ll/᩺ۖܿ;->֫:[I

    return-void
.end method

.method public static ֫(III[I)I
    .locals 3

    if-lt p1, p2, :cond_0

    return p0

    :cond_0
    const/4 v0, 0x2

    if-lt p0, v0, :cond_1

    add-int/lit8 v1, p0, -0x1

    .line 499
    aget v2, p3, v1

    if-gt p1, v2, :cond_1

    .line 500
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    aput p1, p3, v1

    return p0

    .line 503
    :cond_1
    aput p1, p3, p0

    add-int/lit8 p1, p0, 0x1

    .line 504
    aput p2, p3, p1

    add-int/2addr p0, v0

    return p0
.end method

.method private ֫(II)Ll/᩺ۖܿ;
    .locals 7

    if-ltz p1, :cond_5

    if-ge p1, p2, :cond_5

    .line 442
    iget-object v0, p0, Ll/᩺ۖܿ;->֫:[I

    array-length v1, v0

    add-int/lit8 v1, v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 445
    :goto_0
    array-length v5, v0

    if-ge v2, v5, :cond_3

    .line 446
    aget v5, v0, v2

    add-int/lit8 v6, v2, 0x1

    .line 447
    aget v6, v0, v6

    if-ge v6, p1, :cond_0

    .line 449
    invoke-static {v4, v5, v6, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v4

    goto :goto_1

    :cond_0
    if-ge p2, v5, :cond_2

    if-nez v3, :cond_1

    .line 452
    invoke-static {v4, p1, p2, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v4

    const/4 v3, 0x1

    .line 455
    :cond_1
    invoke-static {v4, v5, v6, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v4

    goto :goto_1

    .line 457
    :cond_2
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 458
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    move-result p2

    :goto_1
    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_3
    if-nez v3, :cond_4

    .line 462
    invoke-static {v4, p1, p2, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v4

    .line 464
    :cond_4
    invoke-static {v4, v1}, Ll/᩺ۖܿ;->֫(I[I)Ll/᩺ۖܿ;

    move-result-object p1

    return-object p1

    :cond_5
    return-object p0
.end method

.method public static ֫(I[I)Ll/᩺ۖܿ;
    .locals 9

    if-nez p0, :cond_0

    .line 472
    sget-object p0, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    return-object p0

    :cond_0
    :goto_0
    const/16 v0, 0x40

    if-le p0, v0, :cond_3

    const/4 v0, 0x2

    .line 477
    aget v1, p1, v0

    int-to-long v1, v1

    const/4 v3, 0x1

    aget v3, p1, v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    const/4 v3, 0x4

    const/4 v4, 0x2

    :goto_1
    if-ge v3, p0, :cond_2

    .line 479
    aget v5, p1, v3

    int-to-long v5, v5

    add-int/lit8 v7, v3, -0x1

    aget v7, p1, v7

    int-to-long v7, v7

    sub-long/2addr v5, v7

    cmp-long v7, v5, v1

    if-gez v7, :cond_1

    move v4, v3

    move-wide v1, v5

    :cond_1
    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v4, -0x1

    add-int/lit8 v2, v4, 0x1

    .line 485
    aget v2, p1, v2

    aput v2, p1, v1

    add-int/lit8 v1, v4, 0x2

    sub-int v2, p0, v4

    sub-int/2addr v2, v0

    .line 486
    invoke-static {p1, v1, p1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p0, p0, -0x2

    goto :goto_0

    .line 490
    :cond_3
    new-instance v0, Ll/᩺ۖܿ;

    array-length v1, p1

    if-ne p0, v1, :cond_4

    goto :goto_2

    .line 491
    :cond_4
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    :goto_2
    invoke-direct {v0, p1}, Ll/᩺ۖܿ;-><init>([I)V

    return-object v0
.end method

.method public static ֫(Ll/᩺ۖܿ;II)Ll/᩺ۖܿ;
    .locals 1

    const-string v0, "old"

    .line 322
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Ll/᩺ۖܿ;->֫(II)Ll/᩺ۖܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(IIII)Ll/᩺ۖܿ;
    .locals 1

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    .line 434
    new-instance v0, Ll/᩺ۖܿ;

    filled-new-array {p0, p1}, [I

    move-result-object p0

    invoke-direct {v0, p0}, Ll/᩺ۖܿ;-><init>([I)V

    goto :goto_0

    .line 316
    :cond_0
    sget-object v0, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    .line 317
    :goto_0
    invoke-direct {v0, p2, p3}, Ll/᩺ۖܿ;->֫(II)Ll/᩺ۖܿ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(I)Ll/ܳۖܿ;
    .locals 2

    .line 422
    invoke-virtual {p0}, Ll/᩺ۖܿ;->ܽ()I

    move-result v0

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    mul-int/lit8 p1, p1, 0x2

    .line 424
    iget-object v0, p0, Ll/᩺ۖܿ;->֫:[I

    aget v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    .line 515
    new-instance v0, Ll/ܳۖܿ;

    invoke-direct {v0, v1, p1}, Ll/ܳۖܿ;-><init>(II)V

    return-object v0
.end method

.method public final ֫(IIII)Ll/᩺ۖܿ;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    if-ltz v2, :cond_10

    if-ltz v3, :cond_10

    if-ltz v4, :cond_10

    int-to-long v5, v2

    int-to-long v7, v3

    add-long/2addr v5, v7

    int-to-long v9, v1

    cmp-long v11, v5, v9

    if-gtz v11, :cond_10

    .line 366
    iget-object v9, v0, Ll/᩺ۖܿ;->֫:[I

    array-length v10, v9

    if-eqz v10, :cond_1

    array-length v10, v9

    add-int/lit8 v10, v10, -0x1

    aget v10, v9, v10

    if-gt v10, v1, :cond_0

    goto :goto_0

    .line 367
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Syntax dirty range exceeds old text"

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 369
    :cond_1
    :goto_0
    array-length v1, v9

    if-eqz v1, :cond_f

    if-nez v3, :cond_2

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    int-to-long v3, v4

    sub-long/2addr v3, v7

    .line 375
    array-length v1, v9

    int-to-long v7, v1

    const/4 v1, 0x2

    int-to-long v10, v1

    add-long/2addr v7, v10

    long-to-int v1, v7

    int-to-long v10, v1

    cmp-long v12, v7, v10

    if-nez v12, :cond_e

    new-array v1, v1, [I

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 377
    :goto_1
    array-length v10, v9

    if-ge v7, v10, :cond_c

    .line 378
    aget v10, v9, v7

    add-int/lit8 v11, v7, 0x1

    .line 379
    aget v11, v9, v11

    if-gt v11, v2, :cond_3

    .line 381
    invoke-static {v8, v10, v11, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v8

    goto :goto_2

    :cond_3
    int-to-long v12, v10

    cmp-long v14, v12, v5

    if-ltz v14, :cond_6

    add-long/2addr v12, v3

    long-to-int v10, v12

    int-to-long v14, v10

    cmp-long v16, v12, v14

    if-nez v16, :cond_5

    int-to-long v11, v11

    add-long/2addr v11, v3

    long-to-int v13, v11

    int-to-long v14, v13

    cmp-long v16, v11, v14

    if-nez v16, :cond_4

    .line 383
    invoke-static {v8, v10, v13, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v8

    goto :goto_2

    .line 0
    :cond_4
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_5
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_6
    if-ge v10, v2, :cond_7

    .line 387
    invoke-static {v11, v2}, Ljava/lang/Math;->min(II)I

    move-result v12

    invoke-static {v8, v10, v12, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v8

    :cond_7
    long-to-int v12, v5

    int-to-long v13, v12

    cmp-long v15, v5, v13

    if-nez v15, :cond_b

    .line 389
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    if-ge v10, v11, :cond_a

    int-to-long v12, v10

    add-long/2addr v12, v3

    long-to-int v10, v12

    int-to-long v14, v10

    cmp-long v16, v12, v14

    if-nez v16, :cond_9

    int-to-long v11, v11

    add-long/2addr v11, v3

    long-to-int v13, v11

    int-to-long v14, v13

    cmp-long v16, v11, v14

    if-nez v16, :cond_8

    .line 391
    invoke-static {v8, v10, v13, v1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v8

    goto :goto_2

    .line 0
    :cond_8
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_9
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_a
    :goto_2
    add-int/lit8 v7, v7, 0x2

    goto :goto_1

    :cond_b
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_c
    if-nez v8, :cond_d

    .line 398
    sget-object v1, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    return-object v1

    .line 400
    :cond_d
    invoke-static {v8, v1}, Ll/᩺ۖܿ;->֫(I[I)Ll/᩺ۖܿ;

    move-result-object v1

    return-object v1

    .line 0
    :cond_e
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_f
    :goto_3
    return-object v0

    .line 364
    :cond_10
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Invalid syntax dirty-range edit"

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ll/᩺ۖܿ;)Ll/᩺ۖܿ;
    .locals 9

    const-string v0, "other"

    .line 327
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p1, Ll/᩺ۖܿ;->֫:[I

    .line 328
    iget-object v1, p0, Ll/᩺ۖܿ;->֫:[I

    array-length v2, v1

    if-nez v2, :cond_0

    return-object p1

    .line 331
    :cond_0
    array-length p1, v0

    if-nez p1, :cond_1

    return-object p0

    .line 334
    :cond_1
    array-length p1, v1

    array-length v2, v0

    int-to-long v3, p1

    int-to-long v5, v2

    add-long/2addr v3, v5

    long-to-int p1, v3

    int-to-long v5, p1

    cmp-long v2, v3, v5

    if-nez v2, :cond_6

    new-array p1, p1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 338
    :goto_0
    array-length v5, v1

    if-lt v2, v5, :cond_3

    array-length v5, v0

    if-ge v3, v5, :cond_2

    goto :goto_1

    .line 353
    :cond_2
    invoke-static {v4, p1}, Ll/᩺ۖܿ;->֫(I[I)Ll/᩺ۖܿ;

    move-result-object p1

    return-object p1

    .line 341
    :cond_3
    :goto_1
    array-length v5, v0

    if-ge v3, v5, :cond_5

    array-length v5, v1

    if-ge v2, v5, :cond_4

    aget v5, v1, v2

    aget v6, v0, v3

    if-gt v5, v6, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v3, 0x2

    move-object v6, v0

    move v8, v5

    move v5, v2

    move v2, v3

    move v3, v8

    goto :goto_3

    :cond_5
    :goto_2
    add-int/lit8 v5, v2, 0x2

    move-object v6, v1

    .line 351
    :goto_3
    aget v7, v6, v2

    add-int/lit8 v2, v2, 0x1

    aget v2, v6, v2

    invoke-static {v4, v7, v2, p1}, Ll/᩺ۖܿ;->֫(III[I)I

    move-result v4

    move v2, v5

    goto :goto_0

    .line 0
    :cond_6
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ֫()[I
    .locals 1

    .line 429
    iget-object v0, p0, Ll/᩺ۖܿ;->֫:[I

    return-object v0
.end method

.method public final ۧ()Ll/ܳۖܿ;
    .locals 1

    .line 406
    iget-object v0, p0, Ll/᩺ۖܿ;->֫:[I

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/᩺ۖܿ;->֫(I)Ll/ܳۖܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 417
    iget-object v0, p0, Ll/᩺ۖܿ;->֫:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method
