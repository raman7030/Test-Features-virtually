.class public final Ll/ۡ᩸۠;
.super Ll/ܰᩴ֨;
.source "C420"


# instance fields
.field public final synthetic ᩹:Ll/ۖ᩸۠;


# direct methods
.method public constructor <init>(Ll/ۖ᩸۠;)V
    .locals 0

    .line 341
    iput-object p1, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    invoke-direct {p0}, Ll/ܰᩴ֨;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 341
    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p2, p1}, Ll/ۡ᩸۠;->֫(Ll/ۙ֨֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/ۘ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 341
    check-cast p2, Ljava/util/Locale;

    invoke-virtual {p0, p1, p2}, Ll/ۡ᩸۠;->֫(Ll/ۘ֡֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 341
    check-cast p2, Ljava/util/Locale;

    invoke-virtual {p0, p1, p2}, Ll/ۡ᩸۠;->֫(Ll/ۡ֨֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/ܳ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 341
    check-cast p2, Ljava/util/Locale;

    invoke-virtual {p0, p1, p2}, Ll/ۡ᩸۠;->֫(Ll/ܳ֡֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܶۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 341
    check-cast p2, Ljava/util/Locale;

    .line 640
    iget-object v0, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    iget-object v1, v0, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    check-cast v1, Ll/ۢ᩸۠;

    .line 363
    sget-object v2, Ll/᩷᩸۠;->ۙ:Ll/᩷᩸۠;

    .line 712
    iget-object v1, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 364
    sget-object v1, Ll/ܺ᩸۠;->᩶:Ll/ܺ᩸۠;

    .line 366
    invoke-static {v0, p1, v1}, Ll/ۖ᩸۠;->֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "compiler.misc.captured.type"

    .line 364
    invoke-virtual {p0, p2, p1, v0}, Ll/ۡ᩸۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 369
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܰᩴ֨;->֫(Ll/ܶۚ֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 341
    check-cast p2, Ljava/util/Locale;

    invoke-virtual {p0, p1, p2}, Ll/ۡ᩸۠;->֫(Ll/᩶ۚ֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 345
    iget-object v0, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    iget-object v0, v0, Ll/᩷۠۠;->ۧ:Ll/ܺ֨۠;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܺ֨۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘ֡֨;Ljava/util/Locale;)Ljava/lang/String;
    .locals 6

    .line 427
    iget-object v0, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 147
    invoke-virtual {v0, p0, p2}, Ll/ۛ֡֨;->֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 428
    invoke-virtual {p1}, Ll/ۘ֡֨;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 431
    :cond_0
    iget-object v1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, v1, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    iget-object v2, v2, Ll/۫ܶ۠;->֫:Ll/ۛܶ۠;

    iget-object v2, v2, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 433
    :cond_1
    invoke-virtual {v1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    .line 434
    :goto_0
    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-eqz v1, :cond_4

    .line 435
    sget-object v2, Ll/ۢ۠֨;->ۧ֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 436
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {p0, v2, p2}, Ll/ܰᩴ֨;->֫(Ll/ۖܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    const-string v1, "("

    .line 0
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 438
    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 439
    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v1

    .line 111
    iget-wide v2, p1, Ll/ۛ֡֨;->᩶:J

    const-wide v4, 0x400000000L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    .line 438
    :goto_1
    invoke-virtual {p0, v1, p1, p2}, Ll/ܰᩴ֨;->֫(Ll/ۖܶ۠;ZLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, ")"

    .line 0
    invoke-static {v0, p1, p2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0
.end method

.method public final ֫(Ll/ۙ֨֨;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .line 355
    invoke-super {p0, p1, p2}, Ll/ܰᩴ֨;->֫(Ll/ۙ֨֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 356
    iget-object v1, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    iget-object v1, v1, Ll/ۖ᩸۠;->ܳ:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "compiler.misc.type.null"

    .line 357
    invoke-virtual {p0, p2, v0, p1}, Ll/ۡ᩸۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/util/Locale;)Ljava/lang/String;
    .locals 7

    .line 239
    invoke-virtual {p1}, Ll/ۙ֨֨;->ۙ֫()Ll/ۙ֨֨;

    move-result-object v0

    check-cast v0, Ll/ۡ֨֨;

    .line 242
    iget-object v1, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    iget-object v2, v1, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    sget-object v3, Ll/ܺ᩸۠;->ۗ:Ll/ܺ᩸۠;

    invoke-virtual {v2, v3}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ֨֨;

    .line 243
    invoke-virtual {v5}, Ll/ۙ֨֨;->ۙ֫()Ll/ۙ֨֨;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۙ֨֨;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ll/ۙ֨֨;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    if-lt v4, v2, :cond_4

    if-ne v4, v2, :cond_2

    goto :goto_1

    .line 640
    :cond_2
    iget-object v0, v1, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    check-cast v0, Ll/ۢ᩸۠;

    .line 400
    sget-object v4, Ll/᩷᩸۠;->᩶:Ll/᩷᩸۠;

    .line 712
    iget-object v0, v0, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 401
    :goto_1
    invoke-virtual {p1}, Ll/ۙ֨֨;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 406
    :cond_3
    invoke-virtual {p1}, Ll/ۙ֨֨;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ll/ܺ᩸۠;->ۗ:Ll/ܺ᩸۠;

    invoke-static {v1, p1, v4}, Ll/ۖ᩸۠;->֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    aput-object p1, v1, v2

    const-string p1, "compiler.misc.type.var"

    .line 404
    invoke-virtual {p0, p2, p1, v1}, Ll/ۡ᩸۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 248
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Missing type variable in where clause: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫(Ll/ܳ֡֨;Ljava/util/Locale;)Ljava/lang/String;
    .locals 3

    .line 412
    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 413
    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 136
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 415
    :cond_0
    iget-object v0, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    iget-object v1, v0, Ll/ۖ᩸۠;->ᩳ:Ll/ۜ᩸۠;

    invoke-virtual {v1, p1}, Ll/ۜ᩸۠;->ۧ(Ll/ۛ֡֨;)Ljava/lang/String;

    move-result-object v1

    .line 416
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    .line 640
    iget-object v0, v0, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    check-cast v0, Ll/ۢ᩸۠;

    .line 417
    sget-object v2, Ll/᩷᩸۠;->᩹:Ll/᩷᩸۠;

    .line 712
    iget-object v0, v0, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v1

    .line 418
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Ll/ܰᩴ֨;->֫(Ll/ܳ֡֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܶۚ֨;)Ljava/lang/String;
    .locals 3

    .line 350
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    sget-object v2, Ll/ܺ᩸۠;->᩶:Ll/ܺ᩸۠;

    invoke-static {v1, p1, v2}, Ll/ۖ᩸۠;->֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I

    move-result p1

    const-string v1, ""

    .line 0
    invoke-static {p1, v1, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/util/Locale;)Ljava/lang/String;
    .locals 3

    .line 374
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 640
    iget-object v0, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    iget-object v1, v0, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    check-cast v1, Ll/ۢ᩸۠;

    .line 375
    sget-object v2, Ll/᩷᩸۠;->ۙ:Ll/᩷᩸۠;

    .line 712
    iget-object v1, v1, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 376
    sget-object v1, Ll/ܺ᩸۠;->ۙ:Ll/ܺ᩸۠;

    .line 378
    invoke-static {v0, p1, v1}, Ll/ۖ᩸۠;->֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "compiler.misc.intersection.type"

    .line 376
    invoke-virtual {p0, p2, p1, v0}, Ll/ۡ᩸۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 381
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܰᩴ֨;->֫(Ll/᩶ۚ֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;ZLjava/util/Locale;)Ljava/lang/String;
    .locals 4

    .line 386
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 387
    iget-object v1, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1}, Ll/ۤܶ۠;->length()I

    move-result v1

    if-eqz v1, :cond_2

    .line 640
    iget-object v1, p0, Ll/ۡ᩸۠;->᩹:Ll/ۖ᩸۠;

    iget-object v2, v1, Ll/᩷۠۠;->֫:Ll/ۜ۠۠;

    check-cast v2, Ll/ۢ᩸۠;

    .line 388
    sget-object v3, Ll/᩷᩸۠;->᩹:Ll/᩷᩸۠;

    .line 712
    iget-object v2, v2, Ll/ۢ᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 392
    iget-object p1, v1, Ll/ۖ᩸۠;->ᩳ:Ll/ۜ᩸۠;

    invoke-virtual {p1, v0}, Ll/ۜ᩸۠;->ۧ(Ll/ۛ֡֨;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 394
    :cond_1
    iget-object p1, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 389
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2, p3}, Ll/ܰᩴ֨;->֫(Ll/᩶ۚ֨;ZLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
