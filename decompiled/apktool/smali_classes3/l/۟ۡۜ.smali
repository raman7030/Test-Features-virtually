.class public final Ll/۟ۡۜ;
.super Ljava/lang/Object;
.source "L6Y6"


# instance fields
.field public ֫:Ll/ܽܺۜ;

.field public final ۜ:Ll/۟ۢۜ;

.field public final ۡ:Ljava/lang/String;

.field public final synthetic ۢ:Ll/᩻ܺۜ;

.field public ۧ:Ll/᩺ۡۜ;

.field public final ܳ:Z

.field public ܽ:Ll/ۧܺۜ;

.field public ܿ:Ll/ۧܺۜ;

.field public ᩳ:Ll/᩺ۡۜ;

.field public final ᩷:Ljava/util/ArrayDeque;

.field public final ᩻:Ll/ܿܺۜ;


# direct methods
.method public constructor <init>(Ll/᩻ܺۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩷ۡۜ;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 314
    invoke-direct/range {v0 .. v7}, Ll/۟ۡۜ;-><init>(Ll/᩻ܺۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩷ۡۜ;Ll/᩷ܺۜ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻ܺۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩷ۡۜ;Ll/᩷ܺۜ;)V
    .locals 2

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۡۜ;->ۢ:Ll/᩻ܺۜ;

    .line 300
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/۟ۡۜ;->᩷:Ljava/util/ArrayDeque;

    .line 320
    iput-object p7, p0, Ll/۟ۡۜ;->᩻:Ll/ܿܺۜ;

    .line 321
    iput-boolean p4, p0, Ll/۟ۡۜ;->ܳ:Z

    .line 322
    iput-object p5, p0, Ll/۟ۡۜ;->ۜ:Ll/۟ۢۜ;

    .line 323
    iget-object p4, p6, Ll/᩷ۡۜ;->ۧ:Ljava/lang/String;

    iput-object p4, p0, Ll/۟ۡۜ;->ۡ:Ljava/lang/String;

    const-string p4, ""

    .line 324
    invoke-direct {p0, p2, p3, p4}, Ll/۟ۡۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۧܺۜ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 325
    iget-object p1, p6, Ll/᩷ۡۜ;->֫:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    const-string p2, "/"

    .line 332
    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 333
    :goto_0
    array-length p3, p1

    if-ge p2, p3, :cond_5

    .line 334
    aget-object p3, p1, p2

    .line 335
    iget-object p4, p0, Ll/۟ۡۜ;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ۧܺۜ;

    .line 337
    iget-object p5, p4, Ll/ۧܺۜ;->ۧ:Ljava/util/List;

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p6

    const/4 p7, 0x0

    :goto_1
    if-ge p7, p6, :cond_1

    add-int v0, p7, p6

    ushr-int/lit8 v0, v0, 0x1

    .line 340
    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۡۜ;

    iget-object v1, v1, Ll/᩺ۡۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, p3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-gtz v1, :cond_0

    add-int/lit8 p7, v0, 0x1

    goto :goto_1

    :cond_0
    move p6, v0

    goto :goto_1

    .line 346
    :cond_1
    iput p7, p4, Ll/ۧܺۜ;->ܽ:I

    if-eqz p7, :cond_5

    add-int/lit8 p7, p7, -0x1

    .line 347
    invoke-interface {p5, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ll/᩺ۡۜ;

    iget-object p6, p6, Ll/᩺ۡۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {p6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_2

    .line 350
    :cond_2
    invoke-interface {p5, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩺ۡۜ;

    .line 351
    iget-object p5, p0, Ll/۟ۡۜ;->᩻:Ll/ܿܺۜ;

    if-eqz p5, :cond_3

    array-length p5, p1

    add-int/lit8 p5, p5, -0x1

    if-ne p2, p5, :cond_3

    .line 425
    iget-boolean p1, p0, Ll/۟ۡۜ;->ܳ:Z

    if-eqz p1, :cond_5

    iget-object p1, p3, Ll/᩺ۡۜ;->ܽ:Ll/۫᩵ܿ;

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p1

    sget-object p2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne p1, p2, :cond_5

    .line 426
    iput-object p3, p0, Ll/۟ۡۜ;->ᩳ:Ll/᩺ۡۜ;

    .line 427
    iput-object p4, p0, Ll/۟ۡۜ;->ܿ:Ll/ۧܺۜ;

    return-void

    .line 356
    :cond_3
    iget-boolean p5, p0, Ll/۟ۡۜ;->ܳ:Z

    if-eqz p5, :cond_5

    invoke-direct {p0, p3, p4}, Ll/۟ۡۜ;->֫(Ll/᩺ۡۜ;Ll/ۧܺۜ;)Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return-void
.end method

.method public synthetic constructor <init>(Ll/᩻ܺۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩷ۡۜ;Ll/᩷ܺۜ;I)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p7}, Ll/۟ۡۜ;-><init>(Ll/᩻ܺۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩷ۡۜ;Ll/᩷ܺۜ;)V

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۧܺۜ;
    .locals 8

    .line 466
    new-instance v0, Ll/֫ܺۜ;

    iget-object v1, p0, Ll/۟ۡۜ;->ۜ:Ll/۟ۢۜ;

    iget-object v2, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-object v3, p0, Ll/۟ۡۜ;->ۡ:Ljava/lang/String;

    invoke-direct {v0, v3, v2, p2}, Ll/֫ܺۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    iget-object v2, p0, Ll/۟ۡۜ;->ۢ:Ll/᩻ܺۜ;

    invoke-static {v2, v0}, Ll/᩻ܺۜ;->֫(Ll/᩻ܺۜ;Ll/֫ܺۜ;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 469
    new-instance p1, Ll/ۧܺۜ;

    const/4 p2, 0x1

    invoke-direct {p1, p3, v3, p2}, Ll/ۧܺۜ;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    return-object p1

    .line 471
    :cond_0
    invoke-static {v2}, Ll/᩻ܺۜ;->֫(Ll/᩻ܺۜ;)Ll/ᩳۖۜ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ܳ()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 473
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۫᩵ܿ;

    .line 474
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    sget-object v6, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v5, v6, :cond_1

    goto :goto_0

    .line 477
    :cond_1
    invoke-virtual {v4}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-static {p2, v5}, Ll/᩻ܺۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 478
    invoke-virtual {v1, v5}, Ll/۟ۢۜ;->֫(Ljava/lang/String;)Ll/᩺ۢۜ;

    move-result-object v6

    iget-object v6, v6, Ll/᩺ۢۜ;->֫:Ll/ۛۢۜ;

    invoke-virtual {v6}, Ll/ۛۢۜ;->֫()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    .line 482
    :cond_2
    new-instance v6, Ll/᩺ۡۜ;

    invoke-static {p2, v5}, Ll/᩻ܺۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v4, v5, v7}, Ll/᩺ۡۜ;-><init>(Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 484
    :cond_3
    new-instance p1, Ll/ܰۡۜ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {v3, p1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 485
    invoke-static {v2, v0, v3}, Ll/᩻ܺۜ;->֫(Ll/᩻ܺۜ;Ll/֫ܺۜ;Ljava/util/ArrayList;)V

    .line 486
    new-instance p1, Ll/ۧܺۜ;

    const/4 p2, 0x0

    invoke-direct {p1, p3, v3, p2}, Ll/ۧܺۜ;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    return-object p1

    :catch_0
    move-exception p1

    .line 147
    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫()Z
    .locals 8

    .line 391
    iget-object v0, p0, Ll/۟ۡۜ;->֫:Ll/ܽܺۜ;

    if-nez v0, :cond_7

    .line 432
    iget-object v0, p0, Ll/۟ۡۜ;->ᩳ:Ll/᩺ۡۜ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 433
    invoke-static {}, Ll/ۖܺۜ;->֫()V

    .line 434
    iget-object v0, p0, Ll/۟ۡۜ;->ᩳ:Ll/᩺ۡۜ;

    .line 435
    iget-object v2, p0, Ll/۟ۡۜ;->ܿ:Ll/ۧܺۜ;

    .line 436
    iput-object v1, p0, Ll/۟ۡۜ;->ᩳ:Ll/᩺ۡۜ;

    .line 437
    iput-object v1, p0, Ll/۟ۡۜ;->ܿ:Ll/ۧܺۜ;

    .line 438
    invoke-direct {p0, v0, v2}, Ll/۟ۡۜ;->֫(Ll/᩺ۡۜ;Ll/ۧܺۜ;)Z

    .line 440
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/۟ۡۜ;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 441
    iget-object v2, p0, Ll/۟ۡۜ;->᩻:Ll/ܿܺۜ;

    if-eqz v2, :cond_1

    .line 442
    invoke-static {}, Ll/ۖܺۜ;->֫()V

    .line 444
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧܺۜ;

    .line 445
    iget v4, v3, Ll/ۧܺۜ;->ܽ:I

    iget-object v5, v3, Ll/ۧܺۜ;->ᩳ:Ljava/lang/String;

    iget-object v6, v3, Ll/ۧܺۜ;->ۧ:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    if-lt v4, v7, :cond_2

    .line 446
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_0

    .line 449
    :cond_2
    iget v0, v3, Ll/ۧܺۜ;->ܽ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, v3, Ll/ۧܺۜ;->ܽ:I

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۡۜ;

    .line 450
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Ll/᩺ۡۜ;->ۧ:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const-string v1, "/"

    .line 0
    invoke-static {v5, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 451
    iget-object v4, v0, Ll/᩺ۡۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v2, :cond_4

    .line 454
    iput-object v0, p0, Ll/۟ۡۜ;->ۧ:Ll/᩺ۡۜ;

    .line 455
    iput-object v3, p0, Ll/۟ۡۜ;->ܽ:Ll/ۧܺۜ;

    goto :goto_2

    .line 456
    :cond_4
    iget-boolean v2, p0, Ll/۟ۡۜ;->ܳ:Z

    if-eqz v2, :cond_5

    .line 457
    invoke-direct {p0, v0, v3}, Ll/۟ۡۜ;->֫(Ll/᩺ۡۜ;Ll/ۧܺۜ;)Z

    .line 459
    :cond_5
    :goto_2
    new-instance v2, Ll/ܽܺۜ;

    iget-object v0, v0, Ll/᩺ۡۜ;->ܽ:Ll/۫᩵ܿ;

    invoke-direct {v2, v0, v1}, Ll/ܽܺۜ;-><init>(Ll/۫᩵ܿ;Ljava/lang/String;)V

    move-object v1, v2

    .line 392
    :cond_6
    iput-object v1, p0, Ll/۟ۡۜ;->֫:Ll/ܽܺۜ;

    .line 394
    :cond_7
    iget-object v0, p0, Ll/۟ۡۜ;->֫:Ll/ܽܺۜ;

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    return v0

    :cond_8
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ֫(Ll/۟ۡۜ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۟ۡۜ;->֫()Z

    move-result p0

    return p0
.end method

.method private ֫(Ll/᩺ۡۜ;Ll/ۧܺۜ;)Z
    .locals 0

    .line 364
    :try_start_0
    invoke-direct {p0, p1, p2}, Ll/۟ۡۜ;->ۧ(Ll/᩺ۡۜ;Ll/ۧܺۜ;)Z

    move-result p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 366
    iget-object p2, p0, Ll/۟ۡۜ;->᩻:Ll/ܿܺۜ;

    if-eqz p2, :cond_0

    .line 369
    check-cast p2, Ll/᩷ܺۜ;

    .line 122
    iget-object p1, p2, Ll/᩷ܺۜ;->ܳ:Ljava/util/LinkedHashMap;

    const-string p2, "directory_unreadable"

    invoke-static {p1, p2}, Ll/ۖܺۜ;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 367
    :cond_0
    throw p1
.end method

.method public static ۧ(Ll/۟ۡۜ;)Z
    .locals 2

    .line 413
    iget-object v0, p0, Ll/۟ۡۜ;->֫:Ll/ܽܺۜ;

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/۟ۡۜ;->ᩳ:Ll/᩺ۡۜ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 416
    :cond_0
    iget-object p0, p0, Ll/۟ۡۜ;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧܺۜ;

    .line 417
    iget v1, v0, Ll/ۧܺۜ;->ܽ:I

    iget-object v0, v0, Ll/ۧܺۜ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ۧ(Ll/᩺ۡۜ;Ll/ۧܺۜ;)Z
    .locals 4

    .line 375
    iget-object v0, p1, Ll/᩺ۡۜ;->ܽ:Ll/۫᩵ܿ;

    iget-object v1, p1, Ll/᩺ۡۜ;->ۧ:Ljava/lang/String;

    iget-object v2, p1, Ll/᩺ۡۜ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v3, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-eq v0, v3, :cond_0

    goto :goto_1

    .line 379
    :cond_0
    iget-boolean v0, p2, Ll/ۧܺۜ;->֫:Z

    iget-object p2, p2, Ll/ۧܺۜ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 380
    iget-object p1, p0, Ll/۟ۡۜ;->ۢ:Ll/᩻ܺۜ;

    invoke-static {p1}, Ll/᩻ܺۜ;->֫(Ll/᩻ܺۜ;)Ll/ᩳۖۜ;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Ll/᩺ۡۜ;->ܽ:Ll/۫᩵ܿ;

    .line 381
    :goto_0
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    if-eq v0, v3, :cond_2

    :goto_1
    const/4 p1, 0x0

    return p1

    .line 384
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "/"

    .line 0
    invoke-static {p2, v0, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 386
    :goto_2
    invoke-virtual {p1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-direct {p0, p1, v2, v1}, Ll/۟ۡۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۧܺۜ;

    move-result-object p1

    iget-object p2, p0, Ll/۟ۡۜ;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {p2, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public static ܽ(Ll/۟ۡۜ;)Ll/ܽܺۜ;
    .locals 6

    .line 398
    invoke-direct {p0}, Ll/۟ۡۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 401
    iget-object v0, p0, Ll/۟ۡۜ;->֫:Ll/ܽܺۜ;

    .line 402
    iget-object v1, p0, Ll/۟ۡۜ;->᩻:Ll/ܿܺۜ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 403
    iget-object v1, p0, Ll/۟ۡۜ;->ۧ:Ll/᩺ۡۜ;

    iget-object v3, p0, Ll/۟ۡۜ;->ܽ:Ll/ۧܺۜ;

    .line 425
    iget-boolean v4, p0, Ll/۟ۡۜ;->ܳ:Z

    if-eqz v4, :cond_0

    iget-object v4, v1, Ll/᩺ۡۜ;->ܽ:Ll/۫᩵ܿ;

    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v4

    sget-object v5, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v4, v5, :cond_0

    .line 426
    iput-object v1, p0, Ll/۟ۡۜ;->ᩳ:Ll/᩺ۡۜ;

    .line 427
    iput-object v3, p0, Ll/۟ۡۜ;->ܿ:Ll/ۧܺۜ;

    .line 404
    :cond_0
    iput-object v2, p0, Ll/۟ۡۜ;->ۧ:Ll/᩺ۡۜ;

    .line 405
    iput-object v2, p0, Ll/۟ۡۜ;->ܽ:Ll/ۧܺۜ;

    .line 407
    :cond_1
    iput-object v2, p0, Ll/۟ۡۜ;->֫:Ll/ܽܺۜ;

    return-object v0

    .line 399
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "No more file entries"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
