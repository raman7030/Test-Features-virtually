.class public final Ll/ۜ֨ۖ;
.super Ljava/lang/Object;
.source "P9QE"


# static fields
.field public static final synthetic ܳ:I


# instance fields
.field public ֫:Ljava/util/List;

.field public ۧ:Ljava/util/List;

.field public ܽ:Ljava/util/List;

.field public ܿ:Ljava/util/List;

.field public ᩳ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 663
    invoke-static {}, Ll/᩻֨ۖ;->ۧ()Ll/᩻֨ۖ;

    move-result-object v0

    .line 676
    invoke-virtual {v0}, Ll/᩻֨ۖ;->֫()Ll/ۜ֨ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 659
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 658
    invoke-direct {p0}, Ll/ۜ֨ۖ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۜ֨ۖ;)Ljava/util/List;
    .locals 0

    .line 658
    iget-object p0, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    return-object p0
.end method

.method public static ֫(Ll/ۜ֨ۖ;ILl/ۜ۠ۖ;)V
    .locals 2

    .line 658
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    sget-object v0, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    .line 823
    sget-object v1, Ll/᩻۠ۖ;->᩶:Ll/᩻۠ۖ;

    if-ne v0, v1, :cond_0

    .line 825
    iget-object p0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    .line 826
    :goto_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 827
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ll/᩻᩷ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_0

    .line 831
    :cond_0
    iget-object p0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۜۖ;

    .line 832
    invoke-virtual {p2, p1, v0}, Ll/᩻᩷ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۜ֨ۖ;Ljava/util/List;)V
    .locals 0

    .line 658
    iput-object p1, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;
    .locals 0

    .line 658
    iget-object p0, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ۜ֨ۖ;Ljava/util/List;)V
    .locals 0

    .line 658
    iput-object p1, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;
    .locals 0

    .line 658
    iget-object p0, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ۜ֨ۖ;Ljava/util/List;)V
    .locals 0

    .line 658
    iput-object p1, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    return-void
.end method

.method public static synthetic ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;
    .locals 0

    .line 658
    iget-object p0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ܿ(Ll/ۜ֨ۖ;Ljava/util/List;)V
    .locals 0

    .line 658
    iput-object p1, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;
    .locals 0

    .line 658
    iget-object p0, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/ۜ֨ۖ;Ljava/util/List;)V
    .locals 0

    .line 658
    iput-object p1, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 11

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 711
    :cond_0
    instance-of v1, p1, Ll/ۜ֨ۖ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 724
    :cond_1
    iget-object v1, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    iget-object v3, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    iget-object v4, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    iget-object v5, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    iget-object v6, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    const/4 v7, 0x5

    new-array v8, v7, [Ljava/lang/Object;

    aput-object v1, v8, v2

    aput-object v3, v8, v0

    const/4 v1, 0x2

    aput-object v4, v8, v1

    const/4 v3, 0x3

    aput-object v5, v8, v3

    const/4 v4, 0x4

    aput-object v6, v8, v4

    .line 714
    check-cast p1, Ll/ۜ֨ۖ;

    .line 724
    iget-object v5, p1, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    iget-object v6, p1, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    iget-object v9, p1, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    iget-object v10, p1, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    iget-object p1, p1, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v2

    aput-object v6, v7, v0

    aput-object v9, v7, v1

    aput-object v10, v7, v3

    aput-object p1, v7, v4

    .line 714
    invoke-static {v8, v7}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 724
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    iget-object v1, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    iget-object v2, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    iget-object v3, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    iget-object v4, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    .line 719
    invoke-static {v5}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫(I)I
    .locals 4

    .line 766
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 767
    invoke-static {p1, v2, v3}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    .line 769
    :cond_0
    iget-object v0, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    invoke-static {p1}, Ll/ܳ᩷ۖ;->ܿ(I)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    .line 772
    :cond_1
    iget-object v0, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    invoke-static {p1}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x8

    add-int/2addr v1, v2

    goto :goto_2

    .line 775
    :cond_2
    iget-object v0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜۖ;

    .line 776
    invoke-static {p1, v2}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_3

    .line 778
    :cond_3
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ֨ۖ;

    .line 1040
    invoke-static {p1}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    invoke-virtual {v2}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v2

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    goto :goto_4

    :cond_4
    return v1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 685
    iget-object v0, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    return-object v0
.end method

.method public final ֫(ILl/ۜ۠ۖ;)V
    .locals 2

    .line 797
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    check-cast p2, Ll/᩻᩷ۖ;

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0}, Ll/᩻᩷ۖ;->ۜ(IZLjava/util/List;)V

    .line 798
    iget-object v0, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    invoke-virtual {p2, p1, v1, v0}, Ll/᩻᩷ۖ;->ᩳ(IZLjava/util/List;)V

    .line 799
    iget-object v0, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    invoke-virtual {p2, p1, v1, v0}, Ll/᩻᩷ۖ;->ܿ(IZLjava/util/List;)V

    .line 800
    iget-object v0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, Ll/᩻᩷ۖ;->֫(ILjava/util/List;)V

    .line 38
    sget-object v0, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    .line 803
    :goto_0
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 804
    invoke-virtual {p2, p1}, Ll/᩻᩷ۖ;->ۧ(I)V

    .line 805
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֨ۖ;

    invoke-virtual {v0, p2}, Ll/ۢ֨ۖ;->ۧ(Ll/ۜ۠ۖ;)V

    .line 806
    invoke-virtual {p2, p1}, Ll/᩻᩷ۖ;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܳ᩷ۖ;)V
    .locals 2

    .line 790
    iget-object v0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜۖ;

    .line 791
    invoke-virtual {p2, p1, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۛۜۖ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(I)I
    .locals 5

    .line 843
    iget-object v0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜۖ;

    const/4 v3, 0x1

    .line 668
    invoke-static {v3}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    const/4 v4, 0x2

    mul-int/lit8 v3, v3, 0x2

    .line 669
    invoke-static {v4, p1}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v4

    add-int/2addr v4, v3

    const/4 v3, 0x3

    .line 670
    invoke-static {v3, v2}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v2

    add-int/2addr v2, v4

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 690
    iget-object v0, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ(ILl/ܳ᩷ۖ;)V
    .locals 3

    .line 746
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 747
    invoke-virtual {p2, p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    goto :goto_0

    .line 749
    :cond_0
    iget-object v0, p0, Ll/ۜ֨ۖ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 750
    invoke-virtual {p2, p1, v1}, Ll/ܳ᩷ۖ;->֫(II)V

    goto :goto_1

    .line 752
    :cond_1
    iget-object v0, p0, Ll/ۜ֨ۖ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 753
    invoke-virtual {p2, p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(IJ)V

    goto :goto_2

    .line 755
    :cond_2
    iget-object v0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜۖ;

    .line 756
    invoke-virtual {p2, p1, v1}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    goto :goto_3

    .line 758
    :cond_3
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢ֨ۖ;

    .line 759
    invoke-virtual {p2, p1, v1}, Ll/ܳ᩷ۖ;->֫(ILl/ۡ֡ۖ;)V

    goto :goto_4

    :cond_4
    return-void
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 703
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܽ:Ljava/util/List;

    return-object v0
.end method

.method public final ܿ()Ljava/util/List;
    .locals 1

    .line 680
    iget-object v0, p0, Ll/ۜ֨ۖ;->ܿ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/List;
    .locals 1

    .line 695
    iget-object v0, p0, Ll/ۜ֨ۖ;->ᩳ:Ljava/util/List;

    return-object v0
.end method
