.class public final Ll/᩻᩺ܳ;
.super Ll/֫ۜܳ;
.source "E29Y"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 308
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 310
    new-instance p0, Ljava/io/File;

    sget-object v1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 312
    :cond_0
    invoke-static {p0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static ֫(Ljava/util/List;Ll/᩶۫᩷;)Ljava/util/ArrayList;
    .locals 4

    .line 321
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 322
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 323
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 324
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 325
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩻᩺ܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 328
    :cond_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    .line 331
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶᩶ܿ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 334
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_2

    .line 336
    invoke-static {v2}, Ll/᩶᩶ܿ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 337
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    :cond_2
    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object p1
.end method

.method public static ֫(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 365
    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/۟᩵ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۟᩵ܿ;-><init>(I)V

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static ֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Z)Ll/֫ۤܳ;
    .locals 2

    .line 227
    new-instance v0, Ll/֫ۤܳ;

    invoke-direct {v0}, Ll/֫ۤܳ;-><init>()V

    .line 228
    new-instance v1, Ll/᩶ۨܳ;

    invoke-direct {v1, p0}, Ll/᩶ۨܳ;-><init>(Ll/ۘ۠ۢ;)V

    invoke-virtual {v0, p1, p2, v1}, Ll/֫ۤܳ;->֫([Ljava/lang/String;ZLl/ܰ۫ܳ;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 383
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 384
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֨۠ۢ;Ll/ۖۢܳ;Z)V
    .locals 1

    const-string v0, "compressToAnother"

    .line 217
    invoke-virtual {p0, v0, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    if-eqz p2, :cond_0

    .line 219
    invoke-virtual {p0, p1}, Ll/֨۠ۢ;->֫(Ll/ۖۢܳ;)V

    goto :goto_0

    .line 221
    :cond_0
    invoke-virtual {p0, p1}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    .line 223
    :goto_0
    invoke-virtual {p0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public static ֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Ljava/util/List;I)V
    .locals 7

    .line 252
    invoke-static {p2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/۠ۨܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/۠ۨܳ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 255
    :try_start_0
    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, v1}, Ll/᩻᩺ܳ;->֫(Ljava/util/List;Ll/᩶۫᩷;)Ljava/util/ArrayList;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-le p3, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const p3, 0x7f12087d

    .line 262
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 263
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 264
    instance-of p3, p0, Ll/᩹ܶۢ;

    if-eqz p3, :cond_1

    .line 265
    move-object p3, p0

    check-cast p3, Ll/᩹ܶۢ;

    .line 266
    invoke-virtual {p3, v2}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 269
    :cond_1
    array-length p3, p1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, p3, :cond_7

    aget-object v4, p1, v3

    .line 270
    invoke-static {v4, v0}, Ll/᩻᩺ܳ;->֫(Ljava/lang/String;Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    new-array v5, v2, [Ljava/lang/String;

    .line 273
    invoke-static {v4, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 299
    :try_start_1
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 300
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩻᩺ܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 301
    :cond_3
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩶᩶ܿ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 281
    :goto_2
    invoke-static {v6, p2}, Ll/᩻᩺ܳ;->֫(Ljava/lang/String;Ljava/util/List;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v1, :cond_5

    .line 285
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 287
    :cond_5
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v6

    invoke-static {v6}, Ll/ܽۤܳ;->֫(Z)Ll/ܽۤܳ;

    move-result-object v6

    .line 289
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 290
    invoke-virtual {v6, v4}, Ll/ܽۤܳ;->֫(Ljava/lang/String;)V

    :catch_0
    :cond_6
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_1
    :cond_7
    return-void
.end method

.method public static ֫(Ll/ܿ۠ۢ;ZZLl/ܽۢܳ;Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 0

    .line 373
    invoke-virtual {p0}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p0

    if-eqz p0, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    move-object p3, p4

    .line 377
    :cond_1
    invoke-virtual {p3}, Ll/ܽۢܳ;->ܳ()V

    .line 378
    invoke-virtual {p3, p5}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 379
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/List;)Z
    .locals 2

    .line 357
    invoke-static {p0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "/"

    .line 360
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v0, p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 361
    :goto_0
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v1, Ll/ܶۨܳ;

    invoke-direct {v1, p0, v0}, Ll/ܶۨܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    return p0

    .line 358
    :cond_2
    :goto_1
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ܺܶܿ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/ܺܶܿ;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 8

    const-string v0, "local"

    .line 71
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ll/ܽۢܳ;->۫()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-virtual {v1, v0}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 76
    :goto_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v5, Ll/ᩳ᩶ܳ;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ll/ᩳ᩶ܳ;-><init>(I)V

    invoke-interface {v2, v5}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v2

    .line 77
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v5

    const-string v6, ""

    if-ne v5, v3, :cond_3

    .line 78
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v3

    .line 79
    invoke-interface {v3}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 80
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 83
    :cond_1
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x2e

    .line 84
    invoke-virtual {v3, v5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    const/4 v7, -0x1

    if-ne v5, v7, :cond_2

    goto :goto_1

    .line 89
    :cond_2
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 90
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    move-object v3, v4

    goto :goto_1

    .line 94
    :cond_3
    invoke-virtual {p1}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v3

    new-array v4, v4, [Ljava/lang/String;

    invoke-static {v3, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 97
    :goto_1
    new-instance v4, Ll/᩹ۨܳ;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v5

    invoke-direct {v4, v5, v0, v1, p1}, Ll/᩹ۨܳ;-><init>(Lbin/mt/plus/Main;ZLl/ܽۢܳ;Ll/ۖۢܳ;)V

    .line 203
    invoke-virtual {v4, v3, v6}, Ll/᩷֨ܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result p1

    invoke-virtual {v4, p1, v2, v0}, Ll/᩷֨ܳ;->֫(IZZ)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 66
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
