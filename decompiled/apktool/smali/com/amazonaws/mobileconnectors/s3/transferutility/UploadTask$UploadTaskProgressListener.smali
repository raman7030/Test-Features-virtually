.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;
.super Ljava/lang/Object;
.source "UploadTask.java"

# interfaces
.implements Lcom/amazonaws/event/ProgressListener;


# instance fields
.field public final ֫:J

.field public ۧ:J

.field public final synthetic ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;


# direct methods
.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;J)V
    .locals 0

    .line 502
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    .line 503
    iput-wide p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ۧ:J

    .line 504
    iput-wide p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->֫:J

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(IJ)V
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 514
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    iget-object v1, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܳ:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    if-nez p1, :cond_0

    .line 516
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫()Lcom/amazonaws/logging/Log;

    move-result-object p1

    const-string p2, "Update received for unknown part. Ignoring."

    invoke-interface {p1, p2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 517
    monitor-exit v0

    return-void

    .line 520
    :cond_0
    :try_start_1
    iput-wide p2, p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->֫:J

    .line 522
    iget-wide p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->֫:J

    .line 523
    iget-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    iget-object p3, p3, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 524
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;

    iget-wide v1, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadPartTaskMetadata;->֫:J

    add-long/2addr p1, v1

    goto :goto_0

    .line 530
    :cond_1
    iget-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ۧ:J

    cmp-long p3, p1, v1

    if-lez p3, :cond_2

    iget-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    .line 531
    invoke-static {p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    move-result-object p3

    iget-wide v1, p3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    cmp-long p3, p1, v1

    if-gtz p3, :cond_2

    .line 532
    iget-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    invoke-static {p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->ۧ(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    move-result-object v1

    iget-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    invoke-static {p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    move-result-object p3

    iget v2, p3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    iget-object p3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;

    .line 534
    invoke-static {p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    move-result-object p3

    iget-wide v5, p3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    const/4 v7, 0x1

    move-wide v3, p1

    .line 532
    invoke-virtual/range {v1 .. v7}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(IJJZ)V

    .line 536
    iput-wide p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->ۧ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 538
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(Lcom/amazonaws/event/ProgressEvent;)V
    .locals 0

    return-void
.end method
