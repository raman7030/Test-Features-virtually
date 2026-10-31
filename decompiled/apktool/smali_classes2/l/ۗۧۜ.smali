.class public final Ll/ۗۧۜ;
.super Ljava/lang/Object;
.source "17A1"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;Ljava/util/HashSet;)Ljava/util/HashMap;
    .locals 7

    const-string v0, "Invalid entry resource cache record"

    .line 81
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 82
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 83
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 85
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 86
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    return-object p1

    :cond_1
    const-string v2, "entry_resources.jsonl"

    .line 295
    invoke-virtual {p0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܳۧ()Ljava/io/BufferedReader;

    move-result-object p0

    .line 92
    :cond_2
    :goto_1
    :try_start_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_5

    .line 205
    :try_start_1
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3, v2}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v2, "entry"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v4, 0x0

    .line 117
    :try_start_3
    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v5, "resourceId"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    const-string v6, "resourceName"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v2, :cond_4

    if-eqz v5, :cond_4

    if-eqz v3, :cond_4

    .line 100
    :try_start_8
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 103
    :cond_3
    new-instance v4, Ll/ۙۧۜ;

    invoke-direct {v4, v5, v3}, Ll/ۙۧۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v3

    if-ne v2, v3, :cond_2

    goto :goto_2

    .line 98
    :cond_4
    new-instance p1, Ll/᩶ۧۜ;

    .line 326
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    throw p1

    :catch_0
    move-exception p1

    .line 119
    new-instance v1, Ll/᩶ۧۜ;

    .line 333
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    throw v1

    :catch_1
    move-exception p1

    new-instance v1, Ll/᩶ۧۜ;

    .line 333
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    throw v1

    :catch_2
    move-exception p1

    new-instance v1, Ll/᩶ۧۜ;

    .line 333
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    throw v1

    :catch_3
    move-exception p1

    .line 207
    new-instance v1, Ll/᩶ۧۜ;

    .line 333
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 108
    :cond_5
    :goto_2
    invoke-virtual {p0}, Ljava/io/BufferedReader;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 90
    :try_start_9
    invoke-virtual {p0}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/᩵ᩳۜ;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/HashMap;
    .locals 2

    .line 47
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 48
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܳۜ;

    .line 49
    iget-object v1, v1, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 52
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0

    :cond_1
    if-nez p1, :cond_2

    .line 56
    :try_start_0
    invoke-static {p0, v0}, Ll/ۗۧۜ;->֫(Ll/ܶ᩵ܿ;Ljava/util/HashSet;)Ljava/util/HashMap;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 59
    :catch_0
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0

    :cond_2
    const-string p3, "entry_resources.jsonl"

    .line 295
    invoke-virtual {p0, p3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p3

    .line 152
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    .line 155
    :cond_3
    invoke-static {p0, p1, p2}, Ll/ۗۧۜ;->֫(Ll/ܶ᩵ܿ;Ll/᩵ᩳۜ;Ljava/lang/Iterable;)V

    .line 64
    :goto_1
    :try_start_1
    invoke-static {p0, v0}, Ll/ۗۧۜ;->֫(Ll/ܶ᩵ܿ;Ljava/util/HashSet;)Ljava/util/HashMap;

    move-result-object p0
    :try_end_1
    .catch Ll/᩶ۧۜ; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    .line 67
    :catch_1
    invoke-static {p0, p1, p2}, Ll/ۗۧۜ;->֫(Ll/ܶ᩵ܿ;Ll/᩵ᩳۜ;Ljava/lang/Iterable;)V

    .line 69
    :try_start_2
    invoke-static {p0, v0}, Ll/ۗۧۜ;->֫(Ll/ܶ᩵ܿ;Ljava/util/HashSet;)Ljava/util/HashMap;

    move-result-object p0
    :try_end_2
    .catch Ll/᩶ۧۜ; {:try_start_2 .. :try_end_2} :catch_2

    return-object p0

    .line 71
    :catch_2
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/᩵ᩳۜ;Ljava/lang/Iterable;)V
    .locals 4

    .line 252
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 253
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܳۜ;

    .line 254
    iget-object v2, v1, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 255
    iget-object v1, v1, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 166
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ll/᩵ᩳۜ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object p1

    invoke-static {p0, p1, v0}, Ll/ۗۧۜ;->֫(Ll/ܶ᩵ܿ;Ll/᩺᩻ܽ;Ljava/util/HashSet;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 265
    :catch_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    const-string p1, ".entry_resources.jsonl.tmp"

    .line 299
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 267
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 270
    :try_start_1
    new-instance p2, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/OutputStreamWriter;

    const/4 v1, 0x0

    .line 446
    invoke-virtual {p1, v1}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1

    .line 271
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {p2, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 273
    invoke-virtual {p2}, Ljava/io/BufferedWriter;->close()V

    const-string p2, "entry_resources.jsonl"

    .line 295
    invoke-virtual {p0, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 287
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 288
    invoke-virtual {p1, p0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 291
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    return-void

    .line 289
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p2, "Failed to publish entry resource cache"

    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    .line 278
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 280
    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/᩺᩻ܽ;Ljava/util/HashSet;)V
    .locals 5

    .line 128
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    const-string v0, ".entry_resources.jsonl.tmp"

    .line 299
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 133
    :try_start_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    const/4 v3, 0x0

    .line 446
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v3

    .line 134
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 135
    :try_start_1
    invoke-static {p1, p2, v1}, Ll/ۗۧۜ;->֫(Ll/᩺᩻ܽ;Ljava/util/HashSet;Ljava/io/BufferedWriter;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V

    const-string p1, "entry_resources.jsonl"

    .line 295
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 287
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 288
    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 291
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    return-void

    .line 289
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Failed to publish entry resource cache"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_0
    move-exception p0

    .line 133
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    .line 141
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 143
    throw p0
.end method

.method public static ֫(Ll/᩺᩻ܽ;Ljava/util/HashSet;Ljava/io/BufferedWriter;)V
    .locals 12

    .line 177
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 178
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 179
    invoke-virtual {p0}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩻ܽ;

    .line 180
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 183
    :cond_1
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 184
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡᩻ܽ;

    .line 185
    invoke-interface {v4}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    .line 188
    :cond_3
    invoke-interface {v4}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "string"

    .line 240
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "array"

    .line 241
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "plurals"

    .line 242
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "style"

    .line 243
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "attr"

    .line 244
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "id"

    .line 245
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_1

    .line 191
    :cond_4
    invoke-interface {v4}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۜ᩻ܽ;

    .line 192
    invoke-interface {v6}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷᩻ܽ;

    .line 217
    invoke-interface {v7}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_2

    .line 220
    :cond_7
    invoke-interface {v7}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 221
    invoke-interface {v8}, Ll/֨᩻ܽ;->ۖ()I

    move-result v9

    const/4 v10, 0x3

    if-ne v9, v10, :cond_6

    invoke-interface {v8}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v9

    if-nez v9, :cond_8

    goto :goto_2

    .line 224
    :cond_8
    invoke-interface {v8}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v8

    invoke-interface {v8}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v8

    const-string v9, "/"

    .line 225
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_6

    invoke-virtual {p1, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_2

    .line 228
    :cond_9
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "entry"

    .line 229
    invoke-virtual {v10, v11, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 230
    invoke-interface {v7}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v10

    .line 727
    invoke-static {v10}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "resourceId"

    .line 230
    invoke-virtual {v8, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    invoke-interface {v4}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v7}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v9, "resourceName"

    invoke-virtual {v8, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 232
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v7

    .line 228
    invoke-virtual {p2, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 233
    invoke-virtual {p2}, Ljava/io/BufferedWriter;->newLine()V

    goto/16 :goto_2

    :cond_a
    return-void
.end method
