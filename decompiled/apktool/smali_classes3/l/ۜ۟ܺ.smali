.class public final Ll/ۜ۟ܺ;
.super Ll/ۘ۟ܺ;
.source "57R8"


# instance fields
.field public final ۛ:Ll/۠۟ܺ;

.field public ۤ:Z

.field public ۨ:Ljava/util/ArrayList;

.field public final ۫:Ljava/util/ArrayList;

.field public ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۠۟ܺ;)V
    .locals 1

    .line 197
    invoke-direct {p0}, Ll/ۘ۟ܺ;-><init>()V

    .line 195
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜ۟ܺ;->۫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 250
    iput-boolean v0, p0, Ll/ۜ۟ܺ;->ۤ:Z

    .line 256
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜ۟ܺ;->ۨ:Ljava/util/ArrayList;

    .line 261
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜ۟ܺ;->۬:Ljava/util/ArrayList;

    .line 198
    iput-object p1, p0, Ll/ۜ۟ܺ;->ۛ:Ll/۠۟ܺ;

    return-void
.end method

.method public static ֫(Ll/۠۟ܺ;)Ll/ۜ۟ܺ;
    .locals 1

    .line 208
    new-instance v0, Ll/ۜ۟ܺ;

    invoke-direct {v0, p0}, Ll/ۜ۟ܺ;-><init>(Ll/۠۟ܺ;)V

    return-object v0
.end method

