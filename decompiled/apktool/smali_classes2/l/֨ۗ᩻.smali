.class public final Ll/֨ۗ᩻;
.super Ljava/lang/Object;
.source "R77X"

# interfaces
.implements Ll/ۤۨ᩻;


# direct methods
.method public static ֫(IJ)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0x1fffffffffffffL

    sub-long/2addr v2, v0

    cmp-long p0, p1, v2

    if-gtz p0, :cond_0

    add-long/2addr p1, v0

    return-wide p1

    .line 499
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Changed entry exceeds the supported size range."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 2

    .line 1063
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1064
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 2

    .line 899
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 900
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 901
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 903
    :cond_0
    invoke-static {}, Ll/ᩳ᩺᩻;->֫()Ljava/util/Comparator;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ll/֡ۗ᩻;
    .locals 1

    .line 594
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ۗ᩻;

    if-eqz p0, :cond_0

    return-object p0

    .line 596
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Dex entry is unavailable: "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "DEX_BUILD_FAILED"

    invoke-static {p1, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static synthetic ֫(Ll/֨ۗ᩻;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 0

    const-string p0, "FILE_PARENT_NOT_FOUND"

    .line 139
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "parent_missing"

    invoke-virtual {p0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "FILE_NOT_DIRECTORY"

    .line 140
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "regular"

    invoke-virtual {p0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 141
    :cond_1
    invoke-static {p1, p2, p3}, Ll/֨ۗ᩻;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 143
    :cond_2
    invoke-static {p1, p2, p3}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    .line 1042
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    if-nez p0, :cond_0

    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    :goto_0
    const-string v2, "outputPath"

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "fatal"

    .line 1041
    invoke-static {p1, p2, v1, v0, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩵ۗ᩻;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Z)Ll/ۘۜۜ;
    .locals 19

    move-object/from16 v0, p1

    .line 976
    iget-object v1, v0, Ll/ᩴۜۜ;->ܿ:Ljava/util/ArrayList;

    if-eqz p5, :cond_3

    .line 977
    invoke-virtual/range {p4 .. p4}, Ll/ۨۧᩳ;->ܳ()Ll/۠ۧᩳ;

    move-result-object v2

    .line 993
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 994
    iget-boolean v4, v2, Ll/۠ۧᩳ;->᩸:Z

    if-eqz v4, :cond_0

    const-string v4, "V1"

    .line 995
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 997
    :cond_0
    iget-boolean v4, v2, Ll/۠ۧᩳ;->᩹:Z

    if-eqz v4, :cond_1

    const-string v4, "V2"

    .line 998
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1000
    :cond_1
    iget-boolean v2, v2, Ll/۠ۧᩳ;->᩶:Z

    if-eqz v2, :cond_2

    const-string v2, "V3"

    .line 1001
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object v10, v3

    goto :goto_0

    .line 977
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v10, v2

    .line 978
    :goto_0
    new-instance v18, Ll/ۘۜۜ;

    move-object/from16 v2, p0

    iget-object v2, v2, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget-object v3, v0, Ll/ᩴۜۜ;->ۜ:Ljava/lang/String;

    .line 979
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    .line 980
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 981
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v7

    .line 982
    invoke-static/range {p3 .. p3}, Ll/᩸ܿۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۠ܿۜ;

    move-result-object v11

    if-eqz p5, :cond_4

    const-string v16, "apk_sign"

    const-string v17, "publish"

    const-string v12, "edit_session_prepare"

    const-string v13, "entry_overlay_encode"

    const-string v14, "dex_merge"

    const-string v15, "apk_zip_write"

    .line 1018
    filled-new-array/range {v12 .. v17}, [Ljava/lang/String;

    move-result-object v9

    .line 1029
    new-instance v12, Ljava/util/ArrayList;

    const/4 v13, 0x6

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 1030
    invoke-static {v12, v9}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const-string v9, "apk_zip_write"

    const-string v12, "publish"

    const-string v13, "edit_session_prepare"

    const-string v14, "entry_overlay_encode"

    const-string v15, "dex_merge"

    .line 1021
    filled-new-array {v13, v14, v15, v9, v12}, [Ljava/lang/String;

    move-result-object v9

    .line 1029
    new-instance v12, Ljava/util/ArrayList;

    const/4 v13, 0x5

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 1030
    invoke-static {v12, v9}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 982
    :goto_1
    new-instance v9, Ljava/util/ArrayList;

    move-object v12, v9

    move-object/from16 v13, p2

    iget-object v13, v13, Ll/᩵ۗ᩻;->ۧ:Ljava/util/ArrayList;

    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1037
    iget-object v9, v0, Ll/ᩴۜۜ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v13

    add-int/2addr v13, v9

    .line 984
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v14

    new-instance v1, Ljava/util/ArrayList;

    move-object v15, v1

    iget-object v9, v0, Ll/ᩴۜۜ;->֫:Ljava/util/ArrayList;

    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v16, v1

    iget-object v9, v0, Ll/ᩴۜۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v17, v1

    iget-object v0, v0, Ll/ᩴۜۜ;->ܳ:Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v1, v18

    move/from16 v9, p5

    invoke-direct/range {v1 .. v17}, Ll/ۘۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/util/ArrayList;Ll/۠ܿۜ;Ljava/util/ArrayList;IILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v18
.end method

.method public static ֫(Ll/ᩳܰۡ;Ljava/util/HashMap;)Ll/ܶܶܽ;
    .locals 5

    const-string v0, "AndroidManifest.xml"

    .line 312
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۜۜ;

    if-eqz p1, :cond_5

    .line 314
    iget-object p0, p1, Ll/ܺۜۜ;->֫:[B

    if-eqz p0, :cond_0

    .line 315
    new-instance p1, Ll/ܶܶܽ;

    invoke-direct {p1}, Ll/ܶܶܽ;-><init>()V

    invoke-virtual {p1, p0}, Ll/ܶܶܽ;->֫([B)V

    return-object p1

    .line 317
    :cond_0
    iget-object p0, p1, Ll/ܺۜۜ;->ᩳ:Ll/ܶ᩵ܿ;

    if-eqz p0, :cond_4

    iget-wide v0, p1, Ll/ܺۜۜ;->ܿ:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-ltz p1, :cond_4

    const-wide/32 v2, 0x500000

    const-string p1, "Failed to inspect changed APK manifest content."

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 322
    :try_start_0
    new-instance p0, Ll/ܶܶܽ;

    invoke-direct {p0}, Ll/ܶܶܽ;-><init>()V

    return-object p0

    .line 324
    :cond_1
    invoke-static {p0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;)[B

    move-result-object p0

    if-nez p0, :cond_2

    .line 326
    new-instance p0, Ll/ܶܶܽ;

    invoke-direct {p0}, Ll/ܶܶܽ;-><init>()V

    return-object p0

    .line 327
    :cond_2
    new-instance v0, Ll/ܶܶܽ;

    invoke-direct {v0}, Ll/ܶܶܽ;-><init>()V

    invoke-virtual {v0, p0}, Ll/ܶܶܽ;->֫([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 331
    invoke-static {p0}, Ll/֨ۗ᩻;->֫(Ljava/lang/RuntimeException;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 332
    throw p0

    .line 334
    :cond_3
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    .line 329
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 318
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Changed manifest data source is missing."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 337
    :cond_5
    new-instance p1, Ll/ܶܶܽ;

    invoke-direct {p1}, Ll/ܶܶܽ;-><init>()V

    invoke-virtual {p1, p0}, Ll/ܶܶܽ;->֫(Ll/ᩳܰۡ;)V

    return-object p1
.end method

.method public static ֫(Ll/ۡܰۡ;Ll/ܺۜۜ;)V
    .locals 8

    const-string v0, "Failed to stream changed APK entry content."

    .line 412
    iget-object v1, p1, Ll/ܺۜۜ;->֫:[B

    iget-wide v2, p1, Ll/ܺۜۜ;->ܿ:J

    if-eqz v1, :cond_1

    .line 413
    array-length p1, v1

    int-to-long v4, p1

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    .line 416
    invoke-virtual {p0, v1}, Ll/ۡܰۡ;->write([B)V

    return-void

    .line 414
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Changed entry size does not match its byte array."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 419
    :cond_1
    iget-object p1, p1, Ll/ܺۜۜ;->ᩳ:Ll/ܶ᩵ܿ;

    if-eqz p1, :cond_8

    .line 422
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 v1, 0x10000

    :try_start_1
    new-array v1, v1, [B

    const-wide/16 v4, 0x0

    .line 426
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-gez v6, :cond_2

    goto :goto_1

    :cond_2
    if-nez v6, :cond_5

    .line 431
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gez v6, :cond_4

    :goto_1
    cmp-long p0, v4, v2

    if-nez p0, :cond_3

    .line 445
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    .line 443
    :cond_3
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    const-string v1, "Changed entry size changed after the build snapshot."

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 435
    :cond_4
    invoke-virtual {p0, v6}, Ll/ۡܰۡ;->write(I)V

    const/4 v6, 0x1

    .line 436
    invoke-static {v6, v4, v5}, Ll/֨ۗ᩻;->֫(IJ)J

    move-result-wide v4

    goto :goto_0

    :cond_5
    const/4 v7, 0x0

    .line 438
    invoke-virtual {p0, v1, v7, v6}, Ll/ۡܰۡ;->write([BII)V

    .line 439
    invoke-static {v6, v4, v5}, Ll/֨ۗ᩻;->֫(IJ)J

    move-result-wide v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz p1, :cond_6

    .line 422
    :try_start_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_5
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    throw p0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p0

    .line 449
    invoke-static {p0}, Ll/֨ۗ᩻;->֫(Ljava/lang/RuntimeException;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 450
    throw p0

    .line 452
    :cond_7
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 447
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 420
    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Changed entry data source is missing."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩵ۗ᩻;Ll/ܶ᩵ܿ;Z)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 256
    iget-object v3, v1, Ll/᩵ۗ᩻;->֫:Ljava/util/HashMap;

    .line 398
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 399
    iget-object v5, v0, Ll/ᩴۜۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܺۜۜ;

    .line 400
    iget-boolean v8, v7, Ll/ܺۜۜ;->ܽ:Z

    if-eqz v8, :cond_0

    .line 401
    iget-object v8, v7, Ll/ܺۜۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 258
    :cond_1
    new-instance v6, Ljava/util/HashSet;

    iget-object v0, v0, Ll/ᩴۜۜ;->ܳ:Ljava/util/ArrayList;

    invoke-direct {v6, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 259
    :try_start_0
    new-instance v7, Ll/ᩳܰۡ;

    invoke-virtual/range {p0 .. p0}, Ll/ܳ᩻ۜ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-direct {v7, v0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    :try_start_1
    new-instance v8, Ll/ۡܰۡ;

    invoke-direct {v8, v2}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 261
    :try_start_2
    invoke-static {v7, v4}, Ll/֨ۗ᩻;->֫(Ll/ᩳܰۡ;Ljava/util/HashMap;)Ll/ܶܶܽ;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p4, :cond_2

    .line 262
    :try_start_3
    invoke-virtual {v7}, Ll/ᩳܰۡ;->ܶ()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 264
    invoke-virtual {v8, v7}, Ll/ۡܰۡ;->֫(Ll/ᩳܰۡ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object/from16 p1, v7

    goto/16 :goto_a

    .line 266
    :cond_2
    :goto_1
    :try_start_4
    invoke-virtual {v8}, Ll/ۡܰۡ;->ᩳ()V

    .line 267
    invoke-virtual {v7}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۗ᩺ۡ;

    .line 268
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_2

    .line 271
    :cond_3
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [B

    .line 272
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܺۜۜ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-nez v11, :cond_4

    if-nez v12, :cond_4

    .line 274
    :try_start_5
    invoke-static {v7, v8, v10, v0}, Ll/֨ۗ᩻;->֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    .line 277
    :cond_4
    :try_start_6
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->֨()I

    move-result v14

    .line 70
    iget-boolean v15, v0, Ll/ܶܶܽ;->ܽ:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v15, :cond_5

    :try_start_7
    invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v4

    const-string v4, "lib/"

    invoke-virtual {v15, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_5
    move-object/from16 v16, v4

    .line 63
    :cond_6
    :try_start_8
    iget-boolean v4, v0, Ll/ܶܶܽ;->ۧ:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz v4, :cond_7

    :try_start_9
    invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v13, ".dex"

    invoke-virtual {v4, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v4, :cond_7

    :goto_3
    const/4 v4, 0x1

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_8

    const/4 v14, 0x0

    .line 277
    :cond_8
    :try_start_a
    invoke-virtual {v8, v14}, Ll/ۡܰۡ;->ۧ(I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    if-eqz v11, :cond_9

    .line 279
    :try_start_b
    array-length v4, v11
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    int-to-long v13, v4

    goto :goto_5

    :cond_9
    :try_start_c
    iget-wide v13, v12, Ll/ܺۜۜ;->ܿ:J

    .line 946
    :goto_5
    new-instance v4, Ll/ۗ᩺ۡ;

    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v4, v15}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object v15, v6

    move-object/from16 p1, v7

    .line 947
    :try_start_d
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 948
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->ܿ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/ۗ᩺ۡ;->֫(Ljava/lang/String;)V

    .line 949
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 956
    invoke-virtual {v4, v13, v14}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 280
    invoke-virtual {v8, v4}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    if-eqz v11, :cond_a

    .line 282
    invoke-virtual {v8, v11}, Ll/ۡܰۡ;->write([B)V

    goto :goto_6

    .line 284
    :cond_a
    invoke-static {v8, v12}, Ll/֨ۗ᩻;->֫(Ll/ۡܰۡ;Ll/ܺۜۜ;)V

    :goto_6
    move-object/from16 v7, p1

    move-object v6, v15

    move-object/from16 v4, v16

    goto/16 :goto_2

    :cond_b
    move-object/from16 p1, v7

    .line 287
    iget-object v1, v1, Ll/᩵ۗ᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 288
    invoke-static {v4, v0}, Ll/᩸ܶܽ;->֫(Ljava/lang/String;Ll/ܶܶܽ;)I

    move-result v6

    invoke-virtual {v8, v6}, Ll/ۡܰۡ;->ۧ(I)V

    .line 289
    new-instance v6, Ll/ۗ᩺ۡ;

    invoke-direct {v6, v4}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 290
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    invoke-virtual {v8, v4}, Ll/ۡܰۡ;->write([B)V

    goto :goto_7

    .line 292
    :cond_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۜۜ;

    .line 293
    iget-boolean v4, v3, Ll/ܺۜۜ;->ܽ:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    iget-object v5, v3, Ll/ܺۜۜ;->ۧ:Ljava/lang/String;

    if-eqz v4, :cond_d

    goto :goto_8

    .line 296
    :cond_d
    :try_start_e
    invoke-static {v5, v0}, Ll/᩸ܶܽ;->֫(Ljava/lang/String;Ll/ܶܶܽ;)I

    move-result v4

    invoke-virtual {v8, v4}, Ll/ۡܰۡ;->ۧ(I)V

    .line 297
    iget-wide v6, v3, Ll/ܺۜۜ;->ܿ:J

    .line 962
    new-instance v4, Ll/ۗ᩺ۡ;

    invoke-direct {v4, v5}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 963
    invoke-virtual {v4, v6, v7}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 298
    invoke-virtual {v8, v4}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 299
    invoke-static {v8, v3}, Ll/֨ۗ᩻;->֫(Ll/ۡܰۡ;Ll/ܺۜۜ;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    goto :goto_8

    .line 301
    :cond_e
    :try_start_f
    invoke-virtual {v8}, Ll/ۡܰۡ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :try_start_10
    invoke-virtual/range {p1 .. p1}, Ll/ᩳܰۡ;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_0

    return-void

    :catchall_1
    move-exception v0

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object/from16 p1, v7

    :goto_9
    move-object v1, v0

    .line 259
    :goto_a
    :try_start_11
    invoke-virtual {v8}, Ll/ۡܰۡ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v3, v0

    :try_start_12
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_c

    :catchall_5
    move-exception v0

    move-object/from16 p1, v7

    :goto_c
    move-object v1, v0

    :try_start_13
    invoke-virtual/range {p1 .. p1}, Ll/ᩳܰۡ;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    goto :goto_d

    :catchall_6
    move-exception v0

    move-object v3, v0

    :try_start_14
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v1
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "APK_WRITE_FAILED"

    .line 302
    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩹ۗ᩻;Ll/֡ۗ᩻;)V
    .locals 5

    .line 793
    iget-object p1, p1, Ll/ᩴۜۜ;->᩻:Ll/ܶ᩵ܿ;

    .line 813
    iget-object p2, p3, Ll/֡ۗ᩻;->ܳ:Ljava/lang/String;

    .line 814
    iget-boolean v0, p3, Ll/֡ۗ᩻;->ۜ:Z

    const-string v1, "DEX_BUILD_FAILED"

    if-eqz v0, :cond_0

    .line 820
    :try_start_0
    iget-object v0, p0, Ll/ܳ᩻ۜ;->ۗ:Ll/۠᩷ۜ;

    invoke-virtual {p0, p2}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ll/۠᩷ۜ;->ܳ(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 822
    invoke-virtual {p0, p2}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-static {p1}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v1, p1}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_0
    const-string v0, "<mcp-new-dex>"

    .line 814
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p3, Ll/֡ۗ᩻;->᩷:Ljava/util/LinkedHashMap;

    .line 815
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p3, Ll/֡ۗ᩻;->ܿ:Ljava/util/LinkedHashSet;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 813
    invoke-static {p2, v0, v2, v3}, Ll/᩹ۗ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ll/᩸ۗ᩻;

    move-result-object v0

    .line 795
    :try_start_1
    invoke-static {p1, v0}, Ll/᩹ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ll/᩸ۗ᩻;)[B

    move-result-object v2

    if-nez v2, :cond_1

    .line 797
    invoke-static {p0, p3}, Ll/֨ۗ᩻;->֫(Ll/ܳ᩻ۜ;Ll/֡ۗ᩻;)[B

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 832
    :try_start_2
    invoke-static {p1, v0, v2}, Ll/᩹ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ll/᩸ۗ᩻;[B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 800
    :catch_1
    :cond_1
    :try_start_3
    iput-object v2, p3, Ll/֡ۗ᩻;->ۧ:[B

    .line 801
    invoke-static {p2, v2}, Ll/ۤ᩺᩻;->֫(Ljava/lang/String;[B)Ll/ۤ᩺᩻;

    move-result-object p0

    iput-object p0, p3, Ll/֡ۗ᩻;->ᩳ:Ll/ۤ᩺᩻;

    .line 802
    iget p0, p0, Ll/ۤ᩺᩻;->֫:I

    iput p0, p3, Ll/֡ۗ᩻;->֫:I
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    const/4 p0, 0x1

    .line 809
    iput-boolean p0, p3, Ll/֡ۗ᩻;->ܽ:Z

    return-void

    :catch_2
    move-exception p0

    const/4 p1, 0x0

    .line 807
    invoke-static {p0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, v1, p0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 805
    :catch_3
    invoke-static {}, Ll/ᩳ۬᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;)V
    .locals 1

    .line 936
    :try_start_0
    new-instance v0, Ll/ۚۗ᩻;

    .line 1131
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 936
    invoke-static {p0, p1, p3, v0}, Ll/ۛۧᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/۬ۧᩳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "APK_SIGN_FAILED"

    .line 938
    invoke-static {p0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p1, p0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Z)V
    .locals 2

    .line 111
    invoke-direct {p0, p2}, Ll/֨ۗ᩻;->ۧ(Ll/ܶ᩵ܿ;)V

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 113
    invoke-virtual {p1, p2, v1, p3, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V

    return-void

    .line 116
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۤ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 118
    invoke-virtual {p1}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object p3

    sget-object v0, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    if-ne p3, v0, :cond_1

    .line 227
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 228
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "outputPath"

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, v0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "OUTPUT_ALREADY_EXISTS"

    const-string v0, "Output file already exists."

    const-string v1, "warning"

    .line 226
    invoke-static {p3, v0, v1, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 119
    throw p1

    .line 121
    :cond_1
    throw p1
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)V
    .locals 2

    .line 377
    invoke-static {p2, p3}, Ll/᩸ܶܽ;->ۧ(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 92
    invoke-static {p0, p1, p2, p3, v0}, Ll/᩸ܶܽ;->֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/ۗ᩺ۡ;Ll/ܶܶܽ;Ll/֨᩸ܿ;)V

    return-void

    .line 519
    :cond_0
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result p3

    and-int/lit8 p3, p3, 0x8

    if-eqz p3, :cond_2

    .line 385
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->֨()I

    move-result p3

    invoke-virtual {p1, p3}, Ll/ۡܰۡ;->ۧ(I)V

    .line 946
    new-instance p3, Ll/ۗ᩺ۡ;

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 947
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 948
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۗ᩺ۡ;->֫(Ljava/lang/String;)V

    .line 949
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 386
    invoke-virtual {p1, p3}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 387
    invoke-virtual {p0, p2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p0

    const/16 p2, 0x2000

    :try_start_0
    new-array p2, p2, [B

    .line 390
    :goto_0
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_1

    const/4 v0, 0x0

    .line 391
    invoke-virtual {p1, p2, v0, p3}, Ll/ۡܰۡ;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 393
    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 387
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    .line 382
    :cond_2
    invoke-virtual {p1, p2, p0}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)V

    return-void
.end method

.method public static ֫(Ljava/lang/RuntimeException;)Z
    .locals 1

    .line 512
    instance-of v0, p0, Ljava/lang/SecurityException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/IllegalStateException;

    if-nez v0, :cond_1

    instance-of p0, p0, Ljava/lang/UnsupportedOperationException;

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

.method public static ֫(Ll/ܳ᩻ۜ;Ll/֡ۗ᩻;)[B
    .locals 8

    .line 844
    iget-object v0, p1, Ll/֡ۗ᩻;->ܳ:Ljava/lang/String;

    iget-boolean v1, p1, Ll/֡ۗ᩻;->ۜ:Z

    iget-object v2, p1, Ll/֡ۗ᩻;->᩷:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_2

    .line 845
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ܳ᩻ۜ;->ۧ(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object v3

    .line 846
    invoke-virtual {v3}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v4

    iget v4, v4, Ll/۠ۗ֡;->֫:I

    iput v4, p1, Ll/֡ۗ᩻;->֫:I

    .line 847
    new-instance v4, Ll/᩵ۡۚ;

    invoke-virtual {v3}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v5

    invoke-direct {v4, v5}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 848
    invoke-virtual {v3}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ll/ᩴ۟֡;

    invoke-virtual {v3}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡ֫ۚ;

    .line 849
    invoke-interface {v5}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v6

    .line 850
    iget-object v7, p1, Ll/֡ۗ᩻;->ܿ:Ljava/util/LinkedHashSet;

    invoke-virtual {v7, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v2, v6}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    .line 853
    :cond_1
    invoke-virtual {v4, v5}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    goto :goto_0

    .line 857
    :cond_2
    new-instance v4, Ll/᩵ۡۚ;

    iget p1, p1, Ll/֡ۗ᩻;->֫:I

    invoke-static {p1}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object p1

    invoke-direct {v4, p1}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 859
    :cond_3
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۜۜ;

    .line 860
    iget-object v2, v2, Ll/ۖۜۜ;->֫:Ll/۠ۛ֡;

    invoke-virtual {v4, v2}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    goto :goto_1

    .line 862
    :cond_4
    invoke-virtual {v4}, Ll/᩸ۜۚ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_5

    .line 884
    new-instance p1, Ll/᩸ۡۚ;

    invoke-direct {p1}, Ll/᩸ۡۚ;-><init>()V

    .line 885
    invoke-virtual {v4, p1}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V

    .line 886
    invoke-virtual {p1}, Ll/᩸ۡۚ;->ܽ()[B

    move-result-object p0

    return-object p0

    :cond_5
    const-string p1, "DEX_POOL_OVERFLOW"

    const-string v2, "Dex method or field pool overflow."

    .line 894
    invoke-static {p1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 863
    throw p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    if-eqz v1, :cond_6

    .line 869
    invoke-virtual {p0, v0}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    goto :goto_2

    :cond_6
    const/4 p0, 0x0

    .line 870
    :goto_2
    invoke-static {p1}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "DEX_BUILD_FAILED"

    .line 869
    invoke-static {p0, v0, p1}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 867
    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)[B
    .locals 6

    .line 344
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    .line 345
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/high16 v1, 0x10000

    :try_start_1
    new-array v2, v1, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_0
    const v5, 0x500001

    sub-int/2addr v5, v4

    .line 350
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {p0, v2, v3, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-gez v5, :cond_1

    .line 352
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v1

    :cond_1
    if-nez v5, :cond_3

    .line 355
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v5

    if-gez v5, :cond_2

    .line 357
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 369
    :try_start_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v1

    .line 359
    :cond_2
    :try_start_5
    invoke-virtual {v0, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 362
    :cond_3
    invoke-virtual {v0, v2, v3, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    add-int/2addr v4, v5

    :goto_0
    const/high16 v5, 0x500000

    if-le v4, v5, :cond_0

    .line 369
    :try_start_6
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception v1

    .line 344
    :try_start_7
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_8
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz p0, :cond_4

    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw v0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    .line 1037
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "outputPath"

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "warning"

    .line 1036
    invoke-static {p1, p2, v1, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;)Ll/᩵ۗ᩻;
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 553
    iget-object v0, v2, Ll/ᩴۜۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "DEX_ENTRY_RESERVED"

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۜۜ;

    .line 554
    iget-object v3, v3, Ll/ܺۜۜ;->ۧ:Ljava/lang/String;

    invoke-static {v3}, Ll/ᩳ᩺᩻;->֫(Ljava/lang/String;)I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Standard dex entries can only be changed through dex class edits."

    .line 555
    invoke-static {v4, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 559
    :cond_1
    iget-object v0, v2, Ll/ᩴۜۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 560
    invoke-static {v3}, Ll/ᩳ᩺᩻;->֫(Ljava/lang/String;)I

    move-result v3

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "Standard dex entries cannot be deleted as ZIP entries."

    .line 561
    invoke-static {v4, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 573
    :cond_3
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 574
    iget-object v0, v1, Ll/ܳ᩻ۜ;->ܿ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 575
    invoke-static {v4}, Ll/ᩳ᩺᩻;->֫(Ljava/lang/String;)I

    move-result v5

    if-gtz v5, :cond_4

    goto :goto_2

    .line 579
    :cond_4
    invoke-static {v5, v4}, Ll/֡ۗ᩻;->֫(ILjava/lang/String;)Ll/֡ۗ᩻;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 581
    :cond_5
    iget-object v0, v2, Ll/ᩴۜۜ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖۜۜ;

    .line 582
    iget-object v5, v4, Ll/ۖۜۜ;->ܽ:Ljava/lang/String;

    invoke-static {v3, v5}, Ll/֨ۗ᩻;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ll/֡ۗ᩻;

    move-result-object v5

    .line 583
    iget-object v5, v5, Ll/֡ۗ᩻;->᩷:Ljava/util/LinkedHashMap;

    iget-object v6, v4, Ll/ۖۜۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 585
    :cond_6
    iget-object v0, v2, Ll/ᩴۜۜ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡۜۜ;

    .line 586
    iget-object v5, v4, Ll/ۡۜۜ;->ۧ:Ljava/lang/String;

    invoke-static {v3, v5}, Ll/֨ۗ᩻;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ll/֡ۗ᩻;

    move-result-object v5

    .line 587
    iget-object v5, v5, Ll/֡ۗ᩻;->ܿ:Ljava/util/LinkedHashSet;

    iget-object v4, v4, Ll/ۡۜۜ;->֫:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 529
    :cond_7
    new-instance v4, Ll/᩹ۗ᩻;

    .line 32
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 530
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 531
    iget-object v0, v2, Ll/ᩴۜۜ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v7, "DEX_POOL_OVERFLOW"

    const/4 v8, 0x1

    if-eqz v0, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 532
    invoke-static {v3, v0}, Ll/֨ۗ᩻;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ll/֡ۗ᩻;

    move-result-object v9

    .line 534
    :try_start_0
    invoke-static {v1, v2, v4, v9}, Ll/֨ۗ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩹ۗ᩻;Ll/֡ۗ᩻;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    move-object v10, v0

    .line 536
    iget-object v0, v10, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 539
    iput-boolean v8, v9, Ll/֡ۗ᩻;->ۢ:Z

    .line 540
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 537
    :cond_8
    throw v10

    .line 543
    :cond_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v6, "DEX_BUILD_FAILED"

    if-eqz v0, :cond_24

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ll/֡ۗ᩻;

    .line 609
    new-instance v9, Ljava/util/ArrayList;

    iget-object v10, v8, Ll/֡ۗ᩻;->᩷:Ljava/util/LinkedHashMap;

    iget-object v11, v8, Ll/֡ۗ᩻;->ܿ:Ljava/util/LinkedHashSet;

    iget-object v12, v8, Ll/֡ۗ᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 610
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v13, "Dex method or field pool overflow."

    if-nez v0, :cond_23

    .line 633
    :try_start_1
    new-instance v0, Ll/᩵ۡۚ;

    iget v14, v8, Ll/֡ۗ᩻;->֫:I

    invoke-static {v14}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object v14

    invoke-direct {v0, v14}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 634
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۖۜۜ;

    .line 635
    iget-object v15, v15, Ll/ۖۜۜ;->֫:Ll/۠ۛ֡;

    invoke-virtual {v0, v15}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    goto :goto_7

    .line 637
    :cond_a
    invoke-virtual {v0}, Ll/᩸ۜۚ;->ۧ()Z

    move-result v14

    if-nez v14, :cond_22

    .line 884
    new-instance v14, Ll/᩸ۡۚ;

    invoke-direct {v14}, Ll/᩸ۡۚ;-><init>()V

    .line 885
    invoke-virtual {v0, v14}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V

    .line 886
    invoke-virtual {v14}, Ll/᩸ۡۚ;->ܽ()[B

    move-result-object v0

    .line 641
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "#relocation-group"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v0}, Ll/ۤ᩺᩻;->֫(Ljava/lang/String;[B)Ll/ۤ᩺᩻;

    move-result-object v14

    const/high16 v0, 0x10000

    .line 642
    invoke-virtual {v14, v0}, Ll/ۤ᩺᩻;->֫(I)Z

    move-result v0
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7

    if-eqz v0, :cond_21

    .line 665
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const v0, 0x7fffffff

    const v15, 0x7fffffff

    const/16 v16, 0x0

    move-object/from16 v17, v7

    move-object/from16 v7, v16

    const v15, 0x7fffffff

    move-object/from16 v16, v5

    const v5, 0x7fffffff

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v13

    move-object v13, v0

    check-cast v13, Ll/֡ۗ᩻;

    if-eq v13, v8, :cond_15

    .line 666
    iget-boolean v0, v13, Ll/֡ۗ᩻;->ۢ:Z

    if-eqz v0, :cond_b

    goto/16 :goto_10

    .line 690
    :cond_b
    iget-object v0, v13, Ll/֡ۗ᩻;->ᩳ:Ll/ۤ᩺᩻;

    if-eqz v0, :cond_c

    goto :goto_9

    .line 693
    :cond_c
    iget-boolean v0, v13, Ll/֡ۗ᩻;->ۜ:Z

    if-eqz v0, :cond_e

    iget-object v0, v13, Ll/֡ۗ᩻;->᩷:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v13, Ll/֡ۗ᩻;->ܿ:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_a

    .line 697
    :cond_d
    :try_start_2
    iget-object v2, v13, Ll/֡ۗ᩻;->ܳ:Ljava/lang/String;
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_2

    .line 877
    :try_start_3
    invoke-virtual {v1, v2}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v0, v2}, Ll/ۤ᩺᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۤ᩺᩻;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_2

    .line 697
    :try_start_4
    iput-object v0, v13, Ll/֡ۗ᩻;->ᩳ:Ll/ۤ᩺᩻;

    .line 698
    iget v2, v0, Ll/ۤ᩺᩻;->֫:I

    iput v2, v13, Ll/֡ۗ᩻;->֫:I
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_2

    :goto_9
    move-object/from16 v19, v4

    goto :goto_b

    :catch_1
    move-exception v0

    move-object/from16 v19, v4

    :try_start_5
    const-string v4, "DEX_COUNTS_UNAVAILABLE"

    .line 879
    invoke-virtual {v1, v2}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v4, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_3

    :catch_2
    :cond_e
    :goto_a
    move-object/from16 v19, v4

    :catch_3
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_14

    .line 670
    iget v2, v0, Ll/ۤ᩺᩻;->ܳ:I

    iget v4, v0, Ll/ۤ᩺᩻;->᩻:I

    move-object/from16 v20, v6

    iget v6, v0, Ll/ۤ᩺᩻;->ܿ:I

    move-object/from16 v21, v11

    iget v11, v0, Ll/ۤ᩺᩻;->ۧ:I

    iget v1, v0, Ll/ۤ᩺᩻;->ᩳ:I

    move-object/from16 v22, v12

    iget v12, v0, Ll/ۤ᩺᩻;->ܽ:I

    move-object/from16 v23, v10

    iget v10, v8, Ll/֡ۗ᩻;->֫:I

    move-object/from16 v24, v9

    iget v9, v13, Ll/֡ۗ᩻;->֫:I

    if-gt v10, v9, :cond_13

    const v9, 0xaaaa

    invoke-virtual {v0, v9}, Ll/ۤ᩺᩻;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 199
    iget v0, v14, Ll/ۤ᩺᩻;->᩻:I

    iget v9, v14, Ll/ۤ᩺᩻;->ܳ:I

    iget v10, v14, Ll/ۤ᩺᩻;->ܿ:I

    move-object/from16 v25, v3

    iget v3, v14, Ll/ۤ᩺᩻;->ۧ:I

    move-object/from16 v26, v8

    iget v8, v14, Ll/ۤ᩺᩻;->ᩳ:I

    move-object/from16 v27, v13

    iget v13, v14, Ll/ۤ᩺᩻;->ܽ:I

    add-int/2addr v0, v4

    move/from16 v28, v5

    const/high16 v5, 0x10000

    if-gt v0, v5, :cond_12

    add-int/2addr v2, v9

    if-gt v2, v5, :cond_12

    add-int/2addr v12, v13

    if-gt v12, v5, :cond_12

    add-int/2addr v1, v8

    if-gt v1, v5, :cond_12

    add-int/2addr v11, v3

    if-gt v11, v5, :cond_12

    add-int/2addr v6, v10

    if-gt v6, v5, :cond_12

    const/high16 v3, 0x10000

    sub-int v0, v3, v0

    sub-int v5, v3, v2

    .line 212
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v12

    .line 213
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v1

    .line 214
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v11

    .line 215
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v6

    .line 216
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 223
    iget v5, v14, Ll/ۤ᩺᩻;->᩻:I

    add-int/2addr v4, v5

    const/high16 v5, 0x20000

    sub-int/2addr v5, v4

    sub-int/2addr v5, v2

    add-int/2addr v5, v3

    sub-int/2addr v5, v12

    add-int/2addr v5, v3

    sub-int/2addr v5, v1

    add-int/2addr v5, v3

    sub-int/2addr v5, v11

    add-int/2addr v5, v3

    sub-int/2addr v5, v6

    if-eqz v7, :cond_f

    if-lt v0, v15, :cond_f

    move/from16 v1, v28

    if-ne v0, v15, :cond_10

    if-lt v5, v1, :cond_f

    goto :goto_c

    :cond_f
    move-object/from16 v2, v27

    goto :goto_d

    :cond_10
    :goto_c
    if-ne v0, v15, :cond_11

    if-ne v5, v1, :cond_11

    move-object/from16 v2, v27

    .line 676
    iget v3, v2, Ll/֡ۗ᩻;->᩻:I

    iget v4, v7, Ll/֡ۗ᩻;->᩻:I

    if-ge v3, v4, :cond_11

    goto :goto_d

    :cond_11
    move v5, v1

    goto :goto_e

    :goto_d
    move v15, v0

    move-object v7, v2

    :goto_e
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v13, v18

    move-object/from16 v4, v19

    move-object/from16 v6, v20

    move-object/from16 v11, v21

    move-object/from16 v12, v22

    move-object/from16 v10, v23

    move-object/from16 v9, v24

    move-object/from16 v3, v25

    move-object/from16 v8, v26

    goto/16 :goto_8

    :cond_12
    move/from16 v1, v28

    goto :goto_11

    :cond_13
    move-object/from16 v25, v3

    move v1, v5

    move-object/from16 v26, v8

    goto :goto_11

    :cond_14
    move-object/from16 v25, v3

    :goto_f
    move v1, v5

    move-object/from16 v20, v6

    move-object/from16 v26, v8

    move-object/from16 v24, v9

    move-object/from16 v23, v10

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    goto :goto_11

    :cond_15
    :goto_10
    move-object/from16 v25, v3

    move-object/from16 v19, v4

    goto :goto_f

    :goto_11
    move-object/from16 v2, p1

    move v5, v1

    move-object/from16 v13, v18

    move-object/from16 v4, v19

    move-object/from16 v6, v20

    move-object/from16 v11, v21

    move-object/from16 v12, v22

    move-object/from16 v10, v23

    move-object/from16 v9, v24

    move-object/from16 v3, v25

    move-object/from16 v8, v26

    move-object/from16 v1, p0

    goto/16 :goto_8

    :cond_16
    move-object/from16 v25, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v6

    move-object/from16 v26, v8

    move-object/from16 v24, v9

    move-object/from16 v23, v10

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    if-nez v7, :cond_1a

    move-object/from16 v1, v26

    .line 616
    iget v0, v1, Ll/֡ۗ᩻;->֫:I

    .line 710
    invoke-virtual/range {v25 .. v25}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ۗ᩻;

    .line 711
    iget v4, v4, Ll/֡ۗ᩻;->᩻:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_12

    :cond_17
    if-lez v3, :cond_19

    const/4 v2, 0x1

    if-ne v3, v2, :cond_18

    const-string v2, "classes.dex"

    goto :goto_13

    :cond_18
    const-string v2, "classes"

    const-string v4, ".dex"

    .line 0
    invoke-static {v3, v2, v4}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 714
    :goto_13
    invoke-static {v3, v0, v2}, Ll/֡ۗ᩻;->֫(IILjava/lang/String;)Ll/֡ۗ᩻;

    move-result-object v7

    move-object/from16 v3, v25

    .line 715
    invoke-virtual {v3, v2, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    .line 77
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid dex index"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    move-object/from16 v3, v25

    move-object/from16 v1, v26

    .line 725
    :goto_14
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۜۜ;

    .line 726
    iget-object v4, v2, Ll/ۖۜۜ;->ۧ:Ljava/lang/String;

    move-object/from16 v5, v23

    invoke-virtual {v5, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, p0

    move-object/from16 v8, v22

    .line 751
    :try_start_6
    invoke-virtual {v6, v8}, Ll/ܳ᩻ۜ;->ۧ(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object v9

    invoke-virtual {v9}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ll/ᩴ۟֡;

    invoke-virtual {v9}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۡ֫ۚ;

    .line 752
    invoke-interface {v10}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    if-eqz v10, :cond_1b

    move-object/from16 v10, v21

    .line 728
    invoke-virtual {v10, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_1c
    move-object/from16 v10, v21

    .line 730
    :goto_16
    iget-object v9, v7, Ll/֡ۗ᩻;->᩷:Ljava/util/LinkedHashMap;

    new-instance v11, Ll/ۖۜۜ;

    iget-object v12, v7, Ll/֡ۗ᩻;->ܳ:Ljava/lang/String;

    iget-object v13, v2, Ll/ۖۜۜ;->֫:Ll/۠ۛ֡;

    iget-object v2, v2, Ll/ۖۜۜ;->ᩳ:Ljava/lang/String;

    invoke-direct {v11, v4, v12, v13, v2}, Ll/ۖۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/۠ۛ֡;Ljava/lang/String;)V

    invoke-virtual {v9, v4, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v23, v5

    move-object/from16 v22, v8

    move-object/from16 v21, v10

    goto :goto_15

    :catch_4
    move-exception v0

    .line 761
    invoke-virtual {v6, v8}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v20

    invoke-static {v1, v2, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 759
    :catch_5
    invoke-static {}, Ll/ᩳ۬᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1d
    move-object/from16 v6, p0

    move-object/from16 v10, v21

    move-object/from16 v5, v23

    .line 745
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1f

    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_17

    :cond_1e
    const/4 v0, 0x0

    goto :goto_18

    :cond_1f
    :goto_17
    const/4 v0, 0x1

    .line 733
    :goto_18
    iput-boolean v0, v1, Ll/֡ۗ᩻;->ܽ:Z

    const/4 v0, 0x0

    .line 734
    iput-object v0, v1, Ll/֡ۗ᩻;->ۧ:[B

    .line 735
    iput-object v0, v1, Ll/֡ۗ᩻;->ᩳ:Ll/ۤ᩺᩻;

    const/4 v4, 0x1

    .line 736
    iput-boolean v4, v7, Ll/֡ۗ᩻;->ܽ:Z

    .line 737
    iput-object v0, v7, Ll/֡ۗ᩻;->ۧ:[B

    .line 738
    iput-object v0, v7, Ll/֡ۗ᩻;->ᩳ:Ll/ۤ᩺᩻;

    .line 619
    iput-boolean v2, v1, Ll/֡ۗ᩻;->ۢ:Z

    .line 620
    iget-boolean v0, v1, Ll/֡ۗ᩻;->ܽ:Z

    move-object/from16 v4, p1

    move-object/from16 v5, v19

    if-eqz v0, :cond_20

    .line 621
    invoke-static {v6, v4, v5, v1}, Ll/֨ۗ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩹ۗ᩻;Ll/֡ۗ᩻;)V

    .line 623
    :cond_20
    invoke-static {v6, v4, v5, v7}, Ll/֨ۗ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩹ۗ᩻;Ll/֡ۗ᩻;)V

    move-object v2, v4

    move-object v4, v5

    move-object v1, v6

    move-object/from16 v5, v16

    move-object/from16 v7, v17

    goto/16 :goto_6

    :cond_21
    move-object v2, v6

    move-object v1, v7

    .line 894
    :try_start_7
    invoke-static {v1, v13}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 643
    throw v0

    :cond_22
    move-object v2, v6

    move-object v1, v7

    .line 894
    invoke-static {v1, v13}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 638
    throw v0
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    :catch_6
    move-exception v0

    goto :goto_19

    :catch_7
    move-exception v0

    move-object v2, v6

    .line 652
    :goto_19
    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v2, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 650
    :catch_8
    invoke-static {}, Ll/ᩳ۬᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_9
    move-exception v0

    .line 647
    throw v0

    :cond_23
    move-object v1, v7

    .line 894
    invoke-static {v1, v13}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 611
    throw v0

    :cond_24
    move-object v2, v6

    .line 766
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 767
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 768
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 769
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_25
    :goto_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_28

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ۗ᩻;

    .line 770
    iget-boolean v6, v5, Ll/֡ۗ᩻;->ܽ:Z

    iget-object v7, v5, Ll/֡ۗ᩻;->ܳ:Ljava/lang/String;

    if-nez v6, :cond_26

    goto :goto_1a

    .line 773
    :cond_26
    iget-object v6, v5, Ll/֡ۗ᩻;->ۧ:[B

    if-eqz v6, :cond_27

    .line 777
    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 779
    iget-boolean v5, v5, Ll/֡ۗ᩻;->ۜ:Z

    if-nez v5, :cond_25

    .line 780
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    .line 774
    :cond_27
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Dex merge plan was not materialized: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 783
    :cond_28
    invoke-static {}, Ll/ᩳ᩺᩻;->֫()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 784
    invoke-static {}, Ll/ᩳ᩺᩻;->֫()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v4, v2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 785
    new-instance v2, Ll/᩵ۗ᩻;

    invoke-direct {v2, v0, v1, v4}, Ll/᩵ۗ᩻;-><init>(Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v2
.end method

.method private ۧ(Ll/ܶ᩵ܿ;)V
    .locals 6

    .line 130
    invoke-static {}, Ll/᩹ۤ᩻;->֫()Ll/᩸ۤ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۤ᩻;->֫()Ll/۟ۢۜ;

    move-result-object v0

    .line 131
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 132
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 134
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 135
    new-instance v0, Ll/ᩳۖۜ;

    .line 136
    invoke-static {}, Ll/᩹ۤ᩻;->֫()Ll/᩸ۤ᩻;

    move-result-object v1

    invoke-static {}, Ll/᩹ۤ᩻;->ۧ()Ll/ۛۖۜ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ᩳۖۜ;-><init>(Ll/᩸ۤ᩻;Ll/ۛۖۜ;)V

    .line 137
    new-instance v1, Ll/ᩴۗ᩻;

    invoke-direct {v1, p0, p1}, Ll/ᩴۗ᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    .line 145
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    .line 146
    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    const-string v3, "OUTPUT_DIRECTORY_UNAVAILABLE"

    if-eq v1, v2, :cond_4

    sget-object v4, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-eq v1, v4, :cond_4

    .line 151
    sget-object v5, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v1, v5, :cond_3

    .line 155
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    const-string v1, "OUTPUT_PATH_NOT_FILE"

    if-eq v0, v5, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Output must be a regular file or a missing file."

    .line 162
    invoke-static {p1, v1, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    const-string v0, "Output path refers to a directory."

    .line 157
    invoke-static {p1, v1, v0}, Ll/֨ۗ᩻;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_3
    const-string v0, "Output parent could not be verified as a directory."

    .line 152
    invoke-static {p1, v3, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_4
    const-string v0, "Output parent must be an existing directory."

    .line 148
    invoke-static {p1, v3, v0}, Ll/֨ۗ᩻;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    .line 1047
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string v2, "outputPath"

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "fatal"

    .line 1046
    invoke-static {p1, p2, v1, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܳ᩻ۜ;Ll/᩸᩻ۜ;Ll/ᩴۜۜ;Ljava/lang/String;)Ll/ۘۜۜ;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 77
    iget-object v4, v0, Ll/ܳ᩻ۜ;->᩶:Ljava/lang/String;

    iget-object v5, v3, Ll/ᩴۜۜ;->ۜ:Ljava/lang/String;

    .line 190
    iget-object v6, v2, Ll/᩸᩻ۜ;->ۧ:Ljava/lang/String;

    iget-boolean v7, v2, Ll/᩸᩻ۜ;->ܽ:Z

    iget-boolean v8, v2, Ll/᩸᩻ۜ;->ᩳ:Z

    const-string v9, "/"

    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    new-array v5, v10, [Ljava/lang/String;

    .line 191
    invoke-static {v6, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    :goto_0
    move-object v9, v5

    goto :goto_3

    :cond_0
    new-array v9, v10, [Ljava/lang/String;

    move-object/from16 v11, p4

    .line 193
    invoke-static {v11, v9}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 641
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_5

    .line 197
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    new-array v11, v10, [Ljava/lang/String;

    invoke-static {v4, v11}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v11

    .line 235
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v13, 0x0

    .line 236
    :goto_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v13, v14, :cond_3

    .line 237
    invoke-virtual {v11, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v15, 0x3a

    if-eq v14, v15, :cond_1

    const/16 v15, 0x2f

    if-eq v14, v15, :cond_1

    const/16 v15, 0x5c

    if-eq v14, v15, :cond_1

    if-nez v14, :cond_2

    :cond_1
    const/16 v14, 0x5f

    .line 238
    :cond_2
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 240
    :cond_3
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 197
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "_mcp_"

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v8, :cond_4

    const-string v5, "_sign.apk"

    goto :goto_2

    :cond_4
    const-string v5, "_unsigned.apk"

    .line 198
    :goto_2
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 200
    :cond_5
    invoke-virtual {v9, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_a

    goto :goto_0

    .line 78
    :goto_3
    invoke-direct {v1, v9}, Ll/֨ۗ᩻;->ۧ(Ll/ܶ᩵ܿ;)V

    new-array v5, v10, [Ljava/lang/String;

    .line 211
    invoke-static {v4, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v9, v4}, Ll/ܶ᩵ܿ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 215
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 216
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v4

    if-eqz v4, :cond_12

    .line 220
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_7

    if-eqz v7, :cond_6

    goto :goto_4

    .line 227
    :cond_6
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 228
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "outputPath"

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "OUTPUT_ALREADY_EXISTS"

    const-string v4, "Output file already exists."

    const-string v5, "warning"

    .line 226
    invoke-static {v3, v4, v5, v0, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 221
    throw v0

    :cond_7
    :goto_4
    const/4 v4, 0x1

    if-eqz v8, :cond_b

    .line 913
    :try_start_1
    invoke-static {}, Ll/᩶ۗ᩻;->ۧ()Ll/ܽ᩺ܽ;

    move-result-object v5

    invoke-static {v5, v4}, Ll/ۤۗܳ;->֫(Ll/ܽ᩺ܽ;Z)Ll/ۨۧᩳ;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 917
    invoke-virtual {v5}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object v6

    instance-of v6, v6, Ll/᩹ܿᩳ;

    if-eqz v6, :cond_9

    .line 919
    :try_start_2
    invoke-virtual {v5}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۬ܿᩳ;->֫()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_6

    :catch_0
    move-exception v0

    .line 1054
    instance-of v2, v0, Ll/᩸ܿᩳ;

    if-eqz v2, :cond_8

    check-cast v0, Ll/᩸ܿᩳ;

    .line 1055
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The MCP service cannot use the current signing key: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/᩸ܿᩳ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Log in to MT account "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    invoke-virtual {v0}, Ll/᩸ܿᩳ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", or choose another signing key in MT MCP Settings, then retry."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_8
    const-string v0, "The MCP service cannot use the current signing key. Log in to the correct MT account, or choose another signing key in MT MCP Settings, then retry."

    :goto_5
    const-string v2, "APK_SIGN_ACCOUNT_REQUIRED"

    .line 921
    invoke-static {v9, v2, v0}, Ll/֨ۗ᩻;->ܽ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 923
    :cond_9
    invoke-virtual {v5}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۬ܿᩳ;->ᩴ()Z

    move-result v6

    if-nez v6, :cond_a

    :goto_6
    goto :goto_7

    :cond_a
    const-string v0, "APK_SIGN_KEY_LOCKED"

    const-string v2, "The MCP service cannot use the current signing key because it requires password input. Open MT MCP Settings to enter the signing key password or choose another signing key, then retry."

    .line 924
    invoke-static {v9, v0, v2}, Ll/֨ۗ᩻;->ܽ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    const-string v2, "APK_SIGN_KEY_MISSING"

    .line 915
    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v2, v0}, Ll/֨ۗ᩻;->ܽ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_b
    const/4 v5, 0x0

    :goto_7
    move-object v6, v5

    .line 81
    invoke-static {v0, v3}, Ll/֨ۗ᩻;->ۧ(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;)Ll/᩵ۗ᩻;

    move-result-object v5

    :try_start_3
    const-string v11, ".mcp_unsigned"

    .line 85
    invoke-virtual {v9, v11}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_9
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-nez v8, :cond_c

    .line 53
    :try_start_4
    sget-object v12, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v13, "kasb"

    invoke-interface {v12, v13, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v10, 0x1

    .line 86
    :cond_c
    invoke-static {v0, v3, v5, v11, v10}, Ll/֨ۗ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩵ۗ᩻;Ll/ܶ᩵ܿ;Z)V

    if-eqz v8, :cond_d

    const-string v4, ".mcp_signed"

    .line 89
    invoke-virtual {v9, v4}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 90
    :try_start_5
    invoke-static {v11, v4, v9, v6}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;)V

    .line 91
    invoke-direct {v1, v4, v9, v7}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Z)V
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_e

    :catch_2
    move-exception v0

    goto :goto_b

    :catch_3
    move-exception v0

    goto :goto_d

    .line 93
    :cond_d
    :try_start_6
    invoke-direct {v1, v11, v9, v7}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Z)V
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const/4 v4, 0x0

    :goto_8
    move-object v8, v4

    .line 95
    :try_start_7
    iget-boolean v7, v2, Ll/᩸᩻ۜ;->ᩳ:Z

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object v4, v5

    move-object v5, v9

    invoke-static/range {v2 .. v7}, Ll/֨ۗ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;Ll/᩵ۗ᩻;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Z)Ll/ۘۜۜ;

    move-result-object v0
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1068
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 1069
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_e
    if-eqz v8, :cond_f

    .line 1068
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_f

    .line 1069
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->۬()Z

    .line 104
    :cond_f
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v4, v8

    goto :goto_e

    :catch_4
    move-exception v0

    move-object v4, v8

    goto :goto_b

    :catch_5
    move-exception v0

    move-object v4, v8

    goto :goto_d

    :catchall_2
    move-exception v0

    goto :goto_9

    :catch_6
    move-exception v0

    goto :goto_a

    :catch_7
    move-exception v0

    goto :goto_c

    :catchall_3
    move-exception v0

    const/4 v11, 0x0

    :goto_9
    const/4 v4, 0x0

    goto :goto_e

    :catch_8
    move-exception v0

    const/4 v11, 0x0

    :goto_a
    const/4 v4, 0x0

    :goto_b
    :try_start_8
    const-string v2, "APK_BUILD_FAILED"

    .line 99
    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v2, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_9
    move-exception v0

    const/4 v11, 0x0

    :goto_c
    const/4 v4, 0x0

    .line 97
    :goto_d
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_e
    if-eqz v11, :cond_10

    .line 1068
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_10

    .line 1069
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_10
    if-eqz v4, :cond_11

    .line 1068
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_11

    .line 1069
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۬()Z

    .line 104
    :cond_11
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    .line 105
    throw v0

    :cond_12
    const-string v0, "OUTPUT_DIRECTORY_UNWRITABLE"

    const-string v2, "Output directory is not writable."

    .line 217
    invoke-static {v9, v0, v2}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_13
    const-string v0, "OUTPUT_PATH_IS_SOURCE_APK"

    const-string v2, "outputName must not resolve to the source APK."

    .line 212
    invoke-static {v9, v0, v2}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_a
    move-exception v0

    const-string v2, "OUTPUT_PATH_RESOLVE_FAILED"

    .line 202
    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3, v2, v0}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public final ֫(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;)Ll/ܶۜۜ;
    .locals 18

    move-object/from16 v0, p2

    const-string v1, "Failed to read changed APK entry content."

    const-string v2, "ENTRY_OVERLAY_READ_FAILED"

    .line 461
    iget-object v3, v0, Ll/ᩴۜۜ;->ܿ:Ljava/util/ArrayList;

    const/high16 v4, 0x10000

    new-array v4, v4, [B

    .line 462
    iget-object v5, v0, Ll/ᩴۜۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܺۜۜ;

    .line 463
    iget-object v7, v6, Ll/ܺۜۜ;->ᩳ:Ll/ܶ᩵ܿ;

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 467
    :try_start_0
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v9, 0x0

    .line 469
    :goto_1
    :try_start_1
    invoke-virtual {v7, v4}, Ljava/io/InputStream;->read([B)I

    move-result v11

    if-gez v11, :cond_1

    goto :goto_2

    :cond_1
    if-nez v11, :cond_4

    .line 474
    invoke-virtual {v7}, Ljava/io/InputStream;->read()I

    move-result v11

    if-gez v11, :cond_3

    .line 482
    :goto_2
    iget-wide v11, v6, Ll/ܺۜۜ;->ܿ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v6, v9, v11

    if-nez v6, :cond_2

    .line 485
    :try_start_2
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 483
    :cond_2
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Changed entry size changed after the build snapshot."

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/4 v11, 0x1

    .line 477
    invoke-static {v11, v9, v10}, Ll/֨ۗ᩻;->֫(IJ)J

    move-result-wide v9

    goto :goto_1

    .line 479
    :cond_4
    invoke-static {v11, v9, v10}, Ll/֨ۗ᩻;->֫(IJ)J

    move-result-wide v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v3, v0

    if-eqz v7, :cond_5

    .line 467
    :try_start_4
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v4, v0

    :try_start_5
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw v3
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v0

    .line 488
    invoke-static {v0}, Ll/֨ۗ᩻;->֫(Ljava/lang/RuntimeException;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 489
    throw v0

    .line 506
    :cond_6
    invoke-static {v8, v2, v1}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 491
    throw v0

    .line 506
    :catch_1
    invoke-static {v8, v2, v1}, Ll/֨ۗ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 486
    throw v0

    .line 175
    :cond_7
    invoke-static/range {p1 .. p2}, Ll/֨ۗ᩻;->ۧ(Ll/ܳ᩻ۜ;Ll/ᩴۜۜ;)Ll/᩵ۗ᩻;

    move-result-object v1

    .line 176
    new-instance v2, Ll/ܶۜۜ;

    move-object/from16 v4, p1

    iget-object v5, v4, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget-object v6, v0, Ll/ᩴۜۜ;->ۜ:Ljava/lang/String;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "entry_overlay_encode"

    const-string v7, "dex_merge"

    const-string v8, "edit_session_prepare"

    .line 1010
    filled-new-array {v8, v4, v7}, [Ljava/lang/String;

    move-result-object v4

    .line 1029
    new-instance v7, Ljava/util/ArrayList;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1030
    invoke-static {v7, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 178
    new-instance v12, Ljava/util/ArrayList;

    iget-object v1, v1, Ll/᩵ۗ᩻;->ۧ:Ljava/util/ArrayList;

    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1037
    iget-object v1, v0, Ll/ᩴۜۜ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int v13, v4, v1

    .line 180
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v14

    new-instance v15, Ljava/util/ArrayList;

    iget-object v1, v0, Ll/ᩴۜۜ;->֫:Ljava/util/ArrayList;

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, v0, Ll/ᩴۜۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v3, Ljava/util/ArrayList;

    iget-object v0, v0, Ll/ᩴۜۜ;->ܳ:Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v11, "passed"

    move-object v4, v2

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    invoke-direct/range {v4 .. v17}, Ll/ܶۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;ZIILjava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;IILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v2
.end method
