.class public final Ll/ۢᩴ᩻;
.super Ljava/lang/Object;
.source "97G0"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "ssh-rsa"

    if-eqz p0, :cond_3

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, ","

    .line 44
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 45
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object p0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const-string v0, ",ssh-rsa"

    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public static ֫(Ll/۟ۢۘ;)V
    .locals 2

    const-string v0, "StrictHostKeyChecking"

    const-string v1, "no"

    .line 30
    invoke-virtual {p0, v0, v1}, Ll/۟ۢۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "server_host_key"

    .line 31
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢᩴ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/۟ۢۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "PubkeyAcceptedAlgorithms"

    .line 33
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢᩴ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-virtual {p0, v0, v1}, Ll/۟ۢۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
