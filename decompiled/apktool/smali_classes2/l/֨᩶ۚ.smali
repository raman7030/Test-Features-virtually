.class public final Ll/֨᩶ۚ;
.super Ljava/lang/Object;
.source "U58U"


# static fields
.field public static final ᩴ:Ll/֨᩶ۚ;


# instance fields
.field public ֫:I

.field public ۖ:S

.field public ۘ:S

.field public ۜ:Ll/֨᩶ۚ;

.field public ۡ:Ll/ۖ᩶ۚ;

.field public ۢ:[I

.field public ۧ:S

.field public ܳ:S

.field public ܺ:S

.field public ܽ:[I

.field public ܿ:Ll/᩹ۙۚ;

.field public ᩳ:Ll/᩵᩶ۚ;

.field public ᩷:Ll/֨᩶ۚ;

.field public ᩻:S


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 140
    new-instance v0, Ll/֨᩶ۚ;

    invoke-direct {v0}, Ll/֨᩶ۚ;-><init>()V

    sput-object v0, Ll/֨᩶ۚ;->ᩴ:Ll/֨᩶ۚ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ֫(III)V
    .locals 6

    .line 442
    iget-object v0, p0, Ll/֨᩶ۚ;->ܽ:[I

    const/4 v1, 0x6

    if-nez v0, :cond_0

    new-array v0, v1, [I

    .line 443
    iput-object v0, p0, Ll/֨᩶ۚ;->ܽ:[I

    .line 445
    :cond_0
    iget-object v0, p0, Ll/֨᩶ۚ;->ܽ:[I

    const/4 v2, 0x0

    aget v3, v0, v2

    add-int/lit8 v4, v3, 0x2

    .line 446
    array-length v5, v0

    if-lt v4, v5, :cond_1

    .line 447
    array-length v5, v0

    add-int/2addr v5, v1

    new-array v1, v5, [I

    .line 448
    array-length v5, v0

    invoke-static {v0, v2, v1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 449
    iput-object v1, p0, Ll/֨᩶ۚ;->ܽ:[I

    .line 451
    :cond_1
    iget-object v0, p0, Ll/֨᩶ۚ;->ܽ:[I

    add-int/lit8 v3, v3, 0x1

    aput p1, v0, v3

    or-int p1, p2, p3

    .line 452
    aput p1, v0, v4

    .line 453
    aput v4, v0, v2

    return-void
.end method

.method private ۧ(Ll/֨᩶ۚ;)Ll/֨᩶ۚ;
    .locals 3

    .line 624
    iget-object v0, p0, Ll/֨᩶ۚ;->ۡ:Ll/ۖ᩶ۚ;

    :goto_0
    if-eqz v0, :cond_2

    .line 628
    iget-short v1, p0, Ll/֨᩶ۚ;->ۧ:S

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/֨᩶ۚ;->ۡ:Ll/ۖ᩶ۚ;

    iget-object v1, v1, Ll/ۖ᩶ۚ;->ۧ:Ll/ۖ᩶ۚ;

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 630
    :cond_0
    iget-object v1, v0, Ll/ۖ᩶ۚ;->ܽ:Ll/֨᩶ۚ;

    iget-object v2, v1, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    if-nez v2, :cond_1

    .line 633
    iput-object p1, v1, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    move-object p1, v1

    .line 636
    :cond_1
    :goto_1
    iget-object v0, v0, Ll/ۖ᩶ۚ;->ۧ:Ll/ۖ᩶ۚ;

    goto :goto_0

    :cond_2
    return-object p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 652
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const-string v1, "L"

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֨᩶ۚ;
    .locals 1

    .line 332
    iget-object v0, p0, Ll/֨᩶ۚ;->ᩳ:Ll/᩵᩶ۚ;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, v0, Ll/᩵᩶ۚ;->᩷:Ll/֨᩶ۚ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 5

    .line 345
    iget-short v0, p0, Ll/֨᩶ۚ;->ۧ:S

    and-int/lit16 v1, v0, 0x80

    if-nez v1, :cond_0

    or-int/lit16 v0, v0, 0x80

    int-to-short v0, v0

    .line 346
    iput-short v0, p0, Ll/֨᩶ۚ;->ۧ:S

    int-to-short p1, p1

    .line 347
    iput-short p1, p0, Ll/֨᩶ۚ;->᩻:S

    return-void

    .line 349
    :cond_0
    iget-object v0, p0, Ll/֨᩶ۚ;->ۢ:[I

    const/4 v1, 0x4

    if-nez v0, :cond_1

    new-array v0, v1, [I

    .line 350
    iput-object v0, p0, Ll/֨᩶ۚ;->ۢ:[I

    .line 352
    :cond_1
    iget-object v0, p0, Ll/֨᩶ۚ;->ۢ:[I

    const/4 v2, 0x0

    aget v3, v0, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v0, v2

    .line 353
    array-length v4, v0

    if-lt v3, v4, :cond_2

    .line 354
    array-length v4, v0

    add-int/2addr v4, v1

    new-array v1, v4, [I

    .line 355
    array-length v4, v0

    invoke-static {v0, v2, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 356
    iput-object v1, p0, Ll/֨᩶ۚ;->ۢ:[I

    .line 358
    :cond_2
    iget-object v0, p0, Ll/֨᩶ۚ;->ۢ:[I

    aput p1, v0, v3

    return-void
.end method

.method public final ֫(Ll/֨᩶ۚ;)V
    .locals 8

    .line 576
    sget-object v0, Ll/֨᩶ۚ;->ᩴ:Ll/֨᩶ۚ;

    iput-object v0, p0, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    move-object v1, p0

    move-object v2, v0

    :goto_0
    if-eq v1, v0, :cond_1

    .line 580
    iget-object v3, v1, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    .line 581
    iput-object v2, v1, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    .line 587
    iget-short v2, v1, Ll/֨᩶ۚ;->ۧ:S

    and-int/lit8 v2, v2, 0x40

    if-eqz v2, :cond_0

    iget-short v2, v1, Ll/֨᩶ۚ;->ۘ:S

    iget-short v4, p1, Ll/֨᩶ۚ;->ۘ:S

    if-eq v2, v4, :cond_0

    .line 589
    new-instance v2, Ll/ۖ᩶ۚ;

    iget-short v4, v1, Ll/֨᩶ۚ;->ۖ:S

    iget-object v5, p1, Ll/֨᩶ۚ;->ۡ:Ll/ۖ᩶ۚ;

    iget-object v5, v5, Ll/ۖ᩶ۚ;->ܽ:Ll/֨᩶ۚ;

    iget-object v6, v1, Ll/֨᩶ۚ;->ۡ:Ll/ۖ᩶ۚ;

    invoke-direct {v2, v4, v5, v6}, Ll/ۖ᩶ۚ;-><init>(ILl/֨᩶ۚ;Ll/ۖ᩶ۚ;)V

    iput-object v2, v1, Ll/֨᩶ۚ;->ۡ:Ll/ۖ᩶ۚ;

    .line 602
    :cond_0
    invoke-direct {v1, v3}, Ll/֨᩶ۚ;->ۧ(Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v7

    goto :goto_0

    :cond_1
    :goto_1
    if-eq v2, v0, :cond_2

    .line 607
    iget-object p1, v2, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    const/4 v1, 0x0

    .line 608
    iput-object v1, v2, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    move-object v2, p1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ܶ᩶ۚ;Z)V
    .locals 2

    .line 369
    invoke-virtual {p1, p0}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;)V

    if-eqz p2, :cond_0

    .line 370
    iget-short p2, p0, Ll/֨᩶ۚ;->ۧ:S

    and-int/lit16 p2, p2, 0x80

    if-eqz p2, :cond_0

    .line 371
    iget-short p2, p0, Ll/֨᩶ۚ;->᩻:S

    const v0, 0xffff

    and-int/2addr p2, v0

    invoke-virtual {p1, p2, p0}, Ll/ܶ᩶ۚ;->ۧ(ILl/֨᩶ۚ;)V

    .line 372
    iget-object p2, p0, Ll/֨᩶ۚ;->ۢ:[I

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 373
    :goto_0
    iget-object v0, p0, Ll/֨᩶ۚ;->ۢ:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    if-gt p2, v1, :cond_0

    .line 374
    aget v0, v0, p2

    invoke-virtual {p1, v0, p0}, Ll/ܶ᩶ۚ;->ۧ(ILl/֨᩶ۚ;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ᩳ᩶ۚ;)V
    .locals 3

    .line 422
    iget-short v0, p0, Ll/֨᩶ۚ;->ۧ:S

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_0

    const/high16 v0, 0x30000000

    .line 423
    iget v1, p1, Ll/ᩳ᩶ۚ;->ۧ:I

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Ll/֨᩶ۚ;->֫(III)V

    .line 425
    :cond_0
    iget v0, p0, Ll/֨᩶ۚ;->֫:I

    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    return-void
.end method

.method public final ֫(Ll/ᩳ᩶ۚ;IZ)V
    .locals 2

    .line 397
    iget-short v0, p0, Ll/֨᩶ۚ;->ۧ:S

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-eqz p3, :cond_0

    const/high16 p3, 0x20000000

    .line 399
    iget v1, p1, Ll/ᩳ᩶ۚ;->ۧ:I

    invoke-direct {p0, p2, p3, v1}, Ll/֨᩶ۚ;->֫(III)V

    .line 400
    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    return-void

    :cond_0
    const/high16 p3, 0x10000000

    .line 402
    iget v1, p1, Ll/ᩳ᩶ۚ;->ۧ:I

    invoke-direct {p0, p2, p3, v1}, Ll/֨᩶ۚ;->֫(III)V

    .line 403
    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    return-void

    :cond_1
    if-eqz p3, :cond_2

    .line 407
    iget p3, p0, Ll/֨᩶ۚ;->֫:I

    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    return-void

    .line 409
    :cond_2
    iget p3, p0, Ll/֨᩶ۚ;->֫:I

    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    return-void
.end method

.method public final ֫(S)V
    .locals 4

    .line 539
    sget-object v0, Ll/֨᩶ۚ;->ᩴ:Ll/֨᩶ۚ;

    iput-object v0, p0, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    move-object v1, p0

    :goto_0
    if-eq v1, v0, :cond_1

    .line 543
    iget-object v2, v1, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    const/4 v3, 0x0

    .line 544
    iput-object v3, v1, Ll/֨᩶ۚ;->᩷:Ll/֨᩶ۚ;

    .line 548
    iget-short v3, v1, Ll/֨᩶ۚ;->ۘ:S

    if-nez v3, :cond_0

    .line 549
    iput-short p1, v1, Ll/֨᩶ۚ;->ۘ:S

    .line 550
    invoke-direct {v1, v2}, Ll/֨᩶ۚ;->ۧ(Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫([BLl/ᩳ᩶ۚ;I)Z
    .locals 7

    .line 475
    iget-short v0, p0, Ll/֨᩶ۚ;->ۧ:S

    or-int/lit8 v0, v0, 0x4

    int-to-short v0, v0

    iput-short v0, p0, Ll/֨᩶ۚ;->ۧ:S

    .line 476
    iput p3, p0, Ll/֨᩶ۚ;->֫:I

    .line 477
    iget-object v0, p0, Ll/֨᩶ۚ;->ܽ:[I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 481
    :cond_0
    aget v0, v0, v1

    :goto_0
    if-lez v0, :cond_6

    .line 482
    iget-object v2, p0, Ll/֨᩶ۚ;->ܽ:[I

    add-int/lit8 v3, v0, -0x1

    aget v3, v2, v3

    .line 483
    aget v2, v2, v0

    sub-int v4, p3, v3

    const v5, 0xfffffff

    and-int/2addr v5, v2

    const/high16 v6, -0x10000000

    and-int/2addr v2, v6

    const/high16 v6, 0x10000000

    if-ne v2, v6, :cond_4

    const/16 v2, -0x8000

    if-lt v4, v2, :cond_1

    const/16 v2, 0x7fff

    if-le v4, v2, :cond_3

    .line 492
    :cond_1
    aget-byte v1, p1, v3

    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0xc6

    if-ge v1, v2, :cond_2

    add-int/lit8 v1, v1, 0x31

    int-to-byte v1, v1

    .line 495
    aput-byte v1, p1, v3

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x14

    int-to-byte v1, v1

    .line 498
    aput-byte v1, p1, v3

    :goto_1
    const/4 v1, 0x1

    :cond_3
    add-int/lit8 v2, v5, 0x1

    ushr-int/lit8 v3, v4, 0x8

    int-to-byte v3, v3

    .line 502
    aput-byte v3, p1, v5

    int-to-byte v3, v4

    .line 503
    aput-byte v3, p1, v2

    goto :goto_2

    :cond_4
    const/high16 v3, 0x20000000

    if-ne v2, v3, :cond_5

    add-int/lit8 v2, v5, 0x1

    ushr-int/lit8 v3, v4, 0x18

    int-to-byte v3, v3

    .line 505
    aput-byte v3, p1, v5

    add-int/lit8 v3, v5, 0x2

    ushr-int/lit8 v6, v4, 0x10

    int-to-byte v6, v6

    .line 506
    aput-byte v6, p1, v2

    add-int/lit8 v5, v5, 0x3

    ushr-int/lit8 v2, v4, 0x8

    int-to-byte v2, v2

    .line 507
    aput-byte v2, p1, v3

    int-to-byte v2, v4

    .line 508
    aput-byte v2, p1, v5

    goto :goto_2

    .line 510
    :cond_5
    iget-object v2, p2, Ll/ᩳ᩶ۚ;->֫:[B

    add-int/lit8 v3, v5, 0x1

    ushr-int/lit8 v4, p3, 0x8

    int-to-byte v4, v4

    aput-byte v4, v2, v5

    int-to-byte v4, p3

    .line 511
    aput-byte v4, v2, v3

    :goto_2
    add-int/lit8 v0, v0, -0x2

    goto :goto_0

    :cond_6
    return v1
.end method
