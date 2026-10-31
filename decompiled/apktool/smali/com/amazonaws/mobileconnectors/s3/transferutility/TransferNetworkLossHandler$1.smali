.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler$1;
.super Ljava/lang/Object;
.source "TransferNetworkLossHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;


# direct methods
.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler$1;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 122
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler$1;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler$1;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;)V

    return-void

    .line 125
    :cond_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler$1;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-object v0, v1

    .line 0
    monitor-enter v0

    .line 212
    :try_start_0
    iget-object v2, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    invoke-virtual {v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    .line 213
    iget v4, v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/S3ClientReference;->֫(Ljava/lang/Integer;)Lcom/amazonaws/services/s3/AmazonS3;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 214
    iget-object v4, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget-object v5, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫:Landroid/net/ConnectivityManager;

    .line 216
    invoke-virtual {v3, v4, v5}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Landroid/net/ConnectivityManager;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 217
    iget-object v4, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget v3, v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    sget-object v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v4, v3, v5}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 220
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
