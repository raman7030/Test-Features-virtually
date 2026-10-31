.class public final Ll/ۗۙ᩵;
.super Ll/֫ۗ᩵;


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 88
    invoke-static {v0, p0, p1, v0}, Ll/۟ۙ᩵;->֫(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result v1

    if-gez v1, :cond_0

    return-object p0

    .line 92
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-ge v2, v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v2

    .line 94
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v4

    if-ltz v5, :cond_4

    .line 96
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v5, 0x0

    .line 100
    :cond_2
    invoke-virtual {v4, p0, v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v5, v1, v2

    .line 102
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v1, v6, :cond_3

    add-int/2addr v1, v3

    .line 103
    invoke-static {v1, p0, p1, v0}, Ll/۟ۙ᩵;->֫(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result v1

    if-gtz v1, :cond_2

    .line 105
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v4, p0, v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 95
    :cond_4
    new-instance p0, Ljava/lang/OutOfMemoryError;

    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;[C)Ljava/util/List;
    .locals 5

    .line 1463
    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    .line 1464
    aget-char p1, p1, v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    .line 1489
    invoke-static {v0, p0, p1, v0}, Ll/۟ۙ᩵;->֫(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 1495
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    .line 1497
    :cond_0
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1498
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v1

    .line 1501
    invoke-static {v4, p0, p1, v0}, Ll/۟ۙ᩵;->֫(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result v1

    if-ne v1, v2, :cond_0

    .line 1504
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, v4, p1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3

    .line 1491
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 1341
    :cond_2
    new-instance v0, Ll/᩸ۙ᩵;

    new-instance v2, Ll/ܰۙ᩵;

    invoke-direct {v2, p1}, Ll/ܰۙ᩵;-><init>([C)V

    invoke-direct {v0, p0, v2}, Ll/᩸ۙ᩵;-><init>(Ljava/lang/String;Ll/ܰۙ᩵;)V

    .line 3051
    new-instance p1, Ll/᩵ۙ᩵;

    invoke-direct {p1, v0}, Ll/᩵ۙ᩵;-><init>(Ll/ܳۙ᩵;)V

    .line 1807
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ll/֫ܶ᩵;->֫(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1808
    invoke-virtual {p1}, Ll/᩵ۙ᩵;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 1809
    check-cast v2, Ll/ۙ᩶᩵;

    const-string v3, "range"

    .line 1467
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v2}, Ll/᩹᩶᩵;->getFirst()I

    move-result v3

    .line 56
    invoke-virtual {v2}, Ll/᩹᩶᩵;->getLast()I

    move-result v2

    add-int/2addr v2, v1

    .line 434
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1809
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    .locals 2

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    .line 10
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1183
    instance-of v0, p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1184
    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0, p0, p1, p2}, Ll/۟ۙ᩵;->ۧ(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result p0

    if-ltz p0, :cond_1

    goto :goto_0

    .line 1186
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, p1, v1, v0, p2}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)I

    move-result p0

    if-ltz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "<this>"

    .line 877
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 878
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-static {p0}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x2f

    invoke-static {p0, v0, v1}, Ll/֨ۙ᩵;->֫(CCZ)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 59
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 7

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffix"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 488
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 490
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int v1, p2, v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v6, 0x1

    const/4 v2, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v1 .. v6}, Ll/᩺ۙ᩵;->֫(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 2

    const/16 v0, 0x2e

    .line 1152
    invoke-static {p0}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;)I

    move-result v1

    .line 1156
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/CharSequence;)Z
    .locals 3

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1792
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 310
    invoke-static {v2}, Ll/֨ۙ᩵;->֫(C)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "delimiter"

    .line 467
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    .line 468
    invoke-static {v1, p0, p1, v0}, Ll/۟ۙ᩵;->ۧ(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p0

    .line 469
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "substring(...)"

    invoke-static {p0, p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 731
    new-instance v0, Ll/᩹ۙ᩵;

    invoke-direct {v0, p0}, Ll/᩹ۙ᩵;-><init>(Ljava/lang/CharSequence;)V

    .line 828
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_0

    .line 1557
    sget-object p0, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    goto :goto_1

    .line 830
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    .line 831
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 832
    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_1

    .line 833
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 834
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 835
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_1
    return-object p0
.end method

.method public static ܽ(Ljava/lang/CharSequence;)Z
    .locals 2

    const-string v0, "<this>"

    .line 871
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 872
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 v0, 0x9

    invoke-static {p0, v0, v1}, Ll/֨ۙ᩵;->֫(CCZ)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public static ܿ(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 731
    new-instance v1, Ll/᩹ۙ᩵;

    invoke-direct {v1, p0}, Ll/᩹ۙ᩵;-><init>(Ljava/lang/CharSequence;)V

    .line 828
    invoke-virtual {v1}, Ll/᩹ۙ᩵;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1557
    sget-object v1, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    goto :goto_1

    .line 830
    :cond_0
    invoke-virtual {v1}, Ll/᩹ۙ᩵;->next()Ljava/lang/Object;

    move-result-object v2

    .line 831
    invoke-virtual {v1}, Ll/᩹ۙ᩵;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 832
    invoke-static {v2}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    .line 833
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 834
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 835
    :goto_0
    invoke-virtual {v1}, Ll/᩹ۙ᩵;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ll/᩹ۙ᩵;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v1, v3

    .line 152
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 153
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .line 79
    invoke-static {v5}, Ll/ۗۙ᩵;->ۧ(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 153
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 155
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2}, Ll/֫ܶ᩵;->֫(Ljava/lang/Iterable;)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 157
    check-cast v4, Ljava/lang/String;

    .line 174
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    :goto_4
    const/4 v7, -0x1

    if-ge v5, v6, :cond_6

    .line 175
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 107
    invoke-static {v8}, Ll/֨ۙ᩵;->֫(C)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, -0x1

    :goto_5
    if-ne v5, v7, :cond_7

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    .line 80
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 157
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 2732
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 2733
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_9

    move-object v3, v4

    goto :goto_7

    .line 2734
    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    .line 2735
    :cond_a
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    .line 2736
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Comparable;

    .line 2737
    invoke-interface {v3, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v7

    if-lez v7, :cond_a

    move-object v3, v6

    goto :goto_6

    .line 81
    :cond_b
    :goto_7
    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_c

    .line 78
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_8

    :cond_c
    const/4 v2, 0x0

    .line 83
    :goto_8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 159
    invoke-static {v1}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result v3

    .line 161
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 164
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v5, 0x1

    if-ltz v5, :cond_12

    .line 162
    check-cast v7, Ljava/lang/String;

    if-eqz v5, :cond_d

    if-ne v5, v3, :cond_e

    .line 165
    :cond_d
    invoke-static {v7}, Ll/ۗۙ᩵;->ۧ(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_e

    move-object v5, v4

    goto :goto_b

    .line 0
    :cond_e
    invoke-static {v7, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz v2, :cond_11

    .line 347
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v5

    if-le v2, v5, :cond_f

    goto :goto_a

    :cond_f
    move v5, v2

    :goto_a
    invoke-virtual {v7, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v7, "substring(...)"

    invoke-static {v5, v7}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_b
    if-eqz v5, :cond_10

    .line 162
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    move v5, v8

    goto :goto_9

    :cond_11
    const-string p0, "Requested character count "

    const-string v0, " is less than zero."

    .line 0
    invoke-static {v2, p0, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 346
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 483
    :cond_12
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string v0, "Index overflow has happened."

    invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 172
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {v0, v6}, Ll/֫ܶ᩵;->֫(Ljava/lang/StringBuilder;Ljava/util/ArrayList;)V

    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 4

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1761
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-gt v1, v0, :cond_4

    if-nez v2, :cond_0

    move v3, v1

    goto :goto_1

    :cond_0
    move v3, v0

    .line 1766
    :goto_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 175
    invoke-static {v3}, Ll/֨ۙ᩵;->֫(C)Z

    move-result v3

    if-nez v2, :cond_2

    if-nez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 1781
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
