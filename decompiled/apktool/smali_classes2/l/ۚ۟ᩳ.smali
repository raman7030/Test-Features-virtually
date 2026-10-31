.class public final Ll/ۚ۟ᩳ;
.super Ljava/lang/Object;
.source "N6QO"


# direct methods
.method public static ֫(Landroid/os/Bundle;Ljava/lang/String;)Z
    .locals 1

    .line 35
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Path"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Landroid/os/Bundle;Ljava/lang/String;)[B
    .locals 1

    .line 41
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "Path"

    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    .line 45
    invoke-static {p0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 47
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 49
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 50
    :cond_1
    new-instance p0, Ljava/io/UncheckedIOException;

    invoke-direct {p0, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p0

    .line 44
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Missing memory view state"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
