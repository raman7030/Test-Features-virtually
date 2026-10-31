.class public final Ll/ܺ֫ܳ;
.super Ljava/io/OutputStream;
.source "J57U"


# instance fields
.field public ֫֫:I

.field public ۗ:I

.field public ۙ:I

.field public ۛ:I

.field public final ۟:[B

.field public ۤ:J

.field public final ۨ:[B

.field public ۫:I

.field public final ۬:[I

.field public ܰ:J

.field public final ᩶:I

.field public final ᩸:Ll/֫ܽܳ;

.field public final ᩹:Ll/ܿۖ᩷;

.field public final ᩺:[I


# direct methods
.method public constructor <init>(Ll/֫ܽܳ;I[B[BLl/ܿۖ᩷;)V
    .locals 1

    .line 603
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/16 v0, 0x400

    new-array v0, v0, [I

    .line 598
    iput-object v0, p0, Ll/ܺ֫ܳ;->۬:[I

    const/4 v0, -0x1

    .line 600
    iput v0, p0, Ll/ܺ֫ܳ;->ۙ:I

    .line 604
    iput-object p1, p0, Ll/ܺ֫ܳ;->᩸:Ll/֫ܽܳ;

    .line 605
    iput p2, p0, Ll/ܺ֫ܳ;->᩶:I

    .line 606
    iput-object p3, p0, Ll/ܺ֫ܳ;->ۨ:[B

    .line 607
    iput-object p4, p0, Ll/ܺ֫ܳ;->۟:[B

    .line 608
    iput-object p5, p0, Ll/ܺ֫ܳ;->᩹:Ll/ܿۖ᩷;

    .line 567
    array-length p1, p3

    new-array p1, p1, [I

    const/4 p2, 0x1

    const/4 p4, 0x0

    .line 568
    :goto_0
    array-length p5, p3

    if-ge p2, p5, :cond_2

    :goto_1
    if-lez p4, :cond_0

    .line 569
    aget-byte p5, p3, p2

    aget-byte v0, p3, p4

    if-eq p5, v0, :cond_0

    add-int/lit8 p4, p4, -0x1

    .line 570
    aget p4, p1, p4

    goto :goto_1

    .line 572
    :cond_0
    aget-byte p5, p3, p2

    aget-byte v0, p3, p4

    if-ne p5, v0, :cond_1

    add-int/lit8 p4, p4, 0x1

    .line 575
    :cond_1
    aput p4, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 609
    :cond_2
    iput-object p1, p0, Ll/ܺ֫ܳ;->᩺:[I

    return-void
.end method

.method private ֫(B)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 634
    :goto_0
    iget v2, v0, Ll/ܺ֫ܳ;->۫:I

    iget-object v3, v0, Ll/ܺ֫ܳ;->ۨ:[B

    if-lez v2, :cond_0

    aget-byte v4, v3, v2

    if-eq v4, v1, :cond_0

    add-int/lit8 v2, v2, -0x1

    .line 635
    iget-object v3, v0, Ll/ܺ֫ܳ;->᩺:[I

    aget v2, v3, v2

    iput v2, v0, Ll/ܺ֫ܳ;->۫:I

    goto :goto_0

    .line 637
    :cond_0
    aget-byte v4, v3, v2

    if-eq v4, v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 640
    iput v2, v0, Ll/ܺ֫ܳ;->۫:I

    .line 641
    array-length v1, v3

    if-eq v2, v1, :cond_2

    :goto_1
    return-void

    .line 645
    :cond_2
    iget v1, v0, Ll/ܺ֫ܳ;->ۛ:I

    array-length v2, v3

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    int-to-long v4, v1

    .line 646
    iget-wide v6, v0, Ll/ܺ֫ܳ;->ۤ:J

    add-long/2addr v4, v6

    .line 647
    array-length v2, v3

    int-to-long v8, v2

    add-long/2addr v8, v4

    .line 648
    iget v2, v0, Ll/ܺ֫ܳ;->᩶:I

    int-to-long v10, v2

    add-long/2addr v10, v6

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-ltz v2, :cond_9

    cmp-long v2, v8, v10

    if-gtz v2, :cond_9

    .line 652
    iget-object v2, v0, Ll/ܺ֫ܳ;->۟:[B

    array-length v8, v2

    int-to-long v8, v8

    add-long/2addr v10, v8

    array-length v8, v3

    int-to-long v8, v8

    sub-long/2addr v10, v8

    const-wide/32 v8, 0x7fffffff

    cmp-long v12, v10, v8

    if-gtz v12, :cond_8

    ushr-int/lit8 v8, v1, 0x10

    .line 658
    iget v9, v0, Ll/ܺ֫ܳ;->ۗ:I

    iget-object v12, v0, Ll/ܺ֫ܳ;->۬:[I

    iget-object v13, v0, Ll/ܺ֫ܳ;->᩸:Ll/֫ܽܳ;

    const/4 v14, 0x0

    if-eqz v9, :cond_4

    iget v15, v0, Ll/ܺ֫ܳ;->ۙ:I

    if-eq v8, v15, :cond_4

    if-nez v9, :cond_3

    goto :goto_2

    .line 689
    :cond_3
    invoke-virtual {v13, v9, v12}, Ll/֫ܽܳ;->֫(I[I)V

    .line 690
    iput v14, v0, Ll/ܺ֫ܳ;->ۗ:I

    .line 661
    :cond_4
    :goto_2
    iput v8, v0, Ll/ܺ֫ܳ;->ۙ:I

    .line 662
    iget v8, v0, Ll/ܺ֫ܳ;->ۗ:I

    add-int/lit8 v9, v8, 0x1

    iput v9, v0, Ll/ܺ֫ܳ;->ۗ:I

    aput v1, v12, v8

    .line 663
    array-length v1, v12

    if-ne v9, v1, :cond_6

    if-nez v9, :cond_5

    goto :goto_3

    .line 689
    :cond_5
    invoke-virtual {v13, v9, v12}, Ll/֫ܽܳ;->֫(I[I)V

    .line 690
    iput v14, v0, Ll/ܺ֫ܳ;->ۗ:I

    .line 666
    :cond_6
    :goto_3
    iget-wide v8, v0, Ll/ܺ֫ܳ;->ܰ:J

    const-wide/16 v12, 0x1

    add-long/2addr v8, v12

    iput-wide v8, v0, Ll/ܺ֫ܳ;->ܰ:J

    .line 667
    iget-wide v8, v0, Ll/ܺ֫ܳ;->ۤ:J

    array-length v1, v2

    int-to-long v12, v1

    array-length v1, v3

    int-to-long v14, v1

    sub-long/2addr v12, v14

    add-long/2addr v12, v8

    iput-wide v12, v0, Ll/ܺ֫ܳ;->ۤ:J

    .line 669
    array-length v1, v2

    int-to-long v1, v1

    add-long/2addr v4, v1

    cmp-long v1, v4, v6

    if-ltz v1, :cond_7

    cmp-long v1, v4, v10

    if-gtz v1, :cond_7

    long-to-int v1, v4

    .line 673
    iput v1, v0, Ll/ܺ֫ܳ;->֫֫:I

    const/4 v1, 0x0

    .line 674
    iput v1, v0, Ll/ܺ֫ܳ;->۫:I

    return-void

    .line 671
    :cond_7
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Replacement offset exceeds transaction length"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 655
    :cond_8
    new-instance v1, Ll/۟֫ܳ;

    invoke-direct {v1}, Ll/۟֫ܳ;-><init>()V

    throw v1

    .line 650
    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Search result exceeds transaction length"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final finish()Ll/ۡ֫ܳ;
    .locals 5

    .line 686
    iget v0, p0, Ll/ܺ֫ܳ;->ۗ:I

    iget-object v1, p0, Ll/ܺ֫ܳ;->᩸:Ll/֫ܽܳ;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 689
    :cond_0
    iget-object v3, p0, Ll/ܺ֫ܳ;->۬:[I

    invoke-virtual {v1, v0, v3}, Ll/֫ܽܳ;->֫(I[I)V

    .line 690
    iput v2, p0, Ll/ܺ֫ܳ;->ۗ:I

    .line 680
    :goto_0
    iget-object v0, p0, Ll/ܺ֫ܳ;->᩹:Ll/ܿۖ᩷;

    invoke-virtual {v1, v0}, Ll/֫ܽܳ;->֫(Ll/ܿۖ᩷;)V

    .line 681
    new-instance v0, Ll/ۡ֫ܳ;

    iget-wide v3, p0, Ll/ܺ֫ܳ;->ܰ:J

    iget v1, p0, Ll/ܺ֫ܳ;->֫֫:I

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ۡ֫ܳ;-><init>(JIZ)V

    return-object v0
.end method

.method public final write(I)V
    .locals 1

    .line 695
    iget-object v0, p0, Ll/ܺ֫ܳ;->᩹:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    int-to-byte p1, p1

    .line 615
    invoke-direct {p0, p1}, Ll/ܺ֫ܳ;->֫(B)V

    .line 616
    iget p1, p0, Ll/ܺ֫ܳ;->ۛ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܺ֫ܳ;->ۛ:I

    return-void

    .line 696
    :cond_0
    new-instance p1, Ll/ۘ֫ܳ;

    .line 704
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 696
    throw p1
.end method

.method public final write([BII)V
    .locals 5

    int-to-long v0, p2

    int-to-long v2, p3

    add-long/2addr v0, v2

    long-to-int p3, v0

    int-to-long v2, p3

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    :goto_0
    if-ge p2, p3, :cond_2

    .line 624
    iget v0, p0, Ll/ܺ֫ܳ;->ۛ:I

    and-int/lit16 v0, v0, 0xfff

    if-nez v0, :cond_1

    .line 695
    iget-object v0, p0, Ll/ܺ֫ܳ;->᩹:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 696
    :cond_0
    new-instance p1, Ll/ۘ֫ܳ;

    .line 704
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 696
    throw p1

    .line 627
    :cond_1
    :goto_1
    aget-byte v0, p1, p2

    invoke-direct {p0, v0}, Ll/ܺ֫ܳ;->֫(B)V

    .line 628
    iget v0, p0, Ll/ܺ֫ܳ;->ۛ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܺ֫ܳ;->ۛ:I

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 0
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method
