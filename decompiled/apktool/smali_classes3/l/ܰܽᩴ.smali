.class public final Ll/ܰܽᩴ;
.super Ljava/lang/Object;
.source "8G0"


# static fields
.field public static final ֫:[F

.field public static final ۧ:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [F

    .line 105
    sput-object v1, Ll/ܰܽᩴ;->ۧ:[F

    new-array v0, v0, [F

    .line 113
    sput-object v0, Ll/ܰܽᩴ;->֫:[F

    return-void
.end method

.method public static ֫(II[F[F)V
    .locals 6

    sub-int v0, p1, p0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    move p3, p0

    :goto_0
    add-int/lit8 v0, p3, 0x1

    if-ge v0, p1, :cond_7

    .line 646
    aget v1, p2, v0

    .line 648
    aget p3, p2, p3

    move v2, v0

    :goto_1
    invoke-static {v1, p3}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-gez v3, :cond_1

    .line 649
    aput p3, p2, v2

    add-int/lit8 p3, v2, -0x1

    if-ne p0, p3, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_0
    add-int/lit8 p3, v2, -0x1

    add-int/lit8 v2, v2, -0x2

    .line 648
    aget v2, p2, v2

    move v5, v2

    move v2, p3

    move p3, v5

    goto :goto_1

    .line 655
    :cond_1
    :goto_2
    aput v1, p2, v2

    move p3, v0

    goto :goto_0

    :cond_2
    if-nez p3, :cond_3

    .line 1445
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p3

    :cond_3
    add-int v1, p0, p1

    ushr-int/lit8 v1, v1, 0x1

    .line 1448
    invoke-static {p0, v1, p3, p2}, Ll/ܰܽᩴ;->֫(II[F[F)V

    .line 1449
    invoke-static {v1, p1, p3, p2}, Ll/ܰܽᩴ;->֫(II[F[F)V

    add-int/lit8 v2, v1, -0x1

    .line 1452
    aget v2, p3, v2

    aget v3, p3, v1

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-gtz v2, :cond_4

    .line 1453
    invoke-static {p3, p0, p2, p0, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_4
    move v0, p0

    move v2, v1

    :goto_3
    if-ge p0, p1, :cond_7

    if-ge v2, p1, :cond_6

    if-ge v0, v1, :cond_5

    .line 1458
    aget v3, p3, v0

    aget v4, p3, v2

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 1459
    aget v2, p3, v2

    aput v2, p2, p0

    move v2, v3

    goto :goto_5

    :cond_6
    :goto_4
    add-int/lit8 v3, v0, 0x1

    .line 1458
    aget v0, p3, v0

    aput v0, p2, p0

    move v0, v3

    :goto_5
    add-int/lit8 p0, p0, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public static ֫([FIILl/ۜᩳᩴ;[F)V
    .locals 6

    sub-int v0, p2, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    move p4, p1

    :goto_0
    add-int/lit8 v0, p4, 0x1

    if-ge v0, p2, :cond_7

    .line 428
    aget v1, p0, v0

    .line 430
    aget p4, p0, p4

    move v2, v0

    :goto_1
    invoke-interface {p3, v1, p4}, Ll/ۜᩳᩴ;->֫(FF)I

    move-result v3

    if-gez v3, :cond_1

    .line 431
    aput p4, p0, v2

    add-int/lit8 p4, v2, -0x1

    if-ne p1, p4, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_0
    add-int/lit8 p4, v2, -0x1

    add-int/lit8 v2, v2, -0x2

    .line 430
    aget v2, p0, v2

    move v5, v2

    move v2, p4

    move p4, v5

    goto :goto_1

    .line 437
    :cond_1
    :goto_2
    aput v1, p0, v2

    move p4, v0

    goto :goto_0

    :cond_2
    if-nez p4, :cond_3

    .line 1514
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p4

    :cond_3
    add-int v1, p1, p2

    ushr-int/lit8 v1, v1, 0x1

    .line 1517
    invoke-static {p4, p1, v1, p3, p0}, Ll/ܰܽᩴ;->֫([FIILl/ۜᩳᩴ;[F)V

    .line 1518
    invoke-static {p4, v1, p2, p3, p0}, Ll/ܰܽᩴ;->֫([FIILl/ۜᩳᩴ;[F)V

    add-int/lit8 v2, v1, -0x1

    .line 1521
    aget v2, p4, v2

    aget v3, p4, v1

    invoke-interface {p3, v2, v3}, Ll/ۜᩳᩴ;->֫(FF)I

    move-result v2

    if-gtz v2, :cond_4

    .line 1522
    invoke-static {p4, p1, p0, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_4
    move v0, p1

    move v2, v1

    :goto_3
    if-ge p1, p2, :cond_7

    if-ge v2, p2, :cond_6

    if-ge v0, v1, :cond_5

    .line 1527
    aget v3, p4, v0

    aget v4, p4, v2

    invoke-interface {p3, v3, v4}, Ll/ۜᩳᩴ;->֫(FF)I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 1528
    aget v2, p4, v2

    aput v2, p0, p1

    move v2, v3

    goto :goto_5

    :cond_6
    :goto_4
    add-int/lit8 v3, v0, 0x1

    .line 1527
    aget v0, p4, v0

    aput v0, p0, p1

    move v0, v3

    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method
