.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;
.super Ljava/lang/Object;
.source "TransferDBBase.java"


# static fields
.field public static final ܳ:Lcom/amazonaws/logging/Log;

.field public static final ܿ:Ljava/lang/Object;


# instance fields
.field public final ֫:Landroid/net/Uri;

.field public ۧ:Landroid/database/sqlite/SQLiteDatabase;

.field public final ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;

.field public final ᩳ:Landroid/content/UriMatcher;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ܳ:Lcom/amazonaws/logging/Log;

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 57
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;

    invoke-direct {v1, p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;

    .line 58
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    .line 59
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "content://"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/transfers"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫:Landroid/net/Uri;

    .line 60
    new-instance p1, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {p1, v1}, Landroid/content/UriMatcher;-><init>(I)V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ᩳ:Landroid/content/UriMatcher;

    const-string v1, "transfers"

    const/16 v2, 0xa

    .line 65
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v1, "transfers/#"

    const/16 v2, 0x14

    .line 70
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v1, "transfers/part/#"

    const/16 v2, 0x1e

    .line 75
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v1, "transfers/state/*"

    const/16 v2, 0x28

    .line 80
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private ۧ()V
    .locals 2

    .line 274
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 275
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v1

    if-nez v1, :cond_0

    .line 276
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDatabaseHelper;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    .line 278
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Landroid/net/Uri;)I
    .locals 5

    .line 215
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ᩳ:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    .line 217
    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ()V

    const/16 v1, 0xa

    const/4 v2, 0x0

    const-string v3, "awstransfer"

    if-eq v0, v1, :cond_2

    const/16 v1, 0x14

    if-ne v0, v1, :cond_1

    .line 224
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    .line 225
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "_id="

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    return p1

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, " and null"

    .line 0
    invoke-static {v1, p1, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 230
    invoke-virtual {v0, v3, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    return p1

    .line 235
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown URI: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_2
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1, v3, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final declared-synchronized ֫(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    const-string v1, "Unknown URI: "

    const-string v2, "_id="

    const-string v3, "_id="

    move-object v0, p0

    .line 7
    monitor-enter v0

    .line 181
    :try_start_0
    iget-object v4, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ᩳ:Landroid/content/UriMatcher;

    invoke-virtual {v4, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v4

    .line 183
    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ()V

    const/16 v5, 0xa

    if-eq v4, v5, :cond_2

    const/16 v5, 0x14

    if-ne v4, v5, :cond_1

    .line 190
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    .line 191
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 192
    iget-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    const-string p4, "awstransfer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p3, p4, p2, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    .line 195
    :cond_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "awstransfer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 196
    invoke-virtual {v1, v3, p2, p1, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    .line 201
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 186
    :cond_2
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "awstransfer"

    invoke-virtual {p1, v1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 201
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .line 139
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    const-string v1, "awstransfer"

    .line 143
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 144
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ᩳ:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_3

    const/16 v2, 0x14

    if-eq v1, v2, :cond_2

    const/16 v2, 0x1e

    if-eq v1, v2, :cond_1

    const/16 v2, 0x28

    if-ne v1, v2, :cond_0

    const-string v1, "state="

    .line 157
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhere(Ljava/lang/CharSequence;)V

    .line 158
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhereEscapeString(Ljava/lang/String;)V

    goto :goto_0

    .line 161
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unknown URI: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 153
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "main_upload_id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 153
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhere(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 150
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "_id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhere(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    const-string p1, "part_num=0"

    .line 147
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhere(Ljava/lang/CharSequence;)V

    .line 163
    :goto_0
    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ()V

    .line 164
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->ۧ:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Landroid/net/Uri;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫:Landroid/net/Uri;

    return-object v0
.end method
