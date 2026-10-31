.class public final Ll/᩸ۨܺ;
.super Ll/ۜۙܺ;
.source "O5F3"


# instance fields
.field public final ۙ:Ll/ܰۤܺ;

.field public final ᩶:Ljava/util/NavigableMap;

.field public final ᩸:Ll/ܰۤܺ;

.field public final ᩹:Ljava/util/NavigableMap;


# direct methods
.method public constructor <init>(Ll/ܰۤܺ;Ll/ܰۤܺ;Ljava/util/NavigableMap;)V
    .locals 0

    .line 3586
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    iput-object p1, p0, Ll/᩸ۨܺ;->᩸:Ll/ܰۤܺ;

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    iput-object p2, p0, Ll/᩸ۨܺ;->ۙ:Ll/ܰۤܺ;

    .line 902
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    iput-object p3, p0, Ll/᩸ۨܺ;->᩹:Ljava/util/NavigableMap;

    .line 701
    new-instance p1, Ll/ۚۨܺ;

    invoke-direct {p1, p3}, Ll/ۚۨܺ;-><init>(Ljava/util/NavigableMap;)V

    iput-object p1, p0, Ll/᩸ۨܺ;->᩶:Ljava/util/NavigableMap;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܰۤܺ;Ll/ܰۤܺ;Ljava/util/NavigableMap;I)V
    .locals 0

    .line 677
    invoke-direct {p0, p1, p2, p3}, Ll/᩸ۨܺ;-><init>(Ll/ܰۤܺ;Ll/ܰۤܺ;Ljava/util/NavigableMap;)V

    return-void
.end method

.method private ֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;
    .locals 3

    .line 705
    iget-object v0, p0, Ll/᩸ۨܺ;->᩸:Ll/ܰۤܺ;

    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->ܽ(Ll/ܰۤܺ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 706
    invoke-static {}, Ll/ᩳ۫ܺ;->of()Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1

    .line 708
    :cond_0
    new-instance v1, Ll/᩸ۨܺ;

    .line 709
    invoke-virtual {v0, p1}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object p1

    iget-object v0, p0, Ll/᩸ۨܺ;->ۙ:Ll/ܰۤܺ;

    iget-object v2, p0, Ll/᩸ۨܺ;->᩹:Ljava/util/NavigableMap;

    invoke-direct {v1, p1, v0, v2}, Ll/᩸ۨܺ;-><init>(Ll/ܰۤܺ;Ll/ܰۤܺ;Ljava/util/NavigableMap;)V

    return-object v1
.end method

.method public static synthetic ֫(Ll/᩸ۨܺ;)Ll/ܰۤܺ;
    .locals 0

    .line 677
    iget-object p0, p0, Ll/᩸ۨܺ;->ۙ:Ll/ܰۤܺ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩸ۨܺ;)Ll/ܰۤܺ;
    .locals 0

    .line 677
    iget-object p0, p0, Ll/᩸ۨܺ;->᩸:Ll/ܰۤܺ;

    return-object p0
.end method


