.class public final Ll/۬ܶܿ;
.super Ll/ۡܶܿ;
.source "49SV"


# instance fields
.field public ۟:Ll/ۗܶܿ;


# direct methods
.method private ֫(Landroid/database/Cursor;IIII)Ll/۫᩵ܿ;
    .locals 13

    move-object v9, p0

    move-object v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p5

    .line 110
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    const-wide/16 v5, -0x1

    if-eqz v4, :cond_0

    move-wide v7, v5

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    .line 111
    :goto_0
    invoke-interface {p1, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-wide v10, v5

    goto :goto_1

    :cond_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    .line 112
    :goto_1
    invoke-virtual {p0}, Ll/۬ܶܿ;->ۢܽ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 114
    new-instance v0, Ll/۫᩵ܿ;

    sget-object v3, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    const-wide/16 v4, -0x1

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v6, v10

    invoke-direct/range {v1 .. v8}, Ll/۫᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;JJLjava/lang/String;)V

    return-object v0

    .line 117
    :cond_2
    invoke-interface {p1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    iget-object v12, v9, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    if-nez v4, :cond_a

    .line 120
    :try_start_0
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۬ܶܿ;->ᩴ(Ljava/lang/String;)Ll/ۗܶܿ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    invoke-virtual {v0}, Ll/ۗܶܿ;->ۧ()C

    move-result v1

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_5

    const/16 v2, 0x64

    if-eq v1, v2, :cond_4

    const/16 v2, 0x6c

    if-eq v1, v2, :cond_3

    .line 128
    sget-object v1, Ll/ۗ᩵ܿ;->ۗ:Ll/ۗ᩵ܿ;

    goto :goto_2

    .line 127
    :cond_3
    sget-object v1, Ll/ۗ᩵ܿ;->᩶:Ll/ۗ᩵ܿ;

    goto :goto_2

    .line 126
    :cond_4
    sget-object v1, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    goto :goto_2

    .line 125
    :cond_5
    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    :goto_2
    move-object v3, v1

    .line 130
    sget-object v1, Ll/ۗ᩵ܿ;->᩶:Ll/ۗ᩵ܿ;

    if-ne v3, v1, :cond_7

    invoke-virtual {v0}, Ll/ۗܶܿ;->ܽ()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    goto :goto_3

    .line 131
    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Missing MT provider link target: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v12}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_7
    :goto_3
    new-instance v12, Ll/۫᩵ܿ;

    .line 134
    sget-object v2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v3, v2, :cond_8

    move-wide v4, v5

    goto :goto_4

    :cond_8
    move-wide v4, v7

    :goto_4
    if-ne v3, v1, :cond_9

    .line 135
    invoke-virtual {v0}, Ll/ۗܶܿ;->ܽ()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_9
    const/4 v0, 0x0

    :goto_5
    move-object v8, v0

    move-object v1, v12

    move-object v2, p0

    move-wide v6, v10

    invoke-direct/range {v1 .. v8}, Ll/۫᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;JJLjava/lang/String;)V

    return-object v12

    :catch_0
    move-exception v0

    .line 122
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid MT provider metadata: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v12}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 125
    :cond_a
    iget-boolean v3, v9, Ll/ۡܶܿ;->ۨ:Z

    if-eqz v3, :cond_b

    .line 139
    invoke-virtual/range {p0 .. p4}, Ll/ۡ᩸ܿ;->֫(Landroid/database/Cursor;III)Ll/۫᩵ܿ;

    move-result-object v0

    return-object v0

    .line 142
    :cond_b
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Missing MT provider metadata: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v12}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ֫(Ll/۬ܶܿ;Ljava/lang/String;)V
    .locals 0

    .line 298
    invoke-direct {p0, p1}, Ll/۬ܶܿ;->ۘ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ֫(Ll/۬ܶܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬ܶܿ;->ۖܽ()Z

    move-result p0

    return p0
.end method

.method private declared-synchronized ۖܽ()Z
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 346
    :try_start_0
    iget-object v1, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 347
    monitor-exit v0

    return v2

    .line 349
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Ll/ܳܶܿ;->ۧ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v4

    .line 350
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v1, "mt_extras"

    .line 351
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    .line 352
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 355
    :cond_1
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/۬ܶܿ;->ᩴ(Ljava/lang/String;)Ll/ۗܶܿ;

    move-result-object v3

    iput-object v3, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 357
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 356
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v2

    .line 351
    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 357
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 353
    :cond_3
    monitor-exit v0

    return v3

    :catchall_2
    move-exception v1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1
.end method

.method private ۘ(Ljava/lang/String;)V
    .locals 5

    .line 307
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    .line 308
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "uri"

    .line 309
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v2, "path"

    .line 310
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "mt:createSymlink"

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v3, v4, v1}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "result"

    .line 313
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const-string v1, "message"

    .line 316
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 318
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 322
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to create link \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    iget-object v2, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 322
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' to \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ۧ(Ll/۬ܶܿ;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬ܶܿ;->ܺܽ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ܺܽ()Ljava/lang/String;
    .locals 7

    .line 263
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ܳܶܿ;->ۧ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    .line 264
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v0, "mt_path"

    .line 265
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 266
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 267
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    .line 265
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    :cond_0
    if-eqz v0, :cond_1

    .line 269
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 151
    :cond_1
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic ܽ(Ll/۬ܶܿ;)Ll/ۗܶܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    return-object p0
.end method

