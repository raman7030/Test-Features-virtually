.class public final Ll/ۢۖܿ;
.super Ljava/lang/Object;
.source "M701"


# static fields
.field public static final ۧ:Ll/ۢۖܿ;


# instance fields
.field public final ֫:Ll/ۜۖܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 17
    new-instance v0, Ll/ۢۖܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۢۖܿ;-><init>(Ll/ۜۖܿ;)V

    sput-object v0, Ll/ۢۖܿ;->ۧ:Ll/ۢۖܿ;

    return-void
.end method

.method public constructor <init>(Ll/ۜۖܿ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    return-void
.end method

.method public static ֫(Ll/ۜۖܿ;Ll/ۜۖܿ;IZ)I
    .locals 3

    .line 502
    new-instance v0, Ll/ܿۖܿ;

    invoke-direct {v0, p0, p3}, Ll/ܿۖܿ;-><init>(Ll/ۜۖܿ;Z)V

    .line 503
    new-instance p0, Ll/ܿۖܿ;

    invoke-direct {p0, p1, p3}, Ll/ܿۖܿ;-><init>(Ll/ۜۖܿ;Z)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p2, :cond_6

    .line 506
    invoke-static {v0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object p3

    invoke-static {p0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object v1

    if-ne p3, v1, :cond_1

    invoke-static {v0}, Ll/ܿۖܿ;->֫(Ll/ܿۖܿ;)I

    move-result p3

    invoke-static {p0}, Ll/ܿۖܿ;->֫(Ll/ܿۖܿ;)I

    move-result v1

    if-ne p3, v1, :cond_1

    sub-int p3, p2, p1

    .line 507
    invoke-static {v0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object v1

    iget v1, v1, Ll/ۜۖܿ;->ܽ:I

    invoke-static {v0}, Ll/ܿۖܿ;->֫(Ll/ܿۖܿ;)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    add-int/2addr p1, p3

    if-ne p1, p2, :cond_0

    return p1

    .line 510
    :cond_0
    invoke-virtual {v0}, Ll/ܿۖܿ;->ۧ()V

    .line 511
    invoke-virtual {p0}, Ll/ܿۖܿ;->ۧ()V

    goto :goto_0

    .line 512
    :cond_1
    invoke-static {v0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object p3

    instance-of p3, p3, Ll/ۧۖܿ;

    if-eqz p3, :cond_3

    invoke-static {p0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object p3

    instance-of p3, p3, Ll/ۧۖܿ;

    if-eqz p3, :cond_2

    invoke-static {v0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object p3

    iget p3, p3, Ll/ۜۖܿ;->ܽ:I

    invoke-static {p0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object v1

    iget v1, v1, Ll/ۜۖܿ;->ܽ:I

    if-lt p3, v1, :cond_3

    .line 515
    :cond_2
    invoke-virtual {v0}, Ll/ܿۖܿ;->֫()V

    goto :goto_0

    .line 516
    :cond_3
    invoke-static {p0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object p3

    instance-of p3, p3, Ll/ۧۖܿ;

    if-eqz p3, :cond_4

    .line 517
    invoke-virtual {p0}, Ll/ܿۖܿ;->֫()V

    goto :goto_0

    .line 519
    :cond_4
    invoke-static {v0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object p3

    check-cast p3, Ll/᩻ۖܿ;

    .line 520
    invoke-static {p0}, Ll/ܿۖܿ;->ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;

    move-result-object v1

    check-cast v1, Ll/᩻ۖܿ;

    .line 521
    iget-object p3, p3, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    invoke-static {v0}, Ll/ܿۖܿ;->ۧ(Ll/ܿۖܿ;)I

    move-result v2

    aget-object p3, p3, v2

    iget-object v1, v1, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    invoke-static {p0}, Ll/ܿۖܿ;->ۧ(Ll/ܿۖܿ;)I

    move-result v2

    aget-object v1, v1, v2

    invoke-virtual {p3, v1}, Ll/᩸᩷ܿ;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    goto :goto_1

    :cond_5
    sub-int p3, p2, p1

    .line 522
    invoke-static {v0}, Ll/ܿۖܿ;->ᩳ(Ll/ܿۖܿ;)I

    move-result v1

    invoke-static {p0}, Ll/ܿۖܿ;->ᩳ(Ll/ܿۖܿ;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    add-int/2addr p1, p3

    .line 524
    invoke-virtual {v0, p3}, Ll/ܿۖܿ;->֫(I)V

    .line 525
    invoke-virtual {p0, p3}, Ll/ܿۖܿ;->֫(I)V

    goto/16 :goto_0

    :cond_6
    :goto_1
    return p1
.end method

.method public static bridge synthetic ֫(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;
    .locals 3

    if-lez p0, :cond_1

    const-string v0, "style"

    .line 39
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/high16 p2, -0x80000000

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p0, p2

    .line 41
    new-instance p2, Ll/ۢۖܿ;

    new-instance v1, Ll/᩻ۖܿ;

    filled-new-array {p0}, [I

    move-result-object p0

    const/4 v2, 0x1

    new-array v2, v2, [Ll/᩸᩷ܿ;

    aput-object p1, v2, v0

    invoke-direct {v1, p0, v2}, Ll/᩻ۖܿ;-><init>([I[Ll/᩸᩷ܿ;)V

    invoke-direct {p2, v1}, Ll/ۢۖܿ;-><init>(Ll/ۜۖܿ;)V

    return-object p2

    .line 37
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Non-positive syntax run length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۜۖܿ;)Ll/ۢۖܿ;
    .locals 1

    if-nez p0, :cond_0

    .line 589
    sget-object p0, Ll/ۢۖܿ;->ۧ:Ll/ۢۖܿ;

    return-object p0

    :cond_0
    new-instance v0, Ll/ۢۖܿ;

    invoke-direct {v0, p0}, Ll/ۢۖܿ;-><init>(Ll/ۜۖܿ;)V

    return-object v0
.end method

.method public static ֫(Ll/ۜۖܿ;I)Ll/᩷ۖܿ;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 634
    new-instance p1, Ll/᩷ۖܿ;

    invoke-direct {p1, v0, p0}, Ll/᩷ۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object p1

    .line 635
    :cond_0
    iget v1, p0, Ll/ۜۖܿ;->ܽ:I

    if-ne p1, v1, :cond_1

    new-instance p1, Ll/᩷ۖܿ;

    invoke-direct {p1, p0, v0}, Ll/᩷ۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object p1

    .line 636
    :cond_1
    instance-of v0, p0, Ll/᩻ۖܿ;

    if-eqz v0, :cond_2

    check-cast p0, Ll/᩻ۖܿ;

    .line 637
    new-instance v0, Ll/᩷ۖܿ;

    const/4 v1, 0x0

    invoke-static {p0, v1, p1}, Ll/ۢۖܿ;->֫(Ll/᩻ۖܿ;II)Ll/᩻ۖܿ;

    move-result-object v1

    iget v2, p0, Ll/ۜۖܿ;->ܽ:I

    invoke-static {p0, p1, v2}, Ll/ۢۖܿ;->֫(Ll/᩻ۖܿ;II)Ll/᩻ۖܿ;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/᩷ۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v0

    .line 639
    :cond_2
    check-cast p0, Ll/ۧۖܿ;

    iget-object v0, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    .line 640
    iget v1, v0, Ll/ۜۖܿ;->ܽ:I

    if-ne p1, v1, :cond_3

    new-instance p1, Ll/᩷ۖܿ;

    invoke-direct {p1, v0, p0}, Ll/᩷ۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object p1

    :cond_3
    if-ge p1, v1, :cond_4

    .line 642
    invoke-static {v0, p1}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;I)Ll/᩷ۖܿ;

    move-result-object p1

    .line 643
    new-instance v0, Ll/᩷ۖܿ;

    invoke-static {p1}, Ll/᩷ۖܿ;->֫(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object v1

    invoke-static {p1}, Ll/᩷ۖܿ;->ۧ(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object p1

    invoke-static {p1, p0}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/᩷ۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v0

    :cond_4
    sub-int/2addr p1, v1

    .line 645
    invoke-static {p0, p1}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;I)Ll/᩷ۖܿ;

    move-result-object p0

    .line 646
    new-instance p1, Ll/᩷ۖܿ;

    invoke-static {p0}, Ll/᩷ۖܿ;->֫(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object v0

    invoke-static {p0}, Ll/᩷ۖܿ;->ۧ(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/᩷ۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object p1
.end method

.method public static ֫(Ll/ۜۖܿ;Z)Ll/᩻ۖܿ;
    .locals 1

    .line 745
    :goto_0
    instance-of v0, p0, Ll/ۧۖܿ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ۧۖܿ;

    if-eqz p1, :cond_0

    iget-object p0, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    goto :goto_0

    .line 746
    :cond_1
    check-cast p0, Ll/᩻ۖܿ;

    return-object p0
.end method

.method public static ֫(Ll/᩻ۖܿ;II)Ll/᩻ۖܿ;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 653
    :goto_0
    iget-object v2, p0, Ll/᩻ۖܿ;->ܿ:[I

    iget-object v3, p0, Ll/᩻ۖܿ;->ܿ:[I

    aget v2, v2, v1

    const v4, 0x7fffffff

    and-int v5, v2, v4

    add-int/2addr v5, v0

    if-gt v5, p1, :cond_0

    add-int/lit8 v1, v1, 0x1

    and-int/2addr v2, v4

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    and-int/2addr v2, v4

    add-int/2addr v2, v0

    move v5, v1

    :goto_1
    if-ge v2, p2, :cond_1

    add-int/lit8 v5, v5, 0x1

    .line 658
    aget v6, v3, v5

    and-int/2addr v6, v4

    add-int/2addr v2, v6

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 659
    invoke-static {v3, v1, v5}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v2

    .line 660
    iget-object p0, p0, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    invoke-static {p0, v1, v5}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩸᩷ܿ;

    const/4 v1, 0x0

    .line 661
    :goto_2
    array-length v3, v2

    if-ge v1, v3, :cond_3

    .line 662
    aget v3, v2, v1

    and-int v5, v3, v4

    add-int/2addr v5, v0

    .line 664
    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    sub-int/2addr v6, v7

    if-gt p1, v0, :cond_2

    const/high16 v0, -0x80000000

    and-int/2addr v0, v3

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    :goto_3
    or-int/2addr v0, v6

    .line 665
    aput v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    move v0, v5

    goto :goto_2

    .line 668
    :cond_3
    new-instance p1, Ll/᩻ۖܿ;

    invoke-direct {p1, v2, p0}, Ll/᩻ۖܿ;-><init>([I[Ll/᩸᩷ܿ;)V

    return-object p1
.end method

.method public static ֫(Ll/ۜۖܿ;II)Z
    .locals 7

    .line 614
    iget-boolean v0, p0, Ll/ۜۖܿ;->֫:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 615
    iget v2, p0, Ll/ۜۖܿ;->ܽ:I

    if-ne p2, v2, :cond_1

    goto :goto_0

    .line 616
    :cond_1
    instance-of v2, p0, Ll/ۧۖܿ;

    if-eqz v2, :cond_3

    check-cast p0, Ll/ۧۖܿ;

    .line 617
    iget-object v2, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    iget v3, v2, Ll/ۜۖܿ;->ܽ:I

    if-ge p1, v3, :cond_2

    .line 618
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v2, p1, v4}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;II)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    if-le p2, v3, :cond_6

    .line 621
    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    sub-int/2addr p1, v3

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int/2addr p2, v3

    invoke-static {p0, p1, p2}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;II)Z

    move-result p0

    if-eqz p0, :cond_6

    :goto_0
    return v0

    .line 623
    :cond_3
    check-cast p0, Ll/᩻ۖܿ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 625
    :goto_1
    iget v4, p0, Ll/ۜۖܿ;->ᩳ:I

    if-ge v2, v4, :cond_6

    if-ge v3, p2, :cond_6

    .line 626
    iget-object v4, p0, Ll/᩻ۖܿ;->ܿ:[I

    aget v4, v4, v2

    const v5, 0x7fffffff

    and-int/2addr v4, v5

    add-int/2addr v3, v4

    if-le v3, p1, :cond_5

    .line 627
    iget-object v4, p0, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    aget-object v4, v4, v2

    .line 601
    invoke-virtual {v4}, Ll/᩸᩷ܿ;->ܽ()I

    move-result v5

    ushr-int/lit8 v5, v5, 0x18

    const/4 v6, 0x6

    if-eq v5, v6, :cond_4

    invoke-virtual {v4}, Ll/᩸᩷ܿ;->ᩴ()I

    move-result v4

    ushr-int/lit8 v4, v4, 0x18

    if-ne v4, v6, :cond_5

    :cond_4
    return v0

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    return v1
.end method

.method public static ۧ(Ll/ۜۖܿ;Z)Ll/ۜۖܿ;
    .locals 1

    .line 751
    instance-of v0, p0, Ll/᩻ۖܿ;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 752
    :cond_0
    check-cast p0, Ll/ۧۖܿ;

    if-eqz p1, :cond_1

    .line 753
    iget-object p1, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Z)Ll/ۜۖܿ;

    move-result-object p1

    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    invoke-static {p1, p0}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p0

    return-object p0

    .line 754
    :cond_1
    iget-object p1, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Z)Ll/ۜۖܿ;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۧۖܿ;
    .locals 4

    .line 774
    iget v0, p0, Ll/ۜۖܿ;->ۧ:I

    iget v1, p1, Ll/ۜۖܿ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    if-le v0, v2, :cond_1

    .line 775
    check-cast p0, Ll/ۧۖܿ;

    .line 776
    iget-object v0, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    iget v1, v0, Ll/ۜۖܿ;->ۧ:I

    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    iget v2, p0, Ll/ۜۖܿ;->ۧ:I

    if-lt v1, v2, :cond_0

    .line 777
    new-instance v1, Ll/ۧۖܿ;

    new-instance v2, Ll/ۧۖܿ;

    invoke-direct {v2, p0, p1}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    invoke-direct {v1, v0, v2}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v1

    .line 779
    :cond_0
    check-cast p0, Ll/ۧۖܿ;

    .line 780
    new-instance v1, Ll/ۧۖܿ;

    new-instance v2, Ll/ۧۖܿ;

    iget-object v3, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    invoke-direct {v2, v0, v3}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    new-instance v0, Ll/ۧۖܿ;

    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    invoke-direct {v0, p0, p1}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    invoke-direct {v1, v2, v0}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_3

    .line 783
    check-cast p1, Ll/ۧۖܿ;

    iget-object v0, p1, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    .line 784
    iget v1, v0, Ll/ۜۖܿ;->ۧ:I

    iget-object p1, p1, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    iget v2, p1, Ll/ۜۖܿ;->ۧ:I

    if-lt v1, v2, :cond_2

    .line 785
    new-instance v1, Ll/ۧۖܿ;

    new-instance v2, Ll/ۧۖܿ;

    invoke-direct {v2, p0, p1}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    invoke-direct {v1, v2, v0}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v1

    .line 787
    :cond_2
    check-cast p1, Ll/ۧۖܿ;

    .line 788
    new-instance v1, Ll/ۧۖܿ;

    new-instance v2, Ll/ۧۖܿ;

    iget-object v3, p1, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    invoke-direct {v2, p0, v3}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    new-instance p0, Ll/ۧۖܿ;

    iget-object p1, p1, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    invoke-direct {p0, p1, v0}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    invoke-direct {v1, v2, p0}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v1

    .line 790
    :cond_3
    new-instance v0, Ll/ۧۖܿ;

    invoke-direct {v0, p0, p1}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v0
.end method

.method public static ܽ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-nez v1, :cond_1

    return-object v0

    :cond_1
    const/4 v2, 0x0

    .line 678
    invoke-static {v0, v2}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;Z)Ll/᩻ۖܿ;

    move-result-object v3

    const/4 v4, 0x1

    .line 679
    invoke-static {v1, v4}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;Z)Ll/᩻ۖܿ;

    move-result-object v5

    .line 680
    iget-object v6, v5, Ll/᩻ۖܿ;->ܿ:[I

    aget v6, v6, v2

    if-ltz v6, :cond_2

    iget-object v6, v3, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    iget v7, v3, Ll/ۜۖܿ;->ᩳ:I

    sub-int/2addr v7, v4

    aget-object v6, v6, v7

    iget-object v7, v5, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    aget-object v7, v7, v2

    invoke-virtual {v6, v7}, Ll/᩸᩷ܿ;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    .line 681
    :goto_0
    iget v7, v3, Ll/ۜۖܿ;->ᩳ:I

    iget v8, v5, Ll/ۜۖܿ;->ᩳ:I

    add-int v9, v7, v8

    sub-int/2addr v9, v6

    const/16 v10, 0x80

    const/16 v11, 0x40

    if-nez v6, :cond_3

    if-le v9, v10, :cond_3

    if-lt v7, v11, :cond_3

    if-lt v8, v11, :cond_3

    .line 684
    invoke-static/range {p0 .. p1}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object v0

    return-object v0

    :cond_3
    const/4 v6, 0x4

    new-array v6, v6, [Ll/᩻ۖܿ;

    aput-object v3, v6, v2

    aput-object v5, v6, v4

    .line 690
    invoke-static {v0, v2}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Z)Ll/ۜۖܿ;

    move-result-object v0

    .line 691
    invoke-static {v1, v4}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Z)Ll/ۜۖܿ;

    move-result-object v1

    const/4 v3, 0x2

    :goto_1
    if-ge v9, v11, :cond_6

    if-nez v0, :cond_4

    if-eqz v1, :cond_6

    :cond_4
    if-eqz v0, :cond_5

    .line 694
    invoke-static {v0, v2}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;Z)Ll/᩻ۖܿ;

    move-result-object v5

    .line 695
    invoke-static {v6, v2, v6, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v5, v6, v2

    .line 697
    invoke-static {v0, v2}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Z)Ll/ۜۖܿ;

    move-result-object v0

    .line 698
    iget v5, v5, Ll/ۜۖܿ;->ᩳ:I

    goto :goto_2

    .line 700
    :cond_5
    invoke-static {v1, v4}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;Z)Ll/᩻ۖܿ;

    move-result-object v5

    .line 701
    aput-object v5, v6, v3

    .line 702
    invoke-static {v1, v4}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Z)Ll/ۜۖܿ;

    move-result-object v1

    .line 703
    iget v5, v5, Ll/ۜۖܿ;->ᩳ:I

    :goto_2
    add-int/2addr v9, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    if-gt v9, v10, :cond_7

    move v2, v9

    goto :goto_3

    .line 712
    :cond_7
    div-int/lit8 v2, v9, 0x2

    .line 713
    :goto_3
    new-array v4, v2, [I

    .line 714
    new-array v5, v2, [Ll/᩸᩷ܿ;

    const/4 v7, 0x0

    if-ne v9, v2, :cond_8

    move-object v8, v7

    goto :goto_4

    :cond_8
    sub-int v8, v9, v2

    .line 715
    new-array v8, v8, [I

    :goto_4
    if-ne v9, v2, :cond_9

    move-object v9, v7

    goto :goto_5

    :cond_9
    sub-int/2addr v9, v2

    .line 716
    new-array v9, v9, [Ll/᩸᩷ܿ;

    :goto_5
    const/4 v10, -0x1

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v3, :cond_11

    .line 720
    aget-object v12, v6, v11

    const/4 v13, 0x0

    .line 721
    :goto_7
    iget v14, v12, Ll/ۜۖܿ;->ᩳ:I

    if-ge v13, v14, :cond_10

    .line 722
    iget-object v14, v12, Ll/᩻ۖܿ;->ܿ:[I

    aget v14, v14, v13

    .line 723
    iget-object v15, v12, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    aget-object v15, v15, v13

    if-ltz v10, :cond_a

    if-ltz v14, :cond_a

    .line 724
    invoke-virtual {v7, v15}, Ll/᩸᩷ܿ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/4 v7, 0x1

    goto :goto_8

    :cond_a
    const/4 v7, 0x0

    :goto_8
    if-nez v7, :cond_b

    add-int/lit8 v10, v10, 0x1

    :cond_b
    if-ge v10, v2, :cond_c

    move/from16 v16, v10

    goto :goto_9

    :cond_c
    sub-int v16, v10, v2

    :goto_9
    if-ge v10, v2, :cond_d

    move-object/from16 v17, v4

    goto :goto_a

    :cond_d
    move-object/from16 v17, v8

    :goto_a
    if-ge v10, v2, :cond_e

    move-object/from16 v18, v5

    goto :goto_b

    :cond_e
    move-object/from16 v18, v9

    :goto_b
    if-eqz v7, :cond_f

    .line 730
    aget v7, v17, v16

    const/high16 v18, -0x80000000

    and-int v18, v7, v18

    const v19, 0x7fffffff

    and-int v7, v7, v19

    and-int v14, v14, v19

    add-int/2addr v7, v14

    or-int v7, v18, v7

    aput v7, v17, v16

    goto :goto_c

    .line 733
    :cond_f
    aput v14, v17, v16

    .line 734
    aput-object v15, v18, v16

    :goto_c
    add-int/lit8 v13, v13, 0x1

    move-object v7, v15

    goto :goto_7

    :cond_10
    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 739
    :cond_11
    new-instance v2, Ll/᩻ۖܿ;

    invoke-direct {v2, v4, v5}, Ll/᩻ۖܿ;-><init>([I[Ll/᩸᩷ܿ;)V

    if-nez v8, :cond_12

    goto :goto_d

    .line 740
    :cond_12
    new-instance v3, Ll/ۧۖܿ;

    new-instance v4, Ll/᩻ۖܿ;

    invoke-direct {v4, v8, v9}, Ll/᩻ۖܿ;-><init>([I[Ll/᩸᩷ܿ;)V

    invoke-direct {v3, v2, v4}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    move-object v2, v3

    .line 707
    :goto_d
    invoke-static {v0, v2}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic ܽ(Ll/ۢۖܿ;)Ll/ۜۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    return-object p0
.end method

.method public static ܽ()Ll/ۢۖܿ;
    .locals 1

    .line 28
    sget-object v0, Ll/ۢۖܿ;->ۧ:Ll/ۢۖܿ;

    return-object v0
.end method

.method public static ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;
    .locals 3

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    .line 761
    :cond_1
    iget v0, p0, Ll/ۜۖܿ;->ۧ:I

    iget v1, p1, Ll/ۜۖܿ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    if-le v0, v2, :cond_2

    .line 762
    check-cast p0, Ll/ۧۖܿ;

    .line 763
    iget-object v0, p0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    iget-object p0, p0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    invoke-static {p0, p1}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۧۖܿ;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_3

    .line 766
    check-cast p1, Ll/ۧۖܿ;

    .line 767
    iget-object v0, p1, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    invoke-static {p0, v0}, Ll/ۢۖܿ;->ᩳ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p0

    iget-object p1, p1, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    invoke-static {p0, p1}, Ll/ۢۖܿ;->ۧ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۧۖܿ;

    move-result-object p0

    return-object p0

    .line 769
    :cond_3
    new-instance v0, Ll/ۧۖܿ;

    invoke-direct {v0, p0, p1}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Ll/ۜۖܿ;->ܽ:I

    return v0
.end method

.method public final ֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;
    .locals 6

    .line 131
    iget-object v0, p3, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    .line 132
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    invoke-static {p1, p2, v1}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 133
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    sub-int v2, p2, p1

    sub-int/2addr v1, v2

    invoke-virtual {p3}, Ll/ۢۖܿ;->֫()I

    move-result v2

    int-to-long v3, v1

    int-to-long v1, v2

    add-long/2addr v3, v1

    long-to-int v1, v3

    int-to-long v1, v1

    cmp-long v5, v3, v1

    if-nez v5, :cond_3

    if-ne p1, p2, :cond_0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 135
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-ne p2, v1, :cond_1

    return-object p3

    .line 136
    :cond_1
    iget-object p3, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    invoke-static {p3, p2}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;I)Ll/᩷ۖܿ;

    move-result-object p2

    .line 137
    invoke-static {p2}, Ll/᩷ۖܿ;->֫(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object p3

    invoke-static {p3, p1}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;I)Ll/᩷ۖܿ;

    move-result-object p1

    invoke-static {p1}, Ll/᩷ۖܿ;->֫(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object p1

    .line 138
    invoke-static {p1, v0}, Ll/ۢۖܿ;->ܽ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p1

    invoke-static {p2}, Ll/᩷ۖܿ;->ۧ(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۢۖܿ;->ܽ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p1

    if-nez p1, :cond_2

    .line 589
    sget-object p1, Ll/ۢۖܿ;->ۧ:Ll/ۢۖܿ;

    return-object p1

    :cond_2
    new-instance p2, Ll/ۢۖܿ;

    invoke-direct {p2, p1}, Ll/ۢۖܿ;-><init>(Ll/ۜۖܿ;)V

    return-object p2

    .line 0
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۢۖܿ;)Ll/ۢۖܿ;
    .locals 6

    const-string v0, "suffix"

    .line 122
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 123
    iget-object v0, p1, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    if-nez v0, :cond_0

    return-object p0

    .line 124
    :cond_0
    iget-object v1, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    if-nez v1, :cond_1

    return-object p1

    .line 125
    :cond_1
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v2

    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result p1

    int-to-long v2, v2

    int-to-long v4, p1

    add-long/2addr v2, v4

    long-to-int p1, v2

    int-to-long v4, p1

    cmp-long p1, v2, v4

    if-nez p1, :cond_3

    .line 126
    invoke-static {v1, v0}, Ll/ۢۖܿ;->ܽ(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object p1

    if-nez p1, :cond_2

    .line 589
    sget-object p1, Ll/ۢۖܿ;->ۧ:Ll/ۢۖܿ;

    return-object p1

    :cond_2
    new-instance v0, Ll/ۢۖܿ;

    invoke-direct {v0, p1}, Ll/ۢۖܿ;-><init>(Ll/ۜۖܿ;)V

    return-object v0

    .line 0
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ֫(I)Ll/᩸᩷ܿ;
    .locals 4

    .line 65
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 66
    iget-object v0, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    .line 67
    :goto_0
    instance-of v1, v0, Ll/ۧۖܿ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۧۖܿ;

    .line 68
    iget-object v1, v0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    iget v2, v1, Ll/ۜۖܿ;->ܽ:I

    if-ge p1, v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v2

    .line 71
    iget-object v0, v0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    goto :goto_0

    .line 74
    :cond_1
    check-cast v0, Ll/᩻ۖܿ;

    const/4 v1, 0x0

    .line 76
    :goto_1
    iget-object v2, v0, Ll/᩻ۖܿ;->ܿ:[I

    aget v2, v2, v1

    const v3, 0x7fffffff

    and-int/2addr v2, v3

    if-ge p1, v2, :cond_2

    .line 77
    iget-object p1, v0, Ll/᩻ۖܿ;->ܳ:[Ll/᩸᩷ܿ;

    aget-object p1, p1, v1

    return-object p1

    :cond_2
    sub-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public final ֫(II)Z
    .locals 1

    .line 59
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    if-ge p1, p2, :cond_0

    .line 60
    iget-object v0, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    invoke-static {v0, p1, p2}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;II)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Ll/ۜۖܿ;->ᩳ:I

    return v0
.end method

.method public final ۧ(II)Ll/ۢۖܿ;
    .locals 2

    .line 104
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 105
    sget-object v0, Ll/ۢۖܿ;->ۧ:Ll/ۢۖܿ;

    if-ne p1, p2, :cond_0

    return-object v0

    :cond_0
    if-nez p1, :cond_1

    .line 106
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-ne p2, v1, :cond_1

    return-object p0

    .line 107
    :cond_1
    iget-object v1, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    invoke-static {v1, p2}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;I)Ll/᩷ۖܿ;

    move-result-object p2

    invoke-static {p2}, Ll/᩷ۖܿ;->֫(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object p2

    .line 108
    invoke-static {p2, p1}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;I)Ll/᩷ۖܿ;

    move-result-object p1

    invoke-static {p1}, Ll/᩷ۖܿ;->ۧ(Ll/᩷ۖܿ;)Ll/ۜۖܿ;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v0

    .line 589
    :cond_2
    new-instance p2, Ll/ۢۖܿ;

    invoke-direct {p2, p1}, Ll/ۢۖܿ;-><init>(Ll/ۜۖܿ;)V

    return-object p2
.end method

.method public final ۧ(Ll/ۢۖܿ;)Ll/ܳۖܿ;
    .locals 7

    const-string v0, "other"

    .line 159
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    iget-object v0, p1, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۢۖܿ;->֫:Ll/ۜۖܿ;

    if-ne v2, v0, :cond_0

    return-object v1

    .line 161
    :cond_0
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v3

    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    goto :goto_0

    .line 162
    :cond_1
    invoke-static {v2, v0, v3, v4}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;Ll/ۜۖܿ;IZ)I

    move-result v4

    .line 164
    :goto_0
    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v5

    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v6

    if-eq v5, v6, :cond_2

    new-instance v0, Ll/ܳۖܿ;

    invoke-virtual {p0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {v0, v4, p1}, Ll/ܳۖܿ;-><init>(II)V

    return-object v0

    :cond_2
    if-ne v4, v3, :cond_3

    return-object v1

    :cond_3
    sub-int p1, v3, v4

    const/4 v1, 0x1

    .line 166
    invoke-static {v2, v0, p1, v1}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;Ll/ۜۖܿ;IZ)I

    move-result p1

    .line 167
    new-instance v0, Ll/ܳۖܿ;

    sub-int/2addr v3, p1

    invoke-direct {v0, v4, v3}, Ll/ܳۖܿ;-><init>(II)V

    return-object v0
.end method
