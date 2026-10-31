.class public final Ll/ۘᩴ۠;
.super Ljava/lang/Object;
.source "640U"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ۙ:Ljava/lang/ClassLoader;

.field public ᩶:Ll/᩸᩸۠;

.field public ᩸:Ll/᩹ܶ۠;

.field public ᩹:Ljava/util/Iterator;


# direct methods
.method public static ֫(Ljava/lang/Class;)V
    .locals 6

    .line 622
    :try_start_0
    const-class v0, Ljava/lang/Class;

    const-string v1, "getModule"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 623
    const-class v1, Ll/ۘᩴ۠;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 624
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 626
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "addReads"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    .line 627
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v5

    .line 628
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 632
    new-instance v0, Ll/۠ۖ֨;

    .line 86
    invoke-direct {v0, p0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 632
    throw v0

    :catch_1
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 9

    const-string v0, "compiler"

    .line 563
    iget-object v1, p0, Ll/ۘᩴ۠;->᩹:Ljava/util/Iterator;

    iget-object v2, p0, Ll/ۘᩴ۠;->᩶:Ll/᩸᩸۠;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    .line 566
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_1

    goto :goto_1

    .line 569
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 583
    iget-object v2, p0, Ll/ۘᩴ۠;->᩸:Ll/᩹ܶ۠;

    const/4 v5, 0x0

    :try_start_0
    iget-object v6, p0, Ll/ۘᩴ۠;->ۙ:Ljava/lang/ClassLoader;

    invoke-virtual {v6, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 584
    invoke-static {v6}, Ll/ۘᩴ۠;->֫(Ljava/lang/Class;)V

    .line 585
    invoke-virtual {v6, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸᩸۠;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v6

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 593
    :catch_0
    :try_start_1
    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3304
    new-instance v6, Ll/۫۠۠;

    const-string v7, "proc.processor.cant.instantiate"

    new-array v8, v3, [Ljava/lang/Object;

    aput-object v1, v8, v4

    invoke-direct {v6, v0, v7, v8}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    invoke-virtual {v2, v6}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    goto :goto_0

    .line 590
    :catch_1
    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3320
    new-instance v6, Ll/۫۠۠;

    const-string v7, "proc.processor.wrong.type"

    new-array v8, v3, [Ljava/lang/Object;

    aput-object v1, v8, v4

    invoke-direct {v6, v0, v7, v8}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    invoke-virtual {v2, v6}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    goto :goto_0

    .line 587
    :catch_2
    sget-object v6, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3312
    new-instance v6, Ll/۫۠۠;

    const-string v7, "proc.processor.not.found"

    new-array v8, v3, [Ljava/lang/Object;

    aput-object v1, v8, v4

    invoke-direct {v6, v0, v7, v8}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    invoke-virtual {v2, v6}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-nez v5, :cond_2

    :goto_1
    return v4

    .line 573
    :cond_2
    iput-object v5, p0, Ll/ۘᩴ۠;->᩶:Ll/᩸᩸۠;

    return v3

    .line 599
    :goto_2
    new-instance v1, Ll/ۧᩴ۠;

    .line 40
    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 599
    throw v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 604
    invoke-virtual {p0}, Ll/ۘᩴ۠;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 605
    iget-object v0, p0, Ll/ۘᩴ۠;->᩶:Ll/᩸᩸۠;

    const/4 v1, 0x0

    .line 606
    iput-object v1, p0, Ll/ۘᩴ۠;->᩶:Ll/᩸᩸۠;

    return-object v0

    .line 609
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 613
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
