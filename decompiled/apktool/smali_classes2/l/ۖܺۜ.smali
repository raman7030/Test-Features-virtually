.class public final Ll/ۖܺۜ;
.super Ljava/lang/Object;
.source "46W4"


# instance fields
.field public final ֫:Ll/᩻ܺۜ;

.field public final ۧ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;Ll/᩻ܺۜ;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/ۖܺۜ;->ۧ:Ll/ᩳۖۜ;

    .line 33
    iput-object p2, p0, Ll/ۖܺۜ;->֫:Ll/᩻ܺۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;ZZZ)Ll/ۨۘܽ;
    .locals 1

    if-eqz p2, :cond_1

    if-eqz p4, :cond_0

    const/16 p2, 0x8

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    const/16 p2, 0x10

    :goto_0
    if-nez p3, :cond_2

    or-int/lit8 p2, p2, 0x42

    .line 146
    :cond_2
    :try_start_0
    invoke-static {p2, p0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p2

    .line 148
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Invalid regular expression: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/util/regex/PatternSyntaxException;->getDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 149
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p3

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p4

    const-string v0, ""

    invoke-virtual {p4, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p4

    .line 148
    invoke-static {p2, p1, p0, p3, p4}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۖܺۜ;)Ll/ᩳۖۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖܺۜ;->ۧ:Ll/ᩳۖۜ;

    return-object p0
.end method

.method public static ֫()V
    .locals 5

    .line 159
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 167
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "FILE_SEARCH_CANCELED"

    const-string v3, "The file search was canceled. Restart with cursor=\"\"."

    const-string v4, "warning"

    .line 165
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 160
    throw v0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 2

    .line 134
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    .line 135
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    const-string v1, "path"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "reason"

    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 154
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll/ۧ֫᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, p1, v0, v1}, Ll/ܰ۬ᩴ;->merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ll/ۨۘܽ;)Z
    .locals 6

    .line 173
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ll/ۢܺۜ;

    invoke-direct {v1, p0}, Ll/ۢܺۜ;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const p0, 0x8000

    .line 174
    invoke-virtual {v0, p0}, Ljava/io/BufferedInputStream;->mark(I)V

    new-array v1, p0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p0, :cond_3

    sub-int v4, p0, v3

    .line 178
    invoke-virtual {v0, v1, v3, v4}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v4

    if-gez v4, :cond_0

    goto :goto_1

    :cond_0
    if-nez v4, :cond_2

    .line 183
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->read()I

    move-result v4

    if-gez v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v3, 0x1

    int-to-byte v4, v4

    .line 187
    aput-byte v4, v1, v3

    move v3, v5

    goto :goto_0

    :cond_2
    add-int/2addr v3, v4

    goto :goto_0

    :cond_3
    :goto_1
    if-ge v3, p0, :cond_4

    .line 193
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    :cond_4
    const-string p0, ""

    .line 195
    invoke-static {p0, v1}, Ll/ܳۘۜ;->֫(Ljava/lang/String;[B)Ll/ܿۘۜ;

    move-result-object p0

    .line 196
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V

    .line 197
    :goto_2
    iget v1, p0, Ll/ܿۘۜ;->ۧ:I

    if-ge v2, v1, :cond_6

    .line 198
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->read()I

    move-result v1

    if-ltz v1, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 199
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "File ended inside its BOM."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 202
    :cond_6
    new-instance v1, Ljava/io/InputStreamReader;

    iget-object p0, p0, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p0

    sget-object v2, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 203
    invoke-virtual {p0, v2}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/CharsetDecoder;)V

    .line 204
    :try_start_0
    new-instance p0, Ll/ۘᩴܽ;

    invoke-direct {p0, v1}, Ll/ۘᩴܽ;-><init>(Ljava/io/InputStreamReader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 205
    :try_start_1
    new-instance v0, Ll/ۧ֡ܿ;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ll/ۧ֡ܿ;-><init>(I)V

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v0, v2}, Ll/ۘᩴܽ;->֫(Ll/ۨۘܽ;Ll/ܿۖ᩷;Z)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 206
    :try_start_2
    invoke-virtual {p0}, Ll/ۘᩴܽ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V

    return p1

    :catchall_0
    move-exception p1

    .line 202
    :try_start_3
    invoke-virtual {p0}, Ll/ۘᩴܽ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ll/ۡܺۜ;)Ll/ܺܺۜ;
    .locals 16

    .line 50
    invoke-static {}, Ll/ۖܺۜ;->֫()V

    .line 51
    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->ۢ(Ll/ۡܺۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->ۢ(Ll/ۡܺۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->ۡ(Ll/ۡܺۜ;)Z

    move-result v2

    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->᩷(Ll/ۡܺۜ;)Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "namePattern"

    invoke-static {v0, v5, v2, v3, v4}, Ll/ۖܺۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZZZ)Ll/ۨۘܽ;

    move-result-object v0

    move-object v4, v0

    .line 53
    :goto_0
    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->ۧ(Ll/ۡܺۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    move-object v8, v1

    goto :goto_2

    :cond_1
    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->ۧ(Ll/ۡܺۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->ܽ(Ll/ۡܺۜ;)Z

    move-result v1

    invoke-static/range {p6 .. p6}, Ll/ۡܺۜ;->֫(Ll/ۡܺۜ;)Z

    move-result v2

    const/4 v3, 0x1

    const-string v5, "contentPattern"

    invoke-static {v0, v5, v1, v2, v3}, Ll/ۖܺۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZZZ)Ll/ۨۘܽ;

    move-result-object v1

    goto :goto_1

    .line 55
    :goto_2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 56
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 57
    new-instance v15, Ll/᩷ܺۜ;

    move-object v2, v15

    move-object/from16 v3, p0

    move-object/from16 v5, p6

    move-object v6, v0

    move-object v7, v1

    invoke-direct/range {v2 .. v8}, Ll/᩷ܺۜ;-><init>(Ll/ۖܺۜ;Ll/ۨۘܽ;Ll/ۡܺۜ;Ljava/util/LinkedHashMap;Lbin/mt/json/JSONArray;Ll/ۨۘܽ;)V

    move-object/from16 v2, p0

    iget-object v9, v2, Ll/ۖܺۜ;->֫:Ll/᩻ܺۜ;

    move-object/from16 v10, p1

    move/from16 v11, p2

    move-object/from16 v12, p3

    move/from16 v13, p4

    move-object/from16 v14, p5

    invoke-virtual/range {v9 .. v15}, Ll/᩻ܺۜ;->֫(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ll/᩷ܺۜ;)Ll/ᩳܺۜ;

    move-result-object v3

    .line 125
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 126
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 127
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "reason"

    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const-string v7, "count"

    invoke-virtual {v6, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_3

    .line 129
    :cond_2
    new-instance v0, Ll/ܺܺۜ;

    invoke-direct {v0, v3, v4, v1}, Ll/ܺܺۜ;-><init>(Ll/ᩳܺۜ;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONArray;)V

    return-object v0
.end method
