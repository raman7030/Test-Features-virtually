.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;
.super Ljava/lang/Object;
.source "TransferStatusUpdater.java"


# static fields
.field public static ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

.field public static final ܽ:Ljava/util/Map;

.field public static final ܿ:Ljava/util/HashSet;

.field public static final ᩳ:Lcom/amazonaws/logging/Log;

.field public static ᩻:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;


# instance fields
.field public final ֫:Landroid/os/Handler;

.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 44
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ᩳ:Lcom/amazonaws/logging/Log;

    .line 48
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x4

    new-array v1, v1, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۤ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۨ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܰ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩺:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 49
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܿ:Ljava/util/HashSet;

    .line 57
    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$1;

    invoke-direct {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$1;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܽ:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;)V
    .locals 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    sput-object p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    .line 101
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫:Landroid/os/Handler;

    .line 102
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method

.method public static declared-synchronized ֫(Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;
    .locals 2

    .line 2
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    .line 3
    monitor-enter v0

    .line 112
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->᩻:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    if-nez v1, :cond_0

    .line 113
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-direct {v1, p0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    .line 114
    new-instance p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    invoke-direct {p0, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;)V

    sput-object p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->᩻:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;

    .line 116
    :cond_0
    sget-object p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->᩻:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;
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

.method public static synthetic ۧ()Lcom/amazonaws/logging/Log;
    .locals 1

    .line 43
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ᩳ:Lcom/amazonaws/logging/Log;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized ֫(I)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 144
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ:Ll/ۧۤᩴ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()Ljava/util/Map;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 125
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ:Ll/ۧۤᩴ;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(IJJZ)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v15, p0

    .line 1
    monitor-enter v15

    .line 263
    :try_start_0
    iget-object v0, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ:Ll/ۧۤᩴ;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    if-eqz v0, :cond_0

    move-wide/from16 v9, p2

    .line 265
    iput-wide v9, v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۧ:J

    move-wide/from16 v11, p4

    .line 266
    iput-wide v11, v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܽ:J

    goto :goto_0

    :cond_0
    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    .line 271
    :goto_0
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p1 .. p3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez p6, :cond_1

    .line 274
    monitor-exit v15

    return-void

    .line 278
    :cond_1
    :try_start_1
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܽ:Ljava/util/Map;

    move-object/from16 v16, v0

    monitor-enter v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 279
    :try_start_2
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_4

    .line 280
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 284
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;

    .line 286
    iget-object v13, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫:Landroid/os/Handler;

    new-instance v14, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$3;

    move-object v2, v14

    move/from16 v4, p1

    move-wide/from16 v5, p2

    move-wide/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$3;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;IJJ)V

    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 293
    :cond_3
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 294
    monitor-exit v15

    return-void

    .line 281
    :cond_4
    :goto_2
    :try_start_3
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v15

    return-void

    :catchall_0
    move-exception v0

    .line 293
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v15
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0
.end method

.method public final declared-synchronized ֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V
    .locals 7

    const-string v1, "Failed to update the status of transfer "

    const-string v2, "Failed to update the status of transfer "

    move-object v0, p0

    .line 5
    monitor-enter v0

    .line 195
    :try_start_0
    sget-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v3, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    .line 196
    iget-object v4, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ:Ll/ۧۤᩴ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    if-nez v4, :cond_0

    .line 199
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)I

    move-result v1

    if-nez v1, :cond_1

    .line 200
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ᩳ:Lcom/amazonaws/logging/Log;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    .line 203
    :cond_0
    iget-object v2, v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v3, v2

    .line 204
    iput-object p2, v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 206
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)I

    move-result v2

    if-nez v2, :cond_1

    .line 207
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ᩳ:Lcom/amazonaws/logging/Log;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    .line 212
    monitor-exit v0

    return-void

    .line 217
    :cond_2
    :try_start_1
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 218
    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܽ(I)V

    .line 221
    :cond_3
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܽ:Ljava/util/Map;

    move-object v1, v2

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 222
    :try_start_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    check-cast v2, Ll/ۧۤᩴ;

    invoke-virtual {v2, v3}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_5

    .line 223
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    .line 225
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;

    .line 231
    iget-object v5, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫:Landroid/os/Handler;

    new-instance v6, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$2;

    invoke-direct {v6, v4, p1, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$2;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 242
    :cond_4
    invoke-static {p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 243
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 246
    :cond_5
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 247
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 246
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final ֫(ILjava/lang/Exception;)V
    .locals 5

    .line 305
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܽ:Ljava/util/Map;

    move-object v0, v1

    monitor-enter v0

    .line 306
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v1, Ll/ۧۤᩴ;

    invoke-virtual {v1, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_2

    .line 307
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 311
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;

    .line 313
    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫:Landroid/os/Handler;

    new-instance v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$4;

    invoke-direct {v4, v2, p1, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$4;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;ILjava/lang/Exception;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 320
    :cond_1
    monitor-exit v0

    return-void

    .line 308
    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 320
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 134
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ۧ:Ll/ۧۤᩴ;

    iget v2, p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ᩴ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
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

.method public final declared-synchronized ۧ(I)Lcom/amazonaws/event/ProgressListener;
    .locals 5

    const-string v1, "Creating a new progress listener for transfer: "

    const-string v2, "transfer "

    const-string v3, "TransferStatusUpdater doesn\'t track the transfer: "

    move-object v0, p0

    .line 8
    monitor-enter v0

    .line 425
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->֫(I)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 430
    sget-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ᩳ:Lcom/amazonaws/logging/Log;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 431
    new-instance p1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;

    invoke-direct {p1, p0, v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$TransferProgressListener;-><init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 427
    :cond_0
    :try_start_1
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ᩳ:Lcom/amazonaws/logging/Log;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;)V

    .line 428
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " doesn\'t exist"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception p1

    .line 431
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܽ(I)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 166
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->ᩳ(I)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 168
    iget-object v1, v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferRecord;->ܳ:Ljava/lang/String;

    .line 169
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002"

    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 171
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 174
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/S3ClientReference;->ۧ(Ljava/lang/Integer;)V

    .line 175
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater;->ܳ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferDBUtil;->֫(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
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
