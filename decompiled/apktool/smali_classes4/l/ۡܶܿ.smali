.class public Ll/ۡܶܿ;
.super Ll/ۡ᩸ܿ;
.source "59S0"


# instance fields
.field public final ۨ:Z

.field public final ܰ:Ljava/lang/String;

.field public transient ᩺:Ll/ۘܶܿ;


# direct methods
.method public constructor <init>(Ljava/io/File;Landroid/net/Uri;Ll/ۘܶܿ;)V
    .locals 1

    .line 20
    invoke-direct {p0, p1, p2}, Ll/ۡ᩸ܿ;-><init>(Ljava/io/File;Landroid/net/Uri;)V

    .line 21
    iput-object p3, p0, Ll/ۡܶܿ;->᩺:Ll/ۘܶܿ;

    .line 22
    iget-object p2, p3, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    iput-object p2, p0, Ll/ۡܶܿ;->ܰ:Ljava/lang/String;

    .line 449
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 450
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v0, 0x12

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 453
    :cond_0
    invoke-virtual {p3}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    .line 23
    :goto_0
    iput-boolean p1, p0, Ll/ۡܶܿ;->ۨ:Z

    return-void
.end method


# virtual methods
.method public final ֨֫()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Ll/ۡܶܿ;->ۨ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 60
    :cond_0
    invoke-super {p0}, Ll/ۡ᩸ܿ;->֨֫()Z

    move-result v0

    return v0
.end method

.method public ֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡܶܿ;
    .locals 2

    .line 28
    new-instance v0, Ll/ۡܶܿ;

    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Ll/ۡܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;Ll/ۘܶܿ;)V

    return-object v0
.end method

.method public bridge synthetic ֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡ᩸ܿ;
    .locals 0

    .line 14
    invoke-virtual {p0, p1, p2}, Ll/ۡܶܿ;->֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡܶܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/net/Uri;Z)V
    .locals 2

    .line 120
    invoke-super {p0, p1, p2}, Ll/ܳ᩸ܿ;->֫(Landroid/net/Uri;Z)V

    .line 121
    new-instance v0, Ljava/io/File;

    .line 151
    iget-object v1, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1, p2}, Ll/ۡܶܿ;->ۧ(Ljava/io/File;Landroid/net/Uri;Z)V

    return-void
.end method

.method public ֫(Ljava/io/File;Landroid/net/Uri;Z)V
    .locals 0

    .line 115
    invoke-virtual {p0, p1, p2, p3}, Ll/ۡܶܿ;->ۧ(Ljava/io/File;Landroid/net/Uri;Z)V

    return-void
.end method

.method public final ֫ܽ()Ll/ۘܶܿ;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ۡܶܿ;->᩺:Ll/ۘܶܿ;

    if-nez v0, :cond_0

    .line 34
    iget-object v0, p0, Ll/ۡܶܿ;->ܰ:Ljava/lang/String;

    invoke-static {v0}, Ll/ᩴܶܿ;->֫(Ljava/lang/String;)Ll/ۘܶܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/ۡܶܿ;->᩺:Ll/ۘܶܿ;

    :cond_0
    return-object v0
.end method

