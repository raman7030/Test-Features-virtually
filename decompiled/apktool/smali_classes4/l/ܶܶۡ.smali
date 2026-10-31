.class public final Ll/ܶܶۡ;
.super Ljava/lang/Object;
.source "B7EO"


# direct methods
.method public static ֫(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 4

    .line 258
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "base.apk"

    .line 259
    invoke-static {v1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 263
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "base-master.apk"

    .line 264
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;[Z)Ljava/util/ArrayList;
    .locals 4

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    array-length v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 100
    aget-boolean v3, p1, v2

    if-eqz v3, :cond_0

    .line 101
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܶۡ;

    invoke-virtual {v3}, Ll/۠ܶۡ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ll/ᩳܰۡ;)Ljava/util/ArrayList;
    .locals 3

    .line 211
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 212
    invoke-virtual {p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 213
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 214
    invoke-static {v1}, Ll/ܶܶۡ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 215
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 112
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 113
    invoke-static {p0}, Ll/ܶܶۡ;->֫(Ll/ᩳܰۡ;)Ljava/util/ArrayList;

    move-result-object v1

    .line 130
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 131
    invoke-static {v1}, Ll/ܶܶۡ;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 133
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 135
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-le v1, v2, :cond_1

    return-object p1

    .line 182
    :cond_1
    invoke-static {p0}, Ll/ܶܶۡ;->֫(Ll/ᩳܰۡ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Ll/ܶܶۡ;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_2

    .line 187
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 188
    invoke-virtual {p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 189
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-static {v3}, Ll/ܶܶۡ;->֫(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 191
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 194
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 196
    :try_start_0
    invoke-static {v1, p0}, Ll/ܶܶۡ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 197
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_7

    .line 120
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 122
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    .line 174
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".apk"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)Z
    .locals 3

    const/4 v0, 0x0

    .line 228
    :try_start_0
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->֨()I

    move-result v1

    if-nez v1, :cond_0

    .line 229
    invoke-virtual {p1, p0}, Ll/ᩳܰۡ;->ܿ(Ll/ۗ᩺ۡ;)Ll/ᩳܰۡ;

    move-result-object p0

    goto :goto_0

    .line 231
    :cond_0
    sget-object v1, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    const-string v2, ".apk"

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->᩻(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 232
    invoke-virtual {p1, p0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    .line 233
    new-instance p0, Ll/ᩳܰۡ;

    invoke-direct {p0, v0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 237
    :goto_0
    :try_start_1
    invoke-static {p0}, Ll/ܶܶۡ;->ۧ(Ll/ᩳܰۡ;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    :try_start_2
    invoke-virtual {p0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v0, :cond_1

    .line 241
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_1
    return p1

    :catchall_0
    move-exception p1

    .line 236
    :try_start_3
    invoke-virtual {p0}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    if-eqz v0, :cond_2

    .line 241
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 243
    :cond_2
    throw p0
.end method

.method public static ۧ(Ll/ᩳܰۡ;)Z
    .locals 6

    const-string v0, "AndroidManifest.xml"

    .line 142
    invoke-virtual {p0, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    .line 1757
    invoke-virtual {p0, v0, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object p0

    .line 147
    invoke-static {p0}, Ll/ܶۨۡ;->ۧ([B)Ll/ܶۨۡ;

    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0

    .line 99
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-ne v0, v3, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    const-string v0, "manifest"

    .line 149
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    .line 152
    :cond_4
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_6

    const-string v4, "split"

    .line 154
    invoke-virtual {p0, v3}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_5

    .line 159
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V

    return v1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V

    return v2

    :cond_7
    :goto_2
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V

    return v1

    :catchall_0
    move-exception v0

    .line 148
    :try_start_1
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0
.end method

.method public static ܽ(Ll/ᩳܰۡ;)Ljava/util/ArrayList;
    .locals 8

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-virtual {p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 57
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-static {v1}, Ll/ܶܶۡ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 70
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 71
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 75
    invoke-static {v1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 76
    new-instance v3, Ll/۠ܶۡ;

    .line 166
    invoke-static {v2}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "base-master"

    .line 167
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x1

    const-string v7, "base-master.apk"

    if-eqz v5, :cond_3

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v4, 0x1

    :goto_3
    const-string v5, "base.apk"

    .line 250
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    .line 79
    :cond_5
    :goto_4
    invoke-direct {v3, v1, v4, v6}, Ll/۠ܶۡ;-><init>(Ljava/lang/String;ZZ)V

    .line 76
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 83
    :cond_6
    new-instance p0, Ll/֨ܶۡ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method
