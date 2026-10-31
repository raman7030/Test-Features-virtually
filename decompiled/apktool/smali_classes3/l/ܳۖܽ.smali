.class public final Ll/ܳۖܽ;
.super Ljava/lang/Object;
.source "17U9"


# direct methods
.method public static ֫([Ll/ܿ۬;)V
    .locals 9

    .line 119
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_b

    aget-object v3, p0, v2

    .line 120
    invoke-virtual {v3}, Ll/ܿ۬;->ۧ()C

    move-result v4

    .line 121
    invoke-virtual {v3}, Ll/ܿ۬;->֫()[F

    move-result-object v3

    const/16 v5, 0x41

    const/high16 v6, 0x41c00000    # 24.0f

    const/high16 v7, 0x3f800000    # 1.0f

    if-eq v4, v5, :cond_9

    const/16 v5, 0x43

    if-eq v4, v5, :cond_8

    const/16 v5, 0x48

    if-eq v4, v5, :cond_7

    const/16 v5, 0x51

    if-eq v4, v5, :cond_6

    const/16 v5, 0x56

    if-eq v4, v5, :cond_a

    const/16 v5, 0x61

    if-eq v4, v5, :cond_5

    const/16 v5, 0x63

    if-eq v4, v5, :cond_4

    const/16 v5, 0x68

    if-eq v4, v5, :cond_3

    const/16 v5, 0x71

    if-eq v4, v5, :cond_2

    const/16 v5, 0x76

    if-eq v4, v5, :cond_a

    const/16 v5, 0x4c

    if-eq v4, v5, :cond_1

    const/16 v5, 0x4d

    if-eq v4, v5, :cond_1

    const/16 v5, 0x53

    if-eq v4, v5, :cond_6

    const/16 v5, 0x54

    if-eq v4, v5, :cond_1

    const/16 v5, 0x6c

    if-eq v4, v5, :cond_0

    const/16 v5, 0x6d

    if-eq v4, v5, :cond_0

    const/16 v5, 0x73

    if-eq v4, v5, :cond_2

    const/16 v5, 0x74

    if-eq v4, v5, :cond_0

    goto/16 :goto_9

    :cond_0
    const/4 v4, 0x0

    .line 376
    :goto_1
    array-length v5, v3

    if-ge v4, v5, :cond_a

    .line 378
    aget v5, v3, v4

    neg-float v5, v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x2

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 364
    :goto_2
    array-length v5, v3

    if-ge v4, v5, :cond_a

    .line 366
    aget v5, v3, v4

    sub-float v5, v6, v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 405
    :goto_3
    array-length v5, v3

    if-ge v4, v5, :cond_a

    .line 407
    aget v5, v3, v4

    neg-float v5, v5

    aput v5, v3, v4

    add-int/lit8 v5, v4, 0x2

    .line 408
    aget v6, v3, v5

    neg-float v6, v6

    aput v6, v3, v5

    add-int/lit8 v4, v4, 0x4

    goto :goto_3

    .line 171
    :cond_3
    aget v4, v3, v1

    neg-float v4, v4

    aput v4, v3, v1

    goto/16 :goto_9

    :cond_4
    const/4 v4, 0x0

    .line 438
    :goto_4
    array-length v5, v3

    if-ge v4, v5, :cond_a

    .line 440
    aget v5, v3, v4

    neg-float v5, v5

    aput v5, v3, v4

    add-int/lit8 v5, v4, 0x2

    .line 441
    aget v6, v3, v5

    neg-float v6, v6

    aput v6, v3, v5

    add-int/lit8 v5, v4, 0x4

    .line 442
    aget v6, v3, v5

    neg-float v6, v6

    aput v6, v3, v5

    add-int/lit8 v4, v4, 0x6

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    .line 476
    :goto_5
    array-length v5, v3

    if-ge v4, v5, :cond_a

    add-int/lit8 v5, v4, 0x5

    .line 478
    aget v6, v3, v5

    neg-float v6, v6

    aput v6, v3, v5

    add-int/lit8 v5, v4, 0x4

    .line 479
    aget v6, v3, v5

    sub-float v6, v7, v6

    aput v6, v3, v5

    add-int/lit8 v4, v4, 0x7

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    .line 390
    :goto_6
    array-length v5, v3

    if-ge v4, v5, :cond_a

    .line 392
    aget v5, v3, v4

    sub-float v5, v6, v5

    aput v5, v3, v4

    add-int/lit8 v5, v4, 0x2

    .line 393
    aget v7, v3, v5

    sub-float v7, v6, v7

    aput v7, v3, v5

    add-int/lit8 v4, v4, 0x4

    goto :goto_6

    .line 165
    :cond_7
    aget v4, v3, v1

    sub-float/2addr v6, v4

    aput v6, v3, v1

    goto :goto_9

    :cond_8
    const/4 v4, 0x0

    .line 421
    :goto_7
    array-length v5, v3

    if-ge v4, v5, :cond_a

    .line 423
    aget v5, v3, v4

    sub-float v5, v6, v5

    aput v5, v3, v4

    add-int/lit8 v5, v4, 0x2

    .line 424
    aget v7, v3, v5

    sub-float v7, v6, v7

    aput v7, v3, v5

    add-int/lit8 v5, v4, 0x4

    .line 425
    aget v7, v3, v5

    sub-float v7, v6, v7

    aput v7, v3, v5

    add-int/lit8 v4, v4, 0x6

    goto :goto_7

    :cond_9
    const/4 v4, 0x0

    .line 456
    :goto_8
    array-length v5, v3

    if-ge v4, v5, :cond_a

    add-int/lit8 v5, v4, 0x5

    .line 458
    aget v8, v3, v5

    sub-float v8, v6, v8

    aput v8, v3, v5

    add-int/lit8 v5, v4, 0x4

    .line 460
    aget v8, v3, v5

    sub-float v8, v7, v8

    aput v8, v3, v5

    add-int/lit8 v4, v4, 0x7

    goto :goto_8

    :cond_a
    :goto_9
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method