# virtual methods
.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    return-object v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 741
    invoke-virtual {p0, p1}, Ll/᩸ۨܺ;->get(Ljava/lang/Object;)Ll/ܰۤܺ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 677
    invoke-virtual {p0, p1}, Ll/᩸ۨܺ;->get(Ljava/lang/Object;)Ll/ܰۤܺ;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ll/ܰۤܺ;
    .locals 4

    .line 746
    iget-object v0, p0, Ll/᩸ۨܺ;->ۙ:Ll/ܰۤܺ;

    instance-of v1, p1, Ll/ۘۗܺ;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 749
    :try_start_0
    check-cast p1, Ll/ۘۗܺ;

    .line 750
    iget-object v1, p0, Ll/᩸ۨܺ;->᩸:Ll/ܰۤܺ;

    invoke-virtual {v1, p1}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 751
    invoke-virtual {p1, v1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v1

    if-ltz v1, :cond_3

    iget-object v1, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 752
    invoke-virtual {p1, v1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v1

    if-ltz v1, :cond_0

    goto :goto_1

    .line 754
    :cond_0
    iget-object v1, v0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {p1, v1}, Ll/ۘۗܺ;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Ll/᩸ۨܺ;->᩹:Ljava/util/NavigableMap;

    if-eqz v1, :cond_2

    .line 756
    :try_start_1
    invoke-interface {v3, p1}, Ljava/util/NavigableMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_1

    move-object p1, v2

    goto :goto_0

    .line 3788
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 756
    :goto_0
    check-cast p1, Ll/ܰۤܺ;

    if-eqz p1, :cond_3

    .line 757
    iget-object v1, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v3, v0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v1, v3}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v1

    if-lez v1, :cond_3

    .line 758
    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object p1

    return-object p1

    .line 761
    :cond_2
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۤܺ;

    if-eqz p1, :cond_3

    .line 763
    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    :cond_3
    :goto_1
    return-object v2
.end method

.method public final headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 677
    check-cast p1, Ll/ۘۗܺ;

    .line 726
    invoke-static {p2}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩸ۨܺ;->֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 853
    invoke-virtual {p0}, Ll/᩸ۨܺ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ۫ܺ;->ܽ(Ljava/util/Iterator;)I

    move-result v0

    return v0
.end method

.method public final subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 677
    check-cast p1, Ll/ۘۗܺ;

    check-cast p3, Ll/ۘۗܺ;

    .line 719
    invoke-static {p2}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p2

    .line 721
    invoke-static {p4}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p4

    .line 717
    invoke-static {p1, p2, p3, p4}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;Ll/ۘۙܺ;Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;

    move-result-object p1

    .line 716
    invoke-direct {p0, p1}, Ll/᩸ۨܺ;->֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 677
    check-cast p1, Ll/ۘۗܺ;

    .line 731
    invoke-static {p2}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩸ۨܺ;->֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/util/Iterator;
    .locals 6

    .line 775
    iget-object v0, p0, Ll/᩸ۨܺ;->ۙ:Ll/ܰۤܺ;

    invoke-virtual {v0}, Ll/ܰۤܺ;->֫()Z

    move-result v1

    iget-object v2, v0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    if-eqz v1, :cond_0

    .line 92
    sget-object v0, Ll/֡۫ܺ;->ۙ:Ll/ۙۨܺ;

    return-object v0

    .line 779
    :cond_0
    iget-object v1, p0, Ll/᩸ۨܺ;->᩸:Ll/ܰۤܺ;

    iget-object v3, v1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v4, v1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v3, v2}, Ll/ۘۗܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 92
    sget-object v0, Ll/֡۫ܺ;->ۙ:Ll/ۙۨܺ;

    return-object v0

    .line 781
    :cond_1
    invoke-virtual {v4, v2}, Ll/ۘۗܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    .line 783
    iget-object v3, p0, Ll/᩸ۨܺ;->᩶:Ljava/util/NavigableMap;

    .line 784
    check-cast v3, Ll/ۚۨܺ;

    invoke-virtual {v3, v2, v5}, Ll/ۚۨܺ;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    goto :goto_0

    .line 790
    :cond_2
    invoke-virtual {v4}, Ll/ۘۗܺ;->֫()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ll/ۘۗܺ;

    .line 360
    invoke-virtual {v4}, Ll/ۘۗܺ;->ۧ()Ll/ۘۙܺ;

    move-result-object v3

    .line 791
    sget-object v4, Ll/ۘۙܺ;->᩶:Ll/ۘۙܺ;

    if-ne v3, v4, :cond_3

    const/4 v5, 0x1

    .line 789
    :cond_3
    iget-object v3, p0, Ll/᩸ۨܺ;->᩹:Ljava/util/NavigableMap;

    invoke-interface {v3, v2, v5}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object v2

    .line 792
    invoke-interface {v2}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v2

    .line 793
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 172
    :goto_0
    sget-object v3, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 796
    iget-object v1, v1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v0, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 797
    invoke-static {v0}, Ll/ۘۗܺ;->ܽ(Ljava/lang/Comparable;)Ll/ۖۗܺ;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Ll/ۤۤܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۗܺ;

    .line 798
    new-instance v1, Ll/۠ۨܺ;

    invoke-direct {v1, p0, v2, v0}, Ll/۠ۨܺ;-><init>(Ll/᩸ۨܺ;Ljava/util/Iterator;Ll/ۘۗܺ;)V

    return-object v1
.end method

.method public final ۧ()Ljava/util/Iterator;
    .locals 3

    .line 817
    iget-object v0, p0, Ll/᩸ۨܺ;->ۙ:Ll/ܰۤܺ;

    invoke-virtual {v0}, Ll/ܰۤܺ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 92
    sget-object v0, Ll/֡۫ܺ;->ۙ:Ll/ۙۨܺ;

    return-object v0

    .line 172
    :cond_0
    sget-object v1, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 821
    iget-object v2, p0, Ll/᩸ۨܺ;->᩸:Ll/ܰۤܺ;

    iget-object v2, v2, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v0, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 822
    invoke-static {v0}, Ll/ۘۗܺ;->ܽ(Ljava/lang/Comparable;)Ll/ۖۗܺ;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ll/ۤۤܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۗܺ;

    .line 826
    invoke-virtual {v0}, Ll/ۘۗܺ;->֫()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ll/ۘۗܺ;

    .line 827
    invoke-virtual {v0}, Ll/ۘۗܺ;->ܿ()Ll/ۘۙܺ;

    move-result-object v0

    sget-object v2, Ll/ۘۙܺ;->᩶:Ll/ۘۙܺ;

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 825
    :goto_0
    iget-object v2, p0, Ll/᩸ۨܺ;->᩹:Ljava/util/NavigableMap;

    invoke-interface {v2, v1, v0}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object v0

    .line 828
    invoke-interface {v0}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v0

    .line 829
    invoke-interface {v0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 830
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 831
    new-instance v1, Ll/ܶۨܺ;

    invoke-direct {v1, p0, v0}, Ll/ܶۨܺ;-><init>(Ll/᩸ۨܺ;Ljava/util/Iterator;)V

    return-object v1
.end method
