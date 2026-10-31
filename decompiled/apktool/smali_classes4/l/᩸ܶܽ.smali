.class public final Ll/᩸ܶܽ;
.super Ljava/lang/Object;
.source "21YS"


# static fields
.field public static final ֫:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 33

    const-string v31, ".jar"

    const-string v32, ".xz"

    const-string v0, ".jpg"

    const-string v1, ".jpeg"

    const-string v2, ".png"

    const-string v3, ".gif"

    const-string v4, ".wav"

    const-string v5, ".mp2"

    const-string v6, ".mp3"

    const-string v7, ".ogg"

    const-string v8, ".aac"

    const-string v9, ".mpg"

    const-string v10, ".mpeg"

    const-string v11, ".mid"

    const-string v12, ".midi"

    const-string v13, ".smf"

    const-string v14, ".jet"

    const-string v15, ".rtttl"

    const-string v16, ".imy"

    const-string v17, ".xmf"

    const-string v18, ".mp4"

    const-string v19, ".m4a"

    const-string v20, ".m4v"

    const-string v21, ".3gp"

    const-string v22, ".3gpp"

    const-string v23, ".3g2"

    const-string v24, ".3gpp2"

    const-string v25, ".amr"

    const-string v26, ".awb"

    const-string v27, ".wma"

    const-string v28, ".wmv"

    const-string v29, ".apk"

    const-string v30, ".zip"

    .line 16
    filled-new-array/range {v0 .. v32}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩸ܶܽ;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ܶܶܽ;)I
    .locals 3

    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 70
    iget-boolean v0, p1, Ll/ܶܶܽ;->ܽ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "lib/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 63
    :cond_0
    iget-boolean v0, p1, Ll/ܶܶܽ;->ۧ:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, ".dex"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "assets/dexopt/"

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "resources.arsc"

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 38
    iget-boolean p0, p1, Ll/ܶܶܽ;->֫:Z

    xor-int/2addr v2, p0

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_0
    const/16 v0, 0x21

    if-ge p1, v0, :cond_5

    .line 40
    sget-object v0, Ll/᩸ܶܽ;->֫:[Ljava/lang/String;

    aget-object v0, v0, p1

    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_1
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    if-eqz v2, :cond_6

    const/16 p0, 0x8

    return p0

    :cond_6
    return v1
.end method

.method public static ֫(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)J
    .locals 0

    .line 138
    invoke-static {p0, p1}, Ll/᩸ܶܽ;->ۧ(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide p0

    return-wide p0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/ۗ᩺ۡ;Ll/ܶܶܽ;Ll/֨᩸ܿ;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v10, p4

    .line 100
    invoke-static/range {p2 .. p3}, Ll/᩸ܶܽ;->ۧ(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)Z

    move-result v3

    if-nez v3, :cond_1

    if-nez v10, :cond_0

    .line 102
    invoke-virtual {v1, v2, v0}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)V

    return-void

    .line 104
    :cond_0
    invoke-virtual {v1, v2, v0, v10}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;Ll/֨᩸ܿ;)V

    return-void

    .line 108
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ll/ۡܰۡ;->ܳ()I

    move-result v11

    const/4 v12, 0x0

    .line 110
    :try_start_0
    invoke-virtual {v1, v12}, Ll/ۡܰۡ;->ۧ(I)V

    .line 111
    invoke-virtual/range {p1 .. p2}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 112
    invoke-virtual {v0, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v0, 0x2000

    :try_start_1
    new-array v0, v0, [B

    const-wide/16 v3, 0x0

    .line 116
    :goto_0
    invoke-virtual {v13, v0}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_3

    .line 117
    invoke-virtual {v1, v0, v12, v5}, Ll/ۡܰۡ;->write([BII)V

    int-to-long v5, v5

    add-long v14, v3, v5

    if-eqz v10, :cond_2

    .line 120
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v8

    move-object/from16 v3, p4

    move-wide v4, v5

    move-wide v6, v14

    invoke-interface/range {v3 .. v9}, Ll/֨᩸ܿ;->֫(JJJ)V

    .line 121
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_2

    .line 126
    :try_start_2
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 130
    invoke-virtual {v1, v11}, Ll/ۡܰۡ;->ۧ(I)V

    return-void

    :cond_2
    move-wide v3, v14

    goto :goto_0

    .line 126
    :cond_3
    :try_start_3
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V

    .line 127
    invoke-virtual/range {p1 .. p1}, Ll/ۡܰۡ;->ܽ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 130
    invoke-virtual {v1, v11}, Ll/ۡܰۡ;->ۧ(I)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 112
    :try_start_4
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    .line 130
    invoke-virtual {v1, v11}, Ll/ۡܰۡ;->ۧ(I)V

    .line 131
    throw v0
.end method

.method public static ۧ(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)Z
    .locals 3

    .line 84
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 70
    iget-boolean v1, p1, Ll/ܶܶܽ;->ܽ:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "lib/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 63
    :cond_0
    iget-boolean p1, p1, Ll/ܶܶܽ;->ۧ:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".dex"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 84
    :goto_0
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->֨()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
