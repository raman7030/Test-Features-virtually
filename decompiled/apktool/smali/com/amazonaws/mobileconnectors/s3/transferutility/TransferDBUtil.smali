.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;
.super Ljava/lang/Object;
.source "TransferDBUtil.java"


# static fields
.field public static final ֫:Ljava/lang/Object;

.field public static final ۧ:Lcom/amazonaws/logging/Log;

.field public static ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ۧ:Lcom/amazonaws/logging/Log;

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ll/۫ܽۖ;

    invoke-direct {v0}, Ll/۫ܽۖ;-><init>()V

    .line 65
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 66
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    if-nez v1, :cond_0

    .line 67
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-direct {v1, p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    .line 69
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)I
    .locals 6

    .line 226
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "state"

    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 229
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object p0

    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩺:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 232
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۛ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 233
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 234
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 235
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "state not in (?,?,?,?,?) "

    .line 229
    invoke-virtual {p1, p0, v0, v2, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p0

    return p0

    .line 238
    :cond_0
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v0, v1, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)I
    .locals 3

    .line 179
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 180
    iget v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "_id"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 181
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "state"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    iget-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "bytes_total"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 183
    iget-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "bytes_current"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 184
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    iget p0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v0, v2, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)Landroid/database/Cursor;
    .locals 5

    .line 462
    array-length v0, p1

    if-gtz v0, :cond_0

    .line 678
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ۧ:Lcom/amazonaws/logging/Log;

    const-string v2, "Cannot create a string of 0 or less placeholders."

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    const/4 v1, 0x0

    goto :goto_1

    .line 682
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    .line 683
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "?"

    .line 684
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    if-ge v3, v0, :cond_1

    const-string v2, ",?"

    .line 687
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 689
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 465
    :goto_1
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    const/4 v3, 0x0

    const-string v4, "state in ("

    if-ne p0, v2, :cond_2

    const-string p0, ")"

    .line 0
    invoke-static {v4, v1, p0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 468
    new-array v1, v0, [Ljava/lang/String;

    :goto_2
    if-ge v3, v0, :cond_4

    .line 470
    aget-object v2, p1, v3

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    const-string v2, ") and type=?"

    .line 0
    invoke-static {v4, v1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    .line 476
    new-array v2, v2, [Ljava/lang/String;

    :goto_3
    if-ge v3, v0, :cond_3

    .line 478
    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 480
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v2, v3

    move-object p0, v1

    move-object v1, v2

    .line 483
    :cond_4
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0, p0, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILjava/lang/String;)Ljava/util/ArrayList;
    .locals 4

    .line 602
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 605
    :try_start_0
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ۧ(I)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v2, p0, v1, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 606
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 607
    sget-object p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۤ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v2, "state"

    .line 608
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 607
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->֫(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 611
    :cond_0
    new-instance p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;

    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/UploadPartRequest;-><init>()V

    const-string v2, "_id"

    .line 612
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->֫(I)V

    const-string v2, "main_upload_id"

    .line 615
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 614
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    const-string v2, "bucket_name"

    .line 618
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 617
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 616
    invoke-virtual {p0, v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->֫(Ljava/lang/String;)V

    const-string v2, "key"

    .line 619
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۧ(Ljava/lang/String;)V

    .line 620
    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܽ(Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    const-string v3, "file"

    .line 622
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 621
    invoke-virtual {p0, v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->֫(Ljava/io/File;)V

    const-string v2, "file_offset"

    .line 624
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 623
    invoke-virtual {p0, v2, v3}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->֫(J)V

    const-string v2, "part_num"

    .line 626
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 625
    invoke-virtual {p0, v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܽ(I)V

    const-string v2, "bytes_total"

    .line 628
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 627
    invoke-virtual {p0, v2, v3}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۧ(J)V

    const-string v2, "is_last_part"

    .line 630
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 629
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 631
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 635
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 637
    :cond_2
    throw p0
.end method

.method public static ֫(I)V
    .locals 1

    .line 559
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;)I

    return-void
.end method

.method public static ֫(IJ)V
    .locals 2

    .line 195
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "bytes_current"

    .line 196
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 197
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p0, v0, p2, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method public static ۧ(I)Landroid/net/Uri;
    .locals 2

    .line 838
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/part/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(ILjava/lang/String;)V
    .locals 2

    .line 280
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "etag"

    .line 281
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v0, v1, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method public static ܳ(I)Ljava/util/ArrayList;
    .locals 4

    .line 572
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 577
    :try_start_0
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ۧ(I)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v2, p0, v1, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 578
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "part_num"

    .line 579
    invoke-interface {v1, p0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p0

    invoke-interface {v1, p0}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    const-string v2, "etag"

    .line 580
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 581
    new-instance v3, Lcom/amazonaws/services/s3/model/PartETag;

    invoke-direct {v3, p0, v2}, Lcom/amazonaws/services/s3/model/PartETag;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 585
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 587
    :cond_1
    throw p0
.end method

.method public static ܽ(I)Landroid/net/Uri;
    .locals 2

    .line 827
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(ILjava/lang/String;)V
    .locals 2

    .line 267
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "multipart_id"

    .line 268
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v0, v1, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method public static ܿ(I)J
    .locals 5

    const/4 v0, 0x0

    .line 507
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ۧ(I)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v1, p0, v0, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 508
    :cond_0
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "state"

    .line 509
    invoke-interface {v0, p0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p0

    invoke-interface {v0, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 510
    sget-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۤ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->֫(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "bytes_total"

    .line 512
    invoke-interface {v0, p0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p0

    .line 511
    invoke-interface {v0, p0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long/2addr v1, v3

    goto :goto_0

    .line 517
    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-wide v1

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 519
    :cond_2
    throw p0
.end method

.method public static ᩳ(I)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;
    .locals 3

    const/4 v0, 0x0

    .line 494
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;

    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(I)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2, v0, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBBase;->֫(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 863
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 864
    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    invoke-direct {v0, p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;-><init>(I)V

    .line 865
    invoke-virtual {v0, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫(Landroid/database/Cursor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 869
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p0

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 871
    :cond_1
    throw p0
.end method
