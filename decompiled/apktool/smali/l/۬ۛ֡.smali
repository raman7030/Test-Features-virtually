.class public Ll/۬ۛ֡;
.super Ljava/lang/Object;
.source "B5S9"

# interfaces
.implements Ll/ܺ֫ۚ;


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫:Ll/ᩳۛ֡;

.field public ۖ:I

.field public ۘ:I

.field public ۚ:Z

.field public ۜ:I

.field public ۠:I

.field public final ۡ:Ll/֡ۛۡ;

.field public final ۢ:Ll/֡ۛۡ;

.field public ۧ:I

.field public ܳ:I

.field public ܶ:Ljava/lang/Object;

.field public ܺ:I

.field public ܽ:I

.field public ܿ:Z

.field public final ᩳ:Ll/ۘۨ֡;

.field public final ᩴ:Ll/۠ۗ֡;

.field public ᩵:I

.field public final ᩷:Ll/֡ۛۡ;

.field public ᩸:I

.field public ᩹:I

.field public ᩻:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x68

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public native constructor <init>(Ll/ۘۨ֡;Ll/۠ۗ֡;)V
.end method

.method public native constructor <init>(Ll/۠ۗ֡;Ll/ۘۨ֡;ZZ)V
.end method

.method public constructor <init>([BIZ)V
    .locals 1

    .line 128
    new-instance v0, Ll/᩺ۤ֡;

    invoke-direct {v0, p1, p2}, Ll/᩺ۤ֡;-><init>([BI)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 136
    invoke-direct {p0, p2, v0, p3, p1}, Ll/۬ۛ֡;-><init>(Ll/۠ۗ֡;Ll/ۘۨ֡;ZZ)V

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/۬ۛ֡;
    .locals 2

    .line 220
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 221
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p0, v0

    .line 223
    :cond_0
    invoke-static {p0}, Ll/ۤ᩻ۚ;->֫(Ljava/io/InputStream;)I

    .line 226
    invoke-static {p0}, Ll/ᩳ᩺ܺ;->֫(Ljava/io/InputStream;)[B

    move-result-object p0

    .line 227
    new-instance v0, Ll/۬ۛ֡;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Ll/۬ۛ֡;-><init>([BIZ)V

    return-object v0
.end method

.method public static ֫([B)Ll/۬ۛ֡;
    .locals 3

    .line 237
    new-instance v0, Ll/۬ۛ֡;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Ll/۬ۛ֡;-><init>([BIZ)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/۬ۛ֡;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬ۛ֡;->ܿ:Z

    return p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 3

    if-ltz p1, :cond_0

    .line 346
    iget v0, p0, Ll/۬ۛ֡;->ۧ:I

    if-ge p1, v0, :cond_0

    .line 349
    iget v0, p0, Ll/۬ۛ֡;->ܽ:I

    mul-int/lit8 p1, p1, 0x20

    add-int/2addr p1, v0

    return p1

    .line 347
    :cond_0
    new-instance v0, Ll/ۙۛ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Class index out of bounds: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    throw v0
.end method

.method public final ֫(ILl/֨ۗ֡;)Ll/ۖ᩺֡;
    .locals 1

    .line 724
    iget-object v0, p0, Ll/۬ۛ֡;->᩷:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩺֡;

    if-eqz v0, :cond_0

    .line 726
    iput-object p2, v0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    .line 727
    iput p1, v0, Ll/ۢܰ֡;->᩹:I

    return-object v0

    .line 729
    :cond_0
    new-instance v0, Ll/ۖ᩺֡;

    .line 44
    invoke-direct {v0, p0, p2, p1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    return-object v0
.end method

.method public final ֫()Ll/۠ۗ֡;
    .locals 1

    .line 258
    iget-object v0, p0, Ll/۬ۛ֡;->ᩴ:Ll/۠ۗ֡;

    return-object v0
.end method

.method public final ֫(ILjava/io/Writer;Z)V
    .locals 1

    .line 467
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۢ(I)I

    move-result p1

    .line 468
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    .line 469
    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object p1

    .line 470
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v0

    .line 471
    invoke-virtual {p1, v0, p2, p3}, Ll/ᩴۨ֡;->֫(ILjava/io/Writer;Z)V

    .line 472
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    return-void
.end method

.method public final ֫(Ljava/io/Writer;I)V
    .locals 1

    .line 526
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    .line 527
    invoke-virtual {p0, p2}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 529
    :cond_0
    invoke-virtual {p0, p2}, Ll/۬ۛ֡;->ۖ(I)I

    move-result p2

    .line 530
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v0, p2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p2

    const/4 v0, 0x0

    .line 531
    invoke-virtual {p0, p2, p1, v0}, Ll/۬ۛ֡;->ۧ(ILjava/io/Writer;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 766
    iput-object p1, p0, Ll/۬ۛ֡;->ܶ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/֫ܰ֡;)V
    .locals 1

    .line 705
    iget-object v0, p0, Ll/۬ۛ֡;->ۡ:Ll/֡ۛۡ;

    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۖ᩺֡;)V
    .locals 1

    .line 735
    iget-object v0, p0, Ll/۬ۛ֡;->᩷:Ll/֡ۛۡ;

    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩶᩺֡;)V
    .locals 1

    .line 720
    iget-object v0, p0, Ll/۬ۛ֡;->ۢ:Ll/֡ۛۡ;

    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 774
    iput-boolean p1, p0, Ll/۬ۛ֡;->ۚ:Z

    return-void
.end method

.method public final ֫(IIILjava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    add-int v1, p2, p3

    .line 479
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_0

    goto :goto_1

    .line 482
    :cond_0
    iget-boolean v1, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v1, p1}, Ll/ᩳۛ֡;->֫(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 484
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, p3, :cond_3

    invoke-virtual {p4, p2, v1, v0, p3}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    .line 486
    :cond_2
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۢ(I)I

    move-result p1

    .line 487
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    .line 488
    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object p1

    .line 490
    :try_start_0
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v2

    .line 491
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v1

    move-object v3, p4

    move v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Ll/۟᩵ۚ;->֫(Ll/ۘۨ֡;IILjava/lang/String;II)Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    return p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    .line 495
    throw p2

    :cond_3
    :goto_1
    return v0
.end method

.method public final ֫(ILjava/lang/String;)Z
    .locals 6

    .line 553
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v0, p1}, Ll/ᩳۛ֡;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x5b

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    const/4 p1, 0x0

    .line 556
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge p1, v3, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 559
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v1, v3, :cond_2

    .line 560
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, p1, p2, v2, v1}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2

    .line 562
    :cond_3
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۖ(I)I

    move-result p1

    .line 563
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    .line 564
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۢ(I)I

    move-result p1

    .line 565
    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    .line 566
    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object p1

    .line 568
    :try_start_0
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v3

    .line 569
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v4

    :goto_2
    if-ge v2, v3, :cond_4

    add-int v5, v4, v2

    .line 571
    invoke-virtual {v0, v5}, Ll/ۘۨ֡;->᩷(I)I

    move-result v5

    if-ne v5, v1, :cond_4

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 574
    :cond_4
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    add-int v1, v4, v2

    sub-int v2, v3, v2

    .line 575
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v4, 0x0

    move-object v3, p2

    .line 574
    invoke-static/range {v0 .. v5}, Ll/۟᩵ۚ;->֫(Ll/ۘۨ֡;IILjava/lang/String;II)Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 577
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    return p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    .line 578
    throw p2
.end method

.method public final ۖ(I)I
    .locals 3

    if-ltz p1, :cond_0

    .line 318
    iget v0, p0, Ll/۬ۛ֡;->᩸:I

    if-ge p1, v0, :cond_0

    .line 321
    iget v0, p0, Ll/۬ۛ֡;->᩹:I

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v0

    return p1

    .line 319
    :cond_0
    new-instance v0, Ll/ۙۛ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Type index out of bounds: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    throw v0
.end method

.method public final ۖ()Ljava/lang/Object;
    .locals 1

    .line 770
    iget-object v0, p0, Ll/۬ۛ֡;->ܶ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۘ()I
    .locals 1

    .line 377
    iget v0, p0, Ll/۬ۛ֡;->᩸:I

    return v0
.end method

.method public final ۘ(I)I
    .locals 2

    .line 284
    iget v0, p0, Ll/۬ۛ֡;->ۜ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, v0, 0x4

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v0

    .line 288
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۧ(I)I

    move-result p1

    if-nez p1, :cond_1

    return v1

    .line 296
    :cond_1
    iget v0, p0, Ll/۬ۛ֡;->ۜ:I

    add-int/2addr v0, p1

    return v0
.end method

.method public final ۜ()I
    .locals 1

    .line 241
    iget v0, p0, Ll/۬ۛ֡;->ۜ:I

    return v0
.end method

.method public final ۜ(I)I
    .locals 3

    if-ltz p1, :cond_0

    .line 339
    iget v0, p0, Ll/۬ۛ֡;->᩵:I

    if-ge p1, v0, :cond_0

    .line 342
    iget v0, p0, Ll/۬ۛ֡;->֡:I

    mul-int/lit8 p1, p1, 0xc

    add-int/2addr p1, v0

    return p1

    .line 340
    :cond_0
    new-instance v0, Ll/ۙۛ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Proto index out of bounds: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    throw v0
.end method

.method public final ۡ()I
    .locals 1

    .line 381
    iget v0, p0, Ll/۬ۛ֡;->᩵:I

    return v0
.end method

.method public final ۡ(I)Ljava/lang/String;
    .locals 3

    .line 508
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    .line 509
    iget-object v1, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v1, p1}, Ll/ᩳۛ֡;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return-object v1

    .line 512
    :cond_1
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۖ(I)I

    move-result v1

    .line 513
    iget-object v2, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    .line 514
    invoke-virtual {p0, v1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_2

    .line 516
    iget-object v0, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v0, p1, v1}, Ll/ᩳۛ֡;->ۧ(ILjava/lang/String;)V

    :cond_2
    return-object v1
.end method

.method public final ۢ(I)I
    .locals 3

    if-ltz p1, :cond_0

    .line 311
    iget v0, p0, Ll/۬ۛ֡;->֨:I

    if-ge p1, v0, :cond_0

    .line 314
    iget v0, p0, Ll/۬ۛ֡;->۠:I

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v0

    return p1

    .line 312
    :cond_0
    new-instance v0, Ll/ۙۛ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "String index out of bounds: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    throw v0
.end method

.method public final ۢ()Ljava/util/List;
    .locals 1

    .line 624
    new-instance v0, Ll/᩹ۛ֡;

    invoke-direct {v0, p0}, Ll/᩹ۛ֡;-><init>(Ll/۬ۛ֡;)V

    return-object v0
.end method

.method public final ۧ(I)I
    .locals 3

    if-ltz p1, :cond_0

    .line 325
    iget v0, p0, Ll/۬ۛ֡;->ܳ:I

    if-ge p1, v0, :cond_0

    .line 328
    iget v0, p0, Ll/۬ۛ֡;->᩻:I

    mul-int/lit8 p1, p1, 0x8

    add-int/2addr p1, v0

    return p1

    .line 326
    :cond_0
    new-instance v0, Ll/ۙۛ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Field index out of bounds: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    throw v0
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 1

    .line 268
    new-instance v0, Ll/ܶۛ֡;

    invoke-direct {v0, p0}, Ll/ܶۛ֡;-><init>(Ll/۬ۛ֡;)V

    return-object v0
.end method

.method public final ۧ(ILl/֨ۗ֡;)Ll/᩶᩺֡;
    .locals 1

    .line 709
    iget-object v0, p0, Ll/۬ۛ֡;->ۢ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶᩺֡;

    if-eqz v0, :cond_0

    .line 711
    iput-object p2, v0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    .line 712
    iput p1, v0, Ll/ۢܰ֡;->᩹:I

    return-object v0

    .line 714
    :cond_0
    new-instance v0, Ll/᩶᩺֡;

    invoke-direct {v0, p0, p2, p1}, Ll/᩶᩺֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    return-object v0
.end method

.method public final ۧ(ILjava/io/Writer;Z)V
    .locals 1

    .line 456
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    .line 457
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 459
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ll/۬ۛ֡;->֫(ILjava/io/Writer;Z)V

    return-void
.end method

.method public final ۧ(IIILjava/lang/String;)Z
    .locals 3

    .line 539
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v0, p1}, Ll/ᩳۛ֡;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 p1, 0x0

    if-ltz p2, :cond_1

    if-ltz p3, :cond_1

    add-int v1, p2, p3

    .line 541
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v2

    if-gt v1, v2, :cond_1

    .line 542
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, p3, :cond_1

    invoke-virtual {p4, p2, v0, p1, p3}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    :cond_1
    return p1

    .line 544
    :cond_2
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۖ(I)I

    move-result p1

    .line 545
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    .line 546
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/۬ۛ֡;->֫(IIILjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()I
    .locals 1

    .line 369
    iget v0, p0, Ll/۬ۛ֡;->ۧ:I

    return v0
.end method

.method public final ܳ(I)Ll/ۗܰ֡;
    .locals 1

    .line 644
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    .line 645
    iget-object v0, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v0, p0, p1}, Ll/ᩳۛ֡;->ۧ(Ll/۬ۛ֡;I)Ll/ۗܰ֡;

    move-result-object p1

    return-object p1

    .line 647
    :cond_0
    new-instance v0, Ll/ۗܰ֡;

    invoke-direct {v0, p0, p1}, Ll/ۗܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v0
.end method

.method public final ܺ()I
    .locals 1

    .line 373
    iget v0, p0, Ll/۬ۛ֡;->֨:I

    return v0
.end method

.method public final ܺ(I)Ljava/lang/String;
    .locals 1

    .line 522
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(ILl/֨ۗ֡;)Ll/֫ܰ֡;
    .locals 1

    .line 694
    iget-object v0, p0, Ll/۬ۛ֡;->ۡ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܰ֡;

    if-eqz v0, :cond_0

    .line 696
    iput-object p2, v0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    .line 697
    iput p1, v0, Ll/ۢܰ֡;->᩹:I

    return-object v0

    .line 699
    :cond_0
    new-instance v0, Ll/֫ܰ֡;

    invoke-direct {v0, p0, p2, p1}, Ll/֫ܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    return-object v0
.end method

.method public final ܽ(I)Ll/ܶܰ֡;
    .locals 1

    .line 651
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    .line 652
    iget-object v0, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v0, p0, p1}, Ll/ᩳۛ֡;->֫(Ll/۬ۛ֡;I)Ll/ܶܰ֡;

    move-result-object p1

    return-object p1

    .line 654
    :cond_0
    new-instance v0, Ll/ܶܰ֡;

    invoke-direct {v0, p0, p1}, Ll/ܶܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 300
    iput-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    .line 301
    iget-object v0, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v0}, Ll/ᩳۛ֡;->֫()V

    return-void
