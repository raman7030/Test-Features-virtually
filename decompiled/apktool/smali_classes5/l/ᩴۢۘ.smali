.class public final Ll/ᩴۢۘ;
.super Ll/ۘ᩷ۘ;
.source "T7YQ"


# instance fields
.field public ۜ:[B

.field public ܳ:[B

.field public final synthetic ᩷:Ll/᩵ۢۘ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩵ۢۘ;Ljava/lang/String;Ljava/lang/String;I[BLjava/lang/String;)V
    .locals 6

    .line 574
    iput-object p1, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    move-object v0, p0

    move v1, p4

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move-object v5, p5

    .line 575
    invoke-direct/range {v0 .. v5}, Ll/ۘ᩷ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    const/4 p2, 0x0

    .line 561
    iput-boolean p2, p0, Ll/ᩴۢۘ;->᩻:Z

    const/4 p3, 0x0

    .line 562
    iput-object p3, p0, Ll/ᩴۢۘ;->ۜ:[B

    .line 563
    iput-object p3, p0, Ll/ᩴۢۘ;->ܳ:[B

    .line 576
    iget-object p4, p0, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    const-string p5, "|1|"

    invoke-virtual {p4, p5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_2

    iget-object p4, p0, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    const/4 p5, 0x3

    .line 577
    invoke-virtual {p4, p5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p4

    const-string p6, "|"

    invoke-virtual {p4, p6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p4

    if-lez p4, :cond_2

    .line 578
    iget-object p4, p0, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    invoke-virtual {p4, p5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p4

    .line 579
    invoke-virtual {p4, p6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p5

    invoke-virtual {p4, p2, p5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p5

    .line 580
    invoke-virtual {p4, p6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p6

    const/4 v0, 0x1

    add-int/2addr p6, v0

    invoke-virtual {p4, p6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p4

    .line 397
    sget-object p6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p5, p6}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 581
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result p5

    invoke-static {p2, p5, v1}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object p5

    iput-object p5, p0, Ll/ᩴۢۘ;->ۜ:[B

    .line 397
    invoke-static {p4, p6}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p5

    .line 582
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p4

    invoke-static {p2, p4, p5}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object p2

    iput-object p2, p0, Ll/ᩴۢۘ;->ܳ:[B

    .line 583
    iget-object p1, p1, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    invoke-interface {p1}, Ll/֨ۢۘ;->getBlockSize()I

    move-result p1

    .line 584
    iget-object p2, p0, Ll/ᩴۢۘ;->ۜ:[B

    array-length p2, p2

    if-ne p2, p1, :cond_1

    iget-object p2, p0, Ll/ᩴۢۘ;->ܳ:[B

    array-length p2, p2

    if-eq p2, p1, :cond_0

    goto :goto_0

    .line 589
    :cond_0
    iput-boolean v0, p0, Ll/ᩴۢۘ;->᩻:Z

    return-void

    .line 585
    :cond_1
    :goto_0
    iput-object p3, p0, Ll/ᩴۢۘ;->ۜ:[B

    .line 586
    iput-object p3, p0, Ll/ᩴۢۘ;->ܳ:[B

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 4

    .line 595
    iget-boolean v0, p0, Ll/ᩴۢۘ;->᩻:Z

    if-nez v0, :cond_0

    .line 596
    invoke-super {p0, p1}, Ll/ۘ᩷ۘ;->֫(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v1, 0x0

    .line 599
    :try_start_0
    iget-object v0, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v0, v0, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 600
    :try_start_1
    iget-object v2, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v2, v2, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    iget-object v3, p0, Ll/ᩴۢۘ;->ۜ:[B

    invoke-interface {v2, v3}, Ll/֨ۢۘ;->init([B)V

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 602
    iget-object v2, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v2, v2, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    array-length v3, p1

    invoke-interface {v2, v3, p1}, Ll/֨ۢۘ;->֫(I[B)V

    .line 603
    iget-object p1, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object p1, p1, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    invoke-interface {p1}, Ll/֨ۢۘ;->getBlockSize()I

    move-result p1

    new-array p1, p1, [B

    .line 604
    iget-object v2, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v2, v2, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    invoke-interface {v2, v1, p1}, Ll/֨ۢۘ;->ۧ(I[B)V

    .line 605
    iget-object v2, p0, Ll/ᩴۢۘ;->ܳ:[B

    invoke-static {v2, p1}, Ll/᩵ۡۘ;->֫([B[B)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 606
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 608
    :catch_0
    iget-object p1, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    invoke-static {p1}, Ll/᩵ۢۘ;->֫(Ll/᩵ۢۘ;)Ll/᩶᩷ۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method

.method public final ۧ()V
    .locals 7

    .line 619
    iget-boolean v0, p0, Ll/ᩴۢۘ;->᩻:Z

    if-eqz v0, :cond_0

    return-void

    .line 621
    :cond_0
    iget-object v0, p0, Ll/ᩴۢۘ;->ۜ:[B

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 622
    sget-object v2, Ll/۟ۢۘ;->ۧۧ:Ll/᩹ۢۘ;

    move-object v0, v2

    .line 623
    monitor-enter v0

    .line 624
    :try_start_0
    iget-object v3, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v3, v3, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    invoke-interface {v3}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v3

    new-array v4, v3, [B

    iput-object v4, p0, Ll/ᩴۢۘ;->ۜ:[B

    .line 625
    invoke-interface {v2, v1, v3, v4}, Ll/᩹ۢۘ;->֫(II[B)V

    .line 626
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 629
    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v0, v0, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 630
    :try_start_2
    iget-object v2, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v2, v2, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    iget-object v3, p0, Ll/ᩴۢۘ;->ۜ:[B

    invoke-interface {v2, v3}, Ll/֨ۢۘ;->init([B)V

    .line 631
    iget-object v2, p0, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    .line 397
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v2, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 632
    iget-object v4, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v4, v4, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    array-length v5, v2

    invoke-interface {v4, v5, v2}, Ll/֨ۢۘ;->֫(I[B)V

    .line 633
    iget-object v2, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v2, v2, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    invoke-interface {v2}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v2

    new-array v2, v2, [B

    iput-object v2, p0, Ll/ᩴۢۘ;->ܳ:[B

    .line 634
    iget-object v4, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    iget-object v4, v4, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    invoke-interface {v4, v1, v2}, Ll/֨ۢۘ;->ۧ(I[B)V

    .line 635
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 643
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "|1|"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ᩴۢۘ;->ۜ:[B

    array-length v4, v2

    const/4 v5, 0x1

    invoke-static {v2, v4, v5}, Ll/᩵ۡۘ;->֫([BIZ)[B

    move-result-object v2

    .line 409
    array-length v4, v2

    .line 405
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v2, v1, v4, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 643
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ᩴۢۘ;->ܳ:[B

    array-length v4, v2

    .line 644
    invoke-static {v2, v4, v5}, Ll/᩵ۡۘ;->֫([BIZ)[B

    move-result-object v2

    .line 409
    array-length v4, v2

    .line 405
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v2, v1, v4, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 644
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    .line 645
    iput-boolean v5, p0, Ll/ᩴۢۘ;->᩻:Z

    return-void

    :catchall_1
    move-exception v1

    .line 635
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 637
    :catch_0
    iget-object v0, p0, Ll/ᩴۢۘ;->᩷:Ll/᩵ۢۘ;

    invoke-static {v0}, Ll/᩵ۢۘ;->֫(Ll/᩵ۢۘ;)Ll/᩶᩷ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 639
    iput-object v0, p0, Ll/ᩴۢۘ;->ۜ:[B

    .line 640
    iput-object v0, p0, Ll/ᩴۢۘ;->ܳ:[B

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 615
    iget-boolean v0, p0, Ll/ᩴۢۘ;->᩻:Z

    return v0
.end method
