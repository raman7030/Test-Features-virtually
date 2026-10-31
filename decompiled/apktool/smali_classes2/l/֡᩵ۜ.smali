.class public final Ll/֡᩵ۜ;
.super Ljava/lang/Object;
.source "I6L2"


# instance fields
.field public final ֫:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/֡᩵ۜ;->֫:Ll/ᩳۖۜ;

    return-void
.end method

.method private ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;ZLl/᩵᩵ۜ;)Lbin/mt/json/JSONObject;
    .locals 19

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "ZIP_READ_FAILED"

    const-string v4, "ZIP_TEST_FAILED"

    const-string v5, "checkedEntries"

    move-object/from16 v6, p0

    .line 234
    iget-object v0, v6, Ll/֡᩵ۜ;->֫:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v7

    const-string v8, "path"

    move-object/from16 v9, p1

    .line 235
    invoke-static {v9, v8}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v7, v8}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    .line 237
    :try_start_0
    invoke-virtual {v0, v9}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v11
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_3

    .line 238
    :try_start_1
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 239
    invoke-static {v0, v9, v10}, Ll/ۚ᩵ۜ;->֫(Ll/ᩳۖۜ;Ljava/lang/String;Z)Ll/۫᩵ܿ;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v12, 0x0

    .line 242
    :try_start_2
    invoke-virtual {v10}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v13

    invoke-static {v13, v2}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Z)Ll/ᩳܰۡ;

    move-result-object v13
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v14, p4

    .line 244
    :try_start_3
    invoke-interface {v14, v9, v13, v10, v7}, Ll/᩵᩵ۜ;->֫(Ljava/lang/String;Ll/ᩳܰۡ;Ll/۫᩵ܿ;Ll/۟ۢۜ;)Lbin/mt/json/JSONObject;

    move-result-object v12

    .line 246
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 248
    invoke-virtual {v0, v9}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v7

    .line 249
    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v14

    sget-object v15, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v14, v15, :cond_0

    .line 250
    invoke-virtual {v10}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v14

    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v16

    cmp-long v18, v14, v16

    if-nez v18, :cond_0

    .line 251
    invoke-virtual {v10}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v14

    invoke-virtual {v7}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v16

    cmp-long v7, v14, v16

    if-nez v7, :cond_0

    .line 255
    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v0

    invoke-virtual {v0, v9}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 257
    :try_start_4
    invoke-virtual {v13}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 273
    :try_start_5
    invoke-virtual {v11}, Ll/ۤۖۜ;->close()V
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_3

    return-object v12

    :cond_0
    :try_start_6
    const-string v0, "ZIP_CHANGED_DURING_READ"

    const-string v7, "The ZIP file changed during this read; start again"

    .line 252
    invoke-static {v0, v7, v9, v1}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception v0

    move-object v7, v0

    .line 242
    :try_start_7
    invoke-virtual {v13}, Ll/ᩳܰۡ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v10, v0

    :try_start_8
    invoke-virtual {v7, v10}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v7
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catch_0
    move-exception v0

    const/4 v7, 0x1

    goto :goto_1

    :catch_1
    if-eqz v2, :cond_1

    move-object v3, v4

    :cond_1
    :try_start_9
    const-string v0, "The ZIP operation could not be completed"

    .line 270
    invoke-static {v3, v0, v9, v1}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    const/4 v7, 0x0

    :goto_1
    if-eqz v2, :cond_3

    if-nez v7, :cond_3

    .line 259
    instance-of v7, v0, Ljava/util/zip/ZipException;

    if-nez v7, :cond_2

    instance-of v7, v0, Ljava/io/EOFException;

    if-eqz v7, :cond_3

    :cond_2
    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 261
    :goto_2
    invoke-static {v0, v9, v1, v7}, Ll/֡᩵ۜ;->֫(Ljava/io/IOException;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    if-eqz v2, :cond_4

    .line 262
    iget-object v7, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v0, "The ZIP test could not be completed"

    .line 263
    invoke-static {v4, v0, v9, v1}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    :cond_4
    if-eqz v2, :cond_5

    if-eqz v12, :cond_5

    .line 266
    iget-object v3, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v12, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 268
    :cond_5
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    move-object v3, v0

    .line 237
    :try_start_a
    invoke-virtual {v11}, Ll/ۤۖۜ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v4, v0

    :try_start_b
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v3
    :try_end_b
    .catch Ll/ۗۛ᩻; {:try_start_b .. :try_end_b} :catch_3

    :catch_3
    move-exception v0

    const-string v3, "FILE_OPERATION_INTERRUPTED"

    .line 274
    iget-object v4, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v0, "ZIP_OPERATION_CANCELLED"

    const-string v3, "ZIP operation was cancelled"

    .line 275
    invoke-static {v0, v3, v9, v1}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 277
    :cond_6
    iget-object v3, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v3, v8, v9}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v4, "entryPath"

    .line 278
    invoke-virtual {v3, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_7
    if-eqz v2, :cond_8

    .line 279
    invoke-virtual {v3, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-nez v1, :cond_8

    const/4 v1, 0x0

    invoke-virtual {v3, v5, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 280
    :cond_8
    throw v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ll/ᩳܰۡ;)Lbin/mt/json/JSONObject;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-wide/from16 v2, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    const-string v6, "byteOffset"

    move-object/from16 v7, p1

    .line 159
    invoke-static {v5, v4, v0, v7}, Ll/֡᩵ۜ;->֫(Ll/ᩳܰۡ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v7

    .line 160
    new-array v8, v1, [B

    .line 161
    invoke-virtual {v5, v7}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v5

    .line 382
    new-instance v9, Ll/ᩴ᩵ۜ;

    invoke-direct {v9, v5}, Ll/ᩴ᩵ۜ;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v10, 0x0

    :goto_0
    const/4 v5, 0x0

    cmp-long v12, v10, v2

    if-gez v12, :cond_1

    int-to-long v12, v1

    sub-long v14, v2, v10

    .line 164
    :try_start_0
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v13, v12

    invoke-virtual {v9, v8, v5, v13}, Ll/ᩴ᩵ۜ;->read([BII)I

    move-result v5

    if-ltz v5, :cond_0

    int-to-long v12, v5

    add-long/2addr v10, v12

    goto :goto_0

    :cond_0
    const-string v1, "ZIP_OFFSET_OUT_OF_RANGE"

    const-string v2, "The byte offset is past the end of the ZIP entry"

    .line 166
    invoke-static {v1, v2, v4, v0}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 168
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "size"

    invoke-virtual {v1, v2, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    .line 169
    throw v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_5

    :cond_1
    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v1, :cond_3

    sub-int v13, v1, v12

    .line 175
    invoke-virtual {v9, v8, v12, v13}, Ll/ᩴ᩵ۜ;->read([BII)I

    move-result v13

    if-gez v13, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v12, v13

    goto :goto_1

    .line 179
    :cond_3
    :goto_2
    invoke-virtual {v9}, Ll/ᩴ᩵ۜ;->read()I

    move-result v13

    if-ltz v13, :cond_4

    const/4 v5, 0x1

    :cond_4
    int-to-long v13, v12

    .line 180
    invoke-static {v6, v2, v3, v13, v14}, Ll/᩸ۡۜ;->֫(Ljava/lang/String;JJ)J

    move-result-wide v13

    if-eqz v5, :cond_5

    .line 182
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v15

    goto :goto_3

    :cond_5
    move-wide v15, v13

    :goto_3
    cmp-long v7, v15, v10

    if-ltz v7, :cond_6

    const-wide v10, 0x1fffffffffffffL

    cmp-long v7, v15, v10

    if-lez v7, :cond_7

    :cond_6
    const-wide/16 v15, -0x1

    :cond_7
    move-wide v10, v15

    .line 184
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v15, "path"

    invoke-virtual {v7, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "entryPath"

    invoke-virtual {v4, v7, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 185
    invoke-virtual {v0, v6, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hex"

    if-ne v12, v1, :cond_8

    goto :goto_4

    .line 186
    :cond_8
    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v8

    .line 185
    :goto_4
    invoke-static {v8}, Ll/ܰۘܺ;->֫([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextByteOffset"

    .line 187
    invoke-virtual {v0, v1, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "totalBytes"

    invoke-virtual {v0, v1, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "hasMore"

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 161
    :goto_5
    :try_start_1
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIILjava/lang/String;Ll/ᩳܰۡ;)Lbin/mt/json/JSONObject;
    .locals 12

    move-object v1, p0

    move-object/from16 v2, p9

    move-object v0, p1

    move-object/from16 v3, p10

    .line 127
    invoke-static {v3, v2, p0, p1}, Ll/֡᩵ۜ;->֫(Ll/ᩳܰۡ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    .line 129
    :try_start_0
    invoke-virtual {v3, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v0

    .line 382
    new-instance v11, Ll/ᩴ᩵ۜ;

    invoke-direct {v11, v0}, Ll/ᩴ᩵ۜ;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ۛܺۜ; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v11

    move-object v4, p2

    move-wide v5, p3

    move-wide/from16 v7, p5

    move/from16 v9, p7

    move/from16 v10, p8

    .line 130
    :try_start_1
    invoke-static/range {v3 .. v10}, Ll/֫ۖۜ;->֫(Ljava/io/InputStream;Ljava/lang/String;JJII)Ll/᩺ܺۜ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    :try_start_2
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ll/ۛܺۜ; {:try_start_2 .. :try_end_2} :catch_0

    .line 135
    iget-boolean v3, v0, Ll/᩺ܺۜ;->᩻:Z

    if-eqz v3, :cond_0

    const-string v3, "path"

    const-string v4, "entryPath"

    .line 0
    invoke-static {v3, v2, v4, p0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "text"

    .line 141
    iget-object v3, v0, Ll/᩺ܺۜ;->ۢ:Ljava/lang/String;

    .line 142
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "encoding"

    iget-object v3, v0, Ll/᩺ܺۜ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "startLine"

    move-wide v3, p3

    .line 143
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "startColumn"

    move-wide/from16 v3, p5

    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "nextLine"

    iget-wide v3, v0, Ll/᩺ܺۜ;->ܳ:J

    .line 144
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "nextColumn"

    iget-wide v3, v0, Ll/᩺ܺۜ;->ܿ:J

    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "returnedLineCount"

    iget v3, v0, Ll/᩺ܺۜ;->᩷:I

    .line 145
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "returnedCodePoints"

    iget v3, v0, Ll/᩺ܺۜ;->ۜ:I

    .line 146
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "hasMore"

    iget-boolean v0, v0, Ll/᩺ܺۜ;->ᩳ:Z

    .line 147
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v3, "ZIP_OFFSET_OUT_OF_RANGE"

    const-string v4, "The requested text position is outside the ZIP entry"

    .line 136
    invoke-static {v3, v4, v2, p0}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    .line 138
    iget-object v2, v1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v3, "finalLine"

    iget-wide v4, v0, Ll/᩺ܺۜ;->ܽ:J

    invoke-virtual {v2, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "finalColumn"

    iget-wide v4, v0, Ll/᩺ܺۜ;->ۧ:J

    invoke-virtual {v2, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    .line 139
    throw v1

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 129
    :try_start_3
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v4, v0

    :try_start_4
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v3
    :try_end_4
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ll/ۛܺۜ; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    const-string v0, "ZIP_TEXT_DECODE_FAILED"

    const-string v3, "The ZIP entry is not valid in the selected text encoding"

    .line 132
    invoke-static {v0, v3, v2, p0}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/ᩳܰۡ;)Lbin/mt/json/JSONObject;
    .locals 8

    const-string v0, "path"

    const-string v1, "checkedEntries"

    const-string v2, ""

    const/4 v3, 0x0

    .line 200
    :try_start_0
    invoke-virtual {p2}, Ll/ᩳܰۡ;->ᩳ()Ljava/util/List;

    move-result-object v4

    const/high16 v5, 0x10000

    new-array v5, v5, [B

    .line 202
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩺ۡ;

    .line 203
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 204
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 205
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    .line 297
    :cond_0
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    const-string p0, "ZIP_PASSWORD_REQUIRED"

    const-string p2, "The ZIP entry requires a password"

    .line 298
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, p2, p1, v4}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 300
    :cond_2
    :goto_1
    invoke-virtual {p2, p0}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 207
    invoke-virtual {p2, v6}, Ll/ᩳܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v6

    .line 382
    new-instance v7, Ll/ᩴ᩵ۜ;

    invoke-direct {v7, v6}, Ll/ᩴ᩵ۜ;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    :goto_2
    :try_start_1
    invoke-virtual {v7, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-ltz v6, :cond_3

    .line 209
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 211
    :cond_3
    :try_start_2
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 207
    :try_start_3
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    .line 228
    :cond_4
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :catch_0
    const-string p0, "ZIP_TEST_FAILED"

    const-string p2, "The ZIP test could not be completed"

    .line 223
    invoke-static {p0, p2, p1, v2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 225
    iget-object p1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {p1, v1, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 226
    throw p0

    :catch_1
    move-exception p0

    const/4 p2, 0x1

    .line 219
    invoke-static {p0, p1, v2, p2}, Ll/֡᩵ۜ;->֫(Ljava/io/IOException;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p0

    .line 220
    iget-object p1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {p1, v1, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 221
    throw p0

    :catch_2
    move-exception p0

    .line 215
    iget-object p2, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {p2, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "entryPath"

    invoke-virtual {p1, p2, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 216
    invoke-virtual {p1, v1, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 217
    throw p0
.end method

.method public static ֫(Ljava/lang/String;ZLjava/lang/String;IZLjava/lang/String;Ll/ᩳܰۡ;Ll/۫᩵ܿ;Ll/۟ۢۜ;)Lbin/mt/json/JSONObject;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    .line 66
    new-instance v4, Ll/᩻ܰۡ;

    .line 9
    invoke-virtual/range {p6 .. p6}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v5

    invoke-direct {v4, v5}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    .line 67
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    move-object/from16 v5, p6

    invoke-virtual {v5, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v5

    if-nez v5, :cond_1

    .line 68
    invoke-virtual {v4, v0}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "ZIP_ENTRY_NOT_FOUND"

    const-string v2, "The ZIP directory does not exist"

    .line 69
    invoke-static {v1, v2, v3, v0}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    const-string v5, "layout"

    const-string v6, "zip-list-v2"

    const-string v7, "path"

    .line 0
    invoke-static {v5, v6, v7, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "entryPath"

    .line 319
    invoke-virtual {v5, v6, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "recursive"

    invoke-virtual {v5, v8, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "size"

    .line 320
    invoke-virtual/range {p7 .. p7}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v9

    invoke-virtual {v5, v8, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "modifiedAt"

    invoke-virtual/range {p7 .. p7}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v9

    invoke-virtual {v5, v8, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "policy"

    move-object/from16 v9, p8

    iget-object v9, v9, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 321
    invoke-virtual {v5, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v5

    .line 322
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v8

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    invoke-static {v5}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v5

    .line 327
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    const-string v9, "The ZIP cursor is no longer valid; restart with cursor=\"\""

    const-string v10, "ZIP_INVALID_CURSOR"

    const/4 v11, 0x0

    if-eqz v8, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    const/16 v8, 0x2e

    .line 328
    invoke-virtual {v2, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-lez v8, :cond_e

    const/16 v12, 0xa

    if-gt v8, v12, :cond_e

    add-int/lit8 v12, v8, 0x1

    .line 329
    invoke-virtual {v2, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    .line 331
    :try_start_0
    invoke-virtual {v2, v11, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    if-lez v12, :cond_e

    .line 332
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v11, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_e

    move v2, v12

    .line 73
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    .line 74
    new-instance v11, Ljava/util/ArrayDeque;

    invoke-direct {v11}, Ljava/util/ArrayDeque;-><init>()V

    .line 304
    new-instance v12, Ll/ۜ۠ۢ;

    const/4 v13, 0x2

    invoke-direct {v12, v13}, Ll/ۜ۠ۢ;-><init>(I)V

    invoke-static {v12}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v12

    invoke-virtual {v4, v0, v12}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v12

    .line 75
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    const/4 v12, 0x0

    .line 78
    :goto_2
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_b

    .line 79
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 80
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Iterator;

    .line 81
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_3

    .line 82
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_2

    .line 85
    :cond_3
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۗ᩺ۡ;

    add-int/lit8 v14, v12, 0x1

    if-lt v12, v2, :cond_9

    .line 87
    invoke-virtual {v8}, Lbin/mt/json/JSONArray;->size()I

    move-result v12

    move/from16 v15, p3

    if-ne v12, v15, :cond_4

    const/4 v1, 0x1

    move-object/from16 p6, v9

    move v12, v14

    goto/16 :goto_7

    .line 92
    :cond_4
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v12

    move/from16 p2, v14

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v14

    invoke-virtual {v12, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    if-eqz p4, :cond_5

    move-object/from16 p6, v9

    goto :goto_5

    .line 95
    :cond_5
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    const-string v20, "-"

    cmp-long v21, v16, v18

    if-ltz v21, :cond_6

    .line 312
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v15, v16

    goto :goto_3

    :cond_6
    move-object/from16 v15, v20

    .line 93
    :goto_3
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, " "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v16

    cmp-long v21, v16, v18

    if-ltz v21, :cond_7

    .line 312
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v16

    move-object/from16 p6, v9

    move-object/from16 v9, v16

    goto :goto_4

    :cond_7
    move-object/from16 p6, v9

    move-object/from16 v9, v20

    .line 94
    :goto_4
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v9

    if-nez v9, :cond_8

    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v9

    if-eqz v9, :cond_8

    const-string v20, "e"

    :cond_8
    move-object/from16 v9, v20

    .line 0
    invoke-static {v14, v9, v15, v12}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 93
    :goto_5
    invoke-virtual {v8, v12}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_6

    :cond_9
    move-object/from16 p6, v9

    move/from16 p2, v14

    :goto_6
    if-eqz v1, :cond_a

    .line 97
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v9

    if-eqz v9, :cond_a

    .line 98
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v9

    .line 304
    new-instance v12, Ll/ۜ۠ۢ;

    const/4 v13, 0x2

    invoke-direct {v12, v13}, Ll/ۜ۠ۢ;-><init>(I)V

    invoke-static {v12}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v12

    invoke-virtual {v4, v9, v12}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v9

    .line 98
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_a
    move/from16 v12, p2

    move-object/from16 v9, p6

    goto/16 :goto_2

    :cond_b
    move-object/from16 p6, v9

    const/4 v1, 0x0

    :goto_7
    if-gt v2, v12, :cond_d

    .line 0
    invoke-static {v7, v3, v6, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "listing"

    .line 108
    invoke-virtual {v0, v3, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 109
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "hasMore"

    .line 110
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    if-eqz v1, :cond_c

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    :cond_c
    const-string v1, ""

    :goto_8
    const-string v2, "nextCursor"

    invoke-virtual {v3, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    .line 109
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_d
    move-object/from16 v1, p6

    .line 102
    invoke-static {v10, v1, v3, v0}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_0
    :cond_e
    move-object v1, v9

    .line 338
    invoke-static {v10, v1, v3, v0}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ljava/io/IOException;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;
    .locals 5

    .line 344
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    const-string v1, "ZIP operation was cancelled"

    const-string v2, "ZIP_OPERATION_CANCELLED"

    if-eqz v0, :cond_0

    .line 345
    invoke-static {v2, v1, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    move-object v3, p0

    :goto_0
    if-eqz v3, :cond_3

    .line 350
    instance-of v4, v3, Ljava/io/InterruptedIOException;

    if-eqz v4, :cond_1

    .line 351
    invoke-static {v2, v1, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 353
    :cond_1
    instance-of v4, v3, Ll/ܰܰۡ;

    if-eqz v4, :cond_2

    const/4 v0, 0x1

    .line 349
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    goto :goto_0

    :cond_3
    const-string v1, "ZIP_READ_FAILED"

    if-eqz v0, :cond_5

    if-eqz p3, :cond_4

    const-string v1, "ZIP_TEST_FAILED"

    :cond_4
    const-string p0, "The ZIP storage could not be read"

    .line 356
    invoke-static {v1, p0, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 359
    :cond_5
    instance-of v0, p0, Ll/ۘܰۡ;

    if-eqz v0, :cond_6

    const-string p0, "ZIP_BAD_PASSWORD"

    const-string p3, "The password could not decrypt the ZIP entry"

    .line 360
    invoke-static {p0, p3, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 362
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_7

    const-string p0, ""

    goto :goto_1

    .line 363
    :cond_7
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    const-string v0, "unsupported"

    .line 364
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "not supported"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "not implemented"

    .line 365
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "requires a dictionary"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_3

    :cond_8
    if-eqz p3, :cond_9

    const-string v1, "ZIP_INVALID"

    :cond_9
    if-eqz p3, :cond_a

    const-string p0, "ZIP structure, length, checksum, or authentication validation failed"

    goto :goto_2

    :cond_a
    const-string p0, "The ZIP file or entry could not be read"

    .line 371
    :goto_2
    invoke-static {v1, p0, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_b
    :goto_3
    const-string p0, "path"

    const-string p3, "entryPath"

    .line 0
    invoke-static {p0, p1, p3, p2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "ZIP_UNSUPPORTED"

    const-string p2, "The ZIP uses an unsupported compression, encryption, or archive feature"

    const-string p3, "fatal"

    const/4 v0, 0x0

    .line 366
    invoke-static {p1, p2, p3, v0, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "path"

    const-string v1, "entryPath"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 377
    invoke-static {p2, p0, p1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗ᩺ۡ;
    .locals 2

    .line 286
    invoke-virtual {p0, p2}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 288
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_2

    .line 297
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "The ZIP entry requires a password"

    .line 298
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "ZIP_PASSWORD_REQUIRED"

    invoke-static {p3, p0, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 300
    :cond_1
    :goto_0
    invoke-virtual {p0, p3}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    return-object v0

    :cond_2
    const-string p0, "ZIP_ENTRY_IS_DIRECTORY"

    const-string p3, "A directory cannot be read as file content"

    .line 289
    invoke-static {p0, p3, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_3
    const-string p0, "ZIP_ENTRY_NOT_FOUND"

    const-string p3, "The ZIP entry does not exist"

    .line 287
    invoke-static {p0, p3, p1, p2}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 8

    const-string v4, "cursor"

    const-string v5, "limit"

    const-string v0, "path"

    const-string v1, "entryPath"

    const-string v2, "recursive"

    const-string v3, "simple"

    .line 55
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v0, "entryPath"

    .line 56
    invoke-static {p1, v0}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x1

    invoke-static {v7, v0, v1}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "recursive"

    .line 57
    invoke-static {p1, v2}, Ll/ۚ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    const-string v2, "simple"

    .line 58
    invoke-static {p1, v2}, Ll/ۚ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v6

    const-string v2, "cursor"

    .line 59
    invoke-static {p1, v2}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "limit"

    const/16 v5, 0x3e8

    .line 60
    invoke-static {p1, v2, v1, v5}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v5

    .line 61
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "/"

    invoke-virtual {v7, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    invoke-static {v7}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    const-string v1, "A ZIP directory path must end with /; use an empty string for the root"

    invoke-static {p1, v0, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 65
    :cond_1
    :goto_0
    new-instance v0, Ll/ۖ᩵ۜ;

    move-object v1, v0

    move-object v2, v7

    invoke-direct/range {v1 .. v6}, Ll/ۖ᩵ۜ;-><init>(Ljava/lang/String;ZLjava/lang/String;IZ)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v7, v1, v0}, Ll/֡᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;ZLl/᩵᩵ۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 16

    move-object/from16 v6, p1

    const-string v0, "path"

    const-string v1, "entryPath"

    const-string v2, "password"

    const-string v3, "byteOffset"

    const-string v7, "maxBytes"

    .line 153
    filled-new-array {v0, v1, v2, v3, v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 154
    invoke-static {v6, v1}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v14, v1, v15}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 155
    invoke-static {v6, v2}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-wide/16 v4, 0x0

    const-wide v8, 0x1fffffffffffffL

    move-object/from16 v0, p1

    move-object v1, v3

    move-wide v2, v4

    move-wide v4, v8

    .line 308
    invoke-static/range {v0 .. v5}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v11

    const/4 v0, 0x1

    const/high16 v1, 0x10000

    .line 157
    invoke-static {v6, v7, v0, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v10

    .line 158
    new-instance v0, Ll/ܺ᩵ۜ;

    move-object v8, v0

    move-object v9, v14

    invoke-direct/range {v8 .. v13}, Ll/ܺ᩵ۜ;-><init>(Ljava/lang/String;IJLjava/lang/String;)V

    move-object/from16 v1, p0

    invoke-direct {v1, v6, v14, v15, v0}, Ll/֡᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;ZLl/᩵᩵ۜ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 18

    move-object/from16 v6, p1

    const-string v13, "limit"

    const-string v14, "maxChars"

    const-string v7, "path"

    const-string v8, "entryPath"

    const-string v9, "password"

    const-string v10, "encoding"

    const-string v11, "startLine"

    const-string v12, "startColumn"

    .line 117
    filled-new-array/range {v7 .. v14}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    const-string v0, "entryPath"

    .line 119
    invoke-static {v6, v0}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const/4 v13, 0x0

    invoke-static {v15, v0, v13}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "password"

    .line 120
    invoke-static {v6, v0}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "encoding"

    .line 121
    invoke-static {v6, v0}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-wide/16 v7, 0x0

    const-wide v11, 0x1fffffffffffffL

    const-string v1, "startLine"

    move-object/from16 v0, p1

    move-wide v2, v7

    move-wide v4, v11

    .line 308
    invoke-static/range {v0 .. v5}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v16

    const-string v1, "startColumn"

    invoke-static/range {v0 .. v5}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v0

    const/4 v2, 0x1

    const/16 v3, 0x7d0

    const-string v4, "limit"

    .line 124
    invoke-static {v6, v4, v2, v3}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v2

    const/4 v3, 0x2

    const/high16 v4, 0x20000

    const-string v5, "maxChars"

    .line 125
    invoke-static {v6, v5, v3, v4}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v3

    .line 126
    new-instance v4, Ll/ۡ᩵ۜ;

    move-object v7, v4

    move-object v8, v15

    move-wide/from16 v11, v16

    const/4 v5, 0x0

    move-wide v13, v0

    move-object v0, v15

    move v15, v2

    move/from16 v16, v3

    invoke-direct/range {v7 .. v16}, Ll/ۡ᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJII)V

    move-object/from16 v1, p0

    invoke-direct {v1, v6, v0, v5, v4}, Ll/֡᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;ZLl/᩵᩵ۜ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "path"

    const-string v1, "password"

    .line 194
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 195
    invoke-static {p1, v1}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 196
    new-instance v1, Ll/ۘ᩵ۜ;

    invoke-direct {v1, v0}, Ll/ۘ᩵ۜ;-><init>(Ljava/lang/String;)V

    const-string v0, ""

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v2, v1}, Ll/֡᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;ZLl/᩵᩵ۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
