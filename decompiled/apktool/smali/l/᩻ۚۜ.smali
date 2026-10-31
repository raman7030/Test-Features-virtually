.class public final Ll/᩻ۚۜ;
.super Ljava/lang/Object;
.source "O6N2"


# direct methods
.method public static ֫(Landroid/net/Uri;Ljava/util/ArrayList;Ll/ۜܶۜ;)Ll/ۖܶۜ;
    .locals 4

    .line 72
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_6

    .line 73
    invoke-static {p2}, Ll/᩻ۚۜ;->֫(Ll/ܿۖ᩷;)V

    if-eqz p0, :cond_5

    const-string v0, "file"

    .line 74
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    .line 76
    invoke-static {p0, p2, v0}, Ll/᩻ۚۜ;->֫(Landroid/net/Uri;Ll/ܿۖ᩷;Z)Ll/ۖܶۜ;

    move-result-object p0

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 78
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 81
    invoke-static {p2}, Ll/᩻ۚۜ;->֫(Ll/ܿۖ᩷;)V

    if-eqz v2, :cond_3

    const-string v3, "/"

    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 83
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    .line 84
    invoke-static {v2, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 86
    new-instance v3, Ll/ۢۧ᩻;

    invoke-direct {v3, v2}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 85
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Selected gallery source cannot be reopened independently"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 82
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid restored gallery path"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 89
    :cond_4
    new-instance p1, Ll/ۖܶۜ;

    invoke-virtual {p0}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object p2

    invoke-virtual {p0}, Ll/ۖܶۜ;->֫()I

    move-result p0

    invoke-direct {p1, p2, v0, p0}, Ll/ۖܶۜ;-><init>(Ll/ܰܺܳ;Ljava/util/List;I)V

    return-object p1

    .line 75
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Gallery source cannot be reopened independently"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 72
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Gallery arguments require a worker"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/net/Uri;Ll/ۜܶۜ;)Ll/ۖܶۜ;
    .locals 1

    const/4 v0, 0x0

    .line 31
    invoke-static {p0, p1, v0}, Ll/᩻ۚۜ;->֫(Landroid/net/Uri;Ll/ܿۖ᩷;Z)Ll/ۖܶۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;Ll/ܿۖ᩷;Z)Ll/ۖܶۜ;
    .locals 8

    .line 35
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_9

    if-eqz p0, :cond_8

    .line 36
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "content"

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 38
    :cond_0
    invoke-static {p1}, Ll/᩻ۚۜ;->֫(Ll/ܿۖ᩷;)V

    .line 40
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ll/ܳ᩸ܿ;

    invoke-direct {v0, p0}, Ll/ܳ᩸ܿ;-><init>(Landroid/net/Uri;)V

    goto :goto_0

    .line 41
    :cond_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 42
    :goto_0
    new-instance v2, Ll/ۢۧ᩻;

    invoke-direct {v2, v0}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    .line 43
    invoke-static {p1}, Ll/᩻ۚۜ;->֫(Ll/ܿۖ᩷;)V

    .line 44
    sget-object v3, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    .line 45
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 46
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    .line 47
    sget-object p0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Ll/ܳۚۜ;

    invoke-direct {v5, v3, v0}, Ll/ܳۚۜ;-><init>(Ll/ۖۧ᩻;Ll/ܶ᩵ܿ;)V

    invoke-interface {p0, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    .line 49
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1f4

    invoke-interface {p0, v5, v6, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    goto :goto_1

    .line 52
    :catch_0
    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 55
    :cond_2
    :goto_1
    invoke-static {p1}, Ll/᩻ۚۜ;->֫(Ll/ܿۖ᩷;)V

    .line 56
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v4, v2

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 59
    invoke-static {p1}, Ll/᩻ۚۜ;->֫(Ll/ܿۖ᩷;)V

    .line 60
    invoke-interface {v5}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 62
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v4, v5

    goto :goto_2

    .line 63
    :cond_4
    invoke-interface {v5}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v6

    const-string v7, "image/"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_5

    if-eqz p2, :cond_3

    invoke-static {v5}, Ll/ۜۚۜ;->֫(Ll/ᩳۜܳ;)Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_5
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    if-ne v4, v2, :cond_7

    .line 65
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    :cond_7
    invoke-static {p0, v1, v1}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    .line 67
    new-instance p1, Ll/ۖܶۜ;

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p2

    invoke-direct {p1, v3, p0, p2}, Ll/ۖܶۜ;-><init>(Ll/ܰܺܳ;Ljava/util/List;I)V

    return-object p1

    .line 37
    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported gallery URI"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 35
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Gallery arguments require a worker"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 1

    .line 93
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "Gallery argument request canceled"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
