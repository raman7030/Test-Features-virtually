.class public final Ll/ᩴۡ۠;
.super Ljava/lang/Object;
.source "P43R"


# direct methods
.method public static ֫(Ll/ۖܶ۠;)Ljava/util/ArrayList;
    .locals 14

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "JDK_JAVAC_OPTIONS"

    .line 232
    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    .line 233
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_5

    .line 238
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    .line 241
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :cond_1
    :goto_0
    if-ge v5, v3, :cond_9

    .line 247
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x20

    const/16 v9, 0xd

    const/16 v10, 0xc

    const/16 v11, 0xa

    const/16 v12, 0x9

    if-eq v7, v12, :cond_5

    if-eq v7, v11, :cond_5

    if-eq v7, v10, :cond_5

    if-eq v7, v9, :cond_5

    if-eq v7, v8, :cond_5

    const/16 v8, 0x22

    if-eq v7, v8, :cond_2

    const/16 v8, 0x27

    if-eq v7, v8, :cond_2

    goto :goto_2

    :cond_2
    if-nez v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    if-ne v6, v7, :cond_4

    const/4 v6, 0x0

    goto :goto_3

    .line 255
    :cond_4
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    if-nez v6, :cond_8

    .line 261
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_1
    if-eq v7, v10, :cond_6

    if-eq v7, v11, :cond_6

    if-eq v7, v9, :cond_6

    if-eq v7, v12, :cond_6

    if-ne v7, v8, :cond_1

    :cond_6
    add-int/lit8 v5, v5, 0x1

    if-lt v5, v3, :cond_7

    goto :goto_4

    .line 268
    :cond_7
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    goto :goto_1

    .line 274
    :cond_8
    :goto_2
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 278
    :cond_9
    :goto_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eqz v1, :cond_a

    .line 279
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    if-nez v6, :cond_b

    goto :goto_5

    .line 282
    :cond_b
    new-instance p0, Ll/ۘۡ۠;

    invoke-direct {p0}, Ll/ۘۡ۠;-><init>()V

    throw p0

    .line 101
    :cond_c
    :goto_5
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 102
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 67
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_10

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x40

    if-ne v3, v5, :cond_10

    .line 68
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v5, :cond_d

    .line 70
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_d
    new-array v3, v2, [Ljava/lang/String;

    .line 108
    invoke-static {v1, v3}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܿ۠ᩴ;->newBufferedReader(Ll/᩷۠ᩴ;Ljava/nio/charset/Charset;)Ljava/io/BufferedReader;

    move-result-object v1

    .line 109
    :try_start_0
    new-instance v3, Ll/ۖۡ۠;

    invoke-direct {v3, v1}, Ll/ۖۡ۠;-><init>(Ljava/io/BufferedReader;)V

    .line 111
    :goto_7
    invoke-virtual {v3}, Ll/ۖۡ۠;->֫()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    .line 112
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    .line 114
    :cond_e
    invoke-virtual {v1}, Ljava/io/Reader;->close()V

    goto :goto_6

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_f

    .line 108
    :try_start_1
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_f
    :goto_8
    throw p0

    .line 75
    :cond_10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_11
    return-object p0
.end method
