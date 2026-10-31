.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;
.super Landroid/content/BroadcastReceiver;
.source "TransferNetworkLossHandler.java"


# static fields
.field public static ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

.field public static final ᩳ:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Landroid/net/ConnectivityManager;

.field public ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

.field public ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const-string v0, "connectivity"

    .line 71
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫:Landroid/net/ConnectivityManager;

    .line 72
    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-direct {v0, p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    .line 73
    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    return-void
.end method

.method public static declared-synchronized ֫(Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;
    .locals 2

    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    monitor-enter v0

    .line 83
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    if-nez v1, :cond_0

    .line 84
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    invoke-direct {v1, p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 86
    :cond_0
    sget-object p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;)V
    .locals 8

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 156
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 160
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    const-string v4, "Loading transfers from database..."

    invoke-interface {v2, v4}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 165
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v4, 0x0

    .line 169
    :try_start_1
    iget-object v5, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    sget-object v6, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)Landroid/database/Cursor;

    move-result-object v4

    .line 170
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "_id"

    .line 171
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 174
    iget-object v5, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    invoke-virtual {v5, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(I)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    move-result-object v5

    if-nez v5, :cond_0

    .line 175
    new-instance v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    invoke-direct {v5, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;-><init>(I)V

    .line 176
    invoke-virtual {v5, v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫(Landroid/database/Cursor;)V

    .line 177
    iget-object v6, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    invoke-virtual {v6, v5}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)V

    add-int/lit8 v3, v3, 0x1

    .line 180
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 184
    :cond_1
    :try_start_2
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    const-string v5, "Closing the cursor for resumeAllTransfers"

    invoke-interface {v1, v5}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 185
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 191
    :try_start_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 192
    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/S3ClientReference;->֫(Ljava/lang/Integer;)Lcom/amazonaws/services/s3/AmazonS3;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 195
    iget-object v5, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v5, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(I)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 196
    invoke-virtual {v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫()Z

    move-result v5

    if-nez v5, :cond_2

    .line 197
    iget-object v5, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    iget-object v6, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    iget-object v7, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫:Landroid/net/ConnectivityManager;

    invoke-virtual {v2, v4, v5, v6, v7}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫(Lcom/amazonaws/services/s3/AmazonS3;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Landroid/net/ConnectivityManager;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catch_0
    move-exception p0

    .line 202
    :try_start_4
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error in resuming the transfers."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 205
    :cond_3
    sget-object p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " transfers are loaded from database."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 206
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    if-eqz v4, :cond_4

    .line 184
    :try_start_5
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    const-string v2, "Closing the cursor for resumeAllTransfers"

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 185
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 187
    :cond_4
    throw p0

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p0
.end method

.method public static declared-synchronized ۧ()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;
    .locals 3

    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    monitor-enter v0

    .line 97
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ܿ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 104
    monitor-exit v0

    return-object v1

    .line 101
    :cond_0
    :try_start_1
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    const-string v2, "TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving"

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 102
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityException;

    const-string v2, "TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving"

    .line 33
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 102
    throw v1

    :catchall_0
    move-exception v1

    .line 104
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string p1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 109
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Network connectivity changed detected."

    .line 110
    sget-object p2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->ᩳ:Lcom/amazonaws/logging/Log;

    invoke-interface {p2, p1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result p1

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Network connected: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 119
    new-instance p1, Ljava/lang/Thread;

    new-instance p2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler$1;

    invoke-direct {p2, p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler$1;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;)V

    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 128
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
