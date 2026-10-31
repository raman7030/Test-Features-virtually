.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;
.super Ljava/lang/Object;
.source "TransferRecord.java"


# static fields
.field public static final ۛ:Lcom/amazonaws/logging/Log;


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫:Ljava/lang/String;

.field public ۖ:Ljava/lang/String;

.field public ۗ:Ljava/util/concurrent/Future;

.field public ۘ:Ljava/lang/String;

.field public ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public ۚ:Ljava/lang/String;

.field public ۜ:Ll/۫ܽۖ;

.field public ۠:Ljava/lang/String;

.field public ۡ:Ljava/lang/String;

.field public ۢ:Ljava/lang/String;

.field public ۤ:Ljava/util/Map;

.field public ۧ:J

.field public ۫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

.field public ۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

.field public ܳ:Ljava/lang/String;

.field public ܶ:Ljava/lang/String;

.field public ܺ:Ljava/lang/String;

.field public ܽ:J

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:Ljava/lang/String;

.field public ᩷:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:Ljava/lang/String;

.field public ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۛ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ll/۫ܽۖ;

    invoke-direct {v0}, Ll/۫ܽۖ;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۜ:Ll/۫ܽۖ;

    .line 101
    iput p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[id:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    iget v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",bucketName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",key:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۚ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",file:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",bytesTotal:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    iget-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",bytesCurrent:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    iget-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",fileOffset:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    iget-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩻:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",state:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",cannedAcl:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",mainUploadId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    iget v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֨:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",isMultipart:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    iget v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֡:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",isLastPart:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    iget v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩵:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",partNumber:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    iget v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",multipartId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܶ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",eTag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",storageClass:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۖ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",userMetadata:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۤ:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",transferUtilityOptions:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۜ:Ll/۫ܽۖ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v1, :cond_0

    .line 822
    sget-object v1, Ll/۟ܽۖ;->֫:Ll/۟ܽۖ;

    .line 964
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 979
    :try_start_0
    invoke-static {v3}, Ll/᩵ܿۖ;->֫(Ljava/lang/StringBuilder;)Ljava/io/Writer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/۫ܽۖ;->֫(Ljava/io/Writer;)Ll/᩻ۜۖ;

    move-result-object v4

    .line 980
    invoke-virtual {v2, v1, v4}, Ll/۫ܽۖ;->֫(Ll/᩺ܽۖ;Ll/᩻ۜۖ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 966
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 982
    new-instance v1, Ll/ܰܽۖ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 982
    throw v1

    .line 824
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    .line 846
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 897
    :try_start_1
    invoke-static {v4}, Ll/᩵ܿۖ;->֫(Ljava/lang/StringBuilder;)Ljava/io/Writer;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/۫ܽۖ;->֫(Ljava/io/Writer;)Ll/᩻ۜۖ;

    move-result-object v5

    .line 898
    invoke-virtual {v2, v1, v3, v5}, Ll/۫ܽۖ;->֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻ۜۖ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 848
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v0

    .line 900
    new-instance v1, Ll/ܰܽۖ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 900
    throw v1
.end method

.method public final ֫(Landroid/database/Cursor;)V
    .locals 3

    const-string v0, "_id"

    .line 110
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    const-string v0, "main_upload_id"

    .line 111
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֨:I

    const-string v0, "type"

    .line 113
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 112
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->֫(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    const-string v0, "state"

    .line 115
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 114
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->֫(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v0, "bucket_name"

    .line 116
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫:Ljava/lang/String;

    const-string v0, "key"

    .line 117
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۚ:Ljava/lang/String;

    const-string v0, "version_id"

    .line 118
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    const-string v0, "bytes_total"

    .line 119
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    const-string v0, "bytes_current"

    .line 120
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ:J

    const-string v0, "speed"

    .line 121
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    const-string v0, "is_requester_pays"

    .line 123
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 122
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    const-string v0, "is_multipart"

    .line 124
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֡:I

    const-string v0, "is_last_part"

    .line 125
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩵:I

    const-string v0, "is_encrypted"

    .line 126
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    const-string v0, "part_num"

    .line 127
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩸:I

    const-string v0, "etag"

    .line 128
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܿ:Ljava/lang/String;

    const-string v0, "file"

    .line 129
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܳ:Ljava/lang/String;

    const-string v0, "multipart_id"

    .line 130
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܶ:Ljava/lang/String;

    const-string v0, "range_start"

    .line 132
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    const-string v0, "range_last"

    .line 133
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    const-string v0, "file_offset"

    .line 134
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩻:J

    const-string v0, "header_content_type"

    .line 136
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 135
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܺ:Ljava/lang/String;

    const-string v0, "header_content_language"

    .line 138
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 137
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    const-string v0, "header_content_disposition"

    .line 140
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 139
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۢ:Ljava/lang/String;

    const-string v0, "header_content_encoding"

    .line 142
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 141
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۡ:Ljava/lang/String;

    const-string v0, "header_cache_control"

    .line 144
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 143
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩷:Ljava/lang/String;

    const-string v0, "header_expire"

    .line 146
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 145
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    const-string v0, "user_metadata"

    .line 148
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 147
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/util/json/JsonUtils;->֫(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۤ:Ljava/util/Map;

    const-string v0, "expiration_time_rule_id"

    .line 150
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 149
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    const-string v0, "http_expires_date"

    .line 152
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 151
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۘ:Ljava/lang/String;

    const-string v0, "sse_algorithm"

    .line 154
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩹:Ljava/lang/String;

    const-string v0, "kms_key"

    .line 155
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩶:Ljava/lang/String;

    const-string v0, "content_md5"

    .line 156
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۠:Ljava/lang/String;

    const-string v0, "canned_acl"

    .line 157
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩳ:Ljava/lang/String;

    const-string v0, "header_storage_class"

    .line 159
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۖ:Ljava/lang/String;

    const-string v0, "transfer_utility_options"

    .line 161
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 160
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 163
    :try_start_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۜ:Ll/۫ܽۖ;

    invoke-virtual {v0, p1}, Ll/۫ܽۖ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;
    :try_end_0
    .catch Ll/ܳᩳۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to deserialize: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", setting to default"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۛ:Lcom/amazonaws/logging/Log;

    invoke-interface {v1, p1, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 166
    new-instance p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    invoke-direct {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Landroid/net/ConnectivityManager;)V
    .locals 2

    .line 186
    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 329
    iget v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩸:I

    if-nez v0, :cond_1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 188
    invoke-virtual {p0, p3, p4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Landroid/net/ConnectivityManager;)Z

    move-result p4

    if-eqz p4, :cond_1

    .line 189
    iget-object p4, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-virtual {p4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 190
    new-instance p2, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;

    invoke-direct {p2, p0, p1, p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;)V

    .line 191
    invoke-static {p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->֫(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۗ:Ljava/util/concurrent/Future;

    goto :goto_0

    .line 193
    :cond_0
    new-instance p4, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    invoke-direct {p4, p0, p1, p2, p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;)V

    .line 194
    invoke-static {p4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->֫(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۗ:Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 300
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۗ:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Landroid/net/ConnectivityManager;)Z
    .locals 1

    if-nez p2, :cond_0

    goto :goto_0

    .line 375
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    if-eqz v0, :cond_1

    .line 171
    iget-object v0, v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    if-eqz v0, :cond_1

    .line 375
    invoke-virtual {v0, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->֫(Landroid/net/ConnectivityManager;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 379
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Network Connection "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    .line 171
    iget-object v0, v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    .line 379
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is not available."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۛ:Lcom/amazonaws/logging/Log;

    invoke-interface {v0, p2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 380
    iget p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {p1, p2, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Landroid/net/ConnectivityManager;)Z
    .locals 0

    .line 236
    invoke-virtual {p0, p1, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Landroid/net/ConnectivityManager;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 238
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 323
    sget-object p2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    sget-object p2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 324
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    sget-object p2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 325
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 239
    :cond_0
    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫()Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    .line 240
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۗ:Ljava/util/concurrent/Future;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    return p2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
