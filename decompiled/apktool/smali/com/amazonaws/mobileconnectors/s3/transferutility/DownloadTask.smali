.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;
.super Ljava/lang/Object;
.source "DownloadTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final ᩳ:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

.field public final ۧ:Lcom/amazonaws/services/s3/AmazonS3;

.field public final ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ᩳ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    .line 61
    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ۧ:Lcom/amazonaws/services/s3/AmazonS3;

    .line 62
    iput-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    return-void
.end method

.method public static ֫(Lcom/amazonaws/services/s3/model/S3ObjectInputStream;Ljava/io/File;)V
    .locals 8

    const-string v0, "got exception"

    .line 180
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ᩳ:Lcom/amazonaws/logging/Log;

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 181
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 182
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 185
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    cmp-long v7, v2, v4

    if-lez v7, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    .line 188
    :try_start_0
    new-instance v4, Ljava/io/BufferedOutputStream;

    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-direct {v4, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 p1, 0x4000

    :try_start_1
    new-array p1, p1, [B

    .line 191
    :goto_1
    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/S3ObjectInputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 192
    invoke-virtual {v4, p1, v6, v2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 204
    :cond_2
    :try_start_2
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 207
    invoke-interface {v1, v0, p1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 211
    :goto_2
    :try_start_3
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception p0

    .line 214
    invoke-interface {v1, v0, p0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_3
    return-void

    :catchall_0
    move-exception p1

    goto :goto_7

    :catch_2
    move-exception p1

    move-object v3, v4

    goto :goto_4

    :catch_3
    move-exception p1

    move-object v3, v4

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_6

    :catch_4
    move-exception p1

    .line 200
    :goto_4
    :try_start_4
    new-instance v2, Lcom/amazonaws/AmazonClientException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to store object contents to disk: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 50
    invoke-direct {v2, v4, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 200
    throw v2

    :catch_5
    move-exception p1

    .line 195
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SocketTimeoutException: Unable to retrieve contents over network: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 197
    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 198
    new-instance v4, Lcom/amazonaws/AmazonClientException;

    .line 50
    invoke-direct {v4, v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_6
    move-object v4, v3

    :goto_7
    if-eqz v4, :cond_3

    .line 204
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_8

    :catch_6
    move-exception v2

    .line 207
    invoke-interface {v1, v0, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_3
    :goto_8
    if-eqz p0, :cond_4

    .line 211
    :try_start_6
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7

    goto :goto_9

    :catch_7
    move-exception p0

    .line 214
    invoke-interface {v1, v0, p0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 216
    :cond_4
    :goto_9
    throw p1
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 29

    move-object/from16 v1, p0

    const-string v2, "]"

    const-string v3, "TransferUtilityException: ["

    const-string v4, "]: Network wasn\'t available."

    .line 71
    sget-object v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ᩳ:Lcom/amazonaws/logging/Log;

    iget-object v6, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget-object v7, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    const-string v8, "Thread:["

    :try_start_0
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 72
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 74
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v9}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 75
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catch Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 78
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 81
    :cond_0
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v9}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 84
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ(I)Lcom/amazonaws/event/ProgressListener;

    move-result-object v9

    const-wide/16 v10, 0x0

    .line 87
    :try_start_1
    new-instance v0, Lcom/amazonaws/services/s3/model/GetObjectRequest;

    iget-object v12, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫:Ljava/lang/String;

    iget-object v13, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۚ:Ljava/lang/String;

    invoke-direct {v0, v12, v13}, Lcom/amazonaws/services/s3/model/GetObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->ۧ(Lcom/amazonaws/AmazonWebServiceRequest;)V

    .line 89
    new-instance v12, Ljava/io/File;

    iget-object v13, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܳ:Ljava/lang/String;

    invoke-direct {v12, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v12}, Ljava/io/File;->length()J

    move-result-wide v13

    cmp-long v15, v13, v10

    if-lez v15, :cond_1

    const-string v10, "Resume transfer %d from %d bytes"

    .line 92
    iget v11, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v21, v2

    const/4 v2, 0x2

    :try_start_2
    new-array v2, v2, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v11, v2, v16

    const/4 v11, 0x1

    aput-object v15, v2, v11

    invoke-static {v10, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    const-wide/16 v10, -0x1

    .line 97
    invoke-virtual {v0, v13, v14, v10, v11}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->֫(JJ)V

    goto :goto_0

    :cond_1
    move-object/from16 v21, v2

    .line 100
    :goto_0
    invoke-virtual {v0, v9}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->֫(Lcom/amazonaws/event/ProgressListener;)V

    .line 102
    iget-object v2, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ۧ:Lcom/amazonaws/services/s3/AmazonS3;

    invoke-interface {v2, v0}, Lcom/amazonaws/services/s3/AmazonS3;->֫(Lcom/amazonaws/services/s3/model/GetObjectRequest;)Lcom/amazonaws/services/s3/model/S3Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 104
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v10, "AmazonS3.getObject returns null"

    invoke-direct {v2, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILjava/lang/Exception;)V

    .line 105
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 106
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_2

    .line 109
    :cond_2
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/S3Object;->ܽ()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩷()J

    move-result-wide v26

    .line 110
    iget-object v2, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget v15, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    const/16 v20, 0x1

    move-wide v10, v13

    move-object v14, v2

    move-wide/from16 v16, v10

    move-wide/from16 v18, v26

    invoke-virtual/range {v14 .. v20}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(IJJZ)V

    .line 111
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/S3Object;->֫()Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

    move-result-object v0

    invoke-static {v0, v12}, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->֫(Lcom/amazonaws/services/s3/model/S3ObjectInputStream;Ljava/io/File;)V

    .line 112
    iget-object v0, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/DownloadTask;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget v2, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    const/16 v28, 0x1

    move-object/from16 v22, v0

    move/from16 v23, v2

    move-wide/from16 v24, v26

    invoke-virtual/range {v22 .. v28}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(IJJZ)V

    .line 113
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 114
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    move-object/from16 v21, v2

    :goto_1
    move-object v2, v0

    .line 117
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۨ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v10, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v10, "Transfer is "

    if-eqz v0, :cond_3

    .line 118
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 120
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_2

    .line 124
    :cond_3
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܰ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-object v11, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v11, 0x20

    if-eqz v0, :cond_4

    .line 125
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۛ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 127
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    .line 128
    invoke-virtual {v0, v11}, Lcom/amazonaws/event/ProgressEvent;->֫(I)V

    .line 129
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    invoke-direct {v0, v2, v3}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    check-cast v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;

    invoke-virtual {v9, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 130
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_2

    .line 140
    :cond_4
    :try_start_3
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 141
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v0

    if-nez v0, :cond_5

    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Thread;->getId()J

    move-result-wide v12

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 147
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    const-string v0, "Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK"

    .line 148
    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 149
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    const-wide/16 v12, 0x0

    invoke-direct {v0, v12, v13}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    .line 150
    invoke-virtual {v0, v11}, Lcom/amazonaws/event/ProgressEvent;->֫(I)V

    .line 151
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    invoke-direct {v0, v12, v13}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    check-cast v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;

    invoke-virtual {v9, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 152
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_3
    .catch Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    move-exception v0

    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v21

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 158
    :cond_5
    invoke-static {v2}, Lcom/amazonaws/retry/RetryUtils;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Transfer is interrupted. "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 160
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 161
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2

    .line 165
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Failed to download: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " due to "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 166
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILjava/lang/Exception;)V

    .line 167
    iget v0, v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v6, v0, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    .line 168
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_2
    return-object v0
.end method
