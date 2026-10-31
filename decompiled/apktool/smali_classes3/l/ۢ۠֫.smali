.class public final Ll/ۢ۠֫;
.super Ljava/lang/Object;
.source "L73P"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.database"

    .line 41
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I
    .locals 13

    .line 157
    :try_start_0
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v0, "ExoPlayerVersions"

    const-string v1, "sqlite_master"

    const-string v2, "tbl_name = ?"

    .line 3550
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 3551
    invoke-static {p0, v1, v2, v0}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-lez v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, -0x1

    if-nez v0, :cond_1

    return v1

    :cond_1
    const-string v6, "ExoPlayerVersions"

    const-string v0, "version"

    .line 160
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "feature = ? AND instance_uid = ?"

    .line 181
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v5, p0

    .line 161
    invoke-virtual/range {v5 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_2

    .line 174
    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    return v1

    .line 172
    :cond_2
    :try_start_3
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    .line 173
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    :try_start_4
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_0

    return p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_3

    .line 160
    :try_start_5
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw p1
    :try_end_6
    .catch Landroid/database/SQLException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 176
    new-instance p1, Ll/ۜ۠֫;

    .line 27
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 176
    throw p1
.end method

.method public static ۧ(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)V
    .locals 2

    :try_start_0
    const-string v0, "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))"

    .line 109
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 110
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "feature"

    .line 111
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string p1, "instance_uid"

    .line 112
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "version"

    const/4 p2, 0x1

    .line 113
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string p1, "ExoPlayerVersions"

    const/4 p2, 0x0

    .line 114
    invoke-virtual {p0, p1, p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 116
    new-instance p1, Ll/ۜ۠֫;

    .line 27
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 116
    throw p1
.end method
