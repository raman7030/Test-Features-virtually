.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;
.super Ljava/lang/Object;
.source "TransferStatusUpdater.java"

# interfaces
.implements Lcom/amazonaws/event/ProgressListener;


# instance fields
.field public ֫:J

.field public final synthetic ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

.field public final ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;


# direct methods
.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)V
    .locals 0

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    .line 391
    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Lcom/amazonaws/event/ProgressEvent;)V
    .locals 12

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 396
    :try_start_0
    invoke-virtual {p1}, Lcom/amazonaws/event/ProgressEvent;->ۧ()I

    move-result v1

    const/16 v2, 0x20

    if-ne v2, v1, :cond_0

    .line 398
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ()Lcom/amazonaws/logging/Log;

    move-result-object p1

    const-string v1, "Reset Event triggered. Resetting the bytesCurrent to 0."

    invoke-interface {p1, v1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    .line 400
    iput-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->֫:J

    goto :goto_0

    .line 402
    :cond_0
    iget-wide v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->֫:J

    invoke-virtual {p1}, Lcom/amazonaws/event/ProgressEvent;->֫()J

    move-result-wide v3

    add-long v7, v1, v3

    iput-wide v7, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->֫:J

    .line 406
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    iget-wide v1, p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ:J

    cmp-long v3, v7, v1

    if-lez v3, :cond_1

    .line 407
    iput-wide v7, p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ:J

    .line 408
    iget-object v5, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget v6, p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    iget-wide v9, p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    const/4 v11, 0x1

    invoke-virtual/range {v5 .. v11}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(IJJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