.method public final ۛ֫()J
    .locals 2

    .line 125
    iget-boolean v0, p0, Ll/ۡܶܿ;->ۨ:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 76
    :cond_0
    invoke-super {p0}, Ll/ۡ᩸ܿ;->ۛ֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public ۟ۧ()Z
    .locals 14

    .line 146
    iget-boolean v0, p0, Ll/ۡܶܿ;->ۨ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 149
    :cond_0
    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v0

    iget-object v2, v0, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    .line 150
    invoke-static {v2}, Ll/ܳܶܿ;->ۧ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    .line 151
    iget-object v4, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 152
    invoke-virtual {v0}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v1

    const/4 v5, 0x1

    .line 154
    :goto_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v0, v6, :cond_c

    const/16 v6, 0x2f

    .line 155
    invoke-virtual {v4, v6, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-gez v6, :cond_1

    .line 157
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    .line 159
    :cond_1
    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v7

    .line 162
    invoke-static {v3}, Ll/ܳܶܿ;->֫(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v8

    const-string v3, "_display_name"

    const-string v9, "mime_type"

    const-string v10, "document_id"

    filled-new-array {v10, v3, v9}, [Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 161
    invoke-virtual/range {v7 .. v12}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    if-eqz v3, :cond_a

    const/4 v7, 0x0

    .line 169
    :cond_2
    :goto_1
    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_6

    .line 170
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 171
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    if-eqz v8, :cond_5

    if-eqz v9, :cond_5

    .line 175
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 176
    invoke-static {v2, v9}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    if-eqz v7, :cond_4

    .line 177
    invoke-virtual {v7, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    .line 178
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Provider path has ambiguous child names"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    const-string v7, "vnd.android.document/directory"

    const/4 v8, 0x2

    .line 181
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    move v13, v7

    move-object v7, v5

    move v5, v13

    goto :goto_1

    .line 173
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Provider returned invalid child identity"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    :cond_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    if-nez v7, :cond_7

    return v9

    .line 188
    :cond_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v6, v0, :cond_9

    if-eqz v5, :cond_8

    goto :goto_3

    .line 189
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Provider path parent is not a directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_3
    add-int/lit8 v0, v6, 0x1

    move-object v3, v7

    goto/16 :goto_0

    .line 167
    :cond_a
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Provider directory is unavailable"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz v3, :cond_b

    .line 161
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    :goto_4
    throw v0

    .line 194
    :cond_c
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 195
    invoke-virtual {p0, v3, v5}, Ll/ۡܶܿ;->֫(Landroid/net/Uri;Z)V

    :cond_d
    return v1
.end method

.method public final ۠֫()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Ll/ۡܶܿ;->ۨ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 52
    :cond_0
    invoke-super {p0}, Ll/ۡ᩸ܿ;->۠֫()Z

    move-result v0

    return v0
.end method

.method public ۤ()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Ll/ۡܶܿ;->ۨ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 44
    :cond_0
    invoke-super {p0}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ۧ(Ljava/io/File;Landroid/net/Uri;Z)V
    .locals 2

    .line 103
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    if-nez p3, :cond_0

    .line 104
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ll/ܳܶܿ;->ܽ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 105
    :goto_0
    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object p3

    .line 106
    invoke-virtual {p3, v0, p1}, Ll/ۘܶܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    .line 107
    invoke-virtual {p2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p2

    const/4 v1, 0x3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 108
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 109
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p3, Ll/ۘܶܿ;->ۧ:Ljava/lang/String;

    .line 0
    invoke-static {p1, v1, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 398
    iget-object v0, p3, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    new-instance p1, Ll/ܽۨܺ;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p3}, Ll/ܽۨܺ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0x1f4

    invoke-static {p1, p3, v0, v1}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    :cond_1
    return-void
.end method

.method public final ۨۧ()Z
    .locals 2

    .line 140
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.android.mtp.documents"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ܳܽ()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Ll/ۡܶܿ;->ۨ:Z

    return v0
.end method

.method public final ܿ()Ll/ۡܶܿ;
    .locals 0

    return-object p0
.end method

.method public ᩶ۧ()V
    .locals 5

    .line 81
    invoke-super {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    .line 82
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 83
    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v2

    .line 403
    iget-object v0, v2, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    monitor-enter v0

    .line 404
    :try_start_0
    iget-object v3, v2, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 405
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 406
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 407
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 410
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    new-instance v0, Ll/ܽۨܺ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2}, Ll/ܽۨܺ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v3, 0x1f4

    invoke-static {v0, v2, v3, v4}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void

    :catchall_0
    move-exception v1

    .line 410
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩹֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩺֫()J
    .locals 2

    .line 125
    iget-boolean v0, p0, Ll/ۡܶܿ;->ۨ:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 68
    :cond_0
    invoke-super {p0}, Ll/ۡ᩸ܿ;->᩺֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩺ۧ()V
    .locals 6

    .line 88
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    .line 89
    invoke-virtual {p0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v1

    iget-object v1, v1, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    const-string v2, "document_id"

    const-string v3, "_display_name"

    .line 90
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-nez v0, :cond_1

    .line 93
    :try_start_0
    invoke-static {p0}, Ll/֨ܶܿ;->֫(Ll/ۡܶܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_0

    .line 90
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 95
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    return-void
.end method
