.class public final Ll/֫᩶ۘ;
.super Ljava/lang/Object;
.source "6AAS"

# interfaces
.implements Ll/ۧ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ᩴ۟᩵;)Ljava/lang/Object;
    .locals 3

    .line 20
    invoke-static {p1}, Ll/ܽ᩶ۘ;->ۧ(Ll/ᩴ۟᩵;)V

    .line 22
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 27
    invoke-virtual {v0}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object p1

    .line 38
    const-class v0, Lcom/thegrizzlylabs/sardineandroid/model/Multistatus;

    invoke-static {v0, p1}, Ll/ܳ᩶ۘ;->֫(Ljava/lang/Class;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/thegrizzlylabs/sardineandroid/model/Multistatus;

    .line 26
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Multistatus;->getResponse()Ljava/util/List;

    move-result-object p1

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thegrizzlylabs/sardineandroid/model/Response;

    .line 30
    :try_start_0
    new-instance v2, Ll/۠᩹ۘ;

    invoke-direct {v2, v1}, Ll/۠᩹ۘ;-><init>(Lcom/thegrizzlylabs/sardineandroid/model/Response;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 32
    :catch_0
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getHref()Ljava/lang/String;

    goto :goto_0

    :cond_0
    return-object v0

    .line 24
    :cond_1
    new-instance v0, Ll/ۨ᩹ۘ;

    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object p1

    const-string v2, "No entity found in response"

    invoke-direct {v0, v2, v1, p1}, Ll/ۨ᩹ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    throw v0
.end method
