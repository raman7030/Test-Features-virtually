.class public final Ll/֨ܳ۠;
.super Ljava/util/LinkedHashSet;
.source "K7QT"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final synthetic ۙ:Ll/᩹ܳ۠;

.field public ᩶:Z

.field public final transient ᩸:Ljava/util/HashSet;

.field public transient ᩹:Ll/᩷۠ᩴ;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;)V
    .locals 0

    .line 278
    iput-object p1, p0, Ll/֨ܳ۠;->ۙ:Ll/᩹ܳ۠;

    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 p1, 0x0

    .line 282
    iput-boolean p1, p0, Ll/֨ܳ۠;->᩶:Z

    .line 283
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/֨ܳ۠;->᩸:Ljava/util/HashSet;

    const/4 p1, 0x0

    .line 293
    iput-object p1, p0, Ll/֨ܳ۠;->᩹:Ll/᩷۠ᩴ;

    return-void
.end method

.method private ۧ(Ll/᩷۠ᩴ;Z)V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ll/ܳ۠ᩴ;

    .line 320
    invoke-static {p1, v1}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    iget-object v2, p0, Ll/֨ܳ۠;->ۙ:Ll/᩹ܳ۠;

    if-nez v1, :cond_0

    if-eqz p2, :cond_2

    .line 322
    invoke-static {v2}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object p2

    sget-object v1, Ll/᩶ᩴ֨;->᩻֫:Ll/᩶ᩴ֨;

    .line 323
    sget-object v2, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4245
    new-instance v2, Ll/ۧܶ۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    const-string p1, "compiler"

    const-string v0, "dir.path.element.not.found"

    invoke-direct {v2, p1, v0, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-virtual {p2, v1, v2}, Ll/ۖ֨۠;->֫(Ll/᩶ᩴ֨;Ll/ۧܶ۠;)V

    return-void

    .line 328
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ܿ۠ᩴ;->list(Ll/᩷۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 329
    :try_start_1
    new-instance v0, Ll/֡ܳ۠;

    invoke-direct {v0, v2}, Ll/֡ܳ۠;-><init>(Ll/᩹ܳ۠;)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۚܳ۠;

    invoke-direct {v1, p0, p2}, Ll/ۚܳ۠;-><init>(Ll/֨ܳ۠;Z)V

    .line 330
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 331
    :try_start_2
    invoke-interface {p1}, Ll/۫ۨᩴ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_1

    .line 328
    :try_start_3
    invoke-interface {p1}, Ll/۫ۨᩴ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Iterable;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 348
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    .line 349
    invoke-virtual {p0, v0, p2}, Ll/֨ܳ۠;->֫(Ll/᩷۠ᩴ;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 343
    iget-object v0, p0, Ll/֨ܳ۠;->ۙ:Ll/᩹ܳ۠;

    invoke-static {v0}, Ll/᩹ܳ۠;->ܿ(Ll/᩹ܳ۠;)Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Ll/֨ܳ۠;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 2

    .line 301
    iget-boolean v0, p0, Ll/֨ܳ۠;->᩶:Z

    const/4 v1, 0x1

    .line 302
    iput-boolean v1, p0, Ll/֨ܳ۠;->᩶:Z

    if-eqz p1, :cond_0

    .line 305
    :try_start_0
    iget-object v1, p0, Ll/֨ܳ۠;->ۙ:Ll/᩹ܳ۠;

    invoke-static {v1, p1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ljava/lang/String;)Ll/ᩴܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷۠ᩴ;

    .line 306
    invoke-direct {p0, v1, p2}, Ll/֨ܳ۠;->ۧ(Ll/᩷۠ᩴ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 311
    iput-boolean v0, p0, Ll/֨ܳ۠;->᩶:Z

    .line 312
    throw p1

    .line 311
    :cond_0
    iput-boolean v0, p0, Ll/֨ܳ۠;->᩶:Z

    return-void
.end method

.method public final ֫(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 296
    iput-object p1, p0, Ll/֨ܳ۠;->᩹:Ll/᩷۠ᩴ;

    return-void
.end method

.method public final ֫(Ll/᩷۠ᩴ;Z)V
    .locals 12

    .line 360
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 365
    :cond_0
    iget-object v0, p0, Ll/֨ܳ۠;->ۙ:Ll/᩹ܳ۠;

    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۖܿ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "compiler"

    if-nez v1, :cond_2

    if-eqz p2, :cond_1

    .line 368
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object p2

    sget-object v0, Ll/᩶ᩴ֨;->᩻֫:Ll/᩶ᩴ֨;

    .line 369
    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4678
    new-instance v1, Ll/ۧܶ۠;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    const-string v2, "path.element.not.found"

    invoke-direct {v1, v4, v2, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    invoke-virtual {p2, v0, v1}, Ll/ۖ֨۠;->֫(Ll/᩶ᩴ֨;Ll/ۧܶ۠;)V

    .line 371
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 375
    :cond_2
    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۖܿ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    .line 376
    iget-object v5, p0, Ll/֨ܳ۠;->᩸:Ljava/util/HashSet;

    invoke-virtual {v5, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_3

    .line 381
    :cond_3
    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v6

    invoke-virtual {v6, p1}, Ll/ۖܿ۠;->ᩳ(Ll/᩷۠ᩴ;)Z

    move-result v6

    const-string v7, "modules"

    if-eqz v6, :cond_5

    .line 383
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v6

    invoke-interface {v6}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v8, ".jmod"

    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 384
    invoke-interface {p1, v7}, Ll/᩷۠ᩴ;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 385
    invoke-static {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ll/᩷۠ᩴ;)Z

    move-result v6

    if-nez v6, :cond_4

    const/4 v6, 0x0

    .line 389
    :try_start_0
    invoke-static {p1, v6}, Ll/֫۠ᩴ;->newFileSystem(Ll/᩷۠ᩴ;Ljava/lang/ClassLoader;)Ll/۟֨ᩴ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۟֨ᩴ;->close()V

    if-eqz p2, :cond_5

    .line 391
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v6

    sget-object v8, Ll/᩶ᩴ֨;->᩻֫:Ll/᩶ᩴ֨;

    .line 392
    sget-object v9, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 5149
    new-instance v9, Ll/ۧܶ۠;

    const-string v10, "unexpected.archive.file"

    new-array v11, v3, [Ljava/lang/Object;

    aput-object p1, v11, v2

    invoke-direct {v9, v4, v10, v11}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-virtual {v6, v8, v9}, Ll/ۖ֨۠;->֫(Ll/᩶ᩴ֨;Ll/ۧܶ۠;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/file/ProviderNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    if-eqz p2, :cond_8

    .line 397
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object p2

    sget-object v0, Ll/᩶ᩴ֨;->᩻֫:Ll/᩶ᩴ֨;

    .line 398
    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4395
    new-instance v1, Ll/ۧܶ۠;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    const-string p1, "invalid.archive.file"

    invoke-direct {v1, v4, p1, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    invoke-virtual {p2, v0, v1}, Ll/ۖ֨۠;->֫(Ll/᩶ᩴ֨;Ll/ۧܶ۠;)V

    goto/16 :goto_3

    .line 403
    :cond_4
    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۖܿ۠;->֫()Ll/֨᩶۠;

    move-result-object v6

    if-nez v6, :cond_5

    .line 404
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object p2

    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2697
    new-instance v0, Ll/۫۠۠;

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v2

    const-string p1, "no.zipfs.for.archive"

    invoke-direct {v0, v4, p1, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    invoke-virtual {p2, v0}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    return-void

    .line 413
    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 414
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 416
    iget-boolean v1, p0, Ll/֨ܳ۠;->᩶:Z

    if-eqz v1, :cond_8

    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۖܿ۠;->ᩳ(Ll/᩷۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1, v7}, Ll/᩷۠ᩴ;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 427
    :try_start_1
    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۖܿ۠;->ܽ(Ll/᩷۠ᩴ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷۠ᩴ;

    .line 428
    invoke-virtual {p0, v5, p2}, Ll/֨ܳ۠;->֫(Ll/᩷۠ᩴ;Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    .line 431
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    sget v1, Ll/ۨܿ۠;->᩻֫:I

    .line 1254
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    goto :goto_2

    .line 1257
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    goto :goto_2

    .line 1260
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 431
    :goto_2
    sget-object p2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1366
    new-instance p2, Ll/۫۠۠;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v2

    aput-object v1, v5, v3

    const-string p1, "error.reading.file"

    invoke-direct {p2, v4, p1, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    invoke-virtual {v0, p2}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    :cond_8
    :goto_3
    return-void
.end method

.method public final ۧ(Ljava/lang/String;Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 337
    iget-object v0, p0, Ll/֨ܳ۠;->ۙ:Ll/᩹ܳ۠;

    iget-object v1, p0, Ll/֨ܳ۠;->᩹:Ll/᩷۠ᩴ;

    invoke-static {v0, p1, v1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ljava/lang/String;Ll/᩷۠ᩴ;)Ll/ᩴܶ۠;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/֨ܳ۠;->֫(Ljava/lang/Iterable;Z)V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x1

    .line 286
    iput-boolean v0, p0, Ll/֨ܳ۠;->᩶:Z

    return-void
.end method
