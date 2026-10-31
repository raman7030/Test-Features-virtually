.class public final Ll/᩸᩻ۡ;
.super Ll/۫ۨۘ;
.source "A924"


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    const-string v0, "http"

    const-string v1, "https"

    .line 599
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/֨ۨۘ;
    .locals 3

    .line 556
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    invoke-static {}, Ll/᩶᩻ۡ;->ۧ()Ll/ۧܰ᩵;

    move-result-object v1

    .line 557
    invoke-virtual {v0, v1}, Ll/ۢ۟᩵;->֫(Ll/ۧܰ᩵;)V

    .line 558
    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 559
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 564
    :try_start_0
    invoke-static {}, Ll/᩶᩻ۡ;->ܽ()Ll/ܿ۟᩵;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 569
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 571
    invoke-virtual {v1}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_3

    const-string p1, "Content-Type"

    .line 579
    invoke-virtual {v0, p1}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0x3b

    .line 589
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-le v0, v2, :cond_2

    const/4 v2, 0x0

    .line 591
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, p1

    .line 581
    :goto_1
    invoke-static {v1, v2}, Ll/۠ۨۘ;->֫(Ljava/io/InputStream;Ljava/lang/String;)Ll/֨ۨۘ;

    move-result-object p1

    return-object p1

    .line 575
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Response does not contain body: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 566
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Exception obtaining network resource: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
