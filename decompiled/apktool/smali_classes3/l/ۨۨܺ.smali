.class public final Ll/ۨۨܺ;
.super Ljava/lang/Object;
.source "L3BC"


# instance fields
.field public final ֫:I

.field public final ۜ:Ljava/lang/String;

.field public final ۧ:I

.field public final ܳ:Z

.field public final ܽ:[C

.field public final ܿ:[B

.field public final ᩳ:I

.field public final ᩷:[Z

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[C)V
    .locals 8

    const/16 v0, 0x80

    new-array v1, v0, [B

    const/4 v2, -0x1

    .line 483
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 484
    :goto_0
    array-length v5, p2

    if-ge v4, v5, :cond_4

    .line 485
    aget-char v5, p2, v4

    const/4 v6, 0x1

    if-ge v5, v0, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_3

    .line 487
    aget-byte v7, v1, v5

    if-ne v7, v2, :cond_1

    const/4 v7, 0x1

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_2

    int-to-byte v6, v4

    .line 488
    aput-byte v6, v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 177
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p2, v0, v3

    const-string p2, "Duplicate character: %s"

    invoke-static {p2, v0}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p2, v0, v3

    const-string p2, "Non-ASCII character: %s"

    invoke-static {p2, v0}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 446
    :cond_4
    invoke-direct {p0, p1, p2, v1, v3}, Ll/ۨۨܺ;-><init>(Ljava/lang/String;[C[BZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[C[BZ)V
    .locals 3

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    iput-object p1, p0, Ll/ۨۨܺ;->ۜ:Ljava/lang/String;

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    iput-object p2, p0, Ll/ۨۨܺ;->ܽ:[C

    .line 453
    :try_start_0
    array-length p1, p2

    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {p1}, Ll/ۚ᩺ܺ;->֫(I)I

    move-result p1

    iput p1, p0, Ll/ۨۨܺ;->֫:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 465
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v0

    rsub-int/lit8 v1, v0, 0x3

    const/4 v2, 0x1

    shl-int v1, v2, v1

    .line 466
    iput v1, p0, Ll/ۨۨܺ;->ᩳ:I

    shr-int/2addr p1, v0

    .line 467
    iput p1, p0, Ll/ۨۨܺ;->ۧ:I

    .line 469
    array-length p1, p2

    sub-int/2addr p1, v2

    iput p1, p0, Ll/ۨۨܺ;->᩻:I

    .line 471
    iput-object p3, p0, Ll/ۨۨܺ;->ܿ:[B

    .line 473
    new-array p1, v1, [Z

    const/4 p2, 0x0

    .line 474
    :goto_0
    iget p3, p0, Ll/ۨۨܺ;->ۧ:I

    if-ge p2, p3, :cond_0

    mul-int/lit8 p3, p2, 0x8

    .line 475
    iget v0, p0, Ll/ۨۨܺ;->֫:I

    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p3, v0}, Ll/ۚ᩺ܺ;->֫(II)I

    move-result p3

    aput-boolean v2, p1, p3

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 477
    :cond_0
    iput-object p1, p0, Ll/ۨۨܺ;->᩷:[Z

    .line 478
    iput-boolean p4, p0, Ll/ۨۨܺ;->ܳ:Z

    return-void

    :catch_0
    move-exception p1

    .line 455
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Illegal alphabet length "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p2, p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method

.method public static synthetic ֫(Ll/ۨۨܺ;)[C
    .locals 0

    .line 433
    iget-object p0, p0, Ll/ۨۨܺ;->ܽ:[C

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 601
    instance-of v0, p1, Ll/ۨۨܺ;

    if-eqz v0, :cond_0

    .line 602
    check-cast p1, Ll/ۨۨܺ;

    .line 603
    iget-boolean v0, p0, Ll/ۨۨܺ;->ܳ:Z

    iget-boolean v1, p1, Ll/ۨۨܺ;->ܳ:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۨۨܺ;->ܽ:[C

    iget-object p1, p1, Ll/ۨۨܺ;->ܽ:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 610
    iget-object v0, p0, Ll/ۨۨܺ;->ܽ:[C

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([C)I

    move-result v0

    iget-boolean v1, p0, Ll/ۨۨܺ;->ܳ:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 596
    iget-object v0, p0, Ll/ۨۨܺ;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(I)C
    .locals 1

    .line 520
    iget-object v0, p0, Ll/ۨۨܺ;->ܽ:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final ֫(C)I
    .locals 4

    const-string v0, "Unrecognized character: 0x"

    const/16 v1, 0x7f

    if-gt p1, v1, :cond_3

    .line 535
    iget-object v2, p0, Ll/ۨۨܺ;->ܿ:[B

    aget-byte v2, v2, p1

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    const/16 v2, 0x20

    if-le p1, v2, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 540
    :cond_0
    new-instance v0, Ll/۟ۨܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unrecognized character: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 141
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 540
    throw v0

    .line 538
    :cond_1
    :goto_0
    new-instance v1, Ll/۟ۨܺ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v2, p1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p1

    .line 141
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 538
    throw v1

    :cond_2
    return v2

    .line 533
    :cond_3
    new-instance v1, Ll/۟ۨܺ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v2, p1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p1

    .line 141
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 533
    throw v1
.end method

.method public final ֫()Ll/ۨۨܺ;
    .locals 11

    .line 556
    iget-object v0, p0, Ll/ۨۨܺ;->ܽ:[C

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_b

    aget-char v4, v0, v3

    .line 557
    invoke-static {v4}, Ll/ܶ۠ܺ;->֫(C)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 547
    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-char v5, v0, v3

    const/16 v6, 0x61

    if-lt v5, v6, :cond_0

    const/16 v6, 0x7a

    if-gt v5, v6, :cond_0

    const/4 v1, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_2
    xor-int/2addr v1, v4

    const-string v3, "Cannot call lowerCase() on a mixed-case alphabet"

    .line 581
    invoke-static {v3, v1}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 582
    array-length v1, v0

    new-array v1, v1, [C

    const/4 v3, 0x0

    .line 583
    :goto_3
    array-length v5, v0

    if-ge v3, v5, :cond_3

    .line 584
    aget-char v5, v0, v3

    .line 447
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(C)Z

    move-result v6

    if-eqz v6, :cond_2

    xor-int/lit8 v5, v5, 0x20

    int-to-char v5, v5

    .line 584
    :cond_2
    aput-char v5, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 586
    :cond_3
    new-instance v0, Ll/ۨۨܺ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ll/ۨۨܺ;->ۜ:Ljava/lang/String;

    const-string v6, ".lowerCase()"

    .line 0
    invoke-static {v3, v5, v6}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 586
    invoke-direct {v0, v3, v1}, Ll/ۨۨܺ;-><init>(Ljava/lang/String;[C)V

    .line 587
    iget-boolean v1, p0, Ll/ۨۨܺ;->ܳ:Z

    if-eqz v1, :cond_9

    .line 495
    iget-boolean v1, v0, Ll/ۨۨܺ;->ܳ:Z

    if-eqz v1, :cond_4

    goto :goto_7

    .line 500
    :cond_4
    iget-object v1, v0, Ll/ۨۨܺ;->ܿ:[B

    array-length v3, v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    const/16 v5, 0x41

    :goto_4
    const/16 v6, 0x5a

    if-gt v5, v6, :cond_8

    or-int/lit8 v6, v5, 0x20

    .line 503
    aget-byte v7, v1, v5

    .line 504
    aget-byte v8, v1, v6

    const/4 v9, -0x1

    if-ne v7, v9, :cond_5

    .line 506
    aput-byte v8, v3, v5

    goto :goto_6

    :cond_5
    if-ne v8, v9, :cond_6

    const/4 v8, 0x1

    goto :goto_5

    :cond_6
    const/4 v8, 0x0

    :goto_5
    int-to-char v9, v5

    int-to-char v10, v6

    if-eqz v8, :cond_7

    .line 513
    aput-byte v7, v3, v6

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 617
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v2

    aput-object v3, v5, v4

    const-string v1, "Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values"

    invoke-static {v1, v5}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 516
    :cond_8
    new-instance v1, Ll/ۨۨܺ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, Ll/ۨۨܺ;->ۜ:Ljava/lang/String;

    const-string v6, ".ignoreCase()"

    .line 0
    invoke-static {v2, v5, v6}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 516
    iget-object v0, v0, Ll/ۨۨܺ;->ܽ:[C

    invoke-direct {v1, v2, v0, v3, v4}, Ll/ۨۨܺ;-><init>(Ljava/lang/String;[C[BZ)V

    return-object v1

    :cond_9
    :goto_7
    return-object v0

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_b
    return-object p0
.end method

.method public final ۧ(C)Z
    .locals 2

    .line 591
    iget-object v0, p0, Ll/ۨۨܺ;->ܿ:[B

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-byte p1, v0, p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 524
    iget v0, p0, Ll/ۨۨܺ;->ᩳ:I

    rem-int/2addr p1, v0

    iget-object v0, p0, Ll/ۨۨܺ;->᩷:[Z

    aget-boolean p1, v0, p1

    return p1
.end method