.method public static ֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;Ll/ܽ۫ᩴ;Ljava/util/List;)Ll/ۢ۟ܺ;
    .locals 7

    .line 318
    invoke-virtual {p2}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ۟ܺ;

    invoke-virtual {v0}, Ll/ۘ۟ܺ;->ܿ()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 375
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘ۟ܺ;

    .line 376
    invoke-virtual {v4}, Ll/ۘ۟ܺ;->ܿ()I

    move-result v4

    add-int/2addr v3, v4

    const/16 v4, 0x3e8

    if-lt v3, v4, :cond_1

    const/16 v3, 0x3e8

    .line 321
    :cond_2
    invoke-virtual {p2}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v2

    const/16 v4, 0x64

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {p2}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ۟ܺ;

    invoke-static {v2}, Ll/ܳ۟ܺ;->֫(Ll/ܳ۟ܺ;)Ll/᩻۟ܺ;

    move-result-object v2

    sget-object v6, Ll/᩻۟ܺ;->ۙ:Ll/᩻۟ܺ;

    if-eq v2, v6, :cond_5

    :cond_3
    iget-boolean v2, p1, Ll/ۢ۟ܺ;->ᩳ:Z

    if-nez v2, :cond_5

    iget v2, p1, Ll/ۢ۟ܺ;->֫:I

    add-int/2addr v2, v0

    add-int/2addr v2, v3

    if-le v2, v4, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x1

    .line 325
    :goto_2
    invoke-virtual {p2}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 326
    invoke-virtual {p2}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳ۟ܺ;

    iget v2, p1, Ll/ۢ۟ܺ;->ܽ:I

    invoke-virtual {p2, p1, v2, v0}, Ll/ܳ۟ܺ;->֫(Ll/ۢ۟ܺ;IZ)Ll/ۢ۟ܺ;

    move-result-object p1

    .line 328
    :cond_6
    iget p2, p1, Ll/ۢ۟ܺ;->֫:I

    add-int/2addr v3, p2

    if-gt v3, v4, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    .line 102
    :goto_3
    new-instance v2, Ll/ۢ۟ܺ;

    iget v3, p1, Ll/ۢ۟ܺ;->ܽ:I

    iget p1, p1, Ll/ۢ۟ܺ;->ۧ:I

    invoke-direct {v2, v3, p1, p2, v1}, Ll/ۢ۟ܺ;-><init>(IIIZ)V

    .line 338
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ۟ܺ;

    .line 339
    invoke-virtual {p2, p0, v2}, Ll/ۘ۟ܺ;->֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;)Ll/ۢ۟ܺ;

    move-result-object v2

    goto :goto_4

    :cond_8
    if-nez v0, :cond_9

    .line 102
    new-instance p0, Ll/ۢ۟ܺ;

    iget p1, v2, Ll/ۢ۟ܺ;->ܽ:I

    iget p2, v2, Ll/ۢ۟ܺ;->ۧ:I

    iget p3, v2, Ll/ۢ۟ܺ;->֫:I

    invoke-direct {p0, p1, p2, p3, v5}, Ll/ۢ۟ܺ;-><init>(IIIZ)V

    return-object p0

    :cond_9
    return-object v2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 391
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "plusIndent"

    iget-object v2, p0, Ll/ۜ۟ܺ;->ۛ:Ll/۠۟ܺ;

    .line 392
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "docs"

    iget-object v2, p0, Ll/ۜ۟ܺ;->۫:Ljava/util/ArrayList;

    .line 393
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    iget-object v1, p0, Ll/ۜ۟ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ۟ܺ;

    .line 229
    invoke-virtual {v2}, Ll/ۘ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 231
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;)Ll/ۢ۟ܺ;
    .locals 7

    .line 265
    invoke-virtual {p0}, Ll/ۘ۟ܺ;->ܿ()I

    move-result v0

    .line 266
    iget v1, p2, Ll/ۢ۟ܺ;->֫:I

    add-int/2addr v1, v0

    const/16 v0, 0x64

    if-gt v1, v0, :cond_0

    const/4 p1, 0x1

    .line 267
    iput-boolean p1, p0, Ll/ۜ۟ܺ;->ۤ:Z

    .line 268
    invoke-virtual {p2, v1}, Ll/ۢ۟ܺ;->֫(I)Ll/ۢ۟ܺ;

    move-result-object p1

    return-object p1

    .line 270
    :cond_0
    new-instance v0, Ll/ۢ۟ܺ;

    iget v1, p2, Ll/ۢ۟ܺ;->ۧ:I

    iget-object v2, p0, Ll/ۜ۟ܺ;->ۛ:Ll/۠۟ܺ;

    .line 272
    invoke-virtual {v2}, Ll/۠۟ܺ;->֫()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p2, Ll/ۢ۟ܺ;->֫:I

    const/4 v3, 0x0

    .line 94
    invoke-direct {v0, v1, v1, v2, v3}, Ll/ۢ۟ܺ;-><init>(IIIZ)V

    .line 277
    iget-object v1, p0, Ll/ۜ۟ܺ;->ۨ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 278
    iget-object v2, p0, Ll/ۜ۟ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 279
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    iget-object v4, p0, Ll/ۜ۟ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۘ۟ܺ;

    .line 281
    instance-of v6, v5, Ll/ܳ۟ܺ;

    if-eqz v6, :cond_1

    .line 282
    check-cast v5, Ll/ܳ۟ܺ;

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 285
    :cond_1
    invoke-static {v1}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 298
    :cond_2
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object v4

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 297
    invoke-static {p1, v0, v4, v5}, Ll/ۜ۟ܺ;->֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;Ll/ܽ۫ᩴ;Ljava/util/List;)Ll/ۢ۟ܺ;

    move-result-object v0

    .line 301
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 304
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ۟ܺ;

    invoke-static {v4}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 303
    invoke-static {p1, v0, v4, v5}, Ll/ۜ۟ܺ;->֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;Ll/ܽ۫ᩴ;Ljava/util/List;)Ll/ۢ۟ܺ;

    move-result-object v0

    goto :goto_1

    .line 273
    :cond_3
    iget p1, v0, Ll/ۢ۟ܺ;->֫:I

    invoke-virtual {p2, p1}, Ll/ۢ۟ܺ;->֫(I)Ll/ۢ۟ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘ۟ܺ;)V
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۜ۟ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ᩴۧۖ;)V
    .locals 4

    .line 346
    iget-boolean v0, p0, Ll/ۜ۟ܺ;->ۤ:Z

    if-eqz v0, :cond_0

    .line 347
    invoke-virtual {p0}, Ll/ۘ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۘ۟ܺ;->ܳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ll/ᩴۧۖ;->֫(Ll/ܰۤܺ;Ljava/lang/String;)V

    return-void

    .line 355
    :cond_0
    iget-object v0, p0, Ll/ۜ۟ܺ;->ۨ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ۟ܺ;

    .line 356
    invoke-virtual {v3, p1}, Ll/ۘ۟ܺ;->֫(Ll/ᩴۧۖ;)V

    goto :goto_0

    .line 359
    :cond_1
    iget-object v2, p0, Ll/ۜ۟ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 360
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ۟ܺ;

    invoke-virtual {v2, p1}, Ll/ܳ۟ܺ;->֫(Ll/ᩴۧۖ;)V

    add-int/lit8 v1, v1, 0x1

    .line 361
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ۟ܺ;

    .line 362
    invoke-virtual {v3, p1}, Ll/ۘ۟ܺ;->֫(Ll/ᩴۧۖ;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ۧ()Ll/ܰۤܺ;
    .locals 4

    .line 236
    invoke-static {}, Ll/ۘ۟ܺ;->᩻()Ll/ܰۤܺ;

    move-result-object v0

    .line 237
    iget-object v1, p0, Ll/ۜ۟ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ۟ܺ;

    .line 238
    invoke-virtual {v2}, Ll/ۘ۟ܺ;->ܳ()Ll/ܰۤܺ;

    move-result-object v2

    .line 386
    invoke-virtual {v0}, Ll/ܰۤܺ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ll/ܰۤܺ;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, Ll/ܰۤܺ;->ᩳ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object v0

    invoke-static {}, Ll/ۘ۟ܺ;->ۜ()Ll/᩵ۗܺ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܰۤܺ;->֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final ܽ()I
    .locals 3

    .line 375
    iget-object v0, p0, Ll/ۜ۟ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ۟ܺ;

    .line 376
    invoke-virtual {v2}, Ll/ۘ۟ܺ;->ܿ()I

    move-result v2

    add-int/2addr v1, v2

    const/16 v2, 0x3e8

    if-lt v1, v2, :cond_0

    return v2

    :cond_1
    return v1
.end method
