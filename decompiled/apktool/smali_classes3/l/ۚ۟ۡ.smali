.class public abstract Ll/ۚ۟ۡ;
.super Ljava/lang/Object;
.source "5AV2"

# interfaces
.implements Ll/᩹۟ۡ;
.implements Ll/۠۟ۡ;


# static fields
.field public static ۗ:Ljava/util/TimeZone;

.field public static ۙ:Ljava/util/Locale;

.field public static ᩶:Ljava/lang/String;

.field public static ᩸:I

.field public static ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 55
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, Ll/ۚ۟ۡ;->ۗ:Ljava/util/TimeZone;

    .line 56
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    sput-object v0, Ll/ۚ۟ۡ;->ۙ:Ljava/util/Locale;

    .line 65
    sget-object v0, Ll/ܰ۟ۡ;->᩻֫:Ll/ܰ۟ۡ;

    iget v0, v0, Ll/ܰ۟ۡ;->᩸:I

    .line 67
    sget-object v1, Ll/ܰ۟ۡ;->ܽ֫:Ll/ܰ۟ۡ;

    iget v1, v1, Ll/ܰ۟ۡ;->᩸:I

    or-int/2addr v0, v1

    .line 68
    sget-object v1, Ll/ܰ۟ۡ;->ܰ:Ll/ܰ۟ۡ;

    iget v1, v1, Ll/ܰ۟ۡ;->᩸:I

    or-int/2addr v0, v1

    .line 69
    sput v0, Ll/ۚ۟ۡ;->᩹:I

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 72
    sput-object v0, Ll/ۚ۟ۡ;->᩶:Ljava/lang/String;

    .line 78
    sget-object v0, Ll/᩷ۧܺ;->ۨ:Ll/᩷ۧܺ;

    iget v0, v0, Ll/᩷ۧܺ;->᩸:I

    .line 79
    sget-object v1, Ll/᩷ۧܺ;->᩺:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v0, v1

    .line 80
    sget-object v1, Ll/᩷ۧܺ;->ᩳ֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v0, v1

    .line 81
    sget-object v1, Ll/᩷ۧܺ;->ܰ:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v0, v1

    .line 84
    sput v0, Ll/ۚ۟ۡ;->᩸:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ֫(ILjava/lang/String;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 96
    :cond_0
    new-instance v1, Ll/ۨ۟ۡ;

    sget-object v2, Ll/᩻֫ܺ;->ᩳ:Ll/᩻֫ܺ;

    invoke-direct {v1, p1, v2, p0}, Ll/ۨ۟ۡ;-><init>(Ljava/lang/String;Ll/᩻֫ܺ;I)V

    .line 97
    invoke-virtual {v1, v0}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 99
    invoke-virtual {v1}, Ll/ۨ۟ۡ;->ᩳ()V

    .line 101
    invoke-virtual {v1}, Ll/ۨ۟ۡ;->close()V

    return-object p0
.end method

.method public static final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 602
    sget-object v0, Ll/᩻ۧܺ;->ۧ:Ll/᩻ۧܺ;

    const/4 v1, 0x0

    if-nez p0, :cond_0

    goto/16 :goto_6

    .line 616
    :cond_0
    instance-of v2, p0, Ll/ۚ۟ۡ;

    if-eqz v2, :cond_1

    .line 617
    check-cast p0, Ll/ۚ۟ۡ;

    return-object p0

    .line 620
    :cond_1
    instance-of v2, p0, Ljava/util/Map;

    if-eqz v2, :cond_6

    .line 621
    check-cast p0, Ljava/util/Map;

    .line 623
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    .line 626
    instance-of v2, p0, Ljava/util/LinkedHashMap;

    if-eqz v2, :cond_2

    .line 627
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    goto :goto_0

    .line 628
    :cond_2
    instance-of v2, p0, Ljava/util/TreeMap;

    if-eqz v2, :cond_3

    .line 629
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    goto :goto_0

    .line 631
    :cond_3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 633
    :goto_0
    new-instance v0, Ll/᩸۟ۡ;

    invoke-direct {v0, v2}, Ll/᩸۟ۡ;-><init>(Ljava/util/Map;)V

    .line 635
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 636
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 637
    sget v4, Ll/᩵ۧܺ;->֫:I

    if-nez v3, :cond_4

    move-object v3, v1

    goto :goto_2

    .line 174
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 638
    :goto_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 639
    invoke-virtual {v0, v3, v2}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    return-object v0

    .line 645
    :cond_6
    instance-of v2, p0, Ljava/util/Collection;

    if-eqz v2, :cond_8

    .line 646
    check-cast p0, Ljava/util/Collection;

    .line 648
    new-instance v0, Ll/֨۟ۡ;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ll/֨۟ۡ;-><init>(I)V

    .line 650
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 651
    invoke-static {v1}, Ll/ۚ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 652
    invoke-virtual {v0, v1}, Ll/֨۟ۡ;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    return-object v0

    .line 658
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 660
    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 661
    check-cast p0, Ljava/lang/Enum;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 664
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 665
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 667
    new-instance v1, Ll/֨۟ۡ;

    invoke-direct {v1, v0}, Ll/֨۟ۡ;-><init>(I)V

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v0, :cond_a

    .line 670
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    .line 671
    invoke-static {v3}, Ll/ۚ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 672
    invoke-virtual {v1, v3}, Ll/֨۟ۡ;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_a
    return-object v1

    .line 678
    :cond_b
    invoke-static {v2}, Ll/᩻֫ܺ;->֫(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_c

    return-object p0

    .line 682
    :cond_c
    invoke-virtual {v0, v2}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v0

    .line 683
    instance-of v2, v0, Ll/ۨ֫ܺ;

    if-eqz v2, :cond_e

    .line 684
    check-cast v0, Ll/ۨ֫ܺ;

    .line 686
    new-instance v1, Ll/᩸۟ۡ;

    invoke-direct {v1}, Ll/᩸۟ۡ;-><init>()V

    .line 688
    :try_start_0
    invoke-virtual {v0, p0}, Ll/ۨ֫ܺ;->֫(Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object p0

    .line 689
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 690
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :cond_d
    return-object v1

    :catch_0
    move-exception p0

    .line 693
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "toJSON error"

    .line 29
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 693
    throw v0

    :cond_e
    :goto_6
    return-object v1
.end method

.method public static final ֫(Ljava/lang/String;)Ll/᩸۟ۡ;
    .locals 3

    .line 88
    sget v0, Ll/ۚ۟ۡ;->᩹:I

    invoke-static {v0, p0}, Ll/ۚ۟ۡ;->֫(ILjava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    .line 148
    instance-of v1, p0, Ll/᩸۟ۡ;

    if-nez v1, :cond_2

    if-nez p0, :cond_0

    goto :goto_0

    .line 152
    :cond_0
    invoke-static {p0}, Ll/ۚ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸۟ۡ;

    .line 153
    sget-object v2, Ll/ܰ۟ۡ;->ܿ֫:Ll/ܰ۟ۡ;

    iget v2, v2, Ll/ܰ۟ۡ;->᩸:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "@type"

    invoke-virtual {v1, v0, p0}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-object v1

    .line 149
    :cond_2
    :goto_0
    check-cast p0, Ll/᩸۟ۡ;

    return-object p0
.end method

.method public static final varargs ֫(Ljava/lang/String;[Ll/ܰ۟ۡ;)Ll/᩸۟ۡ;
    .locals 6

    .line 116
    array-length v0, p1

    sget v1, Ll/ۚ۟ۡ;->᩹:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v1

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v5, p1, v3

    .line 117
    iget v5, v5, Ll/ܰ۟ۡ;->᩸:I

    or-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 120
    :cond_0
    invoke-static {v4, p0}, Ll/ۚ۟ۡ;->֫(ILjava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    .line 125
    instance-of v0, p0, Ll/᩸۟ۡ;

    if-eqz v0, :cond_1

    .line 126
    check-cast p0, Ll/᩸۟ۡ;

    return-object p0

    .line 129
    :cond_1
    invoke-static {p0}, Ll/ۚ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ۡ;

    .line 130
    sget-object v3, Ll/ܰ۟ۡ;->ܿ֫:Ll/ܰ۟ۡ;

    iget v3, v3, Ll/ܰ۟ۡ;->᩸:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_4

    .line 132
    array-length v3, p1

    :goto_2
    if-ge v2, v3, :cond_4

    aget-object v4, p1, v2

    .line 133
    sget-object v5, Ll/ܰ۟ۡ;->ܿ֫:Ll/ܰ۟ۡ;

    if-ne v4, v5, :cond_3

    const/4 v1, 0x1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "@type"

    invoke-virtual {v0, p1, p0}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    return-object v0
.end method

.method public static final ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 411
    sget-object v0, Ll/᩻ۧܺ;->ۧ:Ll/᩻ۧܺ;

    const/4 v1, 0x0

    new-array v1, v1, [Ll/᩷ۧܺ;

    .line 726
    new-instance v2, Ll/ۜۧܺ;

    sget v3, Ll/ۚ۟ۡ;->᩸:I

    invoke-direct {v2, v3, v1}, Ll/ۜۧܺ;-><init>(I[Ll/᩷ۧܺ;)V

    .line 729
    :try_start_0
    new-instance v1, Ll/ۛ֫ܺ;

    invoke-direct {v1, v2, v0}, Ll/ۛ֫ܺ;-><init>(Ll/ۜۧܺ;Ll/᩻ۧܺ;)V

    .line 771
    invoke-virtual {v1, p0}, Ll/ۛ֫ܺ;->֫(Ljava/lang/Object;)V

    .line 773
    invoke-virtual {v2}, Ll/ۜۧܺ;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 775
    invoke-virtual {v2}, Ll/ۜۧܺ;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v2}, Ll/ۜۧܺ;->close()V

    .line 776
    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 574
    invoke-virtual {p0}, Ll/ۚ۟ۡ;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Appendable;)V
    .locals 3

    .line 589
    new-instance v0, Ll/ۜۧܺ;

    sget v1, Ll/ۚ۟ۡ;->᩸:I

    sget-object v2, Ll/᩷ۧܺ;->۬:[Ll/᩷ۧܺ;

    invoke-direct {v0, v1, v2}, Ll/ۜۧܺ;-><init>(I[Ll/᩷ۧܺ;)V

    .line 591
    :try_start_0
    new-instance v1, Ll/ۛ֫ܺ;

    sget-object v2, Ll/᩻ۧܺ;->ۧ:Ll/᩻ۧܺ;

    invoke-direct {v1, v0, v2}, Ll/ۛ֫ܺ;-><init>(Ll/ۜۧܺ;Ll/᩻ۧܺ;)V

    invoke-virtual {v1, p0}, Ll/ۛ֫ܺ;->֫(Ljava/lang/Object;)V

    .line 592
    invoke-virtual {v0}, Ll/ۜۧܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 596
    invoke-virtual {v0}, Ll/ۜۧܺ;->close()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 594
    :try_start_1
    new-instance v1, Ll/ܶ۟ۡ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 29
    invoke-direct {v1, v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 594
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 596
    :goto_0
    invoke-virtual {v0}, Ll/ۜۧܺ;->close()V

    .line 597
    throw p1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 578
    new-instance v0, Ll/ۜۧܺ;

    sget v1, Ll/ۚ۟ۡ;->᩸:I

    sget-object v2, Ll/᩷ۧܺ;->۬:[Ll/᩷ۧܺ;

    invoke-direct {v0, v1, v2}, Ll/ۜۧܺ;-><init>(I[Ll/᩷ۧܺ;)V

    .line 580
    :try_start_0
    new-instance v1, Ll/ۛ֫ܺ;

    sget-object v2, Ll/᩻ۧܺ;->ۧ:Ll/᩻ۧܺ;

    invoke-direct {v1, v0, v2}, Ll/ۛ֫ܺ;-><init>(Ll/ۜۧܺ;Ll/᩻ۧܺ;)V

    .line 581
    invoke-virtual {v1, p0}, Ll/ۛ֫ܺ;->֫(Ljava/lang/Object;)V

    .line 582
    invoke-virtual {v0}, Ll/ۜۧܺ;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 584
    invoke-virtual {v0}, Ll/ۜۧܺ;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ۜۧܺ;->close()V

    .line 585
    throw v1
.end method