.end method

.method public final ܿ(I)I
    .locals 3

    if-ltz p1, :cond_0

    .line 332
    iget v0, p0, Ll/۬ۛ֡;->ۖ:I

    if-ge p1, v0, :cond_0

    .line 335
    iget v0, p0, Ll/۬ۛ֡;->ۘ:I

    mul-int/lit8 p1, p1, 0x8

    add-int/2addr p1, v0

    return p1

    .line 333
    :cond_0
    new-instance v0, Ll/ۙۛ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Method index out of bounds: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    throw v0
.end method

.method public final ܿ()Ll/᩺ۤ֡;
    .locals 2

    .line 249
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    instance-of v1, v0, Ll/᩺ۤ֡;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩺ۤ֡;

    return-object v0

    .line 252
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ᩳ(I)Ll/֨ܰ֡;
    .locals 3

    .line 739
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    iget v1, p0, Ll/۬ۛ֡;->ܺ:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    .line 741
    new-instance v1, Ll/᩶ۛ֡;

    invoke-direct {v1, p0, v0}, Ll/᩶ۛ֡;-><init>(Ll/۬ۛ֡;I)V

    .line 757
    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ܰ֡;

    .line 758
    invoke-virtual {v1}, Ll/֨ܰ֡;->ܽ()I

    move-result v2

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩳ()Ll/ۘۨ֡;
    .locals 1

    .line 245
    iget-object v0, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 607
    new-instance v0, Ll/᩸ۛ֡;

    invoke-direct {v0, p0}, Ll/᩸ۛ֡;-><init>(Ll/۬ۛ֡;)V

    return-object v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 778
    iget-boolean v0, p0, Ll/۬ۛ֡;->ۚ:Z

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 389
    iget v0, p0, Ll/۬ۛ֡;->ۖ:I

    return v0
.end method

.method public final ᩷(I)Ljava/lang/String;
    .locals 3

    .line 439
    iget-boolean v0, p0, Ll/۬ۛ֡;->ܿ:Z

    if-eqz v0, :cond_0

    .line 440
    iget-object v1, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v1, p1}, Ll/ᩳۛ֡;->֫(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return-object v1

    .line 443
    :cond_1
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۢ(I)I

    move-result v1

    .line 444
    iget-object v2, p0, Ll/۬ۛ֡;->ᩳ:Ll/ۘۨ֡;

    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    .line 445
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v1

    .line 446
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v2

    .line 447
    invoke-virtual {v1, v2}, Ll/ᩴۨ֡;->ۜ(I)Ljava/lang/String;

    move-result-object v2

    .line 448
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۘ()V

    if-eqz v0, :cond_2

    .line 450
    iget-object v0, p0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v0, p1, v2}, Ll/ᩳۛ֡;->֫(ILjava/lang/String;)V

    :cond_2
    return-object v2
.end method

.method public final ᩻()I
    .locals 1

    .line 385
    iget v0, p0, Ll/۬ۛ֡;->ܳ:I

    return v0
.end method

.method public final ᩻(I)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 503
    :cond_0
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
