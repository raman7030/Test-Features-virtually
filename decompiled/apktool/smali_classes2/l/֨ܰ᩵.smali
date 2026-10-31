.class public final Ll/֨ܰ᩵;
.super Ljava/lang/Object;
.source "24DT"

# interfaces
.implements Ll/۠ܰ᩵;


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    if-eqz p1, :cond_0

    .line 40
    :try_start_0
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/net/UnknownHostException;

    const-string v2, "Broken system behaviour for dns lookup of "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 45
    throw v1

    .line 38
    :cond_0
    new-instance p1, Ljava/net/UnknownHostException;

    const-string v0, "hostname == null"

    invoke-direct {p1, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
