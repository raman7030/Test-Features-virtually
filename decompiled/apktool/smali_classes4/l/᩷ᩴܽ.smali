.class public final Ll/᩷ᩴܽ;
.super Ljava/lang/Object;
.source "W6QR"


# instance fields
.field public ֡:I

.field public ֨:Ll/ۛۚܽ;

.field public ֫:[I

.field public ۖ:Ll/ۛۚܽ;

.field public volatile ۘ:Ljava/util/HashMap;

.field public ۚ:Ll/ۧۚܽ;

.field public ۜ:Z

.field public ۠:Ll/۟ۘܽ;

.field public ۡ:I

.field public ۢ:I

.field public ۧ:I

.field public ܳ:Z

.field public ܶ:[I

.field public ܺ:Ljava/util/BitSet;

.field public ܽ:I

.field public ܿ:[Ll/ۚۚܽ;

.field public ᩳ:I

.field public ᩴ:Ljava/lang/String;

.field public final ᩵:Ljava/lang/String;

.field public ᩷:Z

.field public ᩸:Ljava/util/ArrayList;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p1, p0, Ll/᩷ᩴܽ;->᩵:Ljava/lang/String;

    .line 150
    iput p2, p0, Ll/᩷ᩴܽ;->ᩳ:I

    const/4 p1, 0x1

    .line 151
    iput p1, p0, Ll/᩷ᩴܽ;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/᩷ᩴܽ;->ۧ(ILjava/lang/String;)I

    move-result p0

    return p0
.end method

.method private ֫(ZZZ)I
    .locals 9

    .line 1569
    invoke-direct {p0}, Ll/᩷ᩴܽ;->᩷()I

    move-result v0

    const/4 v1, 0x2

    const/16 v2, 0x40

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, -0x1

    packed-switch v0, :pswitch_data_0

    const/16 v6, 0x7d

    const/16 v7, 0x7b

    const/16 v8, 0x100

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    return v0

    :pswitch_0
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    add-int/lit8 v0, v0, -0x30

    :goto_0
    if-nez v3, :cond_1

    .line 1537
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result p1

    packed-switch p1, :pswitch_data_3

    goto :goto_1

    :pswitch_1
    mul-int/lit8 p2, v0, 0xa

    add-int/lit8 p1, p1, -0x30

    add-int/2addr p1, p2

    .line 1543
    iget p2, p0, Ll/᩷ᩴܽ;->ۧ:I

    sub-int/2addr p2, v4

    if-ge p2, p1, :cond_0

    goto :goto_1

    .line 1548
    :cond_0
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move v0, p1

    goto :goto_0

    :goto_1
    const/4 v3, 0x1

    goto :goto_0

    .line 1553
    :cond_1
    iput-boolean v4, p0, Ll/᩷ᩴܽ;->᩻:Z

    .line 1554
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1555
    new-instance p1, Ll/ܰ֡ܽ;

    invoke-direct {p0, v2}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    invoke-direct {p1, v0, p2}, Ll/ܰ֡ܽ;-><init>(IZ)V

    goto :goto_2

    .line 1557
    :cond_2
    new-instance p1, Ll/֡֡ܽ;

    invoke-direct {p1, v0}, Ll/֡֡ܽ;-><init>(I)V

    .line 1584
    :goto_2
    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto/16 :goto_b

    .line 2516
    :pswitch_2
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    add-int/lit8 p2, p1, -0x30

    rsub-int/lit8 p3, p1, 0x37

    or-int/2addr p3, p2

    if-ltz p3, :cond_5

    .line 2518
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p3

    add-int/lit8 v0, p3, -0x30

    rsub-int/lit8 p3, p3, 0x37

    or-int/2addr p3, v0

    if-ltz p3, :cond_4

    .line 2520
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p3

    add-int/lit8 v1, p3, -0x30

    rsub-int/lit8 p3, p3, 0x37

    or-int/2addr p3, v1

    const/16 v2, 0x8

    if-ltz p3, :cond_3

    rsub-int/lit8 p1, p1, 0x33

    or-int/2addr p1, p2

    if-ltz p1, :cond_3

    mul-int/lit8 p2, p2, 0x40

    .line 2522
    invoke-static {v0, v2, p2, v1}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result p1

    return p1

    .line 2524
    :cond_3
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    mul-int/lit8 p2, p2, 0x8

    add-int/2addr p2, v0

    return p2

    .line 2527
    :cond_4
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    return p2

    :cond_5
    const-string p1, "Illegal octal escape sequence"

    .line 2530
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :pswitch_3
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1681
    invoke-direct {p0, v4}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1682
    new-instance p1, Ll/֫۠ܽ;

    invoke-direct {p1, v3}, Ll/֫۠ܽ;-><init>(Z)V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    .line 1684
    :cond_6
    new-instance p1, Ll/ۢۚܽ;

    invoke-direct {p1, v3}, Ll/ۢۚܽ;-><init>(Z)V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_4
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1673
    new-instance p1, Ll/ܿ۠ܽ;

    invoke-direct {p1}, Ll/ܿ۠ܽ;-><init>()V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_5
    if-eqz p2, :cond_1e

    .line 1663
    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 1664
    invoke-static {}, Ll/ۙ᩵ܽ;->ᩳ()Ll/ۧۚܽ;

    move-result-object p2

    goto :goto_3

    :cond_7
    invoke-static {}, Ll/ۙ᩵ܽ;->ܽ()Ll/᩹֡ܽ;

    move-result-object p2

    :goto_3
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    .line 1665
    invoke-interface {p2}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object p2

    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1667
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_6
    if-eqz p2, :cond_1e

    .line 1656
    sget-object p2, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2423
    new-instance p2, Ll/ۡ֡ܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 1656
    invoke-virtual {p2}, Ll/ۡ֡ܽ;->negate()Ll/۟᩵ܽ;

    move-result-object p2

    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1658
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_7
    if-eqz p2, :cond_1e

    .line 1644
    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 1645
    sget p2, Ll/ۙ᩵ܽ;->֫:I

    .line 84
    new-instance p2, Ll/ܳ᩵ܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_4

    .line 1645
    :cond_8
    invoke-static {}, Ll/ۙ᩵ܽ;->ۧ()Ll/᩹֡ܽ;

    move-result-object p2

    :goto_4
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    .line 1646
    invoke-interface {p2}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object p2

    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1648
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_8
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1640
    new-instance p1, Ll/᩹ۚܽ;

    invoke-direct {p1}, Ll/᩹ۚܽ;-><init>()V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    .line 1630
    :pswitch_9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x23

    if-lt p1, p2, :cond_1f

    .line 2596
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    if-ne p1, v7, :cond_b

    .line 2597
    iget p1, p0, Ll/᩷ᩴܽ;->ܽ:I

    .line 2598
    :goto_5
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p2

    if-eq p2, v6, :cond_a

    .line 2599
    iget p2, p0, Ll/᩷ᩴܽ;->ܽ:I

    iget p3, p0, Ll/᩷ᩴܽ;->֡:I

    if-ge p2, p3, :cond_9

    goto :goto_5

    :cond_9
    const-string p1, "Unclosed character name escape sequence"

    .line 2600
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    .line 2602
    :cond_a
    new-instance p2, Ljava/lang/String;

    iget-object p3, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    sub-int/2addr v0, p1

    sub-int/2addr v0, v4

    invoke-direct {p2, p3, p1, v0}, Ljava/lang/String;-><init>([III)V

    .line 2604
    :try_start_0
    invoke-static {p2}, Ljava/lang/Character;->codePointOf(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const-string p1, "Unknown character name ["

    const-string p3, "]"

    .line 0
    invoke-static {p1, p2, p3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2606
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_b
    const-string p1, "Illegal character name escape sequence"

    .line 2609
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :pswitch_a
    if-eqz p2, :cond_1e

    .line 1618
    sget-object p2, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2431
    new-instance p2, Ll/᩷֡ܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 1618
    invoke-virtual {p2}, Ll/᩷֡ܽ;->negate()Ll/۟᩵ܽ;

    move-result-object p2

    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1620
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_b
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1612
    iput-boolean v4, p0, Ll/᩷ᩴܽ;->ۜ:Z

    .line 1613
    new-instance p1, Ll/۠ۚܽ;

    invoke-direct {p1}, Ll/۠ۚܽ;-><init>()V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_c
    if-eqz p2, :cond_1e

    .line 1599
    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_c

    .line 1600
    sget p2, Ll/ۙ᩵ܽ;->֫:I

    .line 59
    new-instance p2, Ll/᩶ᩴܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_6

    .line 1600
    :cond_c
    invoke-static {}, Ll/ۙ᩵ܽ;->֫()Ll/᩹֡ܽ;

    move-result-object p2

    :goto_6
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    .line 1601
    invoke-interface {p2}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object p2

    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1603
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_d
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1593
    new-instance p1, Ll/ۛ֡ܽ;

    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    const/4 p3, 0x4

    invoke-direct {p1, p3, p2}, Ll/ۛ֡ܽ;-><init>(IZ)V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_e
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1589
    new-instance p1, Ll/ۚ֡ܽ;

    invoke-direct {p1}, Ll/ۚ֡ܽ;-><init>()V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_f
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1804
    new-instance p1, Ll/ۖۚܽ;

    invoke-direct {p1}, Ll/ۖۚܽ;-><init>()V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    .line 2537
    :pswitch_10
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    const p2, 0x8000

    .line 242
    invoke-static {p1, p2}, Ll/᩹۠ܽ;->֫(II)Z

    move-result p3

    if-eqz p3, :cond_d

    .line 2539
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p3

    .line 242
    invoke-static {p3, p2}, Ll/᩹۠ܽ;->֫(II)Z

    move-result p2

    if-eqz p2, :cond_11

    .line 2541
    invoke-static {p1}, Ll/᩹۠ܽ;->ܽ(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x10

    invoke-static {p3}, Ll/᩹۠ܽ;->ܽ(I)I

    move-result p2

    add-int/2addr p2, p1

    return p2

    :cond_d
    if-ne p1, v7, :cond_11

    .line 2543
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result p1

    .line 242
    invoke-static {p1, p2}, Ll/᩹۠ܽ;->֫(II)Z

    move-result p1

    if-eqz p1, :cond_11

    .line 2545
    :goto_7
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    .line 242
    invoke-static {p1, p2}, Ll/᩹۠ܽ;->֫(II)Z

    move-result p3

    if-eqz p3, :cond_f

    shl-int/lit8 p3, v3, 0x4

    .line 2546
    invoke-static {p1}, Ll/᩹۠ܽ;->ܽ(I)I

    move-result p1

    add-int v3, p1, p3

    const p1, 0x10ffff

    if-gt v3, p1, :cond_e

    goto :goto_7

    :cond_e
    const-string p1, "Hexadecimal codepoint is too big"

    .line 2548
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_f
    if-ne p1, v6, :cond_10

    return v3

    :cond_10
    const-string p1, "Unclosed hexadecimal escape sequence"

    .line 2551
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_11
    const-string p1, "Illegal hexadecimal escape sequence"

    .line 2554
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :pswitch_11
    if-eqz p2, :cond_1e

    .line 1792
    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_12

    .line 1793
    invoke-static {}, Ll/ۙ᩵ܽ;->ᩳ()Ll/ۧۚܽ;

    move-result-object p2

    goto :goto_8

    :cond_12
    invoke-static {}, Ll/ۙ᩵ܽ;->ܽ()Ll/᩹֡ܽ;

    move-result-object p2

    :goto_8
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1795
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_12
    if-eqz p3, :cond_13

    const/16 p1, 0xb

    return p1

    :cond_13
    if-eqz p2, :cond_1e

    .line 1785
    sget-object p2, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2423
    new-instance p2, Ll/ۡ֡ܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 1785
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1787
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    .line 2581
    :pswitch_13
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۡ()I

    move-result p1

    int-to-char p2, p1

    .line 2582
    invoke-static {p2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p3

    if-eqz p3, :cond_15

    .line 2561
    iget p3, p0, Ll/᩷ᩴܽ;->ܽ:I

    .line 2584
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v0

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_14

    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v0

    const/16 v1, 0x75

    if-ne v0, v1, :cond_14

    .line 2585
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۡ()I

    move-result v0

    int-to-char v0, v0

    .line 2586
    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 2587
    invoke-static {p2, v0}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result p1

    return p1

    .line 2565
    :cond_14
    iput p3, p0, Ll/᩷ᩴܽ;->ܽ:I

    :cond_15
    return p1

    :pswitch_14
    const/16 p1, 0x9

    return p1

    :pswitch_15
    if-eqz p2, :cond_1e

    .line 1763
    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_16

    .line 1764
    sget p2, Ll/ۙ᩵ܽ;->֫:I

    .line 84
    new-instance p2, Ll/ܳ᩵ܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_9

    .line 1764
    :cond_16
    invoke-static {}, Ll/ۙ᩵ܽ;->ۧ()Ll/᩹֡ܽ;

    move-result-object p2

    :goto_9
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1766
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_16
    const/16 p1, 0xd

    return p1

    :pswitch_17
    const/16 p1, 0xa

    return p1

    :pswitch_18
    if-nez p1, :cond_1f

    .line 1736
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    const/16 p3, 0x3c

    if-ne p1, p3, :cond_19

    .line 1738
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->֫(I)Ljava/lang/String;

    move-result-object p1

    .line 1739
    invoke-virtual {p0}, Ll/᩷ᩴܽ;->֫()Ljava/util/Map;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_18

    if-eqz p2, :cond_1e

    .line 1743
    iput-boolean v4, p0, Ll/᩷ᩴܽ;->᩻:Z

    .line 1744
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_17

    .line 1745
    new-instance p1, Ll/ܰ֡ܽ;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p0, v2}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p3

    invoke-direct {p1, p2, p3}, Ll/ܰ֡ܽ;-><init>(IZ)V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    .line 1747
    :cond_17
    new-instance p1, Ll/֡֡ܽ;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, Ll/֡֡ܽ;-><init>(I)V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :cond_18
    const-string p2, "named capturing group <"

    const-string p3, "> does not exist"

    .line 0
    invoke-static {p2, p1, p3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1741
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_19
    const-string p1, "\\k is not followed by \'<\' for named capturing group"

    .line 1737
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :pswitch_19
    if-eqz p2, :cond_1e

    .line 1725
    sget-object p2, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2431
    new-instance p2, Ll/᩷֡ܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 1725
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1727
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    :pswitch_1a
    const/16 p1, 0xc

    return p1

    :pswitch_1b
    const/16 p1, 0x1b

    return p1

    :pswitch_1c
    if-eqz p2, :cond_1e

    .line 1711
    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_1a

    .line 1712
    sget p2, Ll/ۙ᩵ܽ;->֫:I

    .line 59
    new-instance p2, Ll/᩶ᩴܽ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_a

    .line 1712
    :cond_1a
    invoke-static {}, Ll/ۙ᩵ܽ;->֫()Ll/᩹֡ܽ;

    move-result-object p2

    :goto_a
    iput-object p2, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    if-nez p1, :cond_1e

    .line 1714
    invoke-direct {p0, p2}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    .line 2506
    :pswitch_1d
    iget p1, p0, Ll/᩷ᩴܽ;->ܽ:I

    iget p2, p0, Ll/᩷ᩴܽ;->֡:I

    if-ge p1, p2, :cond_1b

    .line 2507
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_1b
    const-string p1, "Illegal control escape sequence"

    .line 2509
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :pswitch_1e
    if-nez p1, :cond_1f

    if-eqz p2, :cond_1e

    .line 1692
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result p1

    if-ne p1, v7, :cond_1d

    .line 1693
    invoke-direct {p0}, Ll/᩷ᩴܽ;->᩷()I

    move-result p1

    const/16 p2, 0x67

    if-ne p1, p2, :cond_1c

    .line 1694
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    if-ne p1, v6, :cond_1f

    .line 1695
    iput-boolean v4, p0, Ll/᩷ᩴܽ;->ܳ:Z

    .line 1696
    new-instance p1, Ll/᩵ۚܽ;

    invoke-direct {p1}, Ll/᩵ۚܽ;-><init>()V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return v5

    .line 1701
    :cond_1c
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    .line 1702
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    .line 1704
    :cond_1d
    new-instance p1, Ll/ۛ֡ܽ;

    const/4 p2, 0x3

    invoke-direct {p0, v8}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result p3

    invoke-direct {p1, p2, p3}, Ll/ۛ֡ܽ;-><init>(IZ)V

    iput-object p1, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    :cond_1e
    :goto_b
    return v5

    :cond_1f
    :pswitch_1f
    const-string p1, "Illegal/unsupported escape sequence"

    .line 1809
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :pswitch_20
    const/4 p1, 0x7

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x41
        :pswitch_e
        :pswitch_d
        :pswitch_1f
        :pswitch_c
        :pswitch_1f
        :pswitch_1f
        :pswitch_b
        :pswitch_a
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_9
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_8
        :pswitch_7
        :pswitch_1f
        :pswitch_1f
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_1f
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_20
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_1f
        :pswitch_19
        :pswitch_1f
        :pswitch_1f
        :pswitch_18
        :pswitch_1f
        :pswitch_1f
        :pswitch_17
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_1f
        :pswitch_f
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x30
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private ֫(I)Ljava/lang/String;
    .locals 2

    .line 2101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x300

    .line 214
    invoke-static {p1, v1}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    int-to-char p1, p1

    .line 2105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2106
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result p1

    const/16 v1, 0x700

    .line 222
    invoke-static {p1, v1}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x3e

    if-ne p1, v1, :cond_1

    .line 2109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "named capturing group is missing trailing \'>\'"

    .line 2108
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_2
    const-string p1, "capturing group name does not start with a Latin letter"

    .line 2103
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1
.end method

.method public static ֫(Ll/ۛۚܽ;Z)Ll/֡֨ܽ;
    .locals 2

    if-nez p1, :cond_6

    .line 1002
    invoke-static {p0}, Ll/֨֨ܽ;->֫(Ll/ۛۚܽ;)Ll/֨֨ܽ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 1006
    :cond_0
    invoke-static {p0}, Ll/ܶ֨ܽ;->֫(Ll/ۛۚܽ;)Ll/ܶ֨ܽ;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 1011
    :cond_1
    instance-of v0, p0, Ll/ۢ֨ܽ;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ll/ۢ֨ܽ;

    .line 1012
    new-instance v1, Ll/᩶֨ܽ;

    invoke-direct {v1, v0}, Ll/᩶֨ܽ;-><init>(Ll/ۢ֨ܽ;)V

    goto :goto_0

    .line 1013
    :cond_2
    instance-of v0, p0, Ll/᩶֡ܽ;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Ll/᩶֡ܽ;

    .line 1014
    new-instance v1, Ll/ۚ֨ܽ;

    invoke-direct {v1, v0}, Ll/ۚ֨ܽ;-><init>(Ll/᩶֡ܽ;)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 1016
    :goto_0
    invoke-static {p0}, Ll/۠֨ܽ;->֫(Ll/ۛۚܽ;)Ll/۠֨ܽ;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    .line 1020
    :cond_4
    invoke-static {p0, v1}, Ll/᩸֨ܽ;->֫(Ll/ۛۚܽ;Ll/֡֨ܽ;)Ll/᩸֨ܽ;

    move-result-object v0

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    if-eqz v1, :cond_6

    return-object v1

    :cond_6
    if-eqz p1, :cond_7

    .line 1028
    new-instance p1, Ll/᩹֨ܽ;

    .line 763
    invoke-direct {p1, p0}, Ll/֡֨ܽ;-><init>(Ll/ۛۚܽ;)V

    return-object p1

    .line 1028
    :cond_7
    new-instance p1, Ll/֡֨ܽ;

    invoke-direct {p1, p0}, Ll/֡֨ܽ;-><init>(Ll/ۛۚܽ;)V

    return-object p1
.end method

.method public static ֫(ILjava/lang/String;)Ll/֫֡ܽ;
    .locals 22

    move-object/from16 v0, p1

    .line 156
    new-instance v1, Ll/᩷ᩴܽ;

    move/from16 v2, p0

    invoke-direct {v1, v0, v2}, Ll/᩷ᩴܽ;-><init>(Ljava/lang/String;I)V

    .line 157
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 158
    new-instance v0, Ll/֡֨ܽ;

    sget-object v2, Ll/ܳ۠ܽ;->ܽ:Ll/ܶۚܽ;

    invoke-direct {v0, v2}, Ll/֡֨ܽ;-><init>(Ll/ۛۚܽ;)V

    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 159
    iput-object v2, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    .line 160
    invoke-static {v2}, Ll/ܳ۠ܽ;->ᩳ(Ll/ۛۚܽ;)Ll/۟ۘܽ;

    move-result-object v0

    iput-object v0, v1, Ll/᩷ᩴܽ;->۠:Ll/۟ۘܽ;

    goto/16 :goto_2f

    .line 886
    :cond_0
    iput-boolean v3, v1, Ll/᩷ᩴܽ;->ۜ:Z

    .line 887
    iput-boolean v3, v1, Ll/᩷ᩴܽ;->ܳ:Z

    const/4 v2, 0x0

    .line 888
    iput-object v2, v1, Ll/᩷ᩴܽ;->ܺ:Ljava/util/BitSet;

    .line 889
    iput-object v2, v1, Ll/᩷ᩴܽ;->۠:Ll/۟ۘܽ;

    .line 890
    iput-object v0, v1, Ll/᩷ᩴܽ;->ᩴ:Ljava/lang/String;

    .line 891
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܳ()V

    const/16 v0, 0x80

    .line 892
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    const/16 v2, 0x2d

    const/16 v4, 0x5c

    const/16 v5, 0x10

    if-eqz v0, :cond_2c

    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    if-nez v0, :cond_2c

    .line 894
    iget-object v0, v1, Ll/᩷ᩴܽ;->ܶ:[I

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 896
    :goto_0
    iget-object v7, v1, Ll/᩷ᩴܽ;->᩵:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v5, v7, :cond_1

    add-int/lit8 v7, v6, 0x1

    .line 897
    aput v5, v0, v6

    .line 896
    iget-object v6, v1, Ll/᩷ᩴܽ;->᩵:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v5, v6

    move v6, v7

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v6, 0x1

    .line 898
    iget-object v7, v1, Ll/᩷ᩴܽ;->᩵:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    aput v7, v0, v5

    aput v7, v0, v6

    .line 899
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->֫([I)[I

    move-result-object v0

    .line 900
    new-instance v5, Ljava/lang/String;

    iget-object v6, v1, Ll/᩷ᩴܽ;->ܶ:[I

    iget v7, v1, Ll/᩷ᩴܽ;->֡:I

    invoke-direct {v5, v6, v3, v7}, Ljava/lang/String;-><init>([III)V

    .line 901
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    new-array v6, v6, [I

    const/4 v7, 0x0

    .line 902
    :goto_1
    iget v8, v1, Ll/᩷ᩴܽ;->֡:I

    if-ge v7, v8, :cond_2

    .line 903
    iget-object v8, v1, Ll/᩷ᩴܽ;->ܶ:[I

    aget v8, v8, v7

    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v8, v3

    .line 904
    aget v9, v0, v7

    invoke-static {v6, v3, v8, v9}, Ljava/util/Arrays;->fill([IIII)V

    add-int/lit8 v7, v7, 0x1

    move v3, v8

    goto :goto_1

    .line 907
    :cond_2
    iget-object v0, v1, Ll/᩷ᩴܽ;->᩵:Ljava/lang/String;

    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    .line 292
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    .line 293
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 294
    new-instance v9, Ll/ܽᩴܽ;

    invoke-direct {v9, v8, v0}, Ll/ܽᩴܽ;-><init>(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v10, v9, Ll/ܽᩴܽ;->֫:Ljava/util/BitSet;

    .line 295
    new-instance v11, Ll/ᩳᩴܽ;

    invoke-direct {v11, v5, v3}, Ll/ᩳᩴܽ;-><init>(Ljava/lang/String;I)V

    .line 296
    new-instance v3, Ljava/util/ArrayDeque;

    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_2
    const/16 v16, 0x0

    :goto_3
    const/16 v17, 0x0

    :goto_4
    move-object/from16 v18, v1

    if-ge v12, v7, :cond_2a

    .line 304
    invoke-virtual {v11, v12}, Ll/ᩳᩴܽ;->֫(I)I

    move-result v1

    if-eq v1, v12, :cond_4

    if-ne v1, v7, :cond_3

    goto/16 :goto_15

    :cond_3
    const/16 v17, 0x0

    move v12, v1

    .line 311
    :cond_4
    invoke-virtual {v5, v12}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v4, :cond_7

    move/from16 p0, v4

    add-int/lit8 v4, v12, 0x1

    if-ge v4, v7, :cond_7

    .line 313
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const-string v4, "dDsSwWhHVpP"

    .line 315
    invoke-virtual {v4, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-gez v4, :cond_6

    const/16 v4, 0x76

    if-ne v1, v4, :cond_5

    add-int/lit8 v1, v12, 0x2

    if-ge v1, v7, :cond_6

    .line 316
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_6

    :cond_5
    const/4 v1, 0x1

    const/16 v16, 0x1

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    const/16 v16, 0x0

    .line 317
    :goto_5
    invoke-virtual {v11, v12, v10, v6}, Ll/ᩳᩴܽ;->֫(ILjava/util/BitSet;[I)I

    move-result v12

    const/4 v13, 0x0

    move/from16 v4, p0

    move-object/from16 v1, v18

    goto :goto_3

    :cond_7
    const/16 v4, 0x5b

    if-lez v15, :cond_a

    if-ne v1, v2, :cond_a

    if-eqz v16, :cond_a

    add-int/lit8 v2, v12, 0x1

    if-ge v2, v7, :cond_a

    move-object/from16 p1, v8

    .line 322
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v8, v4, :cond_b

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v4, 0x5d

    if-eq v8, v4, :cond_b

    .line 324
    invoke-virtual {v11, v2}, Ll/ᩳᩴܽ;->֫(I)I

    move-result v1

    if-ge v1, v7, :cond_9

    .line 326
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x5c

    if-ne v2, v4, :cond_8

    .line 327
    invoke-virtual {v11, v1, v10, v6}, Ll/ᩳᩴܽ;->֫(ILjava/util/BitSet;[I)I

    move-result v1

    goto :goto_6

    .line 328
    :cond_8
    invoke-virtual {v5, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v1, v2

    :cond_9
    :goto_6
    move v12, v1

    const/16 v2, 0x2d

    const/16 v4, 0x5c

    const/4 v13, 0x0

    goto :goto_7

    :cond_a
    move-object/from16 p1, v8

    :cond_b
    if-lez v15, :cond_c

    const/16 v2, 0x26

    if-ne v1, v2, :cond_c

    add-int/lit8 v4, v12, 0x1

    .line 334
    invoke-virtual {v11, v4}, Ll/ᩳᩴܽ;->֫(I)I

    move-result v4

    if-ge v4, v7, :cond_c

    .line 335
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v2, :cond_c

    add-int/lit8 v12, v4, 0x1

    const/16 v2, 0x2d

    const/16 v4, 0x5c

    :goto_7
    move-object/from16 v8, p1

    move-object/from16 v1, v18

    goto/16 :goto_2

    :cond_c
    if-nez v15, :cond_1f

    const/16 v2, 0x28

    if-ne v1, v2, :cond_1f

    .line 342
    iget v1, v11, Ll/ᩳᩴܽ;->֫:I

    add-int/lit8 v12, v12, 0x1

    .line 510
    invoke-virtual {v11, v12}, Ll/ᩳᩴܽ;->֫(I)I

    move-result v2

    .line 511
    iget-object v4, v11, Ll/ᩳᩴܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v2, v8, :cond_1b

    move/from16 p0, v7

    .line 512
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    move-object/from16 v20, v10

    const/16 v10, 0x3f

    if-eq v7, v10, :cond_d

    goto/16 :goto_d

    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 514
    iget v7, v11, Ll/ᩳᩴܽ;->֫:I

    const/4 v10, 0x0

    .line 516
    :goto_8
    invoke-virtual {v11, v2}, Ll/ᩳᩴܽ;->֫(I)I

    move-result v2

    if-ge v2, v8, :cond_1a

    move/from16 v19, v8

    .line 517
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    move-object/from16 v21, v4

    const/16 v4, 0x3a

    if-eq v8, v4, :cond_1c

    const/16 v4, 0x29

    if-ne v8, v4, :cond_e

    goto/16 :goto_e

    :cond_e
    const/16 v4, 0x2d

    if-ne v8, v4, :cond_f

    if-nez v10, :cond_f

    const/4 v4, 0x1

    const/4 v10, 0x1

    goto :goto_b

    :cond_f
    const/16 v4, 0x55

    if-eq v8, v4, :cond_17

    const/16 v4, 0x69

    if-eq v8, v4, :cond_16

    const/16 v4, 0x6d

    if-eq v8, v4, :cond_15

    const/16 v4, 0x73

    if-eq v8, v4, :cond_14

    const/16 v4, 0x75

    if-eq v8, v4, :cond_13

    const/16 v4, 0x78

    if-eq v8, v4, :cond_12

    const/16 v4, 0x63

    if-eq v8, v4, :cond_11

    const/16 v4, 0x64

    if-eq v8, v4, :cond_10

    const/4 v4, 0x0

    goto :goto_9

    :cond_10
    const/4 v4, 0x1

    goto :goto_9

    :cond_11
    const/16 v4, 0x80

    goto :goto_9

    :cond_12
    const/4 v4, 0x4

    goto :goto_9

    :cond_13
    const/16 v4, 0x40

    goto :goto_9

    :cond_14
    const/16 v4, 0x20

    goto :goto_9

    :cond_15
    const/16 v4, 0x8

    goto :goto_9

    :cond_16
    const/4 v4, 0x2

    goto :goto_9

    :cond_17
    const/16 v4, 0x140

    :goto_9
    if-nez v4, :cond_18

    goto :goto_c

    .line 534
    :cond_18
    iget v8, v11, Ll/ᩳᩴܽ;->֫:I

    if-eqz v10, :cond_19

    not-int v4, v4

    and-int/2addr v4, v8

    goto :goto_a

    :cond_19
    or-int/2addr v4, v8

    :goto_a
    iput v4, v11, Ll/ᩳᩴܽ;->֫:I

    :goto_b
    add-int/lit8 v2, v2, 0x1

    move/from16 v8, v19

    move-object/from16 v4, v21

    goto :goto_8

    .line 538
    :cond_1a
    :goto_c
    iput v7, v11, Ll/ᩳᩴܽ;->֫:I

    goto :goto_d

    :cond_1b
    move/from16 p0, v7

    move-object/from16 v20, v10

    :goto_d
    const/4 v2, -0x1

    :cond_1c
    :goto_e
    if-ltz v2, :cond_1e

    .line 345
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v7, 0x3a

    if-ne v4, v7, :cond_1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_1d
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v4, p1

    move v12, v2

    goto/16 :goto_14

    .line 348
    :cond_1e
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_14

    :cond_1f
    move/from16 p0, v7

    move-object/from16 v20, v10

    if-nez v15, :cond_20

    const/16 v2, 0x29

    if-ne v1, v2, :cond_20

    .line 353
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_20

    .line 354
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v11, Ll/ᩳᩴܽ;->֫:I

    :cond_20
    const/16 v2, 0x5b

    if-ne v1, v2, :cond_23

    if-nez v15, :cond_22

    .line 358
    aget v1, v6, v12

    if-ge v14, v1, :cond_21

    .line 359
    invoke-virtual {v9, v14, v1}, Ll/ܽᩴܽ;->֫(II)V

    :cond_21
    move v14, v1

    :cond_22
    add-int/lit8 v15, v15, 0x1

    const/4 v13, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object/from16 v4, p1

    goto :goto_13

    :cond_23
    const/16 v2, 0x5d

    if-ne v1, v2, :cond_25

    if-lez v15, :cond_25

    if-nez v13, :cond_25

    add-int/lit8 v15, v15, -0x1

    if-nez v15, :cond_24

    .line 370
    aget v1, v6, v12

    add-int/lit8 v1, v1, 0x1

    .line 609
    invoke-virtual {v0, v14, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/text/Normalizer$Form;->NFC:Ljava/text/Normalizer$Form;

    invoke-static {v2, v4}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p1

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v14, v1

    goto :goto_f

    :cond_24
    move-object/from16 v4, p1

    :goto_f
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    goto :goto_12

    :cond_25
    move-object/from16 v4, p1

    if-lez v15, :cond_29

    const/16 v2, 0x5e

    if-ne v1, v2, :cond_27

    if-nez v17, :cond_26

    goto :goto_10

    :cond_26
    const/4 v1, 0x0

    goto :goto_11

    :cond_27
    :goto_10
    const/4 v1, 0x1

    :goto_11
    if-eqz v1, :cond_28

    const/4 v13, 0x0

    :cond_28
    move/from16 v16, v1

    :goto_12
    const/16 v17, 0x0

    :cond_29
    :goto_13
    add-int/lit8 v12, v12, 0x1

    :goto_14
    const/16 v2, 0x2d

    const/16 v1, 0x5c

    move/from16 v7, p0

    move-object v8, v4

    move-object/from16 v1, v18

    move-object/from16 v10, v20

    const/16 v4, 0x5c

    goto/16 :goto_4

    :cond_2a
    :goto_15
    move-object v4, v8

    .line 383
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v14, v1, :cond_2b

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v9, v14, v0}, Ll/ܽᩴܽ;->֫(II)V

    .line 384
    :cond_2b
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    .line 907
    iput-object v0, v1, Ll/᩷ᩴܽ;->ᩴ:Ljava/lang/String;

    .line 908
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܳ()V

    :cond_2c
    const/16 v0, 0x10

    .line 910
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_2d

    .line 787
    invoke-direct {v1, v2}, Ll/᩷ᩴܽ;->֫([I)[I

    :cond_2d
    const/16 v0, 0x20

    new-array v0, v0, [I

    .line 913
    iput-object v0, v1, Ll/᩷ᩴܽ;->֫:[I

    const/16 v0, 0xa

    new-array v3, v0, [Ll/ۚۚܽ;

    .line 914
    iput-object v3, v1, Ll/᩷ᩴܽ;->ܿ:[Ll/ۚۚܽ;

    .line 915
    iput-object v2, v1, Ll/᩷ᩴܽ;->ۘ:Ljava/util/HashMap;

    .line 916
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    const/16 v0, 0x10

    .line 918
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 920
    iget-object v0, v1, Ll/᩷ᩴܽ;->ܶ:[I

    iget v2, v1, Ll/᩷ᩴܽ;->֡:I

    iget-boolean v3, v1, Ll/᩷ᩴܽ;->᩷:Z

    invoke-direct {v1, v2, v3, v0}, Ll/᩷ᩴܽ;->֫(IZ[I)Ll/ۖ֨ܽ;

    move-result-object v0

    iput-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    .line 921
    sget-object v2, Ll/ܳ۠ܽ;->ܽ:Ll/ܶۚܽ;

    iput-object v2, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto/16 :goto_28

    .line 924
    :cond_2e
    sget-object v0, Ll/ܳ۠ܽ;->ܽ:Ll/ܶۚܽ;

    .line 1235
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 1236
    new-instance v3, Ll/ۜᩴܽ;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Ll/ۜᩴܽ;-><init>(Ll/ۛۚܽ;Ll/ܳᩴܽ;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1238
    :cond_2f
    :goto_16
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜᩴܽ;

    .line 1322
    iget-object v3, v0, Ll/ۜᩴܽ;->᩻:Ll/ۛۚܽ;

    .line 1323
    iget-object v4, v0, Ll/ۜᩴܽ;->ۜ:Ll/ۛۚܽ;

    .line 1327
    :goto_17
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v5

    const/16 v6, 0x7c

    const/16 v7, 0x24

    if-eqz v5, :cond_3f

    if-eq v5, v7, :cond_3d

    const/16 v8, 0x2e

    if-eq v5, v8, :cond_3a

    const/16 v8, 0x3f

    if-eq v5, v8, :cond_39

    if-eq v5, v6, :cond_40

    const/16 v8, 0x7d

    if-eq v5, v8, :cond_38

    packed-switch v5, :pswitch_data_0

    packed-switch v5, :pswitch_data_1

    goto/16 :goto_3c

    .line 1359
    :pswitch_0
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    const/16 v5, 0x8

    .line 1360
    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_31

    const/4 v5, 0x1

    .line 1361
    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_30

    .line 1362
    new-instance v5, Ll/۟֨ܽ;

    invoke-direct {v5}, Ll/۟֨ܽ;-><init>()V

    goto/16 :goto_3d

    .line 1364
    :cond_30
    new-instance v5, Ll/۟֡ܽ;

    invoke-direct {v5}, Ll/۟֡ܽ;-><init>()V

    goto/16 :goto_3d

    .line 1366
    :cond_31
    new-instance v5, Ll/ۚ֡ܽ;

    invoke-direct {v5}, Ll/ۚ֡ܽ;-><init>()V

    goto/16 :goto_3d

    .line 1114
    :pswitch_1
    iget-object v5, v1, Ll/᩷ᩴܽ;->ܶ:[I

    iget v6, v1, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v1, Ll/᩷ᩴܽ;->ܽ:I

    aget v5, v5, v6

    const/16 v6, 0x70

    const/16 v7, 0x50

    if-eq v5, v6, :cond_33

    if-ne v5, v7, :cond_32

    goto :goto_18

    .line 1354
    :cond_32
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۢ()V

    .line 1355
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۧ()Ll/ۛۚܽ;

    move-result-object v5

    goto/16 :goto_3d

    :cond_33
    :goto_18
    if-ne v5, v7, :cond_34

    const/4 v5, 0x1

    goto :goto_19

    :cond_34
    const/4 v5, 0x0

    .line 1342
    :goto_19
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v6

    const/16 v7, 0x7b

    if-eq v6, v7, :cond_35

    .line 1344
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۢ()V

    const/4 v6, 0x1

    goto :goto_1a

    :cond_35
    const/4 v6, 0x0

    :goto_1a
    const/16 v7, 0x80

    .line 1349
    invoke-direct {v1, v7}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v7

    if-eqz v7, :cond_36

    const/16 v7, 0x10

    invoke-direct {v1, v7}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v7

    if-nez v7, :cond_36

    .line 1350
    new-instance v7, Ll/۫ۚܽ;

    invoke-direct {v1, v6, v5}, Ll/᩷ᩴܽ;->֫(ZZ)Ll/ۧۚܽ;

    move-result-object v5

    invoke-direct {v7, v5}, Ll/۫ۚܽ;-><init>(Ll/ۧۚܽ;)V

    move-object v5, v7

    goto/16 :goto_3d

    .line 1352
    :cond_36
    invoke-direct {v1, v6, v5}, Ll/᩷ᩴܽ;->֫(ZZ)Ll/ۧۚܽ;

    move-result-object v5

    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object v5

    goto/16 :goto_3d

    :pswitch_2
    const/16 v5, 0x80

    .line 1332
    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    const/16 v6, 0x10

    if-eqz v5, :cond_37

    invoke-direct {v1, v6}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    if-nez v5, :cond_37

    .line 1333
    new-instance v5, Ll/۫ۚܽ;

    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܽ()Ll/ۧۚܽ;

    move-result-object v6

    invoke-direct {v5, v6}, Ll/۫ۚܽ;-><init>(Ll/ۧۚܽ;)V

    goto/16 :goto_3d

    .line 1335
    :cond_37
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܽ()Ll/ۧۚܽ;

    move-result-object v5

    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object v5

    goto/16 :goto_3d

    .line 1393
    :cond_38
    :pswitch_3
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۧ()Ll/ۛۚܽ;

    move-result-object v5

    goto/16 :goto_3d

    .line 1398
    :cond_39
    :pswitch_4
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    .line 1399
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Dangling meta character \'"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v2, v5

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    .line 1377
    :cond_3a
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    const/16 v5, 0x20

    .line 1378
    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_3b

    .line 1379
    new-instance v5, Ll/ۖ֡ܽ;

    invoke-direct {v5}, Ll/ۖ֡ܽ;-><init>()V

    goto/16 :goto_3d

    :cond_3b
    const/4 v5, 0x1

    .line 1381
    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_3c

    .line 1382
    new-instance v5, Ll/ۧ۠ܽ;

    invoke-direct {v5}, Ll/ۧ۠ܽ;-><init>()V

    goto/16 :goto_3d

    .line 1384
    :cond_3c
    new-instance v5, Ll/ۡۚܽ;

    invoke-direct {v5}, Ll/ۡۚܽ;-><init>()V

    goto/16 :goto_3d

    :cond_3d
    const/4 v5, 0x1

    .line 1370
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    .line 1371
    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_3e

    .line 1372
    new-instance v5, Ll/֫۠ܽ;

    const/16 v6, 0x8

    invoke-direct {v1, v6}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v6

    invoke-direct {v5, v6}, Ll/֫۠ܽ;-><init>(Z)V

    goto/16 :goto_3d

    :cond_3e
    const/16 v5, 0x8

    .line 1374
    new-instance v6, Ll/ۢۚܽ;

    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v5

    invoke-direct {v6, v5}, Ll/ۢۚܽ;-><init>(Z)V

    move-object v5, v6

    goto/16 :goto_3d

    .line 1401
    :cond_3f
    iget v5, v1, Ll/᩷ᩴܽ;->ܽ:I

    iget v8, v1, Ll/᩷ᩴܽ;->֡:I

    if-lt v5, v8, :cond_95

    .line 1424
    :cond_40
    :pswitch_5
    iput-object v3, v0, Ll/ۜᩴܽ;->᩻:Ll/ۛۚܽ;

    .line 1425
    iput-object v4, v0, Ll/ۜᩴܽ;->ۜ:Ll/ۛۚܽ;

    .line 1240
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v3

    const/16 v4, 0x28

    if-ne v3, v4, :cond_5c

    .line 2135
    new-instance v0, Ll/ܳᩴܽ;

    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    iget-object v4, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v0, v3, v4}, Ll/ܳᩴܽ;-><init>(II)V

    const/4 v3, 0x0

    .line 2136
    iput-object v3, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 2137
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v3

    const/16 v4, 0x3f

    if-ne v3, v4, :cond_5b

    .line 2139
    invoke-direct {v1}, Ll/᩷ᩴܽ;->᩷()I

    move-result v3

    const/16 v4, 0x21

    const/16 v5, 0x3d

    if-eq v3, v4, :cond_59

    if-eq v3, v7, :cond_58

    const/16 v6, 0x3a

    if-eq v3, v6, :cond_57

    const/16 v6, 0x40

    if-eq v3, v6, :cond_58

    packed-switch v3, :pswitch_data_2

    .line 2170
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۢ()V

    .line 2337
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v3

    const/16 v4, 0x2d

    goto :goto_1c

    .line 2147
    :pswitch_6
    sget-object v3, Ll/᩻ᩴܽ;->᩹:Ll/᩻ᩴܽ;

    iput-object v3, v0, Ll/ܳᩴܽ;->ۜ:Ll/᩻ᩴܽ;

    const/4 v3, 0x1

    .line 2148
    invoke-direct {v1, v3}, Ll/᩷ᩴܽ;->֫(Z)Ll/ۚۚܽ;

    move-result-object v3

    iput-object v3, v0, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    goto/16 :goto_22

    .line 2151
    :pswitch_7
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v3

    if-eq v3, v5, :cond_42

    if-eq v3, v4, :cond_42

    .line 2154
    invoke-direct {v1, v3}, Ll/᩷ᩴܽ;->֫(I)Ljava/lang/String;

    move-result-object v3

    .line 2155
    invoke-virtual {v1}, Ll/᩷ᩴܽ;->֫()Ljava/util/Map;

    move-result-object v4

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_41

    const/4 v4, 0x1

    .line 2158
    iput-boolean v4, v0, Ll/ܳᩴܽ;->֫:Z

    const/4 v4, 0x0

    .line 2159
    invoke-direct {v1, v4}, Ll/᩷ᩴܽ;->֫(Z)Ll/ۚۚܽ;

    move-result-object v4

    iput-object v4, v0, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    .line 2160
    invoke-virtual {v1}, Ll/᩷ᩴܽ;->֫()Ljava/util/Map;

    move-result-object v4

    iget v5, v1, Ll/᩷ᩴܽ;->ۧ:I

    add-int/lit8 v5, v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_22

    :cond_41
    const-string v0, "Named capturing group <"

    const-string v2, "> is already defined"

    .line 0
    invoke-static {v0, v3, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2156
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_42
    if-ne v3, v5, :cond_43

    .line 2163
    sget-object v3, Ll/᩻ᩴܽ;->۫:Ll/᩻ᩴܽ;

    goto :goto_1b

    :cond_43
    sget-object v3, Ll/᩻ᩴܽ;->ۙ:Ll/᩻ᩴܽ;

    :goto_1b
    iput-object v3, v0, Ll/ܳᩴܽ;->ۜ:Ll/᩻ᩴܽ;

    .line 2164
    iget v3, v1, Ll/᩷ᩴܽ;->ܽ:I

    iput v3, v0, Ll/ܳᩴܽ;->ܳ:I

    .line 2165
    iget v3, v1, Ll/᩷ᩴܽ;->ۧ:I

    iput v3, v0, Ll/ܳᩴܽ;->ܽ:I

    const/4 v3, 0x1

    .line 2166
    invoke-direct {v1, v3}, Ll/᩷ᩴܽ;->֫(Z)Ll/ۚۚܽ;

    move-result-object v3

    iput-object v3, v0, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    goto/16 :goto_22

    :goto_1c
    if-eq v3, v4, :cond_4c

    const/16 v5, 0x55

    if-eq v3, v5, :cond_4b

    const/16 v5, 0x69

    if-eq v3, v5, :cond_4a

    const/16 v5, 0x6d

    if-eq v3, v5, :cond_49

    const/16 v5, 0x73

    if-eq v3, v5, :cond_48

    const/16 v5, 0x75

    if-eq v3, v5, :cond_47

    const/16 v5, 0x78

    if-eq v3, v5, :cond_46

    const/16 v5, 0x63

    if-eq v3, v5, :cond_45

    const/16 v5, 0x64

    if-eq v3, v5, :cond_44

    goto :goto_1f

    .line 2350
    :cond_44
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit8 v3, v3, 0x1

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_1d

    .line 2356
    :cond_45
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit16 v3, v3, 0x80

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_1d

    .line 2359
    :cond_46
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit8 v3, v3, 0x4

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_1d

    .line 2353
    :cond_47
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit8 v3, v3, 0x40

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_1d

    .line 2347
    :cond_48
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit8 v3, v3, 0x20

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_1d

    .line 2344
    :cond_49
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit8 v3, v3, 0x8

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_1d

    .line 2341
    :cond_4a
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit8 v3, v3, 0x2

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_1d

    .line 2362
    :cond_4b
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    or-int/lit16 v3, v3, 0x140

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    .line 2370
    :goto_1d
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v3

    goto :goto_1c

    .line 2365
    :cond_4c
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    .line 2380
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v3

    const/16 v4, 0x55

    :goto_1e
    if-eq v3, v4, :cond_56

    const/16 v5, 0x69

    if-eq v3, v5, :cond_55

    const/16 v5, 0x6d

    if-eq v3, v5, :cond_54

    const/16 v5, 0x73

    if-eq v3, v5, :cond_53

    const/16 v5, 0x75

    if-eq v3, v5, :cond_52

    const/16 v5, 0x78

    if-eq v3, v5, :cond_51

    const/16 v5, 0x63

    if-eq v3, v5, :cond_50

    const/16 v5, 0x64

    if-eq v3, v5, :cond_4f

    .line 2172
    :goto_1f
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v3

    const/16 v4, 0x29

    if-ne v3, v4, :cond_4d

    const/4 v0, 0x0

    goto/16 :goto_23

    :cond_4d
    const/16 v4, 0x3a

    if-ne v3, v4, :cond_4e

    const/4 v3, 0x1

    .line 2179
    invoke-direct {v1, v3}, Ll/᩷ᩴܽ;->֫(Z)Ll/ۚۚܽ;

    move-result-object v3

    iput-object v3, v0, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    goto/16 :goto_22

    :cond_4e
    const-string v0, "Unknown inline modifier"

    .line 2177
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    .line 2393
    :cond_4f
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit8 v3, v3, -0x2

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_20

    .line 2399
    :cond_50
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit16 v3, v3, -0x81

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_20

    .line 2402
    :cond_51
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit8 v3, v3, -0x5

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_20

    .line 2396
    :cond_52
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit8 v3, v3, -0x41

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_20

    .line 2390
    :cond_53
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit8 v3, v3, -0x21

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_20

    .line 2387
    :cond_54
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit8 v3, v3, -0x9

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_20

    .line 2384
    :cond_55
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit8 v3, v3, -0x3

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    goto :goto_20

    .line 2405
    :cond_56
    iget v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit16 v3, v3, -0x141

    iput v3, v1, Ll/᩷ᩴܽ;->ᩳ:I

    .line 2410
    :goto_20
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v3

    goto :goto_1e

    :cond_57
    const/4 v3, 0x1

    .line 2141
    invoke-direct {v1, v3}, Ll/᩷ᩴܽ;->֫(Z)Ll/ۚۚܽ;

    move-result-object v3

    iput-object v3, v0, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    goto :goto_22

    :cond_58
    const-string v0, "Unknown group type"

    .line 2168
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_59
    :pswitch_8
    if-ne v3, v5, :cond_5a

    .line 2143
    sget-object v3, Ll/᩻ᩴܽ;->۬:Ll/᩻ᩴܽ;

    goto :goto_21

    :cond_5a
    sget-object v3, Ll/᩻ᩴܽ;->᩶:Ll/᩻ᩴܽ;

    :goto_21
    iput-object v3, v0, Ll/ܳᩴܽ;->ۜ:Ll/᩻ᩴܽ;

    const/4 v3, 0x1

    .line 2144
    invoke-direct {v1, v3}, Ll/᩷ᩴܽ;->֫(Z)Ll/ۚۚܽ;

    move-result-object v3

    iput-object v3, v0, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    goto :goto_22

    :cond_5b
    const/4 v3, 0x1

    .line 2183
    iput-boolean v3, v0, Ll/ܳᩴܽ;->֫:Z

    const/4 v3, 0x0

    .line 2184
    invoke-direct {v1, v3}, Ll/᩷ᩴܽ;->֫(Z)Ll/ۚۚܽ;

    move-result-object v3

    iput-object v3, v0, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    .line 2186
    :goto_22
    iget-object v3, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    iput-object v3, v0, Ll/ܳᩴܽ;->᩻:Ll/ۛۚܽ;

    :goto_23
    if-eqz v0, :cond_2f

    .line 1242
    new-instance v3, Ll/ۜᩴܽ;

    iget-object v4, v0, Ll/ܳᩴܽ;->᩻:Ll/ۛۚܽ;

    invoke-direct {v3, v4, v0}, Ll/ۜᩴܽ;-><init>(Ll/ۛۚܽ;Ll/ܳᩴܽ;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto/16 :goto_16

    .line 1282
    :cond_5c
    iget-object v3, v0, Ll/ۜᩴܽ;->᩻:Ll/ۛۚܽ;

    iget-object v4, v0, Ll/ۜᩴܽ;->ܽ:Ll/ۛۚܽ;

    if-nez v3, :cond_5d

    move-object v3, v4

    goto :goto_24

    .line 1286
    :cond_5d
    iget-object v5, v0, Ll/ۜᩴܽ;->ۜ:Ll/ۛۚܽ;

    iput-object v4, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 1287
    iput-object v5, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 1289
    :goto_24
    iget-object v5, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 1290
    iget-object v7, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    if-nez v7, :cond_5e

    .line 1291
    iput-object v3, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    .line 1292
    iput-object v5, v0, Ll/ۜᩴܽ;->ܿ:Ll/ۛۚܽ;

    goto :goto_27

    .line 1294
    :cond_5e
    iget-object v7, v0, Ll/ۜᩴܽ;->ۧ:Ll/᩺֡ܽ;

    if-nez v7, :cond_5f

    .line 1295
    new-instance v7, Ll/᩺֡ܽ;

    invoke-direct {v7}, Ll/᩺֡ܽ;-><init>()V

    iput-object v7, v0, Ll/ۜᩴܽ;->ۧ:Ll/᩺֡ܽ;

    .line 1296
    iput-object v4, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    :cond_5f
    if-ne v3, v4, :cond_60

    const/4 v3, 0x0

    goto :goto_25

    .line 1301
    :cond_60
    iget-object v7, v0, Ll/ۜᩴܽ;->ۧ:Ll/᩺֡ܽ;

    iput-object v7, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 1303
    :goto_25
    iget-object v5, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    iget-object v7, v0, Ll/ۜᩴܽ;->֫:Ll/ۨ֡ܽ;

    if-ne v5, v7, :cond_62

    .line 1982
    iget v4, v7, Ll/ۨ֡ܽ;->ܿ:I

    iget-object v5, v7, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    array-length v8, v5

    if-lt v4, v8, :cond_61

    .line 1983
    array-length v4, v5

    mul-int/lit8 v4, v4, 0x2

    new-array v4, v4, [Ll/ۛۚܽ;

    .line 1984
    array-length v8, v5

    const/4 v9, 0x0

    invoke-static {v5, v9, v4, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1985
    iput-object v4, v7, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    .line 1987
    :cond_61
    iget-object v4, v7, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    iget v5, v7, Ll/ۨ֡ܽ;->ܿ:I

    add-int/lit8 v8, v5, 0x1

    iput v8, v7, Ll/ۨ֡ܽ;->ܿ:I

    aput-object v3, v4, v5

    goto :goto_27

    :cond_62
    if-ne v5, v4, :cond_63

    const/4 v4, 0x0

    .line 1307
    iput-object v4, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    goto :goto_26

    .line 1309
    :cond_63
    iget-object v4, v0, Ll/ۜᩴܽ;->ܿ:Ll/ۛۚܽ;

    iget-object v5, v0, Ll/ۜᩴܽ;->ۧ:Ll/᩺֡ܽ;

    iput-object v5, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 1311
    :goto_26
    new-instance v4, Ll/ۨ֡ܽ;

    iget-object v5, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    iget-object v7, v0, Ll/ۜᩴܽ;->ۧ:Ll/᩺֡ܽ;

    invoke-direct {v4, v5, v3, v7}, Ll/ۨ֡ܽ;-><init>(Ll/ۛۚܽ;Ll/ۛۚܽ;Ll/ۛۚܽ;)V

    iput-object v4, v0, Ll/ۜᩴܽ;->֫:Ll/ۨ֡ܽ;

    iput-object v4, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    :goto_27
    const/4 v3, 0x0

    .line 1314
    iput-object v3, v0, Ll/ۜᩴܽ;->ۜ:Ll/ۛۚܽ;

    iput-object v3, v0, Ll/ۜᩴܽ;->᩻:Ll/ۛۚܽ;

    .line 1246
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v3

    if-ne v3, v6, :cond_64

    .line 1247
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ᩳ()I

    goto/16 :goto_16

    .line 1250
    :cond_64
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 1251
    iget-object v3, v0, Ll/ۜᩴܽ;->֫:Ll/ۨ֡ܽ;

    if-eqz v3, :cond_65

    invoke-virtual {v3}, Ll/ۨ֡ܽ;->֫()V

    .line 1252
    :cond_65
    iget-object v3, v0, Ll/ۜᩴܽ;->ܳ:Ll/ܳᩴܽ;

    if-nez v3, :cond_76

    iget-object v0, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    .line 924
    iput-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    .line 926
    iget v0, v1, Ll/᩷ᩴܽ;->֡:I

    iget v2, v1, Ll/᩷ᩴܽ;->ܽ:I

    if-eq v0, v2, :cond_68

    .line 927
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v0

    const/16 v2, 0x29

    if-eq v0, v2, :cond_67

    .line 929
    iget v0, v1, Ll/᩷ᩴܽ;->ܽ:I

    iget v2, v1, Ll/᩷ᩴܽ;->֡:I

    add-int/lit8 v3, v2, 0x1

    if-ne v0, v3, :cond_66

    iget-object v0, v1, Ll/᩷ᩴܽ;->ܶ:[I

    add-int/lit8 v2, v2, -0x1

    aget v0, v0, v2

    const/16 v2, 0x5c

    if-ne v0, v2, :cond_66

    const-string v0, "Unescaped trailing backslash"

    .line 930
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_66
    const-string v0, "Unexpected internal error"

    .line 932
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_67
    const-string v0, "Unmatched closing \')\'"

    .line 928
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    .line 937
    :cond_68
    :goto_28
    iget v0, v1, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_69

    const/4 v0, 0x1

    goto :goto_29

    :cond_69
    const/4 v0, 0x0

    :goto_29
    if-nez v0, :cond_6a

    .line 940
    iget-object v2, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    instance-of v3, v2, Ll/ۢ֨ܽ;

    if-eqz v3, :cond_6a

    .line 941
    invoke-static {v2}, Ll/۫֡ܽ;->֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;

    move-result-object v0

    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 942
    iget-object v2, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    if-ne v0, v2, :cond_6f

    .line 943
    iget-boolean v0, v1, Ll/᩷ᩴܽ;->᩷:Z

    invoke-static {v2, v0}, Ll/᩷ᩴܽ;->֫(Ll/ۛۚܽ;Z)Ll/֡֨ܽ;

    move-result-object v0

    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto :goto_2b

    .line 945
    :cond_6a
    iget-object v2, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    instance-of v3, v2, Ll/ۚ֡ܽ;

    if-nez v3, :cond_6d

    instance-of v3, v2, Ll/ۘۚܽ;

    if-eqz v3, :cond_6b

    goto :goto_2a

    :cond_6b
    if-eqz v0, :cond_6c

    .line 952
    new-instance v0, Ll/ᩳ۠ܽ;

    invoke-direct {v0, v2}, Ll/ᩳ۠ܽ;-><init>(Ll/ۛۚܽ;)V

    iput-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    .line 954
    :cond_6c
    iget-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    iget-boolean v2, v1, Ll/᩷ᩴܽ;->᩷:Z

    invoke-static {v0, v2}, Ll/᩷ᩴܽ;->֫(Ll/ۛۚܽ;Z)Ll/֡֨ܽ;

    move-result-object v0

    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto :goto_2b

    :cond_6d
    :goto_2a
    if-eqz v0, :cond_6e

    .line 947
    new-instance v0, Ll/ᩳ۠ܽ;

    invoke-direct {v0, v2}, Ll/ᩳ۠ܽ;-><init>(Ll/ۛۚܽ;)V

    iput-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    .line 949
    :cond_6e
    iget-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 957
    :cond_6f
    :goto_2b
    iget-boolean v0, v1, Ll/᩷ᩴܽ;->ۜ:Z

    if-nez v0, :cond_71

    iget-boolean v0, v1, Ll/᩷ᩴܽ;->ܳ:Z

    if-eqz v0, :cond_70

    goto :goto_2c

    .line 959
    :cond_70
    iget-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    invoke-static {v0}, Ll/ܳ۠ܽ;->ᩳ(Ll/ۛۚܽ;)Ll/۟ۘܽ;

    move-result-object v0

    goto :goto_2d

    .line 958
    :cond_71
    :goto_2c
    sget-object v0, Ll/۟ۘܽ;->ۜ:Ll/۟ۘܽ;

    .line 959
    :goto_2d
    iput-object v0, v1, Ll/᩷ᩴܽ;->۠:Ll/۟ۘܽ;

    .line 960
    iget-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    invoke-static {v0}, Ll/ۗۚܽ;->֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;

    move-result-object v0

    iput-object v0, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    .line 966
    iget-boolean v0, v1, Ll/᩷ᩴܽ;->᩻:Z

    if-nez v0, :cond_73

    .line 967
    iget-object v0, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_72
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_73

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۚܽ;

    .line 968
    instance-of v3, v2, Ll/۬ۚܽ;

    if-eqz v3, :cond_72

    .line 970
    check-cast v2, Ll/۬ۚܽ;

    iget v3, v1, Ll/᩷ᩴܽ;->ۡ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v1, Ll/᩷ᩴܽ;->ۡ:I

    iput v3, v2, Ll/۬ۚܽ;->᩻:I

    goto :goto_2e

    :cond_73
    const/4 v0, 0x0

    .line 976
    iput-object v0, v1, Ll/᩷ᩴܽ;->ܶ:[I

    .line 977
    iput-object v0, v1, Ll/᩷ᩴܽ;->֫:[I

    .line 978
    iput-object v0, v1, Ll/᩷ᩴܽ;->ܿ:[Ll/ۚۚܽ;

    const/4 v2, 0x0

    .line 979
    iput v2, v1, Ll/᩷ᩴܽ;->֡:I

    .line 980
    iput-object v0, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    .line 164
    :goto_2f
    new-instance v0, Ll/֫֡ܽ;

    iget-object v4, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    iget-object v5, v1, Ll/᩷ᩴܽ;->ۖ:Ll/ۛۚܽ;

    iget v6, v1, Ll/᩷ᩴܽ;->ᩳ:I

    iget v7, v1, Ll/᩷ᩴܽ;->ۧ:I

    iget v8, v1, Ll/᩷ᩴܽ;->ۢ:I

    iget v9, v1, Ll/᩷ᩴܽ;->ۡ:I

    iget-object v10, v1, Ll/᩷ᩴܽ;->۠:Ll/۟ۘܽ;

    iget-boolean v2, v1, Ll/᩷ᩴܽ;->ۜ:Z

    if-nez v2, :cond_75

    iget-boolean v2, v1, Ll/᩷ᩴܽ;->ܳ:Z

    if-eqz v2, :cond_74

    goto :goto_30

    :cond_74
    const/4 v2, 0x0

    const/4 v11, 0x0

    goto :goto_31

    :cond_75
    :goto_30
    const/4 v2, 0x1

    const/4 v11, 0x1

    :goto_31
    iget-object v12, v1, Ll/᩷ᩴܽ;->ܺ:Ljava/util/BitSet;

    .line 167
    invoke-virtual {v1}, Ll/᩷ᩴܽ;->֫()Ljava/util/Map;

    move-result-object v13

    new-instance v14, Ll/۠ۜܳ;

    const/4 v1, 0x1

    invoke-direct {v14, v1}, Ll/۠ۜܳ;-><init>(I)V

    move-object v3, v0

    invoke-direct/range {v3 .. v14}, Ll/֫֡ܽ;-><init>(Ll/ۛۚܽ;Ll/ۛۚܽ;IIIILl/۟ۘܽ;ZLjava/util/BitSet;Ljava/util/Map;Ll/۠ۜܳ;)V

    return-object v0

    .line 1253
    :cond_76
    iget-object v0, v0, Ll/ۜᩴܽ;->ᩳ:Ll/ۛۚܽ;

    .line 2192
    iget-object v4, v3, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    .line 2193
    iget-object v5, v3, Ll/ܳᩴܽ;->᩻:Ll/ۛۚܽ;

    .line 2194
    iget v6, v3, Ll/ܳᩴܽ;->ۧ:I

    .line 2195
    iget-boolean v14, v3, Ll/ܳᩴܽ;->֫:Z

    .line 2196
    iput-object v0, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 2197
    iget-object v7, v3, Ll/ܳᩴܽ;->ۜ:Ll/᩻ᩴܽ;

    sget-object v8, Ll/᩻ᩴܽ;->ۗ:Ll/᩻ᩴܽ;

    if-ne v7, v8, :cond_78

    if-eqz v14, :cond_78

    instance-of v0, v0, Ll/᩶֡ܽ;

    if-eqz v0, :cond_78

    .line 2199
    new-instance v0, Ll/۬֡ܽ;

    .line 2048
    iget v7, v4, Ll/ۚۚܽ;->ۧ:I

    invoke-direct {v0, v7}, Ll/ۚۚܽ;-><init>(I)V

    .line 2049
    iget-object v7, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    iput-object v7, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 2050
    iget-object v4, v4, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    iput-object v4, v0, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    .line 2200
    iput-object v0, v3, Ll/ܳᩴܽ;->ܿ:Ll/ۚۚܽ;

    .line 2201
    move-object v4, v5

    check-cast v4, Ll/֨ۚܽ;

    iget v4, v4, Ll/֨ۚܽ;->ۧ:I

    div-int/lit8 v4, v4, 0x2

    .line 2202
    iget-object v7, v1, Ll/᩷ᩴܽ;->ܿ:[Ll/ۚۚܽ;

    array-length v8, v7

    if-ge v4, v8, :cond_77

    aput-object v0, v7, v4

    :cond_77
    move-object v4, v0

    .line 2204
    :cond_78
    iget-object v0, v3, Ll/ܳᩴܽ;->ۜ:Ll/᩻ᩴܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v7, 0x1

    if-eq v0, v7, :cond_84

    const/4 v7, 0x2

    if-eq v0, v7, :cond_83

    const/4 v7, 0x3

    if-eq v0, v7, :cond_82

    const/4 v7, 0x4

    if-eq v0, v7, :cond_79

    const/4 v7, 0x5

    if-eq v0, v7, :cond_79

    goto/16 :goto_37

    .line 2209
    :cond_79
    iget v0, v3, Ll/ܳᩴܽ;->ܽ:I

    iget v7, v1, Ll/᩷ᩴܽ;->ۧ:I

    if-ge v0, v7, :cond_7b

    .line 2210
    iget-object v0, v1, Ll/᩷ᩴܽ;->ܺ:Ljava/util/BitSet;

    if-nez v0, :cond_7a

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, v1, Ll/᩷ᩴܽ;->ܺ:Ljava/util/BitSet;

    .line 2212
    :cond_7a
    iget-object v0, v1, Ll/᩷ᩴܽ;->ܺ:Ljava/util/BitSet;

    iget v7, v3, Ll/ܳᩴܽ;->ܽ:I

    iget v8, v1, Ll/᩷ᩴܽ;->ۧ:I

    invoke-virtual {v0, v7, v8}, Ljava/util/BitSet;->set(II)V

    .line 2214
    :cond_7b
    sget-object v0, Ll/᩶ۚܽ;->ۧ:Ll/᩶ۚܽ;

    iput-object v0, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 2215
    new-instance v0, Ll/۬֨ܽ;

    invoke-direct {v0}, Ll/۬֨ܽ;-><init>()V

    .line 2216
    invoke-virtual {v4, v0}, Ll/ۛۚܽ;->֫(Ll/۬֨ܽ;)Z

    .line 2217
    iget-boolean v5, v0, Ll/۬֨ܽ;->ܽ:Z

    if-eqz v5, :cond_81

    .line 2220
    iget v5, v3, Ll/ܳᩴܽ;->ܳ:I

    iget v7, v1, Ll/᩷ᩴܽ;->֡:I

    :goto_32
    if-ge v5, v7, :cond_7d

    .line 1222
    iget-object v8, v1, Ll/᩷ᩴܽ;->ܶ:[I

    aget v8, v8, v5

    invoke-static {v8}, Ll/ܳ۠ܽ;->ۧ(I)Z

    move-result v8

    if-eqz v8, :cond_7c

    const/4 v5, 0x1

    goto :goto_33

    :cond_7c
    add-int/lit8 v5, v5, 0x1

    goto :goto_32

    :cond_7d
    const/4 v5, 0x0

    .line 2221
    :goto_33
    iget-object v7, v3, Ll/ܳᩴܽ;->ۜ:Ll/᩻ᩴܽ;

    sget-object v8, Ll/᩻ᩴܽ;->۫:Ll/᩻ᩴܽ;

    if-ne v7, v8, :cond_7f

    if-eqz v5, :cond_7e

    .line 2222
    new-instance v5, Ll/۠֡ܽ;

    iget v7, v0, Ll/۬֨ܽ;->ۧ:I

    iget v0, v0, Ll/۬֨ܽ;->ᩳ:I

    .line 2196
    invoke-direct {v5, v7, v0, v4}, Ll/֨֡ܽ;-><init>(IILl/ۛۚܽ;)V

    goto :goto_34

    .line 2223
    :cond_7e
    new-instance v5, Ll/֨֡ܽ;

    iget v7, v0, Ll/۬֨ܽ;->ۧ:I

    iget v0, v0, Ll/۬֨ܽ;->ᩳ:I

    invoke-direct {v5, v7, v0, v4}, Ll/֨֡ܽ;-><init>(IILl/ۛۚܽ;)V

    goto :goto_34

    :cond_7f
    if-eqz v5, :cond_80

    .line 2225
    new-instance v5, Ll/᩺ۚܽ;

    iget v7, v0, Ll/۬֨ܽ;->ۧ:I

    iget v0, v0, Ll/۬֨ܽ;->ᩳ:I

    .line 2205
    invoke-direct {v5, v7, v0, v4}, Ll/֨֡ܽ;-><init>(IILl/ۛۚܽ;)V

    goto :goto_34

    .line 2226
    :cond_80
    new-instance v5, Ll/ۨۚܽ;

    iget v7, v0, Ll/۬֨ܽ;->ۧ:I

    iget v0, v0, Ll/۬֨ܽ;->ᩳ:I

    .line 2205
    invoke-direct {v5, v7, v0, v4}, Ll/֨֡ܽ;-><init>(IILl/ۛۚܽ;)V

    .line 2228
    :goto_34
    iget-object v0, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_85

    .line 2229
    iget-object v0, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v0, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_36

    :cond_81
    const-string v0, "Look-behind group does not have an obvious maximum length"

    .line 2218
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    .line 2207
    :cond_82
    new-instance v0, Ll/ۧ֨ܽ;

    sget-object v5, Ll/֫֨ܽ;->᩶:Ll/֫֨ܽ;

    invoke-direct {v0, v4, v5}, Ll/ۧ֨ܽ;-><init>(Ll/ۛۚܽ;Ll/֫֨ܽ;)V

    goto :goto_35

    .line 2206
    :cond_83
    new-instance v0, Ll/ۤۚܽ;

    invoke-direct {v0, v4}, Ll/ۤۚܽ;-><init>(Ll/ۛۚܽ;)V

    goto :goto_35

    .line 2205
    :cond_84
    new-instance v0, Ll/ܰۚܽ;

    invoke-direct {v0, v4}, Ll/ܰۚܽ;-><init>(Ll/ۛۚܽ;)V

    :goto_35
    move-object v5, v0

    :cond_85
    :goto_36
    move-object v4, v5

    .line 1056
    :goto_37
    iget-object v0, v1, Ll/᩷ᩴܽ;->ܶ:[I

    iget v7, v1, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v1, Ll/᩷ᩴܽ;->ܽ:I

    aget v0, v0, v7

    const/4 v7, 0x4

    .line 1057
    invoke-direct {v1, v7}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v7

    if-eqz v7, :cond_86

    .line 1058
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(I)I

    move-result v0

    :cond_86
    const/16 v7, 0x29

    if-ne v7, v0, :cond_94

    .line 2235
    iget v0, v3, Ll/ܳᩴܽ;->ᩳ:I

    iput v0, v1, Ll/᩷ᩴܽ;->ᩳ:I

    .line 2238
    invoke-direct {v1, v4}, Ll/᩷ᩴܽ;->֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;

    move-result-object v0

    if-ne v0, v4, :cond_88

    .line 2240
    iget-object v3, v3, Ll/ܳᩴܽ;->ۜ:Ll/᩻ᩴܽ;

    sget-object v6, Ll/᩻ᩴܽ;->ۗ:Ll/᩻ᩴܽ;

    if-ne v3, v6, :cond_87

    if-nez v14, :cond_87

    .line 2242
    check-cast v4, Ll/ۚۚܽ;

    const/4 v3, 0x0

    iput-boolean v3, v4, Ll/ۚۚܽ;->ܽ:Z

    .line 2243
    move-object v4, v5

    check-cast v4, Ll/֨ۚܽ;

    iput-boolean v3, v4, Ll/֨ۚܽ;->ᩳ:Z

    .line 2245
    :cond_87
    iput-object v5, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto/16 :goto_3a

    :cond_88
    if-ne v4, v5, :cond_89

    .line 2249
    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto/16 :goto_3a

    .line 2255
    :cond_89
    iget-object v3, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v6, v3, :cond_8a

    .line 2256
    iget-object v3, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v3, v6, v7}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 2258
    :cond_8a
    instance-of v3, v0, Ll/ۧ֨ܽ;

    if-eqz v3, :cond_8d

    move-object v3, v0

    check-cast v3, Ll/ۧ֨ܽ;

    iget-object v3, v3, Ll/ۧ֨ܽ;->ܽ:Ll/֫֨ܽ;

    .line 2259
    sget-object v6, Ll/֫֨ܽ;->ۗ:Ll/֫֨ܽ;

    if-ne v3, v6, :cond_8b

    .line 2260
    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto/16 :goto_3a

    .line 2263
    :cond_8b
    new-instance v0, Ll/᩺֡ܽ;

    invoke-direct {v0}, Ll/᩺֡ܽ;-><init>()V

    iput-object v0, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 2265
    sget-object v5, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-ne v3, v5, :cond_8c

    .line 2266
    new-instance v3, Ll/ۨ֡ܽ;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5, v0}, Ll/ۨ֡ܽ;-><init>(Ll/ۛۚܽ;Ll/ۛۚܽ;Ll/ۛۚܽ;)V

    goto :goto_38

    :cond_8c
    const/4 v3, 0x0

    .line 2268
    new-instance v5, Ll/ۨ֡ܽ;

    invoke-direct {v5, v3, v4, v0}, Ll/ۨ֡ܽ;-><init>(Ll/ۛۚܽ;Ll/ۛۚܽ;Ll/ۛۚܽ;)V

    move-object v3, v5

    .line 2270
    :goto_38
    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    move-object v0, v3

    goto :goto_3a

    .line 2272
    :cond_8d
    instance-of v3, v0, Ll/᩷ۚܽ;

    if-eqz v3, :cond_93

    move-object v3, v0

    check-cast v3, Ll/᩷ۚܽ;

    iget v6, v3, Ll/᩷ۚܽ;->ܽ:I

    iget-object v7, v3, Ll/᩷ۚܽ;->ܿ:Ll/֫֨ܽ;

    .line 2273
    sget-object v8, Ll/֫֨ܽ;->ۗ:Ll/֫֨ܽ;

    if-ne v7, v8, :cond_8e

    .line 2274
    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto :goto_3a

    .line 2278
    :cond_8e
    new-instance v0, Ll/۬֨ܽ;

    invoke-direct {v0}, Ll/۬֨ܽ;-><init>()V

    .line 2279
    invoke-virtual {v4, v0}, Ll/ۛۚܽ;->֫(Ll/۬֨ܽ;)Z

    move-result v0

    if-eqz v0, :cond_8f

    .line 2280
    check-cast v5, Ll/֨ۚܽ;

    .line 2281
    new-instance v0, Ll/֡ۚܽ;

    iget-object v8, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    iget v9, v3, Ll/᩷ۚܽ;->ᩳ:I

    iget v10, v3, Ll/᩷ۚܽ;->ܽ:I

    iget-object v11, v3, Ll/᩷ۚܽ;->ܿ:Ll/֫֨ܽ;

    iget v12, v5, Ll/֨ۚܽ;->ܽ:I

    iget v13, v5, Ll/֨ۚܽ;->ۧ:I

    move-object v7, v0

    invoke-direct/range {v7 .. v14}, Ll/֡ۚܽ;-><init>(Ll/ۛۚܽ;IILl/֫֨ܽ;IIZ)V

    iput-object v0, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    goto :goto_3a

    .line 2288
    :cond_8f
    move-object v0, v4

    check-cast v0, Ll/ۚۚܽ;

    iget v0, v0, Ll/ۚۚܽ;->ۧ:I

    .line 2290
    sget-object v8, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-ne v7, v8, :cond_90

    .line 2291
    new-instance v7, Ll/۬ۚܽ;

    iget v8, v1, Ll/᩷ᩴܽ;->ۢ:I

    invoke-direct {v7, v8, v0}, Ll/۬ۚܽ;-><init>(II)V

    const v0, 0x7fffffff

    if-ne v6, v0, :cond_91

    .line 2294
    iget-object v0, v1, Ll/᩷ᩴܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_39

    .line 2296
    :cond_90
    new-instance v7, Ll/᩸ۚܽ;

    iget v8, v1, Ll/᩷ᩴܽ;->ۢ:I

    .line 2103
    invoke-direct {v7, v8, v0}, Ll/۬ۚܽ;-><init>(II)V

    .line 2298
    :cond_91
    :goto_39
    new-instance v0, Ll/۟ۚܽ;

    invoke-direct {v0, v7}, Ll/۟ۚܽ;-><init>(Ll/۬ۚܽ;)V

    .line 2299
    iget v8, v1, Ll/᩷ᩴܽ;->ۢ:I

    add-int/lit8 v8, v8, 0x1

    iput v8, v1, Ll/᩷ᩴܽ;->ۢ:I

    .line 2300
    iget v3, v3, Ll/᩷ۚܽ;->ᩳ:I

    iput v3, v7, Ll/۬ۚܽ;->ܿ:I

    .line 2301
    iput v6, v7, Ll/۬ۚܽ;->ᩳ:I

    .line 2302
    iput-object v4, v7, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    .line 2303
    iput-object v7, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 2304
    iput-object v7, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 1254
    :goto_3a
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜᩴܽ;

    iget-object v4, v1, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 1275
    iget-object v5, v3, Ll/ۜᩴܽ;->᩻:Ll/ۛۚܽ;

    if-nez v5, :cond_92

    iput-object v0, v3, Ll/ۜᩴܽ;->᩻:Ll/ۛۚܽ;

    goto :goto_3b

    .line 1276
    :cond_92
    iget-object v5, v3, Ll/ۜᩴܽ;->ۜ:Ll/ۛۚܽ;

    iput-object v0, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 1277
    :goto_3b
    iput-object v4, v3, Ll/ۜᩴܽ;->ۜ:Ll/ۛۚܽ;

    goto/16 :goto_16

    :cond_93
    const-string v0, "Internal logic error"

    .line 2308
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_94
    const-string v0, "Unclosed group"

    .line 1060
    invoke-direct {v1, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    .line 1406
    :cond_95
    :goto_3c
    invoke-direct {v1}, Ll/᩷ᩴܽ;->ۧ()Ll/ۛۚܽ;

    move-result-object v5

    .line 1410
    :goto_3d
    invoke-direct {v1, v5}, Ll/᩷ᩴܽ;->֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;

    move-result-object v5

    if-nez v3, :cond_96

    move-object v3, v5

    goto :goto_3e

    .line 1420
    :cond_96
    iput-object v5, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    :goto_3e
    move-object v4, v5

    goto/16 :goto_17

    nop

    :pswitch_data_0
    .packed-switch 0x28
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x5b
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3c
        :pswitch_7
        :pswitch_8
        :pswitch_6
    .end packed-switch
.end method

.method private ֫(IZ[I)Ll/ۖ֨ܽ;
    .locals 3

    .line 2669
    new-array v0, p1, [I

    const/4 v1, 0x2

    .line 2670
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    const/16 v1, 0x40

    .line 2671
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    if-ge v2, p1, :cond_0

    .line 2673
    aget v1, p3, v2

    invoke-static {v1}, Ll/ۗᩳۘ;->ۧ(I)I

    move-result v1

    aput v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 2675
    new-instance p1, Ll/᩵֨ܽ;

    invoke-direct {p1, v0}, Ll/᩵֨ܽ;-><init>([I)V

    return-object p1

    :cond_1
    new-instance p1, Ll/ᩴ֨ܽ;

    invoke-direct {p1, v0}, Ll/ᩴ֨ܽ;-><init>([I)V

    return-object p1

    :cond_2
    :goto_1
    if-ge v2, p1, :cond_3

    .line 2678
    aget v1, p3, v2

    invoke-static {v1}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v1

    aput v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_4

    .line 2680
    new-instance p1, Ll/ܺ֨ܽ;

    invoke-direct {p1, v0}, Ll/ܺ֨ܽ;-><init>([I)V

    return-object p1

    :cond_4
    new-instance p1, Ll/ۡ֨ܽ;

    invoke-direct {p1, v0}, Ll/ۡ֨ܽ;-><init>([I)V

    return-object p1

    :cond_5
    :goto_2
    if-ge v2, p1, :cond_6

    .line 2683
    aget v1, p3, v2

    aput v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    if-eqz p2, :cond_7

    .line 2685
    new-instance p1, Ll/ۘ֨ܽ;

    invoke-direct {p1, v0}, Ll/ۘ֨ܽ;-><init>([I)V

    return-object p1

    :cond_7
    new-instance p1, Ll/ۢ֨ܽ;

    invoke-direct {p1, v0}, Ll/ۢ֨ܽ;-><init>([I)V

    return-object p1
.end method

.method private ֫(Z)Ll/ۚۚܽ;
    .locals 4

    .line 2317
    iget v0, p0, Ll/᩷ᩴܽ;->ۢ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩷ᩴܽ;->ۢ:I

    if-nez p1, :cond_0

    .line 2320
    iget v1, p0, Ll/᩷ᩴܽ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩷ᩴܽ;->ۧ:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 2321
    :goto_0
    new-instance v2, Ll/ۚۚܽ;

    invoke-direct {v2, v0}, Ll/ۚۚܽ;-><init>(I)V

    .line 2322
    new-instance v3, Ll/֨ۚܽ;

    invoke-direct {v3, v0, v1}, Ll/֨ۚܽ;-><init>(II)V

    iput-object v3, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    .line 2325
    iput-object v3, v2, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    if-nez p1, :cond_1

    const/16 p1, 0xa

    if-ge v1, p1, :cond_1

    .line 2328
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܿ:[Ll/ۚۚܽ;

    aput-object v2, p1, v1

    :cond_1
    return-object v2
.end method

.method private ֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;
    .locals 13

    .line 2450
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v0

    const/16 v1, 0x2a

    const/4 v2, 0x0

    if-eq v0, v1, :cond_f

    const/16 v1, 0x2b

    const/4 v3, 0x1

    if-eq v0, v1, :cond_e

    const/16 v1, 0x3f

    if-eq v0, v1, :cond_d

    const/16 v1, 0x7b

    if-eq v0, v1, :cond_0

    return-object p1

    .line 2459
    :cond_0
    invoke-direct {p0}, Ll/᩷ᩴܽ;->᩷()I

    move-result v0

    .line 2460
    invoke-static {v0}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, 0x0

    :goto_0
    int-to-long v4, v1

    const/16 v1, 0xa

    int-to-long v6, v1

    mul-long v4, v4, v6

    long-to-int v1, v4

    int-to-long v8, v1

    const-string v1, "Illegal repetition range"

    cmp-long v10, v4, v8

    if-nez v10, :cond_b

    add-int/lit8 v0, v0, -0x30

    int-to-long v4, v0

    add-long/2addr v8, v4

    long-to-int v0, v8

    int-to-long v4, v0

    cmp-long v10, v8, v4

    if-nez v10, :cond_a

    .line 2466
    :try_start_0
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v4

    invoke-static {v4}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v5

    if-nez v5, :cond_9

    const/16 v5, 0x2c

    const/16 v8, 0x7d

    if-ne v4, v5, :cond_4

    .line 2468
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v4

    if-ne v4, v8, :cond_1

    .line 2470
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    .line 2471
    invoke-direct {p0, p1, v0}, Ll/᩷ᩴܽ;->֫(Ll/ۛۚܽ;I)Ll/ۛۚܽ;

    move-result-object p1

    return-object p1

    .line 2474
    :cond_1
    :goto_1
    invoke-static {v4}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_5

    int-to-long v9, v2

    mul-long v9, v9, v6

    long-to-int v2, v9

    int-to-long v11, v2

    cmp-long v2, v9, v11

    if-nez v2, :cond_3

    add-int/lit8 v4, v4, -0x30

    int-to-long v4, v4

    add-long/2addr v11, v4

    long-to-int v2, v11

    int-to-long v4, v2

    cmp-long v9, v11, v4

    if-nez v9, :cond_2

    .line 2477
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v4

    goto :goto_1

    .line 0
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    move v2, v0

    :cond_5
    if-ne v4, v8, :cond_8

    if-lt v2, v0, :cond_7

    .line 2490
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    if-nez v0, :cond_6

    if-ne v2, v3, :cond_6

    .line 2492
    new-instance v0, Ll/ۧ֨ܽ;

    invoke-direct {p0}, Ll/᩷ᩴܽ;->᩻()Ll/֫֨ܽ;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۧ֨ܽ;-><init>(Ll/ۛۚܽ;Ll/֫֨ܽ;)V

    return-object v0

    .line 2493
    :cond_6
    new-instance v1, Ll/᩷ۚܽ;

    invoke-direct {p0}, Ll/᩷ᩴܽ;->᩻()Ll/֫֨ܽ;

    move-result-object v3

    invoke-direct {v1, p1, v0, v2, v3}, Ll/᩷ۚܽ;-><init>(Ll/ۛۚܽ;IILl/֫֨ܽ;)V

    return-object v1

    .line 2489
    :cond_7
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_8
    const-string p1, "Unclosed counted closure"

    .line 2487
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_9
    move v1, v0

    move v0, v4

    goto/16 :goto_0

    .line 0
    :cond_a
    :try_start_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_0

    .line 2484
    :catch_0
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_c
    const-string p1, "Illegal repetition"

    .line 2495
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    .line 2453
    :cond_d
    new-instance v0, Ll/ۧ֨ܽ;

    invoke-direct {p0}, Ll/᩷ᩴܽ;->᩻()Ll/֫֨ܽ;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۧ֨ܽ;-><init>(Ll/ۛۚܽ;Ll/֫֨ܽ;)V

    return-object v0

    .line 2457
    :cond_e
    invoke-direct {p0, p1, v3}, Ll/᩷ᩴܽ;->֫(Ll/ۛۚܽ;I)Ll/ۛۚܽ;

    move-result-object p1

    return-object p1

    .line 2455
    :cond_f
    invoke-direct {p0, p1, v2}, Ll/᩷ᩴܽ;->֫(Ll/ۛۚܽ;I)Ll/ۛۚܽ;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Ll/ۛۚܽ;I)Ll/ۛۚܽ;
    .locals 3

    .line 2427
    invoke-direct {p0}, Ll/᩷ᩴܽ;->᩻()Ll/֫֨ܽ;

    move-result-object v0

    .line 2428
    sget-object v1, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    if-ne v0, v1, :cond_4

    .line 2429
    instance-of v1, p1, Ll/᩶֡ܽ;

    if-eqz v1, :cond_0

    .line 2430
    new-instance v0, Ll/ۙ֡ܽ;

    check-cast p1, Ll/᩶֡ܽ;

    .line 1900
    invoke-direct {v0, p1, p2}, Ll/ۜۚܽ;-><init>(Ll/᩻ۚܽ;I)V

    return-object v0

    .line 2431
    :cond_0
    instance-of v1, p1, Ll/ۖ֡ܽ;

    if-eqz v1, :cond_1

    .line 2432
    new-instance p1, Ll/ۘ֡ܽ;

    invoke-direct {p1, p2}, Ll/ۘ֡ܽ;-><init>(I)V

    return-object p1

    .line 2433
    :cond_1
    instance-of v1, p1, Ll/ۧ۠ܽ;

    if-eqz v1, :cond_2

    .line 2434
    new-instance p1, Ll/ܽ۠ܽ;

    invoke-direct {p1, p2}, Ll/ܽ۠ܽ;-><init>(I)V

    return-object p1

    .line 2435
    :cond_2
    instance-of v1, p1, Ll/ۡۚܽ;

    if-eqz v1, :cond_3

    .line 2436
    new-instance p1, Ll/ܺۚܽ;

    invoke-direct {p1, p2}, Ll/ܺۚܽ;-><init>(I)V

    return-object p1

    .line 2437
    :cond_3
    instance-of v1, p1, Ll/᩻ۚܽ;

    if-eqz v1, :cond_4

    .line 2438
    new-instance v0, Ll/ۜۚܽ;

    check-cast p1, Ll/᩻ۚܽ;

    invoke-direct {v0, p1, p2}, Ll/ۜۚܽ;-><init>(Ll/᩻ۚܽ;I)V

    return-object v0

    .line 2441
    :cond_4
    new-instance v1, Ll/᩷ۚܽ;

    const v2, 0x7fffffff

    invoke-direct {v1, p1, p2, v2, v0}, Ll/᩷ۚܽ;-><init>(Ll/ۛۚܽ;IILl/֫֨ܽ;)V

    return-object v1
.end method

.method private ֫(ZZ)Ll/ۧۚܽ;
    .locals 6

    .line 2003
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    .line 2008
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v2

    .line 2009
    invoke-static {p1}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z

    move-result v2

    if-nez v2, :cond_0

    int-to-char p1, p1

    .line 2010
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 2012
    :cond_0
    new-instance p1, Ljava/lang/String;

    iget-object v2, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v3, p0, Ll/᩷ᩴܽ;->ܽ:I

    invoke-direct {p1, v2, v3, v1}, Ljava/lang/String;-><init>([III)V

    .line 2014
    :goto_0
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    goto :goto_2

    .line 2016
    :cond_1
    iget p1, p0, Ll/᩷ᩴܽ;->ܽ:I

    .line 1068
    iget-object v2, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v3, p0, Ll/᩷ᩴܽ;->֡:I

    const/16 v4, 0x7d

    aput v4, v2, v3

    .line 2018
    :goto_1
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v2

    if-eq v2, v4, :cond_2

    goto :goto_1

    .line 1068
    :cond_2
    iget-object v2, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v3, p0, Ll/᩷ᩴܽ;->֡:I

    aput v0, v2, v3

    .line 2021
    iget v4, p0, Ll/᩷ᩴܽ;->ܽ:I

    if-gt v4, v3, :cond_14

    add-int/lit8 v3, p1, 0x1

    if-ge v3, v4, :cond_13

    .line 2026
    new-instance v3, Ljava/lang/String;

    sub-int/2addr v4, p1

    sub-int/2addr v4, v1

    invoke-direct {v3, v2, p1, v4}, Ljava/lang/String;-><init>([III)V

    move-object p1, v3

    :goto_2
    const/16 v2, 0x3d

    .line 2029
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eq v2, v3, :cond_a

    add-int/lit8 v3, v2, 0x1

    .line 2032
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 2033
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 2034
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v0, "general_category"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x5

    goto :goto_4

    :sswitch_1
    const-string v0, "block"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    const/4 v0, 0x4

    goto :goto_4

    :sswitch_2
    const-string v0, "blk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x3

    goto :goto_4

    :sswitch_3
    const-string v0, "sc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    const/4 v0, 0x2

    goto :goto_4

    :sswitch_4
    const-string v0, "gc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v0, 0x1

    goto :goto_4

    :sswitch_5
    const-string v2, "script"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :goto_3
    const/4 v0, -0x1

    :cond_8
    :goto_4
    packed-switch v0, :pswitch_data_0

    goto :goto_5

    .line 2041
    :pswitch_0
    sget v0, Ll/ۙ᩵ܽ;->֫:I

    .line 287
    :try_start_0
    invoke-static {v3}, Ljava/lang/Character$UnicodeBlock;->forName(Ljava/lang/String;)Ljava/lang/Character$UnicodeBlock;

    move-result-object v0

    .line 288
    new-instance v2, Ll/֡ᩴܽ;

    invoke-direct {v2, v0}, Ll/֡ᩴܽ;-><init>(Ljava/lang/Character$UnicodeBlock;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v2

    goto :goto_5

    :catch_0
    nop

    goto :goto_5

    .line 2045
    :pswitch_1
    invoke-direct {p0, v4}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    invoke-static {v3, v0}, Ll/ۙ᩵ܽ;->ۧ(Ljava/lang/String;Z)Ll/ۧۚܽ;

    move-result-object v5

    goto :goto_5

    .line 2037
    :pswitch_2
    invoke-static {v3}, Ll/ۙ᩵ܽ;->֫(Ljava/lang/String;)Ll/ۧۚܽ;

    move-result-object v5

    :goto_5
    if-eqz v5, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string p2, ">, value=<"

    const-string v0, ">}"

    const-string v1, "Unknown Unicode property {name=<"

    .line 0
    invoke-static {v1, p1, p2, v3, v0}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2051
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_a
    const-string v0, "In"

    .line 2055
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2057
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    sget v2, Ll/ۙ᩵ܽ;->֫:I

    .line 287
    :try_start_1
    invoke-static {v0}, Ljava/lang/Character$UnicodeBlock;->forName(Ljava/lang/String;)Ljava/lang/Character$UnicodeBlock;

    move-result-object v0

    .line 288
    new-instance v2, Ll/֡ᩴܽ;

    invoke-direct {v2, v0}, Ll/֡ᩴܽ;-><init>(Ljava/lang/Character$UnicodeBlock;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    nop

    goto :goto_7

    :cond_b
    const-string v0, "Is"

    .line 2058
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 2060
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 2061
    invoke-direct {p0, v4}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v2

    invoke-static {v0, v2}, Ll/ۙ᩵ܽ;->ܽ(Ljava/lang/String;Z)Ll/ۧۚܽ;

    move-result-object v2

    if-nez v2, :cond_c

    .line 2063
    invoke-direct {p0, v4}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v2

    invoke-static {v0, v2}, Ll/ۙ᩵ܽ;->ۧ(Ljava/lang/String;Z)Ll/ۧۚܽ;

    move-result-object v2

    :cond_c
    if-nez v2, :cond_d

    .line 2065
    invoke-static {v0}, Ll/ۙ᩵ܽ;->֫(Ljava/lang/String;)Ll/ۧۚܽ;

    move-result-object v0

    move-object v5, v0

    goto :goto_7

    :cond_d
    :goto_6
    move-object v5, v2

    goto :goto_7

    :cond_e
    const/16 v0, 0x100

    .line 2067
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 2068
    invoke-direct {p0, v4}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    invoke-static {p1, v0}, Ll/ۙ᩵ܽ;->֫(Ljava/lang/String;Z)Ll/ۧۚܽ;

    move-result-object v5

    :cond_f
    if-nez v5, :cond_10

    .line 2070
    invoke-direct {p0, v4}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v0

    invoke-static {p1, v0}, Ll/ۙ᩵ܽ;->ۧ(Ljava/lang/String;Z)Ll/ۧۚܽ;

    move-result-object v5

    :cond_10
    :goto_7
    if-eqz v5, :cond_12

    :goto_8
    if-eqz p2, :cond_11

    .line 2079
    iput-boolean v1, p0, Ll/᩷ᩴܽ;->᩷:Z

    .line 2080
    invoke-interface {v5}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object p1

    return-object p1

    :cond_11
    return-object v5

    :cond_12
    const-string p2, "Unknown character property name {"

    const-string v0, "}"

    .line 0
    invoke-static {p2, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2073
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_13
    const-string p1, "Empty character family"

    .line 2025
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    :cond_14
    const-string p1, "Unclosed character family"

    .line 2023
    invoke-direct {p0, p1}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object p1

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x361a2f35 -> :sswitch_5
        0xcdc -> :sswitch_4
        0xe50 -> :sswitch_3
        0x17d61 -> :sswitch_2
        0x597c48d -> :sswitch_1
        0x4b666a75 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2088
    :cond_0
    instance-of v0, p1, Ll/᩹֡ܽ;

    if-eqz v0, :cond_1

    .line 2089
    new-instance v0, Ll/᩶֡ܽ;

    check-cast p1, Ll/᩹֡ܽ;

    .line 1744
    invoke-direct {v0, p1}, Ll/᩻ۚܽ;-><init>(Ll/ۧۚܽ;)V

    return-object v0

    :cond_1
    const/4 v0, 0x1

    .line 2091
    iput-boolean v0, p0, Ll/᩷ᩴܽ;->᩷:Z

    .line 2092
    new-instance v0, Ll/᩻ۚܽ;

    invoke-direct {v0, p1}, Ll/᩻ۚܽ;-><init>(Ll/ۧۚܽ;)V

    return-object v0
.end method

.method public static ֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1

    const/4 v0, 0x0

    .line 545
    invoke-static {p2, p0, p1, p3, v0}, Ll/᩷ᩴܽ;->֫(Ljava/lang/String;IILjava/lang/StringBuilder;Z)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;IILjava/lang/StringBuilder;Z)V
    .locals 11

    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_0

    .line 551
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ll/᩹۠ܽ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-ne v0, p2, :cond_2

    if-eqz p4, :cond_1

    .line 555
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 556
    :cond_1
    invoke-virtual {p3, p0, p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    const/4 v1, -0x1

    add-int/2addr v0, v1

    if-ge v0, p1, :cond_3

    goto :goto_2

    :cond_3
    if-eqz p4, :cond_4

    .line 563
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۨۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 565
    :cond_4
    invoke-virtual {p3, p0, p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :goto_1
    move p1, v0

    :goto_2
    if-ge p1, p2, :cond_f

    .line 567
    invoke-virtual {p0, p1}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    if-nez p4, :cond_5

    const-string v2, ".$|()[]{}^?*+\\"

    .line 568
    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-eq v2, v1, :cond_5

    int-to-char v0, v0

    .line 569
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    .line 58
    invoke-static {p0, p1, p2, v0}, Ll/ۗ۠ܽ;->֫(Ljava/lang/CharSequence;IILl/ۙ۠ܽ;)I

    move-result v0

    .line 575
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 576
    sget-object v1, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    invoke-static {p1, v1}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v1

    .line 578
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->codePointCount(II)I

    move-result v2

    const-string v4, ")"

    const-string v5, "(?:"

    const/4 v6, 0x1

    if-le v2, v6, :cond_b

    .line 579
    invoke-virtual {v1, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    .line 580
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    .line 581
    invoke-static {v2}, Ll/֫᩻᩵;->֫(I)I

    move-result v2

    const/4 v7, 0x6

    if-ne v2, v7, :cond_b

    .line 582
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 583
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 619
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 620
    new-instance v7, Ll/ۧᩴܽ;

    invoke-direct {v7, v1}, Ll/ۧᩴܽ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    :cond_6
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    .line 0
    invoke-static {p1, v6}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 622
    check-cast v1, Ll/ۧᩴܽ;

    .line 623
    iget-object v7, v1, Ll/ۧᩴܽ;->ܽ:[Ljava/lang/String;

    iget-object v8, v1, Ll/ۧᩴܽ;->֫:Ljava/lang/String;

    if-nez v7, :cond_7

    .line 624
    invoke-interface {v2, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 625
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v6

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    .line 626
    :cond_7
    iget v9, v1, Ll/ۧᩴܽ;->ۧ:I

    array-length v7, v7

    if-ne v9, v7, :cond_8

    .line 0
    invoke-static {p1, v6}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_3

    :cond_8
    invoke-static {v8}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 630
    iget-object v8, v1, Ll/ۧᩴܽ;->ܽ:[Ljava/lang/String;

    iget v9, v1, Ll/ۧᩴܽ;->ۧ:I

    add-int/lit8 v10, v9, 0x1

    iput v10, v1, Ll/ۧᩴܽ;->ۧ:I

    aget-object v1, v8, v9

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 631
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x2

    .line 771
    invoke-static {v7, v1}, Ll/᩷ᩴܽ;->ۧ(ILjava/lang/String;)I

    move-result v7

    .line 772
    invoke-virtual {v1, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 773
    sget-object v9, Ljava/text/Normalizer$Form;->NFC:Ljava/text/Normalizer$Form;

    invoke-static {v8, v9}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v9

    .line 774
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/4 v1, 0x0

    goto :goto_4

    .line 777
    :cond_9
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v9, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    if-eqz v1, :cond_6

    .line 634
    new-instance v7, Ll/ۧᩴܽ;

    invoke-direct {v7, v1}, Ll/ۧᩴܽ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 585
    :cond_a
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    new-instance p1, Ll/֫ᩴܽ;

    invoke-direct {p1, p3, p4}, Ll/֫ᩴܽ;-><init>(Ljava/lang/StringBuilder;Z)V

    invoke-static {v2, p1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 587
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    sub-int/2addr p1, v6

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 588
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 592
    :cond_b
    sget-object v2, Ljava/text/Normalizer$Form;->NFC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v2}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v2

    if-eqz p4, :cond_c

    .line 594
    invoke-static {p1}, Ll/ۨۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 595
    invoke-static {v1}, Ll/ۨۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 596
    invoke-static {v2}, Ll/ۨۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 598
    :cond_c
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v6, "|"

    if-nez v3, :cond_d

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 0
    invoke-static {v5, p1, v6, v1, v6}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 599
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 600
    :cond_d
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 0
    invoke-static {v5, p1, v6, v1, v4}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 601
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 603
    :cond_e
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_5
    const/4 v1, -0x1

    goto/16 :goto_1

    :cond_f
    return-void
.end method

.method public static bridge synthetic ֫(II)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ᩴܽ;->ܽ(II)Z

    move-result p0

    return p0
.end method

.method private ֫([I)[I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 792
    iget v2, v0, Ll/᩷ᩴܽ;->֡:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v5, v2, -0x1

    const/16 v6, 0x51

    const/16 v7, 0x5c

    if-ge v4, v5, :cond_1

    .line 795
    iget-object v8, v0, Ll/᩷ᩴܽ;->ܶ:[I

    aget v9, v8, v4

    if-eq v9, v7, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v9, v4, 0x1

    .line 797
    aget v8, v8, v9

    if-eq v8, v6, :cond_1

    add-int/lit8 v4, v4, 0x2

    goto :goto_0

    :cond_1
    if-lt v4, v5, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v5, v4, 0x2

    sub-int v8, v2, v5

    const/4 v9, 0x3

    int-to-long v9, v9

    int-to-long v11, v8

    mul-long v9, v9, v11

    long-to-int v8, v9

    int-to-long v11, v8

    cmp-long v8, v9, v11

    if-nez v8, :cond_13

    int-to-long v8, v5

    add-long/2addr v8, v11

    long-to-int v10, v8

    int-to-long v11, v10

    cmp-long v13, v8, v11

    if-nez v13, :cond_12

    .line 812
    new-array v8, v10, [I

    .line 813
    iget-object v9, v0, Ll/᩷ᩴܽ;->ܶ:[I

    invoke-static {v9, v3, v8, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v9, 0x0

    if-nez v1, :cond_3

    move-object v10, v9

    goto :goto_1

    .line 814
    :cond_3
    new-array v10, v10, [I

    :goto_1
    if-eqz v10, :cond_4

    .line 815
    invoke-static {v1, v3, v10, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    :goto_2
    const/4 v3, 0x1

    const/4 v11, 0x1

    :goto_3
    if-ge v5, v2, :cond_10

    .line 823
    iget-object v12, v0, Ll/᩷ᩴܽ;->ܶ:[I

    add-int/lit8 v13, v5, 0x1

    aget v12, v12, v5

    .line 824
    invoke-static {v12}, Ll/᩹۠ܽ;->֫(I)Z

    move-result v14

    const/4 v15, -0x1

    if-eqz v14, :cond_d

    const/16 v14, 0x300

    .line 214
    invoke-static {v12, v14}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v14

    if-eqz v14, :cond_5

    goto/16 :goto_6

    .line 826
    :cond_5
    invoke-static {v12}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v14

    if-eqz v14, :cond_7

    if-eqz v3, :cond_6

    add-int/lit8 v3, v4, 0x1

    .line 833
    aput v7, v8, v4

    add-int/lit8 v14, v4, 0x2

    const/16 v16, 0x78

    .line 834
    aput v16, v8, v3

    add-int/lit8 v3, v4, 0x3

    const/16 v16, 0x33

    .line 835
    aput v16, v8, v14

    goto :goto_4

    :cond_6
    move v3, v4

    :goto_4
    add-int/lit8 v14, v3, 0x1

    .line 837
    aput v12, v8, v3

    goto :goto_7

    :cond_7
    if-eq v12, v7, :cond_9

    if-eqz v11, :cond_8

    add-int/lit8 v3, v4, 0x1

    .line 839
    aput v7, v8, v4

    goto :goto_5

    :cond_8
    move v3, v4

    :goto_5
    add-int/lit8 v14, v3, 0x1

    .line 840
    aput v12, v8, v3

    goto :goto_7

    :cond_9
    if-eqz v11, :cond_b

    .line 842
    iget-object v3, v0, Ll/᩷ᩴܽ;->ܶ:[I

    aget v3, v3, v13

    const/16 v12, 0x45

    if-ne v3, v12, :cond_a

    add-int/lit8 v3, v5, 0x2

    const/4 v11, 0x0

    move v13, v3

    move v14, v4

    goto :goto_7

    :cond_a
    add-int/lit8 v3, v4, 0x1

    .line 846
    aput v7, v8, v4

    add-int/lit8 v14, v4, 0x2

    .line 847
    aput v7, v8, v3

    goto :goto_7

    .line 850
    :cond_b
    iget-object v3, v0, Ll/᩷ᩴܽ;->ܶ:[I

    aget v14, v3, v13

    if-ne v14, v6, :cond_c

    add-int/lit8 v5, v5, 0x2

    goto :goto_2

    :cond_c
    add-int/lit8 v14, v4, 0x1

    .line 856
    aput v12, v8, v4

    if-eq v13, v2, :cond_e

    add-int/lit8 v12, v4, 0x2

    add-int/lit8 v15, v5, 0x2

    .line 859
    aget v3, v3, v13

    aput v3, v8, v14

    move v14, v12

    move/from16 v17, v15

    move v15, v13

    move/from16 v13, v17

    goto :goto_7

    :cond_d
    :goto_6
    add-int/lit8 v14, v4, 0x1

    .line 825
    aput v12, v8, v4

    :cond_e
    :goto_7
    if-eqz v10, :cond_f

    .line 866
    aget v3, v1, v5

    invoke-static {v10, v4, v14, v3}, Ljava/util/Arrays;->fill([IIII)V

    if-ltz v15, :cond_f

    add-int/lit8 v3, v14, -0x1

    .line 867
    aget v4, v1, v15

    aput v4, v10, v3

    :cond_f
    const/4 v3, 0x0

    move v5, v13

    move v4, v14

    goto/16 :goto_3

    .line 872
    :cond_10
    iput v4, v0, Ll/᩷ᩴܽ;->֡:I

    add-int/lit8 v3, v4, 0x2

    .line 873
    invoke-static {v8, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v5

    iput-object v5, v0, Ll/᩷ᩴܽ;->ܶ:[I

    if-nez v10, :cond_11

    return-object v9

    .line 875
    :cond_11
    invoke-static {v10, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    .line 876
    aget v5, v1, v2

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v2, v2, 0x1

    .line 877
    aget v1, v1, v2

    aput v1, v3, v4

    return-object v3

    .line 0
    :cond_12
    :try_start_0
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_13
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 810
    :catch_0
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Required pattern length too large"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private ۜ()I
    .locals 3

    .line 1085
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget v0, v0, v1

    const/4 v1, 0x4

    .line 1086
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1087
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ܽ(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method private ۡ()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge v0, v2, :cond_1

    .line 2571
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۜ()I

    move-result v2

    const v3, 0x8000

    .line 242
    invoke-static {v2, v3}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_0

    mul-int/lit8 v1, v1, 0x10

    .line 2575
    invoke-static {v2}, Ll/᩹۠ܽ;->ܽ(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "Illegal Unicode escape sequence"

    .line 2573
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_1
    return v1
.end method

.method private ۢ()V
    .locals 1

    .line 1205
    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    return-void
.end method

.method public static ۧ(ILjava/lang/String;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    .line 2618
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 2619
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    .line 2622
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ltz p0, :cond_2

    const/4 v2, 0x0

    :goto_0
    if-ge v0, v1, :cond_2

    if-ge v2, p0, :cond_2

    add-int/lit8 v3, v0, 0x1

    .line 2627
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_1

    if-ge v3, v1, :cond_1

    .line 2628
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method private ۧ()Ll/ۛۚܽ;
    .locals 8

    .line 1436
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-eqz v0, :cond_c

    const/16 v6, 0x24

    if-eq v0, v6, :cond_d

    const/16 v6, 0x2e

    if-eq v0, v6, :cond_d

    const/16 v6, 0x3f

    if-eq v0, v6, :cond_b

    const/16 v6, 0x5e

    if-eq v0, v6, :cond_d

    const/16 v6, 0x5b

    if-eq v0, v6, :cond_d

    const/16 v6, 0x5c

    const/16 v7, 0x7b

    if-eq v0, v6, :cond_0

    if-eq v0, v7, :cond_b

    const/16 v6, 0x7c

    if-eq v0, v6, :cond_d

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_7

    .line 1114
    :cond_0
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/2addr v2, v5

    iput v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget v0, v0, v2

    const/16 v2, 0x70

    const/16 v6, 0x50

    if-eq v0, v2, :cond_6

    if-ne v0, v6, :cond_1

    goto :goto_2

    .line 1476
    :cond_1
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    .line 1477
    iget v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    if-nez v3, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 1478
    :goto_1
    invoke-direct {p0, v1, v0, v1}, Ll/᩷ᩴܽ;->֫(ZZZ)I

    move-result v0

    if-ltz v0, :cond_4

    .line 1480
    invoke-direct {p0, v0, v3}, Ll/᩷ᩴܽ;->ۧ(II)V

    add-int/lit8 v3, v3, 0x1

    .line 1482
    invoke-static {v0}, Ll/ܳ۠ܽ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    const/4 v4, 0x1

    .line 1485
    :cond_3
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v0

    goto :goto_0

    :cond_4
    if-nez v3, :cond_5

    .line 1488
    iget-object v0, p0, Ll/᩷ᩴܽ;->֨:Ll/ۛۚܽ;

    return-object v0

    .line 1491
    :cond_5
    iput v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    goto :goto_4

    :cond_6
    :goto_2
    if-lez v3, :cond_7

    .line 1460
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    goto :goto_4

    :cond_7
    if-ne v0, v6, :cond_8

    const/4 v0, 0x1

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    .line 1465
    :goto_3
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v2

    if-eq v2, v7, :cond_9

    .line 1467
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    const/4 v1, 0x1

    :cond_9
    const/16 v2, 0x80

    .line 1470
    invoke-direct {p0, v2}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0x10

    invoke-direct {p0, v2}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v2

    if-nez v2, :cond_a

    .line 1471
    new-instance v2, Ll/۫ۚܽ;

    invoke-direct {p0, v1, v0}, Ll/᩷ᩴܽ;->֫(ZZ)Ll/ۧۚܽ;

    move-result-object v0

    invoke-direct {v2, v0}, Ll/۫ۚܽ;-><init>(Ll/ۧۚܽ;)V

    return-object v2

    .line 1473
    :cond_a
    invoke-direct {p0, v1, v0}, Ll/᩷ᩴܽ;->֫(ZZ)Ll/ۧۚܽ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object v0

    return-object v0

    :cond_b
    :pswitch_0
    if-le v3, v5, :cond_d

    .line 1444
    iput v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    .line 1494
    :cond_c
    iget v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    iget v6, p0, Ll/᩷ᩴܽ;->֡:I

    if-lt v2, v6, :cond_13

    :cond_d
    :goto_4
    :pswitch_1
    if-ne v3, v5, :cond_12

    .line 1511
    iget-object v0, p0, Ll/᩷ᩴܽ;->֫:[I

    aget v0, v0, v1

    const/4 v1, 0x2

    .line 1978
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_10

    const/16 v1, 0x40

    .line 1980
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 1981
    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v1

    .line 1982
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v2

    if-eq v1, v2, :cond_10

    .line 1985
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2516
    new-instance v0, Ll/ܿ֡ܽ;

    invoke-direct {v0, v2}, Ll/ܿ֡ܽ;-><init>(I)V

    goto :goto_6

    .line 1986
    :cond_e
    invoke-static {v0}, Ll/᩹۠ܽ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 1987
    invoke-static {v0}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result v1

    add-int/lit8 v2, v0, -0x61

    rsub-int/lit8 v3, v0, 0x7a

    or-int/2addr v2, v3

    if-ltz v2, :cond_f

    add-int/lit8 v2, v0, -0x20

    goto :goto_5

    :cond_f
    move v2, v0

    :goto_5
    if-eq v1, v2, :cond_10

    .line 1991
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2509
    new-instance v0, Ll/ۢ֡ܽ;

    invoke-direct {v0, v1, v2}, Ll/ۢ֡ܽ;-><init>(II)V

    goto :goto_6

    .line 1994
    :cond_10
    invoke-static {v0}, Ll/ܳ۠ܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 2466
    new-instance v1, Ll/᩻֡ܽ;

    invoke-direct {v1, v0}, Ll/᩻֡ܽ;-><init>(I)V

    move-object v0, v1

    goto :goto_6

    .line 1996
    :cond_11
    invoke-static {v0}, Ll/ܳ۠ܽ;->֫(I)Ll/᩹֡ܽ;

    move-result-object v0

    .line 1511
    :goto_6
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->֫(Ll/ۧۚܽ;)Ll/᩻ۚܽ;

    move-result-object v0

    return-object v0

    .line 1513
    :cond_12
    iget-object v0, p0, Ll/᩷ᩴܽ;->֫:[I

    invoke-direct {p0, v3, v4, v0}, Ll/᩷ᩴܽ;->֫(IZ[I)Ll/ۖ֨ܽ;

    move-result-object v0

    return-object v0

    .line 1499
    :cond_13
    :goto_7
    iget v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    .line 1500
    invoke-direct {p0, v0, v3}, Ll/᩷ᩴܽ;->ۧ(II)V

    add-int/lit8 v3, v3, 0x1

    .line 1502
    invoke-static {v0}, Ll/ܳ۠ܽ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 v0, 0x1

    const/4 v4, 0x1

    .line 1505
    :cond_14
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v0

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x28
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ۧ(Z)Ll/ܿᩴܽ;
    .locals 3

    .line 1908
    new-instance v0, Ll/ܿᩴܽ;

    iget v1, p0, Ll/᩷ᩴܽ;->ᩳ:I

    invoke-direct {v0, v1, p1}, Ll/ܿᩴܽ;-><init>(IZ)V

    .line 1909
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result p1

    iput p1, v0, Ll/ܿᩴܽ;->ۧ:I

    const/16 v1, 0x5e

    if-ne p1, v1, :cond_0

    .line 1910
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    aget p1, p1, v1

    const/16 v1, 0x5b

    if-ne p1, v1, :cond_0

    .line 1911
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result p1

    iput p1, v0, Ll/ܿᩴܽ;->ۧ:I

    .line 1912
    iput-boolean v2, v0, Ll/ܿᩴܽ;->᩻:Z

    :cond_0
    return-object v0
.end method

.method private ۧ(II)V
    .locals 4

    .line 1518
    iget-object v0, p0, Ll/᩷ᩴܽ;->֫:[I

    array-length v0, v0

    sub-int v1, p2, v0

    if-ltz v1, :cond_3

    add-int/lit8 v1, p2, 0x1

    sub-int/2addr v1, v0

    .line 69
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    const v3, 0x7ffffff7

    if-lez v2, :cond_0

    if-gt v2, v3, :cond_0

    goto :goto_0

    :cond_0
    add-int v2, v0, v1

    if-ltz v2, :cond_2

    if-gt v2, v3, :cond_1

    const v2, 0x7ffffff7

    .line 1523
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩷ᩴܽ;->֫:[I

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/᩷ᩴܽ;->֫:[I

    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Ljava/lang/OutOfMemoryError;

    const-string p2, " + "

    const-string v2, " is too large"

    const-string v3, "Required array length "

    .line 0
    invoke-static {v3, v0, p2, v2, v1}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 81
    invoke-direct {p1, p2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1525
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/᩷ᩴܽ;->֫:[I

    aput p1, v0, p2

    return-void
.end method

.method public static bridge synthetic ۧ(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-static {p2, p0, p1, p3, v0}, Ll/᩷ᩴܽ;->֫(Ljava/lang/String;IILjava/lang/StringBuilder;Z)V

    return-void
.end method

.method private ۧ(I)Z
    .locals 1

    .line 1049
    iget v0, p0, Ll/᩷ᩴܽ;->ᩳ:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ۧ(Ljava/lang/String;)[Ljava/lang/String;
    .locals 15

    .line 663
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, p0}, Ll/᩷ᩴܽ;->ۧ(ILjava/lang/String;)I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 664
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 666
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x2

    invoke-static {v2, p0}, Ll/᩷ᩴܽ;->ۧ(ILjava/lang/String;)I

    move-result v3

    const/4 v4, 0x0

    if-ne v0, v3, :cond_2

    .line 667
    invoke-static {p0, v4}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 668
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    invoke-static {p0, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    .line 760
    invoke-static {v1}, Ll/᩶۠ܽ;->֫(I)I

    move-result v3

    invoke-static {v0}, Ll/᩶۠ܽ;->֫(I)I

    move-result v4

    if-ne v3, v4, :cond_1

    .line 670
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 674
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 675
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 676
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 677
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p0, v0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 2652
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v3, v0, :cond_4

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v6, v3, 0x1

    .line 2656
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_3

    if-ge v6, v0, :cond_3

    .line 2657
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_3

    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_3
    move v3, v6

    goto :goto_0

    :cond_4
    const/16 v0, 0xc

    if-gt v5, v0, :cond_f

    const/4 v0, 0x1

    :goto_1
    if-gt v2, v5, :cond_5

    mul-int v0, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 702
    :cond_5
    new-array v0, v0, [Ljava/lang/String;

    .line 704
    new-array v2, v5, [I

    .line 705
    new-array v3, v5, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_2
    if-ge v6, v5, :cond_6

    .line 707
    invoke-static {p0, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v8

    .line 708
    aput v8, v2, v6

    .line 760
    invoke-static {v8}, Ll/᩶۠ܽ;->֫(I)I

    move-result v9

    .line 709
    aput v9, v3, v6

    .line 710
    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 715
    :cond_6
    new-array v6, v5, [I

    .line 716
    new-array v7, v5, [I

    .line 717
    new-array v8, v5, [Z

    const/4 v9, 0x0

    const/4 v10, 0x0

    :cond_7
    :goto_3
    if-ltz v9, :cond_e

    .line 721
    aget v11, v7, v9

    add-int/lit8 v12, v11, 0x1

    aput v12, v7, v9

    if-ne v11, v5, :cond_8

    .line 723
    aput v4, v7, v9

    add-int/lit8 v9, v9, -0x1

    if-ltz v9, :cond_7

    .line 725
    aget v11, v6, v9

    aput-boolean v4, v8, v11

    goto :goto_3

    .line 729
    :cond_8
    aget-boolean v12, v8, v11

    if-eqz v12, :cond_9

    goto :goto_3

    :cond_9
    const/4 v12, 0x0

    :goto_4
    if-ge v12, v11, :cond_b

    .line 734
    aget-boolean v13, v8, v12

    if-nez v13, :cond_a

    aget v13, v3, v12

    aget v14, v3, v11

    if-ne v13, v14, :cond_a

    goto :goto_3

    :cond_a
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    .line 742
    :cond_b
    aput v11, v6, v9

    add-int/lit8 v12, v5, -0x1

    if-ne v9, v12, :cond_d

    .line 744
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v5, :cond_c

    .line 745
    aget v13, v6, v12

    .line 746
    aget v13, v2, v13

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_c
    add-int/lit8 v12, v10, 0x1

    .line 748
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v0, v10

    move v10, v12

    goto :goto_3

    .line 750
    :cond_d
    aput-boolean v1, v8, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 754
    :cond_e
    new-array p0, v10, [Ljava/lang/String;

    .line 755
    invoke-static {v0, v4, p0, v4, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0

    .line 694
    :cond_f
    new-instance p0, Ljava/lang/OutOfMemoryError;

    const-string v0, "Pattern too complex"

    invoke-direct {p0, v0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ܳ()V
    .locals 6

    .line 985
    iget-object v0, p0, Ll/᩷ᩴܽ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x2

    .line 986
    new-array v1, v1, [I

    iput-object v1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    const/4 v1, 0x0

    .line 987
    iput-boolean v1, p0, Ll/᩷ᩴܽ;->᩷:Z

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 990
    iget-object v3, p0, Ll/᩷ᩴܽ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    .line 991
    invoke-static {v3}, Ll/ܳ۠ܽ;->ۧ(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    iput-boolean v4, p0, Ll/᩷ᩴܽ;->᩷:Z

    .line 992
    :cond_0
    iget-object v4, p0, Ll/᩷ᩴܽ;->ܶ:[I

    add-int/lit8 v5, v2, 0x1

    aput v3, v4, v2

    .line 989
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v1, v2

    move v2, v5

    goto :goto_0

    .line 994
    :cond_1
    iput v2, p0, Ll/᩷ᩴܽ;->֡:I

    return-void
.end method

.method private ܽ(I)I
    .locals 4

    :cond_0
    :goto_0
    const/16 v0, 0x800

    .line 238
    invoke-static {p1, v0}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v1

    const/16 v2, 0x23

    if-nez v1, :cond_2

    if-ne p1, v2, :cond_1

    goto :goto_1

    :cond_1
    return p1

    :cond_2
    :goto_1
    invoke-static {p1, v0}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1137
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v1

    goto :goto_1

    :cond_3
    if-ne p1, v2, :cond_0

    .line 1148
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v0

    :goto_2
    if-eqz p1, :cond_4

    .line 1176
    iget v0, p0, Ll/᩷ᩴܽ;->ᩳ:I

    invoke-static {p1, v0}, Ll/᩷ᩴܽ;->ܽ(II)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1150
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v0

    goto :goto_2

    :cond_4
    if-nez p1, :cond_0

    .line 1151
    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    iget v1, p0, Ll/᩷ᩴܽ;->֡:I

    if-le v0, v1, :cond_0

    .line 1153
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v1

    goto :goto_0
.end method

.method private ܽ()Ll/ۧۚܽ;
    .locals 14

    .line 1820
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    .line 1821
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(Z)Ll/ܿᩴܽ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 0
    :goto_0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 1823
    check-cast v2, Ll/ܿᩴܽ;

    .line 1824
    iget v3, v2, Ll/ܿᩴܽ;->ۧ:I

    .line 1826
    iget-boolean v4, v2, Ll/ܿᩴܽ;->ܿ:Z

    const/4 v5, 0x0

    const/16 v6, 0x26

    const/16 v7, 0x5d

    const/16 v8, 0x5b

    if-eqz v4, :cond_4

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_2

    if-eq v3, v8, :cond_0

    .line 1828
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    :cond_0
    if-ne v3, v8, :cond_1

    const/4 v5, 0x1

    .line 1829
    :cond_1
    invoke-direct {p0, v5}, Ll/᩷ᩴܽ;->ۧ(Z)Ll/ܿᩴܽ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1832
    :cond_2
    iget-object v3, v2, Ll/ܿᩴܽ;->᩷:Ll/ۧۚܽ;

    if-eqz v3, :cond_3

    .line 1833
    iget-object v4, v2, Ll/ܿᩴܽ;->ܳ:Ll/ۧۚܽ;

    invoke-interface {v4, v3}, Ll/ۧۚܽ;->֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v3

    iput-object v3, v2, Ll/ܿᩴܽ;->ۜ:Ll/ۧۚܽ;

    .line 1834
    iput-boolean v1, v2, Ll/ܿᩴܽ;->ᩳ:Z

    .line 1835
    iput-boolean v5, v2, Ll/ܿᩴܽ;->ܿ:Z

    .line 1836
    new-instance v3, Ll/ܳۚܽ;

    iget v4, p0, Ll/᩷ᩴܽ;->ᩳ:I

    invoke-direct {v3, v4}, Ll/ܳۚܽ;-><init>(I)V

    iput-object v3, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    goto :goto_0

    :cond_3
    const-string v0, "Bad intersection syntax"

    .line 1832
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_4
    if-eqz v3, :cond_13

    if-eq v3, v6, :cond_f

    if-eq v3, v8, :cond_e

    if-eq v3, v7, :cond_5

    goto/16 :goto_6

    .line 1862
    :cond_5
    iget-object v3, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v3}, Ll/ܳۚܽ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-boolean v3, v2, Ll/ܿᩴܽ;->ᩳ:Z

    if-eqz v3, :cond_14

    .line 1863
    :cond_6
    iget-boolean v3, v2, Ll/ܿᩴܽ;->ܽ:Z

    if-eqz v3, :cond_7

    .line 1864
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    .line 1866
    :cond_7
    iget-boolean v3, v2, Ll/ܿᩴܽ;->ᩳ:Z

    if-eqz v3, :cond_9

    .line 1867
    iget-object v3, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v3}, Ll/ܳۚܽ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v2, Ll/ܿᩴܽ;->ۜ:Ll/ۧۚܽ;

    goto :goto_1

    :cond_8
    iget-object v3, v2, Ll/ܿᩴܽ;->ۜ:Ll/ۧۚܽ;

    iget-object v4, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v4}, Ll/ܳۚܽ;->֫()Ll/ۧۚܽ;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/ۧۚܽ;->֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v3

    .line 1868
    :goto_1
    iget-boolean v2, v2, Ll/ܿᩴܽ;->᩻:Z

    if-eqz v2, :cond_a

    invoke-interface {v3}, Ll/ۧۚܽ;->negate()Ll/۟᩵ܽ;

    move-result-object v3

    goto :goto_2

    .line 1870
    :cond_9
    iget-object v3, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    iget-boolean v4, v2, Ll/ܿᩴܽ;->᩻:Z

    invoke-virtual {v3, v4}, Ll/ܳۚܽ;->֫(Z)V

    .line 1871
    iget-object v2, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v2}, Ll/ܳۚܽ;->֫()Ll/ۧۚܽ;

    move-result-object v3

    .line 1873
    :cond_a
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1874
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    return-object v3

    .line 0
    :cond_b
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 1875
    check-cast v2, Ll/ܿᩴܽ;

    .line 1876
    iget-boolean v4, v2, Ll/ܿᩴܽ;->ܿ:Z

    if-eqz v4, :cond_d

    .line 1877
    iget-object v4, v2, Ll/ܿᩴܽ;->᩷:Ll/ۧۚܽ;

    if-nez v4, :cond_c

    goto :goto_3

    :cond_c
    invoke-interface {v4, v3}, Ll/ۧۚܽ;->ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v3

    :goto_3
    iput-object v3, v2, Ll/ܿᩴܽ;->᩷:Ll/ۧۚܽ;

    goto :goto_4

    .line 1879
    :cond_d
    iget-object v4, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v4, v3}, Ll/ܳۚܽ;->֫(Ll/ۧۚܽ;)V

    .line 1881
    :goto_4
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v3

    iput v3, v2, Ll/ܿᩴܽ;->ۧ:I

    goto/16 :goto_0

    .line 1841
    :cond_e
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(Z)Ll/ܿᩴܽ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1844
    :cond_f
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v3

    if-ne v3, v6, :cond_12

    .line 1846
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v3

    iput v3, v2, Ll/ܿᩴܽ;->ۧ:I

    .line 1847
    iget-boolean v3, v2, Ll/ܿᩴܽ;->ᩳ:Z

    if-eqz v3, :cond_11

    .line 1848
    iget-object v3, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v3}, Ll/ܳۚܽ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, v2, Ll/ܿᩴܽ;->ۜ:Ll/ۧۚܽ;

    goto :goto_5

    :cond_10
    iget-object v3, v2, Ll/ܿᩴܽ;->ۜ:Ll/ۧۚܽ;

    iget-object v4, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v4}, Ll/ܳۚܽ;->֫()Ll/ۧۚܽ;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/ۧۚܽ;->֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v3

    goto :goto_5

    .line 1849
    :cond_11
    iget-object v3, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    invoke-virtual {v3}, Ll/ܳۚܽ;->֫()Ll/ۧۚܽ;

    move-result-object v3

    :goto_5
    iput-object v3, v2, Ll/ܿᩴܽ;->ܳ:Ll/ۧۚܽ;

    const/4 v3, 0x0

    .line 1850
    iput-object v3, v2, Ll/ܿᩴܽ;->᩷:Ll/ۧۚܽ;

    .line 1851
    iput-boolean v1, v2, Ll/ܿᩴܽ;->ܿ:Z

    goto/16 :goto_0

    .line 1853
    :cond_12
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    goto :goto_6

    .line 1858
    :cond_13
    iget v3, p0, Ll/᩷ᩴܽ;->ܽ:I

    iget v4, p0, Ll/᩷ᩴܽ;->֡:I

    if-ge v3, v4, :cond_21

    .line 1888
    :cond_14
    :goto_6
    iget-object v3, v2, Ll/ܿᩴܽ;->֫:Ll/ܳۚܽ;

    .line 1921
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v4

    const/16 v6, 0x2d

    const/16 v9, 0x5c

    if-ne v4, v9, :cond_1a

    .line 1114
    iget-object v4, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v10, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v11, v10, 0x1

    iput v11, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget v11, v4, v11

    const/16 v12, 0x70

    const/16 v13, 0x50

    if-eq v11, v12, :cond_17

    if-ne v11, v13, :cond_15

    goto :goto_8

    :cond_15
    add-int/lit8 v10, v10, 0x2

    .line 1935
    aget v4, v4, v10

    if-ne v4, v6, :cond_16

    const/4 v4, 0x1

    goto :goto_7

    :cond_16
    const/4 v4, 0x0

    .line 1936
    :goto_7
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    .line 1937
    invoke-direct {p0, v1, v1, v4}, Ll/᩷ᩴܽ;->֫(ZZZ)I

    move-result v4

    const/4 v10, -0x1

    if-ne v4, v10, :cond_1b

    .line 1939
    iget-object v4, p0, Ll/᩷ᩴܽ;->ۚ:Ll/ۧۚܽ;

    invoke-virtual {v3, v4}, Ll/ܳۚܽ;->֫(Ll/ۧۚܽ;)V

    goto :goto_b

    :cond_17
    :goto_8
    if-ne v11, v13, :cond_18

    const/4 v4, 0x1

    goto :goto_9

    :cond_18
    const/4 v4, 0x0

    .line 1927
    :goto_9
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v6

    const/16 v7, 0x7b

    if-eq v6, v7, :cond_19

    .line 1929
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ۢ()V

    const/4 v5, 0x1

    .line 1932
    :cond_19
    invoke-direct {p0, v5, v4}, Ll/᩷ᩴܽ;->֫(ZZ)Ll/ۧۚܽ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ܳۚܽ;->֫(Ll/ۧۚܽ;)V

    goto :goto_b

    .line 1944
    :cond_1a
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    :cond_1b
    if-ltz v4, :cond_20

    .line 1947
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v10

    if-ne v10, v6, :cond_1f

    .line 1948
    iget-object v6, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v10, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/2addr v10, v1

    aget v6, v6, v10

    if-ne v6, v8, :cond_1c

    .line 1950
    invoke-virtual {v3, v4}, Ll/ܳۚܽ;->֫(I)V

    goto :goto_b

    :cond_1c
    if-eq v6, v7, :cond_1f

    .line 1954
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    .line 1955
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v6

    if-ne v6, v9, :cond_1d

    .line 1957
    invoke-direct {p0, v1, v5, v1}, Ll/᩷ᩴܽ;->֫(ZZZ)I

    move-result v6

    goto :goto_a

    .line 1959
    :cond_1d
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    :goto_a
    if-lt v6, v4, :cond_1e

    .line 1964
    invoke-virtual {v3, v4, v6}, Ll/ܳۚܽ;->ۧ(II)V

    goto :goto_b

    :cond_1e
    const-string v0, "Illegal character range"

    .line 1962
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    .line 1968
    :cond_1f
    invoke-virtual {v3, v4}, Ll/ܳۚܽ;->֫(I)V

    .line 1889
    :goto_b
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ܿ()I

    move-result v3

    iput v3, v2, Ll/ܿᩴܽ;->ۧ:I

    goto/16 :goto_0

    .line 1971
    :cond_20
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected character \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0

    :cond_21
    const-string v0, "Unclosed character class"

    .line 1859
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ܽ(Ljava/lang/String;)Ll/۬ۘܽ;

    move-result-object v0

    throw v0
.end method

.method private ܽ(Ljava/lang/String;)Ll/۬ۘܽ;
    .locals 3

    .line 1213
    new-instance v0, Ll/۬ۘܽ;

    iget-object v1, p0, Ll/᩷ᩴܽ;->ᩴ:Ljava/lang/String;

    iget v2, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v2, v2, -0x1

    .line 50
    invoke-direct {v0, p1, v1, v2}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static ܽ(II)Z
    .locals 3

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    if-eqz p1, :cond_1

    if-ne p0, v2, :cond_0

    return v0

    :cond_0
    return v1

    :cond_1
    if-eq p0, v2, :cond_3

    const/16 p1, 0xd

    if-eq p0, p1, :cond_3

    or-int/lit8 p1, p0, 0x1

    const/16 v2, 0x2029

    if-eq p1, v2, :cond_3

    const/16 p1, 0x85

    if-ne p0, p1, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v0
.end method

.method private ܿ()I
    .locals 2

    .line 1075
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget v0, v0, v1

    const/4 v1, 0x4

    .line 1076
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1077
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ᩳ(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method private ᩳ()I
    .locals 2

    .line 1103
    iget-object v0, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget v0, v0, v1

    const/4 v1, 0x4

    .line 1104
    invoke-direct {p0, v1}, Ll/᩷ᩴܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1105
    invoke-direct {p0, v0}, Ll/᩷ᩴܽ;->ᩳ(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method private ᩳ(I)I
    .locals 3

    :cond_0
    :goto_0
    const/16 v0, 0x800

    .line 238
    invoke-static {p1, v0}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v1

    const/16 v2, 0x23

    if-nez v1, :cond_2

    if-ne p1, v2, :cond_1

    goto :goto_1

    :cond_1
    return p1

    :cond_2
    :goto_1
    invoke-static {p1, v0}, Ll/᩹۠ܽ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1123
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v1

    goto :goto_1

    :cond_3
    if-ne p1, v2, :cond_0

    .line 1162
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v0

    :goto_2
    if-eqz p1, :cond_4

    .line 1176
    iget v0, p0, Ll/᩷ᩴܽ;->ᩳ:I

    invoke-static {p1, v0}, Ll/᩷ᩴܽ;->ܽ(II)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1164
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    aget p1, p1, v0

    goto :goto_2

    :cond_4
    if-nez p1, :cond_0

    .line 1165
    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    iget v1, p0, Ll/᩷ᩴܽ;->֡:I

    if-le v0, v1, :cond_0

    .line 1166
    iput v1, p0, Ll/᩷ᩴܽ;->ܽ:I

    .line 1167
    iget-object p1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    aget p1, p1, v1

    goto :goto_0
.end method

.method private ᩷()I
    .locals 3

    .line 1195
    iget v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    .line 1196
    iget-object v1, p0, Ll/᩷ᩴܽ;->ܶ:[I

    add-int/lit8 v2, v0, 0x1

    aget v1, v1, v2

    add-int/lit8 v0, v0, 0x2

    .line 1197
    iput v0, p0, Ll/᩷ᩴܽ;->ܽ:I

    return v1
.end method

.method private ᩻()Ll/֫֨ܽ;
    .locals 2

    .line 2415
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    move-result v0

    const/16 v1, 0x3f

    if-ne v0, v1, :cond_0

    .line 2417
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    .line 2418
    sget-object v0, Ll/֫֨ܽ;->ۙ:Ll/֫֨ܽ;

    return-object v0

    :cond_0
    const/16 v1, 0x2b

    if-ne v0, v1, :cond_1

    .line 2420
    invoke-direct {p0}, Ll/᩷ᩴܽ;->ᩳ()I

    .line 2421
    sget-object v0, Ll/֫֨ܽ;->ۗ:Ll/֫֨ܽ;

    return-object v0

    .line 2423
    :cond_1
    sget-object v0, Ll/֫֨ܽ;->᩹:Ll/֫֨ܽ;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/util/Map;
    .locals 2

    .line 1032
    iget-object v0, p0, Ll/᩷ᩴܽ;->ۘ:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 1034
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/᩷ᩴܽ;->ۘ:Ljava/util/HashMap;

    :cond_0
    return-object v0
.end method
