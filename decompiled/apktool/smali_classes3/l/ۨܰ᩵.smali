.class public final Ll/ۨܰ᩵;
.super Ljava/lang/Object;
.source "M4F8"


# static fields
.field public static final ۢ:[C


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/util/List;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:Ljava/util/List;

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 289
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨܰ᩵;->ۢ:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Ll/ۛܰ᩵;)V
    .locals 4

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    iget-object v0, p1, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    .line 340
    iget-object v0, p1, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    .line 1609
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v0

    .line 340
    iput-object v0, p0, Ll/ۨܰ᩵;->᩷:Ljava/lang/String;

    .line 341
    iget-object v0, p1, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    .line 1609
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v2, v1, v2}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v0

    .line 341
    iput-object v0, p0, Ll/ۨܰ᩵;->ܽ:Ljava/lang/String;

    .line 342
    iget-object v0, p1, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۨܰ᩵;->ۧ:Ljava/lang/String;

    .line 1039
    iget v0, p1, Ll/ۛܰ᩵;->᩻:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۨܰ᩵;->ۧ(Ljava/lang/String;)I

    move-result v0

    .line 343
    :goto_0
    iput v0, p0, Ll/ۨܰ᩵;->ܿ:I

    .line 344
    iget-object v0, p1, Ll/ۛܰ᩵;->ܽ:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ll/ۨܰ᩵;->֫(Ljava/util/ArrayList;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܰ᩵;->ᩳ:Ljava/util/List;

    .line 345
    iget-object v0, p1, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    .line 346
    invoke-static {v0, v3}, Ll/ۨܰ᩵;->֫(Ljava/util/ArrayList;Z)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 347
    :goto_1
    iput-object v0, p0, Ll/ۨܰ᩵;->ܳ:Ljava/util/List;

    .line 348
    iget-object v0, p1, Ll/ۛܰ᩵;->֫:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 1609
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v2, v1, v2}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v1

    .line 350
    :cond_2
    iput-object v1, p0, Ll/ۨܰ᩵;->֫:Ljava/lang/String;

    .line 351
    invoke-virtual {p1}, Ll/ۛܰ᩵;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p1

    :goto_0
    if-ge v3, v1, :cond_d

    .line 1687
    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    const/16 v5, 0x2b

    const/16 v6, 0x25

    const/4 v7, -0x1

    const/16 v8, 0x80

    const/16 v9, 0x7f

    const/16 v10, 0x20

    if-lt v4, v10, :cond_3

    if-eq v4, v9, :cond_3

    if-lt v4, v8, :cond_0

    if-nez p7, :cond_3

    .line 1691
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v11

    if-ne v11, v7, :cond_3

    if-ne v4, v6, :cond_1

    if-eqz p4, :cond_3

    if-eqz p5, :cond_1

    .line 1692
    invoke-static {v3, v1, v0}, Ll/ۨܰ᩵;->֫(IILjava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    :cond_1
    if-ne v4, v5, :cond_2

    if-eqz p6, :cond_2

    goto :goto_1

    .line 1686
    :cond_2
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_0

    .line 1695
    :cond_3
    :goto_1
    new-instance v4, Ll/۫ܽ֡;

    invoke-direct {v4}, Ll/۫ܽ֡;-><init>()V

    move/from16 v11, p1

    .line 1696
    invoke-virtual {v4, v11, v3, v0}, Ll/۫ܽ֡;->֫(IILjava/lang/String;)V

    const/4 v11, 0x0

    :goto_2
    if-ge v3, v1, :cond_c

    .line 1713
    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v12

    if-eqz p4, :cond_4

    const/16 v13, 0x9

    if-eq v12, v13, :cond_b

    const/16 v13, 0xa

    if-eq v12, v13, :cond_b

    const/16 v13, 0xc

    if-eq v12, v13, :cond_b

    const/16 v13, 0xd

    if-ne v12, v13, :cond_4

    goto :goto_6

    :cond_4
    if-ne v12, v5, :cond_6

    if-eqz p6, :cond_6

    if-eqz p4, :cond_5

    const-string v13, "+"

    goto :goto_3

    :cond_5
    const-string v13, "%2B"

    :goto_3
    const/4 v14, 0x0

    .line 953
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v15

    invoke-virtual {v4, v14, v15, v13}, Ll/۫ܽ֡;->֫(IILjava/lang/String;)V

    goto :goto_6

    :cond_6
    if-lt v12, v10, :cond_9

    if-eq v12, v9, :cond_9

    if-lt v12, v8, :cond_7

    if-nez p7, :cond_9

    .line 1723
    :cond_7
    invoke-virtual {v2, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-ne v13, v7, :cond_9

    if-ne v12, v6, :cond_8

    if-eqz p4, :cond_9

    if-eqz p5, :cond_8

    .line 1724
    invoke-static {v3, v1, v0}, Ll/ۨܰ᩵;->֫(IILjava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_4

    .line 1744
    :cond_8
    invoke-virtual {v4, v12}, Ll/۫ܽ֡;->ܽ(I)V

    goto :goto_6

    :cond_9
    :goto_4
    if-nez v11, :cond_a

    .line 1727
    new-instance v11, Ll/۫ܽ֡;

    invoke-direct {v11}, Ll/۫ܽ֡;-><init>()V

    .line 1731
    :cond_a
    invoke-virtual {v11, v12}, Ll/۫ܽ֡;->ܽ(I)V

    .line 1736
    :goto_5
    invoke-virtual {v11}, Ll/۫ܽ֡;->ۢۧ()Z

    move-result v13

    if-nez v13, :cond_b

    .line 1737
    invoke-virtual {v11}, Ll/۫ܽ֡;->readByte()B

    move-result v13

    and-int/lit16 v14, v13, 0xff

    .line 1738
    invoke-virtual {v4, v6}, Ll/۫ܽ֡;->writeByte(I)V

    shr-int/lit8 v14, v14, 0x4

    and-int/lit8 v14, v14, 0xf

    .line 1739
    sget-object v15, Ll/ۨܰ᩵;->ۢ:[C

    aget-char v14, v15, v14

    invoke-virtual {v4, v14}, Ll/۫ܽ֡;->writeByte(I)V

    and-int/lit8 v13, v13, 0xf

    .line 1740
    aget-char v13, v15, v13

    invoke-virtual {v4, v13}, Ll/۫ܽ֡;->writeByte(I)V

    goto :goto_5

    .line 1712
    :cond_b
    :goto_6
    invoke-static {v12}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    add-int/2addr v3, v12

    goto :goto_2

    .line 1699
    :cond_c
    invoke-virtual {v4}, Ll/۫ܽ֡;->ܳ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_d
    move/from16 v11, p1

    .line 1704
    invoke-virtual/range {p0 .. p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;IIZ)Ljava/lang/String;
    .locals 8

    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_5

    .line 1624
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2b

    const/16 v3, 0x25

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    if-eqz p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1627
    :cond_1
    :goto_1
    new-instance v1, Ll/۫ܽ֡;

    invoke-direct {v1}, Ll/۫ܽ֡;-><init>()V

    .line 1628
    invoke-virtual {v1, p1, v0, p0}, Ll/۫ܽ֡;->֫(IILjava/lang/String;)V

    :goto_2
    if-ge v0, p2, :cond_4

    .line 1641
    invoke-virtual {p0, v0}, Ljava/lang/String;->codePointAt(I)I

    move-result p1

    if-ne p1, v3, :cond_2

    add-int/lit8 v4, v0, 0x2

    if-ge v4, p2, :cond_2

    add-int/lit8 v5, v0, 0x1

    .line 1643
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ll/᩶۟᩵;->֫(C)I

    move-result v5

    .line 1644
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/᩶۟᩵;->֫(C)I

    move-result v6

    const/4 v7, -0x1

    if-eq v5, v7, :cond_3

    if-eq v6, v7, :cond_3

    shl-int/lit8 v0, v5, 0x4

    add-int/2addr v0, v6

    .line 1646
    invoke-virtual {v1, v0}, Ll/۫ܽ֡;->writeByte(I)V

    move v0, v4

    goto :goto_3

    :cond_2
    if-ne p1, v2, :cond_3

    if-eqz p3, :cond_3

    const/16 v4, 0x20

    .line 1651
    invoke-virtual {v1, v4}, Ll/۫ܽ֡;->writeByte(I)V

    goto :goto_3

    .line 1654
    :cond_3
    invoke-virtual {v1, p1}, Ll/۫ܽ֡;->ܽ(I)V

    .line 1640
    :goto_3
    invoke-static {p1}, Ljava/lang/Character;->charCount(I)I

    move-result p1

    add-int/2addr v0, p1

    goto :goto_2

    .line 1630
    :cond_4
    invoke-virtual {v1}, Ll/۫ܽ֡;->ܳ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1635
    :cond_5
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;Z)Ljava/util/List;
    .locals 6

    .line 1613
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    .line 1614
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 1616
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 1609
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v4, v2, v5, p1}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 1617
    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1619
    :cond_1
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 5

    .line 620
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 621
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    .line 622
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-lez v1, :cond_0

    const/16 v4, 0x26

    .line 623
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 624
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_1

    const/16 v2, 0x3d

    .line 626
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 627
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(IILjava/lang/String;)Z
    .locals 2

    add-int/lit8 v0, p0, 0x2

    if-ge v0, p1, :cond_0

    .line 1660
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x25

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    add-int/2addr p0, p1

    .line 1661
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ll/᩶۟᩵;->֫(C)I

    move-result p0

    const/4 v1, -0x1

    if-eq p0, v1, :cond_0

    .line 1662
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ll/᩶۟᩵;->֫(C)I

    move-result p0

    if-eq p0, v1, :cond_0

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 1

    const-string v0, "http"

    .line 510
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x50

    return p0

    :cond_0
    const-string v0, "https"

    .line 512
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/16 p0, 0x1bb

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ۨܰ᩵;
    .locals 2

    .line 916
    new-instance v0, Ll/ۛܰ᩵;

    invoke-direct {v0}, Ll/ۛܰ᩵;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ll/ۛܰ᩵;->֫(Ll/ۨܰ᩵;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۛܰ᩵;->֫()Ll/ۨܰ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    .line 639
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 640
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gt v1, v2, :cond_3

    const/16 v2, 0x26

    .line 641
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 642
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    :cond_0
    const/16 v4, 0x3d

    .line 644
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-eq v4, v3, :cond_2

    if-le v4, v2, :cond_1

    goto :goto_1

    .line 649
    :cond_1
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    .line 650
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 646
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 647
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 932
    instance-of v0, p1, Ll/ۨܰ᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۨܰ᩵;

    iget-object p1, p1, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    iget-object v0, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 936
    iget-object v0, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 940
    iget-object v0, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 445
    iget-object v0, p0, Ll/ۨܰ᩵;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 446
    :cond_0
    iget-object v0, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v2, 0x40

    .line 447
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 448
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۨܰ᩵;
    .locals 2

    const/4 v0, 0x0

    .line 892
    :try_start_0
    new-instance v1, Ll/ۛܰ᩵;

    invoke-direct {v1}, Ll/ۛܰ᩵;-><init>()V

    invoke-virtual {v1, p0, p1}, Ll/ۛܰ᩵;->֫(Ll/ۨܰ᩵;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    .line 868
    invoke-virtual {v1}, Ll/ۛܰ᩵;->֫()Ll/ۨܰ᩵;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 393
    iget-object v0, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ()Ljava/net/URI;
    .locals 14

    .line 872
    new-instance v0, Ll/ۛܰ᩵;

    invoke-direct {v0}, Ll/ۛܰ᩵;-><init>()V

    .line 873
    iget-object v1, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    iput-object v1, v0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    .line 874
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ܿ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    .line 875
    invoke-virtual {p0}, Ll/ۨܰ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    .line 876
    iget-object v2, p0, Ll/ۨܰ᩵;->ۧ:Ljava/lang/String;

    iput-object v2, v0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    .line 878
    invoke-static {v1}, Ll/ۨܰ᩵;->ۧ(Ljava/lang/String;)I

    move-result v1

    iget v2, p0, Ll/ۨܰ᩵;->ܿ:I

    if-eq v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    iput v2, v0, Ll/ۛܰ᩵;->᩻:I

    .line 879
    iget-object v1, v0, Ll/ۛܰ᩵;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 880
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ܽ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 881
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v3

    const/4 v2, 0x0

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    .line 1759
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, " \"\'<>#"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x1

    .line 1758
    invoke-static/range {v3 .. v10}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v3

    .line 1141
    invoke-static {v3}, Ll/ۨܰ᩵;->ᩳ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    .line 1143
    :goto_1
    iput-object v3, v0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    .line 828
    iget-object v3, p0, Ll/ۨܰ᩵;->֫:Ljava/lang/String;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0x23

    .line 829
    iget-object v3, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 830
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 882
    :goto_2
    iput-object v2, v0, Ll/ۛܰ᩵;->֫:Ljava/lang/String;

    .line 1232
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_3

    .line 1233
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x0

    .line 1759
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    const-string v9, "[]"

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    .line 1758
    invoke-static/range {v6 .. v13}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v5

    .line 1234
    invoke-virtual {v1, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 1237
    :cond_3
    iget-object v1, v0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    .line 1238
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_4
    if-ge v3, v1, :cond_5

    .line 1239
    iget-object v2, v0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 1241
    iget-object v2, v0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    const/4 v5, 0x0

    .line 1759
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const-string v7, "\\^`{|}"

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    .line 1758
    invoke-static/range {v4 .. v11}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v4

    .line 1241
    invoke-interface {v2, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 1246
    :cond_5
    iget-object v4, v0, Ll/ۛܰ᩵;->֫:Ljava/lang/String;

    if-eqz v4, :cond_6

    const/4 v5, 0x0

    .line 1759
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const-string v7, " \"#<>\\^`{|}"

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 1758
    invoke-static/range {v4 .. v11}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    .line 1247
    iput-object v1, v0, Ll/ۛܰ᩵;->֫:Ljava/lang/String;

    .line 377
    :cond_6
    invoke-virtual {v0}, Ll/ۛܰ᩵;->toString()Ljava/lang/String;

    move-result-object v0

    .line 379
    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    const-string v3, ""

    .line 383
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 384
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 386
    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 463
    iget-object v0, p0, Ll/ۨܰ᩵;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 2

    .line 673
    iget-object v0, p0, Ll/ۨܰ᩵;->ܳ:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 674
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 675
    invoke-static {v1, v0}, Ll/ۨܰ᩵;->֫(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 676
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()I
    .locals 1

    .line 502
    iget v0, p0, Ll/ۨܰ᩵;->ܿ:I

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 4

    .line 546
    iget-object v0, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    const/16 v2, 0x2f

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 547
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "?#"

    invoke-static {v1, v0, v2, v3}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result v2

    .line 548
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 486
    iget-object v0, p0, Ll/ۨܰ᩵;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 15

    const-string v0, "/..."

    .line 892
    :try_start_0
    new-instance v1, Ll/ۛܰ᩵;

    invoke-direct {v1}, Ll/ۛܰ᩵;-><init>()V

    invoke-virtual {v1, p0, v0}, Ll/ۛܰ᩵;->֫(Ll/ۨܰ᩵;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    .line 856
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v10, 0x0

    const-string v2, ""

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    move v3, v0

    move v4, v10

    move v6, v11

    move v7, v12

    move v8, v13

    move v9, v14

    .line 1758
    invoke-static/range {v2 .. v9}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v2

    .line 996
    iput-object v2, v1, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    const-string v2, ""

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    .line 1758
    invoke-static/range {v2 .. v9}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v0

    .line 1009
    iput-object v0, v1, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    .line 858
    invoke-virtual {v1}, Ll/ۛܰ᩵;->֫()Ll/ۨܰ᩵;

    move-result-object v0

    .line 940
    iget-object v0, v0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 6

    .line 570
    iget-object v0, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    const/16 v2, 0x2f

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 571
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "?#"

    invoke-static {v1, v0, v3, v4}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result v3

    .line 572
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-ge v0, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 575
    invoke-static {v1, v0, v3, v2}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v5

    .line 576
    invoke-virtual {v1, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v5

    goto :goto_0

    :cond_0
    return-object v4
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 4

    .line 412
    iget-object v0, p0, Ll/ۨܰ᩵;->᩷:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 413
    :cond_0
    iget-object v0, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    .line 414
    iget-object v1, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, ":@"

    invoke-static {v1, v0, v2, v3}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result v2

    .line 415
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 4

    .line 613
    iget-object v0, p0, Ll/ۨܰ᩵;->ܳ:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/16 v0, 0x3f

    .line 614
    iget-object v1, p0, Ll/ۨܰ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 615
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x23

    invoke-static {v1, v0, v2, v3}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v2

    .line 616
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 430
    iget-object v0, p0, Ll/ۨܰ᩵;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 594
    iget-object v0, p0, Ll/ۨܰ᩵;->ᩳ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 397
    iget-object v0, p0, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
