.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;
.super Ljava/lang/Object;
.source "UploadTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final ۜ:Lcom/amazonaws/logging/Log;

.field public static final ᩻:Ljava/util/HashMap;


# instance fields
.field public final ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

.field public ۧ:Ljava/util/ArrayList;

.field public ܳ:Ljava/util/HashMap;

.field public final ܽ:Lcom/amazonaws/services/s3/AmazonS3;

.field public final ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

.field public final ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 61
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۜ:Lcom/amazonaws/logging/Log;

    .line 483
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->᩻:Ljava/util/HashMap;

    .line 484
    invoke-static {}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->values()[Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 485
    sget-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->᩻:Ljava/util/HashMap;

    invoke-virtual {v3}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    .line 79
    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܽ:Lcom/amazonaws/services/s3/AmazonS3;

    .line 80
    iput-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    .line 81
    iput-object p4, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    .line 82
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܳ:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic ֫()Lcom/amazonaws/logging/Log;
    .locals 1

    .line 59
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۜ:Lcom/amazonaws/logging/Log;

    return-object v0
.end method

.method public static synthetic ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    return-object p0
.end method

.method public static ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)Lcom/amazonaws/services/s3/model/PutObjectRequest;
    .locals 11

    .line 403
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܳ:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 404
    new-instance v1, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫:Ljava/lang/String;

    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۚ:Ljava/lang/String;

    .line 111
    invoke-direct {v1, v0, v2, v3}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    new-instance v2, Lcom/amazonaws/services/s3/model/ObjectMetadata;

    invoke-direct {v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;-><init>()V

    .line 408
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(J)V

    .line 410
    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩷:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 411
    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/lang/String;)V

    .line 413
    :cond_0
    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۢ:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 414
    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܳ(Ljava/lang/String;)V

    .line 416
    :cond_1
    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۡ:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 417
    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩻(Ljava/lang/String;)V

    .line 419
    :cond_2
    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܺ:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 420
    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩷(Ljava/lang/String;)V

    goto :goto_0

    .line 422
    :cond_3
    invoke-static {}, Lcom/amazonaws/services/s3/util/Mimetypes;->֫()Lcom/amazonaws/services/s3/util/Mimetypes;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/amazonaws/services/s3/util/Mimetypes;->֫(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩷(Ljava/lang/String;)V

    .line 424
    :goto_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۖ:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 425
    invoke-virtual {v1, v0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۧ(Ljava/lang/String;)V

    .line 430
    :cond_4
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 431
    new-instance v0, Ljava/util/Date;

    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۘ:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܽ(Ljava/util/Date;)V

    .line 433
    :cond_5
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩹:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 434
    invoke-virtual {v2, v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ᩳ(Ljava/lang/String;)V

    .line 436
    :cond_6
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۤ:Ljava/util/Map;

    if-eqz v0, :cond_a

    .line 437
    invoke-virtual {v2, v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/util/Map;)V

    .line 439
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۤ:Ljava/util/Map;

    const-string v3, "x-amz-tagging"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_8

    :try_start_0
    const-string v3, "&"

    .line 442
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 443
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 444
    array-length v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_7

    aget-object v7, v0, v6

    const-string v8, "="

    .line 445
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 446
    new-instance v8, Lcom/amazonaws/services/s3/model/Tag;

    aget-object v9, v7, v5

    const/4 v10, 0x1

    aget-object v7, v7, v10

    invoke-direct {v8, v9, v7}, Lcom/amazonaws/services/s3/model/Tag;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 448
    :cond_7
    new-instance v0, Lcom/amazonaws/services/s3/model/ObjectTagging;

    invoke-direct {v0, v3}, Lcom/amazonaws/services/s3/model/ObjectTagging;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {v1, v0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->֫(Lcom/amazonaws/services/s3/model/ObjectTagging;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 450
    sget-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۜ:Lcom/amazonaws/logging/Log;

    const-string v4, "Error in passing the object tags as request headers."

    invoke-interface {v3, v4, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 454
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۤ:Ljava/util/Map;

    const-string v3, "x-amz-website-redirect-location"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 456
    invoke-virtual {v1, v0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->֫(Ljava/lang/String;)V

    .line 459
    :cond_9
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۤ:Ljava/util/Map;

    const-string v3, "x-amz-request-payer"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_a

    const-string v3, "requester"

    .line 461
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->֫(Z)V

    .line 464
    :cond_a
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->۠:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 465
    invoke-virtual {v2, v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۜ(Ljava/lang/String;)V

    .line 467
    :cond_b
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩶:Ljava/lang/String;

    if-eqz v0, :cond_c

    .line 468
    new-instance v3, Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    invoke-direct {v3, v0}, Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;-><init>(Ljava/lang/String;)V

    .line 469
    invoke-virtual {v1, v3}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->֫(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)V

    .line 472
    :cond_c
    invoke-virtual {v1, v2}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->֫(Lcom/amazonaws/services/s3/model/ObjectMetadata;)V

    .line 473
    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩳ:Ljava/lang/String;

    if-nez p0, :cond_d

    const/4 p0, 0x0

    goto :goto_3

    .line 490
    :cond_d
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 473
    :goto_3
    invoke-virtual {v1, p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->֫(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)V

    return-object v1
.end method

.method private ֫(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Ljava/lang/String;
    .locals 3

    .line 383
    new-instance v0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;

    .line 384
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܿ()Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->֫(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)V

    .line 386
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩷()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v1

    .line 368
    iput-object v1, v0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->۬:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    .line 388
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۡ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    move-result-object v1

    .line 387
    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->֫(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)V

    .line 389
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۖ()Lcom/amazonaws/services/s3/model/ObjectTagging;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->֫(Lcom/amazonaws/services/s3/model/ObjectTagging;)V

    .line 391
    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫(Lcom/amazonaws/AmazonWebServiceRequest;)V

    .line 392
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܽ:Lcom/amazonaws/services/s3/AmazonS3;

    invoke-interface {p1, v0}, Lcom/amazonaws/services/s3/AmazonS3;->֫(Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;)Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;->ᩳ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic ۧ(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    return-object p0
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    const-string v2, "Network not connected. Setting the state to WAITING_FOR_NETWORK."

    const-string v3, "]"

    const-string v4, "TransferUtilityException: ["

    .line 91
    iget-object v5, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    iget-object v6, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    sget-object v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۜ:Lcom/amazonaws/logging/Log;

    :try_start_0
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 92
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-interface {v7, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 94
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v8, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v8}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 95
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catch Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 98
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 101
    :cond_0
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v8, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v8}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 102
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֡:I

    const-string v8, "Transfer is interrupted. "

    const-wide/16 v9, 0x0

    const-string v11, " due to "

    iget-object v15, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܽ:Lcom/amazonaws/services/s3/AmazonS3;

    const-string v14, "Transfer is "

    const/4 v12, 0x1

    if-ne v0, v12, :cond_e

    iget v12, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->᩸:I

    if-nez v12, :cond_e

    .line 126
    iget-object v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܶ:Ljava/lang/String;

    iget-object v12, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 144
    :cond_1
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܿ(I)J

    move-result-wide v16

    cmp-long v0, v16, v9

    if-lez v0, :cond_2

    .line 146
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    .line 147
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/Object;

    const/16 v18, 0x0

    aput-object v0, v13, v18

    aput-object v9, v13, v10

    const-string v0, "Resume transfer %d from %d bytes"

    .line 146
    invoke-static {v0, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    :cond_2
    move-wide/from16 v9, v16

    goto :goto_1

    .line 127
    :cond_3
    :goto_0
    invoke-static {v5}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)Lcom/amazonaws/services/s3/model/PutObjectRequest;

    move-result-object v0

    .line 128
    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫(Lcom/amazonaws/AmazonWebServiceRequest;)V

    .line 130
    :try_start_1
    invoke-direct {v1, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܶ:Ljava/lang/String;
    :try_end_1
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_1 .. :try_end_1} :catch_7

    .line 138
    iget v13, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܽ(ILjava/lang/String;)V

    .line 150
    :goto_1
    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;

    invoke-direct {v0, v1, v9, v10}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;J)V

    .line 151
    iget v13, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    move-object/from16 v24, v14

    move-object/from16 v23, v15

    iget-wide v14, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    const/16 v22, 0x0

    move-object/from16 v25, v8

    iget-object v8, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    move-object/from16 v16, v8

    move/from16 v17, v13

    move-wide/from16 v18, v9

    move-wide/from16 v20, v14

    invoke-virtual/range {v16 .. v22}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(IJJZ)V

    .line 153
    iget v8, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    iget-object v9, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܶ:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v9}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(ILjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۧ:Ljava/util/ArrayList;

    .line 155
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Multipart upload "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v9, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " in "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " parts."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 156
    iget-object v8, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    iget-object v10, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܳ:Ljava/util/HashMap;

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, Lcom/amazonaws/services/s3/model/UploadPartRequest;

    .line 157
    invoke-static {v15}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫(Lcom/amazonaws/AmazonWebServiceRequest;)V

    .line 159
    new-instance v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    .line 542
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    const-wide/16 v12, 0x0

    .line 161
    iput-wide v12, v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->֫:J

    .line 162
    sget-object v12, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۧ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iput-object v12, v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 163
    invoke-virtual {v15}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۢ()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    new-instance v10, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;

    iget-object v14, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    move-object v12, v10

    move-object v13, v9

    move-object/from16 v18, v8

    move-object/from16 v17, v14

    move-object/from16 v8, v24

    move-object v14, v0

    move-object/from16 v19, v23

    move-object/from16 v16, v19

    invoke-direct/range {v12 .. v17}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;Lcom/amazonaws/services/s3/model/UploadPartRequest;Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;)V

    invoke-static {v10}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->֫(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v10

    iput-object v10, v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ܽ:Ljava/util/concurrent/Future;

    move-object/from16 v8, v18

    goto :goto_2

    :cond_4
    move-object/from16 v19, v23

    move-object/from16 v8, v24

    const/4 v9, 0x1

    .line 174
    :try_start_2
    invoke-virtual {v10}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v12, 0x1

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    .line 177
    iget-object v13, v13, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ܽ:Ljava/util/concurrent/Future;

    invoke-interface {v13}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    and-int/2addr v12, v13

    goto :goto_3

    :cond_5
    if-nez v12, :cond_6

    .line 182
    :try_start_3
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 183
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v0

    if-nez v0, :cond_6

    .line 184
    invoke-interface {v7, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 185
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v12, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v12}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 186
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_3
    .catch Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    goto/16 :goto_7

    :catch_1
    move-exception v0

    .line 189
    :try_start_4
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 255
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Completing the multi-part upload transfer for "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 257
    :try_start_5
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    iget-object v2, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫:Ljava/lang/String;

    iget-object v3, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۚ:Ljava/lang/String;

    iget-object v4, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܶ:Ljava/lang/String;

    .line 354
    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ܳ(I)Ljava/util/ArrayList;

    move-result-object v0

    .line 355
    new-instance v8, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;

    invoke-direct {v8, v2, v3, v4, v0}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 357
    invoke-static {v8}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫(Lcom/amazonaws/AmazonWebServiceRequest;)V
    :try_end_5
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_5 .. :try_end_5} :catch_3

    move-object/from16 v2, v19

    .line 358
    :try_start_6
    invoke-interface {v2, v8}, Lcom/amazonaws/services/s3/AmazonS3;->֫(Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;)Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    .line 259
    iget-object v12, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget v13, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    iget-wide v3, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    const/16 v18, 0x1

    move-wide v14, v3

    move-wide/from16 v16, v3

    invoke-virtual/range {v12 .. v18}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(IJJZ)V

    .line 260
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 261
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_6
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_6 .. :try_end_6} :catch_2

    goto/16 :goto_7

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    move-object/from16 v2, v19

    :goto_4
    move-object v3, v0

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Failed to complete multipart: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 263
    invoke-interface {v7, v0, v3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 265
    iget v4, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    iget-object v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫:Ljava/lang/String;

    iget-object v8, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۚ:Ljava/lang/String;

    iget-object v9, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܶ:Ljava/lang/String;

    const-string v10, "Successfully aborted multipart upload: "

    const-string v11, "Aborting the multipart since complete multipart failed."

    .line 362
    invoke-interface {v7, v11}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 365
    :try_start_7
    new-instance v11, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;

    invoke-direct {v11, v0, v8, v9}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v11}, Lcom/amazonaws/services/s3/AmazonS3;->֫(Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;)V

    .line 370
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V
    :try_end_7
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_5

    :catch_4
    move-exception v0

    .line 372
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v8, "Failed to abort the multipart upload: "

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v2, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 267
    :goto_5
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v0, v3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILjava/lang/Exception;)V

    .line 268
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 269
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :catch_5
    move-exception v0

    move-object v12, v0

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v13, "Upload resulted in an exception. "

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 200
    invoke-virtual {v10}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    .line 201
    iget-object v13, v13, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ܽ:Ljava/util/concurrent/Future;

    invoke-interface {v13, v9}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_6

    .line 207
    :cond_7
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۨ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v9, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 208
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 210
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    .line 213
    :cond_8
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܰ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v9, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 214
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۛ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 216
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    .line 221
    :cond_9
    invoke-virtual {v10}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    .line 222
    sget-object v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v8, v8, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const-string v0, "Individual part is WAITING_FOR_NETWORK."

    .line 223
    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 224
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v0, v9}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 225
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    .line 230
    :cond_b
    :try_start_8
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 231
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v0

    if-nez v0, :cond_c

    .line 232
    invoke-interface {v7, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 233
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 234
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_8
    .catch Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException; {:try_start_8 .. :try_end_8} :catch_6

    goto/16 :goto_7

    :catch_6
    move-exception v0

    .line 237
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 241
    :cond_c
    invoke-static {v12}, Lcom/amazonaws/retry/RetryUtils;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v9, v25

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 243
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 244
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    .line 248
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error encountered during multi-part upload: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 248
    invoke-interface {v7, v0, v12}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 250
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v0, v12}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILjava/lang/Exception;)V

    .line 251
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 252
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :catch_7
    move-exception v0

    .line 132
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error initiating multipart upload: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 132
    invoke-interface {v7, v2, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 134
    iget v2, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v2, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILjava/lang/Exception;)V

    .line 135
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 136
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :cond_e
    move-object v9, v8

    move-object v8, v14

    move-object v2, v15

    if-nez v0, :cond_13

    const-string v10, "Thread:["

    .line 274
    invoke-static {v5}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)Lcom/amazonaws/services/s3/model/PutObjectRequest;

    move-result-object v0

    .line 275
    iget v12, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v12}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ(I)Lcom/amazonaws/event/ProgressListener;

    move-result-object v12

    .line 277
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܶۧ()Ljava/io/File;

    move-result-object v13

    invoke-virtual {v13}, Ljava/io/File;->length()J

    move-result-wide v18

    .line 278
    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->ۧ(Lcom/amazonaws/AmazonWebServiceRequest;)V

    .line 279
    invoke-virtual {v0, v12}, Lcom/amazonaws/AmazonWebServiceRequest;->֫(Lcom/amazonaws/event/ProgressListener;)V

    .line 282
    :try_start_9
    invoke-interface {v2, v0}, Lcom/amazonaws/services/s3/AmazonS3;->֫(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Lcom/amazonaws/services/s3/model/PutObjectResult;

    .line 283
    iget-object v14, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget v15, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    const/16 v20, 0x1

    move-wide/from16 v16, v18

    invoke-virtual/range {v14 .. v20}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(IJJZ)V

    .line 284
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 285
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    goto/16 :goto_7

    :catch_8
    move-exception v0

    move-object v2, v0

    .line 288
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۨ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v13, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 289
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 290
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 291
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    .line 295
    :cond_f
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܰ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v13, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v13, 0x20

    if-eqz v0, :cond_10

    .line 296
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۛ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 298
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    .line 299
    invoke-virtual {v0, v13}, Lcom/amazonaws/event/ProgressEvent;->֫(I)V

    .line 300
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    invoke-direct {v0, v2, v3}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    check-cast v12, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;

    invoke-virtual {v12, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 301
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    .line 311
    :cond_10
    :try_start_a
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 312
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v0

    if-nez v0, :cond_11

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Thread;->getId()J

    move-result-wide v14

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "]: Network wasn\'t available."

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 318
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v8, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v8}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    const-string v0, "Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK"

    .line 319
    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 320
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    const-wide/16 v14, 0x0

    invoke-direct {v0, v14, v15}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    .line 321
    invoke-virtual {v0, v13}, Lcom/amazonaws/event/ProgressEvent;->֫(I)V

    .line 322
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    invoke-direct {v0, v14, v15}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    check-cast v12, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;

    invoke-virtual {v12, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 323
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_a
    .catch Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException; {:try_start_a .. :try_end_a} :catch_9

    goto :goto_7

    :catch_9
    move-exception v0

    .line 326
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 329
    :cond_11
    invoke-static {v2}, Lcom/amazonaws/retry/RetryUtils;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 331
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 332
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_7

    .line 336
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Failed to upload: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 337
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILjava/lang/Exception;)V

    .line 338
    iget v0, v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 339
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_7

    .line 116
    :cond_13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_7
    return-object v0
.end method
