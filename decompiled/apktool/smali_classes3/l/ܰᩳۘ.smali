.class public final Ll/ܰᩳۘ;
.super Ljava/lang/Object;
.source "P1MC"


# direct methods
.method public static ֫(Ljava/util/List;Ll/ۚܿۘ;)Ljava/util/ArrayList;
    .locals 3

    .line 323
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 324
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ᩳۘ;

    .line 325
    invoke-static {v1}, Ll/᩺ᩳۘ;->֫(Ll/᩺ᩳۘ;)Ll/ۚܿۘ;

    move-result-object v2

    if-eq v2, p1, :cond_0

    .line 326
    new-instance v2, Ll/᩺ᩳۘ;

    invoke-virtual {v1}, Ll/᩺ᩳۘ;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-direct {v2, v1, p1}, Ll/᩺ᩳۘ;-><init>(Ljava/lang/CharSequence;Ll/ۚܿۘ;)V

    move-object v1, v2

    .line 328
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;Ll/ۚܿۘ;)Ljava/util/List;
    .locals 3

    .line 34
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 35
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/CharSequence;

    .line 318
    new-instance v2, Ll/᩺ᩳۘ;

    invoke-direct {v2, v1, p1}, Ll/᩺ᩳۘ;-><init>(Ljava/lang/CharSequence;Ll/ۚܿۘ;)V

    .line 37
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۚܿۘ;Ll/ۙܳۘ;)Ll/ۜܳۘ;
    .locals 6

    .line 47
    invoke-virtual {p3}, Ll/ۙܳۘ;->ۧ()V

    .line 48
    invoke-static {p0, p2}, Ll/ܰᩳۘ;->֫(Ljava/util/ArrayList;Ll/ۚܿۘ;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p2}, Ll/ܰᩳۘ;->֫(Ljava/util/ArrayList;Ll/ۚܿۘ;)Ljava/util/List;

    move-result-object p1

    .line 60
    invoke-virtual {p3}, Ll/ۙܳۘ;->ۧ()V

    .line 62
    sget-object v0, Ll/ۚܿۘ;->᩶:Ll/ۚܿۘ;

    if-ne p2, v0, :cond_2

    .line 63
    invoke-static {p0, p1, p3}, Ll/ܰᩳۘ;->֫(Ljava/util/List;Ljava/util/List;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p2

    .line 261
    new-instance p3, Ll/ۖܿۘ;

    .line 219
    invoke-direct {p3, p0, p1, p2}, Ll/ᩴܿۘ;-><init>(Ljava/util/List;Ljava/util/List;Ll/ۜܳۘ;)V

    .line 261
    invoke-virtual {p3}, Ll/ᩴܿۘ;->֫()Ll/ۜܳۘ;

    move-result-object p2

    .line 302
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 304
    invoke-interface {p2}, Ll/֫ܳۘ;->֫()Ll/ܰܿۘ;

    move-result-object p2

    iget-object p2, p2, Ll/ܰܿۘ;->᩸:Ll/֫ܳۘ;

    invoke-interface {p2}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳۘ;

    .line 305
    iget v2, v0, Ll/᩹ܳۘ;->ܽ:I

    iget v3, v0, Ll/᩹ܳۘ;->ᩳ:I

    iget v4, v0, Ll/᩹ܳۘ;->֫:I

    iget v5, v0, Ll/᩹ܳۘ;->ۧ:I

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Ll/ۗܿۘ;->֫(Ljava/util/List;Ljava/util/List;IIII)Ll/᩹ܳۘ;

    move-result-object v0

    .line 306
    invoke-virtual {v0}, Ll/᩹ܳۘ;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 309
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p3, p0, p1}, Ll/᩻ܳۘ;->֫(Ljava/util/ArrayList;II)Ll/֫ܳۘ;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p0

    return-object p0

    .line 67
    :cond_2
    invoke-static {p0, v0}, Ll/ܰᩳۘ;->֫(Ljava/util/List;Ll/ۚܿۘ;)Ljava/util/ArrayList;

    move-result-object p2

    .line 68
    invoke-static {p1, v0}, Ll/ܰᩳۘ;->֫(Ljava/util/List;Ll/ۚܿۘ;)Ljava/util/ArrayList;

    move-result-object v0

    .line 70
    invoke-static {p2, v0, p3}, Ll/ܰᩳۘ;->֫(Ljava/util/List;Ljava/util/List;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p2

    .line 261
    new-instance p3, Ll/ۖܿۘ;

    .line 219
    invoke-direct {p3, p0, p1, p2}, Ll/ᩴܿۘ;-><init>(Ljava/util/List;Ljava/util/List;Ll/ۜܳۘ;)V

    .line 261
    invoke-virtual {p3}, Ll/ᩴܿۘ;->֫()Ll/ۜܳۘ;

    move-result-object p2

    .line 108
    new-instance p3, Ll/ܳܳۘ;

    invoke-direct {p3, p0, p1}, Ll/ܳܳۘ;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 109
    new-instance v0, Ll/ۤᩳۘ;

    invoke-direct {v0, p2, p0, p1, p3}, Ll/ۤᩳۘ;-><init>(Ll/ۜܳۘ;Ljava/util/List;Ljava/util/List;Ll/ܳܳۘ;)V

    .line 201
    invoke-virtual {v0}, Ll/ۤᩳۘ;->֫()V

    .line 203
    invoke-virtual {p3}, Ll/ᩳܳۘ;->ܳ()Ll/֫ܳۘ;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/List;Ljava/util/List;Ll/ۙܳۘ;)Ll/ۜܳۘ;
    .locals 11

    .line 276
    invoke-static {p0}, Ll/ܰᩳۘ;->֫(Ljava/util/List;)Ll/۬ܳۘ;

    move-result-object v0

    .line 277
    invoke-static {p1}, Ll/ܰᩳۘ;->֫(Ljava/util/List;)Ll/۬ܳۘ;

    move-result-object v1

    .line 279
    iget-object v2, v0, Ll/۬ܳۘ;->֫:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v1, Ll/۬ܳۘ;->֫:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {v2, v3, p2}, Ll/᩻ܳۘ;->֫(Ljava/util/List;Ljava/util/List;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object v9

    .line 280
    new-instance v2, Ll/ۡܿۘ;

    iget-object v0, v0, Ll/۬ܳۘ;->ۧ:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ll/ܺۢᩴ;

    iget-object v0, v1, Ll/۬ܳۘ;->ۧ:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll/ܺۢᩴ;

    move-object v4, v2

    move-object v7, p0

    move-object v8, p1

    move-object v10, p2

    invoke-direct/range {v4 .. v10}, Ll/ۡܿۘ;-><init>(Ll/ܺۢᩴ;Ll/ܺۢᩴ;Ljava/util/List;Ljava/util/List;Ll/ۜܳۘ;Ll/ۙܳۘ;)V

    invoke-virtual {v2}, Ll/ܺܿۘ;->֫()Ll/ۜܳۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/List;)Ll/۬ܳۘ;
    .locals 6

    .line 285
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 286
    new-instance v1, Ll/ܺۢᩴ;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ll/ܺۢᩴ;-><init>(I)V

    const/4 v2, 0x0

    .line 288
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 289
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ᩳۘ;

    .line 290
    invoke-virtual {v3}, Ll/᩺ᩳۘ;->ۧ()I

    move-result v4

    const/4 v5, 0x3

    if-le v4, v5, :cond_0

    .line 291
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    invoke-virtual {v1, v2}, Ll/ܺۢᩴ;->add(I)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 30
    :cond_1
    new-instance p0, Ll/۬ܳۘ;

    invoke-direct {p0, v0, v1}, Ll/۬ܳۘ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method
