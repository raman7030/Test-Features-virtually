.class public final Ll/۟ܰᩳ;
.super Ljava/lang/Object;
.source "R6N8"


# instance fields
.field public ֡:I

.field public ֫:I

.field public ۖ:I

.field public ۘ:Ll/۟ܰᩳ;

.field public ۚ:[I

.field public ۜ:[C

.field public ۡ:[I

.field public ۢ:[J

.field public ۧ:I

.field public ܳ:I

.field public ܺ:[C

.field public ܽ:[J

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:[I

.field public ᩵:[Ljava/lang/Object;

.field public ᩷:I

.field public ᩻:Ll/۟ܰᩳ;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    .line 411
    invoke-direct {p0, p1, v0}, Ll/۟ܰᩳ;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 1

    .line 413
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 407
    iput v0, p0, Ll/۟ܰᩳ;->ᩳ:I

    const/16 v0, 0x8

    .line 414
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 v0, p1, 0x3f

    ushr-int/lit8 v0, v0, 0x6

    .line 415
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    .line 416
    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Ll/۟ܰᩳ;->ᩴ:[I

    if-eqz p2, :cond_0

    .line 417
    new-array p1, p1, [C

    iput-object p1, p0, Ll/۟ܰᩳ;->ۜ:[C

    return-void

    .line 418
    :cond_0
    new-array p1, p1, [I

    iput-object p1, p0, Ll/۟ܰᩳ;->ۚ:[I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟ܰᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۟ܰᩳ;->ۧ()V

    return-void
.end method

.method private ۧ()V
    .locals 4

    .line 656
    invoke-direct {p0}, Ll/۟ܰᩳ;->ᩳ()V

    .line 657
    invoke-direct {p0}, Ll/۟ܰᩳ;->ܽ()V

    .line 658
    iget-object v0, p0, Ll/۟ܰᩳ;->ۚ:[I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 659
    :goto_0
    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Ll/۟ܰᩳ;->ۚ:[I

    aget v2, v2, v1

    const/high16 v3, -0x10000

    and-int/2addr v2, v3

    if-eqz v2, :cond_1

    :goto_1
    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 660
    :cond_2
    invoke-virtual {p0}, Ll/۟ܰᩳ;->֫()I

    move-result v1

    new-array v1, v1, [C

    iput-object v1, p0, Ll/۟ܰᩳ;->ۜ:[C

    .line 661
    :goto_2
    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Ll/۟ܰᩳ;->ۜ:[C

    iget-object v2, p0, Ll/۟ܰᩳ;->ۚ:[I

    aget v2, v2, v0

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    .line 662
    iput-object v0, p0, Ll/۟ܰᩳ;->ۚ:[I

    return-void
.end method

.method private ۧ(II)V
    .locals 8

    .line 644
    iget-object v0, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aget-object v0, v0, p1

    instance-of v1, v0, [I

    if-eqz v1, :cond_3

    check-cast v0, [I

    const/4 v1, 0x0

    .line 645
    aget v2, v0, v1

    const/4 v3, 0x1

    move v3, v2

    const/4 v4, 0x1

    :goto_0
    if-ge v4, p2, :cond_0

    .line 646
    aget v5, v0, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    aget v5, v0, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    int-to-long v4, v2

    int-to-long v6, v3

    sub-long/2addr v4, v6

    const-wide/32 v6, 0xffff

    cmp-long v2, v4, v6

    if-lez v2, :cond_1

    goto :goto_2

    .line 648
    :cond_1
    array-length v2, v0

    new-array v2, v2, [C

    :goto_1
    if-ge v1, p2, :cond_2

    .line 649
    aget v4, v0, v1

    sub-int/2addr v4, v3

    int-to-char v4, v4

    aput-char v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 650
    :cond_2
    iget-object p2, p0, Ll/۟ܰᩳ;->ᩴ:[I

    aget v0, p2, p1

    add-int/2addr v0, v3

    aput v0, p2, p1

    .line 651
    iget-object p2, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aput-object v2, p2, p1

    :cond_3
    :goto_2
    return-void
.end method

.method private ܽ()V
    .locals 9

    .line 616
    iget-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-eqz v0, :cond_9

    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v1, 0x0

    .line 617
    aget v0, v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 618
    :goto_0
    iget v5, p0, Ll/۟ܰᩳ;->֡:I

    if-ge v3, v5, :cond_2

    .line 619
    iget-object v5, p0, Ll/۟ܰᩳ;->ۡ:[I

    aget v6, v5, v3

    add-int/lit8 v7, v3, -0x1

    aget v5, v5, v7

    sub-int/2addr v6, v5

    if-eqz v6, :cond_1

    if-eq v6, v2, :cond_1

    goto :goto_5

    :cond_1
    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_6

    sub-int/2addr v5, v2

    if-ne v4, v5, :cond_3

    goto :goto_3

    .line 540
    :cond_3
    iget-object v3, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    array-length v4, v3

    new-array v4, v4, [J

    iput-object v4, p0, Ll/۟ܰᩳ;->ۢ:[J

    .line 541
    array-length v3, v3

    new-array v3, v3, [C

    iput-object v3, p0, Ll/۟ܰᩳ;->ܺ:[C

    .line 626
    :goto_1
    iget v3, p0, Ll/۟ܰᩳ;->֡:I

    if-ge v2, v3, :cond_5

    .line 627
    iget-object v3, p0, Ll/۟ܰᩳ;->ۡ:[I

    aget v4, v3, v2

    add-int/lit8 v5, v2, -0x1

    aget v3, v3, v5

    if-eq v4, v3, :cond_4

    iget-object v3, p0, Ll/۟ܰᩳ;->ۢ:[J

    ushr-int/lit8 v4, v2, 0x6

    aget-wide v5, v3, v4

    const-wide/16 v7, 0x1

    shl-long/2addr v7, v2

    or-long/2addr v5, v7

    aput-wide v5, v3, v4

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    .line 546
    :goto_2
    iget-object v3, p0, Ll/۟ܰᩳ;->ۢ:[J

    array-length v4, v3

    if-ge v1, v4, :cond_8

    .line 547
    iget-object v4, p0, Ll/۟ܰᩳ;->ܺ:[C

    int-to-char v5, v2

    aput-char v5, v4, v1

    .line 548
    aget-wide v4, v3, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->bitCount(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    const/4 v1, 0x1

    .line 623
    :goto_4
    iput v1, p0, Ll/۟ܰᩳ;->ۖ:I

    .line 630
    :cond_8
    iget v1, p0, Ll/۟ܰᩳ;->᩷:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/۟ܰᩳ;->᩷:I

    const/4 v0, 0x0

    .line 631
    iput-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    :cond_9
    :goto_5
    return-void
.end method

.method private ܽ(II)V
    .locals 7

    ushr-int/lit8 v0, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    .line 454
    iget-object v1, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aget-object v2, v1, v0

    if-nez v2, :cond_0

    .line 456
    invoke-virtual {p0}, Ll/۟ܰᩳ;->֫()I

    move-result v2

    shl-int/lit8 v3, v0, 0x6

    sub-int/2addr v2, v3

    const/16 v3, 0x40

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    new-array v2, v2, [C

    aput-object v2, v1, v0

    .line 457
    iget-object v1, p0, Ll/۟ܰᩳ;->ᩴ:[I

    aput p2, v1, v0

    :cond_0
    int-to-long v3, p2

    .line 459
    iget-object p2, p0, Ll/۟ܰᩳ;->ᩴ:[I

    aget p2, p2, v0

    int-to-long v5, p2

    sub-long/2addr v3, v5

    .line 460
    instance-of p2, v2, [C

    if-eqz p2, :cond_3

    check-cast v2, [C

    const-wide/16 v5, 0x0

    cmp-long p2, v3, v5

    if-ltz p2, :cond_1

    const-wide/32 v5, 0xffff

    cmp-long p2, v3, v5

    if-gtz p2, :cond_1

    long-to-int p2, v3

    int-to-char p2, p2

    .line 462
    aput-char p2, v2, p1

    return-void

    .line 465
    :cond_1
    array-length p2, v2

    new-array p2, p2, [I

    const/4 v1, 0x0

    .line 466
    :goto_0
    array-length v5, v2

    if-ge v1, v5, :cond_2

    aget-char v5, v2, v1

    aput v5, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 467
    :cond_2
    iget-object v1, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aput-object p2, v1, v0

    move-object v2, p2

    .line 469
    :cond_3
    check-cast v2, [I

    long-to-int p2, v3

    aput p2, v2, p1

    return-void
.end method

.method private ܿ()V
    .locals 3

    .line 607
    iget-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-eqz v0, :cond_0

    return-void

    .line 608
    :cond_0
    invoke-virtual {p0}, Ll/۟ܰᩳ;->֫()I

    move-result v0

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 609
    :goto_0
    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ll/۟ܰᩳ;->ܽ(I)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 610
    :cond_1
    iput-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    const/4 v0, 0x0

    .line 611
    iput-object v0, p0, Ll/۟ܰᩳ;->ۢ:[J

    .line 612
    iput-object v0, p0, Ll/۟ܰᩳ;->ܺ:[C

    return-void
.end method

.method private ᩳ()V
    .locals 3

    const/4 v0, 0x0

    .line 636
    :goto_0
    iget-object v1, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 637
    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    shl-int/lit8 v2, v0, 0x6

    sub-int/2addr v1, v2

    const/16 v2, 0x40

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-gtz v1, :cond_0

    .line 638
    iget-object v1, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    goto :goto_1

    .line 639
    :cond_0
    invoke-direct {p0, v0, v1}, Ll/۟ܰᩳ;->ۧ(II)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 421
    iget-object v0, p0, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz v0, :cond_0

    array-length v0, v0

    return v0

    :cond_0
    iget-object v0, p0, Ll/۟ܰᩳ;->ۚ:[I

    array-length v0, v0

    return v0
.end method

.method public final ֫(II)Ll/۟ܰᩳ;
    .locals 7

    .line 666
    new-instance v0, Ll/۟ܰᩳ;

    sub-int v1, p2, p1

    iget-object v2, p0, Ll/۟ܰᩳ;->ۜ:[C

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v0, v1, v2}, Ll/۟ܰᩳ;-><init>(IZ)V

    .line 667
    iput v1, v0, Ll/۟ܰᩳ;->ۧ:I

    iput v1, v0, Ll/۟ܰᩳ;->֡:I

    .line 668
    iget v1, p0, Ll/۟ܰᩳ;->֫:I

    iput v1, v0, Ll/۟ܰᩳ;->֫:I

    .line 669
    iget v1, p0, Ll/۟ܰᩳ;->᩷:I

    iput v1, v0, Ll/۟ܰᩳ;->᩷:I

    .line 670
    iget v1, p0, Ll/۟ܰᩳ;->ۖ:I

    iput v1, v0, Ll/۟ܰᩳ;->ۖ:I

    if-nez p1, :cond_2

    .line 671
    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    if-ne p2, v1, :cond_2

    .line 672
    iget-object v1, p0, Ll/۟ܰᩳ;->ᩴ:[I

    iget-object v2, v0, Ll/۟ܰᩳ;->ᩴ:[I

    array-length v4, v2

    invoke-static {v1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x0

    .line 673
    :goto_1
    iget-object v2, v0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    array-length v2, v2

    if-ge v1, v2, :cond_3

    .line 674
    invoke-virtual {v0}, Ll/۟ܰᩳ;->֫()I

    move-result v2

    shl-int/lit8 v4, v1, 0x6

    sub-int/2addr v2, v4

    const/16 v4, 0x40

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 675
    iget-object v4, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aget-object v4, v4, v1

    .line 676
    iget-object v5, v0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    instance-of v6, v4, [C

    if-eqz v6, :cond_1

    check-cast v4, [C

    .line 677
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v2

    goto :goto_2

    :cond_1
    check-cast v4, [I

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    :goto_2
    aput-object v2, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 679
    :goto_3
    iget v2, v0, Ll/۟ܰᩳ;->֡:I

    if-ge v1, v2, :cond_3

    add-int v2, v1, p1

    invoke-virtual {p0, v2}, Ll/۟ܰᩳ;->ᩳ(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/۟ܰᩳ;->ܽ(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 680
    :cond_3
    iget-object v1, p0, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz v1, :cond_4

    iget-object v2, v0, Ll/۟ܰᩳ;->ۜ:[C

    iget v4, v0, Ll/۟ܰᩳ;->֡:I

    invoke-static {v1, p1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    .line 681
    :cond_4
    iget-object v1, p0, Ll/۟ܰᩳ;->ۚ:[I

    iget-object v2, v0, Ll/۟ܰᩳ;->ۚ:[I

    iget v4, v0, Ll/۟ܰᩳ;->֡:I

    invoke-static {v1, p1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 682
    :goto_4
    iget-object v1, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-nez v1, :cond_6

    iget-object v1, p0, Ll/۟ܰᩳ;->ۢ:[J

    if-eqz v1, :cond_5

    goto :goto_5

    .line 690
    :cond_5
    iget v1, v0, Ll/۟ܰᩳ;->᩷:I

    iget v2, p0, Ll/۟ܰᩳ;->ۖ:I

    mul-int v2, v2, p1

    add-int/2addr v2, v1

    iput v2, v0, Ll/۟ܰᩳ;->᩷:I

    goto :goto_7

    .line 683
    :cond_6
    :goto_5
    iget-object v1, p0, Ll/۟ܰᩳ;->ۢ:[J

    if-eqz v1, :cond_7

    if-nez p1, :cond_7

    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    if-ne p2, v2, :cond_7

    .line 684
    iget-object v2, v0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    array-length v2, v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    iput-object v1, v0, Ll/۟ܰᩳ;->ۢ:[J

    .line 685
    iget-object v1, p0, Ll/۟ܰᩳ;->ܺ:[C

    iget-object v2, v0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    array-length v2, v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v1

    iput-object v1, v0, Ll/۟ܰᩳ;->ܺ:[C

    goto :goto_7

    .line 687
    :cond_7
    invoke-virtual {v0}, Ll/۟ܰᩳ;->֫()I

    move-result v1

    new-array v1, v1, [I

    iput-object v1, v0, Ll/۟ܰᩳ;->ۡ:[I

    .line 688
    :goto_6
    iget v1, v0, Ll/۟ܰᩳ;->֡:I

    if-ge v3, v1, :cond_8

    iget-object v1, v0, Ll/۟ܰᩳ;->ۡ:[I

    add-int v2, v3, p1

    invoke-virtual {p0, v2}, Ll/۟ܰᩳ;->ܽ(I)I

    move-result v2

    aput v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_8
    :goto_7
    if-nez p1, :cond_9

    .line 692
    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    if-eq p2, v1, :cond_a

    :cond_9
    invoke-direct {v0}, Ll/۟ܰᩳ;->ۧ()V

    .line 693
    :cond_a
    iget-object v1, p0, Ll/۟ܰᩳ;->ܽ:[J

    if-eqz v1, :cond_b

    move v1, p1

    :goto_8
    if-ge v1, p2, :cond_b

    sub-int v2, v1, p1

    invoke-virtual {p0, v1}, Ll/۟ܰᩳ;->ۧ(I)Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Ll/۟ܰᩳ;->֫(IZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_b
    return-object v0
.end method

.method public final ֫(I)V
    .locals 6

    .line 424
    invoke-virtual {p0}, Ll/۟ܰᩳ;->֫()I

    move-result v0

    if-gt p1, v0, :cond_0

    goto/16 :goto_2

    :cond_0
    mul-int/lit8 v1, v0, 0x2

    .line 426
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/16 v1, 0x400

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/lit8 v1, p1, 0x3f

    ushr-int/lit8 v1, v1, 0x6

    .line 428
    iget-object v2, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    .line 429
    iget-object v2, p0, Ll/۟ܰᩳ;->ᩴ:[I

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Ll/۟ܰᩳ;->ᩴ:[I

    ushr-int/lit8 v2, v0, 0x6

    and-int/lit8 v0, v0, 0x3f

    if-eqz v0, :cond_2

    .line 432
    iget-object v0, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    shl-int/lit8 v0, v2, 0x6

    sub-int v0, p1, v0

    const/16 v3, 0x40

    .line 433
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 434
    iget-object v3, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aget-object v4, v3, v2

    instance-of v5, v4, [C

    if-eqz v5, :cond_1

    check-cast v4, [C

    .line 435
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v0

    goto :goto_0

    :cond_1
    check-cast v4, [I

    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    :goto_0
    aput-object v0, v3, v2

    .line 437
    :cond_2
    iget-object v0, p0, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz v0, :cond_3

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v0

    iput-object v0, p0, Ll/۟ܰᩳ;->ۜ:[C

    goto :goto_1

    .line 438
    :cond_3
    iget-object v0, p0, Ll/۟ܰᩳ;->ۚ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/۟ܰᩳ;->ۚ:[I

    .line 439
    :goto_1
    iget-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-eqz v0, :cond_4

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->ۡ:[I

    .line 440
    :cond_4
    iget-object p1, p0, Ll/۟ܰᩳ;->ۢ:[J

    if-eqz p1, :cond_5

    .line 441
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->ۢ:[J

    .line 442
    iget-object p1, p0, Ll/۟ܰᩳ;->ܺ:[C

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p1

    iput-object p1, p0, Ll/۟ܰᩳ;->ܺ:[C

    :cond_5
    :goto_2
    return-void
.end method

.method public final ֫(IIII)V
    .locals 5

    if-lt p1, p2, :cond_0

    goto :goto_4

    :cond_0
    if-nez p1, :cond_1

    .line 583
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    if-ne p2, v0, :cond_1

    .line 584
    iget p1, p0, Ll/۟ܰᩳ;->֫:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/۟ܰᩳ;->֫:I

    .line 585
    iget p1, p0, Ll/۟ܰᩳ;->᩷:I

    add-int/2addr p1, p4

    iput p1, p0, Ll/۟ܰᩳ;->᩷:I

    return-void

    :cond_1
    if-eqz p3, :cond_4

    ushr-int/lit8 v0, p1, 0x6

    :goto_0
    add-int/lit8 v1, p2, -0x1

    ushr-int/lit8 v1, v1, 0x6

    if-gt v0, v1, :cond_4

    shl-int/lit8 v1, v0, 0x6

    .line 590
    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    add-int/lit8 v3, v1, 0x40

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-gt p1, v1, :cond_2

    if-lt p2, v2, :cond_2

    .line 591
    iget-object v1, p0, Ll/۟ܰᩳ;->ᩴ:[I

    aget v2, v1, v0

    add-int/2addr v2, p3

    aput v2, v1, v0

    goto :goto_2

    .line 593
    :cond_2
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    :goto_1
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v3, v4, :cond_3

    invoke-virtual {p0, v3}, Ll/۟ܰᩳ;->ᩳ(I)I

    move-result v4

    add-int/2addr v4, p3

    invoke-direct {p0, v3, v4}, Ll/۟ܰᩳ;->ܽ(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    sub-int/2addr v2, v1

    .line 594
    invoke-direct {p0, v0, v2}, Ll/۟ܰᩳ;->ۧ(II)V

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    if-eqz p4, :cond_6

    .line 599
    invoke-direct {p0}, Ll/۟ܰᩳ;->ܿ()V

    :goto_3
    if-ge p1, p2, :cond_5

    .line 600
    iget-object p3, p0, Ll/۟ܰᩳ;->ۡ:[I

    aget v0, p3, p1

    add-int/2addr v0, p4

    aput v0, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 602
    :cond_5
    invoke-direct {p0}, Ll/۟ܰᩳ;->ܽ()V

    :cond_6
    :goto_4
    return-void
.end method

.method public final ֫(ILl/ۨܰᩳ;)V
    .locals 3

    .line 566
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p2}, Ll/۟ܰᩳ;->֫(Ll/ۨܰᩳ;)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 567
    invoke-virtual {p0, v0}, Ll/۟ܰᩳ;->֫(I)V

    .line 569
    iget-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۟ܰᩳ;->ۢ:[J

    if-nez v0, :cond_1

    iget v0, p0, Ll/۟ܰᩳ;->ۖ:I

    if-nez v0, :cond_1

    iget v0, p2, Ll/ۨܰᩳ;->᩹:I

    iget v1, p0, Ll/۟ܰᩳ;->᩷:I

    if-eq v0, v1, :cond_2

    :cond_1
    invoke-direct {p0}, Ll/۟ܰᩳ;->ܿ()V

    .line 570
    :cond_2
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    :goto_0
    if-le v0, p1, :cond_3

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p0, v1}, Ll/۟ܰᩳ;->ᩳ(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/۟ܰᩳ;->ܽ(II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 571
    :cond_3
    iget-object v0, p0, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz v0, :cond_4

    add-int/lit8 v1, p1, 0x1

    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    sub-int/2addr v2, p1

    invoke-static {v0, p1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 572
    :cond_4
    iget-object v0, p0, Ll/۟ܰᩳ;->ۚ:[I

    add-int/lit8 v1, p1, 0x1

    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    sub-int/2addr v2, p1

    invoke-static {v0, p1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 573
    :goto_1
    iget-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-eqz v0, :cond_5

    add-int/lit8 v1, p1, 0x1

    iget v2, p0, Ll/۟ܰᩳ;->֡:I

    sub-int/2addr v2, p1

    invoke-static {v0, p1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 574
    :cond_5
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    :goto_2
    if-le v0, p1, :cond_6

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p0, v1}, Ll/۟ܰᩳ;->ۧ(I)Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/۟ܰᩳ;->֫(IZ)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 575
    :cond_6
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟ܰᩳ;->֡:I

    .line 576
    invoke-virtual {p0, p1, p2}, Ll/۟ܰᩳ;->ܽ(ILl/ۨܰᩳ;)V

    .line 577
    invoke-direct {p0}, Ll/۟ܰᩳ;->ᩳ()V

    return-void
.end method

.method public final ֫(IZ)V
    .locals 5

    const-wide/16 v0, 0x1

    if-eqz p2, :cond_1

    .line 490
    iget-object p2, p0, Ll/۟ܰᩳ;->ܽ:[J

    if-nez p2, :cond_0

    const/16 p2, 0x10

    new-array p2, p2, [J

    iput-object p2, p0, Ll/۟ܰᩳ;->ܽ:[J

    .line 491
    :cond_0
    iget-object p2, p0, Ll/۟ܰᩳ;->ܽ:[J

    ushr-int/lit8 v2, p1, 0x6

    aget-wide v3, p2, v2

    shl-long/2addr v0, p1

    or-long/2addr v0, v3

    aput-wide v0, p2, v2

    return-void

    .line 492
    :cond_1
    iget-object p2, p0, Ll/۟ܰᩳ;->ܽ:[J

    if-eqz p2, :cond_2

    ushr-int/lit8 v2, p1, 0x6

    aget-wide v3, p2, v2

    shl-long/2addr v0, p1

    not-long v0, v0

    and-long/2addr v0, v3

    aput-wide v0, p2, v2

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۨܰᩳ;)V
    .locals 1

    .line 559
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/۟ܰᩳ;->֫(I)V

    .line 560
    iget v0, p0, Ll/۟ܰᩳ;->֡:I

    invoke-virtual {p0, v0, p1}, Ll/۟ܰᩳ;->ܽ(ILl/ۨܰᩳ;)V

    .line 561
    iget p1, p0, Ll/۟ܰᩳ;->֡:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۟ܰᩳ;->֡:I

    iput p1, p0, Ll/۟ܰᩳ;->ۧ:I

    const/16 v0, 0x400

    if-ne p1, v0, :cond_0

    .line 562
    invoke-direct {p0}, Ll/۟ܰᩳ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ۧ(ILl/ۨܰᩳ;)V
    .locals 4

    .line 553
    invoke-virtual {p0, p1}, Ll/۟ܰᩳ;->ᩳ(I)I

    move-result v0

    iget v1, p0, Ll/۟ܰᩳ;->֫:I

    add-int/2addr v0, v1

    .line 472
    iget-object v1, p0, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz v1, :cond_0

    aget-char v1, v1, p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/۟ܰᩳ;->ۚ:[I

    aget v1, v1, p1

    :goto_0
    add-int/2addr v1, v0

    .line 554
    invoke-virtual {p0, p1}, Ll/۟ܰᩳ;->ܽ(I)I

    move-result v2

    iget v3, p0, Ll/۟ܰᩳ;->᩷:I

    add-int/2addr v2, v3

    invoke-virtual {p2, v0, v1, v2}, Ll/ۨܰᩳ;->֫(III)V

    .line 555
    invoke-virtual {p0, p1}, Ll/۟ܰᩳ;->ۧ(I)Z

    move-result p1

    invoke-virtual {p2, p1}, Ll/ۨܰᩳ;->֫(Z)V

    return-void
.end method

.method public final ۧ(I)Z
    .locals 5

    .line 487
    iget-object v0, p0, Ll/۟ܰᩳ;->ܽ:[J

    if-eqz v0, :cond_0

    ushr-int/lit8 v1, p1, 0x6

    aget-wide v1, v0, v1

    const-wide/16 v3, 0x1

    shl-long/2addr v3, p1

    and-long v0, v1, v3

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I)I
    .locals 5

    .line 475
    iget-object v0, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-eqz v0, :cond_0

    aget p1, v0, p1

    return p1

    .line 476
    :cond_0
    iget-object v0, p0, Ll/۟ܰᩳ;->ۢ:[J

    if-nez v0, :cond_1

    iget v0, p0, Ll/۟ܰᩳ;->ۖ:I

    mul-int p1, p1, v0

    return p1

    :cond_1
    ushr-int/lit8 v1, p1, 0x6

    .line 478
    iget-object v2, p0, Ll/۟ܰᩳ;->ܺ:[C

    aget-char v2, v2, v1

    aget-wide v3, v0, v1

    and-int/lit8 p1, p1, 0x3f

    rsub-int/lit8 p1, p1, 0x3f

    const-wide/16 v0, -0x1

    ushr-long/2addr v0, p1

    and-long/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    add-int/2addr p1, v2

    return p1
.end method

.method public final ܽ(ILl/ۨܰᩳ;)V
    .locals 12

    .line 497
    iget v0, p2, Ll/ۨܰᩳ;->᩶:I

    iget v1, p0, Ll/۟ܰᩳ;->֫:I

    sub-int/2addr v0, v1

    invoke-direct {p0, p1, v0}, Ll/۟ܰᩳ;->ܽ(II)V

    .line 498
    iget v0, p2, Ll/ۨܰᩳ;->᩸:I

    iget v1, p2, Ll/ۨܰᩳ;->᩶:I

    sub-int/2addr v0, v1

    .line 499
    iget-object v1, p0, Ll/۟ܰᩳ;->ۜ:[C

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/high16 v1, -0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_1

    .line 500
    invoke-virtual {p0}, Ll/۟ܰᩳ;->֫()I

    move-result v1

    new-array v1, v1, [I

    iput-object v1, p0, Ll/۟ܰᩳ;->ۚ:[I

    const/4 v1, 0x0

    .line 501
    :goto_0
    iget v3, p0, Ll/۟ܰᩳ;->֡:I

    if-ge v1, v3, :cond_0

    iget-object v3, p0, Ll/۟ܰᩳ;->ۚ:[I

    iget-object v4, p0, Ll/۟ܰᩳ;->ۜ:[C

    aget-char v4, v4, v1

    aput v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 502
    iput-object v1, p0, Ll/۟ܰᩳ;->ۜ:[C

    .line 504
    :cond_1
    iget-object v1, p0, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz v1, :cond_2

    int-to-char v0, v0

    aput-char v0, v1, p1

    goto :goto_1

    .line 505
    :cond_2
    iget-object v1, p0, Ll/۟ܰᩳ;->ۚ:[I

    aput v0, v1, p1

    .line 506
    :goto_1
    iget v0, p2, Ll/ۨܰᩳ;->᩹:I

    .line 512
    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    if-nez v1, :cond_3

    iput v0, p0, Ll/۟ܰᩳ;->᩷:I

    .line 513
    :cond_3
    iget-object v3, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-nez v3, :cond_5

    if-lt p1, v1, :cond_4

    iget-object v1, p0, Ll/۟ܰᩳ;->ۢ:[J

    if-nez v1, :cond_5

    :cond_4
    iget v1, p0, Ll/۟ܰᩳ;->᩷:I

    .line 514
    invoke-virtual {p0, p1}, Ll/۟ܰᩳ;->ܽ(I)I

    move-result v3

    add-int/2addr v1, v3

    if-ne v0, v1, :cond_5

    goto/16 :goto_4

    .line 515
    :cond_5
    iget-object v1, p0, Ll/۟ܰᩳ;->ۡ:[I

    if-nez v1, :cond_d

    iget v1, p0, Ll/۟ܰᩳ;->֡:I

    if-ne p1, v1, :cond_d

    if-lez v1, :cond_d

    .line 516
    iget v3, p0, Ll/۟ܰᩳ;->᩷:I

    const/4 v4, 0x1

    sub-int/2addr v1, v4

    invoke-virtual {p0, v1}, Ll/۟ܰᩳ;->ܽ(I)I

    move-result v1

    add-int/2addr v3, v1

    sub-int v1, v0, v3

    if-eqz v1, :cond_6

    if-ne v1, v4, :cond_d

    .line 518
    :cond_6
    iget-object v0, p0, Ll/۟ܰᩳ;->ۢ:[J

    if-nez v0, :cond_7

    iget v3, p0, Ll/۟ܰᩳ;->֡:I

    if-ne v3, v4, :cond_7

    .line 519
    iput v1, p0, Ll/۟ܰᩳ;->ۖ:I

    goto/16 :goto_4

    :cond_7
    const-wide/16 v5, 0x1

    if-nez v0, :cond_a

    .line 540
    iget-object v0, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    array-length v3, v0

    new-array v3, v3, [J

    iput-object v3, p0, Ll/۟ܰᩳ;->ۢ:[J

    .line 541
    array-length v0, v0

    new-array v0, v0, [C

    iput-object v0, p0, Ll/۟ܰᩳ;->ܺ:[C

    const/4 v0, 0x1

    .line 524
    :goto_2
    iget v3, p0, Ll/۟ܰᩳ;->֡:I

    if-ge v0, v3, :cond_9

    iget v3, p0, Ll/۟ܰᩳ;->ۖ:I

    if-ne v3, v4, :cond_8

    iget-object v3, p0, Ll/۟ܰᩳ;->ۢ:[J

    ushr-int/lit8 v7, v0, 0x6

    aget-wide v8, v3, v7

    shl-long v10, v5, v0

    or-long/2addr v8, v10

    aput-wide v8, v3, v7

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_9
    const/4 v0, 0x0

    .line 546
    :goto_3
    iget-object v3, p0, Ll/۟ܰᩳ;->ۢ:[J

    array-length v7, v3

    if-ge v2, v7, :cond_a

    .line 547
    iget-object v7, p0, Ll/۟ܰᩳ;->ܺ:[C

    int-to-char v8, v0

    aput-char v8, v7, v2

    .line 548
    aget-wide v7, v3, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->bitCount(J)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    ushr-int/lit8 v0, p1, 0x6

    and-int/lit8 v2, p1, 0x3f

    if-nez v2, :cond_b

    if-lez v0, :cond_b

    .line 529
    iget-object v2, p0, Ll/۟ܰᩳ;->ܺ:[C

    add-int/lit8 v3, v0, -0x1

    aget-char v7, v2, v3

    iget-object v8, p0, Ll/۟ܰᩳ;->ۢ:[J

    aget-wide v9, v8, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->bitCount(J)I

    move-result v3

    add-int/2addr v3, v7

    int-to-char v3, v3

    aput-char v3, v2, v0

    :cond_b
    if-ne v1, v4, :cond_c

    .line 530
    iget-object v1, p0, Ll/۟ܰᩳ;->ۢ:[J

    aget-wide v2, v1, v0

    shl-long v4, v5, p1

    or-long/2addr v2, v4

    aput-wide v2, v1, v0

    goto :goto_4

    .line 531
    :cond_c
    iget-object v1, p0, Ll/۟ܰᩳ;->ۢ:[J

    aget-wide v2, v1, v0

    shl-long v4, v5, p1

    not-long v4, v4

    and-long/2addr v2, v4

    aput-wide v2, v1, v0

    goto :goto_4

    .line 535
    :cond_d
    invoke-direct {p0}, Ll/۟ܰᩳ;->ܿ()V

    .line 536
    iget-object v1, p0, Ll/۟ܰᩳ;->ۡ:[I

    iget v2, p0, Ll/۟ܰᩳ;->᩷:I

    sub-int/2addr v0, v2

    aput v0, v1, p1

    .line 507
    :goto_4
    invoke-virtual {p2}, Ll/ۨܰᩳ;->ᩳ()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/۟ܰᩳ;->֫(IZ)V

    return-void
.end method

.method public final ᩳ(I)I
    .locals 3

    ushr-int/lit8 v0, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    .line 448
    iget-object v1, p0, Ll/۟ܰᩳ;->᩵:[Ljava/lang/Object;

    aget-object v1, v1, v0

    .line 449
    iget-object v2, p0, Ll/۟ܰᩳ;->ᩴ:[I

    aget v0, v2, v0

    instance-of v2, v1, [C

    if-eqz v2, :cond_0

    check-cast v1, [C

    aget-char p1, v1, p1

    goto :goto_0

    :cond_0
    check-cast v1, [I

    aget p1, v1, p1

    :goto_0
    add-int/2addr v0, p1

    return v0
.end method
