.class public final Ll/᩵ۘۖ;
.super Ljava/lang/Object;
.source "29QV"


# static fields
.field public static final ܿ:Ll/᩵ۘۖ;

.field public static final synthetic ᩳ:I


# instance fields
.field public final ֫:Ll/᩸ۚۖ;

.field public ۧ:Z

.field public ܽ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 92
    new-instance v0, Ll/᩵ۘۖ;

    .line 72
    new-instance v1, Ll/ۖۚۖ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩸ۚۖ;-><init>(I)V

    .line 66
    invoke-direct {v0, v1}, Ll/᩵ۘۖ;-><init>(Ll/᩸ۚۖ;)V

    .line 67
    invoke-virtual {v0}, Ll/᩵ۘۖ;->᩷()V

    .line 92
    sput-object v0, Ll/᩵ۘۖ;->ܿ:Ll/᩵ۘۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ll/ۖۚۖ;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ll/᩸ۚۖ;-><init>(I)V

    .line 60
    iput-object v0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    return-void
.end method

.method public constructor <init>(Ll/᩸ۚۖ;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    .line 72
    invoke-virtual {p0}, Ll/᩵ۘۖ;->᩷()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩸ۚۖ;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Ll/᩵ۘۖ;-><init>(Ll/᩸ۚۖ;)V

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 29
    invoke-static {p0}, Ll/᩵ۘۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۖۚۖ;ZZ)Ll/ۖۚۖ;
    .locals 0

    .line 29
    invoke-static {p0, p1, p2}, Ll/᩵ۘۖ;->֫(Ll/᩸ۚۖ;ZZ)Ll/ۖۚۖ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩸ۚۖ;ZZ)Ll/ۖۚۖ;
    .locals 3

    .line 188
    sget v0, Ll/᩸ۚۖ;->ۤ:I

    .line 72
    new-instance v0, Ll/ۖۚۖ;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ll/᩸ۚۖ;-><init>(I)V

    const/4 v1, 0x0

    .line 189
    :goto_0
    invoke-virtual {p0}, Ll/᩸ۚۖ;->ۧ()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 190
    invoke-virtual {p0, v1}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v0, v2, p1, p2}, Ll/᩵ۘۖ;->֫(Ljava/util/Map;Ljava/util/Map$Entry;ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 192
    :cond_0
    invoke-virtual {p0}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 193
    invoke-static {v0, v1, p1, p2}, Ll/᩵ۘۖ;->֫(Ljava/util/Map;Ljava/util/Map$Entry;ZZ)V

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static ֫(Ljava/util/Map$Entry;Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 589
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۘۖ;

    .line 590
    invoke-interface {v0}, Ll/ᩴۘۖ;->ܽܽ()Ll/֫۠ۖ;

    move-result-object v1

    sget-object v2, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    if-ne v1, v2, :cond_1

    .line 591
    invoke-interface {v0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v1

    if-nez v1, :cond_1

    .line 592
    invoke-interface {v0}, Ll/ᩴۘۖ;->ᩳܽ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 593
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 594
    instance-of v1, v0, Ll/ۡ᩵ۖ;

    if-eqz v1, :cond_0

    .line 595
    check-cast v0, Ll/ۡ᩵ۖ;

    invoke-virtual {v0}, Ll/ܺ᩵ۖ;->ۧ()Ll/ۛۜۖ;

    move-result-object v0

    .line 596
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴۘۖ;

    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result p0

    invoke-virtual {p1, p0, v0}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۛۜۖ;)V

    return-void

    .line 598
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴۘۖ;

    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result p0

    check-cast v0, Ll/ۡ֡ۖ;

    invoke-virtual {p1, p0, v0}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۡ֡ۖ;)V

    return-void

    .line 601
    :cond_1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public static ֫(Ljava/util/Map;Ljava/util/Map$Entry;ZZ)V
    .locals 1

    .line 200
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۘۖ;

    .line 201
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p3, :cond_0

    .line 202
    instance-of p3, p1, Ll/ۡ᩵ۖ;

    if-eqz p3, :cond_0

    .line 203
    check-cast p1, Ll/ۡ᩵ۖ;

    invoke-virtual {p1}, Ll/ۡ᩵ۖ;->ܽ()Ll/ۡ֡ۖ;

    move-result-object p1

    check-cast p0, Ll/ۖۚۖ;

    .line 72
    invoke-virtual {p0, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 204
    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_1

    .line 205
    new-instance p2, Ljava/util/ArrayList;

    check-cast p1, Ljava/util/List;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    check-cast p0, Ll/ۖۚۖ;

    .line 72
    invoke-virtual {p0, v0, p2}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 207
    :cond_1
    check-cast p0, Ll/ۖۚۖ;

    .line 72
    invoke-virtual {p0, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/ܳ᩷ۖ;Ll/۟֨ۖ;ILjava/lang/Object;)V
    .locals 1

    .line 622
    sget-object v0, Ll/۟֨ۖ;->᩺:Ll/۟֨ۖ;

    if-ne p1, v0, :cond_0

    .line 623
    check-cast p3, Ll/ۡ֡ۖ;

    invoke-virtual {p0, p2, p3}, Ll/ܳ᩷ۖ;->֫(ILl/ۡ֡ۖ;)V

    return-void

    .line 475
    :cond_0
    invoke-virtual {p1}, Ll/۟֨ۖ;->ۧ()I

    move-result v0

    .line 625
    invoke-virtual {p0, p2, v0}, Ll/ܳ᩷ۖ;->ܽ(II)V

    .line 626
    invoke-static {p0, p1, p3}, Ll/᩵ۘۖ;->֫(Ll/ܳ᩷ۖ;Ll/۟֨ۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(Ll/ܳ᩷ۖ;Ll/۟֨ۖ;Ljava/lang/Object;)V
    .locals 3

    .line 641
    sget-object v0, Ll/ۖۘۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    return-void

    .line 703
    :pswitch_0
    instance-of p1, p2, Ll/ۗᩴۖ;

    if-eqz p1, :cond_0

    .line 704
    check-cast p2, Ll/ۗᩴۖ;

    invoke-interface {p2}, Ll/ۗᩴۖ;->getNumber()I

    move-result p1

    .line 434
    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->ۧ(I)V

    return-void

    .line 706
    :cond_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 434
    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->ۧ(I)V

    return-void

    .line 699
    :pswitch_1
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    const/4 v0, 0x1

    shl-long v0, p1, v0

    const/16 v2, 0x3f

    shr-long/2addr p1, v2

    xor-long/2addr p1, v0

    .line 402
    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(J)V

    return-void

    .line 696
    :pswitch_2
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    shl-int/lit8 p2, p1, 0x1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, p2

    .line 379
    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(I)V

    return-void

    .line 693
    :pswitch_3
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    .line 411
    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->֫(J)V

    return-void

    .line 690
    :pswitch_4
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 388
    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->֫(I)V

    return-void

    .line 687
    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(I)V

    return-void

    .line 680
    :pswitch_6
    instance-of p1, p2, Ll/ۛۜۖ;

    if-eqz p1, :cond_1

    .line 681
    check-cast p2, Ll/ۛۜۖ;

    invoke-virtual {p0, p2}, Ll/ܳ᩷ۖ;->֫(Ll/ۛۜۖ;)V

    return-void

    .line 683
    :cond_1
    check-cast p2, [B

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    array-length p1, p2

    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->֫(I[B)V

    return-void

    .line 673
    :pswitch_7
    instance-of p1, p2, Ll/ۛۜۖ;

    if-eqz p1, :cond_2

    .line 674
    check-cast p2, Ll/ۛۜۖ;

    invoke-virtual {p0, p2}, Ll/ܳ᩷ۖ;->֫(Ll/ۛۜۖ;)V

    return-void

    .line 676
    :cond_2
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Ll/ܳ᩷ۖ;->֫(Ljava/lang/String;)V

    return-void

    .line 670
    :pswitch_8
    check-cast p2, Ll/ۡ֡ۖ;

    invoke-virtual {p0, p2}, Ll/ܳ᩷ۖ;->֫(Ll/ۡ֡ۖ;)V

    return-void

    .line 667
    :pswitch_9
    check-cast p2, Ll/ۡ֡ۖ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    invoke-interface {p2, p0}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void

    .line 664
    :pswitch_a
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    int-to-byte p1, p1

    .line 426
    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->֫(B)V

    return-void

    .line 661
    :pswitch_b
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->֫(I)V

    return-void

    .line 658
    :pswitch_c
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->֫(J)V

    return-void

    .line 655
    :pswitch_d
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->ۧ(I)V

    return-void

    .line 652
    :pswitch_e
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(J)V

    return-void

    .line 649
    :pswitch_f
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    .line 393
    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(J)V

    return-void

    .line 646
    :pswitch_10
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->֫(I)V

    return-void

    .line 643
    :pswitch_11
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->֫(J)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ᩴۘۖ;Ljava/lang/Object;Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 716
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v0

    .line 717
    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result v1

    .line 718
    invoke-interface {p0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 719
    check-cast p1, Ljava/util/List;

    .line 720
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 721
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_3

    :cond_0
    const/4 p0, 0x2

    .line 725
    invoke-virtual {p2, v1, p0}, Ll/ܳ᩷ۖ;->ܽ(II)V

    .line 728
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 729
    invoke-static {v0, v2}, Ll/᩵ۘۖ;->ۧ(Ll/۟֨ۖ;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    .line 731
    :cond_1
    invoke-virtual {p2, v1}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 733
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    .line 734
    invoke-static {p2, v0, p1}, Ll/᩵ۘۖ;->֫(Ll/ܳ᩷ۖ;Ll/۟֨ۖ;Ljava/lang/Object;)V

    goto :goto_1

    .line 737
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    .line 738
    invoke-static {p2, v0, v1, p1}, Ll/᩵ۘۖ;->֫(Ll/ܳ᩷ۖ;Ll/۟֨ۖ;ILjava/lang/Object;)V

    goto :goto_2

    :cond_3
    :goto_3
    return-void

    .line 742
    :cond_4
    instance-of p0, p1, Ll/ۡ᩵ۖ;

    if-eqz p0, :cond_5

    .line 743
    check-cast p1, Ll/ۡ᩵ۖ;

    invoke-virtual {p1}, Ll/ۡ᩵ۖ;->ܽ()Ll/ۡ֡ۖ;

    move-result-object p0

    invoke-static {p2, v0, v1, p0}, Ll/᩵ۘۖ;->֫(Ll/ܳ᩷ۖ;Ll/۟֨ۖ;ILjava/lang/Object;)V

    return-void

    .line 745
    :cond_5
    invoke-static {p2, v0, v1, p1}, Ll/᩵ۘۖ;->֫(Ll/ܳ᩷ۖ;Ll/۟֨ۖ;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۘۖ;Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Ll/᩵ۘۖ;->ۧ:Z

    return-void
.end method

.method public static synthetic ֫(Ljava/util/Map$Entry;)Z
    .locals 0

    .line 29
    invoke-static {p0}, Ll/᩵ۘۖ;->ܽ(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ֫(Ll/۟֨ۖ;Ljava/lang/Object;)Z
    .locals 0

    .line 29
    invoke-static {p0, p1}, Ll/᩵ۘۖ;->ܽ(Ll/۟֨ۖ;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۡ()Ll/᩵ۘۖ;
    .locals 1

    .line 77
    new-instance v0, Ll/᩵ۘۖ;

    invoke-direct {v0}, Ll/᩵ۘۖ;-><init>()V

    return-object v0
.end method

.method public static ۢ()Ll/᩵ۘۖ;
    .locals 1

    .line 83
    sget-object v0, Ll/᩵ۘۖ;->ܿ:Ll/᩵ۘۖ;

    return-object v0
.end method

.method public static ۧ(Ljava/util/Map$Entry;)I
    .locals 5

    .line 779
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۘۖ;

    .line 780
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 781
    invoke-interface {v0}, Ll/ᩴۘۖ;->ܽܽ()Ll/֫۠ۖ;

    move-result-object v2

    sget-object v3, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    if-ne v2, v3, :cond_1

    .line 782
    invoke-interface {v0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v2

    if-nez v2, :cond_1

    .line 783
    invoke-interface {v0}, Ll/ᩴۘۖ;->ᩳܽ()Z

    move-result v2

    if-nez v2, :cond_1

    .line 784
    instance-of v0, v1, Ll/ۡ᩵ۖ;

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    .line 786
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴۘۖ;

    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result p0

    check-cast v1, Ll/ۡ᩵ۖ;

    .line 679
    invoke-static {v4}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    .line 680
    invoke-static {v3, p0}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result p0

    add-int/2addr p0, v0

    .line 681
    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->֫(ILl/ܺ᩵ۖ;)I

    move-result v0

    goto :goto_0

    .line 789
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴۘۖ;

    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result p0

    check-cast v1, Ll/ۡ֡ۖ;

    .line 657
    invoke-static {v4}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    .line 658
    invoke-static {v3, p0}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result p0

    add-int/2addr p0, v0

    .line 659
    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v0

    :goto_0
    add-int/2addr v0, p0

    return v0

    .line 792
    :cond_1
    invoke-static {v0, v1}, Ll/᩵ۘۖ;->ۧ(Ll/ᩴۘۖ;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/۟֨ۖ;Ljava/lang/Object;)I
    .locals 3

    .line 825
    sget-object v0, Ll/ۖۘۖ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x4

    const/16 v2, 0x8

    packed-switch p0, :pswitch_data_0

    .line 882
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 875
    :pswitch_0
    instance-of p0, p1, Ll/ۗᩴۖ;

    if-eqz p0, :cond_0

    .line 876
    check-cast p1, Ll/ۗᩴۖ;

    invoke-interface {p1}, Ll/ۗᩴۖ;->getNumber()I

    move-result p0

    int-to-long p0, p0

    .line 696
    invoke-static {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p0

    return p0

    .line 878
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long p0, p0

    .line 696
    invoke-static {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p0

    return p0

    .line 865
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long/2addr p0, v2

    xor-long/2addr p0, v0

    .line 779
    invoke-static {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p0

    return p0

    .line 863
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    shl-int/lit8 p1, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, p1

    .line 746
    invoke-static {p0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result p0

    return p0

    .line 861
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    return v2

    .line 859
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    return v1

    .line 857
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result p0

    return p0

    .line 845
    :pswitch_6
    instance-of p0, p1, Ll/ۛۜۖ;

    if-eqz p0, :cond_1

    .line 846
    check-cast p1, Ll/ۛۜۖ;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    goto :goto_0

    .line 848
    :cond_1
    check-cast p1, [B

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    .line 850
    array-length p0, p1

    goto :goto_1

    .line 851
    :pswitch_7
    instance-of p0, p1, Ll/ۛۜۖ;

    if-eqz p0, :cond_2

    .line 852
    check-cast p1, Ll/ۛۜۖ;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    .line 845
    :goto_0
    invoke-virtual {p1}, Ll/ۛۜۖ;->size()I

    move-result p0

    goto :goto_1

    .line 854
    :cond_2
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/ܳ᩷ۖ;->ۧ(Ljava/lang/String;)I

    move-result p0

    return p0

    .line 868
    :pswitch_8
    instance-of p0, p1, Ll/ۡ᩵ۖ;

    if-eqz p0, :cond_3

    .line 869
    check-cast p1, Ll/ۡ᩵ۖ;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    .line 840
    invoke-virtual {p1}, Ll/ܺ᩵ۖ;->֫()I

    move-result p0

    .line 869
    :goto_1
    invoke-static {p0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1

    .line 871
    :cond_3
    check-cast p1, Ll/ۡ֡ۖ;

    invoke-static {p1}, Ll/ܳ᩷ۖ;->ۧ(Ll/ۡ֡ۖ;)I

    move-result p0

    return p0

    .line 843
    :pswitch_9
    check-cast p1, Ll/ۡ֡ۖ;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    .line 1058
    invoke-interface {p1}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result p0

    return p0

    .line 841
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    return v0

    .line 839
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    return v1

    .line 837
    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    return v2

    .line 835
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long p0, p0

    .line 696
    invoke-static {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p0

    return p0

    .line 833
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p0

    return p0

    .line 831
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    .line 764
    invoke-static {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p0

    return p0

    .line 829
    :pswitch_10
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    return v1

    .line 827
    :pswitch_11
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p0, Ll/ܳ᩷ۖ;->ۧ:I

    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۧ(Ll/ᩴۘۖ;Ljava/lang/Object;)I
    .locals 5

    .line 887
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v0

    .line 888
    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result v1

    .line 889
    invoke-interface {p0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 890
    check-cast p1, Ljava/util/List;

    .line 891
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳܽ()Z

    move-result p0

    const/4 v2, 0x0

    if-eqz p0, :cond_2

    .line 892
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    return v2

    .line 896
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    .line 897
    invoke-static {v0, p1}, Ll/᩵ۘۖ;->ۧ(Ll/۟֨ۖ;Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v2, p1

    goto :goto_0

    .line 900
    :cond_1
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    add-int/2addr p0, v2

    .line 901
    invoke-static {v2}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1

    .line 904
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    .line 807
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    .line 808
    sget-object v4, Ll/۟֨ۖ;->᩺:Ll/۟֨ۖ;

    if-ne v0, v4, :cond_3

    mul-int/lit8 v3, v3, 0x2

    .line 813
    :cond_3
    invoke-static {v0, p1}, Ll/᩵ۘۖ;->ۧ(Ll/۟֨ۖ;Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v3, p1

    add-int/2addr v2, v3

    goto :goto_1

    :cond_4
    return v2

    .line 807
    :cond_5
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    .line 808
    sget-object v1, Ll/۟֨ۖ;->᩺:Ll/۟֨ۖ;

    if-ne v0, v1, :cond_6

    mul-int/lit8 p0, p0, 0x2

    .line 813
    :cond_6
    invoke-static {v0, p1}, Ll/᩵ۘۖ;->ۧ(Ll/۟֨ۖ;Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 490
    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    .line 491
    check-cast p0, [B

    .line 492
    array-length v0, p0

    new-array v0, v0, [B

    .line 493
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩵ۘۖ;)Ll/᩸ۚۖ;
    .locals 0

    .line 29
    iget-object p0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    return-object p0
.end method

.method public static ܽ(Ll/ᩴۘۖ;Ljava/lang/Object;)V
    .locals 4

    .line 377
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩵ۘۖ;->ܽ(Ll/۟֨ۖ;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 378
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 382
    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 383
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟֨ۖ;->֫()Ll/֫۠ۖ;

    move-result-object p0

    .line 384
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p0, v2, v1

    const/4 p0, 0x2

    aput-object p1, v2, p0

    const-string p0, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    .line 379
    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(Ljava/util/Map$Entry;)Z
    .locals 4

    .line 438
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۘۖ;

    .line 439
    invoke-interface {v0}, Ll/ᩴۘۖ;->ܽܽ()Ll/֫۠ۖ;

    move-result-object v1

    sget-object v2, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_6

    .line 440
    invoke-interface {v0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v0

    const-string v1, "Wrong object type used with protocol message reflection."

    if-eqz v0, :cond_3

    .line 441
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 454
    instance-of v2, v0, Ll/ܺ֡ۖ;

    if-eqz v2, :cond_1

    .line 457
    check-cast v0, Ll/ܺ֡ۖ;

    invoke-interface {v0}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v0

    goto :goto_0

    .line 458
    :cond_1
    instance-of v0, v0, Ll/ۡ᩵ۖ;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 461
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 447
    :cond_3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    .line 454
    instance-of v0, p0, Ll/ܺ֡ۖ;

    if-eqz v0, :cond_4

    .line 457
    check-cast p0, Ll/ܺ֡ۖ;

    invoke-interface {p0}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result p0

    return p0

    .line 458
    :cond_4
    instance-of p0, p0, Ll/ۡ᩵ۖ;

    if-eqz p0, :cond_5

    return v3

    .line 461
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return v3
.end method

.method public static ܽ(Ll/۟֨ۖ;Ljava/lang/Object;)Z
    .locals 2

    .line 390
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    sget-object v0, Ll/ۖۘۖ;->ۧ:[I

    invoke-virtual {p0}, Ll/۟֨ۖ;->֫()Ll/֫۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    return v1

    .line 409
    :pswitch_0
    instance-of p0, p1, Ll/ۡ֡ۖ;

    if-nez p0, :cond_1

    instance-of p0, p1, Ll/ۡ᩵ۖ;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v0

    .line 407
    :pswitch_1
    instance-of p0, p1, Ljava/lang/Integer;

    if-nez p0, :cond_3

    instance-of p0, p1, Ll/ۗᩴۖ;

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    return v1

    :cond_3
    :goto_1
    return v0

    .line 405
    :pswitch_2
    instance-of p0, p1, Ll/ۛۜۖ;

    if-nez p0, :cond_5

    instance-of p0, p1, [B

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    return v1

    :cond_5
    :goto_2
    return v0

    .line 403
    :pswitch_3
    instance-of p0, p1, Ljava/lang/String;

    return p0

    .line 401
    :pswitch_4
    instance-of p0, p1, Ljava/lang/Boolean;

    return p0

    .line 399
    :pswitch_5
    instance-of p0, p1, Ljava/lang/Double;

    return p0

    .line 397
    :pswitch_6
    instance-of p0, p1, Ljava/lang/Float;

    return p0

    .line 395
    :pswitch_7
    instance-of p0, p1, Ljava/lang/Long;

    return p0

    .line 393
    :pswitch_8
    instance-of p0, p1, Ljava/lang/Integer;

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ᩳ(Ljava/util/Map$Entry;)V
    .locals 5

    .line 502
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۘۖ;

    .line 503
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 504
    instance-of v1, p1, Ll/ۡ᩵ۖ;

    .line 506
    invoke-interface {v0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v2

    iget-object v3, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    if-eqz v2, :cond_3

    if-nez v1, :cond_2

    .line 510
    invoke-virtual {p0, v0}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 512
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 514
    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 515
    move-object v4, v1

    check-cast v4, Ljava/util/List;

    invoke-static {v2}, Ll/᩵ۘۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 517
    :cond_1
    invoke-virtual {v3, v0, v1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 508
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields can not be repeated"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 518
    :cond_3
    invoke-interface {v0}, Ll/ᩴۘۖ;->ܽܽ()Ll/֫۠ۖ;

    move-result-object v2

    sget-object v4, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    if-ne v2, v4, :cond_7

    .line 519
    invoke-virtual {p0, v0}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_5

    .line 522
    invoke-static {p1}, Ll/᩵ۘۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_4

    const/4 p1, 0x1

    .line 524
    iput-boolean p1, p0, Ll/᩵ۘۖ;->ۧ:Z

    :cond_4
    return-void

    :cond_5
    if-eqz v1, :cond_6

    .line 530
    check-cast p1, Ll/ۡ᩵ۖ;

    invoke-virtual {p1}, Ll/ۡ᩵ۖ;->ܽ()Ll/ۡ֡ۖ;

    move-result-object p1

    .line 532
    :cond_6
    check-cast v2, Ll/ۡ֡ۖ;

    .line 534
    invoke-interface {v2}, Ll/ۡ֡ۖ;->toBuilder()Ll/ۢ֡ۖ;

    move-result-object v1

    check-cast p1, Ll/ۡ֡ۖ;

    invoke-interface {v0, v1, p1}, Ll/ᩴۘۖ;->֫(Ll/ۢ֡ۖ;Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;

    move-result-object p1

    .line 535
    invoke-interface {p1}, Ll/ۢ֡ۖ;->build()Ll/ۡ֡ۖ;

    move-result-object p1

    .line 536
    invoke-virtual {v3, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_7
    if-nez v1, :cond_8

    .line 542
    invoke-static {p1}, Ll/᩵ۘۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 540
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields must be message-valued"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/᩵ۘۖ;->clone()Ll/᩵ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/᩵ۘۖ;
    .locals 4

    .line 77
    new-instance v0, Ll/᩵ۘۖ;

    invoke-direct {v0}, Ll/᩵ۘۖ;-><init>()V

    const/4 v1, 0x0

    .line 154
    :goto_0
    iget-object v2, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v2}, Ll/᩸ۚۖ;->ۧ()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 155
    invoke-virtual {v2, v1}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v2

    .line 156
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘۖ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {v2}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 159
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘۖ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    goto :goto_1

    .line 161
    :cond_1
    iget-boolean v1, p0, Ll/᩵ۘۖ;->ۧ:Z

    iput-boolean v1, v0, Ll/᩵ۘۖ;->ۧ:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 130
    :cond_0
    instance-of v0, p1, Ll/᩵ۘۖ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 134
    :cond_1
    check-cast p1, Ll/᩵ۘۖ;

    .line 135
    iget-object v0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    iget-object p1, p1, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v0, p1}, Ll/᩸ۚۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 140
    iget-object v0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v0}, Ll/᩸ۚۖ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ᩴۘۖ;)Ljava/lang/Object;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v0, p1}, Ll/᩸ۚۖ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 250
    instance-of v0, p1, Ll/ۡ᩵ۖ;

    if-eqz v0, :cond_0

    .line 251
    check-cast p1, Ll/ۡ᩵ۖ;

    invoke-virtual {p1}, Ll/ۡ᩵ۖ;->ܽ()Ll/ۡ֡ۖ;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final ֫()Ljava/util/Iterator;
    .locals 2

    .line 228
    iget-boolean v0, p0, Ll/᩵ۘۖ;->ۧ:Z

    iget-object v1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    if-eqz v0, :cond_0

    .line 229
    new-instance v0, Ll/ۢ᩵ۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->֫()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ll/ᩴۚۖ;

    invoke-virtual {v1}, Ll/ᩴۚۖ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۢ᩵ۖ;-><init>(Ljava/util/Iterator;)V

    return-object v0

    .line 231
    :cond_0
    invoke-virtual {v1}, Ll/᩸ۚۖ;->֫()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ll/ᩴۚۖ;

    invoke-virtual {v0}, Ll/ᩴۚۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ۖۖ;Ljava/lang/Object;)V
    .locals 2

    .line 350
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 355
    invoke-static {p1, p2}, Ll/᩵ۘۖ;->ܽ(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    .line 357
    invoke-virtual {p0, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 360
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 361
    iget-object v1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v1, p1, v0}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 363
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 366
    :goto_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 351
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "addRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܳ᩷ۖ;)V
    .locals 3

    const/4 v0, 0x0

    .line 579
    :goto_0
    iget-object v1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->ۧ()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 580
    invoke-virtual {v1, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-static {v1, p1}, Ll/᩵ۘۖ;->֫(Ljava/util/Map$Entry;Ll/ܳ᩷ۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 582
    :cond_0
    invoke-virtual {v1}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 583
    invoke-static {v1, p1}, Ll/᩵ۘۖ;->֫(Ljava/util/Map$Entry;Ll/ܳ᩷ۖ;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V
    .locals 2

    .line 261
    invoke-interface {p1}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 262
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 269
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 270
    check-cast p2, Ljava/util/List;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 271
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 272
    invoke-static {p1, v1}, Ll/᩵ۘۖ;->ܽ(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p2, v0

    goto :goto_1

    .line 263
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 276
    :cond_2
    invoke-static {p1, p2}, Ll/᩵ۘۖ;->ܽ(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    .line 279
    :goto_1
    instance-of v0, p2, Ll/ۡ᩵ۖ;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    .line 280
    iput-boolean v0, p0, Ll/᩵ۘۖ;->ۧ:Z

    .line 282
    :cond_3
    iget-object v0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩵ۘۖ;)V
    .locals 3

    const/4 v0, 0x0

    .line 481
    :goto_0
    iget-object v1, p1, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->ۧ()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 482
    invoke-virtual {v1, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩵ۘۖ;->ᩳ(Ljava/util/Map$Entry;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 484
    :cond_0
    invoke-virtual {v1}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 485
    invoke-direct {p0, v0}, Ll/᩵ۘۖ;->ᩳ(Ljava/util/Map$Entry;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/֡ۖۖ;)Z
    .locals 1

    .line 236
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 240
    iget-object v0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v0, p1}, Ll/᩸ۚۖ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 237
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "hasField() can only be called on non-repeated fields."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ()Ljava/util/Iterator;
    .locals 2

    .line 216
    iget-boolean v0, p0, Ll/᩵ۘۖ;->ۧ:Z

    iget-object v1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    if-eqz v0, :cond_0

    .line 217
    new-instance v0, Ll/ۢ᩵ۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ll/ܶۚۖ;

    invoke-virtual {v1}, Ll/ܶۚۖ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۢ᩵ۖ;-><init>(Ljava/util/Iterator;)V

    return-object v0

    .line 219
    :cond_0
    invoke-virtual {v1}, Ll/᩸ۚۖ;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ll/ܶۚۖ;

    invoke-virtual {v0}, Ll/ܶۚۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 3

    .line 175
    iget-boolean v0, p0, Ll/᩵ۘۖ;->ۧ:Z

    iget-object v1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 177
    invoke-static {v1, v0, v2}, Ll/᩵ۘۖ;->֫(Ll/᩸ۚۖ;ZZ)Ll/ۖۚۖ;

    move-result-object v0

    .line 178
    invoke-virtual {v1}, Ll/᩸ۚۖ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 179
    invoke-virtual {v0}, Ll/ۖۚۖ;->᩻()V

    :cond_0
    return-object v0

    .line 183
    :cond_1
    invoke-virtual {v1}, Ll/᩸ۚۖ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v1

    :cond_2
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܳ᩷ۖ;)V
    .locals 3

    const/4 v0, 0x0

    .line 568
    :goto_0
    iget-object v1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->ۧ()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 569
    invoke-virtual {v1, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v1

    .line 570
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۘۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Ll/ܳ᩷ۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 572
    :cond_0
    invoke-virtual {v1}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 573
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۘۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Ll/ܳ᩷ۖ;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Ll/᩵ۘۖ;->ܽ:Z

    return v0
.end method

.method public final ܽ()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 769
    :goto_0
    iget-object v2, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v2}, Ll/᩸ۚۖ;->ۧ()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 770
    invoke-virtual {v2, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Ll/᩵ۘۖ;->ۧ(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 772
    :cond_0
    invoke-virtual {v2}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 773
    invoke-static {v2}, Ll/᩵ۘۖ;->ۧ(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    return v1
.end method

.method public final ܿ()Z
    .locals 1

    .line 96
    iget-object v0, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 756
    :goto_0
    iget-object v2, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v2}, Ll/᩸ۚۖ;->ۧ()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 757
    invoke-virtual {v2, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v2

    .line 758
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘۖ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Ll/᩵ۘۖ;->ۧ(Ll/ᩴۘۖ;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 760
    :cond_0
    invoke-virtual {v2}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 761
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘۖ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Ll/᩵ۘۖ;->ۧ(Ll/ᩴۘۖ;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    return v1
.end method

.method public final ᩷()V
    .locals 4

    .line 101
    iget-boolean v0, p0, Ll/᩵ۘۖ;->ܽ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 104
    :goto_0
    iget-object v1, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->ۧ()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 105
    invoke-virtual {v1, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v1

    .line 106
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ll/᩸ᩴۖ;

    if-eqz v2, :cond_1

    .line 107
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ᩴۖ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v2

    .line 203
    invoke-interface {v2, v1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;)V

    .line 204
    invoke-virtual {v1}, Ll/᩸ᩴۖ;->ܽ()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 110
    :cond_2
    invoke-virtual {v1}, Ll/᩸ۚۖ;->᩻()V

    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p0, Ll/᩵ۘۖ;->ܽ:Z

    return-void
.end method

.method public final ᩻()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 423
    :goto_0
    iget-object v2, p0, Ll/᩵ۘۖ;->֫:Ll/᩸ۚۖ;

    invoke-virtual {v2}, Ll/᩸ۚۖ;->ۧ()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 424
    invoke-virtual {v2, v1}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Ll/᩵ۘۖ;->ܽ(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 428
    :cond_1
    invoke-virtual {v2}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 429
    invoke-static {v2}, Ll/᩵ۘۖ;->ܽ(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method
