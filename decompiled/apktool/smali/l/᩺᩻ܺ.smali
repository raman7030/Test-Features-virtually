.class public final Ll/᩺᩻ܺ;
.super Ljava/lang/Object;
.source "RBI4"


# instance fields
.field public ֫:I

.field public final ۖ:I

.field public ۘ:Z

.field public ۜ:I

.field public final ۡ:Ll/᩷ܳܺ;

.field public final ۢ:Ll/ᩳᩴܺ;

.field public ۧ:Ll/ۛۘܺ;

.field public final ܳ:Z

.field public ܺ:Ljava/lang/String;

.field public final ܽ:I

.field public final ܿ:Ll/֫ۜܺ;

.field public final ᩳ:Ll/᩺ܺܺ;

.field public final ᩷:Ll/֫ܳܺ;

.field public final ᩻:[Ll/ܰܿܺ;


# direct methods
.method public constructor <init>(Ll/᩷ܳܺ;Ll/֫ܳܺ;Ll/֫ۜܺ;IIZLl/᩹ܺܺ;)V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 88
    iput v0, p0, Ll/᩺᩻ܺ;->֫:I

    const/4 v0, 0x1

    .line 93
    iput v0, p0, Ll/᩺᩻ܺ;->ۜ:I

    .line 136
    iput-object p1, p0, Ll/᩺᩻ܺ;->ۡ:Ll/᩷ܳܺ;

    .line 137
    iput-object p2, p0, Ll/᩺᩻ܺ;->᩷:Ll/֫ܳܺ;

    .line 138
    iput-object p3, p0, Ll/᩺᩻ܺ;->ܿ:Ll/֫ۜܺ;

    .line 139
    invoke-virtual {p7}, Ll/ܽܺܺ;->ᩴ()Ll/᩺ܺܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩻ܺ;->ᩳ:Ll/᩺ܺܺ;

    .line 140
    iput-boolean p6, p0, Ll/᩺᩻ܺ;->ܳ:Z

    .line 141
    iput p4, p0, Ll/᩺᩻ܺ;->ܽ:I

    .line 142
    iput p5, p0, Ll/᩺᩻ܺ;->ۖ:I

    .line 144
    new-instance p1, Ll/ᩳᩴܺ;

    invoke-direct {p1}, Ll/ᩳᩴܺ;-><init>()V

    iput-object p1, p0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    .line 145
    new-array p1, p5, [Ll/ܰܿܺ;

    iput-object p1, p0, Ll/᩺᩻ܺ;->᩻:[Ll/ܰܿܺ;

    return-void
.end method

.method public static ֫(II)I
    .locals 2

    const/4 v0, -0x4

    if-lt p0, v0, :cond_0

    const/16 v1, 0xa

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    const/16 v0, 0xf

    .line 868
    invoke-static {p1, v0, p0, v1}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result p0

    return p0

    .line 865
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Parameter out of range"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(I)V
    .locals 3

    .line 880
    iget-object v0, p0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v1

    const/4 v2, 0x2

    .line 882
    invoke-virtual {v0, v2}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 883
    invoke-virtual {v0, p1}, Ll/ᩳᩴܺ;->᩻(I)V

    .line 884
    iget v2, p0, Ll/᩺᩻ܺ;->ۜ:I

    add-int/2addr v2, p1

    iput v2, p0, Ll/᩺᩻ܺ;->ۜ:I

    .line 886
    iget-object p1, p0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez p1, :cond_0

    return-void

    .line 887
    :cond_0
    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܳ()I

    move-result p1

    sub-int/2addr p1, v1

    iget v0, p0, Ll/᩺᩻ܺ;->ۜ:I

    .line 888
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "line = %d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 887
    invoke-direct {p0, p1, v0}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    return-void
.end method

.method private ֫(ILjava/lang/String;)V
    .locals 2

    .line 156
    iget-object v0, p0, Ll/᩺᩻ܺ;->ܺ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩺᩻ܺ;->ܺ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, p2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 160
    :cond_0
    iget-object v0, p0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-eqz v0, :cond_2

    .line 161
    iget-boolean v1, p0, Ll/᩺᩻ܺ;->ۘ:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast v0, Ll/ᩳᩴܺ;

    invoke-virtual {v0, p1, p2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    :cond_2
    return-void
.end method

.method private ֫(Ll/ۜܳܺ;)V
    .locals 4

    .line 804
    invoke-virtual {p1}, Ll/ۜܳܺ;->ۧ()Ll/ۤۡܺ;

    move-result-object v0

    .line 805
    invoke-virtual {v0}, Ll/ۤۡܺ;->֫()I

    move-result v0

    .line 806
    invoke-virtual {p1}, Ll/ۜܳܺ;->֫()I

    move-result p1

    .line 810
    iget v1, p0, Ll/᩺᩻ܺ;->ۜ:I

    sub-int/2addr v0, v1

    .line 811
    iget v1, p0, Ll/᩺᩻ܺ;->֫:I

    sub-int/2addr p1, v1

    if-ltz p1, :cond_5

    const/4 v1, -0x4

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    .line 820
    :cond_0
    invoke-direct {p0, v0}, Ll/᩺᩻ܺ;->֫(I)V

    const/4 v0, 0x0

    .line 824
    :cond_1
    invoke-static {v0, p1}, Ll/᩺᩻ܺ;->֫(II)I

    move-result v1

    and-int/lit16 v3, v1, -0x100

    if-lez v3, :cond_3

    .line 827
    invoke-direct {p0, p1}, Ll/᩺᩻ܺ;->ۧ(I)V

    .line 829
    invoke-static {v0, v2}, Ll/᩺᩻ܺ;->֫(II)I

    move-result v1

    and-int/lit16 p1, v1, -0x100

    if-lez p1, :cond_2

    .line 832
    invoke-direct {p0, v0}, Ll/᩺᩻ܺ;->֫(I)V

    .line 834
    invoke-static {v2, v2}, Ll/᩺᩻ܺ;->֫(II)I

    move-result v1

    const/4 p1, 0x0

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 838
    :cond_3
    :goto_0
    iget-object v3, p0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    invoke-virtual {v3, v1}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 840
    iget v1, p0, Ll/᩺᩻ܺ;->ۜ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩺᩻ܺ;->ۜ:I

    .line 841
    iget v0, p0, Ll/᩺᩻ܺ;->֫:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/᩺᩻ܺ;->֫:I

    .line 843
    iget-object p1, p0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez p1, :cond_4

    return-void

    .line 845
    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v0, p0, Ll/᩺᩻ܺ;->ۜ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    const-string v0, "%04x: line %d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 844
    invoke-direct {p0, p1, v0}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    return-void

    .line 814
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Position entries must be in ascending address order"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/۬ܺܺ;)V
    .locals 2

    .line 669
    iget-object v0, p0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    if-eqz p1, :cond_1

    iget-object v1, p0, Ll/᩺᩻ܺ;->ܿ:Ll/֫ۜܺ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 673
    :cond_0
    invoke-virtual {v1}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/֫᩷ܺ;->֫(Ll/۬ܺܺ;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 672
    invoke-virtual {v0, p1}, Ll/ᩳᩴܺ;->ۜ(I)I

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 670
    invoke-virtual {v0, p1}, Ll/ᩳᩴܺ;->ۜ(I)I

    return-void
.end method

.method private ֫(Ll/ܰܿܺ;)V
    .locals 6

    .line 748
    iget-object v0, p0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v1

    const/4 v2, 0x4

    .line 750
    invoke-virtual {v0, v2}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 752
    invoke-virtual {p1}, Ll/ܰܿܺ;->ܿ()I

    move-result v2

    invoke-direct {p0, v2}, Ll/᩺᩻ܺ;->ܽ(I)V

    .line 753
    invoke-virtual {p1}, Ll/ܰܿܺ;->getName()Ll/۬ܺܺ;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/᩺᩻ܺ;->֫(Ll/۬ܺܺ;)V

    .line 754
    invoke-virtual {p1}, Ll/ܰܿܺ;->getType()Ll/۫ܺܺ;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 690
    iget-object v5, p0, Ll/᩺᩻ܺ;->ܿ:Ll/֫ۜܺ;

    if-nez v5, :cond_0

    goto :goto_0

    .line 694
    :cond_0
    invoke-virtual {v5}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v5

    invoke-virtual {v5, v2}, Ll/ܽ᩷ܺ;->֫(Ll/۫ܺܺ;)I

    move-result v2

    add-int/2addr v2, v4

    .line 693
    invoke-virtual {v0, v2}, Ll/ᩳᩴܺ;->ۜ(I)I

    goto :goto_1

    .line 691
    :cond_1
    :goto_0
    invoke-virtual {v0, v3}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 755
    :goto_1
    invoke-virtual {p1}, Ll/ܰܿܺ;->getSignature()Ll/۬ܺܺ;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/᩺᩻ܺ;->֫(Ll/۬ܺܺ;)V

    .line 757
    iget-object v2, p0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez v2, :cond_2

    return-void

    .line 758
    :cond_2
    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v0

    sub-int/2addr v0, v1

    iget v1, p0, Ll/᩺᩻ܺ;->֫:I

    .line 759
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 760
    invoke-static {p1}, Ll/᩺᩻ܺ;->ۧ(Ll/ܰܿܺ;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    aput-object p1, v2, v4

    const-string p1, "%04x: +localx %s"

    .line 759
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 758
    invoke-direct {p0, v0, p1}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    return-void
.end method

.method public static ۧ(Ll/ܰܿܺ;)Ljava/lang/String;
    .locals 4

    .line 602
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "v"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 605
    invoke-virtual {p0}, Ll/ܰܿܺ;->ܿ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    .line 606
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 608
    invoke-virtual {p0}, Ll/ܰܿܺ;->getName()Ll/۬ܺܺ;

    move-result-object v2

    const-string v3, "null"

    if-nez v2, :cond_0

    .line 610
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 612
    :cond_0
    invoke-virtual {v2}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 616
    invoke-virtual {p0}, Ll/ܰܿܺ;->getType()Ll/۫ܺܺ;

    move-result-object v2

    if-nez v2, :cond_1

    .line 618
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 620
    :cond_1
    invoke-virtual {v2}, Ll/۫ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    :goto_1
    invoke-virtual {p0}, Ll/ܰܿܺ;->getSignature()Ll/۬ܺܺ;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 626
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 627
    invoke-virtual {p0}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(I)V
    .locals 4

    .line 904
    iget-object v0, p0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v1

    const/4 v2, 0x1

    .line 906
    invoke-virtual {v0, v2}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 907
    invoke-virtual {v0, p1}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 908
    iget v3, p0, Ll/᩺᩻ܺ;->֫:I

    add-int/2addr v3, p1

    iput v3, p0, Ll/᩺᩻ܺ;->֫:I

    .line 910
    iget-object p1, p0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez p1, :cond_0

    return-void

    .line 911
    :cond_0
    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܳ()I

    move-result p1

    sub-int/2addr p1, v1

    iget v0, p0, Ll/᩺᩻ܺ;->֫:I

    .line 912
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "%04x: advance pc"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 911
    invoke-direct {p0, p1, v0}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    return-void
.end method

.method private ۧ()[B
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 512
    iget-object v2, v0, Ll/᩺᩻ܺ;->ۡ:Ll/᩷ܳܺ;

    if-nez v2, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ll/ܿᩴܺ;->size()I

    move-result v3

    .line 513
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_1

    .line 516
    invoke-virtual {v2, v5}, Ll/ܿᩴܺ;->get(I)Ll/ۜܳܺ;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 520
    :cond_1
    new-instance v2, Ll/ۛ᩻ܺ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 555
    new-instance v2, Ljava/util/ArrayList;

    .line 556
    iget-object v3, v0, Ll/᩺᩻ܺ;->ᩳ:Ll/᩺ܺܺ;

    invoke-virtual {v3}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܿᩴܺ;->size()I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 543
    invoke-virtual {v3}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܰܺܺ;->֨()I

    move-result v5

    iget v6, v0, Ll/᩺᩻ܺ;->ۖ:I

    sub-int v5, v6, v5

    iget-boolean v7, v0, Ll/᩺᩻ܺ;->ܳ:Z

    xor-int/lit8 v8, v7, 0x1

    sub-int/2addr v5, v8

    .line 558
    new-instance v8, Ljava/util/BitSet;

    sub-int v9, v6, v5

    invoke-direct {v8, v9}, Ljava/util/BitSet;-><init>(I)V

    .line 559
    iget-object v9, v0, Ll/᩺᩻ܺ;->᩷:Ll/֫ܳܺ;

    invoke-virtual {v9}, Ll/ܿᩴܺ;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_4

    .line 562
    invoke-virtual {v9, v11}, Ll/ܿᩴܺ;->get(I)Ll/ܰܿܺ;

    move-result-object v12

    .line 563
    invoke-virtual {v12}, Ll/ܰܿܺ;->ܿ()I

    move-result v13

    if-ge v13, v5, :cond_2

    goto :goto_3

    :cond_2
    sub-int/2addr v13, v5

    .line 570
    invoke-virtual {v8, v13}, Ljava/util/BitSet;->get(I)Z

    move-result v14

    if-eqz v14, :cond_3

    goto :goto_3

    .line 574
    :cond_3
    invoke-virtual {v8, v13}, Ljava/util/BitSet;->set(I)V

    .line 575
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 579
    :cond_4
    new-instance v5, Ll/ۨ᩻ܺ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 396
    iget-object v5, v0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    const/4 v8, 0x1

    if-nez v5, :cond_5

    const/4 v5, 0x0

    goto :goto_4

    :cond_5
    const/4 v5, 0x1

    .line 397
    :goto_4
    iget-object v10, v0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v11

    .line 400
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-lez v12, :cond_6

    .line 401
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۜܳܺ;

    .line 402
    invoke-virtual {v12}, Ll/ۜܳܺ;->ۧ()Ll/ۤۡܺ;

    move-result-object v12

    invoke-virtual {v12}, Ll/ۤۡܺ;->֫()I

    move-result v12

    iput v12, v0, Ll/᩺᩻ܺ;->ۜ:I

    .line 404
    :cond_6
    iget v12, v0, Ll/᩺᩻ܺ;->ۜ:I

    invoke-virtual {v10, v12}, Ll/ᩳᩴܺ;->ۜ(I)I

    if-eqz v5, :cond_7

    .line 407
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v12

    sub-int/2addr v12, v11

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "line_start: "

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v13, v0, Ll/᩺᩻ܺ;->ۜ:I

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v12, v11}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    .line 543
    :cond_7
    invoke-virtual {v3}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ܰܺܺ;->֨()I

    move-result v11

    sub-int/2addr v6, v11

    xor-int/lit8 v11, v7, 0x1

    sub-int/2addr v6, v11

    .line 412
    invoke-virtual {v3}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v3

    .line 413
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v11

    .line 419
    iget-object v12, v0, Ll/᩺᩻ܺ;->᩻:[Ll/ܰܿܺ;

    if-nez v7, :cond_a

    .line 420
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܰܿܺ;

    .line 421
    invoke-virtual {v13}, Ll/ܰܿܺ;->ܿ()I

    move-result v14

    if-ne v6, v14, :cond_8

    .line 422
    aput-object v13, v12, v6

    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 430
    :cond_a
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v7

    .line 431
    invoke-virtual {v10, v11}, Ll/ᩳᩴܺ;->ۜ(I)I

    if-eqz v5, :cond_b

    .line 434
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v13

    sub-int/2addr v13, v7

    .line 435
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v7, v8, v1

    const-string v1, "parameters_size: %04x"

    invoke-static {v1, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 434
    invoke-direct {v0, v13, v1}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    :cond_b
    const/4 v1, 0x0

    :goto_5
    if-ge v1, v11, :cond_13

    .line 443
    invoke-virtual {v3, v1}, Ll/ܿᩴܺ;->get(I)Ll/۟ܺܺ;

    move-result-object v7

    .line 446
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v8

    .line 448
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_e

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ܰܿܺ;

    .line 449
    invoke-virtual {v14}, Ll/ܰܿܺ;->ܿ()I

    move-result v15

    if-ne v6, v15, :cond_c

    .line 452
    invoke-virtual {v14}, Ll/ܰܿܺ;->getSignature()Ll/۬ܺܺ;

    move-result-object v13

    if-eqz v13, :cond_d

    const/4 v15, 0x0

    .line 457
    invoke-direct {v0, v15}, Ll/᩺᩻ܺ;->֫(Ll/۬ܺܺ;)V

    goto :goto_6

    :cond_d
    const/4 v15, 0x0

    .line 459
    invoke-virtual {v14}, Ll/ܰܿܺ;->getName()Ll/۬ܺܺ;

    move-result-object v13

    invoke-direct {v0, v13}, Ll/᩺᩻ܺ;->֫(Ll/۬ܺܺ;)V

    .line 461
    :goto_6
    aput-object v14, v12, v6

    goto :goto_7

    :cond_e
    const/4 v15, 0x0

    move-object v14, v15

    :goto_7
    if-nez v14, :cond_f

    .line 473
    invoke-direct {v0, v15}, Ll/᩺᩻ܺ;->֫(Ll/۬ܺܺ;)V

    :cond_f
    if-eqz v5, :cond_12

    if-eqz v14, :cond_11

    .line 478
    invoke-virtual {v14}, Ll/ܰܿܺ;->getSignature()Ll/۬ܺܺ;

    move-result-object v13

    if-eqz v13, :cond_10

    goto :goto_8

    .line 479
    :cond_10
    invoke-virtual {v14}, Ll/ܰܿܺ;->getName()Ll/۬ܺܺ;

    move-result-object v13

    invoke-virtual {v13}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v13

    goto :goto_9

    :cond_11
    :goto_8
    const-string v13, "<unnamed>"

    .line 480
    :goto_9
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v14

    sub-int/2addr v14, v8

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v15, "parameter "

    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, " v"

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v14, v8}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    .line 485
    :cond_12
    invoke-virtual {v7}, Ll/۟ܺܺ;->᩻()I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_13
    const/4 v1, 0x0

    .line 493
    array-length v2, v12

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v2, :cond_16

    aget-object v5, v12, v3

    if-nez v5, :cond_14

    goto :goto_b

    .line 498
    :cond_14
    invoke-virtual {v5}, Ll/ܰܿܺ;->getSignature()Ll/۬ܺܺ;

    move-result-object v6

    if-eqz v6, :cond_15

    .line 501
    invoke-direct {v0, v5}, Ll/᩺᩻ܺ;->֫(Ll/ܰܿܺ;)V

    :cond_15
    :goto_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    .line 227
    :cond_16
    iget-object v2, v0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez v2, :cond_17

    goto :goto_c

    .line 228
    :cond_17
    iget v2, v0, Ll/᩺᩻ܺ;->֫:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v2, v5, v1

    const-string v2, "%04x: prologue end"

    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    .line 231
    :goto_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 232
    invoke-virtual {v9}, Ll/ܿᩴܺ;->size()I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 305
    :goto_d
    invoke-virtual {v9}, Ll/ܿᩴܺ;->size()I

    move-result v7

    :goto_e
    if-ge v5, v7, :cond_23

    .line 310
    invoke-virtual {v9, v5}, Ll/ܿᩴܺ;->get(I)Ll/ܰܿܺ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ܰܿܺ;->֫()I

    move-result v8

    iget v11, v0, Ll/᩺᩻ܺ;->֫:I

    if-ne v8, v11, :cond_23

    add-int/lit8 v8, v5, 0x1

    .line 311
    invoke-virtual {v9, v5}, Ll/ܿᩴܺ;->get(I)Ll/ܰܿܺ;

    move-result-object v5

    .line 312
    invoke-virtual {v5}, Ll/ܰܿܺ;->ܿ()I

    move-result v11

    .line 313
    aget-object v13, v12, v11

    if-ne v5, v13, :cond_18

    goto/16 :goto_11

    .line 325
    :cond_18
    aput-object v5, v12, v11

    .line 327
    invoke-virtual {v5}, Ll/ܰܿܺ;->᩷()Z

    move-result v11

    const/4 v14, 0x2

    if-eqz v11, :cond_20

    if-eqz v13, :cond_1b

    .line 328
    invoke-virtual {v5, v13}, Ll/ܰܿܺ;->ۧ(Ll/ܰܿܺ;)Z

    move-result v11

    if-eqz v11, :cond_1b

    .line 334
    invoke-virtual {v13}, Ll/ܰܿܺ;->᩷()Z

    move-result v11

    if-nez v11, :cond_1a

    .line 643
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v11

    const/4 v13, 0x6

    .line 645
    invoke-virtual {v10, v13}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 646
    invoke-virtual {v5}, Ll/ܰܿܺ;->ܿ()I

    move-result v13

    invoke-direct {v0, v13}, Ll/᩺᩻ܺ;->ܽ(I)V

    .line 648
    iget-object v13, v0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez v13, :cond_19

    goto/16 :goto_11

    .line 649
    :cond_19
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v13

    sub-int/2addr v13, v11

    iget v11, v0, Ll/᩺᩻ܺ;->֫:I

    .line 651
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5}, Ll/᩺᩻ܺ;->ۧ(Ll/ܰܿܺ;)Ljava/lang/String;

    move-result-object v5

    new-array v14, v14, [Ljava/lang/Object;

    aput-object v11, v14, v1

    const/4 v1, 0x1

    aput-object v5, v14, v1

    const-string v1, "%04x: +local restart %s"

    .line 650
    invoke-static {v1, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 649
    invoke-direct {v0, v13, v1}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    goto/16 :goto_11

    .line 339
    :cond_1a
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "shouldn\'t happen"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 714
    :cond_1b
    invoke-virtual {v5}, Ll/ܰܿܺ;->getSignature()Ll/۬ܺܺ;

    move-result-object v1

    if-eqz v1, :cond_1c

    .line 715
    invoke-direct {v0, v5}, Ll/᩺᩻ܺ;->֫(Ll/ܰܿܺ;)V

    goto/16 :goto_11

    .line 719
    :cond_1c
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v1

    const/4 v11, 0x3

    .line 721
    invoke-virtual {v10, v11}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 723
    invoke-virtual {v5}, Ll/ܰܿܺ;->ܿ()I

    move-result v11

    invoke-direct {v0, v11}, Ll/᩺᩻ܺ;->ܽ(I)V

    .line 724
    invoke-virtual {v5}, Ll/ܰܿܺ;->getName()Ll/۬ܺܺ;

    move-result-object v11

    invoke-direct {v0, v11}, Ll/᩺᩻ܺ;->֫(Ll/۬ܺܺ;)V

    .line 725
    invoke-virtual {v5}, Ll/ܰܿܺ;->getType()Ll/۫ܺܺ;

    move-result-object v11

    if-eqz v11, :cond_1e

    .line 690
    iget-object v13, v0, Ll/᩺᩻ܺ;->ܿ:Ll/֫ۜܺ;

    if-nez v13, :cond_1d

    goto :goto_f

    .line 694
    :cond_1d
    invoke-virtual {v13}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v13

    invoke-virtual {v13, v11}, Ll/ܽ᩷ܺ;->֫(Ll/۫ܺܺ;)I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    .line 693
    invoke-virtual {v10, v11}, Ll/ᩳᩴܺ;->ۜ(I)I

    const/4 v11, 0x0

    goto :goto_10

    :cond_1e
    :goto_f
    const/4 v11, 0x0

    .line 691
    invoke-virtual {v10, v11}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 727
    :goto_10
    iget-object v13, v0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez v13, :cond_1f

    goto :goto_11

    .line 728
    :cond_1f
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v13

    sub-int/2addr v13, v1

    iget v1, v0, Ll/᩺᩻ܺ;->֫:I

    .line 729
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 730
    invoke-static {v5}, Ll/᩺᩻ܺ;->ۧ(Ll/ܰܿܺ;)Ljava/lang/String;

    move-result-object v5

    new-array v14, v14, [Ljava/lang/Object;

    aput-object v1, v14, v11

    const/4 v1, 0x1

    aput-object v5, v14, v1

    const-string v1, "%04x: +local %s"

    .line 729
    invoke-static {v1, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 728
    invoke-direct {v0, v13, v1}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    goto :goto_11

    .line 355
    :cond_20
    invoke-virtual {v5}, Ll/ܰܿܺ;->ۧ()Ll/᩺ܿܺ;

    move-result-object v1

    sget-object v11, Ll/᩺ܿܺ;->ۗ:Ll/᩺ܿܺ;

    if-eq v1, v11, :cond_22

    .line 777
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v1

    const/4 v11, 0x5

    .line 779
    invoke-virtual {v10, v11}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 780
    invoke-virtual {v5}, Ll/ܰܿܺ;->ܿ()I

    move-result v11

    invoke-virtual {v10, v11}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 782
    iget-object v11, v0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez v11, :cond_21

    goto :goto_11

    .line 783
    :cond_21
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v11

    sub-int/2addr v11, v1

    iget v1, v0, Ll/᩺᩻ܺ;->֫:I

    .line 784
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 785
    invoke-static {v5}, Ll/᩺᩻ܺ;->ۧ(Ll/ܰܿܺ;)Ljava/lang/String;

    move-result-object v5

    new-array v13, v14, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v1, v13, v14

    const/4 v1, 0x1

    aput-object v5, v13, v1

    const-string v1, "%04x: -local %s"

    .line 784
    invoke-static {v1, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 783
    invoke-direct {v0, v11, v1}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    :cond_22
    :goto_11
    const/4 v1, 0x0

    move v5, v8

    goto/16 :goto_e

    .line 376
    :cond_23
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_12
    if-ge v6, v1, :cond_24

    .line 378
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۜܳܺ;

    invoke-virtual {v7}, Ll/ۜܳܺ;->֫()I

    move-result v7

    iget v8, v0, Ll/᩺᩻ܺ;->֫:I

    if-ne v7, v8, :cond_24

    add-int/lit8 v7, v6, 0x1

    .line 380
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۜܳܺ;

    invoke-direct {v0, v6}, Ll/᩺᩻ܺ;->֫(Ll/ۜܳܺ;)V

    move v6, v7

    goto :goto_12

    :cond_24
    const v1, 0x7fffffff

    if-ge v5, v3, :cond_25

    .line 256
    invoke-virtual {v9, v5}, Ll/ܿᩴܺ;->get(I)Ll/ܰܿܺ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܰܿܺ;->֫()I

    move-result v7

    goto :goto_13

    :cond_25
    const v7, 0x7fffffff

    :goto_13
    if-ge v6, v2, :cond_26

    .line 260
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۜܳܺ;

    invoke-virtual {v8}, Ll/ۜܳܺ;->֫()I

    move-result v8

    goto :goto_14

    :cond_26
    const v8, 0x7fffffff

    .line 263
    :goto_14
    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    move-result v11

    if-ne v11, v1, :cond_27

    goto :goto_15

    .line 274
    :cond_27
    iget v13, v0, Ll/᩺᩻ܺ;->ܽ:I

    if-ne v11, v13, :cond_29

    if-ne v7, v1, :cond_29

    if-ne v8, v1, :cond_29

    :goto_15
    const/4 v1, 0x0

    .line 943
    invoke-virtual {v10, v1}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 945
    iget-object v1, v0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    if-nez v1, :cond_28

    goto :goto_16

    :cond_28
    const-string v1, "end sequence"

    const/4 v2, 0x1

    .line 946
    invoke-direct {v0, v2, v1}, Ll/᩺᩻ܺ;->֫(ILjava/lang/String;)V

    .line 290
    :goto_16
    invoke-virtual {v10}, Ll/ᩳᩴܺ;->᩻()[B

    move-result-object v1

    return-object v1

    :cond_29
    if-ne v11, v8, :cond_2a

    add-int/lit8 v1, v6, 0x1

    .line 282
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۜܳܺ;

    invoke-direct {v0, v6}, Ll/᩺᩻ܺ;->֫(Ll/ۜܳܺ;)V

    move v6, v1

    goto :goto_17

    .line 284
    :cond_2a
    iget v1, v0, Ll/᩺᩻ܺ;->֫:I

    sub-int/2addr v11, v1

    invoke-direct {v0, v11}, Ll/᩺᩻ܺ;->ۧ(I)V

    :goto_17
    const/4 v1, 0x0

    goto/16 :goto_d
.end method

.method private ܽ(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 935
    iget-object v0, p0, Ll/᩺᩻ܺ;->ۢ:Ll/ᩳᩴܺ;

    invoke-virtual {v0, p1}, Ll/ᩳᩴܺ;->ۜ(I)I

    return-void

    .line 931
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Signed value where unsigned required: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 931
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()[B
    .locals 2

    .line 179
    :try_start_0
    invoke-direct {p0}, Ll/᩺᩻ܺ;->ۧ()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "...while encoding debug info"

    .line 190
    invoke-static {v1, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object v0

    throw v0
.end method

.method public final ֫(Ljava/lang/String;Ll/ۛۘܺ;Z)[B
    .locals 0

    .line 208
    iput-object p1, p0, Ll/᩺᩻ܺ;->ܺ:Ljava/lang/String;

    .line 210
    iput-object p2, p0, Ll/᩺᩻ܺ;->ۧ:Ll/ۛۘܺ;

    .line 211
    iput-boolean p3, p0, Ll/᩺᩻ܺ;->ۘ:Z

    .line 213
    invoke-virtual {p0}, Ll/᩺᩻ܺ;->֫()[B

    move-result-object p1

    return-object p1
.end method
