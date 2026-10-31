.class public final Ll/۠ۘۘ;
.super Ljava/lang/Object;
.source "57Z1"


# instance fields
.field public ֫:Ll/᩵ۘۘ;

.field public ۜ:Ljava/io/ByteArrayOutputStream;

.field public ۡ:I

.field public ۢ:I

.field public ۧ:[B

.field public ܳ:J

.field public final ܺ:Ll/ܶۘۘ;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Ll/ᩴۘۘ;

.field public ᩷:J

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܶۘۘ;)V
    .locals 2

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 94
    iput-wide v0, p0, Ll/۠ۘۘ;->᩷:J

    const/4 v0, -0x1

    .line 115
    iput v0, p0, Ll/۠ۘۘ;->᩻:I

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 116
    iput-object v0, p0, Ll/۠ۘۘ;->ۧ:[B

    const/4 v0, 0x0

    .line 118
    iput-object v0, p0, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    .line 717
    iput-object v0, p0, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    .line 140
    iput-object p1, p0, Ll/۠ۘۘ;->ܺ:Ll/ܶۘۘ;

    return-void
.end method

.method private ֫(II)I
    .locals 6

    .line 741
    iget-object v0, p0, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    if-nez v0, :cond_0

    .line 742
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    .line 745
    :cond_0
    :goto_0
    iget-wide v0, p0, Ll/۠ۘۘ;->ܳ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    .line 746
    iget-object v0, p0, Ll/۠ۘۘ;->ܺ:Ll/ܶۘۘ;

    iget v1, v0, Ll/᩶ۘۘ;->ۧ:I

    if-eqz v1, :cond_1

    add-int/lit8 v1, v1, -0x1

    .line 750
    iput v1, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 751
    iget-wide v1, v0, Ll/᩶ۘۘ;->ۡ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 752
    iget-object p1, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v1, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v2, p1, v1

    .line 753
    iget-object v2, p0, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    const/4 v5, 0x1

    invoke-virtual {v2, p1, v1, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 754
    iget-object p1, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    iget-object v1, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v2, v0, Ll/᩶ۘۘ;->ۜ:I

    invoke-interface {p1, v1, v2, v5}, Ll/᩷ۘۘ;->update([BII)V

    .line 755
    iget p1, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/2addr p1, v5

    iput p1, v0, Ll/᩶ۘۘ;->ۜ:I

    .line 756
    iget-wide v0, p0, Ll/۠ۘۘ;->ܳ:J

    sub-long/2addr v0, v3

    iput-wide v0, p0, Ll/۠ۘۘ;->ܳ:J

    move p1, p2

    goto :goto_0

    .line 747
    :cond_1
    new-instance p2, Ll/֨ۘۘ;

    invoke-direct {p2, p1}, Ll/֨ۘۘ;-><init>(I)V

    throw p2

    :cond_2
    return p1
.end method

.method private ֫(III)I
    .locals 7

    .line 685
    iget v0, p0, Ll/۠ۘۘ;->᩻:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 686
    iput p1, p0, Ll/۠ۘۘ;->᩻:I

    const-wide/16 v2, 0x0

    .line 687
    iput-wide v2, p0, Ll/۠ۘۘ;->ܳ:J

    .line 689
    :cond_0
    :goto_0
    iget v0, p0, Ll/۠ۘۘ;->᩻:I

    if-lez v0, :cond_2

    .line 690
    iget-object v2, p0, Ll/۠ۘۘ;->ܺ:Ll/ܶۘۘ;

    iget v3, v2, Ll/᩶ۘۘ;->ۧ:I

    if-eqz v3, :cond_1

    add-int/lit8 v3, v3, -0x1

    .line 694
    iput v3, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 695
    iget-wide v3, v2, Ll/᩶ۘۘ;->ۡ:J

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    iput-wide v3, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 696
    iget-wide v3, p0, Ll/۠ۘۘ;->ܳ:J

    iget-object p2, v2, Ll/᩶ۘۘ;->᩻:[B

    iget v5, v2, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v2, Ll/᩶ۘۘ;->ۜ:I

    aget-byte p2, p2, v5

    and-int/lit16 p2, p2, 0xff

    sub-int v2, p1, v0

    mul-int/lit8 v2, v2, 0x8

    shl-int/2addr p2, v2

    int-to-long v5, p2

    or-long v2, v3, v5

    iput-wide v2, p0, Ll/۠ۘۘ;->ܳ:J

    add-int/lit8 v0, v0, -0x1

    .line 697
    iput v0, p0, Ll/۠ۘۘ;->᩻:I

    move p2, p3

    goto :goto_0

    .line 691
    :cond_1
    new-instance p1, Ll/֨ۘۘ;

    invoke-direct {p1, p2}, Ll/֨ۘۘ;-><init>(I)V

    throw p1

    :cond_2
    const/4 p3, 0x2

    if-ne p1, p3, :cond_3

    .line 700
    iget-wide v2, p0, Ll/۠ۘۘ;->ܳ:J

    const-wide/32 v4, 0xffff

    and-long/2addr v2, v4

    iput-wide v2, p0, Ll/۠ۘۘ;->ܳ:J

    goto :goto_1

    :cond_3
    const/4 p3, 0x4

    if-ne p1, p3, :cond_4

    .line 702
    iget-wide v2, p0, Ll/۠ۘۘ;->ܳ:J

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    iput-wide v2, p0, Ll/۠ۘۘ;->ܳ:J

    .line 704
    :cond_4
    :goto_1
    iput v1, p0, Ll/۠ۘۘ;->᩻:I

    return p2
.end method

.method private ֫(IJ)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 762
    :goto_0
    iget-object v2, p0, Ll/۠ۘۘ;->ۧ:[B

    if-ge v1, p1, :cond_0

    const-wide/16 v3, 0xff

    and-long/2addr v3, p2

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 763
    aput-byte v3, v2, v1

    const/16 v2, 0x8

    shr-long/2addr p2, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 766
    :cond_0
    iget-object p2, p0, Ll/۠ۘۘ;->ܺ:Ll/ܶۘۘ;

    iget-object p2, p2, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    invoke-interface {p2, v2, v0, p1}, Ll/᩷ۘۘ;->update([BII)V

    return-void
.end method

.method private ۧ(II)V
    .locals 5

    .line 720
    iget-object v0, p0, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    if-nez v0, :cond_0

    .line 721
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    .line 725
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/۠ۘۘ;->ܺ:Ll/ܶۘۘ;

    iget v1, v0, Ll/᩶ۘۘ;->ۧ:I

    if-eqz v1, :cond_3

    add-int/lit8 v1, v1, -0x1

    .line 729
    iput v1, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 730
    iget-wide v1, v0, Ll/᩶ۘۘ;->ۡ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 731
    iget-object p1, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v1, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v2, p1, v1

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 733
    iget-object v4, p0, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v4, p1, v1, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 734
    :cond_1
    iget-object p1, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    iget-object v1, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v4, v0, Ll/᩶ۘۘ;->ۜ:I

    invoke-interface {p1, v1, v4, v3}, Ll/᩷ۘۘ;->update([BII)V

    .line 735
    iget p1, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/2addr p1, v3

    iput p1, v0, Ll/᩶ۘۘ;->ۜ:I

    if-nez v2, :cond_2

    return-void

    :cond_2
    move p1, p2

    goto :goto_0

    .line 726
    :cond_3
    new-instance p2, Ll/֨ۘۘ;

    invoke-direct {p2, p1}, Ll/֨ۘۘ;-><init>(I)V

    throw p2
.end method


# virtual methods
.method public final ֫()I
    .locals 25

    move-object/from16 v1, p0

    .line 192
    iget-object v0, v1, Ll/۠ۘۘ;->ܺ:Ll/ܶۘۘ;

    iget-object v2, v0, Ll/᩶ۘۘ;->᩻:[B

    if-nez v2, :cond_0

    :goto_0
    const/4 v0, -0x2

    goto/16 :goto_9

    :cond_0
    const/4 v2, -0x5

    .line 202
    :goto_1
    iget v3, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v4, -0x3

    const-string v5, "unknown compression method"

    const v6, 0xffff

    const-string v8, "incorrect data check"

    const/16 v15, 0x10

    const/16 v16, 0x18

    const-wide/16 v17, 0xff

    const/4 v13, 0x0

    const-wide/16 v19, 0x1

    const/4 v14, 0x0

    const-wide v21, 0xff000000L

    const/4 v9, 0x4

    const/16 v10, 0x8

    const-wide/32 v23, 0xffff

    const/16 v11, 0xd

    const/4 v12, 0x2

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 443
    :pswitch_0
    :try_start_0
    invoke-direct {v1, v12, v2, v13}, Ll/۠ۘۘ;->֫(III)I

    move-result v2
    :try_end_0
    .catch Ll/֨ۘۘ; {:try_start_0 .. :try_end_0} :catch_0

    .line 448
    iget-wide v3, v1, Ll/۠ۘۘ;->ܳ:J

    long-to-int v8, v3

    and-int v7, v8, v6

    iput v7, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v7, v8, 0xff

    if-eq v7, v10, :cond_1

    .line 451
    iput-object v5, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 452
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    goto :goto_1

    :cond_1
    const v5, 0xe000

    and-int/2addr v5, v8

    if-eqz v5, :cond_2

    const-string v3, "unknown header flags set"

    .line 456
    iput-object v3, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 457
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    goto :goto_1

    :cond_2
    and-int/lit16 v5, v8, 0x200

    if-eqz v5, :cond_3

    .line 462
    invoke-direct {v1, v12, v3, v4}, Ll/۠ۘۘ;->֫(IJ)V

    .line 465
    :cond_3
    iput v15, v1, Ll/۠ۘۘ;->ܿ:I

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 445
    iget v0, v2, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 469
    :goto_2
    :pswitch_1
    :try_start_1
    invoke-direct {v1, v9, v2, v13}, Ll/۠ۘۘ;->֫(III)I

    move-result v2
    :try_end_1
    .catch Ll/֨ۘۘ; {:try_start_1 .. :try_end_1} :catch_7

    .line 473
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_4

    .line 474
    iget-wide v4, v1, Ll/۠ۘۘ;->ܳ:J

    .line 69
    iput-wide v4, v3, Ll/ᩴۘۘ;->᩶:J

    .line 476
    :cond_4
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x200

    if-eqz v3, :cond_5

    .line 477
    iget-wide v3, v1, Ll/۠ۘۘ;->ܳ:J

    invoke-direct {v1, v9, v3, v4}, Ll/۠ۘۘ;->֫(IJ)V

    :cond_5
    const/16 v3, 0x11

    .line 479
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    .line 482
    :pswitch_2
    :try_start_2
    invoke-direct {v1, v12, v2, v13}, Ll/۠ۘۘ;->֫(III)I

    move-result v2
    :try_end_2
    .catch Ll/֨ۘۘ; {:try_start_2 .. :try_end_2} :catch_6

    .line 486
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_6

    .line 488
    iget-wide v4, v1, Ll/۠ۘۘ;->ܳ:J

    long-to-int v5, v4

    shr-int/lit8 v4, v5, 0x8

    and-int/lit16 v4, v4, 0xff

    iput v4, v3, Ll/ᩴۘۘ;->ۗ:I

    .line 490
    :cond_6
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x200

    if-eqz v3, :cond_7

    .line 491
    iget-wide v3, v1, Ll/۠ۘۘ;->ܳ:J

    invoke-direct {v1, v12, v3, v4}, Ll/۠ۘۘ;->֫(IJ)V

    :cond_7
    const/16 v3, 0x12

    .line 493
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    .line 495
    :pswitch_3
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_9

    .line 497
    :try_start_3
    invoke-direct {v1, v12, v2, v13}, Ll/۠ۘۘ;->֫(III)I

    move-result v2
    :try_end_3
    .catch Ll/֨ۘۘ; {:try_start_3 .. :try_end_3} :catch_1

    .line 501
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_8

    .line 502
    iget-wide v4, v1, Ll/۠ۘۘ;->ܳ:J

    long-to-int v5, v4

    and-int v4, v5, v6

    new-array v4, v4, [B

    iput-object v4, v3, Ll/ᩴۘۘ;->᩹:[B

    .line 504
    :cond_8
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x200

    if-eqz v3, :cond_a

    .line 505
    iget-wide v3, v1, Ll/۠ۘۘ;->ܳ:J

    invoke-direct {v1, v12, v3, v4}, Ll/۠ۘۘ;->֫(IJ)V

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 499
    iget v0, v2, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 507
    :cond_9
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_a

    .line 508
    iput-object v14, v3, Ll/ᩴۘۘ;->᩹:[B

    :cond_a
    :goto_3
    const/16 v3, 0x13

    .line 510
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    .line 513
    :pswitch_4
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_c

    .line 515
    :try_start_4
    invoke-direct {v1, v2, v13}, Ll/۠ۘۘ;->֫(II)I

    move-result v2

    .line 516
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_d

    .line 517
    iget-object v3, v1, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    .line 518
    iput-object v14, v1, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    .line 519
    array-length v4, v3

    iget-object v5, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    iget-object v5, v5, Ll/ᩴۘۘ;->᩹:[B

    array-length v6, v5

    if-ne v4, v6, :cond_b

    .line 520
    array-length v4, v3

    invoke-static {v3, v13, v5, v13, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_b
    const-string v3, "bad extra field length"

    .line 522
    iput-object v3, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 523
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I
    :try_end_4
    .catch Ll/֨ۘۘ; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_1

    :catch_2
    move-exception v0

    .line 528
    iget v0, v0, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 530
    :cond_c
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_d

    .line 531
    iput-object v14, v3, Ll/ᩴۘۘ;->᩹:[B

    :cond_d
    :goto_4
    const/16 v3, 0x14

    .line 533
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    .line 535
    :pswitch_5
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x800

    if-eqz v3, :cond_f

    .line 537
    :try_start_5
    invoke-direct {v1, v2, v13}, Ll/۠ۘۘ;->ۧ(II)V

    .line 538
    iget-object v2, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v2, :cond_e

    .line 539
    iget-object v3, v1, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    iput-object v3, v2, Ll/ᩴۘۘ;->ۙ:[B

    .line 541
    :cond_e
    iput-object v14, v1, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;
    :try_end_5
    .catch Ll/֨ۘۘ; {:try_start_5 .. :try_end_5} :catch_3

    const/4 v2, 0x0

    goto :goto_5

    :catch_3
    move-exception v0

    .line 543
    iget v0, v0, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 545
    :cond_f
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_10

    .line 546
    iput-object v14, v3, Ll/ᩴۘۘ;->ۙ:[B

    :cond_10
    :goto_5
    const/16 v3, 0x15

    .line 548
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    .line 550
    :pswitch_6
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x1000

    if-eqz v3, :cond_12

    .line 552
    :try_start_6
    invoke-direct {v1, v2, v13}, Ll/۠ۘۘ;->ۧ(II)V

    .line 553
    iget-object v2, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v2, :cond_11

    .line 554
    iget-object v3, v1, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    iput-object v3, v2, Ll/ᩴۘۘ;->᩸:[B

    .line 556
    :cond_11
    iput-object v14, v1, Ll/۠ۘۘ;->ۜ:Ljava/io/ByteArrayOutputStream;
    :try_end_6
    .catch Ll/֨ۘۘ; {:try_start_6 .. :try_end_6} :catch_4

    const/4 v2, 0x0

    goto :goto_6

    :catch_4
    move-exception v0

    .line 558
    iget v0, v0, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 560
    :cond_12
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-eqz v3, :cond_13

    .line 561
    iput-object v14, v3, Ll/ᩴۘۘ;->᩸:[B

    :cond_13
    :goto_6
    const/16 v3, 0x16

    .line 563
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    .line 565
    :pswitch_7
    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    and-int/lit16 v3, v3, 0x200

    if-eqz v3, :cond_14

    .line 567
    :try_start_7
    invoke-direct {v1, v12, v2, v13}, Ll/۠ۘۘ;->֫(III)I

    move-result v2
    :try_end_7
    .catch Ll/֨ۘۘ; {:try_start_7 .. :try_end_7} :catch_5

    .line 574
    iget-wide v3, v1, Ll/۠ۘۘ;->ܳ:J

    iget-object v5, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    invoke-interface {v5}, Ll/᩷ۘۘ;->getValue()J

    move-result-wide v5

    and-long v5, v5, v23

    cmp-long v7, v3, v5

    if-eqz v7, :cond_14

    .line 575
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    const-string v3, "header crc mismatch"

    .line 576
    iput-object v3, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    goto/16 :goto_1

    :catch_5
    move-exception v0

    move-object v2, v0

    .line 569
    iget v0, v2, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 581
    :cond_14
    new-instance v3, Ll/ۜۘۘ;

    invoke-direct {v3}, Ll/ۜۘۘ;-><init>()V

    iput-object v3, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    const/4 v3, 0x7

    .line 583
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    :catch_6
    move-exception v0

    move-object v2, v0

    .line 484
    iget v0, v2, Ll/֨ۘۘ;->᩸:I

    return v0

    :catch_7
    move-exception v0

    move-object v2, v0

    .line 471
    iget v0, v2, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 204
    :pswitch_8
    iget v3, v1, Ll/۠ۘۘ;->ۡ:I

    if-nez v3, :cond_15

    const/4 v3, 0x7

    .line 205
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    .line 210
    :cond_15
    :try_start_8
    invoke-direct {v1, v12, v2, v13}, Ll/۠ۘۘ;->֫(III)I

    move-result v2
    :try_end_8
    .catch Ll/֨ۘۘ; {:try_start_8 .. :try_end_8} :catch_8

    .line 215
    iget v3, v1, Ll/۠ۘۘ;->ۡ:I

    if-eq v3, v9, :cond_16

    and-int/lit8 v4, v3, 0x2

    if-eqz v4, :cond_19

    :cond_16
    iget-wide v6, v1, Ll/۠ۘۘ;->ܳ:J

    const-wide/32 v14, 0x8b1f

    cmp-long v4, v6, v14

    if-nez v4, :cond_19

    if-ne v3, v9, :cond_17

    .line 217
    iput v12, v1, Ll/۠ۘۘ;->ۡ:I

    .line 219
    :cond_17
    new-instance v3, Ll/ۜۘۘ;

    invoke-direct {v3}, Ll/ۜۘۘ;-><init>()V

    iput-object v3, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    .line 220
    iget-wide v3, v1, Ll/۠ۘۘ;->ܳ:J

    invoke-direct {v1, v12, v3, v4}, Ll/۠ۘۘ;->֫(IJ)V

    .line 222
    iget-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    if-nez v3, :cond_18

    .line 223
    new-instance v3, Ll/ᩴۘۘ;

    invoke-direct {v3}, Ll/ᩴۘۘ;-><init>()V

    iput-object v3, v1, Ll/۠ۘۘ;->ᩳ:Ll/ᩴۘۘ;

    :cond_18
    const/16 v3, 0x17

    .line 225
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    :cond_19
    and-int/lit8 v4, v3, 0x2

    const-string v6, "incorrect header check"

    if-eqz v4, :cond_1a

    .line 230
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    .line 231
    iput-object v6, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    goto/16 :goto_1

    .line 235
    :cond_1a
    iput v13, v1, Ll/۠ۘۘ;->ܽ:I

    .line 237
    iget-wide v7, v1, Ll/۠ۘۘ;->ܳ:J

    long-to-int v4, v7

    and-int/lit16 v14, v4, 0xff

    shr-long/2addr v7, v10

    long-to-int v8, v7

    and-int/lit16 v7, v8, 0xff

    and-int/lit8 v15, v3, 0x1

    if-eqz v15, :cond_1b

    shl-int/lit8 v15, v14, 0x8

    add-int/2addr v15, v7

    .line 240
    rem-int/lit8 v15, v15, 0x1f

    if-eqz v15, :cond_1d

    :cond_1b
    and-int/lit8 v7, v4, 0xf

    if-eq v7, v10, :cond_1d

    if-ne v3, v9, :cond_1c

    .line 243
    iget v3, v0, Ll/᩶ۘۘ;->ۜ:I

    sub-int/2addr v3, v12

    iput v3, v0, Ll/᩶ۘۘ;->ۜ:I

    .line 244
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    add-int/2addr v3, v12

    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 245
    iget-wide v3, v0, Ll/᩶ۘۘ;->ۡ:J

    const-wide/16 v5, 0x2

    sub-long/2addr v3, v5

    iput-wide v3, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 246
    iput v13, v1, Ll/۠ۘۘ;->ۡ:I

    const/4 v3, 0x7

    .line 247
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    .line 250
    :cond_1c
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    .line 251
    iput-object v6, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    goto/16 :goto_1

    :cond_1d
    and-int/lit8 v4, v4, 0xf

    if-eq v4, v10, :cond_1e

    .line 260
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    .line 261
    iput-object v5, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    goto/16 :goto_1

    :cond_1e
    if-ne v3, v9, :cond_1f

    const/4 v3, 0x1

    .line 270
    iput v3, v1, Ll/۠ۘۘ;->ۡ:I

    :cond_1f
    shr-int/lit8 v3, v14, 0x4

    add-int/2addr v3, v10

    .line 273
    iget v4, v1, Ll/۠ۘۘ;->ۢ:I

    if-le v3, v4, :cond_20

    .line 274
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    const-string v3, "invalid window size"

    .line 275
    iput-object v3, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    goto/16 :goto_1

    .line 283
    :cond_20
    new-instance v3, Ll/᩻ۘۘ;

    invoke-direct {v3}, Ll/᩻ۘۘ;-><init>()V

    iput-object v3, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    and-int/lit8 v3, v8, 0x20

    if-nez v3, :cond_21

    const/4 v3, 0x7

    .line 286
    iput v3, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    .line 289
    :cond_21
    iput v12, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_8

    :catch_8
    move-exception v0

    move-object v2, v0

    .line 212
    iget v0, v2, Ll/֨ۘۘ;->᩸:I

    return v0

    :pswitch_9
    return v4

    :pswitch_a
    const/4 v0, 0x1

    return v0

    .line 334
    :pswitch_b
    iget-object v3, v1, Ll/۠ۘۘ;->֫:Ll/᩵ۘۘ;

    invoke-virtual {v3, v2}, Ll/᩵ۘۘ;->ۧ(I)I

    move-result v2

    if-ne v2, v4, :cond_22

    .line 336
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    :cond_22
    if-nez v2, :cond_23

    const/4 v2, 0x0

    :cond_23
    const/4 v3, 0x1

    if-eq v2, v3, :cond_24

    return v2

    .line 347
    :cond_24
    iget-object v2, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    invoke-interface {v2}, Ll/᩷ۘۘ;->getValue()J

    move-result-wide v2

    iput-wide v2, v1, Ll/۠ۘۘ;->᩷:J

    .line 348
    iget-object v2, v1, Ll/۠ۘۘ;->֫:Ll/᩵ۘۘ;

    invoke-virtual {v2}, Ll/᩵ۘۘ;->֫()V

    .line 349
    iget v2, v1, Ll/۠ۘۘ;->ۡ:I

    if-nez v2, :cond_25

    const/16 v2, 0xc

    .line 350
    iput v2, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    goto/16 :goto_1

    .line 353
    :cond_25
    iput v10, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 355
    :pswitch_c
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_26

    return v2

    :cond_26
    add-int/lit8 v3, v3, -0x1

    .line 359
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 360
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 361
    iget-object v2, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v3, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x18

    int-to-long v2, v2

    and-long v2, v2, v21

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    const/16 v2, 0x9

    .line 362
    iput v2, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 364
    :pswitch_d
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_27

    return v2

    :cond_27
    add-int/lit8 v3, v3, -0x1

    .line 368
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 369
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 370
    iget-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    iget-object v4, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v5, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    int-to-long v4, v4

    const-wide/32 v6, 0xff0000

    and-long/2addr v4, v6

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    const/16 v2, 0xa

    .line 371
    iput v2, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 373
    :pswitch_e
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_28

    return v2

    :cond_28
    add-int/lit8 v3, v3, -0x1

    .line 377
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 378
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 379
    iget-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    iget-object v4, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v5, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v10

    int-to-long v4, v4

    const-wide/32 v6, 0xff00

    and-long/2addr v4, v6

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    const/16 v2, 0xb

    .line 380
    iput v2, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 382
    :pswitch_f
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_29

    return v2

    :cond_29
    add-int/lit8 v3, v3, -0x1

    .line 386
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 387
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 388
    iget-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    iget-object v4, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v5, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v4, v4, v5

    int-to-long v4, v4

    and-long v4, v4, v17

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    .line 390
    iget v4, v1, Ll/۠ۘۘ;->ܽ:I

    if-eqz v4, :cond_2a

    const-wide/32 v4, -0x1000000

    and-long/2addr v4, v2

    shr-long v4, v4, v16

    const-wide/32 v6, 0xff0000

    and-long/2addr v6, v2

    shr-long/2addr v6, v10

    or-long/2addr v4, v6

    const-wide/32 v6, 0xff00

    and-long/2addr v6, v2

    shl-long/2addr v6, v10

    or-long/2addr v4, v6

    and-long v2, v2, v23

    shl-long v2, v2, v16

    or-long/2addr v2, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    .line 391
    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    .line 395
    :cond_2a
    iget-wide v2, v1, Ll/۠ۘۘ;->᩷:J

    long-to-int v3, v2

    iget-wide v4, v1, Ll/۠ۘۘ;->ܳ:J

    long-to-int v2, v4

    if-eq v3, v2, :cond_2b

    .line 396
    iput-object v8, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    :cond_2b
    const/16 v2, 0xf

    .line 405
    iput v2, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 407
    :pswitch_10
    iget v3, v1, Ll/۠ۘۘ;->ۡ:I

    if-eqz v3, :cond_2e

    iget v3, v1, Ll/۠ۘۘ;->ܽ:I

    if-eqz v3, :cond_2e

    .line 410
    :try_start_9
    invoke-direct {v1, v9, v2, v13}, Ll/۠ۘۘ;->֫(III)I

    move-result v2
    :try_end_9
    .catch Ll/֨ۘۘ; {:try_start_9 .. :try_end_9} :catch_9

    .line 415
    iget-object v3, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    if-eqz v3, :cond_2c

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    .line 416
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    .line 421
    :cond_2c
    iget-wide v3, v1, Ll/۠ۘۘ;->ܳ:J

    iget-wide v5, v0, Ll/᩶ۘۘ;->ܺ:J

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    cmp-long v7, v3, v5

    if-eqz v7, :cond_2d

    const-string v3, "incorrect length check"

    .line 422
    iput-object v3, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 423
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    .line 426
    :cond_2d
    iput-object v14, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    goto :goto_7

    :catch_9
    move-exception v0

    move-object v2, v0

    .line 412
    iget v0, v2, Ll/֨ۘۘ;->᩸:I

    return v0

    .line 428
    :cond_2e
    iget-object v3, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    if-eqz v3, :cond_2f

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    .line 429
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    goto/16 :goto_1

    :cond_2f
    :goto_7
    const/16 v0, 0xc

    .line 435
    iput v0, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v0, 0x1

    return v0

    .line 329
    :pswitch_11
    iput v11, v1, Ll/۠ۘۘ;->ܿ:I

    const-string v2, "need dictionary"

    .line 330
    iput-object v2, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    const/4 v0, -0x2

    return v0

    .line 291
    :goto_8
    :pswitch_12
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_30

    return v2

    :cond_30
    add-int/lit8 v3, v3, -0x1

    .line 295
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 296
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 297
    iget-object v2, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v3, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x18

    int-to-long v2, v2

    and-long v2, v2, v21

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    const/4 v2, 0x3

    .line 298
    iput v2, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 300
    :pswitch_13
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_31

    return v2

    :cond_31
    add-int/lit8 v3, v3, -0x1

    .line 304
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 305
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 306
    iget-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    iget-object v4, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v5, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    int-to-long v4, v4

    const-wide/32 v6, 0xff0000

    and-long/2addr v4, v6

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    .line 307
    iput v9, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 309
    :pswitch_14
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_32

    return v2

    :cond_32
    add-int/lit8 v3, v3, -0x1

    .line 313
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 314
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 315
    iget-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    iget-object v4, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v5, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v10

    int-to-long v4, v4

    const-wide/32 v6, 0xff00

    and-long/2addr v4, v6

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    const/4 v2, 0x5

    .line 316
    iput v2, v1, Ll/۠ۘۘ;->ܿ:I

    const/4 v2, 0x0

    .line 318
    :pswitch_15
    iget v3, v0, Ll/᩶ۘۘ;->ۧ:I

    if-nez v3, :cond_33

    return v2

    :cond_33
    add-int/lit8 v3, v3, -0x1

    .line 322
    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 323
    iget-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    add-long v2, v2, v19

    iput-wide v2, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 324
    iget-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    iget-object v4, v0, Ll/᩶ۘۘ;->᩻:[B

    iget v5, v0, Ll/᩶ۘۘ;->ۜ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v0, Ll/᩶ۘۘ;->ۜ:I

    aget-byte v4, v4, v5

    int-to-long v4, v4

    and-long v4, v4, v17

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/۠ۘۘ;->ܳ:J

    .line 325
    iget-object v0, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    invoke-interface {v0, v2, v3}, Ll/᩷ۘۘ;->֫(J)V

    const/4 v0, 0x6

    .line 326
    iput v0, v1, Ll/۠ۘۘ;->ܿ:I

    return v12

    :goto_9
    return v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_11
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_10
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ()I
    .locals 5

    .line 144
    iget-object v0, p0, Ll/۠ۘۘ;->ܺ:Ll/ܶۘۘ;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 145
    iput-object v1, p0, Ll/۠ۘۘ;->֫:Ll/᩵ۘۘ;

    const/4 v2, 0x1

    .line 160
    iput v2, p0, Ll/۠ۘۘ;->ۡ:I

    const/16 v2, 0xf

    .line 175
    iput v2, p0, Ll/۠ۘۘ;->ۢ:I

    .line 177
    new-instance v2, Ll/᩵ۘۘ;

    const v3, 0x8000

    invoke-direct {v2, v0, v3}, Ll/᩵ۘۘ;-><init>(Ll/ܶۘۘ;I)V

    iput-object v2, p0, Ll/۠ۘۘ;->֫:Ll/᩵ۘۘ;

    const-wide/16 v3, 0x0

    .line 124
    iput-wide v3, v0, Ll/᩶ۘۘ;->ܺ:J

    iput-wide v3, v0, Ll/᩶ۘۘ;->ۡ:J

    .line 125
    iput-object v1, v0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    const/16 v0, 0xe

    .line 126
    iput v0, p0, Ll/۠ۘۘ;->ܿ:I

    const/4 v0, -0x1

    .line 127
    iput v0, p0, Ll/۠ۘۘ;->᩻:I

    .line 128
    invoke-virtual {v2}, Ll/᩵ۘۘ;->֫()V

    const/4 v0, 0x0

    return v0
.end method
