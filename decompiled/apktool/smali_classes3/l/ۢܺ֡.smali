.class public final Ll/ۢܺ֡;
.super Ljava/lang/Object;
.source "74MB"


# direct methods
.method public static ֫(Ljava/lang/String;C)I
    .locals 3

    .line 6885
    invoke-static {p0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 6890
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 6891
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne p1, v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I
    .locals 2

    if-eqz p1, :cond_5

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    .line 1620
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    if-le p2, v0, :cond_2

    goto :goto_1

    .line 1624
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3

    return p2

    :cond_3
    :goto_0
    if-ge p2, v0, :cond_5

    .line 1628
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {p2, v1, p1, p0}, Ll/᩻ܺ֡;->֫(IILjava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    return p2

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(CI)Ljava/lang/String;
    .locals 1

    if-gtz p1, :cond_0

    const-string p0, ""

    return-object p0

    .line 6231
    :cond_0
    new-array v0, p1, [C

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 6233
    aput-char p0, v0, p1

    goto :goto_0

    .line 6235
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-gtz p0, :cond_1

    const-string p0, ""

    return-object p0

    .line 6146
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_8

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    const/16 v3, 0x2000

    if-gt p0, v3, :cond_3

    .line 6151
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1, p0}, Ll/ۢܺ֡;->֫(CI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    mul-int v3, v0, p0

    if-eq v0, v1, :cond_7

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    .line 6168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_0
    if-ge v2, p0, :cond_4

    .line 6170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6172
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6159
    :cond_5
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 6160
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    .line 6161
    new-array v1, v3, [C

    mul-int/lit8 p0, p0, 0x2

    sub-int/2addr p0, v4

    :goto_1
    if-ltz p0, :cond_6

    .line 6163
    aput-char v0, v1, p0

    add-int/lit8 v2, p0, 0x1

    .line 6164
    aput-char p1, v1, v2

    add-int/lit8 p0, p0, -0x2

    goto :goto_1

    .line 6166
    :cond_6
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 6157
    :cond_7
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1, p0}, Ll/ۢܺ֡;->֫(CI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    :goto_2
    return-object p1
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    goto :goto_0

    .line 4718
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 4653
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_2

    return-object v1

    .line 4656
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 4657
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    .line 4658
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 4662
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x100

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    if-eqz v0, :cond_4

    .line 4664
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4667
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4669
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4671
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4673
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 4676
    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_2

    .line 849
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    .line 860
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const-string v2, "/"

    invoke-virtual {v2, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 864
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 5499
    invoke-static {p0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {p1}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p2, :cond_4

    const/4 v0, 0x0

    .line 5508
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_2

    .line 5512
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 5513
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v3

    if-gez v4, :cond_1

    const/4 v4, 0x0

    :cond_1
    mul-int/lit8 v4, v4, 0x10

    .line 5516
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v4

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, -0x1

    :goto_0
    if-eq v1, v2, :cond_3

    .line 5518
    invoke-virtual {v5, p0, v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v0, v1, v3

    add-int/2addr v4, v2

    if-nez v4, :cond_2

    goto :goto_1

    .line 5523
    :cond_2
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    goto :goto_0

    .line 5525
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v5, p0, v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 5526
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_4
    :goto_2
    return-object p0
.end method

.method public static ֫(Ljava/util/Collection;C)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    goto :goto_0

    .line 4697
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 4609
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_2

    return-object v1

    .line 4612
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 4613
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    .line 4614
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 4618
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x100

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    if-eqz v0, :cond_4

    .line 4620
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4623
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4624
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4625
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4627
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 4631
    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4523
    :cond_0
    array-length v0, p0

    if-gtz v0, :cond_1

    const-string p0, ""

    return-object p0

    .line 4576
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x10

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    if-lez v2, :cond_2

    const-string v3, "\n \n"

    .line 4580
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4582
    :cond_2
    aget-object v3, p0, v2

    if-eqz v3, :cond_3

    .line 4583
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4586
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([Ljava/lang/Object;C)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 3878
    :cond_0
    array-length v0, p0

    if-gtz v0, :cond_1

    const-string p0, ""

    return-object p0

    .line 4140
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x10

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    if-lez v2, :cond_2

    .line 4143
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4145
    :cond_2
    aget-object v3, p0, v2

    if-eqz v3, :cond_3

    .line 4146
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4149
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 210
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    .line 2010
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 2011
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v2, :cond_2

    .line 2013
    invoke-static {v3, v1, p0, p1}, Ll/᩻ܺ֡;->֫(IILjava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p0, :cond_0

    goto :goto_0

    .line 8631
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_1

    return v0

    .line 8634
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v0, v1

    .line 8635
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v0, v1, p1, p0}, Ll/᩻ܺ֡;->֫(IILjava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    if-nez p1, :cond_3

    if-nez p0, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    return v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_2

    .line 804
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eq v1, v0, :cond_1

    .line 815
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const-string v3, "/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 819
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static ۧ(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p0, :cond_0

    goto :goto_0

    .line 8518
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_1

    return v0

    .line 8521
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v0, v1, p1, p0}, Ll/᩻ܺ֡;->֫(IILjava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    if-nez p1, :cond_3

    if-nez p0, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    return v0
.end method
