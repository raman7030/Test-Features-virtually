.class public final Ll/ܽᩳۖ;
.super Ljava/lang/Object;
.source "LAZU"


# direct methods
.method public static ֫(Ljava/lang/String;)Ll/᩺ܽۖ;
    .locals 2

    .line 92
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 109
    :try_start_0
    new-instance p0, Ll/ܿۜۖ;

    invoke-direct {p0, v0}, Ll/ܿۜۖ;-><init>(Ljava/io/StringReader;)V

    .line 110
    invoke-static {p0}, Ll/ܽᩳۖ;->֫(Ll/ܿۜۖ;)Ll/᩺ܽۖ;

    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    instance-of v1, v0, Ll/۟ܽۖ;

    if-nez v1, :cond_1

    .line 111
    invoke-virtual {p0}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object p0

    sget-object v1, Ll/ܳۜۖ;->۬:Ll/ܳۜۖ;

    if-ne p0, v1, :cond_0

    goto :goto_0

    .line 112
    :cond_0
    new-instance p0, Ll/ܳᩳۖ;

    const-string v0, "Did not consume the entire document."

    .line 42
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 112
    throw p0
    :try_end_0
    .catch Ll/ۜۜۖ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    :goto_0
    return-object v0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 118
    new-instance v0, Ll/ܰܽۖ;

    .line 62
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 118
    throw v0

    :catch_2
    move-exception p0

    .line 116
    :goto_1
    new-instance v0, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 116
    throw v0
.end method

.method public static ֫(Ll/ܿۜۖ;)Ll/᩺ܽۖ;
    .locals 5

    const-string v0, "Failed parsing JSON source: "

    .line 138
    invoke-virtual {p0}, Ll/ܿۜۖ;->ۘ()Ll/ܺᩳۖ;

    move-result-object v1

    .line 139
    sget-object v2, Ll/ܺᩳۖ;->᩹:Ll/ܺᩳۖ;

    if-ne v1, v2, :cond_0

    .line 141
    sget-object v2, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    invoke-virtual {p0, v2}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 144
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/᩵ܿۖ;->֫(Ll/ܿۜۖ;)Ll/᩺ܽۖ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    invoke-virtual {p0, v1}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    .line 146
    :goto_0
    :try_start_1
    new-instance v3, Ll/ۧᩳۖ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to Json"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-direct {v3, v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    :goto_1
    invoke-virtual {p0, v1}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 149
    throw v0
.end method
