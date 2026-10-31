.class public final Ll/ۧۡۜ;
.super Ljava/lang/Object;
.source "I6XW"


# direct methods
.method public static ֫(Ll/ܶۖۜ;Ll/֫ۡۜ;)Ll/ۗۛ᩻;
    .locals 4

    .line 79
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ܶۖۜ;->ۧ:Ll/ܶ᩵ܿ;

    .line 80
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "operation"

    const-string v2, "patch_validate"

    .line 81
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "backendReason"

    const-string v2, "patch_after_end"

    .line 82
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "failedPatchIndex"

    iget v2, p1, Ll/֫ۡۜ;->ᩳ:I

    .line 83
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "byteOffset"

    iget-wide v2, p1, Ll/֫ۡۜ;->֫:J

    .line 84
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "endByteOffset"

    iget-wide v2, p1, Ll/֫ۡۜ;->ۧ:J

    .line 85
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "totalBytes"

    iget-wide v1, p0, Ll/ܶۖۜ;->ܽ:J

    .line 86
    invoke-virtual {p1, v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_OFFSET_OUT_OF_RANGE"

    const-string v0, "A byte patch range is outside the file."

    const-string v1, "warning"

    const/4 v2, 0x0

    .line 77
    invoke-static {p1, v0, v1, v2, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(JLjava/io/InputStream;)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-lez v3, :cond_5

    .line 94
    invoke-virtual {p2, p0, p1}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v3

    cmp-long v5, v3, v1

    if-lez v5, :cond_0

    sub-long/2addr p0, v3

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 102
    :cond_1
    array-length v1, v0

    int-to-long v1, v1

    invoke-static {v1, v2, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    const-string v2, "Unexpected end of file while seeking patch window"

    if-ltz v1, :cond_4

    if-nez v1, :cond_3

    .line 107
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result v1

    if-ltz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    .line 109
    :cond_2
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    int-to-long v1, v1

    sub-long/2addr p0, v1

    goto :goto_0

    .line 104
    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    return-void
.end method

.method public static ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;Ljava/util/ArrayList;)V
    .locals 12

    .line 63
    invoke-virtual {p0}, Ll/ܶۖۜ;->֫()Ljava/io/InputStream;

    move-result-object p0

    const/high16 v0, 0x10000

    :try_start_0
    new-array v1, v0, [B

    .line 66
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫ۡۜ;

    .line 67
    iget-wide v8, v6, Ll/֫ۡۜ;->֫:J

    sub-long/2addr v8, v4

    const-string v4, "Unexpected end of file before patch window"

    :goto_1
    cmp-long v5, v8, v2

    if-lez v5, :cond_3

    int-to-long v10, v0

    .line 141
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    long-to-int v5, v10

    invoke-virtual {p0, v1, v7, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-ltz v5, :cond_2

    if-nez v5, :cond_1

    .line 146
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v5

    if-ltz v5, :cond_0

    .line 150
    invoke-virtual {p1, v5}, Ljava/io/OutputStream;->write(I)V

    const-wide/16 v10, 0x1

    goto :goto_2

    .line 148
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 153
    :cond_1
    invoke-virtual {p1, v1, v7, v5}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v10, v5

    :goto_2
    sub-long/2addr v8, v10

    goto :goto_1

    .line 143
    :cond_2
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 68
    :cond_3
    iget-object v4, v6, Ll/֫ۡۜ;->ܽ:[B

    array-length v4, v4

    int-to-long v4, v4

    invoke-static {v4, v5, p0}, Ll/ۧۡۜ;->֫(JLjava/io/InputStream;)V

    .line 69
    iget-object v4, v6, Ll/֫ۡۜ;->ܿ:[B

    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    .line 70
    iget-wide v4, v6, Ll/֫ۡۜ;->ۧ:J

    goto :goto_0

    .line 162
    :cond_4
    :goto_3
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result p2

    if-gez p2, :cond_5

    goto :goto_4

    :cond_5
    if-nez p2, :cond_7

    .line 167
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez p2, :cond_6

    .line 73
    :goto_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-void

    .line 171
    :cond_6
    :try_start_1
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    goto :goto_3

    .line 173
    :cond_7
    invoke-virtual {p1, v1, v7, p2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_8

    .line 63
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_5
    throw p1
.end method

.method public static ֫(Ll/ܶۖۜ;Ljava/util/ArrayList;)V
    .locals 14

    .line 21
    iget-boolean v0, p0, Ll/ܶۖۜ;->֫:Z

    iget-object v1, p0, Ll/ܶۖۜ;->ۧ:Ll/ܶ᩵ܿ;

    const-string v2, "patch_validate"

    const-string v3, "operation"

    const-string v4, "path"

    const/4 v5, 0x0

    const-string v6, "warning"

    if-eqz v0, :cond_9

    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫ۡۜ;

    .line 28
    iget-wide v8, v7, Ll/֫ۡۜ;->ۧ:J

    iget-wide v10, p0, Ll/ܶۖۜ;->ܽ:J

    cmp-long v12, v8, v10

    if-gtz v12, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {p0, v7}, Ll/ۧۡۜ;->֫(Ll/ܶۖۜ;Ll/֫ۡۜ;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 32
    :cond_1
    invoke-virtual {p0}, Ll/ܶۖۜ;->֫()Ljava/io/InputStream;

    move-result-object v0

    .line 34
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v7, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֫ۡۜ;

    .line 35
    iget-wide v10, v9, Ll/֫ۡۜ;->֫:J

    iget-object v12, v9, Ll/֫ۡۜ;->ܽ:[B

    sub-long/2addr v10, v7

    invoke-static {v10, v11, v0}, Ll/ۧۡۜ;->֫(JLjava/io/InputStream;)V

    .line 36
    array-length v7, v12

    new-array v8, v7, [B

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v7, :cond_4

    sub-int v11, v7, v10

    .line 120
    invoke-virtual {v0, v8, v10, v11}, Ljava/io/InputStream;->read([BII)I

    move-result v11

    if-ltz v11, :cond_3

    if-nez v11, :cond_2

    .line 125
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v11

    if-ltz v11, :cond_3

    add-int/lit8 v13, v10, 0x1

    int-to-byte v11, v11

    .line 129
    aput-byte v11, v8, v10

    move v10, v13

    goto :goto_2

    :cond_2
    add-int/2addr v10, v11

    goto :goto_2

    .line 38
    :cond_3
    invoke-static {p0, v9}, Ll/ۧۡۜ;->֫(Ll/ܶۖۜ;Ll/֫ۡۜ;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 40
    :cond_4
    invoke-static {v8, v12}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 55
    iget-wide v7, v9, Ll/֫ۡۜ;->ۧ:J

    goto :goto_1

    :cond_5
    const-string p0, "FILE_PATCH_EXPECTED_MISMATCH"

    const-string p1, "Current bytes do not match expectedHex."

    .line 45
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 46
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 47
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "backendReason"

    const-string v3, "expected_bytes_mismatch"

    .line 48
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "failedPatchIndex"

    iget v3, v9, Ll/֫ۡۜ;->ᩳ:I

    .line 49
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "byteOffset"

    iget-wide v3, v9, Ll/֫ۡۜ;->֫:J

    .line 50
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "expectedHex"

    .line 51
    invoke-static {v12}, Ll/ܰۘܺ;->֫([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "actualHex"

    .line 53
    invoke-static {v8}, Ll/ܰۘܺ;->֫([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 41
    invoke-static {p0, p1, v6, v5, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    if-eqz v0, :cond_7

    .line 57
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_7
    return-void

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_8

    .line 32
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    throw p0

    .line 24
    :cond_9
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v4, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 25
    invoke-virtual {p0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_NOT_FOUND"

    const-string v0, "The requested file path does not exist."

    .line 22
    invoke-static {p1, v0, v6, v5, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
