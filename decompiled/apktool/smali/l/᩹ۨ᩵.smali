.class public final Ll/᩹ۨ᩵;
.super Ljava/lang/Object;
.source "N8CI"


# instance fields
.field public final ֫:[S

.field public final ۧ:[I

.field public ܽ:I

.field public final synthetic ᩳ:Ll/᩶ۨ᩵;


# direct methods
.method public constructor <init>(Ll/᩶ۨ᩵;)V
    .locals 1

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۨ᩵;->ᩳ:Ll/᩶ۨ᩵;

    const/4 p1, 0x0

    .line 338
    iput p1, p0, Ll/᩹ۨ᩵;->ܽ:I

    const p1, 0x8000

    new-array p1, p1, [I

    .line 339
    iput-object p1, p0, Ll/᩹ۨ᩵;->ۧ:[I

    const/4 v0, -0x1

    .line 340
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([II)V

    const/high16 p1, 0x10000

    new-array p1, p1, [S

    .line 341
    iput-object p1, p0, Ll/᩹ۨ᩵;->֫:[S

    return-void
.end method


# virtual methods
.method public final ֫(I[B)V
    .locals 6

    .line 385
    :goto_0
    iget v0, p0, Ll/᩹ۨ᩵;->ܽ:I

    if-ge v0, p1, :cond_1

    .line 364
    invoke-static {v0, p2}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v1

    const v2, -0x61c8864f

    mul-int v1, v1, v2

    ushr-int/lit8 v1, v1, 0x11

    .line 375
    iget-object v2, p0, Ll/᩹ۨ᩵;->ۧ:[I

    aget v3, v2, v1

    sub-int v3, v0, v3

    const/high16 v4, 0x10000

    const v5, 0xffff

    if-lt v3, v4, :cond_0

    const v3, 0xffff

    :cond_0
    and-int v4, v0, v5

    int-to-short v3, v3

    .line 380
    iget-object v5, p0, Ll/᩹ۨ᩵;->֫:[S

    aput-short v3, v5, v4

    .line 381
    aput v0, v2, v1

    .line 385
    iget v0, p0, Ll/᩹ۨ᩵;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩹ۨ᩵;->ܽ:I

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫([BIIIILl/۫ۨ᩵;)Z
    .locals 7

    .line 449
    iput p5, p6, Ll/۫ۨ᩵;->֫:I

    .line 451
    invoke-virtual {p0, p2, p1}, Ll/᩹ۨ᩵;->֫(I[B)V

    .line 345
    invoke-static {p2, p1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v0

    const v1, -0x61c8864f

    mul-int v0, v0, v1

    ushr-int/lit8 v0, v0, 0x11

    .line 356
    iget-object v1, p0, Ll/᩹ۨ᩵;->ۧ:[I

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 455
    :goto_0
    iget-object v3, p0, Ll/᩹ۨ᩵;->ᩳ:Ll/᩶ۨ᩵;

    invoke-static {v3}, Ll/᩶ۨ᩵;->֫(Ll/᩶ۨ᩵;)I

    move-result v3

    if-ge v2, v3, :cond_2

    const v3, 0xffff

    sub-int v4, p2, v3

    .line 456
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-lt v0, v4, :cond_2

    if-le v0, p2, :cond_0

    goto :goto_1

    .line 459
    :cond_0
    invoke-static {v0, p2, p1}, Ll/۬ۨ᩵;->֫(II[B)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v4, v0, 0x4

    add-int/lit8 v5, p2, 0x4

    .line 460
    invoke-static {v4, p1, v5, p4}, Ll/۬ۨ᩵;->֫(I[BII)I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    .line 461
    invoke-static {v0, p1, p2, p3}, Ll/۬ۨ᩵;->ۧ(I[BII)I

    move-result v5

    add-int/2addr v4, v5

    .line 463
    iget v6, p6, Ll/۫ۨ᩵;->֫:I

    if-le v4, v6, :cond_1

    .line 464
    iput v4, p6, Ll/۫ۨ᩵;->֫:I

    sub-int v4, v0, v5

    .line 465
    iput v4, p6, Ll/۫ۨ᩵;->ۧ:I

    sub-int v4, p2, v5

    .line 466
    iput v4, p6, Ll/۫ۨ᩵;->ܽ:I

    .line 360
    :cond_1
    iget-object v4, p0, Ll/᩹ۨ᩵;->֫:[S

    and-int v5, v0, v3

    aget-short v4, v4, v5

    and-int/2addr v3, v4

    sub-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 472
    :cond_2
    :goto_1
    iget p1, p6, Ll/۫ۨ᩵;->֫:I

    if-le p1, p5, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final ֫([BIILl/۫ۨ᩵;)Z
    .locals 11

    .line 398
    iput p2, p4, Ll/۫ۨ᩵;->ܽ:I

    const/4 v0, 0x0

    .line 399
    iput v0, p4, Ll/۫ۨ᩵;->֫:I

    .line 403
    invoke-virtual {p0, p2, p1}, Ll/᩹ۨ᩵;->֫(I[B)V

    .line 345
    invoke-static {p2, p1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v1

    const v2, -0x61c8864f

    mul-int v1, v1, v2

    ushr-int/lit8 v1, v1, 0x11

    .line 356
    iget-object v3, p0, Ll/᩹ۨ᩵;->ۧ:[I

    aget v1, v3, v1

    add-int/lit8 v4, p2, -0x4

    .line 407
    iget-object v5, p0, Ll/᩹ۨ᩵;->֫:[S

    const v6, 0xffff

    if-lt v1, v4, :cond_1

    if-gt v1, p2, :cond_1

    if-ltz v1, :cond_1

    .line 408
    invoke-static {v1, p2, p1}, Ll/۬ۨ᩵;->֫(II[B)Z

    move-result v4

    if-eqz v4, :cond_0

    sub-int v4, p2, v1

    add-int/lit8 v7, v1, 0x4

    add-int/lit8 v8, p2, 0x4

    .line 410
    invoke-static {v7, p1, v8, p3}, Ll/۬ۨ᩵;->֫(I[BII)I

    move-result v7

    add-int/lit8 v7, v7, 0x4

    iput v7, p4, Ll/۫ۨ᩵;->֫:I

    .line 411
    iput v1, p4, Ll/۫ۨ᩵;->ۧ:I

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_0
    and-int v8, v1, v6

    .line 360
    aget-short v8, v5, v8

    and-int/2addr v8, v6

    sub-int/2addr v1, v8

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_1
    const/4 v8, 0x0

    .line 416
    :goto_2
    iget-object v9, p0, Ll/᩹ۨ᩵;->ᩳ:Ll/᩶ۨ᩵;

    invoke-static {v9}, Ll/᩶ۨ᩵;->֫(Ll/᩶ۨ᩵;)I

    move-result v9

    if-ge v8, v9, :cond_4

    sub-int v9, p2, v6

    .line 417
    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    if-lt v1, v9, :cond_4

    if-le v1, p2, :cond_2

    goto :goto_3

    .line 420
    :cond_2
    invoke-static {v1, p2, p1}, Ll/۬ۨ᩵;->֫(II[B)Z

    move-result v9

    if-eqz v9, :cond_3

    add-int/lit8 v9, v1, 0x4

    add-int/lit8 v10, p2, 0x4

    .line 421
    invoke-static {v9, p1, v10, p3}, Ll/۬ۨ᩵;->֫(I[BII)I

    move-result v9

    add-int/lit8 v9, v9, 0x4

    .line 422
    iget v10, p4, Ll/۫ۨ᩵;->֫:I

    if-le v9, v10, :cond_3

    .line 423
    iput v1, p4, Ll/۫ۨ᩵;->ۧ:I

    .line 424
    iput v9, p4, Ll/۫ۨ᩵;->֫:I

    :cond_3
    and-int v9, v1, v6

    .line 360
    aget-short v9, v5, v9

    and-int/2addr v9, v6

    sub-int/2addr v1, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    const/4 p3, 0x1

    if-eqz v7, :cond_6

    add-int/2addr v7, p2

    add-int/lit8 v7, v7, -0x3

    :goto_4
    sub-int v1, v7, v4

    if-ge p2, v1, :cond_5

    and-int v1, p2, v6

    int-to-short v8, v4

    .line 434
    aput-short v8, v5, v1

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_5
    and-int v1, p2, v6

    int-to-short v8, v4

    .line 438
    aput-short v8, v5, v1

    .line 439
    invoke-static {p2, p1}, Ll/ۛ᩸ۘ;->ۧ(I[B)I

    move-result v1

    mul-int v1, v1, v2

    ushr-int/lit8 v1, v1, 0x11

    aput p2, v3, v1

    add-int/2addr p2, p3

    if-lt p2, v7, :cond_5

    .line 442
    iput v7, p0, Ll/᩹ۨ᩵;->ܽ:I

    .line 445
    :cond_6
    iget p1, p4, Ll/۫ۨ᩵;->֫:I

    if-eqz p1, :cond_7

    return p3

    :cond_7
    return v0
.end method
