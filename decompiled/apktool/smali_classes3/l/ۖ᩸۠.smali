.class public final Ll/ۖ᩸۠;
.super Ll/᩷۠۠;
.source "C420"


# instance fields
.field public final ۜ:Ll/ۛ᩸֨;

.field public final ܳ:Ll/᩷ۚ֨;

.field public final ܽ:Ll/ۛ۠۠;

.field public ܿ:Ll/֨ܶ֨;

.field public ᩳ:Ll/ۜ᩸۠;

.field public ᩷:Ljava/util/EnumMap;

.field public ᩻:Ll/۫᩸֨;


# direct methods
.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 7

    .line 98
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܶ۠;->ᩳ()Ll/۬ۖ֨;

    move-result-object v0

    check-cast v0, Ll/ܺ֨۠;

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object v0, p0, Ll/᩷۠۠;->ۧ:Ll/ܺ֨۠;

    .line 62
    new-instance v1, Ll/ۜ۠۠;

    invoke-interface {v0}, Ll/۬ۖ֨;->getConfiguration()Ll/ۙۖ֨;

    .line 110
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object v1, p0, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    .line 458
    new-instance v1, Ll/ܳ᩸۠;

    invoke-direct {v1, p0}, Ll/ܳ᩸۠;-><init>(Ll/ۖ᩸۠;)V

    iput-object v1, p0, Ll/ۖ᩸۠;->᩻:Ll/۫᩸֨;

    .line 609
    new-instance v1, Ll/᩻᩸۠;

    invoke-direct {v1, p0}, Ll/᩻᩸۠;-><init>(Ll/ۖ᩸۠;)V

    iput-object v1, p0, Ll/ۖ᩸۠;->ܿ:Ll/֨ܶ֨;

    .line 99
    new-instance v1, Ll/ۡ᩸۠;

    invoke-direct {v1, p0}, Ll/ۡ᩸۠;-><init>(Ll/ۖ᩸۠;)V

    .line 522
    iput-object v1, v0, Ll/ܺ֨۠;->ܿ:Ll/ܰᩴ֨;

    .line 100
    invoke-static {p1}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object v1

    iput-object v1, p0, Ll/ۖ᩸۠;->ܳ:Ll/᩷ۚ֨;

    .line 101
    invoke-static {p1}, Ll/ۛ۠۠;->֫(Ll/ۗ֨۠;)Ll/ۛ۠۠;

    move-result-object v1

    iput-object v1, p0, Ll/ۖ᩸۠;->ܽ:Ll/ۛ۠۠;

    .line 102
    invoke-static {p1}, Ll/ۛ᩸֨;->֫(Ll/ۗ֨۠;)Ll/ۛ᩸֨;

    move-result-object v1

    iput-object v1, p0, Ll/ۖ᩸۠;->ۜ:Ll/ۛ᩸֨;

    .line 103
    invoke-static {p1}, Ll/ܳܶ۠;->֫(Ll/ۗ֨۠;)Ll/ܳܶ۠;

    .line 104
    new-instance v1, Ljava/util/EnumMap;

    const-class v2, Ll/ܺ᩸۠;

    invoke-direct {v1, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v1, p0, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    .line 105
    new-instance v1, Ll/ۢ᩸۠;

    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object p1

    .line 653
    invoke-virtual {v0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    .line 110
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 0
    instance-of v0, v0, Ll/ܿ᩸۠;

    if-eqz v0, :cond_0

    .line 654
    const-class v0, Ll/᩷᩸۠;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_0

    .line 655
    :cond_0
    sget-object v0, Ll/᩷᩸۠;->᩹:Ll/᩷᩸۠;

    sget-object v2, Ll/᩷᩸۠;->ۙ:Ll/᩷᩸۠;

    sget-object v3, Ll/᩷᩸۠;->᩶:Ll/᩷᩸۠;

    invoke-static {v0, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    :goto_0
    iput-object v0, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    const-string v0, "diags.formatterOptions"

    .line 658
    invoke-virtual {p1, v0}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    const-string v2, ","

    .line 660
    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v2, p1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_7

    aget-object v4, p1, v3

    const-string v5, "-where"

    .line 661
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 662
    iget-object v5, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    sget-object v6, Ll/᩷᩸۠;->ۙ:Ll/᩷᩸۠;

    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    const-string v5, "where"

    .line 664
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 665
    iget-object v5, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    sget-object v6, Ll/᩷᩸۠;->ۙ:Ll/᩷᩸۠;

    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    const-string v5, "-simpleNames"

    .line 667
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 668
    iget-object v5, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    sget-object v6, Ll/᩷᩸۠;->᩹:Ll/᩷᩸۠;

    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    const-string v5, "simpleNames"

    .line 670
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 671
    iget-object v5, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    sget-object v6, Ll/᩷᩸۠;->᩹:Ll/᩷᩸۠;

    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    const-string v5, "-disambiguateTvars"

    .line 673
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 674
    iget-object v4, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    sget-object v5, Ll/᩷᩸۠;->᩶:Ll/᩷᩸۠;

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    const-string v5, "disambiguateTvars"

    .line 676
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 677
    iget-object v4, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    sget-object v5, Ll/᩷᩸۠;->᩶:Ll/᩷᩸۠;

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 105
    :cond_7
    iput-object v1, p0, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    .line 106
    invoke-static {}, Ll/ܺ᩸۠;->values()[Ll/ܺ᩸۠;

    move-result-object p1

    array-length v1, p1

    :goto_5
    if-ge v0, v1, :cond_8

    aget-object v2, p1, v0

    .line 107
    iget-object v3, p0, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v3, v2, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public static ֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I
    .locals 4

    .line 226
    iget-object p0, p0, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    invoke-virtual {p0, p2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x1

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 227
    iget-object v2, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v3, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v2, v3, :cond_1

    return v0

    .line 230
    :cond_1
    sget-object v2, Ll/ܺ᩸۠;->ۗ:Ll/ܺ᩸۠;

    if-ne p2, v2, :cond_2

    .line 231
    invoke-virtual {v1}, Ll/ۙ֨֨;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۙ֨֨;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۖ᩸۠;
    .locals 1

    .line 91
    const-class v0, Ll/ۖ᩸۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩸۠;

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Ll/ۖ᩸۠;

    invoke-direct {v0, p0}, Ll/ۖ᩸۠;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final getConfiguration()Ll/ۙۖ֨;
    .locals 1

    .line 640
    iget-object v0, p0, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    check-cast v0, Ll/ۢ᩸۠;

    return-object v0
.end method

.method public final ֫(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 134
    new-instance v0, Ll/ۜ᩸۠;

    invoke-direct {v0}, Ll/ۜ᩸۠;-><init>()V

    iput-object v0, p0, Ll/ۖ᩸۠;->ᩳ:Ll/ۜ᩸۠;

    .line 135
    invoke-virtual {p0, p1}, Ll/ۖ᩸۠;->֫(Ll/ܽܶ۠;)V

    .line 90
    iget-object v0, p0, Ll/᩷۠۠;->ۧ:Ll/ܺ֨۠;

    invoke-interface {v0, p1, p2}, Ll/۬ۖ֨;->֫(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 183
    instance-of v0, p1, Ll/ۙ֨֨;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۙ֨֨;

    .line 455
    iget-object v0, p0, Ll/ۖ᩸۠;->᩻:Ll/۫᩸֨;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4980
    invoke-virtual {p1, v0, v1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 186
    :cond_0
    instance-of v0, p1, Ll/ۛ֡֨;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۛ֡֨;

    .line 606
    iget-object v0, p0, Ll/ۖ᩸۠;->ܿ:Ll/֨ܶ֨;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4927
    invoke-virtual {p1, v0, v1}, Ll/ۛ֡֨;->֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;

    return-void

    .line 189
    :cond_1
    instance-of v0, p1, Ll/ܽܶ۠;

    if-eqz v0, :cond_2

    check-cast p1, Ll/ܽܶ۠;

    .line 190
    invoke-virtual {p0, p1}, Ll/ۖ᩸۠;->֫(Ll/ܽܶ۠;)V

    return-void

    .line 192
    :cond_2
    instance-of v0, p1, Ljava/lang/Iterable;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    instance-of p1, p1, Ll/᩷۠ᩴ;

    if-nez p1, :cond_3

    .line 193
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 194
    invoke-virtual {p0, v0}, Ll/ۖ᩸۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ܽܶ۠;)V
    .locals 4

    .line 165
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 167
    invoke-virtual {p0, v3}, Ll/ۖ᩸۠;->֫(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 0
    :cond_1
    instance-of v0, p1, Ll/᩺۠۠;

    if-eqz v0, :cond_2

    .line 171
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۡ()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽܶ۠;

    .line 172
    invoke-virtual {p0, v0}, Ll/ۖ᩸۠;->֫(Ll/ܽܶ۠;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ۧ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 12

    .line 112
    iget-object v0, p0, Ll/᩷۠۠;->ۧ:Ll/ܺ֨۠;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    new-instance v2, Ll/ۜ᩸۠;

    invoke-direct {v2}, Ll/ۜ᩸۠;-><init>()V

    iput-object v2, p0, Ll/ۖ᩸۠;->ᩳ:Ll/ۜ᩸۠;

    .line 114
    invoke-static {}, Ll/ܺ᩸۠;->values()[Ll/ܺ᩸۠;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    iget-object v6, p0, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    if-ge v5, v3, :cond_0

    aget-object v7, v2, v5

    .line 115
    invoke-virtual {v6, v7}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->clear()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۖ᩸۠;->֫(Ll/ܽܶ۠;)V

    .line 117
    invoke-virtual {v0, p1, p2}, Ll/ܺ֨۠;->ܽ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    iget-object p1, p0, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    check-cast p1, Ll/ۢ᩸۠;

    .line 118
    sget-object v2, Ll/᩷᩸۠;->ۙ:Ll/᩷᩸۠;

    .line 712
    iget-object p1, p1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 206
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    .line 207
    invoke-static {}, Ll/ܺ᩸۠;->values()[Ll/ܺ᩸۠;

    move-result-object v2

    array-length v3, v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_4

    aget-object v7, v2, v5

    .line 208
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v8

    .line 209
    invoke-virtual {v6, v7}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 210
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܽܶ۠;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v11, Ll/ۖܶ۠;

    invoke-direct {v11, v10, v8}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    move-object v8, v11

    goto :goto_2

    .line 212
    :cond_1
    invoke-virtual {v8}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_3

    .line 213
    invoke-virtual {v7}, Ll/ܺ᩸۠;->֫()Ljava/lang/String;

    move-result-object v9

    .line 218
    invoke-virtual {v8}, Ll/ۖܶ۠;->ۧ()I

    move-result v10

    const/4 v11, 0x1

    if-le v10, v11, :cond_2

    const-string v10, ".1"

    .line 0
    invoke-static {v9, v10}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 216
    :cond_2
    invoke-virtual {v6, v7}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    new-array v10, v11, [Ljava/lang/Object;

    aput-object v7, v10, v4

    iget-object v7, p0, Ll/ۖ᩸۠;->ܽ:Ll/ۛ۠۠;

    invoke-virtual {v7, v9, v10}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v7

    .line 217
    new-instance v9, Ll/᩺۠۠;

    invoke-virtual {v8}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v8

    invoke-direct {v9, v7, v8}, Ll/᩺۠۠;-><init>(Ll/ܽܶ۠;Ll/ۖܶ۠;)V

    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v7, Ll/ۖܶ۠;

    invoke-direct {v7, v9, p1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    move-object p1, v7

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 221
    :cond_4
    invoke-virtual {p1}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p1

    .line 0
    instance-of v2, v0, Ll/ܿ᩸۠;

    if-eqz v2, :cond_5

    const-string v2, ""

    goto :goto_3

    :cond_5
    const/4 v2, 0x2

    .line 121
    invoke-static {v2}, Ll/ܺ֨۠;->֫(I)Ljava/lang/String;

    move-result-object v2

    .line 122
    :goto_3
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽܶ۠;

    .line 123
    invoke-virtual {v0, v3, p2}, Ll/ܺ֨۠;->ܽ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 124
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_6

    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\n"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 129
    :cond_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
