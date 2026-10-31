.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferTable;
.super Ljava/lang/Object;
.source "TransferTable.java"


# direct methods
.method public static ֫(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x2

    if-ge p1, v0, :cond_0

    if-lt p2, v0, :cond_0

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN user_metadata text;"

    .line 301
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN expiration_time_rule_id text;"

    .line 302
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN http_expires_date text;"

    .line 303
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN sse_algorithm text;"

    .line 304
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN content_md5 text;"

    .line 305
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x3

    if-ge p1, v0, :cond_1

    if-lt p2, v0, :cond_1

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN kms_key text;"

    .line 314
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x4

    if-ge p1, v0, :cond_2

    if-lt p2, v0, :cond_2

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN canned_acl text;"

    .line 323
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x5

    if-ge p1, v0, :cond_3

    if-lt p2, v0, :cond_3

    const-string v0, "ALTER TABLE awstransfer ADD COLUMN header_storage_class text;"

    .line 332
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_3
    const/4 v0, 0x6

    if-ge p1, v0, :cond_4

    if-lt p2, v0, :cond_4

    const-string p1, "ALTER TABLE awstransfer ADD COLUMN transfer_utility_options text;"

    .line 341
    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_4
    return-void
.end method
