.class public final Ll/ܿܺۧ;
.super Ll/ܶۡۧ;
.source "38TX"


# static fields
.field public static final ۧ:Ll/ۡܶ֫;


# instance fields
.field public final ֫:Ll/ܽܺۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 60
    new-instance v0, Ll/ۡܶ֫;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ۡܶ֫;-><init>(I)V

    sput-object v0, Ll/ܿܺۧ;->ۧ:Ll/ۡܶ֫;

    return-void
.end method

.method public constructor <init>(Ll/ܽܺۧ;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, Ll/ܿܺۧ;->֫:Ll/ܽܺۧ;

    return-void
.end method

.method public static ֫(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(IIIII)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-ne p0, v3, :cond_0

    .line 818
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array p4, v2, [Ljava/lang/Object;

    aput-object p1, p4, v1

    aput-object p2, p4, v0

    aput-object p3, p4, v3

    const-string p1, "%c%c%c"

    invoke-static {p0, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 819
    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    aput-object p2, v4, v0

    aput-object p3, v4, v3

    aput-object p4, v4, v2

    const-string p1, "%c%c%c%c"

    invoke-static {p0, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([BIILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    if-le p2, p1, :cond_1

    .line 883
    array-length v0, p0

    if-le p2, v0, :cond_0

    goto :goto_0

    .line 886
    :cond_0
    new-instance v0, Ljava/lang/String;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(ILl/ᩳ֨֫;)Ll/֫ܺۧ;
    .locals 7

    const/4 v0, 0x4

    if-ge p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 630
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    .line 631
    invoke-static {v1}, Ll/ܿܺۧ;->ۧ(I)Ljava/nio/charset/Charset;

    move-result-object v2

    const/4 v3, 0x3

    new-array v4, v3, [B

    const/4 v5, 0x0

    .line 634
    invoke-virtual {p1, v5, v3, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 635
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v5, v3}, Ljava/lang/String;-><init>([BII)V

    sub-int/2addr p0, v0

    .line 637
    new-array v0, p0, [B

    .line 638
    invoke-virtual {p1, v5, p0, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 640
    invoke-static {v5, v1, v0}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result p0

    .line 641
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v5, p0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 643
    invoke-static {v1}, Ll/ܿܺۧ;->֫(I)I

    move-result v3

    add-int/2addr p0, v3

    .line 644
    invoke-static {p0, v1, v0}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result v1

    .line 645
    invoke-static {v0, p0, v1, v2}, Ll/ܿܺۧ;->֫([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    .line 647
    new-instance v0, Ll/֫ܺۧ;

    invoke-direct {v0, v6, p1, p0}, Ll/֫ܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ge p0, v1, :cond_0

    return-object v0

    .line 480
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    sub-int/2addr p0, v1

    .line 482
    new-array v1, p0, [B

    const/4 v3, 0x0

    .line 483
    invoke-virtual {p1, v3, p0, v1}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 485
    invoke-static {v2, v3, v1}, Ll/ܿܺۧ;->֫(II[B)Ll/ܳ۬ܺ;

    move-result-object p0

    .line 486
    new-instance p1, Ll/ۡܺۧ;

    invoke-direct {p1, p2, v0, p0}, Ll/ۡܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p1
.end method

.method public static ֫(Ll/ᩳ֨֫;II)Ll/ۨۡۧ;
    .locals 7

    .line 586
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 587
    invoke-static {v0}, Ll/ܿܺۧ;->ۧ(I)Ljava/nio/charset/Charset;

    move-result-object v1

    add-int/lit8 p1, p1, -0x1

    .line 589
    new-array v2, p1, [B

    const/4 v3, 0x0

    .line 590
    invoke-virtual {p0, v3, p1, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    const-string p0, "image/"

    const/4 v4, 0x2

    if-ne p2, v4, :cond_1

    .line 596
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance p0, Ljava/lang/String;

    const/4 v5, 0x3

    sget-object v6, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {p0, v2, v3, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {p0}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "image/jpg"

    .line 597
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p0, "image/jpeg"

    :cond_0
    const/4 p2, 0x2

    goto :goto_0

    .line 601
    :cond_1
    invoke-static {v3, v2}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result p2

    .line 602
    new-instance v5, Ljava/lang/String;

    sget-object v6, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v5, v2, v3, p2, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 603
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x2f

    .line 604
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    .line 605
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object p0, v3

    :goto_0
    add-int/lit8 v3, p2, 0x1

    .line 609
    aget-byte v3, v2, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr p2, v4

    .line 612
    invoke-static {p2, v0, v2}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result v4

    .line 613
    new-instance v5, Ljava/lang/String;

    sub-int v6, v4, p2

    invoke-direct {v5, v2, p2, v6, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 617
    invoke-static {v0}, Ll/ܿܺۧ;->֫(I)I

    move-result p2

    add-int/2addr v4, p2

    if-gt p1, v4, :cond_3

    .line 867
    sget-object p1, Ll/ۘ֨֫;->ܿ:[B

    goto :goto_1

    .line 869
    :cond_3
    invoke-static {v2, v4, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    .line 620
    :goto_1
    new-instance p2, Ll/ۨۡۧ;

    invoke-direct {p2, v3, p0, v5, p1}, Ll/ۨۡۧ;-><init>(ILjava/lang/String;Ljava/lang/String;[B)V

    return-object p2
.end method

.method public static ֫(Ll/ᩳ֨֫;IIZILl/ܽܺۧ;)Ll/ܰۡۧ;
    .locals 15

    move-object v0, p0

    .line 657
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 658
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result v2

    .line 659
    new-instance v4, Ljava/lang/String;

    .line 661
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    sub-int v5, v2, v1

    sget-object v6, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 v2, v2, 0x1

    .line 665
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 667
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    .line 668
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    .line 669
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    const-wide/16 v7, -0x1

    const-wide v9, 0xffffffffL

    cmp-long v11, v2, v9

    if-nez v11, :cond_0

    move-wide v11, v7

    goto :goto_0

    :cond_0
    move-wide v11, v2

    .line 673
    :goto_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    cmp-long v13, v2, v9

    if-nez v13, :cond_1

    move-wide v9, v7

    goto :goto_1

    :cond_1
    move-wide v9, v2

    .line 678
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    add-int v1, v1, p1

    .line 680
    :cond_2
    :goto_2
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    if-ge v3, v1, :cond_3

    move/from16 v3, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v13, p5

    .line 682
    invoke-static {v3, p0, v7, v8, v13}, Ll/ܿܺۧ;->֫(ILl/ᩳ֨֫;ZILl/ܽܺۧ;)Ll/ܳܺۧ;

    move-result-object v14

    if-eqz v14, :cond_2

    .line 685
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܳܺۧ;

    .line 689
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܳܺۧ;

    .line 690
    new-instance v1, Ll/ܰۡۧ;

    move-object v3, v1

    move-wide v7, v11

    move-object v11, v0

    invoke-direct/range {v3 .. v11}, Ll/ܰۡۧ;-><init>(Ljava/lang/String;IIJJ[Ll/ܳܺۧ;)V

    return-object v1
.end method

.method public static ֫(II[B)Ll/ܳ۬ܺ;
    .locals 6

    .line 491
    array-length v0, p2

    const-string v1, ""

    if-lt p1, v0, :cond_0

    .line 492
    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0

    .line 495
    :cond_0
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 497
    invoke-static {p1, p0, p2}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result v2

    :goto_0
    if-ge p1, v2, :cond_1

    .line 499
    new-instance v3, Ljava/lang/String;

    sub-int v4, v2, p1

    .line 500
    invoke-static {p0}, Ll/ܿܺۧ;->ۧ(I)Ljava/nio/charset/Charset;

    move-result-object v5

    invoke-direct {v3, p2, p1, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 501
    invoke-virtual {v0, v3}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 503
    invoke-static {p0}, Ll/ܿܺۧ;->֫(I)I

    move-result p1

    add-int/2addr p1, v2

    .line 504
    invoke-static {p1, p0, p2}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result v2

    goto :goto_0

    .line 507
    :cond_1
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    .line 508
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static ֫(ILl/ᩳ֨֫;ZILl/ܽܺۧ;)Ll/ܳܺۧ;
    .locals 18

    move/from16 v7, p0

    move-object/from16 v8, p1

    .line 290
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v9

    .line 291
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v10

    .line 292
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v11

    const/4 v12, 0x3

    if-lt v7, v12, :cond_0

    .line 293
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    move v13, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v13, 0x0

    :goto_0
    const/4 v14, 0x4

    if-ne v7, v14, :cond_2

    .line 297
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->᩹()I

    move-result v1

    if-nez p2, :cond_1

    and-int/lit16 v2, v1, 0xff

    shr-int/lit8 v3, v1, 0x8

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x7

    or-int/2addr v2, v3

    shr-int/lit8 v3, v1, 0x10

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0xe

    or-int/2addr v2, v3

    shr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v1, v2

    :cond_1
    :goto_1
    move v15, v1

    goto :goto_2

    :cond_2
    if-ne v7, v12, :cond_3

    .line 306
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->᩹()I

    move-result v1

    goto :goto_1

    .line 308
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->᩸()I

    move-result v1

    goto :goto_1

    :goto_2
    if-lt v7, v12, :cond_4

    .line 311
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    move v6, v1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_3
    const/16 v16, 0x0

    if-nez v9, :cond_5

    if-nez v10, :cond_5

    if-nez v11, :cond_5

    if-nez v13, :cond_5

    if-nez v15, :cond_5

    if-nez v6, :cond_5

    .line 319
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v0

    invoke-virtual {v8, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v16

    .line 323
    :cond_5
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    add-int v5, v1, v15

    .line 324
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    if-le v5, v1, :cond_6

    const-string v0, "Frame size exceeds remaining tag data"

    .line 325
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 326
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v0

    invoke-virtual {v8, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v16

    :cond_6
    if-eqz p4, :cond_7

    move-object/from16 v1, p4

    move/from16 v2, p0

    move v3, v9

    move v4, v10

    move v14, v5

    move v5, v11

    move v0, v6

    move v6, v13

    .line 331
    invoke-interface/range {v1 .. v6}, Ll/ܽܺۧ;->֫(IIIII)Z

    move-result v1

    if-nez v1, :cond_8

    .line 333
    invoke-virtual {v8, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v16

    :cond_7
    move v14, v5

    move v0, v6

    :cond_8
    const/4 v1, 0x1

    if-ne v7, v12, :cond_c

    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_9

    const/4 v2, 0x1

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    and-int/lit8 v3, v0, 0x40

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    goto :goto_5

    :cond_a
    const/4 v3, 0x0

    :goto_5
    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_b

    const/4 v0, 0x1

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    :goto_6
    const/4 v4, 0x0

    move v4, v3

    const/4 v5, 0x0

    move v3, v2

    goto :goto_c

    :cond_c
    const/4 v2, 0x4

    if-ne v7, v2, :cond_12

    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_d

    const/4 v2, 0x1

    goto :goto_7

    :cond_d
    const/4 v2, 0x0

    :goto_7
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_e

    const/4 v3, 0x1

    goto :goto_8

    :cond_e
    const/4 v3, 0x0

    :goto_8
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_f

    const/4 v4, 0x1

    goto :goto_9

    :cond_f
    const/4 v4, 0x0

    :goto_9
    and-int/lit8 v5, v0, 0x2

    if-eqz v5, :cond_10

    const/4 v5, 0x1

    goto :goto_a

    :cond_10
    const/4 v5, 0x0

    :goto_a
    and-int/2addr v0, v1

    if-eqz v0, :cond_11

    const/4 v0, 0x1

    goto :goto_b

    :cond_11
    const/4 v0, 0x0

    :goto_b
    move/from16 v17, v3

    move v3, v0

    move v0, v2

    move/from16 v2, v17

    goto :goto_c

    :cond_12
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_c
    if-nez v2, :cond_28

    if-eqz v4, :cond_13

    goto/16 :goto_12

    :cond_13
    if-eqz v0, :cond_14

    add-int/lit8 v15, v15, -0x1

    .line 365
    invoke-virtual {v8, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    :cond_14
    if-eqz v3, :cond_15

    add-int/lit8 v15, v15, -0x4

    const/4 v0, 0x4

    .line 369
    invoke-virtual {v8, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    :cond_15
    if-eqz v5, :cond_16

    .line 372
    invoke-static {v15, v8}, Ll/ܿܺۧ;->᩻(ILl/ᩳ֨֫;)I

    move-result v15

    :cond_16
    const/16 v0, 0x54

    const/16 v1, 0x58

    const/4 v2, 0x2

    if-ne v9, v0, :cond_18

    if-ne v10, v1, :cond_18

    if-ne v11, v1, :cond_18

    if-eq v7, v2, :cond_17

    if-ne v13, v1, :cond_18

    .line 382
    :cond_17
    :try_start_0
    invoke-static {v15, v8}, Ll/ܿܺۧ;->ܿ(ILl/ᩳ֨֫;)Ll/ۡܺۧ;

    move-result-object v0

    goto/16 :goto_e

    :cond_18
    if-ne v9, v0, :cond_19

    .line 384
    invoke-static {v7, v9, v10, v11, v13}, Ll/ܿܺۧ;->֫(IIIII)Ljava/lang/String;

    move-result-object v0

    .line 385
    invoke-static {v15, v8, v0}, Ll/ܿܺۧ;->֫(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0

    goto/16 :goto_e

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :catch_0
    move-exception v0

    goto/16 :goto_10

    :catch_1
    move-exception v0

    goto/16 :goto_10

    :cond_19
    const/16 v3, 0x57

    if-ne v9, v3, :cond_1b

    if-ne v10, v1, :cond_1b

    if-ne v11, v1, :cond_1b

    if-eq v7, v2, :cond_1a

    if-ne v13, v1, :cond_1b

    .line 390
    :cond_1a
    invoke-static {v15, v8}, Ll/ܿܺۧ;->ܳ(ILl/ᩳ֨֫;)Ll/ܺܺۧ;

    move-result-object v0

    goto/16 :goto_e

    :cond_1b
    if-ne v9, v3, :cond_1c

    .line 392
    invoke-static {v7, v9, v10, v11, v13}, Ll/ܿܺۧ;->֫(IIIII)Ljava/lang/String;

    move-result-object v0

    .line 393
    invoke-static {v15, v8, v0}, Ll/ܿܺۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ܺܺۧ;

    move-result-object v0

    goto/16 :goto_e

    :cond_1c
    const/16 v1, 0x49

    const/16 v3, 0x50

    if-ne v9, v3, :cond_1d

    const/16 v4, 0x52

    if-ne v10, v4, :cond_1d

    if-ne v11, v1, :cond_1d

    const/16 v4, 0x56

    if-ne v13, v4, :cond_1d

    .line 395
    invoke-static {v15, v8}, Ll/ܿܺۧ;->ᩳ(ILl/ᩳ֨֫;)Ll/ۢܺۧ;

    move-result-object v0

    goto/16 :goto_e

    :cond_1d
    const/16 v4, 0x47

    const/16 v5, 0x4f

    if-ne v9, v4, :cond_1f

    const/16 v4, 0x45

    if-ne v10, v4, :cond_1f

    if-ne v11, v5, :cond_1f

    const/16 v4, 0x42

    if-eq v13, v4, :cond_1e

    if-ne v7, v2, :cond_1f

    .line 400
    :cond_1e
    invoke-static {v15, v8}, Ll/ܿܺۧ;->ۧ(ILl/ᩳ֨֫;)Ll/ۧܺۧ;

    move-result-object v0

    goto/16 :goto_e

    :cond_1f
    const/16 v4, 0x41

    const/16 v6, 0x43

    if-ne v7, v2, :cond_20

    if-ne v9, v3, :cond_21

    if-ne v10, v1, :cond_21

    if-ne v11, v6, :cond_21

    goto :goto_d

    :cond_20
    if-ne v9, v4, :cond_21

    if-ne v10, v3, :cond_21

    if-ne v11, v1, :cond_21

    if-ne v13, v6, :cond_21

    .line 404
    :goto_d
    invoke-static {v8, v15, v7}, Ll/ܿܺۧ;->֫(Ll/ᩳ֨֫;II)Ll/ۨۡۧ;

    move-result-object v0

    goto/16 :goto_e

    :cond_21
    const/16 v1, 0x4d

    if-ne v9, v6, :cond_23

    if-ne v10, v5, :cond_23

    if-ne v11, v1, :cond_23

    if-eq v13, v1, :cond_22

    if-ne v7, v2, :cond_23

    .line 409
    :cond_22
    invoke-static {v15, v8}, Ll/ܿܺۧ;->֫(ILl/ᩳ֨֫;)Ll/֫ܺۧ;

    move-result-object v0

    goto :goto_e

    :cond_23
    if-ne v9, v6, :cond_24

    const/16 v1, 0x48

    if-ne v10, v1, :cond_24

    if-ne v11, v4, :cond_24

    if-ne v13, v3, :cond_24

    move-object/from16 v1, p1

    move v2, v15

    move/from16 v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    .line 412
    invoke-static/range {v1 .. v6}, Ll/ܿܺۧ;->֫(Ll/ᩳ֨֫;IIZILl/ܽܺۧ;)Ll/ܰۡۧ;

    move-result-object v0

    goto :goto_e

    :cond_24
    const/16 v1, 0x4d

    if-ne v9, v6, :cond_25

    if-ne v10, v0, :cond_25

    if-ne v11, v5, :cond_25

    if-ne v13, v6, :cond_25

    move-object/from16 v1, p1

    move v2, v15

    move/from16 v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    .line 421
    invoke-static/range {v1 .. v6}, Ll/ܿܺۧ;->ۧ(Ll/ᩳ֨֫;IIZILl/ܽܺۧ;)Ll/۟ۡۧ;

    move-result-object v0

    goto :goto_e

    :cond_25
    if-ne v9, v1, :cond_26

    const/16 v1, 0x4c

    if-ne v10, v1, :cond_26

    if-ne v11, v1, :cond_26

    if-ne v13, v0, :cond_26

    .line 429
    invoke-static {v15, v8}, Ll/ܿܺۧ;->ܽ(ILl/ᩳ֨֫;)Ll/᩷ܺۧ;

    move-result-object v0

    goto :goto_e

    .line 431
    :cond_26
    invoke-static {v7, v9, v10, v11, v13}, Ll/ܿܺۧ;->֫(IIIII)Ljava/lang/String;

    move-result-object v0

    .line 773
    new-array v1, v15, [B

    const/4 v2, 0x0

    .line 774
    invoke-virtual {v8, v2, v15, v1}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 776
    new-instance v2, Ll/᩺ۡۧ;

    invoke-direct {v2, v0, v1}, Ll/᩺ۡۧ;-><init>(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v2

    .line 437
    :goto_e
    invoke-virtual {v8, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    move-object/from16 v17, v16

    move-object/from16 v16, v0

    move-object/from16 v0, v17

    goto :goto_11

    :goto_f
    invoke-virtual {v8, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 438
    throw v0

    .line 437
    :goto_10
    invoke-virtual {v8, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    :goto_11
    if-nez v16, :cond_27

    .line 440
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to decode frame: id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 443
    invoke-static {v7, v9, v10, v11, v13}, Ll/ܿܺۧ;->֫(IIIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", frameSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 440
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_27
    return-object v16

    :cond_28
    :goto_12
    const-string v0, "Skipping unsupported compressed or encrypted frame"

    .line 358
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 359
    invoke-virtual {v8, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v16
.end method

.method public static ֫(Ll/ᩳ֨֫;IIZ)Z
    .locals 18

    move-object/from16 v1, p0

    move/from16 v0, p1

    .line 219
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    .line 221
    :goto_0
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    const/4 v4, 0x1

    move/from16 v5, p2

    if-lt v3, v5, :cond_c

    const/4 v3, 0x3

    const/4 v6, 0x0

    if-lt v0, v3, :cond_0

    .line 227
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    .line 228
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v8

    .line 229
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v10

    goto :goto_1

    .line 231
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩸()I

    move-result v7

    .line 232
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩸()I

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v8, v8

    const/4 v10, 0x0

    :goto_1
    const-wide/16 v11, 0x0

    if-nez v7, :cond_1

    cmp-long v7, v8, v11

    if-nez v7, :cond_1

    if-nez v10, :cond_1

    .line 279
    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return v4

    :cond_1
    const/4 v7, 0x4

    if-ne v0, v7, :cond_3

    if-nez p3, :cond_3

    const-wide/32 v13, 0x808080

    and-long/2addr v13, v8

    cmp-long v15, v13, v11

    if-eqz v15, :cond_2

    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return v6

    :cond_2
    const-wide/16 v11, 0xff

    and-long v13, v8, v11

    const/16 v15, 0x8

    shr-long v15, v8, v15

    and-long/2addr v15, v11

    const/16 v17, 0x7

    shl-long v15, v15, v17

    or-long/2addr v13, v15

    const/16 v15, 0x10

    shr-long v15, v8, v15

    and-long/2addr v15, v11

    const/16 v17, 0xe

    shl-long v15, v15, v17

    or-long/2addr v13, v15

    const/16 v15, 0x18

    shr-long/2addr v8, v15

    and-long/2addr v8, v11

    const/16 v11, 0x15

    shl-long/2addr v8, v11

    or-long/2addr v8, v13

    :cond_3
    if-ne v0, v7, :cond_5

    and-int/lit8 v3, v10, 0x40

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v7, v10, 0x1

    if-eqz v7, :cond_8

    goto :goto_4

    :cond_5
    if-ne v0, v3, :cond_7

    and-int/lit8 v3, v10, 0x20

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    and-int/lit16 v7, v10, 0x80

    if-eqz v7, :cond_8

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    :cond_8
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_9

    add-int/lit8 v3, v3, 0x4

    :cond_9
    int-to-long v3, v3

    cmp-long v7, v8, v3

    if-gez v7, :cond_a

    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return v6

    .line 271
    :cond_a
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֫()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v3, v3

    cmp-long v7, v3, v8

    if-gez v7, :cond_b

    .line 279
    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return v6

    :cond_b
    long-to-int v3, v8

    .line 274
    :try_start_2
    invoke-virtual {v1, v3}, Ll/ᩳ֨֫;->ܳ(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 279
    :cond_c
    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return v4

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 280
    throw v0
.end method

.method public static ۧ(II[B)I
    .locals 2

    .line 823
    invoke-static {p0, p2}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result v0

    if-eqz p1, :cond_3

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    goto :goto_1

    .line 831
    :cond_0
    :goto_0
    array-length p1, p2

    add-int/lit8 p1, p1, -0x1

    if-ge v0, p1, :cond_2

    sub-int p1, v0, p0

    .line 832
    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    add-int/lit8 p1, v0, 0x1

    aget-byte p1, p2, p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 835
    invoke-static {v0, p2}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result v0

    goto :goto_0

    .line 838
    :cond_2
    array-length p0, p2

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static ۧ(I[B)I
    .locals 1

    .line 842
    :goto_0
    array-length v0, p1

    if-ge p0, v0, :cond_1

    .line 843
    aget-byte v0, p1, p0

    if-nez v0, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 847
    :cond_1
    array-length p0, p1

    return p0
.end method

.method public static ۧ(I)Ljava/nio/charset/Charset;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 811
    sget-object p0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    return-object p0

    .line 808
    :cond_0
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    return-object p0

    .line 806
    :cond_1
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    return-object p0

    .line 804
    :cond_2
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    return-object p0
.end method

.method public static ۧ(Ll/ᩳ֨֫;IIZILl/ܽܺۧ;)Ll/۟ۡۧ;
    .locals 15

    move-object v0, p0

    .line 700
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 701
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result v2

    .line 702
    new-instance v3, Ljava/lang/String;

    .line 704
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    sub-int v5, v2, v1

    sget-object v6, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 v2, v2, 0x1

    .line 708
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 710
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    and-int/lit8 v4, v2, 0x2

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 714
    :goto_1
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    .line 715
    new-array v7, v6, [Ljava/lang/String;

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_2

    .line 717
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v9

    .line 718
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    invoke-static {v9, v10}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result v10

    .line 719
    new-instance v11, Ljava/lang/String;

    .line 721
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    sub-int v13, v10, v9

    sget-object v14, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v11, v12, v9, v13, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    aput-object v11, v7, v8

    add-int/lit8 v10, v10, 0x1

    .line 722
    invoke-virtual {p0, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 725
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    add-int v1, v1, p1

    .line 727
    :cond_3
    :goto_3
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v8

    if-ge v8, v1, :cond_4

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v11, p5

    .line 730
    invoke-static {v8, p0, v9, v10, v11}, Ll/ܿܺۧ;->֫(ILl/ᩳ֨֫;ZILl/ܽܺۧ;)Ll/ܳܺۧ;

    move-result-object v12

    if-eqz v12, :cond_3

    .line 733
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-array v0, v5, [Ll/ܳܺۧ;

    .line 737
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܳܺۧ;

    .line 738
    new-instance v1, Ll/۟ۡۧ;

    move-object p0, v1

    move-object/from16 p1, v3

    move/from16 p2, v4

    move/from16 p3, v2

    move-object/from16 p4, v7

    move-object/from16 p5, v0

    invoke-direct/range {p0 .. p5}, Ll/۟ۡۧ;-><init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Ll/ܳܺۧ;)V

    return-object v1
.end method

.method public static ۧ(ILl/ᩳ֨֫;)Ll/ۧܺۧ;
    .locals 6

    .line 558
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 559
    invoke-static {v0}, Ll/ܿܺۧ;->ۧ(I)Ljava/nio/charset/Charset;

    move-result-object v1

    add-int/lit8 p0, p0, -0x1

    .line 561
    new-array v2, p0, [B

    const/4 v3, 0x0

    .line 562
    invoke-virtual {p1, v3, p0, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 564
    invoke-static {v3, v2}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result p1

    .line 565
    new-instance v4, Ljava/lang/String;

    sget-object v5, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v4, v2, v3, p1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 566
    invoke-static {v4}, Ll/ۢ᩵֫;->ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 p1, p1, 0x1

    .line 570
    invoke-static {p1, v0, v2}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result v4

    .line 571
    invoke-static {v2, p1, v4, v1}, Ll/ܿܺۧ;->֫([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    .line 573
    invoke-static {v0}, Ll/ܿܺۧ;->֫(I)I

    move-result v5

    add-int/2addr v4, v5

    .line 574
    invoke-static {v4, v0, v2}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result v5

    .line 576
    invoke-static {v2, v4, v5, v1}, Ll/ܿܺۧ;->֫([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    .line 578
    invoke-static {v0}, Ll/ܿܺۧ;->֫(I)I

    move-result v0

    add-int/2addr v5, v0

    if-gt p0, v5, :cond_0

    .line 867
    sget-object p0, Ll/ۘ֨֫;->ܿ:[B

    goto :goto_0

    .line 869
    :cond_0
    invoke-static {v2, v5, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    .line 581
    :goto_0
    new-instance v0, Ll/ۧܺۧ;

    invoke-direct {v0, p0, v3, p1, v1}, Ll/ۧܺۧ;-><init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ܺܺۧ;
    .locals 3

    .line 535
    new-array v0, p0, [B

    const/4 v1, 0x0

    .line 536
    invoke-virtual {p1, v1, p0, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 538
    invoke-static {v1, v0}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result p0

    .line 539
    new-instance p1, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {p1, v0, v1, p0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 541
    new-instance p0, Ll/ܺܺۧ;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Ll/ܺܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static ܳ(ILl/ᩳ֨֫;)Ll/ܺܺۧ;
    .locals 4

    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 518
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    sub-int/2addr p0, v0

    .line 520
    new-array v0, p0, [B

    const/4 v2, 0x0

    .line 521
    invoke-virtual {p1, v2, p0, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 523
    invoke-static {v2, v1, v0}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result p0

    .line 524
    new-instance p1, Ljava/lang/String;

    invoke-static {v1}, Ll/ܿܺۧ;->ۧ(I)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {p1, v0, v2, p0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 526
    invoke-static {v1}, Ll/ܿܺۧ;->֫(I)I

    move-result v1

    add-int/2addr p0, v1

    .line 527
    invoke-static {p0, v0}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result v1

    .line 528
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-static {v0, p0, v1, v2}, Ll/ܿܺۧ;->֫([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    .line 530
    new-instance v0, Ll/ܺܺۧ;

    const-string v1, "WXXX"

    invoke-direct {v0, v1, p1, p0}, Ll/ܺܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ܽ(ILl/ᩳ֨֫;)Ll/᩷ܺۧ;
    .locals 10

    .line 743
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    .line 744
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩸()I

    move-result v2

    .line 745
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩸()I

    move-result v5

    .line 746
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 747
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    .line 749
    new-instance v4, Ll/ܽ֨֫;

    invoke-direct {v4}, Ll/ܽ֨֫;-><init>()V

    .line 750
    invoke-virtual {v4, p1}, Ll/ܽ֨֫;->֫(Ll/ᩳ֨֫;)V

    add-int/lit8 p0, p0, -0xa

    mul-int/lit8 p0, p0, 0x8

    add-int p1, v0, v3

    .line 753
    div-int/2addr p0, p1

    .line 754
    new-array p1, p0, [I

    .line 755
    new-array v6, p0, [I

    const/4 v7, 0x0

    :goto_0
    if-ge v7, p0, :cond_0

    .line 757
    invoke-virtual {v4, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    .line 758
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 759
    aput v8, p1, v7

    .line 760
    aput v9, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 763
    :cond_0
    new-instance p0, Ll/᩷ܺۧ;

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Ll/᩷ܺۧ;-><init>(II[I[II)V

    return-object p0
.end method

.method public static ܿ(ILl/ᩳ֨֫;)Ll/ۡܺۧ;
    .locals 4

    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 458
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    sub-int/2addr p0, v0

    .line 460
    new-array v0, p0, [B

    const/4 v2, 0x0

    .line 461
    invoke-virtual {p1, v2, p0, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 463
    invoke-static {v2, v1, v0}, Ll/ܿܺۧ;->ۧ(II[B)I

    move-result p0

    .line 464
    new-instance p1, Ljava/lang/String;

    invoke-static {v1}, Ll/ܿܺۧ;->ۧ(I)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {p1, v0, v2, p0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 468
    invoke-static {v1}, Ll/ܿܺۧ;->֫(I)I

    move-result v2

    add-int/2addr p0, v2

    .line 467
    invoke-static {v1, p0, v0}, Ll/ܿܺۧ;->֫(II[B)Ll/ܳ۬ܺ;

    move-result-object p0

    .line 469
    new-instance v0, Ll/ۡܺۧ;

    const-string v1, "TXXX"

    invoke-direct {v0, v1, p1, p0}, Ll/ۡܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public static ᩳ(ILl/ᩳ֨֫;)Ll/ۢܺۧ;
    .locals 4

    .line 545
    new-array v0, p0, [B

    const/4 v1, 0x0

    .line 546
    invoke-virtual {p1, v1, p0, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 548
    invoke-static {v1, v0}, Ll/ܿܺۧ;->ۧ(I[B)I

    move-result p1

    .line 549
    new-instance v2, Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v1, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 p1, p1, 0x1

    if-gt p0, p1, :cond_0

    .line 867
    sget-object p0, Ll/ۘ֨֫;->ܿ:[B

    goto :goto_0

    .line 869
    :cond_0
    invoke-static {v0, p1, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    .line 554
    :goto_0
    new-instance p1, Ll/ۢܺۧ;

    invoke-direct {p1, v2, p0}, Ll/ۢܺۧ;-><init>(Ljava/lang/String;[B)V

    return-object p1
.end method

.method public static ᩻(ILl/ᩳ֨֫;)I
    .locals 5

    .line 788
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    .line 789
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    move v1, p1

    :goto_0
    add-int/lit8 v2, v1, 0x1

    add-int v3, p1, p0

    if-ge v2, v3, :cond_1

    .line 791
    aget-byte v3, v0, v1

    const/16 v4, 0xff

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_0

    aget-byte v3, v0, v2

    if-nez v3, :cond_0

    sub-int v3, v1, p1

    add-int/lit8 v1, v1, 0x2

    sub-int v3, p0, v3

    add-int/lit8 v3, v3, -0x2

    .line 793
    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p0, p0, -0x1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    return p0
.end method


# virtual methods
.method public final ֫(I[B)Ll/᩻᩵֫;
    .locals 11

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    new-instance v1, Ll/ᩳ֨֫;

    invoke-direct {v1, p2, p1}, Ll/ᩳ֨֫;-><init>([BI)V

    .line 164
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    const/4 p2, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v6, 0xa

    if-ge p1, v6, :cond_0

    const-string p1, "Data too short to be an ID3 tag"

    .line 165
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 169
    :cond_0
    invoke-virtual {v1}, Ll/ᩳ֨֫;->᩸()I

    move-result p1

    const v7, 0x494433

    if-eq p1, v7, :cond_1

    .line 171
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v7, v3, [Ljava/lang/Object;

    aput-object p1, v7, v2

    const-string p1, "%06X"

    invoke-static {p1, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v7, "Unexpected first three bytes of ID3 tag header: 0x"

    invoke-virtual {v7, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_2

    .line 175
    :cond_1
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    .line 176
    invoke-virtual {v1, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 177
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v7

    .line 178
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۚ()I

    move-result v8

    if-ne p1, p2, :cond_2

    and-int/lit8 v9, v7, 0x40

    if-eqz v9, :cond_5

    const-string p1, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    .line 183
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const/4 v9, 0x3

    if-ne p1, v9, :cond_3

    and-int/lit8 v9, v7, 0x40

    if-eqz v9, :cond_5

    .line 189
    invoke-virtual {v1}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    .line 190
    invoke-virtual {v1, v9}, Ll/ᩳ֨֫;->ܳ(I)V

    add-int/2addr v9, v4

    sub-int/2addr v8, v9

    goto :goto_0

    :cond_3
    if-ne p1, v4, :cond_7

    and-int/lit8 v9, v7, 0x40

    if-eqz v9, :cond_4

    .line 196
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۚ()I

    move-result v9

    add-int/lit8 v10, v9, -0x4

    .line 197
    invoke-virtual {v1, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    sub-int/2addr v8, v9

    :cond_4
    and-int/lit8 v9, v7, 0x10

    if-eqz v9, :cond_5

    add-int/lit8 v8, v8, -0xa

    :cond_5
    :goto_0
    if-ge p1, v4, :cond_6

    and-int/lit16 v7, v7, 0x80

    if-eqz v7, :cond_6

    const/4 v7, 0x1

    goto :goto_1

    :cond_6
    const/4 v7, 0x0

    .line 211
    :goto_1
    new-instance v9, Ll/ᩳܺۧ;

    invoke-direct {v9, p1, v8, v7}, Ll/ᩳܺۧ;-><init>(IIZ)V

    goto :goto_3

    :cond_7
    const-string v7, "Skipped ID3 tag with unsupported majorVersion="

    .line 0
    invoke-static {p1, v7}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    :goto_2
    move-object v9, v5

    :goto_3
    if-nez v9, :cond_8

    return-object v5

    .line 123
    :cond_8
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    .line 124
    invoke-static {v9}, Ll/ᩳܺۧ;->ܽ(Ll/ᩳܺۧ;)I

    move-result v7

    if-ne v7, p2, :cond_9

    const/4 v6, 0x6

    .line 125
    :cond_9
    invoke-static {v9}, Ll/ᩳܺۧ;->֫(Ll/ᩳܺۧ;)I

    move-result p2

    .line 126
    invoke-static {v9}, Ll/ᩳܺۧ;->ۧ(Ll/ᩳܺۧ;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 127
    invoke-static {v9}, Ll/ᩳܺۧ;->֫(Ll/ᩳܺۧ;)I

    move-result p2

    invoke-static {p2, v1}, Ll/ܿܺۧ;->᩻(ILl/ᩳ֨֫;)I

    move-result p2

    :cond_a
    add-int/2addr p1, p2

    .line 129
    invoke-virtual {v1, p1}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 132
    invoke-static {v9}, Ll/ᩳܺۧ;->ܽ(Ll/ᩳܺۧ;)I

    move-result p1

    invoke-static {v1, p1, v6, v2}, Ll/ܿܺۧ;->֫(Ll/ᩳ֨֫;IIZ)Z

    move-result p1

    if-nez p1, :cond_c

    .line 133
    invoke-static {v9}, Ll/ᩳܺۧ;->ܽ(Ll/ᩳܺۧ;)I

    move-result p1

    if-ne p1, v4, :cond_b

    invoke-static {v1, v4, v6, v3}, Ll/ܿܺۧ;->֫(Ll/ᩳ֨֫;IIZ)Z

    move-result p1

    if-eqz p1, :cond_b

    const/4 v2, 0x1

    goto :goto_4

    .line 136
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Failed to validate ID3 tag with majorVersion="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ll/ᩳܺۧ;->ܽ(Ll/ᩳܺۧ;)I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v5

    .line 141
    :cond_c
    :goto_4
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lt p1, v6, :cond_d

    .line 143
    invoke-static {v9}, Ll/ᩳܺۧ;->ܽ(Ll/ᩳܺۧ;)I

    move-result p1

    iget-object p2, p0, Ll/ܿܺۧ;->֫:Ll/ܽܺۧ;

    .line 144
    invoke-static {p1, v1, v2, v6, p2}, Ll/ܿܺۧ;->֫(ILl/ᩳ֨֫;ZILl/ܽܺۧ;)Ll/ܳܺۧ;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 151
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 155
    :cond_d
    new-instance p1, Ll/᩻᩵֫;

    invoke-direct {p1, v0}, Ll/᩻᩵֫;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public final ֫(Ll/۠ۡۧ;Ljava/nio/ByteBuffer;)Ll/᩻᩵֫;
    .locals 0

    .line 102
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    invoke-virtual {p0, p2, p1}, Ll/ܿܺۧ;->֫(I[B)Ll/᩻᩵֫;

    move-result-object p1

    return-object p1
.end method
