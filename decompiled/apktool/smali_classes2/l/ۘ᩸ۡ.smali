.class public final Ll/ۘ᩸ۡ;
.super Ljava/lang/Object;
.source "84GP"


# direct methods
.method public static ֫(Ljava/lang/String;)[B
    .locals 3

    .line 50
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v0

    new-instance v1, Ll/ۢ۟᩵;

    invoke-direct {v1}, Ll/ۢ۟᩵;-><init>()V

    invoke-virtual {v1, p0}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object p0

    invoke-interface {p0}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 55
    invoke-virtual {p0}, Ll/֡۟᩵;->ܽ()[B

    move-result-object p0

    return-object p0

    .line 54
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Response body is null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 57
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Response code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\nMessage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 6

    .line 62
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 63
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    move-object v2, p0

    .line 66
    :cond_0
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 67
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v5, "["

    .line 68
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz p0, :cond_1

    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p0

    const/4 v2, 0x1

    sub-int/2addr p0, v2

    invoke-virtual {v4, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    :cond_2
    if-eqz p0, :cond_0

    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_3

    const/16 v4, 0xa

    .line 75
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    :cond_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    if-eqz p0, :cond_5

    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :cond_5
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catchall_0
    move-exception p0

    .line 63
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object v0
.end method
