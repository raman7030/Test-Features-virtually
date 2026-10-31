.class public final Ll/᩹ᩳܺ;
.super Ljava/lang/Object;
.source "CBF0"


# instance fields
.field public ֫:I

.field public ۜ:Ll/ᩳܿܺ;

.field public ۡ:Ll/۫ܺܺ;

.field public final ۢ:Z

.field public ۧ:Ll/۬ᩳܺ;

.field public final ܳ:Ljava/lang/String;

.field public ܺ:Ll/۫ܺܺ;

.field public ܽ:Ll/ܰᩳܺ;

.field public ܿ:Ll/֫ܿܺ;

.field public final ᩳ:Ll/ۧᩴܺ;

.field public ᩷:Ll/ۤܺܺ;

.field public ᩻:Ll/ۧۖܺ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z[B)V
    .locals 1

    .line 220
    new-instance v0, Ll/ۧᩴܺ;

    invoke-direct {v0, p3}, Ll/ۧᩴܺ;-><init>([B)V

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 201
    iput-object p1, p0, Ll/᩹ᩳܺ;->ܳ:Ljava/lang/String;

    .line 202
    iput-object v0, p0, Ll/᩹ᩳܺ;->ᩳ:Ll/ۧᩴܺ;

    .line 203
    iput-boolean p2, p0, Ll/᩹ᩳܺ;->ۢ:Z

    const/4 p1, -0x1

    .line 204
    iput p1, p0, Ll/᩹ᩳܺ;->֫:I

    return-void

    .line 198
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "filePath == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֡()V
    .locals 2

    .line 451
    iget v0, p0, Ll/᩹ᩳܺ;->֫:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 452
    invoke-direct {p0}, Ll/᩹ᩳܺ;->ᩴ()V

    :cond_0
    return-void
.end method

.method private ᩴ()V
    .locals 5

    .line 470
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܳ:Ljava/lang/String;

    const-string v1, "...while parsing "

    :try_start_0
    invoke-direct {p0}, Ll/᩹ᩳܺ;->᩵()V
    :try_end_0
    .catch Ll/᩺ᩳܺ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    .line 475
    new-instance v3, Ll/᩺ᩳܺ;

    const/4 v4, 0x0

    .line 69
    invoke-direct {v3, v4, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 476
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 477
    throw v3

    :catch_1
    move-exception v2

    .line 472
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 473
    throw v2
.end method

.method private ᩵()V
    .locals 11

    .line 525
    iget-object v0, p0, Ll/᩹ᩳܺ;->ᩳ:Ll/ۧᩴܺ;

    invoke-virtual {v0}, Ll/ۧᩴܺ;->֫()I

    move-result v1

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-lt v1, v2, :cond_8

    const/4 v1, 0x0

    const/4 v2, 0x6

    const-string v4, ")"

    .line 538
    iget-boolean v5, p0, Ll/᩹ᩳܺ;->ۢ:Z

    if-eqz v5, :cond_3

    .line 423
    invoke-virtual {v0, v1}, Ll/ۧᩴܺ;->ۧ(I)I

    move-result v6

    const v7, -0x35014542    # -8346975.0f

    if-ne v6, v7, :cond_2

    const/4 v6, 0x4

    .line 433
    invoke-virtual {v0, v6}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v7

    .line 443
    invoke-virtual {v0, v2}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v8

    if-ltz v7, :cond_1

    const/16 v9, 0x35

    if-ne v8, v9, :cond_0

    if-gtz v7, :cond_1

    goto :goto_0

    :cond_0
    if-ge v8, v9, :cond_1

    const/16 v7, 0x2d

    if-lt v8, v7, :cond_1

    goto :goto_0

    .line 547
    :cond_1
    new-instance v1, Ll/᩺ᩳܺ;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "unsupported class file version "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 443
    invoke-virtual {v0, v2}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 548
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    invoke-virtual {v0, v6}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v0

    .line 549
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-direct {v1, v0, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 549
    throw v1

    .line 543
    :cond_2
    new-instance v2, Ll/᩺ᩳܺ;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "bad class file magic ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    invoke-virtual {v0, v1}, Ll/ۧᩴܺ;->ۧ(I)I

    move-result v0

    .line 543
    invoke-static {v0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-direct {v2, v0, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 543
    throw v2

    .line 553
    :cond_3
    :goto_0
    new-instance v6, Ll/ۚᩳܺ;

    invoke-direct {v6, v0}, Ll/ۚᩳܺ;-><init>(Ll/ۧᩴܺ;)V

    .line 555
    invoke-virtual {v6}, Ll/ۚᩳܺ;->ۧ()Ll/ۤܺܺ;

    move-result-object v7

    iput-object v7, p0, Ll/᩹ᩳܺ;->᩷:Ll/ۤܺܺ;

    .line 556
    invoke-virtual {v7}, Ll/ᩴᩴܺ;->ܺ()V

    .line 558
    invoke-virtual {v6}, Ll/ۚᩳܺ;->֫()I

    move-result v6

    .line 559
    invoke-virtual {v0, v6}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v7

    add-int/lit8 v8, v6, 0x2

    .line 560
    invoke-virtual {v0, v8}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v8

    .line 561
    iget-object v9, p0, Ll/᩹ᩳܺ;->᩷:Ll/ۤܺܺ;

    invoke-virtual {v9, v8}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v8

    check-cast v8, Ll/۫ܺܺ;

    iput-object v8, p0, Ll/᩹ᩳܺ;->ܺ:Ll/۫ܺܺ;

    add-int/lit8 v8, v6, 0x4

    .line 562
    invoke-virtual {v0, v8}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v8

    .line 563
    iget-object v9, p0, Ll/᩹ᩳܺ;->᩷:Ll/ۤܺܺ;

    if-nez v8, :cond_4

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v8, v3

    goto :goto_1

    .line 82
    :cond_4
    invoke-virtual {v9, v8}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v8

    .line 563
    :goto_1
    check-cast v8, Ll/۫ܺܺ;

    iput-object v8, p0, Ll/᩹ᩳܺ;->ۡ:Ll/۫ܺܺ;

    add-int/lit8 v8, v6, 0x6

    .line 564
    invoke-virtual {v0, v8}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v8

    add-int/lit8 v6, v6, 0x8

    .line 581
    invoke-virtual {p0, v6, v8}, Ll/᩹ᩳܺ;->֫(II)Ll/ۧۖܺ;

    move-result-object v9

    iput-object v9, p0, Ll/᩹ᩳܺ;->᩻:Ll/ۧۖܺ;

    mul-int/lit8 v8, v8, 0x2

    add-int/2addr v8, v6

    if-eqz v5, :cond_6

    .line 589
    iget-object v5, p0, Ll/᩹ᩳܺ;->ܺ:Ll/۫ܺܺ;

    invoke-virtual {v5}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۟ܺܺ;->ܺ()Ljava/lang/String;

    move-result-object v5

    const-string v6, ".class"

    .line 590
    iget-object v9, p0, Ll/᩹ᩳܺ;->ܳ:Ljava/lang/String;

    invoke-virtual {v9, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 591
    invoke-virtual {v9, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 592
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v10, v2

    if-ne v6, v10, :cond_5

    goto :goto_2

    .line 593
    :cond_5
    new-instance v0, Ll/᩺ᩳܺ;

    const-string v1, "class name ("

    const-string v2, ") does not match path ("

    .line 0
    invoke-static {v1, v5, v2, v9, v4}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-direct {v0, v1, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 593
    throw v0

    .line 604
    :cond_6
    :goto_2
    iput v7, p0, Ll/᩹ᩳܺ;->֫:I

    .line 606
    new-instance v2, Ll/᩶ᩳܺ;

    iget-object v4, p0, Ll/᩹ᩳܺ;->ܺ:Ll/۫ܺܺ;

    iget-object v5, p0, Ll/᩹ᩳܺ;->ۧ:Ll/۬ᩳܺ;

    invoke-direct {v2, p0, v4, v8, v5}, Ll/᩶ᩳܺ;-><init>(Ll/᩹ᩳܺ;Ll/۫ܺܺ;ILl/۬ᩳܺ;)V

    .line 609
    invoke-virtual {v2}, Ll/᩶ᩳܺ;->᩻()Ll/֫ܿܺ;

    move-result-object v4

    iput-object v4, p0, Ll/᩹ᩳܺ;->ܿ:Ll/֫ܿܺ;

    .line 610
    invoke-virtual {v2}, Ll/ۙᩳܺ;->ᩳ()I

    move-result v2

    .line 612
    new-instance v4, Ll/ۗᩳܺ;

    iget-object v5, p0, Ll/᩹ᩳܺ;->ܺ:Ll/۫ܺܺ;

    iget-object v6, p0, Ll/᩹ᩳܺ;->ۧ:Ll/۬ᩳܺ;

    invoke-direct {v4, p0, v5, v2, v6}, Ll/ۗᩳܺ;-><init>(Ll/᩹ᩳܺ;Ll/۫ܺܺ;ILl/۬ᩳܺ;)V

    .line 615
    invoke-virtual {v4}, Ll/ۗᩳܺ;->᩻()Ll/ᩳܿܺ;

    move-result-object v2

    iput-object v2, p0, Ll/᩹ᩳܺ;->ۜ:Ll/ᩳܿܺ;

    .line 616
    invoke-virtual {v4}, Ll/ۙᩳܺ;->ᩳ()I

    move-result v2

    .line 618
    new-instance v4, Ll/ܶᩳܺ;

    iget-object v5, p0, Ll/᩹ᩳܺ;->ۧ:Ll/۬ᩳܺ;

    invoke-direct {v4, p0, v1, v2, v5}, Ll/ܶᩳܺ;-><init>(Ll/᩹ᩳܺ;IILl/۠ᩳܺ;)V

    .line 622
    invoke-virtual {v4}, Ll/ܶᩳܺ;->ۧ()Ll/ܰᩳܺ;

    move-result-object v1

    iput-object v1, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    .line 623
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    .line 624
    invoke-virtual {v4}, Ll/ܶᩳܺ;->֫()I

    move-result v1

    .line 626
    invoke-virtual {v0}, Ll/ۧᩴܺ;->֫()I

    move-result v0

    if-ne v1, v0, :cond_7

    return-void

    .line 627
    :cond_7
    new-instance v0, Ll/᩺ᩳܺ;

    .line 628
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "extra bytes at end of class file, at offset "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-direct {v0, v1, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 628
    throw v0

    .line 526
    :cond_8
    new-instance v0, Ll/᩺ᩳܺ;

    const-string v1, "severely truncated class file"

    .line 60
    invoke-direct {v0, v1, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 526
    throw v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 295
    invoke-direct {p0}, Ll/᩹ᩳܺ;->֡()V

    .line 296
    iget v0, p0, Ll/᩹ᩳܺ;->֫:I

    return v0
.end method

.method public final ֫(II)Ll/ۧۖܺ;
    .locals 3

    if-nez p2, :cond_0

    .line 406
    sget-object p1, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    return-object p1

    .line 409
    :cond_0
    iget-object v0, p0, Ll/᩹ᩳܺ;->᩷:Ll/ۤܺܺ;

    if-eqz v0, :cond_1

    .line 413
    new-instance v1, Ll/᩸ᩳܺ;

    iget-object v2, p0, Ll/᩹ᩳܺ;->ᩳ:Ll/ۧᩴܺ;

    invoke-direct {v1, v2, p1, p2, v0}, Ll/᩸ᩳܺ;-><init>(Ll/ۧᩴܺ;IILl/ۤܺܺ;)V

    return-object v1

    .line 410
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "pool not yet initialized"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۖ()Ll/۫ܺܺ;
    .locals 1

    .line 304
    invoke-direct {p0}, Ll/᩹ᩳܺ;->֡()V

    .line 305
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܺ:Ll/۫ܺܺ;

    return-object v0
.end method

.method public final ۘ()V
    .locals 1

    .line 2
    sget-object v0, Ll/۬ᩳܺ;->֫:Ll/۬ᩳܺ;

    .line 242
    iput-object v0, p0, Ll/᩹ᩳܺ;->ۧ:Ll/۬ᩳܺ;

    return-void
.end method

.method public final ۜ()Ll/ۧۖܺ;
    .locals 1

    .line 331
    invoke-direct {p0}, Ll/᩹ᩳܺ;->֡()V

    .line 332
    iget-object v0, p0, Ll/᩹ᩳܺ;->᩻:Ll/ۧۖܺ;

    return-object v0
.end method

.method public final ۡ()Ll/۬ܺܺ;
    .locals 2

    .line 460
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    if-nez v0, :cond_0

    .line 461
    invoke-direct {p0}, Ll/᩹ᩳܺ;->ᩴ()V

    .line 359
    :cond_0
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    const-string v1, "SourceFile"

    .line 382
    invoke-virtual {v0, v1}, Ll/ܰᩳܺ;->ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;

    move-result-object v0

    .line 384
    instance-of v1, v0, Ll/ᩳܽܺ;

    if-eqz v1, :cond_1

    .line 385
    check-cast v0, Ll/ᩳܽܺ;

    invoke-virtual {v0}, Ll/ᩳܽܺ;->ۧ()Ll/۬ܺܺ;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۢ()Ll/ᩳܿܺ;
    .locals 1

    .line 460
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    if-nez v0, :cond_0

    .line 461
    invoke-direct {p0}, Ll/᩹ᩳܺ;->ᩴ()V

    .line 350
    :cond_0
    iget-object v0, p0, Ll/᩹ᩳܺ;->ۜ:Ll/ᩳܿܺ;

    return-object v0
.end method

.method public final ۧ()Ll/ܰᩳܺ;
    .locals 1

    .line 460
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    if-nez v0, :cond_0

    .line 461
    invoke-direct {p0}, Ll/᩹ᩳܺ;->ᩴ()V

    .line 359
    :cond_0
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    return-object v0
.end method

.method public final ܳ()Ll/֫ܿܺ;
    .locals 1

    .line 460
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    if-nez v0, :cond_0

    .line 461
    invoke-direct {p0}, Ll/᩹ᩳܺ;->ᩴ()V

    .line 341
    :cond_0
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܿ:Ll/֫ܿܺ;

    return-object v0
.end method

.method public final ܺ()Ll/۫ܺܺ;
    .locals 1

    .line 313
    invoke-direct {p0}, Ll/᩹ᩳܺ;->֡()V

    .line 314
    iget-object v0, p0, Ll/᩹ᩳܺ;->ۡ:Ll/۫ܺܺ;

    return-object v0
.end method

.method public final ܽ()Ll/᩵ܽܺ;
    .locals 2

    .line 460
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    if-nez v0, :cond_0

    .line 461
    invoke-direct {p0}, Ll/᩹ᩳܺ;->ᩴ()V

    .line 359
    :cond_0
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܽ:Ll/ܰᩳܺ;

    const-string v1, "BootstrapMethods"

    .line 368
    invoke-virtual {v0, v1}, Ll/ܰᩳܺ;->ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;

    move-result-object v0

    check-cast v0, Ll/᩸ۧܺ;

    if-eqz v0, :cond_1

    .line 370
    invoke-virtual {v0}, Ll/᩸ۧܺ;->ۧ()Ll/᩵ܽܺ;

    move-result-object v0

    return-object v0

    .line 372
    :cond_1
    sget-object v0, Ll/᩵ܽܺ;->᩶:Ll/᩵ܽܺ;

    return-object v0
.end method

.method public final ܿ()Ll/ۤܺܺ;
    .locals 1

    .line 322
    invoke-direct {p0}, Ll/᩹ᩳܺ;->֡()V

    .line 323
    iget-object v0, p0, Ll/᩹ᩳܺ;->᩷:Ll/ۤܺܺ;

    return-object v0
.end method

.method public final ᩳ()Ll/ۧᩴܺ;
    .locals 1

    .line 260
    iget-object v0, p0, Ll/᩹ᩳܺ;->ᩳ:Ll/ۧᩴܺ;

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    .line 268
    invoke-direct {p0}, Ll/᩹ᩳܺ;->֡()V

    .line 423
    iget-object v0, p0, Ll/᩹ᩳܺ;->ᩳ:Ll/ۧᩴܺ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۧᩴܺ;->ۧ(I)I

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 251
    iget-object v0, p0, Ll/᩹ᩳܺ;->ܳ:Ljava/lang/String;

    return-object v0
.end method
