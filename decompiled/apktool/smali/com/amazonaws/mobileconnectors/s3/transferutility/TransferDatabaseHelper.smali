.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "TransferDatabaseHelper.java"


# instance fields
.field public final ᩸:Landroid/content/Context;

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "awss3transfertable.db"

    const/4 v1, 0x0

    const/4 v2, 0x6

    .line 38
    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 39
    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;->᩸:Landroid/content/Context;

    .line 40
    iput v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;->᩹:I

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "create table awstransfer(_id integer primary key autoincrement, main_upload_id integer, type text not null, state text not null, bucket_name text not null, key text not null, version_id text, bytes_total bigint, bytes_current bigint, speed bigint, is_requester_pays integer, is_encrypted integer, file text not null, file_offset bigint, is_multipart int, part_num int not null, is_last_part integer, multipart_id text, etag text, range_start bigint, range_last bigint, header_content_type text, header_content_language text, header_content_disposition text, header_content_encoding text, header_cache_control text, header_expire text);"

    .line 250
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 251
    iget v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;->᩹:I

    invoke-static {p1, v0, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferTable;->֫(Landroid/database/sqlite/SQLiteDatabase;II)V

    return-void
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 55
    iget-object p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;->᩸:Landroid/content/Context;

    const-string p3, "awss3transfertable.db"

    invoke-virtual {p2, p3}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 56
    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 50
    invoke-static {p1, p2, p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferTable;->֫(Landroid/database/sqlite/SQLiteDatabase;II)V

    return-void
.end method
