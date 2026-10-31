.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;
.super Ljava/lang/Object;
.source "UploadPartTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final ܳ:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

.field public final ۧ:Lcom/amazonaws/services/s3/AmazonS3;

.field public final ܽ:Lcom/amazonaws/services/s3/model/UploadPartRequest;

.field public final ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;

.field public final ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܳ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;Lcom/amazonaws/services/s3/model/UploadPartRequest;Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    .line 47
    new-instance p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;

    invoke-direct {p1, p0, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;)V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;

    .line 48
    iput-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܽ:Lcom/amazonaws/services/s3/model/UploadPartRequest;

    .line 49
    iput-object p4, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ۧ:Lcom/amazonaws/services/s3/AmazonS3;

    .line 50
    iput-object p5, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    return-void
.end method

.method public static synthetic ֫()Lcom/amazonaws/logging/Log;
    .locals 1

    .line 31
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܳ:Lcom/amazonaws/logging/Log;

    return-object v0
.end method

.method public static synthetic ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;)Lcom/amazonaws/services/s3/model/UploadPartRequest;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܽ:Lcom/amazonaws/services/s3/model/UploadPartRequest;

    return-object p0
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 15

    .line 58
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܳ:Lcom/amazonaws/logging/Log;

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ᩳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    iput-object v2, v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 59
    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܽ:Lcom/amazonaws/services/s3/model/UploadPartRequest;

    iget-object v4, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;

    invoke-virtual {v2, v4}, Lcom/amazonaws/AmazonWebServiceRequest;->֫(Lcom/amazonaws/event/ProgressListener;)V

    const/4 v5, 0x1

    const/4 v6, 0x1

    :goto_0
    const/16 v7, 0x20

    const-wide/16 v8, 0x0

    .line 63
    :try_start_0
    iget-object v10, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->ۧ:Lcom/amazonaws/services/s3/AmazonS3;

    invoke-interface {v10, v2}, Lcom/amazonaws/services/s3/AmazonS3;->֫(Lcom/amazonaws/services/s3/model/UploadPartRequest;)Lcom/amazonaws/services/s3/model/UploadPartResult;

    move-result-object v10

    .line 64
    sget-object v11, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۤ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 111
    iput-object v11, v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 112
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܳ()I

    move-result v12

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12, v11}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)I

    .line 65
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܳ()I

    move-result v11

    invoke-virtual {v10}, Lcom/amazonaws/services/s3/model/UploadPartResult;->ᩳ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v10}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ۧ(ILjava/lang/String;)V

    .line 66
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Lcom/amazonaws/AbortedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception v10

    .line 73
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Unexpected error occurred: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v1, v11}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 116
    new-instance v11, Lcom/amazonaws/event/ProgressEvent;

    invoke-direct {v11, v8, v9}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    .line 117
    invoke-virtual {v11, v7}, Lcom/amazonaws/event/ProgressEvent;->֫(I)V

    .line 118
    invoke-virtual {v4, v11}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 78
    :try_start_1
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 79
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v7

    invoke-virtual {v7}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v7

    if-nez v7, :cond_0

    .line 80
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Thread: ["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Thread;->getId()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "]: Network wasn\'t available."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 85
    sget-object v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iput-object v7, v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 86
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܳ()I

    move-result v8

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v7}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)I

    const-string v7, "Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK"

    .line 87
    invoke-interface {v1, v7}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 89
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catch Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    :catch_1
    move-exception v7

    .line 92
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "TransferUtilityException: ["

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "]"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    :cond_0
    const/4 v7, 0x3

    if-ge v6, v7, :cond_1

    shl-int v7, v5, v6

    int-to-long v7, v7

    const-wide/16 v11, 0x3e8

    mul-long v7, v7, v11

    const-wide v11, 0x408f400000000000L    # 1000.0

    .line 155
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v13

    mul-double v13, v13, v11

    double-to-long v11, v13

    add-long/2addr v7, v11

    .line 103
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v11, "Retrying in "

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, " ms."

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v1, v9}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 104
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v7, v8}, Ljava/util/concurrent/TimeUnit;->sleep(J)V

    .line 105
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Retry attempt: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6, v10}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    move v6, v8

    goto/16 :goto_0

    .line 96
    :cond_1
    sget-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 111
    iput-object v4, v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 112
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܳ()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)I

    const-string v0, "Encountered error uploading part "

    .line 97
    invoke-interface {v1, v0, v10}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 98
    throw v10

    :catch_2
    const-string v0, "Upload part aborted."

    .line 69
    invoke-interface {v1, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 116
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    invoke-direct {v0, v8, v9}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    .line 117
    invoke-virtual {v0, v7}, Lcom/amazonaws/event/ProgressEvent;->֫(I)V

    .line 118
    invoke-virtual {v4, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 71
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    return-object v0
.end method
