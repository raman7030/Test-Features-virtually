.class public final Ll/ܽܶ֫;
.super Ll/ۖ۠֫;
.source "G1W6"


# instance fields
.field public ۜ:Landroid/net/Uri;

.field public ܳ:Ljava/io/RandomAccessFile;

.field public ܿ:J

.field public ᩻:Z


# virtual methods
.method public final close()V
    .locals 5

    const/4 v0, 0x0

    .line 165
    iput-object v0, p0, Ll/ܽܶ֫;->ۜ:Landroid/net/Uri;

    const/4 v1, 0x0

    .line 167
    :try_start_0
    iget-object v2, p0, Ll/ܽܶ֫;->ܳ:Ljava/io/RandomAccessFile;

    if-eqz v2, :cond_0

    .line 168
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    :cond_0
    iput-object v0, p0, Ll/ܽܶ֫;->ܳ:Ljava/io/RandomAccessFile;

    .line 174
    iget-boolean v0, p0, Ll/ܽܶ֫;->᩻:Z

    if-eqz v0, :cond_1

    .line 175
    iput-boolean v1, p0, Ll/ܽܶ֫;->᩻:Z

    .line 176
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v2

    .line 171
    :try_start_1
    new-instance v3, Ll/ۧܶ֫;

    const/16 v4, 0x7d0

    .line 60
    invoke-direct {v3, v4, v2}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 171
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    :goto_0
    iput-object v0, p0, Ll/ܽܶ֫;->ܳ:Ljava/io/RandomAccessFile;

    .line 174
    iget-boolean v0, p0, Ll/ܽܶ֫;->᩻:Z

    if-eqz v0, :cond_2

    .line 175
    iput-boolean v1, p0, Ll/ܽܶ֫;->᩻:Z

    .line 176
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 178
    :cond_2
    throw v2
.end method

.method public final read([BII)I
    .locals 5

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 138
    :cond_0
    iget-wide v0, p0, Ll/ܽܶ֫;->ܿ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 p1, -0x1

    return p1

    .line 143
    :cond_1
    :try_start_0
    iget-object v2, p0, Ll/ܽܶ֫;->ܳ:Ljava/io/RandomAccessFile;

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    int-to-long v3, p3

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    invoke-virtual {v2, p1, p2, p3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-lez p1, :cond_2

    .line 149
    iget-wide p2, p0, Ll/ܽܶ֫;->ܿ:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Ll/ܽܶ֫;->ܿ:J

    .line 150
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ᩳ(I)V

    :cond_2
    return p1

    :catch_0
    move-exception p1

    .line 145
    new-instance p2, Ll/ۧܶ֫;

    const/16 p3, 0x7d0

    .line 60
    invoke-direct {p2, p3, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 145
    throw p2
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 8

    .line 110
    iget-object v0, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v1, p1, Ll/ۗ۠֫;->᩻:J

    .line 111
    iput-object v0, p0, Ll/ܽܶ֫;->ۜ:Landroid/net/Uri;

    .line 112
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    const/16 v3, 0x7d0

    const/16 v4, 0x7d6

    .line 183
    :try_start_0
    new-instance v5, Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "r"

    .line 183
    invoke-direct {v5, v6, v7}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 113
    iput-object v5, p0, Ll/ܽܶ֫;->ܳ:Ljava/io/RandomAccessFile;

    .line 115
    :try_start_1
    invoke-virtual {v5, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 117
    iget-wide v4, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽܶ֫;->ܳ:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v4

    sub-long/2addr v4, v1

    :cond_0
    iput-wide v4, p0, Ll/ܽܶ֫;->ܿ:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/16 v0, 0x0

    cmp-long v2, v4, v0

    if-ltz v2, :cond_1

    const/4 v0, 0x1

    .line 128
    iput-boolean v0, p0, Ll/ܽܶ֫;->᩻:Z

    .line 129
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    .line 131
    iget-wide v0, p0, Ll/ܽܶ֫;->ܿ:J

    return-wide v0

    .line 122
    :cond_1
    new-instance p1, Ll/ۧܶ֫;

    const/16 v0, 0x7d8

    const/4 v1, 0x0

    .line 68
    invoke-direct {p1, v1, v1, v0}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 122
    throw p1

    :catch_0
    move-exception p1

    .line 119
    new-instance v0, Ll/ۧܶ֫;

    .line 60
    invoke-direct {v0, v3, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 119
    throw v0

    :catch_1
    move-exception p1

    .line 207
    new-instance v0, Ll/ۧܶ֫;

    .line 60
    invoke-direct {v0, v3, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 207
    throw v0

    :catch_2
    move-exception p1

    .line 205
    new-instance v0, Ll/ۧܶ֫;

    .line 60
    invoke-direct {v0, v4, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 205
    throw v0

    :catch_3
    move-exception p1

    .line 185
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 198
    new-instance v0, Ll/ۧܶ֫;

    .line 200
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Landroid/system/ErrnoException;

    if-eqz v1, :cond_2

    .line 201
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    check-cast v1, Landroid/system/ErrnoException;

    iget v1, v1, Landroid/system/ErrnoException;->errno:I

    sget v2, Landroid/system/OsConstants;->EACCES:I

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    const/16 v4, 0x7d5

    .line 60
    :goto_0
    invoke-direct {v0, v4, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 203
    throw v0

    .line 186
    :cond_3
    new-instance v1, Ll/ۧܶ֫;

    .line 191
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v0

    const-string v4, ",query="

    const-string v5, ",fragment="

    const-string v6, "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing \'?\' or \'#\'? Use Uri.fromFile(new File(path)) to avoid this. path="

    .line 0
    invoke-static {v6, v2, v4, v3, v5}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 187
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x3ec

    .line 68
    invoke-direct {v1, v0, p1, v2}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 187
    throw v1
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ܽܶ֫;->ۜ:Landroid/net/Uri;

    return-object v0
.end method
