.class public final Ll/֡ۖ֡;
.super Ljava/io/BufferedReader;
.source "54IP"

# interfaces
.implements Ll/᩵֨ᩴ;


# virtual methods
.method public synthetic lines()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۚ֨ᩴ;->lines(Ljava/io/BufferedReader;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final readLine()Ljava/lang/String;
    .locals 6

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    iget-object v0, p0, Ljava/io/BufferedReader;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 56
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/Reader;->read()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_2

    if-eqz v3, :cond_0

    const/16 v3, 0xa

    if-ne v4, v3, :cond_0

    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_0
    const/16 v3, 0xd

    if-ne v4, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    int-to-char v4, v4

    .line 61
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 63
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    :cond_3
    return-object v0

    :catchall_0
    move-exception v1

    .line 63
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
