.class public Ll/ۚᩴ۠;
.super Ljava/lang/Object;
.source "640U"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩶:Ll/᩹ܶ۠;

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:Ljava/util/ServiceLoader;


# direct methods
.method public constructor <init>(Ljava/util/ServiceLoader;Ll/᩹ܶ۠;)V
    .locals 0

    .line 435
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 436
    iput-object p2, p0, Ll/ۚᩴ۠;->᩶:Ll/᩹ܶ۠;

    .line 437
    iput-object p1, p0, Ll/ۚᩴ۠;->᩹:Ljava/util/ServiceLoader;

    .line 438
    invoke-virtual {p1}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ۚᩴ۠;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 8

    const-string v0, "proc.cant.load.class"

    const-string v1, "compiler"

    .line 444
    iget-object v2, p0, Ll/ۚᩴ۠;->᩶:Ll/᩹ܶ۠;

    const/4 v3, 0x0

    const/4 v4, 0x1

    :try_start_0
    invoke-virtual {p0}, Ll/ۚᩴ۠;->֫()Z

    move-result v0
    :try_end_0
    .catch Ljava/util/ServiceConfigurationError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/UnsupportedClassVersionError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassFormatError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .line 455
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۛᩴ۠;->ۧ(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 456
    new-instance v1, Ll/ۜ֨۠;

    .line 40
    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 456
    throw v1

    :catch_0
    move-exception v5

    .line 452
    invoke-virtual {v5}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3266
    new-instance v7, Ll/۫۠۠;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v6, v4, v3

    invoke-direct {v7, v1, v0, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    invoke-virtual {v2, v7}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 453
    new-instance v0, Ll/ۜ֨۠;

    .line 40
    invoke-direct {v0, v5}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 453
    throw v0

    :catch_1
    move-exception v5

    .line 449
    invoke-virtual {v5}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3266
    new-instance v7, Ll/۫۠۠;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v6, v4, v3

    invoke-direct {v7, v1, v0, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    invoke-virtual {v2, v7}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 450
    new-instance v0, Ll/ۜ֨۠;

    .line 40
    invoke-direct {v0, v5}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 450
    throw v0

    :catch_2
    move-exception v0

    .line 446
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۛᩴ۠;->ۧ(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 447
    new-instance v1, Ll/ۜ֨۠;

    .line 40
    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 447
    throw v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 467
    iget-object v0, p0, Ll/ۚᩴ۠;->᩶:Ll/᩹ܶ۠;

    :try_start_0
    invoke-virtual {p0}, Ll/ۚᩴ۠;->ۧ()Ll/᩸᩸۠;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/ServiceConfigurationError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    .line 472
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۛᩴ۠;->ۧ(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 473
    new-instance v0, Ll/ۜ֨۠;

    .line 40
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 473
    throw v0

    :catch_0
    move-exception v1

    .line 469
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۛᩴ۠;->ۧ(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 470
    new-instance v0, Ll/ۜ֨۠;

    .line 40
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 470
    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 483
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ֫()Z
    .locals 1

    .line 461
    iget-object v0, p0, Ll/ۚᩴ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public ۧ()Ll/᩸᩸۠;
    .locals 1

    .line 478
    iget-object v0, p0, Ll/ۚᩴ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸᩸۠;

    return-object v0
.end method
