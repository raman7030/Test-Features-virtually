.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;
.super Landroid/app/Service;
.source "TransferService.java"


# static fields
.field public static ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

.field public static final ۙ:Lcom/amazonaws/logging/Log;


# instance fields
.field public ᩶:Z

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 42
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩸:Z

    const/16 v1, 0xd86

    .line 60
    iput v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩹:I

    .line 66
    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩶:Z

    return-void
.end method


# virtual methods
.method public final dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 9

    .line 229
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 p3, 0x2

    and-int/2addr p1, p3

    if-nez p1, :cond_0

    return-void

    .line 233
    :cond_0
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "network status: %s\n"

    invoke-virtual {p2, p1, v1}, Ljava/io/PrintWriter;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintWriter;

    .line 234
    invoke-static {p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    move-result-object p1

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫()Ljava/util/Map;

    move-result-object p1

    .line 235
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    aput-object v1, v3, v2

    const-string v1, "# of active transfers: %d\n"

    invoke-virtual {p2, v1, v3}, Ljava/io/PrintWriter;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintWriter;

    .line 236
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    .line 237
    iget-object v3, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->֫:Ljava/lang/String;

    iget-object v4, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۚ:Ljava/lang/String;

    iget-object v5, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    iget-wide v6, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    .line 238
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-wide v7, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ:J

    .line 239
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v7, 0x5

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v3, v7, v2

    aput-object v4, v7, v0

    aput-object v5, v7, p3

    const/4 v3, 0x3

    aput-object v6, v7, v3

    const/4 v3, 0x4

    aput-object v1, v7, v3

    const-string v1, "bucket: %s, key: %s, status: %s, total size: %d, current: %d\n"

    .line 237
    invoke-virtual {p2, v1, v7}, Ljava/io/PrintWriter;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintWriter;

    goto :goto_0

    .line 241
    :cond_1
    invoke-virtual {p2}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 93
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Can\'t bind to TransferService"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreate()V
    .locals 4

    .line 106
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 108
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string v0, "Starting Transfer Service to listen for network connectivity changes."

    invoke-interface {v1, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;->֫(Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    move-object v0, p0

    .line 112
    monitor-enter v0

    .line 113
    :try_start_0
    iget-boolean v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    :try_start_1
    const-string v2, "Registering the network receiver"

    .line 115
    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 116
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v1, 0x0

    .line 118
    iput-boolean v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩸:Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 122
    :catch_0
    :try_start_2
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string v2, "Ignoring the leak in registering the receiver."

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    .line 120
    :catch_1
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string v2, "Ignoring the exception trying to register the receiver for connectivity change."

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    .line 125
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final onDestroy()V
    .locals 4

    .line 196
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 197
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string v1, "Moving the service out of the Foreground state."

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    move-object v0, p0

    .line 198
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    :try_start_1
    iget-boolean v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩶:Z

    invoke-virtual {p0, v1}, Landroid/app/Service;->stopForeground(Z)V

    .line 200
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 203
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error in moving the service out of the foreground state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 207
    :cond_0
    :goto_0
    :try_start_3
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string v1, "De-registering the network receiver."

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    move-object v0, p0

    .line 208
    monitor-enter v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 209
    :try_start_4
    iget-boolean v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩸:Z

    if-nez v1, :cond_1

    .line 210
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    invoke-virtual {p0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v1, 0x1

    .line 211
    iput-boolean v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩸:Z

    const/4 v1, 0x0

    .line 212
    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    .line 214
    :cond_1
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v1
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1

    .line 220
    :catch_1
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string v1, "Exception trying to de-register the network receiver"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    .line 223
    :goto_1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 141
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    const/4 v1, 0x1

    if-lt p2, p3, :cond_2

    move-object v0, p0

    .line 143
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string p3, "notification"

    .line 144
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Landroid/app/Notification;

    if-eqz p3, :cond_1

    const-string v2, "ongoing-notification-id"

    .line 147
    iget v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩹:I

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩹:I

    const-string v2, "remove-notification"

    .line 150
    iget-boolean v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩶:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩶:Z

    .line 153
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string v2, "Putting the service in Foreground state."

    invoke-interface {p1, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    const/16 p1, 0x22

    if-lt p2, p1, :cond_0

    .line 156
    iget p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩹:I

    invoke-virtual {p0, p1, p3, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    goto :goto_0

    .line 158
    :cond_0
    iget p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩹:I

    invoke-virtual {p0, p1, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    goto :goto_0

    .line 161
    :cond_1
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string p2, "No notification is passed in the intent. Unable to transition to foreground."

    invoke-interface {p1, p2}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 164
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 166
    sget-object p2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Error in moving the service to foreground state: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    :cond_2
    :goto_1
    move-object v0, p0

    .line 170
    monitor-enter v0

    .line 171
    :try_start_3
    iget-boolean p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩸:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p1, :cond_3

    .line 173
    :try_start_4
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string p2, "Registering the network receiver"

    invoke-interface {p1, p2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 174
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkLossHandler;

    new-instance p2, Landroid/content/IntentFilter;

    const-string p3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {p2, p3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x0

    .line 176
    iput-boolean p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->᩸:Z
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    .line 180
    :catch_1
    :try_start_5
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string p2, "Ignoring the leak in registering the receiver."

    invoke-interface {p1, p2}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    goto :goto_2

    .line 178
    :catch_2
    sget-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;->ۙ:Lcom/amazonaws/logging/Log;

    const-string p2, "Ignoring the exception trying to register the receiver for connectivity change."

    invoke-interface {p1, p2}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    .line 183
    :cond_3
    :goto_2
    monitor-exit v0

    return v1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method
