.class public final Ll/ۤᩴ۠;
.super Ljava/lang/Object;
.source "C42E"


# direct methods
.method public static ֫(Ljava/lang/String;)V
    .locals 3

    .line 60
    new-instance v0, Ll/۫ᩴ۠;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Ll/᩸᩸۠;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 60
    throw v0
.end method

.method public static ֫(Ljava/net/URL;Ljava/lang/String;)V
    .locals 1

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ":1: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static ֫(Ljava/net/URL;)Z
    .locals 11

    const-string v0, ": "

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 88
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_b
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    :try_start_1
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    const-string v6, "utf-8"

    invoke-direct {v5, v3, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :cond_0
    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_8

    const/16 v6, 0x23

    .line 93
    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_1

    .line 94
    invoke-virtual {v5, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 95
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 96
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_0

    const/16 v7, 0x20

    .line 98
    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-gez v7, :cond_7

    const/16 v7, 0x9

    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-gez v7, :cond_7

    .line 100
    invoke-virtual {v5, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    .line 101
    invoke-static {v7}, Ljava/lang/Character;->isJavaIdentifierStart(I)Z

    move-result v8
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v9, "Illegal provider-class name: "

    if-eqz v8, :cond_6

    .line 103
    :try_start_3
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    :goto_0
    if-ge v7, v6, :cond_4

    .line 104
    invoke-virtual {v5, v7}, Ljava/lang/String;->codePointAt(I)I

    move-result v8

    .line 105
    invoke-static {v8}, Ljava/lang/Character;->isJavaIdentifierPart(I)Z

    move-result v10

    if-nez v10, :cond_3

    const/16 v10, 0x2e

    if-ne v8, v10, :cond_2

    goto :goto_1

    .line 106
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5}, Ll/ۤᩴ۠;->֫(Ljava/net/URL;Ljava/lang/String;)V

    throw v2

    .line 103
    :cond_3
    :goto_1
    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v8
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    add-int/2addr v7, v8

    goto :goto_0

    .line 117
    :cond_4
    :try_start_4
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    const/4 p0, 0x1

    if-eqz v3, :cond_5

    .line 122
    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 124
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    :cond_5
    return p0

    :catch_1
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 119
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    .line 102
    :cond_6
    :try_start_6
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5}, Ll/ۤᩴ۠;->֫(Ljava/net/URL;Ljava/lang/String;)V

    throw v2

    :cond_7
    const-string v5, "Illegal configuration-file syntax"

    .line 99
    invoke-static {p0, v5}, Ll/ۤᩴ۠;->֫(Ljava/net/URL;Ljava/lang/String;)V

    throw v2
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 117
    :cond_8
    :try_start_7
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    if-eqz v3, :cond_c

    .line 122
    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    return v1

    :catch_2
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 124
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    :catch_3
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 119
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    :catch_4
    move-exception p0

    goto :goto_2

    :catch_5
    nop

    goto :goto_6

    :catchall_0
    move-exception p0

    move-object v4, v2

    goto :goto_3

    :catch_6
    move-exception p0

    move-object v4, v2

    goto :goto_2

    :catch_7
    move-object v4, v2

    goto :goto_6

    :catchall_1
    move-exception p0

    move-object v3, v2

    move-object v4, v3

    goto :goto_3

    :catch_8
    move-exception p0

    move-object v3, v2

    move-object v4, v3

    .line 114
    :goto_2
    :try_start_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception p0

    :goto_3
    if-eqz v4, :cond_9

    .line 117
    :try_start_a
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    goto :goto_4

    :catch_9
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 119
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    :cond_9
    :goto_4
    if-eqz v3, :cond_a

    .line 122
    :try_start_b
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    goto :goto_5

    :catch_a
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 124
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    .line 126
    :cond_a
    :goto_5
    throw p0

    :catch_b
    move-object v3, v2

    move-object v4, v3

    :goto_6
    if-eqz v4, :cond_b

    .line 117
    :try_start_c
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_7

    :catch_c
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 119
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    :cond_b
    :goto_7
    if-eqz v3, :cond_c

    .line 122
    :try_start_d
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_8

    :catch_d
    move-exception p0

    .line 0
    invoke-static {v0, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 124
    invoke-static {p0}, Ll/ۤᩴ۠;->֫(Ljava/lang/String;)V

    throw v2

    :cond_c
    :goto_8
    return v1
.end method

.method public static ֫([Ljava/net/URL;)Z
    .locals 7

    .line 2
    const-class v0, Ll/᩸᩸۠;

    .line 136
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p0, v3

    .line 138
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "META-INF/services/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 139
    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v4, v5}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 140
    invoke-static {v6}, Ll/ۤᩴ۠;->֫(Ljava/net/URL;)Z

    move-result v4
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method