.method public static ᩴ(Ljava/lang/String;)Ll/ۗܶܿ;
    .locals 5

    const-string v0, "\\|"

    const/4 v1, 0x4

    .line 146
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 147
    aget-object v0, p0, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x1

    .line 148
    aget-object v2, p0, v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    .line 149
    aget-object v3, p0, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 150
    array-length v4, p0

    if-ne v4, v1, :cond_0

    const/4 v1, 0x3

    aget-object p0, p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 151
    :goto_0
    new-instance v1, Ll/ۗܶܿ;

    invoke-direct {v1, v0, v2, v3, p0}, Ll/ۗܶܿ;-><init>(IIILjava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final ֨ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡܶܿ;
    .locals 2

    .line 56
    new-instance v0, Ll/۬ܶܿ;

    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v1

    .line 37
    invoke-direct {v0, p1, p2, v1}, Ll/ۡܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;Ll/ۘܶܿ;)V

    return-object v0
.end method

.method public final ֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡ᩸ܿ;
    .locals 2

    .line 56
    new-instance v0, Ll/۬ܶܿ;

    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v1

    .line 37
    invoke-direct {v0, p1, p2, v1}, Ll/ۡܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;Ll/ۘܶܿ;)V

    return-object v0
.end method

.method public final ֫(Landroid/database/Cursor;)Ll/۫᩵ܿ;
    .locals 6

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    .line 97
    invoke-direct/range {v0 .. v5}, Ll/۬ܶܿ;->֫(Landroid/database/Cursor;IIII)Ll/۫᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/io/File;Landroid/net/Uri;Landroid/database/Cursor;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 74
    invoke-super {p0, p1, p2, p3}, Ll/ۡ᩸ܿ;->֫(Ljava/io/File;Landroid/net/Uri;Landroid/database/Cursor;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻()Ll/۬ܶܿ;

    move-result-object p1

    const/4 p2, 0x5

    .line 75
    invoke-interface {p3, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    invoke-interface {p3, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/۬ܶܿ;->ᩴ(Ljava/lang/String;)Ll/ۗܶܿ;

    move-result-object p2

    iput-object p2, p1, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;
    .locals 1

    .line 202
    new-instance v0, Ll/ۙܶܿ;

    invoke-direct {v0, p0, p0, p1}, Ll/ۙܶܿ;-><init>(Ll/۬ܶܿ;Ll/۬ܶܿ;Ll/ۜ᩵ܿ;)V

    return-object v0
.end method

.method public final ֫(Ljava/io/File;Landroid/net/Uri;Z)V
    .locals 0

    return-void
.end method

.method public final ֫(I)Z
    .locals 5

    .line 230
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    .line 231
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "uri"

    .line 232
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v2, "permissions"

    .line 233
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 234
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "mt:setPermissions"

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v3, v4, v1}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "result"

    .line 236
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 237
    iget-object v0, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    if-eqz v0, :cond_0

    .line 239
    invoke-static {v0}, Ll/ۗܶܿ;->ۧ(Ll/ۗܶܿ;)I

    move-result v1

    and-int/lit16 v1, v1, -0x1000

    or-int/2addr p1, v1

    .line 242
    invoke-static {v0, p1}, Ll/ۗܶܿ;->֫(Ll/ۗܶܿ;I)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const-string p1, "message"

    .line 246
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 248
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(J)Z
    .locals 5

    .line 179
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    .line 180
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "uri"

    .line 181
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v2, "time"

    .line 182
    invoke-virtual {v1, v2, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 183
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "mt:setLastModified"

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v3, v4, v1}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "result"

    .line 185
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 186
    iget-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    if-eqz v0, :cond_0

    .line 187
    iput-wide p1, v0, Ll/ۢ᩸ܿ;->᩹:J

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const-string p1, "message"

    .line 191
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 193
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ۖ֫()Ljava/lang/String;
    .locals 1

    .line 291
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܰ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ll/۬ܶܿ;->᩻ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ֫()Ll/ܶ᩵ܿ;
    .locals 2

    .line 286
    invoke-virtual {p0}, Ll/۬ܶܿ;->᩻ܽ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ۟ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۡܽ()Z
    .locals 3

    .line 336
    iget-object v0, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 339
    :cond_0
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 340
    new-instance v0, Ll/᩸ܶܿ;

    invoke-direct {v0, p0}, Ll/᩸ܶܿ;-><init>(Ll/۬ܶܿ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 340
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 342
    :cond_1
    invoke-direct {p0}, Ll/۬ܶܿ;->ۖܽ()Z

    move-result v0

    return v0
.end method

.method public final ۢܽ()Z
    .locals 6

    .line 158
    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 449
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 450
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x12

    const/4 v5, 0x0

    if-eq v3, v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 453
    :cond_0
    invoke-virtual {v0}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_2

    .line 146
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v1, "android_obb"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x3

    goto :goto_1

    :sswitch_1
    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x2

    goto :goto_1

    :sswitch_2
    const-string v1, "android_data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x1

    goto :goto_1

    :sswitch_3
    const-string v1, "user_de_data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    packed-switch v3, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    return v2

    :goto_2
    return v5

    :sswitch_data_0
    .sparse-switch
        -0x495e23cc -> :sswitch_3
        -0x3b22e086 -> :sswitch_2
        0x2eefaa -> :sswitch_1
        0x37e6431f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۤ()Z
    .locals 1

    .line 42
    iget-object v0, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 45
    :cond_0
    invoke-super {p0}, Ll/ۡܶܿ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ۤۧ()[Ljava/lang/String;
    .locals 7

    const-string v5, "mt_extras"

    const-string v6, "mt_path"

    const-string v0, "document_id"

    const-string v1, "_display_name"

    const-string v2, "mime_type"

    const-string v3, "_size"

    const-string v4, "last_modified"

    .line 61
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Landroid/database/Cursor;)Ll/۫᩵ܿ;
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v2, 0x2

    const/4 v3, 0x3

    move-object v0, p0

    move-object v1, p1

    .line 102
    invoke-direct/range {v0 .. v5}, Ll/۬ܶܿ;->֫(Landroid/database/Cursor;IIII)Ll/۫᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ۬ۧ()[Ljava/lang/String;
    .locals 5

    const-string v0, "mt_path"

    const-string v1, "mt_extras"

    const-string v2, "mime_type"

    const-string v3, "_size"

    const-string v4, "last_modified"

    .line 86
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 296
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    new-instance v0, Ll/᩶ܶܿ;

    invoke-direct {v0, p0, p1}, Ll/᩶ܶܿ;-><init>(Ll/۬ܶܿ;Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    return-void

    .line 302
    :cond_0
    invoke-direct {p0, p1}, Ll/۬ܶܿ;->ۘ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ֫()Ljava/lang/String;
    .locals 1

    .line 276
    invoke-virtual {p0}, Ll/۬ܶܿ;->ۢܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    invoke-virtual {p0}, Ll/۬ܶܿ;->᩻ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 279
    :cond_0
    invoke-virtual {p0}, Ll/۬ܶܿ;->ۡܽ()Z

    .line 280
    iget-object v0, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    if-eqz v0, :cond_1

    .line 281
    invoke-static {v0}, Ll/ۗܶܿ;->֫(Ll/ۗܶܿ;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩶ۧ()V
    .locals 1

    .line 50
    invoke-super {p0}, Ll/ۡܶܿ;->᩶ۧ()V

    const/4 v0, 0x0

    .line 51
    iput-object v0, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    return-void
.end method

.method public final ᩷ܽ()Ll/ۗܶܿ;
    .locals 1

    .line 361
    iget-object v0, p0, Ll/۬ܶܿ;->۟:Ll/ۗܶܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩻()Ll/۬ܶܿ;
    .locals 0

    return-object p0
.end method

.method public final ᩻ܽ()Ljava/lang/String;
    .locals 3

    .line 256
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    new-instance v0, Ll/᩹ܶܿ;

    invoke-direct {v0, p0}, Ll/᩹ܶܿ;-><init>(Ll/۬ܶܿ;)V

    .line 151
    iget-object v1, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 257
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 259
    :cond_0
    invoke-direct {p0}, Ll/۬ܶܿ;->ܺܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
