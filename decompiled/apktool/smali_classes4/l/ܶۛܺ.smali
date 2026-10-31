.class public final Ll/ܶۛܺ;
.super Ljava/lang/Object;
.source "T5OR"


# direct methods
.method public static ֫(Ljava/util/Set;)I
    .locals 2

    .line 1865
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1866
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    not-int v0, v0

    not-int v0, v0

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ֫(I)Ljava/util/HashSet;
    .locals 5

    .line 266
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    if-ge p0, v1, :cond_0

    const-string v1, "expectedSize"

    .line 285
    invoke-static {p0, v1}, Ll/᩹ۙܺ;->֫(ILjava/lang/String;)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    if-ge p0, v1, :cond_1

    int-to-double v1, p0

    const-wide/high16 v3, 0x3fe8000000000000L    # 0.75

    div-double/2addr v1, v3

    .line 301
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int p0, v1

    goto :goto_0

    :cond_1
    const p0, 0x7fffffff

    .line 266
    :goto_0
    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(I)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Set;Ll/ᩴܶܺ;)Ljava/util/Set;
    .locals 1

    .line 1147
    instance-of v0, p0, Ljava/util/SortedSet;

    if-eqz v0, :cond_1

    .line 1148
    check-cast p0, Ljava/util/SortedSet;

    .line 1187
    instance-of v0, p0, Ll/֡ۛܺ;

    if-eqz v0, :cond_0

    .line 1190
    check-cast p0, Ll/֡ۛܺ;

    .line 1191
    iget-object v0, p0, Ll/۫ۙܺ;->᩸:Ll/ᩴܶܺ;

    invoke-static {v0, p1}, Ll/֡ܶܺ;->֫(Ll/ᩴܶܺ;Ll/ᩴܶܺ;)Ll/ᩴܶܺ;

    move-result-object p1

    .line 1192
    new-instance v0, Ll/ۚۛܺ;

    iget-object p0, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    check-cast p0, Ljava/util/SortedSet;

    .line 1239
    invoke-direct {v0, p0, p1}, Ll/۫ۙܺ;-><init>(Ljava/util/Collection;Ll/ᩴܶܺ;)V

    return-object v0

    .line 1195
    :cond_0
    new-instance v0, Ll/ۚۛܺ;

    .line 1239
    invoke-direct {v0, p0, p1}, Ll/۫ۙܺ;-><init>(Ljava/util/Collection;Ll/ᩴܶܺ;)V

    return-object v0

    .line 1150
    :cond_1
    instance-of v0, p0, Ll/֡ۛܺ;

    if-eqz v0, :cond_2

    .line 1153
    check-cast p0, Ll/֡ۛܺ;

    .line 1154
    iget-object v0, p0, Ll/۫ۙܺ;->᩸:Ll/ᩴܶܺ;

    invoke-static {v0, p1}, Ll/֡ܶܺ;->֫(Ll/ᩴܶܺ;Ll/ᩴܶܺ;)Ll/ᩴܶܺ;

    move-result-object p1

    .line 1155
    new-instance v0, Ll/֡ۛܺ;

    iget-object p0, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    check-cast p0, Ljava/util/Set;

    .line 1239
    invoke-direct {v0, p0, p1}, Ll/۫ۙܺ;-><init>(Ljava/util/Collection;Ll/ᩴܶܺ;)V

    return-object v0

    .line 1158
    :cond_2
    new-instance v0, Ll/֡ۛܺ;

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1239
    invoke-direct {v0, p0, p1}, Ll/۫ۙܺ;-><init>(Ljava/util/Collection;Ll/ᩴܶܺ;)V

    return-object v0
.end method

.method public static varargs ֫(Ljava/lang/Enum;[Ljava/lang/Enum;)Ll/ۛ۬ܺ;
    .locals 0

    .line 107
    invoke-static {p0, p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p0

    invoke-static {p0}, Ll/۟ۗܺ;->֫(Ljava/util/EnumSet;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Set;Ll/ۛ۬ܺ;)Ll/۠ۛܺ;
    .locals 1

    const-string v0, "set1"

    .line 912
    invoke-static {p0, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set2"

    .line 913
    invoke-static {p1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 915
    new-instance v0, Ll/᩵ۛܺ;

    invoke-direct {v0, p0, p1}, Ll/᩵ۛܺ;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 1879
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 1880
    check-cast p1, Ljava/util/Set;

    .line 1883
    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_1
    const/4 p0, 0x0

    return p0
.end method
