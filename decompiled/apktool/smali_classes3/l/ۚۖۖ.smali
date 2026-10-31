.class public final Ll/ۚۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"


# instance fields
.field public final ۗ:[Ll/֡ۖۖ;

.field public final ۙ:[Ll/ۢۖۖ;

.field public final ۛ:[Ll/ۚۖۖ;

.field public ۤ:Ll/ۤۡۖ;

.field public final ۨ:[Ll/᩸ۖۖ;

.field public final ۫:Ll/᩻ۖۖ;

.field public final ۬:[Ll/ᩳۖۖ;

.field public final ᩶:[Ll/ۚۖۖ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ᩳۖۖ;)V
    .locals 5

    const/4 v0, 0x0

    .line 610
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    const/4 v1, 0x0

    .line 611
    iput-object v1, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 612
    new-instance v1, Ll/᩻ۖۖ;

    new-array v2, v0, [Ll/ۚۖۖ;

    invoke-direct {v1, v2}, Ll/᩻ۖۖ;-><init>([Ll/ۚۖۖ;)V

    iput-object v1, p0, Ll/ۚۖۖ;->۫:Ll/᩻ۖۖ;

    .line 614
    invoke-static {}, Ll/ۤۡۖ;->newBuilder()Ll/۫ۡۖ;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    invoke-virtual {p2}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".placeholder.proto"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/۫ۡۖ;->֫(Ljava/lang/String;)V

    .line 616
    invoke-virtual {v2, p1}, Ll/۫ۡۖ;->ۧ(Ljava/lang/String;)V

    .line 617
    invoke-virtual {p2}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/۫ۡۖ;->֫(Ll/᩶᩷ۖ;)V

    .line 2231
    invoke-virtual {v2}, Ll/۫ۡۖ;->buildPartial()Ll/ۤۡۖ;

    move-result-object v2

    .line 2232
    invoke-virtual {v2}, Ll/ۤۡۖ;->isInitialized()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 618
    iput-object v2, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    new-array v2, v0, [Ll/ۚۖۖ;

    .line 619
    iput-object v2, p0, Ll/ۚۖۖ;->᩶:[Ll/ۚۖۖ;

    new-array v2, v0, [Ll/ۚۖۖ;

    .line 620
    iput-object v2, p0, Ll/ۚۖۖ;->ۛ:[Ll/ۚۖۖ;

    const/4 v2, 0x1

    new-array v2, v2, [Ll/ᩳۖۖ;

    aput-object p2, v2, v0

    .line 622
    iput-object v2, p0, Ll/ۚۖۖ;->۬:[Ll/ᩳۖۖ;

    .line 623
    invoke-static {}, Ll/᩹ۖۖ;->ܿ()[Ll/ۢۖۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۖۖ;->ۙ:[Ll/ۢۖۖ;

    .line 624
    invoke-static {}, Ll/᩹ۖۖ;->ܳ()[Ll/᩸ۖۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۖۖ;->ۨ:[Ll/᩸ۖۖ;

    .line 625
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۖۖ;->ۗ:[Ll/֡ۖۖ;

    .line 627
    invoke-virtual {v1, p0, p1}, Ll/᩻ۖۖ;->֫(Ll/ۚۖۖ;Ljava/lang/String;)V

    .line 628
    invoke-virtual {v1, p2}, Ll/᩻ۖۖ;->֫(Ll/֨ۖۖ;)V

    return-void

    .line 2233
    :cond_0
    invoke-static {v2}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object p1

    throw p1
.end method

.method public constructor <init>(Ll/ۤۡۖ;[Ll/ۚۖۖ;Ll/᩻ۖۖ;)V
    .locals 7

    const/4 v0, 0x0

    .line 546
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 547
    iput-object p3, p0, Ll/ۚۖۖ;->۫:Ll/᩻ۖۖ;

    .line 548
    iput-object p1, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    .line 549
    invoke-virtual {p2}, [Ll/ۚۖۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۚۖۖ;

    iput-object v0, p0, Ll/ۚۖۖ;->᩶:[Ll/ۚۖۖ;

    .line 550
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 551
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p2, v2

    .line 167
    iget-object v4, v3, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v4}, Ll/ۤۡۖ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 552
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 554
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 555
    :goto_1
    invoke-virtual {p1}, Ll/ۤۡۖ;->ᩴ()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 556
    invoke-virtual {p1, v1}, Ll/ۤۡۖ;->ܿ(I)I

    move-result v2

    if-ltz v2, :cond_2

    .line 557
    invoke-virtual {p1}, Ll/ۤۡۖ;->ۜ()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 560
    invoke-virtual {p1, v2}, Ll/ۤۡۖ;->֫(I)Ljava/lang/String;

    move-result-object v2

    .line 561
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۖۖ;

    if-nez v2, :cond_1

    goto :goto_2

    .line 568
    :cond_1
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 558
    :cond_2
    new-instance p1, Ll/ۜۖۖ;

    const-string p2, "Invalid public dependency index."

    invoke-direct {p1, p0, p2}, Ll/ۜۖۖ;-><init>(Ll/ۚۖۖ;Ljava/lang/String;)V

    throw p1

    .line 571
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ll/ۚۖۖ;

    iput-object v0, p0, Ll/ۚۖۖ;->ۛ:[Ll/ۚۖۖ;

    .line 572
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 187
    iget-object p2, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {p2}, Ll/ۤۡۖ;->ۘ()Ljava/lang/String;

    move-result-object p2

    .line 574
    invoke-virtual {p3, p0, p2}, Ll/᩻ۖۖ;->֫(Ll/ۚۖۖ;Ljava/lang/String;)V

    .line 577
    invoke-virtual {p1}, Ll/ۤۡۖ;->ܺ()I

    move-result p2

    if-lez p2, :cond_4

    .line 578
    invoke-virtual {p1}, Ll/ۤۡۖ;->ܺ()I

    move-result p2

    new-array p2, p2, [Ll/ᩳۖۖ;

    goto :goto_3

    .line 579
    :cond_4
    invoke-static {}, Ll/᩹ۖۖ;->ܽ()[Ll/ᩳۖۖ;

    move-result-object p2

    :goto_3
    iput-object p2, p0, Ll/ۚۖۖ;->۬:[Ll/ᩳۖۖ;

    const/4 p2, 0x0

    .line 580
    :goto_4
    invoke-virtual {p1}, Ll/ۤۡۖ;->ܺ()I

    move-result p3

    if-ge p2, p3, :cond_5

    .line 581
    iget-object p3, p0, Ll/ۚۖۖ;->۬:[Ll/ᩳۖۖ;

    new-instance v0, Ll/ᩳۖۖ;

    invoke-virtual {p1, p2}, Ll/ۤۡۖ;->ᩳ(I)Ll/᩶᩷ۖ;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ll/ᩳۖۖ;-><init>(Ll/᩶᩷ۖ;Ll/ۚۖۖ;)V

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    .line 585
    :cond_5
    invoke-virtual {p1}, Ll/ۤۡۖ;->ۢ()I

    move-result p2

    if-lez p2, :cond_6

    .line 586
    invoke-virtual {p1}, Ll/ۤۡۖ;->ۢ()I

    move-result p2

    new-array p2, p2, [Ll/ۢۖۖ;

    goto :goto_5

    .line 587
    :cond_6
    invoke-static {}, Ll/᩹ۖۖ;->ܿ()[Ll/ۢۖۖ;

    move-result-object p2

    :goto_5
    iput-object p2, p0, Ll/ۚۖۖ;->ۙ:[Ll/ۢۖۖ;

    const/4 p2, 0x0

    .line 588
    :goto_6
    invoke-virtual {p1}, Ll/ۤۡۖ;->ۢ()I

    move-result p3

    if-ge p2, p3, :cond_7

    .line 589
    iget-object p3, p0, Ll/ۚۖۖ;->ۙ:[Ll/ۢۖۖ;

    new-instance v0, Ll/ۢۖۖ;

    invoke-virtual {p1, p2}, Ll/ۤۡۖ;->ۧ(I)Ll/᩺᩷ۖ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Ll/ۢۖۖ;-><init>(Ll/᩺᩷ۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;)V

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    .line 593
    :cond_7
    invoke-virtual {p1}, Ll/ۤۡۖ;->᩵()I

    move-result p2

    if-lez p2, :cond_8

    .line 594
    invoke-virtual {p1}, Ll/ۤۡۖ;->᩵()I

    move-result p2

    new-array p2, p2, [Ll/᩸ۖۖ;

    goto :goto_7

    .line 595
    :cond_8
    invoke-static {}, Ll/᩹ۖۖ;->ܳ()[Ll/᩸ۖۖ;

    move-result-object p2

    :goto_7
    iput-object p2, p0, Ll/ۚۖۖ;->ۨ:[Ll/᩸ۖۖ;

    const/4 p2, 0x0

    .line 596
    :goto_8
    invoke-virtual {p1}, Ll/ۤۡۖ;->᩵()I

    move-result p3

    if-ge p2, p3, :cond_9

    .line 597
    iget-object p3, p0, Ll/ۚۖۖ;->ۨ:[Ll/᩸ۖۖ;

    new-instance v0, Ll/᩸ۖۖ;

    invoke-virtual {p1, p2}, Ll/ۤۡۖ;->ܳ(I)Ll/۠ܺۖ;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ll/᩸ۖۖ;-><init>(Ll/۠ܺۖ;Ll/ۚۖۖ;)V

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    .line 601
    :cond_9
    invoke-virtual {p1}, Ll/ۤۡۖ;->ۡ()I

    move-result p2

    if-lez p2, :cond_a

    .line 602
    invoke-virtual {p1}, Ll/ۤۡۖ;->ۡ()I

    move-result p2

    new-array p2, p2, [Ll/֡ۖۖ;

    goto :goto_9

    .line 603
    :cond_a
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object p2

    :goto_9
    iput-object p2, p0, Ll/ۚۖۖ;->ۗ:[Ll/֡ۖۖ;

    const/4 p2, 0x0

    .line 604
    :goto_a
    invoke-virtual {p1}, Ll/ۤۡۖ;->ۡ()I

    move-result p3

    if-ge p2, p3, :cond_b

    .line 605
    iget-object p3, p0, Ll/ۚۖۖ;->ۗ:[Ll/֡ۖۖ;

    new-instance v6, Ll/֡ۖۖ;

    invoke-virtual {p1, p2}, Ll/ۤۡۖ;->ܽ(I)Ll/᩷ۡۖ;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    move-object v2, p0

    move v4, p2

    invoke-direct/range {v0 .. v5}, Ll/֡ۖۖ;-><init>(Ll/᩷ۡۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;IZ)V

    aput-object v6, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_a

    :cond_b
    return-void
.end method

.method public static ֫(Ll/ۤۡۖ;[Ll/ۚۖۖ;)Ll/ۚۖۖ;
    .locals 4

    .line 405
    new-instance v0, Ll/᩻ۖۖ;

    invoke-direct {v0, p1}, Ll/᩻ۖۖ;-><init>([Ll/ۚۖۖ;)V

    .line 406
    new-instance v1, Ll/ۚۖۖ;

    invoke-direct {v1, p0, p1, v0}, Ll/ۚۖۖ;-><init>(Ll/ۤۡۖ;[Ll/ۚۖۖ;Ll/᩻ۖۖ;)V

    .line 706
    iget-object p0, v1, Ll/ۚۖۖ;->۬:[Ll/ᩳۖۖ;

    array-length p1, p0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, p0, v2

    .line 707
    invoke-static {v3}, Ll/ᩳۖۖ;->ۧ(Ll/ᩳۖۖ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 710
    :cond_0
    iget-object p0, v1, Ll/ۚۖۖ;->ۨ:[Ll/᩸ۖۖ;

    array-length p1, p0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    aget-object v3, p0, v2

    .line 711
    invoke-static {v3}, Ll/᩸ۖۖ;->ۧ(Ll/᩸ۖۖ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 714
    :cond_1
    iget-object p0, v1, Ll/ۚۖۖ;->ۗ:[Ll/֡ۖۖ;

    array-length p1, p0

    :goto_2
    if-ge v0, p1, :cond_2

    aget-object v2, p0, v0

    .line 715
    invoke-static {v2}, Ll/֡ۖۖ;->ۧ(Ll/֡ۖۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-object v1
.end method

.method public static ֫([Ljava/lang/String;[Ll/ۚۖۖ;)Ll/ۚۖۖ;
    .locals 4

    .line 428
    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 429
    aget-object p0, p0, v2

    sget-object v0, Ll/ܰᩴۖ;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    goto :goto_1

    .line 431
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 432
    array-length v1, p0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    .line 433
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 435
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ll/ܰᩴۖ;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 466
    :goto_1
    :try_start_0
    invoke-static {p0}, Ll/ۤۡۖ;->parseFrom([B)Ll/ۤۡۖ;

    move-result-object p0
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_1

    .line 475
    :try_start_1
    invoke-static {p0, p1}, Ll/ۚۖۖ;->֫(Ll/ۤۡۖ;[Ll/ۚۖۖ;)Ll/ۚۖۖ;

    move-result-object p0
    :try_end_1
    .catch Ll/ۜۖۖ; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 477
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid embedded descriptor for \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 478
    invoke-virtual {p0}, Ll/ۤۡۖ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    .line 468
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to parse protocol buffer descriptor for generated code."

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;
    .locals 0

    .line 157
    iget-object p0, p0, Ll/ۚۖۖ;->۫:Ll/᩻ۖۖ;

    return-object p0
.end method

.method private ᩹()V
    .locals 6

    .line 644
    iget-object v0, p0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    move-object v0, p0

    .line 648
    monitor-enter v0

    .line 649
    :try_start_0
    iget-object v1, p0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    if-eqz v1, :cond_1

    .line 650
    monitor-exit v0

    return-void

    .line 652
    :cond_1
    iget-object v1, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v1}, Ll/ۤۡۖ;->ۖ()Ll/۟ۡۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۡۖ;->ᩴ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    .line 654
    iget-object v1, p0, Ll/ۚۖۖ;->۬:[Ll/ᩳۖۖ;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    .line 655
    invoke-static {v5}, Ll/ᩳۖۖ;->֫(Ll/ᩳۖۖ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 658
    :cond_2
    iget-object v1, p0, Ll/ۚۖۖ;->ۙ:[Ll/ۢۖۖ;

    array-length v2, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_3

    aget-object v5, v1, v4

    .line 659
    invoke-static {v5}, Ll/ۢۖۖ;->֫(Ll/ۢۖۖ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 662
    :cond_3
    iget-object v1, p0, Ll/ۚۖۖ;->ۨ:[Ll/᩸ۖۖ;

    array-length v2, v1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v2, :cond_4

    aget-object v5, v1, v4

    .line 663
    invoke-static {v5}, Ll/᩸ۖۖ;->֫(Ll/᩸ۖۖ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 666
    :cond_4
    iget-object v1, p0, Ll/ۚۖۖ;->ۗ:[Ll/֡ۖۖ;

    array-length v2, v1

    :goto_3
    if-ge v3, v2, :cond_5

    aget-object v4, v1, v3

    .line 667
    invoke-static {v4}, Ll/֡ۖۖ;->֫(Ll/֡ۖۖ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 669
    :cond_5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v0}, Ll/ۤۡۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/util/List;
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ۚۖۖ;->ۙ:[Ll/ۢۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Ljava/util/List;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۚۖۖ;->۬:[Ll/ᩳۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ()Ljava/util/List;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ۚۖۖ;->ۗ:[Ll/֡ۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v0}, Ll/ۤۡۖ;->ۘ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/ۤۡۖ;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    return-object v0
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    return-object v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 0

    return-object p0
.end method

.method public final ܶ()Ljava/util/List;
    .locals 1

    .line 236
    iget-object v0, p0, Ll/ۚۖۖ;->ۛ:[Ll/ۚۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Ljava/util/List;
    .locals 1

    .line 231
    iget-object v0, p0, Ll/ۚۖۖ;->᩶:[Ll/ۚۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v0}, Ll/ۤۡۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ll/ۗ᩷ۖ;
    .locals 3

    .line 241
    iget-object v0, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v0}, Ll/ۤۡۖ;->ۚ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "proto3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "editions"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 247
    sget-object v0, Ll/ۗ᩷ۖ;->ۜ֫:Ll/ۗ᩷ۖ;

    return-object v0

    .line 243
    :cond_0
    invoke-virtual {v0}, Ll/ۤۡۖ;->᩷()Ll/ۗ᩷ۖ;

    move-result-object v0

    return-object v0

    .line 245
    :cond_1
    sget-object v0, Ll/ۗ᩷ۖ;->ۢ֫:Ll/ۗ᩷ۖ;

    return-object v0
.end method

.method public final ᩷()Ll/ۛۢۖ;
    .locals 4

    .line 674
    invoke-static {}, Ll/ۛۢۖ;->newBuilder()Ll/֡ۢۖ;

    move-result-object v0

    .line 675
    invoke-virtual {p0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v1

    sget-object v2, Ll/ۗ᩷ۖ;->ۗ:Ll/ۗ᩷ۖ;

    invoke-virtual {v2}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v2

    if-lt v1, v2, :cond_0

    .line 676
    invoke-virtual {v0}, Ll/֡ۢۖ;->build()Ll/ۛۢۖ;

    move-result-object v0

    return-object v0

    .line 679
    :cond_0
    invoke-virtual {p0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩷ۖ;->ۜ֫:Ll/ۗ᩷ۖ;

    if-ne v1, v2, :cond_2

    .line 680
    iget-object v1, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v1}, Ll/ۤۡۖ;->ۖ()Ll/۟ۡۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۡۖ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 681
    sget-object v1, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    .line 683
    invoke-static {}, Ll/ܳ᩵ۖ;->newBuilder()Ll/ܽ᩵ۖ;

    move-result-object v2

    sget-object v3, Ll/ܿ᩵ۖ;->ۤ:Ll/ܿ᩵ۖ;

    .line 684
    invoke-virtual {v2, v3}, Ll/ܽ᩵ۖ;->֫(Ll/ܿ᩵ۖ;)V

    .line 475
    invoke-virtual {v2}, Ll/ܽ᩵ۖ;->buildPartial()Ll/ܳ᩵ۖ;

    move-result-object v2

    .line 476
    invoke-virtual {v2}, Ll/ܳ᩵ۖ;->isInitialized()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 681
    invoke-virtual {v0, v1, v2}, Ll/ۗۘۖ;->֫(Ll/ۨۖۖ;Ll/ܳ᩵ۖ;)V

    goto :goto_0

    .line 477
    :cond_1
    invoke-static {v2}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0

    .line 688
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ll/֡ۢۖ;->build()Ll/ۛۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()V
    .locals 4

    .line 633
    :try_start_0
    invoke-direct {p0}, Ll/ۚۖۖ;->᩹()V
    :try_end_0
    .catch Ll/ۜۖۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 635
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid features for \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v3}, Ll/ۤۡۖ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\"."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ᩻()Z
    .locals 3

    .line 693
    invoke-virtual {p0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v0

    sget-object v1, Ll/ۗ᩷ۖ;->ۗ:Ll/ۗ᩷ۖ;

    invoke-virtual {v1}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v1

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return v2

    .line 696
    :cond_0
    invoke-virtual {p0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩷ۖ;->ۜ֫:Ll/ۗ᩷ۖ;

    if-ne v0, v1, :cond_1

    .line 697
    iget-object v0, p0, Ll/ۚۖۖ;->ۤ:Ll/ۤۡۖ;

    invoke-virtual {v0}, Ll/ۤۡۖ;->ۖ()Ll/۟ۡۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۡۖ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method
